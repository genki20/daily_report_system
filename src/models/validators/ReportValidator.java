package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String suppliers_error = _validateTitle(r.getSuppliers());
        if(!suppliers_error.equals("")) {
            errors.add(suppliers_error);
        }

        String situation_error = _validateTitle(r.getSituation());
        if(!situation_error.equals("")) {
            errors.add(situation_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
            }

        return "";
    }

    private static String _validateSuppliers(String suppliers) {
        if(suppliers == null || suppliers.equals("")) {
            return "取引先を入力してください。";
            }

        return "";
    }

    private static String _validateSituation(String situation) {
        if(situation == null || situation.equals("")) {
            return "商談状況てください。";
            }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
            }

        return "";
    }
}