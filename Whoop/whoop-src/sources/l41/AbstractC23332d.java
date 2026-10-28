package l41;

import android.content.Context;
import android.widget.TimePicker;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bs2.C3609b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gy0.AbstractC16277f;
import gy0.AbstractC16278g;
import io.sentry.RunnableC20277c7;
import kx1.C22881b;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p408q.C29660d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: l41.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a}\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"", "title", "", "is24Hour", "Lorg/joda/time/LocalTime;", "initialTime", "saveEnabled", "buttonText", "Li2/x;", "buttonColor", "Landroidx/compose/ui/Modifier;", "modifier", "keyboardEnabled", "Lkotlin/Function2;", "", "Ll83/a0;", "currentTime", "g", "(Ljava/lang/String;ZLorg/joda/time/LocalTime;ZLjava/lang/String;JLandroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23332d {
    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b A[PHI: r0 r3 r5 r6 r8 r9 r13 r15
      0x015b: PHI (r0v36 boolean) = (r0v12 boolean), (r0v41 boolean) binds: [B:138:0x01a0, B:114:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r3v21 androidx.compose.ui.Modifier) = (r3v4 androidx.compose.ui.Modifier), (r3v1 androidx.compose.ui.Modifier) binds: [B:138:0x01a0, B:114:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r5v19 boolean) = (r5v4 boolean), (r5v20 boolean) binds: [B:138:0x01a0, B:114:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r6v9 long) = (r6v3 long), (r6v1 long) binds: [B:138:0x01a0, B:114:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r8v12 org.joda.time.LocalTime) = (r8v8 org.joda.time.LocalTime), (r8v13 org.joda.time.LocalTime) binds: [B:138:0x01a0, B:114:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r9v12 java.lang.String) = (r9v7 java.lang.String), (r9v13 java.lang.String) binds: [B:138:0x01a0, B:114:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r13v17 java.lang.String) = (r13v9 java.lang.String), (r13v18 java.lang.String) binds: [B:138:0x01a0, B:114:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r15v16 int) = (r15v4 int), (r15v17 int) binds: [B:138:0x01a0, B:114:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171  */
    /* JADX WARN: Code duplicated, block: B:124:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x017a  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0188  */
    /* JADX WARN: Code duplicated, block: B:134:0x018e  */
    /* JADX WARN: Code duplicated, block: B:136:0x019c  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x020c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0210  */
    /* JADX WARN: Code duplicated, block: B:152:0x0223  */
    /* JADX WARN: Code duplicated, block: B:154:0x0231  */
    /* JADX WARN: Code duplicated, block: B:157:0x023b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x0296  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:178:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:184:0x030e  */
    /* JADX WARN: Code duplicated, block: B:185:0x031b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0336  */
    /* JADX WARN: Code duplicated, block: B:190:0x0348  */
    /* JADX WARN: Code duplicated, block: B:191:0x034a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0351 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0353  */
    /* JADX WARN: Code duplicated, block: B:198:0x0389  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:203:0x03be  */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX INFO: renamed from: g */
    public static final void m67560g(String str, boolean z4, LocalTime localTime, boolean z13, String str2, long j7, Modifier modifier, boolean z14, final InterfaceC4351m currentTime, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        LocalTime localTime2;
        int i17;
        int i18;
        boolean z15;
        int i19;
        final long jM125377a;
        int i24;
        Modifier modifier2;
        int i25;
        int i26;
        int i27;
        boolean z16;
        C28655q c28655q;
        final String str3;
        final boolean z17;
        final String str4;
        final Modifier modifier3;
        final LocalTime localTime3;
        final boolean z18;
        final boolean z19;
        C28677v1 c28677v1M87180u;
        int i28;
        C2314t c2314t;
        String strM92103Y;
        boolean z24;
        LocalTime localTime4;
        String strM92103Y2;
        String str5;
        boolean z25;
        int i29;
        boolean z26;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z27;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z28;
        int iHashCode;
        C0213j c0213j;
        boolean z29;
        C0209i c0209i;
        char c3;
        char c7;
        char c14;
        C2314t c2314t2;
        boolean z34;
        boolean z35;
        boolean z36;
        int i34;
        boolean z37;
        boolean z38;
        Object objM87133R3;
        boolean z39;
        Object objM87133R4;
        long j13;
        String str6;
        boolean z44;
        Object objM87133R5;
        int i35;
        int i36;
        AbstractC22676k.m65750j(currentTime, "currentTime");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(319157222);
        if ((i13 & 6) == 0) {
            i15 = (((i14 & 1) == 0 && c28655q2.m87153g(str)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i37 = i14 & 2;
        if (i37 == 0) {
            if ((i13 & 48) == 0) {
                i15 |= c28655q2.m87155h(z4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    localTime2 = localTime;
                    if (c28655q2.m87157i(localTime2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z15 = z13;
                        if (c28655q2.m87155h(z15)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & 24576) != 0) {
                        i15 |= ((i14 & 16) == 0 || !c28655q2.m87153g(str2)) ? DfuBaseService.ERROR_REMOTE_MASK : DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        jM125377a = j7;
                        if ((i14 & 32) == 0 || !c28655q2.m87151f(jM125377a)) {
                            i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        } else {
                            i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        }
                        i15 |= i36;
                    } else {
                        jM125377a = j7;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87153g(modifier2)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                        }
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87155h(z14)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(currentTime)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z16)) {
                        c28655q2.m87140Z();
                        i28 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i28 != 0 || c28655q2.m87118C()) {
                            if ((i14 & 1) != 0) {
                                strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                                i15 &= -15;
                            } else {
                                strM92103Y = str;
                            }
                            if (i37 != 0) {
                                z24 = false;
                            } else {
                                z24 = z4;
                            }
                            if (i16 != 0) {
                                localTime4 = null;
                            } else {
                                localTime4 = localTime2;
                            }
                            if (i18 != 0) {
                                z15 = true;
                            }
                            if ((i14 & 16) != 0) {
                                strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                                i15 &= -57345;
                            } else {
                                strM92103Y2 = str2;
                            }
                            if ((i14 & 32) != 0) {
                                jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                                i15 &= -458753;
                            }
                            if (i24 != 0) {
                                modifier2 = c2314t;
                            }
                            str5 = strM92103Y;
                            z25 = z15;
                            i29 = i15;
                            if (i26 != 0) {
                                z26 = true;
                            }
                            c28655q2.m87175r();
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(-1);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            z27 = z25;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(-1);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                            Modifier modifierM3394p = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
                            Modifier modifier4 = modifier2;
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                            z28 = z26;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            z29 = z24;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                            if (z27 || str5 == null) {
                                c3 = 0;
                                c7 = 2048;
                                c14 = 0;
                                c28655q = c28655q2;
                                c2314t2 = c2314t;
                                c28655q.m87150e0(-219783706);
                                c28655q.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-219937776);
                                C38072d c38072d = C38072d.f163053a;
                                C2886a c2886aM8420a = c38072d.m121952e(c28655q2, 6).getB1();
                                c14 = 0;
                                c2314t2 = c2314t;
                                c7 = 2048;
                                c3 = 0;
                                AbstractC30795n.m94707h(str5, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, i29 & 14, 0, 196602);
                                c28655q = c28655q2;
                                c28655q.m87173q(false);
                            }
                            if ((29360128 & i29) == c3) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            boolean zM87157i = c28655q.m87157i(localTime4) | z34;
                            if ((i29 & 112) == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z45 = zM87157i | z35;
                            if ((i29 & 7168) == c7) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            boolean z46 = z45 | z36;
                            i34 = 234881024 & i29;
                            if (i34 == c14) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                            z38 = z46 | z37;
                            objM87133R3 = c28655q.m87133R();
                            if (!z38 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                                z39 = z28;
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                z39 = z28;
                            }
                            Function1 function1 = (Function1) objM87133R3;
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == r40) {
                                objM87133R4 = new C22881b(26);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC1137a.m3601a(function1, null, (Function1) objM87133R4, c28655q, 384, 2);
                            if (z27) {
                                c28655q.m87150e0(-218630971);
                                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                                EnumC27284v enumC27284v = EnumC27284v.TextMedium;
                                if (i34 == 67108864) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objM87133R5 = c28655q.m87133R();
                                if (z44 || objM87133R5 == r40) {
                                    objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                int i38 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                                j13 = jM125377a;
                                str6 = strM92103Y2;
                                C28655q c28655q3 = c28655q;
                                AbstractC27282u.m82292h(modifierM3409f, enumC27284v, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q3, i38, 104);
                                c28655q = c28655q3;
                                c28655q.m87173q(false);
                            } else {
                                j13 = jM125377a;
                                str6 = strM92103Y2;
                                c28655q.m87150e0(-218353242);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            z18 = z27;
                            localTime3 = localTime4;
                            str4 = str6;
                            jM125377a = j13;
                            str3 = str5;
                            z17 = z29;
                            z19 = z39;
                            modifier3 = modifier4;
                        } else {
                            c28655q2.m87138X();
                            if ((i14 & 1) != 0) {
                                i15 &= -15;
                            }
                            if ((i14 & 16) != 0) {
                                i15 &= -57345;
                            }
                            if ((i14 & 32) != 0) {
                                i15 &= -458753;
                            }
                            str5 = str;
                            z24 = z4;
                            localTime4 = localTime2;
                            z25 = z15;
                            strM92103Y2 = str2;
                            i29 = i15;
                        }
                        z26 = z14;
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(-1);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        z27 = z25;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(-1);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        Modifier modifierM3394p2 = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
                        Modifier modifier5 = modifier2;
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                        z28 = z26;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        z29 = z24;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                        if (z27) {
                            c3 = 0;
                            c7 = 2048;
                            c14 = 0;
                            c28655q = c28655q2;
                            c2314t2 = c2314t;
                            c28655q.m87150e0(-219783706);
                            c28655q.m87173q(false);
                        } else {
                            c3 = 0;
                            c7 = 2048;
                            c14 = 0;
                            c28655q = c28655q2;
                            c2314t2 = c2314t;
                            c28655q.m87150e0(-219783706);
                            c28655q.m87173q(false);
                        }
                        if ((29360128 & i29) == c3) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean zM87157i2 = c28655q.m87157i(localTime4) | z34;
                        if ((i29 & 112) == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z47 = zM87157i2 | z35;
                        if ((i29 & 7168) == c7) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z48 = z47 | z36;
                        i34 = 234881024 & i29;
                        if (i34 == c14) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        z38 = z48 | z37;
                        objM87133R3 = c28655q.m87133R();
                        if (z38) {
                            objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                            z39 = z28;
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                            z39 = z28;
                            c28655q.m87172p0(objM87133R3);
                        }
                        Function1 function2 = (Function1) objM87133R3;
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == r40) {
                            objM87133R4 = new C22881b(26);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC1137a.m3601a(function2, null, (Function1) objM87133R4, c28655q, 384, 2);
                        if (z27) {
                            c28655q.m87150e0(-218630971);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                            EnumC27284v enumC27284v2 = EnumC27284v.TextMedium;
                            if (i34 == 67108864) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z44) {
                                objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i39 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                            j13 = jM125377a;
                            str6 = strM92103Y2;
                            C28655q c28655q4 = c28655q;
                            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q4, i39, 104);
                            c28655q = c28655q4;
                            c28655q.m87173q(false);
                        } else {
                            j13 = jM125377a;
                            str6 = strM92103Y2;
                            c28655q.m87150e0(-218353242);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z18 = z27;
                        localTime3 = localTime4;
                        str4 = str6;
                        jM125377a = j13;
                        str3 = str5;
                        z17 = z29;
                        z19 = z39;
                        modifier3 = modifier5;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        str3 = str;
                        z17 = z4;
                        str4 = str2;
                        modifier3 = modifier2;
                        localTime3 = localTime2;
                        z18 = z15;
                        z19 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l41.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                return AbstractC23332d.m67566m(str3, z17, localTime3, z18, str4, jM125377a, modifier3, z19, currentTime, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        };
                    }
                }
                i15 |= 3072;
                z15 = z13;
                if ((i13 & 24576) != 0) {
                    i15 |= ((i14 & 16) == 0 || !c28655q2.m87153g(str2)) ? DfuBaseService.ERROR_REMOTE_MASK : DfuBaseService.ERROR_CONNECTION_MASK;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    jM125377a = j7;
                    if ((i14 & 32) == 0) {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i36;
                } else {
                    jM125377a = j7;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(modifier2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(currentTime)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                if ((i15 & 38347923) != 38347922) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    c28655q2.m87140Z();
                    i28 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        if ((i14 & 1) != 0) {
                            strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                            i15 &= -15;
                        } else {
                            strM92103Y = str;
                        }
                        if (i37 != 0) {
                            z24 = false;
                        } else {
                            z24 = z4;
                        }
                        if (i16 != 0) {
                            localTime4 = null;
                        } else {
                            localTime4 = localTime2;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if ((i14 & 16) != 0) {
                            strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                            i15 &= -57345;
                        } else {
                            strM92103Y2 = str2;
                        }
                        if ((i14 & 32) != 0) {
                            jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                            i15 &= -458753;
                        }
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        str5 = strM92103Y;
                        z25 = z15;
                        i29 = i15;
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z14;
                        }
                    } else {
                        if ((i14 & 1) != 0) {
                            strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                            i15 &= -15;
                        } else {
                            strM92103Y = str;
                        }
                        if (i37 != 0) {
                            z24 = false;
                        } else {
                            z24 = z4;
                        }
                        if (i16 != 0) {
                            localTime4 = null;
                        } else {
                            localTime4 = localTime2;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if ((i14 & 16) != 0) {
                            strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                            i15 &= -57345;
                        } else {
                            strM92103Y2 = str2;
                        }
                        if ((i14 & 32) != 0) {
                            jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                            i15 &= -458753;
                        }
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        str5 = strM92103Y;
                        z25 = z15;
                        i29 = i15;
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z14;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(-1);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(-1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    Modifier modifierM3394p3 = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
                    Modifier modifier6 = modifier2;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    z28 = z26;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3394p3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    z29 = z24;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    if (z27) {
                        c3 = 0;
                        c7 = 2048;
                        c14 = 0;
                        c28655q = c28655q2;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-219783706);
                        c28655q.m87173q(false);
                    } else {
                        c3 = 0;
                        c7 = 2048;
                        c14 = 0;
                        c28655q = c28655q2;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-219783706);
                        c28655q.m87173q(false);
                    }
                    if ((29360128 & i29) == c3) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87157i3 = c28655q.m87157i(localTime4) | z34;
                    if ((i29 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z49 = zM87157i3 | z35;
                    if ((i29 & 7168) == c7) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z410 = z49 | z36;
                    i34 = 234881024 & i29;
                    if (i34 == c14) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z410 | z37;
                    objM87133R3 = c28655q.m87133R();
                    if (z38) {
                        objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                        z39 = z28;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                        z39 = z28;
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function3 = (Function1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == r40) {
                        objM87133R4 = new C22881b(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC1137a.m3601a(function3, null, (Function1) objM87133R4, c28655q, 384, 2);
                    if (z27) {
                        c28655q.m87150e0(-218630971);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        EnumC27284v enumC27284v3 = EnumC27284v.TextMedium;
                        if (i34 == 67108864) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z44) {
                            objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i310 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                        j13 = jM125377a;
                        str6 = strM92103Y2;
                        C28655q c28655q5 = c28655q;
                        AbstractC27282u.m82292h(modifierM3409f3, enumC27284v3, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q5, i310, 104);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    } else {
                        j13 = jM125377a;
                        str6 = strM92103Y2;
                        c28655q.m87150e0(-218353242);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z18 = z27;
                    localTime3 = localTime4;
                    str4 = str6;
                    jM125377a = j13;
                    str3 = str5;
                    z17 = z29;
                    z19 = z39;
                    modifier3 = modifier6;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str3 = str;
                    z17 = z4;
                    str4 = str2;
                    modifier3 = modifier2;
                    localTime3 = localTime2;
                    z18 = z15;
                    z19 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC23332d.m67566m(str3, z17, localTime3, z18, str4, jM125377a, modifier3, z19, currentTime, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 384;
            localTime2 = localTime;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q2.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) != 0) {
                    i15 |= ((i14 & 16) == 0 || !c28655q2.m87153g(str2)) ? DfuBaseService.ERROR_REMOTE_MASK : DfuBaseService.ERROR_CONNECTION_MASK;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    jM125377a = j7;
                    if ((i14 & 32) == 0) {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i36;
                } else {
                    jM125377a = j7;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(modifier2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(currentTime)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                if ((i15 & 38347923) != 38347922) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    c28655q2.m87140Z();
                    i28 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        if ((i14 & 1) != 0) {
                            strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                            i15 &= -15;
                        } else {
                            strM92103Y = str;
                        }
                        if (i37 != 0) {
                            z24 = false;
                        } else {
                            z24 = z4;
                        }
                        if (i16 != 0) {
                            localTime4 = null;
                        } else {
                            localTime4 = localTime2;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if ((i14 & 16) != 0) {
                            strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                            i15 &= -57345;
                        } else {
                            strM92103Y2 = str2;
                        }
                        if ((i14 & 32) != 0) {
                            jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                            i15 &= -458753;
                        }
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        str5 = strM92103Y;
                        z25 = z15;
                        i29 = i15;
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z14;
                        }
                    } else {
                        if ((i14 & 1) != 0) {
                            strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                            i15 &= -15;
                        } else {
                            strM92103Y = str;
                        }
                        if (i37 != 0) {
                            z24 = false;
                        } else {
                            z24 = z4;
                        }
                        if (i16 != 0) {
                            localTime4 = null;
                        } else {
                            localTime4 = localTime2;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if ((i14 & 16) != 0) {
                            strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                            i15 &= -57345;
                        } else {
                            strM92103Y2 = str2;
                        }
                        if ((i14 & 32) != 0) {
                            jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                            i15 &= -458753;
                        }
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        str5 = strM92103Y;
                        z25 = z15;
                        i29 = i15;
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z14;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(-1);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(-1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    Modifier modifierM3394p4 = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
                    Modifier modifier7 = modifier2;
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    z28 = z26;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3394p4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    z29 = z24;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    if (z27) {
                        c3 = 0;
                        c7 = 2048;
                        c14 = 0;
                        c28655q = c28655q2;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-219783706);
                        c28655q.m87173q(false);
                    } else {
                        c3 = 0;
                        c7 = 2048;
                        c14 = 0;
                        c28655q = c28655q2;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-219783706);
                        c28655q.m87173q(false);
                    }
                    if ((29360128 & i29) == c3) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87157i4 = c28655q.m87157i(localTime4) | z34;
                    if ((i29 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z411 = zM87157i4 | z35;
                    if ((i29 & 7168) == c7) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z412 = z411 | z36;
                    i34 = 234881024 & i29;
                    if (i34 == c14) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z412 | z37;
                    objM87133R3 = c28655q.m87133R();
                    if (z38) {
                        objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                        z39 = z28;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                        z39 = z28;
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function4 = (Function1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == r40) {
                        objM87133R4 = new C22881b(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC1137a.m3601a(function4, null, (Function1) objM87133R4, c28655q, 384, 2);
                    if (z27) {
                        c28655q.m87150e0(-218630971);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        EnumC27284v enumC27284v4 = EnumC27284v.TextMedium;
                        if (i34 == 67108864) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z44) {
                            objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i311 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                        j13 = jM125377a;
                        str6 = strM92103Y2;
                        C28655q c28655q6 = c28655q;
                        AbstractC27282u.m82292h(modifierM3409f4, enumC27284v4, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q6, i311, 104);
                        c28655q = c28655q6;
                        c28655q.m87173q(false);
                    } else {
                        j13 = jM125377a;
                        str6 = strM92103Y2;
                        c28655q.m87150e0(-218353242);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z18 = z27;
                    localTime3 = localTime4;
                    str4 = str6;
                    jM125377a = j13;
                    str3 = str5;
                    z17 = z29;
                    z19 = z39;
                    modifier3 = modifier7;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str3 = str;
                    z17 = z4;
                    str4 = str2;
                    modifier3 = modifier2;
                    localTime3 = localTime2;
                    z18 = z15;
                    z19 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC23332d.m67566m(str3, z17, localTime3, z18, str4, jM125377a, modifier3, z19, currentTime, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i13 & 24576) != 0) {
                i15 |= ((i14 & 16) == 0 || !c28655q2.m87153g(str2)) ? DfuBaseService.ERROR_REMOTE_MASK : DfuBaseService.ERROR_CONNECTION_MASK;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                jM125377a = j7;
                if ((i14 & 32) == 0) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i36;
            } else {
                jM125377a = j7;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(currentTime)) {
                    i35 = 67108864;
                } else {
                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i35;
            }
            if ((i15 & 38347923) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                c28655q2.m87140Z();
                i28 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    if ((i14 & 1) != 0) {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                        i15 &= -15;
                    } else {
                        strM92103Y = str;
                    }
                    if (i37 != 0) {
                        z24 = false;
                    } else {
                        z24 = z4;
                    }
                    if (i16 != 0) {
                        localTime4 = null;
                    } else {
                        localTime4 = localTime2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                        i15 &= -57345;
                    } else {
                        strM92103Y2 = str2;
                    }
                    if ((i14 & 32) != 0) {
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                        i15 &= -458753;
                    }
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    str5 = strM92103Y;
                    z25 = z15;
                    i29 = i15;
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z14;
                    }
                } else {
                    if ((i14 & 1) != 0) {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                        i15 &= -15;
                    } else {
                        strM92103Y = str;
                    }
                    if (i37 != 0) {
                        z24 = false;
                    } else {
                        z24 = z4;
                    }
                    if (i16 != 0) {
                        localTime4 = null;
                    } else {
                        localTime4 = localTime2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                        i15 &= -57345;
                    } else {
                        strM92103Y2 = str2;
                    }
                    if ((i14 & 32) != 0) {
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                        i15 &= -458753;
                    }
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    str5 = strM92103Y;
                    z25 = z15;
                    i29 = i15;
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z14;
                    }
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(-1);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                z27 = z25;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(-1);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                Modifier modifierM3394p5 = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
                Modifier modifier8 = modifier2;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                z28 = z26;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3394p5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                z29 = z24;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                if (z27) {
                    c3 = 0;
                    c7 = 2048;
                    c14 = 0;
                    c28655q = c28655q2;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-219783706);
                    c28655q.m87173q(false);
                } else {
                    c3 = 0;
                    c7 = 2048;
                    c14 = 0;
                    c28655q = c28655q2;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-219783706);
                    c28655q.m87173q(false);
                }
                if ((29360128 & i29) == c3) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87157i5 = c28655q.m87157i(localTime4) | z34;
                if ((i29 & 112) == 32) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z413 = zM87157i5 | z35;
                if ((i29 & 7168) == c7) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z414 = z413 | z36;
                i34 = 234881024 & i29;
                if (i34 == c14) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z414 | z37;
                objM87133R3 = c28655q.m87133R();
                if (z38) {
                    objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                    z39 = z28;
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                    z39 = z28;
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function5 = (Function1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == r40) {
                    objM87133R4 = new C22881b(26);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC1137a.m3601a(function5, null, (Function1) objM87133R4, c28655q, 384, 2);
                if (z27) {
                    c28655q.m87150e0(-218630971);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    EnumC27284v enumC27284v5 = EnumC27284v.TextMedium;
                    if (i34 == 67108864) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z44) {
                        objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i312 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                    j13 = jM125377a;
                    str6 = strM92103Y2;
                    C28655q c28655q7 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f5, enumC27284v5, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q7, i312, 104);
                    c28655q = c28655q7;
                    c28655q.m87173q(false);
                } else {
                    j13 = jM125377a;
                    str6 = strM92103Y2;
                    c28655q.m87150e0(-218353242);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z18 = z27;
                localTime3 = localTime4;
                str4 = str6;
                jM125377a = j13;
                str3 = str5;
                z17 = z29;
                z19 = z39;
                modifier3 = modifier8;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str;
                z17 = z4;
                str4 = str2;
                modifier3 = modifier2;
                localTime3 = localTime2;
                z18 = z15;
                z19 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l41.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC23332d.m67566m(str3, z17, localTime3, z18, str4, jM125377a, modifier3, z19, currentTime, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                localTime2 = localTime;
                if (c28655q2.m87157i(localTime2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q2.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) != 0) {
                    i15 |= ((i14 & 16) == 0 || !c28655q2.m87153g(str2)) ? DfuBaseService.ERROR_REMOTE_MASK : DfuBaseService.ERROR_CONNECTION_MASK;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    jM125377a = j7;
                    if ((i14 & 32) == 0) {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i36;
                } else {
                    jM125377a = j7;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(modifier2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(currentTime)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                if ((i15 & 38347923) != 38347922) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z16)) {
                    c28655q2.m87140Z();
                    i28 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        if ((i14 & 1) != 0) {
                            strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                            i15 &= -15;
                        } else {
                            strM92103Y = str;
                        }
                        if (i37 != 0) {
                            z24 = false;
                        } else {
                            z24 = z4;
                        }
                        if (i16 != 0) {
                            localTime4 = null;
                        } else {
                            localTime4 = localTime2;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if ((i14 & 16) != 0) {
                            strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                            i15 &= -57345;
                        } else {
                            strM92103Y2 = str2;
                        }
                        if ((i14 & 32) != 0) {
                            jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                            i15 &= -458753;
                        }
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        str5 = strM92103Y;
                        z25 = z15;
                        i29 = i15;
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z14;
                        }
                    } else {
                        if ((i14 & 1) != 0) {
                            strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                            i15 &= -15;
                        } else {
                            strM92103Y = str;
                        }
                        if (i37 != 0) {
                            z24 = false;
                        } else {
                            z24 = z4;
                        }
                        if (i16 != 0) {
                            localTime4 = null;
                        } else {
                            localTime4 = localTime2;
                        }
                        if (i18 != 0) {
                            z15 = true;
                        }
                        if ((i14 & 16) != 0) {
                            strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                            i15 &= -57345;
                        } else {
                            strM92103Y2 = str2;
                        }
                        if ((i14 & 32) != 0) {
                            jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                            i15 &= -458753;
                        }
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        str5 = strM92103Y;
                        z25 = z15;
                        i29 = i15;
                        if (i26 != 0) {
                            z26 = true;
                        } else {
                            z26 = z14;
                        }
                    }
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(-1);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    z27 = z25;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(-1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    Modifier modifierM3394p6 = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
                    Modifier modifier9 = modifier2;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    z28 = z26;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3394p6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    z29 = z24;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                    if (z27) {
                        c3 = 0;
                        c7 = 2048;
                        c14 = 0;
                        c28655q = c28655q2;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-219783706);
                        c28655q.m87173q(false);
                    } else {
                        c3 = 0;
                        c7 = 2048;
                        c14 = 0;
                        c28655q = c28655q2;
                        c2314t2 = c2314t;
                        c28655q.m87150e0(-219783706);
                        c28655q.m87173q(false);
                    }
                    if ((29360128 & i29) == c3) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zM87157i6 = c28655q.m87157i(localTime4) | z34;
                    if ((i29 & 112) == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z415 = zM87157i6 | z35;
                    if ((i29 & 7168) == c7) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z416 = z415 | z36;
                    i34 = 234881024 & i29;
                    if (i34 == c14) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = z416 | z37;
                    objM87133R3 = c28655q.m87133R();
                    if (z38) {
                        objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                        z39 = z28;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                        z39 = z28;
                        c28655q.m87172p0(objM87133R3);
                    }
                    Function1 function6 = (Function1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == r40) {
                        objM87133R4 = new C22881b(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC1137a.m3601a(function6, null, (Function1) objM87133R4, c28655q, 384, 2);
                    if (z27) {
                        c28655q.m87150e0(-218630971);
                        Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        EnumC27284v enumC27284v6 = EnumC27284v.TextMedium;
                        if (i34 == 67108864) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z44) {
                            objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i313 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                        j13 = jM125377a;
                        str6 = strM92103Y2;
                        C28655q c28655q8 = c28655q;
                        AbstractC27282u.m82292h(modifierM3409f6, enumC27284v6, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q8, i313, 104);
                        c28655q = c28655q8;
                        c28655q.m87173q(false);
                    } else {
                        j13 = jM125377a;
                        str6 = strM92103Y2;
                        c28655q.m87150e0(-218353242);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z18 = z27;
                    localTime3 = localTime4;
                    str4 = str6;
                    jM125377a = j13;
                    str3 = str5;
                    z17 = z29;
                    z19 = z39;
                    modifier3 = modifier9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str3 = str;
                    z17 = z4;
                    str4 = str2;
                    modifier3 = modifier2;
                    localTime3 = localTime2;
                    z18 = z15;
                    z19 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l41.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC23332d.m67566m(str3, z17, localTime3, z18, str4, jM125377a, modifier3, z19, currentTime, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i13 & 24576) != 0) {
                i15 |= ((i14 & 16) == 0 || !c28655q2.m87153g(str2)) ? DfuBaseService.ERROR_REMOTE_MASK : DfuBaseService.ERROR_CONNECTION_MASK;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                jM125377a = j7;
                if ((i14 & 32) == 0) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i36;
            } else {
                jM125377a = j7;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(currentTime)) {
                    i35 = 67108864;
                } else {
                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i35;
            }
            if ((i15 & 38347923) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                c28655q2.m87140Z();
                i28 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    if ((i14 & 1) != 0) {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                        i15 &= -15;
                    } else {
                        strM92103Y = str;
                    }
                    if (i37 != 0) {
                        z24 = false;
                    } else {
                        z24 = z4;
                    }
                    if (i16 != 0) {
                        localTime4 = null;
                    } else {
                        localTime4 = localTime2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                        i15 &= -57345;
                    } else {
                        strM92103Y2 = str2;
                    }
                    if ((i14 & 32) != 0) {
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                        i15 &= -458753;
                    }
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    str5 = strM92103Y;
                    z25 = z15;
                    i29 = i15;
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z14;
                    }
                } else {
                    if ((i14 & 1) != 0) {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                        i15 &= -15;
                    } else {
                        strM92103Y = str;
                    }
                    if (i37 != 0) {
                        z24 = false;
                    } else {
                        z24 = z4;
                    }
                    if (i16 != 0) {
                        localTime4 = null;
                    } else {
                        localTime4 = localTime2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                        i15 &= -57345;
                    } else {
                        strM92103Y2 = str2;
                    }
                    if ((i14 & 32) != 0) {
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                        i15 &= -458753;
                    }
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    str5 = strM92103Y;
                    z25 = z15;
                    i29 = i15;
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z14;
                    }
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(-1);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                z27 = z25;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(-1);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                Modifier modifierM3394p7 = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
                Modifier modifier10 = modifier2;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                z28 = z26;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3394p7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                z29 = z24;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                if (z27) {
                    c3 = 0;
                    c7 = 2048;
                    c14 = 0;
                    c28655q = c28655q2;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-219783706);
                    c28655q.m87173q(false);
                } else {
                    c3 = 0;
                    c7 = 2048;
                    c14 = 0;
                    c28655q = c28655q2;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-219783706);
                    c28655q.m87173q(false);
                }
                if ((29360128 & i29) == c3) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87157i7 = c28655q.m87157i(localTime4) | z34;
                if ((i29 & 112) == 32) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z417 = zM87157i7 | z35;
                if ((i29 & 7168) == c7) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z418 = z417 | z36;
                i34 = 234881024 & i29;
                if (i34 == c14) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z418 | z37;
                objM87133R3 = c28655q.m87133R();
                if (z38) {
                    objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                    z39 = z28;
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                    z39 = z28;
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function7 = (Function1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == r40) {
                    objM87133R4 = new C22881b(26);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC1137a.m3601a(function7, null, (Function1) objM87133R4, c28655q, 384, 2);
                if (z27) {
                    c28655q.m87150e0(-218630971);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    EnumC27284v enumC27284v7 = EnumC27284v.TextMedium;
                    if (i34 == 67108864) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z44) {
                        objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i314 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                    j13 = jM125377a;
                    str6 = strM92103Y2;
                    C28655q c28655q9 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f7, enumC27284v7, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q9, i314, 104);
                    c28655q = c28655q9;
                    c28655q.m87173q(false);
                } else {
                    j13 = jM125377a;
                    str6 = strM92103Y2;
                    c28655q.m87150e0(-218353242);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z18 = z27;
                localTime3 = localTime4;
                str4 = str6;
                jM125377a = j13;
                str3 = str5;
                z17 = z29;
                z19 = z39;
                modifier3 = modifier10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str;
                z17 = z4;
                str4 = str2;
                modifier3 = modifier2;
                localTime3 = localTime2;
                z18 = z15;
                z19 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l41.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC23332d.m67566m(str3, z17, localTime3, z18, str4, jM125377a, modifier3, z19, currentTime, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 384;
        localTime2 = localTime;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z15 = z13;
                if (c28655q2.m87155h(z15)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) != 0) {
                i15 |= ((i14 & 16) == 0 || !c28655q2.m87153g(str2)) ? DfuBaseService.ERROR_REMOTE_MASK : DfuBaseService.ERROR_CONNECTION_MASK;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                jM125377a = j7;
                if ((i14 & 32) == 0) {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i36;
            } else {
                jM125377a = j7;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(modifier2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(currentTime)) {
                    i35 = 67108864;
                } else {
                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i35;
            }
            if ((i15 & 38347923) != 38347922) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z16)) {
                c28655q2.m87140Z();
                i28 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    if ((i14 & 1) != 0) {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                        i15 &= -15;
                    } else {
                        strM92103Y = str;
                    }
                    if (i37 != 0) {
                        z24 = false;
                    } else {
                        z24 = z4;
                    }
                    if (i16 != 0) {
                        localTime4 = null;
                    } else {
                        localTime4 = localTime2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                        i15 &= -57345;
                    } else {
                        strM92103Y2 = str2;
                    }
                    if ((i14 & 32) != 0) {
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                        i15 &= -458753;
                    }
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    str5 = strM92103Y;
                    z25 = z15;
                    i29 = i15;
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z14;
                    }
                } else {
                    if ((i14 & 1) != 0) {
                        strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                        i15 &= -15;
                    } else {
                        strM92103Y = str;
                    }
                    if (i37 != 0) {
                        z24 = false;
                    } else {
                        z24 = z4;
                    }
                    if (i16 != 0) {
                        localTime4 = null;
                    } else {
                        localTime4 = localTime2;
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if ((i14 & 16) != 0) {
                        strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                        i15 &= -57345;
                    } else {
                        strM92103Y2 = str2;
                    }
                    if ((i14 & 32) != 0) {
                        jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                        i15 &= -458753;
                    }
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    str5 = strM92103Y;
                    z25 = z15;
                    i29 = i15;
                    if (i26 != 0) {
                        z26 = true;
                    } else {
                        z26 = z14;
                    }
                }
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(-1);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                z27 = z25;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(-1);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                Modifier modifierM3394p8 = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
                Modifier modifier11 = modifier2;
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                z28 = z26;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3394p8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                z29 = z24;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                if (z27) {
                    c3 = 0;
                    c7 = 2048;
                    c14 = 0;
                    c28655q = c28655q2;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-219783706);
                    c28655q.m87173q(false);
                } else {
                    c3 = 0;
                    c7 = 2048;
                    c14 = 0;
                    c28655q = c28655q2;
                    c2314t2 = c2314t;
                    c28655q.m87150e0(-219783706);
                    c28655q.m87173q(false);
                }
                if ((29360128 & i29) == c3) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zM87157i8 = c28655q.m87157i(localTime4) | z34;
                if ((i29 & 112) == 32) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z419 = zM87157i8 | z35;
                if ((i29 & 7168) == c7) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z4110 = z419 | z36;
                i34 = 234881024 & i29;
                if (i34 == c14) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = z4110 | z37;
                objM87133R3 = c28655q.m87133R();
                if (z38) {
                    objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                    z39 = z28;
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                    z39 = z28;
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function8 = (Function1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == r40) {
                    objM87133R4 = new C22881b(26);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC1137a.m3601a(function8, null, (Function1) objM87133R4, c28655q, 384, 2);
                if (z27) {
                    c28655q.m87150e0(-218630971);
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    EnumC27284v enumC27284v8 = EnumC27284v.TextMedium;
                    if (i34 == 67108864) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z44) {
                        objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i315 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                    j13 = jM125377a;
                    str6 = strM92103Y2;
                    C28655q c28655q10 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f8, enumC27284v8, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q10, i315, 104);
                    c28655q = c28655q10;
                    c28655q.m87173q(false);
                } else {
                    j13 = jM125377a;
                    str6 = strM92103Y2;
                    c28655q.m87150e0(-218353242);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z18 = z27;
                localTime3 = localTime4;
                str4 = str6;
                jM125377a = j13;
                str3 = str5;
                z17 = z29;
                z19 = z39;
                modifier3 = modifier11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str;
                z17 = z4;
                str4 = str2;
                modifier3 = modifier2;
                localTime3 = localTime2;
                z18 = z15;
                z19 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l41.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC23332d.m67566m(str3, z17, localTime3, z18, str4, jM125377a, modifier3, z19, currentTime, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 3072;
        z15 = z13;
        if ((i13 & 24576) != 0) {
            i15 |= ((i14 & 16) == 0 || !c28655q2.m87153g(str2)) ? DfuBaseService.ERROR_REMOTE_MASK : DfuBaseService.ERROR_CONNECTION_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            jM125377a = j7;
            if ((i14 & 32) == 0) {
                i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                i36 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i36;
        } else {
            jM125377a = j7;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(modifier2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q2.m87155h(z14)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q2.m87157i(currentTime)) {
                i35 = 67108864;
            } else {
                i35 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i35;
        }
        if ((i15 & 38347923) != 38347922) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z16)) {
            c28655q2.m87140Z();
            i28 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i28 != 0) {
                if ((i14 & 1) != 0) {
                    strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                    i15 &= -15;
                } else {
                    strM92103Y = str;
                }
                if (i37 != 0) {
                    z24 = false;
                } else {
                    z24 = z4;
                }
                if (i16 != 0) {
                    localTime4 = null;
                } else {
                    localTime4 = localTime2;
                }
                if (i18 != 0) {
                    z15 = true;
                }
                if ((i14 & 16) != 0) {
                    strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                    i15 &= -57345;
                } else {
                    strM92103Y2 = str2;
                }
                if ((i14 & 32) != 0) {
                    jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                    i15 &= -458753;
                }
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                str5 = strM92103Y;
                z25 = z15;
                i29 = i15;
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z14;
                }
            } else {
                if ((i14 & 1) != 0) {
                    strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62220B2);
                    i15 &= -15;
                } else {
                    strM92103Y = str;
                }
                if (i37 != 0) {
                    z24 = false;
                } else {
                    z24 = z4;
                }
                if (i16 != 0) {
                    localTime4 = null;
                } else {
                    localTime4 = localTime2;
                }
                if (i18 != 0) {
                    z15 = true;
                }
                if ((i14 & 16) != 0) {
                    strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62216A2);
                    i15 &= -57345;
                } else {
                    strM92103Y2 = str2;
                }
                if ((i14 & 32) != 0) {
                    jM125377a = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
                    i15 &= -458753;
                }
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                str5 = strM92103Y;
                z25 = z15;
                i29 = i15;
                if (i26 != 0) {
                    z26 = true;
                } else {
                    z26 = z14;
                }
            }
            c28655q2.m87175r();
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(-1);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            z27 = z25;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(-1);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Modifier modifierM3394p9 = AbstractC1099a.m3394p(4 * 8, AbstractC1102d.m3409f(1.0f, modifier2));
            Modifier modifier12 = modifier2;
            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            z28 = z26;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3394p9);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            z29 = z24;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a9);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m9);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N9);
            if (z27) {
                c3 = 0;
                c7 = 2048;
                c14 = 0;
                c28655q = c28655q2;
                c2314t2 = c2314t;
                c28655q.m87150e0(-219783706);
                c28655q.m87173q(false);
            } else {
                c3 = 0;
                c7 = 2048;
                c14 = 0;
                c28655q = c28655q2;
                c2314t2 = c2314t;
                c28655q.m87150e0(-219783706);
                c28655q.m87173q(false);
            }
            if ((29360128 & i29) == c3) {
                z34 = true;
            } else {
                z34 = false;
            }
            boolean zM87157i9 = c28655q.m87157i(localTime4) | z34;
            if ((i29 & 112) == 32) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean z4111 = zM87157i9 | z35;
            if ((i29 & 7168) == c7) {
                z36 = true;
            } else {
                z36 = false;
            }
            boolean z4112 = z4111 | z36;
            i34 = 234881024 & i29;
            if (i34 == c14) {
                z37 = true;
            } else {
                z37 = false;
            }
            z38 = z4112 | z37;
            objM87133R3 = c28655q.m87133R();
            if (z38) {
                objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                z39 = z28;
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3609b(z28, localTime4, interfaceC28601c1, interfaceC28601c2, z29, z27, currentTime);
                z39 = z28;
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function9 = (Function1) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == r40) {
                objM87133R4 = new C22881b(26);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC1137a.m3601a(function9, null, (Function1) objM87133R4, c28655q, 384, 2);
            if (z27) {
                c28655q.m87150e0(-218630971);
                Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t2);
                EnumC27284v enumC27284v9 = EnumC27284v.TextMedium;
                if (i34 == 67108864) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z44) {
                    objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C23329a(currentTime, interfaceC28601c1, interfaceC28601c2, 0);
                    c28655q.m87172p0(objM87133R5);
                }
                int i316 = ((i29 >> 6) & 896) | 54 | ((i29 >> 3) & 57344);
                j13 = jM125377a;
                str6 = strM92103Y2;
                C28655q c28655q11 = c28655q;
                AbstractC27282u.m82292h(modifierM3409f9, enumC27284v9, str6, false, j13, null, false, (InterfaceC4339a) objM87133R5, c28655q11, i316, 104);
                c28655q = c28655q11;
                c28655q.m87173q(false);
            } else {
                j13 = jM125377a;
                str6 = strM92103Y2;
                c28655q.m87150e0(-218353242);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            z18 = z27;
            localTime3 = localTime4;
            str4 = str6;
            jM125377a = j13;
            str3 = str5;
            z17 = z29;
            z19 = z39;
            modifier3 = modifier12;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str3 = str;
            z17 = z4;
            str4 = str2;
            modifier3 = modifier2;
            localTime3 = localTime2;
            z18 = z15;
            z19 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l41.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC23332d.m67566m(str3, z17, localTime3, z18, str4, jM125377a, modifier3, z19, currentTime, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final TimePicker m67561h(boolean z4, LocalTime localTime, final InterfaceC28601c1 interfaceC28601c1, final InterfaceC28601c1 interfaceC28601c2, boolean z13, final boolean z14, final InterfaceC4351m interfaceC4351m, Context context) {
        AbstractC22676k.m65750j(context, "context");
        int i13 = z4 ? AbstractC16278g.f62409d : AbstractC16278g.f62410e;
        TimePicker timePicker = new TimePicker(new C29660d(context, i13), null, i13);
        if (localTime != null) {
            timePicker.setHour(localTime.getHourOfDay());
            timePicker.setMinute(localTime.getMinuteOfHour());
        }
        interfaceC28601c1.setValue(Integer.valueOf(timePicker.getHour()));
        interfaceC28601c2.setValue(Integer.valueOf(timePicker.getMinute()));
        timePicker.setIs24HourView(Boolean.valueOf(z13));
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: l41.c
            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker2, int i14, int i15) {
                AbstractC23332d.m67562i(interfaceC28601c1, interfaceC28601c2, z14, interfaceC4351m, timePicker2, i14, i15);
            }
        });
        return timePicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m67562i(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4, InterfaceC4351m interfaceC4351m, TimePicker timePicker, int i13, int i14) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
        interfaceC28601c2.setValue(Integer.valueOf(i14));
        if (z4) {
            return;
        }
        interfaceC4351m.invoke(interfaceC28601c1.getValue(), interfaceC28601c2.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m67563j(TimePicker timePicker) {
        AbstractC22676k.m65750j(timePicker, "timePicker");
        timePicker.post(new RunnableC20277c7(timePicker, 24));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m67564k(TimePicker timePicker) {
        timePicker.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m67565l(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        interfaceC4351m.invoke(interfaceC28601c1.getValue(), interfaceC28601c2.getValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m67566m(String str, boolean z4, LocalTime localTime, boolean z13, String str2, long j7, Modifier modifier, boolean z14, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m67560g(str, z4, localTime, z13, str2, j7, modifier, z14, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
