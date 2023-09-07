baseHash="$(git rev-parse HEAD)"

for i in {6..800}; do
  echo "new line $i" >> testFile.md
  git add *
  git commit -m "chore: add fake commit $i"
  gitHash="$(git rev-parse HEAD)"
  echo "$gitHash," >> /Users/florinmirosnicencu/hashes.txt
  git push
done