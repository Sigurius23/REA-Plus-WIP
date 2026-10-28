package l51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import b91.EnumC2888c;
import bf0.C3195g;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.models.GenericInteraction;
import e93.AbstractC12889b;
import java.util.WeakHashMap;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kx1.C22881b;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
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
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: l51.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001aK\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00018\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0016\"\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Ll51/g;", "", "n", "(Ll51/g;)F", "Landroidx/compose/ui/Modifier;", "modifier", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "scrollModifier", "", "drawBarBackground", "g", "(Landroidx/compose/ui/Modifier;Ll51/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "TOOLBAR_ICON_TOUCH_AREA", "b", "p", "()F", "HEADER_HORIZONTAL_INSET", "c", "getHEADER_IMAGE_FADE_START", "HEADER_IMAGE_FADE_START", "Li2/t;", "d", "Li2/t;", "o", "()Li2/t;", "CollapsableBarBrush", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23354d {

    /* JADX INFO: renamed from: a */
    private static final float f92568a;

    /* JADX INFO: renamed from: b */
    private static final float f92569b;

    /* JADX INFO: renamed from: c */
    private static final float f92570c = 0.55f;

    /* JADX INFO: renamed from: d */
    private static final AbstractC17911t f92571d = C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(3425186617L))), new C23465k(Float.valueOf(0.8f), new C17919x(AbstractC17918w0.m51517e(3005031465L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51515c(1646628)))}, 0.0f, 0.0f, 14);

    static {
        float f13 = 4;
        f92568a = 12 * f13;
        f92569b = ((float) 1.5d) * f13;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:107:0x0205  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x025b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0271  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:123:0x0307  */
    /* JADX WARN: Code duplicated, block: B:128:0x033e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0342  */
    /* JADX WARN: Code duplicated, block: B:132:0x034f  */
    /* JADX WARN: Code duplicated, block: B:134:0x035d  */
    /* JADX WARN: Code duplicated, block: B:137:0x036d  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x03df  */
    /* JADX WARN: Code duplicated, block: B:151:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:155:0x0404  */
    /* JADX WARN: Code duplicated, block: B:156:0x0460  */
    /* JADX WARN: Code duplicated, block: B:159:0x0474  */
    /* JADX WARN: Code duplicated, block: B:160:0x0479  */
    /* JADX WARN: Code duplicated, block: B:162:0x047d  */
    /* JADX WARN: Code duplicated, block: B:164:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:165:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:168:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:171:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:174:0x0505  */
    /* JADX WARN: Code duplicated, block: B:177:0x0513  */
    /* JADX WARN: Code duplicated, block: B:181:0x051d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0541  */
    /* JADX WARN: Code duplicated, block: B:185:0x0545  */
    /* JADX WARN: Code duplicated, block: B:188:0x0554  */
    /* JADX WARN: Code duplicated, block: B:190:0x0562  */
    /* JADX WARN: Code duplicated, block: B:195:0x0580  */
    /* JADX WARN: Code duplicated, block: B:196:0x0587  */
    /* JADX WARN: Code duplicated, block: B:198:0x058b  */
    /* JADX WARN: Code duplicated, block: B:200:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:203:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:204:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:206:0x0604  */
    /* JADX WARN: Code duplicated, block: B:209:0x0612  */
    /* JADX WARN: Code duplicated, block: B:213:0x061c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0639  */
    /* JADX WARN: Code duplicated, block: B:219:0x0646  */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0183  */
    /* JADX WARN: Code duplicated, block: B:88:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v7, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v9, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r1v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r29v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r29v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r8v57, types: [x81.d] */
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
    /* JADX INFO: renamed from: g */
    public static final void m67609g(Modifier modifier, C23357g viewState, Function1 function1, Modifier modifier2, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier3;
        int i15;
        Function1 function2;
        int i16;
        Modifier modifier4;
        int i17;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        Modifier modifier5;
        Function1 function3;
        Modifier modifier6;
        boolean z15;
        ?? r14;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        final Function1 function4;
        Modifier modifier7;
        boolean z16;
        float f13;
        C23357g.Companion companion;
        AbstractC22403o backgroundImage;
        boolean z17;
        Modifier modifierM3358c;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        float f14;
        C0209i c0209i4;
        C2314t c2314t2;
        char c3;
        AbstractC22403o abstractC22403o;
        C2886a c2886a;
        float f15;
        Object objM87133R;
        Object obj;
        Object objM87133R2;
        Object obj2;
        C0209i c0209i5;
        C0213j c0213j2;
        C2314t c2314t3;
        Modifier modifier8;
        float f16;
        ?? r15;
        int iHashCode2;
        C0213j c0213j3;
        C0209i c0209i6;
        int iHashCode3;
        final C23358h startButton;
        C0209i c0209i7;
        C0209i c0209i8;
        ?? r10;
        String strM21274h;
        boolean z18;
        C0213j c0213j4;
        final ?? r16;
        ?? r17;
        final C23358h endButton;
        Object obj3;
        int i24;
        String strM21274h2;
        ?? r18;
        int iHashCode4;
        ?? r19;
        EnumC2888c subtitleStyle;
        C2886a h7;
        boolean z19;
        float f17;
        ?? r24;
        int i25;
        Object obj4;
        Integer iconRes;
        boolean z24;
        boolean z25;
        final int i26;
        Object obj5;
        boolean z26;
        Object objM87133R3;
        Object obj6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(587501878);
        int i27 = i14 & 1;
        if (i27 != 0) {
            i15 = i13 | 6;
            modifier3 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier3 = modifier;
            i15 = (c28655q.m87153g(modifier3) ? 4 : 2) | i13;
        } else {
            modifier3 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    modifier4 = modifier2;
                    if (c28655q.m87153g(modifier4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        z13 = z4;
                        if (c28655q.m87155h(z13)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        c2314t = C2314t.f9131w;
                        if (i27 != 0) {
                            modifier3 = c2314t;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                obj6 = objM87133R3;
                                C22881b c22881b = new C22881b(27);
                                c28655q.m87172p0(c22881b);
                                obj6 = c22881b;
                            }
                            obj6 = objM87133R3;
                            function4 = (Function1) obj6;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            modifier7 = c2314t;
                        } else {
                            modifier7 = modifier4;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                        WeakHashMap weakHashMap = C22944c2.f90553v;
                        float density = C22949e.m66712e(c28655q).f90559f.m66705e().f151450b / interfaceC39171c.getDensity();
                        float fM67616n = m67616n(viewState);
                        f13 = 1.0f - fM67616n;
                        companion = C23357g.INSTANCE;
                        float fM67643a = companion.m67643a() + companion.m67647e(viewState.getSubtitle(), viewState.getSubtitleStyle(), viewState.getSubtitleStickOnScroll());
                        float fM67644b = ((companion.m67644b() - fM67643a) * f13) + fM67643a + density;
                        backgroundImage = viewState.getBackgroundImage();
                        Modifier modifierM3411h = AbstractC1102d.m3411h(fM67644b, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifier7)));
                        if (backgroundImage == null) {
                            c28655q.m87150e0(278021772);
                            modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            z17 = false;
                            c28655q.m87150e0(278121468);
                            c28655q.m87173q(false);
                            modifierM3358c = c2314t;
                        }
                        Modifier modifierMo3471e = modifierM3411h.mo3471e(modifierM3358c);
                        c2307m = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, z17);
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
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            f14 = f13;
                        } else {
                            f14 = f13;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                            if (backgroundImage == null && z16) {
                                c28655q.m87150e0(-656413673);
                                c2314t2 = c2314t;
                                c3 = 6;
                                AbstractC22989q.m66760a(AbstractC34132o.m107879c(fM67616n, AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, c2314t), f92571d, null, 0.0f, 6)), c28655q, 0);
                                c28655q.m87173q(false);
                            } else {
                                c2314t2 = c2314t;
                                c3 = 6;
                                c28655q.m87150e0(-656203214);
                                c28655q.m87173q(false);
                            }
                            if (backgroundImage == 0) {
                                abstractC22403o = null;
                            } else {
                                if (f14 > 0.01f) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (z26) {
                                    abstractC22403o = backgroundImage;
                                } else {
                                    abstractC22403o = null;
                                }
                            }
                            if (abstractC22403o == null) {
                                c28655q.m87150e0(-656109781);
                                c28655q.m87173q(false);
                                f16 = f14;
                                c2886a = null;
                                c0209i5 = c0209i3;
                                c0213j2 = c0213j;
                                modifier8 = modifier7;
                                c2314t3 = c2314t2;
                                f15 = 1.0f;
                                r15 = c28655q;
                            } else {
                                c28655q.m87150e0(-656109780);
                                c2886a = null;
                                C2314t c2314t4 = c2314t2;
                                float f18 = f14;
                                f15 = 1.0f;
                                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                                Modifier modifierM107879c = AbstractC34132o.m107879c(f18, AbstractC1102d.m3407d(1.0f, c2314t4));
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    obj = objM87133R;
                                    C22881b c22881b2 = new C22881b(28);
                                    c28655q.m87172p0(c22881b2);
                                    obj = c22881b2;
                                }
                                obj = objM87133R;
                                Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM107879c, (Function1) obj);
                                objM87133R2 = c28655q.m87133R();
                                obj2 = objM87133R2;
                                if (objM87133R2 == c28676v0) {
                                    C22881b c22881b3 = new C22881b(29);
                                    c28655q.m87172p0(c22881b3);
                                    obj2 = c22881b3;
                                }
                                c0209i5 = c0209i3;
                                c0213j2 = c0213j;
                                c2314t3 = c2314t4;
                                modifier8 = modifier7;
                                f16 = f18;
                                AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1125a.m3480c(modifierM3486a, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                                C28655q c28655q2 = c28655q;
                                c28655q2.m87173q(false);
                                r15 = c28655q2;
                            }
                            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                            iHashCode2 = Long.hashCode(r15.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierM3396r);
                            r15.m87158i0();
                            if (r15.f115903S) {
                                c0213j3 = c0213j2;
                                r15.m87163l(c0213j3);
                            } else {
                                c0213j3 = c0213j2;
                                r15.m87178s0();
                            }
                            AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a);
                            AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m2);
                            if (r15.f115903S && AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                                c0209i6 = c0209i5;
                            } else {
                                c0209i6 = c0209i5;
                                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                            }
                            AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N2);
                            Modifier modifierM3411h2 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                            iHashCode3 = Long.hashCode(r15.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, modifierM3411h2);
                            r15.m87158i0();
                            if (r15.f115903S) {
                                r15.m87163l(c0213j3);
                            } else {
                                r15.m87178s0();
                            }
                            AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a);
                            AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m3);
                            if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                            }
                            AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N3);
                            startButton = viewState.getStartButton();
                            if (startButton.getIconRes() != null) {
                                r15.m87150e0(748152407);
                                Modifier modifierM3419p = AbstractC1102d.m3419p(f92568a, c2314t3);
                                C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                                boolean zM87157i = r15.m87157i(startButton);
                                if ((i15 & 896) == 256) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z25 = zM87157i | z24;
                                Object objM87133R4 = r15.m87133R();
                                if (!z25 || objM87133R4 == c28676v0) {
                                    i26 = 0;
                                    InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: l51.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i26) {
                                                case 0:
                                                    return AbstractC23354d.m67613k(startButton, function4);
                                                default:
                                                    return AbstractC23354d.m67614l(startButton, function4);
                                            }
                                        }
                                    };
                                    r15.m87172p0(interfaceC4339a);
                                    obj5 = interfaceC4339a;
                                } else {
                                    i26 = 0;
                                    obj5 = objM87133R4;
                                }
                                ?? r25 = i26;
                                c0209i7 = c0209i2;
                                c0209i8 = c0209i6;
                                AbstractC27242b1.m82092d(c27270o, "Back", modifierM3419p, null, (InterfaceC4339a) obj5, r15, 432, 8);
                                r15.m87173q(r25);
                                r10 = r25;
                            } else {
                                c0209i7 = c0209i2;
                                c0209i8 = c0209i6;
                                r10 = 0;
                                r15.m87150e0(748814443);
                                AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                            }
                            strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                            if (strM21274h.length() > 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                r15.m87150e0(749045052);
                                ?? r26 = C38072d.f163053a;
                                ?? r29 = r15;
                                r16 = 1;
                                c0213j4 = c0213j3;
                                AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r26.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r26.m121952e(r15, 6).getH4(), null, r29, 48, 0, 196600);
                                ?? r110 = r29;
                                r110.m87173q(false);
                                r17 = r110;
                            } else {
                                c0213j4 = c0213j3;
                                r16 = 1;
                                r15.m87150e0(749324300);
                                r15.m87173q(false);
                                r17 = r15;
                            }
                            endButton = viewState.getEndButton();
                            if (endButton != null) {
                                iconRes = endButton.getIconRes();
                            } else {
                                obj3 = c2886a;
                            }
                            if (obj3 != null) {
                                r17.m87150e0(749462591);
                                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f92568a, c2314t3);
                                C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                                boolean zM87157i2 = r17.m87157i(endButton);
                                if ((i15 & 896) == 256) {
                                    obj3 = iconRes;
                                    r24 = r16;
                                } else {
                                    obj3 = iconRes;
                                    r24 = 0;
                                }
                                i25 = r24 | (zM87157i2 ? 1 : 0);
                                Object objM87133R5 = r17.m87133R();
                                obj4 = objM87133R5;
                                if (i25 == 0 || objM87133R5 == c28676v0) {
                                    InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a() { // from class: l51.c
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (r16) {
                                                case 0:
                                                    return AbstractC23354d.m67613k(endButton, function4);
                                                default:
                                                    return AbstractC23354d.m67614l(endButton, function4);
                                            }
                                        }
                                    };
                                    r17.m87172p0(interfaceC4339a2);
                                    obj4 = interfaceC4339a2;
                                }
                                AbstractC27242b1.m82092d(c27270o2, "Action", modifierM3419p2, null, (InterfaceC4339a) obj4, r17, 432, 8);
                                i24 = 0;
                                r17.m87173q(false);
                            } else {
                                obj3 = iconRes;
                                i24 = 0;
                                r17.m87150e0(749963179);
                                AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                            }
                            r17.m87173q(r16);
                            strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                            if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                                r17.m87150e0(553718039);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode4 = Long.hashCode(r17.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m4 = r17.m87165m();
                                Modifier modifierM118962N4 = AbstractC37056f.m118962N(r17, modifierM3409f);
                                r17.m87158i0();
                                if (r17.f115903S) {
                                    r17.m87163l(c0213j4);
                                } else {
                                    r17.m87178s0();
                                }
                                AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d2);
                                AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m4);
                                if (r17.f115903S || !AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode4))) {
                                    AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                                }
                                AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N4);
                                r19 = C38072d.f163053a;
                                long brandWhite = r19.m121949b(r17, 6).getBrandWhite();
                                subtitleStyle = viewState.getSubtitleStyle();
                                if (subtitleStyle != null) {
                                    h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                                } else {
                                    h7 = c2886a;
                                }
                                if (h7 == null) {
                                    r17.m87150e0(-1038233573);
                                    h7 = r19.m121952e(r17, 6).getH2();
                                    z19 = false;
                                } else {
                                    z19 = false;
                                    r17.m87150e0(-1038236084);
                                }
                                r17.m87173q(z19);
                                C2886a c2886a2 = h7;
                                Modifier modifierM3398t = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                                if (viewState.getSubtitleStickOnScroll()) {
                                    f17 = 1.0f;
                                } else {
                                    f17 = f16;
                                }
                                ?? r210 = r17;
                                AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a2, null, r210, 0, 0, 196600);
                                ?? r111 = r210;
                                r111.m87173q(r16);
                                r111.m87173q(false);
                                r18 = r111;
                            } else {
                                r17.m87150e0(554575995);
                                if (1.0f <= 0.0d) {
                                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                                }
                                AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                                r17.m87173q(false);
                                r18 = r17;
                            }
                            r18.m87173q(r16);
                            r18.m87173q(r16);
                            function3 = function4;
                            z15 = z16;
                            modifier5 = modifier3;
                            modifier6 = modifier8;
                            r14 = r18;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        if (backgroundImage == null) {
                            c2314t2 = c2314t;
                            c3 = 6;
                            c28655q.m87150e0(-656203214);
                            c28655q.m87173q(false);
                        } else {
                            c2314t2 = c2314t;
                            c3 = 6;
                            c28655q.m87150e0(-656203214);
                            c28655q.m87173q(false);
                        }
                        if (backgroundImage == 0) {
                            abstractC22403o = null;
                        } else {
                            if (f14 > 0.01f) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z26) {
                                abstractC22403o = backgroundImage;
                            } else {
                                abstractC22403o = null;
                            }
                        }
                        if (abstractC22403o == null) {
                            c28655q.m87150e0(-656109781);
                            c28655q.m87173q(false);
                            f16 = f14;
                            c2886a = null;
                            c0209i5 = c0209i3;
                            c0213j2 = c0213j;
                            modifier8 = modifier7;
                            c2314t3 = c2314t2;
                            f15 = 1.0f;
                            r15 = c28655q;
                        } else {
                            c28655q.m87150e0(-656109780);
                            c2886a = null;
                            C2314t c2314t5 = c2314t2;
                            float f19 = f14;
                            f15 = 1.0f;
                            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                            Modifier modifierM107879c2 = AbstractC34132o.m107879c(f19, AbstractC1102d.m3407d(1.0f, c2314t5));
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                obj = objM87133R;
                                C22881b c22881b4 = new C22881b(28);
                                c28655q.m87172p0(c22881b4);
                                obj = c22881b4;
                            }
                            obj = objM87133R;
                            Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM107879c2, (Function1) obj);
                            objM87133R2 = c28655q.m87133R();
                            obj2 = objM87133R2;
                            if (objM87133R2 == c28676v0) {
                                C22881b c22881b5 = new C22881b(29);
                                c28655q.m87172p0(c22881b5);
                                obj2 = c22881b5;
                            }
                            c0209i5 = c0209i3;
                            c0213j2 = c0213j;
                            c2314t3 = c2314t5;
                            modifier8 = modifier7;
                            f16 = f19;
                            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, AbstractC1125a.m3480c(modifierM3486a2, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                            C28655q c28655q3 = c28655q;
                            c28655q3.m87173q(false);
                            r15 = c28655q3;
                        }
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                        iHashCode2 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, modifierM3396r2);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            c0213j3 = c0213j2;
                            r15.m87163l(c0213j3);
                        } else {
                            c0213j3 = c0213j2;
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m5);
                        if (r15.f115903S) {
                            c0209i6 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        } else {
                            c0209i6 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N5);
                        Modifier modifierM3411h3 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                        iHashCode3 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = r15.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(r15, modifierM3411h3);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j3);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m6);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N6);
                        startButton = viewState.getStartButton();
                        if (startButton.getIconRes() != null) {
                            r15.m87150e0(748152407);
                            Modifier modifierM3419p3 = AbstractC1102d.m3419p(f92568a, c2314t3);
                            C27270o c27270o3 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            boolean zM87157i3 = r15.m87157i(startButton);
                            if ((i15 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = zM87157i3 | z24;
                            Object objM87133R6 = r15.m87133R();
                            if (z25) {
                                i26 = 0;
                                InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC23354d.m67613k(startButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(startButton, function4);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a3);
                                obj5 = interfaceC4339a3;
                            } else {
                                i26 = 0;
                                InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC23354d.m67613k(startButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(startButton, function4);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a4);
                                obj5 = interfaceC4339a4;
                            }
                            ?? r27 = i26;
                            c0209i7 = c0209i2;
                            c0209i8 = c0209i6;
                            AbstractC27242b1.m82092d(c27270o3, "Back", modifierM3419p3, null, (InterfaceC4339a) obj5, r15, 432, 8);
                            r15.m87173q(r27);
                            r10 = r27;
                        } else {
                            c0209i7 = c0209i2;
                            c0209i8 = c0209i6;
                            r10 = 0;
                            r15.m87150e0(748814443);
                            AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                        }
                        strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                        if (strM21274h.length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            r15.m87150e0(749045052);
                            ?? r28 = C38072d.f163053a;
                            ?? r211 = r15;
                            r16 = 1;
                            c0213j4 = c0213j3;
                            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r28.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r28.m121952e(r15, 6).getH4(), null, r211, 48, 0, 196600);
                            ?? r112 = r211;
                            r112.m87173q(false);
                            r17 = r112;
                        } else {
                            c0213j4 = c0213j3;
                            r16 = 1;
                            r15.m87150e0(749324300);
                            r15.m87173q(false);
                            r17 = r15;
                        }
                        endButton = viewState.getEndButton();
                        if (endButton != null) {
                            iconRes = endButton.getIconRes();
                        } else {
                            obj3 = c2886a;
                        }
                        if (obj3 != null) {
                            r17.m87150e0(749462591);
                            Modifier modifierM3419p4 = AbstractC1102d.m3419p(f92568a, c2314t3);
                            C27270o c27270o4 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            boolean zM87157i4 = r17.m87157i(endButton);
                            if ((i15 & 896) == 256) {
                                obj3 = iconRes;
                                r24 = r16;
                            } else {
                                obj3 = iconRes;
                                r24 = 0;
                            }
                            i25 = r24 | (zM87157i4 ? 1 : 0);
                            Object objM87133R7 = r17.m87133R();
                            obj4 = objM87133R7;
                            if (i25 == 0) {
                                InterfaceC4339a interfaceC4339a5 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (r16) {
                                            case 0:
                                                return AbstractC23354d.m67613k(endButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(endButton, function4);
                                        }
                                    }
                                };
                                r17.m87172p0(interfaceC4339a5);
                                obj4 = interfaceC4339a5;
                            } else {
                                InterfaceC4339a interfaceC4339a6 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (r16) {
                                            case 0:
                                                return AbstractC23354d.m67613k(endButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(endButton, function4);
                                        }
                                    }
                                };
                                r17.m87172p0(interfaceC4339a6);
                                obj4 = interfaceC4339a6;
                            }
                            AbstractC27242b1.m82092d(c27270o4, "Action", modifierM3419p4, null, (InterfaceC4339a) obj4, r17, 432, 8);
                            i24 = 0;
                            r17.m87173q(false);
                        } else {
                            obj3 = iconRes;
                            i24 = 0;
                            r17.m87150e0(749963179);
                            AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                        }
                        r17.m87173q(r16);
                        strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                        if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                            r17.m87150e0(553718039);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode4 = Long.hashCode(r17.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = r17.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(r17, modifierM3409f2);
                            r17.m87158i0();
                            if (r17.f115903S) {
                                r17.m87163l(c0213j4);
                            } else {
                                r17.m87178s0();
                            }
                            AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m7);
                            if (r17.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                            }
                            AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N7);
                            r19 = C38072d.f163053a;
                            long brandWhite2 = r19.m121949b(r17, 6).getBrandWhite();
                            subtitleStyle = viewState.getSubtitleStyle();
                            if (subtitleStyle != null) {
                                h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                            } else {
                                h7 = c2886a;
                            }
                            if (h7 == null) {
                                r17.m87150e0(-1038233573);
                                h7 = r19.m121952e(r17, 6).getH2();
                                z19 = false;
                            } else {
                                z19 = false;
                                r17.m87150e0(-1038236084);
                            }
                            r17.m87173q(z19);
                            C2886a c2886a3 = h7;
                            Modifier modifierM3398t2 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                            if (viewState.getSubtitleStickOnScroll()) {
                                f17 = 1.0f;
                            } else {
                                f17 = f16;
                            }
                            ?? r212 = r17;
                            AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t2), brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, null, r212, 0, 0, 196600);
                            ?? r113 = r212;
                            r113.m87173q(r16);
                            r113.m87173q(false);
                            r18 = r113;
                        } else {
                            r17.m87150e0(554575995);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(r16);
                        r18.m87173q(r16);
                        function3 = function4;
                        z15 = z16;
                        modifier5 = modifier3;
                        modifier6 = modifier8;
                        r14 = r18;
                    } else {
                        c28655q.m87138X();
                        modifier5 = modifier3;
                        function3 = function2;
                        modifier6 = modifier4;
                        z15 = z13;
                        r14 = c28655q;
                    }
                    c28677v1M87180u = r14.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3195g(modifier5, viewState, function3, modifier6, z15, i13, i14, 24);
                    }
                }
                i15 |= 24576;
                z13 = z4;
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            obj6 = objM87133R3;
                            C22881b c22881b6 = new C22881b(27);
                            c28655q.m87172p0(c22881b6);
                            obj6 = c22881b6;
                        }
                        obj6 = objM87133R3;
                        function4 = (Function1) obj6;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier4;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    WeakHashMap weakHashMap2 = C22944c2.f90553v;
                    float density2 = C22949e.m66712e(c28655q).f90559f.m66705e().f151450b / interfaceC39171c2.getDensity();
                    float fM67616n2 = m67616n(viewState);
                    f13 = 1.0f - fM67616n2;
                    companion = C23357g.INSTANCE;
                    float fM67643a2 = companion.m67643a() + companion.m67647e(viewState.getSubtitle(), viewState.getSubtitleStyle(), viewState.getSubtitleStickOnScroll());
                    float fM67644b2 = ((companion.m67644b() - fM67643a2) * f13) + fM67643a2 + density2;
                    backgroundImage = viewState.getBackgroundImage();
                    Modifier modifierM3411h4 = AbstractC1102d.m3411h(fM67644b2, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifier7)));
                    if (backgroundImage == null) {
                        c28655q.m87150e0(278021772);
                        modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(278121468);
                        c28655q.m87173q(false);
                        modifierM3358c = c2314t;
                    }
                    Modifier modifierMo3471e2 = modifierM3411h4.mo3471e(modifierM3358c);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, z17);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                        if (backgroundImage == null) {
                            c2314t2 = c2314t;
                            c3 = 6;
                            c28655q.m87150e0(-656203214);
                            c28655q.m87173q(false);
                        } else {
                            c2314t2 = c2314t;
                            c3 = 6;
                            c28655q.m87150e0(-656203214);
                            c28655q.m87173q(false);
                        }
                        if (backgroundImage == 0) {
                            abstractC22403o = null;
                        } else {
                            if (f14 > 0.01f) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z26) {
                                abstractC22403o = backgroundImage;
                            } else {
                                abstractC22403o = null;
                            }
                        }
                        if (abstractC22403o == null) {
                            c28655q.m87150e0(-656109781);
                            c28655q.m87173q(false);
                            f16 = f14;
                            c2886a = null;
                            c0209i5 = c0209i3;
                            c0213j2 = c0213j;
                            modifier8 = modifier7;
                            c2314t3 = c2314t2;
                            f15 = 1.0f;
                            r15 = c28655q;
                        } else {
                            c28655q.m87150e0(-656109780);
                            c2886a = null;
                            C2314t c2314t6 = c2314t2;
                            float f110 = f14;
                            f15 = 1.0f;
                            AbstractC26165a abstractC26165aM64500i3 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                            Modifier modifierM107879c3 = AbstractC34132o.m107879c(f110, AbstractC1102d.m3407d(1.0f, c2314t6));
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                obj = objM87133R;
                                C22881b c22881b7 = new C22881b(28);
                                c28655q.m87172p0(c22881b7);
                                obj = c22881b7;
                            }
                            obj = objM87133R;
                            Modifier modifierM3486a3 = AbstractC1127a.m3486a(modifierM107879c3, (Function1) obj);
                            objM87133R2 = c28655q.m87133R();
                            obj2 = objM87133R2;
                            if (objM87133R2 == c28676v0) {
                                C22881b c22881b8 = new C22881b(29);
                                c28655q.m87172p0(c22881b8);
                                obj2 = c22881b8;
                            }
                            c0209i5 = c0209i3;
                            c0213j2 = c0213j;
                            c2314t3 = c2314t6;
                            modifier8 = modifier7;
                            f16 = f110;
                            AbstractC29125c.m88522c(abstractC26165aM64500i3, null, AbstractC1125a.m3480c(modifierM3486a3, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                            C28655q c28655q4 = c28655q;
                            c28655q4.m87173q(false);
                            r15 = c28655q4;
                        }
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density2, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                        iHashCode2 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = r15.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(r15, modifierM3396r3);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            c0213j3 = c0213j2;
                            r15.m87163l(c0213j3);
                        } else {
                            c0213j3 = c0213j2;
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a3);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m9);
                        if (r15.f115903S) {
                            c0209i6 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        } else {
                            c0209i6 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N9);
                        Modifier modifierM3411h5 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                        iHashCode3 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = r15.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(r15, modifierM3411h5);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j3);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m10);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N10);
                        startButton = viewState.getStartButton();
                        if (startButton.getIconRes() != null) {
                            r15.m87150e0(748152407);
                            Modifier modifierM3419p5 = AbstractC1102d.m3419p(f92568a, c2314t3);
                            C27270o c27270o5 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            boolean zM87157i5 = r15.m87157i(startButton);
                            if ((i15 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = zM87157i5 | z24;
                            Object objM87133R8 = r15.m87133R();
                            if (z25) {
                                i26 = 0;
                                InterfaceC4339a interfaceC4339a7 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC23354d.m67613k(startButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(startButton, function4);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a7);
                                obj5 = interfaceC4339a7;
                            } else {
                                i26 = 0;
                                InterfaceC4339a interfaceC4339a8 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC23354d.m67613k(startButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(startButton, function4);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a8);
                                obj5 = interfaceC4339a8;
                            }
                            ?? r213 = i26;
                            c0209i7 = c0209i2;
                            c0209i8 = c0209i6;
                            AbstractC27242b1.m82092d(c27270o5, "Back", modifierM3419p5, null, (InterfaceC4339a) obj5, r15, 432, 8);
                            r15.m87173q(r213);
                            r10 = r213;
                        } else {
                            c0209i7 = c0209i2;
                            c0209i8 = c0209i6;
                            r10 = 0;
                            r15.m87150e0(748814443);
                            AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                        }
                        strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                        if (strM21274h.length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            r15.m87150e0(749045052);
                            ?? r214 = C38072d.f163053a;
                            ?? r215 = r15;
                            r16 = 1;
                            c0213j4 = c0213j3;
                            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r214.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r214.m121952e(r15, 6).getH4(), null, r215, 48, 0, 196600);
                            ?? r114 = r215;
                            r114.m87173q(false);
                            r17 = r114;
                        } else {
                            c0213j4 = c0213j3;
                            r16 = 1;
                            r15.m87150e0(749324300);
                            r15.m87173q(false);
                            r17 = r15;
                        }
                        endButton = viewState.getEndButton();
                        if (endButton != null) {
                            iconRes = endButton.getIconRes();
                        } else {
                            obj3 = c2886a;
                        }
                        if (obj3 != null) {
                            r17.m87150e0(749462591);
                            Modifier modifierM3419p6 = AbstractC1102d.m3419p(f92568a, c2314t3);
                            C27270o c27270o6 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            boolean zM87157i6 = r17.m87157i(endButton);
                            if ((i15 & 896) == 256) {
                                obj3 = iconRes;
                                r24 = r16;
                            } else {
                                obj3 = iconRes;
                                r24 = 0;
                            }
                            i25 = r24 | (zM87157i6 ? 1 : 0);
                            Object objM87133R9 = r17.m87133R();
                            obj4 = objM87133R9;
                            if (i25 == 0) {
                                InterfaceC4339a interfaceC4339a9 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (r16) {
                                            case 0:
                                                return AbstractC23354d.m67613k(endButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(endButton, function4);
                                        }
                                    }
                                };
                                r17.m87172p0(interfaceC4339a9);
                                obj4 = interfaceC4339a9;
                            } else {
                                InterfaceC4339a interfaceC4339a10 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (r16) {
                                            case 0:
                                                return AbstractC23354d.m67613k(endButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(endButton, function4);
                                        }
                                    }
                                };
                                r17.m87172p0(interfaceC4339a10);
                                obj4 = interfaceC4339a10;
                            }
                            AbstractC27242b1.m82092d(c27270o6, "Action", modifierM3419p6, null, (InterfaceC4339a) obj4, r17, 432, 8);
                            i24 = 0;
                            r17.m87173q(false);
                        } else {
                            obj3 = iconRes;
                            i24 = 0;
                            r17.m87150e0(749963179);
                            AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                        }
                        r17.m87173q(r16);
                        strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                        if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                            r17.m87150e0(553718039);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode4 = Long.hashCode(r17.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = r17.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(r17, modifierM3409f3);
                            r17.m87158i0();
                            if (r17.f115903S) {
                                r17.m87163l(c0213j4);
                            } else {
                                r17.m87178s0();
                            }
                            AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m11);
                            if (r17.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                            }
                            AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N11);
                            r19 = C38072d.f163053a;
                            long brandWhite3 = r19.m121949b(r17, 6).getBrandWhite();
                            subtitleStyle = viewState.getSubtitleStyle();
                            if (subtitleStyle != null) {
                                h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                            } else {
                                h7 = c2886a;
                            }
                            if (h7 == null) {
                                r17.m87150e0(-1038233573);
                                h7 = r19.m121952e(r17, 6).getH2();
                                z19 = false;
                            } else {
                                z19 = false;
                                r17.m87150e0(-1038236084);
                            }
                            r17.m87173q(z19);
                            C2886a c2886a4 = h7;
                            Modifier modifierM3398t3 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                            if (viewState.getSubtitleStickOnScroll()) {
                                f17 = 1.0f;
                            } else {
                                f17 = f16;
                            }
                            ?? r216 = r17;
                            AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t3), brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, r216, 0, 0, 196600);
                            ?? r115 = r216;
                            r115.m87173q(r16);
                            r115.m87173q(false);
                            r18 = r115;
                        } else {
                            r17.m87150e0(554575995);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(r16);
                        r18.m87173q(r16);
                        function3 = function4;
                        z15 = z16;
                        modifier5 = modifier3;
                        modifier6 = modifier8;
                        r14 = r18;
                    } else {
                        f14 = f13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    if (backgroundImage == null) {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    }
                    if (backgroundImage == 0) {
                        abstractC22403o = null;
                    } else {
                        if (f14 > 0.01f) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (z26) {
                            abstractC22403o = backgroundImage;
                        } else {
                            abstractC22403o = null;
                        }
                    }
                    if (abstractC22403o == null) {
                        c28655q.m87150e0(-656109781);
                        c28655q.m87173q(false);
                        f16 = f14;
                        c2886a = null;
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        modifier8 = modifier7;
                        c2314t3 = c2314t2;
                        f15 = 1.0f;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(-656109780);
                        c2886a = null;
                        C2314t c2314t7 = c2314t2;
                        float f111 = f14;
                        f15 = 1.0f;
                        AbstractC26165a abstractC26165aM64500i4 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                        Modifier modifierM107879c4 = AbstractC34132o.m107879c(f111, AbstractC1102d.m3407d(1.0f, c2314t7));
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            obj = objM87133R;
                            C22881b c22881b9 = new C22881b(28);
                            c28655q.m87172p0(c22881b9);
                            obj = c22881b9;
                        }
                        obj = objM87133R;
                        Modifier modifierM3486a4 = AbstractC1127a.m3486a(modifierM107879c4, (Function1) obj);
                        objM87133R2 = c28655q.m87133R();
                        obj2 = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            C22881b c22881b10 = new C22881b(29);
                            c28655q.m87172p0(c22881b10);
                            obj2 = c22881b10;
                        }
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        c2314t3 = c2314t7;
                        modifier8 = modifier7;
                        f16 = f111;
                        AbstractC29125c.m88522c(abstractC26165aM64500i4, null, AbstractC1125a.m3480c(modifierM3486a4, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        C28655q c28655q5 = c28655q;
                        c28655q5.m87173q(false);
                        r15 = c28655q5;
                    }
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density2, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = r15.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(r15, modifierM3396r4);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        c0213j3 = c0213j2;
                        r15.m87163l(c0213j3);
                    } else {
                        c0213j3 = c0213j2;
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a4);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m12);
                    if (r15.f115903S) {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    } else {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N12);
                    Modifier modifierM3411h6 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = r15.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(r15, modifierM3411h6);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j3);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a4);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m13);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N13);
                    startButton = viewState.getStartButton();
                    if (startButton.getIconRes() != null) {
                        r15.m87150e0(748152407);
                        Modifier modifierM3419p7 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o7 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i7 = r15.m87157i(startButton);
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i7 | z24;
                        Object objM87133R10 = r15.m87133R();
                        if (z25) {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a11 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a11);
                            obj5 = interfaceC4339a11;
                        } else {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a12 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a12);
                            obj5 = interfaceC4339a12;
                        }
                        ?? r217 = i26;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        AbstractC27242b1.m82092d(c27270o7, "Back", modifierM3419p7, null, (InterfaceC4339a) obj5, r15, 432, 8);
                        r15.m87173q(r217);
                        r10 = r217;
                    } else {
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        r10 = 0;
                        r15.m87150e0(748814443);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                    }
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                    if (strM21274h.length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        r15.m87150e0(749045052);
                        ?? r218 = C38072d.f163053a;
                        ?? r219 = r15;
                        r16 = 1;
                        c0213j4 = c0213j3;
                        AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r218.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r218.m121952e(r15, 6).getH4(), null, r219, 48, 0, 196600);
                        ?? r116 = r219;
                        r116.m87173q(false);
                        r17 = r116;
                    } else {
                        c0213j4 = c0213j3;
                        r16 = 1;
                        r15.m87150e0(749324300);
                        r15.m87173q(false);
                        r17 = r15;
                    }
                    endButton = viewState.getEndButton();
                    if (endButton != null) {
                        iconRes = endButton.getIconRes();
                    } else {
                        obj3 = c2886a;
                    }
                    if (obj3 != null) {
                        r17.m87150e0(749462591);
                        Modifier modifierM3419p8 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o8 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i8 = r17.m87157i(endButton);
                        if ((i15 & 896) == 256) {
                            obj3 = iconRes;
                            r24 = r16;
                        } else {
                            obj3 = iconRes;
                            r24 = 0;
                        }
                        i25 = r24 | (zM87157i8 ? 1 : 0);
                        Object objM87133R11 = r17.m87133R();
                        obj4 = objM87133R11;
                        if (i25 == 0) {
                            InterfaceC4339a interfaceC4339a13 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a13);
                            obj4 = interfaceC4339a13;
                        } else {
                            InterfaceC4339a interfaceC4339a14 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a14);
                            obj4 = interfaceC4339a14;
                        }
                        AbstractC27242b1.m82092d(c27270o8, "Action", modifierM3419p8, null, (InterfaceC4339a) obj4, r17, 432, 8);
                        i24 = 0;
                        r17.m87173q(false);
                    } else {
                        obj3 = iconRes;
                        i24 = 0;
                        r17.m87150e0(749963179);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                    }
                    r17.m87173q(r16);
                    strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                    if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                        r17.m87150e0(553718039);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = r17.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(r17, modifierM3409f4);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j4);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m14);
                        if (r17.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        }
                        AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N14);
                        r19 = C38072d.f163053a;
                        long brandWhite4 = r19.m121949b(r17, 6).getBrandWhite();
                        subtitleStyle = viewState.getSubtitleStyle();
                        if (subtitleStyle != null) {
                            h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                        } else {
                            h7 = c2886a;
                        }
                        if (h7 == null) {
                            r17.m87150e0(-1038233573);
                            h7 = r19.m121952e(r17, 6).getH2();
                            z19 = false;
                        } else {
                            z19 = false;
                            r17.m87150e0(-1038236084);
                        }
                        r17.m87173q(z19);
                        C2886a c2886a5 = h7;
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                        if (viewState.getSubtitleStickOnScroll()) {
                            f17 = 1.0f;
                        } else {
                            f17 = f16;
                        }
                        ?? r2110 = r17;
                        AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t4), brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a5, null, r2110, 0, 0, 196600);
                        ?? r117 = r2110;
                        r117.m87173q(r16);
                        r117.m87173q(false);
                        r18 = r117;
                    } else {
                        r17.m87150e0(554575995);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(r16);
                    r18.m87173q(r16);
                    function3 = function4;
                    z15 = z16;
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    r14 = r18;
                } else {
                    c28655q.m87138X();
                    modifier5 = modifier3;
                    function3 = function2;
                    modifier6 = modifier4;
                    z15 = z13;
                    r14 = c28655q;
                }
                c28677v1M87180u = r14.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g(modifier5, viewState, function3, modifier6, z15, i13, i14, 24);
                }
            }
            i15 |= 3072;
            modifier4 = modifier2;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            obj6 = objM87133R3;
                            C22881b c22881b11 = new C22881b(27);
                            c28655q.m87172p0(c22881b11);
                            obj6 = c22881b11;
                        }
                        obj6 = objM87133R3;
                        function4 = (Function1) obj6;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier4;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    WeakHashMap weakHashMap3 = C22944c2.f90553v;
                    float density3 = C22949e.m66712e(c28655q).f90559f.m66705e().f151450b / interfaceC39171c3.getDensity();
                    float fM67616n3 = m67616n(viewState);
                    f13 = 1.0f - fM67616n3;
                    companion = C23357g.INSTANCE;
                    float fM67643a3 = companion.m67643a() + companion.m67647e(viewState.getSubtitle(), viewState.getSubtitleStyle(), viewState.getSubtitleStickOnScroll());
                    float fM67644b3 = ((companion.m67644b() - fM67643a3) * f13) + fM67643a3 + density3;
                    backgroundImage = viewState.getBackgroundImage();
                    Modifier modifierM3411h7 = AbstractC1102d.m3411h(fM67644b3, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifier7)));
                    if (backgroundImage == null) {
                        c28655q.m87150e0(278021772);
                        modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(278121468);
                        c28655q.m87173q(false);
                        modifierM3358c = c2314t;
                    }
                    Modifier modifierMo3471e3 = modifierM3411h7.mo3471e(modifierM3358c);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, z17);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
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
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                        if (backgroundImage == null) {
                            c2314t2 = c2314t;
                            c3 = 6;
                            c28655q.m87150e0(-656203214);
                            c28655q.m87173q(false);
                        } else {
                            c2314t2 = c2314t;
                            c3 = 6;
                            c28655q.m87150e0(-656203214);
                            c28655q.m87173q(false);
                        }
                        if (backgroundImage == 0) {
                            abstractC22403o = null;
                        } else {
                            if (f14 > 0.01f) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z26) {
                                abstractC22403o = backgroundImage;
                            } else {
                                abstractC22403o = null;
                            }
                        }
                        if (abstractC22403o == null) {
                            c28655q.m87150e0(-656109781);
                            c28655q.m87173q(false);
                            f16 = f14;
                            c2886a = null;
                            c0209i5 = c0209i3;
                            c0213j2 = c0213j;
                            modifier8 = modifier7;
                            c2314t3 = c2314t2;
                            f15 = 1.0f;
                            r15 = c28655q;
                        } else {
                            c28655q.m87150e0(-656109780);
                            c2886a = null;
                            C2314t c2314t8 = c2314t2;
                            float f112 = f14;
                            f15 = 1.0f;
                            AbstractC26165a abstractC26165aM64500i5 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                            Modifier modifierM107879c5 = AbstractC34132o.m107879c(f112, AbstractC1102d.m3407d(1.0f, c2314t8));
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                obj = objM87133R;
                                C22881b c22881b12 = new C22881b(28);
                                c28655q.m87172p0(c22881b12);
                                obj = c22881b12;
                            }
                            obj = objM87133R;
                            Modifier modifierM3486a5 = AbstractC1127a.m3486a(modifierM107879c5, (Function1) obj);
                            objM87133R2 = c28655q.m87133R();
                            obj2 = objM87133R2;
                            if (objM87133R2 == c28676v0) {
                                C22881b c22881b13 = new C22881b(29);
                                c28655q.m87172p0(c22881b13);
                                obj2 = c22881b13;
                            }
                            c0209i5 = c0209i3;
                            c0213j2 = c0213j;
                            c2314t3 = c2314t8;
                            modifier8 = modifier7;
                            f16 = f112;
                            AbstractC29125c.m88522c(abstractC26165aM64500i5, null, AbstractC1125a.m3480c(modifierM3486a5, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                            C28655q c28655q6 = c28655q;
                            c28655q6.m87173q(false);
                            r15 = c28655q6;
                        }
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density3, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                        iHashCode2 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m16 = r15.m87165m();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(r15, modifierM3396r5);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            c0213j3 = c0213j2;
                            r15.m87163l(c0213j3);
                        } else {
                            c0213j3 = c0213j2;
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a5);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m16);
                        if (r15.f115903S) {
                            c0209i6 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        } else {
                            c0209i6 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N16);
                        Modifier modifierM3411h8 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                        iHashCode3 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = r15.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(r15, modifierM3411h8);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j3);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a5);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m17);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N17);
                        startButton = viewState.getStartButton();
                        if (startButton.getIconRes() != null) {
                            r15.m87150e0(748152407);
                            Modifier modifierM3419p9 = AbstractC1102d.m3419p(f92568a, c2314t3);
                            C27270o c27270o9 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            boolean zM87157i9 = r15.m87157i(startButton);
                            if ((i15 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = zM87157i9 | z24;
                            Object objM87133R12 = r15.m87133R();
                            if (z25) {
                                i26 = 0;
                                InterfaceC4339a interfaceC4339a15 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC23354d.m67613k(startButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(startButton, function4);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a15);
                                obj5 = interfaceC4339a15;
                            } else {
                                i26 = 0;
                                InterfaceC4339a interfaceC4339a16 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC23354d.m67613k(startButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(startButton, function4);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a16);
                                obj5 = interfaceC4339a16;
                            }
                            ?? r2111 = i26;
                            c0209i7 = c0209i2;
                            c0209i8 = c0209i6;
                            AbstractC27242b1.m82092d(c27270o9, "Back", modifierM3419p9, null, (InterfaceC4339a) obj5, r15, 432, 8);
                            r15.m87173q(r2111);
                            r10 = r2111;
                        } else {
                            c0209i7 = c0209i2;
                            c0209i8 = c0209i6;
                            r10 = 0;
                            r15.m87150e0(748814443);
                            AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                        }
                        strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                        if (strM21274h.length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            r15.m87150e0(749045052);
                            ?? r2112 = C38072d.f163053a;
                            ?? r2113 = r15;
                            r16 = 1;
                            c0213j4 = c0213j3;
                            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r2112.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2112.m121952e(r15, 6).getH4(), null, r2113, 48, 0, 196600);
                            ?? r118 = r2113;
                            r118.m87173q(false);
                            r17 = r118;
                        } else {
                            c0213j4 = c0213j3;
                            r16 = 1;
                            r15.m87150e0(749324300);
                            r15.m87173q(false);
                            r17 = r15;
                        }
                        endButton = viewState.getEndButton();
                        if (endButton != null) {
                            iconRes = endButton.getIconRes();
                        } else {
                            obj3 = c2886a;
                        }
                        if (obj3 != null) {
                            r17.m87150e0(749462591);
                            Modifier modifierM3419p10 = AbstractC1102d.m3419p(f92568a, c2314t3);
                            C27270o c27270o10 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            boolean zM87157i10 = r17.m87157i(endButton);
                            if ((i15 & 896) == 256) {
                                obj3 = iconRes;
                                r24 = r16;
                            } else {
                                obj3 = iconRes;
                                r24 = 0;
                            }
                            i25 = r24 | (zM87157i10 ? 1 : 0);
                            Object objM87133R13 = r17.m87133R();
                            obj4 = objM87133R13;
                            if (i25 == 0) {
                                InterfaceC4339a interfaceC4339a17 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (r16) {
                                            case 0:
                                                return AbstractC23354d.m67613k(endButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(endButton, function4);
                                        }
                                    }
                                };
                                r17.m87172p0(interfaceC4339a17);
                                obj4 = interfaceC4339a17;
                            } else {
                                InterfaceC4339a interfaceC4339a18 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (r16) {
                                            case 0:
                                                return AbstractC23354d.m67613k(endButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(endButton, function4);
                                        }
                                    }
                                };
                                r17.m87172p0(interfaceC4339a18);
                                obj4 = interfaceC4339a18;
                            }
                            AbstractC27242b1.m82092d(c27270o10, "Action", modifierM3419p10, null, (InterfaceC4339a) obj4, r17, 432, 8);
                            i24 = 0;
                            r17.m87173q(false);
                        } else {
                            obj3 = iconRes;
                            i24 = 0;
                            r17.m87150e0(749963179);
                            AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                        }
                        r17.m87173q(r16);
                        strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                        if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                            r17.m87150e0(553718039);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode4 = Long.hashCode(r17.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = r17.m87165m();
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(r17, modifierM3409f5);
                            r17.m87158i0();
                            if (r17.f115903S) {
                                r17.m87163l(c0213j4);
                            } else {
                                r17.m87178s0();
                            }
                            AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d8);
                            AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m18);
                            if (r17.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                            }
                            AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N18);
                            r19 = C38072d.f163053a;
                            long brandWhite5 = r19.m121949b(r17, 6).getBrandWhite();
                            subtitleStyle = viewState.getSubtitleStyle();
                            if (subtitleStyle != null) {
                                h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                            } else {
                                h7 = c2886a;
                            }
                            if (h7 == null) {
                                r17.m87150e0(-1038233573);
                                h7 = r19.m121952e(r17, 6).getH2();
                                z19 = false;
                            } else {
                                z19 = false;
                                r17.m87150e0(-1038236084);
                            }
                            r17.m87173q(z19);
                            C2886a c2886a6 = h7;
                            Modifier modifierM3398t5 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                            if (viewState.getSubtitleStickOnScroll()) {
                                f17 = 1.0f;
                            } else {
                                f17 = f16;
                            }
                            ?? r2114 = r17;
                            AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t5), brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a6, null, r2114, 0, 0, 196600);
                            ?? r119 = r2114;
                            r119.m87173q(r16);
                            r119.m87173q(false);
                            r18 = r119;
                        } else {
                            r17.m87150e0(554575995);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(r16);
                        r18.m87173q(r16);
                        function3 = function4;
                        z15 = z16;
                        modifier5 = modifier3;
                        modifier6 = modifier8;
                        r14 = r18;
                    } else {
                        f14 = f13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                    if (backgroundImage == null) {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    }
                    if (backgroundImage == 0) {
                        abstractC22403o = null;
                    } else {
                        if (f14 > 0.01f) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (z26) {
                            abstractC22403o = backgroundImage;
                        } else {
                            abstractC22403o = null;
                        }
                    }
                    if (abstractC22403o == null) {
                        c28655q.m87150e0(-656109781);
                        c28655q.m87173q(false);
                        f16 = f14;
                        c2886a = null;
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        modifier8 = modifier7;
                        c2314t3 = c2314t2;
                        f15 = 1.0f;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(-656109780);
                        c2886a = null;
                        C2314t c2314t9 = c2314t2;
                        float f113 = f14;
                        f15 = 1.0f;
                        AbstractC26165a abstractC26165aM64500i6 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                        Modifier modifierM107879c6 = AbstractC34132o.m107879c(f113, AbstractC1102d.m3407d(1.0f, c2314t9));
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            obj = objM87133R;
                            C22881b c22881b14 = new C22881b(28);
                            c28655q.m87172p0(c22881b14);
                            obj = c22881b14;
                        }
                        obj = objM87133R;
                        Modifier modifierM3486a6 = AbstractC1127a.m3486a(modifierM107879c6, (Function1) obj);
                        objM87133R2 = c28655q.m87133R();
                        obj2 = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            C22881b c22881b15 = new C22881b(29);
                            c28655q.m87172p0(c22881b15);
                            obj2 = c22881b15;
                        }
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        c2314t3 = c2314t9;
                        modifier8 = modifier7;
                        f16 = f113;
                        AbstractC29125c.m88522c(abstractC26165aM64500i6, null, AbstractC1125a.m3480c(modifierM3486a6, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        C28655q c28655q7 = c28655q;
                        c28655q7.m87173q(false);
                        r15 = c28655q7;
                    }
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density3, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = r15.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(r15, modifierM3396r6);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        c0213j3 = c0213j2;
                        r15.m87163l(c0213j3);
                    } else {
                        c0213j3 = c0213j2;
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a6);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m19);
                    if (r15.f115903S) {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    } else {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N19);
                    Modifier modifierM3411h9 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = r15.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(r15, modifierM3411h9);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j3);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m110);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N110);
                    startButton = viewState.getStartButton();
                    if (startButton.getIconRes() != null) {
                        r15.m87150e0(748152407);
                        Modifier modifierM3419p11 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o11 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i11 = r15.m87157i(startButton);
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i11 | z24;
                        Object objM87133R14 = r15.m87133R();
                        if (z25) {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a19 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a19);
                            obj5 = interfaceC4339a19;
                        } else {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a110 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a110);
                            obj5 = interfaceC4339a110;
                        }
                        ?? r2115 = i26;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        AbstractC27242b1.m82092d(c27270o11, "Back", modifierM3419p11, null, (InterfaceC4339a) obj5, r15, 432, 8);
                        r15.m87173q(r2115);
                        r10 = r2115;
                    } else {
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        r10 = 0;
                        r15.m87150e0(748814443);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                    }
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                    if (strM21274h.length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        r15.m87150e0(749045052);
                        ?? r2116 = C38072d.f163053a;
                        ?? r2117 = r15;
                        r16 = 1;
                        c0213j4 = c0213j3;
                        AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r2116.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2116.m121952e(r15, 6).getH4(), null, r2117, 48, 0, 196600);
                        ?? r1110 = r2117;
                        r1110.m87173q(false);
                        r17 = r1110;
                    } else {
                        c0213j4 = c0213j3;
                        r16 = 1;
                        r15.m87150e0(749324300);
                        r15.m87173q(false);
                        r17 = r15;
                    }
                    endButton = viewState.getEndButton();
                    if (endButton != null) {
                        iconRes = endButton.getIconRes();
                    } else {
                        obj3 = c2886a;
                    }
                    if (obj3 != null) {
                        r17.m87150e0(749462591);
                        Modifier modifierM3419p12 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o12 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i12 = r17.m87157i(endButton);
                        if ((i15 & 896) == 256) {
                            obj3 = iconRes;
                            r24 = r16;
                        } else {
                            obj3 = iconRes;
                            r24 = 0;
                        }
                        i25 = r24 | (zM87157i12 ? 1 : 0);
                        Object objM87133R15 = r17.m87133R();
                        obj4 = objM87133R15;
                        if (i25 == 0) {
                            InterfaceC4339a interfaceC4339a111 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a111);
                            obj4 = interfaceC4339a111;
                        } else {
                            InterfaceC4339a interfaceC4339a112 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a112);
                            obj4 = interfaceC4339a112;
                        }
                        AbstractC27242b1.m82092d(c27270o12, "Action", modifierM3419p12, null, (InterfaceC4339a) obj4, r17, 432, 8);
                        i24 = 0;
                        r17.m87173q(false);
                    } else {
                        obj3 = iconRes;
                        i24 = 0;
                        r17.m87150e0(749963179);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                    }
                    r17.m87173q(r16);
                    strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                    if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                        r17.m87150e0(553718039);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = r17.m87165m();
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(r17, modifierM3409f6);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j4);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m111);
                        if (r17.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        }
                        AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N111);
                        r19 = C38072d.f163053a;
                        long brandWhite6 = r19.m121949b(r17, 6).getBrandWhite();
                        subtitleStyle = viewState.getSubtitleStyle();
                        if (subtitleStyle != null) {
                            h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                        } else {
                            h7 = c2886a;
                        }
                        if (h7 == null) {
                            r17.m87150e0(-1038233573);
                            h7 = r19.m121952e(r17, 6).getH2();
                            z19 = false;
                        } else {
                            z19 = false;
                            r17.m87150e0(-1038236084);
                        }
                        r17.m87173q(z19);
                        C2886a c2886a7 = h7;
                        Modifier modifierM3398t6 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                        if (viewState.getSubtitleStickOnScroll()) {
                            f17 = 1.0f;
                        } else {
                            f17 = f16;
                        }
                        ?? r2118 = r17;
                        AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t6), brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a7, null, r2118, 0, 0, 196600);
                        ?? r1111 = r2118;
                        r1111.m87173q(r16);
                        r1111.m87173q(false);
                        r18 = r1111;
                    } else {
                        r17.m87150e0(554575995);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(r16);
                    r18.m87173q(r16);
                    function3 = function4;
                    z15 = z16;
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    r14 = r18;
                } else {
                    c28655q.m87138X();
                    modifier5 = modifier3;
                    function3 = function2;
                    modifier6 = modifier4;
                    z15 = z13;
                    r14 = c28655q;
                }
                c28677v1M87180u = r14.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g(modifier5, viewState, function3, modifier6, z15, i13, i14, 24);
                }
            }
            i15 |= 24576;
            z13 = z4;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier3 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        obj6 = objM87133R3;
                        C22881b c22881b16 = new C22881b(27);
                        c28655q.m87172p0(c22881b16);
                        obj6 = c22881b16;
                    }
                    obj6 = objM87133R3;
                    function4 = (Function1) obj6;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier4;
                }
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                WeakHashMap weakHashMap4 = C22944c2.f90553v;
                float density4 = C22949e.m66712e(c28655q).f90559f.m66705e().f151450b / interfaceC39171c4.getDensity();
                float fM67616n4 = m67616n(viewState);
                f13 = 1.0f - fM67616n4;
                companion = C23357g.INSTANCE;
                float fM67643a4 = companion.m67643a() + companion.m67647e(viewState.getSubtitle(), viewState.getSubtitleStyle(), viewState.getSubtitleStickOnScroll());
                float fM67644b4 = ((companion.m67644b() - fM67643a4) * f13) + fM67643a4 + density4;
                backgroundImage = viewState.getBackgroundImage();
                Modifier modifierM3411h10 = AbstractC1102d.m3411h(fM67644b4, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifier7)));
                if (backgroundImage == null) {
                    c28655q.m87150e0(278021772);
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    z17 = false;
                    c28655q.m87150e0(278121468);
                    c28655q.m87173q(false);
                    modifierM3358c = c2314t;
                }
                Modifier modifierMo3471e4 = modifierM3411h10.mo3471e(modifierM3358c);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m, z17);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d10);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m112);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
                    if (backgroundImage == null) {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    }
                    if (backgroundImage == 0) {
                        abstractC22403o = null;
                    } else {
                        if (f14 > 0.01f) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (z26) {
                            abstractC22403o = backgroundImage;
                        } else {
                            abstractC22403o = null;
                        }
                    }
                    if (abstractC22403o == null) {
                        c28655q.m87150e0(-656109781);
                        c28655q.m87173q(false);
                        f16 = f14;
                        c2886a = null;
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        modifier8 = modifier7;
                        c2314t3 = c2314t2;
                        f15 = 1.0f;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(-656109780);
                        c2886a = null;
                        C2314t c2314t10 = c2314t2;
                        float f114 = f14;
                        f15 = 1.0f;
                        AbstractC26165a abstractC26165aM64500i7 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                        Modifier modifierM107879c7 = AbstractC34132o.m107879c(f114, AbstractC1102d.m3407d(1.0f, c2314t10));
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            obj = objM87133R;
                            C22881b c22881b17 = new C22881b(28);
                            c28655q.m87172p0(c22881b17);
                            obj = c22881b17;
                        }
                        obj = objM87133R;
                        Modifier modifierM3486a7 = AbstractC1127a.m3486a(modifierM107879c7, (Function1) obj);
                        objM87133R2 = c28655q.m87133R();
                        obj2 = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            C22881b c22881b18 = new C22881b(29);
                            c28655q.m87172p0(c22881b18);
                            obj2 = c22881b18;
                        }
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        c2314t3 = c2314t10;
                        modifier8 = modifier7;
                        f16 = f114;
                        AbstractC29125c.m88522c(abstractC26165aM64500i7, null, AbstractC1125a.m3480c(modifierM3486a7, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        C28655q c28655q8 = c28655q;
                        c28655q8.m87173q(false);
                        r15 = c28655q8;
                    }
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density4, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = r15.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(r15, modifierM3396r7);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        c0213j3 = c0213j2;
                        r15.m87163l(c0213j3);
                    } else {
                        c0213j3 = c0213j2;
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a7);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m113);
                    if (r15.f115903S) {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    } else {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N113);
                    Modifier modifierM3411h11 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = r15.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(r15, modifierM3411h11);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j3);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a7);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m114);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N114);
                    startButton = viewState.getStartButton();
                    if (startButton.getIconRes() != null) {
                        r15.m87150e0(748152407);
                        Modifier modifierM3419p13 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o13 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i13 = r15.m87157i(startButton);
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i13 | z24;
                        Object objM87133R16 = r15.m87133R();
                        if (z25) {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a113 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a113);
                            obj5 = interfaceC4339a113;
                        } else {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a114 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a114);
                            obj5 = interfaceC4339a114;
                        }
                        ?? r2119 = i26;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        AbstractC27242b1.m82092d(c27270o13, "Back", modifierM3419p13, null, (InterfaceC4339a) obj5, r15, 432, 8);
                        r15.m87173q(r2119);
                        r10 = r2119;
                    } else {
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        r10 = 0;
                        r15.m87150e0(748814443);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                    }
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                    if (strM21274h.length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        r15.m87150e0(749045052);
                        ?? r21110 = C38072d.f163053a;
                        ?? r21111 = r15;
                        r16 = 1;
                        c0213j4 = c0213j3;
                        AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r21110.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21110.m121952e(r15, 6).getH4(), null, r21111, 48, 0, 196600);
                        ?? r1112 = r21111;
                        r1112.m87173q(false);
                        r17 = r1112;
                    } else {
                        c0213j4 = c0213j3;
                        r16 = 1;
                        r15.m87150e0(749324300);
                        r15.m87173q(false);
                        r17 = r15;
                    }
                    endButton = viewState.getEndButton();
                    if (endButton != null) {
                        iconRes = endButton.getIconRes();
                    } else {
                        obj3 = c2886a;
                    }
                    if (obj3 != null) {
                        r17.m87150e0(749462591);
                        Modifier modifierM3419p14 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o14 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i14 = r17.m87157i(endButton);
                        if ((i15 & 896) == 256) {
                            obj3 = iconRes;
                            r24 = r16;
                        } else {
                            obj3 = iconRes;
                            r24 = 0;
                        }
                        i25 = r24 | (zM87157i14 ? 1 : 0);
                        Object objM87133R17 = r17.m87133R();
                        obj4 = objM87133R17;
                        if (i25 == 0) {
                            InterfaceC4339a interfaceC4339a115 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a115);
                            obj4 = interfaceC4339a115;
                        } else {
                            InterfaceC4339a interfaceC4339a116 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a116);
                            obj4 = interfaceC4339a116;
                        }
                        AbstractC27242b1.m82092d(c27270o14, "Action", modifierM3419p14, null, (InterfaceC4339a) obj4, r17, 432, 8);
                        i24 = 0;
                        r17.m87173q(false);
                    } else {
                        obj3 = iconRes;
                        i24 = 0;
                        r17.m87150e0(749963179);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                    }
                    r17.m87173q(r16);
                    strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                    if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                        r17.m87150e0(553718039);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = r17.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(r17, modifierM3409f7);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j4);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d11);
                        AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m115);
                        if (r17.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        }
                        AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N115);
                        r19 = C38072d.f163053a;
                        long brandWhite7 = r19.m121949b(r17, 6).getBrandWhite();
                        subtitleStyle = viewState.getSubtitleStyle();
                        if (subtitleStyle != null) {
                            h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                        } else {
                            h7 = c2886a;
                        }
                        if (h7 == null) {
                            r17.m87150e0(-1038233573);
                            h7 = r19.m121952e(r17, 6).getH2();
                            z19 = false;
                        } else {
                            z19 = false;
                            r17.m87150e0(-1038236084);
                        }
                        r17.m87173q(z19);
                        C2886a c2886a8 = h7;
                        Modifier modifierM3398t7 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                        if (viewState.getSubtitleStickOnScroll()) {
                            f17 = 1.0f;
                        } else {
                            f17 = f16;
                        }
                        ?? r21112 = r17;
                        AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t7), brandWhite7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a8, null, r21112, 0, 0, 196600);
                        ?? r1113 = r21112;
                        r1113.m87173q(r16);
                        r1113.m87173q(false);
                        r18 = r1113;
                    } else {
                        r17.m87150e0(554575995);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(r16);
                    r18.m87173q(r16);
                    function3 = function4;
                    z15 = z16;
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    r14 = r18;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N112);
                if (backgroundImage == null) {
                    c2314t2 = c2314t;
                    c3 = 6;
                    c28655q.m87150e0(-656203214);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c3 = 6;
                    c28655q.m87150e0(-656203214);
                    c28655q.m87173q(false);
                }
                if (backgroundImage == 0) {
                    abstractC22403o = null;
                } else {
                    if (f14 > 0.01f) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if (z26) {
                        abstractC22403o = backgroundImage;
                    } else {
                        abstractC22403o = null;
                    }
                }
                if (abstractC22403o == null) {
                    c28655q.m87150e0(-656109781);
                    c28655q.m87173q(false);
                    f16 = f14;
                    c2886a = null;
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    modifier8 = modifier7;
                    c2314t3 = c2314t2;
                    f15 = 1.0f;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(-656109780);
                    c2886a = null;
                    C2314t c2314t11 = c2314t2;
                    float f115 = f14;
                    f15 = 1.0f;
                    AbstractC26165a abstractC26165aM64500i8 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                    Modifier modifierM107879c8 = AbstractC34132o.m107879c(f115, AbstractC1102d.m3407d(1.0f, c2314t11));
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        obj = objM87133R;
                        C22881b c22881b19 = new C22881b(28);
                        c28655q.m87172p0(c22881b19);
                        obj = c22881b19;
                    }
                    obj = objM87133R;
                    Modifier modifierM3486a8 = AbstractC1127a.m3486a(modifierM107879c8, (Function1) obj);
                    objM87133R2 = c28655q.m87133R();
                    obj2 = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        C22881b c22881b110 = new C22881b(29);
                        c28655q.m87172p0(c22881b110);
                        obj2 = c22881b110;
                    }
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    c2314t3 = c2314t11;
                    modifier8 = modifier7;
                    f16 = f115;
                    AbstractC29125c.m88522c(abstractC26165aM64500i8, null, AbstractC1125a.m3480c(modifierM3486a8, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                    C28655q c28655q9 = c28655q;
                    c28655q9.m87173q(false);
                    r15 = c28655q9;
                }
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density4, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = r15.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(r15, modifierM3396r8);
                r15.m87158i0();
                if (r15.f115903S) {
                    c0213j3 = c0213j2;
                    r15.m87163l(c0213j3);
                } else {
                    c0213j3 = c0213j2;
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a8);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m116);
                if (r15.f115903S) {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                } else {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N116);
                Modifier modifierM3411h12 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m117 = r15.m87165m();
                Modifier modifierM118962N117 = AbstractC37056f.m118962N(r15, modifierM3411h12);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j3);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a8);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m117);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N117);
                startButton = viewState.getStartButton();
                if (startButton.getIconRes() != null) {
                    r15.m87150e0(748152407);
                    Modifier modifierM3419p15 = AbstractC1102d.m3419p(f92568a, c2314t3);
                    C27270o c27270o15 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    boolean zM87157i15 = r15.m87157i(startButton);
                    if ((i15 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i15 | z24;
                    Object objM87133R18 = r15.m87133R();
                    if (z25) {
                        i26 = 0;
                        InterfaceC4339a interfaceC4339a117 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC23354d.m67613k(startButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(startButton, function4);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a117);
                        obj5 = interfaceC4339a117;
                    } else {
                        i26 = 0;
                        InterfaceC4339a interfaceC4339a118 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC23354d.m67613k(startButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(startButton, function4);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a118);
                        obj5 = interfaceC4339a118;
                    }
                    ?? r21113 = i26;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i6;
                    AbstractC27242b1.m82092d(c27270o15, "Back", modifierM3419p15, null, (InterfaceC4339a) obj5, r15, 432, 8);
                    r15.m87173q(r21113);
                    r10 = r21113;
                } else {
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i6;
                    r10 = 0;
                    r15.m87150e0(748814443);
                    AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                }
                strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                if (strM21274h.length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    r15.m87150e0(749045052);
                    ?? r21114 = C38072d.f163053a;
                    ?? r21115 = r15;
                    r16 = 1;
                    c0213j4 = c0213j3;
                    AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r21114.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21114.m121952e(r15, 6).getH4(), null, r21115, 48, 0, 196600);
                    ?? r1114 = r21115;
                    r1114.m87173q(false);
                    r17 = r1114;
                } else {
                    c0213j4 = c0213j3;
                    r16 = 1;
                    r15.m87150e0(749324300);
                    r15.m87173q(false);
                    r17 = r15;
                }
                endButton = viewState.getEndButton();
                if (endButton != null) {
                    iconRes = endButton.getIconRes();
                } else {
                    obj3 = c2886a;
                }
                if (obj3 != null) {
                    r17.m87150e0(749462591);
                    Modifier modifierM3419p16 = AbstractC1102d.m3419p(f92568a, c2314t3);
                    C27270o c27270o16 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    boolean zM87157i16 = r17.m87157i(endButton);
                    if ((i15 & 896) == 256) {
                        obj3 = iconRes;
                        r24 = r16;
                    } else {
                        obj3 = iconRes;
                        r24 = 0;
                    }
                    i25 = r24 | (zM87157i16 ? 1 : 0);
                    Object objM87133R19 = r17.m87133R();
                    obj4 = objM87133R19;
                    if (i25 == 0) {
                        InterfaceC4339a interfaceC4339a119 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r16) {
                                    case 0:
                                        return AbstractC23354d.m67613k(endButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(endButton, function4);
                                }
                            }
                        };
                        r17.m87172p0(interfaceC4339a119);
                        obj4 = interfaceC4339a119;
                    } else {
                        InterfaceC4339a interfaceC4339a1110 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r16) {
                                    case 0:
                                        return AbstractC23354d.m67613k(endButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(endButton, function4);
                                }
                            }
                        };
                        r17.m87172p0(interfaceC4339a1110);
                        obj4 = interfaceC4339a1110;
                    }
                    AbstractC27242b1.m82092d(c27270o16, "Action", modifierM3419p16, null, (InterfaceC4339a) obj4, r17, 432, 8);
                    i24 = 0;
                    r17.m87173q(false);
                } else {
                    obj3 = iconRes;
                    i24 = 0;
                    r17.m87150e0(749963179);
                    AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                }
                r17.m87173q(r16);
                strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                    r17.m87150e0(553718039);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = r17.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(r17, modifierM3409f8);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j4);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m118);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                    }
                    AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N118);
                    r19 = C38072d.f163053a;
                    long brandWhite8 = r19.m121949b(r17, 6).getBrandWhite();
                    subtitleStyle = viewState.getSubtitleStyle();
                    if (subtitleStyle != null) {
                        h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                    } else {
                        h7 = c2886a;
                    }
                    if (h7 == null) {
                        r17.m87150e0(-1038233573);
                        h7 = r19.m121952e(r17, 6).getH2();
                        z19 = false;
                    } else {
                        z19 = false;
                        r17.m87150e0(-1038236084);
                    }
                    r17.m87173q(z19);
                    C2886a c2886a9 = h7;
                    Modifier modifierM3398t8 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                    if (viewState.getSubtitleStickOnScroll()) {
                        f17 = 1.0f;
                    } else {
                        f17 = f16;
                    }
                    ?? r21116 = r17;
                    AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t8), brandWhite8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a9, null, r21116, 0, 0, 196600);
                    ?? r1115 = r21116;
                    r1115.m87173q(r16);
                    r1115.m87173q(false);
                    r18 = r1115;
                } else {
                    r17.m87150e0(554575995);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(r16);
                r18.m87173q(r16);
                function3 = function4;
                z15 = z16;
                modifier5 = modifier3;
                modifier6 = modifier8;
                r14 = r18;
            } else {
                c28655q.m87138X();
                modifier5 = modifier3;
                function3 = function2;
                modifier6 = modifier4;
                z15 = z13;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(modifier5, viewState, function3, modifier6, z15, i13, i14, 24);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                modifier4 = modifier2;
                if (c28655q.m87153g(modifier4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i27 != 0) {
                        modifier3 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            obj6 = objM87133R3;
                            C22881b c22881b111 = new C22881b(27);
                            c28655q.m87172p0(c22881b111);
                            obj6 = c22881b111;
                        }
                        obj6 = objM87133R3;
                        function4 = (Function1) obj6;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier4;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    InterfaceC39171c interfaceC39171c5 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    WeakHashMap weakHashMap5 = C22944c2.f90553v;
                    float density5 = C22949e.m66712e(c28655q).f90559f.m66705e().f151450b / interfaceC39171c5.getDensity();
                    float fM67616n5 = m67616n(viewState);
                    f13 = 1.0f - fM67616n5;
                    companion = C23357g.INSTANCE;
                    float fM67643a5 = companion.m67643a() + companion.m67647e(viewState.getSubtitle(), viewState.getSubtitleStyle(), viewState.getSubtitleStickOnScroll());
                    float fM67644b5 = ((companion.m67644b() - fM67643a5) * f13) + fM67643a5 + density5;
                    backgroundImage = viewState.getBackgroundImage();
                    Modifier modifierM3411h13 = AbstractC1102d.m3411h(fM67644b5, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifier7)));
                    if (backgroundImage == null) {
                        c28655q.m87150e0(278021772);
                        modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(278121468);
                        c28655q.m87173q(false);
                        modifierM3358c = c2314t;
                    }
                    Modifier modifierMo3471e5 = modifierM3411h13.mo3471e(modifierM3358c);
                    c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m, z17);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierMo3471e5);
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
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m119);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N119);
                        if (backgroundImage == null) {
                            c2314t2 = c2314t;
                            c3 = 6;
                            c28655q.m87150e0(-656203214);
                            c28655q.m87173q(false);
                        } else {
                            c2314t2 = c2314t;
                            c3 = 6;
                            c28655q.m87150e0(-656203214);
                            c28655q.m87173q(false);
                        }
                        if (backgroundImage == 0) {
                            abstractC22403o = null;
                        } else {
                            if (f14 > 0.01f) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z26) {
                                abstractC22403o = backgroundImage;
                            } else {
                                abstractC22403o = null;
                            }
                        }
                        if (abstractC22403o == null) {
                            c28655q.m87150e0(-656109781);
                            c28655q.m87173q(false);
                            f16 = f14;
                            c2886a = null;
                            c0209i5 = c0209i3;
                            c0213j2 = c0213j;
                            modifier8 = modifier7;
                            c2314t3 = c2314t2;
                            f15 = 1.0f;
                            r15 = c28655q;
                        } else {
                            c28655q.m87150e0(-656109780);
                            c2886a = null;
                            C2314t c2314t12 = c2314t2;
                            float f116 = f14;
                            f15 = 1.0f;
                            AbstractC26165a abstractC26165aM64500i9 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                            Modifier modifierM107879c9 = AbstractC34132o.m107879c(f116, AbstractC1102d.m3407d(1.0f, c2314t12));
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                obj = objM87133R;
                                C22881b c22881b112 = new C22881b(28);
                                c28655q.m87172p0(c22881b112);
                                obj = c22881b112;
                            }
                            obj = objM87133R;
                            Modifier modifierM3486a9 = AbstractC1127a.m3486a(modifierM107879c9, (Function1) obj);
                            objM87133R2 = c28655q.m87133R();
                            obj2 = objM87133R2;
                            if (objM87133R2 == c28676v0) {
                                C22881b c22881b113 = new C22881b(29);
                                c28655q.m87172p0(c22881b113);
                                obj2 = c22881b113;
                            }
                            c0209i5 = c0209i3;
                            c0213j2 = c0213j;
                            c2314t3 = c2314t12;
                            modifier8 = modifier7;
                            f16 = f116;
                            AbstractC29125c.m88522c(abstractC26165aM64500i9, null, AbstractC1125a.m3480c(modifierM3486a9, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                            C28655q c28655q10 = c28655q;
                            c28655q10.m87173q(false);
                            r15 = c28655q10;
                        }
                        Modifier modifierM3396r9 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density5, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                        iHashCode2 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1110 = r15.m87165m();
                        Modifier modifierM118962N1110 = AbstractC37056f.m118962N(r15, modifierM3396r9);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            c0213j3 = c0213j2;
                            r15.m87163l(c0213j3);
                        } else {
                            c0213j3 = c0213j2;
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a9);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m1110);
                        if (r15.f115903S) {
                            c0209i6 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        } else {
                            c0209i6 = c0209i5;
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N1110);
                        Modifier modifierM3411h14 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                        iHashCode3 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111 = r15.m87165m();
                        Modifier modifierM118962N1111 = AbstractC37056f.m118962N(r15, modifierM3411h14);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j3);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a9);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m1111);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N1111);
                        startButton = viewState.getStartButton();
                        if (startButton.getIconRes() != null) {
                            r15.m87150e0(748152407);
                            Modifier modifierM3419p17 = AbstractC1102d.m3419p(f92568a, c2314t3);
                            C27270o c27270o17 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            boolean zM87157i17 = r15.m87157i(startButton);
                            if ((i15 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = zM87157i17 | z24;
                            Object objM87133R110 = r15.m87133R();
                            if (z25) {
                                i26 = 0;
                                InterfaceC4339a interfaceC4339a1111 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC23354d.m67613k(startButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(startButton, function4);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a1111);
                                obj5 = interfaceC4339a1111;
                            } else {
                                i26 = 0;
                                InterfaceC4339a interfaceC4339a1112 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC23354d.m67613k(startButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(startButton, function4);
                                        }
                                    }
                                };
                                r15.m87172p0(interfaceC4339a1112);
                                obj5 = interfaceC4339a1112;
                            }
                            ?? r21117 = i26;
                            c0209i7 = c0209i2;
                            c0209i8 = c0209i6;
                            AbstractC27242b1.m82092d(c27270o17, "Back", modifierM3419p17, null, (InterfaceC4339a) obj5, r15, 432, 8);
                            r15.m87173q(r21117);
                            r10 = r21117;
                        } else {
                            c0209i7 = c0209i2;
                            c0209i8 = c0209i6;
                            r10 = 0;
                            r15.m87150e0(748814443);
                            AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                        }
                        strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                        if (strM21274h.length() > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            r15.m87150e0(749045052);
                            ?? r21118 = C38072d.f163053a;
                            ?? r21119 = r15;
                            r16 = 1;
                            c0213j4 = c0213j3;
                            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r21118.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21118.m121952e(r15, 6).getH4(), null, r21119, 48, 0, 196600);
                            ?? r1116 = r21119;
                            r1116.m87173q(false);
                            r17 = r1116;
                        } else {
                            c0213j4 = c0213j3;
                            r16 = 1;
                            r15.m87150e0(749324300);
                            r15.m87173q(false);
                            r17 = r15;
                        }
                        endButton = viewState.getEndButton();
                        if (endButton != null) {
                            iconRes = endButton.getIconRes();
                        } else {
                            obj3 = c2886a;
                        }
                        if (obj3 != null) {
                            r17.m87150e0(749462591);
                            Modifier modifierM3419p18 = AbstractC1102d.m3419p(f92568a, c2314t3);
                            C27270o c27270o18 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                            boolean zM87157i18 = r17.m87157i(endButton);
                            if ((i15 & 896) == 256) {
                                obj3 = iconRes;
                                r24 = r16;
                            } else {
                                obj3 = iconRes;
                                r24 = 0;
                            }
                            i25 = r24 | (zM87157i18 ? 1 : 0);
                            Object objM87133R111 = r17.m87133R();
                            obj4 = objM87133R111;
                            if (i25 == 0) {
                                InterfaceC4339a interfaceC4339a1113 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (r16) {
                                            case 0:
                                                return AbstractC23354d.m67613k(endButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(endButton, function4);
                                        }
                                    }
                                };
                                r17.m87172p0(interfaceC4339a1113);
                                obj4 = interfaceC4339a1113;
                            } else {
                                InterfaceC4339a interfaceC4339a1114 = new InterfaceC4339a() { // from class: l51.c
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (r16) {
                                            case 0:
                                                return AbstractC23354d.m67613k(endButton, function4);
                                            default:
                                                return AbstractC23354d.m67614l(endButton, function4);
                                        }
                                    }
                                };
                                r17.m87172p0(interfaceC4339a1114);
                                obj4 = interfaceC4339a1114;
                            }
                            AbstractC27242b1.m82092d(c27270o18, "Action", modifierM3419p18, null, (InterfaceC4339a) obj4, r17, 432, 8);
                            i24 = 0;
                            r17.m87173q(false);
                        } else {
                            obj3 = iconRes;
                            i24 = 0;
                            r17.m87150e0(749963179);
                            AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                        }
                        r17.m87173q(r16);
                        strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                        if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                            r17.m87150e0(553718039);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                            InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode4 = Long.hashCode(r17.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1112 = r17.m87165m();
                            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(r17, modifierM3409f9);
                            r17.m87158i0();
                            if (r17.f115903S) {
                                r17.m87163l(c0213j4);
                            } else {
                                r17.m87178s0();
                            }
                            AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d14);
                            AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m1112);
                            if (r17.f115903S) {
                                AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                            } else {
                                AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                            }
                            AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N1112);
                            r19 = C38072d.f163053a;
                            long brandWhite9 = r19.m121949b(r17, 6).getBrandWhite();
                            subtitleStyle = viewState.getSubtitleStyle();
                            if (subtitleStyle != null) {
                                h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                            } else {
                                h7 = c2886a;
                            }
                            if (h7 == null) {
                                r17.m87150e0(-1038233573);
                                h7 = r19.m121952e(r17, 6).getH2();
                                z19 = false;
                            } else {
                                z19 = false;
                                r17.m87150e0(-1038236084);
                            }
                            r17.m87173q(z19);
                            C2886a c2886a10 = h7;
                            Modifier modifierM3398t9 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                            if (viewState.getSubtitleStickOnScroll()) {
                                f17 = 1.0f;
                            } else {
                                f17 = f16;
                            }
                            ?? r211110 = r17;
                            AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t9), brandWhite9, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a10, null, r211110, 0, 0, 196600);
                            ?? r1117 = r211110;
                            r1117.m87173q(r16);
                            r1117.m87173q(false);
                            r18 = r1117;
                        } else {
                            r17.m87150e0(554575995);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                            r17.m87173q(false);
                            r18 = r17;
                        }
                        r18.m87173q(r16);
                        r18.m87173q(r16);
                        function3 = function4;
                        z15 = z16;
                        modifier5 = modifier3;
                        modifier6 = modifier8;
                        r14 = r18;
                    } else {
                        f14 = f13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N119);
                    if (backgroundImage == null) {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    }
                    if (backgroundImage == 0) {
                        abstractC22403o = null;
                    } else {
                        if (f14 > 0.01f) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (z26) {
                            abstractC22403o = backgroundImage;
                        } else {
                            abstractC22403o = null;
                        }
                    }
                    if (abstractC22403o == null) {
                        c28655q.m87150e0(-656109781);
                        c28655q.m87173q(false);
                        f16 = f14;
                        c2886a = null;
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        modifier8 = modifier7;
                        c2314t3 = c2314t2;
                        f15 = 1.0f;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(-656109780);
                        c2886a = null;
                        C2314t c2314t13 = c2314t2;
                        float f117 = f14;
                        f15 = 1.0f;
                        AbstractC26165a abstractC26165aM64500i10 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                        Modifier modifierM107879c10 = AbstractC34132o.m107879c(f117, AbstractC1102d.m3407d(1.0f, c2314t13));
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            obj = objM87133R;
                            C22881b c22881b114 = new C22881b(28);
                            c28655q.m87172p0(c22881b114);
                            obj = c22881b114;
                        }
                        obj = objM87133R;
                        Modifier modifierM3486a10 = AbstractC1127a.m3486a(modifierM107879c10, (Function1) obj);
                        objM87133R2 = c28655q.m87133R();
                        obj2 = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            C22881b c22881b115 = new C22881b(29);
                            c28655q.m87172p0(c22881b115);
                            obj2 = c22881b115;
                        }
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        c2314t3 = c2314t13;
                        modifier8 = modifier7;
                        f16 = f117;
                        AbstractC29125c.m88522c(abstractC26165aM64500i10, null, AbstractC1125a.m3480c(modifierM3486a10, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        C28655q c28655q11 = c28655q;
                        c28655q11.m87173q(false);
                        r15 = c28655q11;
                    }
                    Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density5, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1113 = r15.m87165m();
                    Modifier modifierM118962N1113 = AbstractC37056f.m118962N(r15, modifierM3396r10);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        c0213j3 = c0213j2;
                        r15.m87163l(c0213j3);
                    } else {
                        c0213j3 = c0213j2;
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a10);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m1113);
                    if (r15.f115903S) {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    } else {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N1113);
                    Modifier modifierM3411h15 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                    C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1114 = r15.m87165m();
                    Modifier modifierM118962N1114 = AbstractC37056f.m118962N(r15, modifierM3411h15);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j3);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a10);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m1114);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N1114);
                    startButton = viewState.getStartButton();
                    if (startButton.getIconRes() != null) {
                        r15.m87150e0(748152407);
                        Modifier modifierM3419p19 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o19 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i19 = r15.m87157i(startButton);
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i19 | z24;
                        Object objM87133R112 = r15.m87133R();
                        if (z25) {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a1115 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a1115);
                            obj5 = interfaceC4339a1115;
                        } else {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a1116 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a1116);
                            obj5 = interfaceC4339a1116;
                        }
                        ?? r211111 = i26;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        AbstractC27242b1.m82092d(c27270o19, "Back", modifierM3419p19, null, (InterfaceC4339a) obj5, r15, 432, 8);
                        r15.m87173q(r211111);
                        r10 = r211111;
                    } else {
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        r10 = 0;
                        r15.m87150e0(748814443);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                    }
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                    if (strM21274h.length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        r15.m87150e0(749045052);
                        ?? r211112 = C38072d.f163053a;
                        ?? r211113 = r15;
                        r16 = 1;
                        c0213j4 = c0213j3;
                        AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r211112.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r211112.m121952e(r15, 6).getH4(), null, r211113, 48, 0, 196600);
                        ?? r1118 = r211113;
                        r1118.m87173q(false);
                        r17 = r1118;
                    } else {
                        c0213j4 = c0213j3;
                        r16 = 1;
                        r15.m87150e0(749324300);
                        r15.m87173q(false);
                        r17 = r15;
                    }
                    endButton = viewState.getEndButton();
                    if (endButton != null) {
                        iconRes = endButton.getIconRes();
                    } else {
                        obj3 = c2886a;
                    }
                    if (obj3 != null) {
                        r17.m87150e0(749462591);
                        Modifier modifierM3419p110 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o110 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i110 = r17.m87157i(endButton);
                        if ((i15 & 896) == 256) {
                            obj3 = iconRes;
                            r24 = r16;
                        } else {
                            obj3 = iconRes;
                            r24 = 0;
                        }
                        i25 = r24 | (zM87157i110 ? 1 : 0);
                        Object objM87133R113 = r17.m87133R();
                        obj4 = objM87133R113;
                        if (i25 == 0) {
                            InterfaceC4339a interfaceC4339a1117 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a1117);
                            obj4 = interfaceC4339a1117;
                        } else {
                            InterfaceC4339a interfaceC4339a1118 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a1118);
                            obj4 = interfaceC4339a1118;
                        }
                        AbstractC27242b1.m82092d(c27270o110, "Action", modifierM3419p110, null, (InterfaceC4339a) obj4, r17, 432, 8);
                        i24 = 0;
                        r17.m87173q(false);
                    } else {
                        obj3 = iconRes;
                        i24 = 0;
                        r17.m87150e0(749963179);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                    }
                    r17.m87173q(r16);
                    strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                    if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                        r17.m87150e0(553718039);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                        InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1115 = r17.m87165m();
                        Modifier modifierM118962N1115 = AbstractC37056f.m118962N(r17, modifierM3409f10);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j4);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d15);
                        AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m1115);
                        if (r17.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        }
                        AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N1115);
                        r19 = C38072d.f163053a;
                        long brandWhite10 = r19.m121949b(r17, 6).getBrandWhite();
                        subtitleStyle = viewState.getSubtitleStyle();
                        if (subtitleStyle != null) {
                            h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                        } else {
                            h7 = c2886a;
                        }
                        if (h7 == null) {
                            r17.m87150e0(-1038233573);
                            h7 = r19.m121952e(r17, 6).getH2();
                            z19 = false;
                        } else {
                            z19 = false;
                            r17.m87150e0(-1038236084);
                        }
                        r17.m87173q(z19);
                        C2886a c2886a11 = h7;
                        Modifier modifierM3398t10 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                        if (viewState.getSubtitleStickOnScroll()) {
                            f17 = 1.0f;
                        } else {
                            f17 = f16;
                        }
                        ?? r211114 = r17;
                        AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t10), brandWhite10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a11, null, r211114, 0, 0, 196600);
                        ?? r1119 = r211114;
                        r1119.m87173q(r16);
                        r1119.m87173q(false);
                        r18 = r1119;
                    } else {
                        r17.m87150e0(554575995);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(r16);
                    r18.m87173q(r16);
                    function3 = function4;
                    z15 = z16;
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    r14 = r18;
                } else {
                    c28655q.m87138X();
                    modifier5 = modifier3;
                    function3 = function2;
                    modifier6 = modifier4;
                    z15 = z13;
                    r14 = c28655q;
                }
                c28677v1M87180u = r14.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g(modifier5, viewState, function3, modifier6, z15, i13, i14, 24);
                }
            }
            i15 |= 24576;
            z13 = z4;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier3 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        obj6 = objM87133R3;
                        C22881b c22881b116 = new C22881b(27);
                        c28655q.m87172p0(c22881b116);
                        obj6 = c22881b116;
                    }
                    obj6 = objM87133R3;
                    function4 = (Function1) obj6;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier4;
                }
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                InterfaceC39171c interfaceC39171c6 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                WeakHashMap weakHashMap6 = C22944c2.f90553v;
                float density6 = C22949e.m66712e(c28655q).f90559f.m66705e().f151450b / interfaceC39171c6.getDensity();
                float fM67616n6 = m67616n(viewState);
                f13 = 1.0f - fM67616n6;
                companion = C23357g.INSTANCE;
                float fM67643a6 = companion.m67643a() + companion.m67647e(viewState.getSubtitle(), viewState.getSubtitleStyle(), viewState.getSubtitleStickOnScroll());
                float fM67644b6 = ((companion.m67644b() - fM67643a6) * f13) + fM67643a6 + density6;
                backgroundImage = viewState.getBackgroundImage();
                Modifier modifierM3411h16 = AbstractC1102d.m3411h(fM67644b6, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifier7)));
                if (backgroundImage == null) {
                    c28655q.m87150e0(278021772);
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    z17 = false;
                    c28655q.m87150e0(278121468);
                    c28655q.m87173q(false);
                    modifierM3358c = c2314t;
                }
                Modifier modifierMo3471e6 = modifierM3411h16.mo3471e(modifierM3358c);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(c2307m, z17);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierMo3471e6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d16);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m1116);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1116);
                    if (backgroundImage == null) {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    }
                    if (backgroundImage == 0) {
                        abstractC22403o = null;
                    } else {
                        if (f14 > 0.01f) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (z26) {
                            abstractC22403o = backgroundImage;
                        } else {
                            abstractC22403o = null;
                        }
                    }
                    if (abstractC22403o == null) {
                        c28655q.m87150e0(-656109781);
                        c28655q.m87173q(false);
                        f16 = f14;
                        c2886a = null;
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        modifier8 = modifier7;
                        c2314t3 = c2314t2;
                        f15 = 1.0f;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(-656109780);
                        c2886a = null;
                        C2314t c2314t14 = c2314t2;
                        float f118 = f14;
                        f15 = 1.0f;
                        AbstractC26165a abstractC26165aM64500i11 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                        Modifier modifierM107879c11 = AbstractC34132o.m107879c(f118, AbstractC1102d.m3407d(1.0f, c2314t14));
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            obj = objM87133R;
                            C22881b c22881b117 = new C22881b(28);
                            c28655q.m87172p0(c22881b117);
                            obj = c22881b117;
                        }
                        obj = objM87133R;
                        Modifier modifierM3486a11 = AbstractC1127a.m3486a(modifierM107879c11, (Function1) obj);
                        objM87133R2 = c28655q.m87133R();
                        obj2 = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            C22881b c22881b118 = new C22881b(29);
                            c28655q.m87172p0(c22881b118);
                            obj2 = c22881b118;
                        }
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        c2314t3 = c2314t14;
                        modifier8 = modifier7;
                        f16 = f118;
                        AbstractC29125c.m88522c(abstractC26165aM64500i11, null, AbstractC1125a.m3480c(modifierM3486a11, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        C28655q c28655q12 = c28655q;
                        c28655q12.m87173q(false);
                        r15 = c28655q12;
                    }
                    Modifier modifierM3396r11 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density6, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = r15.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(r15, modifierM3396r11);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        c0213j3 = c0213j2;
                        r15.m87163l(c0213j3);
                    } else {
                        c0213j3 = c0213j2;
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a11);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m1117);
                    if (r15.f115903S) {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    } else {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N1117);
                    Modifier modifierM3411h17 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1118 = r15.m87165m();
                    Modifier modifierM118962N1118 = AbstractC37056f.m118962N(r15, modifierM3411h17);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j3);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a11);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m1118);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N1118);
                    startButton = viewState.getStartButton();
                    if (startButton.getIconRes() != null) {
                        r15.m87150e0(748152407);
                        Modifier modifierM3419p111 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o111 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i111 = r15.m87157i(startButton);
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i111 | z24;
                        Object objM87133R114 = r15.m87133R();
                        if (z25) {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a1119 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a1119);
                            obj5 = interfaceC4339a1119;
                        } else {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a11110 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a11110);
                            obj5 = interfaceC4339a11110;
                        }
                        ?? r211115 = i26;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        AbstractC27242b1.m82092d(c27270o111, "Back", modifierM3419p111, null, (InterfaceC4339a) obj5, r15, 432, 8);
                        r15.m87173q(r211115);
                        r10 = r211115;
                    } else {
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        r10 = 0;
                        r15.m87150e0(748814443);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                    }
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                    if (strM21274h.length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        r15.m87150e0(749045052);
                        ?? r211116 = C38072d.f163053a;
                        ?? r211117 = r15;
                        r16 = 1;
                        c0213j4 = c0213j3;
                        AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r211116.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r211116.m121952e(r15, 6).getH4(), null, r211117, 48, 0, 196600);
                        ?? r11110 = r211117;
                        r11110.m87173q(false);
                        r17 = r11110;
                    } else {
                        c0213j4 = c0213j3;
                        r16 = 1;
                        r15.m87150e0(749324300);
                        r15.m87173q(false);
                        r17 = r15;
                    }
                    endButton = viewState.getEndButton();
                    if (endButton != null) {
                        iconRes = endButton.getIconRes();
                    } else {
                        obj3 = c2886a;
                    }
                    if (obj3 != null) {
                        r17.m87150e0(749462591);
                        Modifier modifierM3419p112 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o112 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i112 = r17.m87157i(endButton);
                        if ((i15 & 896) == 256) {
                            obj3 = iconRes;
                            r24 = r16;
                        } else {
                            obj3 = iconRes;
                            r24 = 0;
                        }
                        i25 = r24 | (zM87157i112 ? 1 : 0);
                        Object objM87133R115 = r17.m87133R();
                        obj4 = objM87133R115;
                        if (i25 == 0) {
                            InterfaceC4339a interfaceC4339a11111 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a11111);
                            obj4 = interfaceC4339a11111;
                        } else {
                            InterfaceC4339a interfaceC4339a11112 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a11112);
                            obj4 = interfaceC4339a11112;
                        }
                        AbstractC27242b1.m82092d(c27270o112, "Action", modifierM3419p112, null, (InterfaceC4339a) obj4, r17, 432, 8);
                        i24 = 0;
                        r17.m87173q(false);
                    } else {
                        obj3 = iconRes;
                        i24 = 0;
                        r17.m87150e0(749963179);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                    }
                    r17.m87173q(r16);
                    strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                    if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                        r17.m87150e0(553718039);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                        InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1119 = r17.m87165m();
                        Modifier modifierM118962N1119 = AbstractC37056f.m118962N(r17, modifierM3409f11);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j4);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d17);
                        AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m1119);
                        if (r17.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        }
                        AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N1119);
                        r19 = C38072d.f163053a;
                        long brandWhite11 = r19.m121949b(r17, 6).getBrandWhite();
                        subtitleStyle = viewState.getSubtitleStyle();
                        if (subtitleStyle != null) {
                            h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                        } else {
                            h7 = c2886a;
                        }
                        if (h7 == null) {
                            r17.m87150e0(-1038233573);
                            h7 = r19.m121952e(r17, 6).getH2();
                            z19 = false;
                        } else {
                            z19 = false;
                            r17.m87150e0(-1038236084);
                        }
                        r17.m87173q(z19);
                        C2886a c2886a12 = h7;
                        Modifier modifierM3398t11 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                        if (viewState.getSubtitleStickOnScroll()) {
                            f17 = 1.0f;
                        } else {
                            f17 = f16;
                        }
                        ?? r211118 = r17;
                        AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t11), brandWhite11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a12, null, r211118, 0, 0, 196600);
                        ?? r11111 = r211118;
                        r11111.m87173q(r16);
                        r11111.m87173q(false);
                        r18 = r11111;
                    } else {
                        r17.m87150e0(554575995);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(r16);
                    r18.m87173q(r16);
                    function3 = function4;
                    z15 = z16;
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    r14 = r18;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N1116);
                if (backgroundImage == null) {
                    c2314t2 = c2314t;
                    c3 = 6;
                    c28655q.m87150e0(-656203214);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c3 = 6;
                    c28655q.m87150e0(-656203214);
                    c28655q.m87173q(false);
                }
                if (backgroundImage == 0) {
                    abstractC22403o = null;
                } else {
                    if (f14 > 0.01f) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if (z26) {
                        abstractC22403o = backgroundImage;
                    } else {
                        abstractC22403o = null;
                    }
                }
                if (abstractC22403o == null) {
                    c28655q.m87150e0(-656109781);
                    c28655q.m87173q(false);
                    f16 = f14;
                    c2886a = null;
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    modifier8 = modifier7;
                    c2314t3 = c2314t2;
                    f15 = 1.0f;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(-656109780);
                    c2886a = null;
                    C2314t c2314t15 = c2314t2;
                    float f119 = f14;
                    f15 = 1.0f;
                    AbstractC26165a abstractC26165aM64500i12 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                    Modifier modifierM107879c12 = AbstractC34132o.m107879c(f119, AbstractC1102d.m3407d(1.0f, c2314t15));
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        obj = objM87133R;
                        C22881b c22881b119 = new C22881b(28);
                        c28655q.m87172p0(c22881b119);
                        obj = c22881b119;
                    }
                    obj = objM87133R;
                    Modifier modifierM3486a12 = AbstractC1127a.m3486a(modifierM107879c12, (Function1) obj);
                    objM87133R2 = c28655q.m87133R();
                    obj2 = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        C22881b c22881b1110 = new C22881b(29);
                        c28655q.m87172p0(c22881b1110);
                        obj2 = c22881b1110;
                    }
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    c2314t3 = c2314t15;
                    modifier8 = modifier7;
                    f16 = f119;
                    AbstractC29125c.m88522c(abstractC26165aM64500i12, null, AbstractC1125a.m3480c(modifierM3486a12, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                    C28655q c28655q13 = c28655q;
                    c28655q13.m87173q(false);
                    r15 = c28655q13;
                }
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density6, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = r15.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(r15, modifierM3396r12);
                r15.m87158i0();
                if (r15.f115903S) {
                    c0213j3 = c0213j2;
                    r15.m87163l(c0213j3);
                } else {
                    c0213j3 = c0213j2;
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a12);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m11110);
                if (r15.f115903S) {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                } else {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N11110);
                Modifier modifierM3411h18 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111 = r15.m87165m();
                Modifier modifierM118962N11111 = AbstractC37056f.m118962N(r15, modifierM3411h18);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j3);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a12);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m11111);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N11111);
                startButton = viewState.getStartButton();
                if (startButton.getIconRes() != null) {
                    r15.m87150e0(748152407);
                    Modifier modifierM3419p113 = AbstractC1102d.m3419p(f92568a, c2314t3);
                    C27270o c27270o113 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    boolean zM87157i113 = r15.m87157i(startButton);
                    if ((i15 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i113 | z24;
                    Object objM87133R116 = r15.m87133R();
                    if (z25) {
                        i26 = 0;
                        InterfaceC4339a interfaceC4339a11113 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC23354d.m67613k(startButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(startButton, function4);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a11113);
                        obj5 = interfaceC4339a11113;
                    } else {
                        i26 = 0;
                        InterfaceC4339a interfaceC4339a11114 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC23354d.m67613k(startButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(startButton, function4);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a11114);
                        obj5 = interfaceC4339a11114;
                    }
                    ?? r211119 = i26;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i6;
                    AbstractC27242b1.m82092d(c27270o113, "Back", modifierM3419p113, null, (InterfaceC4339a) obj5, r15, 432, 8);
                    r15.m87173q(r211119);
                    r10 = r211119;
                } else {
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i6;
                    r10 = 0;
                    r15.m87150e0(748814443);
                    AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                }
                strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                if (strM21274h.length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    r15.m87150e0(749045052);
                    ?? r2111110 = C38072d.f163053a;
                    ?? r2111111 = r15;
                    r16 = 1;
                    c0213j4 = c0213j3;
                    AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r2111110.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2111110.m121952e(r15, 6).getH4(), null, r2111111, 48, 0, 196600);
                    ?? r11112 = r2111111;
                    r11112.m87173q(false);
                    r17 = r11112;
                } else {
                    c0213j4 = c0213j3;
                    r16 = 1;
                    r15.m87150e0(749324300);
                    r15.m87173q(false);
                    r17 = r15;
                }
                endButton = viewState.getEndButton();
                if (endButton != null) {
                    iconRes = endButton.getIconRes();
                } else {
                    obj3 = c2886a;
                }
                if (obj3 != null) {
                    r17.m87150e0(749462591);
                    Modifier modifierM3419p114 = AbstractC1102d.m3419p(f92568a, c2314t3);
                    C27270o c27270o114 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    boolean zM87157i114 = r17.m87157i(endButton);
                    if ((i15 & 896) == 256) {
                        obj3 = iconRes;
                        r24 = r16;
                    } else {
                        obj3 = iconRes;
                        r24 = 0;
                    }
                    i25 = r24 | (zM87157i114 ? 1 : 0);
                    Object objM87133R117 = r17.m87133R();
                    obj4 = objM87133R117;
                    if (i25 == 0) {
                        InterfaceC4339a interfaceC4339a11115 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r16) {
                                    case 0:
                                        return AbstractC23354d.m67613k(endButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(endButton, function4);
                                }
                            }
                        };
                        r17.m87172p0(interfaceC4339a11115);
                        obj4 = interfaceC4339a11115;
                    } else {
                        InterfaceC4339a interfaceC4339a11116 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r16) {
                                    case 0:
                                        return AbstractC23354d.m67613k(endButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(endButton, function4);
                                }
                            }
                        };
                        r17.m87172p0(interfaceC4339a11116);
                        obj4 = interfaceC4339a11116;
                    }
                    AbstractC27242b1.m82092d(c27270o114, "Action", modifierM3419p114, null, (InterfaceC4339a) obj4, r17, 432, 8);
                    i24 = 0;
                    r17.m87173q(false);
                } else {
                    obj3 = iconRes;
                    i24 = 0;
                    r17.m87150e0(749963179);
                    AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                }
                r17.m87173q(r16);
                strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                    r17.m87150e0(553718039);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                    InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11112 = r17.m87165m();
                    Modifier modifierM118962N11112 = AbstractC37056f.m118962N(r17, modifierM3409f12);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j4);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d18);
                    AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m11112);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                    }
                    AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N11112);
                    r19 = C38072d.f163053a;
                    long brandWhite12 = r19.m121949b(r17, 6).getBrandWhite();
                    subtitleStyle = viewState.getSubtitleStyle();
                    if (subtitleStyle != null) {
                        h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                    } else {
                        h7 = c2886a;
                    }
                    if (h7 == null) {
                        r17.m87150e0(-1038233573);
                        h7 = r19.m121952e(r17, 6).getH2();
                        z19 = false;
                    } else {
                        z19 = false;
                        r17.m87150e0(-1038236084);
                    }
                    r17.m87173q(z19);
                    C2886a c2886a13 = h7;
                    Modifier modifierM3398t12 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                    if (viewState.getSubtitleStickOnScroll()) {
                        f17 = 1.0f;
                    } else {
                        f17 = f16;
                    }
                    ?? r2111112 = r17;
                    AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t12), brandWhite12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a13, null, r2111112, 0, 0, 196600);
                    ?? r11113 = r2111112;
                    r11113.m87173q(r16);
                    r11113.m87173q(false);
                    r18 = r11113;
                } else {
                    r17.m87150e0(554575995);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(r16);
                r18.m87173q(r16);
                function3 = function4;
                z15 = z16;
                modifier5 = modifier3;
                modifier6 = modifier8;
                r14 = r18;
            } else {
                c28655q.m87138X();
                modifier5 = modifier3;
                function3 = function2;
                modifier6 = modifier4;
                z15 = z13;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(modifier5, viewState, function3, modifier6, z15, i13, i14, 24);
            }
        }
        i15 |= 3072;
        modifier4 = modifier2;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier3 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        obj6 = objM87133R3;
                        C22881b c22881b1111 = new C22881b(27);
                        c28655q.m87172p0(c22881b1111);
                        obj6 = c22881b1111;
                    }
                    obj6 = objM87133R3;
                    function4 = (Function1) obj6;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier4;
                }
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                InterfaceC39171c interfaceC39171c7 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                WeakHashMap weakHashMap7 = C22944c2.f90553v;
                float density7 = C22949e.m66712e(c28655q).f90559f.m66705e().f151450b / interfaceC39171c7.getDensity();
                float fM67616n7 = m67616n(viewState);
                f13 = 1.0f - fM67616n7;
                companion = C23357g.INSTANCE;
                float fM67643a7 = companion.m67643a() + companion.m67647e(viewState.getSubtitle(), viewState.getSubtitleStyle(), viewState.getSubtitleStickOnScroll());
                float fM67644b7 = ((companion.m67644b() - fM67643a7) * f13) + fM67643a7 + density7;
                backgroundImage = viewState.getBackgroundImage();
                Modifier modifierM3411h19 = AbstractC1102d.m3411h(fM67644b7, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifier7)));
                if (backgroundImage == null) {
                    c28655q.m87150e0(278021772);
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    z17 = false;
                    c28655q.m87150e0(278121468);
                    c28655q.m87173q(false);
                    modifierM3358c = c2314t;
                }
                Modifier modifierMo3471e7 = modifierM3411h19.mo3471e(modifierM3358c);
                c2307m = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m, z17);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, modifierMo3471e7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d19);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11113);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11113);
                    if (backgroundImage == null) {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        c3 = 6;
                        c28655q.m87150e0(-656203214);
                        c28655q.m87173q(false);
                    }
                    if (backgroundImage == 0) {
                        abstractC22403o = null;
                    } else {
                        if (f14 > 0.01f) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (z26) {
                            abstractC22403o = backgroundImage;
                        } else {
                            abstractC22403o = null;
                        }
                    }
                    if (abstractC22403o == null) {
                        c28655q.m87150e0(-656109781);
                        c28655q.m87173q(false);
                        f16 = f14;
                        c2886a = null;
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        modifier8 = modifier7;
                        c2314t3 = c2314t2;
                        f15 = 1.0f;
                        r15 = c28655q;
                    } else {
                        c28655q.m87150e0(-656109780);
                        c2886a = null;
                        C2314t c2314t16 = c2314t2;
                        float f1110 = f14;
                        f15 = 1.0f;
                        AbstractC26165a abstractC26165aM64500i13 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                        Modifier modifierM107879c13 = AbstractC34132o.m107879c(f1110, AbstractC1102d.m3407d(1.0f, c2314t16));
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            obj = objM87133R;
                            C22881b c22881b1112 = new C22881b(28);
                            c28655q.m87172p0(c22881b1112);
                            obj = c22881b1112;
                        }
                        obj = objM87133R;
                        Modifier modifierM3486a13 = AbstractC1127a.m3486a(modifierM107879c13, (Function1) obj);
                        objM87133R2 = c28655q.m87133R();
                        obj2 = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            C22881b c22881b1113 = new C22881b(29);
                            c28655q.m87172p0(c22881b1113);
                            obj2 = c22881b1113;
                        }
                        c0209i5 = c0209i3;
                        c0213j2 = c0213j;
                        c2314t3 = c2314t16;
                        modifier8 = modifier7;
                        f16 = f1110;
                        AbstractC29125c.m88522c(abstractC26165aM64500i13, null, AbstractC1125a.m3480c(modifierM3486a13, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                        C28655q c28655q14 = c28655q;
                        c28655q14.m87173q(false);
                        r15 = c28655q14;
                    }
                    Modifier modifierM3396r13 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density7, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = r15.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(r15, modifierM3396r13);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        c0213j3 = c0213j2;
                        r15.m87163l(c0213j3);
                    } else {
                        c0213j3 = c0213j2;
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a13);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m11114);
                    if (r15.f115903S) {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    } else {
                        c0209i6 = c0209i5;
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N11114);
                    Modifier modifierM3411h110 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11115 = r15.m87165m();
                    Modifier modifierM118962N11115 = AbstractC37056f.m118962N(r15, modifierM3411h110);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j3);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a13);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m11115);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N11115);
                    startButton = viewState.getStartButton();
                    if (startButton.getIconRes() != null) {
                        r15.m87150e0(748152407);
                        Modifier modifierM3419p115 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o115 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i115 = r15.m87157i(startButton);
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i115 | z24;
                        Object objM87133R118 = r15.m87133R();
                        if (z25) {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a11117 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a11117);
                            obj5 = interfaceC4339a11117;
                        } else {
                            i26 = 0;
                            InterfaceC4339a interfaceC4339a11118 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC23354d.m67613k(startButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(startButton, function4);
                                    }
                                }
                            };
                            r15.m87172p0(interfaceC4339a11118);
                            obj5 = interfaceC4339a11118;
                        }
                        ?? r2111113 = i26;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        AbstractC27242b1.m82092d(c27270o115, "Back", modifierM3419p115, null, (InterfaceC4339a) obj5, r15, 432, 8);
                        r15.m87173q(r2111113);
                        r10 = r2111113;
                    } else {
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i6;
                        r10 = 0;
                        r15.m87150e0(748814443);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                    }
                    strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                    if (strM21274h.length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        r15.m87150e0(749045052);
                        ?? r2111114 = C38072d.f163053a;
                        ?? r2111115 = r15;
                        r16 = 1;
                        c0213j4 = c0213j3;
                        AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r2111114.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2111114.m121952e(r15, 6).getH4(), null, r2111115, 48, 0, 196600);
                        ?? r11114 = r2111115;
                        r11114.m87173q(false);
                        r17 = r11114;
                    } else {
                        c0213j4 = c0213j3;
                        r16 = 1;
                        r15.m87150e0(749324300);
                        r15.m87173q(false);
                        r17 = r15;
                    }
                    endButton = viewState.getEndButton();
                    if (endButton != null) {
                        iconRes = endButton.getIconRes();
                    } else {
                        obj3 = c2886a;
                    }
                    if (obj3 != null) {
                        r17.m87150e0(749462591);
                        Modifier modifierM3419p116 = AbstractC1102d.m3419p(f92568a, c2314t3);
                        C27270o c27270o116 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        boolean zM87157i116 = r17.m87157i(endButton);
                        if ((i15 & 896) == 256) {
                            obj3 = iconRes;
                            r24 = r16;
                        } else {
                            obj3 = iconRes;
                            r24 = 0;
                        }
                        i25 = r24 | (zM87157i116 ? 1 : 0);
                        Object objM87133R119 = r17.m87133R();
                        obj4 = objM87133R119;
                        if (i25 == 0) {
                            InterfaceC4339a interfaceC4339a11119 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a11119);
                            obj4 = interfaceC4339a11119;
                        } else {
                            InterfaceC4339a interfaceC4339a111110 = new InterfaceC4339a() { // from class: l51.c
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (r16) {
                                        case 0:
                                            return AbstractC23354d.m67613k(endButton, function4);
                                        default:
                                            return AbstractC23354d.m67614l(endButton, function4);
                                    }
                                }
                            };
                            r17.m87172p0(interfaceC4339a111110);
                            obj4 = interfaceC4339a111110;
                        }
                        AbstractC27242b1.m82092d(c27270o116, "Action", modifierM3419p116, null, (InterfaceC4339a) obj4, r17, 432, 8);
                        i24 = 0;
                        r17.m87173q(false);
                    } else {
                        obj3 = iconRes;
                        i24 = 0;
                        r17.m87150e0(749963179);
                        AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                    }
                    r17.m87173q(r16);
                    strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                    if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                        r17.m87150e0(553718039);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                        InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11116 = r17.m87165m();
                        Modifier modifierM118962N11116 = AbstractC37056f.m118962N(r17, modifierM3409f13);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j4);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d110);
                        AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m11116);
                        if (r17.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                        }
                        AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N11116);
                        r19 = C38072d.f163053a;
                        long brandWhite13 = r19.m121949b(r17, 6).getBrandWhite();
                        subtitleStyle = viewState.getSubtitleStyle();
                        if (subtitleStyle != null) {
                            h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                        } else {
                            h7 = c2886a;
                        }
                        if (h7 == null) {
                            r17.m87150e0(-1038233573);
                            h7 = r19.m121952e(r17, 6).getH2();
                            z19 = false;
                        } else {
                            z19 = false;
                            r17.m87150e0(-1038236084);
                        }
                        r17.m87173q(z19);
                        C2886a c2886a14 = h7;
                        Modifier modifierM3398t13 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                        if (viewState.getSubtitleStickOnScroll()) {
                            f17 = 1.0f;
                        } else {
                            f17 = f16;
                        }
                        ?? r2111116 = r17;
                        AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t13), brandWhite13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a14, null, r2111116, 0, 0, 196600);
                        ?? r11115 = r2111116;
                        r11115.m87173q(r16);
                        r11115.m87173q(false);
                        r18 = r11115;
                    } else {
                        r17.m87150e0(554575995);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                        r17.m87173q(false);
                        r18 = r17;
                    }
                    r18.m87173q(r16);
                    r18.m87173q(r16);
                    function3 = function4;
                    z15 = z16;
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    r14 = r18;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11113);
                if (backgroundImage == null) {
                    c2314t2 = c2314t;
                    c3 = 6;
                    c28655q.m87150e0(-656203214);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c3 = 6;
                    c28655q.m87150e0(-656203214);
                    c28655q.m87173q(false);
                }
                if (backgroundImage == 0) {
                    abstractC22403o = null;
                } else {
                    if (f14 > 0.01f) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if (z26) {
                        abstractC22403o = backgroundImage;
                    } else {
                        abstractC22403o = null;
                    }
                }
                if (abstractC22403o == null) {
                    c28655q.m87150e0(-656109781);
                    c28655q.m87173q(false);
                    f16 = f14;
                    c2886a = null;
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    modifier8 = modifier7;
                    c2314t3 = c2314t2;
                    f15 = 1.0f;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(-656109780);
                    c2886a = null;
                    C2314t c2314t17 = c2314t2;
                    float f1111 = f14;
                    f15 = 1.0f;
                    AbstractC26165a abstractC26165aM64500i14 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                    Modifier modifierM107879c14 = AbstractC34132o.m107879c(f1111, AbstractC1102d.m3407d(1.0f, c2314t17));
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        obj = objM87133R;
                        C22881b c22881b1114 = new C22881b(28);
                        c28655q.m87172p0(c22881b1114);
                        obj = c22881b1114;
                    }
                    obj = objM87133R;
                    Modifier modifierM3486a14 = AbstractC1127a.m3486a(modifierM107879c14, (Function1) obj);
                    objM87133R2 = c28655q.m87133R();
                    obj2 = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        C22881b c22881b1115 = new C22881b(29);
                        c28655q.m87172p0(c22881b1115);
                        obj2 = c22881b1115;
                    }
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    c2314t3 = c2314t17;
                    modifier8 = modifier7;
                    f16 = f1111;
                    AbstractC29125c.m88522c(abstractC26165aM64500i14, null, AbstractC1125a.m3480c(modifierM3486a14, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                    C28655q c28655q15 = c28655q;
                    c28655q15.m87173q(false);
                    r15 = c28655q15;
                }
                Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density7, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11117 = r15.m87165m();
                Modifier modifierM118962N11117 = AbstractC37056f.m118962N(r15, modifierM3396r14);
                r15.m87158i0();
                if (r15.f115903S) {
                    c0213j3 = c0213j2;
                    r15.m87163l(c0213j3);
                } else {
                    c0213j3 = c0213j2;
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a14);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m11117);
                if (r15.f115903S) {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                } else {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N11117);
                Modifier modifierM3411h111 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11118 = r15.m87165m();
                Modifier modifierM118962N11118 = AbstractC37056f.m118962N(r15, modifierM3411h111);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j3);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a14);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m11118);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N11118);
                startButton = viewState.getStartButton();
                if (startButton.getIconRes() != null) {
                    r15.m87150e0(748152407);
                    Modifier modifierM3419p117 = AbstractC1102d.m3419p(f92568a, c2314t3);
                    C27270o c27270o117 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    boolean zM87157i117 = r15.m87157i(startButton);
                    if ((i15 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i117 | z24;
                    Object objM87133R1110 = r15.m87133R();
                    if (z25) {
                        i26 = 0;
                        InterfaceC4339a interfaceC4339a111111 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC23354d.m67613k(startButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(startButton, function4);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a111111);
                        obj5 = interfaceC4339a111111;
                    } else {
                        i26 = 0;
                        InterfaceC4339a interfaceC4339a111112 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC23354d.m67613k(startButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(startButton, function4);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a111112);
                        obj5 = interfaceC4339a111112;
                    }
                    ?? r2111117 = i26;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i6;
                    AbstractC27242b1.m82092d(c27270o117, "Back", modifierM3419p117, null, (InterfaceC4339a) obj5, r15, 432, 8);
                    r15.m87173q(r2111117);
                    r10 = r2111117;
                } else {
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i6;
                    r10 = 0;
                    r15.m87150e0(748814443);
                    AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                }
                strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                if (strM21274h.length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    r15.m87150e0(749045052);
                    ?? r2111118 = C38072d.f163053a;
                    ?? r2111119 = r15;
                    r16 = 1;
                    c0213j4 = c0213j3;
                    AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r2111118.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r2111118.m121952e(r15, 6).getH4(), null, r2111119, 48, 0, 196600);
                    ?? r11116 = r2111119;
                    r11116.m87173q(false);
                    r17 = r11116;
                } else {
                    c0213j4 = c0213j3;
                    r16 = 1;
                    r15.m87150e0(749324300);
                    r15.m87173q(false);
                    r17 = r15;
                }
                endButton = viewState.getEndButton();
                if (endButton != null) {
                    iconRes = endButton.getIconRes();
                } else {
                    obj3 = c2886a;
                }
                if (obj3 != null) {
                    r17.m87150e0(749462591);
                    Modifier modifierM3419p118 = AbstractC1102d.m3419p(f92568a, c2314t3);
                    C27270o c27270o118 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    boolean zM87157i118 = r17.m87157i(endButton);
                    if ((i15 & 896) == 256) {
                        obj3 = iconRes;
                        r24 = r16;
                    } else {
                        obj3 = iconRes;
                        r24 = 0;
                    }
                    i25 = r24 | (zM87157i118 ? 1 : 0);
                    Object objM87133R1111 = r17.m87133R();
                    obj4 = objM87133R1111;
                    if (i25 == 0) {
                        InterfaceC4339a interfaceC4339a111113 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r16) {
                                    case 0:
                                        return AbstractC23354d.m67613k(endButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(endButton, function4);
                                }
                            }
                        };
                        r17.m87172p0(interfaceC4339a111113);
                        obj4 = interfaceC4339a111113;
                    } else {
                        InterfaceC4339a interfaceC4339a111114 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r16) {
                                    case 0:
                                        return AbstractC23354d.m67613k(endButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(endButton, function4);
                                }
                            }
                        };
                        r17.m87172p0(interfaceC4339a111114);
                        obj4 = interfaceC4339a111114;
                    }
                    AbstractC27242b1.m82092d(c27270o118, "Action", modifierM3419p118, null, (InterfaceC4339a) obj4, r17, 432, 8);
                    i24 = 0;
                    r17.m87173q(false);
                } else {
                    obj3 = iconRes;
                    i24 = 0;
                    r17.m87150e0(749963179);
                    AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                }
                r17.m87173q(r16);
                strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                    r17.m87150e0(553718039);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                    InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11119 = r17.m87165m();
                    Modifier modifierM118962N11119 = AbstractC37056f.m118962N(r17, modifierM3409f14);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j4);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d111);
                    AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m11119);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                    }
                    AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N11119);
                    r19 = C38072d.f163053a;
                    long brandWhite14 = r19.m121949b(r17, 6).getBrandWhite();
                    subtitleStyle = viewState.getSubtitleStyle();
                    if (subtitleStyle != null) {
                        h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                    } else {
                        h7 = c2886a;
                    }
                    if (h7 == null) {
                        r17.m87150e0(-1038233573);
                        h7 = r19.m121952e(r17, 6).getH2();
                        z19 = false;
                    } else {
                        z19 = false;
                        r17.m87150e0(-1038236084);
                    }
                    r17.m87173q(z19);
                    C2886a c2886a15 = h7;
                    Modifier modifierM3398t14 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                    if (viewState.getSubtitleStickOnScroll()) {
                        f17 = 1.0f;
                    } else {
                        f17 = f16;
                    }
                    ?? r21111110 = r17;
                    AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t14), brandWhite14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a15, null, r21111110, 0, 0, 196600);
                    ?? r11117 = r21111110;
                    r11117.m87173q(r16);
                    r11117.m87173q(false);
                    r18 = r11117;
                } else {
                    r17.m87150e0(554575995);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(r16);
                r18.m87173q(r16);
                function3 = function4;
                z15 = z16;
                modifier5 = modifier3;
                modifier6 = modifier8;
                r14 = r18;
            } else {
                c28655q.m87138X();
                modifier5 = modifier3;
                function3 = function2;
                modifier6 = modifier4;
                z15 = z13;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(modifier5, viewState, function3, modifier6, z15, i13, i14, 24);
            }
        }
        i15 |= 24576;
        z13 = z4;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier3 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    obj6 = objM87133R3;
                    C22881b c22881b1116 = new C22881b(27);
                    c28655q.m87172p0(c22881b1116);
                    obj6 = c22881b1116;
                }
                obj6 = objM87133R3;
                function4 = (Function1) obj6;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                modifier7 = c2314t;
            } else {
                modifier7 = modifier4;
            }
            if (i18 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            InterfaceC39171c interfaceC39171c8 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            WeakHashMap weakHashMap8 = C22944c2.f90553v;
            float density8 = C22949e.m66712e(c28655q).f90559f.m66705e().f151450b / interfaceC39171c8.getDensity();
            float fM67616n8 = m67616n(viewState);
            f13 = 1.0f - fM67616n8;
            companion = C23357g.INSTANCE;
            float fM67643a8 = companion.m67643a() + companion.m67647e(viewState.getSubtitle(), viewState.getSubtitleStyle(), viewState.getSubtitleStickOnScroll());
            float fM67644b8 = ((companion.m67644b() - fM67643a8) * f13) + fM67643a8 + density8;
            backgroundImage = viewState.getBackgroundImage();
            Modifier modifierM3411h112 = AbstractC1102d.m3411h(fM67644b8, AbstractC1102d.m3409f(1.0f, modifier3.mo3471e(modifier7)));
            if (backgroundImage == null) {
                c28655q.m87150e0(278021772);
                modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                z17 = false;
                c28655q.m87173q(false);
            } else {
                z17 = false;
                c28655q.m87150e0(278121468);
                c28655q.m87173q(false);
                modifierM3358c = c2314t;
            }
            Modifier modifierMo3471e8 = modifierM3411h112.mo3471e(modifierM3358c);
            c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(c2307m, z17);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q.m87165m();
            Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q, modifierMo3471e8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d112);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m111110);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                f14 = f13;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111110);
                if (backgroundImage == null) {
                    c2314t2 = c2314t;
                    c3 = 6;
                    c28655q.m87150e0(-656203214);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    c3 = 6;
                    c28655q.m87150e0(-656203214);
                    c28655q.m87173q(false);
                }
                if (backgroundImage == 0) {
                    abstractC22403o = null;
                } else {
                    if (f14 > 0.01f) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if (z26) {
                        abstractC22403o = backgroundImage;
                    } else {
                        abstractC22403o = null;
                    }
                }
                if (abstractC22403o == null) {
                    c28655q.m87150e0(-656109781);
                    c28655q.m87173q(false);
                    f16 = f14;
                    c2886a = null;
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    modifier8 = modifier7;
                    c2314t3 = c2314t2;
                    f15 = 1.0f;
                    r15 = c28655q;
                } else {
                    c28655q.m87150e0(-656109780);
                    c2886a = null;
                    C2314t c2314t18 = c2314t2;
                    float f1112 = f14;
                    f15 = 1.0f;
                    AbstractC26165a abstractC26165aM64500i15 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                    Modifier modifierM107879c15 = AbstractC34132o.m107879c(f1112, AbstractC1102d.m3407d(1.0f, c2314t18));
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        obj = objM87133R;
                        C22881b c22881b1117 = new C22881b(28);
                        c28655q.m87172p0(c22881b1117);
                        obj = c22881b1117;
                    }
                    obj = objM87133R;
                    Modifier modifierM3486a15 = AbstractC1127a.m3486a(modifierM107879c15, (Function1) obj);
                    objM87133R2 = c28655q.m87133R();
                    obj2 = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        C22881b c22881b1118 = new C22881b(29);
                        c28655q.m87172p0(c22881b1118);
                        obj2 = c22881b1118;
                    }
                    c0209i5 = c0209i3;
                    c0213j2 = c0213j;
                    c2314t3 = c2314t18;
                    modifier8 = modifier7;
                    f16 = f1112;
                    AbstractC29125c.m88522c(abstractC26165aM64500i15, null, AbstractC1125a.m3480c(modifierM3486a15, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                    C28655q c28655q16 = c28655q;
                    c28655q16.m87173q(false);
                    r15 = c28655q16;
                }
                Modifier modifierM3396r15 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density8, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111111 = r15.m87165m();
                Modifier modifierM118962N111111 = AbstractC37056f.m118962N(r15, modifierM3396r15);
                r15.m87158i0();
                if (r15.f115903S) {
                    c0213j3 = c0213j2;
                    r15.m87163l(c0213j3);
                } else {
                    c0213j3 = c0213j2;
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a15);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m111111);
                if (r15.f115903S) {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                } else {
                    c0209i6 = c0209i5;
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N111111);
                Modifier modifierM3411h113 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111112 = r15.m87165m();
                Modifier modifierM118962N111112 = AbstractC37056f.m118962N(r15, modifierM3411h113);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j3);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a15);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m111112);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N111112);
                startButton = viewState.getStartButton();
                if (startButton.getIconRes() != null) {
                    r15.m87150e0(748152407);
                    Modifier modifierM3419p119 = AbstractC1102d.m3419p(f92568a, c2314t3);
                    C27270o c27270o119 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    boolean zM87157i119 = r15.m87157i(startButton);
                    if ((i15 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i119 | z24;
                    Object objM87133R1112 = r15.m87133R();
                    if (z25) {
                        i26 = 0;
                        InterfaceC4339a interfaceC4339a111115 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC23354d.m67613k(startButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(startButton, function4);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a111115);
                        obj5 = interfaceC4339a111115;
                    } else {
                        i26 = 0;
                        InterfaceC4339a interfaceC4339a111116 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC23354d.m67613k(startButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(startButton, function4);
                                }
                            }
                        };
                        r15.m87172p0(interfaceC4339a111116);
                        obj5 = interfaceC4339a111116;
                    }
                    ?? r21111111 = i26;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i6;
                    AbstractC27242b1.m82092d(c27270o119, "Back", modifierM3419p119, null, (InterfaceC4339a) obj5, r15, 432, 8);
                    r15.m87173q(r21111111);
                    r10 = r21111111;
                } else {
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i6;
                    r10 = 0;
                    r15.m87150e0(748814443);
                    AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
                }
                strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
                if (strM21274h.length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    r15.m87150e0(749045052);
                    ?? r21111112 = C38072d.f163053a;
                    ?? r21111113 = r15;
                    r16 = 1;
                    c0213j4 = c0213j3;
                    AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r21111112.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21111112.m121952e(r15, 6).getH4(), null, r21111113, 48, 0, 196600);
                    ?? r11118 = r21111113;
                    r11118.m87173q(false);
                    r17 = r11118;
                } else {
                    c0213j4 = c0213j3;
                    r16 = 1;
                    r15.m87150e0(749324300);
                    r15.m87173q(false);
                    r17 = r15;
                }
                endButton = viewState.getEndButton();
                if (endButton != null) {
                    iconRes = endButton.getIconRes();
                } else {
                    obj3 = c2886a;
                }
                if (obj3 != null) {
                    r17.m87150e0(749462591);
                    Modifier modifierM3419p1110 = AbstractC1102d.m3419p(f92568a, c2314t3);
                    C27270o c27270o1110 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    boolean zM87157i1110 = r17.m87157i(endButton);
                    if ((i15 & 896) == 256) {
                        obj3 = iconRes;
                        r24 = r16;
                    } else {
                        obj3 = iconRes;
                        r24 = 0;
                    }
                    i25 = r24 | (zM87157i1110 ? 1 : 0);
                    Object objM87133R1113 = r17.m87133R();
                    obj4 = objM87133R1113;
                    if (i25 == 0) {
                        InterfaceC4339a interfaceC4339a111117 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r16) {
                                    case 0:
                                        return AbstractC23354d.m67613k(endButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(endButton, function4);
                                }
                            }
                        };
                        r17.m87172p0(interfaceC4339a111117);
                        obj4 = interfaceC4339a111117;
                    } else {
                        InterfaceC4339a interfaceC4339a111118 = new InterfaceC4339a() { // from class: l51.c
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (r16) {
                                    case 0:
                                        return AbstractC23354d.m67613k(endButton, function4);
                                    default:
                                        return AbstractC23354d.m67614l(endButton, function4);
                                }
                            }
                        };
                        r17.m87172p0(interfaceC4339a111118);
                        obj4 = interfaceC4339a111118;
                    }
                    AbstractC27242b1.m82092d(c27270o1110, "Action", modifierM3419p1110, null, (InterfaceC4339a) obj4, r17, 432, 8);
                    i24 = 0;
                    r17.m87173q(false);
                } else {
                    obj3 = iconRes;
                    i24 = 0;
                    r17.m87150e0(749963179);
                    AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
                }
                r17.m87173q(r16);
                strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
                if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                    r17.m87150e0(553718039);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                    InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111113 = r17.m87165m();
                    Modifier modifierM118962N111113 = AbstractC37056f.m118962N(r17, modifierM3409f15);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j4);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d113);
                    AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m111113);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                    }
                    AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N111113);
                    r19 = C38072d.f163053a;
                    long brandWhite15 = r19.m121949b(r17, 6).getBrandWhite();
                    subtitleStyle = viewState.getSubtitleStyle();
                    if (subtitleStyle != null) {
                        h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                    } else {
                        h7 = c2886a;
                    }
                    if (h7 == null) {
                        r17.m87150e0(-1038233573);
                        h7 = r19.m121952e(r17, 6).getH2();
                        z19 = false;
                    } else {
                        z19 = false;
                        r17.m87150e0(-1038236084);
                    }
                    r17.m87173q(z19);
                    C2886a c2886a16 = h7;
                    Modifier modifierM3398t15 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                    if (viewState.getSubtitleStickOnScroll()) {
                        f17 = 1.0f;
                    } else {
                        f17 = f16;
                    }
                    ?? r21111114 = r17;
                    AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t15), brandWhite15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a16, null, r21111114, 0, 0, 196600);
                    ?? r11119 = r21111114;
                    r11119.m87173q(r16);
                    r11119.m87173q(false);
                    r18 = r11119;
                } else {
                    r17.m87150e0(554575995);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                    r17.m87173q(false);
                    r18 = r17;
                }
                r18.m87173q(r16);
                r18.m87173q(r16);
                function3 = function4;
                z15 = z16;
                modifier5 = modifier3;
                modifier6 = modifier8;
                r14 = r18;
            } else {
                f14 = f13;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N111110);
            if (backgroundImage == null) {
                c2314t2 = c2314t;
                c3 = 6;
                c28655q.m87150e0(-656203214);
                c28655q.m87173q(false);
            } else {
                c2314t2 = c2314t;
                c3 = 6;
                c28655q.m87150e0(-656203214);
                c28655q.m87173q(false);
            }
            if (backgroundImage == 0) {
                abstractC22403o = null;
            } else {
                if (f14 > 0.01f) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (z26) {
                    abstractC22403o = backgroundImage;
                } else {
                    abstractC22403o = null;
                }
            }
            if (abstractC22403o == null) {
                c28655q.m87150e0(-656109781);
                c28655q.m87173q(false);
                f16 = f14;
                c2886a = null;
                c0209i5 = c0209i3;
                c0213j2 = c0213j;
                modifier8 = modifier7;
                c2314t3 = c2314t2;
                f15 = 1.0f;
                r15 = c28655q;
            } else {
                c28655q.m87150e0(-656109780);
                c2886a = null;
                C2314t c2314t19 = c2314t2;
                float f1113 = f14;
                f15 = 1.0f;
                AbstractC26165a abstractC26165aM64500i16 = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3);
                Modifier modifierM107879c16 = AbstractC34132o.m107879c(f1113, AbstractC1102d.m3407d(1.0f, c2314t19));
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    obj = objM87133R;
                    C22881b c22881b1119 = new C22881b(28);
                    c28655q.m87172p0(c22881b1119);
                    obj = c22881b1119;
                }
                obj = objM87133R;
                Modifier modifierM3486a16 = AbstractC1127a.m3486a(modifierM107879c16, (Function1) obj);
                objM87133R2 = c28655q.m87133R();
                obj2 = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    C22881b c22881b11110 = new C22881b(29);
                    c28655q.m87172p0(c22881b11110);
                    obj2 = c22881b11110;
                }
                c0209i5 = c0209i3;
                c0213j2 = c0213j;
                c2314t3 = c2314t19;
                modifier8 = modifier7;
                f16 = f1113;
                AbstractC29125c.m88522c(abstractC26165aM64500i16, null, AbstractC1125a.m3480c(modifierM3486a16, (Function1) obj2), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
                C28655q c28655q17 = c28655q;
                c28655q17.m87173q(false);
                r15 = c28655q17;
            }
            Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(f15, c2314t3), 0.0f, density8, 0.0f, 0.0f, 13), f92569b, 0.0f, 2);
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
            iHashCode2 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111114 = r15.m87165m();
            Modifier modifierM118962N111114 = AbstractC37056f.m118962N(r15, modifierM3396r16);
            r15.m87158i0();
            if (r15.f115903S) {
                c0213j3 = c0213j2;
                r15.m87163l(c0213j3);
            } else {
                c0213j3 = c0213j2;
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i, c23010xM66775a16);
            AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m111114);
            if (r15.f115903S) {
                c0209i6 = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
            } else {
                c0209i6 = c0209i5;
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N111114);
            Modifier modifierM3411h114 = AbstractC1102d.m3411h(companion.m67643a(), AbstractC1102d.m3409f(f15, c2314t3));
            C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, r15, 54);
            iHashCode3 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111115 = r15.m87165m();
            Modifier modifierM118962N111115 = AbstractC37056f.m118962N(r15, modifierM3411h114);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j3);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i, c22994r1M66759a16);
            AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m111115);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N111115);
            startButton = viewState.getStartButton();
            if (startButton.getIconRes() != null) {
                r15.m87150e0(748152407);
                Modifier modifierM3419p1111 = AbstractC1102d.m3419p(f92568a, c2314t3);
                C27270o c27270o1111 = new C27270o(AbstractC27274q.a.f109136f, startButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                boolean zM87157i1111 = r15.m87157i(startButton);
                if ((i15 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i1111 | z24;
                Object objM87133R1114 = r15.m87133R();
                if (z25) {
                    i26 = 0;
                    InterfaceC4339a interfaceC4339a111119 = new InterfaceC4339a() { // from class: l51.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    return AbstractC23354d.m67613k(startButton, function4);
                                default:
                                    return AbstractC23354d.m67614l(startButton, function4);
                            }
                        }
                    };
                    r15.m87172p0(interfaceC4339a111119);
                    obj5 = interfaceC4339a111119;
                } else {
                    i26 = 0;
                    InterfaceC4339a interfaceC4339a1111110 = new InterfaceC4339a() { // from class: l51.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    return AbstractC23354d.m67613k(startButton, function4);
                                default:
                                    return AbstractC23354d.m67614l(startButton, function4);
                            }
                        }
                    };
                    r15.m87172p0(interfaceC4339a1111110);
                    obj5 = interfaceC4339a1111110;
                }
                ?? r21111115 = i26;
                c0209i7 = c0209i2;
                c0209i8 = c0209i6;
                AbstractC27242b1.m82092d(c27270o1111, "Back", modifierM3419p1111, null, (InterfaceC4339a) obj5, r15, 432, 8);
                r15.m87173q(r21111115);
                r10 = r21111115;
            } else {
                c0209i7 = c0209i2;
                c0209i8 = c0209i6;
                r10 = 0;
                r15.m87150e0(748814443);
                AbstractC25012a.m73389v(c2314t3, f92568a, r15, false);
            }
            strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), r15, r10);
            if (strM21274h.length() > 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                r15.m87150e0(749045052);
                ?? r21111116 = C38072d.f163053a;
                ?? r21111117 = r15;
                r16 = 1;
                c0213j4 = c0213j3;
                AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t3, 1 * 8, 0.0f, 2), r21111116.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r21111116.m121952e(r15, 6).getH4(), null, r21111117, 48, 0, 196600);
                ?? r111110 = r21111117;
                r111110.m87173q(false);
                r17 = r111110;
            } else {
                c0213j4 = c0213j3;
                r16 = 1;
                r15.m87150e0(749324300);
                r15.m87173q(false);
                r17 = r15;
            }
            endButton = viewState.getEndButton();
            if (endButton != null) {
                iconRes = endButton.getIconRes();
            } else {
                obj3 = c2886a;
            }
            if (obj3 != null) {
                r17.m87150e0(749462591);
                Modifier modifierM3419p1112 = AbstractC1102d.m3419p(f92568a, c2314t3);
                C27270o c27270o1112 = new C27270o(AbstractC27274q.a.f109136f, endButton.getIconRes().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                boolean zM87157i1112 = r17.m87157i(endButton);
                if ((i15 & 896) == 256) {
                    obj3 = iconRes;
                    r24 = r16;
                } else {
                    obj3 = iconRes;
                    r24 = 0;
                }
                i25 = r24 | (zM87157i1112 ? 1 : 0);
                Object objM87133R1115 = r17.m87133R();
                obj4 = objM87133R1115;
                if (i25 == 0) {
                    InterfaceC4339a interfaceC4339a1111111 = new InterfaceC4339a() { // from class: l51.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (r16) {
                                case 0:
                                    return AbstractC23354d.m67613k(endButton, function4);
                                default:
                                    return AbstractC23354d.m67614l(endButton, function4);
                            }
                        }
                    };
                    r17.m87172p0(interfaceC4339a1111111);
                    obj4 = interfaceC4339a1111111;
                } else {
                    InterfaceC4339a interfaceC4339a1111112 = new InterfaceC4339a() { // from class: l51.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (r16) {
                                case 0:
                                    return AbstractC23354d.m67613k(endButton, function4);
                                default:
                                    return AbstractC23354d.m67614l(endButton, function4);
                            }
                        }
                    };
                    r17.m87172p0(interfaceC4339a1111112);
                    obj4 = interfaceC4339a1111112;
                }
                AbstractC27242b1.m82092d(c27270o1112, "Action", modifierM3419p1112, null, (InterfaceC4339a) obj4, r17, 432, 8);
                i24 = 0;
                r17.m87173q(false);
            } else {
                obj3 = iconRes;
                i24 = 0;
                r17.m87150e0(749963179);
                AbstractC25012a.m73389v(c2314t3, f92568a, r17, false);
            }
            r17.m87173q(r16);
            strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), r17, i24);
            if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                r17.m87150e0(553718039);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16));
                InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode4 = Long.hashCode(r17.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = r17.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(r17, modifierM3409f16);
                r17.m87158i0();
                if (r17.f115903S) {
                    r17.m87163l(c0213j4);
                } else {
                    r17.m87178s0();
                }
                AbstractC28683x.m87239G(r17, c0209i, interfaceC39127r0M66763d114);
                AbstractC28683x.m87239G(r17, c0209i7, interfaceC28653p1M87165m111116);
                if (r17.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, r17, iHashCode4, c0209i8);
                }
                AbstractC28683x.m87239G(r17, c0209i4, modifierM118962N111116);
                r19 = C38072d.f163053a;
                long brandWhite16 = r19.m121949b(r17, 6).getBrandWhite();
                subtitleStyle = viewState.getSubtitleStyle();
                if (subtitleStyle != null) {
                    h7 = EnumC2888c.INSTANCE.m8402a(subtitleStyle);
                } else {
                    h7 = c2886a;
                }
                if (h7 == null) {
                    r17.m87150e0(-1038233573);
                    h7 = r19.m121952e(r17, 6).getH2();
                    z19 = false;
                } else {
                    z19 = false;
                    r17.m87150e0(-1038236084);
                }
                r17.m87173q(z19);
                C2886a c2886a17 = h7;
                Modifier modifierM3398t16 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9104G), 2 * 8, 0.0f, 0.0f, companion.m67645c(), 6);
                if (viewState.getSubtitleStickOnScroll()) {
                    f17 = 1.0f;
                } else {
                    f17 = f16;
                }
                ?? r21111118 = r17;
                AbstractC30795n.m94707h(strM21274h2, AbstractC34132o.m107879c(f17, modifierM3398t16), brandWhite16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a17, null, r21111118, 0, 0, 196600);
                ?? r111111 = r21111118;
                r111111.m87173q(r16);
                r111111.m87173q(false);
                r18 = r111111;
            } else {
                r17.m87150e0(554575995);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(r17, AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r16)));
                r17.m87173q(false);
                r18 = r17;
            }
            r18.m87173q(r16);
            r18.m87173q(r16);
            function3 = function4;
            z15 = z16;
            modifier5 = modifier3;
            modifier6 = modifier8;
            r14 = r18;
        } else {
            c28655q.m87138X();
            modifier5 = modifier3;
            function3 = function2;
            modifier6 = modifier4;
            z15 = z13;
            r14 = c28655q;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(modifier5, viewState, function3, modifier6, z15, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m67610h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m67611i(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m67612j(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        long j7 = C17919x.f69629f;
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(j7)), new C23465k(Float.valueOf(f92570c), new C17919x(j7)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m67613k(C23358h c23358h, Function1 function1) {
        GenericInteraction interaction = c23358h.getInteraction();
        if (interaction == null) {
            function1.invoke(C23351a.f92564a);
        } else {
            function1.invoke(interaction);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m67614l(C23358h c23358h, Function1 function1) {
        GenericInteraction interaction = c23358h.getInteraction();
        if (interaction != null) {
            function1.invoke(interaction);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m67615m(Modifier modifier, C23357g c23357g, Function1 function1, Modifier modifier2, boolean z4, int i13, int i14, Composer composer, int i15) {
        m67609g(modifier, c23357g, function1, modifier2, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final float m67616n(C23357g c23357g) {
        float fFloatValue;
        Float collapseProgress = c23357g.getCollapseProgress();
        if (collapseProgress != null) {
            fFloatValue = collapseProgress.floatValue();
        } else {
            fFloatValue = c23357g.getCollapsed() ? 1.0f : 0.0f;
        }
        return AbstractC12889b.m36283m(fFloatValue, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC17911t m67617o() {
        return f92571d;
    }

    /* JADX INFO: renamed from: p */
    public static final float m67618p() {
        return f92569b;
    }
}
