package w11;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import d41.C11678d;
import e93.AbstractC12889b;
import f41.C14063a;
import f41.C14069g;
import gb1.AbstractC15676d;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import hy0.AbstractC17803y;
import hy0.C17791u;
import i20.C17956k0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import k71.C22251h;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
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
import p01.AbstractC28586f;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
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
import p291l0.C22949e;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p331n2.AbstractC26165a;
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
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33209p1;
import p739ui0.C35015q;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import um0.C35076b;
import v31.C35608d;
import vl0.C36100c;
import w01.C36680e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: w11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lw11/c;", "goalTileState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "r", "(Landroidx/compose/ui/Modifier;Lw11/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "activeColor", "x", "(JLw11/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "backgroundUrl", "n", "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "iconColor", "backgroundColor", "", "resourceId", "", "isFilled", "l", "(JJIZLandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36695b {

    /* JADX INFO: renamed from: w11.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f157137w;

        public a(Function1 function1) {
            this.f157137w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m117790a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            this.f157137w.invoke(it);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m117790a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w11.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f157138w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C17791u c17791u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w11.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f157139w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f157140x;

        public c(Function1 function1, List list) {
            this.f157139w = function1;
            this.f157140x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m117792a(int i13) {
            return this.f157139w.invoke(this.f157140x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m117792a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: w11.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f157141w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f157142x;

        public d(List list, Function1 function1) {
            this.f157141w = list;
            this.f157142x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m117793a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C17791u c17791u = (C17791u) this.f157141w.get(i13);
            c28655q.m87150e0(-1035939427);
            boolean zM87153g = c28655q.m87153g(this.f157142x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(this.f157142x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17803y.m51164i(c17791u, null, (Function1) objM87133R, c28655q, C9598e.f28134d, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m117793a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l */
    private static final void m117775l(long j7, long j13, int i13, boolean z4, Composer composer, int i14) {
        int i15;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1883512909);
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
            C13825t c13825tM48880a = AbstractC17269i.m48880a((float) 1.5d, C17919x.m51541c(!z4 ? 1.0f : 0.0f, C38072d.f163053a.m121949b(c28655q, 6).getWhite20()));
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
                c28655q.m87150e0(-1706490860);
                z13 = true;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i15 >> 3) & 112) | 6), AbstractC8693b.m21275i("null", c28655q, 6), AbstractC1102d.m3419p(3 * f14, AbstractC15680h.m44112a(c2314t, true)), j7, c28655q, (i15 << 9) & 7168, 0);
                c28655q.m87173q(false);
            } else {
                z13 = true;
                c28655q.m87150e0(-1706193911);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22251h(j7, j13, i13, z4, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m117776m(long j7, long j13, int i13, boolean z4, int i14, Composer composer, int i15) {
        m117775l(j7, j13, i13, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m117777n(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-489012150);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        } else if (abstractC22403o == null) {
            c28655q.m87150e0(368208846);
            c28655q.m87173q(false);
            abstractC22403o2 = abstractC22403o;
        } else {
            c28655q.m87150e0(368208847);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3424u = AbstractC1102d.m3424u(125, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
            long jM125370W0 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, i14 & 14, 3);
            abstractC22403o2 = abstractC22403o;
            Modifier modifierM3428y = AbstractC1102d.m3428y(c2314t, null, false, 3);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C36680e(2);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3428y, (Function1) objM87133R);
            boolean zM87151f = c28655q.m87151f(jM125370W0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87151f || objM87133R2 == c28676v0) {
                objM87133R2 = new C33209p1(jM125370W0, 5);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R2), null, C39102j.f168205g, 0.3f, null, c28655q, 221232, 72);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11678d(abstractC22403o2, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m117778o(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51555f(1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m117779p(long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51484b(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69625b)), new C23465k(Float.valueOf(0.6f), new C17919x(j7)), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m117780q(AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m117777n(abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public static final void m117781r(Modifier modifier, C36696c goalTileState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(goalTileState, "goalTileState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1846843070);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(goalTileState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36680e(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                long jM125379a1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                zM87157i = c28655q.m87157i(goalTileState) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C35015q(goalTileState, function4, 21);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), c33252iM105489e, jM125379a1, null, 0 * f13, AbstractC37817c.m121344e(-2082888415, c28655q, new C36100c(modifier2, goalTileState, function4)), c28655q, 1769472, 24);
                Modifier modifier4 = modifier2;
                function3 = function4;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(modifier3, goalTileState, function3, i13, i14, 20);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36680e(1);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            float f14 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
            long jM125379a2 = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
            zM87157i = c28655q.m87157i(goalTileState) | ((i15 & 896) == 256);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C35015q(goalTileState, function4, 21);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C35015q(goalTileState, function4, 21);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), c33252iM105489e2, jM125379a2, null, 0 * f14, AbstractC37817c.m121344e(-2082888415, c28655q, new C36100c(modifier2, goalTileState, function4)), c28655q, 1769472, 24);
            Modifier modifier5 = modifier2;
            function3 = function4;
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier3, goalTileState, function3, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m117782s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m117783t(C36696c c36696c, Function1 function1) {
        C9598e c9598eM117797e = c36696c.getDestination();
        if (c9598eM117797e != null) {
            function1.invoke(c9598eM117797e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m117784u(Modifier modifier, C36696c c36696c, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = modifier.mo3471e(AbstractC1102d.m3405b(c2314t, 0.0f, 31 * f13, 1));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            m117777n(c36696c.getImage(), c28655q, 0);
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            C2306l c2306l = C2299e.f9108K;
            C22961h c22961h = AbstractC22977m.f90656g;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
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
            m117787x(C38072d.f163053a.m121949b(c28655q, 6).getAccentAction(), c36696c, function1, c28655q, 0);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13 * f13, c2314t));
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87157i = c28655q.m87157i(c36696c) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C35076b(18, c36696c, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65718d(modifierM3409f2, null, null, c22961h, null, null, false, null, (Function1) objM87133R, c28655q, 24582, 494);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m117785v(C36696c c36696c, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<C17791u> listM117796c = c36696c.m117796c();
        C26053f c26053f = (C26053f) LazyRow;
        c26053f.m77529r(listM117796c.size(), null, new c(b.f157138w, listM117796c), new C37816b(new d(listM117796c, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m117786w(Modifier modifier, C36696c c36696c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m117781r(modifier, c36696c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x012c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0222  */
    /* JADX WARN: Code duplicated, block: B:66:0x0224  */
    /* JADX WARN: Code duplicated, block: B:71:0x0234  */
    /* JADX WARN: Code duplicated, block: B:75:0x0252  */
    /* JADX WARN: Code duplicated, block: B:78:0x0270  */
    /* JADX WARN: Code duplicated, block: B:79:0x027b  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:86:0x030d  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: x */
    private static final void m117787x(long j7, C36696c c36696c, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C0209i c0209i;
        int i15;
        C28655q c28655q2;
        C23000t1 c23000t1;
        int iHashCode;
        C38072d c38072d;
        boolean z4;
        C28655q c28655q3;
        C28582b c28582bM117795b;
        C23454a0 c23454a0;
        C28655q c28655q4;
        long jM95627c;
        C14063a c14063aM117794a;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Object obj;
        C2306l c2306l = C2299e.f9107J;
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(764075364);
        if ((i13 & 6) == 0) {
            i14 = (c28655q5.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q5.m87157i(c36696c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q5.m87157i(function1) ? 256 : 128;
        }
        if (c28655q5.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2306l c2306l2 = c36696c.getCircularProgress() == null ? c2306l : C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l2, c28655q5, 0);
            int iHashCode2 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, c2314t);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q5.f115903S) {
                c0209i = c0209i3;
            } else {
                c0209i = c0209i3;
                if (!AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i5, modifierM118962N);
                if (c36696c.getCircularProgress() == null) {
                    c28655q5.m87150e0(2061391947);
                    C38072d c38072d2 = C38072d.f163053a;
                    i15 = 0;
                    m117775l(c38072d2.m121949b(c28655q5, 6).getBrandBlack(), j7, AbstractC2875y.m8290c(c38072d2), c36696c.getIsAccomplished(), c28655q5, (i14 << 3) & 112);
                    C28655q c28655q6 = c28655q5;
                    AbstractC31061c.m95650z(3, 4, c2314t, c28655q6, false);
                    c28655q2 = c28655q6;
                } else {
                    i15 = 0;
                    c28655q5.m87150e0(2061721570);
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                }
                c23000t1 = C23000t1.f90727a;
                Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, 8.0f);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, i15);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(c36696c.getTitle(), c28655q2, i15);
                c38072d = C38072d.f163053a;
                C28655q c28655q7 = c28655q2;
                z4 = i15;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q7, 0, 0, 196090);
                c28655q3 = c28655q7;
                if (c38072d.m121950c(c28655q3, 6).isFeatureEnabled(FeatureFlagRepositoryKt.HEALTHSPAN_COACHING)) {
                    c28655q3.m87150e0(-1837060189);
                    c14063aM117794a = c36696c.getBottomSheetInfo();
                    if (c14063aM117794a == null) {
                        c28655q3.m87150e0(-1114291010);
                        c28655q3.m87173q(z4);
                    } else {
                        c28655q3.m87150e0(-1114291009);
                        AbstractC38963t7.m124386p(2, 4, c2314t, c28655q3);
                        Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "bottomSheetInfoButton");
                        C27270o c27270o = new C27270o(AbstractC27274q.d.f109141f, c38072d.m121951d().getTinyIcons().getTinyInformation(), EnumC39333f.GREY_L2, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        if ((i14 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = z4 ? 1 : 0;
                        }
                        z14 = (c28655q3.m87157i(c14063aM117794a) ? 1 : 0) | z13;
                        objM87133R = c28655q3.m87133R();
                        if (z14 == 0 || objM87133R == C28635l.f115821a) {
                            obj = objM87133R;
                            Object c14069g = new C14069g(function1, c14063aM117794a, 2);
                            c28655q3.m87172p0(c14069g);
                            obj = c14069g;
                        }
                        obj = objM87133R;
                        AbstractC27242b1.m82092d(c27270o, "", null, modifierM3599a, (InterfaceC4339a) obj, c28655q3, 3120, 4);
                        c28655q3.m87173q(z4);
                    }
                    c28655q3.m87173q(z4);
                } else {
                    c28655q3.m87150e0(-1113686106);
                    c28655q3.m87173q(z4);
                }
                c28655q3.m87173q(true);
                AbstractC22953f.m66715b(c28655q3, c23000t1.mo66772c(c2314t, true, 1.0f));
                c28582bM117795b = c36696c.getCircularProgress();
                if (c28582bM117795b == null) {
                    c28655q3.m87150e0(2062856789);
                    c28655q3.m87173q(z4);
                    c23454a0 = null;
                } else {
                    c28655q3.m87150e0(2062856790);
                    AbstractC28586f.m86944i(AbstractC15676d.m44101d(c2314t, "PlanOverview_CircleProgress_".concat(AbstractC39421y.m125926K(AbstractC8693b.m21274h(c36696c.getTitle(), c28655q3, z4 ? 1 : 0), " ", "_", z4))), c28582bM117795b, c28655q3, z4 ? 1 : 0, z4 ? 1 : 0);
                    c28655q3.m87173q(z4);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q3.m87150e0(2063098311);
                    String strM21274h2 = AbstractC8693b.m21274h(c36696c.getSubText(), c28655q3, z4 ? 1 : 0);
                    Modifier modifierMo66772c2 = c23000t1.mo66772c(c2314t, true, 1.0f);
                    C2886a c2886aM8407E = c38072d.m121952e(c28655q3, 6).getN8();
                    if (c36696c.getIsAccomplished()) {
                        c28655q3.m87150e0(168586971);
                        c28655q3.m87173q(z4);
                        jM95627c = j7;
                    } else {
                        jM95627c = AbstractC31061c.m95627c(c28655q3, 168588087, c38072d, c28655q3, 6);
                        c28655q3.m87173q(z4);
                    }
                    AbstractC30795n.m94707h(strM21274h2, modifierMo66772c2, jM95627c, 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c2886aM8407E, null, c28655q3, 0, 0, 196088);
                    C28655q c28655q8 = c28655q3;
                    c28655q8.m87173q(z4);
                    c28655q4 = c28655q8;
                } else {
                    c28655q3.m87150e0(759279787);
                    c28655q3.m87173q(z4);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(true);
                c28655q = c28655q4;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i4);
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i6, modifierM118962N);
            if (c36696c.getCircularProgress() == null) {
                c28655q5.m87150e0(2061391947);
                C38072d c38072d3 = C38072d.f163053a;
                i15 = 0;
                m117775l(c38072d3.m121949b(c28655q5, 6).getBrandBlack(), j7, AbstractC2875y.m8290c(c38072d3), c36696c.getIsAccomplished(), c28655q5, (i14 << 3) & 112);
                C28655q c28655q9 = c28655q5;
                AbstractC31061c.m95650z(3, 4, c2314t, c28655q9, false);
                c28655q2 = c28655q9;
            } else {
                i15 = 0;
                c28655q5.m87150e0(2061721570);
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            }
            c23000t1 = C23000t1.f90727a;
            Modifier modifierMo66772c3 = c23000t1.mo66772c(c2314t, true, 8.0f);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, i15);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N3);
            String strM21274h3 = AbstractC8693b.m21274h(c36696c.getTitle(), c28655q2, i15);
            c38072d = C38072d.f163053a;
            C28655q c28655q10 = c28655q2;
            z4 = i15;
            AbstractC30795n.m94707h(strM21274h3, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q10, 0, 0, 196090);
            c28655q3 = c28655q10;
            if (c38072d.m121950c(c28655q3, 6).isFeatureEnabled(FeatureFlagRepositoryKt.HEALTHSPAN_COACHING)) {
                c28655q3.m87150e0(-1837060189);
                c14063aM117794a = c36696c.getBottomSheetInfo();
                if (c14063aM117794a == null) {
                    c28655q3.m87150e0(-1114291010);
                    c28655q3.m87173q(z4);
                } else {
                    c28655q3.m87150e0(-1114291009);
                    AbstractC38963t7.m124386p(2, 4, c2314t, c28655q3);
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "bottomSheetInfoButton");
                    C27270o c27270o2 = new C27270o(AbstractC27274q.d.f109141f, c38072d.m121951d().getTinyIcons().getTinyInformation(), EnumC39333f.GREY_L2, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    if ((i14 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = z4 ? 1 : 0;
                    }
                    z14 = (c28655q3.m87157i(c14063aM117794a) ? 1 : 0) | z13;
                    objM87133R = c28655q3.m87133R();
                    if (z14 == 0) {
                        obj = objM87133R;
                        Object c14069g2 = new C14069g(function1, c14063aM117794a, 2);
                        c28655q3.m87172p0(c14069g2);
                        obj = c14069g2;
                    } else {
                        obj = objM87133R;
                        Object c14069g3 = new C14069g(function1, c14063aM117794a, 2);
                        c28655q3.m87172p0(c14069g3);
                        obj = c14069g3;
                    }
                    obj = objM87133R;
                    AbstractC27242b1.m82092d(c27270o2, "", null, modifierM3599a2, (InterfaceC4339a) obj, c28655q3, 3120, 4);
                    c28655q3.m87173q(z4);
                }
                c28655q3.m87173q(z4);
            } else {
                c28655q3.m87150e0(-1113686106);
                c28655q3.m87173q(z4);
            }
            c28655q3.m87173q(true);
            AbstractC22953f.m66715b(c28655q3, c23000t1.mo66772c(c2314t, true, 1.0f));
            c28582bM117795b = c36696c.getCircularProgress();
            if (c28582bM117795b == null) {
                c28655q3.m87150e0(2062856789);
                c28655q3.m87173q(z4);
                c23454a0 = null;
            } else {
                c28655q3.m87150e0(2062856790);
                AbstractC28586f.m86944i(AbstractC15676d.m44101d(c2314t, "PlanOverview_CircleProgress_".concat(AbstractC39421y.m125926K(AbstractC8693b.m21274h(c36696c.getTitle(), c28655q3, z4 ? 1 : 0), " ", "_", z4))), c28582bM117795b, c28655q3, z4 ? 1 : 0, z4 ? 1 : 0);
                c28655q3.m87173q(z4);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q3.m87150e0(2063098311);
                String strM21274h4 = AbstractC8693b.m21274h(c36696c.getSubText(), c28655q3, z4 ? 1 : 0);
                Modifier modifierMo66772c4 = c23000t1.mo66772c(c2314t, true, 1.0f);
                C2886a c2886aM8407E2 = c38072d.m121952e(c28655q3, 6).getN8();
                if (c36696c.getIsAccomplished()) {
                    c28655q3.m87150e0(168586971);
                    c28655q3.m87173q(z4);
                    jM95627c = j7;
                } else {
                    jM95627c = AbstractC31061c.m95627c(c28655q3, 168588087, c38072d, c28655q3, 6);
                    c28655q3.m87173q(z4);
                }
                AbstractC30795n.m94707h(strM21274h4, modifierMo66772c4, jM95627c, 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c2886aM8407E2, null, c28655q3, 0, 0, 196088);
                C28655q c28655q11 = c28655q3;
                c28655q11.m87173q(z4);
                c28655q4 = c28655q11;
            } else {
                c28655q3.m87150e0(759279787);
                c28655q3.m87173q(z4);
                c28655q4 = c28655q3;
            }
            c28655q4.m87173q(true);
            c28655q = c28655q4;
        } else {
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17956k0(j7, c36696c, function1, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m117788y(Function1 function1, C14063a c14063a) {
        function1.invoke(c14063a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m117789z(long j7, C36696c c36696c, Function1 function1, int i13, Composer composer, int i14) {
        m117787x(j7, c36696c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
