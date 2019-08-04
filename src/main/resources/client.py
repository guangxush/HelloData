import requests

def send(sentences):
    try:
        url = "http://localhost:8080/server/hello"
        headers = {
            'Connection': 'keep-alive',
            'Content-Type': 'application/json; charset=UTF-8'
        }
        payload = {'context': sentences.strip("\n")}
        r = requests.post(url, json=payload, headers=headers, verify=False)
        print(r)
    except Exception as e:
        pass
    finally:
        pass