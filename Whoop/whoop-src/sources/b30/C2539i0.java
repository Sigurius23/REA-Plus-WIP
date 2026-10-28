package b30;

import a20.C0162b;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1640x1;
import androidx.room.C1845y0;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.p055ui.SepaMandateActivity;
import e30.AbstractC12605c;
import ec3.C13045h2;
import h20.C16650e4;
import h20.C16686k4;
import h20.C16754w0;
import h20.C16776z4;
import h20.EnumC16656f4;
import i20.C17968o0;
import i20.C17982v0;
import j00.C21103h;
import j00.C21108k;
import k20.C22136a;
import k20.C22146k;
import l00.C23026h;
import l00.C23027i;
import l83.C23454a0;
import m00.C24869a;
import m00.C24871c;
import m00.C24872d;
import n00.C26075c;
import n00.C26083k;
import no.nordicsemi.android.dfu.DfuBaseService;
import o00.C27344b;
import p00.C28578o;
import p002a0.C0059w0;
import p005a3.AbstractC0201g;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p026b2.AbstractC2316v;
import p164g2.C15236h;
import p164g2.C15240l;
import p164g2.C15252x;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15233e;
import p599wz.C37762v;
import p599wz.C37770y;
import p599wz.EnumC37721h0;
import p603x2.AbstractC37831a;
import p665yz.C39900c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q20.C29824j;
import q20.C29828m;
import r20.C30866d;
import y00.C38809d5;

/* JADX INFO: renamed from: b30.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2539i0 extends C22672i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9856w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2539i0(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f9856w = i15;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0365 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x0367 A[LOOP:9: B:131:0x0337->B:141:0x0367, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:172:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x02ac A[LOOP:5: B:82:0x0275->B:92:0x02ac, LOOP_END] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C0223l1 c0223l1;
        Object value;
        C21108k c21108k;
        Object value2;
        Object value3;
        Object value4;
        C26075c it;
        Object value5;
        C26075c it3;
        switch (this.f9856w) {
            case 0:
                ((AbstractC12605c) this.receiver).mo35327g();
                break;
            case 1:
                ((C16776z4) this.receiver).m47284e();
                break;
            case 2:
                ((AbstractC12605c) this.receiver).m35335t();
                break;
            case 3:
                ((SepaMandateActivity) this.receiver).finish();
                break;
            case 4:
                C22136a c22136a = (C22136a) this.receiver;
                c22136a.getClass();
                C22136a.m63387i(c22136a, new C22146k(1));
                break;
            case 5:
                ((C16776z4) this.receiver).m47284e();
                break;
            case 6:
                C15236h c15236h = (C15236h) this.receiver;
                C0059w0 c0059w0 = c15236h.f57235c;
                C0059w0 c0059w1 = c15236h.f57236d;
                C15240l c15240l = c15236h.f57233a;
                C15252x c15252x = c15240l.f57246h;
                if (c15252x == null) {
                    Object[] objArr = c0059w1.f178b;
                    long[] jArr = c0059w1.f177a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j7 = jArr[i13];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8 - ((~(i13 - length)) >>> 31);
                                for (int i15 = 0; i15 < i14; i15++) {
                                    if ((j7 & 255) < 128) {
                                        ((InterfaceC15233e) objArr[(i13 << 3) + i15]).mo470k(EnumC15251w.f57274z);
                                    }
                                    j7 >>= 8;
                                }
                                if (i14 == 8) {
                                    if (i13 != length) {
                                        i13++;
                                    }
                                }
                            } else if (i13 != length) {
                                i13++;
                            }
                        }
                    }
                } else if (c15252x.f9141N) {
                    if (c0059w0.m138c(c15252x)) {
                        c15252x.m43359a1();
                    }
                    EnumC15251w enumC15251wM43358Z0 = c15252x.m43358Z0();
                    if (!c15252x.f9142w.f9141N) {
                        AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                    }
                    AbstractC2316v abstractC2316v = c15252x.f9142w;
                    C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252x);
                    int i16 = 0;
                    while (c0230n0M516p != null) {
                        if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & 5120) != 0) {
                            while (abstractC2316v != null) {
                                int i17 = abstractC2316v.f9144y;
                                if ((i17 & 5120) != 0) {
                                    if ((i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i16++;
                                    }
                                    if ((abstractC2316v instanceof InterfaceC15233e) && c0059w1.m138c(abstractC2316v)) {
                                        if (i16 <= 1) {
                                            ((InterfaceC15233e) abstractC2316v).mo470k(enumC15251wM43358Z0);
                                        } else {
                                            ((InterfaceC15233e) abstractC2316v).mo470k(EnumC15251w.f57272x);
                                        }
                                        c0059w1.m147l(abstractC2316v);
                                    }
                                }
                                abstractC2316v = abstractC2316v.f9132E;
                            }
                        }
                        c0230n0M516p = c0230n0M516p.m588G();
                        abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
                    }
                    Object[] objArr2 = c0059w1.f178b;
                    long[] jArr2 = c0059w1.f177a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j13 = jArr2[i18];
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                for (int i24 = 0; i24 < i19; i24++) {
                                    if ((j13 & 255) < 128) {
                                        ((InterfaceC15233e) objArr2[(i18 << 3) + i24]).mo470k(EnumC15251w.f57274z);
                                    }
                                    j13 >>= 8;
                                }
                                if (i19 == 8) {
                                    if (i18 != length2) {
                                        i18++;
                                    }
                                }
                            } else if (i18 != length2) {
                                i18++;
                            }
                        }
                    }
                }
                if (c15240l.f57246h == null || c15240l.f57241c.m43358Z0() == EnumC15251w.f57274z) {
                    c15240l.m43342e();
                }
                c0059w0.m137b();
                c0059w1.m137b();
                c15236h.f57237e = false;
                break;
            case 7:
                ((C16754w0) this.receiver).mo35338w();
                break;
            case 8:
                C16754w0 c16754w0 = (C16754w0) this.receiver;
                c16754w0.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c16754w0), null, null, new C0162b(c16754w0, null, 27), 3);
                break;
            case 9:
                ((C16686k4) this.receiver).mo35338w();
                break;
            case 10:
                C16686k4 c16686k4 = (C16686k4) this.receiver;
                c16686k4.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c16686k4), null, null, new C16650e4(c16686k4, null, 3), 3);
                break;
            case 11:
                C16686k4 c16686k5 = (C16686k4) this.receiver;
                c16686k5.getClass();
                c16686k5.m47237C(C29824j.f121906x, EnumC16656f4.f64038w);
                break;
            case 12:
                C16686k4 c16686k6 = (C16686k4) this.receiver;
                c16686k6.getClass();
                c16686k6.m47237C(new C29828m(EnumC37721h0.f161649w, null, null, 6), EnumC16656f4.f64038w);
                break;
            case 13:
                ((C30866d) this.receiver).m94919b();
                break;
            case 14:
                ((C17982v0) this.receiver).m51592g();
                break;
            case 15:
                ((C17982v0) this.receiver).m51592g();
                break;
            case 16:
                C17982v0 c17982v0 = (C17982v0) this.receiver;
                c17982v0.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c17982v0), null, null, new C17968o0(c17982v0, null, 2), 3);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((C17982v0) this.receiver).m51592g();
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C17982v0 c17982v1 = (C17982v0) this.receiver;
                c17982v1.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c17982v1), null, null, new C17968o0(c17982v1, null, 2), 3);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C21103h c21103h = (C21103h) this.receiver;
                C13045h2 c13045h2 = c21103h.f80015H;
                do {
                    value = c13045h2.getValue();
                    c21108k = (C21108k) value;
                } while (!c13045h2.m36569i(value, C21108k.m58928a(c21108k, null, !c21108k.f80052i, false, null, 1791)));
                if (((C21108k) c13045h2.getValue()).f80052i && !c21103h.f80028U) {
                    c21103h.f80028U = true;
                    c21103h.f80032z.m128003a(C39900c.f172283K, null);
                }
                break;
            case 20:
                C13045h2 c13045h3 = ((C21103h) this.receiver).f80015H;
                do {
                    value2 = c13045h3.getValue();
                } while (!c13045h3.m36569i(value2, C21108k.m58928a((C21108k) value2, null, false, false, null, 3967)));
                break;
            case 21:
                C23027i c23027i = (C23027i) this.receiver;
                c23027i.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c23027i), null, null, new C23026h(c23027i, true, null), 3);
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C23027i c23027i2 = (C23027i) this.receiver;
                c23027i2.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c23027i2), null, null, new C23026h(c23027i2, false, null), 3);
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C24872d c24872d = (C24872d) this.receiver;
                C38809d5 c38809d5 = ((C24869a) c24872d.f97441J.getValue()).f97421f;
                if (c38809d5 == null) {
                    c24872d.f97436E.m94512b("PaymentMethodViewModel: onPayClicked without paymentMethodCreateParams", null);
                } else {
                    AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c24872d), null, null, new C24871c(c24872d, c38809d5, null), 3);
                }
                break;
            case 24:
                C13045h2 c13045h4 = ((C24872d) this.receiver).f97441J;
                do {
                    value3 = c13045h4.getValue();
                } while (!c13045h4.m36569i(value3, C24869a.m72901a((C24869a) value3, null, true, null, null, 111)));
                break;
            case 25:
                C26083k c26083k = (C26083k) this.receiver;
                C13045h2 c13045h5 = c26083k.f103303N;
                do {
                    value4 = c13045h5.getValue();
                    it = (C26075c) value4;
                    AbstractC22676k.m65750j(it, "it");
                } while (!c13045h5.m36569i(value4, C26075c.m77570a(it, false, null, false, null, null, 191)));
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c26083k), null, null, new C1845y0(c26083k, null), 3);
                do {
                    value5 = c13045h5.getValue();
                    it3 = (C26075c) value5;
                    AbstractC22676k.m65750j(it3, "it");
                } while (!c13045h5.m36569i(value5, C26075c.m77570a(it3, false, null, false, null, null, 223)));
                break;
            case 26:
                C37770y c37770y = (C37770y) this.receiver;
                c37770y.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c37770y), null, null, new C37762v(c37770y, null, 2), 3);
                break;
            case 27:
                C27344b c27344b = (C27344b) this.receiver;
                c27344b.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c27344b), null, null, new C24871c(c27344b, null), 3);
                break;
            case 28:
                C2571m0 c2571m0 = (C2571m0) ((C27344b) this.receiver).f109533K.f45200w.getValue();
                if (c2571m0 != null) {
                    c2571m0.m7501b(C2524g1.f9817a);
                }
                break;
            default:
                C28578o c28578o = (C28578o) this.receiver;
                c28578o.m86905g();
                c28578o.f115629J.invoke();
                c28578o.f115639z.m128003a(C39900c.f172288P, null);
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2539i0(C15236h c15236h) {
        super(0, 0, C15236h.class, c15236h, "invalidateNodes", "invalidateNodes()V");
        this.f9856w = 6;
    }
}
