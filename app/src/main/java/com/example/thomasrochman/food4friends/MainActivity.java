package com.example.thomasrochman.food4friends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.*;
import com.amazonaws.mobileconnectors.*;


public class MainActivity extends AppCompatActivity
{
    AmazonDynamoDBClient ddbClient = new AmazonDynamoDBClient('731342704166');
    DynamoDBMapper mapper = new DynamoDBMapper(ddbClient);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    
}
