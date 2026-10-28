package p718lz1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import ih1.C18522f;
import j93.InterfaceC21467g;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jf3.C21647a;
import jz1.C22074b;
import jz1.C22075c;
import jz1.C22076d;
import jz1.C22077e;
import jz1.InterfaceC22073a;
import k71.C22252i;
import kl2.C22571f;
import l01.C23045q;
import l72.C23407n;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.media.capturers.camera.utils.C24174a;
import lq0.C24656d;
import nf3.C26669a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p392p3.C28780r;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import pf3.C29155a;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import v63.AbstractC35745c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: lz1.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "k", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Ljz1/c;", "viewState", "Lkotlin/Function1;", "Ljz1/a;", "onViewEvent", "l", "(Ljz1/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Ljz1/c$a;", "action", "x", "(Ljz1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljz1/e;", "section", "v", "(Ljz1/e;Landroidx/compose/runtime/Composer;I)V", "Ljz1/d;", "row", "t", "(Ljz1/d;Landroidx/compose/runtime/Composer;I)V", "Ljz1/b;", "viewModel", "motion-tracking-sandbox_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {

    /* JADX INFO: renamed from: lz1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f97171w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f97172x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f97173y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f97174z;

        /* JADX INFO: renamed from: lz1.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41980a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f97175w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41980a(C21647a c21647a) {
                super(0);
                this.f97175w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f97175w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f97171w = c38266c;
            this.f97172x = interfaceC35951a;
            this.f97173y = interfaceC4339a;
            this.f97174z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, jz1.b] */
        @Override // c93.InterfaceC4339a
        public final C22074b invoke() {
            return AbstractC21598x.m60668X(this.f97171w, this.f97172x, new C41980a(this.f97174z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22074b.class), null, this.f97173y);
        }
    }

    /* JADX INFO: renamed from: lz1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements Function1 {
        public b(Object obj) {
            super(1, 0, C22074b.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/motiontrackingsandbox/presentation/MotionTrackingSandboxViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m72767a(InterfaceC22073a p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C22074b) this.receiver).m63149l(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m72767a((InterfaceC22073a) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lz1.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f97176w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C22077e c22077e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: lz1.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f97177w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f97178x;

        public d(Function1 function1, List list) {
            this.f97177w = function1;
            this.f97178x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m72769a(int i13) {
            return this.f97177w.invoke(this.f97178x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m72769a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: lz1.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f97179w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f97180x;

        public e(Function1 function1, List list) {
            this.f97179w = function1;
            this.f97180x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m72770a(int i13) {
            return this.f97179w.invoke(this.f97180x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m72770a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: lz1.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f97181w;

        public f(List list) {
            this.f97181w = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m72771a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C22077e c22077e = (C22077e) this.f97181w.get(i13);
            c28655q.m87150e0(-297880034);
            Function0.m72762v(c22077e, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m72771a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m72739A(C22075c.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m72764x(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m72751k(InterfaceC4339a onBackClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(734958899);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onBackClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            C22075c c22075cM72754n = m72754n(AbstractC28683x.m87261o(m72753m(interfaceC23462h).getViewState(), c28655q, 0));
            C22074b c22074bM72753m = m72753m(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(c22074bM72753m);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(c22074bM72753m);
                c28655q.m87172p0(objM87133R2);
            }
            m72752l(c22075cM72754n, (Function1) ((InterfaceC21467g) objM87133R2), onBackClick, c28655q, (i14 << 6) & 896);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 8, onBackClick);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m72752l(C22075c viewState, Function1 onViewEvent, InterfaceC4339a onBackClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1454152218);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onBackClick) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            int i15 = i14;
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("MOTION TRACKING SANDBOX"), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, onBackClick, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 3) & 7168), 53);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 16, 0.0f, 2);
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 8, 0.0f, 32, 5);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(20);
            boolean zM87157i = c28655q.m87157i(viewState) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C24656d(4, viewState, onViewEvent);
                c28655q.m87172p0(objM87133R);
            }
            c28655q = c28655q;
            AbstractC22674j.m65717c(modifierM3396r, null, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24966, 490);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n((Object) viewState, onViewEvent, onBackClick, i13, 8);
        }
    }

    /* JADX INFO: renamed from: m */
    private static final C22074b m72753m(InterfaceC23462h interfaceC23462h) {
        return (C22074b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: n */
    private static final C22075c m72754n(InterfaceC28670t2 interfaceC28670t2) {
        return (C22075c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m72755o(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m72751k(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m72756p(C22075c c22075c, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C18522f(22, c22075c, function1), true, -1140897605), 3);
        List<C22077e> listM63150a = c22075c.m63150a();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM63150a.size(), new d(new C24174a(29), listM63150a), new e(c.f97176w, listM63150a), new C37816b(new f(listM63150a), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m72757q(C22075c c22075c, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m72764x(c22075c.getSessionAction(), function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Object m72758r(C22077e it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m72759s(C22075c c22075c, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m72752l(c22075c, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m72760t(C22076d c22076d, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-125352650);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(c22076d) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String label = c22076d.getLabel();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(label, null, AbstractC13673n.m38559f(c38072d, c28655q, i15, 0.6f), AbstractC35745c.m113246h(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 3072, 0, 262130);
            AbstractC30795n.m94707h(c22076d.getValue(), null, c38072d.m121949b(c28655q, i15).getBrandWhite(), AbstractC35745c.m113246h(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 3072, 0, 262130);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(c22076d, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m72761u(C22076d c22076d, int i13, Composer composer, int i14) {
        m72760t(c22076d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m72762v(C22077e c22077e, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-800047270);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c22077e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String upperCase = c22077e.getTitle().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC30795n.m94707h(upperCase, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), AbstractC35745c.m113246h(13), null, C28780r.f116542I, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 199680, 0, 262098);
            c28655q = c28655q;
            c28655q.m87150e0(-822867796);
            Iterator<T> it = c22077e.m63156a().iterator();
            while (it.hasNext()) {
                m72760t((C22076d) it.next(), c28655q, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(c22077e, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m72763w(C22077e c22077e, int i13, Composer composer, int i14) {
        m72762v(c22077e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m72764x(C22075c.a aVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-700688010);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(aVar) : c28655q2.m87157i(aVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        boolean z4 = true;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite(), 0L, 0L, 0L, c28655q2, 0, 14);
            boolean z13 = (i15 & 112) == 32;
            if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q2.m87157i(aVar))) {
                z4 = false;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q2.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C23045q(function1, aVar, 23);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R, modifierM3409f, false, null, null, null, c15077m1M43196a, null, AbstractC37817c.m121344e(1289413990, c28655q2, new C24823a(aVar, 0)), c28655q2, 805306416, 380);
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(aVar, function1, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m72765y(Function1 function1, C22075c.a aVar) {
        function1.invoke(aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m72766z(C22075c.a aVar, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            String label = aVar.getLabel();
            long jM125426w = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack();
            C28780r c28780r = C28780r.f116544x;
            AbstractC15011f9.m43114b(label, null, jM125426w, 0L, null, C28780r.f116542I, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0, 131034);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
