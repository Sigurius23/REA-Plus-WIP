package b30;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import b01.C2185f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.paymentelement.embedded.form.FormActivity;
import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import com.whoop.android.R;
import cz.AbstractC11227t0;
import cz.C11219p0;
import d30.C11566v;
import d40.AbstractC11673r;
import d40.C11671p;
import e30.AbstractC12605c;
import ec3.InterfaceC13037f2;
import g00.AbstractC14936g;
import g00.AbstractC14937h;
import g00.C14931b;
import g00.C14934e;
import g40.AbstractC15376j4;
import g40.C15454z1;
import g40.InterfaceC15391m3;
import ge0.C15728c;
import h00.C16508j;
import h20.C16686k4;
import h20.C16754w0;
import ht2.C17632d;
import i20.C17930b1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.InterfaceC21467g;
import java.util.List;
import js2.C21927e;
import k20.C22136a;
import l83.C23454a0;
import n00.C26075c;
import no0.C26944e0;
import o73.C27648a;
import p00.C28573j;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p047c9.C4320k;
import p048ce.AbstractC4482w;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p132f0.C13821r1;
import p133f1.AbstractC13994y0;
import p133f1.C13931d0;
import p133f1.C13934e0;
import p133f1.C13940g0;
import p133f1.C13954l;
import p133f1.C13962n1;
import p133f1.C13978t;
import p133f1.C13981u;
import p133f1.C13988w0;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15018g5;
import p163g1.C15007f5;
import p163g1.C15033h9;
import p163g1.C15040i5;
import p164g2.C15247s;
import p164g2.InterfaceC15237i;
import p178gz.C16283a;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22973k1;
import p292l1.AbstractC23096g;
import p292l1.AbstractC23149o4;
import p292l1.AbstractC23164r1;
import p292l1.C23204y;
import p292l1.C23209y4;
import p294l3.C23277r0;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p316m1.C24907i0;
import p355o2.C27430e;
import p389p0.AbstractC28560y;
import p389p0.C28506a0;
import p389p0.C28559x0;
import p389p0.C28562z;
import p389p0.InterfaceC28509b0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p392p3.AbstractC28771i;
import p392p3.C28780r;
import p510u0.AbstractC34339n0;
import p510u0.InterfaceC34310d1;
import p512u2.AbstractC34452c0;
import p547v8.AbstractC35785b;
import p571w3.C36775k;
import p571w3.EnumC36774j;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r20.InterfaceC30881s;
import s20.C32077a;
import se.AbstractC32411b;
import t10.AbstractC33295o;
import t10.C33287g;
import t10.C33290j;
import t20.C33333n;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.w2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2647w2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10336w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f10337x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10338y;

    public /* synthetic */ C2647w2(int i13, Object obj, Object obj2) {
        this.f10336w = i13;
        this.f10338y = obj;
        this.f10337x = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final Object m7521a(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28506a0 c28506a0 = (C28506a0) this.f10338y;
        C28562z c28562z = (C28562z) this.f10337x;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC28509b0 interfaceC28509b0 = (InterfaceC28509b0) c28506a0.f115399b.invoke();
            int iMo77531b = c28562z.f115566c;
            Object obj3 = c28562z.f115564a;
            if ((iMo77531b >= interfaceC28509b0.getItemCount() || !interfaceC28509b0.mo77532c(iMo77531b).equals(obj3)) && (iMo77531b = interfaceC28509b0.mo77531b(obj3)) != -1) {
                c28562z.f115566c = iMo77531b;
            }
            int i13 = iMo77531b;
            if (i13 != -1) {
                c28655q.m87150e0(-1664741271);
                AbstractC28560y.m86879f(interfaceC28509b0, c28506a0.f115398a, i13, c28562z.f115564a, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1664505826);
                c28655q.m87173q(false);
            }
            boolean zM87157i = c28655q.m87157i(c28562z);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C26944e0(c28562z, 20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(obj3, (Function1) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: c */
    private final Object m7522c(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC12350b.m34583d((InterfaceC4339a) this.f10338y, AbstractC1136a.m3599a(C2314t.f9131w, "wallet_screen_dialog_button_tag"), false, null, null, null, null, AbstractC37817c.m121344e(-1375463685, composer, new C2591o4((Context) this.f10337x, 12)), composer, 805306416, 508);
            }
        } else {
            AbstractC12350b.m34583d((InterfaceC4339a) this.f10338y, AbstractC1136a.m3599a(C2314t.f9131w, "wallet_screen_dialog_button_tag"), false, null, null, null, null, AbstractC37817c.m121344e(-1375463685, composer, new C2591o4((Context) this.f10337x, 12)), composer, 805306416, 508);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX INFO: renamed from: d */
    private final Object m7523d(Object obj, Object obj2) {
        C11566v c11566v;
        C22136a c22136a;
        C28655q c28655q;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87157i2;
        Object objM87133R2;
        boolean zM87157i3;
        Object objM87133R3;
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        FormActivity formActivity = (FormActivity) this.f10338y;
        if ((iIntValue & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c11566v = formActivity.f22341y;
                if (c11566v != null) {
                    AbstractC22676k.m65757q("formInteractor");
                    throw null;
                }
                c22136a = formActivity.f22342z;
                if (c22136a != null) {
                    AbstractC22676k.m65757q("eventReporter");
                    throw null;
                }
                c28655q = (C28655q) composer;
                c28655q.m87150e0(1926885308);
                zM87157i = c28655q.m87157i(formActivity);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    C28573j c28573j = new C28573j(0, formActivity, FormActivity.class, "setCancelAndFinish", "setCancelAndFinish()V", 0, 16);
                    c28655q.m87172p0(c28573j);
                    objM87133R = c28573j;
                }
                InterfaceC21467g interfaceC21467g = (InterfaceC21467g) objM87133R;
                c28655q.m87173q(false);
                c28655q.m87150e0(1926895494);
                zM87157i2 = c28655q.m87157i(formActivity);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    C28573j c28573j2 = new C28573j(0, formActivity, FormActivity.class, "setCompletedResultAndDismiss", "setCompletedResultAndDismiss()V", 0, 17);
                    c28655q.m87172p0(c28573j2);
                    objM87133R2 = c28573j2;
                }
                InterfaceC21467g interfaceC21467g2 = (InterfaceC21467g) objM87133R2;
                c28655q.m87173q(false);
                C33290j c33290j = (C33290j) ((InterfaceC28670t2) this.f10337x).getValue();
                c28655q.m87150e0(1926887292);
                zM87157i3 = c28655q.m87157i(formActivity);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C33287g(formActivity, 3);
                    c28655q.m87172p0(objM87133R3);
                }
                c28655q.m87173q(false);
                AbstractC33295o.m105606d(c11566v, c22136a, (InterfaceC4339a) objM87133R3, (InterfaceC4339a) interfaceC21467g2, c33290j, (InterfaceC4339a) interfaceC21467g, c28655q, 0);
            }
        } else {
            c11566v = formActivity.f22341y;
            if (c11566v != null) {
                AbstractC22676k.m65757q("formInteractor");
                throw null;
            }
            c22136a = formActivity.f22342z;
            if (c22136a != null) {
                AbstractC22676k.m65757q("eventReporter");
                throw null;
            }
            c28655q = (C28655q) composer;
            c28655q.m87150e0(1926885308);
            zM87157i = c28655q.m87157i(formActivity);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i) {
                C28573j c28573j3 = new C28573j(0, formActivity, FormActivity.class, "setCancelAndFinish", "setCancelAndFinish()V", 0, 16);
                c28655q.m87172p0(c28573j3);
                objM87133R = c28573j3;
            } else {
                C28573j c28573j4 = new C28573j(0, formActivity, FormActivity.class, "setCancelAndFinish", "setCancelAndFinish()V", 0, 16);
                c28655q.m87172p0(c28573j4);
                objM87133R = c28573j4;
            }
            InterfaceC21467g interfaceC21467g3 = (InterfaceC21467g) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(1926895494);
            zM87157i2 = c28655q.m87157i(formActivity);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i2) {
                C28573j c28573j5 = new C28573j(0, formActivity, FormActivity.class, "setCompletedResultAndDismiss", "setCompletedResultAndDismiss()V", 0, 17);
                c28655q.m87172p0(c28573j5);
                objM87133R2 = c28573j5;
            } else {
                C28573j c28573j6 = new C28573j(0, formActivity, FormActivity.class, "setCompletedResultAndDismiss", "setCompletedResultAndDismiss()V", 0, 17);
                c28655q.m87172p0(c28573j6);
                objM87133R2 = c28573j6;
            }
            InterfaceC21467g interfaceC21467g4 = (InterfaceC21467g) objM87133R2;
            c28655q.m87173q(false);
            C33290j c33290j2 = (C33290j) ((InterfaceC28670t2) this.f10337x).getValue();
            c28655q.m87150e0(1926887292);
            zM87157i3 = c28655q.m87157i(formActivity);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R3 = new C33287g(formActivity, 3);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C33287g(formActivity, 3);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            AbstractC33295o.m105606d(c11566v, c22136a, (InterfaceC4339a) objM87133R3, (InterfaceC4339a) interfaceC21467g4, c33290j2, (InterfaceC4339a) interfaceC21467g3, c28655q, 0);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:139:0x0375  */
    /* JADX WARN: Code duplicated, block: B:142:0x038e  */
    /* JADX WARN: Code duplicated, block: B:151:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:159:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:161:0x043b  */
    /* JADX WARN: Code duplicated, block: B:162:0x043f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0460  */
    /* JADX WARN: Code duplicated, block: B:170:0x046e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0491  */
    /* JADX WARN: Code duplicated, block: B:173:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:174:0x0538  */
    /* JADX WARN: Code duplicated, block: B:177:0x0548  */
    /* JADX WARN: Code duplicated, block: B:181:0x0562  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:193:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:197:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:206:0x0622  */
    /* JADX WARN: Code duplicated, block: B:209:0x0644  */
    /* JADX WARN: Code duplicated, block: B:213:0x0667  */
    /* JADX WARN: Code duplicated, block: B:222:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:224:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:226:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:301:0x088e  */
    /* JADX WARN: Code duplicated, block: B:327:0x0912  */
    /* JADX WARN: Code duplicated, block: B:336:0x093e  */
    /* JADX WARN: Code duplicated, block: B:338:0x096b  */
    /* JADX WARN: Code duplicated, block: B:339:0x096f  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:344:0x0990  */
    /* JADX WARN: Code duplicated, block: B:353:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:355:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:357:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:360:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:369:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:377:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:380:0x0aa4  */
    /* JADX WARN: Code duplicated, block: B:384:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:393:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:401:0x0b62  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC28601c1 interfaceC28601c1M83597t;
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        AbstractC12605c abstractC12605c;
        boolean zM87157i;
        Object objM87133R2;
        Integer num;
        long jM51515c;
        C28655q c28655q2;
        Object objM87133R3;
        int iM87266t;
        C28655q c28655q3;
        C0213j c0213j;
        C0209i c0209i;
        Object obj3;
        C13978t c13978t;
        C13954l c13954lM39799d;
        float fM108640r;
        int i13;
        C13978t c13978t2;
        C13954l c13954lM39799d2;
        boolean z4;
        String strM113396S;
        C28655q c28655q4;
        boolean zM87153g2;
        Object objM87133R4;
        boolean zM87153g3;
        Object objM87133R5;
        C28655q c28655q5;
        boolean zM87153g4;
        Object objM87133R6;
        boolean zM87153g5;
        Object objM87133R7;
        C2314t c2314t;
        float f13;
        C16508j c16508j;
        InterfaceC4339a interfaceC4339a;
        int iM87266t2;
        C28655q c28655q6;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z13;
        InterfaceC41211c interfaceC41211c;
        Composer composer;
        float f14;
        C28655q c28655q7;
        boolean zM87157i2;
        Object objM87133R8;
        int i14 = this.f10336w;
        Object obj4 = C28635l.f115821a;
        C2314t c2314t2 = C2314t.f9131w;
        int i15 = 1;
        int i16 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj5 = this.f10337x;
        Object obj6 = this.f10338y;
        int i17 = 3;
        switch (i14) {
            case 0:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q8 = (C28655q) composer2;
                    if (c28655q8.m87121F()) {
                        c28655q8.m87138X();
                    } else {
                        AbstractC12313p.m34291i((C16686k4) obj6, EnumC2597p2.f10103w, null, (C13821r1) obj5, composer2, 48);
                    }
                } else {
                    AbstractC12313p.m34291i((C16686k4) obj6, EnumC2597p2.f10103w, null, (C13821r1) obj5, composer2, 48);
                }
                return c23454a0;
            case 1:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q9 = (C28655q) composer3;
                    if (c28655q9.m87121F()) {
                        c28655q9.m87138X();
                    } else {
                        AbstractC12313p.m34291i((C16754w0) obj6, EnumC2597p2.f10104x, null, (C13821r1) obj5, composer3, 48);
                    }
                } else {
                    AbstractC12313p.m34291i((C16754w0) obj6, EnumC2597p2.f10104x, null, (C13821r1) obj5, composer3, 48);
                }
                return c23454a0;
            case 2:
                Composer composer4 = (Composer) obj;
                AbstractC12605c abstractC12605c2 = (AbstractC12605c) obj6;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q10 = (C28655q) composer4;
                    if (c28655q10.m87121F()) {
                        c28655q10.m87138X();
                    } else {
                        interfaceC28601c1M83597t = C27648a.m83597t(abstractC12605c2.f43009M.f127270g, composer4, 0);
                        InterfaceC30881s interfaceC30881s = (InterfaceC30881s) interfaceC28601c1M83597t.getValue();
                        c28655q = (C28655q) composer4;
                        c28655q.m87150e0(-1096660017);
                        zM87153g = c28655q.m87153g(interfaceC30881s);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == obj4) {
                            objM87133R = ((InterfaceC30881s) interfaceC28601c1M83597t.getValue()).mo94931k();
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        C2550j3 c2550j3 = (C2550j3) C27648a.m83597t((InterfaceC13037f2) objM87133R, c28655q, 0).getValue();
                        boolean zM94918a = abstractC12605c2.f43009M.m94918a();
                        boolean z14 = !((Boolean) ((InterfaceC28601c1) obj5).getValue()).booleanValue();
                        abstractC12605c = (AbstractC12605c) obj6;
                        c28655q.m87150e0(-1096649800);
                        zM87157i = c28655q.m87157i(abstractC12605c);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == obj4) {
                            objM87133R2 = new C2539i0(0, abstractC12605c, AbstractC12605c.class, "handleBackPressed", "handleBackPressed()V", 0, 2);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        AbstractC2526g3.m7464c(0.0f, 0, c28655q, c2550j3, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), zM94918a, z14);
                    }
                } else {
                    interfaceC28601c1M83597t = C27648a.m83597t(abstractC12605c2.f43009M.f127270g, composer4, 0);
                    InterfaceC30881s interfaceC30881s2 = (InterfaceC30881s) interfaceC28601c1M83597t.getValue();
                    c28655q = (C28655q) composer4;
                    c28655q.m87150e0(-1096660017);
                    zM87153g = c28655q.m87153g(interfaceC30881s2);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = ((InterfaceC30881s) interfaceC28601c1M83597t.getValue()).mo94931k();
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = ((InterfaceC30881s) interfaceC28601c1M83597t.getValue()).mo94931k();
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    C2550j3 c2550j4 = (C2550j3) C27648a.m83597t((InterfaceC13037f2) objM87133R, c28655q, 0).getValue();
                    boolean zM94918a2 = abstractC12605c2.f43009M.m94918a();
                    boolean z15 = !((Boolean) ((InterfaceC28601c1) obj5).getValue()).booleanValue();
                    abstractC12605c = (AbstractC12605c) obj6;
                    c28655q.m87150e0(-1096649800);
                    zM87157i = c28655q.m87157i(abstractC12605c);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C2539i0(0, abstractC12605c, AbstractC12605c.class, "handleBackPressed", "handleBackPressed()V", 0, 2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C2539i0(0, abstractC12605c, AbstractC12605c.class, "handleBackPressed", "handleBackPressed()V", 0, 2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    AbstractC2526g3.m7464c(0.0f, 0, c28655q, c2550j4, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), zM94918a2, z15);
                }
                return c23454a0;
            case 3:
                Composer composer5 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q11 = (C28655q) composer5;
                    if (c28655q11.m87121F()) {
                        c28655q11.m87138X();
                    } else {
                        AbstractC12314q.m34324d(AbstractC35785b.m113396S((InterfaceC41211c) obj6, composer5), ((PrimaryButton) obj5).f22399E, composer5, 0);
                    }
                } else {
                    AbstractC12314q.m34324d(AbstractC35785b.m113396S((InterfaceC41211c) obj6, composer5), ((PrimaryButton) obj5).f22399E, composer5, 0);
                }
                return c23454a0;
            case 4:
                Composer composer6 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q12 = (C28655q) composer6;
                    if (c28655q12.m87121F()) {
                        c28655q12.m87138X();
                    } else {
                        num = (Integer) obj6;
                        if (num != null) {
                            jM51515c = AbstractC17918w0.m51515c(num.intValue());
                        } else {
                            jM51515c = C17919x.f69637n;
                        }
                        long j7 = jM51515c;
                        C23285v0 c23285v0M31078g = AbstractC11673r.m31078g(C11671p.f37684e, composer6);
                        float f15 = 4;
                        Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t2, f15, f15, f15, 5);
                        c28655q2 = (C28655q) composer6;
                        c28655q2.m87150e0(470568876);
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == obj4) {
                            objM87133R3 = new C2185f(19);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c28655q2.m87173q(false);
                        AbstractC15011f9.m43114b((String) obj5, AbstractC18032n.m51775c(modifierM3397s, false, (Function1) objM87133R3), j7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c23285v0M31078g, c28655q2, 0, 0, 65016);
                    }
                } else {
                    num = (Integer) obj6;
                    if (num != null) {
                        jM51515c = AbstractC17918w0.m51515c(num.intValue());
                    } else {
                        jM51515c = C17919x.f69637n;
                    }
                    long j13 = jM51515c;
                    C23285v0 c23285v0M31078g2 = AbstractC11673r.m31078g(C11671p.f37684e, composer6);
                    float f16 = 4;
                    Modifier modifierM3397s2 = AbstractC1099a.m3397s(c2314t2, f16, f16, f16, 5);
                    c28655q2 = (C28655q) composer6;
                    c28655q2.m87150e0(470568876);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == obj4) {
                        objM87133R3 = new C2185f(19);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    AbstractC15011f9.m43114b((String) obj5, AbstractC18032n.m51775c(modifierM3397s2, false, (Function1) objM87133R3), j13, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c23285v0M31078g2, c28655q2, 0, 0, 65016);
                }
                return c23454a0;
            case 5:
                Composer composer7 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q13 = (C28655q) composer7;
                    if (c28655q13.m87121F()) {
                        c28655q13.m87138X();
                    } else {
                        Modifier modifierM3393o = AbstractC1099a.m3393o((C22976l1) obj6, c2314t2);
                        C37816b c37816b = (C37816b) obj5;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, composer7, 6);
                        iM87266t = AbstractC28683x.m87266t(composer7);
                        c28655q3 = (C28655q) composer7;
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(composer7, modifierM3393o);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer7, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(composer7, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q3, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer7, C0217k.f726d, modifierM118962N);
                        c37816b.invoke(C23016z.f90757a, composer7, 6);
                        c28655q3.m87173q(true);
                    }
                } else {
                    Modifier modifierM3393o2 = AbstractC1099a.m3393o((C22976l1) obj6, c2314t2);
                    C37816b c37816b2 = (C37816b) obj5;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, composer7, 6);
                    iM87266t = AbstractC28683x.m87266t(composer7);
                    c28655q3 = (C28655q) composer7;
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer7, modifierM3393o2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer7, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(composer7, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q3, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q3, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer7, C0217k.f726d, modifierM118962N2);
                    c37816b2.invoke(C23016z.f90757a, composer7, 6);
                    c28655q3.m87173q(true);
                }
                return c23454a0;
            case 6:
                Composer composer8 = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C13988w0 c13988w0 = (C13988w0) obj5;
                C28655q c28655q14 = (C28655q) composer8;
                if (c28655q14.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((C37816b) obj6).invoke(c28655q14, 0);
                    if (c13988w0.m39803h() && ((Boolean) c13988w0.f49908i.getValue()).booleanValue()) {
                        C13981u c13981uM39802g = c13988w0.m39802g();
                        if (c13981uM39802g == null ? true : AbstractC22676k.m65745e(c13981uM39802g.f49879a, c13981uM39802g.f49880b)) {
                            c28655q14.m87150e0(2013602667);
                            c28655q14.m87173q(false);
                        } else {
                            c28655q14.m87150e0(-1736225307);
                            C13981u c13981uM39802g2 = c13988w0.m39802g();
                            if (c13981uM39802g2 == null) {
                                c28655q14.m87150e0(2011629175);
                                c28655q14.m87173q(false);
                                z4 = false;
                            } else {
                                c28655q14.m87150e0(2011629176);
                                c28655q14.m87150e0(-1736222526);
                                List listM118959K = AbstractC37056f.m118959K(Boolean.TRUE, Boolean.FALSE);
                                int size = listM118959K.size();
                                int i18 = 0;
                                while (i18 < size) {
                                    boolean zBooleanValue = ((Boolean) listM118959K.get(i18)).booleanValue();
                                    boolean zM87155h = c28655q14.m87155h(zBooleanValue);
                                    Object objM87133R9 = c28655q14.m87133R();
                                    if (zM87155h || objM87133R9 == obj4) {
                                        obj3 = objM87133R9;
                                        Object c13962n1 = new C13962n1(zBooleanValue, c13988w0);
                                        c28655q14.m87172p0(c13962n1);
                                        obj3 = c13962n1;
                                    }
                                    InterfaceC34310d1 interfaceC34310d1 = (InterfaceC34310d1) obj3;
                                    boolean zM87155h2 = c28655q14.m87155h(zBooleanValue);
                                    Object objM87133R10 = c28655q14.m87133R();
                                    if (zM87155h2 || objM87133R10 == obj4) {
                                        objM87133R10 = zBooleanValue ? new C13931d0(c13988w0, i16) : new C13931d0(c13988w0, i15);
                                        c28655q14.m87172p0(objM87133R10);
                                    }
                                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R10;
                                    EnumC36774j enumC36774j = zBooleanValue ? c13981uM39802g2.f49879a.f49871a : c13981uM39802g2.f49880b.f49871a;
                                    if (zBooleanValue) {
                                        C13981u c13981uM39802g3 = c13988w0.m39802g();
                                        if (c13981uM39802g3 == null || (c13954lM39799d2 = c13988w0.m39799d((c13978t2 = c13981uM39802g3.f49879a))) == null) {
                                            fM108640r = 0.0f;
                                        } else {
                                            int i19 = c13978t2.f49872b;
                                            C23277r0 c23277r0 = (C23277r0) c13954lM39799d2.f49743c.invoke();
                                            if (c23277r0 != null) {
                                                fM108640r = AbstractC34339n0.m108640r(c23277r0, i19);
                                            } else {
                                                fM108640r = 0.0f;
                                            }
                                        }
                                    } else {
                                        C13981u c13981uM39802g4 = c13988w0.m39802g();
                                        if (c13981uM39802g4 == null || (c13954lM39799d = c13988w0.m39799d((c13978t = c13981uM39802g4.f49880b))) == null) {
                                            fM108640r = 0.0f;
                                        } else {
                                            int i24 = c13978t.f49872b;
                                            C23277r0 c23277r1 = (C23277r0) c13954lM39799d.f49743c.invoke();
                                            if (c23277r1 != null) {
                                                fM108640r = AbstractC34339n0.m108640r(c23277r1, i24);
                                            } else {
                                                fM108640r = 0.0f;
                                            }
                                        }
                                    }
                                    float f17 = fM108640r;
                                    C13940g0 c13940g0 = new C13940g0(interfaceC4339a2);
                                    boolean z16 = c13981uM39802g2.f49881c;
                                    boolean zM87157i3 = c28655q14.m87157i(interfaceC34310d1);
                                    Object objM87133R11 = c28655q14.m87133R();
                                    if (zM87157i3 || objM87133R11 == obj4) {
                                        i13 = 0;
                                        objM87133R11 = new C13934e0(interfaceC34310d1, i13);
                                        c28655q14.m87172p0(objM87133R11);
                                    } else {
                                        i13 = 0;
                                    }
                                    AbstractC13994y0.m39816e(c13940g0, zBooleanValue, enumC36774j, z16, 0L, f17, AbstractC34452c0.m108903b(c2314t2, interfaceC34310d1, (PointerInputEventHandler) objM87133R11), c28655q14, 0);
                                    i18++;
                                    i16 = i13;
                                    i15 = 1;
                                }
                                boolean z17 = i16;
                                c28655q14.m87173q(z17);
                                c28655q14.m87173q(z17);
                                z4 = z17;
                            }
                            c28655q14.m87173q(z4);
                        }
                    } else {
                        c28655q14.m87150e0(2013602667);
                        c28655q14.m87173q(false);
                    }
                } else {
                    c28655q14.m87138X();
                }
                return c23454a0;
            case 7:
                Composer composer9 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q15 = (C28655q) composer9;
                if (c28655q15.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC15011f9.m43113a(((C15033h9) obj6).f56282i, AbstractC37817c.m121344e(905505767, c28655q15, new C2567l4((C37816b) obj5, 10)), c28655q15, 48);
                } else {
                    c28655q15.m87138X();
                }
                return c23454a0;
            case 8:
                Composer composer10 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q16 = (C28655q) composer10;
                if (c28655q16.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ((Function3) obj6).invoke(((C15040i5) obj5).f56306a, c28655q16, 0);
                } else {
                    c28655q16.m87138X();
                }
                return c23454a0;
            case 9:
                Composer composer11 = (Composer) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C28655q c28655q17 = (C28655q) composer11;
                if (c28655q17.m87135U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ((C37816b) obj6).invoke((C15007f5) obj5, c28655q17, 6);
                } else {
                    c28655q17.m87138X();
                }
                return c23454a0;
            case 10:
                Composer composer12 = (Composer) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C28655q c28655q18 = (C28655q) composer12;
                if (c28655q18.m87135U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC28683x.m87247a(AbstractC15018g5.f56197a.mo86977a((C4320k) obj6), (InterfaceC4351m) obj5, c28655q18, 8);
                } else {
                    c28655q18.m87138X();
                }
                return c23454a0;
            case 11:
                Composer composer13 = (Composer) obj;
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) obj5;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q19 = (C28655q) composer13;
                    if (c28655q19.m87121F()) {
                        c28655q19.m87138X();
                    } else {
                        if (((C15454z1) obj6).f58047b) {
                            C28655q c28655q20 = (C28655q) composer13;
                            c28655q20.m87150e0(-1043339018);
                            strM113396S = AbstractC30060g.m92102X(R.string.stripe_form_label_optional, new Object[]{AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28670t2.getValue(), c28655q20)}, c28655q20);
                            c28655q20.m87173q(false);
                        } else {
                            C28655q c28655q21 = (C28655q) composer13;
                            c28655q21.m87150e0(-1043140835);
                            strM113396S = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28670t2.getValue(), c28655q21);
                            c28655q21.m87173q(false);
                        }
                        AbstractC4482w.m14005o(strM113396S, null, composer13, 0, 2);
                    }
                } else {
                    if (((C15454z1) obj6).f58047b) {
                        C28655q c28655q22 = (C28655q) composer13;
                        c28655q22.m87150e0(-1043339018);
                        strM113396S = AbstractC30060g.m92102X(R.string.stripe_form_label_optional, new Object[]{AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28670t2.getValue(), c28655q22)}, c28655q22);
                        c28655q22.m87173q(false);
                    } else {
                        C28655q c28655q23 = (C28655q) composer13;
                        c28655q23.m87150e0(-1043140835);
                        strM113396S = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28670t2.getValue(), c28655q23);
                        c28655q23.m87173q(false);
                    }
                    AbstractC4482w.m14005o(strM113396S, null, composer13, 0, 2);
                }
                return c23454a0;
            case 12:
                Composer composer14 = (Composer) obj;
                Function1 function1 = (Function1) obj5;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q24 = (C28655q) composer14;
                    if (c28655q24.m87121F()) {
                        c28655q24.m87138X();
                    } else {
                        C11219p0 c11219p0 = (C11219p0) obj6;
                        boolean z18 = c11219p0.f35996j;
                        List list = c11219p0.f35990d;
                        String str = c11219p0.f35989c;
                        List list2 = c11219p0.f35992f;
                        C32077a c32077a = c11219p0.f35993g;
                        C33333n c33333n = c11219p0.f35994h;
                        c28655q4 = (C28655q) composer14;
                        c28655q4.m87150e0(936373491);
                        zM87153g2 = c28655q4.m87153g(function1);
                        objM87133R4 = c28655q4.m87133R();
                        if (zM87153g2 || objM87133R4 == obj4) {
                            objM87133R4 = new C15728c(function1, 11);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        Function1 function2 = (Function1) objM87133R4;
                        c28655q4.m87173q(false);
                        c28655q4.m87150e0(936384288);
                        zM87153g3 = c28655q4.m87153g(function1);
                        objM87133R5 = c28655q4.m87133R();
                        if (zM87153g3 || objM87133R5 == obj4) {
                            objM87133R5 = new C15728c(function1, 12);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        c28655q4.m87173q(false);
                        AbstractC4482w.m14006p(z18, list, str, null, list2, function2, c32077a, c33333n, (Function1) objM87133R5, null, null, null, c28655q4, 3072, 3584);
                    }
                } else {
                    C11219p0 c11219p1 = (C11219p0) obj6;
                    boolean z19 = c11219p1.f35996j;
                    List list3 = c11219p1.f35990d;
                    String str2 = c11219p1.f35989c;
                    List list4 = c11219p1.f35992f;
                    C32077a c32077a2 = c11219p1.f35993g;
                    C33333n c33333n2 = c11219p1.f35994h;
                    c28655q4 = (C28655q) composer14;
                    c28655q4.m87150e0(936373491);
                    zM87153g2 = c28655q4.m87153g(function1);
                    objM87133R4 = c28655q4.m87133R();
                    if (zM87153g2) {
                        objM87133R4 = new C15728c(function1, 11);
                        c28655q4.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C15728c(function1, 11);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    Function1 function3 = (Function1) objM87133R4;
                    c28655q4.m87173q(false);
                    c28655q4.m87150e0(936384288);
                    zM87153g3 = c28655q4.m87153g(function1);
                    objM87133R5 = c28655q4.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = new C15728c(function1, 12);
                        c28655q4.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C15728c(function1, 12);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    c28655q4.m87173q(false);
                    AbstractC4482w.m14006p(z19, list3, str2, null, list4, function3, c32077a2, c33333n2, (Function1) objM87133R5, null, null, null, c28655q4, 3072, 3584);
                }
                return c23454a0;
            case 13:
                Composer composer15 = (Composer) obj;
                AbstractC11227t0 abstractC11227t0 = (AbstractC11227t0) obj6;
                Function1 function4 = (Function1) obj5;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q25 = (C28655q) composer15;
                    if (c28655q25.m87121F()) {
                        c28655q25.m87138X();
                    } else {
                        c28655q5 = (C28655q) composer15;
                        c28655q5.m87150e0(-1288140366);
                        zM87153g4 = c28655q5.m87153g(function4);
                        objM87133R6 = c28655q5.m87133R();
                        if (zM87153g4 || objM87133R6 == obj4) {
                            objM87133R6 = new C16283a(function4, 1);
                            c28655q5.m87172p0(objM87133R6);
                        }
                        c28655q5.m87173q(false);
                        C2550j3 c2550j3Mo30347b = abstractC11227t0.mo30347b((InterfaceC4339a) objM87133R6);
                        boolean z24 = abstractC11227t0.f36031b;
                        boolean z25 = !abstractC11227t0.mo30346a();
                        c28655q5.m87150e0(-1288132384);
                        zM87153g5 = c28655q5.m87153g(function4);
                        objM87133R7 = c28655q5.m87133R();
                        if (zM87153g5 || objM87133R7 == obj4) {
                            objM87133R7 = new C16283a(function4, 2);
                            c28655q5.m87172p0(objM87133R7);
                        }
                        c28655q5.m87173q(false);
                        AbstractC2526g3.m7464c(0.0f, 0, c28655q5, c2550j3Mo30347b, (InterfaceC4339a) objM87133R7, z24, z25);
                    }
                } else {
                    c28655q5 = (C28655q) composer15;
                    c28655q5.m87150e0(-1288140366);
                    zM87153g4 = c28655q5.m87153g(function4);
                    objM87133R6 = c28655q5.m87133R();
                    if (zM87153g4) {
                        objM87133R6 = new C16283a(function4, 1);
                        c28655q5.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C16283a(function4, 1);
                        c28655q5.m87172p0(objM87133R6);
                    }
                    c28655q5.m87173q(false);
                    C2550j3 c2550j3Mo30347b2 = abstractC11227t0.mo30347b((InterfaceC4339a) objM87133R6);
                    boolean z26 = abstractC11227t0.f36031b;
                    boolean z27 = !abstractC11227t0.mo30346a();
                    c28655q5.m87150e0(-1288132384);
                    zM87153g5 = c28655q5.m87153g(function4);
                    objM87133R7 = c28655q5.m87133R();
                    if (zM87153g5) {
                        objM87133R7 = new C16283a(function4, 2);
                        c28655q5.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C16283a(function4, 2);
                        c28655q5.m87172p0(objM87133R7);
                    }
                    c28655q5.m87173q(false);
                    AbstractC2526g3.m7464c(0.0f, 0, c28655q5, c2550j3Mo30347b2, (InterfaceC4339a) objM87133R7, z26, z27);
                }
                return c23454a0;
            case 14:
                Composer composer16 = (Composer) obj;
                if ((3 & ((Number) obj2).intValue()) == 2) {
                    C28655q c28655q26 = (C28655q) composer16;
                    if (c28655q26.m87121F()) {
                        c28655q26.m87138X();
                    } else {
                        c2314t = C2314t.f9131w;
                        f13 = 20;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, AbstractC14936g.f55709f, 1), f13, 0.0f, 2);
                        c16508j = (C16508j) obj6;
                        interfaceC4339a = (InterfaceC4339a) obj5;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, composer16, 48);
                        iM87266t2 = AbstractC28683x.m87266t(composer16);
                        c28655q6 = (C28655q) composer16;
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q6.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer16, modifierM3396r);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q6.m87158i0();
                        if (c28655q6.f115903S) {
                            c28655q6.m87163l(c0213j2);
                        } else {
                            c28655q6.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer16, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(composer16, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i2 = C0217k.f732j;
                        if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iM87266t2))) {
                            AbstractC11266d.m30471y(iM87266t2, c28655q6, iM87266t2, c0209i2);
                        }
                        AbstractC28683x.m87239G(composer16, C0217k.f726d, modifierM118962N3);
                        z13 = c16508j.f63481b;
                        interfaceC41211c = c16508j.f63482c;
                        if (z13) {
                            c28655q6.m87150e0(-1377341637);
                            AbstractC32411b.m101085b(null, AbstractC30060g.m92103Y(composer16, R.string.stripe_back), interfaceC4339a, R.drawable.stripe_link_back, 0, composer16, 4);
                            composer = composer16;
                            c28655q6.m87173q(false);
                        } else {
                            composer = composer16;
                            c28655q6.m87150e0(-1377082229);
                            AbstractC32411b.m101098j(c16508j.f63480a, null, composer, 0);
                            c28655q6.m87173q(false);
                        }
                        if (interfaceC41211c != null) {
                            c28655q6.m87150e0(-1376918363);
                            String strM113396S2 = AbstractC35785b.m113396S(interfaceC41211c, composer);
                            c28655q6.m87150e0(-443512897);
                            C14931b c14931b = (C14931b) c28655q6.m87161k(AbstractC14936g.f55706c);
                            c28655q6.m87173q(false);
                            long j14 = c14931b.f55674m;
                            c28655q6.m87150e0(-1418551394);
                            C14934e c14934e = (C14934e) c28655q6.m87161k(AbstractC14936g.f55705b);
                            c28655q6.m87173q(false);
                            C14934e c14934e2 = AbstractC14937h.f55711a;
                            AbstractC22676k.m65750j(c14934e, "<this>");
                            f14 = f13;
                            AbstractC15011f9.m43114b(strM113396S2, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 0.0f, 0.0f, 14), j14, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, AbstractC14937h.m43028a(new C23285v0(0L, AbstractC35745c.m113246h(18), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 0, AbstractC35745c.m113246h(26), 16646105)), composer, 48, 3120, 55288);
                            c28655q6.m87173q(false);
                        } else {
                            f14 = f13;
                            c28655q6.m87150e0(-1376485479);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            AbstractC22953f.m66715b(composer, new LayoutWeightElement(1.0f, true));
                            c28655q6.m87173q(false);
                        }
                        c28655q6.m87150e0(-1706967764);
                        if (!c16508j.f63481b) {
                            AbstractC32411b.m101085b(AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14), AbstractC30060g.m92103Y(composer, R.string.stripe_close), interfaceC4339a, R.drawable.stripe_link_close, 384, composer, 0);
                        }
                        c28655q6.m87173q(false);
                        c28655q6.m87173q(true);
                    }
                } else {
                    c2314t = C2314t.f9131w;
                    f13 = 20;
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, AbstractC14936g.f55709f, 1), f13, 0.0f, 2);
                    c16508j = (C16508j) obj6;
                    interfaceC4339a = (InterfaceC4339a) obj5;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, composer16, 48);
                    iM87266t2 = AbstractC28683x.m87266t(composer16);
                    c28655q6 = (C28655q) composer16;
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q6.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(composer16, modifierM3396r2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j2);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer16, C0217k.f729g, c22994r1M66759a2);
                    AbstractC28683x.m87239G(composer16, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i2 = C0217k.f732j;
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iM87266t2, c28655q6, iM87266t2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iM87266t2, c28655q6, iM87266t2, c0209i2);
                    }
                    AbstractC28683x.m87239G(composer16, C0217k.f726d, modifierM118962N4);
                    z13 = c16508j.f63481b;
                    interfaceC41211c = c16508j.f63482c;
                    if (z13) {
                        c28655q6.m87150e0(-1377341637);
                        AbstractC32411b.m101085b(null, AbstractC30060g.m92103Y(composer16, R.string.stripe_back), interfaceC4339a, R.drawable.stripe_link_back, 0, composer16, 4);
                        composer = composer16;
                        c28655q6.m87173q(false);
                    } else {
                        composer = composer16;
                        c28655q6.m87150e0(-1377082229);
                        AbstractC32411b.m101098j(c16508j.f63480a, null, composer, 0);
                        c28655q6.m87173q(false);
                    }
                    if (interfaceC41211c != null) {
                        c28655q6.m87150e0(-1376918363);
                        String strM113396S3 = AbstractC35785b.m113396S(interfaceC41211c, composer);
                        c28655q6.m87150e0(-443512897);
                        C14931b c14931b2 = (C14931b) c28655q6.m87161k(AbstractC14936g.f55706c);
                        c28655q6.m87173q(false);
                        long j15 = c14931b2.f55674m;
                        c28655q6.m87150e0(-1418551394);
                        C14934e c14934e3 = (C14934e) c28655q6.m87161k(AbstractC14936g.f55705b);
                        c28655q6.m87173q(false);
                        C14934e c14934e4 = AbstractC14937h.f55711a;
                        AbstractC22676k.m65750j(c14934e3, "<this>");
                        f14 = f13;
                        AbstractC15011f9.m43114b(strM113396S3, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 0.0f, 0.0f, 14), j15, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, AbstractC14937h.m43028a(new C23285v0(0L, AbstractC35745c.m113246h(18), C28780r.f116541H, null, AbstractC28771i.f116519w, 0L, null, null, 0, AbstractC35745c.m113246h(26), 16646105)), composer, 48, 3120, 55288);
                        c28655q6.m87173q(false);
                    } else {
                        f14 = f13;
                        c28655q6.m87150e0(-1376485479);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22953f.m66715b(composer, new LayoutWeightElement(1.0f, true));
                        c28655q6.m87173q(false);
                    }
                    c28655q6.m87150e0(-1706967764);
                    if (!c16508j.f63481b) {
                        AbstractC32411b.m101085b(AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14), AbstractC30060g.m92103Y(composer, R.string.stripe_close), interfaceC4339a, R.drawable.stripe_link_close, 384, composer, 0);
                    }
                    c28655q6.m87173q(false);
                    c28655q6.m87173q(true);
                }
                return c23454a0;
            case 15:
                Composer composer17 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q27 = (C28655q) composer17;
                    if (c28655q27.m87121F()) {
                        c28655q27.m87138X();
                    } else {
                        AbstractC15376j4.m43587c((InterfaceC15391m3) obj5, true, 7, AbstractC1126a.m3483b(AbstractC1102d.m3409f(1.0f, c2314t2), (C15247s) obj6), null, 0, 0, null, false, false, composer17, 432, MessageListItemViewType.GIPHY);
                    }
                } else {
                    AbstractC15376j4.m43587c((InterfaceC15391m3) obj5, true, 7, AbstractC1126a.m3483b(AbstractC1102d.m3409f(1.0f, c2314t2), (C15247s) obj6), null, 0, 0, null, false, false, composer17, 432, MessageListItemViewType.GIPHY);
                }
                return c23454a0;
            case 16:
                Composer composer18 = (Composer) obj;
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) obj5;
                InterfaceC15237i interfaceC15237i = (InterfaceC15237i) obj6;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q28 = (C28655q) composer18;
                    if (c28655q28.m87121F()) {
                        c28655q28.m87138X();
                    } else {
                        c28655q7 = (C28655q) composer18;
                        c28655q7.m87150e0(365170269);
                        zM87157i2 = c28655q7.m87157i(interfaceC15237i) | c28655q7.m87153g(interfaceC4339a3);
                        objM87133R8 = c28655q7.m87133R();
                        if (zM87157i2 || objM87133R8 == obj4) {
                            objM87133R8 = new C17930b1(interfaceC15237i, interfaceC4339a3, 0);
                            c28655q7.m87172p0(objM87133R8);
                        }
                        c28655q7.m87173q(false);
                        AbstractC32411b.m101083a(true, (InterfaceC4339a) objM87133R8, c28655q7, 6);
                    }
                } else {
                    c28655q7 = (C28655q) composer18;
                    c28655q7.m87150e0(365170269);
                    zM87157i2 = c28655q7.m87157i(interfaceC15237i) | c28655q7.m87153g(interfaceC4339a3);
                    objM87133R8 = c28655q7.m87133R();
                    if (zM87157i2) {
                        objM87133R8 = new C17930b1(interfaceC15237i, interfaceC4339a3, 0);
                        c28655q7.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C17930b1(interfaceC15237i, interfaceC4339a3, 0);
                        c28655q7.m87172p0(objM87133R8);
                    }
                    c28655q7.m87173q(false);
                    AbstractC32411b.m101083a(true, (InterfaceC4339a) objM87133R8, c28655q7, 6);
                }
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                Composer composer19 = (Composer) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                C28655q c28655q29 = (C28655q) composer19;
                if (c28655q29.m87135U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Modifier modifierM3393o3 = AbstractC1099a.m3393o((InterfaceC22973k1) obj6, AbstractC1102d.m3404a(c2314t2, AbstractC23096g.f91203b, AbstractC23096g.f91204c));
                    C37816b c37816b3 = (C37816b) obj5;
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q29, 54);
                    int iHashCode = Long.hashCode(c28655q29.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q29.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q29, modifierM3393o3);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j3 = C0217k.f724b;
                    c28655q29.m87158i0();
                    if (c28655q29.f115903S) {
                        c28655q29.m87163l(c0213j3);
                    } else {
                        c28655q29.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q29, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q29, C0217k.f728f, interfaceC28653p1M87165m5);
                    C0209i c0209i3 = C0217k.f732j;
                    if (c28655q29.f115903S || !AbstractC22676k.m65745e(c28655q29.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q29, iHashCode, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q29, C0217k.f726d, modifierM118962N5);
                    c37816b3.invoke(C23000t1.f90727a, c28655q29, 6);
                    c28655q29.m87173q(true);
                } else {
                    c28655q29.m87138X();
                }
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                Composer composer20 = (Composer) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C28655q c28655q30 = (C28655q) composer20;
                if (c28655q30.m87135U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC23164r1.m67133b((C27430e) obj6, (String) obj5, null, 0L, c28655q30, 0, 12);
                } else {
                    c28655q30.m87138X();
                }
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str3 = (String) obj6;
                Composer composer21 = (Composer) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                C28655q c28655q31 = (C28655q) composer21;
                if (c28655q31.m87135U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zM87153g6 = c28655q31.m87153g(str3);
                    Object objM87133R12 = c28655q31.m87133R();
                    if (zM87153g6 || objM87133R12 == obj4) {
                        objM87133R12 = new C17632d(str3, 16);
                        c28655q31.m87172p0(objM87133R12);
                    }
                    AbstractC23149o4.m67128c(str3, AbstractC18032n.m51775c(c2314t2, false, (Function1) objM87133R12), ((C23204y) obj5).f91832f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q31, 0, 0, 262136);
                } else {
                    c28655q31.m87138X();
                }
                return c23454a0;
            case 20:
                Composer composer22 = (Composer) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                C28655q c28655q32 = (C28655q) composer22;
                if (c28655q32.m87135U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    AbstractC23149o4.m67126a(((C23209y4) obj6).f91879j, (C37816b) obj5, c28655q32, 0);
                } else {
                    c28655q32.m87138X();
                }
                return c23454a0;
            case 21:
                Composer composer23 = (Composer) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                C28655q c28655q33 = (C28655q) composer23;
                if (c28655q33.m87135U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj6;
                    Object objM87133R13 = c28655q33.m87133R();
                    if (objM87133R13 == obj4) {
                        objM87133R13 = new C21927e(i17, interfaceC28601c1);
                        c28655q33.m87172p0(objM87133R13);
                    }
                    Modifier modifierM3500d = AbstractC1131a.m3500d(c2314t2, (Function1) objM87133R13);
                    C37816b c37816b4 = (C37816b) obj5;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode2 = Long.hashCode(c28655q33.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q33.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q33, modifierM3500d);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j4 = C0217k.f724b;
                    c28655q33.m87158i0();
                    if (c28655q33.f115903S) {
                        c28655q33.m87163l(c0213j4);
                    } else {
                        c28655q33.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q33, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q33, C0217k.f728f, interfaceC28653p1M87165m6);
                    C0209i c0209i4 = C0217k.f732j;
                    if (c28655q33.f115903S || !AbstractC22676k.m65745e(c28655q33.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q33, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q33, C0217k.f726d, modifierM118962N6);
                    AbstractC18489d0.m53384y(0, c37816b4, c28655q33, true);
                } else {
                    c28655q33.m87138X();
                }
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Composer composer24 = (Composer) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                String str4 = (String) obj6;
                C28655q c28655q34 = (C28655q) composer24;
                if (c28655q34.m87135U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zM87153g7 = c28655q34.m87153g(str4);
                    Object objM87133R14 = c28655q34.m87133R();
                    if (zM87153g7 || objM87133R14 == obj4) {
                        objM87133R14 = new C17632d(str4, 21);
                        c28655q34.m87172p0(objM87133R14);
                    }
                    Modifier modifierM51775c = AbstractC18032n.m51775c(c2314t2, false, (Function1) objM87133R14);
                    C37816b c37816b5 = (C37816b) obj5;
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode3 = Long.hashCode(c28655q34.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q34.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q34, modifierM51775c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j5 = C0217k.f724b;
                    c28655q34.m87158i0();
                    if (c28655q34.f115903S) {
                        c28655q34.m87163l(c0213j5);
                    } else {
                        c28655q34.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q34, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q34, C0217k.f728f, interfaceC28653p1M87165m7);
                    C0209i c0209i5 = C0217k.f732j;
                    if (c28655q34.f115903S || !AbstractC22676k.m65745e(c28655q34.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q34, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q34, C0217k.f726d, modifierM118962N7);
                    AbstractC18489d0.m53384y(0, c37816b5, c28655q34, true);
                } else {
                    c28655q34.m87138X();
                }
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                Composer composer25 = (Composer) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                C28655q c28655q35 = (C28655q) composer25;
                if (c28655q35.m87135U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ((Function3) obj6).invoke((C24907i0) obj5, c28655q35, 6);
                } else {
                    c28655q35.m87138X();
                }
                return c23454a0;
            case 24:
                Composer composer26 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q36 = (C28655q) composer26;
                    if (c28655q36.m87121F()) {
                        c28655q36.m87138X();
                    } else {
                        AbstractC15376j4.m43587c((InterfaceC15391m3) obj5, !((C26075c) obj6).f103263f, 7, AbstractC1099a.m3396r(c2314t2, 0.0f, 4, 1), null, 0, 0, null, false, false, composer26, 3456, MessageListItemViewType.GIPHY);
                    }
                } else {
                    AbstractC15376j4.m43587c((InterfaceC15391m3) obj5, !((C26075c) obj6).f103263f, 7, AbstractC1099a.m3396r(c2314t2, 0.0f, 4, 1), null, 0, 0, null, false, false, composer26, 3456, MessageListItemViewType.GIPHY);
                }
                return c23454a0;
            case 25:
                return m7521a(obj, obj2);
            case 26:
                Composer composer27 = (Composer) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                C28655q c28655q37 = (C28655q) composer27;
                if (c28655q37.m87135U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ((C37816b) obj6).invoke((C28559x0) obj5, c28655q37, 0);
                } else {
                    c28655q37.m87138X();
                }
                return c23454a0;
            case 27:
                return m7522c(obj, obj2);
            case 28:
                return m7523d(obj, obj2);
            default:
                Composer composer28 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q38 = (C28655q) composer28;
                    if (c28655q38.m87121F()) {
                        c28655q38.m87138X();
                    } else {
                        AbstractC33295o.m105605c(((C11566v) obj6).f37324h, (InterfaceC4339a) obj5, composer28, 0);
                    }
                } else {
                    AbstractC33295o.m105605c(((C11566v) obj6).f37324h, (InterfaceC4339a) obj5, composer28, 0);
                }
                return c23454a0;
        }
    }
}
