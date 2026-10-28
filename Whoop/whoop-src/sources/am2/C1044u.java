package am2;

import androidx.compose.runtime.Composer;
import c31.C3927k;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.C4824l;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.design.model.ParagraphInsets;
import java.util.List;
import jc0.C21604d;
import l83.C23454a0;
import lc0.AbstractC23828j;
import mx1.AbstractC26007m;
import nj2.C26769p;
import nl0.C26804f;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p12.AbstractC28734x;
import p12.C28709b0;
import p12.C28714e;
import p163g1.C15199y3;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32600e0;
import pj2.AbstractC29310i;
import s30.AbstractC32100b;
import xd2.C38211g;
import yd2.AbstractC39462d;

/* JADX INFO: renamed from: am2.u */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1044u implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f4020E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f4021F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f4022G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f4023H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f4024I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4025w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f4026x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f4027y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f4028z;

    public /* synthetic */ C1044u(Object obj, String str, String str2, String str3, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f4025w = i14;
        this.f4024I = obj;
        this.f4026x = str;
        this.f4027y = str2;
        this.f4028z = str3;
        this.f4022G = z4;
        this.f4020E = interfaceC4339a;
        this.f4021F = interfaceC4339a2;
        this.f4023H = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4025w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC1046w.m2994F((C1037p0) this.f4024I, (Function1) this.f4026x, (Function1) this.f4027y, (Function1) this.f4028z, (DateTime) this.f4020E, (LocalDate) this.f4021F, this.f4022G, this.f4023H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC1046w.m3018b0((C4824l) this.f4024I, (Function1) this.f4026x, (Function1) this.f4027y, (Function1) this.f4028z, (DateTime) this.f4020E, (LocalDate) this.f4021F, this.f4022G, this.f4023H, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC23828j.m69982C((C21604d.d) this.f4024I, (String) this.f4026x, (String) this.f4027y, (String) this.f4028z, this.f4022G, (InterfaceC4339a) this.f4020E, (InterfaceC4339a) this.f4021F, this.f4023H, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC26007m.m77210B((String) this.f4024I, (String) this.f4026x, (String) this.f4027y, (String) this.f4028z, (String) this.f4020E, this.f4022G, (List) this.f4021F, this.f4023H, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC28734x.m87431i0((C28709b0) this.f4024I, (ParagraphInsets) this.f4028z, (Function1) this.f4026x, (C28714e) this.f4020E, (Function1) this.f4027y, (C3927k) this.f4021F, this.f4022G, this.f4023H, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC29310i.m89034e1((C26769p) this.f4024I, (Function1) this.f4026x, (InterfaceC4339a) this.f4028z, (InterfaceC4339a) this.f4020E, (InterfaceC4339a) this.f4021F, (Function1) this.f4027y, this.f4022G, this.f4023H, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC32600e0.m101728k((C26804f) this.f4024I, (C15199y3) this.f4027y, this.f4022G, (String) this.f4028z, (AiMessageFeedback) this.f4020E, (Function1) this.f4026x, (InterfaceC4351m) this.f4021F, this.f4023H, (Composer) obj, iIntValue7);
            case 7:
                ((Integer) obj2).getClass();
                AbstractC32100b.m99857b((String) this.f4024I, (String) this.f4026x, (String) this.f4027y, (String) this.f4028z, this.f4022G, (InterfaceC4339a) this.f4020E, (InterfaceC4339a) this.f4021F, (Composer) obj, AbstractC28683x.m87244L(this.f4023H | 1));
                return C23454a0.f92919a;
            default:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC39462d.m126035w((C38211g) this.f4024I, this.f4022G, (Function1) this.f4026x, (Function1) this.f4027y, (Function1) this.f4028z, (Function1) this.f4020E, (InterfaceC4339a) this.f4021F, this.f4023H, (Composer) obj, iIntValue8);
        }
    }

    public /* synthetic */ C1044u(Object obj, Function1 function1, Function1 function2, Function1 function3, DateTime dateTime, LocalDate localDate, boolean z4, int i13, int i14) {
        this.f4025w = i14;
        this.f4024I = obj;
        this.f4026x = function1;
        this.f4027y = function2;
        this.f4028z = function3;
        this.f4020E = dateTime;
        this.f4021F = localDate;
        this.f4022G = z4;
        this.f4023H = i13;
    }

    public /* synthetic */ C1044u(String str, String str2, String str3, String str4, String str5, boolean z4, List list, int i13) {
        this.f4025w = 3;
        this.f4024I = str;
        this.f4026x = str2;
        this.f4027y = str3;
        this.f4028z = str4;
        this.f4020E = str5;
        this.f4022G = z4;
        this.f4021F = list;
        this.f4023H = i13;
    }

    public /* synthetic */ C1044u(C26769p c26769p, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Function1 function2, boolean z4, int i13) {
        this.f4025w = 5;
        this.f4024I = c26769p;
        this.f4026x = function1;
        this.f4028z = interfaceC4339a;
        this.f4020E = interfaceC4339a2;
        this.f4021F = interfaceC4339a3;
        this.f4027y = function2;
        this.f4022G = z4;
        this.f4023H = i13;
    }

    public /* synthetic */ C1044u(C26804f c26804f, C15199y3 c15199y3, boolean z4, String str, AiMessageFeedback aiMessageFeedback, Function1 function1, InterfaceC4351m interfaceC4351m, int i13) {
        this.f4025w = 6;
        this.f4024I = c26804f;
        this.f4027y = c15199y3;
        this.f4022G = z4;
        this.f4028z = str;
        this.f4020E = aiMessageFeedback;
        this.f4026x = function1;
        this.f4021F = interfaceC4351m;
        this.f4023H = i13;
    }

    public /* synthetic */ C1044u(C28709b0 c28709b0, ParagraphInsets paragraphInsets, Function1 function1, C28714e c28714e, Function1 function2, C3927k c3927k, boolean z4, int i13) {
        this.f4025w = 4;
        this.f4024I = c28709b0;
        this.f4028z = paragraphInsets;
        this.f4026x = function1;
        this.f4020E = c28714e;
        this.f4027y = function2;
        this.f4021F = c3927k;
        this.f4022G = z4;
        this.f4023H = i13;
    }

    public /* synthetic */ C1044u(C38211g c38211g, boolean z4, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4339a interfaceC4339a, int i13) {
        this.f4025w = 8;
        this.f4024I = c38211g;
        this.f4022G = z4;
        this.f4026x = function1;
        this.f4027y = function2;
        this.f4028z = function3;
        this.f4020E = function4;
        this.f4021F = interfaceC4339a;
        this.f4023H = i13;
    }
}
