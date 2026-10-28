package p734sl0;

import android.os.Build;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17907r;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.n3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"", "audioLevel", "", "enableAnimation", "Landroidx/compose/ui/Modifier;", "modifier", "Ly3/f;", "height", "Lkotlin/Function1;", "Ll83/a0;", "onStopRecordingClicked", "f", "(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32648n3 {
    /* JADX WARN: Code duplicated, block: B:102:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:110:0x0283  */
    /* JADX WARN: Code duplicated, block: B:111:0x0285  */
    /* JADX WARN: Code duplicated, block: B:114:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x028e  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:120:0x0303  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0100  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x0123  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:83:0x0140  */
    /* JADX WARN: Code duplicated, block: B:85:0x0152  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    /* JADX INFO: renamed from: f */
    public static final void m102044f(float f13, boolean z4, Modifier modifier, float f14, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        float f15;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z13;
        Modifier modifier3;
        float f16;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        float f17;
        C28676v0 c28676v0;
        Function1 function4;
        float f18;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        float f19;
        int iHashCode2;
        int i24;
        boolean z14;
        Object objM87133R2;
        Function1 function5;
        boolean z15;
        Object objM87133R3;
        Object objM87133R4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1313931746);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    f15 = f14;
                    if (c28655q.m87147d(f15)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        c2314t = C2314t.f9131w;
                        if (i25 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i16 != 0) {
                            f17 = 11 * 4;
                        } else {
                            f17 = f15;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C32618h3(1);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function4 = (Function1) objM87133R4;
                        } else {
                            function4 = function2;
                        }
                        C38072d c38072d = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        int i27 = i15;
                        f18 = 4;
                        Modifier modifierM3411h = AbstractC1102d.m3411h(f17, AbstractC31061c.m95629e(modifier4, 3, f18, c38072d.m121949b(c28655q, i26).getBrandBlack()));
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        Modifier modifier5 = modifier4;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        if (Build.VERSION.SDK_INT < 31) {
                            c28655q.m87150e0(491948378);
                            c28655q.m87173q(false);
                            f19 = 1.0f;
                        } else {
                            c28655q.m87150e0(491554368);
                            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "VoiceRecordingGlow");
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C32618h3(2);
                                c28655q.m87172p0(objM87133R);
                            }
                            Modifier modifierM44456i = AbstractC15751g.m44456i(2, AbstractC1127a.m3486a(modifierM3599a, (Function1) objM87133R), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f18));
                            f19 = 1.0f;
                            AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, modifierM44456i), c28655q, 0);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3407d = AbstractC1102d.m3407d(f19, c2314t);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        i24 = i27 & 57344;
                        if (i24 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C32644n(function4, 9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        float f24 = 8;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), 1 * f24, 0.0f, 0.0f, 0.0f, 14);
                        float f25 = f18 * f18;
                        function5 = function4;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCross(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159633M0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f25, modifierM3398t), "VoiceRecordingCancel"), c38072d.m121949b(c28655q, i26).getWhite50(), c28655q, 0, 0);
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "voice_recording_animation");
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC32638l3.m101993c(AbstractC11895b.m31988g(modifierM3599a2, true, 1.0f), z4, f13, 0L, c28655q, (i27 & 112) | ((i27 << 6) & 896), 8);
                        if (i24 == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C32644n(function5, 10);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159629K0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f25, AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), 0.0f, 0.0f, 2 * f24, 0.0f, 11)), "VoiceRecordingCommit"), c38072d.m121949b(c28655q, i26).getWhite50(), c28655q, 0, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        modifier3 = modifier5;
                        function3 = function5;
                        f16 = f17;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        f16 = f15;
                        function3 = function2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32643m3(f13, z4, modifier3, f16, function3, i13, i14);
                    }
                }
                i15 |= 24576;
                function2 = function1;
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        f17 = 11 * 4;
                    } else {
                        f17 = f15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32618h3(1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    C38072d c38072d2 = C38072d.f163053a;
                    int i28 = C38072d.f163054b;
                    int i29 = i15;
                    f18 = 4;
                    Modifier modifierM3411h2 = AbstractC1102d.m3411h(f17, AbstractC31061c.m95629e(modifier4, 3, f18, c38072d2.m121949b(c28655q, i28).getBrandBlack()));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    Modifier modifier6 = modifier4;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    if (Build.VERSION.SDK_INT < 31) {
                        c28655q.m87150e0(491948378);
                        c28655q.m87173q(false);
                        f19 = 1.0f;
                    } else {
                        c28655q.m87150e0(491554368);
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "VoiceRecordingGlow");
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32618h3(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM44456i2 = AbstractC15751g.m44456i(2, AbstractC1127a.m3486a(modifierM3599a3, (Function1) objM87133R), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f18));
                        f19 = 1.0f;
                        AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, modifierM44456i2), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(f19, c2314t);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                    i24 = i29 & 57344;
                    if (i24 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C32644n(function4, 9);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32644n(function4, 9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    float f26 = 8;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), 1 * f26, 0.0f, 0.0f, 0.0f, 14);
                    float f27 = f18 * f18;
                    function5 = function4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getAction().getCross(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159633M0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f27, modifierM3398t2), "VoiceRecordingCancel"), c38072d2.m121949b(c28655q, i28).getWhite50(), c28655q, 0, 0);
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "voice_recording_animation");
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC32638l3.m101993c(AbstractC11895b.m31988g(modifierM3599a4, true, 1.0f), z4, f13, 0L, c28655q, (i29 & 112) | ((i29 << 6) & 896), 8);
                    if (i24 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C32644n(function5, 10);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32644n(function5, 10);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159629K0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f27, AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), 0.0f, 0.0f, 2 * f26, 0.0f, 11)), "VoiceRecordingCommit"), c38072d2.m121949b(c28655q, i28).getWhite50(), c28655q, 0, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier6;
                    function3 = function5;
                    f16 = f17;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    f16 = f15;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32643m3(f13, z4, modifier3, f16, function3, i13, i14);
                }
            }
            i15 |= 3072;
            f15 = f14;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        f17 = 11 * 4;
                    } else {
                        f17 = f15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32618h3(1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    C38072d c38072d3 = C38072d.f163053a;
                    int i210 = C38072d.f163054b;
                    int i211 = i15;
                    f18 = 4;
                    Modifier modifierM3411h3 = AbstractC1102d.m3411h(f17, AbstractC31061c.m95629e(modifier4, 3, f18, c38072d3.m121949b(c28655q, i210).getBrandBlack()));
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3411h3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    Modifier modifier7 = modifier4;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                    if (Build.VERSION.SDK_INT < 31) {
                        c28655q.m87150e0(491948378);
                        c28655q.m87173q(false);
                        f19 = 1.0f;
                    } else {
                        c28655q.m87150e0(491554368);
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(c2314t, "VoiceRecordingGlow");
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32618h3(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM44456i3 = AbstractC15751g.m44456i(2, AbstractC1127a.m3486a(modifierM3599a5, (Function1) objM87133R), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f18));
                        f19 = 1.0f;
                        AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, modifierM44456i3), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(f19, c2314t);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                    i24 = i211 & 57344;
                    if (i24 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C32644n(function4, 9);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32644n(function4, 9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    float f28 = 8;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), 1 * f28, 0.0f, 0.0f, 0.0f, 14);
                    float f29 = f18 * f18;
                    function5 = function4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getAction().getCross(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159633M0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f29, modifierM3398t3), "VoiceRecordingCancel"), c38072d3.m121949b(c28655q, i210).getWhite50(), c28655q, 0, 0);
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t, "voice_recording_animation");
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC32638l3.m101993c(AbstractC11895b.m31988g(modifierM3599a6, true, 1.0f), z4, f13, 0L, c28655q, (i211 & 112) | ((i211 << 6) & 896), 8);
                    if (i24 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C32644n(function5, 10);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32644n(function5, 10);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159629K0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f29, AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), 0.0f, 0.0f, 2 * f28, 0.0f, 11)), "VoiceRecordingCommit"), c38072d3.m121949b(c28655q, i210).getWhite50(), c28655q, 0, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier7;
                    function3 = function5;
                    f16 = f17;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    f16 = f15;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32643m3(f13, z4, modifier3, f16, function3, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    f17 = 11 * 4;
                } else {
                    f17 = f15;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32618h3(1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                C38072d c38072d4 = C38072d.f163053a;
                int i212 = C38072d.f163054b;
                int i213 = i15;
                f18 = 4;
                Modifier modifierM3411h4 = AbstractC1102d.m3411h(f17, AbstractC31061c.m95629e(modifier4, 3, f18, c38072d4.m121949b(c28655q, i212).getBrandBlack()));
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3411h4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                Modifier modifier8 = modifier4;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                if (Build.VERSION.SDK_INT < 31) {
                    c28655q.m87150e0(491948378);
                    c28655q.m87173q(false);
                    f19 = 1.0f;
                } else {
                    c28655q.m87150e0(491554368);
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(c2314t, "VoiceRecordingGlow");
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32618h3(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM44456i4 = AbstractC15751g.m44456i(2, AbstractC1127a.m3486a(modifierM3599a7, (Function1) objM87133R), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f18));
                    f19 = 1.0f;
                    AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, modifierM44456i4), c28655q, 0);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(f19, c2314t);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
                i24 = i213 & 57344;
                if (i24 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C32644n(function4, 9);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32644n(function4, 9);
                    c28655q.m87172p0(objM87133R2);
                }
                float f210 = 8;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), 1 * f210, 0.0f, 0.0f, 0.0f, 14);
                float f211 = f18 * f18;
                function5 = function4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d4.m121951d().getAction().getCross(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159633M0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f211, modifierM3398t4), "VoiceRecordingCancel"), c38072d4.m121949b(c28655q, i212).getWhite50(), c28655q, 0, 0);
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(c2314t, "voice_recording_animation");
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC32638l3.m101993c(AbstractC11895b.m31988g(modifierM3599a8, true, 1.0f), z4, f13, 0L, c28655q, (i213 & 112) | ((i213 << 6) & 896), 8);
                if (i24 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C32644n(function5, 10);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32644n(function5, 10);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d4.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159629K0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f211, AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), 0.0f, 0.0f, 2 * f210, 0.0f, 11)), "VoiceRecordingCommit"), c38072d4.m121949b(c28655q, i212).getWhite50(), c28655q, 0, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier8;
                function3 = function5;
                f16 = f17;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f16 = f15;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32643m3(f13, z4, modifier3, f16, function3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                f15 = f14;
                if (c28655q.m87147d(f15)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        f17 = 11 * 4;
                    } else {
                        f17 = f15;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32618h3(1);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    C38072d c38072d5 = C38072d.f163053a;
                    int i214 = C38072d.f163054b;
                    int i215 = i15;
                    f18 = 4;
                    Modifier modifierM3411h5 = AbstractC1102d.m3411h(f17, AbstractC31061c.m95629e(modifier4, 3, f18, c38072d5.m121949b(c28655q, i214).getBrandBlack()));
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3411h5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d5);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m9);
                    c0209i = C0217k.f732j;
                    Modifier modifier9 = modifier4;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N9);
                    if (Build.VERSION.SDK_INT < 31) {
                        c28655q.m87150e0(491948378);
                        c28655q.m87173q(false);
                        f19 = 1.0f;
                    } else {
                        c28655q.m87150e0(491554368);
                        Modifier modifierM3599a9 = AbstractC1136a.m3599a(c2314t, "VoiceRecordingGlow");
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C32618h3(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM44456i5 = AbstractC15751g.m44456i(2, AbstractC1127a.m3486a(modifierM3599a9, (Function1) objM87133R), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f18));
                        f19 = 1.0f;
                        AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, modifierM44456i5), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(f19, c2314t);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                    i24 = i215 & 57344;
                    if (i24 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C32644n(function4, 9);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32644n(function4, 9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    float f212 = 8;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), 1 * f212, 0.0f, 0.0f, 0.0f, 14);
                    float f213 = f18 * f18;
                    function5 = function4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d5.m121951d().getAction().getCross(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159633M0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f213, modifierM3398t5), "VoiceRecordingCancel"), c38072d5.m121949b(c28655q, i214).getWhite50(), c28655q, 0, 0);
                    Modifier modifierM3599a10 = AbstractC1136a.m3599a(c2314t, "voice_recording_animation");
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC32638l3.m101993c(AbstractC11895b.m31988g(modifierM3599a10, true, 1.0f), z4, f13, 0L, c28655q, (i215 & 112) | ((i215 << 6) & 896), 8);
                    if (i24 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C32644n(function5, 10);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32644n(function5, 10);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d5.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159629K0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f213, AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), 0.0f, 0.0f, 2 * f212, 0.0f, 11)), "VoiceRecordingCommit"), c38072d5.m121949b(c28655q, i214).getWhite50(), c28655q, 0, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier9;
                    function3 = function5;
                    f16 = f17;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    f16 = f15;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32643m3(f13, z4, modifier3, f16, function3, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    f17 = 11 * 4;
                } else {
                    f17 = f15;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32618h3(1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                C38072d c38072d6 = C38072d.f163053a;
                int i216 = C38072d.f163054b;
                int i217 = i15;
                f18 = 4;
                Modifier modifierM3411h6 = AbstractC1102d.m3411h(f17, AbstractC31061c.m95629e(modifier4, 3, f18, c38072d6.m121949b(c28655q, i216).getBrandBlack()));
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3411h6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i17 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC39127r0M66763d6);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                Modifier modifier10 = modifier4;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N11);
                if (Build.VERSION.SDK_INT < 31) {
                    c28655q.m87150e0(491948378);
                    c28655q.m87173q(false);
                    f19 = 1.0f;
                } else {
                    c28655q.m87150e0(491554368);
                    Modifier modifierM3599a11 = AbstractC1136a.m3599a(c2314t, "VoiceRecordingGlow");
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32618h3(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM44456i6 = AbstractC15751g.m44456i(2, AbstractC1127a.m3486a(modifierM3599a11, (Function1) objM87133R), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f18));
                    f19 = 1.0f;
                    AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, modifierM44456i6), c28655q, 0);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(f19, c2314t);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N12);
                i24 = i217 & 57344;
                if (i24 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C32644n(function4, 9);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32644n(function4, 9);
                    c28655q.m87172p0(objM87133R2);
                }
                float f214 = 8;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), 1 * f214, 0.0f, 0.0f, 0.0f, 14);
                float f215 = f18 * f18;
                function5 = function4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d6.m121951d().getAction().getCross(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159633M0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f215, modifierM3398t6), "VoiceRecordingCancel"), c38072d6.m121949b(c28655q, i216).getWhite50(), c28655q, 0, 0);
                Modifier modifierM3599a12 = AbstractC1136a.m3599a(c2314t, "voice_recording_animation");
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC32638l3.m101993c(AbstractC11895b.m31988g(modifierM3599a12, true, 1.0f), z4, f13, 0L, c28655q, (i217 & 112) | ((i217 << 6) & 896), 8);
                if (i24 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C32644n(function5, 10);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32644n(function5, 10);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d6.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159629K0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f215, AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), 0.0f, 0.0f, 2 * f214, 0.0f, 11)), "VoiceRecordingCommit"), c38072d6.m121949b(c28655q, i216).getWhite50(), c28655q, 0, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier10;
                function3 = function5;
                f16 = f17;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f16 = f15;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32643m3(f13, z4, modifier3, f16, function3, i13, i14);
            }
        }
        i15 |= 3072;
        f15 = f14;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    f17 = 11 * 4;
                } else {
                    f17 = f15;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32618h3(1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                C38072d c38072d7 = C38072d.f163053a;
                int i218 = C38072d.f163054b;
                int i219 = i15;
                f18 = 4;
                Modifier modifierM3411h7 = AbstractC1102d.m3411h(f17, AbstractC31061c.m95629e(modifier4, 3, f18, c38072d7.m121949b(c28655q, i218).getBrandBlack()));
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3411h7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC39127r0M66763d7);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m13);
                c0209i = C0217k.f732j;
                Modifier modifier11 = modifier4;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N13);
                if (Build.VERSION.SDK_INT < 31) {
                    c28655q.m87150e0(491948378);
                    c28655q.m87173q(false);
                    f19 = 1.0f;
                } else {
                    c28655q.m87150e0(491554368);
                    Modifier modifierM3599a13 = AbstractC1136a.m3599a(c2314t, "VoiceRecordingGlow");
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32618h3(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM44456i7 = AbstractC15751g.m44456i(2, AbstractC1127a.m3486a(modifierM3599a13, (Function1) objM87133R), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f18));
                    f19 = 1.0f;
                    AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, modifierM44456i7), c28655q, 0);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(f19, c2314t);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                i24 = i219 & 57344;
                if (i24 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C32644n(function4, 9);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32644n(function4, 9);
                    c28655q.m87172p0(objM87133R2);
                }
                float f216 = 8;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), 1 * f216, 0.0f, 0.0f, 0.0f, 14);
                float f217 = f18 * f18;
                function5 = function4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d7.m121951d().getAction().getCross(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159633M0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f217, modifierM3398t7), "VoiceRecordingCancel"), c38072d7.m121949b(c28655q, i218).getWhite50(), c28655q, 0, 0);
                Modifier modifierM3599a14 = AbstractC1136a.m3599a(c2314t, "voice_recording_animation");
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC32638l3.m101993c(AbstractC11895b.m31988g(modifierM3599a14, true, 1.0f), z4, f13, 0L, c28655q, (i219 & 112) | ((i219 << 6) & 896), 8);
                if (i24 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C32644n(function5, 10);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32644n(function5, 10);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d7.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159629K0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f217, AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), 0.0f, 0.0f, 2 * f216, 0.0f, 11)), "VoiceRecordingCommit"), c38072d7.m121949b(c28655q, i218).getWhite50(), c28655q, 0, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier11;
                function3 = function5;
                f16 = f17;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                f16 = f15;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32643m3(f13, z4, modifier3, f16, function3, i13, i14);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                f17 = 11 * 4;
            } else {
                f17 = f15;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32618h3(1);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            C38072d c38072d8 = C38072d.f163053a;
            int i2110 = C38072d.f163054b;
            int i2111 = i15;
            f18 = 4;
            Modifier modifierM3411h8 = AbstractC1102d.m3411h(f17, AbstractC31061c.m95629e(modifier4, 3, f18, c38072d8.m121949b(c28655q, i2110).getBrandBlack()));
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3411h8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC39127r0M66763d8);
            C0209i c0209i114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m15);
            c0209i = C0217k.f732j;
            Modifier modifier12 = modifier4;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N15);
            if (Build.VERSION.SDK_INT < 31) {
                c28655q.m87150e0(491948378);
                c28655q.m87173q(false);
                f19 = 1.0f;
            } else {
                c28655q.m87150e0(491554368);
                Modifier modifierM3599a15 = AbstractC1136a.m3599a(c2314t, "VoiceRecordingGlow");
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32618h3(2);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM44456i8 = AbstractC15751g.m44456i(2, AbstractC1127a.m3486a(modifierM3599a15, (Function1) objM87133R), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(f18));
                f19 = 1.0f;
                AbstractC22989q.m66760a(AbstractC1102d.m3407d(1.0f, modifierM44456i8), c28655q, 0);
                c28655q.m87173q(false);
            }
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(f19, c2314t);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3407d8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i113, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m16);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N16);
            i24 = i2111 & 57344;
            if (i24 == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C32644n(function4, 9);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C32644n(function4, 9);
                c28655q.m87172p0(objM87133R2);
            }
            float f218 = 8;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), 1 * f218, 0.0f, 0.0f, 0.0f, 14);
            float f219 = f18 * f18;
            function5 = function4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d8.m121951d().getAction().getCross(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159633M0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f219, modifierM3398t8), "VoiceRecordingCancel"), c38072d8.m121949b(c28655q, i2110).getWhite50(), c28655q, 0, 0);
            Modifier modifierM3599a16 = AbstractC1136a.m3599a(c2314t, "voice_recording_animation");
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC32638l3.m101993c(AbstractC11895b.m31988g(modifierM3599a16, true, 1.0f), z4, f13, 0L, c28655q, (i2111 & 112) | ((i2111 << 6) & 896), 8);
            if (i24 == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z15) {
                objM87133R3 = new C32644n(function5, 10);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C32644n(function5, 10);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d8.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp(), c28655q, 6), AbstractC8693b.m21273g(AbstractC37336b.f159629K0, c28655q, 0), AbstractC1136a.m3599a(AbstractC1102d.m3419p(f219, AbstractC1099a.m3398t(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15), 0.0f, 0.0f, 2 * f218, 0.0f, 11)), "VoiceRecordingCommit"), c38072d8.m121949b(c28655q, i2110).getWhite50(), c28655q, 0, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier12;
            function3 = function5;
            f16 = f17;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            f16 = f15;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32643m3(f13, z4, modifier3, f16, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m102045g(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m102046h(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51556g(new C17907r(30.0f, 30.0f, 3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m102047i(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m102048j(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m102049k(float f13, boolean z4, Modifier modifier, float f14, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m102044f(f13, z4, modifier, f14, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
