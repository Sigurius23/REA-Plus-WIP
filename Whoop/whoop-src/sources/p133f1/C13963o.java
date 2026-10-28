package p133f1;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import l83.C23454a0;
import mc3.C25437c;
import p294l3.C23283u0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f1.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C13963o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f49774E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f49775F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ CharSequence f49776G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ long f49777H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C13966p f49778I;

    /* JADX INFO: renamed from: w */
    public C25437c f49779w;

    /* JADX INFO: renamed from: x */
    public C13966p f49780x;

    /* JADX INFO: renamed from: y */
    public CharSequence f49781y;

    /* JADX INFO: renamed from: z */
    public long f49782z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13963o(CharSequence charSequence, long j7, C13966p c13966p, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49776G = charSequence;
        this.f49777H = j7;
        this.f49778I = c13966p;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C13963o c13963o = new C13963o(this.f49776G, this.f49777H, this.f49778I, interfaceC30057d);
        c13963o.f49775F = obj;
        return c13963o;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C13963o) create((TextClassifier) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        long j7;
        C13966p c13966p;
        CharSequence charSequence;
        TextSelection textSelection;
        C25437c c25437c;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f49774E;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            TextClassifier textClassifier = (TextClassifier) this.f49775F;
            long j13 = this.f49777H;
            int iM67360f = C23283u0.m67360f(j13);
            int iM67359e = C23283u0.m67359e(j13);
            CharSequence charSequence2 = this.f49776G;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iM67360f, iM67359e);
            C13966p c13966p2 = this.f49778I;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(c13966p2.m39744b());
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM60431f = AbstractC21478l0.m60431f(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i14 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f49782z = jM60431f;
                this.f49774E = 2;
                if (C13966p.m39743a(c13966p2, this.f49776G, jM60431f, textClassifier, this) != enumC31071a) {
                    j7 = jM60431f;
                }
            } else {
                C25437c c25437c2 = c13966p2.f49799e;
                this.f49775F = textSelectionSuggestSelection;
                this.f49779w = c25437c2;
                this.f49780x = c13966p2;
                this.f49781y = charSequence2;
                this.f49782z = jM60431f;
                this.f49774E = 1;
                if (c25437c2.mo68211b(this) != enumC31071a) {
                    c13966p = c13966p2;
                    charSequence = charSequence2;
                    textSelection = textSelectionSuggestSelection;
                    c25437c = c25437c2;
                    j7 = jM60431f;
                    TextClassification textClassification = textSelection.getTextClassification();
                    AbstractC22676k.m65747g(textClassification);
                    c13966p.f49801g.setValue(new C13938f1(charSequence, j7, textClassification));
                }
            }
            return enumC31071a;
        }
        if (i13 == 1) {
            j7 = this.f49782z;
            charSequence = this.f49781y;
            c13966p = this.f49780x;
            c25437c = this.f49779w;
            textSelection = (TextSelection) this.f49775F;
            AbstractC34132o.m107864I(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                AbstractC22676k.m65747g(textClassification2);
                c13966p.f49801g.setValue(new C13938f1(charSequence, j7, textClassification2));
            } finally {
                c25437c.mo68214i(null);
            }
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = this.f49782z;
            AbstractC34132o.m107864I(obj);
        }
        return new C23283u0(j7);
    }
}
