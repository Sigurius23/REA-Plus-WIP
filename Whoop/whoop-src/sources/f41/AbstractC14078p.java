package f41;

import am2.C1040r;
import am2.C1042s;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import cu2.C11139s;
import ep1.C13412g;
import f01.C13857f;
import f02.C13917c;
import gb1.AbstractC15676d;
import hb3.AbstractC17104a0;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.C23016z;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import yb3.AbstractC39421y;
import z21.AbstractC40021c;

/* JADX INFO: renamed from: f41.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001as\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aÑ\u0001\u0010&\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060%H\u0007¢\u0006\u0004\b&\u0010'\u001a?\u0010-\u001a\u00020\n2\u001e\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0)0(2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010.¨\u00062²\u0006\u000e\u0010/\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lf41/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Z", "(Landroidx/compose/ui/Modifier;Lf41/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "Lkd1/o;", "icon", "Lf41/b;", "values", "Li2/x;", "color", "", "initialSelection", "", "isExpanded", "", "testTagPrefix", "Lkotlin/Function2;", "callBack", "t", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lkd1/o;Lf41/b;JIZLjava/lang/String;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "backgroundImg", "subtitle", "Lhy0/c2;", "trend", "checkToggleText", "isChecked", "showAvoidOption", "Lf41/a;", "bottomSheetInfo", "Lkotlin/Function3;", "G", "(Landroidx/compose/ui/Modifier;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Lf41/b;JILcom/whoop/design/util/TextResource;ZZZLf41/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "Ll83/k;", "textDisplaysMapping", "isCheckState", "currentSelectedValue", "d0", "(Ljava/util/Map;ZI)Lcom/whoop/design/util/TextResource;", "showNumericScale", "currentSelectedNumber", "scaleDisplayText", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14078p {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m40050A(Modifier modifier, TextResource textResource, AbstractC22403o abstractC22403o, C14064b c14064b, long j7, int i13, boolean z4, String str, InterfaceC4351m interfaceC4351m, int i14, int i15, Composer composer, int i16) {
        m40099t(modifier, textResource, abstractC22403o, c14064b, j7, i13, z4, str, interfaceC4351m, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m40051B(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m40052C(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: D */
    private static final int m40053D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m40054E(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: F */
    private static final TextResource m40055F(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0153  */
    /* JADX WARN: Code duplicated, block: B:103:0x015c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0160  */
    /* JADX WARN: Code duplicated, block: B:107:0x016a  */
    /* JADX WARN: Code duplicated, block: B:108:0x016d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0172  */
    /* JADX WARN: Code duplicated, block: B:113:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:119:0x0191  */
    /* JADX WARN: Code duplicated, block: B:123:0x0199  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01af  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01db  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:158:0x0202  */
    /* JADX WARN: Code duplicated, block: B:161:0x020c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0218  */
    /* JADX WARN: Code duplicated, block: B:170:0x023c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x023e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0243  */
    /* JADX WARN: Code duplicated, block: B:175:0x0247  */
    /* JADX WARN: Code duplicated, block: B:177:0x024b  */
    /* JADX WARN: Code duplicated, block: B:178:0x024e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0252  */
    /* JADX WARN: Code duplicated, block: B:181:0x0255  */
    /* JADX WARN: Code duplicated, block: B:184:0x025b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0261  */
    /* JADX WARN: Code duplicated, block: B:187:0x0265  */
    /* JADX WARN: Code duplicated, block: B:188:0x0268  */
    /* JADX WARN: Code duplicated, block: B:190:0x026c  */
    /* JADX WARN: Code duplicated, block: B:191:0x026f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0273  */
    /* JADX WARN: Code duplicated, block: B:194:0x0276  */
    /* JADX WARN: Code duplicated, block: B:197:0x027f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0285  */
    /* JADX WARN: Code duplicated, block: B:203:0x02aa A[LOOP:0: B:201:0x02a4->B:203:0x02aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x02d7 A[LOOP:1: B:205:0x02d1->B:207:0x02d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x02fe A[LOOP:2: B:209:0x02f8->B:211:0x02fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:214:0x031d  */
    /* JADX WARN: Code duplicated, block: B:217:0x0327 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x0329  */
    /* JADX WARN: Code duplicated, block: B:221:0x0335  */
    /* JADX WARN: Code duplicated, block: B:224:0x0341  */
    /* JADX WARN: Code duplicated, block: B:227:0x034f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0366  */
    /* JADX WARN: Code duplicated, block: B:232:0x036c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0371  */
    /* JADX WARN: Code duplicated, block: B:237:0x037d  */
    /* JADX WARN: Code duplicated, block: B:239:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:242:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x010c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0115  */
    /* JADX WARN: Code duplicated, block: B:88:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0133  */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x013e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0148  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    /* JADX INFO: renamed from: G */
    public static final void m40056G(Modifier modifier, AbstractC22403o abstractC22403o, final TextResource title, TextResource textResource, C17731c2 c17731c2, final C14064b values, final long j7, int i13, TextResource textResource2, boolean z4, boolean z13, boolean z14, final C14063a c14063a, String str, final Function1 onViewEvent, final Function3 callBack, Composer composer, final int i14, final int i15, final int i16) {
        Modifier modifier2;
        int i17;
        AbstractC22403o abstractC22403o2;
        TextResource textResource3;
        int i18;
        int i19;
        boolean zM87157i;
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
        int i44;
        int i45;
        boolean z15;
        final C17731c2 c17731c3;
        final int i46;
        final boolean z16;
        final boolean z17;
        final TextResource textResource4;
        final AbstractC22403o abstractC22403o3;
        final Modifier modifier3;
        C28655q c28655q;
        final TextResource textResource5;
        final boolean z18;
        final String str2;
        C28677v1 c28677v1M87180u;
        String strM53370k;
        C17731c2 c17731c4;
        int i47;
        TextResource textResourceM21267a;
        boolean z19;
        boolean z24;
        boolean z25;
        AbstractC22403o abstractC22403o4;
        int i48;
        boolean z26;
        String str3;
        final TextResource textResource6;
        boolean z27;
        Modifier modifier4;
        ArrayList arrayList;
        Iterator<T> it;
        ArrayList arrayList2;
        Iterator<T> it3;
        ArrayList arrayList3;
        Iterator<T> it4;
        final Map mapM74000i0;
        boolean z28;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        final InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        final InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R4;
        String str4;
        int i49;
        int i54;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(callBack, "callBack");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1779052731);
        int i55 = i16 & 1;
        if (i55 != 0) {
            i17 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i17 = i14;
        }
        int i56 = i16 & 2;
        if (i56 != 0) {
            i17 |= 48;
            abstractC22403o2 = abstractC22403o;
        } else {
            abstractC22403o2 = abstractC22403o;
            if ((i14 & 48) == 0) {
                i17 |= c28655q2.m87153g(abstractC22403o2) ? 32 : 16;
            }
        }
        if ((i14 & 384) == 0) {
            i17 |= c28655q2.m87153g(title) ? 256 : 128;
        }
        int i57 = i16 & 8;
        int i58 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i57 == 0) {
            if ((i14 & 3072) == 0) {
                textResource3 = textResource;
                i17 |= c28655q2.m87153g(textResource3) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            if (i18 != 0) {
                i17 |= 24576;
            } else if ((i14 & 24576) == 0) {
                if ((32768 & i14) == 0) {
                    zM87157i = c28655q2.m87153g(c17731c2);
                } else {
                    zM87157i = c28655q2.m87157i(c17731c2);
                }
                if (zM87157i) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i17 |= i24;
            }
            i25 = i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i25 == 0) {
                if (c28655q2.m87157i(values)) {
                    i54 = 131072;
                } else {
                    i54 = 65536;
                }
                i17 |= i54;
            }
            if ((i14 & 1572864) == 0) {
                if (c28655q2.m87151f(j7)) {
                    i49 = 1048576;
                } else {
                    i49 = 524288;
                }
                i17 |= i49;
            }
            i27 = i16 & 128;
            if (i27 != 0) {
                i17 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (c28655q2.m87149e(i13)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i17 |= i28;
            }
            if ((i14 & 100663296) != 0) {
                i17 |= ((i16 & 256) == 0 || !c28655q2.m87153g(textResource2)) ? AndroidSDKConstants.FLAG_MUTABLE : 67108864;
            }
            i29 = i16 & 512;
            if (i29 != 0) {
                if ((i14 & 805306368) == 0) {
                    if (c28655q2.m87155h(z4)) {
                        i34 = 536870912;
                    } else {
                        i34 = 268435456;
                    }
                    i17 |= i34;
                }
                i35 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i35 != 0) {
                    i36 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i36 = i15 | i37;
                } else {
                    i36 = i15;
                }
                i38 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i38 != 0) {
                    if ((i15 & 48) == 0) {
                        i36 |= c28655q2.m87155h(z14) ? 32 : 16;
                    }
                    if ((i15 & 384) != 0) {
                        i36 |= c28655q2.m87157i(c14063a) ? 256 : 128;
                    }
                    i39 = i36;
                    i44 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
                    if (i44 != 0) {
                        i45 = i39;
                        if ((i15 & 3072) == 0) {
                            if (c28655q2.m87153g(str)) {
                                i58 = 2048;
                            }
                            i45 |= i58;
                        }
                        if ((i15 & 24576) == 0) {
                            if (!c28655q2.m87157i(onViewEvent)) {
                                i19 = 8192;
                            }
                            i45 |= i19;
                        }
                        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q2.m87157i(callBack)) {
                                i26 = 131072;
                            }
                            i45 |= i26;
                        }
                        if ((306783379 & i17) == 306783378 || (i45 & 74899) != 74898) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c28655q2.m87135U(i17 & 1, z15)) {
                            c28655q2.m87140Z();
                            strM53370k = null;
                            if ((i14 & 1) != 0 || c28655q2.m87118C()) {
                                if (i55 != 0) {
                                    modifier2 = C2314t.f9131w;
                                }
                                if (i56 != 0) {
                                    abstractC22403o2 = null;
                                }
                                if (i57 != 0) {
                                    textResource3 = null;
                                }
                                if (i18 != 0) {
                                    c17731c4 = null;
                                } else {
                                    c17731c4 = c17731c2;
                                }
                                if (i27 != 0) {
                                    i47 = 1;
                                } else {
                                    i47 = i13;
                                }
                                if ((i16 & 256) != 0) {
                                    textResourceM21267a = AbstractC8693b.m21267a();
                                    i17 &= -234881025;
                                } else {
                                    textResourceM21267a = textResource2;
                                }
                                if (i29 != 0) {
                                    z19 = false;
                                } else {
                                    z19 = z4;
                                }
                                if (i35 != 0) {
                                    z24 = false;
                                } else {
                                    z24 = z13;
                                }
                                if (i38 != 0) {
                                    z25 = false;
                                } else {
                                    z25 = z14;
                                }
                                textResource4 = textResource3;
                                abstractC22403o4 = abstractC22403o2;
                                i48 = i17;
                                z26 = z25;
                                if (i44 != 0) {
                                    str3 = null;
                                } else {
                                    str3 = str;
                                }
                                textResource6 = textResourceM21267a;
                                z27 = z19;
                                modifier4 = modifier2;
                            } else {
                                c28655q2.m87138X();
                                if ((i16 & 256) != 0) {
                                    i17 &= -234881025;
                                }
                                c17731c4 = c17731c2;
                                i47 = i13;
                                textResource6 = textResource2;
                                z27 = z4;
                                z24 = z13;
                                textResource4 = textResource3;
                                abstractC22403o4 = abstractC22403o2;
                                modifier4 = modifier2;
                                i48 = i17;
                                z26 = z14;
                                str3 = str;
                            }
                            c28655q2.m87175r();
                            List<C14079q> listM40027b = values.m40027b();
                            C17731c2 c17731c5 = c17731c4;
                            final Modifier modifier5 = modifier4;
                            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b, 10));
                            it = listM40027b.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                            }
                            List<C14079q> listM40027b2 = values.m40027b();
                            AbstractC22403o abstractC22403o5 = abstractC22403o4;
                            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b2, 10));
                            it3 = listM40027b2.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                            }
                            List<C14079q> listM40027b3 = values.m40027b();
                            arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b3, 10));
                            it4 = listM40027b3.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                            }
                            mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                            z28 = (i45 & 14) == 4;
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (z28 || objM87133R == c28676v0) {
                                objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                            }
                            final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                                c28655q2.m87172p0(objM87133R4);
                            }
                            final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                            if (str3 == null) {
                                if (m40073X(interfaceC28601c1)) {
                                    str4 = "avoid";
                                } else {
                                    str4 = "enforce";
                                }
                                strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                            }
                            final String str5 = strM53370k;
                            abstractC22403o3 = abstractC22403o5;
                            int i59 = i47;
                            c28655q = c28655q2;
                            final boolean z29 = z27;
                            final boolean z34 = z24;
                            c17731c3 = c17731c5;
                            final boolean z35 = z26;
                            final String str6 = str3;
                            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC14078p.m40061L(modifier5, abstractC22403o3, z34, textResource4, c17731c3, title, c14063a, str6, onViewEvent, interfaceC28601c3, callBack, interfaceC28601c1, interfaceC28601c2, z35, textResource6, z29, mapM74000i0, values, str5, interfaceC28601c4, (Composer) obj, iIntValue);
                                }
                            }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                            z16 = z29;
                            z18 = z34;
                            textResource5 = textResource6;
                            z17 = z35;
                            str2 = str6;
                            i46 = i59;
                            modifier3 = modifier5;
                        } else {
                            c28655q2.m87138X();
                            c17731c3 = c17731c2;
                            i46 = i13;
                            z16 = z4;
                            z17 = z14;
                            textResource4 = textResource3;
                            abstractC22403o3 = abstractC22403o2;
                            modifier3 = modifier2;
                            c28655q = c28655q2;
                            textResource5 = textResource2;
                            z18 = z13;
                            str2 = str;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i45 = i39 | 3072;
                    if ((i15 & 24576) == 0) {
                        if (!c28655q2.m87157i(onViewEvent)) {
                            i19 = 8192;
                        }
                        i45 |= i19;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(callBack)) {
                            i26 = 131072;
                        }
                        i45 |= i26;
                    }
                    if ((306783379 & i17) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (c28655q2.m87135U(i17 & 1, z15)) {
                        c28655q2.m87140Z();
                        strM53370k = null;
                        if ((i14 & 1) != 0) {
                            if (i55 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i56 != 0) {
                                abstractC22403o2 = null;
                            }
                            if (i57 != 0) {
                                textResource3 = null;
                            }
                            if (i18 != 0) {
                                c17731c4 = null;
                            } else {
                                c17731c4 = c17731c2;
                            }
                            if (i27 != 0) {
                                i47 = 1;
                            } else {
                                i47 = i13;
                            }
                            if ((i16 & 256) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i17 &= -234881025;
                            } else {
                                textResourceM21267a = textResource2;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z4;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i38 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            textResource4 = textResource3;
                            abstractC22403o4 = abstractC22403o2;
                            i48 = i17;
                            z26 = z25;
                            if (i44 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource6 = textResourceM21267a;
                            z27 = z19;
                            modifier4 = modifier2;
                        } else {
                            if (i55 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i56 != 0) {
                                abstractC22403o2 = null;
                            }
                            if (i57 != 0) {
                                textResource3 = null;
                            }
                            if (i18 != 0) {
                                c17731c4 = null;
                            } else {
                                c17731c4 = c17731c2;
                            }
                            if (i27 != 0) {
                                i47 = 1;
                            } else {
                                i47 = i13;
                            }
                            if ((i16 & 256) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i17 &= -234881025;
                            } else {
                                textResourceM21267a = textResource2;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z4;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i38 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            textResource4 = textResource3;
                            abstractC22403o4 = abstractC22403o2;
                            i48 = i17;
                            z26 = z25;
                            if (i44 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource6 = textResourceM21267a;
                            z27 = z19;
                            modifier4 = modifier2;
                        }
                        c28655q2.m87175r();
                        List<C14079q> listM40027b4 = values.m40027b();
                        C17731c2 c17731c6 = c17731c4;
                        final Modifier modifier6 = modifier4;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b4, 10));
                        it = listM40027b4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                        }
                        List<C14079q> listM40027b5 = values.m40027b();
                        AbstractC22403o abstractC22403o6 = abstractC22403o4;
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b5, 10));
                        it3 = listM40027b5.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                        }
                        List<C14079q> listM40027b6 = values.m40027b();
                        arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b6, 10));
                        it4 = listM40027b6.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                        }
                        mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                        if ((i45 & 14) == 4) {
                        }
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (z28) {
                            objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                        } else {
                            objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                        }
                        final InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                            c28655q2.m87172p0(objM87133R4);
                        }
                        final InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R4;
                        if (str3 == null) {
                            if (m40073X(interfaceC28601c1)) {
                                str4 = "avoid";
                            } else {
                                str4 = "enforce";
                            }
                            strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                        }
                        final String str7 = strM53370k;
                        abstractC22403o3 = abstractC22403o6;
                        int i510 = i47;
                        c28655q = c28655q2;
                        final boolean z210 = z27;
                        final boolean z36 = z24;
                        c17731c3 = c17731c6;
                        final boolean z37 = z26;
                        final String str8 = str3;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC14078p.m40061L(modifier6, abstractC22403o3, z36, textResource4, c17731c3, title, c14063a, str8, onViewEvent, interfaceC28601c5, callBack, interfaceC28601c1, interfaceC28601c2, z37, textResource6, z210, mapM74000i0, values, str7, interfaceC28601c6, (Composer) obj, iIntValue);
                            }
                        }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                        z16 = z210;
                        z18 = z36;
                        textResource5 = textResource6;
                        z17 = z37;
                        str2 = str8;
                        i46 = i510;
                        modifier3 = modifier6;
                    } else {
                        c28655q2.m87138X();
                        c17731c3 = c17731c2;
                        i46 = i13;
                        z16 = z4;
                        z17 = z14;
                        textResource4 = textResource3;
                        abstractC22403o3 = abstractC22403o2;
                        modifier3 = modifier2;
                        c28655q = c28655q2;
                        textResource5 = textResource2;
                        z18 = z13;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i36 |= 48;
                if ((i15 & 384) != 0) {
                    i36 |= c28655q2.m87157i(c14063a) ? 256 : 128;
                }
                i39 = i36;
                i44 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i44 != 0) {
                    i45 = i39;
                    if ((i15 & 3072) == 0) {
                        if (c28655q2.m87153g(str)) {
                            i58 = 2048;
                        }
                        i45 |= i58;
                    }
                    if ((i15 & 24576) == 0) {
                        if (!c28655q2.m87157i(onViewEvent)) {
                            i19 = 8192;
                        }
                        i45 |= i19;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(callBack)) {
                            i26 = 131072;
                        }
                        i45 |= i26;
                    }
                    if ((306783379 & i17) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (c28655q2.m87135U(i17 & 1, z15)) {
                        c28655q2.m87140Z();
                        strM53370k = null;
                        if ((i14 & 1) != 0) {
                            if (i55 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i56 != 0) {
                                abstractC22403o2 = null;
                            }
                            if (i57 != 0) {
                                textResource3 = null;
                            }
                            if (i18 != 0) {
                                c17731c4 = null;
                            } else {
                                c17731c4 = c17731c2;
                            }
                            if (i27 != 0) {
                                i47 = 1;
                            } else {
                                i47 = i13;
                            }
                            if ((i16 & 256) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i17 &= -234881025;
                            } else {
                                textResourceM21267a = textResource2;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z4;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i38 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            textResource4 = textResource3;
                            abstractC22403o4 = abstractC22403o2;
                            i48 = i17;
                            z26 = z25;
                            if (i44 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource6 = textResourceM21267a;
                            z27 = z19;
                            modifier4 = modifier2;
                        } else {
                            if (i55 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i56 != 0) {
                                abstractC22403o2 = null;
                            }
                            if (i57 != 0) {
                                textResource3 = null;
                            }
                            if (i18 != 0) {
                                c17731c4 = null;
                            } else {
                                c17731c4 = c17731c2;
                            }
                            if (i27 != 0) {
                                i47 = 1;
                            } else {
                                i47 = i13;
                            }
                            if ((i16 & 256) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i17 &= -234881025;
                            } else {
                                textResourceM21267a = textResource2;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z4;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i38 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            textResource4 = textResource3;
                            abstractC22403o4 = abstractC22403o2;
                            i48 = i17;
                            z26 = z25;
                            if (i44 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource6 = textResourceM21267a;
                            z27 = z19;
                            modifier4 = modifier2;
                        }
                        c28655q2.m87175r();
                        List<C14079q> listM40027b7 = values.m40027b();
                        C17731c2 c17731c7 = c17731c4;
                        final Modifier modifier7 = modifier4;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b7, 10));
                        it = listM40027b7.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                        }
                        List<C14079q> listM40027b8 = values.m40027b();
                        AbstractC22403o abstractC22403o7 = abstractC22403o4;
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b8, 10));
                        it3 = listM40027b8.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                        }
                        List<C14079q> listM40027b9 = values.m40027b();
                        arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b9, 10));
                        it4 = listM40027b9.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                        }
                        mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                        if ((i45 & 14) == 4) {
                        }
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (z28) {
                            objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                        } else {
                            objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                        }
                        final InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                            c28655q2.m87172p0(objM87133R4);
                        }
                        final InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R4;
                        if (str3 == null) {
                            if (m40073X(interfaceC28601c1)) {
                                str4 = "avoid";
                            } else {
                                str4 = "enforce";
                            }
                            strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                        }
                        final String str9 = strM53370k;
                        abstractC22403o3 = abstractC22403o7;
                        int i511 = i47;
                        c28655q = c28655q2;
                        final boolean z211 = z27;
                        final boolean z38 = z24;
                        c17731c3 = c17731c7;
                        final boolean z39 = z26;
                        final String str10 = str3;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC14078p.m40061L(modifier7, abstractC22403o3, z38, textResource4, c17731c3, title, c14063a, str10, onViewEvent, interfaceC28601c7, callBack, interfaceC28601c1, interfaceC28601c2, z39, textResource6, z211, mapM74000i0, values, str9, interfaceC28601c8, (Composer) obj, iIntValue);
                            }
                        }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                        z16 = z211;
                        z18 = z38;
                        textResource5 = textResource6;
                        z17 = z39;
                        str2 = str10;
                        i46 = i511;
                        modifier3 = modifier7;
                    } else {
                        c28655q2.m87138X();
                        c17731c3 = c17731c2;
                        i46 = i13;
                        z16 = z4;
                        z17 = z14;
                        textResource4 = textResource3;
                        abstractC22403o3 = abstractC22403o2;
                        modifier3 = modifier2;
                        c28655q = c28655q2;
                        textResource5 = textResource2;
                        z18 = z13;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i45 = i39 | 3072;
                if ((i15 & 24576) == 0) {
                    if (!c28655q2.m87157i(onViewEvent)) {
                        i19 = 8192;
                    }
                    i45 |= i19;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(callBack)) {
                        i26 = 131072;
                    }
                    i45 |= i26;
                }
                if ((306783379 & i17) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z15)) {
                    c28655q2.m87140Z();
                    strM53370k = null;
                    if ((i14 & 1) != 0) {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    } else {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    }
                    c28655q2.m87175r();
                    List<C14079q> listM40027b10 = values.m40027b();
                    C17731c2 c17731c8 = c17731c4;
                    final Modifier modifier8 = modifier4;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b10, 10));
                    it = listM40027b10.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                    }
                    List<C14079q> listM40027b11 = values.m40027b();
                    AbstractC22403o abstractC22403o8 = abstractC22403o4;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b11, 10));
                    it3 = listM40027b11.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                    }
                    List<C14079q> listM40027b12 = values.m40027b();
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b12, 10));
                    it4 = listM40027b12.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                    }
                    mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                    if ((i45 & 14) == 4) {
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z28) {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    } else {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    final InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R4;
                    if (str3 == null) {
                        if (m40073X(interfaceC28601c1)) {
                            str4 = "avoid";
                        } else {
                            str4 = "enforce";
                        }
                        strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                    }
                    final String str11 = strM53370k;
                    abstractC22403o3 = abstractC22403o8;
                    int i512 = i47;
                    c28655q = c28655q2;
                    final boolean z212 = z27;
                    final boolean z310 = z24;
                    c17731c3 = c17731c8;
                    final boolean z311 = z26;
                    final String str12 = str3;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40061L(modifier8, abstractC22403o3, z310, textResource4, c17731c3, title, c14063a, str12, onViewEvent, interfaceC28601c9, callBack, interfaceC28601c1, interfaceC28601c2, z311, textResource6, z212, mapM74000i0, values, str11, interfaceC28601c10, (Composer) obj, iIntValue);
                        }
                    }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                    z16 = z212;
                    z18 = z310;
                    textResource5 = textResource6;
                    z17 = z311;
                    str2 = str12;
                    i46 = i512;
                    modifier3 = modifier8;
                } else {
                    c28655q2.m87138X();
                    c17731c3 = c17731c2;
                    i46 = i13;
                    z16 = z4;
                    z17 = z14;
                    textResource4 = textResource3;
                    abstractC22403o3 = abstractC22403o2;
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    textResource5 = textResource2;
                    z18 = z13;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i17 |= 805306368;
            i35 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i15 | i37;
            } else {
                i36 = i15;
            }
            i38 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i38 != 0) {
                if ((i15 & 48) == 0) {
                    i36 |= c28655q2.m87155h(z14) ? 32 : 16;
                }
                if ((i15 & 384) != 0) {
                    i36 |= c28655q2.m87157i(c14063a) ? 256 : 128;
                }
                i39 = i36;
                i44 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i44 != 0) {
                    i45 = i39;
                    if ((i15 & 3072) == 0) {
                        if (c28655q2.m87153g(str)) {
                            i58 = 2048;
                        }
                        i45 |= i58;
                    }
                    if ((i15 & 24576) == 0) {
                        if (!c28655q2.m87157i(onViewEvent)) {
                            i19 = 8192;
                        }
                        i45 |= i19;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(callBack)) {
                            i26 = 131072;
                        }
                        i45 |= i26;
                    }
                    if ((306783379 & i17) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (c28655q2.m87135U(i17 & 1, z15)) {
                        c28655q2.m87140Z();
                        strM53370k = null;
                        if ((i14 & 1) != 0) {
                            if (i55 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i56 != 0) {
                                abstractC22403o2 = null;
                            }
                            if (i57 != 0) {
                                textResource3 = null;
                            }
                            if (i18 != 0) {
                                c17731c4 = null;
                            } else {
                                c17731c4 = c17731c2;
                            }
                            if (i27 != 0) {
                                i47 = 1;
                            } else {
                                i47 = i13;
                            }
                            if ((i16 & 256) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i17 &= -234881025;
                            } else {
                                textResourceM21267a = textResource2;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z4;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i38 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            textResource4 = textResource3;
                            abstractC22403o4 = abstractC22403o2;
                            i48 = i17;
                            z26 = z25;
                            if (i44 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource6 = textResourceM21267a;
                            z27 = z19;
                            modifier4 = modifier2;
                        } else {
                            if (i55 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i56 != 0) {
                                abstractC22403o2 = null;
                            }
                            if (i57 != 0) {
                                textResource3 = null;
                            }
                            if (i18 != 0) {
                                c17731c4 = null;
                            } else {
                                c17731c4 = c17731c2;
                            }
                            if (i27 != 0) {
                                i47 = 1;
                            } else {
                                i47 = i13;
                            }
                            if ((i16 & 256) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i17 &= -234881025;
                            } else {
                                textResourceM21267a = textResource2;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z4;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i38 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            textResource4 = textResource3;
                            abstractC22403o4 = abstractC22403o2;
                            i48 = i17;
                            z26 = z25;
                            if (i44 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource6 = textResourceM21267a;
                            z27 = z19;
                            modifier4 = modifier2;
                        }
                        c28655q2.m87175r();
                        List<C14079q> listM40027b13 = values.m40027b();
                        C17731c2 c17731c9 = c17731c4;
                        final Modifier modifier9 = modifier4;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b13, 10));
                        it = listM40027b13.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                        }
                        List<C14079q> listM40027b14 = values.m40027b();
                        AbstractC22403o abstractC22403o9 = abstractC22403o4;
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b14, 10));
                        it3 = listM40027b14.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                        }
                        List<C14079q> listM40027b15 = values.m40027b();
                        arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b15, 10));
                        it4 = listM40027b15.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                        }
                        mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                        if ((i45 & 14) == 4) {
                        }
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (z28) {
                            objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                        } else {
                            objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                        }
                        final InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                            c28655q2.m87172p0(objM87133R4);
                        }
                        final InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R4;
                        if (str3 == null) {
                            if (m40073X(interfaceC28601c1)) {
                                str4 = "avoid";
                            } else {
                                str4 = "enforce";
                            }
                            strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                        }
                        final String str13 = strM53370k;
                        abstractC22403o3 = abstractC22403o9;
                        int i513 = i47;
                        c28655q = c28655q2;
                        final boolean z213 = z27;
                        final boolean z312 = z24;
                        c17731c3 = c17731c9;
                        final boolean z313 = z26;
                        final String str14 = str3;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC14078p.m40061L(modifier9, abstractC22403o3, z312, textResource4, c17731c3, title, c14063a, str14, onViewEvent, interfaceC28601c11, callBack, interfaceC28601c1, interfaceC28601c2, z313, textResource6, z213, mapM74000i0, values, str13, interfaceC28601c12, (Composer) obj, iIntValue);
                            }
                        }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                        z16 = z213;
                        z18 = z312;
                        textResource5 = textResource6;
                        z17 = z313;
                        str2 = str14;
                        i46 = i513;
                        modifier3 = modifier9;
                    } else {
                        c28655q2.m87138X();
                        c17731c3 = c17731c2;
                        i46 = i13;
                        z16 = z4;
                        z17 = z14;
                        textResource4 = textResource3;
                        abstractC22403o3 = abstractC22403o2;
                        modifier3 = modifier2;
                        c28655q = c28655q2;
                        textResource5 = textResource2;
                        z18 = z13;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i45 = i39 | 3072;
                if ((i15 & 24576) == 0) {
                    if (!c28655q2.m87157i(onViewEvent)) {
                        i19 = 8192;
                    }
                    i45 |= i19;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(callBack)) {
                        i26 = 131072;
                    }
                    i45 |= i26;
                }
                if ((306783379 & i17) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z15)) {
                    c28655q2.m87140Z();
                    strM53370k = null;
                    if ((i14 & 1) != 0) {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    } else {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    }
                    c28655q2.m87175r();
                    List<C14079q> listM40027b16 = values.m40027b();
                    C17731c2 c17731c10 = c17731c4;
                    final Modifier modifier10 = modifier4;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b16, 10));
                    it = listM40027b16.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                    }
                    List<C14079q> listM40027b17 = values.m40027b();
                    AbstractC22403o abstractC22403o10 = abstractC22403o4;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b17, 10));
                    it3 = listM40027b17.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                    }
                    List<C14079q> listM40027b18 = values.m40027b();
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b18, 10));
                    it4 = listM40027b18.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                    }
                    mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                    if ((i45 & 14) == 4) {
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z28) {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    } else {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    final InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) objM87133R4;
                    if (str3 == null) {
                        if (m40073X(interfaceC28601c1)) {
                            str4 = "avoid";
                        } else {
                            str4 = "enforce";
                        }
                        strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                    }
                    final String str15 = strM53370k;
                    abstractC22403o3 = abstractC22403o10;
                    int i514 = i47;
                    c28655q = c28655q2;
                    final boolean z214 = z27;
                    final boolean z314 = z24;
                    c17731c3 = c17731c10;
                    final boolean z315 = z26;
                    final String str16 = str3;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40061L(modifier10, abstractC22403o3, z314, textResource4, c17731c3, title, c14063a, str16, onViewEvent, interfaceC28601c13, callBack, interfaceC28601c1, interfaceC28601c2, z315, textResource6, z214, mapM74000i0, values, str15, interfaceC28601c14, (Composer) obj, iIntValue);
                        }
                    }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                    z16 = z214;
                    z18 = z314;
                    textResource5 = textResource6;
                    z17 = z315;
                    str2 = str16;
                    i46 = i514;
                    modifier3 = modifier10;
                } else {
                    c28655q2.m87138X();
                    c17731c3 = c17731c2;
                    i46 = i13;
                    z16 = z4;
                    z17 = z14;
                    textResource4 = textResource3;
                    abstractC22403o3 = abstractC22403o2;
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    textResource5 = textResource2;
                    z18 = z13;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i36 |= 48;
            if ((i15 & 384) != 0) {
                i36 |= c28655q2.m87157i(c14063a) ? 256 : 128;
            }
            i39 = i36;
            i44 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i44 != 0) {
                i45 = i39;
                if ((i15 & 3072) == 0) {
                    if (c28655q2.m87153g(str)) {
                        i58 = 2048;
                    }
                    i45 |= i58;
                }
                if ((i15 & 24576) == 0) {
                    if (!c28655q2.m87157i(onViewEvent)) {
                        i19 = 8192;
                    }
                    i45 |= i19;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(callBack)) {
                        i26 = 131072;
                    }
                    i45 |= i26;
                }
                if ((306783379 & i17) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z15)) {
                    c28655q2.m87140Z();
                    strM53370k = null;
                    if ((i14 & 1) != 0) {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    } else {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    }
                    c28655q2.m87175r();
                    List<C14079q> listM40027b19 = values.m40027b();
                    C17731c2 c17731c11 = c17731c4;
                    final Modifier modifier11 = modifier4;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b19, 10));
                    it = listM40027b19.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                    }
                    List<C14079q> listM40027b110 = values.m40027b();
                    AbstractC22403o abstractC22403o11 = abstractC22403o4;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b110, 10));
                    it3 = listM40027b110.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                    }
                    List<C14079q> listM40027b111 = values.m40027b();
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b111, 10));
                    it4 = listM40027b111.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                    }
                    mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                    if ((i45 & 14) == 4) {
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z28) {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    } else {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    final InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) objM87133R4;
                    if (str3 == null) {
                        if (m40073X(interfaceC28601c1)) {
                            str4 = "avoid";
                        } else {
                            str4 = "enforce";
                        }
                        strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                    }
                    final String str17 = strM53370k;
                    abstractC22403o3 = abstractC22403o11;
                    int i515 = i47;
                    c28655q = c28655q2;
                    final boolean z215 = z27;
                    final boolean z316 = z24;
                    c17731c3 = c17731c11;
                    final boolean z317 = z26;
                    final String str18 = str3;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40061L(modifier11, abstractC22403o3, z316, textResource4, c17731c3, title, c14063a, str18, onViewEvent, interfaceC28601c15, callBack, interfaceC28601c1, interfaceC28601c2, z317, textResource6, z215, mapM74000i0, values, str17, interfaceC28601c16, (Composer) obj, iIntValue);
                        }
                    }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                    z16 = z215;
                    z18 = z316;
                    textResource5 = textResource6;
                    z17 = z317;
                    str2 = str18;
                    i46 = i515;
                    modifier3 = modifier11;
                } else {
                    c28655q2.m87138X();
                    c17731c3 = c17731c2;
                    i46 = i13;
                    z16 = z4;
                    z17 = z14;
                    textResource4 = textResource3;
                    abstractC22403o3 = abstractC22403o2;
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    textResource5 = textResource2;
                    z18 = z13;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i45 = i39 | 3072;
            if ((i15 & 24576) == 0) {
                if (!c28655q2.m87157i(onViewEvent)) {
                    i19 = 8192;
                }
                i45 |= i19;
            }
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(callBack)) {
                    i26 = 131072;
                }
                i45 |= i26;
            }
            if ((306783379 & i17) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q2.m87135U(i17 & 1, z15)) {
                c28655q2.m87140Z();
                strM53370k = null;
                if ((i14 & 1) != 0) {
                    if (i55 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i56 != 0) {
                        abstractC22403o2 = null;
                    }
                    if (i57 != 0) {
                        textResource3 = null;
                    }
                    if (i18 != 0) {
                        c17731c4 = null;
                    } else {
                        c17731c4 = c17731c2;
                    }
                    if (i27 != 0) {
                        i47 = 1;
                    } else {
                        i47 = i13;
                    }
                    if ((i16 & 256) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i17 &= -234881025;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i38 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    textResource4 = textResource3;
                    abstractC22403o4 = abstractC22403o2;
                    i48 = i17;
                    z26 = z25;
                    if (i44 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource6 = textResourceM21267a;
                    z27 = z19;
                    modifier4 = modifier2;
                } else {
                    if (i55 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i56 != 0) {
                        abstractC22403o2 = null;
                    }
                    if (i57 != 0) {
                        textResource3 = null;
                    }
                    if (i18 != 0) {
                        c17731c4 = null;
                    } else {
                        c17731c4 = c17731c2;
                    }
                    if (i27 != 0) {
                        i47 = 1;
                    } else {
                        i47 = i13;
                    }
                    if ((i16 & 256) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i17 &= -234881025;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i38 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    textResource4 = textResource3;
                    abstractC22403o4 = abstractC22403o2;
                    i48 = i17;
                    z26 = z25;
                    if (i44 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource6 = textResourceM21267a;
                    z27 = z19;
                    modifier4 = modifier2;
                }
                c28655q2.m87175r();
                List<C14079q> listM40027b112 = values.m40027b();
                C17731c2 c17731c12 = c17731c4;
                final Modifier modifier12 = modifier4;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b112, 10));
                it = listM40027b112.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                }
                List<C14079q> listM40027b113 = values.m40027b();
                AbstractC22403o abstractC22403o12 = abstractC22403o4;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b113, 10));
                it3 = listM40027b113.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                }
                List<C14079q> listM40027b114 = values.m40027b();
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b114, 10));
                it4 = listM40027b114.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                }
                mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                if ((i45 & 14) == 4) {
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z28) {
                    objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                    c28655q2.m87172p0(objM87133R4);
                }
                final InterfaceC28601c1 interfaceC28601c18 = (InterfaceC28601c1) objM87133R4;
                if (str3 == null) {
                    if (m40073X(interfaceC28601c1)) {
                        str4 = "avoid";
                    } else {
                        str4 = "enforce";
                    }
                    strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                }
                final String str19 = strM53370k;
                abstractC22403o3 = abstractC22403o12;
                int i516 = i47;
                c28655q = c28655q2;
                final boolean z216 = z27;
                final boolean z318 = z24;
                c17731c3 = c17731c12;
                final boolean z319 = z26;
                final String str110 = str3;
                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC14078p.m40061L(modifier12, abstractC22403o3, z318, textResource4, c17731c3, title, c14063a, str110, onViewEvent, interfaceC28601c17, callBack, interfaceC28601c1, interfaceC28601c2, z319, textResource6, z216, mapM74000i0, values, str19, interfaceC28601c18, (Composer) obj, iIntValue);
                    }
                }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                z16 = z216;
                z18 = z318;
                textResource5 = textResource6;
                z17 = z319;
                str2 = str110;
                i46 = i516;
                modifier3 = modifier12;
            } else {
                c28655q2.m87138X();
                c17731c3 = c17731c2;
                i46 = i13;
                z16 = z4;
                z17 = z14;
                textResource4 = textResource3;
                abstractC22403o3 = abstractC22403o2;
                modifier3 = modifier2;
                c28655q = c28655q2;
                textResource5 = textResource2;
                z18 = z13;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 3072;
        textResource3 = textResource;
        i18 = i16 & 16;
        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
        if (i18 != 0) {
            i17 |= 24576;
        } else if ((i14 & 24576) == 0) {
            if ((32768 & i14) == 0) {
                zM87157i = c28655q2.m87153g(c17731c2);
            } else {
                zM87157i = c28655q2.m87157i(c17731c2);
            }
            if (zM87157i) {
                i24 = 16384;
            } else {
                i24 = 8192;
            }
            i17 |= i24;
        }
        i25 = i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i25 == 0) {
            if (c28655q2.m87157i(values)) {
                i54 = 131072;
            } else {
                i54 = 65536;
            }
            i17 |= i54;
        }
        if ((i14 & 1572864) == 0) {
            if (c28655q2.m87151f(j7)) {
                i49 = 1048576;
            } else {
                i49 = 524288;
            }
            i17 |= i49;
        }
        i27 = i16 & 128;
        if (i27 != 0) {
            i17 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (c28655q2.m87149e(i13)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i17 |= i28;
        }
        if ((i14 & 100663296) != 0) {
            i17 |= ((i16 & 256) == 0 || !c28655q2.m87153g(textResource2)) ? AndroidSDKConstants.FLAG_MUTABLE : 67108864;
        }
        i29 = i16 & 512;
        if (i29 != 0) {
            if ((i14 & 805306368) == 0) {
                if (c28655q2.m87155h(z4)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i17 |= i34;
            }
            i35 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i35 != 0) {
                i36 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i36 = i15 | i37;
            } else {
                i36 = i15;
            }
            i38 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i38 != 0) {
                if ((i15 & 48) == 0) {
                    i36 |= c28655q2.m87155h(z14) ? 32 : 16;
                }
                if ((i15 & 384) != 0) {
                    i36 |= c28655q2.m87157i(c14063a) ? 256 : 128;
                }
                i39 = i36;
                i44 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i44 != 0) {
                    i45 = i39;
                    if ((i15 & 3072) == 0) {
                        if (c28655q2.m87153g(str)) {
                            i58 = 2048;
                        }
                        i45 |= i58;
                    }
                    if ((i15 & 24576) == 0) {
                        if (!c28655q2.m87157i(onViewEvent)) {
                            i19 = 8192;
                        }
                        i45 |= i19;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(callBack)) {
                            i26 = 131072;
                        }
                        i45 |= i26;
                    }
                    if ((306783379 & i17) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (c28655q2.m87135U(i17 & 1, z15)) {
                        c28655q2.m87140Z();
                        strM53370k = null;
                        if ((i14 & 1) != 0) {
                            if (i55 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i56 != 0) {
                                abstractC22403o2 = null;
                            }
                            if (i57 != 0) {
                                textResource3 = null;
                            }
                            if (i18 != 0) {
                                c17731c4 = null;
                            } else {
                                c17731c4 = c17731c2;
                            }
                            if (i27 != 0) {
                                i47 = 1;
                            } else {
                                i47 = i13;
                            }
                            if ((i16 & 256) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i17 &= -234881025;
                            } else {
                                textResourceM21267a = textResource2;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z4;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i38 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            textResource4 = textResource3;
                            abstractC22403o4 = abstractC22403o2;
                            i48 = i17;
                            z26 = z25;
                            if (i44 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource6 = textResourceM21267a;
                            z27 = z19;
                            modifier4 = modifier2;
                        } else {
                            if (i55 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i56 != 0) {
                                abstractC22403o2 = null;
                            }
                            if (i57 != 0) {
                                textResource3 = null;
                            }
                            if (i18 != 0) {
                                c17731c4 = null;
                            } else {
                                c17731c4 = c17731c2;
                            }
                            if (i27 != 0) {
                                i47 = 1;
                            } else {
                                i47 = i13;
                            }
                            if ((i16 & 256) != 0) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                                i17 &= -234881025;
                            } else {
                                textResourceM21267a = textResource2;
                            }
                            if (i29 != 0) {
                                z19 = false;
                            } else {
                                z19 = z4;
                            }
                            if (i35 != 0) {
                                z24 = false;
                            } else {
                                z24 = z13;
                            }
                            if (i38 != 0) {
                                z25 = false;
                            } else {
                                z25 = z14;
                            }
                            textResource4 = textResource3;
                            abstractC22403o4 = abstractC22403o2;
                            i48 = i17;
                            z26 = z25;
                            if (i44 != 0) {
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            textResource6 = textResourceM21267a;
                            z27 = z19;
                            modifier4 = modifier2;
                        }
                        c28655q2.m87175r();
                        List<C14079q> listM40027b115 = values.m40027b();
                        C17731c2 c17731c13 = c17731c4;
                        final Modifier modifier13 = modifier4;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b115, 10));
                        it = listM40027b115.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                        }
                        List<C14079q> listM40027b116 = values.m40027b();
                        AbstractC22403o abstractC22403o13 = abstractC22403o4;
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b116, 10));
                        it3 = listM40027b116.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                        }
                        List<C14079q> listM40027b117 = values.m40027b();
                        arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b117, 10));
                        it4 = listM40027b117.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                        }
                        mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                        if ((i45 & 14) == 4) {
                        }
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (z28) {
                            objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                        } else {
                            objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                        }
                        final InterfaceC28601c1 interfaceC28601c19 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                            c28655q2.m87172p0(objM87133R4);
                        }
                        final InterfaceC28601c1 interfaceC28601c110 = (InterfaceC28601c1) objM87133R4;
                        if (str3 == null) {
                            if (m40073X(interfaceC28601c1)) {
                                str4 = "avoid";
                            } else {
                                str4 = "enforce";
                            }
                            strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                        }
                        final String str111 = strM53370k;
                        abstractC22403o3 = abstractC22403o13;
                        int i517 = i47;
                        c28655q = c28655q2;
                        final boolean z217 = z27;
                        final boolean z3110 = z24;
                        c17731c3 = c17731c13;
                        final boolean z3111 = z26;
                        final String str112 = str3;
                        AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC14078p.m40061L(modifier13, abstractC22403o3, z3110, textResource4, c17731c3, title, c14063a, str112, onViewEvent, interfaceC28601c19, callBack, interfaceC28601c1, interfaceC28601c2, z3111, textResource6, z217, mapM74000i0, values, str111, interfaceC28601c110, (Composer) obj, iIntValue);
                            }
                        }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                        z16 = z217;
                        z18 = z3110;
                        textResource5 = textResource6;
                        z17 = z3111;
                        str2 = str112;
                        i46 = i517;
                        modifier3 = modifier13;
                    } else {
                        c28655q2.m87138X();
                        c17731c3 = c17731c2;
                        i46 = i13;
                        z16 = z4;
                        z17 = z14;
                        textResource4 = textResource3;
                        abstractC22403o3 = abstractC22403o2;
                        modifier3 = modifier2;
                        c28655q = c28655q2;
                        textResource5 = textResource2;
                        z18 = z13;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i45 = i39 | 3072;
                if ((i15 & 24576) == 0) {
                    if (!c28655q2.m87157i(onViewEvent)) {
                        i19 = 8192;
                    }
                    i45 |= i19;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(callBack)) {
                        i26 = 131072;
                    }
                    i45 |= i26;
                }
                if ((306783379 & i17) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z15)) {
                    c28655q2.m87140Z();
                    strM53370k = null;
                    if ((i14 & 1) != 0) {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    } else {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    }
                    c28655q2.m87175r();
                    List<C14079q> listM40027b118 = values.m40027b();
                    C17731c2 c17731c14 = c17731c4;
                    final Modifier modifier14 = modifier4;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b118, 10));
                    it = listM40027b118.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                    }
                    List<C14079q> listM40027b119 = values.m40027b();
                    AbstractC22403o abstractC22403o14 = abstractC22403o4;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b119, 10));
                    it3 = listM40027b119.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                    }
                    List<C14079q> listM40027b1110 = values.m40027b();
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b1110, 10));
                    it4 = listM40027b1110.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                    }
                    mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                    if ((i45 & 14) == 4) {
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z28) {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    } else {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c111 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    final InterfaceC28601c1 interfaceC28601c112 = (InterfaceC28601c1) objM87133R4;
                    if (str3 == null) {
                        if (m40073X(interfaceC28601c1)) {
                            str4 = "avoid";
                        } else {
                            str4 = "enforce";
                        }
                        strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                    }
                    final String str113 = strM53370k;
                    abstractC22403o3 = abstractC22403o14;
                    int i518 = i47;
                    c28655q = c28655q2;
                    final boolean z218 = z27;
                    final boolean z3112 = z24;
                    c17731c3 = c17731c14;
                    final boolean z3113 = z26;
                    final String str114 = str3;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40061L(modifier14, abstractC22403o3, z3112, textResource4, c17731c3, title, c14063a, str114, onViewEvent, interfaceC28601c111, callBack, interfaceC28601c1, interfaceC28601c2, z3113, textResource6, z218, mapM74000i0, values, str113, interfaceC28601c112, (Composer) obj, iIntValue);
                        }
                    }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                    z16 = z218;
                    z18 = z3112;
                    textResource5 = textResource6;
                    z17 = z3113;
                    str2 = str114;
                    i46 = i518;
                    modifier3 = modifier14;
                } else {
                    c28655q2.m87138X();
                    c17731c3 = c17731c2;
                    i46 = i13;
                    z16 = z4;
                    z17 = z14;
                    textResource4 = textResource3;
                    abstractC22403o3 = abstractC22403o2;
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    textResource5 = textResource2;
                    z18 = z13;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i36 |= 48;
            if ((i15 & 384) != 0) {
                i36 |= c28655q2.m87157i(c14063a) ? 256 : 128;
            }
            i39 = i36;
            i44 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i44 != 0) {
                i45 = i39;
                if ((i15 & 3072) == 0) {
                    if (c28655q2.m87153g(str)) {
                        i58 = 2048;
                    }
                    i45 |= i58;
                }
                if ((i15 & 24576) == 0) {
                    if (!c28655q2.m87157i(onViewEvent)) {
                        i19 = 8192;
                    }
                    i45 |= i19;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(callBack)) {
                        i26 = 131072;
                    }
                    i45 |= i26;
                }
                if ((306783379 & i17) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z15)) {
                    c28655q2.m87140Z();
                    strM53370k = null;
                    if ((i14 & 1) != 0) {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    } else {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    }
                    c28655q2.m87175r();
                    List<C14079q> listM40027b1111 = values.m40027b();
                    C17731c2 c17731c15 = c17731c4;
                    final Modifier modifier15 = modifier4;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b1111, 10));
                    it = listM40027b1111.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                    }
                    List<C14079q> listM40027b1112 = values.m40027b();
                    AbstractC22403o abstractC22403o15 = abstractC22403o4;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b1112, 10));
                    it3 = listM40027b1112.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                    }
                    List<C14079q> listM40027b1113 = values.m40027b();
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b1113, 10));
                    it4 = listM40027b1113.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                    }
                    mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                    if ((i45 & 14) == 4) {
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z28) {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    } else {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c113 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    final InterfaceC28601c1 interfaceC28601c114 = (InterfaceC28601c1) objM87133R4;
                    if (str3 == null) {
                        if (m40073X(interfaceC28601c1)) {
                            str4 = "avoid";
                        } else {
                            str4 = "enforce";
                        }
                        strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                    }
                    final String str115 = strM53370k;
                    abstractC22403o3 = abstractC22403o15;
                    int i519 = i47;
                    c28655q = c28655q2;
                    final boolean z219 = z27;
                    final boolean z3114 = z24;
                    c17731c3 = c17731c15;
                    final boolean z3115 = z26;
                    final String str116 = str3;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40061L(modifier15, abstractC22403o3, z3114, textResource4, c17731c3, title, c14063a, str116, onViewEvent, interfaceC28601c113, callBack, interfaceC28601c1, interfaceC28601c2, z3115, textResource6, z219, mapM74000i0, values, str115, interfaceC28601c114, (Composer) obj, iIntValue);
                        }
                    }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                    z16 = z219;
                    z18 = z3114;
                    textResource5 = textResource6;
                    z17 = z3115;
                    str2 = str116;
                    i46 = i519;
                    modifier3 = modifier15;
                } else {
                    c28655q2.m87138X();
                    c17731c3 = c17731c2;
                    i46 = i13;
                    z16 = z4;
                    z17 = z14;
                    textResource4 = textResource3;
                    abstractC22403o3 = abstractC22403o2;
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    textResource5 = textResource2;
                    z18 = z13;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i45 = i39 | 3072;
            if ((i15 & 24576) == 0) {
                if (!c28655q2.m87157i(onViewEvent)) {
                    i19 = 8192;
                }
                i45 |= i19;
            }
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(callBack)) {
                    i26 = 131072;
                }
                i45 |= i26;
            }
            if ((306783379 & i17) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q2.m87135U(i17 & 1, z15)) {
                c28655q2.m87140Z();
                strM53370k = null;
                if ((i14 & 1) != 0) {
                    if (i55 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i56 != 0) {
                        abstractC22403o2 = null;
                    }
                    if (i57 != 0) {
                        textResource3 = null;
                    }
                    if (i18 != 0) {
                        c17731c4 = null;
                    } else {
                        c17731c4 = c17731c2;
                    }
                    if (i27 != 0) {
                        i47 = 1;
                    } else {
                        i47 = i13;
                    }
                    if ((i16 & 256) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i17 &= -234881025;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i38 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    textResource4 = textResource3;
                    abstractC22403o4 = abstractC22403o2;
                    i48 = i17;
                    z26 = z25;
                    if (i44 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource6 = textResourceM21267a;
                    z27 = z19;
                    modifier4 = modifier2;
                } else {
                    if (i55 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i56 != 0) {
                        abstractC22403o2 = null;
                    }
                    if (i57 != 0) {
                        textResource3 = null;
                    }
                    if (i18 != 0) {
                        c17731c4 = null;
                    } else {
                        c17731c4 = c17731c2;
                    }
                    if (i27 != 0) {
                        i47 = 1;
                    } else {
                        i47 = i13;
                    }
                    if ((i16 & 256) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i17 &= -234881025;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i38 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    textResource4 = textResource3;
                    abstractC22403o4 = abstractC22403o2;
                    i48 = i17;
                    z26 = z25;
                    if (i44 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource6 = textResourceM21267a;
                    z27 = z19;
                    modifier4 = modifier2;
                }
                c28655q2.m87175r();
                List<C14079q> listM40027b1114 = values.m40027b();
                C17731c2 c17731c16 = c17731c4;
                final Modifier modifier16 = modifier4;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b1114, 10));
                it = listM40027b1114.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                }
                List<C14079q> listM40027b1115 = values.m40027b();
                AbstractC22403o abstractC22403o16 = abstractC22403o4;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b1115, 10));
                it3 = listM40027b1115.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                }
                List<C14079q> listM40027b1116 = values.m40027b();
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b1116, 10));
                it4 = listM40027b1116.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                }
                mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                if ((i45 & 14) == 4) {
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z28) {
                    objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c115 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                    c28655q2.m87172p0(objM87133R4);
                }
                final InterfaceC28601c1 interfaceC28601c116 = (InterfaceC28601c1) objM87133R4;
                if (str3 == null) {
                    if (m40073X(interfaceC28601c1)) {
                        str4 = "avoid";
                    } else {
                        str4 = "enforce";
                    }
                    strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                }
                final String str117 = strM53370k;
                abstractC22403o3 = abstractC22403o16;
                int i5110 = i47;
                c28655q = c28655q2;
                final boolean z2110 = z27;
                final boolean z3116 = z24;
                c17731c3 = c17731c16;
                final boolean z3117 = z26;
                final String str118 = str3;
                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC14078p.m40061L(modifier16, abstractC22403o3, z3116, textResource4, c17731c3, title, c14063a, str118, onViewEvent, interfaceC28601c115, callBack, interfaceC28601c1, interfaceC28601c2, z3117, textResource6, z2110, mapM74000i0, values, str117, interfaceC28601c116, (Composer) obj, iIntValue);
                    }
                }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                z16 = z2110;
                z18 = z3116;
                textResource5 = textResource6;
                z17 = z3117;
                str2 = str118;
                i46 = i5110;
                modifier3 = modifier16;
            } else {
                c28655q2.m87138X();
                c17731c3 = c17731c2;
                i46 = i13;
                z16 = z4;
                z17 = z14;
                textResource4 = textResource3;
                abstractC22403o3 = abstractC22403o2;
                modifier3 = modifier2;
                c28655q = c28655q2;
                textResource5 = textResource2;
                z18 = z13;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 805306368;
        i35 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i35 != 0) {
            i36 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (c28655q2.m87155h(z13)) {
                i37 = 4;
            } else {
                i37 = 2;
            }
            i36 = i15 | i37;
        } else {
            i36 = i15;
        }
        i38 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i38 != 0) {
            if ((i15 & 48) == 0) {
                i36 |= c28655q2.m87155h(z14) ? 32 : 16;
            }
            if ((i15 & 384) != 0) {
                i36 |= c28655q2.m87157i(c14063a) ? 256 : 128;
            }
            i39 = i36;
            i44 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i44 != 0) {
                i45 = i39;
                if ((i15 & 3072) == 0) {
                    if (c28655q2.m87153g(str)) {
                        i58 = 2048;
                    }
                    i45 |= i58;
                }
                if ((i15 & 24576) == 0) {
                    if (!c28655q2.m87157i(onViewEvent)) {
                        i19 = 8192;
                    }
                    i45 |= i19;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(callBack)) {
                        i26 = 131072;
                    }
                    i45 |= i26;
                }
                if ((306783379 & i17) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (c28655q2.m87135U(i17 & 1, z15)) {
                    c28655q2.m87140Z();
                    strM53370k = null;
                    if ((i14 & 1) != 0) {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    } else {
                        if (i55 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i56 != 0) {
                            abstractC22403o2 = null;
                        }
                        if (i57 != 0) {
                            textResource3 = null;
                        }
                        if (i18 != 0) {
                            c17731c4 = null;
                        } else {
                            c17731c4 = c17731c2;
                        }
                        if (i27 != 0) {
                            i47 = 1;
                        } else {
                            i47 = i13;
                        }
                        if ((i16 & 256) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i17 &= -234881025;
                        } else {
                            textResourceM21267a = textResource2;
                        }
                        if (i29 != 0) {
                            z19 = false;
                        } else {
                            z19 = z4;
                        }
                        if (i35 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if (i38 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        textResource4 = textResource3;
                        abstractC22403o4 = abstractC22403o2;
                        i48 = i17;
                        z26 = z25;
                        if (i44 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        textResource6 = textResourceM21267a;
                        z27 = z19;
                        modifier4 = modifier2;
                    }
                    c28655q2.m87175r();
                    List<C14079q> listM40027b1117 = values.m40027b();
                    C17731c2 c17731c17 = c17731c4;
                    final Modifier modifier17 = modifier4;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b1117, 10));
                    it = listM40027b1117.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                    }
                    List<C14079q> listM40027b1118 = values.m40027b();
                    AbstractC22403o abstractC22403o17 = abstractC22403o4;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b1118, 10));
                    it3 = listM40027b1118.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                    }
                    List<C14079q> listM40027b1119 = values.m40027b();
                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b1119, 10));
                    it4 = listM40027b1119.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                    }
                    mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                    if ((i45 & 14) == 4) {
                    }
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z28) {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    } else {
                        objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                    }
                    final InterfaceC28601c1 interfaceC28601c117 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                        c28655q2.m87172p0(objM87133R4);
                    }
                    final InterfaceC28601c1 interfaceC28601c118 = (InterfaceC28601c1) objM87133R4;
                    if (str3 == null) {
                        if (m40073X(interfaceC28601c1)) {
                            str4 = "avoid";
                        } else {
                            str4 = "enforce";
                        }
                        strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                    }
                    final String str119 = strM53370k;
                    abstractC22403o3 = abstractC22403o17;
                    int i5111 = i47;
                    c28655q = c28655q2;
                    final boolean z2111 = z27;
                    final boolean z3118 = z24;
                    c17731c3 = c17731c17;
                    final boolean z3119 = z26;
                    final String str1110 = str3;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40061L(modifier17, abstractC22403o3, z3118, textResource4, c17731c3, title, c14063a, str1110, onViewEvent, interfaceC28601c117, callBack, interfaceC28601c1, interfaceC28601c2, z3119, textResource6, z2111, mapM74000i0, values, str119, interfaceC28601c118, (Composer) obj, iIntValue);
                        }
                    }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                    z16 = z2111;
                    z18 = z3118;
                    textResource5 = textResource6;
                    z17 = z3119;
                    str2 = str1110;
                    i46 = i5111;
                    modifier3 = modifier17;
                } else {
                    c28655q2.m87138X();
                    c17731c3 = c17731c2;
                    i46 = i13;
                    z16 = z4;
                    z17 = z14;
                    textResource4 = textResource3;
                    abstractC22403o3 = abstractC22403o2;
                    modifier3 = modifier2;
                    c28655q = c28655q2;
                    textResource5 = textResource2;
                    z18 = z13;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i45 = i39 | 3072;
            if ((i15 & 24576) == 0) {
                if (!c28655q2.m87157i(onViewEvent)) {
                    i19 = 8192;
                }
                i45 |= i19;
            }
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(callBack)) {
                    i26 = 131072;
                }
                i45 |= i26;
            }
            if ((306783379 & i17) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q2.m87135U(i17 & 1, z15)) {
                c28655q2.m87140Z();
                strM53370k = null;
                if ((i14 & 1) != 0) {
                    if (i55 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i56 != 0) {
                        abstractC22403o2 = null;
                    }
                    if (i57 != 0) {
                        textResource3 = null;
                    }
                    if (i18 != 0) {
                        c17731c4 = null;
                    } else {
                        c17731c4 = c17731c2;
                    }
                    if (i27 != 0) {
                        i47 = 1;
                    } else {
                        i47 = i13;
                    }
                    if ((i16 & 256) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i17 &= -234881025;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i38 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    textResource4 = textResource3;
                    abstractC22403o4 = abstractC22403o2;
                    i48 = i17;
                    z26 = z25;
                    if (i44 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource6 = textResourceM21267a;
                    z27 = z19;
                    modifier4 = modifier2;
                } else {
                    if (i55 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i56 != 0) {
                        abstractC22403o2 = null;
                    }
                    if (i57 != 0) {
                        textResource3 = null;
                    }
                    if (i18 != 0) {
                        c17731c4 = null;
                    } else {
                        c17731c4 = c17731c2;
                    }
                    if (i27 != 0) {
                        i47 = 1;
                    } else {
                        i47 = i13;
                    }
                    if ((i16 & 256) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i17 &= -234881025;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i38 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    textResource4 = textResource3;
                    abstractC22403o4 = abstractC22403o2;
                    i48 = i17;
                    z26 = z25;
                    if (i44 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource6 = textResourceM21267a;
                    z27 = z19;
                    modifier4 = modifier2;
                }
                c28655q2.m87175r();
                List<C14079q> listM40027b11110 = values.m40027b();
                C17731c2 c17731c18 = c17731c4;
                final Modifier modifier18 = modifier4;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b11110, 10));
                it = listM40027b11110.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                }
                List<C14079q> listM40027b11111 = values.m40027b();
                AbstractC22403o abstractC22403o18 = abstractC22403o4;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b11111, 10));
                it3 = listM40027b11111.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                }
                List<C14079q> listM40027b11112 = values.m40027b();
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b11112, 10));
                it4 = listM40027b11112.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                }
                mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                if ((i45 & 14) == 4) {
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z28) {
                    objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c119 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                    c28655q2.m87172p0(objM87133R4);
                }
                final InterfaceC28601c1 interfaceC28601c1110 = (InterfaceC28601c1) objM87133R4;
                if (str3 == null) {
                    if (m40073X(interfaceC28601c1)) {
                        str4 = "avoid";
                    } else {
                        str4 = "enforce";
                    }
                    strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                }
                final String str1111 = strM53370k;
                abstractC22403o3 = abstractC22403o18;
                int i5112 = i47;
                c28655q = c28655q2;
                final boolean z2112 = z27;
                final boolean z31110 = z24;
                c17731c3 = c17731c18;
                final boolean z31111 = z26;
                final String str1112 = str3;
                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC14078p.m40061L(modifier18, abstractC22403o3, z31110, textResource4, c17731c3, title, c14063a, str1112, onViewEvent, interfaceC28601c119, callBack, interfaceC28601c1, interfaceC28601c2, z31111, textResource6, z2112, mapM74000i0, values, str1111, interfaceC28601c1110, (Composer) obj, iIntValue);
                    }
                }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                z16 = z2112;
                z18 = z31110;
                textResource5 = textResource6;
                z17 = z31111;
                str2 = str1112;
                i46 = i5112;
                modifier3 = modifier18;
            } else {
                c28655q2.m87138X();
                c17731c3 = c17731c2;
                i46 = i13;
                z16 = z4;
                z17 = z14;
                textResource4 = textResource3;
                abstractC22403o3 = abstractC22403o2;
                modifier3 = modifier2;
                c28655q = c28655q2;
                textResource5 = textResource2;
                z18 = z13;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i36 |= 48;
        if ((i15 & 384) != 0) {
            i36 |= c28655q2.m87157i(c14063a) ? 256 : 128;
        }
        i39 = i36;
        i44 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i44 != 0) {
            i45 = i39;
            if ((i15 & 3072) == 0) {
                if (c28655q2.m87153g(str)) {
                    i58 = 2048;
                }
                i45 |= i58;
            }
            if ((i15 & 24576) == 0) {
                if (!c28655q2.m87157i(onViewEvent)) {
                    i19 = 8192;
                }
                i45 |= i19;
            }
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(callBack)) {
                    i26 = 131072;
                }
                i45 |= i26;
            }
            if ((306783379 & i17) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (c28655q2.m87135U(i17 & 1, z15)) {
                c28655q2.m87140Z();
                strM53370k = null;
                if ((i14 & 1) != 0) {
                    if (i55 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i56 != 0) {
                        abstractC22403o2 = null;
                    }
                    if (i57 != 0) {
                        textResource3 = null;
                    }
                    if (i18 != 0) {
                        c17731c4 = null;
                    } else {
                        c17731c4 = c17731c2;
                    }
                    if (i27 != 0) {
                        i47 = 1;
                    } else {
                        i47 = i13;
                    }
                    if ((i16 & 256) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i17 &= -234881025;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i38 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    textResource4 = textResource3;
                    abstractC22403o4 = abstractC22403o2;
                    i48 = i17;
                    z26 = z25;
                    if (i44 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource6 = textResourceM21267a;
                    z27 = z19;
                    modifier4 = modifier2;
                } else {
                    if (i55 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i56 != 0) {
                        abstractC22403o2 = null;
                    }
                    if (i57 != 0) {
                        textResource3 = null;
                    }
                    if (i18 != 0) {
                        c17731c4 = null;
                    } else {
                        c17731c4 = c17731c2;
                    }
                    if (i27 != 0) {
                        i47 = 1;
                    } else {
                        i47 = i13;
                    }
                    if ((i16 & 256) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i17 &= -234881025;
                    } else {
                        textResourceM21267a = textResource2;
                    }
                    if (i29 != 0) {
                        z19 = false;
                    } else {
                        z19 = z4;
                    }
                    if (i35 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if (i38 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    textResource4 = textResource3;
                    abstractC22403o4 = abstractC22403o2;
                    i48 = i17;
                    z26 = z25;
                    if (i44 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    textResource6 = textResourceM21267a;
                    z27 = z19;
                    modifier4 = modifier2;
                }
                c28655q2.m87175r();
                List<C14079q> listM40027b11113 = values.m40027b();
                C17731c2 c17731c19 = c17731c4;
                final Modifier modifier19 = modifier4;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b11113, 10));
                it = listM40027b11113.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                }
                List<C14079q> listM40027b11114 = values.m40027b();
                AbstractC22403o abstractC22403o19 = abstractC22403o4;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b11114, 10));
                it3 = listM40027b11114.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                }
                List<C14079q> listM40027b11115 = values.m40027b();
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b11115, 10));
                it4 = listM40027b11115.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
                }
                mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
                if ((i45 & 14) == 4) {
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z28) {
                    objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
                }
                final InterfaceC28601c1 interfaceC28601c1111 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                    c28655q2.m87172p0(objM87133R4);
                }
                final InterfaceC28601c1 interfaceC28601c1112 = (InterfaceC28601c1) objM87133R4;
                if (str3 == null) {
                    if (m40073X(interfaceC28601c1)) {
                        str4 = "avoid";
                    } else {
                        str4 = "enforce";
                    }
                    strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
                }
                final String str1113 = strM53370k;
                abstractC22403o3 = abstractC22403o19;
                int i5113 = i47;
                c28655q = c28655q2;
                final boolean z2113 = z27;
                final boolean z31112 = z24;
                c17731c3 = c17731c19;
                final boolean z31113 = z26;
                final String str1114 = str3;
                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC14078p.m40061L(modifier19, abstractC22403o3, z31112, textResource4, c17731c3, title, c14063a, str1114, onViewEvent, interfaceC28601c1111, callBack, interfaceC28601c1, interfaceC28601c2, z31113, textResource6, z2113, mapM74000i0, values, str1113, interfaceC28601c1112, (Composer) obj, iIntValue);
                    }
                }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
                z16 = z2113;
                z18 = z31112;
                textResource5 = textResource6;
                z17 = z31113;
                str2 = str1114;
                i46 = i5113;
                modifier3 = modifier19;
            } else {
                c28655q2.m87138X();
                c17731c3 = c17731c2;
                i46 = i13;
                z16 = z4;
                z17 = z14;
                textResource4 = textResource3;
                abstractC22403o3 = abstractC22403o2;
                modifier3 = modifier2;
                c28655q = c28655q2;
                textResource5 = textResource2;
                z18 = z13;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i45 = i39 | 3072;
        if ((i15 & 24576) == 0) {
            if (!c28655q2.m87157i(onViewEvent)) {
                i19 = 8192;
            }
            i45 |= i19;
        }
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(callBack)) {
                i26 = 131072;
            }
            i45 |= i26;
        }
        if ((306783379 & i17) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c28655q2.m87135U(i17 & 1, z15)) {
            c28655q2.m87140Z();
            strM53370k = null;
            if ((i14 & 1) != 0) {
                if (i55 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i56 != 0) {
                    abstractC22403o2 = null;
                }
                if (i57 != 0) {
                    textResource3 = null;
                }
                if (i18 != 0) {
                    c17731c4 = null;
                } else {
                    c17731c4 = c17731c2;
                }
                if (i27 != 0) {
                    i47 = 1;
                } else {
                    i47 = i13;
                }
                if ((i16 & 256) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i17 &= -234881025;
                } else {
                    textResourceM21267a = textResource2;
                }
                if (i29 != 0) {
                    z19 = false;
                } else {
                    z19 = z4;
                }
                if (i35 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i38 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                textResource4 = textResource3;
                abstractC22403o4 = abstractC22403o2;
                i48 = i17;
                z26 = z25;
                if (i44 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                textResource6 = textResourceM21267a;
                z27 = z19;
                modifier4 = modifier2;
            } else {
                if (i55 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i56 != 0) {
                    abstractC22403o2 = null;
                }
                if (i57 != 0) {
                    textResource3 = null;
                }
                if (i18 != 0) {
                    c17731c4 = null;
                } else {
                    c17731c4 = c17731c2;
                }
                if (i27 != 0) {
                    i47 = 1;
                } else {
                    i47 = i13;
                }
                if ((i16 & 256) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i17 &= -234881025;
                } else {
                    textResourceM21267a = textResource2;
                }
                if (i29 != 0) {
                    z19 = false;
                } else {
                    z19 = z4;
                }
                if (i35 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if (i38 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                textResource4 = textResource3;
                abstractC22403o4 = abstractC22403o2;
                i48 = i17;
                z26 = z25;
                if (i44 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                textResource6 = textResourceM21267a;
                z27 = z19;
                modifier4 = modifier2;
            }
            c28655q2.m87175r();
            List<C14079q> listM40027b11116 = values.m40027b();
            C17731c2 c17731c110 = c17731c4;
            final Modifier modifier110 = modifier4;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b11116, 10));
            it = listM40027b11116.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
            }
            List<C14079q> listM40027b11117 = values.m40027b();
            AbstractC22403o abstractC22403o110 = abstractC22403o4;
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b11117, 10));
            it3 = listM40027b11117.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
            }
            List<C14079q> listM40027b11118 = values.m40027b();
            arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM40027b11118, 10));
            it4 = listM40027b11118.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((C14079q) it4.next()).getAvoidTrailingDisplay());
            }
            mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, AbstractC25265s.m74107K1(arrayList3, arrayList2)));
            if ((i45 & 14) == 4) {
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z28) {
                objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
            } else {
                objM87133R = AbstractC31061c.m95647w(z24, c28655q2);
            }
            final InterfaceC28601c1 interfaceC28601c1113 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(z27, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11895b.m32005x(i47, c28655q2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(m40083d0(mapM74000i0, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
                c28655q2.m87172p0(objM87133R4);
            }
            final InterfaceC28601c1 interfaceC28601c1114 = (InterfaceC28601c1) objM87133R4;
            if (str3 == null) {
                if (m40073X(interfaceC28601c1)) {
                    str4 = "avoid";
                } else {
                    str4 = "enforce";
                }
                strM53370k = AbstractC18489d0.m53370k(str3, "_", str4);
            }
            final String str1115 = strM53370k;
            abstractC22403o3 = abstractC22403o110;
            int i5114 = i47;
            c28655q = c28655q2;
            final boolean z2114 = z27;
            final boolean z31114 = z24;
            c17731c3 = c17731c110;
            final boolean z31115 = z26;
            final String str1116 = str3;
            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1107450526, c28655q, new InterfaceC4351m() { // from class: f41.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC14078p.m40061L(modifier110, abstractC22403o3, z31114, textResource4, c17731c3, title, c14063a, str1116, onViewEvent, interfaceC28601c1113, callBack, interfaceC28601c1, interfaceC28601c2, z31115, textResource6, z2114, mapM74000i0, values, str1115, interfaceC28601c1114, (Composer) obj, iIntValue);
                }
            }), c28655q, ((i48 >> 15) & 112) | 24576, 13);
            z16 = z2114;
            z18 = z31114;
            textResource5 = textResource6;
            z17 = z31115;
            str2 = str1116;
            i46 = i5114;
            modifier3 = modifier110;
        } else {
            c28655q2.m87138X();
            c17731c3 = c17731c2;
            i46 = i13;
            z16 = z4;
            z17 = z14;
            textResource4 = textResource3;
            abstractC22403o3 = abstractC22403o2;
            modifier3 = modifier2;
            c28655q = c28655q2;
            textResource5 = textResource2;
            z18 = z13;
            str2 = str;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f41.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC14078p.m40070U(modifier3, abstractC22403o3, title, textResource4, c17731c3, values, j7, i46, textResource5, z16, z18, z17, c14063a, str2, onViewEvent, callBack, i14, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: H */
    private static final int m40057H(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: I */
    private static final void m40058I(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: J */
    private static final TextResource m40059J(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: K */
    private static final void m40060K(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m40061L(Modifier modifier, final AbstractC22403o abstractC22403o, final boolean z4, final TextResource textResource, final C17731c2 c17731c2, final TextResource textResource2, final C14063a c14063a, final String str, final Function1 function1, final InterfaceC28601c1 interfaceC28601c1, final Function3 function3, final InterfaceC28601c1 interfaceC28601c2, final InterfaceC28601c1 interfaceC28601c3, final boolean z13, final TextResource textResource3, final boolean z14, final Map map, final C14064b c14064b, final String str2, final InterfaceC28601c1 interfaceC28601c4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), null, null, null, 0.0f, AbstractC37817c.m121344e(-571244302, c28655q, new InterfaceC4351m() { // from class: f41.o
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC14078p.m40062M(abstractC22403o, z4, textResource, c17731c2, textResource2, c14063a, str, function1, interfaceC28601c1, function3, interfaceC28601c2, interfaceC28601c3, z13, textResource3, z14, map, c14064b, str2, interfaceC28601c4, (Composer) obj, iIntValue);
                }
            }), c28655q, 12582912, 122);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r19v5, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r22v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r36v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r36v1, types: [androidx.compose.runtime.Composer] */
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
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m40062M(AbstractC22403o abstractC22403o, boolean z4, TextResource textResource, C17731c2 c17731c2, TextResource textResource2, C14063a c14063a, String str, Function1 function1, final InterfaceC28601c1 interfaceC28601c1, final Function3 function3, final InterfaceC28601c1 interfaceC28601c2, final InterfaceC28601c1 interfaceC28601c3, final boolean z13, final TextResource textResource3, final boolean z14, final Map map, final C14064b c14064b, final String str2, final InterfaceC28601c1 interfaceC28601c4, Composer composer, int i13) {
        boolean z15;
        AbstractC26165a abstractC26165a;
        ?? r10;
        ?? r14;
        String str3;
        String strConcat;
        Object obj;
        ?? r15;
        ?? r16;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            if (abstractC22403o == null) {
                c28655q.m87150e0(-735448071);
                z15 = false;
                c28655q.m87173q(false);
                r10 = c28655q;
                abstractC26165a = null;
            } else {
                z15 = false;
                c28655q.m87150e0(-716460792);
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                C28655q c28655q2 = c28655q;
                c28655q2.m87173q(false);
                abstractC26165a = abstractC26165aM64500i;
                r10 = c28655q2;
            }
            Object obj2 = C28635l.f115821a;
            if (abstractC26165a == null) {
                r10.m87150e0(-735392178);
                r10.m87173q(z15);
                r14 = z15;
            } else {
                r10.m87150e0(-735392177);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                Object objM87133R = r10.m87133R();
                if (objM87133R == obj2) {
                    objM87133R = new C14068f(0);
                    r10.m87172p0(objM87133R);
                }
                Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3409f4, (Function1) objM87133R);
                Object objM87133R2 = r10.m87133R();
                if (objM87133R2 == obj2) {
                    objM87133R2 = new C14068f(1);
                    r10.m87172p0(objM87133R2);
                }
                AbstractC29125c.m88522c(abstractC26165a, null, AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R2), null, C39102j.f168199a, 0.0f, null, r10, 24624, 104);
                r14 = 0;
                r10.m87173q(false);
            }
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3427x(c2314t, null, 3), 0.0f, f14, 0.0f, z4 ? ((float) r14) * f13 : f14, 5);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(r16, c2306l, r10, 48);
            int iHashCode4 = Long.hashCode(r10.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = r10.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(r10, modifierM3398t);
            r10.m87158i0();
            if (r10.f115903S) {
                r10.m87163l(c0213j);
            } else {
                r10.m87178s0();
            }
            AbstractC28683x.m87239G(r10, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(r10, c0209i2, interfaceC28653p1M87165m4);
            if (r10.f115903S || !AbstractC22676k.m65745e(r10.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, r10, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(r10, c0209i4, modifierM118962N4);
            C23000t1 c23000t1 = C23000t1.f90727a;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c23000t1.mo66772c(c2314t, true, 2.0f), f14, 0.0f, 2);
            float f15 = 1;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(f15, 4, c2305k, r10, 6);
            int iHashCode5 = Long.hashCode(r10.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = r10.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(r10, modifierM3396r);
            r10.m87158i0();
            if (r10.f115903S) {
                r10.m87163l(c0213j);
            } else {
                r10.m87178s0();
            }
            AbstractC28683x.m87239G(r10, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(r10, c0209i2, interfaceC28653p1M87165m5);
            if (r10.f115903S || !AbstractC22676k.m65745e(r10.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, r10, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(r10, c0209i4, modifierM118962N5);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, c2306l, r10, 48);
            int iHashCode6 = Long.hashCode(r10.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = r10.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(r10, c2314t);
            r10.m87158i0();
            if (r10.f115903S) {
                r10.m87163l(c0213j);
            } else {
                r10.m87178s0();
            }
            AbstractC28683x.m87239G(r10, c0209i, c22994r1M66759a3);
            AbstractC28683x.m87239G(r10, c0209i2, interfaceC28653p1M87165m6);
            if (r10.f115903S || !AbstractC22676k.m65745e(r10.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, r10, iHashCode6, c0209i3);
            }
            AbstractC28683x.m87239G(r10, c0209i4, modifierM118962N6);
            Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, false, 3.0f);
            String strM21274h = AbstractC8693b.m21274h(textResource2, r10, 0);
            ?? r17 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierMo66772c, r17.m121949b(r10, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r10, 6).getSh4(), null, r10, 0, 0, 196600);
            AbstractC38963t7.m124386p(f15, f13, c2314t, r10);
            if (c14063a == null) {
                r10.m87150e0(102724510);
                r15 = 0;
                r10.m87173q(false);
                obj = obj2;
                str3 = str;
            } else {
                r10.m87150e0(102724511);
                Modifier modifierMo66772c2 = c23000t1.mo66772c(c2314t, false, 1.0f);
                if (str != null) {
                    str3 = str;
                    strConcat = str3.concat("_info");
                } else {
                    str3 = str;
                    strConcat = null;
                }
                Modifier modifierM44101d = AbstractC15676d.m44101d(modifierMo66772c2, strConcat);
                C27270o c27270o = new C27270o(AbstractC27274q.d.f109141f, r17.m121951d().getTinyIcons().getTinyInformation(), EnumC39333f.RECOVERY, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                boolean zM87153g = r10.m87153g(function1) | r10.m87157i(c14063a);
                Object objM87133R3 = r10.m87133R();
                if (zM87153g) {
                    obj = obj2;
                } else {
                    if (objM87133R3 != obj) {
                        obj = obj2;
                    }
                    AbstractC27242b1.m82092d(c27270o, "", modifierM44101d, null, (InterfaceC4339a) objM87133R3, r10, 48, 8);
                    r15 = 0;
                    r10.m87173q(false);
                }
                obj = obj2;
                objM87133R3 = new C14069g(function1, c14063a, 0);
                r10.m87172p0(objM87133R3);
                AbstractC27242b1.m82092d(c27270o, "", modifierM44101d, null, (InterfaceC4339a) objM87133R3, r10, 48, 8);
                r15 = 0;
                r10.m87173q(false);
            }
            r10.m87173q(true);
            if (textResource == null) {
                r10.m87150e0(-215047686);
                r10.m87173q(r15);
                r16 = r15;
            } else {
                r10.m87150e0(-215047685);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, r10, r15), null, r17.m121949b(r10, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r10, 6).getB3(), null, r10, 0, 0, 196602);
                r16 = 0;
                r10.m87173q(false);
            }
            if (c17731c2 == null) {
                r10.m87150e0(-214673268);
            } else {
                r10.m87150e0(-214673267);
                AbstractC17808z1.m51175c(c17731c2, r10, C9598e.f28134d);
            }
            r10.m87173q(r16);
            r10.m87173q(true);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c23000t1.mo66772c(c2314t, true, 1.0f)), f14, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90655f, C2299e.f9112O, r10, 54);
            int iHashCode7 = Long.hashCode(r10.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = r10.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(r10, modifierM3396r2);
            r10.m87158i0();
            if (r10.f115903S) {
                r10.m87163l(c0213j);
            } else {
                r10.m87178s0();
            }
            AbstractC28683x.m87239G(r10, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(r10, c0209i2, interfaceC28653p1M87165m7);
            if (r10.f115903S || !AbstractC22676k.m65745e(r10.m87133R(), Integer.valueOf(iHashCode7))) {
                AbstractC11266d.m30471y(iHashCode7, r10, iHashCode7, c0209i3);
            }
            AbstractC28683x.m87239G(r10, c0209i4, modifierM118962N7);
            Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, str3 != null ? str3.concat("_toggle") : null);
            boolean zM40071V = m40071V(interfaceC28601c1);
            boolean zM87153g2 = r10.m87153g(interfaceC28601c1) | r10.m87153g(function3);
            Object objM87133R4 = r10.m87133R();
            if (zM87153g2 || objM87133R4 == obj) {
                objM87133R4 = new C1042s((Object) function3, interfaceC28601c1, (Object) interfaceC28601c2, (Object) interfaceC28601c3, 19);
                r10.m87172p0(objM87133R4);
            }
            ?? r24 = r10;
            AbstractC29641d.m91043e(modifierM44101d2, zM40071V, false, 0L, null, null, (Function1) objM87133R4, r24, 0, 60);
            AbstractC2875y.m8286B(r24, true, true, true, true);
            final String str4 = str3;
            AbstractC1090b.m3350e(C23016z.f90757a, m40071V(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-1039977664, r24, new Function3() { // from class: f41.h
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return AbstractC14078p.m40067R(z13, textResource3, z14, str4, map, function3, interfaceC28601c1, c14064b, str2, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, (InterfaceC3747i0) obj3, (Composer) obj4, iIntValue);
                }
            }), r24, 1572870, 30);
            r24.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m40063N(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m40064O(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51484b(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69625b)), new C23465k(Float.valueOf(0.3f), new C17919x(C17919x.f69636m))}), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m40065P(Function1 function1, C14063a c14063a) {
        function1.invoke(c14063a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m40066Q(Function3 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, boolean z4) {
        m40072W(interfaceC28601c1, z4);
        function3.invoke(Boolean.valueOf(m40071V(interfaceC28601c1)), Boolean.valueOf(m40073X(interfaceC28601c2)), Integer.valueOf(m40057H(interfaceC28601c3)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m40067R(boolean z4, TextResource textResource, boolean z13, String str, final Map map, final Function3 function3, final InterfaceC28601c1 interfaceC28601c1, C14064b c14064b, String str2, final InterfaceC28601c1 interfaceC28601c2, final InterfaceC28601c1 interfaceC28601c3, final InterfaceC28601c1 interfaceC28601c4, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28676v0 c28676v0;
        C2314t c2314t;
        Composer composer2 = composer;
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer2, 0);
        C28655q c28655q2 = (C28655q) composer2;
        int iHashCode = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
        C2314t c2314t2 = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, c2314t2);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q2.f115906a;
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j);
        } else {
            c28655q2.m87178s0();
        }
        AbstractC28683x.m87239G(composer2, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N);
        C28676v0 c28676v1 = C28635l.f115821a;
        if (z4) {
            c28655q2.m87150e0(-179814753);
            AbstractC33088k.g gVar = new AbstractC33088k.g(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            long jM125385c1 = C38072d.f163053a.m121949b(composer2, 6).getWhite70();
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str != null ? str.concat("_avoid_checkbox") : null);
            boolean zM87157i = c28655q2.m87157i(map) | c28655q2.m87153g(function3) | c28655q2.m87153g(interfaceC28601c1);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == c28676v1) {
                final int i15 = 0;
                Function1 function1 = new Function1() { // from class: f41.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return AbstractC14078p.m40068S(map, function3, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c1, ((Boolean) obj).booleanValue());
                            default:
                                return AbstractC14078p.m40069T(map, function3, interfaceC28601c2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c1, ((Integer) obj).intValue());
                        }
                    }
                };
                c28655q2.m87172p0(function1);
                objM87133R = function1;
            }
            c28676v0 = c28676v1;
            AbstractC33087j.m104824f(textResource, gVar, z13, false, 0, jM125385c1, modifierM44101d, null, false, 0L, (Function1) objM87133R, composer, 24576, 0, 904);
            composer2 = composer;
            c28655q = c28655q2;
            i14 = 0;
            c28655q.m87173q(false);
            c2314t = c2314t2;
        } else {
            i14 = 0;
            c28655q = c28655q2;
            c28676v0 = c28676v1;
            c28655q.m87150e0(-178655446);
            c2314t = c2314t2;
            AbstractC22953f.m66715b(composer2, AbstractC1102d.m3419p(2 * 4, c2314t));
            c28655q.m87173q(false);
        }
        float f13 = 8;
        float f14 = ((float) 2.0d) * f13;
        Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f14, i14 * f13, f14, ((float) 1.0d) * f13);
        TextResource textResourceM40026a = c14064b.getLeadingTitleDisplay();
        TextResource textResourceM40059J = m40059J(interfaceC28601c4);
        List<C14079q> listM40027b = c14064b.m40027b();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b, 10));
        Iterator<T> it = listM40027b.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
        }
        Integer numValueOf = Integer.valueOf(m40057H(interfaceC28601c3));
        boolean zM87157i2 = c28655q.m87157i(map) | c28655q.m87153g(function3) | c28655q.m87153g(interfaceC28601c1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            final int i16 = 1;
            Function1 function2 = new Function1() { // from class: f41.i
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            return AbstractC14078p.m40068S(map, function3, interfaceC28601c2, interfaceC28601c4, interfaceC28601c3, interfaceC28601c1, ((Boolean) obj).booleanValue());
                        default:
                            return AbstractC14078p.m40069T(map, function3, interfaceC28601c2, interfaceC28601c4, interfaceC28601c3, interfaceC28601c1, ((Integer) obj).intValue());
                    }
                }
            };
            c28655q.m87172p0(function2);
            objM87133R2 = function2;
        }
        AbstractC40021c.m128282e(modifierM3397s, textResourceM40026a, textResourceM40059J, arrayList, numValueOf, false, null, null, str2, (Function1) objM87133R2, composer2, 6, 224);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m40068S(Map map, Function3 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, boolean z4) {
        m40074Y(interfaceC28601c1, z4);
        m40060K(interfaceC28601c3, m40083d0(map, m40073X(interfaceC28601c1), m40057H(interfaceC28601c2)));
        function3.invoke(Boolean.valueOf(m40071V(interfaceC28601c4)), Boolean.valueOf(m40073X(interfaceC28601c1)), Integer.valueOf(m40057H(interfaceC28601c2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m40069T(Map map, Function3 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, int i13) {
        m40060K(interfaceC28601c2, m40083d0(map, m40073X(interfaceC28601c1), i13));
        m40058I(interfaceC28601c3, i13);
        function3.invoke(Boolean.valueOf(m40071V(interfaceC28601c4)), Boolean.valueOf(m40073X(interfaceC28601c1)), Integer.valueOf(m40057H(interfaceC28601c3)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m40070U(Modifier modifier, AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, C17731c2 c17731c2, C14064b c14064b, long j7, int i13, TextResource textResource3, boolean z4, boolean z13, boolean z14, C14063a c14063a, String str, Function1 function1, Function3 function3, int i14, int i15, int i16, Composer composer, int i17) {
        m40056G(modifier, abstractC22403o, textResource, textResource2, c17731c2, c14064b, j7, i13, textResource3, z4, z13, z14, c14063a, str, function1, function3, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V */
    private static final boolean m40071V(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: W */
    private static final void m40072W(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: X */
    private static final boolean m40073X(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Y */
    private static final void m40074Y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: Z */
    public static final void m40075Z(Modifier modifier, C14067e viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-924400178);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            String lowerCase = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            String strM125926K = AbstractC39421y.m125926K(lowerCase, " ", "_", false);
            Pattern patternCompile = Pattern.compile("[^a-z0-9_]");
            AbstractC22676k.m65749i(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(strM125926K).replaceAll("");
            AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
            AbstractC22403o icon = viewState.getIcon();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (icon != null) {
                c28655q2.m87150e0(-130047539);
                TextResource title = viewState.getTitle();
                AbstractC22403o icon2 = viewState.getIcon();
                C14064b dayOptions = viewState.getDayOptions();
                long jMo134584toComposableColorWaAFU9c = viewState.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                boolean z4 = true;
                int selectedNumber = viewState.getSelectedNumber();
                boolean isSelected = viewState.getIsSelected();
                if ((i15 & 896) != 256) {
                    z4 = false;
                }
                boolean zM87157i = z4 | c28655q2.m87157i(viewState);
                Object objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C13857f(onViewEvent, viewState);
                    c28655q2.m87172p0(objM87133R);
                }
                m40099t(modifier4, title, icon2, dayOptions, jMo134584toComposableColorWaAFU9c, selectedNumber, isSelected, strReplaceAll, (InterfaceC4351m) objM87133R, c28655q2, i15 & 14, 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-129305895);
                AbstractC22403o imageUrl = viewState.getImageUrl();
                TextResource title2 = viewState.getTitle();
                TextResource subtitle = viewState.getSubtitle();
                C17731c2 trend = viewState.getTrend();
                C14064b dayOptions2 = viewState.getDayOptions();
                long jMo134584toComposableColorWaAFU9c2 = viewState.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                int selectedNumber2 = viewState.getSelectedNumber();
                TextResource avoidText = viewState.getAvoidText();
                if (avoidText == null) {
                    avoidText = AbstractC8693b.m21267a();
                }
                boolean isAvoidChecked = viewState.getIsAvoidChecked();
                TextResource textResource = avoidText;
                boolean isSelected2 = viewState.getIsSelected();
                boolean showAvoidOption = viewState.getShowAvoidOption();
                boolean z13 = true;
                C14063a bottomSheetInfo = viewState.getBottomSheetInfo();
                if ((i15 & 896) != 256) {
                    z13 = false;
                }
                boolean zM87157i2 = z13 | c28655q.m87157i(viewState);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C22931l(onViewEvent, viewState, 23);
                    c28655q.m87172p0(objM87133R2);
                }
                m40056G(modifier4, imageUrl, title2, subtitle, trend, dayOptions2, jMo134584toComposableColorWaAFU9c2, selectedNumber2, textResource, isAvoidChecked, isSelected2, showAvoidOption, bottomSheetInfo, strReplaceAll, onViewEvent, (Function3) objM87133R2, c28655q, (i15 & 14) | (C9598e.f28134d << 12), (i15 << 6) & 57344, 0);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 1, modifier3, onViewEvent, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m40077a0(Function1 function1, C14067e c14067e, boolean z4, int i13) {
        function1.invoke(new C14080r(c14067e.getId(), i13, false, z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m40079b0(Function1 function1, C14067e c14067e, boolean z4, boolean z13, int i13) {
        function1.invoke(new C14080r(c14067e.getId(), i13, z13, z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m40081c0(Modifier modifier, C14067e c14067e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m40075Z(modifier, c14067e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d0 */
    private static final TextResource m40083d0(Map<Integer, ? extends C23465k> map, boolean z4, int i13) {
        return z4 ? (TextResource) map.getOrDefault(Integer.valueOf(i13), new C23465k(AbstractC8693b.m21267a(), AbstractC8693b.m21267a())).f92937w : (TextResource) map.getOrDefault(Integer.valueOf(i13), new C23465k(AbstractC8693b.m21267a(), AbstractC8693b.m21267a())).f92938x;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a A[LOOP:0: B:98:0x0144->B:100:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0175 A[LOOP:1: B:102:0x016f->B:104:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x0193  */
    /* JADX WARN: Code duplicated, block: B:110:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x019f  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:119:0x0202  */
    /* JADX WARN: Code duplicated, block: B:122:0x0211  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x011e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX INFO: renamed from: t */
    public static final void m40099t(Modifier modifier, TextResource title, AbstractC22403o icon, C14064b values, long j7, int i13, boolean z4, String str, InterfaceC4351m callBack, Composer composer, int i14, int i15) {
        Modifier modifier2;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z14;
        C28655q c28655q;
        String str2;
        int i27;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i28;
        boolean z16;
        String str3;
        ArrayList arrayList;
        Iterator<T> it;
        ArrayList arrayList2;
        Iterator<T> it3;
        Map mapM74000i0;
        boolean z17;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        int i29;
        Object objM87133R3;
        int i34;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(callBack, "callBack");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2092017203);
        int i35 = i15 & 1;
        if (i35 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87153g(title) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87153g(icon) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87157i(values) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i36 = i15 & 32;
        if (i36 == 0) {
            if ((196608 & i14) == 0) {
                i17 = i13;
                i16 |= c28655q2.m87149e(i17) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i18 = i15 & 64;
            if (i18 != 0) {
                i16 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i14 & 1572864) == 0) {
                    if (c28655q2.m87155h(z13)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i16 |= i19;
                }
            }
            i24 = i15 & 128;
            if (i24 != 0) {
                if ((i14 & 12582912) == 0) {
                    if (c28655q2.m87153g(str)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i16 |= i25;
                }
                if ((i14 & 100663296) == 0) {
                    if (c28655q2.m87157i(callBack)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i34;
                }
                i26 = i16;
                if ((i26 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i26 & 1, z14)) {
                    if (i35 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i36 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i17;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i24 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    List<C14079q> listM40027b = values.m40027b();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b, 10));
                    it = listM40027b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                    }
                    List<C14079q> listM40027b2 = values.m40027b();
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b2, 10));
                    it3 = listM40027b2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                    }
                    mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, arrayList2));
                    z17 = (i26 & 3670016) == 1048576;
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z17 || objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z16, c28655q2);
                    }
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11895b.m32005x(i28, c28655q2);
                    }
                    InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    i29 = i28;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(mapM74000i0.getOrDefault(Integer.valueOf(i29), AbstractC8693b.m21267a()));
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q = c28655q2;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1087125236, c28655q2, new C14074l(modifier2, icon, title, str3, interfaceC28601c1, callBack, interfaceC28601c2, values, mapM74000i0, (InterfaceC28601c1) objM87133R3)), c28655q, ((i26 >> 9) & 112) | 24576, 13);
                    str2 = str3;
                    i27 = i29;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str2 = str;
                    i27 = i17;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14075m(modifier2, title, icon, values, j7, i27, z15, str2, callBack, i14, i15);
                }
            }
            i16 |= 12582912;
            if ((i14 & 100663296) == 0) {
                if (c28655q2.m87157i(callBack)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i34;
            }
            i26 = i16;
            if ((i26 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i26 & 1, z14)) {
                if (i35 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i36 != 0) {
                    i28 = 1;
                } else {
                    i28 = i17;
                }
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i24 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                List<C14079q> listM40027b3 = values.m40027b();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b3, 10));
                it = listM40027b3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                }
                List<C14079q> listM40027b4 = values.m40027b();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b4, 10));
                it3 = listM40027b4.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                }
                mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, arrayList2));
                if ((i26 & 3670016) == 1048576) {
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z17) {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q2);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(i28, c28655q2);
                }
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
                i29 = i28;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(mapM74000i0.getOrDefault(Integer.valueOf(i29), AbstractC8693b.m21267a()));
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q = c28655q2;
                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1087125236, c28655q2, new C14074l(modifier2, icon, title, str3, interfaceC28601c3, callBack, interfaceC28601c4, values, mapM74000i0, (InterfaceC28601c1) objM87133R3)), c28655q, ((i26 >> 9) & 112) | 24576, 13);
                str2 = str3;
                i27 = i29;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str2 = str;
                i27 = i17;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14075m(modifier2, title, icon, values, j7, i27, z15, str2, callBack, i14, i15);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i17 = i13;
        i18 = i15 & 64;
        if (i18 != 0) {
            i16 |= 1572864;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i14 & 1572864) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i16 |= i19;
            }
        }
        i24 = i15 & 128;
        if (i24 != 0) {
            if ((i14 & 12582912) == 0) {
                if (c28655q2.m87153g(str)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i16 |= i25;
            }
            if ((i14 & 100663296) == 0) {
                if (c28655q2.m87157i(callBack)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i34;
            }
            i26 = i16;
            if ((i26 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i26 & 1, z14)) {
                if (i35 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i36 != 0) {
                    i28 = 1;
                } else {
                    i28 = i17;
                }
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i24 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                List<C14079q> listM40027b5 = values.m40027b();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b5, 10));
                it = listM40027b5.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
                }
                List<C14079q> listM40027b6 = values.m40027b();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b6, 10));
                it3 = listM40027b6.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
                }
                mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, arrayList2));
                if ((i26 & 3670016) == 1048576) {
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z17) {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q2);
                }
                InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11895b.m32005x(i28, c28655q2);
                }
                InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R2;
                i29 = i28;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(mapM74000i0.getOrDefault(Integer.valueOf(i29), AbstractC8693b.m21267a()));
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q = c28655q2;
                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1087125236, c28655q2, new C14074l(modifier2, icon, title, str3, interfaceC28601c5, callBack, interfaceC28601c6, values, mapM74000i0, (InterfaceC28601c1) objM87133R3)), c28655q, ((i26 >> 9) & 112) | 24576, 13);
                str2 = str3;
                i27 = i29;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str2 = str;
                i27 = i17;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14075m(modifier2, title, icon, values, j7, i27, z15, str2, callBack, i14, i15);
            }
        }
        i16 |= 12582912;
        if ((i14 & 100663296) == 0) {
            if (c28655q2.m87157i(callBack)) {
                i34 = 67108864;
            } else {
                i34 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i34;
        }
        i26 = i16;
        if ((i26 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i26 & 1, z14)) {
            if (i35 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (i36 != 0) {
                i28 = 1;
            } else {
                i28 = i17;
            }
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i24 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            List<C14079q> listM40027b7 = values.m40027b();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b7, 10));
            it = listM40027b7.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
            }
            List<C14079q> listM40027b8 = values.m40027b();
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM40027b8, 10));
            it3 = listM40027b8.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C14079q) it3.next()).getTrailingDisplay());
            }
            mapM74000i0 = AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, arrayList2));
            if ((i26 & 3670016) == 1048576) {
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z17) {
                objM87133R = AbstractC31061c.m95647w(z16, c28655q2);
            } else {
                objM87133R = AbstractC31061c.m95647w(z16, c28655q2);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11895b.m32005x(i28, c28655q2);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R2;
            i29 = i28;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(mapM74000i0.getOrDefault(Integer.valueOf(i29), AbstractC8693b.m21267a()));
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q = c28655q2;
            AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(1087125236, c28655q2, new C14074l(modifier2, icon, title, str3, interfaceC28601c7, callBack, interfaceC28601c8, values, mapM74000i0, (InterfaceC28601c1) objM87133R3)), c28655q, ((i26 >> 9) & 112) | 24576, 13);
            str2 = str3;
            i27 = i29;
            z15 = z16;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str2 = str;
            i27 = i17;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14075m(modifier2, title, icon, values, j7, i27, z15, str2, callBack, i14, i15);
        }
    }

    /* JADX INFO: renamed from: u */
    private static final void m40100u(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m40101v(Modifier modifier, AbstractC22403o abstractC22403o, TextResource textResource, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c2, C14064b c14064b, Map map, InterfaceC28601c1 interfaceC28601c3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), null, null, null, 0.0f, AbstractC37817c.m121344e(660638340, c28655q, new C14076n(abstractC22403o, textResource, str, interfaceC28601c1, interfaceC4351m, interfaceC28601c2, c14064b, map, interfaceC28601c3)), c28655q, 12582912, 122);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m40102w(AbstractC22403o abstractC22403o, TextResource textResource, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c2, C14064b c14064b, Map map, InterfaceC28601c1 interfaceC28601c3, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f13 * f14, 1 * f14);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            float f15 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f15, c2314t);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43107a(abstractC26165aM64500i, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
            AbstractC18489d0.m53380u(f13, f15, c2314t, c28655q);
            C23000t1 c23000t1 = C23000t1.f90727a;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, 0), c23000t1.mo66772c(c2314t, true, 3.0f), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196600);
            AbstractC22953f.m66715b(c28655q, c23000t1.mo66772c(c2314t, true, 1.0f));
            Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, str != null ? str.concat("_toggle") : null);
            boolean zM40051B = m40051B(interfaceC28601c1);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC4351m);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                interfaceC28601c4 = interfaceC28601c2;
                objM87133R = new C13412g(interfaceC4351m, interfaceC28601c1, interfaceC28601c4, 7);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC28601c4 = interfaceC28601c2;
            }
            AbstractC29641d.m91043e(modifierM44101d, zM40051B, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 60);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC1090b.m3350e(C23016z.f90757a, m40051B(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-1121677870, c28655q, new C11139s(c14064b, str, map, interfaceC4351m, interfaceC28601c1, interfaceC28601c3, interfaceC28601c4)), c28655q, 1572870, 30);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m40103x(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4) {
        m40052C(interfaceC28601c1, z4);
        interfaceC4351m.invoke(Boolean.valueOf(m40051B(interfaceC28601c1)), Integer.valueOf(m40053D(interfaceC28601c2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m40104y(C14064b c14064b, String str, Map map, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, C2314t.f9131w);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        TextResource textResourceM40026a = c14064b.getLeadingTitleDisplay();
        TextResource textResourceM40055F = m40055F(interfaceC28601c2);
        List<C14079q> listM40027b = c14064b.m40027b();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM40027b, 10));
        Iterator<T> it = listM40027b.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C14079q) it.next()).getValue()));
        }
        Integer numValueOf = Integer.valueOf(m40053D(interfaceC28601c3));
        boolean zM87157i = c28655q.m87157i(map) | c28655q.m87153g(interfaceC4351m) | c28655q.m87153g(interfaceC28601c1);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            C1040r c1040r = new C1040r((Object) map, (Object) interfaceC4351m, (Object) interfaceC28601c2, (Object) interfaceC28601c3, (Object) interfaceC28601c1, 10);
            c28655q.m87172p0(c1040r);
            objM87133R = c1040r;
        }
        AbstractC40021c.m128282e(null, textResourceM40026a, textResourceM40055F, arrayList, numValueOf, false, null, null, str, (Function1) objM87133R, composer, 0, 225);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m40105z(Map map, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, int i13) {
        m40100u(interfaceC28601c1, (TextResource) map.getOrDefault(Integer.valueOf(i13), AbstractC8693b.m21267a()));
        m40054E(interfaceC28601c2, i13);
        interfaceC4351m.invoke(Boolean.valueOf(m40051B(interfaceC28601c3)), Integer.valueOf(i13));
        return C23454a0.f92919a;
    }
}
