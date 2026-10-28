package i51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import ck1.C4789l;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15675c0;
import gb1.AbstractC15676d;
import hu1.C17650g;
import hy0.C17794v;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p133f1.C13921a0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22965i;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import v41.EnumC35690s;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: i51.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li51/l;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Li51/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lv41/s;", "loadingState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18114k {

    /* JADX INFO: renamed from: i51.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70338a;

        static {
            int[] iArr = new int[EnumC18110g.values().length];
            try {
                iArr[EnumC18110g.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18110g.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18110g.STREAK_LOTTIE_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC18110g.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC18110g.STREAK_LOTTIE_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f70338a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0273  */
    /* JADX WARN: Code duplicated, block: B:106:0x0290  */
    /* JADX WARN: Code duplicated, block: B:112:0x029e  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0310  */
    /* JADX WARN: Code duplicated, block: B:132:0x0341  */
    /* JADX WARN: Code duplicated, block: B:133:0x0344  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:147:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:152:0x0407  */
    /* JADX WARN: Code duplicated, block: B:155:0x0419  */
    /* JADX WARN: Code duplicated, block: B:156:0x041c  */
    /* JADX WARN: Code duplicated, block: B:159:0x043b  */
    /* JADX WARN: Code duplicated, block: B:160:0x043f  */
    /* JADX WARN: Code duplicated, block: B:165:0x045a  */
    /* JADX WARN: Code duplicated, block: B:170:0x046d  */
    /* JADX WARN: Code duplicated, block: B:172:0x047d  */
    /* JADX WARN: Code duplicated, block: B:175:0x050c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0515  */
    /* JADX WARN: Code duplicated, block: B:178:0x0517  */
    /* JADX WARN: Code duplicated, block: B:180:0x051a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0525  */
    /* JADX WARN: Code duplicated, block: B:187:0x053d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0544  */
    /* JADX WARN: Code duplicated, block: B:193:0x0575  */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0189  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:99:0x021c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v31, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v4, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r29v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r7v34, types: [iz0.l] */
    /* JADX WARN: Type inference failed for: r7v38, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v13, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
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
    /* JADX INFO: renamed from: f */
    public static final void m51994f(Modifier modifier, C18115l viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        ?? r10;
        int i16;
        Modifier modifier3;
        C0209i c0209i;
        float f13;
        int iHashCode;
        C9598e c9598eM52004c;
        boolean z4;
        boolean zM87157i;
        Object objM87133R;
        C2314t c2314t;
        Modifier modifierM3362g;
        boolean zM87153g;
        Object objM87133R2;
        EnumC35690s enumC35690sM51995g;
        EnumC35690s enumC35690s;
        C2314t c2314t2;
        int i17;
        boolean z13;
        TextResource textResourceM52002a;
        TextResource textResourceM52007g;
        TextResource textResourceM51983g;
        Boolean boolValueOf;
        boolean z14;
        ?? r14;
        EnumC2888c enumC2888cM52003b;
        C2886a c2886aM8421b;
        ?? r15;
        TextResource textResource;
        int i18;
        C2314t c2314t3;
        Boolean bool;
        C0213j c0213j;
        float f14;
        C0209i c0209i2;
        int i19;
        TextResource textResource2;
        ?? r16;
        int i24;
        ?? r17;
        EnumC2888c enumC2888cM52008h;
        C2886a c2886aM8421b2;
        ?? r18;
        boolean zM87149e;
        Object objM87133R3;
        InterfaceC22965i interfaceC22965i;
        int iHashCode2;
        AbstractC22403o abstractC22403oM52006f;
        float f15;
        ?? r19;
        ?? r29;
        Modifier modifierM3424u;
        ?? r110;
        Object objM87133R4;
        ?? r111;
        ?? r112;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        ?? r113 = (C28655q) composer;
        r113.m87154g0(-1148220584);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (r113.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? r113.m87153g(viewState) : r113.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= r113.m87157i(onViewEvent) ? 256 : 128;
        }
        if (r113.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t4 = C2314t.f9131w;
            if (i25 != 0) {
                modifier2 = c2314t4;
            }
            boolean zM87155h = r113.m87155h(viewState.getMedia().getMediaSource() instanceof AbstractC18111h.a);
            Object objM87133R5 = r113.m87133R();
            Object obj = C28635l.f115821a;
            if (zM87155h || objM87133R5 == obj) {
                objM87133R5 = AbstractC28683x.m87272z(viewState.getMedia().getMediaSource() instanceof AbstractC18111h.a ? EnumC35690s.LOADING : EnumC35690s.READY);
                r113.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
            int i26 = a.f70338a[viewState.getMedia().getSize().ordinal()];
            if (i26 == 1) {
                i16 = 2;
            } else if (i26 == 2 || i26 == 3) {
                i16 = 3;
            } else {
                i16 = 5;
                if (i26 != 4 && i26 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            float f16 = (float) 0.5d;
            float f17 = 8;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(f16, f17, C2299e.f9111N, r113, 54);
            int i27 = i16;
            int iHashCode3 = Long.hashCode(r113.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = r113.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(r113, modifier2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            r113.m87158i0();
            if (r113.f115903S) {
                r113.m87163l(c0213j2);
            } else {
                r113.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(r113, c0209i3, c23010xM73381n);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(r113, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (r113.f115903S) {
                modifier3 = modifier2;
            } else {
                modifier3 = modifier2;
                if (!AbstractC22676k.m65745e(r113.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(r113, c0209i, modifierM118962N);
                f13 = 4;
                Modifier modifierM3420q = AbstractC1102d.m3420q(viewState.getMedia().getSize().m134215getMediaSize0ZcVfYs(10 * f13), c2314t4);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(r113.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r113.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r113, modifierM3420q);
                r113.m87158i0();
                if (r113.f115903S) {
                    r113.m87163l(c0213j2);
                } else {
                    r113.m87178s0();
                }
                AbstractC28683x.m87239G(r113, c0209i3, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(r113, c0209i4, interfaceC28653p1M87165m2);
                if (r113.f115903S || !AbstractC22676k.m65745e(r113.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r113, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(r113, c0209i, modifierM118962N2);
                c9598eM52004c = viewState.getDestination();
                if (c9598eM52004c == null) {
                    r113.m87150e0(179380547);
                    r113.m87173q(false);
                    modifierM3362g = null;
                } else {
                    r113.m87150e0(179380548);
                    if ((i15 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM87157i = z4 | r113.m87157i(c9598eM52004c);
                    objM87133R = r113.m87133R();
                    if (zM87157i || objM87133R == obj) {
                        objM87133R = new C4789l(onViewEvent, c9598eM52004c, 4);
                        r113.m87172p0(objM87133R);
                    }
                    c2314t = c2314t4;
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    r113.m87173q(false);
                }
                if (modifierM3362g == null) {
                    c2314t = c2314t4;
                    modifierM3362g = c2314t;
                }
                c2314t = c2314t4;
                C18112i c18112iM52005e = viewState.getMedia();
                zM87153g = r113.m87153g(interfaceC28601c1);
                objM87133R2 = r113.m87133R();
                if (zM87153g || objM87133R2 == obj) {
                    objM87133R2 = new C13921a0(20, interfaceC28601c1);
                    r113.m87172p0(objM87133R2);
                }
                AbstractC18109f.m51967d(c18112iM52005e, modifierM3362g, (Function1) objM87133R2, r113, 0, 0);
                r113.m87173q(true);
                enumC35690sM51995g = m51995g(interfaceC28601c1);
                enumC35690s = EnumC35690s.READY;
                if (enumC35690sM51995g != enumC35690s) {
                    r113.m87150e0(-1733513397);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f13 * f13, 0.0f, 0.0f, 13);
                    c2314t2 = c2314t;
                    i17 = i27;
                    float f18 = i17;
                    z13 = true;
                    AbstractC22989q.m66760a(AbstractC15675c0.m44094d(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f17, AbstractC1102d.m3424u(12 * f13 * f18, modifierM3398t)), AbstractC33253j.m105489e(f13)), false, 1, null), r113, 0);
                    AbstractC22989q.m66760a(AbstractC15675c0.m44094d(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f17, AbstractC1102d.m3424u(7 * f13 * f18, c2314t2)), AbstractC33253j.m105489e(f13)), false, 1, null), r113, 0);
                    r113.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    i17 = i27;
                    z13 = true;
                    r113.m87150e0(-1732981964);
                    r113.m87173q(false);
                }
                textResourceM52002a = viewState.getCaptionText();
                if (textResourceM52002a != null || !AbstractC8693b.m21270d(textResourceM52002a)) {
                    textResourceM52002a = null;
                }
                textResourceM52007g = viewState.getSubCaptionText();
                if (textResourceM52007g != null || !AbstractC8693b.m21270d(textResourceM52007g)) {
                    textResourceM52007g = null;
                }
                textResourceM51983g = viewState.getMedia().getTextOverlay();
                if (textResourceM51983g != null) {
                    boolValueOf = Boolean.valueOf(AbstractC8693b.m21270d(textResourceM51983g));
                } else {
                    boolValueOf = null;
                }
                if (m51995g(interfaceC28601c1) == enumC35690s) {
                    r113.m87150e0(-1732602338);
                    if (textResourceM52002a == null) {
                        r113.m87150e0(-1732646421);
                        r113.m87173q(false);
                        textResource2 = textResourceM52007g;
                        i19 = 6;
                        bool = boolValueOf;
                        c2314t3 = c2314t2;
                        r16 = 0;
                        c0213j = c0213j2;
                        c0209i2 = c0209i4;
                        i24 = i17;
                        f14 = f13;
                    } else {
                        r113.m87150e0(-1732646420);
                        enumC2888cM52003b = viewState.getCaptionTypography();
                        if (enumC2888cM52003b != null) {
                            c2886aM8421b = EnumC2888c.INSTANCE.m8402a(enumC2888cM52003b);
                        } else {
                            c2886aM8421b = null;
                        }
                        if (c2886aM8421b == null) {
                            r113.m87150e0(-414210802);
                            c2886aM8421b = C38072d.f163053a.m121952e(r113, 6).getB2();
                            r15 = 0;
                        } else {
                            r15 = 0;
                            r113.m87150e0(-414215700);
                        }
                        r113.m87173q(r15);
                        C2886a c2886a = c2886aM8421b;
                        textResource = textResourceM52007g;
                        String strM21274h = AbstractC8693b.m21274h(textResourceM52002a, r113, r15);
                        long jM125430y = C38072d.f163053a.m121949b(r113, 6).getBrandWhite();
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3424u(i17 * 12 * f13, c2314t2), 0.0f, f13 * f13, 0.0f, 0.0f, 13);
                        if (textResource != null) {
                            i18 = 1;
                        } else {
                            i18 = 2;
                        }
                        c2314t3 = c2314t2;
                        bool = boolValueOf;
                        c0213j = c0213j2;
                        f14 = f13;
                        c0209i2 = c0209i4;
                        i19 = 6;
                        textResource2 = textResource;
                        r16 = 0;
                        i24 = i17;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t2, jM125430y, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, i18, null, c2886a, Float.valueOf(1.5f), r113, 0, 12586032, 38392);
                        ?? r114 = r113;
                        r114.m87173q(false);
                        r17 = r114;
                    }
                    if (textResource2 == null) {
                        r17 = r113;
                        r17.m87150e0(-1731771384);
                        r17.m87173q(r16);
                        z14 = true;
                        r112 = r17;
                    } else {
                        r17.m87150e0(-1731771383);
                        enumC2888cM52008h = viewState.getSubCaptionTypography();
                        if (enumC2888cM52008h != null) {
                            c2886aM8421b2 = EnumC2888c.INSTANCE.m8402a(enumC2888cM52008h);
                        } else {
                            c2886aM8421b2 = null;
                        }
                        if (c2886aM8421b2 == null) {
                            r17 = r113;
                            r17 = r113;
                            r17.m87150e0(1500256773);
                            c2886aM8421b2 = C38072d.f163053a.m121952e(r17, i19).getB2();
                        } else {
                            r17 = r113;
                            r17 = r113;
                            r17.m87150e0(1500251782);
                        }
                        r17.m87173q(r16);
                        if (viewState.getSubCaptionLeadingImage() != null) {
                            r18 = 1;
                        } else {
                            r18 = r16;
                        }
                        zM87149e = r17.m87149e(i24);
                        objM87133R3 = r17.m87133R();
                        if (zM87149e || objM87133R3 == obj) {
                            objM87133R3 = new C6494e(i24, 15);
                            r17.m87172p0(objM87133R3);
                        }
                        Modifier modifierM44099b = AbstractC15676d.m44099b(c2314t3, r18, (Function1) objM87133R3);
                        if (r18 != 0) {
                            interfaceC22965i = AbstractC22977m.f90654e;
                        } else {
                            interfaceC22965i = AbstractC22977m.f90650a;
                        }
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(interfaceC22965i, C2299e.f9108K, r17, 48);
                        iHashCode2 = Long.hashCode(r17.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = r17.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(r17, modifierM44099b);
                        r17.m87158i0();
                        if (r17.f115903S) {
                            r17.m87163l(c0213j);
                        } else {
                            r17.m87178s0();
                        }
                        AbstractC28683x.m87239G(r17, c0209i3, c22994r1M66759a);
                        AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m3);
                        if (r17.f115903S || !AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, r17, iHashCode2, c0209i5);
                        }
                        AbstractC28683x.m87239G(r17, c0209i, modifierM118962N3);
                        abstractC22403oM52006f = viewState.getSubCaptionLeadingImage();
                        if (abstractC22403oM52006f == null) {
                            r17.m87150e0(-734463362);
                            r17.m87173q(r16);
                            f15 = f14;
                            r19 = r17;
                        } else {
                            r17.m87150e0(-734463361);
                            f15 = f14;
                            ?? r210 = r17;
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM52006f, null, null, r17, 0, 3), "", AbstractC1102d.m3419p(f15 * f15, c2314t3), null, C39102j.f168200b, 0.0f, null, r210, 25008, 104);
                            ?? r115 = r210;
                            AbstractC18489d0.m53381v(f16, f15, c2314t3, r115, r16);
                            r19 = r115;
                        }
                        String strM21274h2 = AbstractC8693b.m21274h(textResource2, r19, r16);
                        ?? r24 = C21053l.f79834a;
                        C23285v0 c23285v0M67364b = C23285v0.m67364b(c2886aM8421b2.getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447);
                        ?? r25 = C38072d.f163053a;
                        r29 = r19;
                        C21054m c21054mM58880a = r24.m58880a(c23285v0M67364b, r25.m121949b(r19, i19).getWhite70(), r25.m121949b(r19, i19).getBrandWhite(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r29, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760);
                        if (r18 != 0) {
                            if (1.0f > 0.0d) {
                                r111 = 1;
                            } else {
                                r111 = r16;
                            }
                            if (r111 == 0) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            modifierM3424u = new LayoutWeightElement(1.0f, r16);
                        } else {
                            modifierM3424u = AbstractC1102d.m3424u(i24 * 12 * f15, c2314t3);
                        }
                        if (AbstractC22676k.m65745e(bool, Boolean.TRUE) || textResourceM52002a != null) {
                            r110 = r16;
                        } else {
                            r110 = 1;
                        }
                        objM87133R4 = r29.m87133R();
                        if (objM87133R4 == obj) {
                            objM87133R4 = new C17650g(22);
                            r29.m87172p0(objM87133R4);
                        }
                        Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM3424u, r110, (Function1) objM87133R4);
                        z14 = true;
                        AbstractC21048g.m58807M(strM21274h2, modifierM44099b2, r18 ^ 1, c21054mM58880a, null, 2, 0, 2, false, r29, 12779520, 336);
                        ?? r116 = r29;
                        r116.m87173q(true);
                        r116.m87173q(r16);
                        r112 = r116;
                    }
                    r112.m87173q(r16);
                    r14 = r112;
                } else {
                    z14 = z13;
                    r113.m87150e0(-1729629004);
                    r113.m87173q(false);
                    r14 = r113;
                }
                r14.m87173q(z14);
                modifier2 = modifier3;
                r10 = r14;
            }
            AbstractC11266d.m30471y(iHashCode3, r113, iHashCode3, c0209i5);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(r113, c0209i, modifierM118962N);
            f13 = 4;
            Modifier modifierM3420q2 = AbstractC1102d.m3420q(viewState.getMedia().getSize().m134215getMediaSize0ZcVfYs(10 * f13), c2314t4);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(r113.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = r113.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(r113, modifierM3420q2);
            r113.m87158i0();
            if (r113.f115903S) {
                r113.m87163l(c0213j2);
            } else {
                r113.m87178s0();
            }
            AbstractC28683x.m87239G(r113, c0209i3, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(r113, c0209i4, interfaceC28653p1M87165m4);
            if (r113.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r113, iHashCode, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode, r113, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(r113, c0209i, modifierM118962N4);
            c9598eM52004c = viewState.getDestination();
            if (c9598eM52004c == null) {
                r113.m87150e0(179380547);
                r113.m87173q(false);
                modifierM3362g = null;
            } else {
                r113.m87150e0(179380548);
                if ((i15 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87157i = z4 | r113.m87157i(c9598eM52004c);
                objM87133R = r113.m87133R();
                if (zM87157i) {
                    objM87133R = new C4789l(onViewEvent, c9598eM52004c, 4);
                    r113.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4789l(onViewEvent, c9598eM52004c, 4);
                    r113.m87172p0(objM87133R);
                }
                c2314t = c2314t4;
                modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                r113.m87173q(false);
            }
            if (modifierM3362g == null) {
                c2314t = c2314t4;
                modifierM3362g = c2314t;
            }
            c2314t = c2314t4;
            C18112i c18112iM52005e2 = viewState.getMedia();
            zM87153g = r113.m87153g(interfaceC28601c1);
            objM87133R2 = r113.m87133R();
            if (zM87153g) {
                objM87133R2 = new C13921a0(20, interfaceC28601c1);
                r113.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C13921a0(20, interfaceC28601c1);
                r113.m87172p0(objM87133R2);
            }
            AbstractC18109f.m51967d(c18112iM52005e2, modifierM3362g, (Function1) objM87133R2, r113, 0, 0);
            r113.m87173q(true);
            enumC35690sM51995g = m51995g(interfaceC28601c1);
            enumC35690s = EnumC35690s.READY;
            if (enumC35690sM51995g != enumC35690s) {
                r113.m87150e0(-1733513397);
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, f13 * f13, 0.0f, 0.0f, 13);
                c2314t2 = c2314t;
                i17 = i27;
                float f19 = i17;
                z13 = true;
                AbstractC22989q.m66760a(AbstractC15675c0.m44094d(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f17, AbstractC1102d.m3424u(12 * f13 * f19, modifierM3398t3)), AbstractC33253j.m105489e(f13)), false, 1, null), r113, 0);
                AbstractC22989q.m66760a(AbstractC15675c0.m44094d(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f17, AbstractC1102d.m3424u(7 * f13 * f19, c2314t2)), AbstractC33253j.m105489e(f13)), false, 1, null), r113, 0);
                r113.m87173q(false);
            } else {
                c2314t2 = c2314t;
                i17 = i27;
                z13 = true;
                r113.m87150e0(-1732981964);
                r113.m87173q(false);
            }
            textResourceM52002a = viewState.getCaptionText();
            if (textResourceM52002a != null) {
                textResourceM52002a = null;
            } else {
                textResourceM52002a = null;
            }
            textResourceM52007g = viewState.getSubCaptionText();
            if (textResourceM52007g != null) {
                textResourceM52007g = null;
            } else {
                textResourceM52007g = null;
            }
            textResourceM51983g = viewState.getMedia().getTextOverlay();
            if (textResourceM51983g != null) {
                boolValueOf = Boolean.valueOf(AbstractC8693b.m21270d(textResourceM51983g));
            } else {
                boolValueOf = null;
            }
            if (m51995g(interfaceC28601c1) == enumC35690s) {
                r113.m87150e0(-1732602338);
                if (textResourceM52002a == null) {
                    r113.m87150e0(-1732646421);
                    r113.m87173q(false);
                    textResource2 = textResourceM52007g;
                    i19 = 6;
                    bool = boolValueOf;
                    c2314t3 = c2314t2;
                    r16 = 0;
                    c0213j = c0213j2;
                    c0209i2 = c0209i4;
                    i24 = i17;
                    f14 = f13;
                } else {
                    r113.m87150e0(-1732646420);
                    enumC2888cM52003b = viewState.getCaptionTypography();
                    if (enumC2888cM52003b != null) {
                        c2886aM8421b = EnumC2888c.INSTANCE.m8402a(enumC2888cM52003b);
                    } else {
                        c2886aM8421b = null;
                    }
                    if (c2886aM8421b == null) {
                        r113.m87150e0(-414210802);
                        c2886aM8421b = C38072d.f163053a.m121952e(r113, 6).getB2();
                        r15 = 0;
                    } else {
                        r15 = 0;
                        r113.m87150e0(-414215700);
                    }
                    r113.m87173q(r15);
                    C2886a c2886a2 = c2886aM8421b;
                    textResource = textResourceM52007g;
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM52002a, r113, r15);
                    long jM125430y2 = C38072d.f163053a.m121949b(r113, 6).getBrandWhite();
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3424u(i17 * 12 * f13, c2314t2), 0.0f, f13 * f13, 0.0f, 0.0f, 13);
                    if (textResource != null) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    c2314t3 = c2314t2;
                    bool = boolValueOf;
                    c0213j = c0213j2;
                    f14 = f13;
                    c0209i2 = c0209i4;
                    i19 = 6;
                    textResource2 = textResource;
                    r16 = 0;
                    i24 = i17;
                    AbstractC30795n.m94707h(strM21274h3, modifierM3398t4, jM125430y2, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 2, i18, null, c2886a2, Float.valueOf(1.5f), r113, 0, 12586032, 38392);
                    ?? r117 = r113;
                    r117.m87173q(false);
                    r17 = r117;
                }
                if (textResource2 == null) {
                    r17 = r113;
                    r17.m87150e0(-1731771384);
                    r17.m87173q(r16);
                    z14 = true;
                    r112 = r17;
                } else {
                    r17.m87150e0(-1731771383);
                    enumC2888cM52008h = viewState.getSubCaptionTypography();
                    if (enumC2888cM52008h != null) {
                        c2886aM8421b2 = EnumC2888c.INSTANCE.m8402a(enumC2888cM52008h);
                    } else {
                        c2886aM8421b2 = null;
                    }
                    if (c2886aM8421b2 == null) {
                        r17 = r113;
                        r17 = r113;
                        r17.m87150e0(1500256773);
                        c2886aM8421b2 = C38072d.f163053a.m121952e(r17, i19).getB2();
                    } else {
                        r17 = r113;
                        r17 = r113;
                        r17.m87150e0(1500251782);
                    }
                    r17.m87173q(r16);
                    if (viewState.getSubCaptionLeadingImage() != null) {
                        r18 = 1;
                    } else {
                        r18 = r16;
                    }
                    zM87149e = r17.m87149e(i24);
                    objM87133R3 = r17.m87133R();
                    if (zM87149e) {
                        objM87133R3 = new C6494e(i24, 15);
                        r17.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C6494e(i24, 15);
                        r17.m87172p0(objM87133R3);
                    }
                    Modifier modifierM44099b3 = AbstractC15676d.m44099b(c2314t3, r18, (Function1) objM87133R3);
                    if (r18 != 0) {
                        interfaceC22965i = AbstractC22977m.f90654e;
                    } else {
                        interfaceC22965i = AbstractC22977m.f90650a;
                    }
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(interfaceC22965i, C2299e.f9108K, r17, 48);
                    iHashCode2 = Long.hashCode(r17.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = r17.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(r17, modifierM44099b3);
                    r17.m87158i0();
                    if (r17.f115903S) {
                        r17.m87163l(c0213j);
                    } else {
                        r17.m87178s0();
                    }
                    AbstractC28683x.m87239G(r17, c0209i3, c22994r1M66759a2);
                    AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m5);
                    if (r17.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, r17, iHashCode2, c0209i5);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, r17, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(r17, c0209i, modifierM118962N5);
                    abstractC22403oM52006f = viewState.getSubCaptionLeadingImage();
                    if (abstractC22403oM52006f == null) {
                        r17.m87150e0(-734463362);
                        r17.m87173q(r16);
                        f15 = f14;
                        r19 = r17;
                    } else {
                        r17.m87150e0(-734463361);
                        f15 = f14;
                        ?? r211 = r17;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM52006f, null, null, r17, 0, 3), "", AbstractC1102d.m3419p(f15 * f15, c2314t3), null, C39102j.f168200b, 0.0f, null, r211, 25008, 104);
                        ?? r118 = r211;
                        AbstractC18489d0.m53381v(f16, f15, c2314t3, r118, r16);
                        r19 = r118;
                    }
                    String strM21274h4 = AbstractC8693b.m21274h(textResource2, r19, r16);
                    ?? r26 = C21053l.f79834a;
                    C23285v0 c23285v0M67364b2 = C23285v0.m67364b(c2886aM8421b2.getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447);
                    ?? r27 = C38072d.f163053a;
                    r29 = r19;
                    C21054m c21054mM58880a2 = r26.m58880a(c23285v0M67364b2, r27.m121949b(r19, i19).getWhite70(), r27.m121949b(r19, i19).getBrandWhite(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r29, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760);
                    if (r18 != 0) {
                        if (1.0f > 0.0d) {
                            r111 = 1;
                        } else {
                            r111 = r16;
                        }
                        if (r111 == 0) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        modifierM3424u = new LayoutWeightElement(1.0f, r16);
                    } else {
                        modifierM3424u = AbstractC1102d.m3424u(i24 * 12 * f15, c2314t3);
                    }
                    if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
                        r110 = r16;
                    } else {
                        r110 = r16;
                    }
                    objM87133R4 = r29.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = new C17650g(22);
                        r29.m87172p0(objM87133R4);
                    }
                    Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM3424u, r110, (Function1) objM87133R4);
                    z14 = true;
                    AbstractC21048g.m58807M(strM21274h4, modifierM44099b4, r18 ^ 1, c21054mM58880a2, null, 2, 0, 2, false, r29, 12779520, 336);
                    ?? r119 = r29;
                    r119.m87173q(true);
                    r119.m87173q(r16);
                    r112 = r119;
                }
                r112.m87173q(r16);
                r14 = r112;
            } else {
                z14 = z13;
                r113.m87150e0(-1729629004);
                r113.m87173q(false);
                r14 = r113;
            }
            r14.m87173q(z14);
            modifier2 = modifier3;
            r10 = r14;
        } else {
            r113.m87138X();
            r10 = r113;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 6, modifier2, (Object) viewState, onViewEvent);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final EnumC35690s m51995g(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC35690s) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final void m51996h(InterfaceC28601c1 interfaceC28601c1, EnumC35690s enumC35690s) {
        interfaceC28601c1.setValue(enumC35690s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m51997i(Function1 function1, C9598e c9598e) {
        function1.invoke(c9598e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m51998j(InterfaceC28601c1 interfaceC28601c1, EnumC35690s it) {
        AbstractC22676k.m65750j(it, "it");
        m51996h(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Modifier m51999k(int i13, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1102d.m3424u(i13 * 12 * 4, applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Modifier m52000l(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        float f13 = 4;
        return AbstractC1099a.m3398t(applyIf, 0.0f, f13 * f13, 0.0f, 0.0f, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m52001m(Modifier modifier, C18115l c18115l, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51994f(modifier, c18115l, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
