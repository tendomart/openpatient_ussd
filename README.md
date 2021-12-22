# openpatient_ussd
Easing patient registration via **ussd first approach**

**Background** :
On top of the existing diseases and the corresponding problems created in hopitals / health centres and clinics , Covid 19 actually escalated them by creating a surge in patient queues ,access to health care is also very hard due to curfues / long distances to health centres, big care-provider to patient ratios /  management and registration is also very hard. The system also has ability to suggest / recommend the nearest health facility based patient location.

**Solution**
This project is aimed  to ease patient registration ,enhanced access to first aid through AI powered voice assistants, and  management in response to overwhelming patient numbers vs health care providers.The beauty with it , is that it is easily accessible to anyone with a basic phone and an available network.

**Technology**.
-Client uses USSD(any phone) to communicate to system
-GCP houses compute resources(Backend) for system i.e cloud pub/sub , cloudSQL , patient EMR (OpenMRS) on appEngine
-Hospital has a dashboard to view patients registered , and access to cloud hosted EMR (OpenMRS) to cater for registered patients and other related information

Since i want to reach as many people as possible , i chose to use a ussd first approach.

**Workflow**
1.A Patient or guardian with any phone(ussd first) dials the provided ussd code to reach a hospital / clinic
2.The system dials in to the hospital / clinic switchbaord(dashboard) and does automatic registration via (pub/sub) with the necessary information
3.As the guardian / patient prepares to go they recieve their queue number 
4.Voice assistant from GCP analyses the signs / symptoms sent by patient / guardian by USSD.
5.Using  NLP -ML trained algorithms, texts recieved from ussd and collected at pub/sub are analysed and feedback based on signs and symptoms is converted to voice
and sent back to patient / guardian(This only acts as first aid) as they prepare or wait for further instructions for healt care provider.
6. The system suggests/recommends the nearest / most suitable facility based on patient condition/s

**Information recieved from the patient by the system**

1. Client phone number
2. Patient name
3. Signs and symptoms 
4. Patient Address

**Response from the system to patient / Guardian to patient**

1. Notification upon Registration via sms
2. Registration and address of hospital via sms
3. Time and date of first visit via sms
4. Firstaid from voice assitant in response to Signs and Symptoms recieved or Advice from assitant basing on urgency of condition


This code is to be hosted on a different USSD service provide to provide code and communicate with Telcos.

