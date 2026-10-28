package k71;

import a11.C0134l;
import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.C3029l;
import bp0.C3526n;
import c41.C4004c5;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.util.TrendKey;
import cz0.C11253n;
import f61.C14143e;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import h01.C16544k;
import h01.C16546m;
import hg3.AbstractC17269i;
import hy0.AbstractC17755i2;
import i91.AbstractC18247a;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import ji0.C21714b;
import kd1.C22411w;
import l83.C23454a0;
import n21.AbstractC26194h;
import n21.EnumC26195i;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p007a6.C0428i;
import p01.AbstractC28586f;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p81.AbstractC28970b;
import p81.C28971c;
import qz0.AbstractC30795n;
import r71.AbstractC31052b;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: k71.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\"\u001a\u00020\b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\u0004H\u0003¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010&\u001a\u00020 *\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010)\u001a\u00020 *\u00020\u00022\u0006\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*¨\u0006,²\u0006\u000e\u0010+\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lk71/m;", "viewState", "", "legendOverflow", "Lkotlin/Function1;", "", "Ll83/a0;", "onBodyItemClicked", "u", "(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "graphTestTag", "progressBarTestTag", "B", "(Lk71/m;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Lp81/c;", "unlockTrendsCardState", "s", "(Lp81/c;Landroidx/compose/runtime/Composer;I)V", "Li2/x;", "iconColor", "backgroundColor", "", "resourceId", "isFilled", "q", "(JJIZLandroidx/compose/runtime/Composer;I)V", "", "Lm91/u;", "subItems", "Ly3/f;", "horizontalPadding", "L", "(Ljava/util/List;FLandroidx/compose/runtime/Composer;I)V", "O", "(Landroidx/compose/runtime/Composer;I)Z", "N", "(Lk71/m;)F", "futureIa", "P", "(Lk71/m;Z)F", "overflow", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22253j {

    /* JADX INFO: renamed from: k71.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f86763a;

        static {
            int[] iArr = new int[EnumC22247d0.values().length];
            try {
                iArr[EnumC22247d0.WEEKLY_PLAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22247d0.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f86763a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m63815A(Modifier modifier, C22256m c22256m, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m63851u(modifier, c22256m, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0243  */
    /* JADX WARN: Code duplicated, block: B:102:0x0252  */
    /* JADX WARN: Code duplicated, block: B:104:0x0291  */
    /* JADX WARN: Code duplicated, block: B:105:0x0295  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:129:0x0307  */
    /* JADX WARN: Code duplicated, block: B:132:0x0310  */
    /* JADX WARN: Code duplicated, block: B:133:0x0316  */
    /* JADX WARN: Code duplicated, block: B:138:0x0374  */
    /* JADX WARN: Code duplicated, block: B:139:0x0378  */
    /* JADX WARN: Code duplicated, block: B:142:0x038b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0399  */
    /* JADX WARN: Code duplicated, block: B:147:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:161:0x044e  */
    /* JADX WARN: Code duplicated, block: B:163:0x045a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0460  */
    /* JADX WARN: Code duplicated, block: B:166:0x046a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0479  */
    /* JADX WARN: Code duplicated, block: B:170:0x0486  */
    /* JADX WARN: Code duplicated, block: B:172:0x0576  */
    /* JADX WARN: Code duplicated, block: B:175:0x0590  */
    /* JADX WARN: Code duplicated, block: B:178:0x059c  */
    /* JADX WARN: Code duplicated, block: B:182:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0143  */
    /* JADX WARN: Code duplicated, block: B:78:0x0151  */
    /* JADX WARN: Code duplicated, block: B:82:0x016f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:95:0x0221  */
    /* JADX WARN: Code duplicated, block: B:99:0x0237  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v14, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v15, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v21, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v9, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r29v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r29v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r29v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v28, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r8v34, types: [x81.d] */
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
    /* JADX INFO: renamed from: B */
    private static final void m63816B(C22256m c22256m, boolean z4, Function1 function1, String str, String str2, Composer composer, int i13, int i14) {
        int i15;
        String str3;
        int i16;
        int i17;
        boolean z13;
        String str4;
        String str5;
        ?? r14;
        C28677v1 c28677v1M87180u;
        C23454a0 c23454a0;
        String str6;
        float fM63828N;
        List<C22246d> listM63905m;
        C2314t c2314t;
        float f13;
        C28676v0 c28676v0;
        Object objM87133R;
        Object objM95647w;
        InterfaceC28601c1 interfaceC28601c1;
        String str7;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Iterator it;
        C28655q c28655q;
        float f15;
        C2314t c2314t2;
        float f16;
        C28676v0 c28676v1;
        String str8;
        String str9;
        ?? r10;
        ?? r15;
        boolean zM87157i;
        Object obj;
        Object objM87133R2;
        ?? r16;
        List<C22246d> listM63905m2;
        C22246d c22246dM63901i;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        C22246d c22246dM63908p;
        AbstractC18247a abstractC18247aM63806b;
        AbstractC18247a abstractC18247a;
        AbstractC18247a abstractC18247a2;
        C22246d c22246dM63908p2;
        TextResource textResourceM63807c;
        C22246d c22246dM63908p3;
        EnumC26195i enumC26195iM63809e;
        C22246d c22246dM63908p4;
        EnumC16313m0 enumC16313m0M63805a;
        C2314t c2314t3;
        float f17;
        ?? r17;
        C2314t c2314t4;
        ?? r18;
        int iHashCode3;
        C0213j c0213j3;
        C0209i c0209i3;
        ?? r19;
        int i18;
        Object objM87133R3;
        C28676v0 c28676v2;
        TextResource textResourceM63902j;
        C2314t c2314t5;
        ?? r110;
        ?? r111;
        C22259p c22259pM63906n;
        ?? r112;
        String str10;
        Object objM87133R4;
        Object obj2;
        ?? r113;
        float f18;
        C2306l c2306l = C2299e.f9107J;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1602048440);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(c22256m) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                str3 = str;
                i15 |= c28655q2.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87153g(str2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z13)) {
                    c23454a0 = null;
                    if (i19 != 0) {
                        str3 = null;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    fM63828N = m63828N(c22256m);
                    float fM63830P = m63830P(c22256m, m63829O(c28655q2, 0));
                    listM63905m = c22256m.m63905m();
                    if (listM63905m != null || listM63905m.isEmpty()) {
                        listM63905m = null;
                    }
                    c2314t = C2314t.f9131w;
                    f13 = fM63830P;
                    c28676v0 = C28635l.f115821a;
                    if (listM63905m == null) {
                        c28655q2.m87150e0(948905357);
                        c28655q2.m87173q(false);
                        f15 = f13;
                        str8 = str6;
                        c2314t2 = c2314t;
                        str9 = str3;
                        f16 = fM63828N;
                        r10 = 0;
                        c28676v1 = c28676v0;
                        r15 = 1;
                        r16 = c28655q2;
                    } else {
                        c28655q2.m87150e0(948905358);
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM95647w = objM87133R;
                            objM95647w = AbstractC31061c.m95647w(z4, c28655q2);
                        }
                        objM95647w = objM87133R;
                        interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                        C22949e c22949e = AbstractC22977m.f90651b;
                        float f19 = 8;
                        str7 = str6;
                        f14 = 1 * f19;
                        Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), fM63828N, f14, fM63828N, 2 * f19);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 6);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3397s);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        String str11 = str3;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        AbstractC22953f.m66715b(c28655q2, c2314t);
                        c28655q2.m87150e0(1398732972);
                        it = listM63905m.iterator();
                        c28655q = c28655q2;
                        while (it.hasNext()) {
                            C22246d c22246d = (C22246d) it.next();
                            C2314t c2314t6 = c2314t;
                            AbstractC18247a abstractC18247aM63806b2 = c22246d.getLegendColor();
                            TextResource textResourceM63807c2 = c22246d.getLegendText();
                            float f24 = fM63828N;
                            EnumC26195i enumC26195iM63809e2 = c22246d.getShape();
                            EnumC16313m0 enumC16313m0M63805a2 = c22246d.getIcon();
                            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t6, 0.0f, 0.0f, f14, 0.0f, 11);
                            boolean zM63817C = m63817C(interfaceC28601c1);
                            zM87157i = c28655q.m87157i(listM63905m);
                            Iterator it3 = it;
                            Object objM87133R5 = c28655q.m87133R();
                            if (!zM87157i || objM87133R5 == c28676v0) {
                                C0428i c0428i = new C0428i(listM63905m, 21);
                                c28655q.m87172p0(c0428i);
                                obj = c0428i;
                            } else {
                                obj = objM87133R5;
                            }
                            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3398t, zM63817C, (Function1) obj);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16546m(3, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            float f25 = f13;
                            String str12 = str7;
                            C28655q c28655q3 = c28655q;
                            AbstractC26194h.m77780n(modifierM44099b, abstractC18247aM63806b2, textResourceM63807c2, enumC26195iM63809e2, enumC16313m0M63805a2, 0L, (Function1) objM87133R2, null, c28655q3, 1572864, 160);
                            c28655q = c28655q3;
                            listM63905m = listM63905m;
                            it = it3;
                            interfaceC28601c1 = interfaceC28601c1;
                            fM63828N = f24;
                            c2314t = c2314t6;
                            c28676v0 = c28676v0;
                            str7 = str12;
                            f13 = f25;
                        }
                        f15 = f13;
                        c2314t2 = c2314t;
                        f16 = fM63828N;
                        c28676v1 = c28676v0;
                        str8 = str7;
                        str9 = str11;
                        r10 = 0;
                        r15 = 1;
                        AbstractC25012a.m73392y(c28655q, false, true, false);
                        r16 = c28655q;
                    }
                    listM63905m2 = c22256m.m63905m();
                    if (listM63905m2 != null || listM63905m2.isEmpty()) {
                        r16.m87150e0(1970305990);
                        c22246dM63901i = c22256m.getFirstLegendState();
                        if (c22246dM63901i == null) {
                            r16.m87150e0(949943547);
                            r16.m87173q(r10);
                            f17 = f16;
                            c2314t3 = c2314t2;
                            r17 = r16;
                        } else {
                            r16.m87150e0(949943548);
                            C22949e c22949e2 = AbstractC22977m.f90651b;
                            C2314t c2314t7 = c2314t2;
                            float f26 = 8;
                            float f27 = 2 * f26;
                            float f28 = ((float) r15) * f26;
                            float f29 = f16;
                            Modifier modifierM3397s2 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t7), f29, f28, f29, f27);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e2, c2306l, r16, 6);
                            iHashCode2 = Long.hashCode(r16.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM3397s2);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            r16.m87158i0();
                            if (r16.f115903S) {
                                r16.m87163l(c0213j2);
                            } else {
                                r16.m87178s0();
                            }
                            AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a2);
                            AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m2);
                            c0209i2 = C0217k.f732j;
                            if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N2);
                            AbstractC18247a abstractC18247aM63806b3 = c22246dM63901i.getLegendColor();
                            c22246dM63908p = c22256m.getSecondLegendState();
                            if (c22246dM63908p != null) {
                                abstractC18247aM63806b = c22246dM63908p.getLegendColor();
                            } else {
                                abstractC18247aM63806b = null;
                            }
                            AbstractC22953f.m66715b(r16, c2314t7);
                            abstractC18247a = abstractC18247aM63806b;
                            TextResource textResourceM63807c3 = c22246dM63901i.getLegendText();
                            EnumC26195i enumC26195iM63809e3 = c22246dM63901i.getShape();
                            EnumC16313m0 enumC16313m0M63805a3 = c22246dM63901i.getIcon();
                            ?? r29 = r16;
                            if (abstractC18247a != null) {
                                abstractC18247a2 = abstractC18247a;
                            } else {
                                abstractC18247a2 = null;
                            }
                            c22246dM63908p2 = c22256m.getSecondLegendState();
                            if (c22246dM63908p2 != null) {
                                textResourceM63807c = c22246dM63908p2.getLegendText();
                            } else {
                                textResourceM63807c = null;
                            }
                            c22246dM63908p3 = c22256m.getSecondLegendState();
                            if (c22246dM63908p3 != null || (enumC26195iM63809e = c22246dM63908p3.getShape()) == null) {
                                enumC26195iM63809e = EnumC26195i.CIRCLE;
                            }
                            EnumC26195i enumC26195i = enumC26195iM63809e;
                            c22246dM63908p4 = c22256m.getSecondLegendState();
                            if (c22246dM63908p4 != null) {
                                enumC16313m0M63805a = c22246dM63908p4.getIcon();
                            } else {
                                enumC16313m0M63805a = null;
                            }
                            c2314t3 = c2314t7;
                            f17 = f29;
                            AbstractC26194h.m77787u(abstractC18247aM63806b3, textResourceM63807c3, enumC26195iM63809e3, enumC16313m0M63805a3, abstractC18247a2, textResourceM63807c, enumC26195i, enumC16313m0M63805a, 0L, null, r29, 0, 768);
                            ?? r114 = r29;
                            r114.m87173q(r15);
                            r114.m87173q(r10);
                            r17 = r114;
                        }
                        r17.m87173q(r10);
                        c2314t4 = c2314t3;
                        r18 = r17;
                    } else {
                        r16.m87150e0(950947018);
                        r16.m87173q(r10);
                        f17 = f16;
                        c2314t4 = c2314t2;
                        r18 = r16;
                    }
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, AbstractC15676d.m44101d(c2314t4, str9)), r10, 1.3333334f), f15, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, r10);
                    iHashCode3 = Long.hashCode(r18.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = r18.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(r18, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    r18.m87158i0();
                    if (r18.f115903S) {
                        r18.m87163l(c0213j3);
                    } else {
                        r18.m87178s0();
                    }
                    AbstractC28683x.m87239G(r18, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(r18, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i3 = C0217k.f732j;
                    if (r18.f115903S || !AbstractC22676k.m65745e(r18.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(r18, C0217k.f726d, modifierM118962N3);
                    InterfaceC25312u interfaceC25312uM63903k = c22256m.getGraphItem();
                    C4004c5 c4004c5 = new C4004c5(3);
                    if ((i15 & 896) == 256) {
                        r19 = r15;
                    } else {
                        r19 = r10;
                    }
                    i18 = r19 | (r18.m87157i(c22256m) ? 1 : 0);
                    objM87133R3 = r18.m87133R();
                    if (i18 == 0) {
                        c28676v2 = c28676v1;
                        if (objM87133R3 == c28676v2) {
                        }
                        obj = objM87133R3;
                        AbstractC25303l.m74291r(interfaceC25312uM63903k, null, c4004c5, (Function1) obj, r18, 0, 2);
                        r18.m87173q(r15);
                        textResourceM63902j = c22256m.getFooterText();
                        if (textResourceM63902j == null) {
                            r18.m87150e0(951491470);
                            r18.m87173q(r10);
                            c2314t5 = c2314t4;
                        } else {
                            r18.m87150e0(951491471);
                            String strM21274h = AbstractC8693b.m21274h(textResourceM63902j, r18, r10);
                            ?? r24 = C38072d.f163053a;
                            long jM125382b1 = r24.m121949b(r18, 6).getWhite50();
                            C2886a c2886aM8421b = r24.m121952e(r18, 6).getB2();
                            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 2 * 8);
                            ?? r210 = r18;
                            c2314t5 = c2314t4;
                            AbstractC30795n.m94707h(strM21274h, modifierM3395q, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, r210, 0, 0, 196600);
                            r110 = r210;
                            r110.m87173q(r10);
                            c23454a0 = C23454a0.f92919a;
                        }
                        if (c23454a0 == null) {
                            r111 = r110;
                            r111.m87150e0(1970365903);
                            if (m63829O(r111, r10)) {
                                r111 = r18;
                                f18 = ((float) r15) * 8;
                            } else {
                                r111 = r18;
                                f18 = 8 * 2;
                            }
                            AbstractC25012a.m73389v(c2314t5, f18, r111, r10);
                        } else {
                            r111 = r110;
                            r111 = r18;
                            r111.m87150e0(1970355332);
                            r111.m87173q(r10);
                        }
                        c22259pM63906n = c22256m.getPlanProgressStatusState();
                        if (c22259pM63906n == null) {
                            r111.m87150e0(951956036);
                            r111.m87173q(r10);
                            str10 = str8;
                            r113 = r111;
                        } else {
                            r111.m87150e0(951956037);
                            float f34 = 8;
                            float f35 = 2 * f34;
                            ?? r211 = r111;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f35, c2314t5), null, null, null, null, 0L, 0L, null, r211, 6, 254);
                            String strM21274h2 = AbstractC8693b.m21274h(c22259pM63906n.getTitle(), r211, r10);
                            ?? r25 = C38072d.f163053a;
                            AbstractC30795n.m94707h(strM21274h2, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t5), f35, ((float) 0.5d) * f34), r25.m121949b(r211, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r25.m121952e(r211, 6).getB1(), null, r211, 48, 0, 196600);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22259pM63906n.getSubtitle(), r211, r10), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f35, 0.0f, 2), r25.m121949b(r211, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r25.m121952e(r211, 6).getB3(), null, r211, 48, 0, 196600);
                            r112 = r211;
                            InterfaceC25312u interfaceC25312uM63924a = c22259pM63906n.getProgressBreakdown();
                            str10 = str8;
                            C3029l c3029l = new C3029l(str10, 4);
                            objM87133R4 = r112.m87133R();
                            if (objM87133R4 == c28676v2) {
                                obj2 = objM87133R4;
                                C21714b c21714b = new C21714b(16);
                                r112.m87172p0(c21714b);
                                obj2 = c21714b;
                            }
                            obj2 = objM87133R4;
                            AbstractC25303l.m74291r(interfaceC25312uM63924a, null, c3029l, (Function1) obj2, r112, 3072, 2);
                            AbstractC25012a.m73389v(c2314t5, f35, r112, r10);
                            r113 = r112;
                        }
                        str5 = str9;
                        str4 = str10;
                        r14 = r113;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    obj = objM87133R3;
                    C3526n c3526n = new C3526n(function1, c22256m, 19);
                    r18.m87172p0(c3526n);
                    Object obj3 = c3526n;
                    obj3 = objM87133R3;
                    AbstractC25303l.m74291r(interfaceC25312uM63903k, null, c4004c5, (Function1) obj3, r18, 0, 2);
                    r18.m87173q(r15);
                    textResourceM63902j = c22256m.getFooterText();
                    if (textResourceM63902j == null) {
                        r18.m87150e0(951491470);
                        r18.m87173q(r10);
                        c2314t5 = c2314t4;
                    } else {
                        r18.m87150e0(951491471);
                        String strM21274h3 = AbstractC8693b.m21274h(textResourceM63902j, r18, r10);
                        ?? r26 = C38072d.f163053a;
                        long jM125382b2 = r26.m121949b(r18, 6).getWhite50();
                        C2886a c2886aM8421b2 = r26.m121952e(r18, 6).getB2();
                        Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 2 * 8);
                        ?? r212 = r18;
                        c2314t5 = c2314t4;
                        AbstractC30795n.m94707h(strM21274h3, modifierM3395q2, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b2, null, r212, 0, 0, 196600);
                        r110 = r212;
                        r110.m87173q(r10);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        r111 = r110;
                        r111.m87150e0(1970365903);
                        if (m63829O(r111, r10)) {
                            r111 = r18;
                            f18 = ((float) r15) * 8;
                        } else {
                            r111 = r18;
                            f18 = 8 * 2;
                        }
                        AbstractC25012a.m73389v(c2314t5, f18, r111, r10);
                    } else {
                        r111 = r110;
                        r111 = r18;
                        r111.m87150e0(1970355332);
                        r111.m87173q(r10);
                    }
                    c22259pM63906n = c22256m.getPlanProgressStatusState();
                    if (c22259pM63906n == null) {
                        r111.m87150e0(951956036);
                        r111.m87173q(r10);
                        str10 = str8;
                        r113 = r111;
                    } else {
                        r111.m87150e0(951956037);
                        float f36 = 8;
                        float f37 = 2 * f36;
                        ?? r213 = r111;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f37, c2314t5), null, null, null, null, 0L, 0L, null, r213, 6, 254);
                        String strM21274h4 = AbstractC8693b.m21274h(c22259pM63906n.getTitle(), r213, r10);
                        ?? r27 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h4, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t5), f37, ((float) 0.5d) * f36), r27.m121949b(r213, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r27.m121952e(r213, 6).getB1(), null, r213, 48, 0, 196600);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22259pM63906n.getSubtitle(), r213, r10), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f37, 0.0f, 2), r27.m121949b(r213, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r27.m121952e(r213, 6).getB3(), null, r213, 48, 0, 196600);
                        r112 = r213;
                        InterfaceC25312u interfaceC25312uM63924a2 = c22259pM63906n.getProgressBreakdown();
                        str10 = str8;
                        C3029l c3029l2 = new C3029l(str10, 4);
                        objM87133R4 = r112.m87133R();
                        if (objM87133R4 == c28676v2) {
                            obj2 = objM87133R4;
                            C21714b c21714b2 = new C21714b(16);
                            r112.m87172p0(c21714b2);
                            obj2 = c21714b2;
                        }
                        obj2 = objM87133R4;
                        AbstractC25303l.m74291r(interfaceC25312uM63924a2, null, c3029l2, (Function1) obj2, r112, 3072, 2);
                        AbstractC25012a.m73389v(c2314t5, f37, r112, r10);
                        r113 = r112;
                    }
                    str5 = str9;
                    str4 = str10;
                    r14 = r113;
                } else {
                    c28655q2.m87138X();
                    str4 = str2;
                    str5 = str3;
                    r14 = c28655q2;
                }
                c28677v1M87180u = r14.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16544k(c22256m, z4, function1, str5, str4, i13, i14);
                }
            }
            i15 |= 24576;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c23454a0 = null;
                if (i19 != 0) {
                    str3 = null;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                fM63828N = m63828N(c22256m);
                float fM63830P2 = m63830P(c22256m, m63829O(c28655q2, 0));
                listM63905m = c22256m.m63905m();
                if (listM63905m != null) {
                    listM63905m = null;
                } else {
                    listM63905m = null;
                }
                c2314t = C2314t.f9131w;
                f13 = fM63830P2;
                c28676v0 = C28635l.f115821a;
                if (listM63905m == null) {
                    c28655q2.m87150e0(948905357);
                    c28655q2.m87173q(false);
                    f15 = f13;
                    str8 = str6;
                    c2314t2 = c2314t;
                    str9 = str3;
                    f16 = fM63828N;
                    r10 = 0;
                    c28676v1 = c28676v0;
                    r15 = 1;
                    r16 = c28655q2;
                } else {
                    c28655q2.m87150e0(948905358);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM95647w = objM87133R;
                        objM95647w = AbstractC31061c.m95647w(z4, c28655q2);
                    }
                    objM95647w = objM87133R;
                    interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                    C22949e c22949e3 = AbstractC22977m.f90651b;
                    float f110 = 8;
                    str7 = str6;
                    f14 = 1 * f110;
                    Modifier modifierM3397s3 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), fM63828N, f14, fM63828N, 2 * f110);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e3, c2306l, c28655q2, 6);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3397s3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    String str13 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    AbstractC22953f.m66715b(c28655q2, c2314t);
                    c28655q2.m87150e0(1398732972);
                    it = listM63905m.iterator();
                    c28655q = c28655q2;
                    while (it.hasNext()) {
                        C22246d c22246d2 = (C22246d) it.next();
                        C2314t c2314t8 = c2314t;
                        AbstractC18247a abstractC18247aM63806b4 = c22246d2.getLegendColor();
                        TextResource textResourceM63807c4 = c22246d2.getLegendText();
                        float f210 = fM63828N;
                        EnumC26195i enumC26195iM63809e4 = c22246d2.getShape();
                        EnumC16313m0 enumC16313m0M63805a4 = c22246d2.getIcon();
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t8, 0.0f, 0.0f, f14, 0.0f, 11);
                        boolean zM63817C2 = m63817C(interfaceC28601c1);
                        zM87157i = c28655q.m87157i(listM63905m);
                        Iterator it4 = it;
                        Object objM87133R6 = c28655q.m87133R();
                        if (zM87157i) {
                            C0428i c0428i2 = new C0428i(listM63905m, 21);
                            c28655q.m87172p0(c0428i2);
                            obj = c0428i2;
                        } else {
                            C0428i c0428i3 = new C0428i(listM63905m, 21);
                            c28655q.m87172p0(c0428i3);
                            obj = c0428i3;
                        }
                        Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM3398t2, zM63817C2, (Function1) obj);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16546m(3, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        float f211 = f13;
                        String str14 = str7;
                        C28655q c28655q4 = c28655q;
                        AbstractC26194h.m77780n(modifierM44099b2, abstractC18247aM63806b4, textResourceM63807c4, enumC26195iM63809e4, enumC16313m0M63805a4, 0L, (Function1) objM87133R2, null, c28655q4, 1572864, 160);
                        c28655q = c28655q4;
                        listM63905m = listM63905m;
                        it = it4;
                        interfaceC28601c1 = interfaceC28601c1;
                        fM63828N = f210;
                        c2314t = c2314t8;
                        c28676v0 = c28676v0;
                        str7 = str14;
                        f13 = f211;
                    }
                    f15 = f13;
                    c2314t2 = c2314t;
                    f16 = fM63828N;
                    c28676v1 = c28676v0;
                    str8 = str7;
                    str9 = str13;
                    r10 = 0;
                    r15 = 1;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                    r16 = c28655q;
                }
                listM63905m2 = c22256m.m63905m();
                if (listM63905m2 != null) {
                    r16.m87150e0(1970305990);
                    c22246dM63901i = c22256m.getFirstLegendState();
                    if (c22246dM63901i == null) {
                        r16.m87150e0(949943547);
                        r16.m87173q(r10);
                        f17 = f16;
                        c2314t3 = c2314t2;
                        r17 = r16;
                    } else {
                        r16.m87150e0(949943548);
                        C22949e c22949e4 = AbstractC22977m.f90651b;
                        C2314t c2314t9 = c2314t2;
                        float f212 = 8;
                        float f213 = 2 * f212;
                        float f214 = ((float) r15) * f212;
                        float f215 = f16;
                        Modifier modifierM3397s4 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t9), f215, f214, f215, f213);
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e4, c2306l, r16, 6);
                        iHashCode2 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = r16.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(r16, modifierM3397s4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a4);
                        AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i2 = C0217k.f732j;
                        if (r16.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N5);
                        AbstractC18247a abstractC18247aM63806b5 = c22246dM63901i.getLegendColor();
                        c22246dM63908p = c22256m.getSecondLegendState();
                        if (c22246dM63908p != null) {
                            abstractC18247aM63806b = c22246dM63908p.getLegendColor();
                        } else {
                            abstractC18247aM63806b = null;
                        }
                        AbstractC22953f.m66715b(r16, c2314t9);
                        abstractC18247a = abstractC18247aM63806b;
                        TextResource textResourceM63807c5 = c22246dM63901i.getLegendText();
                        EnumC26195i enumC26195iM63809e5 = c22246dM63901i.getShape();
                        EnumC16313m0 enumC16313m0M63805a5 = c22246dM63901i.getIcon();
                        ?? r214 = r16;
                        if (abstractC18247a != null) {
                            abstractC18247a2 = abstractC18247a;
                        } else {
                            abstractC18247a2 = null;
                        }
                        c22246dM63908p2 = c22256m.getSecondLegendState();
                        if (c22246dM63908p2 != null) {
                            textResourceM63807c = c22246dM63908p2.getLegendText();
                        } else {
                            textResourceM63807c = null;
                        }
                        c22246dM63908p3 = c22256m.getSecondLegendState();
                        if (c22246dM63908p3 != null) {
                            enumC26195iM63809e = EnumC26195i.CIRCLE;
                        } else {
                            enumC26195iM63809e = EnumC26195i.CIRCLE;
                        }
                        EnumC26195i enumC26195i2 = enumC26195iM63809e;
                        c22246dM63908p4 = c22256m.getSecondLegendState();
                        if (c22246dM63908p4 != null) {
                            enumC16313m0M63805a = c22246dM63908p4.getIcon();
                        } else {
                            enumC16313m0M63805a = null;
                        }
                        c2314t3 = c2314t9;
                        f17 = f215;
                        AbstractC26194h.m77787u(abstractC18247aM63806b5, textResourceM63807c5, enumC26195iM63809e5, enumC16313m0M63805a5, abstractC18247a2, textResourceM63807c, enumC26195i2, enumC16313m0M63805a, 0L, null, r214, 0, 768);
                        ?? r115 = r214;
                        r115.m87173q(r15);
                        r115.m87173q(r10);
                        r17 = r115;
                    }
                    r17.m87173q(r10);
                    c2314t4 = c2314t3;
                    r18 = r17;
                } else {
                    r16.m87150e0(1970305990);
                    c22246dM63901i = c22256m.getFirstLegendState();
                    if (c22246dM63901i == null) {
                        r16.m87150e0(949943547);
                        r16.m87173q(r10);
                        f17 = f16;
                        c2314t3 = c2314t2;
                        r17 = r16;
                    } else {
                        r16.m87150e0(949943548);
                        C22949e c22949e5 = AbstractC22977m.f90651b;
                        C2314t c2314t10 = c2314t2;
                        float f216 = 8;
                        float f217 = 2 * f216;
                        float f218 = ((float) r15) * f216;
                        float f219 = f16;
                        Modifier modifierM3397s5 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t10), f219, f218, f219, f217);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e5, c2306l, r16, 6);
                        iHashCode2 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = r16.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(r16, modifierM3397s5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a5);
                        AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i2 = C0217k.f732j;
                        if (r16.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N6);
                        AbstractC18247a abstractC18247aM63806b6 = c22246dM63901i.getLegendColor();
                        c22246dM63908p = c22256m.getSecondLegendState();
                        if (c22246dM63908p != null) {
                            abstractC18247aM63806b = c22246dM63908p.getLegendColor();
                        } else {
                            abstractC18247aM63806b = null;
                        }
                        AbstractC22953f.m66715b(r16, c2314t10);
                        abstractC18247a = abstractC18247aM63806b;
                        TextResource textResourceM63807c6 = c22246dM63901i.getLegendText();
                        EnumC26195i enumC26195iM63809e6 = c22246dM63901i.getShape();
                        EnumC16313m0 enumC16313m0M63805a6 = c22246dM63901i.getIcon();
                        ?? r215 = r16;
                        if (abstractC18247a != null) {
                            abstractC18247a2 = abstractC18247a;
                        } else {
                            abstractC18247a2 = null;
                        }
                        c22246dM63908p2 = c22256m.getSecondLegendState();
                        if (c22246dM63908p2 != null) {
                            textResourceM63807c = c22246dM63908p2.getLegendText();
                        } else {
                            textResourceM63807c = null;
                        }
                        c22246dM63908p3 = c22256m.getSecondLegendState();
                        if (c22246dM63908p3 != null) {
                            enumC26195iM63809e = EnumC26195i.CIRCLE;
                        } else {
                            enumC26195iM63809e = EnumC26195i.CIRCLE;
                        }
                        EnumC26195i enumC26195i3 = enumC26195iM63809e;
                        c22246dM63908p4 = c22256m.getSecondLegendState();
                        if (c22246dM63908p4 != null) {
                            enumC16313m0M63805a = c22246dM63908p4.getIcon();
                        } else {
                            enumC16313m0M63805a = null;
                        }
                        c2314t3 = c2314t10;
                        f17 = f219;
                        AbstractC26194h.m77787u(abstractC18247aM63806b6, textResourceM63807c6, enumC26195iM63809e6, enumC16313m0M63805a6, abstractC18247a2, textResourceM63807c, enumC26195i3, enumC16313m0M63805a, 0L, null, r215, 0, 768);
                        ?? r116 = r215;
                        r116.m87173q(r15);
                        r116.m87173q(r10);
                        r17 = r116;
                    }
                    r17.m87173q(r10);
                    c2314t4 = c2314t3;
                    r18 = r17;
                }
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, AbstractC15676d.m44101d(c2314t4, str9)), r10, 1.3333334f), f15, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, r10);
                iHashCode3 = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = r18.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(r18, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j3);
                } else {
                    r18.m87178s0();
                }
                AbstractC28683x.m87239G(r18, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(r18, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (r18.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(r18, C0217k.f726d, modifierM118962N7);
                InterfaceC25312u interfaceC25312uM63903k2 = c22256m.getGraphItem();
                C4004c5 c4004c6 = new C4004c5(3);
                if ((i15 & 896) == 256) {
                    r19 = r15;
                } else {
                    r19 = r10;
                }
                i18 = r19 | (r18.m87157i(c22256m) ? 1 : 0);
                objM87133R3 = r18.m87133R();
                if (i18 == 0) {
                    c28676v2 = c28676v1;
                    if (objM87133R3 == c28676v2) {
                    }
                    obj3 = objM87133R3;
                    AbstractC25303l.m74291r(interfaceC25312uM63903k2, null, c4004c6, (Function1) obj3, r18, 0, 2);
                    r18.m87173q(r15);
                    textResourceM63902j = c22256m.getFooterText();
                    if (textResourceM63902j == null) {
                        r18.m87150e0(951491470);
                        r18.m87173q(r10);
                        c2314t5 = c2314t4;
                    } else {
                        r18.m87150e0(951491471);
                        String strM21274h5 = AbstractC8693b.m21274h(textResourceM63902j, r18, r10);
                        ?? r28 = C38072d.f163053a;
                        long jM125382b3 = r28.m121949b(r18, 6).getWhite50();
                        C2886a c2886aM8421b3 = r28.m121952e(r18, 6).getB2();
                        Modifier modifierM3395q3 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 2 * 8);
                        ?? r216 = r18;
                        c2314t5 = c2314t4;
                        AbstractC30795n.m94707h(strM21274h5, modifierM3395q3, jM125382b3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b3, null, r216, 0, 0, 196600);
                        r110 = r216;
                        r110.m87173q(r10);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        r111 = r110;
                        r111.m87150e0(1970365903);
                        if (m63829O(r111, r10)) {
                            r111 = r18;
                            f18 = ((float) r15) * 8;
                        } else {
                            r111 = r18;
                            f18 = 8 * 2;
                        }
                        AbstractC25012a.m73389v(c2314t5, f18, r111, r10);
                    } else {
                        r111 = r110;
                        r111 = r18;
                        r111.m87150e0(1970355332);
                        r111.m87173q(r10);
                    }
                    c22259pM63906n = c22256m.getPlanProgressStatusState();
                    if (c22259pM63906n == null) {
                        r111.m87150e0(951956036);
                        r111.m87173q(r10);
                        str10 = str8;
                        r113 = r111;
                    } else {
                        r111.m87150e0(951956037);
                        float f38 = 8;
                        float f39 = 2 * f38;
                        ?? r217 = r111;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f39, c2314t5), null, null, null, null, 0L, 0L, null, r217, 6, 254);
                        String strM21274h6 = AbstractC8693b.m21274h(c22259pM63906n.getTitle(), r217, r10);
                        ?? r218 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h6, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t5), f39, ((float) 0.5d) * f38), r218.m121949b(r217, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r218.m121952e(r217, 6).getB1(), null, r217, 48, 0, 196600);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22259pM63906n.getSubtitle(), r217, r10), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f39, 0.0f, 2), r218.m121949b(r217, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r218.m121952e(r217, 6).getB3(), null, r217, 48, 0, 196600);
                        r112 = r217;
                        InterfaceC25312u interfaceC25312uM63924a3 = c22259pM63906n.getProgressBreakdown();
                        str10 = str8;
                        C3029l c3029l3 = new C3029l(str10, 4);
                        objM87133R4 = r112.m87133R();
                        if (objM87133R4 == c28676v2) {
                            obj2 = objM87133R4;
                            C21714b c21714b3 = new C21714b(16);
                            r112.m87172p0(c21714b3);
                            obj2 = c21714b3;
                        }
                        obj2 = objM87133R4;
                        AbstractC25303l.m74291r(interfaceC25312uM63924a3, null, c3029l3, (Function1) obj2, r112, 3072, 2);
                        AbstractC25012a.m73389v(c2314t5, f39, r112, r10);
                        r113 = r112;
                    }
                    str5 = str9;
                    str4 = str10;
                    r14 = r113;
                } else {
                    c28676v2 = c28676v1;
                }
                obj3 = objM87133R3;
                C3526n c3526n2 = new C3526n(function1, c22256m, 19);
                r18.m87172p0(c3526n2);
                Object obj4 = c3526n2;
                obj4 = objM87133R3;
                AbstractC25303l.m74291r(interfaceC25312uM63903k2, null, c4004c6, (Function1) obj4, r18, 0, 2);
                r18.m87173q(r15);
                textResourceM63902j = c22256m.getFooterText();
                if (textResourceM63902j == null) {
                    r18.m87150e0(951491470);
                    r18.m87173q(r10);
                    c2314t5 = c2314t4;
                } else {
                    r18.m87150e0(951491471);
                    String strM21274h7 = AbstractC8693b.m21274h(textResourceM63902j, r18, r10);
                    ?? r219 = C38072d.f163053a;
                    long jM125382b4 = r219.m121949b(r18, 6).getWhite50();
                    C2886a c2886aM8421b4 = r219.m121952e(r18, 6).getB2();
                    Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 2 * 8);
                    ?? r2110 = r18;
                    c2314t5 = c2314t4;
                    AbstractC30795n.m94707h(strM21274h7, modifierM3395q4, jM125382b4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b4, null, r2110, 0, 0, 196600);
                    r110 = r2110;
                    r110.m87173q(r10);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    r111 = r110;
                    r111.m87150e0(1970365903);
                    if (m63829O(r111, r10)) {
                        r111 = r18;
                        f18 = ((float) r15) * 8;
                    } else {
                        r111 = r18;
                        f18 = 8 * 2;
                    }
                    AbstractC25012a.m73389v(c2314t5, f18, r111, r10);
                } else {
                    r111 = r110;
                    r111 = r18;
                    r111.m87150e0(1970355332);
                    r111.m87173q(r10);
                }
                c22259pM63906n = c22256m.getPlanProgressStatusState();
                if (c22259pM63906n == null) {
                    r111.m87150e0(951956036);
                    r111.m87173q(r10);
                    str10 = str8;
                    r113 = r111;
                } else {
                    r111.m87150e0(951956037);
                    float f310 = 8;
                    float f311 = 2 * f310;
                    ?? r2111 = r111;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f311, c2314t5), null, null, null, null, 0L, 0L, null, r2111, 6, 254);
                    String strM21274h8 = AbstractC8693b.m21274h(c22259pM63906n.getTitle(), r2111, r10);
                    ?? r2112 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h8, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t5), f311, ((float) 0.5d) * f310), r2112.m121949b(r2111, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2112.m121952e(r2111, 6).getB1(), null, r2111, 48, 0, 196600);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22259pM63906n.getSubtitle(), r2111, r10), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f311, 0.0f, 2), r2112.m121949b(r2111, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2112.m121952e(r2111, 6).getB3(), null, r2111, 48, 0, 196600);
                    r112 = r2111;
                    InterfaceC25312u interfaceC25312uM63924a4 = c22259pM63906n.getProgressBreakdown();
                    str10 = str8;
                    C3029l c3029l4 = new C3029l(str10, 4);
                    objM87133R4 = r112.m87133R();
                    if (objM87133R4 == c28676v2) {
                        obj2 = objM87133R4;
                        C21714b c21714b4 = new C21714b(16);
                        r112.m87172p0(c21714b4);
                        obj2 = c21714b4;
                    }
                    obj2 = objM87133R4;
                    AbstractC25303l.m74291r(interfaceC25312uM63924a4, null, c3029l4, (Function1) obj2, r112, 3072, 2);
                    AbstractC25012a.m73389v(c2314t5, f311, r112, r10);
                    r113 = r112;
                }
                str5 = str9;
                str4 = str10;
                r14 = r113;
            } else {
                c28655q2.m87138X();
                str4 = str2;
                str5 = str3;
                r14 = c28655q2;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(c22256m, z4, function1, str5, str4, i13, i14);
            }
        }
        i15 |= 3072;
        str3 = str;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87153g(str2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c23454a0 = null;
                if (i19 != 0) {
                    str3 = null;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                fM63828N = m63828N(c22256m);
                float fM63830P3 = m63830P(c22256m, m63829O(c28655q2, 0));
                listM63905m = c22256m.m63905m();
                if (listM63905m != null) {
                    listM63905m = null;
                } else {
                    listM63905m = null;
                }
                c2314t = C2314t.f9131w;
                f13 = fM63830P3;
                c28676v0 = C28635l.f115821a;
                if (listM63905m == null) {
                    c28655q2.m87150e0(948905357);
                    c28655q2.m87173q(false);
                    f15 = f13;
                    str8 = str6;
                    c2314t2 = c2314t;
                    str9 = str3;
                    f16 = fM63828N;
                    r10 = 0;
                    c28676v1 = c28676v0;
                    r15 = 1;
                    r16 = c28655q2;
                } else {
                    c28655q2.m87150e0(948905358);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM95647w = objM87133R;
                        objM95647w = AbstractC31061c.m95647w(z4, c28655q2);
                    }
                    objM95647w = objM87133R;
                    interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                    C22949e c22949e6 = AbstractC22977m.f90651b;
                    float f111 = 8;
                    str7 = str6;
                    f14 = 1 * f111;
                    Modifier modifierM3397s6 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), fM63828N, f14, fM63828N, 2 * f111);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e6, c2306l, c28655q2, 6);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3397s6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    String str15 = str3;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                    AbstractC22953f.m66715b(c28655q2, c2314t);
                    c28655q2.m87150e0(1398732972);
                    it = listM63905m.iterator();
                    c28655q = c28655q2;
                    while (it.hasNext()) {
                        C22246d c22246d3 = (C22246d) it.next();
                        C2314t c2314t11 = c2314t;
                        AbstractC18247a abstractC18247aM63806b7 = c22246d3.getLegendColor();
                        TextResource textResourceM63807c7 = c22246d3.getLegendText();
                        float f2110 = fM63828N;
                        EnumC26195i enumC26195iM63809e7 = c22246d3.getShape();
                        EnumC16313m0 enumC16313m0M63805a7 = c22246d3.getIcon();
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t11, 0.0f, 0.0f, f14, 0.0f, 11);
                        boolean zM63817C3 = m63817C(interfaceC28601c1);
                        zM87157i = c28655q.m87157i(listM63905m);
                        Iterator it5 = it;
                        Object objM87133R7 = c28655q.m87133R();
                        if (zM87157i) {
                            C0428i c0428i4 = new C0428i(listM63905m, 21);
                            c28655q.m87172p0(c0428i4);
                            obj = c0428i4;
                        } else {
                            C0428i c0428i5 = new C0428i(listM63905m, 21);
                            c28655q.m87172p0(c0428i5);
                            obj = c0428i5;
                        }
                        Modifier modifierM44099b3 = AbstractC15676d.m44099b(modifierM3398t3, zM63817C3, (Function1) obj);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16546m(3, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        float f2111 = f13;
                        String str16 = str7;
                        C28655q c28655q5 = c28655q;
                        AbstractC26194h.m77780n(modifierM44099b3, abstractC18247aM63806b7, textResourceM63807c7, enumC26195iM63809e7, enumC16313m0M63805a7, 0L, (Function1) objM87133R2, null, c28655q5, 1572864, 160);
                        c28655q = c28655q5;
                        listM63905m = listM63905m;
                        it = it5;
                        interfaceC28601c1 = interfaceC28601c1;
                        fM63828N = f2110;
                        c2314t = c2314t11;
                        c28676v0 = c28676v0;
                        str7 = str16;
                        f13 = f2111;
                    }
                    f15 = f13;
                    c2314t2 = c2314t;
                    f16 = fM63828N;
                    c28676v1 = c28676v0;
                    str8 = str7;
                    str9 = str15;
                    r10 = 0;
                    r15 = 1;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                    r16 = c28655q;
                }
                listM63905m2 = c22256m.m63905m();
                if (listM63905m2 != null) {
                    r16.m87150e0(1970305990);
                    c22246dM63901i = c22256m.getFirstLegendState();
                    if (c22246dM63901i == null) {
                        r16.m87150e0(949943547);
                        r16.m87173q(r10);
                        f17 = f16;
                        c2314t3 = c2314t2;
                        r17 = r16;
                    } else {
                        r16.m87150e0(949943548);
                        C22949e c22949e7 = AbstractC22977m.f90651b;
                        C2314t c2314t12 = c2314t2;
                        float f2112 = 8;
                        float f2113 = 2 * f2112;
                        float f2114 = ((float) r15) * f2112;
                        float f2115 = f16;
                        Modifier modifierM3397s7 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t12), f2115, f2114, f2115, f2113);
                        C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e7, c2306l, r16, 6);
                        iHashCode2 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = r16.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(r16, modifierM3397s7);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a7);
                        AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i2 = C0217k.f732j;
                        if (r16.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N9);
                        AbstractC18247a abstractC18247aM63806b8 = c22246dM63901i.getLegendColor();
                        c22246dM63908p = c22256m.getSecondLegendState();
                        if (c22246dM63908p != null) {
                            abstractC18247aM63806b = c22246dM63908p.getLegendColor();
                        } else {
                            abstractC18247aM63806b = null;
                        }
                        AbstractC22953f.m66715b(r16, c2314t12);
                        abstractC18247a = abstractC18247aM63806b;
                        TextResource textResourceM63807c8 = c22246dM63901i.getLegendText();
                        EnumC26195i enumC26195iM63809e8 = c22246dM63901i.getShape();
                        EnumC16313m0 enumC16313m0M63805a8 = c22246dM63901i.getIcon();
                        ?? r2113 = r16;
                        if (abstractC18247a != null) {
                            abstractC18247a2 = abstractC18247a;
                        } else {
                            abstractC18247a2 = null;
                        }
                        c22246dM63908p2 = c22256m.getSecondLegendState();
                        if (c22246dM63908p2 != null) {
                            textResourceM63807c = c22246dM63908p2.getLegendText();
                        } else {
                            textResourceM63807c = null;
                        }
                        c22246dM63908p3 = c22256m.getSecondLegendState();
                        if (c22246dM63908p3 != null) {
                            enumC26195iM63809e = EnumC26195i.CIRCLE;
                        } else {
                            enumC26195iM63809e = EnumC26195i.CIRCLE;
                        }
                        EnumC26195i enumC26195i4 = enumC26195iM63809e;
                        c22246dM63908p4 = c22256m.getSecondLegendState();
                        if (c22246dM63908p4 != null) {
                            enumC16313m0M63805a = c22246dM63908p4.getIcon();
                        } else {
                            enumC16313m0M63805a = null;
                        }
                        c2314t3 = c2314t12;
                        f17 = f2115;
                        AbstractC26194h.m77787u(abstractC18247aM63806b8, textResourceM63807c8, enumC26195iM63809e8, enumC16313m0M63805a8, abstractC18247a2, textResourceM63807c, enumC26195i4, enumC16313m0M63805a, 0L, null, r2113, 0, 768);
                        ?? r117 = r2113;
                        r117.m87173q(r15);
                        r117.m87173q(r10);
                        r17 = r117;
                    }
                    r17.m87173q(r10);
                    c2314t4 = c2314t3;
                    r18 = r17;
                } else {
                    r16.m87150e0(1970305990);
                    c22246dM63901i = c22256m.getFirstLegendState();
                    if (c22246dM63901i == null) {
                        r16.m87150e0(949943547);
                        r16.m87173q(r10);
                        f17 = f16;
                        c2314t3 = c2314t2;
                        r17 = r16;
                    } else {
                        r16.m87150e0(949943548);
                        C22949e c22949e8 = AbstractC22977m.f90651b;
                        C2314t c2314t13 = c2314t2;
                        float f2116 = 8;
                        float f2117 = 2 * f2116;
                        float f2118 = ((float) r15) * f2116;
                        float f2119 = f16;
                        Modifier modifierM3397s8 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t13), f2119, f2118, f2119, f2117);
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22949e8, c2306l, r16, 6);
                        iHashCode2 = Long.hashCode(r16.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = r16.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(r16, modifierM3397s8);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        r16.m87158i0();
                        if (r16.f115903S) {
                            r16.m87163l(c0213j2);
                        } else {
                            r16.m87178s0();
                        }
                        AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a8);
                        AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m10);
                        c0209i2 = C0217k.f732j;
                        if (r16.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N10);
                        AbstractC18247a abstractC18247aM63806b9 = c22246dM63901i.getLegendColor();
                        c22246dM63908p = c22256m.getSecondLegendState();
                        if (c22246dM63908p != null) {
                            abstractC18247aM63806b = c22246dM63908p.getLegendColor();
                        } else {
                            abstractC18247aM63806b = null;
                        }
                        AbstractC22953f.m66715b(r16, c2314t13);
                        abstractC18247a = abstractC18247aM63806b;
                        TextResource textResourceM63807c9 = c22246dM63901i.getLegendText();
                        EnumC26195i enumC26195iM63809e9 = c22246dM63901i.getShape();
                        EnumC16313m0 enumC16313m0M63805a9 = c22246dM63901i.getIcon();
                        ?? r2114 = r16;
                        if (abstractC18247a != null) {
                            abstractC18247a2 = abstractC18247a;
                        } else {
                            abstractC18247a2 = null;
                        }
                        c22246dM63908p2 = c22256m.getSecondLegendState();
                        if (c22246dM63908p2 != null) {
                            textResourceM63807c = c22246dM63908p2.getLegendText();
                        } else {
                            textResourceM63807c = null;
                        }
                        c22246dM63908p3 = c22256m.getSecondLegendState();
                        if (c22246dM63908p3 != null) {
                            enumC26195iM63809e = EnumC26195i.CIRCLE;
                        } else {
                            enumC26195iM63809e = EnumC26195i.CIRCLE;
                        }
                        EnumC26195i enumC26195i5 = enumC26195iM63809e;
                        c22246dM63908p4 = c22256m.getSecondLegendState();
                        if (c22246dM63908p4 != null) {
                            enumC16313m0M63805a = c22246dM63908p4.getIcon();
                        } else {
                            enumC16313m0M63805a = null;
                        }
                        c2314t3 = c2314t13;
                        f17 = f2119;
                        AbstractC26194h.m77787u(abstractC18247aM63806b9, textResourceM63807c9, enumC26195iM63809e9, enumC16313m0M63805a9, abstractC18247a2, textResourceM63807c, enumC26195i5, enumC16313m0M63805a, 0L, null, r2114, 0, 768);
                        ?? r118 = r2114;
                        r118.m87173q(r15);
                        r118.m87173q(r10);
                        r17 = r118;
                    }
                    r17.m87173q(r10);
                    c2314t4 = c2314t3;
                    r18 = r17;
                }
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, AbstractC15676d.m44101d(c2314t4, str9)), r10, 1.3333334f), f15, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, r10);
                iHashCode3 = Long.hashCode(r18.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = r18.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(r18, modifierM3396r3);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                r18.m87158i0();
                if (r18.f115903S) {
                    r18.m87163l(c0213j3);
                } else {
                    r18.m87178s0();
                }
                AbstractC28683x.m87239G(r18, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(r18, C0217k.f728f, interfaceC28653p1M87165m11);
                c0209i3 = C0217k.f732j;
                if (r18.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(r18, C0217k.f726d, modifierM118962N11);
                InterfaceC25312u interfaceC25312uM63903k3 = c22256m.getGraphItem();
                C4004c5 c4004c7 = new C4004c5(3);
                if ((i15 & 896) == 256) {
                    r19 = r15;
                } else {
                    r19 = r10;
                }
                i18 = r19 | (r18.m87157i(c22256m) ? 1 : 0);
                objM87133R3 = r18.m87133R();
                if (i18 == 0) {
                    c28676v2 = c28676v1;
                    if (objM87133R3 == c28676v2) {
                    }
                    obj4 = objM87133R3;
                    AbstractC25303l.m74291r(interfaceC25312uM63903k3, null, c4004c7, (Function1) obj4, r18, 0, 2);
                    r18.m87173q(r15);
                    textResourceM63902j = c22256m.getFooterText();
                    if (textResourceM63902j == null) {
                        r18.m87150e0(951491470);
                        r18.m87173q(r10);
                        c2314t5 = c2314t4;
                    } else {
                        r18.m87150e0(951491471);
                        String strM21274h9 = AbstractC8693b.m21274h(textResourceM63902j, r18, r10);
                        ?? r2115 = C38072d.f163053a;
                        long jM125382b5 = r2115.m121949b(r18, 6).getWhite50();
                        C2886a c2886aM8421b5 = r2115.m121952e(r18, 6).getB2();
                        Modifier modifierM3395q5 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 2 * 8);
                        ?? r2116 = r18;
                        c2314t5 = c2314t4;
                        AbstractC30795n.m94707h(strM21274h9, modifierM3395q5, jM125382b5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b5, null, r2116, 0, 0, 196600);
                        r110 = r2116;
                        r110.m87173q(r10);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        r111 = r110;
                        r111.m87150e0(1970365903);
                        if (m63829O(r111, r10)) {
                            r111 = r18;
                            f18 = ((float) r15) * 8;
                        } else {
                            r111 = r18;
                            f18 = 8 * 2;
                        }
                        AbstractC25012a.m73389v(c2314t5, f18, r111, r10);
                    } else {
                        r111 = r110;
                        r111 = r18;
                        r111.m87150e0(1970355332);
                        r111.m87173q(r10);
                    }
                    c22259pM63906n = c22256m.getPlanProgressStatusState();
                    if (c22259pM63906n == null) {
                        r111.m87150e0(951956036);
                        r111.m87173q(r10);
                        str10 = str8;
                        r113 = r111;
                    } else {
                        r111.m87150e0(951956037);
                        float f312 = 8;
                        float f313 = 2 * f312;
                        ?? r2117 = r111;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f313, c2314t5), null, null, null, null, 0L, 0L, null, r2117, 6, 254);
                        String strM21274h10 = AbstractC8693b.m21274h(c22259pM63906n.getTitle(), r2117, r10);
                        ?? r2118 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h10, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t5), f313, ((float) 0.5d) * f312), r2118.m121949b(r2117, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2118.m121952e(r2117, 6).getB1(), null, r2117, 48, 0, 196600);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22259pM63906n.getSubtitle(), r2117, r10), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f313, 0.0f, 2), r2118.m121949b(r2117, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2118.m121952e(r2117, 6).getB3(), null, r2117, 48, 0, 196600);
                        r112 = r2117;
                        InterfaceC25312u interfaceC25312uM63924a5 = c22259pM63906n.getProgressBreakdown();
                        str10 = str8;
                        C3029l c3029l5 = new C3029l(str10, 4);
                        objM87133R4 = r112.m87133R();
                        if (objM87133R4 == c28676v2) {
                            obj2 = objM87133R4;
                            C21714b c21714b5 = new C21714b(16);
                            r112.m87172p0(c21714b5);
                            obj2 = c21714b5;
                        }
                        obj2 = objM87133R4;
                        AbstractC25303l.m74291r(interfaceC25312uM63924a5, null, c3029l5, (Function1) obj2, r112, 3072, 2);
                        AbstractC25012a.m73389v(c2314t5, f313, r112, r10);
                        r113 = r112;
                    }
                    str5 = str9;
                    str4 = str10;
                    r14 = r113;
                } else {
                    c28676v2 = c28676v1;
                }
                obj4 = objM87133R3;
                C3526n c3526n3 = new C3526n(function1, c22256m, 19);
                r18.m87172p0(c3526n3);
                Object obj5 = c3526n3;
                obj5 = objM87133R3;
                AbstractC25303l.m74291r(interfaceC25312uM63903k3, null, c4004c7, (Function1) obj5, r18, 0, 2);
                r18.m87173q(r15);
                textResourceM63902j = c22256m.getFooterText();
                if (textResourceM63902j == null) {
                    r18.m87150e0(951491470);
                    r18.m87173q(r10);
                    c2314t5 = c2314t4;
                } else {
                    r18.m87150e0(951491471);
                    String strM21274h11 = AbstractC8693b.m21274h(textResourceM63902j, r18, r10);
                    ?? r2119 = C38072d.f163053a;
                    long jM125382b6 = r2119.m121949b(r18, 6).getWhite50();
                    C2886a c2886aM8421b6 = r2119.m121952e(r18, 6).getB2();
                    Modifier modifierM3395q6 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 2 * 8);
                    ?? r21110 = r18;
                    c2314t5 = c2314t4;
                    AbstractC30795n.m94707h(strM21274h11, modifierM3395q6, jM125382b6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b6, null, r21110, 0, 0, 196600);
                    r110 = r21110;
                    r110.m87173q(r10);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    r111 = r110;
                    r111.m87150e0(1970365903);
                    if (m63829O(r111, r10)) {
                        r111 = r18;
                        f18 = ((float) r15) * 8;
                    } else {
                        r111 = r18;
                        f18 = 8 * 2;
                    }
                    AbstractC25012a.m73389v(c2314t5, f18, r111, r10);
                } else {
                    r111 = r110;
                    r111 = r18;
                    r111.m87150e0(1970355332);
                    r111.m87173q(r10);
                }
                c22259pM63906n = c22256m.getPlanProgressStatusState();
                if (c22259pM63906n == null) {
                    r111.m87150e0(951956036);
                    r111.m87173q(r10);
                    str10 = str8;
                    r113 = r111;
                } else {
                    r111.m87150e0(951956037);
                    float f314 = 8;
                    float f315 = 2 * f314;
                    ?? r21111 = r111;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f315, c2314t5), null, null, null, null, 0L, 0L, null, r21111, 6, 254);
                    String strM21274h12 = AbstractC8693b.m21274h(c22259pM63906n.getTitle(), r21111, r10);
                    ?? r21112 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h12, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t5), f315, ((float) 0.5d) * f314), r21112.m121949b(r21111, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21112.m121952e(r21111, 6).getB1(), null, r21111, 48, 0, 196600);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22259pM63906n.getSubtitle(), r21111, r10), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f315, 0.0f, 2), r21112.m121949b(r21111, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21112.m121952e(r21111, 6).getB3(), null, r21111, 48, 0, 196600);
                    r112 = r21111;
                    InterfaceC25312u interfaceC25312uM63924a6 = c22259pM63906n.getProgressBreakdown();
                    str10 = str8;
                    C3029l c3029l6 = new C3029l(str10, 4);
                    objM87133R4 = r112.m87133R();
                    if (objM87133R4 == c28676v2) {
                        obj2 = objM87133R4;
                        C21714b c21714b6 = new C21714b(16);
                        r112.m87172p0(c21714b6);
                        obj2 = c21714b6;
                    }
                    obj2 = objM87133R4;
                    AbstractC25303l.m74291r(interfaceC25312uM63924a6, null, c3029l6, (Function1) obj2, r112, 3072, 2);
                    AbstractC25012a.m73389v(c2314t5, f315, r112, r10);
                    r113 = r112;
                }
                str5 = str9;
                str4 = str10;
                r14 = r113;
            } else {
                c28655q2.m87138X();
                str4 = str2;
                str5 = str3;
                r14 = c28655q2;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(c22256m, z4, function1, str5, str4, i13, i14);
            }
        }
        i15 |= 24576;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c23454a0 = null;
            if (i19 != 0) {
                str3 = null;
            }
            if (i16 != 0) {
                str6 = null;
            } else {
                str6 = str2;
            }
            fM63828N = m63828N(c22256m);
            float fM63830P4 = m63830P(c22256m, m63829O(c28655q2, 0));
            listM63905m = c22256m.m63905m();
            if (listM63905m != null) {
                listM63905m = null;
            } else {
                listM63905m = null;
            }
            c2314t = C2314t.f9131w;
            f13 = fM63830P4;
            c28676v0 = C28635l.f115821a;
            if (listM63905m == null) {
                c28655q2.m87150e0(948905357);
                c28655q2.m87173q(false);
                f15 = f13;
                str8 = str6;
                c2314t2 = c2314t;
                str9 = str3;
                f16 = fM63828N;
                r10 = 0;
                c28676v1 = c28676v0;
                r15 = 1;
                r16 = c28655q2;
            } else {
                c28655q2.m87150e0(948905358);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM95647w = objM87133R;
                    objM95647w = AbstractC31061c.m95647w(z4, c28655q2);
                }
                objM95647w = objM87133R;
                interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                C22949e c22949e9 = AbstractC22977m.f90651b;
                float f112 = 8;
                str7 = str6;
                f14 = 1 * f112;
                Modifier modifierM3397s9 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), fM63828N, f14, fM63828N, 2 * f112);
                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(c22949e9, c2306l, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3397s9);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                String str17 = str3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a9);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                AbstractC22953f.m66715b(c28655q2, c2314t);
                c28655q2.m87150e0(1398732972);
                it = listM63905m.iterator();
                c28655q = c28655q2;
                while (it.hasNext()) {
                    C22246d c22246d4 = (C22246d) it.next();
                    C2314t c2314t14 = c2314t;
                    AbstractC18247a abstractC18247aM63806b10 = c22246d4.getLegendColor();
                    TextResource textResourceM63807c10 = c22246d4.getLegendText();
                    float f21110 = fM63828N;
                    EnumC26195i enumC26195iM63809e10 = c22246d4.getShape();
                    EnumC16313m0 enumC16313m0M63805a10 = c22246d4.getIcon();
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t14, 0.0f, 0.0f, f14, 0.0f, 11);
                    boolean zM63817C4 = m63817C(interfaceC28601c1);
                    zM87157i = c28655q.m87157i(listM63905m);
                    Iterator it6 = it;
                    Object objM87133R8 = c28655q.m87133R();
                    if (zM87157i) {
                        C0428i c0428i6 = new C0428i(listM63905m, 21);
                        c28655q.m87172p0(c0428i6);
                        obj = c0428i6;
                    } else {
                        C0428i c0428i7 = new C0428i(listM63905m, 21);
                        c28655q.m87172p0(c0428i7);
                        obj = c0428i7;
                    }
                    Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM3398t4, zM63817C4, (Function1) obj);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16546m(3, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    float f21111 = f13;
                    String str18 = str7;
                    C28655q c28655q6 = c28655q;
                    AbstractC26194h.m77780n(modifierM44099b4, abstractC18247aM63806b10, textResourceM63807c10, enumC26195iM63809e10, enumC16313m0M63805a10, 0L, (Function1) objM87133R2, null, c28655q6, 1572864, 160);
                    c28655q = c28655q6;
                    listM63905m = listM63905m;
                    it = it6;
                    interfaceC28601c1 = interfaceC28601c1;
                    fM63828N = f21110;
                    c2314t = c2314t14;
                    c28676v0 = c28676v0;
                    str7 = str18;
                    f13 = f21111;
                }
                f15 = f13;
                c2314t2 = c2314t;
                f16 = fM63828N;
                c28676v1 = c28676v0;
                str8 = str7;
                str9 = str17;
                r10 = 0;
                r15 = 1;
                AbstractC25012a.m73392y(c28655q, false, true, false);
                r16 = c28655q;
            }
            listM63905m2 = c22256m.m63905m();
            if (listM63905m2 != null) {
                r16.m87150e0(1970305990);
                c22246dM63901i = c22256m.getFirstLegendState();
                if (c22246dM63901i == null) {
                    r16.m87150e0(949943547);
                    r16.m87173q(r10);
                    f17 = f16;
                    c2314t3 = c2314t2;
                    r17 = r16;
                } else {
                    r16.m87150e0(949943548);
                    C22949e c22949e10 = AbstractC22977m.f90651b;
                    C2314t c2314t15 = c2314t2;
                    float f21112 = 8;
                    float f21113 = 2 * f21112;
                    float f21114 = ((float) r15) * f21112;
                    float f21115 = f16;
                    Modifier modifierM3397s10 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t15), f21115, f21114, f21115, f21113);
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e10, c2306l, r16, 6);
                    iHashCode2 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = r16.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(r16, modifierM3397s10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a10);
                    AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i2 = C0217k.f732j;
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N13);
                    AbstractC18247a abstractC18247aM63806b11 = c22246dM63901i.getLegendColor();
                    c22246dM63908p = c22256m.getSecondLegendState();
                    if (c22246dM63908p != null) {
                        abstractC18247aM63806b = c22246dM63908p.getLegendColor();
                    } else {
                        abstractC18247aM63806b = null;
                    }
                    AbstractC22953f.m66715b(r16, c2314t15);
                    abstractC18247a = abstractC18247aM63806b;
                    TextResource textResourceM63807c11 = c22246dM63901i.getLegendText();
                    EnumC26195i enumC26195iM63809e11 = c22246dM63901i.getShape();
                    EnumC16313m0 enumC16313m0M63805a11 = c22246dM63901i.getIcon();
                    ?? r21113 = r16;
                    if (abstractC18247a != null) {
                        abstractC18247a2 = abstractC18247a;
                    } else {
                        abstractC18247a2 = null;
                    }
                    c22246dM63908p2 = c22256m.getSecondLegendState();
                    if (c22246dM63908p2 != null) {
                        textResourceM63807c = c22246dM63908p2.getLegendText();
                    } else {
                        textResourceM63807c = null;
                    }
                    c22246dM63908p3 = c22256m.getSecondLegendState();
                    if (c22246dM63908p3 != null) {
                        enumC26195iM63809e = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195iM63809e = EnumC26195i.CIRCLE;
                    }
                    EnumC26195i enumC26195i6 = enumC26195iM63809e;
                    c22246dM63908p4 = c22256m.getSecondLegendState();
                    if (c22246dM63908p4 != null) {
                        enumC16313m0M63805a = c22246dM63908p4.getIcon();
                    } else {
                        enumC16313m0M63805a = null;
                    }
                    c2314t3 = c2314t15;
                    f17 = f21115;
                    AbstractC26194h.m77787u(abstractC18247aM63806b11, textResourceM63807c11, enumC26195iM63809e11, enumC16313m0M63805a11, abstractC18247a2, textResourceM63807c, enumC26195i6, enumC16313m0M63805a, 0L, null, r21113, 0, 768);
                    ?? r119 = r21113;
                    r119.m87173q(r15);
                    r119.m87173q(r10);
                    r17 = r119;
                }
                r17.m87173q(r10);
                c2314t4 = c2314t3;
                r18 = r17;
            } else {
                r16.m87150e0(1970305990);
                c22246dM63901i = c22256m.getFirstLegendState();
                if (c22246dM63901i == null) {
                    r16.m87150e0(949943547);
                    r16.m87173q(r10);
                    f17 = f16;
                    c2314t3 = c2314t2;
                    r17 = r16;
                } else {
                    r16.m87150e0(949943548);
                    C22949e c22949e11 = AbstractC22977m.f90651b;
                    C2314t c2314t16 = c2314t2;
                    float f21116 = 8;
                    float f21117 = 2 * f21116;
                    float f21118 = ((float) r15) * f21116;
                    float f21119 = f16;
                    Modifier modifierM3397s11 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t16), f21119, f21118, f21119, f21117);
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(c22949e11, c2306l, r16, 6);
                    iHashCode2 = Long.hashCode(r16.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = r16.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(r16, modifierM3397s11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    r16.m87158i0();
                    if (r16.f115903S) {
                        r16.m87163l(c0213j2);
                    } else {
                        r16.m87178s0();
                    }
                    AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a11);
                    AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m14);
                    c0209i2 = C0217k.f732j;
                    if (r16.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N14);
                    AbstractC18247a abstractC18247aM63806b12 = c22246dM63901i.getLegendColor();
                    c22246dM63908p = c22256m.getSecondLegendState();
                    if (c22246dM63908p != null) {
                        abstractC18247aM63806b = c22246dM63908p.getLegendColor();
                    } else {
                        abstractC18247aM63806b = null;
                    }
                    AbstractC22953f.m66715b(r16, c2314t16);
                    abstractC18247a = abstractC18247aM63806b;
                    TextResource textResourceM63807c12 = c22246dM63901i.getLegendText();
                    EnumC26195i enumC26195iM63809e12 = c22246dM63901i.getShape();
                    EnumC16313m0 enumC16313m0M63805a12 = c22246dM63901i.getIcon();
                    ?? r21114 = r16;
                    if (abstractC18247a != null) {
                        abstractC18247a2 = abstractC18247a;
                    } else {
                        abstractC18247a2 = null;
                    }
                    c22246dM63908p2 = c22256m.getSecondLegendState();
                    if (c22246dM63908p2 != null) {
                        textResourceM63807c = c22246dM63908p2.getLegendText();
                    } else {
                        textResourceM63807c = null;
                    }
                    c22246dM63908p3 = c22256m.getSecondLegendState();
                    if (c22246dM63908p3 != null) {
                        enumC26195iM63809e = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195iM63809e = EnumC26195i.CIRCLE;
                    }
                    EnumC26195i enumC26195i7 = enumC26195iM63809e;
                    c22246dM63908p4 = c22256m.getSecondLegendState();
                    if (c22246dM63908p4 != null) {
                        enumC16313m0M63805a = c22246dM63908p4.getIcon();
                    } else {
                        enumC16313m0M63805a = null;
                    }
                    c2314t3 = c2314t16;
                    f17 = f21119;
                    AbstractC26194h.m77787u(abstractC18247aM63806b12, textResourceM63807c12, enumC26195iM63809e12, enumC16313m0M63805a12, abstractC18247a2, textResourceM63807c, enumC26195i7, enumC16313m0M63805a, 0L, null, r21114, 0, 768);
                    ?? r1110 = r21114;
                    r1110.m87173q(r15);
                    r1110.m87173q(r10);
                    r17 = r1110;
                }
                r17.m87173q(r10);
                c2314t4 = c2314t3;
                r18 = r17;
            }
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, AbstractC15676d.m44101d(c2314t4, str9)), r10, 1.3333334f), f15, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, r10);
            iHashCode3 = Long.hashCode(r18.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = r18.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(r18, modifierM3396r4);
            InterfaceC0221l.f734a.getClass();
            c0213j3 = C0217k.f724b;
            r18.m87158i0();
            if (r18.f115903S) {
                r18.m87163l(c0213j3);
            } else {
                r18.m87178s0();
            }
            AbstractC28683x.m87239G(r18, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(r18, C0217k.f728f, interfaceC28653p1M87165m15);
            c0209i3 = C0217k.f732j;
            if (r18.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r18, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(r18, C0217k.f726d, modifierM118962N15);
            InterfaceC25312u interfaceC25312uM63903k4 = c22256m.getGraphItem();
            C4004c5 c4004c8 = new C4004c5(3);
            if ((i15 & 896) == 256) {
                r19 = r15;
            } else {
                r19 = r10;
            }
            i18 = r19 | (r18.m87157i(c22256m) ? 1 : 0);
            objM87133R3 = r18.m87133R();
            if (i18 == 0) {
                c28676v2 = c28676v1;
                if (objM87133R3 == c28676v2) {
                }
                obj5 = objM87133R3;
                AbstractC25303l.m74291r(interfaceC25312uM63903k4, null, c4004c8, (Function1) obj5, r18, 0, 2);
                r18.m87173q(r15);
                textResourceM63902j = c22256m.getFooterText();
                if (textResourceM63902j == null) {
                    r18.m87150e0(951491470);
                    r18.m87173q(r10);
                    c2314t5 = c2314t4;
                } else {
                    r18.m87150e0(951491471);
                    String strM21274h13 = AbstractC8693b.m21274h(textResourceM63902j, r18, r10);
                    ?? r21115 = C38072d.f163053a;
                    long jM125382b7 = r21115.m121949b(r18, 6).getWhite50();
                    C2886a c2886aM8421b7 = r21115.m121952e(r18, 6).getB2();
                    Modifier modifierM3395q7 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 2 * 8);
                    ?? r21116 = r18;
                    c2314t5 = c2314t4;
                    AbstractC30795n.m94707h(strM21274h13, modifierM3395q7, jM125382b7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b7, null, r21116, 0, 0, 196600);
                    r110 = r21116;
                    r110.m87173q(r10);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    r111 = r110;
                    r111.m87150e0(1970365903);
                    if (m63829O(r111, r10)) {
                        r111 = r18;
                        f18 = ((float) r15) * 8;
                    } else {
                        r111 = r18;
                        f18 = 8 * 2;
                    }
                    AbstractC25012a.m73389v(c2314t5, f18, r111, r10);
                } else {
                    r111 = r110;
                    r111 = r18;
                    r111.m87150e0(1970355332);
                    r111.m87173q(r10);
                }
                c22259pM63906n = c22256m.getPlanProgressStatusState();
                if (c22259pM63906n == null) {
                    r111.m87150e0(951956036);
                    r111.m87173q(r10);
                    str10 = str8;
                    r113 = r111;
                } else {
                    r111.m87150e0(951956037);
                    float f316 = 8;
                    float f317 = 2 * f316;
                    ?? r21117 = r111;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f317, c2314t5), null, null, null, null, 0L, 0L, null, r21117, 6, 254);
                    String strM21274h14 = AbstractC8693b.m21274h(c22259pM63906n.getTitle(), r21117, r10);
                    ?? r21118 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h14, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t5), f317, ((float) 0.5d) * f316), r21118.m121949b(r21117, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21118.m121952e(r21117, 6).getB1(), null, r21117, 48, 0, 196600);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22259pM63906n.getSubtitle(), r21117, r10), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f317, 0.0f, 2), r21118.m121949b(r21117, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21118.m121952e(r21117, 6).getB3(), null, r21117, 48, 0, 196600);
                    r112 = r21117;
                    InterfaceC25312u interfaceC25312uM63924a7 = c22259pM63906n.getProgressBreakdown();
                    str10 = str8;
                    C3029l c3029l7 = new C3029l(str10, 4);
                    objM87133R4 = r112.m87133R();
                    if (objM87133R4 == c28676v2) {
                        obj2 = objM87133R4;
                        C21714b c21714b7 = new C21714b(16);
                        r112.m87172p0(c21714b7);
                        obj2 = c21714b7;
                    }
                    obj2 = objM87133R4;
                    AbstractC25303l.m74291r(interfaceC25312uM63924a7, null, c3029l7, (Function1) obj2, r112, 3072, 2);
                    AbstractC25012a.m73389v(c2314t5, f317, r112, r10);
                    r113 = r112;
                }
                str5 = str9;
                str4 = str10;
                r14 = r113;
            } else {
                c28676v2 = c28676v1;
            }
            obj5 = objM87133R3;
            C3526n c3526n4 = new C3526n(function1, c22256m, 19);
            r18.m87172p0(c3526n4);
            Object obj6 = c3526n4;
            obj6 = objM87133R3;
            AbstractC25303l.m74291r(interfaceC25312uM63903k4, null, c4004c8, (Function1) obj6, r18, 0, 2);
            r18.m87173q(r15);
            textResourceM63902j = c22256m.getFooterText();
            if (textResourceM63902j == null) {
                r18.m87150e0(951491470);
                r18.m87173q(r10);
                c2314t5 = c2314t4;
            } else {
                r18.m87150e0(951491471);
                String strM21274h15 = AbstractC8693b.m21274h(textResourceM63902j, r18, r10);
                ?? r21119 = C38072d.f163053a;
                long jM125382b8 = r21119.m121949b(r18, 6).getWhite50();
                C2886a c2886aM8421b8 = r21119.m121952e(r18, 6).getB2();
                Modifier modifierM3395q8 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t4), f17, 2 * 8);
                ?? r211110 = r18;
                c2314t5 = c2314t4;
                AbstractC30795n.m94707h(strM21274h15, modifierM3395q8, jM125382b8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b8, null, r211110, 0, 0, 196600);
                r110 = r211110;
                r110.m87173q(r10);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                r111 = r110;
                r111.m87150e0(1970365903);
                if (m63829O(r111, r10)) {
                    r111 = r18;
                    f18 = ((float) r15) * 8;
                } else {
                    r111 = r18;
                    f18 = 8 * 2;
                }
                AbstractC25012a.m73389v(c2314t5, f18, r111, r10);
            } else {
                r111 = r110;
                r111 = r18;
                r111.m87150e0(1970355332);
                r111.m87173q(r10);
            }
            c22259pM63906n = c22256m.getPlanProgressStatusState();
            if (c22259pM63906n == null) {
                r111.m87150e0(951956036);
                r111.m87173q(r10);
                str10 = str8;
                r113 = r111;
            } else {
                r111.m87150e0(951956037);
                float f318 = 8;
                float f319 = 2 * f318;
                ?? r211111 = r111;
                AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f319, c2314t5), null, null, null, null, 0L, 0L, null, r211111, 6, 254);
                String strM21274h16 = AbstractC8693b.m21274h(c22259pM63906n.getTitle(), r211111, r10);
                ?? r211112 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h16, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t5), f319, ((float) 0.5d) * f318), r211112.m121949b(r211111, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r211112.m121952e(r211111, 6).getB1(), null, r211111, 48, 0, 196600);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22259pM63906n.getSubtitle(), r211111, r10), AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t5), f319, 0.0f, 2), r211112.m121949b(r211111, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r211112.m121952e(r211111, 6).getB3(), null, r211111, 48, 0, 196600);
                r112 = r211111;
                InterfaceC25312u interfaceC25312uM63924a8 = c22259pM63906n.getProgressBreakdown();
                str10 = str8;
                C3029l c3029l8 = new C3029l(str10, 4);
                objM87133R4 = r112.m87133R();
                if (objM87133R4 == c28676v2) {
                    obj2 = objM87133R4;
                    C21714b c21714b8 = new C21714b(16);
                    r112.m87172p0(c21714b8);
                    obj2 = c21714b8;
                }
                obj2 = objM87133R4;
                AbstractC25303l.m74291r(interfaceC25312uM63924a8, null, c3029l8, (Function1) obj2, r112, 3072, 2);
                AbstractC25012a.m73389v(c2314t5, f319, r112, r10);
                r113 = r112;
            }
            str5 = str9;
            str4 = str10;
            r14 = r113;
        } else {
            c28655q2.m87138X();
            str4 = str2;
            str5 = str3;
            r14 = c28655q2;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16544k(c22256m, z4, function1, str5, str4, i13, i14);
        }
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m63817C(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    private static final void m63818D(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Modifier m63819E(InterfaceC22997s1 interfaceC22997s1, List list, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return interfaceC22997s1.mo66772c(applyIf, true, 1 / list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m63820F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m63818D(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Modifier m63821G(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1888496562);
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3407d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m63822H(Function1 function1, C22256m c22256m, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c22256m.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Modifier m63823I(String str, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1019373180);
        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * 8, 1), str);
        c28655q.m87173q(false);
        return modifierM44101d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m63824J(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m63825K(C22256m c22256m, boolean z4, Function1 function1, String str, String str2, int i13, int i14, Composer composer, int i15) {
        m63816B(c22256m, z4, function1, str, str2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final void m63826L(List<? extends InterfaceC25312u> list, float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(56040099);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        boolean z4 = true;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (list == null) {
            c28655q.m87150e0(-1251591742);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1251591741);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, f13, 0.0f, 10);
            float f14 = 2 * 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-170053833);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, null, c28655q, 0, 14);
                z4 = z4;
                c2314t = c2314t;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(z4);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11253n(list, f13, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m63827M(List list, float f13, int i13, Composer composer, int i14) {
        m63826L(list, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final float m63828N(C22256m c22256m) {
        return (c22256m.getUseTransparentBackground() ? 0 : 2) * 8;
    }

    /* JADX INFO: renamed from: O */
    private static final boolean m63829O(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
            c28655q.m87150e0(1184180979);
            c28655q.m87173q(false);
            return true;
        }
        c28655q.m87150e0(1423674653);
        boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
        c28655q.m87173q(false);
        return zIsFeatureEnabled;
    }

    /* JADX INFO: renamed from: P */
    private static final float m63830P(C22256m c22256m, boolean z4) {
        if (c22256m.getUseTransparentBackground()) {
            return 0 * 8;
        }
        return 8 * ((c22256m.getCheckmarkStyle() != null || z4) ? 1.0f : 2.0f);
    }

    /* JADX INFO: renamed from: q */
    public static final void m63847q(long j7, long j13, int i13, boolean z4, Composer composer, int i14) {
        int i15;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1253306311);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87151f(j7) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87151f(j13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            long j14 = z4 ? j13 : C17919x.f69636m;
            C13825t c13825tM48880a = AbstractC17269i.m48880a((float) 1.5d, C38072d.f163053a.m121949b(c28655q, 6).getWhite20());
            C33252i c33252i = AbstractC33253j.f138651a;
            float f13 = c13825tM48880a.f49345a;
            AbstractC17911t abstractC17911t = c13825tM48880a.f49346b;
            C2314t c2314t = C2314t.f9131w;
            float f14 = 4;
            Modifier modifierM44112a = AbstractC15680h.m44112a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(6 * f14, AbstractC15751g.m44456i(f13, c2314t, abstractC17911t, c33252i)), c33252i), j14, AbstractC17918w0.f69621a), true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44112a);
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
            if (z4) {
                c28655q.m87150e0(-943266866);
                z13 = true;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i15 >> 3) & 112) | 6), AbstractC8693b.m21275i("null", c28655q, 6), AbstractC1102d.m3419p(3 * f14, AbstractC15680h.m44112a(c2314t, true)), j7, c28655q, (i15 << 9) & 7168, 0);
                c28655q.m87173q(false);
            } else {
                z13 = true;
                c28655q.m87150e0(-942969917);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22251h(j7, j13, i13, z4, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m63848r(long j7, long j13, int i13, boolean z4, int i14, Composer composer, int i15) {
        m63847q(j7, j13, i13, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m63849s(C28971c c28971c, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1935112460);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c28971c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC28970b.m87981d(c28971c, false, c28655q, (i14 & 14) | 48, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(c28971c, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m63850t(C28971c c28971c, int i13, Composer composer, int i14) {
        m63849s(c28971c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0219  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x012a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    /* JADX WARN: Code duplicated, block: B:88:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    /* JADX WARN: Code duplicated, block: B:92:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x018a  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b0  */
    /* JADX INFO: renamed from: u */
    public static final void m63851u(Modifier modifier, final C22256m viewState, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        Function1 function2;
        int i17;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        Function1 function3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        final Function1 function4;
        String strM63911s;
        final String strConcat;
        float f13;
        C33252i c33252iM64090c;
        String strConcat2;
        boolean zM87147d;
        Object objM87133R;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        boolean zM87153g;
        Object objM87133R3;
        boolean z18;
        long jMo134584toComposableColorWaAFU9c;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(538546138);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i19 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C21714b(15);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    strM63911s = viewState.getTestTag();
                    if (strM63911s != null || strM63911s.length() <= 0) {
                        strM63911s = null;
                    }
                    if (viewState.getTitleStyle() == EnumC22247d0.WEEKLY_PLAN) {
                        c28655q2.m87150e0(2125502728);
                        strConcat = "PlanOverview_CircleProgress_".concat(AbstractC39421y.m125926K(AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0), " ", "_", false));
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(2125620807);
                        c28655q2.m87173q(false);
                        if (strM63911s != null) {
                            strConcat = strM63911s.concat("_ProgressIndicator");
                        } else {
                            strConcat = null;
                        }
                    }
                    boolean zBooleanValue = ((Boolean) c28655q2.m87161k(AbstractC31052b.m95598y())).booleanValue();
                    f13 = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.8f;
                    c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                    final float fM63828N = m63828N(viewState);
                    if (strM63911s != null) {
                        strConcat2 = strM63911s.concat("_GraphingCard");
                    } else {
                        strConcat2 = null;
                    }
                    Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, strConcat2);
                    zM87147d = c28655q2.m87147d(f13);
                    objM87133R = c28655q2.m87133R();
                    if (zM87147d || objM87133R == c28676v0) {
                        objM87133R = new C22249f(f13, 0);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM44101d, zBooleanValue, (Function1) objM87133R);
                    boolean zM87157i = c28655q2.m87157i(viewState);
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zM87157i;
                    objM87133R2 = c28655q2.m87133R();
                    if (z17 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C0134l(viewState, function4, 28);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM44099b, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    boolean zM63915w = viewState.getUseAiGradientBackground();
                    zM87153g = c28655q2.m87153g(c33252iM64090c);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g || objM87133R3 == c28676v0) {
                        objM87133R3 = new C0428i(c33252iM64090c, 20);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierMo3471e = AbstractC15676d.m44099b(modifierM3362g, zM63915w, (Function1) objM87133R3).mo3471e(modifier4);
                    c28655q2.m87150e0(2146807794);
                    if (!viewState.getUseAiGradientBackground() || viewState.getUseTransparentBackground()) {
                        z18 = false;
                        c28655q2.m87150e0(2146810757);
                        c28655q2.m87173q(false);
                        jMo134584toComposableColorWaAFU9c = C17919x.f69636m;
                    } else {
                        z18 = false;
                        if (m63829O(c28655q2, 0)) {
                            c28655q2.m87150e0(2146812833);
                            jMo134584toComposableColorWaAFU9c = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
                        } else {
                            c28655q2.m87150e0(2146814573);
                            jMo134584toComposableColorWaAFU9c = viewState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                            c28655q2.m87173q(false);
                        }
                    }
                    c28655q2.m87173q(z18);
                    final boolean z19 = z13;
                    final String str = strM63911s;
                    c28655q = c28655q2;
                    modifier2 = modifier4;
                    AbstractC31926e.m99375j(modifierMo3471e, null, jMo134584toComposableColorWaAFU9c, c33252iM64090c, null, null, 0.0f, AbstractC37817c.m121344e(2046618474, c28655q2, new InterfaceC4351m() { // from class: k71.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC22253j.m63856z(fM63828N, viewState, z19, function4, str, strConcat, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 12582912, 114);
                    z15 = z19;
                    function3 = function4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z15 = z13;
                    function3 = function2;
                }
                modifier3 = modifier2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14143e(i13, i14, 5, modifier3, viewState, function3, z15);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C21714b(15);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                strM63911s = viewState.getTestTag();
                if (strM63911s != null) {
                    strM63911s = null;
                } else {
                    strM63911s = null;
                }
                if (viewState.getTitleStyle() == EnumC22247d0.WEEKLY_PLAN) {
                    c28655q2.m87150e0(2125502728);
                    strConcat = "PlanOverview_CircleProgress_".concat(AbstractC39421y.m125926K(AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0), " ", "_", false));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(2125620807);
                    c28655q2.m87173q(false);
                    if (strM63911s != null) {
                        strConcat = strM63911s.concat("_ProgressIndicator");
                    } else {
                        strConcat = null;
                    }
                }
                boolean zBooleanValue2 = ((Boolean) c28655q2.m87161k(AbstractC31052b.m95598y())).booleanValue();
                f13 = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.8f;
                c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                final float fM63828N2 = m63828N(viewState);
                if (strM63911s != null) {
                    strConcat2 = strM63911s.concat("_GraphingCard");
                } else {
                    strConcat2 = null;
                }
                Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, strConcat2);
                zM87147d = c28655q2.m87147d(f13);
                objM87133R = c28655q2.m87133R();
                if (zM87147d) {
                    objM87133R = new C22249f(f13, 0);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C22249f(f13, 0);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM44101d2, zBooleanValue2, (Function1) objM87133R);
                boolean zM87157i2 = c28655q2.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zM87157i2;
                objM87133R2 = c28655q2.m87133R();
                if (z17) {
                    objM87133R2 = new C0134l(viewState, function4, 28);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0134l(viewState, function4, 28);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM44099b2, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                boolean zM63915w2 = viewState.getUseAiGradientBackground();
                zM87153g = c28655q2.m87153g(c33252iM64090c);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C0428i(c33252iM64090c, 20);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C0428i(c33252iM64090c, 20);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierMo3471e2 = AbstractC15676d.m44099b(modifierM3362g2, zM63915w2, (Function1) objM87133R3).mo3471e(modifier4);
                c28655q2.m87150e0(2146807794);
                if (viewState.getUseAiGradientBackground()) {
                    z18 = false;
                    c28655q2.m87150e0(2146810757);
                    c28655q2.m87173q(false);
                    jMo134584toComposableColorWaAFU9c = C17919x.f69636m;
                } else {
                    z18 = false;
                    c28655q2.m87150e0(2146810757);
                    c28655q2.m87173q(false);
                    jMo134584toComposableColorWaAFU9c = C17919x.f69636m;
                }
                c28655q2.m87173q(z18);
                final boolean z110 = z13;
                final String str2 = strM63911s;
                c28655q = c28655q2;
                modifier2 = modifier4;
                AbstractC31926e.m99375j(modifierMo3471e2, null, jMo134584toComposableColorWaAFU9c, c33252iM64090c, null, null, 0.0f, AbstractC37817c.m121344e(2046618474, c28655q2, new InterfaceC4351m() { // from class: k71.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22253j.m63856z(fM63828N2, viewState, z110, function4, str2, strConcat, (Composer) obj, iIntValue);
                    }
                }), c28655q, 12582912, 114);
                z15 = z110;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                function3 = function2;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 5, modifier3, viewState, function3, z15);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C21714b(15);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                strM63911s = viewState.getTestTag();
                if (strM63911s != null) {
                    strM63911s = null;
                } else {
                    strM63911s = null;
                }
                if (viewState.getTitleStyle() == EnumC22247d0.WEEKLY_PLAN) {
                    c28655q2.m87150e0(2125502728);
                    strConcat = "PlanOverview_CircleProgress_".concat(AbstractC39421y.m125926K(AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0), " ", "_", false));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(2125620807);
                    c28655q2.m87173q(false);
                    if (strM63911s != null) {
                        strConcat = strM63911s.concat("_ProgressIndicator");
                    } else {
                        strConcat = null;
                    }
                }
                boolean zBooleanValue3 = ((Boolean) c28655q2.m87161k(AbstractC31052b.m95598y())).booleanValue();
                f13 = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.8f;
                c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
                final float fM63828N3 = m63828N(viewState);
                if (strM63911s != null) {
                    strConcat2 = strM63911s.concat("_GraphingCard");
                } else {
                    strConcat2 = null;
                }
                Modifier modifierM44101d3 = AbstractC15676d.m44101d(c2314t, strConcat2);
                zM87147d = c28655q2.m87147d(f13);
                objM87133R = c28655q2.m87133R();
                if (zM87147d) {
                    objM87133R = new C22249f(f13, 0);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C22249f(f13, 0);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM44099b3 = AbstractC15676d.m44099b(modifierM44101d3, zBooleanValue3, (Function1) objM87133R);
                boolean zM87157i3 = c28655q2.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zM87157i3;
                objM87133R2 = c28655q2.m87133R();
                if (z17) {
                    objM87133R2 = new C0134l(viewState, function4, 28);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0134l(viewState, function4, 28);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM44099b3, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                boolean zM63915w3 = viewState.getUseAiGradientBackground();
                zM87153g = c28655q2.m87153g(c33252iM64090c);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C0428i(c33252iM64090c, 20);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C0428i(c33252iM64090c, 20);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierMo3471e3 = AbstractC15676d.m44099b(modifierM3362g3, zM63915w3, (Function1) objM87133R3).mo3471e(modifier4);
                c28655q2.m87150e0(2146807794);
                if (viewState.getUseAiGradientBackground()) {
                    z18 = false;
                    c28655q2.m87150e0(2146810757);
                    c28655q2.m87173q(false);
                    jMo134584toComposableColorWaAFU9c = C17919x.f69636m;
                } else {
                    z18 = false;
                    c28655q2.m87150e0(2146810757);
                    c28655q2.m87173q(false);
                    jMo134584toComposableColorWaAFU9c = C17919x.f69636m;
                }
                c28655q2.m87173q(z18);
                final boolean z111 = z13;
                final String str3 = strM63911s;
                c28655q = c28655q2;
                modifier2 = modifier4;
                AbstractC31926e.m99375j(modifierMo3471e3, null, jMo134584toComposableColorWaAFU9c, c33252iM64090c, null, null, 0.0f, AbstractC37817c.m121344e(2046618474, c28655q2, new InterfaceC4351m() { // from class: k71.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC22253j.m63856z(fM63828N3, viewState, z111, function4, str3, strConcat, (Composer) obj, iIntValue);
                    }
                }), c28655q, 12582912, 114);
                z15 = z111;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                function3 = function2;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 5, modifier3, viewState, function3, z15);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i19 != 0) {
                z13 = false;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C21714b(15);
                    c28655q2.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            strM63911s = viewState.getTestTag();
            if (strM63911s != null) {
                strM63911s = null;
            } else {
                strM63911s = null;
            }
            if (viewState.getTitleStyle() == EnumC22247d0.WEEKLY_PLAN) {
                c28655q2.m87150e0(2125502728);
                strConcat = "PlanOverview_CircleProgress_".concat(AbstractC39421y.m125926K(AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0), " ", "_", false));
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2125620807);
                c28655q2.m87173q(false);
                if (strM63911s != null) {
                    strConcat = strM63911s.concat("_ProgressIndicator");
                } else {
                    strConcat = null;
                }
            }
            boolean zBooleanValue4 = ((Boolean) c28655q2.m87161k(AbstractC31052b.m95598y())).booleanValue();
            f13 = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp * 0.8f;
            c33252iM64090c = C22411w.f87680a.m64535a().m64090c();
            final float fM63828N4 = m63828N(viewState);
            if (strM63911s != null) {
                strConcat2 = strM63911s.concat("_GraphingCard");
            } else {
                strConcat2 = null;
            }
            Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t, strConcat2);
            zM87147d = c28655q2.m87147d(f13);
            objM87133R = c28655q2.m87133R();
            if (zM87147d) {
                objM87133R = new C22249f(f13, 0);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C22249f(f13, 0);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM44101d4, zBooleanValue4, (Function1) objM87133R);
            boolean zM87157i4 = c28655q2.m87157i(viewState);
            if ((i15 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | zM87157i4;
            objM87133R2 = c28655q2.m87133R();
            if (z17) {
                objM87133R2 = new C0134l(viewState, function4, 28);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C0134l(viewState, function4, 28);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM44099b4, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            boolean zM63915w4 = viewState.getUseAiGradientBackground();
            zM87153g = c28655q2.m87153g(c33252iM64090c);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R3 = new C0428i(c33252iM64090c, 20);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C0428i(c33252iM64090c, 20);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierMo3471e4 = AbstractC15676d.m44099b(modifierM3362g4, zM63915w4, (Function1) objM87133R3).mo3471e(modifier4);
            c28655q2.m87150e0(2146807794);
            if (viewState.getUseAiGradientBackground()) {
                z18 = false;
                c28655q2.m87150e0(2146810757);
                c28655q2.m87173q(false);
                jMo134584toComposableColorWaAFU9c = C17919x.f69636m;
            } else {
                z18 = false;
                c28655q2.m87150e0(2146810757);
                c28655q2.m87173q(false);
                jMo134584toComposableColorWaAFU9c = C17919x.f69636m;
            }
            c28655q2.m87173q(z18);
            final boolean z112 = z13;
            final String str4 = strM63911s;
            c28655q = c28655q2;
            modifier2 = modifier4;
            AbstractC31926e.m99375j(modifierMo3471e4, null, jMo134584toComposableColorWaAFU9c, c33252iM64090c, null, null, 0.0f, AbstractC37817c.m121344e(2046618474, c28655q2, new InterfaceC4351m() { // from class: k71.g
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC22253j.m63856z(fM63828N4, viewState, z112, function4, str4, strConcat, (Composer) obj, iIntValue);
                }
            }), c28655q, 12582912, 114);
            z15 = z112;
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z15 = z13;
            function3 = function2;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14143e(i13, i14, 5, modifier3, viewState, function3, z15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m63852v(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Modifier m63853w(float f13, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1102d.m3424u(f13, applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m63854x(C22256m c22256m, Function1 function1) {
        C9598e c9598eM63899g = c22256m.getDestination();
        if (c9598eM63899g != null) {
            function1.invoke(c9598eM63899g);
        } else {
            function1.invoke(c22256m.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Modifier m63855y(C33252i c33252i, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1092a.m3357b(AbstractC37056f.m118994r(applyIf, c33252i), AbstractC15673b0.m43972A(), c33252i, 0.0f, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r29v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v11, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v3, types: [x81.d] */
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
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m63856z(float f13, C22256m c22256m, boolean z4, Function1 function1, String str, String str2, Composer composer, int i13) throws XmlPullParserException, IOException {
        ?? r10;
        ?? r14;
        float f14;
        int i14;
        ?? r15;
        C2886a c2886aM8420a;
        boolean z13;
        C23454a0 c23454a0;
        ?? r16;
        ?? r17;
        ?? r18;
        long jM95627c;
        ?? r19;
        C23454a0 c23454a1;
        ?? r110;
        ?? r111;
        ?? r112;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        boolean zM87135U = c28655q2.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a2 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q2.m87138X();
            return c23454a2;
        }
        C22957g c22957g = AbstractC22977m.f90652c;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
        int iHashCode = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j);
        } else {
            c28655q2.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
        float f15 = 8;
        Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f13, ((float) 2.75d) * f15, f13, 2 * f15);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f15, c2305k), C2299e.f9108K, c28655q2, 54);
        int iHashCode2 = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3397s);
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j);
        } else {
            c28655q2.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
        if (c22256m.getCircularProgress() == null) {
            c28655q2.m87150e0(1595042063);
            EnumC22244c enumC22244cM63897e = c22256m.getCheckmarkStyle();
            if (enumC22244cM63897e == null) {
                c28655q2.m87150e0(-2093303598);
                z18 = false;
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-2093303597);
                C38072d c38072d = C38072d.f163053a;
                m63847q(c38072d.m121949b(c28655q2, 6).getBrandBlack(), c38072d.m121949b(c28655q2, 6).getAccentAction(), AbstractC2875y.m8290c(c38072d), enumC22244cM63897e == EnumC22244c.ENABLED, c28655q2, 0);
                C28655q c28655q3 = c28655q2;
                z18 = false;
                c28655q3.m87173q(false);
                c28655q = c28655q3;
            }
            c28655q.m87173q(z18);
            r10 = z18;
            r14 = c28655q;
        } else {
            r10 = 0;
            c28655q2.m87150e0(-2092906146);
            c28655q2.m87173q(false);
            r14 = c28655q2;
        }
        C39274g c39274gM63904l = c22256m.getIcon();
        if (c39274gM63904l == null) {
            r14.m87150e0(-2092860546);
            r14.m87173q(r10);
            r15 = r10;
            i14 = 4;
        } else {
            r14.m87150e0(-2092860545);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c39274gM63904l.getIcon(), r14, 6);
            long jM125382b1 = C38072d.f163053a.m121949b(r14, 6).getWhite50();
            if (m63829O(r14, r10)) {
                float f16 = 4;
                f14 = f16 * f16;
            } else {
                f14 = 5 * 4;
            }
            i14 = 4;
            AbstractC15005f3.m43108b(c27430eM107874S, "", AbstractC1102d.m3419p(f14, c2314t), jM125382b1, r14, 48, 0);
            r15 = 0;
            r14.m87173q(false);
        }
        String strM21274h = AbstractC8693b.m21274h(c22256m.getTitle(), r14, r15);
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        Modifier modifierM44101d = AbstractC15676d.m44101d(new LayoutWeightElement(1.0f, true), str != null ? str.concat("_Title") : null);
        ?? r24 = C38072d.f163053a;
        long jM125430y = r24.m121949b(r14, 6).getBrandWhite();
        int i15 = a.f86763a[c22256m.getTitleStyle().ordinal()];
        if (i15 == 1) {
            r14.m87150e0(1595081542);
            c2886aM8420a = r24.m121952e(r14, 6).getB1();
            r14.m87173q(false);
        } else {
            if (i15 != 2) {
                throw AbstractC11895b.m32003v(1595078706, r14, false);
            }
            r14.m87150e0(-2092023235);
            if (c22256m.getPreserveLabelCasing()) {
                r14.m87150e0(1595085991);
                c2886aM8420a = r24.m121952e(r14, 6).getSh3();
                z17 = false;
                r14.m87173q(false);
            } else {
                z17 = false;
                if (m63829O(r14, 0)) {
                    r14.m87150e0(1595088455);
                    c2886aM8420a = r24.m121952e(r14, 6).getSh4();
                    r14.m87173q(false);
                } else {
                    r14.m87150e0(1595090438);
                    c2886aM8420a = r24.m121952e(r14, 6).getH4();
                    r14.m87173q(false);
                }
            }
            r14.m87173q(z17);
        }
        ?? r29 = r14;
        AbstractC30795n.m94707h(strM21274h, modifierM44101d, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, r29, 0, 0, 196600);
        ?? r113 = r29;
        C28582b c28582bM63898f = c22256m.getCircularProgress();
        if (c28582bM63898f == null) {
            r113.m87150e0(-2091684251);
            z13 = false;
            r113.m87173q(false);
            c23454a0 = null;
        } else {
            z13 = false;
            r113.m87150e0(-2091684250);
            AbstractC28586f.m86944i(AbstractC15676d.m44101d(c2314t, str2), c28582bM63898f, r113, 0, 0);
            r113.m87173q(false);
            c23454a0 = c23454a2;
        }
        if (c23454a0 == null) {
            r113.m87150e0(-2091396353);
            TextResource textResourceM63910r = c22256m.getSubText();
            if (textResourceM63910r == null) {
                r113.m87150e0(1003268824);
                r113.m87173q(z13);
                c23454a1 = null;
            } else {
                r113.m87150e0(1003268825);
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM63910r, r113, z13 ? 1 : 0);
                C2886a c2886aM8407E = r24.m121952e(r113, 6).getN8();
                if (c22256m.getCheckmarkStyle() == EnumC22244c.ENABLED) {
                    r113.m87150e0(-487229612);
                    jM95627c = r24.m121949b(r113, 6).getAccentAction();
                } else {
                    jM95627c = AbstractC31061c.m95627c(r113, -487228465, r24, r113, 6);
                }
                r113.m87173q(z13);
                AbstractC30795n.m94707h(strM21274h2, null, jM95627c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8407E, null, r113, 0, 0, 196602);
                ?? r114 = r113;
                r19 = 0;
                r114.m87173q(false);
                c23454a1 = c23454a2;
                r110 = r114;
            }
            if (c23454a1 == null) {
                r110.m87150e0(1003672569);
                if (c22256m.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() != TrendKey.NONE) {
                    r110.m87150e0(351997428);
                    if (m63829O(r110, r19)) {
                        r110.m87150e0(352032737);
                        if (((FeatureFlagChecker) r110.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.HOME_IA_CARET)) {
                            r110.m87150e0(-1789754744);
                            EnumC16313m0 enumC16313m0M63900h = c22256m.getEndIcon();
                            if (enumC16313m0M63900h == null) {
                                r110 = r113;
                                r19 = z13;
                                r110.m87150e0(352177785);
                                z16 = false;
                                r110.m87173q(false);
                            } else {
                                r110 = r113;
                                r19 = z13;
                                float f17 = i14;
                                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(r110, 352177786, enumC16313m0M63900h, r110, 6), null, AbstractC1136a.m3599a(AbstractC1102d.m3419p(f17 * f17, c2314t), "right caret"), r24.m121949b(r110, 6).getWhite50(), r110, 432, 0);
                                z16 = false;
                                r110.m87173q(false);
                            }
                            r110.m87173q(z16);
                            z15 = z16;
                        } else {
                            r110 = r113;
                            r19 = z13;
                            z15 = false;
                            r110.m87150e0(352777543);
                            r110.m87173q(false);
                        }
                        r110.m87173q(z15);
                        z14 = z15;
                    } else {
                        r110 = r113;
                        r19 = z13;
                        r110.m87150e0(352861553);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), r110, 6), null, AbstractC1136a.m3599a(AbstractC1102d.m3419p(5 * i14, c2314t), "right caret"), r24.m121949b(r110, 6).getBrandWhite(), r110, 432, 0);
                        z14 = false;
                        r110.m87173q(false);
                    }
                    r110.m87173q(z14);
                    r112 = z14;
                } else {
                    r110 = r113;
                    r19 = z13;
                    r110.m87150e0(353368775);
                    r110.m87173q(r19);
                    r112 = r19;
                }
                r110.m87173q(r112);
                r111 = r112;
            } else {
                r110 = r113;
                r19 = z13;
                r110.m87150e0(-1491655682);
                r110.m87173q(r19);
                r111 = r19;
            }
            r110.m87173q(r111);
            r17 = r110;
            r16 = r111;
        } else {
            r113.m87150e0(1595095899);
            r113.m87173q(z13);
            r17 = r113;
            r16 = z13;
        }
        r17.m87173q(true);
        if (c22256m.getUnlockTrendsCardState() != null) {
            r17.m87150e0(1435975600);
            m63849s(c22256m.getUnlockTrendsCardState(), r17, r16 == true ? 1 : 0);
            r17.m87173q(r16);
            r18 = r16;
        } else {
            r17.m87150e0(1436065531);
            m63816B(c22256m, z4, function1, str != null ? str.concat("_Graph") : null, str != null ? str.concat("_ProgressBar") : null, r17, 0, 0);
            r18 = 0;
            r17.m87173q(false);
        }
        m63826L(c22256m.m63909q(), f13, r17, r18);
        r17.m87173q(true);
        return c23454a2;
    }
}
