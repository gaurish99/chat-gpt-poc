# poc-apps
Just creative projects

curl --location 'http://localhost:8080/generate' \
--header 'Content-Type: application/json' \
--data '{
"model": "babbage-002",
"prompt": "Explain the theory of relativity",
"max_tokens": 150
}'
