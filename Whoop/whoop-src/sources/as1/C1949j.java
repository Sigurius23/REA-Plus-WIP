package as1;

import a30.C0273a;
import a30.C0307l0;
import a33.C0352d;
import androidx.compose.runtime.Composer;
import b30.C2519f4;
import b30.C2539i0;
import b30.C2585n6;
import b30.C2593o6;
import b30.C2598p3;
import b30.C2601p6;
import b30.C2666z0;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.whoop.android.R;
import com.whoop.journal.view.fragment.JournalSurveyAnswerFragment;
import d00.C11433l;
import d30.C11564u;
import d30.EnumC11553o0;
import e10.InterfaceC12536b0;
import e30.C12606d;
import e30.C12608f;
import g40.C15399o1;
import h00.C16520p;
import h00.C16522q;
import h00.C16524r;
import h20.AbstractC16662g4;
import h20.C16666h2;
import h20.C16686k4;
import h20.C16687l;
import h20.C16689l1;
import h20.C16703n3;
import h20.C16707o1;
import h20.C16721q3;
import h20.C16757w3;
import h20.C16761x1;
import h20.EnumC16648e2;
import h20.EnumC16677j1;
import h20.EnumC16683k1;
import h20.EnumC16701n1;
import h20.EnumC16715p3;
import ii0.AbstractC18533a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.C25271y;
import m83.C25272z;
import my.C26027a;
import p040c0.InterfaceC3764o;
import p078d1.C11457j;
import p114eb.C12982q;
import p114eb.C12991u0;
import p133f1.C13984v;
import p133f1.C13988w0;
import p164g2.C15247s;
import p181h2.C16617b;
import p41.AbstractC28832c;
import p41.C28833d;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32128i;
import p522uf.AbstractC34870c0;
import p537ux.C35330f;
import p537ux.C35334h;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p599wz.C37708d;
import p599wz.C37718g0;
import p635y2.InterfaceC39147y;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29731o;
import q20.AbstractC29840y;
import q20.EnumC29806a;
import r20.C30868f;
import r20.C30869g;
import r20.C30880r;
import r20.InterfaceC30881s;
import rm2.AbstractC31605e;
import s00.AbstractC32044g;
import s00.C32038a;
import s00.C32040c;
import s00.C32042e;
import s00.C32043f;
import s00.InterfaceC32039b;
import se.AbstractC32411b;
import se.AbstractC32417h;
import sz.C33122b0;
import sz.C33124c0;
import sz.EnumC33131g;
import t20.C33341v;
import t20.C33342w;
import t83.C33617b;
import ti0.C33836a;
import u00.C34377e;
import v00.C35459c0;
import v00.C35473j0;
import v00.C35484p;
import v00.EnumC35491s0;
import y00.C38840g6;
import yi0.AbstractC39566d;
import yr1.EnumC39731b;

/* JADX INFO: renamed from: as1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1949j implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7748w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f7749x;

    public /* synthetic */ C1949j(Object obj, int i13) {
        this.f7748w = i13;
        this.f7749x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0278  */
    /* JADX WARN: Code duplicated, block: B:233:0x0459  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? arrayList;
        Object obj5;
        EnumC16701n1 enumC16701n1;
        C16707o1 c16707o1;
        Map map;
        C16703n3 c16703n3;
        int size;
        char c3;
        C13984v c13984v;
        long jM39797b;
        C33124c0 c33124c0;
        InterfaceC35322b interfaceC35322b;
        InterfaceC35320a interfaceC35320a;
        List list;
        switch (this.f7748w) {
            case 0:
                return JournalSurveyAnswerFragment.m22281A0((JournalSurveyAnswerFragment) this.f7749x, (Long) obj, (String) obj2, (EnumC39731b) obj3, ((Boolean) obj4).booleanValue());
            case 1:
                C11457j c11457j = (C11457j) this.f7749x;
                C2666z0 c2666z0 = (C2666z0) obj;
                InterfaceC12536b0 confirmationState = (InterfaceC12536b0) obj2;
                C32040c linkEmbeddedState = (C32040c) obj3;
                C37708d linkAccountInfo = (C37708d) obj4;
                AbstractC22676k.m65750j(confirmationState, "confirmationState");
                AbstractC22676k.m65750j(linkEmbeddedState, "linkEmbeddedState");
                AbstractC32044g abstractC32044g = linkEmbeddedState.f132914w;
                AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
                C25271y c25271y = C25271y.f99162w;
                if (c2666z0 != null) {
                    C16721q3 c16721q3 = c2666z0.f10433c.f102966U;
                    if (c16721q3 == null || (c16703n3 = c16721q3.f64262x) == null || (map = c16703n3.f64230x) == null) {
                        map = C25272z.f99163w;
                    }
                    C33617b c33617b = EnumC35491s0.f151074G;
                    arrayList = new ArrayList();
                    for (Object obj6 : c33617b) {
                        EnumC16715p3 enumC16715p3 = (EnumC16715p3) map.get(AbstractC34870c0.m109980O((EnumC35491s0) obj6));
                        if (enumC16715p3 == null || enumC16715p3 == EnumC16715p3.f64251w) {
                            arrayList.add(obj6);
                        }
                    }
                } else {
                    arrayList = c25271y;
                }
                if (c2666z0 != null) {
                    C26027a c26027a = c2666z0.f10433c;
                    C35459c0 c35459c0 = c2666z0.f10432b;
                    List list2 = c35459c0.f150963F;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        int iOrdinal = ((EnumC35491s0) it.next()).ordinal();
                        if (iOrdinal == 0) {
                            C16666h2 c16666h2 = c26027a.f102972y;
                            EnumC16648e2 enumC16648e2 = c16666h2 != null ? c16666h2.f64093F : null;
                            C35473j0 c35473j0 = new C35473j0(c26027a.f102959N);
                            InterfaceC35322b interfaceC35322b2 = c35459c0.f150982Y;
                            C16689l1 c16689l1 = c26027a.f102954I;
                            C16666h2 c16666h3 = c26027a.f102972y;
                            List list3 = c16666h3 != null ? c16666h3.f64094G : null;
                            Object c2585n6 = new C2585n6(enumC16648e2, c16689l1, c35473j0, interfaceC35322b2, list3 == null ? c25271y : list3);
                            if (arrayList.contains(EnumC35491s0.GooglePay)) {
                                obj5 = c2585n6;
                            } else {
                                obj5 = null;
                            }
                        } else if (iOrdinal == 1) {
                            C0307l0 c0307l0 = c35459c0.f150995l0;
                            C37718g0 c37718g0 = c0307l0 != null ? c0307l0.f1058w : null;
                            boolean z4 = c37718g0 != null && c37718g0.f161626Z;
                            String str = c2666z0.f10431a;
                            C11433l c11433l = linkAccountInfo.f161571w;
                            DisplayablePaymentDetails displayablePaymentDetails = c11433l != null ? c11433l.f36661y : null;
                            C29731o c29731oM99744f0 = displayablePaymentDetails != null ? AbstractC32073e.m99744f0(displayablePaymentDetails, z4) : null;
                            AbstractC32417h c16522q = c29731oM99744f0 != null ? new C16522q(c29731oM99744f0) : str != null ? new C16524r(str) : C16520p.f63515a;
                            C16721q3 c16721q4 = c26027a.f102966U;
                            if (c16721q4 == null || (c16707o1 = c16721q4.f64263y) == null || (enumC16701n1 = c16707o1.f64235w) == null) {
                                enumC16701n1 = EnumC16701n1.f64226w;
                            }
                            Object c2593o6 = new C2593o6(c16522q, enumC16701n1);
                            if ((abstractC32044g instanceof C32043f) && arrayList.contains(EnumC35491s0.Link)) {
                                obj5 = c2593o6;
                            } else {
                                obj5 = null;
                            }
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj5 = C2601p6.f10125a;
                            if (!arrayList.contains(EnumC35491s0.ShopPay)) {
                                obj5 = null;
                            }
                        }
                        if (obj5 != null) {
                            arrayList2.add(obj5);
                        }
                    }
                }
                if (c2666z0 != null) {
                    C32042e c32042e = abstractC32044g instanceof C32042e ? (C32042e) abstractC32044g : null;
                    if (c32042e != null && c32042e.f132916w != null) {
                        C15399o1 otpElement = ((C32038a) ((InterfaceC32039b) c11457j.f36754y)).f132912d;
                        AbstractC22676k.m65750j(otpElement, "otpElement");
                        arrayList.contains(EnumC35491s0.Link);
                    }
                }
                return new C2519f4();
            case 2:
                C11564u c11564u = (C11564u) this.f7749x;
                List paymentMethods = (List) obj;
                C16687l c16687l = (C16687l) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
                c11564u.getClass();
                if (c16687l != null && (size = paymentMethods.size()) != 0) {
                    if (size != 1) {
                        return EnumC11553o0.f37268y;
                    }
                    return (c16687l.m47246d(zBooleanValue2) || zBooleanValue) ? EnumC11553o0.f37267x : EnumC11553o0.f37266w;
                }
                return EnumC11553o0.f37266w;
            case 3:
                C12606d c12606d = (C12606d) this.f7749x;
                C0273a c0273a = (C0273a) obj;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                C35484p c35484p = (C35484p) obj4;
                C25271y c25271y2 = C25271y.f99162w;
                List list4 = c0273a != null ? c0273a.f935w : c25271y2;
                String str2 = (c35484p == null || !c35484p.f151062z || c0273a == null) ? null : c0273a.f936x;
                boolean z13 = c12606d.f43034f;
                ArrayList arrayListM101057A = bool != null ? AbstractC32411b.m101057A(list4, zBooleanValue3 && z13, bool.booleanValue() && z13, c12606d.f43033e, ((Boolean) c12606d.f43035g.invoke()).booleanValue(), str2) : null;
                return arrayListM101057A == null ? c25271y2 : arrayListM101057A;
            case 4:
                C0352d c0352d = (C0352d) this.f7749x;
                InterfaceC30881s screen = (InterfaceC30881s) obj;
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj3;
                C2598p3 c2598p3 = (C2598p3) obj4;
                AbstractC22676k.m65750j(screen, "screen");
                boolean z14 = false;
                boolean z15 = ((screen instanceof C30880r) || (screen instanceof C30868f) || (screen instanceof C30869g)) && zBooleanValue4;
                if (c2598p3 != null) {
                    return c2598p3;
                }
                String str3 = ((C16761x1) c0352d.f1237x).f64406I;
                C2598p3 c2598p4 = new C2598p3(str3 != null ? AbstractC32128i.m100055i(str3) : AbstractC32128i.m100054h(R.string.stripe_continue_button_label), z15, (InterfaceC4339a) c0352d.f1238y, new C12608f(z15, c0352d, 0), zBooleanValue4 && abstractC29840y != null, false);
                if (abstractC29840y != null && abstractC29840y.mo91323b() && screen.mo94933s()) {
                    z14 = true;
                }
                if (screen.mo94925T() || z14) {
                    return c2598p4;
                }
                return null;
            case 5:
                C13988w0 c13988w0 = (C13988w0) this.f7749x;
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) obj2;
                C13984v c13984v2 = (C13984v) obj4;
                long jMo3541n = interfaceC39147y.mo3541n();
                float fIntBitsToFloat = (int) (jMo3541n >> 32);
                float fIntBitsToFloat2 = (int) (jMo3541n & 4294967295L);
                long jFloatToRawIntBits = ((C16617b) obj3).f63937a;
                int i13 = (int) (jFloatToRawIntBits >> 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
                if (0.0f <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fIntBitsToFloat) {
                    c3 = ' ';
                    c13984v = c13984v2;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    if (0.0f > fIntBitsToFloat4 || fIntBitsToFloat4 > fIntBitsToFloat2) {
                    }
                    jM39797b = c13988w0.m39797b(interfaceC39147y, jFloatToRawIntBits);
                    if ((9223372034707292159L & jM39797b) != 9205357640488583168L) {
                        c13988w0.m39807l(zBooleanValue5);
                        c13988w0.f49919t = null;
                        c13988w0.m39810o(jM39797b, 9205357640488583168L, false, c13984v);
                        C15247s.m43350c(c13988w0.f49907h);
                        c13988w0.f49923x = false;
                        c13988w0.m39811p();
                        c13988w0.f49920u = true;
                    }
                    return C23454a0.f92919a;
                }
                c3 = ' ';
                c13984v = c13984v2;
                if (Float.intBitsToFloat(i13) < 0.0f) {
                    fIntBitsToFloat = 0.0f;
                } else if (Float.intBitsToFloat(i13) <= fIntBitsToFloat) {
                    fIntBitsToFloat = Float.intBitsToFloat(i13);
                }
                int i14 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i14) < 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else if (Float.intBitsToFloat(i14) <= fIntBitsToFloat2) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i14);
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c3) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                jM39797b = c13988w0.m39797b(interfaceC39147y, jFloatToRawIntBits);
                if ((9223372034707292159L & jM39797b) != 9205357640488583168L) {
                    c13988w0.m39807l(zBooleanValue5);
                    c13988w0.f49919t = null;
                    c13988w0.m39810o(jM39797b, 9205357640488583168L, false, c13984v);
                    C15247s.m43350c(c13988w0.f49907h);
                    c13988w0.f49923x = false;
                    c13988w0.m39811p();
                    c13988w0.f49920u = true;
                }
                return C23454a0.f92919a;
            case 6:
                C16686k4 c16686k4 = (C16686k4) this.f7749x;
                C16757w3 c16757w3 = c16686k4.f64159c0;
                Boolean bool2 = (Boolean) obj;
                String str4 = (String) obj2;
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                C35459c0 c35459c1 = (C35459c0) obj4;
                boolean z16 = c35459c1 != null && c35459c1.f150974Q;
                List listM112535S = c35459c1 != null ? c35459c1.m112535S() : null;
                C25271y c25271y3 = C25271y.f99162w;
                List list5 = listM112535S == null ? c25271y3 : listM112535S;
                C16761x1 c16761x1 = c16757w3.f64383x;
                C16666h2 c16666h4 = c16761x1.f64425y;
                C16689l1 c16689l2 = c16761x1.f64407J;
                if (c16666h4 == null) {
                    c33124c0 = null;
                } else {
                    if (c16666h4.f64097y == null) {
                        C35459c0 c35459c2 = (C35459c0) c16686k4.f43008L.getValue();
                        if ((c35459c2 != null ? c35459c2.f150996w : null) instanceof C38840g6) {
                            c16686k4.f64161e0.m94514d("GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent");
                            c33124c0 = null;
                        }
                    }
                    EnumC33131g enumC33131g = AbstractC16662g4.f64074a[c16666h4.f64095w.ordinal()] == 1 ? EnumC33131g.Production : EnumC33131g.Test;
                    String str5 = c16666h4.f64096x;
                    String str6 = c16686k4.f43025w.f64423w;
                    boolean zM47250f = c16689l2.m47250f();
                    C33122b0 c33122b0M47253k = c16689l2.m47253k();
                    C16666h2 c16666h5 = c16761x1.f64425y;
                    c33124c0 = new C33124c0(enumC33131g, str5, str6, zM47250f, c33122b0M47253k, (c16666h5 == null || (list = c16666h5.f64094G) == null) ? c25271y3 : list);
                }
                C16666h2 c16666h6 = c16757w3.f64383x.f64425y;
                EnumC29806a enumC29806aM65693A = AbstractC22674j.m65693A(c16666h6 != null ? c16666h6.f64093F : null);
                int i15 = 0;
                int i16 = 0;
                C2539i0 c2539i0 = new C2539i0(i16, c16686k4, C16686k4.class, "checkoutWithGooglePay", "checkoutWithGooglePay()V", i15, 11);
                C2539i0 c2539i1 = new C2539i0(i16, c16686k4, C16686k4.class, "checkoutWithLink", "checkoutWithLink()V", i15, 12);
                boolean z17 = (c35459c1 != null ? c35459c1.f150996w : null) instanceof C38840g6;
                C33617b c33617b2 = EnumC35491s0.f151074G;
                if (c35459c1 == null || (interfaceC35322b = c35459c1.f150982Y) == null) {
                    interfaceC35322b = C35334h.f150537w;
                }
                if (c35459c1 == null || (interfaceC35320a = c35459c1.f150981X) == null) {
                    interfaceC35320a = C35330f.f150532w;
                }
                return C34377e.m108674p(bool2, str4, z16, enumC29806aM65693A, zBooleanValue6, list5, c33124c0, c2539i0, c2539i1, z17, c33617b2, null, false, interfaceC35322b, interfaceC35320a, 14336);
            case 7:
                return AbstractC28832c.m87695j((C28833d) this.f7749x, (InterfaceC3764o) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 8:
                return AbstractC31605e.m97626u0((C12991u0) this.f7749x, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 9:
                return AbstractC31605e.m97578T((AbstractC18533a) this.f7749x, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 10:
                C33342w c33342w = (C33342w) this.f7749x;
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue9 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue10 = ((Boolean) obj4).booleanValue();
                C33341v c33341v = c33342w.f139131w;
                C16689l1 c16689l3 = c33342w.f139105F;
                boolean z18 = false;
                if (!c33341v.f139084a) {
                    zBooleanValue8 = zBooleanValue7 && zBooleanValue8;
                }
                boolean z19 = (zBooleanValue9 || c16689l3.f64190x != EnumC16683k1.f64151y) && (zBooleanValue10 || c16689l3.f64192z != EnumC16677j1.f64133y);
                if (zBooleanValue8 && z19) {
                    z18 = true;
                }
                return Boolean.valueOf(z18);
            default:
                return AbstractC39566d.m126361w((Function1) this.f7749x, (InterfaceC3764o) obj, (C33836a) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }
}
