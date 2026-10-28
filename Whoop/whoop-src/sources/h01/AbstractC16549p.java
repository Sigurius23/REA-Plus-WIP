package h01;

import a11.C0134l;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import b61.C2752g;
import b91.C2886a;
import bp0.C3527o;
import c51.AbstractC4234k;
import c51.C4242s;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d11.AbstractC11471f;
import d11.InterfaceC11466a;
import f61.C14143e;
import gb1.AbstractC15693u;
import gm1.C15992b;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.EnumC22400l;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p077d0.C11377m0;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p132f0.C13825t;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p294l3.C23277r0;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h01.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a½\u0001\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a?\u0010%\u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00052\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b'\u0010(\u001aQ\u0010.\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\b\b\u0002\u0010$\u001a\u00020\u00052\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001aH\u0007¢\u0006\u0004\b.\u0010/¨\u00069²\u0006\u000e\u00100\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u0002048\nX\u008a\u0084\u0002²\u0006\u000e\u00106\u001a\u0002048\n@\nX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0002048\nX\u008a\u0084\u0002²\u0006\u000e\u00108\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "id", "Lcom/whoop/design/util/TextResource;", "subtitle", "appNotificationType", "", "isCardExpandable", "Ll0/k1;", "padding", "Lh01/a;", "style", "Lkd1/l;", "cta", "ctaText", "Lkd1/o;", "image", "title", "showBorder", "isUpdating", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "overflowButton", "Lgz0/m0;", "endIcon", "Lm91/u;", "rightItem", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "A", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/navigation/e;ZLgz0/m0;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lh01/q;", "viewState", "isExpandedView", "z", "(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "x", "(Lh01/q;Landroidx/compose/runtime/Composer;I)V", "ctaIcon", "", "Ly81/e;", "buttonColors", "onTextOverflow", "q", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hasOverflow", "isExpanded", "Ly3/f;", "maxHeight", "", "titleMaxLines", "bodyMaxLinesWhenExpanded", "bodyMaxLines", "hasVisualOverflow", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16549p {
    /* JADX WARN: Code duplicated, block: B:100:0x0161  */
    /* JADX WARN: Code duplicated, block: B:103:0x016b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0172  */
    /* JADX WARN: Code duplicated, block: B:107:0x0176  */
    /* JADX WARN: Code duplicated, block: B:110:0x0181  */
    /* JADX WARN: Code duplicated, block: B:112:0x0186  */
    /* JADX WARN: Code duplicated, block: B:115:0x018f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0192  */
    /* JADX WARN: Code duplicated, block: B:118:0x0198  */
    /* JADX WARN: Code duplicated, block: B:120:0x019c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01df  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0202  */
    /* JADX WARN: Code duplicated, block: B:159:0x020a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0210  */
    /* JADX WARN: Code duplicated, block: B:165:0x0223  */
    /* JADX WARN: Code duplicated, block: B:169:0x0231  */
    /* JADX WARN: Code duplicated, block: B:172:0x023b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0242  */
    /* JADX WARN: Code duplicated, block: B:178:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x025c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0262  */
    /* JADX WARN: Code duplicated, block: B:184:0x0269  */
    /* JADX WARN: Code duplicated, block: B:185:0x026c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0271  */
    /* JADX WARN: Code duplicated, block: B:190:0x0275  */
    /* JADX WARN: Code duplicated, block: B:191:0x0278  */
    /* JADX WARN: Code duplicated, block: B:194:0x027d  */
    /* JADX WARN: Code duplicated, block: B:195:0x027f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0284  */
    /* JADX WARN: Code duplicated, block: B:201:0x028d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0292  */
    /* JADX WARN: Code duplicated, block: B:204:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:77:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:88:0x013c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0144  */
    /* JADX WARN: Code duplicated, block: B:93:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0159  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    /* JADX INFO: renamed from: A */
    public static final void m46747A(final String id4, final TextResource subtitle, final String str, boolean z4, InterfaceC22973k1 interfaceC22973k1, EnumC16533a enumC16533a, final EnumC22400l cta, final TextResource ctaText, final AbstractC22403o abstractC22403o, final TextResource title, boolean z13, boolean z14, C9598e c9598e, boolean z15, EnumC16313m0 enumC16313m0, final InterfaceC25312u interfaceC25312u, final Function1 onViewEvent, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        boolean z16;
        int i17;
        int i18;
        InterfaceC22973k1 interfaceC22973k1M46721a;
        int i19;
        int i24;
        int iOrdinal;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        boolean zM87157i;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        boolean z17;
        C28655q c28655q;
        final EnumC16533a enumC16533a2;
        final boolean z18;
        final boolean z19;
        C9598e c9598e2;
        final EnumC16313m0 enumC16313m1;
        final InterfaceC22973k1 interfaceC22973k2;
        final boolean z24;
        C28677v1 c28677v1M87180u;
        EnumC16533a enumC16533a3;
        boolean z25;
        boolean z26;
        C9598e c9598e3;
        boolean z27;
        EnumC16533a enumC16533a4;
        boolean z28;
        InterfaceC22973k1 interfaceC22973k3;
        boolean z29;
        EnumC16313m0 enumC16313m2;
        boolean zM87157i2;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-102651603);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87153g(id4) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(subtitle) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q2.m87153g(str) ? 256 : 128;
        }
        int i55 = i15 & 8;
        int i56 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i55 == 0) {
            if ((i13 & 3072) == 0) {
                z16 = z4;
                i16 |= c28655q2.m87155h(z16) ? 2048 : 1024;
            }
            i17 = i13 & 24576;
            i18 = DfuBaseService.ERROR_REMOTE_MASK;
            if (i17 == 0) {
                if ((i15 & 16) == 0) {
                    interfaceC22973k1M46721a = interfaceC22973k1;
                    if (c28655q2.m87153g(interfaceC22973k1M46721a)) {
                        i54 = 16384;
                    }
                    i16 |= i54;
                } else {
                    interfaceC22973k1M46721a = interfaceC22973k1;
                }
                i54 = 8192;
                i16 |= i54;
            } else {
                interfaceC22973k1M46721a = interfaceC22973k1;
            }
            i19 = i15 & 32;
            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i19 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (enumC16533a == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC16533a.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i16 |= i25;
            }
            if ((i13 & 1572864) != 0) {
                if (c28655q2.m87149e(cta.ordinal())) {
                    i49 = 1048576;
                } else {
                    i49 = 524288;
                }
                i16 |= i49;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q2.m87153g(ctaText)) {
                    i48 = 8388608;
                } else {
                    i48 = 4194304;
                }
                i16 |= i48;
            }
            if ((100663296 & i13) != 0) {
                if (c28655q2.m87153g(abstractC22403o)) {
                    i47 = 67108864;
                } else {
                    i47 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i47;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87153g(title)) {
                    i46 = 536870912;
                } else {
                    i46 = 268435456;
                }
                i16 |= i46;
            }
            i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i26 != 0) {
                i27 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i14 | i28;
            } else {
                i27 = i14;
            }
            i29 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i29 != 0) {
                i27 |= 48;
            } else if ((i14 & 48) != 0) {
                i27 |= c28655q2.m87155h(z14) ? 32 : 16;
            }
            i34 = i27;
            i35 = i15 & 4096;
            if (i35 != 0) {
                i36 = i34 | 384;
            } else if ((i14 & 384) == 0) {
                if ((i14 & 512) == 0) {
                    zM87157i = c28655q2.m87153g(c9598e);
                } else {
                    zM87157i = c28655q2.m87157i(c9598e);
                }
                i36 = i34 | (zM87157i ? 256 : 128);
            } else {
                i36 = i34;
            }
            i37 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i37 != 0) {
                i38 = i37;
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i56 = 2048;
                    }
                    i36 |= i56;
                }
                i39 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i39 != 0) {
                    i36 |= 24576;
                    i44 = i39;
                } else {
                    i44 = i39;
                    if ((i14 & 24576) == 0) {
                        if (c28655q2.m87149e(enumC16313m0 != null ? enumC16313m0.ordinal() : -1)) {
                            i18 = 16384;
                        }
                        i36 |= i18;
                    }
                }
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((262144 & i14) == 0) {
                        zM87157i2 = c28655q2.m87153g(interfaceC25312u);
                    } else {
                        zM87157i2 = c28655q2.m87157i(interfaceC25312u);
                    }
                    if (zM87157i2) {
                        i24 = 131072;
                    }
                    i36 |= i24;
                }
                if ((i14 & 1572864) == 0) {
                    i36 |= c28655q2.m87157i(onViewEvent) ? 1048576 : 524288;
                }
                i45 = i36;
                if ((306783379 & i16) == 306783378 || (i45 & 599187) != 599186) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q2.m87135U(i16 & 1, z17)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                        if (i55 != 0) {
                            z16 = true;
                        }
                        if ((i15 & 16) != 0) {
                            interfaceC22973k1M46721a = AbstractC16537d.m46721a();
                        }
                        if (i19 != 0) {
                            enumC16533a3 = EnumC16533a.DEFAULT;
                        } else {
                            enumC16533a3 = enumC16533a;
                        }
                        z25 = i26 == 0 ? z13 : true;
                        if (i29 != 0) {
                            z26 = false;
                        } else {
                            z26 = z14;
                        }
                        if (i35 != 0) {
                            c9598e3 = null;
                        } else {
                            c9598e3 = c9598e;
                        }
                        z27 = i38 == 0 ? z15 : false;
                        enumC16533a4 = enumC16533a3;
                        z28 = z26;
                        c9598e2 = c9598e3;
                        interfaceC22973k3 = interfaceC22973k1M46721a;
                        if (i44 != 0) {
                            z29 = z27;
                            enumC16313m2 = null;
                        } else {
                            z29 = z27;
                            enumC16313m2 = enumC16313m0;
                        }
                    } else {
                        c28655q2.m87138X();
                        enumC16533a4 = enumC16533a;
                        z25 = z13;
                        z28 = z14;
                        c9598e2 = c9598e;
                        z29 = z15;
                        enumC16313m2 = enumC16313m0;
                        interfaceC22973k3 = interfaceC22973k1M46721a;
                    }
                    c28655q2.m87175r();
                    boolean z34 = z16;
                    boolean z35 = z25;
                    C16550q c16550q = new C16550q(id4, subtitle, str, null, z34, interfaceC22973k3, enumC16533a4, cta, ctaText, abstractC22403o, title, false, z35, false, z28, c9598e2, z29, enumC16313m2, null, null, interfaceC25312u, 796680, null);
                    InterfaceC22973k1 interfaceC22973k4 = interfaceC22973k3;
                    z16 = z34;
                    c28655q = c28655q2;
                    m46792z(null, c16550q, false, onViewEvent, c28655q, (i45 >> 9) & 7168, 5);
                    enumC16533a2 = enumC16533a4;
                    interfaceC22973k2 = interfaceC22973k4;
                    z19 = z28;
                    z24 = z29;
                    enumC16313m1 = enumC16313m2;
                    z18 = z35;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    enumC16533a2 = enumC16533a;
                    z18 = z13;
                    z19 = z14;
                    c9598e2 = c9598e;
                    enumC16313m1 = enumC16313m0;
                    interfaceC22973k2 = interfaceC22973k1M46721a;
                    z24 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final boolean z36 = z16;
                    final C9598e c9598e4 = c9598e2;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h01.o
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC16549p.m46748B(id4, subtitle, str, z36, interfaceC22973k2, enumC16533a2, cta, ctaText, abstractC22403o, title, z18, z19, c9598e4, z24, enumC16313m1, interfaceC25312u, onViewEvent, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i36 |= 3072;
            i38 = i37;
            i39 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i39 != 0) {
                i36 |= 24576;
                i44 = i39;
            } else {
                i44 = i39;
                if ((i14 & 24576) == 0) {
                    if (c28655q2.m87149e(enumC16313m0 != null ? enumC16313m0.ordinal() : -1)) {
                        i18 = 16384;
                    }
                    i36 |= i18;
                }
            }
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((262144 & i14) == 0) {
                    zM87157i2 = c28655q2.m87153g(interfaceC25312u);
                } else {
                    zM87157i2 = c28655q2.m87157i(interfaceC25312u);
                }
                if (zM87157i2) {
                    i24 = 131072;
                }
                i36 |= i24;
            }
            if ((i14 & 1572864) == 0) {
                i36 |= c28655q2.m87157i(onViewEvent) ? 1048576 : 524288;
            }
            i45 = i36;
            if ((306783379 & i16) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z17)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i55 != 0) {
                        z16 = true;
                    }
                    if ((i15 & 16) != 0) {
                        interfaceC22973k1M46721a = AbstractC16537d.m46721a();
                    }
                    if (i19 != 0) {
                        enumC16533a3 = EnumC16533a.DEFAULT;
                    } else {
                        enumC16533a3 = enumC16533a;
                    }
                    if (i26 == 0) {
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z14;
                    }
                    if (i35 != 0) {
                        c9598e3 = null;
                    } else {
                        c9598e3 = c9598e;
                    }
                    if (i38 == 0) {
                    }
                    enumC16533a4 = enumC16533a3;
                    z28 = z26;
                    c9598e2 = c9598e3;
                    interfaceC22973k3 = interfaceC22973k1M46721a;
                    if (i44 != 0) {
                        z29 = z27;
                        enumC16313m2 = null;
                    } else {
                        z29 = z27;
                        enumC16313m2 = enumC16313m0;
                    }
                } else {
                    if (i55 != 0) {
                        z16 = true;
                    }
                    if ((i15 & 16) != 0) {
                        interfaceC22973k1M46721a = AbstractC16537d.m46721a();
                    }
                    if (i19 != 0) {
                        enumC16533a3 = EnumC16533a.DEFAULT;
                    } else {
                        enumC16533a3 = enumC16533a;
                    }
                    if (i26 == 0) {
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z14;
                    }
                    if (i35 != 0) {
                        c9598e3 = null;
                    } else {
                        c9598e3 = c9598e;
                    }
                    if (i38 == 0) {
                    }
                    enumC16533a4 = enumC16533a3;
                    z28 = z26;
                    c9598e2 = c9598e3;
                    interfaceC22973k3 = interfaceC22973k1M46721a;
                    if (i44 != 0) {
                        z29 = z27;
                        enumC16313m2 = null;
                    } else {
                        z29 = z27;
                        enumC16313m2 = enumC16313m0;
                    }
                }
                c28655q2.m87175r();
                boolean z37 = z16;
                boolean z38 = z25;
                C16550q c16550q2 = new C16550q(id4, subtitle, str, null, z37, interfaceC22973k3, enumC16533a4, cta, ctaText, abstractC22403o, title, false, z38, false, z28, c9598e2, z29, enumC16313m2, null, null, interfaceC25312u, 796680, null);
                InterfaceC22973k1 interfaceC22973k5 = interfaceC22973k3;
                z16 = z37;
                c28655q = c28655q2;
                m46792z(null, c16550q2, false, onViewEvent, c28655q, (i45 >> 9) & 7168, 5);
                enumC16533a2 = enumC16533a4;
                interfaceC22973k2 = interfaceC22973k5;
                z19 = z28;
                z24 = z29;
                enumC16313m1 = enumC16313m2;
                z18 = z38;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC16533a2 = enumC16533a;
                z18 = z13;
                z19 = z14;
                c9598e2 = c9598e;
                enumC16313m1 = enumC16313m0;
                interfaceC22973k2 = interfaceC22973k1M46721a;
                z24 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final boolean z39 = z16;
                final C9598e c9598e5 = c9598e2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h01.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC16549p.m46748B(id4, subtitle, str, z39, interfaceC22973k2, enumC16533a2, cta, ctaText, abstractC22403o, title, z18, z19, c9598e5, z24, enumC16313m1, interfaceC25312u, onViewEvent, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        z16 = z4;
        i17 = i13 & 24576;
        i18 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i17 == 0) {
            if ((i15 & 16) == 0) {
                interfaceC22973k1M46721a = interfaceC22973k1;
                if (c28655q2.m87153g(interfaceC22973k1M46721a)) {
                    i54 = 16384;
                }
                i16 |= i54;
            } else {
                interfaceC22973k1M46721a = interfaceC22973k1;
            }
            i54 = 8192;
            i16 |= i54;
        } else {
            interfaceC22973k1M46721a = interfaceC22973k1;
        }
        i19 = i15 & 32;
        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i19 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (enumC16533a == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC16533a.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i25 = 131072;
            } else {
                i25 = 65536;
            }
            i16 |= i25;
        }
        if ((i13 & 1572864) != 0) {
            if (c28655q2.m87149e(cta.ordinal())) {
                i49 = 1048576;
            } else {
                i49 = 524288;
            }
            i16 |= i49;
        }
        if ((12582912 & i13) == 0) {
            if (c28655q2.m87153g(ctaText)) {
                i48 = 8388608;
            } else {
                i48 = 4194304;
            }
            i16 |= i48;
        }
        if ((100663296 & i13) != 0) {
            if (c28655q2.m87153g(abstractC22403o)) {
                i47 = 67108864;
            } else {
                i47 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i47;
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q2.m87153g(title)) {
                i46 = 536870912;
            } else {
                i46 = 268435456;
            }
            i16 |= i46;
        }
        i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i26 != 0) {
            i27 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q2.m87155h(z13)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i14 | i28;
        } else {
            i27 = i14;
        }
        i29 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i29 != 0) {
            i27 |= 48;
        } else if ((i14 & 48) != 0) {
            i27 |= c28655q2.m87155h(z14) ? 32 : 16;
        }
        i34 = i27;
        i35 = i15 & 4096;
        if (i35 != 0) {
            i36 = i34 | 384;
        } else if ((i14 & 384) == 0) {
            if ((i14 & 512) == 0) {
                zM87157i = c28655q2.m87153g(c9598e);
            } else {
                zM87157i = c28655q2.m87157i(c9598e);
            }
            i36 = i34 | (zM87157i ? 256 : 128);
        } else {
            i36 = i34;
        }
        i37 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i37 != 0) {
            i38 = i37;
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i56 = 2048;
                }
                i36 |= i56;
            }
            i39 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i39 != 0) {
                i36 |= 24576;
                i44 = i39;
            } else {
                i44 = i39;
                if ((i14 & 24576) == 0) {
                    if (c28655q2.m87149e(enumC16313m0 != null ? enumC16313m0.ordinal() : -1)) {
                        i18 = 16384;
                    }
                    i36 |= i18;
                }
            }
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((262144 & i14) == 0) {
                    zM87157i2 = c28655q2.m87153g(interfaceC25312u);
                } else {
                    zM87157i2 = c28655q2.m87157i(interfaceC25312u);
                }
                if (zM87157i2) {
                    i24 = 131072;
                }
                i36 |= i24;
            }
            if ((i14 & 1572864) == 0) {
                i36 |= c28655q2.m87157i(onViewEvent) ? 1048576 : 524288;
            }
            i45 = i36;
            if ((306783379 & i16) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (c28655q2.m87135U(i16 & 1, z17)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i55 != 0) {
                        z16 = true;
                    }
                    if ((i15 & 16) != 0) {
                        interfaceC22973k1M46721a = AbstractC16537d.m46721a();
                    }
                    if (i19 != 0) {
                        enumC16533a3 = EnumC16533a.DEFAULT;
                    } else {
                        enumC16533a3 = enumC16533a;
                    }
                    if (i26 == 0) {
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z14;
                    }
                    if (i35 != 0) {
                        c9598e3 = null;
                    } else {
                        c9598e3 = c9598e;
                    }
                    if (i38 == 0) {
                    }
                    enumC16533a4 = enumC16533a3;
                    z28 = z26;
                    c9598e2 = c9598e3;
                    interfaceC22973k3 = interfaceC22973k1M46721a;
                    if (i44 != 0) {
                        z29 = z27;
                        enumC16313m2 = null;
                    } else {
                        z29 = z27;
                        enumC16313m2 = enumC16313m0;
                    }
                } else {
                    if (i55 != 0) {
                        z16 = true;
                    }
                    if ((i15 & 16) != 0) {
                        interfaceC22973k1M46721a = AbstractC16537d.m46721a();
                    }
                    if (i19 != 0) {
                        enumC16533a3 = EnumC16533a.DEFAULT;
                    } else {
                        enumC16533a3 = enumC16533a;
                    }
                    if (i26 == 0) {
                    }
                    if (i29 != 0) {
                        z26 = false;
                    } else {
                        z26 = z14;
                    }
                    if (i35 != 0) {
                        c9598e3 = null;
                    } else {
                        c9598e3 = c9598e;
                    }
                    if (i38 == 0) {
                    }
                    enumC16533a4 = enumC16533a3;
                    z28 = z26;
                    c9598e2 = c9598e3;
                    interfaceC22973k3 = interfaceC22973k1M46721a;
                    if (i44 != 0) {
                        z29 = z27;
                        enumC16313m2 = null;
                    } else {
                        z29 = z27;
                        enumC16313m2 = enumC16313m0;
                    }
                }
                c28655q2.m87175r();
                boolean z310 = z16;
                boolean z311 = z25;
                C16550q c16550q3 = new C16550q(id4, subtitle, str, null, z310, interfaceC22973k3, enumC16533a4, cta, ctaText, abstractC22403o, title, false, z311, false, z28, c9598e2, z29, enumC16313m2, null, null, interfaceC25312u, 796680, null);
                InterfaceC22973k1 interfaceC22973k6 = interfaceC22973k3;
                z16 = z310;
                c28655q = c28655q2;
                m46792z(null, c16550q3, false, onViewEvent, c28655q, (i45 >> 9) & 7168, 5);
                enumC16533a2 = enumC16533a4;
                interfaceC22973k2 = interfaceC22973k6;
                z19 = z28;
                z24 = z29;
                enumC16313m1 = enumC16313m2;
                z18 = z311;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                enumC16533a2 = enumC16533a;
                z18 = z13;
                z19 = z14;
                c9598e2 = c9598e;
                enumC16313m1 = enumC16313m0;
                interfaceC22973k2 = interfaceC22973k1M46721a;
                z24 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final boolean z312 = z16;
                final C9598e c9598e6 = c9598e2;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h01.o
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC16549p.m46748B(id4, subtitle, str, z312, interfaceC22973k2, enumC16533a2, cta, ctaText, abstractC22403o, title, z18, z19, c9598e6, z24, enumC16313m1, interfaceC25312u, onViewEvent, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i36 |= 3072;
        i38 = i37;
        i39 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i39 != 0) {
            i36 |= 24576;
            i44 = i39;
        } else {
            i44 = i39;
            if ((i14 & 24576) == 0) {
                if (c28655q2.m87149e(enumC16313m0 != null ? enumC16313m0.ordinal() : -1)) {
                    i18 = 16384;
                }
                i36 |= i18;
            }
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((262144 & i14) == 0) {
                zM87157i2 = c28655q2.m87153g(interfaceC25312u);
            } else {
                zM87157i2 = c28655q2.m87157i(interfaceC25312u);
            }
            if (zM87157i2) {
                i24 = 131072;
            }
            i36 |= i24;
        }
        if ((i14 & 1572864) == 0) {
            i36 |= c28655q2.m87157i(onViewEvent) ? 1048576 : 524288;
        }
        i45 = i36;
        if ((306783379 & i16) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (c28655q2.m87135U(i16 & 1, z17)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i55 != 0) {
                    z16 = true;
                }
                if ((i15 & 16) != 0) {
                    interfaceC22973k1M46721a = AbstractC16537d.m46721a();
                }
                if (i19 != 0) {
                    enumC16533a3 = EnumC16533a.DEFAULT;
                } else {
                    enumC16533a3 = enumC16533a;
                }
                if (i26 == 0) {
                }
                if (i29 != 0) {
                    z26 = false;
                } else {
                    z26 = z14;
                }
                if (i35 != 0) {
                    c9598e3 = null;
                } else {
                    c9598e3 = c9598e;
                }
                if (i38 == 0) {
                }
                enumC16533a4 = enumC16533a3;
                z28 = z26;
                c9598e2 = c9598e3;
                interfaceC22973k3 = interfaceC22973k1M46721a;
                if (i44 != 0) {
                    z29 = z27;
                    enumC16313m2 = null;
                } else {
                    z29 = z27;
                    enumC16313m2 = enumC16313m0;
                }
            } else {
                if (i55 != 0) {
                    z16 = true;
                }
                if ((i15 & 16) != 0) {
                    interfaceC22973k1M46721a = AbstractC16537d.m46721a();
                }
                if (i19 != 0) {
                    enumC16533a3 = EnumC16533a.DEFAULT;
                } else {
                    enumC16533a3 = enumC16533a;
                }
                if (i26 == 0) {
                }
                if (i29 != 0) {
                    z26 = false;
                } else {
                    z26 = z14;
                }
                if (i35 != 0) {
                    c9598e3 = null;
                } else {
                    c9598e3 = c9598e;
                }
                if (i38 == 0) {
                }
                enumC16533a4 = enumC16533a3;
                z28 = z26;
                c9598e2 = c9598e3;
                interfaceC22973k3 = interfaceC22973k1M46721a;
                if (i44 != 0) {
                    z29 = z27;
                    enumC16313m2 = null;
                } else {
                    z29 = z27;
                    enumC16313m2 = enumC16313m0;
                }
            }
            c28655q2.m87175r();
            boolean z313 = z16;
            boolean z314 = z25;
            C16550q c16550q4 = new C16550q(id4, subtitle, str, null, z313, interfaceC22973k3, enumC16533a4, cta, ctaText, abstractC22403o, title, false, z314, false, z28, c9598e2, z29, enumC16313m2, null, null, interfaceC25312u, 796680, null);
            InterfaceC22973k1 interfaceC22973k7 = interfaceC22973k3;
            z16 = z313;
            c28655q = c28655q2;
            m46792z(null, c16550q4, false, onViewEvent, c28655q, (i45 >> 9) & 7168, 5);
            enumC16533a2 = enumC16533a4;
            interfaceC22973k2 = interfaceC22973k7;
            z19 = z28;
            z24 = z29;
            enumC16313m1 = enumC16313m2;
            z18 = z314;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            enumC16533a2 = enumC16533a;
            z18 = z13;
            z19 = z14;
            c9598e2 = c9598e;
            enumC16313m1 = enumC16313m0;
            interfaceC22973k2 = interfaceC22973k1M46721a;
            z24 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final boolean z315 = z16;
            final C9598e c9598e7 = c9598e2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h01.o
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC16549p.m46748B(id4, subtitle, str, z315, interfaceC22973k2, enumC16533a2, cta, ctaText, abstractC22403o, title, z18, z19, c9598e7, z24, enumC16313m1, interfaceC25312u, onViewEvent, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m46748B(String str, TextResource textResource, String str2, boolean z4, InterfaceC22973k1 interfaceC22973k1, EnumC16533a enumC16533a, EnumC22400l enumC22400l, TextResource textResource2, AbstractC22403o abstractC22403o, TextResource textResource3, boolean z13, boolean z14, C9598e c9598e, boolean z15, EnumC16313m0 enumC16313m0, InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, int i15, Composer composer, int i16) {
        m46747A(str, textResource, str2, z4, interfaceC22973k1, enumC16533a, enumC22400l, textResource2, abstractC22403o, textResource3, z13, z14, c9598e, z15, enumC16313m0, interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final int m46749C(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: renamed from: D */
    private static final int m46750D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m46751E(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: F */
    private static final int m46752F(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m46753G(C16550q c16550q, Function1 function1) {
        C9598e c9598eM46800i = c16550q.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (c9598eM46800i != null) {
            function1.invoke(c9598eM46800i);
        } else {
            function1.invoke(c16550q.getCta());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m46754H(C16550q c16550q, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, Function1 function1, String str, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c3, InterfaceC28670t2 interfaceC28670t4, Composer composer, int i13) {
        C2314t c2314t;
        ?? r10;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3412i(AbstractC1091c.m3355a(c16550q.getStyle().getStyleModifier(), C16536c.f63627a.m46719a(), 2), 35 * f13, m46765S(interfaceC28670t2)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            InterfaceC22973k1 interfaceC22973k1M46801j = c16550q.getPadding();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3393o = AbstractC1099a.m3393o(interfaceC22973k1M46801j, c2314t2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3393o);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            double d3 = 1.0f;
            if (d3 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            AbstractC22403o abstractC22403oM46807p = c16550q.getTitleIconUrl();
            if (abstractC22403oM46807p == null) {
                c28655q.m87150e0(1602639992);
                c28655q.m87173q(false);
                c2314t = c2314t2;
            } else {
                c2314t = c2314t2;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM46807p, null, null, c28655q, 0, 3), null, AbstractC18489d0.m53365f(c28655q, 1602639993, f13, f13, c2314t2), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q = c28655q;
                AbstractC18489d0.m53381v(2, f13, c2314t, c28655q, false);
            }
            C38072d c38072d = C38072d.f163053a;
            long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, 6).getB1();
            int iM46749C = m46749C(interfaceC28670t3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C16546m(0, interfaceC28601c3);
                c28655q.m87172p0(objM87133R);
            }
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(str, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM46749C, 0, (Function1) objM87133R, c2886aM8420a, null, c28655q2, 0, 196656, 153594);
            c28655q2.m87173q(true);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13);
            if (d3 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3398t, false, 1.0f);
            String strM21274h = AbstractC8693b.m21274h(c16550q.getSubtitle(), c28655q2, 0);
            long jM125385c1 = c38072d.m121949b(c28655q2, 6).getWhite70();
            C2886a c2886aM46795c = c16550q.getBodyTextStyle();
            int iM46752F = m46752F(interfaceC28670t4);
            boolean zM87153g = c28655q2.m87153g(interfaceC28601c2);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C16547n(0, interfaceC28601c3, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC30795n.m94707h(strM21274h, modifierM31988g, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM46752F, 0, (Function1) objM87133R2, c2886aM46795c, null, c28655q2, 0, 48, 153592);
            if (c16550q.getShowButton()) {
                c28655q2.m87150e0(826794672);
                TextResource textResourceM46797f = c16550q.getCtaText();
                List<InterfaceC39332e> buttonColor = c16550q.getStyle().getButtonColor();
                boolean zM46762P = m46762P(interfaceC28601c1);
                Object objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C16546m(1, interfaceC28601c3);
                    c28655q2.m87172p0(objM87133R3);
                }
                m46783q(textResourceM46797f, null, buttonColor, zM46762P, (Function1) objM87133R3, c28655q2, 24576, 2);
                r10 = 0;
                c28655q2.m87173q(false);
            } else {
                r10 = 0;
                c28655q2.m87150e0(827211746);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            m46790x(c16550q, c28655q2, r10);
            c28655q2.m87173q(true);
            EnumC16313m0 enumC16313m0M46798g = c16550q.getEndIcon();
            C1100b c1100b = C1100b.f4583a;
            if (enumC16313m0M46798g == null) {
                c28655q2.m87150e0(-826540929);
                c28655q2.m87173q(r10);
            } else {
                c28655q2.m87150e0(-826540928);
                AbstractC16557x.m46854i(c1100b, null, null, enumC16313m0M46798g, c16550q.getStyle().getEndIconColor(), c28655q2, 6, 3);
                c28655q2.m87173q(r10);
            }
            if ((m46760N(interfaceC28601c3) || m46762P(interfaceC28601c1)) && c16550q.getIsCardExpandable() && !c16550q.getIsAlwaysExpanded()) {
                c28655q2.m87150e0(-826331833);
                boolean zM46762P2 = m46762P(interfaceC28601c1);
                boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(function1) | c28655q2.m87157i(c16550q) | c28655q2.m87153g(str);
                Object objM87133R4 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C11377m0(function1, c16550q, str, interfaceC28601c1, 1);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC16557x.m46850e(c1100b, null, zM46762P2, false, (InterfaceC4339a) objM87133R4, c28655q2, 6, 5);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-825911876);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m46755I(InterfaceC28601c1 interfaceC28601c1, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        m46761O(interfaceC28601c1, result.m67336e());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m46756J(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.m67336e()) {
            m46761O(interfaceC28601c1, true);
        } else {
            m46751E(interfaceC28601c2, result.f92228b.f92263f);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m46757K(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m46761O(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m46758L(Function1 function1, C16550q c16550q, String str, InterfaceC28601c1 interfaceC28601c1) {
        m46763Q(interfaceC28601c1, !m46762P(interfaceC28601c1));
        String appNotificationType = c16550q.getAppNotificationType();
        if (appNotificationType == null) {
            appNotificationType = "";
        }
        function1.invoke(new C16551r(appNotificationType, str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m46759M(Modifier modifier, C16550q c16550q, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m46792z(modifier, c16550q, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final boolean m46760N(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    private static final void m46761O(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: P */
    private static final boolean m46762P(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    private static final void m46763Q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C39174f m46764R(InterfaceC28601c1 interfaceC28601c1) {
        return new C39174f(m46762P(interfaceC28601c1) ? ErrorCodes.WebsocketMethodErrors.cServerErrors : C16536c.f63627a.m46720b());
    }

    /* JADX INFO: renamed from: S */
    private static final float m46765S(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final int m46766T(InterfaceC28601c1 interfaceC28601c1) {
        return m46762P(interfaceC28601c1) ? Integer.MAX_VALUE : 2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0208  */
    /* JADX WARN: Code duplicated, block: B:108:0x020b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0220  */
    /* JADX WARN: Code duplicated, block: B:112:0x0223  */
    /* JADX WARN: Code duplicated, block: B:115:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x022c  */
    /* JADX WARN: Code duplicated, block: B:119:0x029a  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:140:0x0322  */
    /* JADX WARN: Code duplicated, block: B:142:0x0326  */
    /* JADX WARN: Code duplicated, block: B:145:0x0337  */
    /* JADX WARN: Code duplicated, block: B:147:0x033d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0364  */
    /* JADX WARN: Code duplicated, block: B:152:0x0371  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5 A[LOOP:0: B:72:0x00df->B:74:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0159  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0172  */
    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x029a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static final void m46783q(TextResource ctaText, EnumC16313m0 enumC16313m0, List<? extends InterfaceC39332e> buttonColors, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        Function1 function2;
        int i17;
        boolean z14;
        EnumC16313m0 enumC16313m1;
        boolean z15;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        EnumC16313m0 enumC16313m2;
        boolean z16;
        C28676v0 c28676v0;
        Function1 function4;
        ArrayList arrayList;
        Iterator<T> it;
        boolean z17;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C2314t c2314t;
        int iHashCode;
        boolean z18;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        C38072d c38072d;
        List listM118959K;
        EnumC16313m0 enumC16313m3;
        int i19;
        float f13;
        boolean z19;
        Object objM87133R2;
        Modifier layoutWeightElement;
        int iHashCode2;
        boolean zM87155h;
        Object objM87133R3;
        int iM53359E;
        Object objM87133R4;
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(buttonColors, "buttonColors");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1993563674);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(ctaText) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(buttonColors) ? 256 : 128;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C15992b(29);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    c28655q.m87150e0(259284472);
                    List<? extends InterfaceC39332e> list = buttonColors;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C17919x(((InterfaceC39332e) it.next()).mo134584toComposableColorWaAFU9c(c28655q, 0)));
                    }
                    c28655q.m87173q(false);
                    if (arrayList.size() == 1) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    z18 = z17;
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    i18 = i15;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    String strM21274h = AbstractC8693b.m21274h(ctaText, c28655q, i18 & 14);
                    c38072d = C38072d.f163053a;
                    C2886a c2886aM8430k = c38072d.m121952e(c28655q, 6).getBtS();
                    C23285v0 style = c38072d.m121952e(c28655q, 6).getBtS().getStyle();
                    C17909s c17909s = AbstractC17911t.f69612b;
                    if (z18) {
                        listM118959K = AbstractC37056f.m118959K(arrayList.get(0), arrayList.get(0));
                    } else {
                        listM118959K = arrayList;
                    }
                    enumC16313m3 = enumC16313m2;
                    C2886a c2886aM8397c = C2886a.m8397c(c2886aM8430k, C23285v0.m67363a(style, C17909s.m51486d(c17909s, listM118959K, 0L, 0L, 14), 0L, null, null, 0L, 33554430), null, 2, null);
                    if (z16) {
                        i19 = Integer.MAX_VALUE;
                    } else {
                        i19 = 1;
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    Modifier modifierM3429z = AbstractC1102d.m3429z(new LayoutWeightElement(f13, false), C2299e.f9110M, 2);
                    if ((i18 & 57344) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z19 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C2752g(function4, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function5 = function4;
                    AbstractC30795n.m94707h(strM21274h, modifierM3429z, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, i19, 0, (Function1) objM87133R2, c2886aM8397c, null, c28655q, 0, 48, 153596);
                    c28655q = c28655q;
                    float f14 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
                    C2307m c2307m = C2299e.f9117z;
                    if (z16) {
                        if (0.8f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        layoutWeightElement = new LayoutWeightElement(0.8f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.8f, true);
                    } else {
                        layoutWeightElement = c2314t;
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f14 * f14, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                    zM87155h = c28655q.m87155h(z18) | c28655q.m87157i(arrayList);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87155h || objM87133R3 == c28676v0) {
                        objM87133R3 = new C16543j(0, arrayList, z18);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3479b = AbstractC1125a.m3479b(modifierM3488c, (Function1) objM87133R3);
                    if (enumC16313m3 != null) {
                        iM53359E = enumC16313m3.toWhoopIcon();
                    } else {
                        iM53359E = AbstractC18489d0.m53359E(c38072d);
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iM53359E, c28655q, 6), null, modifierM3479b, ((C17919x) arrayList.get(0)).f69639a, c28655q, 48, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function5;
                    z15 = z16;
                    enumC16313m1 = enumC16313m3;
                } else {
                    c28655q.m87138X();
                    enumC16313m1 = enumC16313m0;
                    z15 = z13;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16544k(ctaText, enumC16313m1, buttonColors, function3, z15, i13, i14, 0);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i25 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C15992b(29);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                c28655q.m87150e0(259284472);
                List<? extends InterfaceC39332e> list2 = buttonColors;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C17919x(((InterfaceC39332e) it.next()).mo134584toComposableColorWaAFU9c(c28655q, 0)));
                }
                c28655q.m87173q(false);
                if (arrayList.size() == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                z18 = z17;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                i18 = i15;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                String strM21274h2 = AbstractC8693b.m21274h(ctaText, c28655q, i18 & 14);
                c38072d = C38072d.f163053a;
                C2886a c2886aM8430k2 = c38072d.m121952e(c28655q, 6).getBtS();
                C23285v0 style2 = c38072d.m121952e(c28655q, 6).getBtS().getStyle();
                C17909s c17909s2 = AbstractC17911t.f69612b;
                if (z18) {
                    listM118959K = AbstractC37056f.m118959K(arrayList.get(0), arrayList.get(0));
                } else {
                    listM118959K = arrayList;
                }
                enumC16313m3 = enumC16313m2;
                C2886a c2886aM8397c2 = C2886a.m8397c(c2886aM8430k2, C23285v0.m67363a(style2, C17909s.m51486d(c17909s2, listM118959K, 0L, 0L, 14), 0L, null, null, 0L, 33554430), null, 2, null);
                if (z16) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = 1;
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                Modifier modifierM3429z2 = AbstractC1102d.m3429z(new LayoutWeightElement(f13, false), C2299e.f9110M, 2);
                if ((i18 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    objM87133R2 = new C2752g(function4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2752g(function4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function6 = function4;
                AbstractC30795n.m94707h(strM21274h2, modifierM3429z2, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, i19, 0, (Function1) objM87133R2, c2886aM8397c2, null, c28655q, 0, 48, 153596);
                c28655q = c28655q;
                float f15 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f15, c2314t));
                C2307m c2307m2 = C2299e.f9117z;
                if (z16) {
                    if (0.8f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    layoutWeightElement = new LayoutWeightElement(0.8f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.8f, true);
                } else {
                    layoutWeightElement = c2314t;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                Modifier modifierM3488c2 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f15 * f15, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                zM87155h = c28655q.m87155h(z18) | c28655q.m87157i(arrayList);
                objM87133R3 = c28655q.m87133R();
                if (zM87155h) {
                    objM87133R3 = new C16543j(0, arrayList, z18);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C16543j(0, arrayList, z18);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3479b2 = AbstractC1125a.m3479b(modifierM3488c2, (Function1) objM87133R3);
                if (enumC16313m3 != null) {
                    iM53359E = enumC16313m3.toWhoopIcon();
                } else {
                    iM53359E = AbstractC18489d0.m53359E(c38072d);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iM53359E, c28655q, 6), null, modifierM3479b2, ((C17919x) arrayList.get(0)).f69639a, c28655q, 48, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function6;
                z15 = z16;
                enumC16313m1 = enumC16313m3;
            } else {
                c28655q.m87138X();
                enumC16313m1 = enumC16313m0;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(ctaText, enumC16313m1, buttonColors, function3, z15, i13, i14, 0);
            }
        }
        i15 |= 3072;
        z13 = z4;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i25 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C15992b(29);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                c28655q.m87150e0(259284472);
                List<? extends InterfaceC39332e> list3 = buttonColors;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C17919x(((InterfaceC39332e) it.next()).mo134584toComposableColorWaAFU9c(c28655q, 0)));
                }
                c28655q.m87173q(false);
                if (arrayList.size() == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13));
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                z18 = z17;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                i18 = i15;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                String strM21274h3 = AbstractC8693b.m21274h(ctaText, c28655q, i18 & 14);
                c38072d = C38072d.f163053a;
                C2886a c2886aM8430k3 = c38072d.m121952e(c28655q, 6).getBtS();
                C23285v0 style3 = c38072d.m121952e(c28655q, 6).getBtS().getStyle();
                C17909s c17909s3 = AbstractC17911t.f69612b;
                if (z18) {
                    listM118959K = AbstractC37056f.m118959K(arrayList.get(0), arrayList.get(0));
                } else {
                    listM118959K = arrayList;
                }
                enumC16313m3 = enumC16313m2;
                C2886a c2886aM8397c3 = C2886a.m8397c(c2886aM8430k3, C23285v0.m67363a(style3, C17909s.m51486d(c17909s3, listM118959K, 0L, 0L, 14), 0L, null, null, 0L, 33554430), null, 2, null);
                if (z16) {
                    i19 = Integer.MAX_VALUE;
                } else {
                    i19 = 1;
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                Modifier modifierM3429z3 = AbstractC1102d.m3429z(new LayoutWeightElement(f13, false), C2299e.f9110M, 2);
                if ((i18 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    objM87133R2 = new C2752g(function4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C2752g(function4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function7 = function4;
                AbstractC30795n.m94707h(strM21274h3, modifierM3429z3, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, i19, 0, (Function1) objM87133R2, c2886aM8397c3, null, c28655q, 0, 48, 153596);
                c28655q = c28655q;
                float f16 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f16, c2314t));
                C2307m c2307m3 = C2299e.f9117z;
                if (z16) {
                    if (0.8f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    layoutWeightElement = new LayoutWeightElement(0.8f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.8f, true);
                } else {
                    layoutWeightElement = c2314t;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                Modifier modifierM3488c3 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f16 * f16, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                zM87155h = c28655q.m87155h(z18) | c28655q.m87157i(arrayList);
                objM87133R3 = c28655q.m87133R();
                if (zM87155h) {
                    objM87133R3 = new C16543j(0, arrayList, z18);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C16543j(0, arrayList, z18);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3479b3 = AbstractC1125a.m3479b(modifierM3488c3, (Function1) objM87133R3);
                if (enumC16313m3 != null) {
                    iM53359E = enumC16313m3.toWhoopIcon();
                } else {
                    iM53359E = AbstractC18489d0.m53359E(c38072d);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iM53359E, c28655q, 6), null, modifierM3479b3, ((C17919x) arrayList.get(0)).f69639a, c28655q, 48, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function7;
                z15 = z16;
                enumC16313m1 = enumC16313m3;
            } else {
                c28655q.m87138X();
                enumC16313m1 = enumC16313m0;
                z15 = z13;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(ctaText, enumC16313m1, buttonColors, function3, z15, i13, i14, 0);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i24 != 0) {
                enumC16313m2 = null;
            } else {
                enumC16313m2 = enumC16313m0;
            }
            if (i25 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C15992b(29);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            c28655q.m87150e0(259284472);
            List<? extends InterfaceC39332e> list4 = buttonColors;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(new C17919x(((InterfaceC39332e) it.next()).mo134584toComposableColorWaAFU9c(c28655q, 0)));
            }
            c28655q.m87173q(false);
            if (arrayList.size() == 1) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13));
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            z18 = z17;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            i18 = i15;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            String strM21274h4 = AbstractC8693b.m21274h(ctaText, c28655q, i18 & 14);
            c38072d = C38072d.f163053a;
            C2886a c2886aM8430k4 = c38072d.m121952e(c28655q, 6).getBtS();
            C23285v0 style4 = c38072d.m121952e(c28655q, 6).getBtS().getStyle();
            C17909s c17909s4 = AbstractC17911t.f69612b;
            if (z18) {
                listM118959K = AbstractC37056f.m118959K(arrayList.get(0), arrayList.get(0));
            } else {
                listM118959K = arrayList;
            }
            enumC16313m3 = enumC16313m2;
            C2886a c2886aM8397c4 = C2886a.m8397c(c2886aM8430k4, C23285v0.m67363a(style4, C17909s.m51486d(c17909s4, listM118959K, 0L, 0L, 14), 0L, null, null, 0L, 33554430), null, 2, null);
            if (z16) {
                i19 = Integer.MAX_VALUE;
            } else {
                i19 = 1;
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            Modifier modifierM3429z4 = AbstractC1102d.m3429z(new LayoutWeightElement(f13, false), C2299e.f9110M, 2);
            if ((i18 & 57344) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z19) {
                objM87133R2 = new C2752g(function4, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2752g(function4, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function8 = function4;
            AbstractC30795n.m94707h(strM21274h4, modifierM3429z4, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, i19, 0, (Function1) objM87133R2, c2886aM8397c4, null, c28655q, 0, 48, 153596);
            c28655q = c28655q;
            float f17 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f17, c2314t));
            C2307m c2307m4 = C2299e.f9117z;
            if (z16) {
                if (0.8f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                layoutWeightElement = new LayoutWeightElement(0.8f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.8f, true);
            } else {
                layoutWeightElement = c2314t;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            Modifier modifierM3488c4 = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f17 * f17, c2314t), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
            zM87155h = c28655q.m87155h(z18) | c28655q.m87157i(arrayList);
            objM87133R3 = c28655q.m87133R();
            if (zM87155h) {
                objM87133R3 = new C16543j(0, arrayList, z18);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C16543j(0, arrayList, z18);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3479b4 = AbstractC1125a.m3479b(modifierM3488c4, (Function1) objM87133R3);
            if (enumC16313m3 != null) {
                iM53359E = enumC16313m3.toWhoopIcon();
            } else {
                iM53359E = AbstractC18489d0.m53359E(c38072d);
            }
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iM53359E, c28655q, 6), null, modifierM3479b4, ((C17919x) arrayList.get(0)).f69639a, c28655q, 48, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function8;
            z15 = z16;
            enumC16313m1 = enumC16313m3;
        } else {
            c28655q.m87138X();
            enumC16313m1 = enumC16313m0;
            z15 = z13;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16544k(ctaText, enumC16313m1, buttonColors, function3, z15, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m46784r(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m46785s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m46786t(Function1 function1, InterfaceC28601c1 interfaceC28601c1, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        m46785s(interfaceC28601c1, result.m67336e());
        function1.invoke(Boolean.valueOf(result.m67336e()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C14018g m46787u(boolean z4, List list, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C16543j(1, list, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m46788v(boolean z4, List list, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        if (!z4) {
            InterfaceC22131e.m63385u(onDrawWithContent, AbstractC15693u.m44155b(AbstractC17911t.f69612b, list, null, 0, 315.0f, false, 22, null), 0L, 0L, 0.0f, null, 9, 62);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m46789w(TextResource textResource, EnumC16313m0 enumC16313m0, List list, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m46783q(textResource, enumC16313m0, list, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m46790x(C16550q c16550q, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1238692866);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c16550q) : c28655q.m87157i(c16550q) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC25312u interfaceC25312uM46802k = c16550q.getRightItem();
            C2314t c2314t = C2314t.f9131w;
            if (interfaceC25312uM46802k != null) {
                c28655q.m87150e0(-459706179);
                Modifier modifierM3428y = AbstractC1102d.m3428y(AbstractC1099a.m3398t(c2314t, 1 * 8, 0.0f, 0.0f, 0.0f, 14), null, false, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9103F, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3428y);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (c16550q.getRightItem() instanceof C4242s) {
                    c28655q.m87150e0(304454772);
                    AbstractC4234k.m13178q(null, null, null, AbstractC12350b.m34565N(2.0f, c2314t), AbstractC34132o.m107879c(0.0f, c2314t), null, (C4242s) c16550q.getRightItem(), c28655q, 27648, 39);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(304736531);
                    AbstractC25303l.m74291r(c16550q.getRightItem(), null, null, null, c28655q, 0, 14);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else if (c16550q.getImage() != null) {
                c28655q.m87150e0(-458939797);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c16550q.getImage(), null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-458749984);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(c16550q, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m46791y(C16550q c16550q, int i13, Composer composer, int i14) {
        m46790x(c16550q, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:110:0x0201  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0113  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Code duplicated, block: B:88:0x015a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0178  */
    /* JADX INFO: renamed from: z */
    public static final void m46792z(Modifier modifier, C16550q viewState, boolean z4, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        Modifier modifier3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z16;
        C13825t c13825tM30799x;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean zM87153g;
        Object objM87133R2;
        boolean z17;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        Object objM87133R4;
        boolean zM87153g2;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c2;
        int iM46750D;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R6;
        InterfaceC11466a borderInformation;
        int i16;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(379908112);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c13825tM30799x = null;
                if (viewState.getShowBorder()) {
                    c28655q2.m87150e0(604018882);
                    borderInformation = viewState.getStyle().getBorderInformation();
                    if (borderInformation == null) {
                        c28655q2.m87150e0(604018881);
                    } else {
                        c28655q2.m87150e0(19484480);
                        c13825tM30799x = AbstractC11471f.m30799x(borderInformation, c28655q2, 0);
                    }
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(604040333);
                }
                c28655q2.m87173q(false);
                C13825t c13825t = c13825tM30799x;
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                zM87153g = c28655q2.m87153g(viewState.getSubtitle());
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    if (!z16 || viewState.getIsAlwaysExpanded()) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = AbstractC31061c.m95647w(z17, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new C16542i(0, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87264r(new C16542i(1, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R4;
                zM87153g2 = c28655q2.m87153g(viewState.getSubtitle());
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                if (m46762P(interfaceC28601c1)) {
                    iM46750D = m46750D(interfaceC28601c2);
                } else {
                    iM46750D = 5;
                }
                InterfaceC28670t2 interfaceC28670t2M30589c = AbstractC11352g.m30589c(iM46750D, c28655q2);
                String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0);
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q2.m87157i(viewState))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((i15 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z18 | z19;
                objM87133R6 = c28655q2.m87133R();
                if (z24 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C0134l(viewState, onViewEvent, 18);
                    c28655q2.m87172p0(objM87133R6);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R6, 15), null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), AbstractC33253j.m105489e(3 * 4), c13825t, null, viewState.getStyle().getElevation(), AbstractC37817c.m121344e(425064352, c28655q2, new C16545l(viewState, interfaceC28670t2, interfaceC28601c1, onViewEvent, strM21274h, interfaceC28601c2, interfaceC28670t3, interfaceC28601c3, interfaceC28670t2M30589c)), c28655q, 12582912, 34);
                z15 = z16;
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 2, modifier3, viewState, onViewEvent, z15);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87157i(onViewEvent)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c13825tM30799x = null;
            if (viewState.getShowBorder()) {
                c28655q2.m87150e0(604018882);
                borderInformation = viewState.getStyle().getBorderInformation();
                if (borderInformation == null) {
                    c28655q2.m87150e0(604018881);
                } else {
                    c28655q2.m87150e0(19484480);
                    c13825tM30799x = AbstractC11471f.m30799x(borderInformation, c28655q2, 0);
                }
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(604040333);
            }
            c28655q2.m87173q(false);
            C13825t c13825t2 = c13825tM30799x;
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R;
            zM87153g = c28655q2.m87153g(viewState.getSubtitle());
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g) {
                if (z16) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                objM87133R2 = AbstractC31061c.m95647w(z17, c28655q2);
            } else {
                if (z16) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                objM87133R2 = AbstractC31061c.m95647w(z17, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87264r(new C16542i(0, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87264r(new C16542i(1, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28670t2 interfaceC28670t5 = (InterfaceC28670t2) objM87133R4;
            zM87153g2 = c28655q2.m87153g(viewState.getSubtitle());
            objM87133R5 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
            } else {
                objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            if (m46762P(interfaceC28601c1)) {
                iM46750D = m46750D(interfaceC28601c2);
            } else {
                iM46750D = 5;
            }
            InterfaceC28670t2 interfaceC28670t2M30589c2 = AbstractC11352g.m30589c(iM46750D, c28655q2);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0);
            if ((i15 & 112) != 32) {
                z18 = true;
            } else {
                z18 = true;
            }
            if ((i15 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z18 | z19;
            objM87133R6 = c28655q2.m87133R();
            if (z24) {
                objM87133R6 = new C0134l(viewState, onViewEvent, 18);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C0134l(viewState, onViewEvent, 18);
                c28655q2.m87172p0(objM87133R6);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R6, 15), null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), AbstractC33253j.m105489e(3 * 4), c13825t2, null, viewState.getStyle().getElevation(), AbstractC37817c.m121344e(425064352, c28655q2, new C16545l(viewState, interfaceC28670t4, interfaceC28601c1, onViewEvent, strM21274h2, interfaceC28601c2, interfaceC28670t5, interfaceC28601c4, interfaceC28670t2M30589c2)), c28655q, 12582912, 34);
            z15 = z16;
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14143e(i13, i14, 2, modifier3, viewState, onViewEvent, z15);
        }
    }
}
