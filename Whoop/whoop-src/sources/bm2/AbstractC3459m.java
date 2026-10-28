package bm2;

import a01.C0086f;
import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.AbstractC21478l0;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p000.C26047n;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p163g1.C14972c3;
import p163g1.C15093n7;
import p163g1.InterfaceC15022g9;
import p180h0.EnumC16377d2;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p698au1.C2059d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bm2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\r*\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lbm2/n;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onDelete", "onClick", "Lg1/n7;", "Lbm2/t0;", "swipeableState", "", "testTag", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lbm2/n;Lc93/a;Lc93/a;Lg1/n7;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "", "swipeOffset", "Ly3/m;", "layoutDirection", "q", "(FLy3/m;)F", "r", "(Ly3/m;)F", "Landroidx/compose/ui/Modifier;", "modifier", "onViewEvent", "n", "(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3459m {
    /* JADX WARN: Code duplicated, block: B:100:0x022f  */
    /* JADX WARN: Code duplicated, block: B:102:0x023d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:106:0x0259  */
    /* JADX WARN: Code duplicated, block: B:109:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0265  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0 A[PHI: r4 r5
      0x00b0: PHI (r4v16 int) = (r4v11 int), (r4v8 int), (r4v18 int) binds: [B:64:0x00c2, B:58:0x00ac, B:59:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r5v28 g1.n7) = (r5v7 g1.n7), (r5v4 g1.n7), (r5v4 g1.n7) binds: [B:64:0x00c2, B:58:0x00ac, B:59:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Code duplicated, block: B:71:0x0178  */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x019f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01da  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:96:0x021e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0222  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m10140h(C3462n viewState, InterfaceC4339a onDelete, InterfaceC4339a onClick, C15093n7 c15093n7, String str, Composer composer, int i13, int i14) {
        int i15;
        C15093n7 c15093n8;
        String str2;
        boolean z4;
        C15093n7 c15093n9;
        String str3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Function1 function1;
        int i16;
        String str4;
        Object objM87133R;
        Object obj;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        boolean z13;
        Object objM87133R2;
        Object obj2;
        int i17;
        int iHashCode2;
        boolean z14;
        Object objM87133R3;
        int i18;
        int i19;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onDelete, "onDelete");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1901972223);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onDelete) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c15093n8 = c15093n7;
                if (c28655q2.m87153g(c15093n8)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i19;
            } else {
                c15093n8 = c15093n7;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i19;
        } else {
            c15093n8 = c15093n7;
        }
        int i24 = i14 & 16;
        if (i24 == 0) {
            if ((i13 & 24576) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                    function1 = null;
                    if ((i14 & 8) != 0) {
                        c15093n8 = new C15093n7(EnumC3475t0.NOT_EXPANDED, function1, 6);
                        i15 &= -7169;
                    }
                    if (i24 != 0) {
                        i16 = i15;
                        str4 = null;
                    }
                    c28655q2.m87175r();
                    float f13 = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                    float fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13);
                    EnumC39181m enumC39181m = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                    Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k(Float.valueOf(0.0f), EnumC3475t0.NOT_EXPANDED), new C23465k(Float.valueOf(fMo743q0 * m10150r(enumC39181m) * 0.2f), EnumC3475t0.EXPANDED));
                    float fM10149q = m10149q(((Number) c15093n8.f56512e.getValue()).floatValue(), enumC39181m);
                    EnumC22935a1 enumC22935a1 = EnumC22935a1.f90537w;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3424u = AbstractC1102d.m3424u(f13, AbstractC1099a.m3388j(c2314t, enumC22935a1));
                    EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                    objM87133R = c28655q2.m87133R();
                    obj = C28635l.f115821a;
                    if (objM87133R == obj) {
                        objM87133R = new C26047n(19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    C15093n7 c15093n10 = c15093n8;
                    Modifier modifierM60426c0 = AbstractC21478l0.m60426c0(modifierM3424u, c15093n10, mapM73990Y, false, false, (InterfaceC4351m) objM87133R, null, 440);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM60426c0);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    m10146n(AbstractC1102d.m3424u(AbstractC12889b.m36258X(fM10149q) * 0.3f, AbstractC1102d.m3406c(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F))), onDelete, c28655q2, i16 & 112, 0);
                    Modifier modifierM3424u2 = AbstractC1102d.m3424u(f13, c2314t);
                    z13 = (((i16 & 7168) ^ 3072) <= 2048 && c28655q2.m87153g(c15093n10)) || (i16 & 3072) == 2048;
                    objM87133R2 = c28655q2.m87133R();
                    if (z13) {
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                        if (objM87133R2 != obj2) {
                            i17 = 0;
                        }
                        Modifier modifierM3382d = AbstractC1099a.m3382d(modifierM3424u2, (Function1) objM87133R2);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, i17);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3382d);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                        long jM125370W0 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10();
                        if ((i16 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R3 = c28655q2.m87133R();
                        if (!z14 || objM87133R3 == obj2) {
                            i18 = 1;
                            objM87133R3 = new C3450j(onClick, i18);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            i18 = 1;
                        }
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), "GenericMeasurementTile#" + str4);
                        C37816b c37816bM121344e = AbstractC37817c.m121344e(-1265173049, c28655q2, new C3456l(viewState, 0));
                        boolean z15 = i18;
                        AbstractC31926e.m99375j(modifierM3599a, null, jM125370W0, null, null, null, 0.0f, c37816bM121344e, c28655q2, 12582912, 122);
                        C28655q c28655q3 = c28655q2;
                        c28655q3.m87173q(z15);
                        c28655q3.m87173q(z15);
                        str3 = str4;
                        c15093n9 = c15093n10;
                        c28655q = c28655q3;
                    }
                    i17 = 0;
                    objM87133R2 = new C3453k(c15093n10, i17);
                    c28655q2.m87172p0(objM87133R2);
                    Modifier modifierM3382d2 = AbstractC1099a.m3382d(modifierM3424u2, (Function1) objM87133R2);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, i17);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3382d2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                    long jM125370W1 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10();
                    if ((i16 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z14) {
                        i18 = 1;
                        objM87133R3 = new C3450j(onClick, i18);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        i18 = 1;
                        objM87133R3 = new C3450j(onClick, i18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), "GenericMeasurementTile#" + str4);
                    C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-1265173049, c28655q2, new C3456l(viewState, 0));
                    boolean z16 = i18;
                    AbstractC31926e.m99375j(modifierM3599a2, null, jM125370W1, null, null, null, 0.0f, c37816bM121344e2, c28655q2, 12582912, 122);
                    C28655q c28655q4 = c28655q2;
                    c28655q4.m87173q(z16);
                    c28655q4.m87173q(z16);
                    str3 = str4;
                    c15093n9 = c15093n10;
                    c28655q = c28655q4;
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                }
                i16 = i15;
                str4 = str2;
                c28655q2.m87175r();
                float f14 = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                float fMo743q1 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
                EnumC39181m enumC39181m2 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
                Map mapM73990Y2 = AbstractC25247g0.m73990Y(new C23465k(Float.valueOf(0.0f), EnumC3475t0.NOT_EXPANDED), new C23465k(Float.valueOf(fMo743q1 * m10150r(enumC39181m2) * 0.2f), EnumC3475t0.EXPANDED));
                float fM10149q2 = m10149q(((Number) c15093n8.f56512e.getValue()).floatValue(), enumC39181m2);
                EnumC22935a1 enumC22935a2 = EnumC22935a1.f90537w;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3424u3 = AbstractC1102d.m3424u(f14, AbstractC1099a.m3388j(c2314t2, enumC22935a2));
                EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
                objM87133R = c28655q2.m87133R();
                obj = C28635l.f115821a;
                if (objM87133R == obj) {
                    objM87133R = new C26047n(19);
                    c28655q2.m87172p0(objM87133R);
                }
                C15093n7 c15093n11 = c15093n8;
                Modifier modifierM60426c1 = AbstractC21478l0.m60426c0(modifierM3424u3, c15093n11, mapM73990Y2, false, false, (InterfaceC4351m) objM87133R, null, 440);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM60426c1);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
                m10146n(AbstractC1102d.m3424u(AbstractC12889b.m36258X(fM10149q2) * 0.3f, AbstractC1102d.m3406c(1.0f, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9103F))), onDelete, c28655q2, i16 & 112, 0);
                Modifier modifierM3424u4 = AbstractC1102d.m3424u(f14, c2314t2);
                if (((i16 & 7168) ^ 3072) <= 2048) {
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    obj2 = obj;
                    if (objM87133R2 != obj2) {
                        i17 = 0;
                    }
                    Modifier modifierM3382d3 = AbstractC1099a.m3382d(modifierM3424u4, (Function1) objM87133R2);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, i17);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3382d3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
                    long jM125370W2 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10();
                    if ((i16 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z14) {
                        i18 = 1;
                        objM87133R3 = new C3450j(onClick, i18);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        i18 = 1;
                        objM87133R3 = new C3450j(onClick, i18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R3, 15), "GenericMeasurementTile#" + str4);
                    C37816b c37816bM121344e3 = AbstractC37817c.m121344e(-1265173049, c28655q2, new C3456l(viewState, 0));
                    boolean z17 = i18;
                    AbstractC31926e.m99375j(modifierM3599a3, null, jM125370W2, null, null, null, 0.0f, c37816bM121344e3, c28655q2, 12582912, 122);
                    C28655q c28655q5 = c28655q2;
                    c28655q5.m87173q(z17);
                    c28655q5.m87173q(z17);
                    str3 = str4;
                    c15093n9 = c15093n11;
                    c28655q = c28655q5;
                } else {
                    obj2 = obj;
                }
                i17 = 0;
                objM87133R2 = new C3453k(c15093n11, i17);
                c28655q2.m87172p0(objM87133R2);
                Modifier modifierM3382d4 = AbstractC1099a.m3382d(modifierM3424u4, (Function1) objM87133R2);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, i17);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3382d4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
                long jM125370W3 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10();
                if ((i16 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z14) {
                    i18 = 1;
                    objM87133R3 = new C3450j(onClick, i18);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    i18 = 1;
                    objM87133R3 = new C3450j(onClick, i18);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R3, 15), "GenericMeasurementTile#" + str4);
                C37816b c37816bM121344e4 = AbstractC37817c.m121344e(-1265173049, c28655q2, new C3456l(viewState, 0));
                boolean z18 = i18;
                AbstractC31926e.m99375j(modifierM3599a4, null, jM125370W3, null, null, null, 0.0f, c37816bM121344e4, c28655q2, 12582912, 122);
                C28655q c28655q6 = c28655q2;
                c28655q6.m87173q(z18);
                c28655q6.m87173q(z18);
                str3 = str4;
                c15093n9 = c15093n11;
                c28655q = c28655q6;
            } else {
                C28655q c28655q7 = c28655q2;
                c28655q7.m87138X();
                c15093n9 = c15093n8;
                str3 = str2;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(viewState, onDelete, onClick, c15093n9, str3, i13, i14);
            }
        }
        i15 |= 24576;
        str2 = str;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                function1 = null;
                if ((i14 & 8) != 0) {
                    c15093n8 = new C15093n7(EnumC3475t0.NOT_EXPANDED, function1, 6);
                    i15 &= -7169;
                }
                if (i24 != 0) {
                    i16 = i15;
                    str4 = null;
                } else {
                    i16 = i15;
                    str4 = str2;
                }
            } else {
                function1 = null;
                if ((i14 & 8) != 0) {
                    c15093n8 = new C15093n7(EnumC3475t0.NOT_EXPANDED, function1, 6);
                    i15 &= -7169;
                }
                if (i24 != 0) {
                    i16 = i15;
                    str4 = null;
                } else {
                    i16 = i15;
                    str4 = str2;
                }
            }
            c28655q2.m87175r();
            float f15 = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
            float fMo743q2 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(f15);
            EnumC39181m enumC39181m3 = (EnumC39181m) c28655q2.m87161k(AbstractC2453v1.f9575n);
            Map mapM73990Y3 = AbstractC25247g0.m73990Y(new C23465k(Float.valueOf(0.0f), EnumC3475t0.NOT_EXPANDED), new C23465k(Float.valueOf(fMo743q2 * m10150r(enumC39181m3) * 0.2f), EnumC3475t0.EXPANDED));
            float fM10149q3 = m10149q(((Number) c15093n8.f56512e.getValue()).floatValue(), enumC39181m3);
            EnumC22935a1 enumC22935a3 = EnumC22935a1.f90537w;
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3424u5 = AbstractC1102d.m3424u(f15, AbstractC1099a.m3388j(c2314t3, enumC22935a3));
            EnumC16377d2 enumC16377d4 = EnumC16377d2.f62971w;
            objM87133R = c28655q2.m87133R();
            obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = new C26047n(19);
                c28655q2.m87172p0(objM87133R);
            }
            C15093n7 c15093n12 = c15093n8;
            Modifier modifierM60426c2 = AbstractC21478l0.m60426c0(modifierM3424u5, c15093n12, mapM73990Y3, false, false, (InterfaceC4351m) objM87133R, null, 440);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM60426c2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i8 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC39127r0M66763d3);
            C0209i c0209i9 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N7);
            m10146n(AbstractC1102d.m3424u(AbstractC12889b.m36258X(fM10149q3) * 0.3f, AbstractC1102d.m3406c(1.0f, C1100b.f4583a.mo3400a(c2314t3, C2299e.f9103F))), onDelete, c28655q2, i16 & 112, 0);
            Modifier modifierM3424u6 = AbstractC1102d.m3424u(f15, c2314t3);
            if (((i16 & 7168) ^ 3072) <= 2048) {
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                obj2 = obj;
                if (objM87133R2 != obj2) {
                    i17 = 0;
                }
                Modifier modifierM3382d5 = AbstractC1099a.m3382d(modifierM3424u6, (Function1) objM87133R2);
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, i17);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3382d5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, c22994r1M66759a5);
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m8);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N8);
                long jM125370W4 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10();
                if ((i16 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z14) {
                    i18 = 1;
                    objM87133R3 = new C3450j(onClick, i18);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    i18 = 1;
                    objM87133R3 = new C3450j(onClick, i18);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) objM87133R3, 15), "GenericMeasurementTile#" + str4);
                C37816b c37816bM121344e5 = AbstractC37817c.m121344e(-1265173049, c28655q2, new C3456l(viewState, 0));
                boolean z19 = i18;
                AbstractC31926e.m99375j(modifierM3599a5, null, jM125370W4, null, null, null, 0.0f, c37816bM121344e5, c28655q2, 12582912, 122);
                C28655q c28655q8 = c28655q2;
                c28655q8.m87173q(z19);
                c28655q8.m87173q(z19);
                str3 = str4;
                c15093n9 = c15093n12;
                c28655q = c28655q8;
            } else {
                obj2 = obj;
            }
            i17 = 0;
            objM87133R2 = new C3453k(c15093n12, i17);
            c28655q2.m87172p0(objM87133R2);
            Modifier modifierM3382d6 = AbstractC1099a.m3382d(modifierM3424u6, (Function1) objM87133R2);
            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, i17);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3382d6);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i8, c22994r1M66759a6);
            AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m9);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N9);
            long jM125370W5 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10();
            if ((i16 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R3 = c28655q2.m87133R();
            if (z14) {
                i18 = 1;
                objM87133R3 = new C3450j(onClick, i18);
                c28655q2.m87172p0(objM87133R3);
            } else {
                i18 = 1;
                objM87133R3 = new C3450j(onClick, i18);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) objM87133R3, 15), "GenericMeasurementTile#" + str4);
            C37816b c37816bM121344e6 = AbstractC37817c.m121344e(-1265173049, c28655q2, new C3456l(viewState, 0));
            boolean z110 = i18;
            AbstractC31926e.m99375j(modifierM3599a6, null, jM125370W5, null, null, null, 0.0f, c37816bM121344e6, c28655q2, 12582912, 122);
            C28655q c28655q9 = c28655q2;
            c28655q9.m87173q(z110);
            c28655q9.m87173q(z110);
            str3 = str4;
            c15093n9 = c15093n12;
            c28655q = c28655q9;
        } else {
            C28655q c28655q10 = c28655q2;
            c28655q10.m87138X();
            c15093n9 = c15093n8;
            str3 = str2;
            c28655q = c28655q10;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(viewState, onDelete, onClick, c15093n9, str3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC15022g9 m10141i(EnumC3475t0 enumC3475t0, EnumC3475t0 enumC3475t1) {
        AbstractC22676k.m65750j(enumC3475t0, "<unused var>");
        AbstractC22676k.m65750j(enumC3475t1, "<unused var>");
        return new C14972c3(0.2f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C39178j m10142j(C15093n7 c15093n7, InterfaceC39171c absoluteOffset) {
        AbstractC22676k.m65750j(absoluteOffset, "$this$absoluteOffset");
        return new C39178j((((long) AbstractC12889b.m36258X(((Number) c15093n7.f56512e.getValue()).floatValue())) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m10143k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m10144l(C3462n c3462n, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(2 * 8, c2314t));
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c3462n.getIconSource().toWhoopIcon(), c28655q, 6), null, modifierM3419p, c38072d.m121949b(c28655q, i14).getWhite50(), c28655q, 432, 0);
            AbstractC18489d0.m53380u(3, f13, c2314t, c28655q);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            TextResource textResourceM10156b = c3462n.getMeasurementValue();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM10156b, c28655q, i15);
            C2886a c2886aM8406D = c38072d.m121952e(c28655q, i14).getN7();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8406D, null, c28655q, 0, i16, 196602);
            float f14 = f13 * ((float) 0.5d);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3462n.getMetricUnit(), c28655q, i15), null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB3(), null, c28655q, 0, i16, 196602);
            AbstractC17176i.m48516r(c28655q, true, c2314t, f14, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3462n.getSubtitle(), c28655q, i15), null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB3(), null, c28655q, 0, i16, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m10145m(C3462n c3462n, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C15093n7 c15093n7, String str, int i13, int i14, Composer composer, int i15) {
        m10140h(c3462n, interfaceC4339a, interfaceC4339a2, c15093n7, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m10146n(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1154901618);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            Modifier modifierM95629e = AbstractC31061c.m95629e(modifier4, 1, 4, EnumC39333f.BRAND_PRIMARY.mo134584toComposableColorWaAFU9c(c28655q, 6));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM95629e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C27270o c27270o = new C27270o(AbstractC27274q.b.f109138f, C38072d.f163053a.m121951d().getAction().getDelete(), EnumC39333f.BRAND_WHITE, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62322f);
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3450j(interfaceC4339a, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k, 12);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2059d(modifier3, interfaceC4339a, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m10147o(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m10148p(Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m10146n(modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final float m10149q(float f13, EnumC39181m layoutDirection) {
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        float fM10150r = f13 * m10150r(layoutDirection);
        if (fM10150r < 0.0f) {
            return 0.0f;
        }
        return fM10150r;
    }

    /* JADX INFO: renamed from: r */
    private static final float m10150r(EnumC39181m enumC39181m) {
        return enumC39181m == EnumC39181m.f168424x ? 1.0f : -1.0f;
    }
}
