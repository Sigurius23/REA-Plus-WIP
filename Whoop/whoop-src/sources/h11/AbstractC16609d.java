package h11;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b30.C2663y4;
import c93.InterfaceC4339a;
import cz0.C11251l;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13989w1;
import p163g1.AbstractC15005f3;
import p163g1.C15079m3;
import p208i2.C17893k;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h11.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001aA\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, m65681d2 = {"Lh11/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "automationTag", "e", "(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "j", "()F", "DATE_PILL_WIDTH", "b", "getDATE_PILL_HEIGHT", "DATE_PILL_HEIGHT", "c", "k", "MULTI_DAY_CYCLE_PILL_WIDTH", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16609d {

    /* JADX INFO: renamed from: a */
    private static final float f63884a = 44;

    /* JADX INFO: renamed from: b */
    private static final float f63885b = 70;

    /* JADX INFO: renamed from: c */
    private static final float f63886c = 80;

    /* JADX INFO: renamed from: h11.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63887a;

        static {
            int[] iArr = new int[EnumC16612g.values().length];
            try {
                iArr[EnumC16612g.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16612g.COMPLETED_JOURNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16612g.INCOMPLETE_JOURNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16612g.NO_APPOINTMENTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC16612g.HAS_APPOINTMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f63887a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0169  */
    /* JADX WARN: Code duplicated, block: B:103:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:0x0178  */
    /* JADX WARN: Code duplicated, block: B:108:0x0181  */
    /* JADX WARN: Code duplicated, block: B:110:0x0185  */
    /* JADX WARN: Code duplicated, block: B:114:0x0190  */
    /* JADX WARN: Code duplicated, block: B:115:0x0192  */
    /* JADX WARN: Code duplicated, block: B:118:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x019c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x01da  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:135:0x0209  */
    /* JADX WARN: Code duplicated, block: B:138:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x021c  */
    /* JADX WARN: Code duplicated, block: B:142:0x024d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0251  */
    /* JADX WARN: Code duplicated, block: B:146:0x0264  */
    /* JADX WARN: Code duplicated, block: B:148:0x0272  */
    /* JADX WARN: Code duplicated, block: B:151:0x0288  */
    /* JADX WARN: Code duplicated, block: B:153:0x028d  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:165:0x030a  */
    /* JADX WARN: Code duplicated, block: B:166:0x030e  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0329  */
    /* JADX WARN: Code duplicated, block: B:174:0x0335  */
    /* JADX WARN: Code duplicated, block: B:175:0x0352  */
    /* JADX WARN: Code duplicated, block: B:177:0x0369  */
    /* JADX WARN: Code duplicated, block: B:179:0x037d  */
    /* JADX WARN: Code duplicated, block: B:183:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:186:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:193:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:196:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:197:0x0401  */
    /* JADX WARN: Code duplicated, block: B:200:0x040e  */
    /* JADX WARN: Code duplicated, block: B:202:0x041c  */
    /* JADX WARN: Code duplicated, block: B:205:0x042c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0440  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:212:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:215:0x051f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0537  */
    /* JADX WARN: Code duplicated, block: B:218:0x056d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0575  */
    /* JADX WARN: Code duplicated, block: B:223:0x0585  */
    /* JADX WARN: Code duplicated, block: B:225:0x0593  */
    /* JADX WARN: Code duplicated, block: B:228:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:229:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:233:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:236:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:239:0x060f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0613  */
    /* JADX WARN: Code duplicated, block: B:243:0x0622  */
    /* JADX WARN: Code duplicated, block: B:247:0x0634  */
    /* JADX WARN: Code duplicated, block: B:250:0x0641  */
    /* JADX WARN: Code duplicated, block: B:252:0x0657  */
    /* JADX WARN: Code duplicated, block: B:255:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:257:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:261:0x0718  */
    /* JADX WARN: Code duplicated, block: B:263:0x0735  */
    /* JADX WARN: Code duplicated, block: B:264:0x0754  */
    /* JADX WARN: Code duplicated, block: B:266:0x0761  */
    /* JADX WARN: Code duplicated, block: B:268:0x076d  */
    /* JADX WARN: Code duplicated, block: B:270:0x077e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0793  */
    /* JADX WARN: Code duplicated, block: B:274:0x0796  */
    /* JADX WARN: Code duplicated, block: B:276:0x0799  */
    /* JADX WARN: Code duplicated, block: B:278:0x079c  */
    /* JADX WARN: Code duplicated, block: B:279:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:280:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:281:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:282:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:284:0x0803  */
    /* JADX WARN: Code duplicated, block: B:288:0x0839  */
    /* JADX WARN: Code duplicated, block: B:289:0x083d  */
    /* JADX WARN: Code duplicated, block: B:292:0x084a  */
    /* JADX WARN: Code duplicated, block: B:294:0x0858  */
    /* JADX WARN: Code duplicated, block: B:299:0x086d  */
    /* JADX WARN: Code duplicated, block: B:300:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:302:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:304:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:307:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:88:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0154  */
    /* JADX WARN: Code duplicated, block: B:98:0x0157  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m47136e(C16613h viewState, Function1 onClick, Modifier modifier, String str, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        String str2;
        int i17;
        boolean z4;
        Modifier modifier3;
        String str3;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3362g;
        Modifier modifier4;
        C17919x c17919xM31989h;
        String str4;
        boolean z13;
        float f13;
        C38072d c38072d;
        long white50;
        float f14;
        float f15;
        float f16;
        char c3;
        boolean z14;
        EnumC16612g style;
        EnumC16612g enumC16612g;
        boolean z15;
        String contentDescription;
        boolean zM87153g;
        Object objM87133R;
        Modifier modifierM51775c;
        float f17;
        C16613h c16613h;
        Modifier modifier5;
        float f18;
        long j7;
        C2314t c2314t;
        boolean z16;
        boolean zM87151f;
        Object objM87133R2;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int i18;
        float f19;
        float f24;
        float f25;
        C2305k c2305k;
        float f26;
        int iHashCode2;
        int iHashCode3;
        EnumC16313m0 icon;
        boolean z17;
        long jM73366B;
        C0209i c0209i5;
        char c7;
        C38072d c38072d2;
        LayoutWeightElement layoutWeightElement;
        C22957g c22957g;
        int iHashCode4;
        int i19;
        boolean z18;
        long white30;
        int i24;
        boolean z19;
        long white31;
        C16606a multiDayCycleDateDisplay;
        int iHashCode5;
        C0213j c0213j2;
        long j13;
        C38072d c38072d3;
        C0213j c0213j3;
        int iHashCode6;
        C38072d c38072d4;
        int i25;
        boolean z24;
        long white32;
        C0209i c0209i6;
        C0209i c0209i7;
        boolean z25;
        int i26;
        boolean z26;
        long white33;
        Modifier modifier6;
        InterfaceC39332e dotColorOverride;
        C17919x c17919x;
        boolean z27;
        long accentAction;
        Modifier modifierM3358c;
        int i27;
        int iHashCode7;
        boolean z28;
        float f27;
        boolean z29;
        boolean z34;
        boolean z35;
        Object objM87133R3;
        Float fValueOf = Float.valueOf(1.0f);
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-255947318);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
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
                    modifierM3362g = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier4 = modifierM3362g;
                    } else {
                        modifier4 = modifier2;
                    }
                    c17919xM31989h = null;
                    if (i16 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (viewState.getMultiDayCycleDateDisplay() != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        f13 = 6;
                    } else {
                        f13 = 10;
                    }
                    C33252i c33252iM105489e = AbstractC33253j.m105489e(f13 * 4);
                    c38072d = C38072d.f163053a;
                    white50 = c38072d.m121949b(c28655q, 6).getWhite50();
                    if (viewState.getMultiDayCycleDateDisplay() != null) {
                        f14 = 5;
                        f15 = 4;
                    } else {
                        f14 = 4;
                        f15 = 8;
                    }
                    f16 = f14 * f15;
                    if (viewState.getIsClickable()) {
                        c3 = '\b';
                        if (viewState.getStyle() == EnumC16612g.INVALID && !viewState.getIsSelected()) {
                            z14 = true;
                        }
                        style = viewState.getStyle();
                        enumC16612g = EnumC16612g.INVALID;
                        if (style != enumC16612g || viewState.getStyle() == EnumC16612g.NO_APPOINTMENTS) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        Modifier modifierM44101d = AbstractC15676d.m44101d(modifier4, str4);
                        contentDescription = viewState.getContentDescription();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (contentDescription == null) {
                            c28655q.m87150e0(-1358534295);
                            c28655q.m87173q(false);
                            modifierM51775c = null;
                        } else {
                            c28655q.m87150e0(-1358534294);
                            zM87153g = c28655q.m87153g(contentDescription);
                            objM87133R = c28655q.m87133R();
                            if (zM87153g || objM87133R == c28676v0) {
                                objM87133R = new C2663y4(contentDescription, 27);
                                c28655q.m87172p0(objM87133R);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
                            c28655q.m87173q(false);
                        }
                        if (modifierM51775c == null) {
                            modifierM51775c = modifierM3362g;
                        }
                        Modifier modifierMo3471e = modifierM44101d.mo3471e(modifierM51775c);
                        if (z13) {
                            f17 = f63886c;
                        } else {
                            f17 = f63884a;
                        }
                        Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f63885b, AbstractC1102d.m3424u(f17, modifierMo3471e)), c33252iM105489e);
                        if (z14) {
                            c28655q.m87150e0(-1357835771);
                            if ((i15 & 14) != 4) {
                                if ((i15 & 8) != 0) {
                                    c16613h = viewState;
                                    if (c28655q.m87157i(c16613h)) {
                                    }
                                    if ((i15 & 112) == 32) {
                                        z34 = true;
                                    } else {
                                        z34 = false;
                                    }
                                    z35 = z34 | z29;
                                    objM87133R3 = c28655q.m87133R();
                                    if (z35 || objM87133R3 == c28676v0) {
                                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                                        c28655q.m87172p0(objM87133R3);
                                    }
                                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                                    modifier5 = modifierM3362g;
                                    c28655q.m87173q(false);
                                } else {
                                    c16613h = viewState;
                                }
                                z29 = false;
                                if ((i15 & 112) == 32) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                z35 = z34 | z29;
                                objM87133R3 = c28655q.m87133R();
                                if (z35) {
                                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                                modifier5 = modifierM3362g;
                                c28655q.m87173q(false);
                            } else {
                                c16613h = viewState;
                            }
                            z29 = true;
                            if ((i15 & 112) == 32) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z34 | z29;
                            objM87133R3 = c28655q.m87133R();
                            if (z35) {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            }
                            modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                            modifier5 = modifierM3362g;
                            c28655q.m87173q(false);
                        } else {
                            c16613h = viewState;
                            modifier5 = modifierM3362g;
                            c28655q.m87150e0(-1357441048);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierMo3471e2 = modifierM118994r.mo3471e(modifierM3362g);
                        f18 = 1;
                        if (c16613h.getIsSelected()) {
                            j7 = C17919x.f69629f;
                        } else {
                            j7 = C17919x.f69636m;
                        }
                        c2314t = modifier5;
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierMo3471e2, f18, j7, c33252iM105489e), c38072d.m121949b(c28655q, 6).getWhite10(), c33252iM105489e);
                        if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(c16613h))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87151f = z16 | c28655q.m87151f(white50) | c28655q.m87147d(f16);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87151f || objM87133R2 == c28676v0) {
                            objM87133R2 = new C11251l(c16613h, white50, f16);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3478a = AbstractC1125a.m3478a(modifierM3358c2, (Function1) objM87133R2);
                        c2307m = C2299e.f9102E;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3478a);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                        if (c16613h.getIcon() != null) {
                            f19 = 0;
                            i18 = 4;
                        } else {
                            i18 = 4;
                            f19 = 4 * f18;
                        }
                        f24 = 2;
                        float f28 = i18;
                        f25 = f24 * f28;
                        Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3407d, f19, f25);
                        C22961h c22961h = AbstractC22977m.f90654e;
                        c2305k = C2299e.f9111N;
                        String str5 = str4;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
                        f26 = f28;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, C2299e.f9108K, c28655q, 54);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        icon = viewState.getIcon();
                        if (icon == null) {
                            c28655q.m87150e0(1031411324);
                            c28655q.m87173q(false);
                            c0209i5 = c0209i3;
                            c7 = 4;
                            c38072d2 = c38072d;
                        } else {
                            C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q, 1031411325, icon, c28655q, 6);
                            if (a.f63887a[viewState.getStyle().ordinal()] == 1) {
                                c28655q.m87150e0(-2064203619);
                                jM73366B = c38072d.m121949b(c28655q, 6).getWhite30();
                                z17 = false;
                                c28655q.m87173q(false);
                            } else {
                                z17 = false;
                                jM73366B = AbstractC25012a.m73366B(c28655q, -2064201632, c38072d, c28655q, 6);
                                c28655q.m87173q(false);
                            }
                            c0209i5 = c0209i3;
                            c7 = 4;
                            c38072d2 = c38072d;
                            AbstractC15005f3.m43108b(c27430eM53378s, null, AbstractC1102d.m3419p(5 * f26, c2314t), jM73366B, c28655q, 432, 0);
                            c28655q.m87173q(z17);
                        }
                        if (z13) {
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f27 = Float.MAX_VALUE;
                            } else {
                                f27 = 1.0f;
                            }
                            layoutWeightElement = new LayoutWeightElement(f27, true);
                        } else {
                            layoutWeightElement = r0;
                        }
                        c22957g = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        String day = viewState.getDateDisplay().getDay();
                        if (z15) {
                            c28655q.m87150e0(-1366323109);
                            i19 = 6;
                            white30 = c38072d2.m121949b(c28655q, 6).getWhite90();
                            z18 = false;
                        } else {
                            i19 = 6;
                            z18 = false;
                            c28655q.m87150e0(-1366322117);
                            white30 = c38072d2.m121949b(c28655q, 6).getWhite30();
                        }
                        c28655q.m87173q(z18);
                        i24 = i19;
                        AbstractC30795n.m94707h(day, null, white30, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d2.m121952e(c28655q, i19).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                        String date = viewState.getDateDisplay().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        if (z15) {
                            white31 = AbstractC25012a.m73366B(c28655q, -1366308066, c38072d2, c28655q, i24);
                            z19 = false;
                        } else {
                            z19 = false;
                            c28655q.m87150e0(-1366306981);
                            white31 = c38072d2.m121949b(c28655q, i24).getWhite30();
                        }
                        c28655q.m87173q(z19);
                        AbstractC30795n.m94707h(date, null, white31, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q, i24).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        multiDayCycleDateDisplay = viewState.getMultiDayCycleDateDisplay();
                        if (multiDayCycleDateDisplay == null) {
                            c28655q.m87150e0(1033122803);
                            c28655q.m87173q(false);
                            c38072d4 = c38072d2;
                            c0209i6 = c0209i4;
                            z25 = true;
                            c0213j3 = c0213j;
                            c0209i7 = c0209i;
                            modifier6 = c2314t;
                        } else {
                            c28655q.m87150e0(1033122804);
                            float f29 = f18 * f26;
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f29, c2314t));
                            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                            iHashCode5 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c0213j2 = c0213j;
                                c28655q.m87163l(c0213j2);
                            } else {
                                c0213j2 = c0213j;
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                            AbstractC11266d.m30469w(i24, f26, c2314t, c28655q);
                            if (z14) {
                                j13 = C17919x.f69629f;
                            } else {
                                j13 = C17919x.f69627d;
                            }
                            f26 = f26;
                            c38072d3 = c38072d2;
                            C2314t c2314t2 = c2314t;
                            c0213j3 = c0213j2;
                            AbstractC15751g.m44449b(AbstractC1102d.m3411h((float) 1.8d, AbstractC1102d.m3424u(f26, c2314t)), j13, 0.0f, 0.0f, c28655q, 6, 12);
                            AbstractC30007c.m91851u(c2314t2, 8, c28655q, true);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f29, c2314t2));
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                            iHashCode6 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
                            c0209i2 = c0209i2;
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                            String day2 = multiDayCycleDateDisplay.getDay();
                            if (z15) {
                                c28655q.m87150e0(842438654);
                                c38072d4 = c38072d3;
                                i25 = 6;
                                white32 = c38072d4.m121949b(c28655q, 6).getWhite90();
                                z24 = false;
                            } else {
                                c38072d4 = c38072d3;
                                i25 = 6;
                                z24 = false;
                                c28655q.m87150e0(842439646);
                                white32 = c38072d4.m121949b(c28655q, 6).getWhite30();
                            }
                            c28655q.m87173q(z24);
                            c0209i6 = c0209i4;
                            c0209i7 = c0209i;
                            z25 = true;
                            AbstractC30795n.m94707h(day2, null, white32, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d4.m121952e(c28655q, i25).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                            String date2 = multiDayCycleDateDisplay.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                            if (z15) {
                                i26 = 6;
                                white33 = AbstractC25012a.m73366B(c28655q, 842454657, c38072d4, c28655q, 6);
                                z26 = false;
                            } else {
                                i26 = 6;
                                z26 = false;
                                c28655q.m87150e0(842455742);
                                white33 = c38072d4.m121949b(c28655q, 6).getWhite30();
                            }
                            c28655q.m87173q(z26);
                            AbstractC30795n.m94707h(date2, null, white33, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d4.m121952e(c28655q, i26).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            modifier6 = c2314t2;
                        }
                        c28655q.m87173q(z25);
                        if (viewState.getShowDot()) {
                            c28655q.m87150e0(-304955583);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18 * f26, modifier6));
                            Modifier modifierM3419p = AbstractC1102d.m3419p(f26 * f26, modifier6);
                            if (viewState.getStyle() == enumC16612g) {
                                c28655q.m87150e0(-304750208);
                                modifierM3358c = AbstractC15751g.m44455h(modifier6, f18, c38072d4.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f25));
                                z27 = false;
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-304420554);
                                dotColorOverride = viewState.getDotColorOverride();
                                if (dotColorOverride == null) {
                                    c28655q.m87150e0(-304321696);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(2068393153);
                                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, dotColorOverride.mo134584toComposableColorWaAFU9c(c28655q, 0));
                                }
                                c17919x = c17919xM31989h;
                                if (c17919x == null) {
                                    c28655q.m87150e0(-304242242);
                                    i27 = a.f63887a[viewState.getStyle().ordinal()];
                                    if (i27 != 2) {
                                        z27 = false;
                                        c28655q.m87150e0(2068399066);
                                        accentAction = c38072d4.m121949b(c28655q, 6).getAccentAction();
                                        c28655q.m87173q(false);
                                    } else if (i27 != 3) {
                                        z27 = false;
                                        c28655q.m87150e0(2068402613);
                                        accentAction = c38072d4.m121949b(c28655q, 6).getWhite30();
                                        c28655q.m87173q(false);
                                    } else if (i27 != 4) {
                                        z27 = false;
                                        c28655q.m87150e0(2068405908);
                                        accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                        c28655q.m87173q(false);
                                    } else if (i27 != 5) {
                                        c28655q.m87150e0(2068411732);
                                        accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                        z27 = false;
                                        c28655q.m87173q(false);
                                    } else {
                                        z27 = false;
                                        c28655q.m87150e0(2068409175);
                                        accentAction = c38072d4.m121949b(c28655q, 6).getCoachBlue();
                                        c28655q.m87173q(false);
                                    }
                                    c28655q.m87173q(z27);
                                } else {
                                    z27 = false;
                                    c28655q.m87150e0(2068392895);
                                    c28655q.m87173q(false);
                                    accentAction = c17919x.f69639a;
                                }
                                modifierM3358c = AbstractC1092a.m3358c(modifier6, accentAction, AbstractC33253j.m105489e(r16));
                                c28655q.m87173q(z27);
                            }
                            Modifier modifierMo3471e3 = modifierM3419p.mo3471e(modifierM3358c);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z27);
                            iHashCode7 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N7);
                            if (viewState.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                                c28655q.m87150e0(1939249771);
                                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 54), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62314d), AbstractC1102d.m3419p(r16, modifier6), c38072d4.m121949b(c28655q, 6).getBrandBlack(), c28655q, 384, 0);
                                z28 = false;
                                c28655q.m87173q(false);
                            } else {
                                z28 = false;
                                c28655q.m87150e0(1939803989);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z25);
                            c28655q.m87173q(z28);
                        } else {
                            c28655q.m87150e0(-302753932);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z25);
                        c28655q.m87173q(z25);
                        modifier3 = modifier4;
                        str3 = str5;
                    } else {
                        c3 = '\b';
                    }
                    z14 = false;
                    style = viewState.getStyle();
                    enumC16612g = EnumC16612g.INVALID;
                    if (style != enumC16612g) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(modifier4, str4);
                    contentDescription = viewState.getContentDescription();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (contentDescription == null) {
                        c28655q.m87150e0(-1358534295);
                        c28655q.m87173q(false);
                        modifierM51775c = null;
                    } else {
                        c28655q.m87150e0(-1358534294);
                        zM87153g = c28655q.m87153g(contentDescription);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = new C2663y4(contentDescription, 27);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2663y4(contentDescription, 27);
                            c28655q.m87172p0(objM87133R);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
                        c28655q.m87173q(false);
                    }
                    if (modifierM51775c == null) {
                        modifierM51775c = modifierM3362g;
                    }
                    Modifier modifierMo3471e4 = modifierM44101d2.mo3471e(modifierM51775c);
                    if (z13) {
                        f17 = f63886c;
                    } else {
                        f17 = f63884a;
                    }
                    Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f63885b, AbstractC1102d.m3424u(f17, modifierMo3471e4)), c33252iM105489e);
                    if (z14) {
                        c28655q.m87150e0(-1357835771);
                        if ((i15 & 14) != 4) {
                            if ((i15 & 8) != 0) {
                                c16613h = viewState;
                                if (c28655q.m87157i(c16613h)) {
                                }
                                if ((i15 & 112) == 32) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                z35 = z34 | z29;
                                objM87133R3 = c28655q.m87133R();
                                if (z35) {
                                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                                modifier5 = modifierM3362g;
                                c28655q.m87173q(false);
                            } else {
                                c16613h = viewState;
                            }
                            z29 = false;
                            if ((i15 & 112) == 32) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z34 | z29;
                            objM87133R3 = c28655q.m87133R();
                            if (z35) {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            }
                            modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                            modifier5 = modifierM3362g;
                            c28655q.m87173q(false);
                        } else {
                            c16613h = viewState;
                        }
                        z29 = true;
                        if ((i15 & 112) == 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = z34 | z29;
                        objM87133R3 = c28655q.m87133R();
                        if (z35) {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        modifier5 = modifierM3362g;
                        c28655q.m87173q(false);
                    } else {
                        c16613h = viewState;
                        modifier5 = modifierM3362g;
                        c28655q.m87150e0(-1357441048);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e5 = modifierM118994r2.mo3471e(modifierM3362g);
                    f18 = 1;
                    if (c16613h.getIsSelected()) {
                        j7 = C17919x.f69629f;
                    } else {
                        j7 = C17919x.f69636m;
                    }
                    c2314t = modifier5;
                    Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierMo3471e5, f18, j7, c33252iM105489e), c38072d.m121949b(c28655q, 6).getWhite10(), c33252iM105489e);
                    if ((i15 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    zM87151f = z16 | c28655q.m87151f(white50) | c28655q.m87147d(f16);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R2 = new C11251l(c16613h, white50, f16);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C11251l(c16613h, white50, f16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3478a2 = AbstractC1125a.m3478a(modifierM3358c3, (Function1) objM87133R2);
                    c2307m = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3478a2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (c16613h.getIcon() != null) {
                        f19 = 0;
                        i18 = 4;
                    } else {
                        i18 = 4;
                        f19 = 4 * f18;
                    }
                    f24 = 2;
                    float f210 = i18;
                    f25 = f24 * f210;
                    Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3407d2, f19, f25);
                    C22961h c22961h2 = AbstractC22977m.f90654e;
                    c2305k = C2299e.f9111N;
                    String str6 = str4;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22961h2, c2305k, c28655q, 54);
                    f26 = f210;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, C2299e.f9108K, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                    icon = viewState.getIcon();
                    if (icon == null) {
                        c28655q.m87150e0(1031411324);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i3;
                        c7 = 4;
                        c38072d2 = c38072d;
                    } else {
                        C27430e c27430eM53378s2 = AbstractC18489d0.m53378s(c28655q, 1031411325, icon, c28655q, 6);
                        if (a.f63887a[viewState.getStyle().ordinal()] == 1) {
                            c28655q.m87150e0(-2064203619);
                            jM73366B = c38072d.m121949b(c28655q, 6).getWhite30();
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            z17 = false;
                            jM73366B = AbstractC25012a.m73366B(c28655q, -2064201632, c38072d, c28655q, 6);
                            c28655q.m87173q(false);
                        }
                        c0209i5 = c0209i3;
                        c7 = 4;
                        c38072d2 = c38072d;
                        AbstractC15005f3.m43108b(c27430eM53378s2, null, AbstractC1102d.m3419p(5 * f26, c2314t), jM73366B, c28655q, 432, 0);
                        c28655q.m87173q(z17);
                    }
                    if (z13) {
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f27 = Float.MAX_VALUE;
                        } else {
                            f27 = 1.0f;
                        }
                        layoutWeightElement = new LayoutWeightElement(f27, true);
                    } else {
                        layoutWeightElement = r0;
                    }
                    c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                    String day3 = viewState.getDateDisplay().getDay();
                    if (z15) {
                        c28655q.m87150e0(-1366323109);
                        i19 = 6;
                        white30 = c38072d2.m121949b(c28655q, 6).getWhite90();
                        z18 = false;
                    } else {
                        i19 = 6;
                        z18 = false;
                        c28655q.m87150e0(-1366322117);
                        white30 = c38072d2.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z18);
                    i24 = i19;
                    AbstractC30795n.m94707h(day3, null, white30, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d2.m121952e(c28655q, i19).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                    String date3 = viewState.getDateDisplay().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    if (z15) {
                        white31 = AbstractC25012a.m73366B(c28655q, -1366308066, c38072d2, c28655q, i24);
                        z19 = false;
                    } else {
                        z19 = false;
                        c28655q.m87150e0(-1366306981);
                        white31 = c38072d2.m121949b(c28655q, i24).getWhite30();
                    }
                    c28655q.m87173q(z19);
                    AbstractC30795n.m94707h(date3, null, white31, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q, i24).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    multiDayCycleDateDisplay = viewState.getMultiDayCycleDateDisplay();
                    if (multiDayCycleDateDisplay == null) {
                        c28655q.m87150e0(1033122803);
                        c28655q.m87173q(false);
                        c38072d4 = c38072d2;
                        c0209i6 = c0209i4;
                        z25 = true;
                        c0213j3 = c0213j;
                        c0209i7 = c0209i;
                        modifier6 = c2314t;
                    } else {
                        c28655q.m87150e0(1033122804);
                        float f211 = f18 * f26;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f211, c2314t));
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                        iHashCode5 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c0213j2 = c0213j;
                            c28655q.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                        AbstractC11266d.m30469w(i24, f26, c2314t, c28655q);
                        if (z14) {
                            j13 = C17919x.f69629f;
                        } else {
                            j13 = C17919x.f69627d;
                        }
                        f26 = f26;
                        c38072d3 = c38072d2;
                        C2314t c2314t3 = c2314t;
                        c0213j3 = c0213j2;
                        AbstractC15751g.m44449b(AbstractC1102d.m3411h((float) 1.8d, AbstractC1102d.m3424u(f26, c2314t)), j13, 0.0f, 0.0f, c28655q, 6, 12);
                        AbstractC30007c.m91851u(c2314t3, 8, c28655q, true);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f211, c2314t3));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                        iHashCode6 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a8);
                        c0209i2 = c0209i2;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                        String day4 = multiDayCycleDateDisplay.getDay();
                        if (z15) {
                            c28655q.m87150e0(842438654);
                            c38072d4 = c38072d3;
                            i25 = 6;
                            white32 = c38072d4.m121949b(c28655q, 6).getWhite90();
                            z24 = false;
                        } else {
                            c38072d4 = c38072d3;
                            i25 = 6;
                            z24 = false;
                            c28655q.m87150e0(842439646);
                            white32 = c38072d4.m121949b(c28655q, 6).getWhite30();
                        }
                        c28655q.m87173q(z24);
                        c0209i6 = c0209i4;
                        c0209i7 = c0209i;
                        z25 = true;
                        AbstractC30795n.m94707h(day4, null, white32, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d4.m121952e(c28655q, i25).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                        String date4 = multiDayCycleDateDisplay.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        if (z15) {
                            i26 = 6;
                            white33 = AbstractC25012a.m73366B(c28655q, 842454657, c38072d4, c28655q, 6);
                            z26 = false;
                        } else {
                            i26 = 6;
                            z26 = false;
                            c28655q.m87150e0(842455742);
                            white33 = c38072d4.m121949b(c28655q, 6).getWhite30();
                        }
                        c28655q.m87173q(z26);
                        AbstractC30795n.m94707h(date4, null, white33, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d4.m121952e(c28655q, i26).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier6 = c2314t3;
                    }
                    c28655q.m87173q(z25);
                    if (viewState.getShowDot()) {
                        c28655q.m87150e0(-304955583);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18 * f26, modifier6));
                        Modifier modifierM3419p2 = AbstractC1102d.m3419p(f26 * f26, modifier6);
                        if (viewState.getStyle() == enumC16612g) {
                            c28655q.m87150e0(-304750208);
                            modifierM3358c = AbstractC15751g.m44455h(modifier6, f18, c38072d4.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f25));
                            z27 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-304420554);
                            dotColorOverride = viewState.getDotColorOverride();
                            if (dotColorOverride == null) {
                                c28655q.m87150e0(-304321696);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(2068393153);
                                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, dotColorOverride.mo134584toComposableColorWaAFU9c(c28655q, 0));
                            }
                            c17919x = c17919xM31989h;
                            if (c17919x == null) {
                                c28655q.m87150e0(-304242242);
                                i27 = a.f63887a[viewState.getStyle().ordinal()];
                                if (i27 != 2) {
                                    z27 = false;
                                    c28655q.m87150e0(2068399066);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getAccentAction();
                                    c28655q.m87173q(false);
                                } else if (i27 != 3) {
                                    z27 = false;
                                    c28655q.m87150e0(2068402613);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getWhite30();
                                    c28655q.m87173q(false);
                                } else if (i27 != 4) {
                                    z27 = false;
                                    c28655q.m87150e0(2068405908);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                    c28655q.m87173q(false);
                                } else if (i27 != 5) {
                                    c28655q.m87150e0(2068411732);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                    z27 = false;
                                    c28655q.m87173q(false);
                                } else {
                                    z27 = false;
                                    c28655q.m87150e0(2068409175);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getCoachBlue();
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(z27);
                            } else {
                                z27 = false;
                                c28655q.m87150e0(2068392895);
                                c28655q.m87173q(false);
                                accentAction = c17919x.f69639a;
                            }
                            modifierM3358c = AbstractC1092a.m3358c(modifier6, accentAction, AbstractC33253j.m105489e(r16));
                            c28655q.m87173q(z27);
                        }
                        Modifier modifierMo3471e6 = modifierM3419p2.mo3471e(modifierM3358c);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, z27);
                        iHashCode7 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N14);
                        if (viewState.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                            c28655q.m87150e0(1939249771);
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 54), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62314d), AbstractC1102d.m3419p(r16, modifier6), c38072d4.m121949b(c28655q, 6).getBrandBlack(), c28655q, 384, 0);
                            z28 = false;
                            c28655q.m87173q(false);
                        } else {
                            z28 = false;
                            c28655q.m87150e0(1939803989);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z25);
                        c28655q.m87173q(z28);
                    } else {
                        c28655q.m87150e0(-302753932);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z25);
                    c28655q.m87173q(z25);
                    modifier3 = modifier4;
                    str3 = str6;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    str3 = str2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C15079m3(viewState, onClick, modifier3, str3, i13, i14, 8);
                }
            }
            i15 |= 3072;
            str2 = str;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                modifierM3362g = C2314t.f9131w;
                if (i28 != 0) {
                    modifier4 = modifierM3362g;
                } else {
                    modifier4 = modifier2;
                }
                c17919xM31989h = null;
                if (i16 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (viewState.getMultiDayCycleDateDisplay() != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    f13 = 6;
                } else {
                    f13 = 10;
                }
                C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f13 * 4);
                c38072d = C38072d.f163053a;
                white50 = c38072d.m121949b(c28655q, 6).getWhite50();
                if (viewState.getMultiDayCycleDateDisplay() != null) {
                    f14 = 5;
                    f15 = 4;
                } else {
                    f14 = 4;
                    f15 = 8;
                }
                f16 = f14 * f15;
                if (viewState.getIsClickable()) {
                    c3 = '\b';
                    if (viewState.getStyle() == EnumC16612g.INVALID) {
                    }
                    style = viewState.getStyle();
                    enumC16612g = EnumC16612g.INVALID;
                    if (style != enumC16612g) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(modifier4, str4);
                    contentDescription = viewState.getContentDescription();
                    C28676v0 c28676v2 = C28635l.f115821a;
                    if (contentDescription == null) {
                        c28655q.m87150e0(-1358534295);
                        c28655q.m87173q(false);
                        modifierM51775c = null;
                    } else {
                        c28655q.m87150e0(-1358534294);
                        zM87153g = c28655q.m87153g(contentDescription);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = new C2663y4(contentDescription, 27);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2663y4(contentDescription, 27);
                            c28655q.m87172p0(objM87133R);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
                        c28655q.m87173q(false);
                    }
                    if (modifierM51775c == null) {
                        modifierM51775c = modifierM3362g;
                    }
                    Modifier modifierMo3471e7 = modifierM44101d3.mo3471e(modifierM51775c);
                    if (z13) {
                        f17 = f63886c;
                    } else {
                        f17 = f63884a;
                    }
                    Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f63885b, AbstractC1102d.m3424u(f17, modifierMo3471e7)), c33252iM105489e2);
                    if (z14) {
                        c28655q.m87150e0(-1357835771);
                        if ((i15 & 14) != 4) {
                            if ((i15 & 8) != 0) {
                                c16613h = viewState;
                                if (c28655q.m87157i(c16613h)) {
                                }
                                if ((i15 & 112) == 32) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                z35 = z34 | z29;
                                objM87133R3 = c28655q.m87133R();
                                if (z35) {
                                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                                modifier5 = modifierM3362g;
                                c28655q.m87173q(false);
                            } else {
                                c16613h = viewState;
                            }
                            z29 = false;
                            if ((i15 & 112) == 32) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z34 | z29;
                            objM87133R3 = c28655q.m87133R();
                            if (z35) {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            }
                            modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                            modifier5 = modifierM3362g;
                            c28655q.m87173q(false);
                        } else {
                            c16613h = viewState;
                        }
                        z29 = true;
                        if ((i15 & 112) == 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = z34 | z29;
                        objM87133R3 = c28655q.m87133R();
                        if (z35) {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        modifier5 = modifierM3362g;
                        c28655q.m87173q(false);
                    } else {
                        c16613h = viewState;
                        modifier5 = modifierM3362g;
                        c28655q.m87150e0(-1357441048);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e8 = modifierM118994r3.mo3471e(modifierM3362g);
                    f18 = 1;
                    if (c16613h.getIsSelected()) {
                        j7 = C17919x.f69629f;
                    } else {
                        j7 = C17919x.f69636m;
                    }
                    c2314t = modifier5;
                    Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierMo3471e8, f18, j7, c33252iM105489e2), c38072d.m121949b(c28655q, 6).getWhite10(), c33252iM105489e2);
                    if ((i15 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    zM87151f = z16 | c28655q.m87151f(white50) | c28655q.m87147d(f16);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R2 = new C11251l(c16613h, white50, f16);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C11251l(c16613h, white50, f16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3478a3 = AbstractC1125a.m3478a(modifierM3358c4, (Function1) objM87133R2);
                    c2307m = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3478a3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (c16613h.getIcon() != null) {
                        f19 = 0;
                        i18 = 4;
                    } else {
                        i18 = 4;
                        f19 = 4 * f18;
                    }
                    f24 = 2;
                    float f212 = i18;
                    f25 = f24 * f212;
                    Modifier modifierM3395q3 = AbstractC1099a.m3395q(modifierM3407d3, f19, f25);
                    C22961h c22961h3 = AbstractC22977m.f90654e;
                    c2305k = C2299e.f9111N;
                    String str7 = str4;
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22961h3, c2305k, c28655q, 54);
                    f26 = f212;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3395q3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h3, C2299e.f9108K, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m17);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N17);
                    icon = viewState.getIcon();
                    if (icon == null) {
                        c28655q.m87150e0(1031411324);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i3;
                        c7 = 4;
                        c38072d2 = c38072d;
                    } else {
                        C27430e c27430eM53378s3 = AbstractC18489d0.m53378s(c28655q, 1031411325, icon, c28655q, 6);
                        if (a.f63887a[viewState.getStyle().ordinal()] == 1) {
                            c28655q.m87150e0(-2064203619);
                            jM73366B = c38072d.m121949b(c28655q, 6).getWhite30();
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            z17 = false;
                            jM73366B = AbstractC25012a.m73366B(c28655q, -2064201632, c38072d, c28655q, 6);
                            c28655q.m87173q(false);
                        }
                        c0209i5 = c0209i3;
                        c7 = 4;
                        c38072d2 = c38072d;
                        AbstractC15005f3.m43108b(c27430eM53378s3, null, AbstractC1102d.m3419p(5 * f26, c2314t), jM73366B, c28655q, 432, 0);
                        c28655q.m87173q(z17);
                    }
                    if (z13) {
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f27 = Float.MAX_VALUE;
                        } else {
                            f27 = 1.0f;
                        }
                        layoutWeightElement = new LayoutWeightElement(f27, true);
                    } else {
                        layoutWeightElement = r0;
                    }
                    c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N18);
                    String day5 = viewState.getDateDisplay().getDay();
                    if (z15) {
                        c28655q.m87150e0(-1366323109);
                        i19 = 6;
                        white30 = c38072d2.m121949b(c28655q, 6).getWhite90();
                        z18 = false;
                    } else {
                        i19 = 6;
                        z18 = false;
                        c28655q.m87150e0(-1366322117);
                        white30 = c38072d2.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z18);
                    i24 = i19;
                    AbstractC30795n.m94707h(day5, null, white30, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d2.m121952e(c28655q, i19).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                    String date5 = viewState.getDateDisplay().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    if (z15) {
                        white31 = AbstractC25012a.m73366B(c28655q, -1366308066, c38072d2, c28655q, i24);
                        z19 = false;
                    } else {
                        z19 = false;
                        c28655q.m87150e0(-1366306981);
                        white31 = c38072d2.m121949b(c28655q, i24).getWhite30();
                    }
                    c28655q.m87173q(z19);
                    AbstractC30795n.m94707h(date5, null, white31, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q, i24).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    multiDayCycleDateDisplay = viewState.getMultiDayCycleDateDisplay();
                    if (multiDayCycleDateDisplay == null) {
                        c28655q.m87150e0(1033122803);
                        c28655q.m87173q(false);
                        c38072d4 = c38072d2;
                        c0209i6 = c0209i4;
                        z25 = true;
                        c0213j3 = c0213j;
                        c0209i7 = c0209i;
                        modifier6 = c2314t;
                    } else {
                        c28655q.m87150e0(1033122804);
                        float f213 = f18 * f26;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f213, c2314t));
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                        iHashCode5 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c0213j2 = c0213j;
                            c28655q.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m19);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N19);
                        AbstractC11266d.m30469w(i24, f26, c2314t, c28655q);
                        if (z14) {
                            j13 = C17919x.f69629f;
                        } else {
                            j13 = C17919x.f69627d;
                        }
                        f26 = f26;
                        c38072d3 = c38072d2;
                        C2314t c2314t4 = c2314t;
                        c0213j3 = c0213j2;
                        AbstractC15751g.m44449b(AbstractC1102d.m3411h((float) 1.8d, AbstractC1102d.m3424u(f26, c2314t)), j13, 0.0f, 0.0f, c28655q, 6, 12);
                        AbstractC30007c.m91851u(c2314t4, 8, c28655q, true);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f213, c2314t4));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                        iHashCode6 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a12);
                        c0209i2 = c0209i2;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m110);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N110);
                        String day6 = multiDayCycleDateDisplay.getDay();
                        if (z15) {
                            c28655q.m87150e0(842438654);
                            c38072d4 = c38072d3;
                            i25 = 6;
                            white32 = c38072d4.m121949b(c28655q, 6).getWhite90();
                            z24 = false;
                        } else {
                            c38072d4 = c38072d3;
                            i25 = 6;
                            z24 = false;
                            c28655q.m87150e0(842439646);
                            white32 = c38072d4.m121949b(c28655q, 6).getWhite30();
                        }
                        c28655q.m87173q(z24);
                        c0209i6 = c0209i4;
                        c0209i7 = c0209i;
                        z25 = true;
                        AbstractC30795n.m94707h(day6, null, white32, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d4.m121952e(c28655q, i25).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                        String date6 = multiDayCycleDateDisplay.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        if (z15) {
                            i26 = 6;
                            white33 = AbstractC25012a.m73366B(c28655q, 842454657, c38072d4, c28655q, 6);
                            z26 = false;
                        } else {
                            i26 = 6;
                            z26 = false;
                            c28655q.m87150e0(842455742);
                            white33 = c38072d4.m121949b(c28655q, 6).getWhite30();
                        }
                        c28655q.m87173q(z26);
                        AbstractC30795n.m94707h(date6, null, white33, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d4.m121952e(c28655q, i26).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier6 = c2314t4;
                    }
                    c28655q.m87173q(z25);
                    if (viewState.getShowDot()) {
                        c28655q.m87150e0(-304955583);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18 * f26, modifier6));
                        Modifier modifierM3419p3 = AbstractC1102d.m3419p(f26 * f26, modifier6);
                        if (viewState.getStyle() == enumC16612g) {
                            c28655q.m87150e0(-304750208);
                            modifierM3358c = AbstractC15751g.m44455h(modifier6, f18, c38072d4.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f25));
                            z27 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-304420554);
                            dotColorOverride = viewState.getDotColorOverride();
                            if (dotColorOverride == null) {
                                c28655q.m87150e0(-304321696);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(2068393153);
                                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, dotColorOverride.mo134584toComposableColorWaAFU9c(c28655q, 0));
                            }
                            c17919x = c17919xM31989h;
                            if (c17919x == null) {
                                c28655q.m87150e0(-304242242);
                                i27 = a.f63887a[viewState.getStyle().ordinal()];
                                if (i27 != 2) {
                                    z27 = false;
                                    c28655q.m87150e0(2068399066);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getAccentAction();
                                    c28655q.m87173q(false);
                                } else if (i27 != 3) {
                                    z27 = false;
                                    c28655q.m87150e0(2068402613);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getWhite30();
                                    c28655q.m87173q(false);
                                } else if (i27 != 4) {
                                    z27 = false;
                                    c28655q.m87150e0(2068405908);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                    c28655q.m87173q(false);
                                } else if (i27 != 5) {
                                    c28655q.m87150e0(2068411732);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                    z27 = false;
                                    c28655q.m87173q(false);
                                } else {
                                    z27 = false;
                                    c28655q.m87150e0(2068409175);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getCoachBlue();
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(z27);
                            } else {
                                z27 = false;
                                c28655q.m87150e0(2068392895);
                                c28655q.m87173q(false);
                                accentAction = c17919x.f69639a;
                            }
                            modifierM3358c = AbstractC1092a.m3358c(modifier6, accentAction, AbstractC33253j.m105489e(r16));
                            c28655q.m87173q(z27);
                        }
                        Modifier modifierMo3471e9 = modifierM3419p3.mo3471e(modifierM3358c);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, z27);
                        iHashCode7 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierMo3471e9);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N111);
                        if (viewState.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                            c28655q.m87150e0(1939249771);
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 54), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62314d), AbstractC1102d.m3419p(r16, modifier6), c38072d4.m121949b(c28655q, 6).getBrandBlack(), c28655q, 384, 0);
                            z28 = false;
                            c28655q.m87173q(false);
                        } else {
                            z28 = false;
                            c28655q.m87150e0(1939803989);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z25);
                        c28655q.m87173q(z28);
                    } else {
                        c28655q.m87150e0(-302753932);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z25);
                    c28655q.m87173q(z25);
                    modifier3 = modifier4;
                    str3 = str7;
                } else {
                    c3 = '\b';
                }
                z14 = false;
                style = viewState.getStyle();
                enumC16612g = EnumC16612g.INVALID;
                if (style != enumC16612g) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(modifier4, str4);
                contentDescription = viewState.getContentDescription();
                C28676v0 c28676v3 = C28635l.f115821a;
                if (contentDescription == null) {
                    c28655q.m87150e0(-1358534295);
                    c28655q.m87173q(false);
                    modifierM51775c = null;
                } else {
                    c28655q.m87150e0(-1358534294);
                    zM87153g = c28655q.m87153g(contentDescription);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = new C2663y4(contentDescription, 27);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2663y4(contentDescription, 27);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
                    c28655q.m87173q(false);
                }
                if (modifierM51775c == null) {
                    modifierM51775c = modifierM3362g;
                }
                Modifier modifierMo3471e10 = modifierM44101d4.mo3471e(modifierM51775c);
                if (z13) {
                    f17 = f63886c;
                } else {
                    f17 = f63884a;
                }
                Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f63885b, AbstractC1102d.m3424u(f17, modifierMo3471e10)), c33252iM105489e2);
                if (z14) {
                    c28655q.m87150e0(-1357835771);
                    if ((i15 & 14) != 4) {
                        if ((i15 & 8) != 0) {
                            c16613h = viewState;
                            if (c28655q.m87157i(c16613h)) {
                            }
                            if ((i15 & 112) == 32) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z34 | z29;
                            objM87133R3 = c28655q.m87133R();
                            if (z35) {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            }
                            modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                            modifier5 = modifierM3362g;
                            c28655q.m87173q(false);
                        } else {
                            c16613h = viewState;
                        }
                        z29 = false;
                        if ((i15 & 112) == 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = z34 | z29;
                        objM87133R3 = c28655q.m87133R();
                        if (z35) {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        modifier5 = modifierM3362g;
                        c28655q.m87173q(false);
                    } else {
                        c16613h = viewState;
                    }
                    z29 = true;
                    if ((i15 & 112) == 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    z35 = z34 | z29;
                    objM87133R3 = c28655q.m87133R();
                    if (z35) {
                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                        c28655q.m87172p0(objM87133R3);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    modifier5 = modifierM3362g;
                    c28655q.m87173q(false);
                } else {
                    c16613h = viewState;
                    modifier5 = modifierM3362g;
                    c28655q.m87150e0(-1357441048);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e11 = modifierM118994r4.mo3471e(modifierM3362g);
                f18 = 1;
                if (c16613h.getIsSelected()) {
                    j7 = C17919x.f69629f;
                } else {
                    j7 = C17919x.f69636m;
                }
                c2314t = modifier5;
                Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierMo3471e11, f18, j7, c33252iM105489e2), c38072d.m121949b(c28655q, 6).getWhite10(), c33252iM105489e2);
                if ((i15 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                zM87151f = z16 | c28655q.m87151f(white50) | c28655q.m87147d(f16);
                objM87133R2 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R2 = new C11251l(c16613h, white50, f16);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11251l(c16613h, white50, f16);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3478a4 = AbstractC1125a.m3478a(modifierM3358c5, (Function1) objM87133R2);
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3478a4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m112);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
                if (c16613h.getIcon() != null) {
                    f19 = 0;
                    i18 = 4;
                } else {
                    i18 = 4;
                    f19 = 4 * f18;
                }
                f24 = 2;
                float f214 = i18;
                f25 = f24 * f214;
                Modifier modifierM3395q4 = AbstractC1099a.m3395q(modifierM3407d4, f19, f25);
                C22961h c22961h4 = AbstractC22977m.f90654e;
                c2305k = C2299e.f9111N;
                String str8 = str4;
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22961h4, c2305k, c28655q, 54);
                f26 = f214;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3395q4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a13);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m113);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N113);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22961h4, C2299e.f9108K, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N114);
                icon = viewState.getIcon();
                if (icon == null) {
                    c28655q.m87150e0(1031411324);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i3;
                    c7 = 4;
                    c38072d2 = c38072d;
                } else {
                    C27430e c27430eM53378s4 = AbstractC18489d0.m53378s(c28655q, 1031411325, icon, c28655q, 6);
                    if (a.f63887a[viewState.getStyle().ordinal()] == 1) {
                        c28655q.m87150e0(-2064203619);
                        jM73366B = c38072d.m121949b(c28655q, 6).getWhite30();
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q, -2064201632, c38072d, c28655q, 6);
                        c28655q.m87173q(false);
                    }
                    c0209i5 = c0209i3;
                    c7 = 4;
                    c38072d2 = c38072d;
                    AbstractC15005f3.m43108b(c27430eM53378s4, null, AbstractC1102d.m3419p(5 * f26, c2314t), jM73366B, c28655q, 432, 0);
                    c28655q.m87173q(z17);
                }
                if (z13) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f27 = Float.MAX_VALUE;
                    } else {
                        f27 = 1.0f;
                    }
                    layoutWeightElement = new LayoutWeightElement(f27, true);
                } else {
                    layoutWeightElement = r0;
                }
                c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N115);
                String day7 = viewState.getDateDisplay().getDay();
                if (z15) {
                    c28655q.m87150e0(-1366323109);
                    i19 = 6;
                    white30 = c38072d2.m121949b(c28655q, 6).getWhite90();
                    z18 = false;
                } else {
                    i19 = 6;
                    z18 = false;
                    c28655q.m87150e0(-1366322117);
                    white30 = c38072d2.m121949b(c28655q, 6).getWhite30();
                }
                c28655q.m87173q(z18);
                i24 = i19;
                AbstractC30795n.m94707h(day7, null, white30, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d2.m121952e(c28655q, i19).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                String date7 = viewState.getDateDisplay().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                if (z15) {
                    white31 = AbstractC25012a.m73366B(c28655q, -1366308066, c38072d2, c28655q, i24);
                    z19 = false;
                } else {
                    z19 = false;
                    c28655q.m87150e0(-1366306981);
                    white31 = c38072d2.m121949b(c28655q, i24).getWhite30();
                }
                c28655q.m87173q(z19);
                AbstractC30795n.m94707h(date7, null, white31, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q, i24).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                c28655q = c28655q;
                c28655q.m87173q(true);
                multiDayCycleDateDisplay = viewState.getMultiDayCycleDateDisplay();
                if (multiDayCycleDateDisplay == null) {
                    c28655q.m87150e0(1033122803);
                    c28655q.m87173q(false);
                    c38072d4 = c38072d2;
                    c0209i6 = c0209i4;
                    z25 = true;
                    c0213j3 = c0213j;
                    c0209i7 = c0209i;
                    modifier6 = c2314t;
                } else {
                    c28655q.m87150e0(1033122804);
                    float f215 = f18 * f26;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f215, c2314t));
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c0213j2 = c0213j;
                        c28655q.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m116);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N116);
                    AbstractC11266d.m30469w(i24, f26, c2314t, c28655q);
                    if (z14) {
                        j13 = C17919x.f69629f;
                    } else {
                        j13 = C17919x.f69627d;
                    }
                    f26 = f26;
                    c38072d3 = c38072d2;
                    C2314t c2314t5 = c2314t;
                    c0213j3 = c0213j2;
                    AbstractC15751g.m44449b(AbstractC1102d.m3411h((float) 1.8d, AbstractC1102d.m3424u(f26, c2314t)), j13, 0.0f, 0.0f, c28655q, 6, 12);
                    AbstractC30007c.m91851u(c2314t5, 8, c28655q, true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f215, c2314t5));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                    iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a16);
                    c0209i2 = c0209i2;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N117);
                    String day8 = multiDayCycleDateDisplay.getDay();
                    if (z15) {
                        c28655q.m87150e0(842438654);
                        c38072d4 = c38072d3;
                        i25 = 6;
                        white32 = c38072d4.m121949b(c28655q, 6).getWhite90();
                        z24 = false;
                    } else {
                        c38072d4 = c38072d3;
                        i25 = 6;
                        z24 = false;
                        c28655q.m87150e0(842439646);
                        white32 = c38072d4.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z24);
                    c0209i6 = c0209i4;
                    c0209i7 = c0209i;
                    z25 = true;
                    AbstractC30795n.m94707h(day8, null, white32, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d4.m121952e(c28655q, i25).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                    String date8 = multiDayCycleDateDisplay.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    if (z15) {
                        i26 = 6;
                        white33 = AbstractC25012a.m73366B(c28655q, 842454657, c38072d4, c28655q, 6);
                        z26 = false;
                    } else {
                        i26 = 6;
                        z26 = false;
                        c28655q.m87150e0(842455742);
                        white33 = c38072d4.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z26);
                    AbstractC30795n.m94707h(date8, null, white33, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d4.m121952e(c28655q, i26).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier6 = c2314t5;
                }
                c28655q.m87173q(z25);
                if (viewState.getShowDot()) {
                    c28655q.m87150e0(-304955583);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18 * f26, modifier6));
                    Modifier modifierM3419p4 = AbstractC1102d.m3419p(f26 * f26, modifier6);
                    if (viewState.getStyle() == enumC16612g) {
                        c28655q.m87150e0(-304750208);
                        modifierM3358c = AbstractC15751g.m44455h(modifier6, f18, c38072d4.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f25));
                        z27 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-304420554);
                        dotColorOverride = viewState.getDotColorOverride();
                        if (dotColorOverride == null) {
                            c28655q.m87150e0(-304321696);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2068393153);
                            c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, dotColorOverride.mo134584toComposableColorWaAFU9c(c28655q, 0));
                        }
                        c17919x = c17919xM31989h;
                        if (c17919x == null) {
                            c28655q.m87150e0(-304242242);
                            i27 = a.f63887a[viewState.getStyle().ordinal()];
                            if (i27 != 2) {
                                z27 = false;
                                c28655q.m87150e0(2068399066);
                                accentAction = c38072d4.m121949b(c28655q, 6).getAccentAction();
                                c28655q.m87173q(false);
                            } else if (i27 != 3) {
                                z27 = false;
                                c28655q.m87150e0(2068402613);
                                accentAction = c38072d4.m121949b(c28655q, 6).getWhite30();
                                c28655q.m87173q(false);
                            } else if (i27 != 4) {
                                z27 = false;
                                c28655q.m87150e0(2068405908);
                                accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                c28655q.m87173q(false);
                            } else if (i27 != 5) {
                                c28655q.m87150e0(2068411732);
                                accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                z27 = false;
                                c28655q.m87173q(false);
                            } else {
                                z27 = false;
                                c28655q.m87150e0(2068409175);
                                accentAction = c38072d4.m121949b(c28655q, 6).getCoachBlue();
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z27);
                        } else {
                            z27 = false;
                            c28655q.m87150e0(2068392895);
                            c28655q.m87173q(false);
                            accentAction = c17919x.f69639a;
                        }
                        modifierM3358c = AbstractC1092a.m3358c(modifier6, accentAction, AbstractC33253j.m105489e(r16));
                        c28655q.m87173q(z27);
                    }
                    Modifier modifierMo3471e12 = modifierM3419p4.mo3471e(modifierM3358c);
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, z27);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierMo3471e12);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N118);
                    if (viewState.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                        c28655q.m87150e0(1939249771);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 54), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62314d), AbstractC1102d.m3419p(r16, modifier6), c38072d4.m121949b(c28655q, 6).getBrandBlack(), c28655q, 384, 0);
                        z28 = false;
                        c28655q.m87173q(false);
                    } else {
                        z28 = false;
                        c28655q.m87150e0(1939803989);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z25);
                    c28655q.m87173q(z28);
                } else {
                    c28655q.m87150e0(-302753932);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z25);
                c28655q.m87173q(z25);
                modifier3 = modifier4;
                str3 = str8;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(viewState, onClick, modifier3, str3, i13, i14, 8);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
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
                modifierM3362g = C2314t.f9131w;
                if (i28 != 0) {
                    modifier4 = modifierM3362g;
                } else {
                    modifier4 = modifier2;
                }
                c17919xM31989h = null;
                if (i16 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (viewState.getMultiDayCycleDateDisplay() != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    f13 = 6;
                } else {
                    f13 = 10;
                }
                C33252i c33252iM105489e3 = AbstractC33253j.m105489e(f13 * 4);
                c38072d = C38072d.f163053a;
                white50 = c38072d.m121949b(c28655q, 6).getWhite50();
                if (viewState.getMultiDayCycleDateDisplay() != null) {
                    f14 = 5;
                    f15 = 4;
                } else {
                    f14 = 4;
                    f15 = 8;
                }
                f16 = f14 * f15;
                if (viewState.getIsClickable()) {
                    c3 = '\b';
                    if (viewState.getStyle() == EnumC16612g.INVALID) {
                    }
                    style = viewState.getStyle();
                    enumC16612g = EnumC16612g.INVALID;
                    if (style != enumC16612g) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(modifier4, str4);
                    contentDescription = viewState.getContentDescription();
                    C28676v0 c28676v4 = C28635l.f115821a;
                    if (contentDescription == null) {
                        c28655q.m87150e0(-1358534295);
                        c28655q.m87173q(false);
                        modifierM51775c = null;
                    } else {
                        c28655q.m87150e0(-1358534294);
                        zM87153g = c28655q.m87153g(contentDescription);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g) {
                            objM87133R = new C2663y4(contentDescription, 27);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2663y4(contentDescription, 27);
                            c28655q.m87172p0(objM87133R);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
                        c28655q.m87173q(false);
                    }
                    if (modifierM51775c == null) {
                        modifierM51775c = modifierM3362g;
                    }
                    Modifier modifierMo3471e13 = modifierM44101d5.mo3471e(modifierM51775c);
                    if (z13) {
                        f17 = f63886c;
                    } else {
                        f17 = f63884a;
                    }
                    Modifier modifierM118994r5 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f63885b, AbstractC1102d.m3424u(f17, modifierMo3471e13)), c33252iM105489e3);
                    if (z14) {
                        c28655q.m87150e0(-1357835771);
                        if ((i15 & 14) != 4) {
                            if ((i15 & 8) != 0) {
                                c16613h = viewState;
                                if (c28655q.m87157i(c16613h)) {
                                }
                                if ((i15 & 112) == 32) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                z35 = z34 | z29;
                                objM87133R3 = c28655q.m87133R();
                                if (z35) {
                                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                                modifier5 = modifierM3362g;
                                c28655q.m87173q(false);
                            } else {
                                c16613h = viewState;
                            }
                            z29 = false;
                            if ((i15 & 112) == 32) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z34 | z29;
                            objM87133R3 = c28655q.m87133R();
                            if (z35) {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            }
                            modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                            modifier5 = modifierM3362g;
                            c28655q.m87173q(false);
                        } else {
                            c16613h = viewState;
                        }
                        z29 = true;
                        if ((i15 & 112) == 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = z34 | z29;
                        objM87133R3 = c28655q.m87133R();
                        if (z35) {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        modifier5 = modifierM3362g;
                        c28655q.m87173q(false);
                    } else {
                        c16613h = viewState;
                        modifier5 = modifierM3362g;
                        c28655q.m87150e0(-1357441048);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierMo3471e14 = modifierM118994r5.mo3471e(modifierM3362g);
                    f18 = 1;
                    if (c16613h.getIsSelected()) {
                        j7 = C17919x.f69629f;
                    } else {
                        j7 = C17919x.f69636m;
                    }
                    c2314t = modifier5;
                    Modifier modifierM3358c6 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierMo3471e14, f18, j7, c33252iM105489e3), c38072d.m121949b(c28655q, 6).getWhite10(), c33252iM105489e3);
                    if ((i15 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    zM87151f = z16 | c28655q.m87151f(white50) | c28655q.m87147d(f16);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87151f) {
                        objM87133R2 = new C11251l(c16613h, white50, f16);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C11251l(c16613h, white50, f16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3478a5 = AbstractC1125a.m3478a(modifierM3358c6, (Function1) objM87133R2);
                    c2307m = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierM3478a5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d9);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m119);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N119);
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                    if (c16613h.getIcon() != null) {
                        f19 = 0;
                        i18 = 4;
                    } else {
                        i18 = 4;
                        f19 = 4 * f18;
                    }
                    f24 = 2;
                    float f216 = i18;
                    f25 = f24 * f216;
                    Modifier modifierM3395q5 = AbstractC1099a.m3395q(modifierM3407d5, f19, f25);
                    C22961h c22961h5 = AbstractC22977m.f90654e;
                    c2305k = C2299e.f9111N;
                    String str9 = str4;
                    C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22961h5, c2305k, c28655q, 54);
                    f26 = f216;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3395q5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a17);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1110);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22961h5, C2299e.f9108K, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1111);
                    icon = viewState.getIcon();
                    if (icon == null) {
                        c28655q.m87150e0(1031411324);
                        c28655q.m87173q(false);
                        c0209i5 = c0209i3;
                        c7 = 4;
                        c38072d2 = c38072d;
                    } else {
                        C27430e c27430eM53378s5 = AbstractC18489d0.m53378s(c28655q, 1031411325, icon, c28655q, 6);
                        if (a.f63887a[viewState.getStyle().ordinal()] == 1) {
                            c28655q.m87150e0(-2064203619);
                            jM73366B = c38072d.m121949b(c28655q, 6).getWhite30();
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            z17 = false;
                            jM73366B = AbstractC25012a.m73366B(c28655q, -2064201632, c38072d, c28655q, 6);
                            c28655q.m87173q(false);
                        }
                        c0209i5 = c0209i3;
                        c7 = 4;
                        c38072d2 = c38072d;
                        AbstractC15005f3.m43108b(c27430eM53378s5, null, AbstractC1102d.m3419p(5 * f26, c2314t), jM73366B, c28655q, 432, 0);
                        c28655q.m87173q(z17);
                    }
                    if (z13) {
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f27 = Float.MAX_VALUE;
                        } else {
                            f27 = 1.0f;
                        }
                        layoutWeightElement = new LayoutWeightElement(f27, true);
                    } else {
                        layoutWeightElement = r0;
                    }
                    c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                    Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a18);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1112);
                    String day9 = viewState.getDateDisplay().getDay();
                    if (z15) {
                        c28655q.m87150e0(-1366323109);
                        i19 = 6;
                        white30 = c38072d2.m121949b(c28655q, 6).getWhite90();
                        z18 = false;
                    } else {
                        i19 = 6;
                        z18 = false;
                        c28655q.m87150e0(-1366322117);
                        white30 = c38072d2.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z18);
                    i24 = i19;
                    AbstractC30795n.m94707h(day9, null, white30, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d2.m121952e(c28655q, i19).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                    String date9 = viewState.getDateDisplay().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    if (z15) {
                        white31 = AbstractC25012a.m73366B(c28655q, -1366308066, c38072d2, c28655q, i24);
                        z19 = false;
                    } else {
                        z19 = false;
                        c28655q.m87150e0(-1366306981);
                        white31 = c38072d2.m121949b(c28655q, i24).getWhite30();
                    }
                    c28655q.m87173q(z19);
                    AbstractC30795n.m94707h(date9, null, white31, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q, i24).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    multiDayCycleDateDisplay = viewState.getMultiDayCycleDateDisplay();
                    if (multiDayCycleDateDisplay == null) {
                        c28655q.m87150e0(1033122803);
                        c28655q.m87173q(false);
                        c38072d4 = c38072d2;
                        c0209i6 = c0209i4;
                        z25 = true;
                        c0213j3 = c0213j;
                        c0209i7 = c0209i;
                        modifier6 = c2314t;
                    } else {
                        c28655q.m87150e0(1033122804);
                        float f217 = f18 * f26;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f217, c2314t));
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                        C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                        iHashCode5 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
                        Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifierM3396r5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c0213j2 = c0213j;
                            c28655q.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a19);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1113);
                        AbstractC11266d.m30469w(i24, f26, c2314t, c28655q);
                        if (z14) {
                            j13 = C17919x.f69629f;
                        } else {
                            j13 = C17919x.f69627d;
                        }
                        f26 = f26;
                        c38072d3 = c38072d2;
                        C2314t c2314t6 = c2314t;
                        c0213j3 = c0213j2;
                        AbstractC15751g.m44449b(AbstractC1102d.m3411h((float) 1.8d, AbstractC1102d.m3424u(f26, c2314t)), j13, 0.0f, 0.0f, c28655q, 6, 12);
                        AbstractC30007c.m91851u(c2314t6, 8, c28655q, true);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f217, c2314t6));
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                        iHashCode6 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                        Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a110);
                        c0209i2 = c0209i2;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1114);
                        String day10 = multiDayCycleDateDisplay.getDay();
                        if (z15) {
                            c28655q.m87150e0(842438654);
                            c38072d4 = c38072d3;
                            i25 = 6;
                            white32 = c38072d4.m121949b(c28655q, 6).getWhite90();
                            z24 = false;
                        } else {
                            c38072d4 = c38072d3;
                            i25 = 6;
                            z24 = false;
                            c28655q.m87150e0(842439646);
                            white32 = c38072d4.m121949b(c28655q, 6).getWhite30();
                        }
                        c28655q.m87173q(z24);
                        c0209i6 = c0209i4;
                        c0209i7 = c0209i;
                        z25 = true;
                        AbstractC30795n.m94707h(day10, null, white32, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d4.m121952e(c28655q, i25).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                        String date10 = multiDayCycleDateDisplay.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                        if (z15) {
                            i26 = 6;
                            white33 = AbstractC25012a.m73366B(c28655q, 842454657, c38072d4, c28655q, 6);
                            z26 = false;
                        } else {
                            i26 = 6;
                            z26 = false;
                            c28655q.m87150e0(842455742);
                            white33 = c38072d4.m121949b(c28655q, 6).getWhite30();
                        }
                        c28655q.m87173q(z26);
                        AbstractC30795n.m94707h(date10, null, white33, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d4.m121952e(c28655q, i26).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        modifier6 = c2314t6;
                    }
                    c28655q.m87173q(z25);
                    if (viewState.getShowDot()) {
                        c28655q.m87150e0(-304955583);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18 * f26, modifier6));
                        Modifier modifierM3419p5 = AbstractC1102d.m3419p(f26 * f26, modifier6);
                        if (viewState.getStyle() == enumC16612g) {
                            c28655q.m87150e0(-304750208);
                            modifierM3358c = AbstractC15751g.m44455h(modifier6, f18, c38072d4.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f25));
                            z27 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-304420554);
                            dotColorOverride = viewState.getDotColorOverride();
                            if (dotColorOverride == null) {
                                c28655q.m87150e0(-304321696);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(2068393153);
                                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, dotColorOverride.mo134584toComposableColorWaAFU9c(c28655q, 0));
                            }
                            c17919x = c17919xM31989h;
                            if (c17919x == null) {
                                c28655q.m87150e0(-304242242);
                                i27 = a.f63887a[viewState.getStyle().ordinal()];
                                if (i27 != 2) {
                                    z27 = false;
                                    c28655q.m87150e0(2068399066);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getAccentAction();
                                    c28655q.m87173q(false);
                                } else if (i27 != 3) {
                                    z27 = false;
                                    c28655q.m87150e0(2068402613);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getWhite30();
                                    c28655q.m87173q(false);
                                } else if (i27 != 4) {
                                    z27 = false;
                                    c28655q.m87150e0(2068405908);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                    c28655q.m87173q(false);
                                } else if (i27 != 5) {
                                    c28655q.m87150e0(2068411732);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                    z27 = false;
                                    c28655q.m87173q(false);
                                } else {
                                    z27 = false;
                                    c28655q.m87150e0(2068409175);
                                    accentAction = c38072d4.m121949b(c28655q, 6).getCoachBlue();
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(z27);
                            } else {
                                z27 = false;
                                c28655q.m87150e0(2068392895);
                                c28655q.m87173q(false);
                                accentAction = c17919x.f69639a;
                            }
                            modifierM3358c = AbstractC1092a.m3358c(modifier6, accentAction, AbstractC33253j.m105489e(r16));
                            c28655q.m87173q(z27);
                        }
                        Modifier modifierMo3471e15 = modifierM3419p5.mo3471e(modifierM3358c);
                        InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m, z27);
                        iHashCode7 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
                        Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, modifierMo3471e15);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d10);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N1115);
                        if (viewState.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                            c28655q.m87150e0(1939249771);
                            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 54), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62314d), AbstractC1102d.m3419p(r16, modifier6), c38072d4.m121949b(c28655q, 6).getBrandBlack(), c28655q, 384, 0);
                            z28 = false;
                            c28655q.m87173q(false);
                        } else {
                            z28 = false;
                            c28655q.m87150e0(1939803989);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z25);
                        c28655q.m87173q(z28);
                    } else {
                        c28655q.m87150e0(-302753932);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z25);
                    c28655q.m87173q(z25);
                    modifier3 = modifier4;
                    str3 = str9;
                } else {
                    c3 = '\b';
                }
                z14 = false;
                style = viewState.getStyle();
                enumC16612g = EnumC16612g.INVALID;
                if (style != enumC16612g) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(modifier4, str4);
                contentDescription = viewState.getContentDescription();
                C28676v0 c28676v5 = C28635l.f115821a;
                if (contentDescription == null) {
                    c28655q.m87150e0(-1358534295);
                    c28655q.m87173q(false);
                    modifierM51775c = null;
                } else {
                    c28655q.m87150e0(-1358534294);
                    zM87153g = c28655q.m87153g(contentDescription);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = new C2663y4(contentDescription, 27);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2663y4(contentDescription, 27);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
                    c28655q.m87173q(false);
                }
                if (modifierM51775c == null) {
                    modifierM51775c = modifierM3362g;
                }
                Modifier modifierMo3471e16 = modifierM44101d6.mo3471e(modifierM51775c);
                if (z13) {
                    f17 = f63886c;
                } else {
                    f17 = f63884a;
                }
                Modifier modifierM118994r6 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f63885b, AbstractC1102d.m3424u(f17, modifierMo3471e16)), c33252iM105489e3);
                if (z14) {
                    c28655q.m87150e0(-1357835771);
                    if ((i15 & 14) != 4) {
                        if ((i15 & 8) != 0) {
                            c16613h = viewState;
                            if (c28655q.m87157i(c16613h)) {
                            }
                            if ((i15 & 112) == 32) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z34 | z29;
                            objM87133R3 = c28655q.m87133R();
                            if (z35) {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            }
                            modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                            modifier5 = modifierM3362g;
                            c28655q.m87173q(false);
                        } else {
                            c16613h = viewState;
                        }
                        z29 = false;
                        if ((i15 & 112) == 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = z34 | z29;
                        objM87133R3 = c28655q.m87133R();
                        if (z35) {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        modifier5 = modifierM3362g;
                        c28655q.m87173q(false);
                    } else {
                        c16613h = viewState;
                    }
                    z29 = true;
                    if ((i15 & 112) == 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    z35 = z34 | z29;
                    objM87133R3 = c28655q.m87133R();
                    if (z35) {
                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                        c28655q.m87172p0(objM87133R3);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    modifier5 = modifierM3362g;
                    c28655q.m87173q(false);
                } else {
                    c16613h = viewState;
                    modifier5 = modifierM3362g;
                    c28655q.m87150e0(-1357441048);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e17 = modifierM118994r6.mo3471e(modifierM3362g);
                f18 = 1;
                if (c16613h.getIsSelected()) {
                    j7 = C17919x.f69629f;
                } else {
                    j7 = C17919x.f69636m;
                }
                c2314t = modifier5;
                Modifier modifierM3358c7 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierMo3471e17, f18, j7, c33252iM105489e3), c38072d.m121949b(c28655q, 6).getWhite10(), c33252iM105489e3);
                if ((i15 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                zM87151f = z16 | c28655q.m87151f(white50) | c28655q.m87147d(f16);
                objM87133R2 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R2 = new C11251l(c16613h, white50, f16);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11251l(c16613h, white50, f16);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3478a6 = AbstractC1125a.m3478a(modifierM3358c7, (Function1) objM87133R2);
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierM3478a6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d11);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1116);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1116);
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t);
                if (c16613h.getIcon() != null) {
                    f19 = 0;
                    i18 = 4;
                } else {
                    i18 = 4;
                    f19 = 4 * f18;
                }
                f24 = 2;
                float f218 = i18;
                f25 = f24 * f218;
                Modifier modifierM3395q6 = AbstractC1099a.m3395q(modifierM3407d6, f19, f25);
                C22961h c22961h6 = AbstractC22977m.f90654e;
                c2305k = C2299e.f9111N;
                String str10 = str4;
                C23010x c23010xM66775a111 = AbstractC23007w.m66775a(c22961h6, c2305k, c28655q, 54);
                f26 = f218;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q.m87165m();
                Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q, modifierM3395q6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a111);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1117);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1117);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22961h6, C2299e.f9108K, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q.m87165m();
                Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1118);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1118);
                icon = viewState.getIcon();
                if (icon == null) {
                    c28655q.m87150e0(1031411324);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i3;
                    c7 = 4;
                    c38072d2 = c38072d;
                } else {
                    C27430e c27430eM53378s6 = AbstractC18489d0.m53378s(c28655q, 1031411325, icon, c28655q, 6);
                    if (a.f63887a[viewState.getStyle().ordinal()] == 1) {
                        c28655q.m87150e0(-2064203619);
                        jM73366B = c38072d.m121949b(c28655q, 6).getWhite30();
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q, -2064201632, c38072d, c28655q, 6);
                        c28655q.m87173q(false);
                    }
                    c0209i5 = c0209i3;
                    c7 = 4;
                    c38072d2 = c38072d;
                    AbstractC15005f3.m43108b(c27430eM53378s6, null, AbstractC1102d.m3419p(5 * f26, c2314t), jM73366B, c28655q, 432, 0);
                    c28655q.m87173q(z17);
                }
                if (z13) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f27 = Float.MAX_VALUE;
                    } else {
                        f27 = 1.0f;
                    }
                    layoutWeightElement = new LayoutWeightElement(f27, true);
                } else {
                    layoutWeightElement = r0;
                }
                c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a112 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q.m87165m();
                Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a112);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1119);
                String day11 = viewState.getDateDisplay().getDay();
                if (z15) {
                    c28655q.m87150e0(-1366323109);
                    i19 = 6;
                    white30 = c38072d2.m121949b(c28655q, 6).getWhite90();
                    z18 = false;
                } else {
                    i19 = 6;
                    z18 = false;
                    c28655q.m87150e0(-1366322117);
                    white30 = c38072d2.m121949b(c28655q, 6).getWhite30();
                }
                c28655q.m87173q(z18);
                i24 = i19;
                AbstractC30795n.m94707h(day11, null, white30, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d2.m121952e(c28655q, i19).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                String date11 = viewState.getDateDisplay().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                if (z15) {
                    white31 = AbstractC25012a.m73366B(c28655q, -1366308066, c38072d2, c28655q, i24);
                    z19 = false;
                } else {
                    z19 = false;
                    c28655q.m87150e0(-1366306981);
                    white31 = c38072d2.m121949b(c28655q, i24).getWhite30();
                }
                c28655q.m87173q(z19);
                AbstractC30795n.m94707h(date11, null, white31, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q, i24).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                c28655q = c28655q;
                c28655q.m87173q(true);
                multiDayCycleDateDisplay = viewState.getMultiDayCycleDateDisplay();
                if (multiDayCycleDateDisplay == null) {
                    c28655q.m87150e0(1033122803);
                    c28655q.m87173q(false);
                    c38072d4 = c38072d2;
                    c0209i6 = c0209i4;
                    z25 = true;
                    c0213j3 = c0213j;
                    c0209i7 = c0209i;
                    modifier6 = c2314t;
                } else {
                    c28655q.m87150e0(1033122804);
                    float f219 = f18 * f26;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f219, c2314t));
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                    C23010x c23010xM66775a113 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifierM3396r6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c0213j2 = c0213j;
                        c28655q.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a113);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11110);
                    AbstractC11266d.m30469w(i24, f26, c2314t, c28655q);
                    if (z14) {
                        j13 = C17919x.f69629f;
                    } else {
                        j13 = C17919x.f69627d;
                    }
                    f26 = f26;
                    c38072d3 = c38072d2;
                    C2314t c2314t7 = c2314t;
                    c0213j3 = c0213j2;
                    AbstractC15751g.m44449b(AbstractC1102d.m3411h((float) 1.8d, AbstractC1102d.m3424u(f26, c2314t)), j13, 0.0f, 0.0f, c28655q, 6, 12);
                    AbstractC30007c.m91851u(c2314t7, 8, c28655q, true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f219, c2314t7));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C23010x c23010xM66775a114 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                    iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q.m87165m();
                    Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a114);
                    c0209i2 = c0209i2;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11111);
                    String day12 = multiDayCycleDateDisplay.getDay();
                    if (z15) {
                        c28655q.m87150e0(842438654);
                        c38072d4 = c38072d3;
                        i25 = 6;
                        white32 = c38072d4.m121949b(c28655q, 6).getWhite90();
                        z24 = false;
                    } else {
                        c38072d4 = c38072d3;
                        i25 = 6;
                        z24 = false;
                        c28655q.m87150e0(842439646);
                        white32 = c38072d4.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z24);
                    c0209i6 = c0209i4;
                    c0209i7 = c0209i;
                    z25 = true;
                    AbstractC30795n.m94707h(day12, null, white32, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d4.m121952e(c28655q, i25).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                    String date12 = multiDayCycleDateDisplay.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    if (z15) {
                        i26 = 6;
                        white33 = AbstractC25012a.m73366B(c28655q, 842454657, c38072d4, c28655q, 6);
                        z26 = false;
                    } else {
                        i26 = 6;
                        z26 = false;
                        c28655q.m87150e0(842455742);
                        white33 = c38072d4.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z26);
                    AbstractC30795n.m94707h(date12, null, white33, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d4.m121952e(c28655q, i26).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier6 = c2314t7;
                }
                c28655q.m87173q(z25);
                if (viewState.getShowDot()) {
                    c28655q.m87150e0(-304955583);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18 * f26, modifier6));
                    Modifier modifierM3419p6 = AbstractC1102d.m3419p(f26 * f26, modifier6);
                    if (viewState.getStyle() == enumC16612g) {
                        c28655q.m87150e0(-304750208);
                        modifierM3358c = AbstractC15751g.m44455h(modifier6, f18, c38072d4.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f25));
                        z27 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-304420554);
                        dotColorOverride = viewState.getDotColorOverride();
                        if (dotColorOverride == null) {
                            c28655q.m87150e0(-304321696);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2068393153);
                            c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, dotColorOverride.mo134584toComposableColorWaAFU9c(c28655q, 0));
                        }
                        c17919x = c17919xM31989h;
                        if (c17919x == null) {
                            c28655q.m87150e0(-304242242);
                            i27 = a.f63887a[viewState.getStyle().ordinal()];
                            if (i27 != 2) {
                                z27 = false;
                                c28655q.m87150e0(2068399066);
                                accentAction = c38072d4.m121949b(c28655q, 6).getAccentAction();
                                c28655q.m87173q(false);
                            } else if (i27 != 3) {
                                z27 = false;
                                c28655q.m87150e0(2068402613);
                                accentAction = c38072d4.m121949b(c28655q, 6).getWhite30();
                                c28655q.m87173q(false);
                            } else if (i27 != 4) {
                                z27 = false;
                                c28655q.m87150e0(2068405908);
                                accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                c28655q.m87173q(false);
                            } else if (i27 != 5) {
                                c28655q.m87150e0(2068411732);
                                accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                z27 = false;
                                c28655q.m87173q(false);
                            } else {
                                z27 = false;
                                c28655q.m87150e0(2068409175);
                                accentAction = c38072d4.m121949b(c28655q, 6).getCoachBlue();
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z27);
                        } else {
                            z27 = false;
                            c28655q.m87150e0(2068392895);
                            c28655q.m87173q(false);
                            accentAction = c17919x.f69639a;
                        }
                        modifierM3358c = AbstractC1092a.m3358c(modifier6, accentAction, AbstractC33253j.m105489e(r16));
                        c28655q.m87173q(z27);
                    }
                    Modifier modifierMo3471e18 = modifierM3419p6.mo3471e(modifierM3358c);
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m, z27);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q.m87165m();
                    Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q, modifierMo3471e18);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N11112);
                    if (viewState.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                        c28655q.m87150e0(1939249771);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 54), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62314d), AbstractC1102d.m3419p(r16, modifier6), c38072d4.m121949b(c28655q, 6).getBrandBlack(), c28655q, 384, 0);
                        z28 = false;
                        c28655q.m87173q(false);
                    } else {
                        z28 = false;
                        c28655q.m87150e0(1939803989);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z25);
                    c28655q.m87173q(z28);
                } else {
                    c28655q.m87150e0(-302753932);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z25);
                c28655q.m87173q(z25);
                modifier3 = modifier4;
                str3 = str10;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(viewState, onClick, modifier3, str3, i13, i14, 8);
            }
        }
        i15 |= 3072;
        str2 = str;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            modifierM3362g = C2314t.f9131w;
            if (i28 != 0) {
                modifier4 = modifierM3362g;
            } else {
                modifier4 = modifier2;
            }
            c17919xM31989h = null;
            if (i16 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (viewState.getMultiDayCycleDateDisplay() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                f13 = 6;
            } else {
                f13 = 10;
            }
            C33252i c33252iM105489e4 = AbstractC33253j.m105489e(f13 * 4);
            c38072d = C38072d.f163053a;
            white50 = c38072d.m121949b(c28655q, 6).getWhite50();
            if (viewState.getMultiDayCycleDateDisplay() != null) {
                f14 = 5;
                f15 = 4;
            } else {
                f14 = 4;
                f15 = 8;
            }
            f16 = f14 * f15;
            if (viewState.getIsClickable()) {
                c3 = '\b';
                if (viewState.getStyle() == EnumC16612g.INVALID) {
                }
                style = viewState.getStyle();
                enumC16612g = EnumC16612g.INVALID;
                if (style != enumC16612g) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(modifier4, str4);
                contentDescription = viewState.getContentDescription();
                C28676v0 c28676v6 = C28635l.f115821a;
                if (contentDescription == null) {
                    c28655q.m87150e0(-1358534295);
                    c28655q.m87173q(false);
                    modifierM51775c = null;
                } else {
                    c28655q.m87150e0(-1358534294);
                    zM87153g = c28655q.m87153g(contentDescription);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = new C2663y4(contentDescription, 27);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2663y4(contentDescription, 27);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
                    c28655q.m87173q(false);
                }
                if (modifierM51775c == null) {
                    modifierM51775c = modifierM3362g;
                }
                Modifier modifierMo3471e19 = modifierM44101d7.mo3471e(modifierM51775c);
                if (z13) {
                    f17 = f63886c;
                } else {
                    f17 = f63884a;
                }
                Modifier modifierM118994r7 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f63885b, AbstractC1102d.m3424u(f17, modifierMo3471e19)), c33252iM105489e4);
                if (z14) {
                    c28655q.m87150e0(-1357835771);
                    if ((i15 & 14) != 4) {
                        if ((i15 & 8) != 0) {
                            c16613h = viewState;
                            if (c28655q.m87157i(c16613h)) {
                            }
                            if ((i15 & 112) == 32) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z34 | z29;
                            objM87133R3 = c28655q.m87133R();
                            if (z35) {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C13989w1(19, c16613h, onClick);
                                c28655q.m87172p0(objM87133R3);
                            }
                            modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                            modifier5 = modifierM3362g;
                            c28655q.m87173q(false);
                        } else {
                            c16613h = viewState;
                        }
                        z29 = false;
                        if ((i15 & 112) == 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = z34 | z29;
                        objM87133R3 = c28655q.m87133R();
                        if (z35) {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        modifier5 = modifierM3362g;
                        c28655q.m87173q(false);
                    } else {
                        c16613h = viewState;
                    }
                    z29 = true;
                    if ((i15 & 112) == 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    z35 = z34 | z29;
                    objM87133R3 = c28655q.m87133R();
                    if (z35) {
                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                        c28655q.m87172p0(objM87133R3);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    modifier5 = modifierM3362g;
                    c28655q.m87173q(false);
                } else {
                    c16613h = viewState;
                    modifier5 = modifierM3362g;
                    c28655q.m87150e0(-1357441048);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e110 = modifierM118994r7.mo3471e(modifierM3362g);
                f18 = 1;
                if (c16613h.getIsSelected()) {
                    j7 = C17919x.f69629f;
                } else {
                    j7 = C17919x.f69636m;
                }
                c2314t = modifier5;
                Modifier modifierM3358c8 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierMo3471e110, f18, j7, c33252iM105489e4), c38072d.m121949b(c28655q, 6).getWhite10(), c33252iM105489e4);
                if ((i15 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                zM87151f = z16 | c28655q.m87151f(white50) | c28655q.m87147d(f16);
                objM87133R2 = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R2 = new C11251l(c16613h, white50, f16);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11251l(c16613h, white50, f16);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3478a7 = AbstractC1125a.m3478a(modifierM3358c8, (Function1) objM87133R2);
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, modifierM3478a7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d13);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11113);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11113);
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t);
                if (c16613h.getIcon() != null) {
                    f19 = 0;
                    i18 = 4;
                } else {
                    i18 = 4;
                    f19 = 4 * f18;
                }
                f24 = 2;
                float f2110 = i18;
                f25 = f24 * f2110;
                Modifier modifierM3395q7 = AbstractC1099a.m3395q(modifierM3407d7, f19, f25);
                C22961h c22961h7 = AbstractC22977m.f90654e;
                c2305k = C2299e.f9111N;
                String str11 = str4;
                C23010x c23010xM66775a115 = AbstractC23007w.m66775a(c22961h7, c2305k, c28655q, 54);
                f26 = f2110;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, modifierM3395q7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a115);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11114);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22961h7, C2299e.f9108K, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q.m87165m();
                Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11115);
                icon = viewState.getIcon();
                if (icon == null) {
                    c28655q.m87150e0(1031411324);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i3;
                    c7 = 4;
                    c38072d2 = c38072d;
                } else {
                    C27430e c27430eM53378s7 = AbstractC18489d0.m53378s(c28655q, 1031411325, icon, c28655q, 6);
                    if (a.f63887a[viewState.getStyle().ordinal()] == 1) {
                        c28655q.m87150e0(-2064203619);
                        jM73366B = c38072d.m121949b(c28655q, 6).getWhite30();
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q, -2064201632, c38072d, c28655q, 6);
                        c28655q.m87173q(false);
                    }
                    c0209i5 = c0209i3;
                    c7 = 4;
                    c38072d2 = c38072d;
                    AbstractC15005f3.m43108b(c27430eM53378s7, null, AbstractC1102d.m3419p(5 * f26, c2314t), jM73366B, c28655q, 432, 0);
                    c28655q.m87173q(z17);
                }
                if (z13) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f27 = Float.MAX_VALUE;
                    } else {
                        f27 = 1.0f;
                    }
                    layoutWeightElement = new LayoutWeightElement(f27, true);
                } else {
                    layoutWeightElement = r0;
                }
                c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a116 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q.m87165m();
                Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a116);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11116);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11116);
                String day13 = viewState.getDateDisplay().getDay();
                if (z15) {
                    c28655q.m87150e0(-1366323109);
                    i19 = 6;
                    white30 = c38072d2.m121949b(c28655q, 6).getWhite90();
                    z18 = false;
                } else {
                    i19 = 6;
                    z18 = false;
                    c28655q.m87150e0(-1366322117);
                    white30 = c38072d2.m121949b(c28655q, 6).getWhite30();
                }
                c28655q.m87173q(z18);
                i24 = i19;
                AbstractC30795n.m94707h(day13, null, white30, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d2.m121952e(c28655q, i19).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                String date13 = viewState.getDateDisplay().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                if (z15) {
                    white31 = AbstractC25012a.m73366B(c28655q, -1366308066, c38072d2, c28655q, i24);
                    z19 = false;
                } else {
                    z19 = false;
                    c28655q.m87150e0(-1366306981);
                    white31 = c38072d2.m121949b(c28655q, i24).getWhite30();
                }
                c28655q.m87173q(z19);
                AbstractC30795n.m94707h(date13, null, white31, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q, i24).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                c28655q = c28655q;
                c28655q.m87173q(true);
                multiDayCycleDateDisplay = viewState.getMultiDayCycleDateDisplay();
                if (multiDayCycleDateDisplay == null) {
                    c28655q.m87150e0(1033122803);
                    c28655q.m87173q(false);
                    c38072d4 = c38072d2;
                    c0209i6 = c0209i4;
                    z25 = true;
                    c0213j3 = c0213j;
                    c0209i7 = c0209i;
                    modifier6 = c2314t;
                } else {
                    c28655q.m87150e0(1033122804);
                    float f2111 = f18 * f26;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f2111, c2314t));
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                    C23010x c23010xM66775a117 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q.m87165m();
                    Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q, modifierM3396r7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c0213j2 = c0213j;
                        c28655q.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a117);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11117);
                    AbstractC11266d.m30469w(i24, f26, c2314t, c28655q);
                    if (z14) {
                        j13 = C17919x.f69629f;
                    } else {
                        j13 = C17919x.f69627d;
                    }
                    f26 = f26;
                    c38072d3 = c38072d2;
                    C2314t c2314t8 = c2314t;
                    c0213j3 = c0213j2;
                    AbstractC15751g.m44449b(AbstractC1102d.m3411h((float) 1.8d, AbstractC1102d.m3424u(f26, c2314t)), j13, 0.0f, 0.0f, c28655q, 6, 12);
                    AbstractC30007c.m91851u(c2314t8, 8, c28655q, true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f2111, c2314t8));
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C23010x c23010xM66775a118 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                    iHashCode6 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
                    Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a118);
                    c0209i2 = c0209i2;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11118);
                    String day14 = multiDayCycleDateDisplay.getDay();
                    if (z15) {
                        c28655q.m87150e0(842438654);
                        c38072d4 = c38072d3;
                        i25 = 6;
                        white32 = c38072d4.m121949b(c28655q, 6).getWhite90();
                        z24 = false;
                    } else {
                        c38072d4 = c38072d3;
                        i25 = 6;
                        z24 = false;
                        c28655q.m87150e0(842439646);
                        white32 = c38072d4.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z24);
                    c0209i6 = c0209i4;
                    c0209i7 = c0209i;
                    z25 = true;
                    AbstractC30795n.m94707h(day14, null, white32, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d4.m121952e(c28655q, i25).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                    String date14 = multiDayCycleDateDisplay.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                    if (z15) {
                        i26 = 6;
                        white33 = AbstractC25012a.m73366B(c28655q, 842454657, c38072d4, c28655q, 6);
                        z26 = false;
                    } else {
                        i26 = 6;
                        z26 = false;
                        c28655q.m87150e0(842455742);
                        white33 = c38072d4.m121949b(c28655q, 6).getWhite30();
                    }
                    c28655q.m87173q(z26);
                    AbstractC30795n.m94707h(date14, null, white33, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d4.m121952e(c28655q, i26).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    modifier6 = c2314t8;
                }
                c28655q.m87173q(z25);
                if (viewState.getShowDot()) {
                    c28655q.m87150e0(-304955583);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18 * f26, modifier6));
                    Modifier modifierM3419p7 = AbstractC1102d.m3419p(f26 * f26, modifier6);
                    if (viewState.getStyle() == enumC16612g) {
                        c28655q.m87150e0(-304750208);
                        modifierM3358c = AbstractC15751g.m44455h(modifier6, f18, c38072d4.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f25));
                        z27 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-304420554);
                        dotColorOverride = viewState.getDotColorOverride();
                        if (dotColorOverride == null) {
                            c28655q.m87150e0(-304321696);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2068393153);
                            c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, dotColorOverride.mo134584toComposableColorWaAFU9c(c28655q, 0));
                        }
                        c17919x = c17919xM31989h;
                        if (c17919x == null) {
                            c28655q.m87150e0(-304242242);
                            i27 = a.f63887a[viewState.getStyle().ordinal()];
                            if (i27 != 2) {
                                z27 = false;
                                c28655q.m87150e0(2068399066);
                                accentAction = c38072d4.m121949b(c28655q, 6).getAccentAction();
                                c28655q.m87173q(false);
                            } else if (i27 != 3) {
                                z27 = false;
                                c28655q.m87150e0(2068402613);
                                accentAction = c38072d4.m121949b(c28655q, 6).getWhite30();
                                c28655q.m87173q(false);
                            } else if (i27 != 4) {
                                z27 = false;
                                c28655q.m87150e0(2068405908);
                                accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                c28655q.m87173q(false);
                            } else if (i27 != 5) {
                                c28655q.m87150e0(2068411732);
                                accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                                z27 = false;
                                c28655q.m87173q(false);
                            } else {
                                z27 = false;
                                c28655q.m87150e0(2068409175);
                                accentAction = c38072d4.m121949b(c28655q, 6).getCoachBlue();
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z27);
                        } else {
                            z27 = false;
                            c28655q.m87150e0(2068392895);
                            c28655q.m87173q(false);
                            accentAction = c17919x.f69639a;
                        }
                        modifierM3358c = AbstractC1092a.m3358c(modifier6, accentAction, AbstractC33253j.m105489e(r16));
                        c28655q.m87173q(z27);
                    }
                    Modifier modifierMo3471e111 = modifierM3419p7.mo3471e(modifierM3358c);
                    InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m, z27);
                    iHashCode7 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q.m87165m();
                    Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q, modifierMo3471e111);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d14);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N11119);
                    if (viewState.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                        c28655q.m87150e0(1939249771);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 54), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62314d), AbstractC1102d.m3419p(r16, modifier6), c38072d4.m121949b(c28655q, 6).getBrandBlack(), c28655q, 384, 0);
                        z28 = false;
                        c28655q.m87173q(false);
                    } else {
                        z28 = false;
                        c28655q.m87150e0(1939803989);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z25);
                    c28655q.m87173q(z28);
                } else {
                    c28655q.m87150e0(-302753932);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z25);
                c28655q.m87173q(z25);
                modifier3 = modifier4;
                str3 = str11;
            } else {
                c3 = '\b';
            }
            z14 = false;
            style = viewState.getStyle();
            enumC16612g = EnumC16612g.INVALID;
            if (style != enumC16612g) {
                z15 = false;
            } else {
                z15 = false;
            }
            Modifier modifierM44101d8 = AbstractC15676d.m44101d(modifier4, str4);
            contentDescription = viewState.getContentDescription();
            C28676v0 c28676v7 = C28635l.f115821a;
            if (contentDescription == null) {
                c28655q.m87150e0(-1358534295);
                c28655q.m87173q(false);
                modifierM51775c = null;
            } else {
                c28655q.m87150e0(-1358534294);
                zM87153g = c28655q.m87153g(contentDescription);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = new C2663y4(contentDescription, 27);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2663y4(contentDescription, 27);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM51775c = AbstractC18032n.m51775c(modifierM3362g, false, (Function1) objM87133R);
                c28655q.m87173q(false);
            }
            if (modifierM51775c == null) {
                modifierM51775c = modifierM3362g;
            }
            Modifier modifierMo3471e112 = modifierM44101d8.mo3471e(modifierM51775c);
            if (z13) {
                f17 = f63886c;
            } else {
                f17 = f63884a;
            }
            Modifier modifierM118994r8 = AbstractC37056f.m118994r(AbstractC1102d.m3411h(f63885b, AbstractC1102d.m3424u(f17, modifierMo3471e112)), c33252iM105489e4);
            if (z14) {
                c28655q.m87150e0(-1357835771);
                if ((i15 & 14) != 4) {
                    if ((i15 & 8) != 0) {
                        c16613h = viewState;
                        if (c28655q.m87157i(c16613h)) {
                        }
                        if ((i15 & 112) == 32) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = z34 | z29;
                        objM87133R3 = c28655q.m87133R();
                        if (z35) {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C13989w1(19, c16613h, onClick);
                            c28655q.m87172p0(objM87133R3);
                        }
                        modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        modifier5 = modifierM3362g;
                        c28655q.m87173q(false);
                    } else {
                        c16613h = viewState;
                    }
                    z29 = false;
                    if ((i15 & 112) == 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    z35 = z34 | z29;
                    objM87133R3 = c28655q.m87133R();
                    if (z35) {
                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C13989w1(19, c16613h, onClick);
                        c28655q.m87172p0(objM87133R3);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    modifier5 = modifierM3362g;
                    c28655q.m87173q(false);
                } else {
                    c16613h = viewState;
                }
                z29 = true;
                if ((i15 & 112) == 32) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                z35 = z34 | z29;
                objM87133R3 = c28655q.m87133R();
                if (z35) {
                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C13989w1(19, c16613h, onClick);
                    c28655q.m87172p0(objM87133R3);
                }
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                modifier5 = modifierM3362g;
                c28655q.m87173q(false);
            } else {
                c16613h = viewState;
                modifier5 = modifierM3362g;
                c28655q.m87150e0(-1357441048);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e113 = modifierM118994r8.mo3471e(modifierM3362g);
            f18 = 1;
            if (c16613h.getIsSelected()) {
                j7 = C17919x.f69629f;
            } else {
                j7 = C17919x.f69636m;
            }
            c2314t = modifier5;
            Modifier modifierM3358c9 = AbstractC1092a.m3358c(AbstractC15751g.m44455h(modifierMo3471e113, f18, j7, c33252iM105489e4), c38072d.m121949b(c28655q, 6).getWhite10(), c33252iM105489e4);
            if ((i15 & 14) != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            zM87151f = z16 | c28655q.m87151f(white50) | c28655q.m87147d(f16);
            objM87133R2 = c28655q.m87133R();
            if (zM87151f) {
                objM87133R2 = new C11251l(c16613h, white50, f16);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C11251l(c16613h, white50, f16);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3478a8 = AbstractC1125a.m3478a(modifierM3358c9, (Function1) objM87133R2);
            c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q.m87165m();
            Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q, modifierM3478a8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d15);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111110);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111110);
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, c2314t);
            if (c16613h.getIcon() != null) {
                f19 = 0;
                i18 = 4;
            } else {
                i18 = 4;
                f19 = 4 * f18;
            }
            f24 = 2;
            float f2112 = i18;
            f25 = f24 * f2112;
            Modifier modifierM3395q8 = AbstractC1099a.m3395q(modifierM3407d8, f19, f25);
            C22961h c22961h8 = AbstractC22977m.f90654e;
            c2305k = C2299e.f9111N;
            String str12 = str4;
            C23010x c23010xM66775a119 = AbstractC23007w.m66775a(c22961h8, c2305k, c28655q, 54);
            f26 = f2112;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q.m87165m();
            Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q, modifierM3395q8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a119);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111111);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111111);
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22961h8, C2299e.f9108K, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q.m87165m();
            Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111112);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111112);
            icon = viewState.getIcon();
            if (icon == null) {
                c28655q.m87150e0(1031411324);
                c28655q.m87173q(false);
                c0209i5 = c0209i3;
                c7 = 4;
                c38072d2 = c38072d;
            } else {
                C27430e c27430eM53378s8 = AbstractC18489d0.m53378s(c28655q, 1031411325, icon, c28655q, 6);
                if (a.f63887a[viewState.getStyle().ordinal()] == 1) {
                    c28655q.m87150e0(-2064203619);
                    jM73366B = c38072d.m121949b(c28655q, 6).getWhite30();
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    z17 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q, -2064201632, c38072d, c28655q, 6);
                    c28655q.m87173q(false);
                }
                c0209i5 = c0209i3;
                c7 = 4;
                c38072d2 = c38072d;
                AbstractC15005f3.m43108b(c27430eM53378s8, null, AbstractC1102d.m3419p(5 * f26, c2314t), jM73366B, c28655q, 432, 0);
                c28655q.m87173q(z17);
            }
            if (z13) {
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f27 = Float.MAX_VALUE;
                } else {
                    f27 = 1.0f;
                }
                layoutWeightElement = new LayoutWeightElement(f27, true);
            } else {
                layoutWeightElement = r0;
            }
            c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q.m87165m();
            Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a1110);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111113);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111113);
            String day15 = viewState.getDateDisplay().getDay();
            if (z15) {
                c28655q.m87150e0(-1366323109);
                i19 = 6;
                white30 = c38072d2.m121949b(c28655q, 6).getWhite90();
                z18 = false;
            } else {
                i19 = 6;
                z18 = false;
                c28655q.m87150e0(-1366322117);
                white30 = c38072d2.m121949b(c28655q, 6).getWhite30();
            }
            c28655q.m87173q(z18);
            i24 = i19;
            AbstractC30795n.m94707h(day15, null, white30, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d2.m121952e(c28655q, i19).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
            String date15 = viewState.getDateDisplay().getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            if (z15) {
                white31 = AbstractC25012a.m73366B(c28655q, -1366308066, c38072d2, c28655q, i24);
                z19 = false;
            } else {
                z19 = false;
                c28655q.m87150e0(-1366306981);
                white31 = c38072d2.m121949b(c28655q, i24).getWhite30();
            }
            c28655q.m87173q(z19);
            AbstractC30795n.m94707h(date15, null, white31, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d2.m121952e(c28655q, i24).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
            c28655q = c28655q;
            c28655q.m87173q(true);
            multiDayCycleDateDisplay = viewState.getMultiDayCycleDateDisplay();
            if (multiDayCycleDateDisplay == null) {
                c28655q.m87150e0(1033122803);
                c28655q.m87173q(false);
                c38072d4 = c38072d2;
                c0209i6 = c0209i4;
                z25 = true;
                c0213j3 = c0213j;
                c0209i7 = c0209i;
                modifier6 = c2314t;
            } else {
                c28655q.m87150e0(1033122804);
                float f2113 = f18 * f26;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f2113, c2314t));
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(c22957g, r19, c28655q, 48);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q.m87165m();
                Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q, modifierM3396r8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c0213j2 = c0213j;
                    c28655q.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a1111);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111114);
                AbstractC11266d.m30469w(i24, f26, c2314t, c28655q);
                if (z14) {
                    j13 = C17919x.f69629f;
                } else {
                    j13 = C17919x.f69627d;
                }
                f26 = f26;
                c38072d3 = c38072d2;
                C2314t c2314t9 = c2314t;
                c0213j3 = c0213j2;
                AbstractC15751g.m44449b(AbstractC1102d.m3411h((float) 1.8d, AbstractC1102d.m3424u(f26, c2314t)), j13, 0.0f, 0.0f, c28655q, 6, 12);
                AbstractC30007c.m91851u(c2314t9, 8, c28655q, true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f2113, c2314t9));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                iHashCode6 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q.m87165m();
                Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q, layoutWeightElement9);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a1112);
                c0209i2 = c0209i2;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111115);
                String day16 = multiDayCycleDateDisplay.getDay();
                if (z15) {
                    c28655q.m87150e0(842438654);
                    c38072d4 = c38072d3;
                    i25 = 6;
                    white32 = c38072d4.m121949b(c28655q, 6).getWhite90();
                    z24 = false;
                } else {
                    c38072d4 = c38072d3;
                    i25 = 6;
                    z24 = false;
                    c28655q.m87150e0(842439646);
                    white32 = c38072d4.m121949b(c28655q, 6).getWhite30();
                }
                c28655q.m87173q(z24);
                c0209i6 = c0209i4;
                c0209i7 = c0209i;
                z25 = true;
                AbstractC30795n.m94707h(day16, null, white32, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 1, false, 1, 0, null, c38072d4.m121952e(c28655q, i25).getB3(), fValueOf, c28655q, 0, 12586032, 54778);
                String date16 = multiDayCycleDateDisplay.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
                if (z15) {
                    i26 = 6;
                    white33 = AbstractC25012a.m73366B(c28655q, 842454657, c38072d4, c28655q, 6);
                    z26 = false;
                } else {
                    i26 = 6;
                    z26 = false;
                    c28655q.m87150e0(842455742);
                    white33 = c38072d4.m121949b(c28655q, 6).getWhite30();
                }
                c28655q.m87173q(z26);
                AbstractC30795n.m94707h(date16, null, white33, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, c38072d4.m121952e(c28655q, i26).getN7(), fValueOf, c28655q, 0, 12585984, 56826);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                modifier6 = c2314t9;
            }
            c28655q.m87173q(z25);
            if (viewState.getShowDot()) {
                c28655q.m87150e0(-304955583);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18 * f26, modifier6));
                Modifier modifierM3419p8 = AbstractC1102d.m3419p(f26 * f26, modifier6);
                if (viewState.getStyle() == enumC16612g) {
                    c28655q.m87150e0(-304750208);
                    modifierM3358c = AbstractC15751g.m44455h(modifier6, f18, c38072d4.m121949b(c28655q, 6).getWhite30(), AbstractC33253j.m105489e(f25));
                    z27 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-304420554);
                    dotColorOverride = viewState.getDotColorOverride();
                    if (dotColorOverride == null) {
                        c28655q.m87150e0(-304321696);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2068393153);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, dotColorOverride.mo134584toComposableColorWaAFU9c(c28655q, 0));
                    }
                    c17919x = c17919xM31989h;
                    if (c17919x == null) {
                        c28655q.m87150e0(-304242242);
                        i27 = a.f63887a[viewState.getStyle().ordinal()];
                        if (i27 != 2) {
                            z27 = false;
                            c28655q.m87150e0(2068399066);
                            accentAction = c38072d4.m121949b(c28655q, 6).getAccentAction();
                            c28655q.m87173q(false);
                        } else if (i27 != 3) {
                            z27 = false;
                            c28655q.m87150e0(2068402613);
                            accentAction = c38072d4.m121949b(c28655q, 6).getWhite30();
                            c28655q.m87173q(false);
                        } else if (i27 != 4) {
                            z27 = false;
                            c28655q.m87150e0(2068405908);
                            accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                            c28655q.m87173q(false);
                        } else if (i27 != 5) {
                            c28655q.m87150e0(2068411732);
                            accentAction = c38072d4.m121949b(c28655q, 6).getGreyL1();
                            z27 = false;
                            c28655q.m87173q(false);
                        } else {
                            z27 = false;
                            c28655q.m87150e0(2068409175);
                            accentAction = c38072d4.m121949b(c28655q, 6).getCoachBlue();
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z27);
                    } else {
                        z27 = false;
                        c28655q.m87150e0(2068392895);
                        c28655q.m87173q(false);
                        accentAction = c17919x.f69639a;
                    }
                    modifierM3358c = AbstractC1092a.m3358c(modifier6, accentAction, AbstractC33253j.m105489e(r16));
                    c28655q.m87173q(z27);
                }
                Modifier modifierMo3471e114 = modifierM3419p8.mo3471e(modifierM3358c);
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m, z27);
                iHashCode7 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q, modifierMo3471e114);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d16);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111116);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N111116);
                if (viewState.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                    c28655q.m87150e0(1939249771);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 54), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62314d), AbstractC1102d.m3419p(r16, modifier6), c38072d4.m121949b(c28655q, 6).getBrandBlack(), c28655q, 384, 0);
                    z28 = false;
                    c28655q.m87173q(false);
                } else {
                    z28 = false;
                    c28655q.m87150e0(1939803989);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z25);
                c28655q.m87173q(z28);
            } else {
                c28655q.m87150e0(-302753932);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z25);
            c28655q.m87173q(z25);
            modifier3 = modifier4;
            str3 = str12;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(viewState, onClick, modifier3, str3, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m47137f(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m47138g(C16613h c16613h, Function1 function1) {
        Object interaction = c16613h.getInteraction();
        if (interaction == null) {
            interaction = new C16607b(c16613h.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), c16613h.getCycleId());
        }
        function1.invoke(interaction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m47139h(C16613h c16613h, long j7, float f13, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        if (c16613h.getShowDashBorder() && !c16613h.getIsSelected()) {
            long jMo731d = drawBehind.mo731d();
            float fMo743q0 = drawBehind.mo743q0(f13);
            InterfaceC22131e.m63374D(drawBehind, j7, 0L, jMo731d, (((long) Float.floatToRawIntBits(drawBehind.mo743q0(f13))) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32), new C22135i(drawBehind.mo743q0(3), 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{12.0f, 6.0f}, 0.0f)), 14), 0.0f, 226);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m47140i(C16613h c16613h, Function1 function1, Modifier modifier, String str, int i13, int i14, Composer composer, int i15) {
        m47136e(c16613h, function1, modifier, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final float m47141j() {
        return f63884a;
    }

    /* JADX INFO: renamed from: k */
    public static final float m47142k() {
        return f63886c;
    }
}
