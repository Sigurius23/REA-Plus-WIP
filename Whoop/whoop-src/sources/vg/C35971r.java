package vg;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bg.C3206a;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23467m;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import un1.C35100f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vg.r */
/* JADX INFO: loaded from: classes.dex */
public final class C35971r implements InterfaceC35967n {

    /* JADX INFO: renamed from: b */
    public static final C35971r f153158b = new C35971r();

    /* JADX INFO: renamed from: c */
    public static final C23470p f153159c = AbstractC30060g.m92088H(new C35100f(4));

    /* JADX INFO: renamed from: d */
    public static final C23470p f153160d = AbstractC30060g.m92088H(new C35100f(5));

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap m114206a() {
        Set setEntrySet = System.getProperties().entrySet();
        AbstractC22676k.m65749i(setEntrySet, "<get-entries>(...)");
        Set<Map.Entry> set = setEntrySet;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(set, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : set) {
            AbstractC22676k.m65747g(entry);
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final String m114207b(String key) {
        AbstractC22676k.m65750j(key, "key");
        return System.getenv().get(key);
    }

    /* JADX INFO: renamed from: c */
    public final C35963j m114208c() {
        EnumC35964k enumC35964k;
        Object objM107888l;
        String property = System.getProperty("os.name");
        AbstractC22676k.m65749i(property, "getProperty(...)");
        Locale locale = Locale.US;
        String strM95641q = AbstractC31061c.m95641q(locale, "US", property, locale, "toLowerCase(...)");
        Pattern patternCompile = Pattern.compile("[^a-z0-9+]");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strM95641q).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        try {
            Class.forName("android.os.Build");
            enumC35964k = EnumC35964k.f153140z;
        } catch (ClassNotFoundException unused) {
            if (AbstractC39414r.m125876U(strReplaceAll, "windows", false)) {
                enumC35964k = EnumC35964k.f153139y;
            } else if (AbstractC39414r.m125876U(strReplaceAll, "linux", false)) {
                enumC35964k = EnumC35964k.f153137w;
            } else {
                enumC35964k = AbstractC39414r.m125876U(strReplaceAll, "macosx", false) ? EnumC35964k.f153138x : EnumC35964k.f153135E;
            }
        }
        try {
            objM107888l = System.getProperty("os.version");
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        return new C35963j(enumC35964k, (String) objM107888l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v6, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: d */
    public final Serializable m114209d(String str, AbstractC32269c abstractC32269c) {
        C35970q c35970q;
        if (abstractC32269c instanceof C35970q) {
            c35970q = (C35970q) abstractC32269c;
            int i13 = c35970q.f153157y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35970q.f153157y = i13 - Integer.MIN_VALUE;
            } else {
                c35970q = new C35970q(this, abstractC32269c);
            }
        } else {
            c35970q = new C35970q(this, abstractC32269c);
        }
        Object objM8705K = c35970q.f153155w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35970q.f153157y;
        int i15 = 1;
        InterfaceC30057d interfaceC30057d = null;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                C3206a c3206a = new C3206a(i15, str, interfaceC30057d);
                c35970q.f153157y = 1;
                objM8705K = AbstractC3006f0.m8705K(executorC22364d, c3206a, c35970q);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8705K);
            }
            return (byte[]) objM8705K;
        } catch (IOException unused) {
            return null;
        }
    }
}
