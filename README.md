FORMAT: 1A

# Polls

Polls is a simple API allowing consumers to view polls and vote in them.

## Questions Collection [/questions]

### List All Questions [GET]

+ Response 200 (application/json)

        {
            "question": "Favourite programming language?",
            "choices": [
                {
                    "choice": "Swift",
                    "votes": 2048
                }, {
                    "choice": "Python",
                    "votes": 1024
                }
            ]
        }
