package com.whoop.design.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ji0.C21714b;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.whoop.design.util.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/design/util/TextResource;", "b", "(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC8692a {
    /* JADX INFO: renamed from: b */
    public static final String m21264b(TextResource textResource) {
        CharSequence value;
        AbstractC22676k.m65750j(textResource, "<this>");
        String string = null;
        TextResource.C8691e c8691e = textResource instanceof TextResource.C8691e ? (TextResource.C8691e) textResource : null;
        if (c8691e != null && (value = c8691e.getValue()) != null) {
            string = value.toString();
        }
        return m21265c(string);
    }

    /* JADX INFO: renamed from: c */
    public static final String m21265c(String str) {
        List listM118958J;
        if (str == null) {
            return null;
        }
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9]+");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        int iEnd = 0;
        AbstractC39414r.m125903v0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listM118958J = arrayList;
        } else {
            listM118958J = AbstractC37056f.m118958J(str.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM118958J) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return AbstractC25265s.m74110N0(arrayList2, "", null, null, new C21714b(23), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final CharSequence m21266d(String it) {
        AbstractC22676k.m65750j(it, "it");
        Locale locale = Locale.ROOT;
        String lowerCase = it.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        StringBuilder sb4 = new StringBuilder();
        String strValueOf = String.valueOf(lowerCase.charAt(0));
        AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        sb4.append((Object) upperCase);
        String strSubstring = lowerCase.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        sb4.append(strSubstring);
        return sb4.toString();
    }
}
