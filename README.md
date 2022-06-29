# RewardpointProject

***********************Reward Point Project****************************

#Java 8 version
#Spring Boot restAPI


API Services

URL: http://localhost:8080/getAllTransaction

Method: GET

Response: JSON

Output:
{
  "transactionResponse": [
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 120,
      "transactionDate": "05-04-2022",
      "totalReward": 90
    },
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 75,
      "transactionDate": "01-05-2022",
      "totalReward": 25
    },
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 94,
      "transactionDate": "05-05-2022",
      "totalReward": 44
    },
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 10,
      "transactionDate": "06-04-2022",
      "totalReward": 0
    },
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 75,
      "transactionDate": "06-03-2022",
      "totalReward": 25
    },
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 200,
      "transactionDate": "23-03-2022",
      "totalReward": 250
    },
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 1,
      "transactionDate": "19-04-2022",
      "totalReward": 0
    },
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 80,
      "transactionDate": "12-03-2022",
      "totalReward": 30
    },
    {
      "customerID": 1,
      "customerName": "PrabhakaranJ",
      "amount": 224,
      "transactionDate": "07-05-2022",
      "totalReward": 298
    },
    {
      "customerID": 2,
      "customerName": "james jackson",
      "amount": 125,
      "transactionDate": "05-02-2022",
      "totalReward": 100
    },
    {
      "customerID": 2,
      "customerName": "james jackson",
      "amount": 75,
      "transactionDate": "05-03-2022",
      "totalReward": 25
    },
    {
      "customerID": 2,
      "customerName": "james jackson",
      "amount": 10,
      "transactionDate": "06-04-2022",
      "totalReward": 0
    },
    {
      "customerID": 2,
      "customerName": "james jackson",
      "amount": 75,
      "transactionDate": "16-05-2022",
      "totalReward": 25
    },
    {
      "customerID": 2,
      "customerName": "james jackson",
      "amount": 200,
      "transactionDate": "25-03-2022",
      "totalReward": 250
    },
    {
      "customerID": 2,
      "customerName": "james jackson",
      "amount": 224,
      "transactionDate": "28-05-2022",
      "totalReward": 298
    },
    {
      "customerID": 3,
      "customerName": "Monica",
      "amount": 120,
      "transactionDate": "06-05-2022",
      "totalReward": 90
    }
  ],
  "monthlyTransactionResponse": {
    "monthlytransaction": [
      {
        "customerName": "james jackson",
        "amount": 125,
        "rewardpoint": 100,
        "month": "2022-02",
        "customerID": 2
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 75,
        "rewardpoint": 25,
        "month": "2022-03",
        "customerID": 1
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 200,
        "rewardpoint": 250,
        "month": "2022-03",
        "customerID": 1
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 80,
        "rewardpoint": 30,
        "month": "2022-03",
        "customerID": 1
      },
      {
        "customerName": "james jackson",
        "amount": 75,
        "rewardpoint": 25,
        "month": "2022-03",
        "customerID": 2
      },
      {
        "customerName": "james jackson",
        "amount": 200,
        "rewardpoint": 250,
        "month": "2022-03",
        "customerID": 2
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 75,
        "rewardpoint": 25,
        "month": "2022-05",
        "customerID": 1
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 94,
        "rewardpoint": 44,
        "month": "2022-05",
        "customerID": 1
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 224,
        "rewardpoint": 298,
        "month": "2022-05",
        "customerID": 1
      },
      {
        "customerName": "james jackson",
        "amount": 75,
        "rewardpoint": 25,
        "month": "2022-05",
        "customerID": 2
      },
      {
        "customerName": "james jackson",
        "amount": 224,
        "rewardpoint": 298,
        "month": "2022-05",
        "customerID": 2
      },
      {
        "customerName": "Monica",
        "amount": 120,
        "rewardpoint": 90,
        "month": "2022-05",
        "customerID": 3
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 120,
        "rewardpoint": 90,
        "month": "2022-04",
        "customerID": 1
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 10,
        "rewardpoint": 0,
        "month": "2022-04",
        "customerID": 1
      },
      {
        "customerName": "PrabhakaranJ",
        "amount": 1,
        "rewardpoint": 0,
        "month": "2022-04",
        "customerID": 1
      },
      {
        "customerName": "james jackson",
        "amount": 10,
        "rewardpoint": 0,
        "month": "2022-04",
        "customerID": 2
      }
    ],
    "monthlytotalreward": 1550
  },
  "totalRewardResponse": [
    {
      "customerName": "PrabhakaranJ",
      "totalReward": 762,
      "customerID": 1
    },
    {
      "customerName": "james jackson",
      "totalReward": 698,
      "customerID": 2
    },
    {
      "customerName": "Monica",
      "totalReward": 90,
      "customerID": 3
    }
  ]
}

