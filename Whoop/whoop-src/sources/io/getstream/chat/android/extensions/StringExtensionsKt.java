package io.getstream.chat.android.extensions;

import java.util.Locale;
import mx1.C26009o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;
import yb3.C39410n;
import yb3.C39412p;
import yb3.InterfaceC39407k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"", "snakeToLowerCamelCase", "(Ljava/lang/String;)Ljava/lang/String;", "lowerCamelCaseToGetter", "camelCaseToSnakeCase", "Lyb3/p;", "snakeRegex", "Lyb3/p;", "camelRegex", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StringExtensionsKt {
    private static final C39412p snakeRegex = new C39412p("_[a-zA-Z]");
    private static final C39412p camelRegex = new C39412p("(?<=[a-zA-Z])[A-Z]");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m54977a(InterfaceC39407k interfaceC39407k) {
        return (String) snakeToLowerCamelCase$lambda$0(interfaceC39407k);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m54978b(InterfaceC39407k interfaceC39407k) {
        return (String) camelCaseToSnakeCase$lambda$1(interfaceC39407k);
    }

    public static final String camelCaseToSnakeCase(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        String lowerCase = camelRegex.m125853g(str, new C26009o(11)).toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final CharSequence camelCaseToSnakeCase$lambda$1(InterfaceC39407k it) {
        AbstractC22676k.m65750j(it, "it");
        return "_".concat(((C39410n) it).m125845c());
    }

    public static final String lowerCamelCaseToGetter(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        String strValueOf = String.valueOf(str.charAt(0));
        AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        String strSubstring = str.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return AbstractC11895b.m31996o("get", upperCase, strSubstring);
    }

    public static final String snakeToLowerCamelCase(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return snakeRegex.m125853g(str, new C26009o(10));
    }

    private static final CharSequence snakeToLowerCamelCase$lambda$0(InterfaceC39407k matchResult) {
        AbstractC22676k.m65750j(matchResult, "matchResult");
        String upperCase = AbstractC39421y.m125926K(((C39410n) matchResult).m125845c(), "_", "", false).toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
