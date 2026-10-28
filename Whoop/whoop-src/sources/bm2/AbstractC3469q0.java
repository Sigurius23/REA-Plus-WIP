package bm2;

import am2.AbstractC1035o0;
import am2.C1034o;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.trends.data.model.SegmentalAnalysisEmptyStateModel;
import com.whoop.trends.data.model.SegmentalAnalysisModel;
import com.whoop.trends.data.model.SegmentalAnalysisSegmentModel;
import com.whoop.trends.data.model.SegmentalAnalysisTrendReadingModel;
import com.whoop.trends.data.model.TimeSegmentLastUpdated;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.C22411w;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p000.C22079k;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import p91.AbstractC29011e;
import p91.C29007a;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import sl2.AbstractC32706a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bm2.q0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lbm2/r0;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lbm2/r0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;", "j", "(Lcom/whoop/trends/data/model/SegmentalAnalysisModel;)Lbm2/r0;", "", "style", "Ly81/f;", "i", "(Ljava/lang/String;)Ly81/f;", "Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;", "Lbm2/n0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;)Lbm2/n0;", "", "Lbm2/m0;", "a", "Ljava/util/List;", "segments", "b", "Lbm2/r0;", "segmentalAnalysisViewState", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3469q0 {

    /* JADX INFO: renamed from: a */
    private static final List<C3460m0> f13628a;

    /* JADX INFO: renamed from: b */
    private static final C3471r0 f13629b;

    /* JADX INFO: renamed from: bm2.q0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f13630w = new a();

        /* JADX INFO: renamed from: a */
        public final long m10203a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10203a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: bm2.q0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f13631w = new b();

        /* JADX INFO: renamed from: a */
        public final long m10204a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m10204a((C39336i) obj));
        }
    }

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("ARMS");
        C3465o0 c3465o0 = new C3465o0(AbstractC8693b.m21278l("80.2%"), AbstractC8693b.m21278l("19.8%"), new C17731c2(AbstractC8693b.m21278l("1.3%"), true, EnumC17727b2.POSITIVE, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null));
        EnumC39333f enumC39333f = EnumC39333f.SLEEP_LIGHT_SLEEP;
        C3463n0 c3463n0 = new C3463n0(0.3d, 0.6d, enumC39333f);
        EnumC39333f enumC39333f2 = EnumC39333f.STRAIN_ZONE_4;
        List<C3460m0> listM118959K = AbstractC37056f.m118959K(new C3460m0(textResourceM21278l, c3465o0, AbstractC37056f.m118959K(c3463n0, new C3463n0(0.81d, 0.38d, enumC39333f2)), AbstractC37056f.m118959K(new C3463n0(0.38d, 0.76d, enumC39333f), new C3463n0(0.88d, 0.24d, enumC39333f2))), new C3460m0(AbstractC8693b.m21278l("TORSO"), new C3465o0(AbstractC8693b.m21278l("64.3%"), AbstractC8693b.m21278l("35.7%"), new C17731c2(AbstractC8693b.m21278l("2.4%"), true, EnumC17727b2.NEGATIVE, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null)), AbstractC37056f.m118959K(new C3463n0(0.3215d, 0.643d, enumC39333f), new C3463n0(0.825d, 0.35d, enumC39333f2)), C25271y.f99162w));
        f13628a = listM118959K;
        f13629b = new C3471r0(new C3454k0(AbstractC8693b.m21278l("SEGMENTAL BODY COMPOSITION"), AbstractC8693b.m21278l("VS. LAST WEEK"), C38072d.f163053a.m121951d().getHealth().getSegmentalBodyComposition()), AbstractC8693b.m21278l("LEAN BODY MASS"), AbstractC8693b.m21278l("BODY FAT"), new C3451j0(EnumC16313m0.MISSING_DATA.toWhoopIcon(), AbstractC8693b.m21278l("NO DATA"), AbstractC8693b.m21278l("You don't have data to display for the selected date range. Step on the scales to update your data")), new C1034o(AbstractC8693b.m21278l("Last updated: Today, 9:53am"), AbstractC8693b.m21278l("Imported from"), null), listM118959K);
    }

    /* JADX INFO: renamed from: d */
    public static final void m10196d(C3471r0 viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1451787921);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q = c28655q2;
            AbstractC12889b.m36263b(AbstractC1099a.m3394p(2 * 8, C2314t.f9131w), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite5(), null, 0 * 4, AbstractC37817c.m121344e(341935476, c28655q2, new C3467p0(viewState.m10212g(), viewState.getEmptyState(), viewState.getLastUpdated(), viewState.getHeader(), onViewEvent, viewState.getPrimarySectionLabel(), viewState.getSecondarySectionLabel(), 0)), c28655q, 1769478, 24);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(viewState, onViewEvent, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0515  */
    /* JADX WARN: Code duplicated, block: B:106:0x0584  */
    /* JADX WARN: Code duplicated, block: B:109:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x0600  */
    /* JADX WARN: Code duplicated, block: B:115:0x061b  */
    /* JADX WARN: Code duplicated, block: B:119:0x063b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0643  */
    /* JADX WARN: Code duplicated, block: B:123:0x0647  */
    /* JADX WARN: Code duplicated, block: B:125:0x0652  */
    /* JADX WARN: Code duplicated, block: B:127:0x0661  */
    /* JADX WARN: Code duplicated, block: B:133:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:134:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:139:0x0715  */
    /* JADX WARN: Code duplicated, block: B:142:0x0723  */
    /* JADX WARN: Code duplicated, block: B:144:0x0731  */
    /* JADX WARN: Code duplicated, block: B:147:0x0744  */
    /* JADX WARN: Code duplicated, block: B:149:0x074c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0750  */
    /* JADX WARN: Code duplicated, block: B:152:0x0759  */
    /* JADX WARN: Code duplicated, block: B:154:0x0768  */
    /* JADX WARN: Code duplicated, block: B:155:0x0771  */
    /* JADX WARN: Code duplicated, block: B:168:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:181:0x092a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0943  */
    /* JADX WARN: Code duplicated, block: B:188:0x07ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:30:0x0142  */
    /* JADX WARN: Code duplicated, block: B:31:0x0146  */
    /* JADX WARN: Code duplicated, block: B:36:0x0161  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x0218  */
    /* JADX WARN: Code duplicated, block: B:45:0x0232  */
    /* JADX WARN: Code duplicated, block: B:48:0x023e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0242  */
    /* JADX WARN: Code duplicated, block: B:53:0x0261  */
    /* JADX WARN: Code duplicated, block: B:56:0x0272  */
    /* JADX WARN: Code duplicated, block: B:60:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0306  */
    /* JADX WARN: Code duplicated, block: B:73:0x035f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0368  */
    /* JADX WARN: Code duplicated, block: B:78:0x036c  */
    /* JADX WARN: Code duplicated, block: B:81:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x0413  */
    /* JADX WARN: Code duplicated, block: B:88:0x0417  */
    /* JADX WARN: Code duplicated, block: B:93:0x0438  */
    /* JADX WARN: Code duplicated, block: B:96:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x04fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v34 */
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
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m10197e(List list, C3451j0 c3451j0, C1034o c1034o, C3454k0 c3454k0, Function1 function1, TextResource textResource, TextResource textResource2, Composer composer, int i13) throws Throwable {
        float f13;
        int iHashCode;
        float f14;
        C38072d c38072d;
        int i14;
        C2307m c2307m;
        float f15;
        float f16;
        int iHashCode2;
        int i15;
        int i16;
        C2305k c2305k;
        C28655q c28655q;
        float f17;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        boolean zM87153g;
        Object objM87133R3;
        int iHashCode3;
        float f18;
        C28655q c28655q2;
        Iterator it;
        C28655q c28655q3;
        C3460m0 c3460m0;
        int iHashCode4;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q4;
        int iHashCode5;
        float f19;
        C28655q c28655q5;
        int iHashCode6;
        Iterator<T> it3;
        int i17;
        boolean zHasNext;
        Throwable th3;
        InterfaceC17869a1 interfaceC17869a1M105491g;
        int iHashCode7;
        C0213j c0213j2;
        C0209i c0209i2;
        List<C3463n0> listM10152b;
        int i18;
        int i19;
        InterfaceC17869a1 interfaceC17869a1M105491g2;
        Object next;
        int i24;
        C28655q c28655q6;
        ?? r14;
        C28655q c28655q7;
        List list2;
        C2307m c2307m2 = C2299e.f9114w;
        C2306l c2306l = C2299e.f9108K;
        C2305k c2305k2 = C2299e.f9110M;
        C28655q c28655q8 = (C28655q) composer;
        if (c28655q8.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f24 = 2;
            float f25 = 8;
            float f26 = f24 * f25;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f26, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q8, 0);
            int iHashCode8 = Long.hashCode(c28655q8.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q8.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q8, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j3 = C0217k.f724b;
            c28655q8.m87158i0();
            if (c28655q8.f115903S) {
                c28655q8.m87163l(c0213j3);
            } else {
                c28655q8.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q8, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q8, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q8.f115903S) {
                f13 = f26;
            } else {
                f13 = f26;
                if (!AbstractC22676k.m65745e(c28655q8.m87133R(), Integer.valueOf(iHashCode8))) {
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q8, c0209i6, modifierM118962N);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f13, 7);
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q8, 0);
                iHashCode = Long.hashCode(c28655q8.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q8.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q8, modifierM3398t);
                c28655q8.m87158i0();
                if (c28655q8.f115903S) {
                    c28655q8.m87163l(c0213j3);
                } else {
                    c28655q8.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q8, c0209i3, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q8, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q8.f115903S || !AbstractC22676k.m65745e(c28655q8.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q8, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q8, c0209i6, modifierM118962N2);
                f14 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f14, c2314t);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c3454k0.getIcon(), c28655q8, 6);
                c38072d = C38072d.f163053a;
                i14 = C38072d.f163054b;
                c2307m = c2307m2;
                f15 = f13;
                AbstractC15005f3.m43108b(c27430eM107874S, "", modifierM3419p, c38072d.m121949b(c28655q8, i14).getWhite70(), c28655q8, 432, 0);
                f16 = 1;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f16 * f25, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q8, 0);
                iHashCode2 = Long.hashCode(c28655q8.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q8.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q8, modifierM3396r);
                c28655q8.m87158i0();
                if (c28655q8.f115903S) {
                    c28655q8.m87163l(c0213j3);
                } else {
                    c28655q8.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q8, c0209i3, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q8, c0209i4, interfaceC28653p1M87165m3);
                if (c28655q8.f115903S || !AbstractC22676k.m65745e(c28655q8.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q8, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q8, c0209i6, modifierM118962N3);
                TextResource textResourceM10094c = c3454k0.getTitle();
                i15 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM10094c, c28655q8, i15);
                long jM125430y = c38072d.m121949b(c28655q8, i14).getBrandWhite();
                C36775k c36775k = new C36775k(1);
                C2886a c2886aM8437r = c38072d.m121952e(c28655q8, i14).getH4();
                i16 = C2886a.f11498d << 18;
                c2305k = c2305k2;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q8, 0, i16, 196090);
                c28655q = c28655q8;
                if (c3454k0.getSubtitle() != null) {
                    c28655q.m87150e0(-800163216);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3454k0.getSubtitle(), c28655q, i15), null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH6(), null, c28655q, 0, i16, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-799842242);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f17 = Float.MAX_VALUE;
                } else {
                    f17 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f17, true));
                AbstractC27274q.g gVar = AbstractC27274q.g.f109144f;
                int iM46245w = c38072d.m121951d().getTinyIcons().getTinyInformation();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = a.f13630w;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = b.f13631w;
                    c28655q.m87172p0(objM87133R2);
                }
                C27270o c27270o = new C27270o(gVar, iM46245w, interfaceC39332eM125323a, p745y81.Function1.m125323a((Function1) objM87133R2), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC32706a.f135956j);
                zM87153g = c28655q.m87153g(function1);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new C3480w(function1, 2);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k, 12);
                c28655q.m87173q(true);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                C28655q c28655q9 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i15), null, c38072d.m121949b(c28655q, i14).getSleepLightSleep(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH5(), null, c28655q9, 0, i16, 196090);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q9, new LayoutWeightElement(f18, true));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q9, i15), null, c38072d.m121949b(c28655q9, i14).getStrainZone4(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q9, i14).getH5(), null, c28655q9, 0, i16, 196090);
                c28655q2 = c28655q9;
                c28655q2.m87173q(true);
                if (list == null) {
                    c28655q2.m87150e0(1292159677);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1292159678);
                    it = list.iterator();
                    c28655q3 = c28655q2;
                    while (it.hasNext()) {
                        c3460m0 = (C3460m0) it.next();
                        float f27 = f15;
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 0.0f, f27, 1);
                        C2305k c2305k3 = c2305k;
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, c28655q3, 0);
                        iHashCode4 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3396r2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i7 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i7, c23010xM66775a3);
                        C0209i c0209i8 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i);
                        }
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N5);
                        TextResource textResourceM10153c = c3460m0.getTitle();
                        int i25 = TextResource.$stable;
                        String strM21274h2 = AbstractC8693b.m21274h(textResourceM10153c, c28655q3, i25);
                        C38072d c38072d2 = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        long jM125388d1 = c38072d2.m121949b(c28655q3, i26).getWhite90();
                        Iterator it4 = it;
                        C36775k c36775k2 = new C36775k(1);
                        C2886a c2886aM8415M = c38072d2.m121952e(c28655q3, i26).getSh5();
                        int i27 = C2886a.f11498d << 18;
                        c28655q4 = c28655q3;
                        AbstractC30795n.m94707h(strM21274h2, null, jM125388d1, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8415M, null, c28655q4, 0, i27, 196090);
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, 0.0f, ((float) 0.5d) * f25, 1);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q4, 48);
                        iHashCode5 = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3396r3);
                        c28655q4.m87158i0();
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i7, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q4, c0209i8, interfaceC28653p1M87165m6);
                        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, c0209i9, modifierM118962N6);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3460m0.getTrendStat().getStatPrimaryDisplay(), c28655q4, i25), null, c38072d2.m121949b(c28655q4, i26).getSleepLightSleep(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, i26).getN6(), null, c28655q4, 0, i27, 196090);
                        f19 = f24 * f14;
                        AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(f19, c2314t));
                        AbstractC17808z1.m51175c(c3460m0.getTrendStat().getTrendViewState(), c28655q4, C17731c2.f68917p);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22953f.m66715b(c28655q4, new LayoutWeightElement(1.0f, true));
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3460m0.getTrendStat().getStatSecondaryDisplay(), c28655q4, i25), null, c38072d2.m121949b(c28655q4, i26).getStrainZone4(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, i26).getN6(), null, c28655q4, 0, i27, 196090);
                        c28655q5 = c28655q4;
                        c28655q5.m87173q(true);
                        C2307m c2307m3 = c2307m;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m3, false);
                        iHashCode6 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q5.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q5, c2314t);
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i7, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q5, c0209i8, interfaceC28653p1M87165m7);
                        if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode6))) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q5, iHashCode6, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q5, c0209i9, modifierM118962N7);
                        c28655q5.m87150e0(-327937494);
                        it3 = c3460m0.m10151a().iterator();
                        i17 = 0;
                        while (true) {
                            zHasNext = it3.hasNext();
                            th3 = null;
                            interfaceC17869a1M105491g = AbstractC17918w0.f69621a;
                            if (zHasNext) {
                                next = it3.next();
                                i24 = i17 + 1;
                                if (i17 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                C3463n0 c3463n0 = (C3463n0) next;
                                if (i17 == 0) {
                                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(f16 * f14, 0.0f, 0.0f, 0.0f, 14);
                                } else if (i17 == c3460m0.m10151a().size() - 1) {
                                    interfaceC17869a1M105491g = AbstractC33253j.m105491g(0.0f, f16 * f14, 0.0f, 0.0f, 13);
                                }
                                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC29011e.m88144e(AbstractC1102d.m3411h(3 * f14, c2314t), (float) c3463n0.getCenterX(), 0.5f, (float) c3463n0.getWidth(), 1.0f, C29007a.INSTANCE.m88136a()), c3463n0.getColor().mo134584toComposableColorWaAFU9c(c28655q5, 0), interfaceC17869a1M105491g), c28655q5, 0);
                                i17 = i24;
                            }
                        }
                        c28655q5.m87173q(false);
                        c28655q5.m87173q(true);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.2d) * f25, 0.0f, 0.0f, 13);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m3, false);
                        iHashCode7 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q5.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q5, modifierM3398t2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j2);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i2 = C0217k.f732j;
                        if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode7))) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q5, iHashCode7, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N8);
                        listM10152b = c3460m0.m10152b();
                        if (listM10152b == null) {
                            c28655q5.m87150e0(1604329230);
                            c28655q5.m87173q(false);
                        } else {
                            c28655q5.m87150e0(1604329231);
                            i18 = 0;
                            for (Object obj : listM10152b) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    Throwable th4 = th3;
                                    AbstractC37056f.m118977d0();
                                    throw th4;
                                }
                                C3463n0 c3463n1 = (C3463n0) obj;
                                if (i18 == 0) {
                                    interfaceC17869a1M105491g2 = AbstractC33253j.m105491g(0.0f, 0.0f, 0.0f, f16 * f14, 7);
                                } else if (i18 == c3460m0.m10151a().size() - 1) {
                                    interfaceC17869a1M105491g2 = AbstractC33253j.m105491g(0.0f, 0.0f, f16 * f14, 0.0f, 11);
                                } else {
                                    interfaceC17869a1M105491g2 = interfaceC17869a1M105491g;
                                }
                                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC29011e.m88144e(AbstractC1102d.m3411h(f19, c2314t), (float) c3463n1.getCenterX(), 0.5f, (float) c3463n1.getWidth(), 1.0f, C29007a.INSTANCE.m88136a()), C17919x.m51541c(0.5f, c3463n1.getColor().mo134584toComposableColorWaAFU9c(c28655q5, 0)), interfaceC17869a1M105491g2), c28655q5, 0);
                                th3 = th3;
                                interfaceC17869a1M105491g = interfaceC17869a1M105491g;
                                i18 = i19;
                            }
                            c28655q5.m87173q(false);
                        }
                        c28655q5.m87173q(true);
                        c28655q5.m87173q(true);
                        c2307m = c2307m3;
                        it = it4;
                        f15 = f27;
                        c2305k = c2305k3;
                        c28655q3 = c28655q5;
                    }
                    c28655q3.m87173q(false);
                    c28655q6 = c28655q3;
                }
                if (c3451j0 == null && ((list2 = list) == null || list2.isEmpty())) {
                    c28655q6 = c28655q2;
                    c28655q6 = c28655q2;
                    c28655q6.m87150e0(1296652291);
                    Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 1.3333334f);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q6, 54);
                    int iHashCode9 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q6.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q6, modifierM3384f);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j4 = C0217k.f724b;
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j4);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q6, C0217k.f728f, interfaceC28653p1M87165m9);
                    C0209i c0209i10 = C0217k.f732j;
                    if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode9))) {
                        AbstractC11266d.m30471y(iHashCode9, c28655q6, iHashCode9, c0209i10);
                    }
                    AbstractC28683x.m87239G(c28655q6, C0217k.f726d, modifierM118962N9);
                    C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c3451j0.getIcon(), c28655q6, 6);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i28 = C38072d.f163054b;
                    AbstractC15005f3.m43108b(c27430eM107874S2, null, null, c38072d3.m121949b(c28655q6, i28).getWhite50(), c28655q6, 48, 4);
                    TextResource textResourceM10091c = c3451j0.getTitle();
                    int i29 = TextResource.$stable;
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM10091c, c28655q6, i29);
                    long jM125430y2 = c38072d3.m121949b(c28655q6, i28).getBrandWhite();
                    C2886a c2886aM8436q = c38072d3.m121952e(c28655q6, i28).getH3();
                    float f28 = f14 * f14;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, f28, 0.0f, 0.0f, 13);
                    int i34 = C2886a.f11498d << 18;
                    C28655q c28655q10 = c28655q6;
                    AbstractC30795n.m94707h(strM21274h3, modifierM3398t3, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q10, 48, i34, 196600);
                    String strM21274h4 = AbstractC8693b.m21274h(c3451j0.getDescription(), c28655q10, i29);
                    long jM125385c1 = c38072d3.m121949b(c28655q10, i28).getWhite70();
                    C2886a c2886aM8420a = c38072d3.m121952e(c28655q10, i28).getB1();
                    float f29 = 12 * f14;
                    AbstractC30795n.m94707h(strM21274h4, AbstractC1099a.m3398t(c2314t, f29, f28, f29, 0.0f, 8), jM125385c1, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q10, 0, i34, 196088);
                    C28655q c28655q11 = c28655q10;
                    c28655q11.m87173q(true);
                    r14 = 0;
                    c28655q11.m87173q(false);
                    c28655q7 = c28655q11;
                } else {
                    c28655q6 = c28655q2;
                    c28655q6 = c28655q2;
                    r14 = 0;
                    c28655q6.m87150e0(1297871800);
                    c28655q6.m87173q(false);
                    c28655q7 = c28655q6;
                }
                if (c1034o != null) {
                    c28655q7.m87150e0(1297913743);
                    AbstractC1035o0.m2874e0(c1034o, ((float) r14) * f25, c28655q7, TextResource.$stable | 48, r14);
                    c28655q7.m87173q(r14);
                } else {
                    c28655q7.m87150e0(1298014648);
                    c28655q7.m87173q(r14);
                }
                c28655q7.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode8, c28655q8, iHashCode8, c0209i5);
            C0209i c0209i11 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q8, c0209i11, modifierM118962N);
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f13, 7);
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, c28655q8, 0);
            iHashCode = Long.hashCode(c28655q8.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q8.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q8, modifierM3398t4);
            c28655q8.m87158i0();
            if (c28655q8.f115903S) {
                c28655q8.m87163l(c0213j3);
            } else {
                c28655q8.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q8, c0209i3, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q8, c0209i4, interfaceC28653p1M87165m10);
            if (c28655q8.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q8, iHashCode, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q8, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q8, c0209i11, modifierM118962N10);
            f14 = 4;
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f14, c2314t);
            C27430e c27430eM107874S3 = AbstractC34132o.m107874S(c3454k0.getIcon(), c28655q8, 6);
            c38072d = C38072d.f163053a;
            i14 = C38072d.f163054b;
            c2307m = c2307m2;
            f15 = f13;
            AbstractC15005f3.m43108b(c27430eM107874S3, "", modifierM3419p2, c38072d.m121949b(c28655q8, i14).getWhite70(), c28655q8, 432, 0);
            f16 = 1;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f16 * f25, 0.0f, 2);
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q8, 0);
            iHashCode2 = Long.hashCode(c28655q8.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q8.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q8, modifierM3396r4);
            c28655q8.m87158i0();
            if (c28655q8.f115903S) {
                c28655q8.m87163l(c0213j3);
            } else {
                c28655q8.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q8, c0209i3, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q8, c0209i4, interfaceC28653p1M87165m11);
            if (c28655q8.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q8, iHashCode2, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q8, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q8, c0209i11, modifierM118962N11);
            TextResource textResourceM10094c2 = c3454k0.getTitle();
            i15 = TextResource.$stable;
            String strM21274h5 = AbstractC8693b.m21274h(textResourceM10094c2, c28655q8, i15);
            long jM125430y3 = c38072d.m121949b(c28655q8, i14).getBrandWhite();
            C36775k c36775k3 = new C36775k(1);
            C2886a c2886aM8437r2 = c38072d.m121952e(c28655q8, i14).getH4();
            i16 = C2886a.f11498d << 18;
            c2305k = c2305k2;
            AbstractC30795n.m94707h(strM21274h5, null, jM125430y3, 0L, null, null, null, 0L, null, c36775k3, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q8, 0, i16, 196090);
            c28655q = c28655q8;
            if (c3454k0.getSubtitle() != null) {
                c28655q.m87150e0(-800163216);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3454k0.getSubtitle(), c28655q, i15), null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH6(), null, c28655q, 0, i16, 196090);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-799842242);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f17 = Float.MAX_VALUE;
            } else {
                f17 = 1.0f;
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f17, true));
            AbstractC27274q.g gVar2 = AbstractC27274q.g.f109144f;
            int iM46245w2 = c38072d.m121951d().getTinyIcons().getTinyInformation();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f13630w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f13631w;
                c28655q.m87172p0(objM87133R2);
            }
            C27270o c27270o2 = new C27270o(gVar2, iM46245w2, interfaceC39332eM125323a2, p745y81.Function1.m125323a((Function1) objM87133R2), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC32706a.f135956j);
            zM87153g = c28655q.m87153g(function1);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new C3480w(function1, 2);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C3480w(function1, 2);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27242b1.m82092d(c27270o2, strM92103Y2, null, null, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k, 12);
            c28655q.m87173q(true);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a5);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N12);
            C28655q c28655q12 = c28655q;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, i15), null, c38072d.m121949b(c28655q, i14).getSleepLightSleep(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH5(), null, c28655q12, 0, i16, 196090);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f18 = Float.MAX_VALUE;
            } else {
                f18 = 1.0f;
            }
            AbstractC22953f.m66715b(c28655q12, new LayoutWeightElement(f18, true));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q12, i15), null, c38072d.m121949b(c28655q12, i14).getStrainZone4(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q12, i14).getH5(), null, c28655q12, 0, i16, 196090);
            c28655q2 = c28655q12;
            c28655q2.m87173q(true);
            if (list == null) {
                c28655q2.m87150e0(1292159677);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1292159678);
                it = list.iterator();
                c28655q3 = c28655q2;
                while (it.hasNext()) {
                    c3460m0 = (C3460m0) it.next();
                    float f210 = f15;
                    Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, 0.0f, f210, 1);
                    C2305k c2305k4 = c2305k;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k4, c28655q3, 0);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3396r5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i12 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i12, c23010xM66775a6);
                    C0209i c0209i13 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i13, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i);
                    }
                    C0209i c0209i14 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i14, modifierM118962N13);
                    TextResource textResourceM10153c2 = c3460m0.getTitle();
                    int i210 = TextResource.$stable;
                    String strM21274h6 = AbstractC8693b.m21274h(textResourceM10153c2, c28655q3, i210);
                    C38072d c38072d4 = C38072d.f163053a;
                    int i211 = C38072d.f163054b;
                    long jM125388d2 = c38072d4.m121949b(c28655q3, i211).getWhite90();
                    Iterator it5 = it;
                    C36775k c36775k4 = new C36775k(1);
                    C2886a c2886aM8415M2 = c38072d4.m121952e(c28655q3, i211).getSh5();
                    int i212 = C2886a.f11498d << 18;
                    c28655q4 = c28655q3;
                    AbstractC30795n.m94707h(strM21274h6, null, jM125388d2, 0L, null, null, null, 0L, null, c36775k4, 0L, 0, false, 0, 0, null, c2886aM8415M2, null, c28655q4, 0, i212, 196090);
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, 0.0f, ((float) 0.5d) * f25, 1);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q4, 48);
                    iHashCode5 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM3396r6);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i12, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q4, c0209i13, interfaceC28653p1M87165m14);
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i14, modifierM118962N14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3460m0.getTrendStat().getStatPrimaryDisplay(), c28655q4, i210), null, c38072d4.m121949b(c28655q4, i211).getSleepLightSleep(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q4, i211).getN6(), null, c28655q4, 0, i212, 196090);
                    f19 = f24 * f14;
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(f19, c2314t));
                    AbstractC17808z1.m51175c(c3460m0.getTrendStat().getTrendViewState(), c28655q4, C17731c2.f68917p);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(c28655q4, new LayoutWeightElement(1.0f, true));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c3460m0.getTrendStat().getStatSecondaryDisplay(), c28655q4, i210), null, c38072d4.m121949b(c28655q4, i211).getStrainZone4(), 0L, null, null, null, 0L, null, new C36775k(1), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q4, i211).getN6(), null, c28655q4, 0, i212, 196090);
                    c28655q5 = c28655q4;
                    c28655q5.m87173q(true);
                    C2307m c2307m4 = c2307m;
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode6 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q5.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q5, c2314t);
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i12, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q5, c0209i13, interfaceC28653p1M87165m15);
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q5, iHashCode6, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q5, iHashCode6, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, c0209i14, modifierM118962N15);
                    c28655q5.m87150e0(-327937494);
                    it3 = c3460m0.m10151a().iterator();
                    i17 = 0;
                    while (true) {
                        zHasNext = it3.hasNext();
                        th3 = null;
                        interfaceC17869a1M105491g = AbstractC17918w0.f69621a;
                        if (zHasNext) {
                            next = it3.next();
                            i24 = i17 + 1;
                            if (i17 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C3463n0 c3463n2 = (C3463n0) next;
                            if (i17 == 0) {
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(f16 * f14, 0.0f, 0.0f, 0.0f, 14);
                            } else if (i17 == c3460m0.m10151a().size() - 1) {
                                interfaceC17869a1M105491g = AbstractC33253j.m105491g(0.0f, f16 * f14, 0.0f, 0.0f, 13);
                            }
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC29011e.m88144e(AbstractC1102d.m3411h(3 * f14, c2314t), (float) c3463n2.getCenterX(), 0.5f, (float) c3463n2.getWidth(), 1.0f, C29007a.INSTANCE.m88136a()), c3463n2.getColor().mo134584toComposableColorWaAFU9c(c28655q5, 0), interfaceC17869a1M105491g), c28655q5, 0);
                            i17 = i24;
                        }
                    }
                    c28655q5.m87173q(false);
                    c28655q5.m87173q(true);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.2d) * f25, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode7 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q5.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q5, modifierM3398t5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j2);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m16);
                    c0209i2 = C0217k.f732j;
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q5, iHashCode7, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, c28655q5, iHashCode7, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N16);
                    listM10152b = c3460m0.m10152b();
                    if (listM10152b == null) {
                        c28655q5.m87150e0(1604329230);
                        c28655q5.m87173q(false);
                    } else {
                        c28655q5.m87150e0(1604329231);
                        i18 = 0;
                        while (r0.hasNext()) {
                            i19 = i18 + 1;
                            if (i18 >= 0) {
                                Throwable th5 = th3;
                                AbstractC37056f.m118977d0();
                                throw th5;
                            }
                            C3463n0 c3463n3 = (C3463n0) obj;
                            if (i18 == 0) {
                                interfaceC17869a1M105491g2 = AbstractC33253j.m105491g(0.0f, 0.0f, 0.0f, f16 * f14, 7);
                            } else if (i18 == c3460m0.m10151a().size() - 1) {
                                interfaceC17869a1M105491g2 = AbstractC33253j.m105491g(0.0f, 0.0f, f16 * f14, 0.0f, 11);
                            } else {
                                interfaceC17869a1M105491g2 = interfaceC17869a1M105491g;
                            }
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC29011e.m88144e(AbstractC1102d.m3411h(f19, c2314t), (float) c3463n3.getCenterX(), 0.5f, (float) c3463n3.getWidth(), 1.0f, C29007a.INSTANCE.m88136a()), C17919x.m51541c(0.5f, c3463n3.getColor().mo134584toComposableColorWaAFU9c(c28655q5, 0)), interfaceC17869a1M105491g2), c28655q5, 0);
                            th3 = th3;
                            interfaceC17869a1M105491g = interfaceC17869a1M105491g;
                            i18 = i19;
                        }
                        c28655q5.m87173q(false);
                    }
                    c28655q5.m87173q(true);
                    c28655q5.m87173q(true);
                    c2307m = c2307m4;
                    it = it5;
                    f15 = f210;
                    c2305k = c2305k4;
                    c28655q3 = c28655q5;
                }
                c28655q3.m87173q(false);
                c28655q6 = c28655q3;
            }
            if (c3451j0 == null) {
                c28655q6 = c28655q2;
                c28655q6 = c28655q2;
                r14 = 0;
                c28655q6.m87150e0(1297871800);
                c28655q6.m87173q(false);
                c28655q7 = c28655q6;
            } else {
                c28655q6 = c28655q2;
                c28655q6 = c28655q2;
                r14 = 0;
                c28655q6.m87150e0(1297871800);
                c28655q6.m87173q(false);
                c28655q7 = c28655q6;
            }
            if (c1034o != null) {
                c28655q7.m87150e0(1297913743);
                AbstractC1035o0.m2874e0(c1034o, ((float) r14) * f25, c28655q7, TextResource.$stable | 48, r14);
                c28655q7.m87173q(r14);
            } else {
                c28655q7.m87150e0(1298014648);
                c28655q7.m87173q(r14);
            }
            c28655q7.m87173q(true);
        } else {
            c28655q8.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m10198f(Function1 function1) {
        function1.invoke(EnumC3457l0.EDUCATION);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m10199g(C3471r0 c3471r0, Function1 function1, int i13, Composer composer, int i14) {
        m10196d(c3471r0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final C3463n0 m10200h(SegmentalAnalysisTrendReadingModel segmentalAnalysisTrendReadingModel) {
        AbstractC22676k.m65750j(segmentalAnalysisTrendReadingModel, "<this>");
        return new C3463n0((segmentalAnalysisTrendReadingModel.getStartX() + segmentalAnalysisTrendReadingModel.getEndX()) / ((double) 2), segmentalAnalysisTrendReadingModel.getEndX() - segmentalAnalysisTrendReadingModel.getStartX(), m10201i(segmentalAnalysisTrendReadingModel.getStyle()));
    }

    /* JADX INFO: renamed from: i */
    public static final EnumC39333f m10201i(String style) {
        AbstractC22676k.m65750j(style, "style");
        if (!style.equals("LEAN_BODY_MASS") && style.equals("BODY_FAT")) {
            return EnumC39333f.STRAIN_ZONE_4;
        }
        return EnumC39333f.SLEEP_LIGHT_SLEEP;
    }

    /* JADX INFO: renamed from: j */
    public static final C3471r0 m10202j(SegmentalAnalysisModel segmentalAnalysisModel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC22676k.m65750j(segmentalAnalysisModel, "<this>");
        C3454k0 c3454k0 = new C3454k0(AbstractC8693b.m21278l(segmentalAnalysisModel.getHeader().getTitle()), AbstractC8693b.m21278l(segmentalAnalysisModel.getHeader().getSubtitle()), segmentalAnalysisModel.getHeader().getIcon().toWhoopIcon());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(segmentalAnalysisModel.getPrimarySectionLabel());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(segmentalAnalysisModel.getSecondarySectionLabel());
        SegmentalAnalysisEmptyStateModel emptyState = segmentalAnalysisModel.getEmptyState();
        C3451j0 c3451j0 = emptyState != null ? new C3451j0(emptyState.getIcon().toWhoopIcon(), AbstractC8693b.m21278l(emptyState.getTitle()), AbstractC8693b.m21278l(emptyState.getDescription())) : null;
        TimeSegmentLastUpdated lastUpdated = segmentalAnalysisModel.getLastUpdated();
        C1034o c1034o = lastUpdated != null ? new C1034o(AbstractC8693b.m21278l(lastUpdated.getLeadingText()), AbstractC8693b.m21278l(lastUpdated.getTrailingText()), lastUpdated.getTrailingImage()) : null;
        List<SegmentalAnalysisSegmentModel> segments = segmentalAnalysisModel.getSegments();
        if (segments != null) {
            List<SegmentalAnalysisSegmentModel> list = segments;
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (SegmentalAnalysisSegmentModel segmentalAnalysisSegmentModel : list) {
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(segmentalAnalysisSegmentModel.getTitle());
                C3465o0 c3465o0 = new C3465o0(AbstractC8693b.m21278l(segmentalAnalysisSegmentModel.getTrendStat().getStatPrimaryDisplay()), AbstractC8693b.m21278l(segmentalAnalysisSegmentModel.getTrendStat().getStatSecondaryDisplay()), new C17731c2(AbstractC8693b.m21278l(segmentalAnalysisSegmentModel.getTrendStat().getStatPrimaryChangeDisplay()), true, segmentalAnalysisSegmentModel.getTrendStat().getStatTrend(), false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null));
                List<SegmentalAnalysisTrendReadingModel> mostRecentReading = segmentalAnalysisSegmentModel.getMostRecentReading();
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(mostRecentReading, 10));
                Iterator<T> it = mostRecentReading.iterator();
                while (it.hasNext()) {
                    arrayList4.add(m10200h((SegmentalAnalysisTrendReadingModel) it.next()));
                }
                List<SegmentalAnalysisTrendReadingModel> previousReading = segmentalAnalysisSegmentModel.getPreviousReading();
                if (previousReading != null) {
                    List<SegmentalAnalysisTrendReadingModel> list2 = previousReading;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    Iterator<T> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(m10200h((SegmentalAnalysisTrendReadingModel) it3.next()));
                    }
                } else {
                    arrayList2 = null;
                }
                arrayList3.add(new C3460m0(textResourceM21278l3, c3465o0, arrayList4, arrayList2));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return new C3471r0(c3454k0, textResourceM21278l, textResourceM21278l2, c3451j0, c1034o, arrayList);
    }
}
