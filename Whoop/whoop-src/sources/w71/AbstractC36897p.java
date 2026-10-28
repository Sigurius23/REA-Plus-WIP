package w71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import i93.C18282h;
import i93.C18284j;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import v41.C35657b0;
import wb3.AbstractC37056f;
import x81.C38072d;
import z21.AbstractC40020b;

/* JADX INFO: renamed from: w71.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001as\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "question", "context", "level", "", "min", "max", "increment", "preSetNumber", "", "isSubQuestion", "enabled", "Lkotlin/Function1;", "Ll83/a0;", "selectedNumber", "c", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36897p {

    /* JADX INFO: renamed from: w71.p$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ long f157841w;

        public a(long j7) {
            this.f157841w = j7;
        }

        /* JADX INFO: renamed from: a */
        public final long m118465a() {
            return this.f157841w;
        }

        @Override // c93.InterfaceC4339a
        public /* synthetic */ Object invoke() {
            return new C17919x(m118465a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:106:0x014d  */
    /* JADX WARN: Code duplicated, block: B:109:0x018e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0192  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:124:0x028d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0291  */
    /* JADX WARN: Code duplicated, block: B:128:0x029e  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:142:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x0304  */
    /* JADX WARN: Code duplicated, block: B:148:0x032f  */
    /* JADX WARN: Code duplicated, block: B:151:0x033c  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0126  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX INFO: renamed from: c */
    public static final void m118462c(final TextResource question, final TextResource context, final TextResource level, final int i13, int i14, int i15, Integer num, boolean z4, final boolean z13, Function1 function1, Composer composer, final int i16, final int i17) {
        int i18;
        int i19;
        int i24;
        Integer num2;
        int i25;
        int i26;
        boolean z14;
        int i27;
        int i28;
        boolean z15;
        int i29;
        final boolean z16;
        final Integer num3;
        final int i34;
        C28677v1 c28677v1M87180u;
        Integer num4;
        boolean z17;
        Object objM87133R;
        C28676v0 c28676v0;
        C36875c c36875c;
        float fM118269a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        boolean z18;
        int iHashCode2;
        long recovery;
        boolean zM87151f;
        Object objM87133R2;
        boolean z19;
        Object objM87133R3;
        int i35;
        int i36;
        final Function1 selectedNumber = function1;
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(selectedNumber, "selectedNumber");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(515817646);
        if ((i16 & 6) == 0) {
            i18 = (c28655q.m87153g(question) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q.m87153g(context) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= c28655q.m87153g(level) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i16 & 24576) == 0) {
            i18 |= c28655q.m87149e(i14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i37 = i17 & 32;
        if (i37 == 0) {
            if ((196608 & i16) == 0) {
                i19 = i15;
                i18 |= c28655q.m87149e(i19) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i24 = i17 & 64;
            if (i24 != 0) {
                if ((1572864 & i16) == 0) {
                    num2 = num;
                    if (c28655q.m87153g(num2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 128;
                if (i26 != 0) {
                    i18 |= 12582912;
                    z14 = z4;
                } else {
                    z14 = z4;
                    if ((i16 & 12582912) == 0) {
                        if (c28655q.m87155h(z14)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i18 |= i27;
                    }
                }
                if ((i16 & 100663296) != 0) {
                    if (c28655q.m87155h(z13)) {
                        i36 = 67108864;
                    } else {
                        i36 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i18 |= i36;
                }
                if ((i16 & 805306368) == 0) {
                    if (c28655q.m87157i(selectedNumber)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i18 |= i35;
                }
                i28 = i18;
                if ((i28 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q.m87135U(i28 & 1, z15)) {
                    if (i37 != 0) {
                        i19 = 1;
                    }
                    if (i24 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i26 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(num4);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c36875c = C36875c.f157714a;
                    if (z17) {
                        fM118269a = c36875c.m118270b();
                    } else {
                        fM118269a = c36875c.m118269a();
                    }
                    float f13 = fM118269a;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    int i38 = i19;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i4 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                    } else {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                        if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        C0209i c0209i6 = c0209i3;
                        AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                        String strM21274h = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                        Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 1 * 8, 0.0f, 2);
                        C38072d c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3396r, c38072d.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
                        c28655q.m87173q(true);
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 2);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                        recovery = c38072d.m121949b(c28655q, 6).getRecovery();
                        i29 = i14;
                        i19 = i38;
                        C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(i19, new C18284j(i13, i29, 1));
                        Integer num5 = (Integer) interfaceC28601c1.getValue();
                        zM87151f = c28655q.m87151f(recovery);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87151f || objM87133R2 == c28676v0) {
                            objM87133R2 = new a(recovery);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                        z19 = (i28 & 1879048192) == 536870912;
                        objM87133R3 = c28655q.m87133R();
                        if (!z19 || objM87133R3 == c28676v0) {
                            selectedNumber = function1;
                            objM87133R3 = new C35657b0(selectedNumber, 25);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            selectedNumber = function1;
                        }
                        AbstractC40020b.m128259l(c18282hM36268d0, num5, z13, interfaceC4339a, (Function1) objM87133R3, c28655q, (i28 >> 18) & 896, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        num3 = num4;
                        z16 = z17;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    C0209i c0209i8 = c0209i3;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    String strM21274h2 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, 1 * 8, 0.0f, 2);
                    C38072d c38072d2 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h2, modifierM3396r3, c38072d2.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 2);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    recovery = c38072d2.m121949b(c28655q, 6).getRecovery();
                    i29 = i14;
                    i19 = i38;
                    C18282h c18282hM36268d1 = AbstractC12889b.m36268d0(i19, new C18284j(i13, i29, 1));
                    Integer num6 = (Integer) interfaceC28601c1.getValue();
                    zM87151f = c28655q.m87151f(recovery);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R2 = new a(recovery);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(recovery);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    if ((i28 & 1879048192) == 536870912) {
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        selectedNumber = function1;
                        objM87133R3 = new C35657b0(selectedNumber, 25);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        selectedNumber = function1;
                        objM87133R3 = new C35657b0(selectedNumber, 25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC40020b.m128259l(c18282hM36268d1, num6, z13, interfaceC4339a2, (Function1) objM87133R3, c28655q, (i28 >> 18) & 896, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    num3 = num4;
                    z16 = z17;
                } else {
                    i29 = i14;
                    c28655q.m87138X();
                    z16 = z14;
                    num3 = num2;
                }
                i34 = i19;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i39 = i29;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC36897p.m118464e(question, context, level, i13, i39, i34, num3, z16, z13, selectedNumber, i16, i17, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i18 |= 1572864;
            num2 = num;
            i26 = i17 & 128;
            if (i26 != 0) {
                i18 |= 12582912;
                z14 = z4;
            } else {
                z14 = z4;
                if ((i16 & 12582912) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i18 |= i27;
                }
            }
            if ((i16 & 100663296) != 0) {
                if (c28655q.m87155h(z13)) {
                    i36 = 67108864;
                } else {
                    i36 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i36;
            }
            if ((i16 & 805306368) == 0) {
                if (c28655q.m87157i(selectedNumber)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i18 |= i35;
            }
            i28 = i18;
            if ((i28 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i28 & 1, z15)) {
                if (i37 != 0) {
                    i19 = 1;
                }
                if (i24 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i26 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(num4);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
                c36875c = C36875c.f157714a;
                if (z17) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f14 = fM118269a;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), f14, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                int i310 = i19;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i9 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i9, c22994r1M66759a4);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m4);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N4);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    C0209i c0209i11 = c0209i3;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    String strM21274h3 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t2, 1 * 8, 0.0f, 2);
                    C38072d c38072d3 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h3, modifierM3396r5, c38072d3.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f14, 0.0f, 2);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                    recovery = c38072d3.m121949b(c28655q, 6).getRecovery();
                    i29 = i14;
                    i19 = i310;
                    C18282h c18282hM36268d2 = AbstractC12889b.m36268d0(i19, new C18284j(i13, i29, 1));
                    Integer num7 = (Integer) interfaceC28601c2.getValue();
                    zM87151f = c28655q.m87151f(recovery);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R2 = new a(recovery);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(recovery);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    if ((i28 & 1879048192) == 536870912) {
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        selectedNumber = function1;
                        objM87133R3 = new C35657b0(selectedNumber, 25);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        selectedNumber = function1;
                        objM87133R3 = new C35657b0(selectedNumber, 25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC40020b.m128259l(c18282hM36268d2, num7, z13, interfaceC4339a3, (Function1) objM87133R3, c28655q, (i28 >> 18) & 896, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    num3 = num4;
                    z16 = z17;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i12 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N4);
                if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                C0209i c0209i13 = c0209i3;
                AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                String strM21274h4 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t2, 1 * 8, 0.0f, 2);
                C38072d c38072d4 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h4, modifierM3396r7, c38072d4.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
                c28655q.m87173q(true);
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f14, 0.0f, 2);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N6);
                recovery = c38072d4.m121949b(c28655q, 6).getRecovery();
                i29 = i14;
                i19 = i310;
                C18282h c18282hM36268d3 = AbstractC12889b.m36268d0(i19, new C18284j(i13, i29, 1));
                Integer num8 = (Integer) interfaceC28601c2.getValue();
                zM87151f = c28655q.m87151f(recovery);
                objM87133R2 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R2 = new a(recovery);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(recovery);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                if ((i28 & 1879048192) == 536870912) {
                }
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    selectedNumber = function1;
                    objM87133R3 = new C35657b0(selectedNumber, 25);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    selectedNumber = function1;
                    objM87133R3 = new C35657b0(selectedNumber, 25);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC40020b.m128259l(c18282hM36268d3, num8, z13, interfaceC4339a4, (Function1) objM87133R3, c28655q, (i28 >> 18) & 896, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                num3 = num4;
                z16 = z17;
            } else {
                i29 = i14;
                c28655q.m87138X();
                z16 = z14;
                num3 = num2;
            }
            i34 = i19;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i311 = i29;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC36897p.m118464e(question, context, level, i13, i311, i34, num3, z16, z13, selectedNumber, i16, i17, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i18 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i19 = i15;
        i24 = i17 & 64;
        if (i24 != 0) {
            if ((1572864 & i16) == 0) {
                num2 = num;
                if (c28655q.m87153g(num2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i18 |= i25;
            }
            i26 = i17 & 128;
            if (i26 != 0) {
                i18 |= 12582912;
                z14 = z4;
            } else {
                z14 = z4;
                if ((i16 & 12582912) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i18 |= i27;
                }
            }
            if ((i16 & 100663296) != 0) {
                if (c28655q.m87155h(z13)) {
                    i36 = 67108864;
                } else {
                    i36 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i18 |= i36;
            }
            if ((i16 & 805306368) == 0) {
                if (c28655q.m87157i(selectedNumber)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i18 |= i35;
            }
            i28 = i18;
            if ((i28 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i28 & 1, z15)) {
                if (i37 != 0) {
                    i19 = 1;
                }
                if (i24 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i26 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(num4);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                c36875c = C36875c.f157714a;
                if (z17) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f15 = fM118269a;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t3), f15, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                int i312 = i19;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i14 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a7);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m7);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i15 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N7);
                    if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    C0209i c0209i16 = c0209i3;
                    AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                    String strM21274h5 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                    Modifier modifierM3396r9 = AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2);
                    C38072d c38072d5 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h5, modifierM3396r9, c38072d5.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f15, 0.0f, 2);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3396r10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N8);
                    recovery = c38072d5.m121949b(c28655q, 6).getRecovery();
                    i29 = i14;
                    i19 = i312;
                    C18282h c18282hM36268d4 = AbstractC12889b.m36268d0(i19, new C18284j(i13, i29, 1));
                    Integer num9 = (Integer) interfaceC28601c3.getValue();
                    zM87151f = c28655q.m87151f(recovery);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R2 = new a(recovery);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(recovery);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    if ((i28 & 1879048192) == 536870912) {
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        selectedNumber = function1;
                        objM87133R3 = new C35657b0(selectedNumber, 25);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        selectedNumber = function1;
                        objM87133R3 = new C35657b0(selectedNumber, 25);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC40020b.m128259l(c18282hM36268d4, num9, z13, interfaceC4339a5, (Function1) objM87133R3, c28655q, (i28 >> 18) & 896, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    num3 = num4;
                    z16 = z17;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N7);
                if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                C0209i c0209i18 = c0209i3;
                AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                String strM21274h6 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                Modifier modifierM3396r11 = AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2);
                C38072d c38072d6 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h6, modifierM3396r11, c38072d6.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
                c28655q.m87173q(true);
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f15, 0.0f, 2);
                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3396r12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a9);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N9);
                recovery = c38072d6.m121949b(c28655q, 6).getRecovery();
                i29 = i14;
                i19 = i312;
                C18282h c18282hM36268d5 = AbstractC12889b.m36268d0(i19, new C18284j(i13, i29, 1));
                Integer num10 = (Integer) interfaceC28601c3.getValue();
                zM87151f = c28655q.m87151f(recovery);
                objM87133R2 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R2 = new a(recovery);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(recovery);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                if ((i28 & 1879048192) == 536870912) {
                }
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    selectedNumber = function1;
                    objM87133R3 = new C35657b0(selectedNumber, 25);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    selectedNumber = function1;
                    objM87133R3 = new C35657b0(selectedNumber, 25);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC40020b.m128259l(c18282hM36268d5, num10, z13, interfaceC4339a6, (Function1) objM87133R3, c28655q, (i28 >> 18) & 896, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                num3 = num4;
                z16 = z17;
            } else {
                i29 = i14;
                c28655q.m87138X();
                z16 = z14;
                num3 = num2;
            }
            i34 = i19;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i313 = i29;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC36897p.m118464e(question, context, level, i13, i313, i34, num3, z16, z13, selectedNumber, i16, i17, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i18 |= 1572864;
        num2 = num;
        i26 = i17 & 128;
        if (i26 != 0) {
            i18 |= 12582912;
            z14 = z4;
        } else {
            z14 = z4;
            if ((i16 & 12582912) == 0) {
                if (c28655q.m87155h(z14)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i18 |= i27;
            }
        }
        if ((i16 & 100663296) != 0) {
            if (c28655q.m87155h(z13)) {
                i36 = 67108864;
            } else {
                i36 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i18 |= i36;
        }
        if ((i16 & 805306368) == 0) {
            if (c28655q.m87157i(selectedNumber)) {
                i35 = 536870912;
            } else {
                i35 = 268435456;
            }
            i18 |= i35;
        }
        i28 = i18;
        if ((i28 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i28 & 1, z15)) {
            if (i37 != 0) {
                i19 = 1;
            }
            if (i24 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (i26 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(num4);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R;
            c36875c = C36875c.f157714a;
            if (z17) {
                fM118269a = c36875c.m118270b();
            } else {
                fM118269a = c36875c.m118269a();
            }
            float f16 = fM118269a;
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t4), f16, 0.0f, 0.0f, 0.0f, 14);
            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int i314 = i19;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i19 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i19, c22994r1M66759a10);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m10);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                c0209i3 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N10);
                if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                C0209i c0209i111 = c0209i3;
                AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
                String strM21274h7 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
                Modifier modifierM3396r13 = AbstractC1099a.m3396r(c2314t4, 1 * 8, 0.0f, 2);
                C38072d c38072d7 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h7, modifierM3396r13, c38072d7.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
                c28655q.m87173q(true);
                Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f16, 0.0f, 2);
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3396r14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N11);
                recovery = c38072d7.m121949b(c28655q, 6).getRecovery();
                i29 = i14;
                i19 = i314;
                C18282h c18282hM36268d6 = AbstractC12889b.m36268d0(i19, new C18284j(i13, i29, 1));
                Integer num11 = (Integer) interfaceC28601c4.getValue();
                zM87151f = c28655q.m87151f(recovery);
                objM87133R2 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R2 = new a(recovery);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(recovery);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                if ((i28 & 1879048192) == 536870912) {
                }
                objM87133R3 = c28655q.m87133R();
                if (z19) {
                    selectedNumber = function1;
                    objM87133R3 = new C35657b0(selectedNumber, 25);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    selectedNumber = function1;
                    objM87133R3 = new C35657b0(selectedNumber, 25);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC40020b.m128259l(c18282hM36268d6, num11, z13, interfaceC4339a7, (Function1) objM87133R3, c28655q, (i28 >> 18) & 896, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                num3 = num4;
                z16 = z17;
            } else {
                c0209i3 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            C0209i c0209i112 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N10);
            if (AbstractC8693b.m21274h(context, c28655q, (i28 >> 3) & 14).length() > 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            C0209i c0209i113 = c0209i3;
            AbstractC36907z.m118520c(question, context, z18, null, c28655q, i28 & 126, 8);
            String strM21274h8 = AbstractC8693b.m21274h(level, c28655q, (i28 >> 6) & 14);
            Modifier modifierM3396r15 = AbstractC1099a.m3396r(c2314t4, 1 * 8, 0.0f, 2);
            C38072d c38072d8 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h8, modifierM3396r15, c38072d8.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
            c28655q.m87173q(true);
            Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f16, 0.0f, 2);
            C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3396r16);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i19, c22994r1M66759a12);
            AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N12);
            recovery = c38072d8.m121949b(c28655q, 6).getRecovery();
            i29 = i14;
            i19 = i314;
            C18282h c18282hM36268d7 = AbstractC12889b.m36268d0(i19, new C18284j(i13, i29, 1));
            Integer num12 = (Integer) interfaceC28601c4.getValue();
            zM87151f = c28655q.m87151f(recovery);
            objM87133R2 = c28655q.m87133R();
            if (zM87151f) {
                objM87133R2 = new a(recovery);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(recovery);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
            if ((i28 & 1879048192) == 536870912) {
            }
            objM87133R3 = c28655q.m87133R();
            if (z19) {
                selectedNumber = function1;
                objM87133R3 = new C35657b0(selectedNumber, 25);
                c28655q.m87172p0(objM87133R3);
            } else {
                selectedNumber = function1;
                objM87133R3 = new C35657b0(selectedNumber, 25);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC40020b.m128259l(c18282hM36268d7, num12, z13, interfaceC4339a8, (Function1) objM87133R3, c28655q, (i28 >> 18) & 896, 0);
            c28655q = c28655q;
            c28655q.m87173q(true);
            num3 = num4;
            z16 = z17;
        } else {
            i29 = i14;
            c28655q.m87138X();
            z16 = z14;
            num3 = num2;
        }
        i34 = i19;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i315 = i29;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.o
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC36897p.m118464e(question, context, level, i13, i315, i34, num3, z16, z13, selectedNumber, i16, i17, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m118463d(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118464e(TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, int i14, int i15, Integer num, boolean z4, boolean z13, Function1 function1, int i16, int i17, Composer composer, int i18) {
        m118462c(textResource, textResource2, textResource3, i13, i14, i15, num, z4, z13, function1, composer, AbstractC28683x.m87244L(i16 | 1), i17);
        return C23454a0.f92919a;
    }
}
