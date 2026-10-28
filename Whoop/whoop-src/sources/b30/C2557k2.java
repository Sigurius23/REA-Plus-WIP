package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.k2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2557k2 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9934w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37816b f9935x;

    public /* synthetic */ C2557k2(C37816b c37816b, int i13) {
        this.f9934w = i13;
        this.f9935x = c37816b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x017a  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        switch (this.f9934w) {
            case 0:
                InterfaceC23004v StripeImage = (InterfaceC23004v) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(StripeImage, "$this$StripeImage");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        this.f9935x.invoke(composer, 6);
                    }
                } else {
                    this.f9935x.invoke(composer, 6);
                }
                break;
            case 1:
                InterfaceC23004v StripeImage2 = (InterfaceC23004v) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(StripeImage2, "$this$StripeImage");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        this.f9935x.invoke(composer2, 6);
                    }
                } else {
                    this.f9935x.invoke(composer2, 6);
                }
                break;
            case 2:
                InterfaceC3747i0 AnimatedVisibility = (InterfaceC3747i0) obj;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
                this.f9935x.invoke((Composer) obj2, 0);
                break;
            case 3:
                InterfaceC23013y RowButtonFloatingOuterContent = (InterfaceC23013y) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(RowButtonFloatingOuterContent, "$this$RowButtonFloatingOuterContent");
                if ((iIntValue3 & 17) == 16) {
                    C28655q c28655q4 = (C28655q) composer3;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        this.f9935x.invoke(Boolean.TRUE, composer3, 6);
                    }
                } else {
                    this.f9935x.invoke(Boolean.TRUE, composer3, 6);
                }
                break;
            case 4:
                InterfaceC23013y RowButtonCheckmarkOuterContent = (InterfaceC23013y) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(RowButtonCheckmarkOuterContent, "$this$RowButtonCheckmarkOuterContent");
                if ((iIntValue4 & 17) == 16) {
                    C28655q c28655q5 = (C28655q) composer4;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        this.f9935x.invoke(Boolean.FALSE, composer4, 6);
                    }
                } else {
                    this.f9935x.invoke(Boolean.FALSE, composer4, 6);
                }
                break;
            case 5:
                InterfaceC23013y RowButtonDisclosureOuterContent = (InterfaceC23013y) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(RowButtonDisclosureOuterContent, "$this$RowButtonDisclosureOuterContent");
                if ((iIntValue5 & 17) == 16) {
                    C28655q c28655q6 = (C28655q) composer5;
                    if (c28655q6.m87121F()) {
                        c28655q6.m87138X();
                    } else {
                        this.f9935x.invoke(Boolean.FALSE, composer5, 6);
                    }
                } else {
                    this.f9935x.invoke(Boolean.FALSE, composer5, 6);
                }
                break;
            case 6:
                InterfaceC23013y RowButtonRadioOuterContent = (InterfaceC23013y) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(RowButtonRadioOuterContent, "$this$RowButtonRadioOuterContent");
                if ((iIntValue6 & 17) == 16) {
                    C28655q c28655q7 = (C28655q) composer6;
                    if (c28655q7.m87121F()) {
                        c28655q7.m87138X();
                    } else {
                        this.f9935x.invoke(Boolean.TRUE, composer6, 6);
                    }
                } else {
                    this.f9935x.invoke(Boolean.TRUE, composer6, 6);
                }
                break;
            case 7:
                InterfaceC23013y ModalBottomSheetLayout = (InterfaceC23013y) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                if ((iIntValue7 & 17) == 16) {
                    C28655q c28655q8 = (C28655q) composer7;
                    if (c28655q8.m87121F()) {
                        c28655q8.m87138X();
                    } else {
                        Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "BottomSheetContentTestTag");
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iM87266t = AbstractC28683x.m87266t(composer7);
                        c28655q = (C28655q) composer7;
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(composer7, modifierM3599a);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer7, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(composer7, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer7, C0217k.f726d, modifierM118962N);
                        this.f9935x.invoke(composer7, 0);
                        c28655q.m87173q(true);
                    }
                } else {
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "BottomSheetContentTestTag");
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iM87266t = AbstractC28683x.m87266t(composer7);
                    c28655q = (C28655q) composer7;
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer7, modifierM3599a2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer7, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(composer7, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer7, C0217k.f726d, modifierM118962N2);
                    this.f9935x.invoke(composer7, 0);
                    c28655q.m87173q(true);
                }
                break;
            default:
                String it = (String) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(it, "it");
                if ((iIntValue8 & 17) == 16) {
                    C28655q c28655q9 = (C28655q) composer8;
                    if (c28655q9.m87121F()) {
                        c28655q9.m87138X();
                    } else {
                        this.f9935x.invoke(composer8, 0);
                    }
                } else {
                    this.f9935x.invoke(composer8, 0);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
