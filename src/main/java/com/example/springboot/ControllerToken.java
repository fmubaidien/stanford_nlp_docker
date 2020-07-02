package com.example.springboot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.stanford.nlp.ling.CoreAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerToken {

    @RequestMapping(method= RequestMethod.POST, value = "/v1/tokenizer")
    public JSONObject index1(@RequestBody String preText) {
        StanfordCoreNLP stanfordCoreNLP = new StanfordCoreNLP("arabic");

        //String text= "مرحباً! أنا اسمي سارة";
        String text = preText;
        JSONObject obj = new JSONObject();

        //JSONArray array = new JSONArray();
        List<String> toke = new ArrayList<>();

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();
        String temp;

        int count =0;
        for(CoreLabel coreLabel :coreLabelList) {

            toke.add(coreLabel.originalText());
//

        }
        obj.put("Tokenizer", toke);
        return obj;
    }

}