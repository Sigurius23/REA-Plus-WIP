package i51;

import android.graphics.PointF;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2609r;
import c93.InterfaceC4339a;
import gb1.AbstractC15675c0;
import i21.C18008r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15079m3;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p426qi.InterfaceC30372a0;
import p490t0.AbstractC33253j;
import p524ui.C34970a0;
import p584wi.C37305e;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.AbstractC35687q0;
import v41.EnumC35690s;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i51.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Li51/s;", "model", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lv41/s;", "Ll83/a0;", "onLoadingChanged", "Lkotlin/Function0;", "animationHasCompleted", "d", "(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Li51/a;", "Li51/u;", "j", "(Li51/a;)Li51/u;", "loadingState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18121r {

    /* JADX INFO: renamed from: i51.r$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70391a;

        static {
            int[] iArr = new int[EnumC18104a.values().length];
            try {
                iArr[EnumC18104a.LOOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18104a.PLAY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18104a.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70391a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:104:0x0221  */
    /* JADX WARN: Code duplicated, block: B:107:0x024b  */
    /* JADX WARN: Code duplicated, block: B:109:0x025d  */
    /* JADX WARN: Code duplicated, block: B:112:0x026a  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec A[LOOP:0: B:70:0x00e6->B:72:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x0182  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    /* JADX WARN: Code duplicated, block: B:87:0x0199  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6  */
    /* JADX INFO: renamed from: d */
    public static final void m52029d(C18122s model, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        int i17;
        InterfaceC4339a interfaceC4339a2;
        int i18;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean zM87153g;
        Object objM87133R;
        Map map;
        boolean zM87153g2;
        ArrayList arrayList;
        Object obj;
        boolean zM87149e;
        Object objM87133R2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Map map2;
        boolean z13;
        Object objM87133R4;
        C28655q c28655q2;
        boolean z14;
        Object objM87133R5;
        AbstractC22676k.m65750j(model, "model");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1445539025);
        int i19 = (i13 & 6) == 0 ? (c28655q3.m87157i(model) ? 4 : 2) | i13 : i13;
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i19 |= c28655q3.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q3.m87157i(function2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i19 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q3.m87157i(interfaceC4339a2)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i19 |= i18;
                    }
                    if ((i19 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i19 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i17 != 0) {
                            objM87133R5 = c28655q3.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C18008r(11);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        zM87153g = c28655q3.m87153g(model.m52041g());
                        objM87133R = c28655q3.m87133R();
                        if (zM87153g || objM87133R == c28676v0) {
                            objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                            c28655q3.m87172p0(objM87133R);
                        }
                        map = (Map) objM87133R;
                        zM87153g2 = c28655q3.m87153g(map);
                        Object objM87133R6 = c28655q3.m87133R();
                        obj = objM87133R6;
                        if (zM87153g2 || objM87133R6 == c28676v0) {
                            arrayList = new ArrayList(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                String str = (String) entry.getKey();
                                int iIntValue = ((Number) entry.getValue()).intValue();
                                PointF pointF = InterfaceC30372a0.f124620a;
                                arrayList.add(new C34970a0(3, new C37305e("**", str), Integer.valueOf(iIntValue)));
                            }
                            c28655q3.m87172p0(arrayList);
                            obj = arrayList;
                        }
                        List list = (List) obj;
                        zM87149e = c28655q3.m87149e(model.getAnimationMode().ordinal());
                        objM87133R2 = c28655q3.m87133R();
                        if (zM87149e || objM87133R2 == c28676v0) {
                            objM87133R2 = m52035j(model.getAnimationMode());
                            c28655q3.m87172p0(objM87133R2);
                        }
                        C18124u c18124u = (C18124u) objM87133R2;
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifier2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                        InterfaceC35689r0 interfaceC35689r0M52038c = model.getLottieSource();
                        if (model.getAnimationMode() == EnumC18104a.OFF) {
                            map2 = map;
                        } else {
                            map2 = null;
                        }
                        String strM52039e = model.getOverlayUrl();
                        List<String> listM52037b = model.m52037b();
                        int iM52047a = c18124u.getIterations();
                        boolean zM52049c = c18124u.getIsPlaying();
                        Float fM52048b = c18124u.getProgressOverride();
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                        int i25 = i19;
                        if ((i19 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z13 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function3 = function4;
                        AbstractC35687q0.m113102l(modifierM3407d, interfaceC35689r0M52038c, list, map2, strM52039e, listM52037b, iM52047a, zM52049c, fM52048b, null, (Function1) objM87133R4, interfaceC4339a4, c28655q3, 6, (i25 >> 6) & 112, 512);
                        c28655q2 = c28655q3;
                        if (m52031f(interfaceC28601c1) == EnumC35690s.READY && model.getShowLoadingShimmer()) {
                            c28655q2.m87150e0(-1722380128);
                            z14 = true;
                            AbstractC22989q.m66760a(AbstractC1136a.m3599a(AbstractC15675c0.m44094d(AbstractC37056f.m118994r(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC33253j.f138651a), false, 1, null), "lottie_loading_shimmer"), c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            z14 = true;
                            c28655q2.m87150e0(-1722154293);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z14);
                        modifier3 = modifier2;
                        interfaceC4339a3 = interfaceC4339a4;
                        c28655q = c28655q2;
                    } else {
                        C28655q c28655q4 = c28655q3;
                        c28655q4.m87138X();
                        modifier3 = modifier2;
                        function3 = function2;
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q = c28655q4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C15079m3(model, modifier3, function3, interfaceC4339a3, i13, i14, 12);
                    }
                }
                i19 |= 3072;
                interfaceC4339a2 = interfaceC4339a;
                if ((i19 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i19 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C18008r(11);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    zM87153g = c28655q3.m87153g(model.m52041g());
                    objM87133R = c28655q3.m87133R();
                    if (zM87153g) {
                        objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                        c28655q3.m87172p0(objM87133R);
                    }
                    map = (Map) objM87133R;
                    zM87153g2 = c28655q3.m87153g(map);
                    Object objM87133R7 = c28655q3.m87133R();
                    obj = objM87133R7;
                    if (zM87153g2) {
                        arrayList = new ArrayList(map.size());
                        while (r9.hasNext()) {
                            String str2 = (String) entry.getKey();
                            int iIntValue2 = ((Number) entry.getValue()).intValue();
                            PointF pointF2 = InterfaceC30372a0.f124620a;
                            arrayList.add(new C34970a0(3, new C37305e("**", str2), Integer.valueOf(iIntValue2)));
                        }
                        c28655q3.m87172p0(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList(map.size());
                        while (r9.hasNext()) {
                            String str3 = (String) entry.getKey();
                            int iIntValue3 = ((Number) entry.getValue()).intValue();
                            PointF pointF3 = InterfaceC30372a0.f124620a;
                            arrayList.add(new C34970a0(3, new C37305e("**", str3), Integer.valueOf(iIntValue3)));
                        }
                        c28655q3.m87172p0(arrayList);
                        obj = arrayList;
                    }
                    List list2 = (List) obj;
                    zM87149e = c28655q3.m87149e(model.getAnimationMode().ordinal());
                    objM87133R2 = c28655q3.m87133R();
                    if (zM87149e) {
                        objM87133R2 = m52035j(model.getAnimationMode());
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = m52035j(model.getAnimationMode());
                        c28655q3.m87172p0(objM87133R2);
                    }
                    C18124u c18124u2 = (C18124u) objM87133R2;
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
                    InterfaceC35689r0 interfaceC35689r0M52038c2 = model.getLottieSource();
                    if (model.getAnimationMode() == EnumC18104a.OFF) {
                        map2 = map;
                    } else {
                        map2 = null;
                    }
                    String strM52039e2 = model.getOverlayUrl();
                    List<String> listM52037b2 = model.m52037b();
                    int iM52047a2 = c18124u2.getIterations();
                    boolean zM52049c2 = c18124u2.getIsPlaying();
                    Float fM52048b2 = c18124u2.getProgressOverride();
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                    int i26 = i19;
                    if ((i19 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function3 = function4;
                    AbstractC35687q0.m113102l(modifierM3407d2, interfaceC35689r0M52038c2, list2, map2, strM52039e2, listM52037b2, iM52047a2, zM52049c2, fM52048b2, null, (Function1) objM87133R4, interfaceC4339a4, c28655q3, 6, (i26 >> 6) & 112, 512);
                    c28655q2 = c28655q3;
                    if (m52031f(interfaceC28601c1) == EnumC35690s.READY) {
                        z14 = true;
                        c28655q2.m87150e0(-1722154293);
                        c28655q2.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q2.m87150e0(-1722154293);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a4;
                    c28655q = c28655q2;
                } else {
                    C28655q c28655q5 = c28655q3;
                    c28655q5.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15079m3(model, modifier3, function3, interfaceC4339a3, i13, i14, 12);
                }
            }
            i19 |= 384;
            function2 = function1;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q3.m87157i(interfaceC4339a2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i19 |= i18;
                }
                if ((i19 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i19 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C18008r(11);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    zM87153g = c28655q3.m87153g(model.m52041g());
                    objM87133R = c28655q3.m87133R();
                    if (zM87153g) {
                        objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                        c28655q3.m87172p0(objM87133R);
                    }
                    map = (Map) objM87133R;
                    zM87153g2 = c28655q3.m87153g(map);
                    Object objM87133R8 = c28655q3.m87133R();
                    obj = objM87133R8;
                    if (zM87153g2) {
                        arrayList = new ArrayList(map.size());
                        while (r9.hasNext()) {
                            String str4 = (String) entry.getKey();
                            int iIntValue4 = ((Number) entry.getValue()).intValue();
                            PointF pointF4 = InterfaceC30372a0.f124620a;
                            arrayList.add(new C34970a0(3, new C37305e("**", str4), Integer.valueOf(iIntValue4)));
                        }
                        c28655q3.m87172p0(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList(map.size());
                        while (r9.hasNext()) {
                            String str5 = (String) entry.getKey();
                            int iIntValue5 = ((Number) entry.getValue()).intValue();
                            PointF pointF5 = InterfaceC30372a0.f124620a;
                            arrayList.add(new C34970a0(3, new C37305e("**", str5), Integer.valueOf(iIntValue5)));
                        }
                        c28655q3.m87172p0(arrayList);
                        obj = arrayList;
                    }
                    List list3 = (List) obj;
                    zM87149e = c28655q3.m87149e(model.getAnimationMode().ordinal());
                    objM87133R2 = c28655q3.m87133R();
                    if (zM87149e) {
                        objM87133R2 = m52035j(model.getAnimationMode());
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = m52035j(model.getAnimationMode());
                        c28655q3.m87172p0(objM87133R2);
                    }
                    C18124u c18124u3 = (C18124u) objM87133R2;
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
                    InterfaceC35689r0 interfaceC35689r0M52038c3 = model.getLottieSource();
                    if (model.getAnimationMode() == EnumC18104a.OFF) {
                        map2 = map;
                    } else {
                        map2 = null;
                    }
                    String strM52039e3 = model.getOverlayUrl();
                    List<String> listM52037b3 = model.m52037b();
                    int iM52047a3 = c18124u3.getIterations();
                    boolean zM52049c3 = c18124u3.getIsPlaying();
                    Float fM52048b3 = c18124u3.getProgressOverride();
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                    int i27 = i19;
                    if ((i19 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function3 = function4;
                    AbstractC35687q0.m113102l(modifierM3407d3, interfaceC35689r0M52038c3, list3, map2, strM52039e3, listM52037b3, iM52047a3, zM52049c3, fM52048b3, null, (Function1) objM87133R4, interfaceC4339a4, c28655q3, 6, (i27 >> 6) & 112, 512);
                    c28655q2 = c28655q3;
                    if (m52031f(interfaceC28601c1) == EnumC35690s.READY) {
                        z14 = true;
                        c28655q2.m87150e0(-1722154293);
                        c28655q2.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q2.m87150e0(-1722154293);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a4;
                    c28655q = c28655q2;
                } else {
                    C28655q c28655q6 = c28655q3;
                    c28655q6.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15079m3(model, modifier3, function3, interfaceC4339a3, i13, i14, 12);
                }
            }
            i19 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i19 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i19 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i15 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C18008r(11);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                zM87153g = c28655q3.m87153g(model.m52041g());
                objM87133R = c28655q3.m87133R();
                if (zM87153g) {
                    objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                    c28655q3.m87172p0(objM87133R);
                }
                map = (Map) objM87133R;
                zM87153g2 = c28655q3.m87153g(map);
                Object objM87133R9 = c28655q3.m87133R();
                obj = objM87133R9;
                if (zM87153g2) {
                    arrayList = new ArrayList(map.size());
                    while (r9.hasNext()) {
                        String str6 = (String) entry.getKey();
                        int iIntValue6 = ((Number) entry.getValue()).intValue();
                        PointF pointF6 = InterfaceC30372a0.f124620a;
                        arrayList.add(new C34970a0(3, new C37305e("**", str6), Integer.valueOf(iIntValue6)));
                    }
                    c28655q3.m87172p0(arrayList);
                    obj = arrayList;
                } else {
                    arrayList = new ArrayList(map.size());
                    while (r9.hasNext()) {
                        String str7 = (String) entry.getKey();
                        int iIntValue7 = ((Number) entry.getValue()).intValue();
                        PointF pointF7 = InterfaceC30372a0.f124620a;
                        arrayList.add(new C34970a0(3, new C37305e("**", str7), Integer.valueOf(iIntValue7)));
                    }
                    c28655q3.m87172p0(arrayList);
                    obj = arrayList;
                }
                List list4 = (List) obj;
                zM87149e = c28655q3.m87149e(model.getAnimationMode().ordinal());
                objM87133R2 = c28655q3.m87133R();
                if (zM87149e) {
                    objM87133R2 = m52035j(model.getAnimationMode());
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = m52035j(model.getAnimationMode());
                    c28655q3.m87172p0(objM87133R2);
                }
                C18124u c18124u4 = (C18124u) objM87133R2;
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N4);
                InterfaceC35689r0 interfaceC35689r0M52038c4 = model.getLottieSource();
                if (model.getAnimationMode() == EnumC18104a.OFF) {
                    map2 = map;
                } else {
                    map2 = null;
                }
                String strM52039e4 = model.getOverlayUrl();
                List<String> listM52037b4 = model.m52037b();
                int iM52047a4 = c18124u4.getIterations();
                boolean zM52049c4 = c18124u4.getIsPlaying();
                Float fM52048b4 = c18124u4.getProgressOverride();
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
                int i28 = i19;
                if ((i19 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z13) {
                    objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                    c28655q3.m87172p0(objM87133R4);
                }
                function3 = function4;
                AbstractC35687q0.m113102l(modifierM3407d4, interfaceC35689r0M52038c4, list4, map2, strM52039e4, listM52037b4, iM52047a4, zM52049c4, fM52048b4, null, (Function1) objM87133R4, interfaceC4339a4, c28655q3, 6, (i28 >> 6) & 112, 512);
                c28655q2 = c28655q3;
                if (m52031f(interfaceC28601c1) == EnumC35690s.READY) {
                    z14 = true;
                    c28655q2.m87150e0(-1722154293);
                    c28655q2.m87173q(false);
                } else {
                    z14 = true;
                    c28655q2.m87150e0(-1722154293);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a4;
                c28655q = c28655q2;
            } else {
                C28655q c28655q7 = c28655q3;
                c28655q7.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(model, modifier3, function3, interfaceC4339a3, i13, i14, 12);
            }
        }
        i19 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q3.m87157i(function2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i19 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q3.m87157i(interfaceC4339a2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i19 |= i18;
                }
                if ((i19 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i19 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C18008r(11);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    zM87153g = c28655q3.m87153g(model.m52041g());
                    objM87133R = c28655q3.m87133R();
                    if (zM87153g) {
                        objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                        c28655q3.m87172p0(objM87133R);
                    }
                    map = (Map) objM87133R;
                    zM87153g2 = c28655q3.m87153g(map);
                    Object objM87133R10 = c28655q3.m87133R();
                    obj = objM87133R10;
                    if (zM87153g2) {
                        arrayList = new ArrayList(map.size());
                        while (r9.hasNext()) {
                            String str8 = (String) entry.getKey();
                            int iIntValue8 = ((Number) entry.getValue()).intValue();
                            PointF pointF8 = InterfaceC30372a0.f124620a;
                            arrayList.add(new C34970a0(3, new C37305e("**", str8), Integer.valueOf(iIntValue8)));
                        }
                        c28655q3.m87172p0(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList(map.size());
                        while (r9.hasNext()) {
                            String str9 = (String) entry.getKey();
                            int iIntValue9 = ((Number) entry.getValue()).intValue();
                            PointF pointF9 = InterfaceC30372a0.f124620a;
                            arrayList.add(new C34970a0(3, new C37305e("**", str9), Integer.valueOf(iIntValue9)));
                        }
                        c28655q3.m87172p0(arrayList);
                        obj = arrayList;
                    }
                    List list5 = (List) obj;
                    zM87149e = c28655q3.m87149e(model.getAnimationMode().ordinal());
                    objM87133R2 = c28655q3.m87133R();
                    if (zM87149e) {
                        objM87133R2 = m52035j(model.getAnimationMode());
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = m52035j(model.getAnimationMode());
                        c28655q3.m87172p0(objM87133R2);
                    }
                    C18124u c18124u5 = (C18124u) objM87133R2;
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N5);
                    InterfaceC35689r0 interfaceC35689r0M52038c5 = model.getLottieSource();
                    if (model.getAnimationMode() == EnumC18104a.OFF) {
                        map2 = map;
                    } else {
                        map2 = null;
                    }
                    String strM52039e5 = model.getOverlayUrl();
                    List<String> listM52037b5 = model.m52037b();
                    int iM52047a5 = c18124u5.getIterations();
                    boolean zM52049c5 = c18124u5.getIsPlaying();
                    Float fM52048b5 = c18124u5.getProgressOverride();
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                    int i29 = i19;
                    if ((i19 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function3 = function4;
                    AbstractC35687q0.m113102l(modifierM3407d5, interfaceC35689r0M52038c5, list5, map2, strM52039e5, listM52037b5, iM52047a5, zM52049c5, fM52048b5, null, (Function1) objM87133R4, interfaceC4339a4, c28655q3, 6, (i29 >> 6) & 112, 512);
                    c28655q2 = c28655q3;
                    if (m52031f(interfaceC28601c1) == EnumC35690s.READY) {
                        z14 = true;
                        c28655q2.m87150e0(-1722154293);
                        c28655q2.m87173q(false);
                    } else {
                        z14 = true;
                        c28655q2.m87150e0(-1722154293);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z14);
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a4;
                    c28655q = c28655q2;
                } else {
                    C28655q c28655q8 = c28655q3;
                    c28655q8.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q8;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15079m3(model, modifier3, function3, interfaceC4339a3, i13, i14, 12);
                }
            }
            i19 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i19 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i19 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i15 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C18008r(11);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                zM87153g = c28655q3.m87153g(model.m52041g());
                objM87133R = c28655q3.m87133R();
                if (zM87153g) {
                    objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                    c28655q3.m87172p0(objM87133R);
                }
                map = (Map) objM87133R;
                zM87153g2 = c28655q3.m87153g(map);
                Object objM87133R11 = c28655q3.m87133R();
                obj = objM87133R11;
                if (zM87153g2) {
                    arrayList = new ArrayList(map.size());
                    while (r9.hasNext()) {
                        String str10 = (String) entry.getKey();
                        int iIntValue10 = ((Number) entry.getValue()).intValue();
                        PointF pointF10 = InterfaceC30372a0.f124620a;
                        arrayList.add(new C34970a0(3, new C37305e("**", str10), Integer.valueOf(iIntValue10)));
                    }
                    c28655q3.m87172p0(arrayList);
                    obj = arrayList;
                } else {
                    arrayList = new ArrayList(map.size());
                    while (r9.hasNext()) {
                        String str11 = (String) entry.getKey();
                        int iIntValue11 = ((Number) entry.getValue()).intValue();
                        PointF pointF11 = InterfaceC30372a0.f124620a;
                        arrayList.add(new C34970a0(3, new C37305e("**", str11), Integer.valueOf(iIntValue11)));
                    }
                    c28655q3.m87172p0(arrayList);
                    obj = arrayList;
                }
                List list6 = (List) obj;
                zM87149e = c28655q3.m87149e(model.getAnimationMode().ordinal());
                objM87133R2 = c28655q3.m87133R();
                if (zM87149e) {
                    objM87133R2 = m52035j(model.getAnimationMode());
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = m52035j(model.getAnimationMode());
                    c28655q3.m87172p0(objM87133R2);
                }
                C18124u c18124u6 = (C18124u) objM87133R2;
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N6);
                InterfaceC35689r0 interfaceC35689r0M52038c6 = model.getLottieSource();
                if (model.getAnimationMode() == EnumC18104a.OFF) {
                    map2 = map;
                } else {
                    map2 = null;
                }
                String strM52039e6 = model.getOverlayUrl();
                List<String> listM52037b6 = model.m52037b();
                int iM52047a6 = c18124u6.getIterations();
                boolean zM52049c6 = c18124u6.getIsPlaying();
                Float fM52048b6 = c18124u6.getProgressOverride();
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t);
                int i210 = i19;
                if ((i19 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z13) {
                    objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                    c28655q3.m87172p0(objM87133R4);
                }
                function3 = function4;
                AbstractC35687q0.m113102l(modifierM3407d6, interfaceC35689r0M52038c6, list6, map2, strM52039e6, listM52037b6, iM52047a6, zM52049c6, fM52048b6, null, (Function1) objM87133R4, interfaceC4339a4, c28655q3, 6, (i210 >> 6) & 112, 512);
                c28655q2 = c28655q3;
                if (m52031f(interfaceC28601c1) == EnumC35690s.READY) {
                    z14 = true;
                    c28655q2.m87150e0(-1722154293);
                    c28655q2.m87173q(false);
                } else {
                    z14 = true;
                    c28655q2.m87150e0(-1722154293);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a4;
                c28655q = c28655q2;
            } else {
                C28655q c28655q9 = c28655q3;
                c28655q9.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q9;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(model, modifier3, function3, interfaceC4339a3, i13, i14, 12);
            }
        }
        i19 |= 384;
        function2 = function1;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q3.m87157i(interfaceC4339a2)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i19 |= i18;
            }
            if ((i19 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i19 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i15 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C18008r(11);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                zM87153g = c28655q3.m87153g(model.m52041g());
                objM87133R = c28655q3.m87133R();
                if (zM87153g) {
                    objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                    c28655q3.m87172p0(objM87133R);
                }
                map = (Map) objM87133R;
                zM87153g2 = c28655q3.m87153g(map);
                Object objM87133R12 = c28655q3.m87133R();
                obj = objM87133R12;
                if (zM87153g2) {
                    arrayList = new ArrayList(map.size());
                    while (r9.hasNext()) {
                        String str12 = (String) entry.getKey();
                        int iIntValue12 = ((Number) entry.getValue()).intValue();
                        PointF pointF12 = InterfaceC30372a0.f124620a;
                        arrayList.add(new C34970a0(3, new C37305e("**", str12), Integer.valueOf(iIntValue12)));
                    }
                    c28655q3.m87172p0(arrayList);
                    obj = arrayList;
                } else {
                    arrayList = new ArrayList(map.size());
                    while (r9.hasNext()) {
                        String str13 = (String) entry.getKey();
                        int iIntValue13 = ((Number) entry.getValue()).intValue();
                        PointF pointF13 = InterfaceC30372a0.f124620a;
                        arrayList.add(new C34970a0(3, new C37305e("**", str13), Integer.valueOf(iIntValue13)));
                    }
                    c28655q3.m87172p0(arrayList);
                    obj = arrayList;
                }
                List list7 = (List) obj;
                zM87149e = c28655q3.m87149e(model.getAnimationMode().ordinal());
                objM87133R2 = c28655q3.m87133R();
                if (zM87149e) {
                    objM87133R2 = m52035j(model.getAnimationMode());
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = m52035j(model.getAnimationMode());
                    c28655q3.m87172p0(objM87133R2);
                }
                C18124u c18124u7 = (C18124u) objM87133R2;
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N7);
                InterfaceC35689r0 interfaceC35689r0M52038c7 = model.getLottieSource();
                if (model.getAnimationMode() == EnumC18104a.OFF) {
                    map2 = map;
                } else {
                    map2 = null;
                }
                String strM52039e7 = model.getOverlayUrl();
                List<String> listM52037b7 = model.m52037b();
                int iM52047a7 = c18124u7.getIterations();
                boolean zM52049c7 = c18124u7.getIsPlaying();
                Float fM52048b7 = c18124u7.getProgressOverride();
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t);
                int i211 = i19;
                if ((i19 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z13) {
                    objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                    c28655q3.m87172p0(objM87133R4);
                }
                function3 = function4;
                AbstractC35687q0.m113102l(modifierM3407d7, interfaceC35689r0M52038c7, list7, map2, strM52039e7, listM52037b7, iM52047a7, zM52049c7, fM52048b7, null, (Function1) objM87133R4, interfaceC4339a4, c28655q3, 6, (i211 >> 6) & 112, 512);
                c28655q2 = c28655q3;
                if (m52031f(interfaceC28601c1) == EnumC35690s.READY) {
                    z14 = true;
                    c28655q2.m87150e0(-1722154293);
                    c28655q2.m87173q(false);
                } else {
                    z14 = true;
                    c28655q2.m87150e0(-1722154293);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a4;
                c28655q = c28655q2;
            } else {
                C28655q c28655q10 = c28655q3;
                c28655q10.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q10;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(model, modifier3, function3, interfaceC4339a3, i13, i14, 12);
            }
        }
        i19 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i19 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i19 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            if (i15 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C18008r(11);
                    c28655q3.m87172p0(objM87133R5);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            zM87153g = c28655q3.m87153g(model.m52041g());
            objM87133R = c28655q3.m87133R();
            if (zM87153g) {
                objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = C18127x.f70420a.m52072a(model.m52041g());
                c28655q3.m87172p0(objM87133R);
            }
            map = (Map) objM87133R;
            zM87153g2 = c28655q3.m87153g(map);
            Object objM87133R13 = c28655q3.m87133R();
            obj = objM87133R13;
            if (zM87153g2) {
                arrayList = new ArrayList(map.size());
                while (r9.hasNext()) {
                    String str14 = (String) entry.getKey();
                    int iIntValue14 = ((Number) entry.getValue()).intValue();
                    PointF pointF14 = InterfaceC30372a0.f124620a;
                    arrayList.add(new C34970a0(3, new C37305e("**", str14), Integer.valueOf(iIntValue14)));
                }
                c28655q3.m87172p0(arrayList);
                obj = arrayList;
            } else {
                arrayList = new ArrayList(map.size());
                while (r9.hasNext()) {
                    String str15 = (String) entry.getKey();
                    int iIntValue15 = ((Number) entry.getValue()).intValue();
                    PointF pointF15 = InterfaceC30372a0.f124620a;
                    arrayList.add(new C34970a0(3, new C37305e("**", str15), Integer.valueOf(iIntValue15)));
                }
                c28655q3.m87172p0(arrayList);
                obj = arrayList;
            }
            List list8 = (List) obj;
            zM87149e = c28655q3.m87149e(model.getAnimationMode().ordinal());
            objM87133R2 = c28655q3.m87133R();
            if (zM87149e) {
                objM87133R2 = m52035j(model.getAnimationMode());
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = m52035j(model.getAnimationMode());
                c28655q3.m87172p0(objM87133R2);
            }
            C18124u c18124u8 = (C18124u) objM87133R2;
            objM87133R3 = c28655q3.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(EnumC35690s.LOADING);
                c28655q3.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N8);
            InterfaceC35689r0 interfaceC35689r0M52038c8 = model.getLottieSource();
            if (model.getAnimationMode() == EnumC18104a.OFF) {
                map2 = map;
            } else {
                map2 = null;
            }
            String strM52039e8 = model.getOverlayUrl();
            List<String> listM52037b8 = model.m52037b();
            int iM52047a8 = c18124u8.getIterations();
            boolean zM52049c8 = c18124u8.getIsPlaying();
            Float fM52048b8 = c18124u8.getProgressOverride();
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, c2314t);
            int i212 = i19;
            if ((i19 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R4 = c28655q3.m87133R();
            if (z13) {
                objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                c28655q3.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2609r(function4, interfaceC28601c1, 15);
                c28655q3.m87172p0(objM87133R4);
            }
            function3 = function4;
            AbstractC35687q0.m113102l(modifierM3407d8, interfaceC35689r0M52038c8, list8, map2, strM52039e8, listM52037b8, iM52047a8, zM52049c8, fM52048b8, null, (Function1) objM87133R4, interfaceC4339a4, c28655q3, 6, (i212 >> 6) & 112, 512);
            c28655q2 = c28655q3;
            if (m52031f(interfaceC28601c1) == EnumC35690s.READY) {
                z14 = true;
                c28655q2.m87150e0(-1722154293);
                c28655q2.m87173q(false);
            } else {
                z14 = true;
                c28655q2.m87150e0(-1722154293);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z14);
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a4;
            c28655q = c28655q2;
        } else {
            C28655q c28655q11 = c28655q3;
            c28655q11.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
            c28655q = c28655q11;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(model, modifier3, function3, interfaceC4339a3, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m52030e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final EnumC35690s m52031f(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC35690s) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m52032g(InterfaceC28601c1 interfaceC28601c1, EnumC35690s enumC35690s) {
        interfaceC28601c1.setValue(enumC35690s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m52033h(Function1 function1, InterfaceC28601c1 interfaceC28601c1, EnumC35690s state) {
        AbstractC22676k.m65750j(state, "state");
        m52032g(interfaceC28601c1, state);
        if (function1 != null) {
            function1.invoke(state);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m52034i(C18122s c18122s, Modifier modifier, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m52029d(c18122s, modifier, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final C18124u m52035j(EnumC18104a enumC18104a) {
        AbstractC22676k.m65750j(enumC18104a, "<this>");
        int i13 = a.f70391a[enumC18104a.ordinal()];
        if (i13 == 1) {
            return new C18124u(Integer.MAX_VALUE, true, null);
        }
        if (i13 == 2) {
            return new C18124u(1, true, null);
        }
        if (i13 == 3) {
            return new C18124u(1, false, Float.valueOf(1.0f));
        }
        throw new NoWhenBranchMatchedException();
    }
}
