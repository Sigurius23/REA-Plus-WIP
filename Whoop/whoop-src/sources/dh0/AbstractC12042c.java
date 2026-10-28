package dh0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.profile.view.C9814j;
import l83.C23454a0;
import nl0.EnumC26800b;
import no.nordicsemi.android.dfu.DfuBaseService;
import oh0.C27935c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import p734sl0.AbstractC32640m0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: dh0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lnl0/b;", "role", "Lm91/u;", "item", "Ly3/f;", "topPadding", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Lnl0/b;Lm91/u;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "k", "(Landroidx/compose/ui/Modifier;Lnl0/b;)Landroidx/compose/ui/Modifier;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12042c {

    /* JADX INFO: renamed from: dh0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39817a;

        static {
            int[] iArr = new int[EnumC26800b.values().length];
            try {
                iArr[EnumC26800b.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26800b.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC26800b.TOOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC26800b.ASSISTANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39817a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0118  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:79:0x014c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0170  */
    /* JADX WARN: Code duplicated, block: B:83:0x0174  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:96:0x01da  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m33161f(EnumC26800b role, InterfaceC25312u item, float f13, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        float f14;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        float f15;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        float f16;
        C28676v0 c28676v0;
        Function1 function4;
        int i18;
        C2314t c2314t;
        Modifier modifierM3398t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C2307m c2307m;
        int iHashCode2;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1037589588);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(role.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(item) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? 256 : 128;
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
                    if (i19 != 0) {
                        f16 = 0 * 8;
                    } else {
                        f16 = f14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C12040a(0);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    i18 = a.f39817a[role.ordinal()];
                    c2314t = C2314t.f9131w;
                    if (i18 == 1) {
                        float f17 = 8;
                        modifierM3398t = AbstractC1099a.m3398t(c2314t, 16 * f17, f16, ((float) 1.5d) * f17, 0.0f, 8);
                    } else {
                        if (i18 == 2 && i18 != 3 && i18 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        float f18 = 3 * 8;
                        modifierM3398t = AbstractC1099a.m3398t(c2314t, f18, f16, f18, 0.0f, 8);
                    }
                    Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifierM3398t);
                    C2307m c2307m2 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    if (role == EnumC26800b.USER) {
                        c2307m = C2299e.f9103F;
                    } else {
                        c2307m = C2299e.f9117z;
                    }
                    Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, c2307m);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                    Function1 function5 = function4;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12040a(1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R), new C12041b(role, 0), function5, c28655q, ((i15 >> 3) & 14) | (C25307p.f99300b << 3) | (i15 & 7168), 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function5;
                    f15 = f16;
                } else {
                    c28655q.m87138X();
                    f15 = f14;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9814j(role, item, f15, function3, i13, i14, 2);
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
                if (i19 != 0) {
                    f16 = 0 * 8;
                } else {
                    f16 = f14;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C12040a(0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                i18 = a.f39817a[role.ordinal()];
                c2314t = C2314t.f9131w;
                if (i18 == 1) {
                    if (i18 == 2) {
                    }
                    float f19 = 3 * 8;
                    modifierM3398t = AbstractC1099a.m3398t(c2314t, f19, f16, f19, 0.0f, 8);
                } else {
                    float f110 = 8;
                    modifierM3398t = AbstractC1099a.m3398t(c2314t, 16 * f110, f16, ((float) 1.5d) * f110, 0.0f, 8);
                }
                Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifierM3398t);
                C2307m c2307m3 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d3);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                if (role == EnumC26800b.USER) {
                    c2307m = C2299e.f9103F;
                } else {
                    c2307m = C2299e.f9117z;
                }
                Modifier modifierMo3400a2 = C1100b.f4583a.mo3400a(c2314t, c2307m);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m3, false);
                Function1 function6 = function4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3400a2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C12040a(1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R), new C12041b(role, 0), function6, c28655q, ((i15 >> 3) & 14) | (C25307p.f99300b << 3) | (i15 & 7168), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function6;
                f15 = f16;
            } else {
                c28655q.m87138X();
                f15 = f14;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9814j(role, item, f15, function3, i13, i14, 2);
            }
        }
        i15 |= 384;
        f14 = f13;
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
                if (i19 != 0) {
                    f16 = 0 * 8;
                } else {
                    f16 = f14;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C12040a(0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                i18 = a.f39817a[role.ordinal()];
                c2314t = C2314t.f9131w;
                if (i18 == 1) {
                    if (i18 == 2) {
                    }
                    float f111 = 3 * 8;
                    modifierM3398t = AbstractC1099a.m3398t(c2314t, f111, f16, f111, 0.0f, 8);
                } else {
                    float f112 = 8;
                    modifierM3398t = AbstractC1099a.m3398t(c2314t, 16 * f112, f16, ((float) 1.5d) * f112, 0.0f, 8);
                }
                Modifier modifierMo3471e3 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifierM3398t);
                C2307m c2307m4 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d5);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                if (role == EnumC26800b.USER) {
                    c2307m = C2299e.f9103F;
                } else {
                    c2307m = C2299e.f9117z;
                }
                Modifier modifierMo3400a3 = C1100b.f4583a.mo3400a(c2314t, c2307m);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m4, false);
                Function1 function7 = function4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3400a3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C12040a(1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R), new C12041b(role, 0), function7, c28655q, ((i15 >> 3) & 14) | (C25307p.f99300b << 3) | (i15 & 7168), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function7;
                f15 = f16;
            } else {
                c28655q.m87138X();
                f15 = f14;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9814j(role, item, f15, function3, i13, i14, 2);
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
            if (i19 != 0) {
                f16 = 0 * 8;
            } else {
                f16 = f14;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C12040a(0);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            i18 = a.f39817a[role.ordinal()];
            c2314t = C2314t.f9131w;
            if (i18 == 1) {
                if (i18 == 2) {
                }
                float f113 = 3 * 8;
                modifierM3398t = AbstractC1099a.m3398t(c2314t, f113, f16, f113, 0.0f, 8);
            } else {
                float f114 = 8;
                modifierM3398t = AbstractC1099a.m3398t(c2314t, 16 * f114, f16, ((float) 1.5d) * f114, 0.0f, 8);
            }
            Modifier modifierMo3471e4 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifierM3398t);
            C2307m c2307m5 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m5, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d7);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            if (role == EnumC26800b.USER) {
                c2307m = C2299e.f9103F;
            } else {
                c2307m = C2299e.f9117z;
            }
            Modifier modifierMo3400a4 = C1100b.f4583a.mo3400a(c2314t, c2307m);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m5, false);
            Function1 function8 = function4;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3400a4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C12040a(1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R), new C12041b(role, 0), function8, c28655q, ((i15 >> 3) & 14) | (C25307p.f99300b << 3) | (i15 & 7168), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function8;
            f15 = f16;
        } else {
            c28655q.m87138X();
            f15 = f14;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9814j(role, item, f15, function3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m33162g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m33163h(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74323b(AbstractC32640m0.m102010c());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Modifier m33164i(EnumC26800b enumC26800b, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-237005552);
        boolean z4 = it instanceof C27935c;
        Modifier modifierM33166k = C2314t.f9131w;
        if (z4) {
            modifierM33166k = m33166k(modifierM33166k, enumC26800b);
        }
        c28655q.m87173q(false);
        return modifierM33166k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m33165j(EnumC26800b enumC26800b, InterfaceC25312u interfaceC25312u, float f13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m33161f(enumC26800b, interfaceC25312u, f13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final Modifier m33166k(Modifier modifier, EnumC26800b enumC26800b) {
        return AbstractC37056f.m118997u(modifier, new C12041b(enumC26800b, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Modifier m33167l(EnumC26800b enumC26800b, Modifier composed, Composer composer, int i13) {
        Modifier modifier;
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-455371136);
        int i14 = a.f39817a[enumC26800b.ordinal()];
        C2314t c2314t = C2314t.f9131w;
        if (i14 == 1) {
            c28655q.m87150e0(475010620);
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10()));
            c28655q.m87173q(false);
            modifier = modifierM3394p;
        } else {
            if (i14 != 2 && i14 != 3 && i14 != 4) {
                throw AbstractC11895b.m32003v(475003084, c28655q, false);
            }
            c28655q.m87150e0(475014920);
            c28655q.m87173q(false);
            modifier = c2314t;
        }
        c28655q.m87173q(false);
        return modifier;
    }
}
