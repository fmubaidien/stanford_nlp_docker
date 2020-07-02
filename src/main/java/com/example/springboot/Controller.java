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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @RequestMapping(method= RequestMethod.POST, value = "/v1/part_of_speech")
    public JSONObject index(@RequestBody String preText) {
        StanfordCoreNLP stanfordCoreNLP = new StanfordCoreNLP("arabic");


        String text = preText;
        String out= "";
        JSONObject obj = new JSONObject();


        List<String> ADJ = new ArrayList<>();
        List<String> CC = new ArrayList<>();
        List<String> CD = new ArrayList<>();
        List<String> DT = new ArrayList<>();
        List<String> DTJJ = new ArrayList<>();
        List<String> DTJJR = new ArrayList<>();
        List<String> DTNN = new ArrayList<>();
        List<String> DTNNP = new ArrayList<>();
        List<String> DTNNPS = new ArrayList<>();
        List<String> DTNNS = new ArrayList<>();
        List<String> IN = new ArrayList<>();
        List<String> JJ = new ArrayList<>();
        List<String> JJR = new ArrayList<>();
        List<String> NN = new ArrayList<>();
        List<String> NNP = new ArrayList<>();
        List<String> NNPS = new ArrayList<>();
        List<String> NNS = new ArrayList<>();
        List<String> NOUN = new ArrayList<>();
        List<String> PRP = new ArrayList<>();
        List<String> PRP$ = new ArrayList<>();
        List<String> PUNC = new ArrayList<>();
        List<String> RB = new ArrayList<>();
        List<String> RP = new ArrayList<>();
        List<String> UH = new ArrayList<>();
        List<String> VB = new ArrayList<>();
        List<String> VBD = new ArrayList<>();
        List<String> VBG = new ArrayList<>();
        List<String> VBN = new ArrayList<>();
        List<String> VBP = new ArrayList<>();
        List<String> VN = new ArrayList<>();
        List<String> WP = new ArrayList<>();
        List<String> WRB = new ArrayList<>();


        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for(CoreLabel coreLabel :coreLabelList) {
            String poss = coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            switch (poss) {
                case "ADJ":
                    ADJ.add(coreLabel.originalText());
                    break;
                case "CC":
                    CC.add(coreLabel.originalText());
                    break;
                case "CD":
                    CD.add(coreLabel.originalText());
                    break;
                case "DT":
                    DT.add(coreLabel.originalText());
                    break;
                case "DTJJ":
                    DTJJ.add(coreLabel.originalText());
                    break;
                case "DTJJR":
                    DTJJR.add(coreLabel.originalText());
                    break;
                case "DTNN":
                    DTNN.add(coreLabel.originalText());
                    break;
                case "DTNNP":
                    DTNNP.add(coreLabel.originalText());
                    break;
                case "DTNNPS":
                    DTNNPS.add(coreLabel.originalText());
                    break;
                case "DTNNS":
                    DTNNS.add(coreLabel.originalText());
                    break;
                case "IN":
                    IN.add(coreLabel.originalText());
                    break;
                case "JJ":
                    JJ.add(coreLabel.originalText());
                    break;
                case "JJR":
                    JJR.add(coreLabel.originalText());
                    break;
                case "NN":
                    NN.add(coreLabel.originalText());
                    break;
                case "NNP":
                    NNP.add(coreLabel.originalText());
                    break;
                case "NNPS":
                    NNPS.add(coreLabel.originalText());
                    break;
                case "NNS":
                    NNS.add(coreLabel.originalText());
                    break;
                case "NOUN":
                    NOUN.add(coreLabel.originalText());
                    break;
                case "PRP":
                    PRP.add(coreLabel.originalText());
                    break;
                case "PRP$":
                    PRP$.add(coreLabel.originalText());
                    break;
                case "PUNC":
                    PUNC.add(coreLabel.originalText());
                    break;
                case "RB":
                    RB.add(coreLabel.originalText());
                    break;
                case "RP":
                    RP.add(coreLabel.originalText());
                    break;
                case "UH":
                    UH.add(coreLabel.originalText());
                    break;
                case "VB":
                    VB.add(coreLabel.originalText());
                    break;
                case "VBD":
                    VBD.add(coreLabel.originalText());
                    break;
                case "VBG":
                    VBG.add(coreLabel.originalText());
                    break;
                case "VBN":
                    VBN.add(coreLabel.originalText());
                    break;
                case "VBP":
                    VBP.add(coreLabel.originalText());
                    break;
                case "VN":
                    VN.add(coreLabel.originalText());
                    break;
                case "WP":
                    WP.add(coreLabel.originalText());
                    break;
                case "WRB":
                    WRB.add(coreLabel.originalText());
                    break;
                default:
            }


        }

        if(!ADJ.isEmpty())
            obj.put("ADJ", ADJ);
        if(!CC.isEmpty())
            obj.put("CC", CC);
        if(!CD.isEmpty())
            obj.put("CD", CD);
        if(!DT.isEmpty())
            obj.put("DT", DT);
        if(!DTJJ.isEmpty())
            obj.put("DTJJ", DTJJ);
        if(!DTJJR.isEmpty())
            obj.put("DTJJR", DTJJR);
        if(!DTNN.isEmpty())
            obj.put("DTNN", DTNN);
        if(!DTNNP.isEmpty())
            obj.put("DTNNP", DTNNP);
        if(!DTNNPS.isEmpty())
            obj.put("DTNNPS", DTNNPS);
        if(!DTNNS.isEmpty())
            obj.put("DTNNS", DTNNS);
        if(!IN.isEmpty())
            obj.put("IN", IN);
        if(!JJ.isEmpty())
            obj.put("JJ", JJ);
        if(!JJR.isEmpty())
            obj.put("JJR", JJR);
        if(!NN.isEmpty())
            obj.put("NN", NN);
        if(!NNP.isEmpty())
            obj.put("NNP", NNP);
        if(!NNS.isEmpty())
            obj.put("NNS", NNS);
        if(!NOUN.isEmpty())
            obj.put("NOUN", NOUN);
        if(!PRP.isEmpty())
            obj.put("PRP", PRP);
        if(!PRP$.isEmpty())
            obj.put("PRP$", PRP$);
        if(!PUNC.isEmpty())
            obj.put("PUNC", PUNC);
        if(!RB.isEmpty())
            obj.put("RB", RB);
        if(!RP.isEmpty())
            obj.put("RP", RP);
        if(!UH.isEmpty())
            obj.put("UH", UH);
        if(!VB.isEmpty())
            obj.put("VB", VB);
        if(!VBD.isEmpty())
            obj.put("VBD", VBD);
        if(!VBG.isEmpty())
            obj.put("VBG", VBG);
        if(!VBN.isEmpty())
            obj.put("VBN", VBN);
        if(!VBP.isEmpty())
            obj.put("VBP", VBP);
        if(!VN.isEmpty())
            obj.put("VN", VN);
        if(!WP.isEmpty())
            obj.put("WP", WP);
        if(!WRB.isEmpty())
            obj.put("WRB", WRB);

        return obj;
    }

}