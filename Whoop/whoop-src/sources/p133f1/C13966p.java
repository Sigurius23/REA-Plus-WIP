package p133f1;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25267u;
import mc3.AbstractC25438d;
import mc3.C25437c;
import p294l3.C23283u0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28674u2;
import p478s3.AbstractC32097c;
import p478s3.C32095a;
import p478s3.C32096b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f1.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C13966p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30063j f49795a;

    /* JADX INFO: renamed from: b */
    public final Context f49796b;

    /* JADX INFO: renamed from: c */
    public final EnumC13975s f49797c;

    /* JADX INFO: renamed from: d */
    public final C32096b f49798d;

    /* JADX INFO: renamed from: f */
    public TextClassifier f49800f;

    /* JADX INFO: renamed from: e */
    public final C25437c f49799e = AbstractC25438d.m74669a();

    /* JADX INFO: renamed from: g */
    public final C28633k1 f49801g = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: h */
    public final Object f49802h = new Object();

    public C13966p(InterfaceC30063j interfaceC30063j, Context context, EnumC13975s enumC13975s, C32096b c32096b) {
        this.f49795a = interfaceC30063j;
        this.f49796b = context;
        this.f49797c = enumC13975s;
        this.f49798d = c32096b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public static final Object m39743a(C13966p c13966p, CharSequence charSequence, long j7, TextClassifier textClassifier, AbstractC32269c abstractC32269c) {
        C13960n c13960n;
        long j13;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        C25437c c25437c;
        TextClassification textClassificationClassifyText;
        long j14;
        CharSequence charSequence3;
        C28633k1 c28633k1 = c13966p.f49801g;
        C25437c c25437c2 = c13966p.f49799e;
        if (abstractC32269c instanceof C13960n) {
            c13960n = (C13960n) abstractC32269c;
            int i13 = c13960n.f49762G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13960n.f49762G = i13 - Integer.MIN_VALUE;
            } else {
                c13960n = new C13960n(c13966p, abstractC32269c);
            }
        } else {
            c13960n = new C13960n(c13966p, abstractC32269c);
        }
        Object obj = c13960n.f49760E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13960n.f49762G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                c13960n.f49763w = charSequence;
                c13960n.f49764x = textClassifier;
                c13960n.f49765y = c25437c2;
                j13 = j7;
                c13960n.f49766z = j13;
                c13960n.f49762G = 1;
                if (c25437c2.mo68211b(c13960n) != enumC31071a) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    c25437c = c25437c2;
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                j13 = c13960n.f49766z;
                c25437c = c13960n.f49765y;
                textClassifier2 = (TextClassifier) c13960n.f49764x;
                charSequence2 = c13960n.f49763w;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j14 = c13960n.f49766z;
                c25437c2 = c13960n.f49765y;
                textClassificationClassifyText = (TextClassification) c13960n.f49764x;
                charSequence3 = c13960n.f49763w;
                AbstractC34132o.m107864I(obj);
            }
            try {
                c28633k1.setValue(new C13938f1(charSequence3, j14, textClassificationClassifyText));
                return c23454a0;
            } finally {
                c25437c2.mo68214i(null);
            }
            C13938f1 c13938f1 = (C13938f1) c28633k1.getValue();
            if (c13938f1 != null) {
                C28674u2 c28674u2 = AbstractC13969q.f49810a;
                if (C23283u0.m67356b(j13, c13938f1.f49688b) && AbstractC22676k.m65745e(charSequence2, c13938f1.f49687a)) {
                    c25437c.mo68214i(null);
                    return c23454a0;
                }
            }
            c25437c.mo68214i(null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, C23283u0.m67360f(j13), C23283u0.m67359e(j13)).setDefaultLocales(c13966p.m39744b()).build());
            c13960n.f49763w = charSequence2;
            c13960n.f49764x = textClassificationClassifyText;
            c13960n.f49765y = c25437c2;
            c13960n.f49766z = j13;
            c13960n.f49762G = 2;
            if (c25437c2.mo68211b(c13960n) != enumC31071a) {
                j14 = j13;
                charSequence3 = charSequence2;
                c28633k1.setValue(new C13938f1(charSequence3, j14, textClassificationClassifyText));
                return c23454a0;
            }
            return enumC31071a;
        } catch (Throwable th3) {
            c25437c.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final LocaleList m39744b() {
        C32096b c32096b = this.f49798d;
        if (c32096b == null) {
            return new LocaleList(AbstractC32097c.f133101a.m99485i().m99834a().f133097a);
        }
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c32096b, 10));
        Iterator it = c32096b.f133099w.iterator();
        while (it.hasNext()) {
            arrayList.add(((C32095a) it.next()).f133097a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
