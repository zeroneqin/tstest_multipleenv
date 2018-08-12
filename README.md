# TSTest -Multiple Environment

## Introduction
In real test scenarios, multiple environment is very common, like regression test on multiple data centers, maybe dozens,hundreds,even thousands server need to be tested with same case. TSTest-Multiple Environment(Test Service-Test-Multiple environment) is a test framework for multiple env based on testng.
## Usage
1. Add testng case extends from BaseCase
2. Add a constructor with 1 parameter for ip in the class
3. Register the case to TestFactory class
4. Run it from command line, pass the host address by ipList parameter.
...
mvn  clean package -Dtestngfile=demo.xml -DipList=127.0.0.1,localhost
...
## Author
Jun Qin
## Bug and issues
If you find any bug or issues, be free to send mail to zeroneqin@163.com
## License
MIT©️Jun Qin
