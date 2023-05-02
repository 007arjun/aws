package com.example.aws;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*


  import json
import boto3
import urllib.parse

                s3=boto3.client('s3')

        dynamodb=boto3.resource('dynamodb')
        table=dynamodb.Table('indrajithTable')



        def lambda_handler(event, context):
        print(event)

        index= 2

        bucket_name=event['Records'][0]['s3']['bucket']['name']
        print(bucket_name)
        file_name=event['Records'][0]['s3']['object']['key']
        print(file_name)

        response=s3.get_object(Bucket=bucket_name,Key=file_name)

        print(response)

        Cnt=response['Body'].read().decode("utf-8")

        print(Cnt)

        table.put_item(Item={"id": index, "Content": Cnt})

        index+=1

        print(index)

 */
    }
}