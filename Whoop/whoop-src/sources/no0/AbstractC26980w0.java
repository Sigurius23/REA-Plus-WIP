package no0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.models.AppointmentButtonModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.form.C9782f;
import ge3.AbstractC15751g;
import hy0.AbstractC17755i2;
import java.util.Iterator;
import java.util.List;
import kw1.C22852c;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lo0.C24603r0;
import m83.AbstractC25265s;
import n72.C26439b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: no0.w0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llo0/r0;", "state", "", "selectedTimeSlot", "Lkotlin/Function1;", "Lcom/whoop/design/models/AppointmentButtonModel;", "Ll83/a0;", "onAppointmentClick", "e", "(Landroidx/compose/ui/Modifier;Llo0/r0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "label", "", "selected", "Lkotlin/Function0;", "onClick", "i", "(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26980w0 {
    /* JADX WARN: Code duplicated, block: B:101:0x0252  */
    /* JADX WARN: Code duplicated, block: B:102:0x0255  */
    /* JADX WARN: Code duplicated, block: B:106:0x0268  */
    /* JADX WARN: Code duplicated, block: B:107:0x026a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0276  */
    /* JADX WARN: Code duplicated, block: B:113:0x027b  */
    /* JADX WARN: Code duplicated, block: B:114:0x027e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0299  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:134:0x0308  */
    /* JADX WARN: Code duplicated, block: B:135:0x030b  */
    /* JADX WARN: Code duplicated, block: B:139:0x033f  */
    /* JADX WARN: Code duplicated, block: B:142:0x034a  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x020b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0219  */
    /* JADX WARN: Code duplicated, block: B:97:0x0236  */
    /* JADX WARN: Code duplicated, block: B:99:0x0243  */
    /* JADX INFO: renamed from: e */
    public static final void m80899e(Modifier modifier, C24603r0 state, String str, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        String str3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        String str4;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier3;
        String str5;
        C28676v0 c28676v1;
        C2314t c2314t2;
        int i18;
        float f13;
        char c3;
        float f14;
        int i19;
        int iHashCode2;
        Iterator it;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        int size;
        int i24;
        float f15;
        String str6;
        float f16;
        int i25;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        C28676v0 c28676v2;
        Function1 function5;
        float f17;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-789762620);
        int i26 = i14 & 1;
        if (i26 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i27 = i14 & 4;
        if (i27 == 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i27 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C26439b(28);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function2 = (Function1) objM87133R2;
                    }
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    function4 = function2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i3 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
                    C0209i c0209i4 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        modifier3 = modifier2;
                    } else {
                        modifier3 = modifier2;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                        str5 = str4;
                        c28676v1 = c28676v0;
                        c2314t2 = c2314t;
                        i18 = i15;
                        AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
                        c28655q = c28655q;
                        f13 = 1.0f;
                        c3 = 3;
                        float f18 = 8;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 3 * f18, 0.0f, 0.0f, 13);
                        f14 = ((float) 1.5d) * f18;
                        i19 = 6;
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                        c28655q.m87150e0(-1869356372);
                        it = AbstractC25265s.m74153v0(state.m71840a(), 3).iterator();
                        while (it.hasNext()) {
                            List<AppointmentButtonModel> list = (List) it.next();
                            Modifier modifierM3409f = AbstractC1102d.m3409f(f13, c2314t2);
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i19);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i2 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            c28655q.m87150e0(-714464598);
                            for (AppointmentButtonModel appointmentButtonModel : list) {
                                String textDisplay = appointmentButtonModel.getTextDisplay();
                                if (str5 != null) {
                                    str6 = str5;
                                    f16 = Float.MAX_VALUE;
                                    boolean z14 = AbstractC22676k.m65745e(appointmentButtonModel.getDate(), str6);
                                    char c7 = c3;
                                    i25 = i18;
                                    if ((i25 & 7168) == 2048) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                                    objM87133R = c28655q.m87133R();
                                    if (zM87157i) {
                                        c28676v2 = c28676v1;
                                    } else {
                                        c28676v2 = c28676v1;
                                        if (objM87133R == c28676v2) {
                                            function5 = function4;
                                        }
                                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                                        Iterator it3 = it;
                                        C2314t c2314t3 = c2314t2;
                                        if (1.0f <= 0.0d) {
                                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                        }
                                        if (1.0f > f16) {
                                            f17 = f16;
                                        } else {
                                            f17 = 1.0f;
                                        }
                                        m80903i(textDisplay, z14, interfaceC4339a, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                        c28676v1 = c28676v2;
                                        i18 = i25;
                                        i19 = 6;
                                        c2314t2 = c2314t3;
                                        it = it3;
                                        c3 = c7;
                                        str5 = str6;
                                        function4 = function5;
                                    }
                                    function5 = function4;
                                    objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                                    c28655q.m87172p0(objM87133R);
                                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                                    Iterator it4 = it;
                                    C2314t c2314t4 = c2314t2;
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > f16) {
                                        f17 = f16;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    m80903i(textDisplay, z14, interfaceC4339a2, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                    c28676v1 = c28676v2;
                                    i18 = i25;
                                    i19 = 6;
                                    c2314t2 = c2314t4;
                                    it = it4;
                                    c3 = c7;
                                    str5 = str6;
                                    function4 = function5;
                                } else {
                                    str6 = str5;
                                    f16 = Float.MAX_VALUE;
                                }
                                char c14 = c3;
                                i25 = i18;
                                if ((i25 & 7168) == 2048) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    c28676v2 = c28676v1;
                                    if (objM87133R == c28676v2) {
                                        function5 = function4;
                                    }
                                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                                    Iterator it5 = it;
                                    C2314t c2314t5 = c2314t2;
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > f16) {
                                        f17 = f16;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    m80903i(textDisplay, z14, interfaceC4339a3, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                    c28676v1 = c28676v2;
                                    i18 = i25;
                                    i19 = 6;
                                    c2314t2 = c2314t5;
                                    it = it5;
                                    c3 = c14;
                                    str5 = str6;
                                    function4 = function5;
                                } else {
                                    c28676v2 = c28676v1;
                                }
                                function5 = function4;
                                objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                                c28655q.m87172p0(objM87133R);
                                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                                Iterator it6 = it;
                                C2314t c2314t6 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay, z14, interfaceC4339a4, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t6;
                                it = it6;
                                c3 = c14;
                                str5 = str6;
                                function4 = function5;
                            }
                            Function1 function6 = function4;
                            String str7 = str5;
                            Iterator it7 = it;
                            C2314t c2314t7 = c2314t2;
                            int i28 = i19;
                            char c15 = c3;
                            int i29 = i18;
                            C28676v0 c28676v3 = c28676v1;
                            c28655q.m87173q(false);
                            c28655q.m87150e0(-714451569);
                            size = 3 - list.size();
                            for (i24 = 0; i24 < size; i24++) {
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f15 = Float.MAX_VALUE;
                                } else {
                                    f15 = 1.0f;
                                }
                                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f15, true));
                            }
                            c28655q.m87173q(false);
                            c28655q.m87173q(true);
                            c28676v1 = c28676v3;
                            i18 = i29;
                            i19 = i28;
                            c2314t2 = c2314t7;
                            it = it7;
                            c3 = c15;
                            str5 = str7;
                            function4 = function6;
                            f13 = 1.0f;
                        }
                        AbstractC25012a.m73392y(c28655q, false, true, true);
                        str3 = str5;
                        function3 = function4;
                        modifier2 = modifier3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                    str5 = str4;
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    i18 = i15;
                    AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
                    c28655q = c28655q;
                    f13 = 1.0f;
                    c3 = 3;
                    float f19 = 8;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 3 * f19, 0.0f, 0.0f, 13);
                    f14 = ((float) 1.5d) * f19;
                    i19 = 6;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                    c28655q.m87150e0(-1869356372);
                    it = AbstractC25265s.m74153v0(state.m71840a(), 3).iterator();
                    while (it.hasNext()) {
                        List<AppointmentButtonModel> list2 = (List) it.next();
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, c2314t2);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i19);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        c28655q.m87150e0(-714464598);
                        while (r3.hasNext()) {
                            String textDisplay2 = appointmentButtonModel.getTextDisplay();
                            if (str5 != null) {
                                str6 = str5;
                                f16 = Float.MAX_VALUE;
                                if (AbstractC22676k.m65745e(appointmentButtonModel.getDate(), str6)) {
                                }
                                char c16 = c3;
                                i25 = i18;
                                if ((i25 & 7168) == 2048) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    c28676v2 = c28676v1;
                                    if (objM87133R == c28676v2) {
                                        function5 = function4;
                                    }
                                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                                    Iterator it8 = it;
                                    C2314t c2314t8 = c2314t2;
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > f16) {
                                        f17 = f16;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    m80903i(textDisplay2, z14, interfaceC4339a5, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                    c28676v1 = c28676v2;
                                    i18 = i25;
                                    i19 = 6;
                                    c2314t2 = c2314t8;
                                    it = it8;
                                    c3 = c16;
                                    str5 = str6;
                                    function4 = function5;
                                } else {
                                    c28676v2 = c28676v1;
                                }
                                function5 = function4;
                                objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                                c28655q.m87172p0(objM87133R);
                                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                                Iterator it9 = it;
                                C2314t c2314t9 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay2, z14, interfaceC4339a6, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t9;
                                it = it9;
                                c3 = c16;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                str6 = str5;
                                f16 = Float.MAX_VALUE;
                            }
                            char c17 = c3;
                            i25 = i18;
                            if ((i25 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                c28676v2 = c28676v1;
                                if (objM87133R == c28676v2) {
                                    function5 = function4;
                                }
                                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                                Iterator it10 = it;
                                C2314t c2314t10 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay2, z14, interfaceC4339a7, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t10;
                                it = it10;
                                c3 = c17;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function5 = function4;
                            objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                            c28655q.m87172p0(objM87133R);
                            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            Iterator it11 = it;
                            C2314t c2314t11 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay2, z14, interfaceC4339a8, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t11;
                            it = it11;
                            c3 = c17;
                            str5 = str6;
                            function4 = function5;
                        }
                        Function1 function7 = function4;
                        String str8 = str5;
                        Iterator it12 = it;
                        C2314t c2314t12 = c2314t2;
                        int i210 = i19;
                        char c18 = c3;
                        int i211 = i18;
                        C28676v0 c28676v4 = c28676v1;
                        c28655q.m87173q(false);
                        c28655q.m87150e0(-714451569);
                        size = 3 - list2.size();
                        while (i24 < size) {
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f15 = Float.MAX_VALUE;
                            } else {
                                f15 = 1.0f;
                            }
                            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f15, true));
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c28676v1 = c28676v4;
                        i18 = i211;
                        i19 = i210;
                        c2314t2 = c2314t12;
                        it = it12;
                        c3 = c18;
                        str5 = str8;
                        function4 = function7;
                        f13 = 1.0f;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    str3 = str5;
                    function3 = function4;
                    modifier2 = modifier3;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) modifier2, (Object) state, (Object) str3, (InterfaceC23459e) function3, i13, i14, 22);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                if (i27 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26439b(28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function2 = (Function1) objM87133R2;
                }
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                function4 = function2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a4);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier3 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                    str5 = str4;
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    i18 = i15;
                    AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
                    c28655q = c28655q;
                    f13 = 1.0f;
                    c3 = 3;
                    float f110 = 8;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 3 * f110, 0.0f, 0.0f, 13);
                    f14 = ((float) 1.5d) * f110;
                    i19 = 6;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k2, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N7);
                    c28655q.m87150e0(-1869356372);
                    it = AbstractC25265s.m74153v0(state.m71840a(), 3).iterator();
                    while (it.hasNext()) {
                        List<AppointmentButtonModel> list3 = (List) it.next();
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(f13, c2314t2);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i19);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                        c28655q.m87150e0(-714464598);
                        while (r3.hasNext()) {
                            String textDisplay3 = appointmentButtonModel.getTextDisplay();
                            if (str5 != null) {
                                str6 = str5;
                                f16 = Float.MAX_VALUE;
                                if (AbstractC22676k.m65745e(appointmentButtonModel.getDate(), str6)) {
                                }
                                char c19 = c3;
                                i25 = i18;
                                if ((i25 & 7168) == 2048) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    c28676v2 = c28676v1;
                                    if (objM87133R == c28676v2) {
                                        function5 = function4;
                                    }
                                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                                    Iterator it13 = it;
                                    C2314t c2314t13 = c2314t2;
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > f16) {
                                        f17 = f16;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    m80903i(textDisplay3, z14, interfaceC4339a9, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                    c28676v1 = c28676v2;
                                    i18 = i25;
                                    i19 = 6;
                                    c2314t2 = c2314t13;
                                    it = it13;
                                    c3 = c19;
                                    str5 = str6;
                                    function4 = function5;
                                } else {
                                    c28676v2 = c28676v1;
                                }
                                function5 = function4;
                                objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                                c28655q.m87172p0(objM87133R);
                                InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R;
                                Iterator it14 = it;
                                C2314t c2314t14 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay3, z14, interfaceC4339a10, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t14;
                                it = it14;
                                c3 = c19;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                str6 = str5;
                                f16 = Float.MAX_VALUE;
                            }
                            char c110 = c3;
                            i25 = i18;
                            if ((i25 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                c28676v2 = c28676v1;
                                if (objM87133R == c28676v2) {
                                    function5 = function4;
                                }
                                InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R;
                                Iterator it15 = it;
                                C2314t c2314t15 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay3, z14, interfaceC4339a11, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t15;
                                it = it15;
                                c3 = c110;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function5 = function4;
                            objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                            c28655q.m87172p0(objM87133R);
                            InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                            Iterator it16 = it;
                            C2314t c2314t16 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay3, z14, interfaceC4339a12, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t16;
                            it = it16;
                            c3 = c110;
                            str5 = str6;
                            function4 = function5;
                        }
                        Function1 function8 = function4;
                        String str9 = str5;
                        Iterator it17 = it;
                        C2314t c2314t17 = c2314t2;
                        int i212 = i19;
                        char c111 = c3;
                        int i213 = i18;
                        C28676v0 c28676v5 = c28676v1;
                        c28655q.m87173q(false);
                        c28655q.m87150e0(-714451569);
                        size = 3 - list3.size();
                        while (i24 < size) {
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f15 = Float.MAX_VALUE;
                            } else {
                                f15 = 1.0f;
                            }
                            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f15, true));
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c28676v1 = c28676v5;
                        i18 = i213;
                        i19 = i212;
                        c2314t2 = c2314t17;
                        it = it17;
                        c3 = c111;
                        str5 = str9;
                        function4 = function8;
                        f13 = 1.0f;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    str3 = str5;
                    function3 = function4;
                    modifier2 = modifier3;
                } else {
                    modifier3 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                str5 = str4;
                c28676v1 = c28676v0;
                c2314t2 = c2314t;
                i18 = i15;
                AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
                c28655q = c28655q;
                f13 = 1.0f;
                c3 = 3;
                float f111 = 8;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 3 * f111, 0.0f, 0.0f, 13);
                f14 = ((float) 1.5d) * f111;
                i19 = 6;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k2, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                c28655q.m87150e0(-1869356372);
                it = AbstractC25265s.m74153v0(state.m71840a(), 3).iterator();
                while (it.hasNext()) {
                    List<AppointmentButtonModel> list4 = (List) it.next();
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(f13, c2314t2);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i19);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                    c28655q.m87150e0(-714464598);
                    while (r3.hasNext()) {
                        String textDisplay4 = appointmentButtonModel.getTextDisplay();
                        if (str5 != null) {
                            str6 = str5;
                            f16 = Float.MAX_VALUE;
                            if (AbstractC22676k.m65745e(appointmentButtonModel.getDate(), str6)) {
                            }
                            char c112 = c3;
                            i25 = i18;
                            if ((i25 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                c28676v2 = c28676v1;
                                if (objM87133R == c28676v2) {
                                    function5 = function4;
                                }
                                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R;
                                Iterator it18 = it;
                                C2314t c2314t18 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay4, z14, interfaceC4339a13, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t18;
                                it = it18;
                                c3 = c112;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function5 = function4;
                            objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                            c28655q.m87172p0(objM87133R);
                            InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R;
                            Iterator it19 = it;
                            C2314t c2314t19 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay4, z14, interfaceC4339a14, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t19;
                            it = it19;
                            c3 = c112;
                            str5 = str6;
                            function4 = function5;
                        } else {
                            str6 = str5;
                            f16 = Float.MAX_VALUE;
                        }
                        char c113 = c3;
                        i25 = i18;
                        if ((i25 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            c28676v2 = c28676v1;
                            if (objM87133R == c28676v2) {
                                function5 = function4;
                            }
                            InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R;
                            Iterator it110 = it;
                            C2314t c2314t110 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay4, z14, interfaceC4339a15, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t110;
                            it = it110;
                            c3 = c113;
                            str5 = str6;
                            function4 = function5;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function5 = function4;
                        objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                        c28655q.m87172p0(objM87133R);
                        InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R;
                        Iterator it111 = it;
                        C2314t c2314t111 = c2314t2;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > f16) {
                            f17 = f16;
                        } else {
                            f17 = 1.0f;
                        }
                        m80903i(textDisplay4, z14, interfaceC4339a16, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                        c28676v1 = c28676v2;
                        i18 = i25;
                        i19 = 6;
                        c2314t2 = c2314t111;
                        it = it111;
                        c3 = c113;
                        str5 = str6;
                        function4 = function5;
                    }
                    Function1 function9 = function4;
                    String str10 = str5;
                    Iterator it112 = it;
                    C2314t c2314t112 = c2314t2;
                    int i214 = i19;
                    char c114 = c3;
                    int i215 = i18;
                    C28676v0 c28676v6 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87150e0(-714451569);
                    size = 3 - list4.size();
                    while (i24 < size) {
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f15 = Float.MAX_VALUE;
                        } else {
                            f15 = 1.0f;
                        }
                        AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f15, true));
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c28676v1 = c28676v6;
                    i18 = i215;
                    i19 = i214;
                    c2314t2 = c2314t112;
                    it = it112;
                    c3 = c114;
                    str5 = str10;
                    function4 = function9;
                    f13 = 1.0f;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                str3 = str5;
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier2, (Object) state, (Object) str3, (InterfaceC23459e) function3, i13, i14, 22);
            }
        }
        i15 |= 384;
        str2 = str;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                if (i27 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26439b(28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function2 = (Function1) objM87133R2;
                }
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                function4 = function2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a7);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier3 = modifier2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
                    str5 = str4;
                    c28676v1 = c28676v0;
                    c2314t2 = c2314t;
                    i18 = i15;
                    AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
                    c28655q = c28655q;
                    f13 = 1.0f;
                    c3 = 3;
                    float f112 = 8;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 3 * f112, 0.0f, 0.0f, 13);
                    f14 = ((float) 1.5d) * f112;
                    i19 = 6;
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k3, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N12);
                    c28655q.m87150e0(-1869356372);
                    it = AbstractC25265s.m74153v0(state.m71840a(), 3).iterator();
                    while (it.hasNext()) {
                        List<AppointmentButtonModel> list5 = (List) it.next();
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(f13, c2314t2);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i19);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                        c28655q.m87150e0(-714464598);
                        while (r3.hasNext()) {
                            String textDisplay5 = appointmentButtonModel.getTextDisplay();
                            if (str5 != null) {
                                str6 = str5;
                                f16 = Float.MAX_VALUE;
                                if (AbstractC22676k.m65745e(appointmentButtonModel.getDate(), str6)) {
                                }
                                char c115 = c3;
                                i25 = i18;
                                if ((i25 & 7168) == 2048) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                                objM87133R = c28655q.m87133R();
                                if (zM87157i) {
                                    c28676v2 = c28676v1;
                                    if (objM87133R == c28676v2) {
                                        function5 = function4;
                                    }
                                    InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R;
                                    Iterator it113 = it;
                                    C2314t c2314t113 = c2314t2;
                                    if (1.0f <= 0.0d) {
                                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > f16) {
                                        f17 = f16;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    m80903i(textDisplay5, z14, interfaceC4339a17, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                    c28676v1 = c28676v2;
                                    i18 = i25;
                                    i19 = 6;
                                    c2314t2 = c2314t113;
                                    it = it113;
                                    c3 = c115;
                                    str5 = str6;
                                    function4 = function5;
                                } else {
                                    c28676v2 = c28676v1;
                                }
                                function5 = function4;
                                objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                                c28655q.m87172p0(objM87133R);
                                InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R;
                                Iterator it114 = it;
                                C2314t c2314t114 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay5, z14, interfaceC4339a18, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t114;
                                it = it114;
                                c3 = c115;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                str6 = str5;
                                f16 = Float.MAX_VALUE;
                            }
                            char c116 = c3;
                            i25 = i18;
                            if ((i25 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                c28676v2 = c28676v1;
                                if (objM87133R == c28676v2) {
                                    function5 = function4;
                                }
                                InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R;
                                Iterator it115 = it;
                                C2314t c2314t115 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay5, z14, interfaceC4339a19, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t115;
                                it = it115;
                                c3 = c116;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function5 = function4;
                            objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                            c28655q.m87172p0(objM87133R);
                            InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R;
                            Iterator it116 = it;
                            C2314t c2314t116 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay5, z14, interfaceC4339a110, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t116;
                            it = it116;
                            c3 = c116;
                            str5 = str6;
                            function4 = function5;
                        }
                        Function1 function10 = function4;
                        String str11 = str5;
                        Iterator it117 = it;
                        C2314t c2314t117 = c2314t2;
                        int i216 = i19;
                        char c117 = c3;
                        int i217 = i18;
                        C28676v0 c28676v7 = c28676v1;
                        c28655q.m87173q(false);
                        c28655q.m87150e0(-714451569);
                        size = 3 - list5.size();
                        while (i24 < size) {
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f15 = Float.MAX_VALUE;
                            } else {
                                f15 = 1.0f;
                            }
                            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f15, true));
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c28676v1 = c28676v7;
                        i18 = i217;
                        i19 = i216;
                        c2314t2 = c2314t117;
                        it = it117;
                        c3 = c117;
                        str5 = str11;
                        function4 = function10;
                        f13 = 1.0f;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    str3 = str5;
                    function3 = function4;
                    modifier2 = modifier3;
                } else {
                    modifier3 = modifier2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i14 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N11);
                str5 = str4;
                c28676v1 = c28676v0;
                c2314t2 = c2314t;
                i18 = i15;
                AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
                c28655q = c28655q;
                f13 = 1.0f;
                c3 = 3;
                float f113 = 8;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 3 * f113, 0.0f, 0.0f, 13);
                f14 = ((float) 1.5d) * f113;
                i19 = 6;
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k3, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N14);
                c28655q.m87150e0(-1869356372);
                it = AbstractC25265s.m74153v0(state.m71840a(), 3).iterator();
                while (it.hasNext()) {
                    List<AppointmentButtonModel> list6 = (List) it.next();
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(f13, c2314t2);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i19);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                    c28655q.m87150e0(-714464598);
                    while (r3.hasNext()) {
                        String textDisplay6 = appointmentButtonModel.getTextDisplay();
                        if (str5 != null) {
                            str6 = str5;
                            f16 = Float.MAX_VALUE;
                            if (AbstractC22676k.m65745e(appointmentButtonModel.getDate(), str6)) {
                            }
                            char c118 = c3;
                            i25 = i18;
                            if ((i25 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                c28676v2 = c28676v1;
                                if (objM87133R == c28676v2) {
                                    function5 = function4;
                                }
                                InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R;
                                Iterator it118 = it;
                                C2314t c2314t118 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay6, z14, interfaceC4339a111, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t118;
                                it = it118;
                                c3 = c118;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function5 = function4;
                            objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                            c28655q.m87172p0(objM87133R);
                            InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R;
                            Iterator it119 = it;
                            C2314t c2314t119 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay6, z14, interfaceC4339a112, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t119;
                            it = it119;
                            c3 = c118;
                            str5 = str6;
                            function4 = function5;
                        } else {
                            str6 = str5;
                            f16 = Float.MAX_VALUE;
                        }
                        char c119 = c3;
                        i25 = i18;
                        if ((i25 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            c28676v2 = c28676v1;
                            if (objM87133R == c28676v2) {
                                function5 = function4;
                            }
                            InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R;
                            Iterator it1110 = it;
                            C2314t c2314t1110 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay6, z14, interfaceC4339a113, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t1110;
                            it = it1110;
                            c3 = c119;
                            str5 = str6;
                            function4 = function5;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function5 = function4;
                        objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                        c28655q.m87172p0(objM87133R);
                        InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R;
                        Iterator it1111 = it;
                        C2314t c2314t1111 = c2314t2;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > f16) {
                            f17 = f16;
                        } else {
                            f17 = 1.0f;
                        }
                        m80903i(textDisplay6, z14, interfaceC4339a114, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                        c28676v1 = c28676v2;
                        i18 = i25;
                        i19 = 6;
                        c2314t2 = c2314t1111;
                        it = it1111;
                        c3 = c119;
                        str5 = str6;
                        function4 = function5;
                    }
                    Function1 function11 = function4;
                    String str12 = str5;
                    Iterator it1112 = it;
                    C2314t c2314t1112 = c2314t2;
                    int i218 = i19;
                    char c1110 = c3;
                    int i219 = i18;
                    C28676v0 c28676v8 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87150e0(-714451569);
                    size = 3 - list6.size();
                    while (i24 < size) {
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f15 = Float.MAX_VALUE;
                        } else {
                            f15 = 1.0f;
                        }
                        AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f15, true));
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c28676v1 = c28676v8;
                    i18 = i219;
                    i19 = i218;
                    c2314t2 = c2314t1112;
                    it = it1112;
                    c3 = c1110;
                    str5 = str12;
                    function4 = function11;
                    f13 = 1.0f;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                str3 = str5;
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier2, (Object) state, (Object) str3, (InterfaceC23459e) function3, i13, i14, 22);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier2 = c2314t;
            }
            if (i27 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C26439b(28);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            function4 = function2;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i15 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a10);
            C0209i c0209i16 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier3 = modifier2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N16);
                str5 = str4;
                c28676v1 = c28676v0;
                c2314t2 = c2314t;
                i18 = i15;
                AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
                c28655q = c28655q;
                f13 = 1.0f;
                c3 = 3;
                float f114 = 8;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 3 * f114, 0.0f, 0.0f, 13);
                f14 = ((float) 1.5d) * f114;
                i19 = 6;
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k4, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m17);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N17);
                c28655q.m87150e0(-1869356372);
                it = AbstractC25265s.m74153v0(state.m71840a(), 3).iterator();
                while (it.hasNext()) {
                    List<AppointmentButtonModel> list7 = (List) it.next();
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(f13, c2314t2);
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i19);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m18);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N18);
                    c28655q.m87150e0(-714464598);
                    while (r3.hasNext()) {
                        String textDisplay7 = appointmentButtonModel.getTextDisplay();
                        if (str5 != null) {
                            str6 = str5;
                            f16 = Float.MAX_VALUE;
                            if (AbstractC22676k.m65745e(appointmentButtonModel.getDate(), str6)) {
                            }
                            char c1111 = c3;
                            i25 = i18;
                            if ((i25 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                            objM87133R = c28655q.m87133R();
                            if (zM87157i) {
                                c28676v2 = c28676v1;
                                if (objM87133R == c28676v2) {
                                    function5 = function4;
                                }
                                InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R;
                                Iterator it1113 = it;
                                C2314t c2314t1113 = c2314t2;
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f16) {
                                    f17 = f16;
                                } else {
                                    f17 = 1.0f;
                                }
                                m80903i(textDisplay7, z14, interfaceC4339a115, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                                c28676v1 = c28676v2;
                                i18 = i25;
                                i19 = 6;
                                c2314t2 = c2314t1113;
                                it = it1113;
                                c3 = c1111;
                                str5 = str6;
                                function4 = function5;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function5 = function4;
                            objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                            c28655q.m87172p0(objM87133R);
                            InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R;
                            Iterator it1114 = it;
                            C2314t c2314t1114 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay7, z14, interfaceC4339a116, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t1114;
                            it = it1114;
                            c3 = c1111;
                            str5 = str6;
                            function4 = function5;
                        } else {
                            str6 = str5;
                            f16 = Float.MAX_VALUE;
                        }
                        char c1112 = c3;
                        i25 = i18;
                        if ((i25 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            c28676v2 = c28676v1;
                            if (objM87133R == c28676v2) {
                                function5 = function4;
                            }
                            InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R;
                            Iterator it1115 = it;
                            C2314t c2314t1115 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay7, z14, interfaceC4339a117, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t1115;
                            it = it1115;
                            c3 = c1112;
                            str5 = str6;
                            function4 = function5;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function5 = function4;
                        objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                        c28655q.m87172p0(objM87133R);
                        InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R;
                        Iterator it1116 = it;
                        C2314t c2314t1116 = c2314t2;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > f16) {
                            f17 = f16;
                        } else {
                            f17 = 1.0f;
                        }
                        m80903i(textDisplay7, z14, interfaceC4339a118, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                        c28676v1 = c28676v2;
                        i18 = i25;
                        i19 = 6;
                        c2314t2 = c2314t1116;
                        it = it1116;
                        c3 = c1112;
                        str5 = str6;
                        function4 = function5;
                    }
                    Function1 function12 = function4;
                    String str13 = str5;
                    Iterator it1117 = it;
                    C2314t c2314t1117 = c2314t2;
                    int i2110 = i19;
                    char c1113 = c3;
                    int i2111 = i18;
                    C28676v0 c28676v9 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87150e0(-714451569);
                    size = 3 - list7.size();
                    while (i24 < size) {
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f15 = Float.MAX_VALUE;
                        } else {
                            f15 = 1.0f;
                        }
                        AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f15, true));
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c28676v1 = c28676v9;
                    i18 = i2111;
                    i19 = i2110;
                    c2314t2 = c2314t1117;
                    it = it1117;
                    c3 = c1113;
                    str5 = str13;
                    function4 = function12;
                    f13 = 1.0f;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                str3 = str5;
                function3 = function4;
                modifier2 = modifier3;
            } else {
                modifier3 = modifier2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i18 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N16);
            str5 = str4;
            c28676v1 = c28676v0;
            c2314t2 = c2314t;
            i18 = i15;
            AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
            c28655q = c28655q;
            f13 = 1.0f;
            c3 = 3;
            float f115 = 8;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 3 * f115, 0.0f, 0.0f, 13);
            f14 = ((float) 1.5d) * f115;
            i19 = 6;
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k4, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i15, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m19);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i18, modifierM118962N19);
            c28655q.m87150e0(-1869356372);
            it = AbstractC25265s.m74153v0(state.m71840a(), 3).iterator();
            while (it.hasNext()) {
                List<AppointmentButtonModel> list8 = (List) it.next();
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(f13, c2314t2);
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, i19);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m110);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N110);
                c28655q.m87150e0(-714464598);
                while (r3.hasNext()) {
                    String textDisplay8 = appointmentButtonModel.getTextDisplay();
                    if (str5 != null) {
                        str6 = str5;
                        f16 = Float.MAX_VALUE;
                        if (AbstractC22676k.m65745e(appointmentButtonModel.getDate(), str6)) {
                        }
                        char c1114 = c3;
                        i25 = i18;
                        if ((i25 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i) {
                            c28676v2 = c28676v1;
                            if (objM87133R == c28676v2) {
                                function5 = function4;
                            }
                            InterfaceC4339a interfaceC4339a119 = (InterfaceC4339a) objM87133R;
                            Iterator it1118 = it;
                            C2314t c2314t1118 = c2314t2;
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f16) {
                                f17 = f16;
                            } else {
                                f17 = 1.0f;
                            }
                            m80903i(textDisplay8, z14, interfaceC4339a119, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                            c28676v1 = c28676v2;
                            i18 = i25;
                            i19 = 6;
                            c2314t2 = c2314t1118;
                            it = it1118;
                            c3 = c1114;
                            str5 = str6;
                            function4 = function5;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function5 = function4;
                        objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                        c28655q.m87172p0(objM87133R);
                        InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R;
                        Iterator it1119 = it;
                        C2314t c2314t1119 = c2314t2;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > f16) {
                            f17 = f16;
                        } else {
                            f17 = 1.0f;
                        }
                        m80903i(textDisplay8, z14, interfaceC4339a1110, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                        c28676v1 = c28676v2;
                        i18 = i25;
                        i19 = 6;
                        c2314t2 = c2314t1119;
                        it = it1119;
                        c3 = c1114;
                        str5 = str6;
                        function4 = function5;
                    } else {
                        str6 = str5;
                        f16 = Float.MAX_VALUE;
                    }
                    char c1115 = c3;
                    i25 = i18;
                    if ((i25 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(appointmentButtonModel);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        c28676v2 = c28676v1;
                        if (objM87133R == c28676v2) {
                            function5 = function4;
                        }
                        InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R;
                        Iterator it11110 = it;
                        C2314t c2314t11110 = c2314t2;
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > f16) {
                            f17 = f16;
                        } else {
                            f17 = 1.0f;
                        }
                        m80903i(textDisplay8, z14, interfaceC4339a1111, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                        c28676v1 = c28676v2;
                        i18 = i25;
                        i19 = 6;
                        c2314t2 = c2314t11110;
                        it = it11110;
                        c3 = c1115;
                        str5 = str6;
                        function4 = function5;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    function5 = function4;
                    objM87133R = new C26964o0(7, function5, appointmentButtonModel);
                    c28655q.m87172p0(objM87133R);
                    InterfaceC4339a interfaceC4339a1112 = (InterfaceC4339a) objM87133R;
                    Iterator it11111 = it;
                    C2314t c2314t11111 = c2314t2;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > f16) {
                        f17 = f16;
                    } else {
                        f17 = 1.0f;
                    }
                    m80903i(textDisplay8, z14, interfaceC4339a1112, new LayoutWeightElement(f17, true), c28655q, 0, 0);
                    c28676v1 = c28676v2;
                    i18 = i25;
                    i19 = 6;
                    c2314t2 = c2314t11111;
                    it = it11111;
                    c3 = c1115;
                    str5 = str6;
                    function4 = function5;
                }
                Function1 function13 = function4;
                String str14 = str5;
                Iterator it11112 = it;
                C2314t c2314t11112 = c2314t2;
                int i2112 = i19;
                char c1116 = c3;
                int i2113 = i18;
                C28676v0 c28676v10 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87150e0(-714451569);
                size = 3 - list8.size();
                while (i24 < size) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    } else {
                        f15 = 1.0f;
                    }
                    AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f15, true));
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c28676v1 = c28676v10;
                i18 = i2113;
                i19 = i2112;
                c2314t2 = c2314t11112;
                it = it11112;
                c3 = c1116;
                str5 = str14;
                function4 = function13;
                f13 = 1.0f;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            str3 = str5;
            function3 = function4;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            str3 = str2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) modifier2, (Object) state, (Object) str3, (InterfaceC23459e) function3, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m80900f(AppointmentButtonModel it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m80901g(Function1 function1, AppointmentButtonModel appointmentButtonModel) {
        function1.invoke(appointmentButtonModel);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m80902h(Modifier modifier, C24603r0 c24603r0, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80899e(modifier, c24603r0, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0187  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    private static final void m80903i(String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C33252i c33252iM105489e;
        C17916v0 c17916v0;
        Modifier modifierM3358c;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1473780051);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c33252iM105489e = AbstractC33253j.m105489e(3 * 4);
                Modifier modifierM118994r = AbstractC37056f.m118994r(modifier2, c33252iM105489e);
                c17916v0 = AbstractC17918w0.f69621a;
                if (z4) {
                    c28655q.m87150e0(-2068869445);
                    C38072d c38072d = C38072d.f163053a;
                    int i17 = C38072d.f163054b;
                    modifierM3358c = AbstractC1092a.m3358c(AbstractC15751g.m44455h(c2314t, (float) 1.5d, c38072d.m121949b(c28655q, i17).getRecovery(), c33252iM105489e), c38072d.m121949b(c28655q, i17).getNeutral15(), c17916v0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2068657095);
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), c17916v0);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM118994r.mo3471e(modifierM3358c), false, null, null, interfaceC4339a, 15), 0.0f, ((float) 1.5d) * 8, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C38072d c38072d2 = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                AbstractC30795n.m94707h(str, null, c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d2.m121952e(c28655q, i18).getN8(), null, c28655q, i15 & 14, (C2886a.f11498d << 18) | 3120, 186362);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9782f(i13, i14, 1, modifier3, interfaceC4339a, str, z4);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c33252iM105489e = AbstractC33253j.m105489e(3 * 4);
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(modifier2, c33252iM105489e);
            c17916v0 = AbstractC17918w0.f69621a;
            if (z4) {
                c28655q.m87150e0(-2068869445);
                C38072d c38072d3 = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                modifierM3358c = AbstractC1092a.m3358c(AbstractC15751g.m44455h(c2314t, (float) 1.5d, c38072d3.m121949b(c28655q, i19).getRecovery(), c33252iM105489e), c38072d3.m121949b(c28655q, i19).getNeutral15(), c17916v0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2068657095);
                modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), c17916v0);
                c28655q.m87173q(false);
            }
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM118994r2.mo3471e(modifierM3358c), false, null, null, interfaceC4339a, 15), 0.0f, ((float) 1.5d) * 8, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            C38072d c38072d4 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, null, c38072d4.m121949b(c28655q, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d4.m121952e(c28655q, i110).getN8(), null, c28655q, i15 & 14, (C2886a.f11498d << 18) | 3120, 186362);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9782f(i13, i14, 1, modifier3, interfaceC4339a, str, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m80904j(String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m80903i(str, z4, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
