package p043c4;

import aa3.C0656u0;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.room.C1836v0;
import c43.EnumC4206v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.SurveyTextBlock;
import com.amplitude.android.engagement.types.SurveyTextShortBlock;
import com.squareup.wire.AbstractC5579j;
import io.getstream.video.android.core.model.IceCandidate;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p108e4.AbstractC12667a;
import p181h2.C16617b;
import p208i2.C17875c1;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p292l1.AbstractC23149o4;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p512u2.C34472r;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p530up.C35147c;
import p558vp.AbstractC36259c;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import se.AbstractC32411b;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: c4.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C3955e extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16116w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f16117x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3955e(Object obj, int i13) {
        super(2);
        this.f16116w = i13;
        this.f16117x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0205  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        C27430e c27430eM82859b;
        String str;
        int i13 = this.f16116w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f16117x;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C3953d.f16107x;
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC32411b.m101108t(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R), (InterfaceC4351m) ((InterfaceC28601c1) obj3).getValue(), c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                ((C3983z) obj3).mo3598a((Composer) obj, AbstractC28683x.m87244L(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ((C3958f0) obj3).mo3598a((Composer) obj, AbstractC28683x.m87244L(1));
                break;
            case 3:
                IceCandidate candidate = (IceCandidate) obj;
                AbstractC22676k.m65750j(candidate, "candidate");
                AbstractC22676k.m65750j((EnumC4206v) obj2, "<anonymous parameter 1>");
                ((C1836v0) obj3).invoke(candidate, EnumC4206v.f17064x);
                break;
            case 4:
                ((Number) obj2).intValue();
                AbstractC37926s0.m121467e((C35147c) obj3, (Composer) obj, 9);
                break;
            case 5:
                C34472r change = (C34472r) obj;
                long j7 = ((C16617b) obj2).f63937a;
                AbstractC22676k.m65750j(change, "change");
                change.m108946a();
                ComposeView composeView = (ComposeView) obj3;
                composeView.setX(C16617b.m47189e(j7) + composeView.getX());
                composeView.setY(C16617b.m47190f(j7) + composeView.getY());
                break;
            case 6:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj3;
                        c27430eM82859b = AbstractC12667a.f43312a;
                        if (c27430eM82859b == null) {
                            C27428d c27428d = new C27428d("Filled.Undo", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i14 = AbstractC27433f0.f110561a;
                            C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
                            C0656u0 c0656u0 = new C0656u0(5);
                            c0656u0.m1651t(12.5f, 8.0f);
                            c0656u0.m1642k(-2.65f, 0.0f, -5.05f, 0.99f, -6.9f, 2.6f);
                            c0656u0.m1649r(2.0f, 7.0f);
                            c0656u0.m1653v(9.0f);
                            c0656u0.m1648q(9.0f);
                            c0656u0.m1650s(-3.62f, -3.62f);
                            c0656u0.m1642k(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f);
                            c0656u0.m1642k(3.54f, 0.0f, 6.55f, 2.31f, 7.6f, 5.5f);
                            c0656u0.m1650s(2.37f, -0.78f);
                            c0656u0.m1641j(21.08f, 11.03f, 17.15f, 8.0f, 12.5f, 8.0f);
                            c0656u0.m1640i();
                            C27428d.m82858a(c27428d, c0656u0.f2286a, c17875c1);
                            c27430eM82859b = c27428d.m82859b();
                            AbstractC12667a.f43312a = c27430eM82859b;
                        }
                        AbstractC36259c.m115681b(interfaceC4339a, c27430eM82859b, "Reset User History", null, composer2, 384);
                    }
                } else {
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj3;
                    c27430eM82859b = AbstractC12667a.f43312a;
                    if (c27430eM82859b == null) {
                        C27428d c27428d2 = new C27428d("Filled.Undo", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i15 = AbstractC27433f0.f110561a;
                        C17875c1 c17875c2 = new C17875c1(C17919x.f69625b);
                        C0656u0 c0656u1 = new C0656u0(5);
                        c0656u1.m1651t(12.5f, 8.0f);
                        c0656u1.m1642k(-2.65f, 0.0f, -5.05f, 0.99f, -6.9f, 2.6f);
                        c0656u1.m1649r(2.0f, 7.0f);
                        c0656u1.m1653v(9.0f);
                        c0656u1.m1648q(9.0f);
                        c0656u1.m1650s(-3.62f, -3.62f);
                        c0656u1.m1642k(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f);
                        c0656u1.m1642k(3.54f, 0.0f, 6.55f, 2.31f, 7.6f, 5.5f);
                        c0656u1.m1650s(2.37f, -0.78f);
                        c0656u1.m1641j(21.08f, 11.03f, 17.15f, 8.0f, 12.5f, 8.0f);
                        c0656u1.m1640i();
                        C27428d.m82858a(c27428d2, c0656u1.f2286a, c17875c2);
                        c27430eM82859b = c27428d2.m82859b();
                        AbstractC12667a.f43312a = c27430eM82859b;
                    }
                    AbstractC36259c.m115681b(interfaceC4339a2, c27430eM82859b, "Reset User History", null, composer2, 384);
                }
                break;
            case 7:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q3 = (C28655q) composer3;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        str = (String) obj3;
                        if (str == null) {
                            str = "";
                        }
                        C28655q c28655q4 = (C28655q) composer3;
                        c28655q4.m87152f0(-412521741);
                        C35035m c35035m = (C35035m) c28655q4.m87161k(AbstractC35033k.f148295a);
                        c28655q4.m87173q(false);
                        AbstractC23149o4.m67127b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, c35035m.m110711a(null, composer3, 1), composer3, 0, 0, 65534);
                    }
                } else {
                    str = (String) obj3;
                    if (str == null) {
                        str = "";
                    }
                    C28655q c28655q5 = (C28655q) composer3;
                    c28655q5.m87152f0(-412521741);
                    C35035m c35035m2 = (C35035m) c28655q5.m87161k(AbstractC35033k.f148295a);
                    c28655q5.m87173q(false);
                    AbstractC23149o4.m67127b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, c35035m2.m110711a(null, composer3, 1), composer3, 0, 0, 65534);
                }
                break;
            case 8:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q6 = (C28655q) composer4;
                    if (c28655q6.m87121F()) {
                        c28655q6.m87138X();
                    } else {
                        String prompt = ((SurveyTextShortBlock) obj3).getMeta().getPrompt();
                        C28655q c28655q7 = (C28655q) composer4;
                        c28655q7.m87152f0(-412521741);
                        C35035m c35035m3 = (C35035m) c28655q7.m87161k(AbstractC35033k.f148295a);
                        c28655q7.m87173q(false);
                        AbstractC23149o4.m67127b(prompt, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, c35035m3.m110711a(null, composer4, 1), composer4, 0, 0, 65534);
                    }
                } else {
                    String prompt2 = ((SurveyTextShortBlock) obj3).getMeta().getPrompt();
                    C28655q c28655q8 = (C28655q) composer4;
                    c28655q8.m87152f0(-412521741);
                    C35035m c35035m4 = (C35035m) c28655q8.m87161k(AbstractC35033k.f148295a);
                    c28655q8.m87173q(false);
                    AbstractC23149o4.m67127b(prompt2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, c35035m4.m110711a(null, composer4, 1), composer4, 0, 0, 65534);
                }
                break;
            case 9:
                Composer composer5 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q9 = (C28655q) composer5;
                    if (c28655q9.m87121F()) {
                        c28655q9.m87138X();
                    } else {
                        String prompt3 = ((SurveyTextBlock) obj3).getMeta().getPrompt();
                        C28655q c28655q10 = (C28655q) composer5;
                        c28655q10.m87152f0(-412521741);
                        C35035m c35035m5 = (C35035m) c28655q10.m87161k(AbstractC35033k.f148295a);
                        c28655q10.m87173q(false);
                        AbstractC23149o4.m67127b(prompt3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, c35035m5.m110711a(null, composer5, 1), composer5, 0, 0, 65534);
                    }
                } else {
                    String prompt4 = ((SurveyTextBlock) obj3).getMeta().getPrompt();
                    C28655q c28655q11 = (C28655q) composer5;
                    c28655q11.m87152f0(-412521741);
                    C35035m c35035m6 = (C35035m) c28655q11.m87161k(AbstractC35033k.f148295a);
                    c28655q11.m87173q(false);
                    AbstractC23149o4.m67127b(prompt4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, c35035m6.m110711a(null, composer5, 1), composer5, 0, 0, 65534);
                }
                break;
            case 10:
                Composer composer6 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q12 = (C28655q) composer6;
                    if (c28655q12.m87121F()) {
                        c28655q12.m87138X();
                    } else {
                        ((C37816b) obj3).invoke(composer6, 6);
                    }
                } else {
                    ((C37816b) obj3).invoke(composer6, 6);
                }
                break;
            case 11:
                AbstractC5579j builder = (AbstractC5579j) obj;
                AbstractC22676k.m65750j(builder, "builder");
                ((Method) obj3).invoke(builder, obj2);
                break;
            case 12:
                AbstractC5579j builder2 = (AbstractC5579j) obj;
                AbstractC22676k.m65750j(builder2, "builder");
                ((Field) obj3).set(builder2, obj2);
                break;
            default:
                Composer composer7 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q13 = (C28655q) composer7;
                if (c28655q13.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) list.get(i16);
                        int iHashCode = Long.hashCode(c28655q13.f115904T);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j = C0217k.f725c;
                        c28655q13.m87158i0();
                        if (c28655q13.f115903S) {
                            c28655q13.m87163l(c0213j);
                        } else {
                            c28655q13.m87178s0();
                        }
                        C0209i c0209i = C0217k.f732j;
                        if (c28655q13.f115903S || !AbstractC22676k.m65745e(c28655q13.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q13, iHashCode, c0209i);
                        }
                        interfaceC4351m.invoke(c28655q13, 0);
                        c28655q13.m87173q(true);
                    }
                } else {
                    c28655q13.m87138X();
                }
                break;
        }
        return c23454a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3955e(Object obj, int i13, int i14) {
        super(2);
        this.f16116w = i14;
        this.f16117x = obj;
    }
}
