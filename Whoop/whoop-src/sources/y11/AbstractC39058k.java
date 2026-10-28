package y11;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b21.AbstractC2331d;
import b21.C2332e;
import b61.AbstractC2758m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.items.graph.LayoutDirection;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dn0.C12203c;
import g40.C15428u0;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import i21.C17992b;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27248d1;
import ny0.EnumC27247d0;
import ny0.EnumC27250e0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11343d2;
import p077d0.C11421z1;
import p132f0.InterfaceC13832v0;
import p133f1.C13996z;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
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
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39083d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p727py0.C29616a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: y11.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aÍ\u0001\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\n2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aG\u0010 \u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b \u0010!\u001a]\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "percentage", "time", "timeSuffix", "Li2/x;", "fillColor", "", "isSelected", "isDrillDown", "", "Lb21/e;", "ratios", "showAverage", "Ll83/k;", "", "averageRange", "Ld0/z1;", "widthRatioTransition", "showRadioButton", "hideBackground", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "timeSpliceLayoutDirection", "Lkotlin/Function0;", "Ll83/a0;", "onToggle", "i", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "enable", "o", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "p", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39058k {
    /* JADX WARN: Code duplicated, block: B:101:0x0168  */
    /* JADX WARN: Code duplicated, block: B:103:0x016f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0173  */
    /* JADX WARN: Code duplicated, block: B:107:0x017d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0182  */
    /* JADX WARN: Code duplicated, block: B:112:0x018d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0190  */
    /* JADX WARN: Code duplicated, block: B:115:0x0196  */
    /* JADX WARN: Code duplicated, block: B:117:0x019e  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:153:0x0204  */
    /* JADX WARN: Code duplicated, block: B:157:0x020c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0212  */
    /* JADX WARN: Code duplicated, block: B:163:0x0221  */
    /* JADX WARN: Code duplicated, block: B:167:0x022e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0237  */
    /* JADX WARN: Code duplicated, block: B:172:0x0240  */
    /* JADX WARN: Code duplicated, block: B:179:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0265  */
    /* JADX WARN: Code duplicated, block: B:183:0x026a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0273  */
    /* JADX WARN: Code duplicated, block: B:186:0x0275  */
    /* JADX WARN: Code duplicated, block: B:188:0x0279  */
    /* JADX WARN: Code duplicated, block: B:189:0x027c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0280  */
    /* JADX WARN: Code duplicated, block: B:192:0x0283  */
    /* JADX WARN: Code duplicated, block: B:195:0x0289  */
    /* JADX WARN: Code duplicated, block: B:196:0x028c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0291  */
    /* JADX WARN: Code duplicated, block: B:201:0x0295  */
    /* JADX WARN: Code duplicated, block: B:202:0x0298  */
    /* JADX WARN: Code duplicated, block: B:204:0x029c  */
    /* JADX WARN: Code duplicated, block: B:205:0x029e  */
    /* JADX WARN: Code duplicated, block: B:207:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:212:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:215:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:217:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:223:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:226:0x030e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x0314  */
    /* JADX WARN: Code duplicated, block: B:231:0x0317  */
    /* JADX WARN: Code duplicated, block: B:232:0x0337  */
    /* JADX WARN: Code duplicated, block: B:234:0x033d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x0367  */
    /* JADX WARN: Code duplicated, block: B:240:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:241:0x03db  */
    /* JADX WARN: Code duplicated, block: B:244:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:248:0x0431  */
    /* JADX WARN: Code duplicated, block: B:249:0x0435  */
    /* JADX WARN: Code duplicated, block: B:252:0x0448  */
    /* JADX WARN: Code duplicated, block: B:254:0x0456  */
    /* JADX WARN: Code duplicated, block: B:257:0x0465  */
    /* JADX WARN: Code duplicated, block: B:259:0x0473  */
    /* JADX WARN: Code duplicated, block: B:260:0x0475  */
    /* JADX WARN: Code duplicated, block: B:263:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x047f  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:268:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:270:0x04f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:276:0x0531  */
    /* JADX WARN: Code duplicated, block: B:277:0x0558  */
    /* JADX WARN: Code duplicated, block: B:280:0x056f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0591  */
    /* JADX WARN: Code duplicated, block: B:285:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0113  */
    /* JADX WARN: Code duplicated, block: B:76:0x0117  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x0124  */
    /* JADX WARN: Code duplicated, block: B:83:0x012e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0148  */
    /* JADX WARN: Code duplicated, block: B:93:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0156  */
    /* JADX WARN: Code duplicated, block: B:96:0x0159  */
    /* JADX WARN: Code duplicated, block: B:98:0x015e  */
    /* JADX INFO: renamed from: i */
    public static final void m124517i(Modifier modifier, final TextResource title, TextResource textResource, final TextResource percentage, final TextResource time, final TextResource timeSuffix, final long j7, boolean z4, boolean z13, final List<C2332e> ratios, boolean z14, C23465k c23465k, C11421z1 c11421z1, boolean z15, boolean z16, LayoutDirection layoutDirection, final InterfaceC4339a onToggle, Composer composer, final int i13, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        TextResource textResourceM21267a;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int iOrdinal;
        int i44;
        boolean z17;
        final boolean z18;
        final boolean z19;
        final C23465k c23465k2;
        final C11421z1 c11421z2;
        final boolean z24;
        final boolean z25;
        final LayoutDirection layoutDirection2;
        final Modifier modifier3;
        final TextResource textResource2;
        final boolean z26;
        C28677v1 c28677v1M87180u;
        int i45;
        C2314t c2314t;
        boolean z27;
        boolean z28;
        boolean z29;
        C23465k c23465k3;
        C11421z1 c11421z3;
        boolean z34;
        boolean z35;
        Modifier modifier4;
        LayoutDirection layoutDirection3;
        boolean z36;
        Object objM87133R;
        C28676v0 c28676v0;
        C11421z1 c11421z4;
        boolean zIsEmpty;
        boolean z37;
        boolean z38;
        boolean z39;
        int i46;
        C23465k c23465k4;
        int i47;
        TextResource textResource3;
        int i48;
        boolean z44;
        boolean z45;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z46;
        TextResource textResource4;
        boolean z47;
        boolean z48;
        C23465k c23465k5;
        C37816b c37816bM121344e;
        boolean z49;
        boolean z52;
        boolean z54;
        Object objM87133R3;
        boolean z55;
        int i49;
        int i54;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(percentage, "percentage");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(timeSuffix, "timeSuffix");
        AbstractC22676k.m65750j(ratios, "ratios");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-320873350);
        int i55 = i15 & 1;
        if (i55 != 0) {
            i16 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87153g(title) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i15 & 4) == 0) {
                textResourceM21267a = textResource;
                if (c28655q.m87153g(textResourceM21267a)) {
                    i54 = 256;
                }
                i16 |= i54;
            } else {
                textResourceM21267a = textResource;
            }
            i54 = 128;
            i16 |= i54;
        } else {
            textResourceM21267a = textResource;
        }
        int i56 = i13 & 3072;
        int i57 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i56 == 0) {
            i16 |= c28655q.m87153g(percentage) ? 2048 : 1024;
        }
        int i58 = i13 & 24576;
        int i59 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i58 == 0) {
            i16 |= c28655q.m87153g(time) ? 16384 : 8192;
        }
        int i64 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i65 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i64 == 0) {
            i16 |= c28655q.m87153g(timeSuffix) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= c28655q.m87151f(j7) ? 1048576 : 524288;
        }
        int i66 = i15 & 128;
        if (i66 == 0) {
            if ((i13 & 12582912) == 0) {
                i16 |= c28655q.m87155h(z4) ? 8388608 : 4194304;
            }
            i17 = i15 & 256;
            if (i17 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i18 = 67108864;
                    } else {
                        i18 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i18;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q.m87157i(ratios)) {
                        i49 = 536870912;
                    } else {
                        i49 = 268435456;
                    }
                    i16 |= i49;
                }
                i19 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i19 != 0) {
                    i24 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i14 | i25;
                } else {
                    i24 = i14;
                }
                i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i26 != 0) {
                    i24 |= 48;
                } else if ((i14 & 48) != 0) {
                    i24 |= c28655q.m87153g(c23465k) ? 32 : 16;
                }
                i27 = i24;
                i28 = i15 & 4096;
                if (i28 != 0) {
                    i34 = i27 | 384;
                } else {
                    i29 = i27;
                    if ((i14 & 384) != 0) {
                        i29 |= c28655q.m87153g(c11421z1) ? 256 : 128;
                    }
                    i34 = i29;
                }
                i35 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i35 != 0) {
                    i37 = i34 | 3072;
                } else {
                    i36 = i34;
                    if ((i14 & 3072) != 0) {
                        if (c28655q.m87155h(z15)) {
                            i57 = 2048;
                        }
                        i36 |= i57;
                    }
                    i37 = i36;
                }
                i38 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i38 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (c28655q.m87155h(z16)) {
                            i59 = 16384;
                        }
                        i37 |= i59;
                    }
                    i39 = i15 & 32768;
                    if (i39 != 0) {
                        i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (layoutDirection == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = layoutDirection.ordinal();
                        }
                        if (c28655q.m87149e(iOrdinal)) {
                            i65 = 131072;
                        }
                        i37 |= i65;
                    }
                    if ((i14 & 1572864) == 0) {
                        i37 |= c28655q.m87157i(onToggle) ? 1048576 : 524288;
                    }
                    i44 = i37;
                    if ((306783379 & i16) == 306783378 || (i44 & 599187) != 599186) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z17)) {
                        c28655q.m87140Z();
                        i45 = i13 & 1;
                        c2314t = C2314t.f9131w;
                        if (i45 != 0 || c28655q.m87118C()) {
                            if (i55 != 0) {
                                modifier2 = c2314t;
                            }
                            if ((i15 & 4) != 0) {
                                i16 &= -897;
                                textResourceM21267a = AbstractC8693b.m21267a();
                            }
                            if (i66 != 0) {
                                z27 = false;
                            } else {
                                z27 = z4;
                            }
                            if (i17 != 0) {
                                z28 = false;
                            } else {
                                z28 = z13;
                            }
                            if (i19 != 0) {
                                z29 = true;
                            } else {
                                z29 = z14;
                            }
                            if (i26 != 0) {
                                c23465k3 = null;
                            } else {
                                c23465k3 = c23465k;
                            }
                            c11421z3 = i28 == 0 ? c11421z1 : null;
                            if (i35 != 0) {
                                z34 = false;
                            } else {
                                z34 = z15;
                            }
                            if (i38 != 0) {
                                z35 = false;
                            } else {
                                z35 = z16;
                            }
                            if (i39 != 0) {
                                modifier4 = modifier2;
                                layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                            } else {
                                modifier4 = modifier2;
                                layoutDirection3 = layoutDirection;
                            }
                            z36 = z35;
                        } else {
                            c28655q.m87138X();
                            if ((i15 & 4) != 0) {
                                i16 &= -897;
                            }
                            z28 = z13;
                            z29 = z14;
                            c23465k3 = c23465k;
                            c11421z3 = c11421z1;
                            z34 = z15;
                            z36 = z16;
                            layoutDirection3 = layoutDirection;
                            modifier4 = modifier2;
                            z27 = z4;
                        }
                        c28655q.m87175r();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                        if (c11421z3 == null) {
                            c28655q.m87150e0(878380871);
                            if (!z27 || z28) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                            C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(Boolean.valueOf(z55), "HorizontalTimeGraph Transition", c28655q, 48, 0);
                            c28655q.m87173q(false);
                            c11421z4 = c11421z1M30544f;
                        } else {
                            c28655q.m87150e0(878380127);
                            c28655q.m87173q(false);
                            c11421z4 = c11421z3;
                        }
                        float f13 = 1;
                        C33252i c33252iM105489e = AbstractC33253j.m105489e(4 * f13);
                        zIsEmpty = ratios.isEmpty();
                        z37 = !zIsEmpty;
                        if (!zIsEmpty || (z36 && !z34)) {
                            z38 = false;
                        } else {
                            z38 = true;
                        }
                        if (z36) {
                            c28655q.m87150e0(878390976);
                            c28655q.m87173q(false);
                            z39 = z27;
                            long j13 = C17919x.f69636m;
                            i46 = i16;
                            c23465k4 = new C23465k(new C17919x(j13), new C17919x(j13));
                        } else {
                            z39 = z27;
                            i46 = i16;
                            if (z28 && z39) {
                                c28655q.m87150e0(878395464);
                                c23465k4 = new C23465k(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()));
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(878393448);
                                c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                                c28655q.m87173q(false);
                            }
                        }
                        long j14 = ((C17919x) c23465k4.f92937w).f69639a;
                        long j15 = ((C17919x) c23465k4.f92938x).f69639a;
                        i47 = i46 >> 3;
                        textResource3 = textResourceM21267a;
                        Modifier modifierM44112a = AbstractC15680h.m44112a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_" + AbstractC8693b.m21274h(title, c28655q, i47 & 14)), j14, c33252iM105489e), f13, j15, c33252iM105489e), z37);
                        InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                        boolean zM87155h = c28655q.m87155h(z38);
                        i48 = i44 & 3670016;
                        if (i48 == 1048576) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        z45 = zM87155h | z44;
                        objM87133R2 = c28655q.m87133R();
                        if (z45 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C12203c(7, onToggle, z38);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM44112a, interfaceC21083i, interfaceC13832v0, false, null, (InterfaceC4339a) objM87133R2, 28);
                        float f14 = 8;
                        float f15 = ((float) 1.5d) * f14;
                        Modifier modifierMo3471e = AbstractC1099a.m3397s(modifierM3360e, f15, f13 * f14, f15, f15).mo3471e(modifier4);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        if (z34) {
                            c28655q.m87150e0(1212322546);
                            boolean zM87155h2 = c28655q.m87155h(z38);
                            if (i48 == 1048576) {
                                z52 = true;
                            } else {
                                z52 = false;
                            }
                            z54 = z52 | zM87155h2;
                            objM87133R3 = c28655q.m87133R();
                            if (z54 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C12203c(8, onToggle, z38);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i67 = i46 << 3;
                            boolean z56 = z39;
                            m124524p(title, textResource3, percentage, z37, j7, time, timeSuffix, z56, (InterfaceC4339a) objM87133R3, c28655q, (458752 & i67) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i67) | (i46 & 29360128));
                            z46 = z56;
                            z47 = false;
                            c28655q.m87173q(false);
                            textResource4 = textResource3;
                        } else {
                            z46 = z39;
                            c28655q.m87150e0(1212516420);
                            int i68 = i46 << 3;
                            m124523o(title, textResource3, percentage, z37, j7, time, timeSuffix, c28655q, (458752 & i68) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i68));
                            textResource4 = textResource3;
                            z47 = false;
                            c28655q.m87173q(false);
                        }
                        if (zIsEmpty) {
                            z48 = z29;
                            c23465k5 = c23465k3;
                            c28655q.m87150e0(1213608178);
                            c28655q.m87173q(z47);
                        } else {
                            c28655q.m87150e0(1212679852);
                            if (!z46 || z28) {
                                c28655q.m87150e0(1286048944);
                                boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                                c28655q.m87173q(z47);
                                z47 = zIsFeatureEnabled;
                            } else {
                                c28655q.m87150e0(1212812837);
                                c28655q.m87173q(z47);
                            }
                            z48 = z29;
                            c23465k5 = c23465k3;
                            c37816bM121344e = AbstractC37817c.m121344e(-808883125, c28655q, new C15428u0(j7, c11421z4, ratios, c23465k5, z48));
                            if (z47) {
                                c28655q.m87150e0(1213334386);
                                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(AbstractC2758m.m7811a(layoutDirection3)), AbstractC37817c.m121344e(-1280925795, c28655q, new C13996z(c37816bM121344e, 7)), c28655q, 56);
                                z49 = false;
                                c28655q.m87173q(false);
                            } else {
                                z49 = false;
                                c28655q.m87150e0(1213556935);
                                c37816bM121344e.invoke(c28655q, 6);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z49);
                        }
                        c28655q.m87173q(true);
                        c23465k2 = c23465k5;
                        textResource2 = textResource4;
                        z18 = z46;
                        modifier3 = modifier4;
                        z24 = z34;
                        z25 = z36;
                        layoutDirection2 = layoutDirection3;
                        z26 = z28;
                        c11421z2 = c11421z3;
                        z19 = z48;
                    } else {
                        c28655q.m87138X();
                        z18 = z4;
                        z19 = z14;
                        c23465k2 = c23465k;
                        c11421z2 = c11421z1;
                        z24 = z15;
                        z25 = z16;
                        layoutDirection2 = layoutDirection;
                        modifier3 = modifier2;
                        textResource2 = textResourceM21267a;
                        z26 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC39058k.m124522n(modifier3, title, textResource2, percentage, time, timeSuffix, j7, z18, z26, ratios, z19, c23465k2, c11421z2, z24, z25, layoutDirection2, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i37 |= 24576;
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (layoutDirection == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = layoutDirection.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i65 = 131072;
                    }
                    i37 |= i65;
                }
                if ((i14 & 1572864) == 0) {
                    i37 |= c28655q.m87157i(onToggle) ? 1048576 : 524288;
                }
                i44 = i37;
                if ((306783379 & i16) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (c28655q.m87135U(i16 & 1, z17)) {
                    c28655q.m87140Z();
                    i45 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i66 != 0) {
                            z27 = false;
                        } else {
                            z27 = z4;
                        }
                        if (i17 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if (i19 != 0) {
                            z29 = true;
                        } else {
                            z29 = z14;
                        }
                        if (i26 != 0) {
                            c23465k3 = null;
                        } else {
                            c23465k3 = c23465k;
                        }
                        if (i28 == 0) {
                        }
                        if (i35 != 0) {
                            z34 = false;
                        } else {
                            z34 = z15;
                        }
                        if (i38 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        if (i39 != 0) {
                            modifier4 = modifier2;
                            layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                        } else {
                            modifier4 = modifier2;
                            layoutDirection3 = layoutDirection;
                        }
                        z36 = z35;
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i66 != 0) {
                            z27 = false;
                        } else {
                            z27 = z4;
                        }
                        if (i17 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if (i19 != 0) {
                            z29 = true;
                        } else {
                            z29 = z14;
                        }
                        if (i26 != 0) {
                            c23465k3 = null;
                        } else {
                            c23465k3 = c23465k;
                        }
                        if (i28 == 0) {
                        }
                        if (i35 != 0) {
                            z34 = false;
                        } else {
                            z34 = z15;
                        }
                        if (i38 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        if (i39 != 0) {
                            modifier4 = modifier2;
                            layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                        } else {
                            modifier4 = modifier2;
                            layoutDirection3 = layoutDirection;
                        }
                        z36 = z35;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                    if (c11421z3 == null) {
                        c28655q.m87150e0(878380871);
                        if (z27) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        C11421z1 c11421z1M30544f2 = AbstractC11343d2.m30544f(Boolean.valueOf(z55), "HorizontalTimeGraph Transition", c28655q, 48, 0);
                        c28655q.m87173q(false);
                        c11421z4 = c11421z1M30544f2;
                    } else {
                        c28655q.m87150e0(878380127);
                        c28655q.m87173q(false);
                        c11421z4 = c11421z3;
                    }
                    float f16 = 1;
                    C33252i c33252iM105489e2 = AbstractC33253j.m105489e(4 * f16);
                    zIsEmpty = ratios.isEmpty();
                    z37 = !zIsEmpty;
                    if (zIsEmpty) {
                        z38 = false;
                    } else {
                        z38 = false;
                    }
                    if (z36) {
                        c28655q.m87150e0(878390976);
                        c28655q.m87173q(false);
                        z39 = z27;
                        long j16 = C17919x.f69636m;
                        i46 = i16;
                        c23465k4 = new C23465k(new C17919x(j16), new C17919x(j16));
                    } else {
                        z39 = z27;
                        i46 = i16;
                        if (z28) {
                            c28655q.m87150e0(878393448);
                            c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(878393448);
                            c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                            c28655q.m87173q(false);
                        }
                    }
                    long j17 = ((C17919x) c23465k4.f92937w).f69639a;
                    long j18 = ((C17919x) c23465k4.f92938x).f69639a;
                    i47 = i46 >> 3;
                    textResource3 = textResourceM21267a;
                    Modifier modifierM44112a2 = AbstractC15680h.m44112a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_" + AbstractC8693b.m21274h(title, c28655q, i47 & 14)), j17, c33252iM105489e2), f16, j18, c33252iM105489e2), z37);
                    InterfaceC13832v0 interfaceC13832v1 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                    boolean zM87155h3 = c28655q.m87155h(z38);
                    i48 = i44 & 3670016;
                    if (i48 == 1048576) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    z45 = zM87155h3 | z44;
                    objM87133R2 = c28655q.m87133R();
                    if (z45) {
                        objM87133R2 = new C12203c(7, onToggle, z38);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12203c(7, onToggle, z38);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM44112a2, interfaceC21083i2, interfaceC13832v1, false, null, (InterfaceC4339a) objM87133R2, 28);
                    float f17 = 8;
                    float f18 = ((float) 1.5d) * f17;
                    Modifier modifierMo3471e2 = AbstractC1099a.m3397s(modifierM3360e2, f18, f16 * f17, f18, f18).mo3471e(modifier4);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    if (z34) {
                        c28655q.m87150e0(1212322546);
                        boolean zM87155h4 = c28655q.m87155h(z38);
                        if (i48 == 1048576) {
                            z52 = true;
                        } else {
                            z52 = false;
                        }
                        z54 = z52 | zM87155h4;
                        objM87133R3 = c28655q.m87133R();
                        if (z54) {
                            objM87133R3 = new C12203c(8, onToggle, z38);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C12203c(8, onToggle, z38);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i69 = i46 << 3;
                        boolean z57 = z39;
                        m124524p(title, textResource3, percentage, z37, j7, time, timeSuffix, z57, (InterfaceC4339a) objM87133R3, c28655q, (458752 & i69) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i69) | (i46 & 29360128));
                        z46 = z57;
                        z47 = false;
                        c28655q.m87173q(false);
                        textResource4 = textResource3;
                    } else {
                        z46 = z39;
                        c28655q.m87150e0(1212516420);
                        int i610 = i46 << 3;
                        m124523o(title, textResource3, percentage, z37, j7, time, timeSuffix, c28655q, (458752 & i610) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i610));
                        textResource4 = textResource3;
                        z47 = false;
                        c28655q.m87173q(false);
                    }
                    if (zIsEmpty) {
                        c28655q.m87150e0(1212679852);
                        if (z46) {
                            c28655q.m87150e0(1286048944);
                            boolean zIsFeatureEnabled2 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                            c28655q.m87173q(z47);
                            z47 = zIsFeatureEnabled2;
                        } else {
                            c28655q.m87150e0(1286048944);
                            boolean zIsFeatureEnabled3 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                            c28655q.m87173q(z47);
                            z47 = zIsFeatureEnabled3;
                        }
                        z48 = z29;
                        c23465k5 = c23465k3;
                        c37816bM121344e = AbstractC37817c.m121344e(-808883125, c28655q, new C15428u0(j7, c11421z4, ratios, c23465k5, z48));
                        if (z47) {
                            c28655q.m87150e0(1213334386);
                            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(AbstractC2758m.m7811a(layoutDirection3)), AbstractC37817c.m121344e(-1280925795, c28655q, new C13996z(c37816bM121344e, 7)), c28655q, 56);
                            z49 = false;
                            c28655q.m87173q(false);
                        } else {
                            z49 = false;
                            c28655q.m87150e0(1213556935);
                            c37816bM121344e.invoke(c28655q, 6);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z49);
                    } else {
                        z48 = z29;
                        c23465k5 = c23465k3;
                        c28655q.m87150e0(1213608178);
                        c28655q.m87173q(z47);
                    }
                    c28655q.m87173q(true);
                    c23465k2 = c23465k5;
                    textResource2 = textResource4;
                    z18 = z46;
                    modifier3 = modifier4;
                    z24 = z34;
                    z25 = z36;
                    layoutDirection2 = layoutDirection3;
                    z26 = z28;
                    c11421z2 = c11421z3;
                    z19 = z48;
                } else {
                    c28655q.m87138X();
                    z18 = z4;
                    z19 = z14;
                    c23465k2 = c23465k;
                    c11421z2 = c11421z1;
                    z24 = z15;
                    z25 = z16;
                    layoutDirection2 = layoutDirection;
                    modifier3 = modifier2;
                    textResource2 = textResourceM21267a;
                    z26 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC39058k.m124522n(modifier3, title, textResource2, percentage, time, timeSuffix, j7, z18, z26, ratios, z19, c23465k2, c11421z2, z24, z25, layoutDirection2, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 100663296;
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(ratios)) {
                    i49 = 536870912;
                } else {
                    i49 = 268435456;
                }
                i16 |= i49;
            }
            i19 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i19 != 0) {
                i24 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87155h(z14)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i14 | i25;
            } else {
                i24 = i14;
            }
            i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i14 & 48) != 0) {
                i24 |= c28655q.m87153g(c23465k) ? 32 : 16;
            }
            i27 = i24;
            i28 = i15 & 4096;
            if (i28 != 0) {
                i34 = i27 | 384;
            } else {
                i29 = i27;
                if ((i14 & 384) != 0) {
                    i29 |= c28655q.m87153g(c11421z1) ? 256 : 128;
                }
                i34 = i29;
            }
            i35 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i35 != 0) {
                i37 = i34 | 3072;
            } else {
                i36 = i34;
                if ((i14 & 3072) != 0) {
                    if (c28655q.m87155h(z15)) {
                        i57 = 2048;
                    }
                    i36 |= i57;
                }
                i37 = i36;
            }
            i38 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i38 != 0) {
                if ((i14 & 24576) == 0) {
                    if (c28655q.m87155h(z16)) {
                        i59 = 16384;
                    }
                    i37 |= i59;
                }
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (layoutDirection == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = layoutDirection.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i65 = 131072;
                    }
                    i37 |= i65;
                }
                if ((i14 & 1572864) == 0) {
                    i37 |= c28655q.m87157i(onToggle) ? 1048576 : 524288;
                }
                i44 = i37;
                if ((306783379 & i16) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (c28655q.m87135U(i16 & 1, z17)) {
                    c28655q.m87140Z();
                    i45 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i66 != 0) {
                            z27 = false;
                        } else {
                            z27 = z4;
                        }
                        if (i17 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if (i19 != 0) {
                            z29 = true;
                        } else {
                            z29 = z14;
                        }
                        if (i26 != 0) {
                            c23465k3 = null;
                        } else {
                            c23465k3 = c23465k;
                        }
                        if (i28 == 0) {
                        }
                        if (i35 != 0) {
                            z34 = false;
                        } else {
                            z34 = z15;
                        }
                        if (i38 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        if (i39 != 0) {
                            modifier4 = modifier2;
                            layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                        } else {
                            modifier4 = modifier2;
                            layoutDirection3 = layoutDirection;
                        }
                        z36 = z35;
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i66 != 0) {
                            z27 = false;
                        } else {
                            z27 = z4;
                        }
                        if (i17 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if (i19 != 0) {
                            z29 = true;
                        } else {
                            z29 = z14;
                        }
                        if (i26 != 0) {
                            c23465k3 = null;
                        } else {
                            c23465k3 = c23465k;
                        }
                        if (i28 == 0) {
                        }
                        if (i35 != 0) {
                            z34 = false;
                        } else {
                            z34 = z15;
                        }
                        if (i38 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        if (i39 != 0) {
                            modifier4 = modifier2;
                            layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                        } else {
                            modifier4 = modifier2;
                            layoutDirection3 = layoutDirection;
                        }
                        z36 = z35;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                    if (c11421z3 == null) {
                        c28655q.m87150e0(878380871);
                        if (z27) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        C11421z1 c11421z1M30544f3 = AbstractC11343d2.m30544f(Boolean.valueOf(z55), "HorizontalTimeGraph Transition", c28655q, 48, 0);
                        c28655q.m87173q(false);
                        c11421z4 = c11421z1M30544f3;
                    } else {
                        c28655q.m87150e0(878380127);
                        c28655q.m87173q(false);
                        c11421z4 = c11421z3;
                    }
                    float f19 = 1;
                    C33252i c33252iM105489e3 = AbstractC33253j.m105489e(4 * f19);
                    zIsEmpty = ratios.isEmpty();
                    z37 = !zIsEmpty;
                    if (zIsEmpty) {
                        z38 = false;
                    } else {
                        z38 = false;
                    }
                    if (z36) {
                        c28655q.m87150e0(878390976);
                        c28655q.m87173q(false);
                        z39 = z27;
                        long j19 = C17919x.f69636m;
                        i46 = i16;
                        c23465k4 = new C23465k(new C17919x(j19), new C17919x(j19));
                    } else {
                        z39 = z27;
                        i46 = i16;
                        if (z28) {
                            c28655q.m87150e0(878393448);
                            c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(878393448);
                            c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                            c28655q.m87173q(false);
                        }
                    }
                    long j110 = ((C17919x) c23465k4.f92937w).f69639a;
                    long j111 = ((C17919x) c23465k4.f92938x).f69639a;
                    i47 = i46 >> 3;
                    textResource3 = textResourceM21267a;
                    Modifier modifierM44112a3 = AbstractC15680h.m44112a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_" + AbstractC8693b.m21274h(title, c28655q, i47 & 14)), j110, c33252iM105489e3), f19, j111, c33252iM105489e3), z37);
                    InterfaceC13832v0 interfaceC13832v2 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                    boolean zM87155h5 = c28655q.m87155h(z38);
                    i48 = i44 & 3670016;
                    if (i48 == 1048576) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    z45 = zM87155h5 | z44;
                    objM87133R2 = c28655q.m87133R();
                    if (z45) {
                        objM87133R2 = new C12203c(7, onToggle, z38);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12203c(7, onToggle, z38);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifierM44112a3, interfaceC21083i3, interfaceC13832v2, false, null, (InterfaceC4339a) objM87133R2, 28);
                    float f110 = 8;
                    float f111 = ((float) 1.5d) * f110;
                    Modifier modifierMo3471e3 = AbstractC1099a.m3397s(modifierM3360e3, f111, f19 * f110, f111, f111).mo3471e(modifier4);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    if (z34) {
                        c28655q.m87150e0(1212322546);
                        boolean zM87155h6 = c28655q.m87155h(z38);
                        if (i48 == 1048576) {
                            z52 = true;
                        } else {
                            z52 = false;
                        }
                        z54 = z52 | zM87155h6;
                        objM87133R3 = c28655q.m87133R();
                        if (z54) {
                            objM87133R3 = new C12203c(8, onToggle, z38);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C12203c(8, onToggle, z38);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i611 = i46 << 3;
                        boolean z58 = z39;
                        m124524p(title, textResource3, percentage, z37, j7, time, timeSuffix, z58, (InterfaceC4339a) objM87133R3, c28655q, (458752 & i611) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i611) | (i46 & 29360128));
                        z46 = z58;
                        z47 = false;
                        c28655q.m87173q(false);
                        textResource4 = textResource3;
                    } else {
                        z46 = z39;
                        c28655q.m87150e0(1212516420);
                        int i612 = i46 << 3;
                        m124523o(title, textResource3, percentage, z37, j7, time, timeSuffix, c28655q, (458752 & i612) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i612));
                        textResource4 = textResource3;
                        z47 = false;
                        c28655q.m87173q(false);
                    }
                    if (zIsEmpty) {
                        c28655q.m87150e0(1212679852);
                        if (z46) {
                            c28655q.m87150e0(1286048944);
                            boolean zIsFeatureEnabled4 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                            c28655q.m87173q(z47);
                            z47 = zIsFeatureEnabled4;
                        } else {
                            c28655q.m87150e0(1286048944);
                            boolean zIsFeatureEnabled5 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                            c28655q.m87173q(z47);
                            z47 = zIsFeatureEnabled5;
                        }
                        z48 = z29;
                        c23465k5 = c23465k3;
                        c37816bM121344e = AbstractC37817c.m121344e(-808883125, c28655q, new C15428u0(j7, c11421z4, ratios, c23465k5, z48));
                        if (z47) {
                            c28655q.m87150e0(1213334386);
                            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(AbstractC2758m.m7811a(layoutDirection3)), AbstractC37817c.m121344e(-1280925795, c28655q, new C13996z(c37816bM121344e, 7)), c28655q, 56);
                            z49 = false;
                            c28655q.m87173q(false);
                        } else {
                            z49 = false;
                            c28655q.m87150e0(1213556935);
                            c37816bM121344e.invoke(c28655q, 6);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z49);
                    } else {
                        z48 = z29;
                        c23465k5 = c23465k3;
                        c28655q.m87150e0(1213608178);
                        c28655q.m87173q(z47);
                    }
                    c28655q.m87173q(true);
                    c23465k2 = c23465k5;
                    textResource2 = textResource4;
                    z18 = z46;
                    modifier3 = modifier4;
                    z24 = z34;
                    z25 = z36;
                    layoutDirection2 = layoutDirection3;
                    z26 = z28;
                    c11421z2 = c11421z3;
                    z19 = z48;
                } else {
                    c28655q.m87138X();
                    z18 = z4;
                    z19 = z14;
                    c23465k2 = c23465k;
                    c11421z2 = c11421z1;
                    z24 = z15;
                    z25 = z16;
                    layoutDirection2 = layoutDirection;
                    modifier3 = modifier2;
                    textResource2 = textResourceM21267a;
                    z26 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC39058k.m124522n(modifier3, title, textResource2, percentage, time, timeSuffix, j7, z18, z26, ratios, z19, c23465k2, c11421z2, z24, z25, layoutDirection2, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i37 |= 24576;
            i39 = i15 & 32768;
            if (i39 != 0) {
                i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (layoutDirection == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = layoutDirection.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i65 = 131072;
                }
                i37 |= i65;
            }
            if ((i14 & 1572864) == 0) {
                i37 |= c28655q.m87157i(onToggle) ? 1048576 : 524288;
            }
            i44 = i37;
            if ((306783379 & i16) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (c28655q.m87135U(i16 & 1, z17)) {
                c28655q.m87140Z();
                i45 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i66 != 0) {
                        z27 = false;
                    } else {
                        z27 = z4;
                    }
                    if (i17 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if (i19 != 0) {
                        z29 = true;
                    } else {
                        z29 = z14;
                    }
                    if (i26 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    if (i28 == 0) {
                    }
                    if (i35 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i38 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    if (i39 != 0) {
                        modifier4 = modifier2;
                        layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                    } else {
                        modifier4 = modifier2;
                        layoutDirection3 = layoutDirection;
                    }
                    z36 = z35;
                } else {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i66 != 0) {
                        z27 = false;
                    } else {
                        z27 = z4;
                    }
                    if (i17 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if (i19 != 0) {
                        z29 = true;
                    } else {
                        z29 = z14;
                    }
                    if (i26 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    if (i28 == 0) {
                    }
                    if (i35 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i38 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    if (i39 != 0) {
                        modifier4 = modifier2;
                        layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                    } else {
                        modifier4 = modifier2;
                        layoutDirection3 = layoutDirection;
                    }
                    z36 = z35;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                if (c11421z3 == null) {
                    c28655q.m87150e0(878380871);
                    if (z27) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    C11421z1 c11421z1M30544f4 = AbstractC11343d2.m30544f(Boolean.valueOf(z55), "HorizontalTimeGraph Transition", c28655q, 48, 0);
                    c28655q.m87173q(false);
                    c11421z4 = c11421z1M30544f4;
                } else {
                    c28655q.m87150e0(878380127);
                    c28655q.m87173q(false);
                    c11421z4 = c11421z3;
                }
                float f112 = 1;
                C33252i c33252iM105489e4 = AbstractC33253j.m105489e(4 * f112);
                zIsEmpty = ratios.isEmpty();
                z37 = !zIsEmpty;
                if (zIsEmpty) {
                    z38 = false;
                } else {
                    z38 = false;
                }
                if (z36) {
                    c28655q.m87150e0(878390976);
                    c28655q.m87173q(false);
                    z39 = z27;
                    long j112 = C17919x.f69636m;
                    i46 = i16;
                    c23465k4 = new C23465k(new C17919x(j112), new C17919x(j112));
                } else {
                    z39 = z27;
                    i46 = i16;
                    if (z28) {
                        c28655q.m87150e0(878393448);
                        c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(878393448);
                        c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                        c28655q.m87173q(false);
                    }
                }
                long j113 = ((C17919x) c23465k4.f92937w).f69639a;
                long j114 = ((C17919x) c23465k4.f92938x).f69639a;
                i47 = i46 >> 3;
                textResource3 = textResourceM21267a;
                Modifier modifierM44112a4 = AbstractC15680h.m44112a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_" + AbstractC8693b.m21274h(title, c28655q, i47 & 14)), j113, c33252iM105489e4), f112, j114, c33252iM105489e4), z37);
                InterfaceC13832v0 interfaceC13832v3 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                boolean zM87155h7 = c28655q.m87155h(z38);
                i48 = i44 & 3670016;
                if (i48 == 1048576) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                z45 = zM87155h7 | z44;
                objM87133R2 = c28655q.m87133R();
                if (z45) {
                    objM87133R2 = new C12203c(7, onToggle, z38);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12203c(7, onToggle, z38);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifierM44112a4, interfaceC21083i4, interfaceC13832v3, false, null, (InterfaceC4339a) objM87133R2, 28);
                float f113 = 8;
                float f114 = ((float) 1.5d) * f113;
                Modifier modifierMo3471e4 = AbstractC1099a.m3397s(modifierM3360e4, f114, f112 * f113, f114, f114).mo3471e(modifier4);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                if (z34) {
                    c28655q.m87150e0(1212322546);
                    boolean zM87155h8 = c28655q.m87155h(z38);
                    if (i48 == 1048576) {
                        z52 = true;
                    } else {
                        z52 = false;
                    }
                    z54 = z52 | zM87155h8;
                    objM87133R3 = c28655q.m87133R();
                    if (z54) {
                        objM87133R3 = new C12203c(8, onToggle, z38);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C12203c(8, onToggle, z38);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i613 = i46 << 3;
                    boolean z59 = z39;
                    m124524p(title, textResource3, percentage, z37, j7, time, timeSuffix, z59, (InterfaceC4339a) objM87133R3, c28655q, (458752 & i613) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i613) | (i46 & 29360128));
                    z46 = z59;
                    z47 = false;
                    c28655q.m87173q(false);
                    textResource4 = textResource3;
                } else {
                    z46 = z39;
                    c28655q.m87150e0(1212516420);
                    int i614 = i46 << 3;
                    m124523o(title, textResource3, percentage, z37, j7, time, timeSuffix, c28655q, (458752 & i614) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i614));
                    textResource4 = textResource3;
                    z47 = false;
                    c28655q.m87173q(false);
                }
                if (zIsEmpty) {
                    c28655q.m87150e0(1212679852);
                    if (z46) {
                        c28655q.m87150e0(1286048944);
                        boolean zIsFeatureEnabled6 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                        c28655q.m87173q(z47);
                        z47 = zIsFeatureEnabled6;
                    } else {
                        c28655q.m87150e0(1286048944);
                        boolean zIsFeatureEnabled7 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                        c28655q.m87173q(z47);
                        z47 = zIsFeatureEnabled7;
                    }
                    z48 = z29;
                    c23465k5 = c23465k3;
                    c37816bM121344e = AbstractC37817c.m121344e(-808883125, c28655q, new C15428u0(j7, c11421z4, ratios, c23465k5, z48));
                    if (z47) {
                        c28655q.m87150e0(1213334386);
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(AbstractC2758m.m7811a(layoutDirection3)), AbstractC37817c.m121344e(-1280925795, c28655q, new C13996z(c37816bM121344e, 7)), c28655q, 56);
                        z49 = false;
                        c28655q.m87173q(false);
                    } else {
                        z49 = false;
                        c28655q.m87150e0(1213556935);
                        c37816bM121344e.invoke(c28655q, 6);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z49);
                } else {
                    z48 = z29;
                    c23465k5 = c23465k3;
                    c28655q.m87150e0(1213608178);
                    c28655q.m87173q(z47);
                }
                c28655q.m87173q(true);
                c23465k2 = c23465k5;
                textResource2 = textResource4;
                z18 = z46;
                modifier3 = modifier4;
                z24 = z34;
                z25 = z36;
                layoutDirection2 = layoutDirection3;
                z26 = z28;
                c11421z2 = c11421z3;
                z19 = z48;
            } else {
                c28655q.m87138X();
                z18 = z4;
                z19 = z14;
                c23465k2 = c23465k;
                c11421z2 = c11421z1;
                z24 = z15;
                z25 = z16;
                layoutDirection2 = layoutDirection;
                modifier3 = modifier2;
                textResource2 = textResourceM21267a;
                z26 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC39058k.m124522n(modifier3, title, textResource2, percentage, time, timeSuffix, j7, z18, z26, ratios, z19, c23465k2, c11421z2, z24, z25, layoutDirection2, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 12582912;
        i17 = i15 & 256;
        if (i17 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87155h(z13)) {
                    i18 = 67108864;
                } else {
                    i18 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i18;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q.m87157i(ratios)) {
                    i49 = 536870912;
                } else {
                    i49 = 268435456;
                }
                i16 |= i49;
            }
            i19 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i19 != 0) {
                i24 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q.m87155h(z14)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i14 | i25;
            } else {
                i24 = i14;
            }
            i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i26 != 0) {
                i24 |= 48;
            } else if ((i14 & 48) != 0) {
                i24 |= c28655q.m87153g(c23465k) ? 32 : 16;
            }
            i27 = i24;
            i28 = i15 & 4096;
            if (i28 != 0) {
                i34 = i27 | 384;
            } else {
                i29 = i27;
                if ((i14 & 384) != 0) {
                    i29 |= c28655q.m87153g(c11421z1) ? 256 : 128;
                }
                i34 = i29;
            }
            i35 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i35 != 0) {
                i37 = i34 | 3072;
            } else {
                i36 = i34;
                if ((i14 & 3072) != 0) {
                    if (c28655q.m87155h(z15)) {
                        i57 = 2048;
                    }
                    i36 |= i57;
                }
                i37 = i36;
            }
            i38 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i38 != 0) {
                if ((i14 & 24576) == 0) {
                    if (c28655q.m87155h(z16)) {
                        i59 = 16384;
                    }
                    i37 |= i59;
                }
                i39 = i15 & 32768;
                if (i39 != 0) {
                    i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (layoutDirection == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = layoutDirection.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i65 = 131072;
                    }
                    i37 |= i65;
                }
                if ((i14 & 1572864) == 0) {
                    i37 |= c28655q.m87157i(onToggle) ? 1048576 : 524288;
                }
                i44 = i37;
                if ((306783379 & i16) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (c28655q.m87135U(i16 & 1, z17)) {
                    c28655q.m87140Z();
                    i45 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i45 != 0) {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i66 != 0) {
                            z27 = false;
                        } else {
                            z27 = z4;
                        }
                        if (i17 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if (i19 != 0) {
                            z29 = true;
                        } else {
                            z29 = z14;
                        }
                        if (i26 != 0) {
                            c23465k3 = null;
                        } else {
                            c23465k3 = c23465k;
                        }
                        if (i28 == 0) {
                        }
                        if (i35 != 0) {
                            z34 = false;
                        } else {
                            z34 = z15;
                        }
                        if (i38 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        if (i39 != 0) {
                            modifier4 = modifier2;
                            layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                        } else {
                            modifier4 = modifier2;
                            layoutDirection3 = layoutDirection;
                        }
                        z36 = z35;
                    } else {
                        if (i55 != 0) {
                            modifier2 = c2314t;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        if (i66 != 0) {
                            z27 = false;
                        } else {
                            z27 = z4;
                        }
                        if (i17 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if (i19 != 0) {
                            z29 = true;
                        } else {
                            z29 = z14;
                        }
                        if (i26 != 0) {
                            c23465k3 = null;
                        } else {
                            c23465k3 = c23465k;
                        }
                        if (i28 == 0) {
                        }
                        if (i35 != 0) {
                            z34 = false;
                        } else {
                            z34 = z15;
                        }
                        if (i38 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        if (i39 != 0) {
                            modifier4 = modifier2;
                            layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                        } else {
                            modifier4 = modifier2;
                            layoutDirection3 = layoutDirection;
                        }
                        z36 = z35;
                    }
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R;
                    if (c11421z3 == null) {
                        c28655q.m87150e0(878380871);
                        if (z27) {
                            z55 = true;
                        } else {
                            z55 = true;
                        }
                        C11421z1 c11421z1M30544f5 = AbstractC11343d2.m30544f(Boolean.valueOf(z55), "HorizontalTimeGraph Transition", c28655q, 48, 0);
                        c28655q.m87173q(false);
                        c11421z4 = c11421z1M30544f5;
                    } else {
                        c28655q.m87150e0(878380127);
                        c28655q.m87173q(false);
                        c11421z4 = c11421z3;
                    }
                    float f115 = 1;
                    C33252i c33252iM105489e5 = AbstractC33253j.m105489e(4 * f115);
                    zIsEmpty = ratios.isEmpty();
                    z37 = !zIsEmpty;
                    if (zIsEmpty) {
                        z38 = false;
                    } else {
                        z38 = false;
                    }
                    if (z36) {
                        c28655q.m87150e0(878390976);
                        c28655q.m87173q(false);
                        z39 = z27;
                        long j115 = C17919x.f69636m;
                        i46 = i16;
                        c23465k4 = new C23465k(new C17919x(j115), new C17919x(j115));
                    } else {
                        z39 = z27;
                        i46 = i16;
                        if (z28) {
                            c28655q.m87150e0(878393448);
                            c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(878393448);
                            c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                            c28655q.m87173q(false);
                        }
                    }
                    long j116 = ((C17919x) c23465k4.f92937w).f69639a;
                    long j117 = ((C17919x) c23465k4.f92938x).f69639a;
                    i47 = i46 >> 3;
                    textResource3 = textResourceM21267a;
                    Modifier modifierM44112a5 = AbstractC15680h.m44112a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_" + AbstractC8693b.m21274h(title, c28655q, i47 & 14)), j116, c33252iM105489e5), f115, j117, c33252iM105489e5), z37);
                    InterfaceC13832v0 interfaceC13832v4 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                    boolean zM87155h9 = c28655q.m87155h(z38);
                    i48 = i44 & 3670016;
                    if (i48 == 1048576) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    z45 = zM87155h9 | z44;
                    objM87133R2 = c28655q.m87133R();
                    if (z45) {
                        objM87133R2 = new C12203c(7, onToggle, z38);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12203c(7, onToggle, z38);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e5 = AbstractC1092a.m3360e(modifierM44112a5, interfaceC21083i5, interfaceC13832v4, false, null, (InterfaceC4339a) objM87133R2, 28);
                    float f116 = 8;
                    float f117 = ((float) 1.5d) * f116;
                    Modifier modifierMo3471e5 = AbstractC1099a.m3397s(modifierM3360e5, f117, f115 * f116, f117, f117).mo3471e(modifier4);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    if (z34) {
                        c28655q.m87150e0(1212322546);
                        boolean zM87155h10 = c28655q.m87155h(z38);
                        if (i48 == 1048576) {
                            z52 = true;
                        } else {
                            z52 = false;
                        }
                        z54 = z52 | zM87155h10;
                        objM87133R3 = c28655q.m87133R();
                        if (z54) {
                            objM87133R3 = new C12203c(8, onToggle, z38);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C12203c(8, onToggle, z38);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i615 = i46 << 3;
                        boolean z510 = z39;
                        m124524p(title, textResource3, percentage, z37, j7, time, timeSuffix, z510, (InterfaceC4339a) objM87133R3, c28655q, (458752 & i615) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i615) | (i46 & 29360128));
                        z46 = z510;
                        z47 = false;
                        c28655q.m87173q(false);
                        textResource4 = textResource3;
                    } else {
                        z46 = z39;
                        c28655q.m87150e0(1212516420);
                        int i616 = i46 << 3;
                        m124523o(title, textResource3, percentage, z37, j7, time, timeSuffix, c28655q, (458752 & i616) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i616));
                        textResource4 = textResource3;
                        z47 = false;
                        c28655q.m87173q(false);
                    }
                    if (zIsEmpty) {
                        c28655q.m87150e0(1212679852);
                        if (z46) {
                            c28655q.m87150e0(1286048944);
                            boolean zIsFeatureEnabled8 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                            c28655q.m87173q(z47);
                            z47 = zIsFeatureEnabled8;
                        } else {
                            c28655q.m87150e0(1286048944);
                            boolean zIsFeatureEnabled9 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                            c28655q.m87173q(z47);
                            z47 = zIsFeatureEnabled9;
                        }
                        z48 = z29;
                        c23465k5 = c23465k3;
                        c37816bM121344e = AbstractC37817c.m121344e(-808883125, c28655q, new C15428u0(j7, c11421z4, ratios, c23465k5, z48));
                        if (z47) {
                            c28655q.m87150e0(1213334386);
                            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(AbstractC2758m.m7811a(layoutDirection3)), AbstractC37817c.m121344e(-1280925795, c28655q, new C13996z(c37816bM121344e, 7)), c28655q, 56);
                            z49 = false;
                            c28655q.m87173q(false);
                        } else {
                            z49 = false;
                            c28655q.m87150e0(1213556935);
                            c37816bM121344e.invoke(c28655q, 6);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z49);
                    } else {
                        z48 = z29;
                        c23465k5 = c23465k3;
                        c28655q.m87150e0(1213608178);
                        c28655q.m87173q(z47);
                    }
                    c28655q.m87173q(true);
                    c23465k2 = c23465k5;
                    textResource2 = textResource4;
                    z18 = z46;
                    modifier3 = modifier4;
                    z24 = z34;
                    z25 = z36;
                    layoutDirection2 = layoutDirection3;
                    z26 = z28;
                    c11421z2 = c11421z3;
                    z19 = z48;
                } else {
                    c28655q.m87138X();
                    z18 = z4;
                    z19 = z14;
                    c23465k2 = c23465k;
                    c11421z2 = c11421z1;
                    z24 = z15;
                    z25 = z16;
                    layoutDirection2 = layoutDirection;
                    modifier3 = modifier2;
                    textResource2 = textResourceM21267a;
                    z26 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC39058k.m124522n(modifier3, title, textResource2, percentage, time, timeSuffix, j7, z18, z26, ratios, z19, c23465k2, c11421z2, z24, z25, layoutDirection2, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i37 |= 24576;
            i39 = i15 & 32768;
            if (i39 != 0) {
                i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (layoutDirection == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = layoutDirection.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i65 = 131072;
                }
                i37 |= i65;
            }
            if ((i14 & 1572864) == 0) {
                i37 |= c28655q.m87157i(onToggle) ? 1048576 : 524288;
            }
            i44 = i37;
            if ((306783379 & i16) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (c28655q.m87135U(i16 & 1, z17)) {
                c28655q.m87140Z();
                i45 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i66 != 0) {
                        z27 = false;
                    } else {
                        z27 = z4;
                    }
                    if (i17 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if (i19 != 0) {
                        z29 = true;
                    } else {
                        z29 = z14;
                    }
                    if (i26 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    if (i28 == 0) {
                    }
                    if (i35 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i38 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    if (i39 != 0) {
                        modifier4 = modifier2;
                        layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                    } else {
                        modifier4 = modifier2;
                        layoutDirection3 = layoutDirection;
                    }
                    z36 = z35;
                } else {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i66 != 0) {
                        z27 = false;
                    } else {
                        z27 = z4;
                    }
                    if (i17 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if (i19 != 0) {
                        z29 = true;
                    } else {
                        z29 = z14;
                    }
                    if (i26 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    if (i28 == 0) {
                    }
                    if (i35 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i38 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    if (i39 != 0) {
                        modifier4 = modifier2;
                        layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                    } else {
                        modifier4 = modifier2;
                        layoutDirection3 = layoutDirection;
                    }
                    z36 = z35;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R;
                if (c11421z3 == null) {
                    c28655q.m87150e0(878380871);
                    if (z27) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    C11421z1 c11421z1M30544f6 = AbstractC11343d2.m30544f(Boolean.valueOf(z55), "HorizontalTimeGraph Transition", c28655q, 48, 0);
                    c28655q.m87173q(false);
                    c11421z4 = c11421z1M30544f6;
                } else {
                    c28655q.m87150e0(878380127);
                    c28655q.m87173q(false);
                    c11421z4 = c11421z3;
                }
                float f118 = 1;
                C33252i c33252iM105489e6 = AbstractC33253j.m105489e(4 * f118);
                zIsEmpty = ratios.isEmpty();
                z37 = !zIsEmpty;
                if (zIsEmpty) {
                    z38 = false;
                } else {
                    z38 = false;
                }
                if (z36) {
                    c28655q.m87150e0(878390976);
                    c28655q.m87173q(false);
                    z39 = z27;
                    long j118 = C17919x.f69636m;
                    i46 = i16;
                    c23465k4 = new C23465k(new C17919x(j118), new C17919x(j118));
                } else {
                    z39 = z27;
                    i46 = i16;
                    if (z28) {
                        c28655q.m87150e0(878393448);
                        c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(878393448);
                        c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                        c28655q.m87173q(false);
                    }
                }
                long j119 = ((C17919x) c23465k4.f92937w).f69639a;
                long j1110 = ((C17919x) c23465k4.f92938x).f69639a;
                i47 = i46 >> 3;
                textResource3 = textResourceM21267a;
                Modifier modifierM44112a6 = AbstractC15680h.m44112a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_" + AbstractC8693b.m21274h(title, c28655q, i47 & 14)), j119, c33252iM105489e6), f118, j1110, c33252iM105489e6), z37);
                InterfaceC13832v0 interfaceC13832v5 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                boolean zM87155h11 = c28655q.m87155h(z38);
                i48 = i44 & 3670016;
                if (i48 == 1048576) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                z45 = zM87155h11 | z44;
                objM87133R2 = c28655q.m87133R();
                if (z45) {
                    objM87133R2 = new C12203c(7, onToggle, z38);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12203c(7, onToggle, z38);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e6 = AbstractC1092a.m3360e(modifierM44112a6, interfaceC21083i6, interfaceC13832v5, false, null, (InterfaceC4339a) objM87133R2, 28);
                float f119 = 8;
                float f1110 = ((float) 1.5d) * f119;
                Modifier modifierMo3471e6 = AbstractC1099a.m3397s(modifierM3360e6, f1110, f118 * f119, f1110, f1110).mo3471e(modifier4);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                if (z34) {
                    c28655q.m87150e0(1212322546);
                    boolean zM87155h12 = c28655q.m87155h(z38);
                    if (i48 == 1048576) {
                        z52 = true;
                    } else {
                        z52 = false;
                    }
                    z54 = z52 | zM87155h12;
                    objM87133R3 = c28655q.m87133R();
                    if (z54) {
                        objM87133R3 = new C12203c(8, onToggle, z38);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C12203c(8, onToggle, z38);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i617 = i46 << 3;
                    boolean z511 = z39;
                    m124524p(title, textResource3, percentage, z37, j7, time, timeSuffix, z511, (InterfaceC4339a) objM87133R3, c28655q, (458752 & i617) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i617) | (i46 & 29360128));
                    z46 = z511;
                    z47 = false;
                    c28655q.m87173q(false);
                    textResource4 = textResource3;
                } else {
                    z46 = z39;
                    c28655q.m87150e0(1212516420);
                    int i618 = i46 << 3;
                    m124523o(title, textResource3, percentage, z37, j7, time, timeSuffix, c28655q, (458752 & i618) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i618));
                    textResource4 = textResource3;
                    z47 = false;
                    c28655q.m87173q(false);
                }
                if (zIsEmpty) {
                    c28655q.m87150e0(1212679852);
                    if (z46) {
                        c28655q.m87150e0(1286048944);
                        boolean zIsFeatureEnabled10 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                        c28655q.m87173q(z47);
                        z47 = zIsFeatureEnabled10;
                    } else {
                        c28655q.m87150e0(1286048944);
                        boolean zIsFeatureEnabled11 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                        c28655q.m87173q(z47);
                        z47 = zIsFeatureEnabled11;
                    }
                    z48 = z29;
                    c23465k5 = c23465k3;
                    c37816bM121344e = AbstractC37817c.m121344e(-808883125, c28655q, new C15428u0(j7, c11421z4, ratios, c23465k5, z48));
                    if (z47) {
                        c28655q.m87150e0(1213334386);
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(AbstractC2758m.m7811a(layoutDirection3)), AbstractC37817c.m121344e(-1280925795, c28655q, new C13996z(c37816bM121344e, 7)), c28655q, 56);
                        z49 = false;
                        c28655q.m87173q(false);
                    } else {
                        z49 = false;
                        c28655q.m87150e0(1213556935);
                        c37816bM121344e.invoke(c28655q, 6);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z49);
                } else {
                    z48 = z29;
                    c23465k5 = c23465k3;
                    c28655q.m87150e0(1213608178);
                    c28655q.m87173q(z47);
                }
                c28655q.m87173q(true);
                c23465k2 = c23465k5;
                textResource2 = textResource4;
                z18 = z46;
                modifier3 = modifier4;
                z24 = z34;
                z25 = z36;
                layoutDirection2 = layoutDirection3;
                z26 = z28;
                c11421z2 = c11421z3;
                z19 = z48;
            } else {
                c28655q.m87138X();
                z18 = z4;
                z19 = z14;
                c23465k2 = c23465k;
                c11421z2 = c11421z1;
                z24 = z15;
                z25 = z16;
                layoutDirection2 = layoutDirection;
                modifier3 = modifier2;
                textResource2 = textResourceM21267a;
                z26 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC39058k.m124522n(modifier3, title, textResource2, percentage, time, timeSuffix, j7, z18, z26, ratios, z19, c23465k2, c11421z2, z24, z25, layoutDirection2, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 100663296;
        if ((i13 & 805306368) == 0) {
            if (c28655q.m87157i(ratios)) {
                i49 = 536870912;
            } else {
                i49 = 268435456;
            }
            i16 |= i49;
        }
        i19 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i19 != 0) {
            i24 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q.m87155h(z14)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i14 | i25;
        } else {
            i24 = i14;
        }
        i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i26 != 0) {
            i24 |= 48;
        } else if ((i14 & 48) != 0) {
            i24 |= c28655q.m87153g(c23465k) ? 32 : 16;
        }
        i27 = i24;
        i28 = i15 & 4096;
        if (i28 != 0) {
            i34 = i27 | 384;
        } else {
            i29 = i27;
            if ((i14 & 384) != 0) {
                i29 |= c28655q.m87153g(c11421z1) ? 256 : 128;
            }
            i34 = i29;
        }
        i35 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i35 != 0) {
            i37 = i34 | 3072;
        } else {
            i36 = i34;
            if ((i14 & 3072) != 0) {
                if (c28655q.m87155h(z15)) {
                    i57 = 2048;
                }
                i36 |= i57;
            }
            i37 = i36;
        }
        i38 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i38 != 0) {
            if ((i14 & 24576) == 0) {
                if (c28655q.m87155h(z16)) {
                    i59 = 16384;
                }
                i37 |= i59;
            }
            i39 = i15 & 32768;
            if (i39 != 0) {
                i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (layoutDirection == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = layoutDirection.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i65 = 131072;
                }
                i37 |= i65;
            }
            if ((i14 & 1572864) == 0) {
                i37 |= c28655q.m87157i(onToggle) ? 1048576 : 524288;
            }
            i44 = i37;
            if ((306783379 & i16) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (c28655q.m87135U(i16 & 1, z17)) {
                c28655q.m87140Z();
                i45 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i45 != 0) {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i66 != 0) {
                        z27 = false;
                    } else {
                        z27 = z4;
                    }
                    if (i17 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if (i19 != 0) {
                        z29 = true;
                    } else {
                        z29 = z14;
                    }
                    if (i26 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    if (i28 == 0) {
                    }
                    if (i35 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i38 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    if (i39 != 0) {
                        modifier4 = modifier2;
                        layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                    } else {
                        modifier4 = modifier2;
                        layoutDirection3 = layoutDirection;
                    }
                    z36 = z35;
                } else {
                    if (i55 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i15 & 4) != 0) {
                        i16 &= -897;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i66 != 0) {
                        z27 = false;
                    } else {
                        z27 = z4;
                    }
                    if (i17 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if (i19 != 0) {
                        z29 = true;
                    } else {
                        z29 = z14;
                    }
                    if (i26 != 0) {
                        c23465k3 = null;
                    } else {
                        c23465k3 = c23465k;
                    }
                    if (i28 == 0) {
                    }
                    if (i35 != 0) {
                        z34 = false;
                    } else {
                        z34 = z15;
                    }
                    if (i38 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    if (i39 != 0) {
                        modifier4 = modifier2;
                        layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                    } else {
                        modifier4 = modifier2;
                        layoutDirection3 = layoutDirection;
                    }
                    z36 = z35;
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R;
                if (c11421z3 == null) {
                    c28655q.m87150e0(878380871);
                    if (z27) {
                        z55 = true;
                    } else {
                        z55 = true;
                    }
                    C11421z1 c11421z1M30544f7 = AbstractC11343d2.m30544f(Boolean.valueOf(z55), "HorizontalTimeGraph Transition", c28655q, 48, 0);
                    c28655q.m87173q(false);
                    c11421z4 = c11421z1M30544f7;
                } else {
                    c28655q.m87150e0(878380127);
                    c28655q.m87173q(false);
                    c11421z4 = c11421z3;
                }
                float f1111 = 1;
                C33252i c33252iM105489e7 = AbstractC33253j.m105489e(4 * f1111);
                zIsEmpty = ratios.isEmpty();
                z37 = !zIsEmpty;
                if (zIsEmpty) {
                    z38 = false;
                } else {
                    z38 = false;
                }
                if (z36) {
                    c28655q.m87150e0(878390976);
                    c28655q.m87173q(false);
                    z39 = z27;
                    long j1111 = C17919x.f69636m;
                    i46 = i16;
                    c23465k4 = new C23465k(new C17919x(j1111), new C17919x(j1111));
                } else {
                    z39 = z27;
                    i46 = i16;
                    if (z28) {
                        c28655q.m87150e0(878393448);
                        c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(878393448);
                        c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                        c28655q.m87173q(false);
                    }
                }
                long j1112 = ((C17919x) c23465k4.f92937w).f69639a;
                long j1113 = ((C17919x) c23465k4.f92938x).f69639a;
                i47 = i46 >> 3;
                textResource3 = textResourceM21267a;
                Modifier modifierM44112a7 = AbstractC15680h.m44112a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_" + AbstractC8693b.m21274h(title, c28655q, i47 & 14)), j1112, c33252iM105489e7), f1111, j1113, c33252iM105489e7), z37);
                InterfaceC13832v0 interfaceC13832v6 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                boolean zM87155h13 = c28655q.m87155h(z38);
                i48 = i44 & 3670016;
                if (i48 == 1048576) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                z45 = zM87155h13 | z44;
                objM87133R2 = c28655q.m87133R();
                if (z45) {
                    objM87133R2 = new C12203c(7, onToggle, z38);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12203c(7, onToggle, z38);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e7 = AbstractC1092a.m3360e(modifierM44112a7, interfaceC21083i7, interfaceC13832v6, false, null, (InterfaceC4339a) objM87133R2, 28);
                float f1112 = 8;
                float f1113 = ((float) 1.5d) * f1112;
                Modifier modifierMo3471e7 = AbstractC1099a.m3397s(modifierM3360e7, f1113, f1111 * f1112, f1113, f1113).mo3471e(modifier4);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                if (z34) {
                    c28655q.m87150e0(1212322546);
                    boolean zM87155h14 = c28655q.m87155h(z38);
                    if (i48 == 1048576) {
                        z52 = true;
                    } else {
                        z52 = false;
                    }
                    z54 = z52 | zM87155h14;
                    objM87133R3 = c28655q.m87133R();
                    if (z54) {
                        objM87133R3 = new C12203c(8, onToggle, z38);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C12203c(8, onToggle, z38);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i619 = i46 << 3;
                    boolean z512 = z39;
                    m124524p(title, textResource3, percentage, z37, j7, time, timeSuffix, z512, (InterfaceC4339a) objM87133R3, c28655q, (458752 & i619) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i619) | (i46 & 29360128));
                    z46 = z512;
                    z47 = false;
                    c28655q.m87173q(false);
                    textResource4 = textResource3;
                } else {
                    z46 = z39;
                    c28655q.m87150e0(1212516420);
                    int i6110 = i46 << 3;
                    m124523o(title, textResource3, percentage, z37, j7, time, timeSuffix, c28655q, (458752 & i6110) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i6110));
                    textResource4 = textResource3;
                    z47 = false;
                    c28655q.m87173q(false);
                }
                if (zIsEmpty) {
                    c28655q.m87150e0(1212679852);
                    if (z46) {
                        c28655q.m87150e0(1286048944);
                        boolean zIsFeatureEnabled12 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                        c28655q.m87173q(z47);
                        z47 = zIsFeatureEnabled12;
                    } else {
                        c28655q.m87150e0(1286048944);
                        boolean zIsFeatureEnabled13 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                        c28655q.m87173q(z47);
                        z47 = zIsFeatureEnabled13;
                    }
                    z48 = z29;
                    c23465k5 = c23465k3;
                    c37816bM121344e = AbstractC37817c.m121344e(-808883125, c28655q, new C15428u0(j7, c11421z4, ratios, c23465k5, z48));
                    if (z47) {
                        c28655q.m87150e0(1213334386);
                        AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(AbstractC2758m.m7811a(layoutDirection3)), AbstractC37817c.m121344e(-1280925795, c28655q, new C13996z(c37816bM121344e, 7)), c28655q, 56);
                        z49 = false;
                        c28655q.m87173q(false);
                    } else {
                        z49 = false;
                        c28655q.m87150e0(1213556935);
                        c37816bM121344e.invoke(c28655q, 6);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z49);
                } else {
                    z48 = z29;
                    c23465k5 = c23465k3;
                    c28655q.m87150e0(1213608178);
                    c28655q.m87173q(z47);
                }
                c28655q.m87173q(true);
                c23465k2 = c23465k5;
                textResource2 = textResource4;
                z18 = z46;
                modifier3 = modifier4;
                z24 = z34;
                z25 = z36;
                layoutDirection2 = layoutDirection3;
                z26 = z28;
                c11421z2 = c11421z3;
                z19 = z48;
            } else {
                c28655q.m87138X();
                z18 = z4;
                z19 = z14;
                c23465k2 = c23465k;
                c11421z2 = c11421z1;
                z24 = z15;
                z25 = z16;
                layoutDirection2 = layoutDirection;
                modifier3 = modifier2;
                textResource2 = textResourceM21267a;
                z26 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC39058k.m124522n(modifier3, title, textResource2, percentage, time, timeSuffix, j7, z18, z26, ratios, z19, c23465k2, c11421z2, z24, z25, layoutDirection2, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i37 |= 24576;
        i39 = i15 & 32768;
        if (i39 != 0) {
            i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (layoutDirection == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = layoutDirection.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i65 = 131072;
            }
            i37 |= i65;
        }
        if ((i14 & 1572864) == 0) {
            i37 |= c28655q.m87157i(onToggle) ? 1048576 : 524288;
        }
        i44 = i37;
        if ((306783379 & i16) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (c28655q.m87135U(i16 & 1, z17)) {
            c28655q.m87140Z();
            i45 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i45 != 0) {
                if (i55 != 0) {
                    modifier2 = c2314t;
                }
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i66 != 0) {
                    z27 = false;
                } else {
                    z27 = z4;
                }
                if (i17 != 0) {
                    z28 = false;
                } else {
                    z28 = z13;
                }
                if (i19 != 0) {
                    z29 = true;
                } else {
                    z29 = z14;
                }
                if (i26 != 0) {
                    c23465k3 = null;
                } else {
                    c23465k3 = c23465k;
                }
                if (i28 == 0) {
                }
                if (i35 != 0) {
                    z34 = false;
                } else {
                    z34 = z15;
                }
                if (i38 != 0) {
                    z35 = false;
                } else {
                    z35 = z16;
                }
                if (i39 != 0) {
                    modifier4 = modifier2;
                    layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                } else {
                    modifier4 = modifier2;
                    layoutDirection3 = layoutDirection;
                }
                z36 = z35;
            } else {
                if (i55 != 0) {
                    modifier2 = c2314t;
                }
                if ((i15 & 4) != 0) {
                    i16 &= -897;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i66 != 0) {
                    z27 = false;
                } else {
                    z27 = z4;
                }
                if (i17 != 0) {
                    z28 = false;
                } else {
                    z28 = z13;
                }
                if (i19 != 0) {
                    z29 = true;
                } else {
                    z29 = z14;
                }
                if (i26 != 0) {
                    c23465k3 = null;
                } else {
                    c23465k3 = c23465k;
                }
                if (i28 == 0) {
                }
                if (i35 != 0) {
                    z34 = false;
                } else {
                    z34 = z15;
                }
                if (i38 != 0) {
                    z35 = false;
                } else {
                    z35 = z16;
                }
                if (i39 != 0) {
                    modifier4 = modifier2;
                    layoutDirection3 = LayoutDirection.LEFT_TO_RIGHT;
                } else {
                    modifier4 = modifier2;
                    layoutDirection3 = layoutDirection;
                }
                z36 = z35;
            }
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R;
            if (c11421z3 == null) {
                c28655q.m87150e0(878380871);
                if (z27) {
                    z55 = true;
                } else {
                    z55 = true;
                }
                C11421z1 c11421z1M30544f8 = AbstractC11343d2.m30544f(Boolean.valueOf(z55), "HorizontalTimeGraph Transition", c28655q, 48, 0);
                c28655q.m87173q(false);
                c11421z4 = c11421z1M30544f8;
            } else {
                c28655q.m87150e0(878380127);
                c28655q.m87173q(false);
                c11421z4 = c11421z3;
            }
            float f1114 = 1;
            C33252i c33252iM105489e8 = AbstractC33253j.m105489e(4 * f1114);
            zIsEmpty = ratios.isEmpty();
            z37 = !zIsEmpty;
            if (zIsEmpty) {
                z38 = false;
            } else {
                z38 = false;
            }
            if (z36) {
                c28655q.m87150e0(878390976);
                c28655q.m87173q(false);
                z39 = z27;
                long j1114 = C17919x.f69636m;
                i46 = i16;
                c23465k4 = new C23465k(new C17919x(j1114), new C17919x(j1114));
            } else {
                z39 = z27;
                i46 = i16;
                if (z28) {
                    c28655q.m87150e0(878393448);
                    c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(878393448);
                    c23465k4 = new C23465k(new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getWhite10()), new C17919x(C17919x.f69636m));
                    c28655q.m87173q(false);
                }
            }
            long j1115 = ((C17919x) c23465k4.f92937w).f69639a;
            long j1116 = ((C17919x) c23465k4.f92938x).f69639a;
            i47 = i46 >> 3;
            textResource3 = textResourceM21267a;
            Modifier modifierM44112a8 = AbstractC15680h.m44112a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_" + AbstractC8693b.m21274h(title, c28655q, i47 & 14)), j1115, c33252iM105489e8), f1114, j1116, c33252iM105489e8), z37);
            InterfaceC13832v0 interfaceC13832v7 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
            boolean zM87155h15 = c28655q.m87155h(z38);
            i48 = i44 & 3670016;
            if (i48 == 1048576) {
                z44 = true;
            } else {
                z44 = false;
            }
            z45 = zM87155h15 | z44;
            objM87133R2 = c28655q.m87133R();
            if (z45) {
                objM87133R2 = new C12203c(7, onToggle, z38);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C12203c(7, onToggle, z38);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e8 = AbstractC1092a.m3360e(modifierM44112a8, interfaceC21083i8, interfaceC13832v7, false, null, (InterfaceC4339a) objM87133R2, 28);
            float f1115 = 8;
            float f1116 = ((float) 1.5d) * f1115;
            Modifier modifierMo3471e8 = AbstractC1099a.m3397s(modifierM3360e8, f1116, f1114 * f1115, f1116, f1116).mo3471e(modifier4);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            if (z34) {
                c28655q.m87150e0(1212322546);
                boolean zM87155h16 = c28655q.m87155h(z38);
                if (i48 == 1048576) {
                    z52 = true;
                } else {
                    z52 = false;
                }
                z54 = z52 | zM87155h16;
                objM87133R3 = c28655q.m87133R();
                if (z54) {
                    objM87133R3 = new C12203c(8, onToggle, z38);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C12203c(8, onToggle, z38);
                    c28655q.m87172p0(objM87133R3);
                }
                int i6111 = i46 << 3;
                boolean z513 = z39;
                m124524p(title, textResource3, percentage, z37, j7, time, timeSuffix, z513, (InterfaceC4339a) objM87133R3, c28655q, (458752 & i6111) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i6111) | (i46 & 29360128));
                z46 = z513;
                z47 = false;
                c28655q.m87173q(false);
                textResource4 = textResource3;
            } else {
                z46 = z39;
                c28655q.m87150e0(1212516420);
                int i6112 = i46 << 3;
                m124523o(title, textResource3, percentage, z37, j7, time, timeSuffix, c28655q, (458752 & i6112) | (i47 & 1022) | (57344 & (i46 >> 6)) | (3670016 & i6112));
                textResource4 = textResource3;
                z47 = false;
                c28655q.m87173q(false);
            }
            if (zIsEmpty) {
                c28655q.m87150e0(1212679852);
                if (z46) {
                    c28655q.m87150e0(1286048944);
                    boolean zIsFeatureEnabled14 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                    c28655q.m87173q(z47);
                    z47 = zIsFeatureEnabled14;
                } else {
                    c28655q.m87150e0(1286048944);
                    boolean zIsFeatureEnabled15 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("bar-graph-time-splice-layout-direction-android");
                    c28655q.m87173q(z47);
                    z47 = zIsFeatureEnabled15;
                }
                z48 = z29;
                c23465k5 = c23465k3;
                c37816bM121344e = AbstractC37817c.m121344e(-808883125, c28655q, new C15428u0(j7, c11421z4, ratios, c23465k5, z48));
                if (z47) {
                    c28655q.m87150e0(1213334386);
                    AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(AbstractC2758m.m7811a(layoutDirection3)), AbstractC37817c.m121344e(-1280925795, c28655q, new C13996z(c37816bM121344e, 7)), c28655q, 56);
                    z49 = false;
                    c28655q.m87173q(false);
                } else {
                    z49 = false;
                    c28655q.m87150e0(1213556935);
                    c37816bM121344e.invoke(c28655q, 6);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z49);
            } else {
                z48 = z29;
                c23465k5 = c23465k3;
                c28655q.m87150e0(1213608178);
                c28655q.m87173q(z47);
            }
            c28655q.m87173q(true);
            c23465k2 = c23465k5;
            textResource2 = textResource4;
            z18 = z46;
            modifier3 = modifier4;
            z24 = z34;
            z25 = z36;
            layoutDirection2 = layoutDirection3;
            z26 = z28;
            c11421z2 = c11421z3;
            z19 = z48;
        } else {
            c28655q.m87138X();
            z18 = z4;
            z19 = z14;
            c23465k2 = c23465k;
            c11421z2 = c11421z1;
            z24 = z15;
            z25 = z16;
            layoutDirection2 = layoutDirection;
            modifier3 = modifier2;
            textResource2 = textResourceM21267a;
            z26 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.i
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC39058k.m124522n(modifier3, title, textResource2, percentage, time, timeSuffix, j7, z18, z26, ratios, z19, c23465k2, c11421z2, z24, z25, layoutDirection2, onToggle, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m124518j(boolean z4, InterfaceC4339a interfaceC4339a) {
        if (z4) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m124519k(boolean z4, InterfaceC4339a interfaceC4339a) {
        if (z4) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m124520l(C11421z1 c11421z1, List list, long j7, boolean z4, C23465k c23465k, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC2331d.m7185j(c11421z1, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), list, j7, z4, c23465k, c28655q, 48, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m124521m(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m124522n(Modifier modifier, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, long j7, boolean z4, boolean z13, List list, boolean z14, C23465k c23465k, C11421z1 c11421z1, boolean z15, boolean z16, LayoutDirection layoutDirection, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m124517i(modifier, textResource, textResource2, textResource3, textResource4, textResource5, j7, z4, z13, list, z14, c23465k, c11421z1, z15, z16, layoutDirection, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m124523o(TextResource title, TextResource subtitle, TextResource percentage, boolean z4, long j7, TextResource time, TextResource timeSuffix, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        TextResource textResource;
        TextResource textResource2;
        C2314t c2314t;
        boolean z13;
        int i15;
        long jM73366B;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(percentage, "percentage");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(timeSuffix, "timeSuffix");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-654986910);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(subtitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(percentage) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87153g(time) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87153g(timeSuffix) ? 1048576 : 524288;
        }
        if (c28655q2.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t2), EnumC22935a1.f90538x);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
            int i16 = i14;
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3388j);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(title, c28655q2, i16 & 14);
            Locale locale = Locale.ROOT;
            String upperCase = strM21274h.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH5(), null, c28655q2, 0, 0, 196602);
            C28655q c28655q3 = c28655q2;
            float f13 = 4;
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3424u(f14, c2314t2));
            if (AbstractC8693b.m21270d(subtitle)) {
                c28655q3.m87150e0(120088635);
                String upperCase2 = AbstractC8693b.m21274h(subtitle, c28655q3, (i16 >> 3) & 14).toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                c2314t = c2314t2;
                AbstractC30795n.m94707h(upperCase2, null, c38072d.m121949b(c28655q3, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getH5(), null, c28655q3, 0, 0, 196602);
                c28655q3 = c28655q3;
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3424u(f14, c2314t));
                z13 = false;
                c28655q3.m87173q(false);
            } else {
                c2314t = c2314t2;
                z13 = false;
                c28655q3.m87150e0(120335612);
                c28655q3.m87173q(false);
            }
            String strM21274h2 = AbstractC8693b.m21274h(percentage, c28655q3, (i16 >> 6) & 14);
            if (z4) {
                c28655q3.m87150e0(142432047);
                c28655q3.m87173q(z13);
                jM73366B = j7;
                i15 = 6;
            } else {
                i15 = 6;
                jM73366B = AbstractC25012a.m73366B(c28655q3, 142433104, c38072d, c28655q3, 6);
                c28655q3.m87173q(z13);
            }
            C28655q c28655q4 = c28655q3;
            AbstractC30795n.m94707h(strM21274h2, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i15).getN9(), null, c28655q4, 0, 0, 196602);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q4, 6);
            int iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, modifierM118962N2);
            textResource = time;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q4, (i16 >> 15) & 14), new WithAlignmentLineElement(AbstractC39083d.f168140a), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN7(), null, c28655q4, 0, 0, 196088);
            c28655q = c28655q4;
            if (AbstractC8693b.m21270d(timeSuffix)) {
                c28655q.m87150e0(-1729010792);
                textResource2 = timeSuffix;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i16 >> 18) & 14), new WithAlignmentLineElement(AbstractC39083d.f168140a), c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN9(), null, c28655q, 0, 0, 196088);
                c28655q = c28655q;
                c28655q.m87173q(z13);
            } else {
                textResource2 = timeSuffix;
                c28655q.m87150e0(-1728720136);
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
        } else {
            c28655q = c28655q2;
            textResource = time;
            textResource2 = timeSuffix;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17992b(title, subtitle, percentage, z4, j7, textResource, textResource2, i13);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m124524p(final TextResource title, final TextResource subtitle, TextResource textResource, final boolean z4, final long j7, TextResource time, TextResource timeSuffix, final boolean z13, final InterfaceC4339a onToggle, Composer composer, final int i13) {
        int i14;
        final TextResource textResource2;
        TextResource textResource3;
        C2306l c2306l;
        C38072d c38072d;
        boolean z14;
        int i15;
        long j13;
        TextResource percentage = textResource;
        C2306l c2306l2 = C2299e.f9108K;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(percentage, "percentage");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(timeSuffix, "timeSuffix");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1515011015);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(subtitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(percentage) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(time) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87153g(timeSuffix) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87155h(z13) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i14 |= c28655q.m87157i(onToggle) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 38347923) != 38347922)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
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
            EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
            C38072d c38072d2 = C38072d.f163053a;
            long jM125430y = c38072d2.m121949b(c28655q, 6).getBrandWhite();
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "horizontal_bar_graph_radio_button");
            EnumC27247d0 enumC27247d0 = EnumC27247d0.COMPACT;
            boolean z15 = (i16 & 234881024) == 67108864;
            Object objM87133R = c28655q.m87133R();
            if (z15 || objM87133R == C28635l.f115821a) {
                objM87133R = new C29616a(onToggle, 25);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27248d1.m82113e(modifierM3599a, title, enumC27250e0, jM125430y, z13, false, enumC27247d0, null, (Function1) objM87133R, c28655q, ((i16 << 3) & 112) | 1573254 | ((i16 >> 9) & 57344), 160);
            float f13 = 4;
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
            boolean zM21270d = AbstractC8693b.m21270d(subtitle);
            C23000t1 c23000t1 = C23000t1.f90727a;
            if (zM21270d) {
                c28655q.m87150e0(-929758537);
                String upperCase = AbstractC8693b.m21274h(subtitle, c28655q, (i16 >> 3) & 14).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                c38072d = c38072d2;
                i15 = 6;
                c2306l = c2306l2;
                AbstractC30795n.m94707h(upperCase, c23000t1.mo66771a(c2314t, c2306l), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196600);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
                z14 = false;
                c28655q.m87173q(false);
            } else {
                c2306l = c2306l2;
                c38072d = c38072d2;
                z14 = false;
                i15 = 6;
                c28655q.m87150e0(-929443329);
                c28655q.m87173q(false);
            }
            percentage = textResource;
            String strM21274h = AbstractC8693b.m21274h(percentage, c28655q, (i16 >> 6) & 14);
            if (z4) {
                c28655q.m87150e0(2048230860);
                c28655q.m87173q(z14);
                j13 = j7;
            } else {
                long jM73366B = AbstractC25012a.m73366B(c28655q, 2048231917, c38072d, c28655q, i15);
                c28655q.m87173q(z14);
                j13 = jM73366B;
            }
            AbstractC30795n.m94707h(strM21274h, c23000t1.mo66771a(c2314t, c2306l), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getN9(), null, c28655q, 0, 0, 196600);
            Modifier modifierMo66771a = c23000t1.mo66771a(AbstractC1102d.m3409f(1.0f, c23000t1.mo66772c(c2314t, true, 1.0f)), c2306l);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, i15);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo66771a);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            textResource2 = time;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i16 >> 15) & 14), c23000t1.m66773d(), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(i15), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getN7(), null, c28655q, 0, 0, 196088);
            if (AbstractC8693b.m21270d(timeSuffix)) {
                c28655q.m87150e0(1782768547);
                textResource3 = timeSuffix;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource3, c28655q, (i16 >> 18) & 14), c23000t1.m66773d(), c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(i15), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getN9(), null, c28655q, 0, 0, 196088);
                c28655q.m87173q(z14);
            } else {
                textResource3 = timeSuffix;
                c28655q.m87150e0(1783059203);
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
        } else {
            textResource2 = time;
            textResource3 = timeSuffix;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final TextResource textResource4 = textResource3;
            final TextResource textResource5 = percentage;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: y11.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC39058k.m124526r(title, subtitle, textResource5, z4, j7, textResource2, textResource4, z13, onToggle, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m124525q(InterfaceC4339a interfaceC4339a, boolean z4) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m124526r(TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, long j7, TextResource textResource4, TextResource textResource5, boolean z13, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m124524p(textResource, textResource2, textResource3, z4, j7, textResource4, textResource5, z13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m124527s(TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, long j7, TextResource textResource4, TextResource textResource5, int i13, Composer composer, int i14) {
        m124523o(textResource, textResource2, textResource3, z4, j7, textResource4, textResource5, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
