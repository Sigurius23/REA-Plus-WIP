package vx0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import cp0.C10941a;
import ft0.InterfaceC14765a;
import ft0.InterfaceC14766b;
import g40.C15418s0;
import hy0.AbstractC17755i2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21467g;
import java.util.List;
import l83.C23454a0;
import mj0.C25615d;
import mj0.C25616e;
import mj0.InterfaceC25614c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15011f9;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p392p3.C28780r;
import p602x1.C37816b;
import p707gt1.C16201o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import sg2.C32464o;
import um0.C35076b;
import v41.C35658c;
import v63.AbstractC35745c;
import v90.C35813e;
import vs2.C36478d;
import vv2.C36538d;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vx0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001f²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lvx0/e;", "viewModel", "Lkotlin/Function0;", "Ll83/a0;", "onNavigateBack", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lvx0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "title", "u", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "s", "(Landroidx/compose/runtime/Composer;I)V", "Lft0/b;", "device", "", "isPrimary", "enabled", "onUnpair", "p", "(Lft0/b;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Lmj0/e;", "candidate", "onPair", "n", "(Lmj0/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Lvx0/d;", "uiState", "Lmj0/c;", "primaryState", "connectionState", "debug-tools_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36555c {

    /* JADX INFO: renamed from: vx0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C36557e f156486w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC14766b f156487x;

        public a(C36557e c36557e, InterfaceC14766b interfaceC14766b) {
            this.f156486w = c36557e;
            this.f156487x = interfaceC14766b;
        }

        /* JADX INFO: renamed from: a */
        public final void m117247a() {
            this.f156486w.m117271q(this.f156487x.getId());
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m117247a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vx0.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements InterfaceC4339a {
        public b(Object obj) {
            super(0, 0, C36557e.class, obj, "startScan", "startScan()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134579invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134579invoke() {
            ((C36557e) this.receiver).m117269o();
        }
    }

    /* JADX INFO: renamed from: vx0.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements InterfaceC4339a {
        public c(Object obj) {
            super(0, 0, C36557e.class, obj, "stopScan", "stopScan()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134580invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134580invoke() {
            ((C36557e) this.receiver).m117270p();
        }
    }

    /* JADX INFO: renamed from: vx0.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C36557e f156488w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25616e f156489x;

        public d(C36557e c36557e, C25616e c25616e) {
            this.f156488w = c36557e;
            this.f156489x = c25616e;
        }

        /* JADX INFO: renamed from: a */
        public final void m117248a() {
            this.f156488w.m117268n(this.f156489x);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m117248a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vx0.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f156490w = new e();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC14766b interfaceC14766b) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vx0.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f156491w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f156492x;

        public f(Function1 function1, List list) {
            this.f156491w = function1;
            this.f156492x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m117250a(int i13) {
            return this.f156491w.invoke(this.f156492x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m117250a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vx0.c$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f156493w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f156494x;

        public g(Function1 function1, List list) {
            this.f156493w = function1;
            this.f156494x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m117251a(int i13) {
            return this.f156493w.invoke(this.f156494x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m117251a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vx0.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f156495w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36557e f156496x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f156497y;

        public h(List list, C36557e c36557e, InterfaceC28670t2 interfaceC28670t2) {
            this.f156495w = list;
            this.f156496x = c36557e;
            this.f156497y = interfaceC28670t2;
        }

        /* JADX INFO: renamed from: a */
        public final void m117252a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC14766b interfaceC14766b = (InterfaceC14766b) this.f156495w.get(i13);
            c28655q.m87150e0(1804689370);
            String strMo42330a = interfaceC14766b.getId();
            InterfaceC14765a interfaceC14765aM117262f = AbstractC36555c.m117244x(this.f156497y).getPrimarySensor();
            String strMo42330a2 = interfaceC14765aM117262f != null ? interfaceC14765aM117262f.getId() : null;
            boolean zM75339d = strMo42330a2 == null ? false : C25615d.m75339d(strMo42330a, strMo42330a2);
            boolean z4 = !AbstractC36555c.m117244x(this.f156497y).getBusy();
            boolean zM87157i = c28655q.m87157i(this.f156496x) | c28655q.m87157i(interfaceC14766b);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new a(this.f156496x, interfaceC14766b);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC36555c.m117236p(interfaceC14766b, zM75339d, z4, (InterfaceC4339a) objM87133R, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m117252a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vx0.c$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f156498w = new i();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C25616e c25616e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vx0.c$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f156499w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f156500x;

        public j(Function1 function1, List list) {
            this.f156499w = function1;
            this.f156500x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m117254a(int i13) {
            return this.f156499w.invoke(this.f156500x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m117254a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vx0.c$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f156501w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f156502x;

        public k(Function1 function1, List list) {
            this.f156501w = function1;
            this.f156502x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m117255a(int i13) {
            return this.f156501w.invoke(this.f156502x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m117255a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vx0.c$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f156503w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36557e f156504x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f156505y;

        public l(List list, C36557e c36557e, InterfaceC28670t2 interfaceC28670t2) {
            this.f156503w = list;
            this.f156504x = c36557e;
            this.f156505y = interfaceC28670t2;
        }

        /* JADX INFO: renamed from: a */
        public final void m117256a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C25616e c25616e = (C25616e) this.f156503w.get(i13);
            c28655q.m87150e0(1232025048);
            boolean z4 = !AbstractC36555c.m117244x(this.f156505y).getBusy();
            boolean zM87157i = c28655q.m87157i(this.f156504x) | c28655q.m87157i(c25616e);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new d(this.f156504x, c25616e);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC36555c.m117234n(c25616e, z4, (InterfaceC4339a) objM87133R, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m117256a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final InterfaceC25614c m117209A(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC25614c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m117210B(InterfaceC28670t2 interfaceC28670t2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m117241u(AbstractC2875y.m8296i(m117244x(interfaceC28670t2).m117261e().size(), "Paired devices (", ")"), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Object m117211C(InterfaceC14766b it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC11266d.m30461o("paired-", it.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m117212D(C36557e c36557e, InterfaceC28670t2 interfaceC28670t2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m117241u("Scan", c28655q, 6);
            float f13 = 8;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean zM87157i = c28655q.m87157i(c36557e);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new b(c36557e);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            boolean z4 = (m117244x(interfaceC28670t2).getScanning() || m117244x(interfaceC28670t2).getBusy()) ? false : true;
            C36554b c36554b = C36554b.f156475a;
            AbstractC12350b.m34578a(interfaceC4339a, null, z4, null, null, null, null, null, c36554b.m117205q(), c28655q, 805306368, 506);
            boolean zM87157i2 = c28655q.m87157i(c36557e);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new c(c36557e);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC12350b.m34582c((InterfaceC4339a) ((InterfaceC21467g) objM87133R2), null, m117244x(interfaceC28670t2).getScanning(), null, null, c36554b.m117201m(), c28655q, 805306368, 506);
            c28655q.m87173q(true);
            String strM117264h = m117244x(interfaceC28670t2).getStatusMessage();
            if (strM117264h == null) {
                c28655q.m87150e0(206891802);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(206891803);
                AbstractC15011f9.m43114b(strM117264h, AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.7f), AbstractC35745c.m113246h(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 3120, 0, 131056);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m117213E(InterfaceC28670t2 interfaceC28670t2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m117241u(AbstractC2875y.m8296i(m117244x(interfaceC28670t2).m117260d().size(), "Discovered (", ")"), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m117214F(InterfaceC28670t2 interfaceC28670t2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC15011f9.m43114b(m117244x(interfaceC28670t2).getScanning() ? "Listening for WHOOP advertisements…" : "Start scan to discover candidates", null, AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.6f), AbstractC35745c.m113246h(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 3072, 0, 131058);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Object m117215G(C25616e it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC11266d.m30461o("discovered-", it.getAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m117216H(C36557e c36557e, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m117243w(c36557e, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m117234n(C25616e c25616e, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1959290444);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c25616e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
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
            String strM75344b = c25616e.getAdvertisingName();
            if (AbstractC39414r.m125890i0(strM75344b)) {
                strM75344b = "(unnamed)";
            }
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            int i16 = i14;
            AbstractC15011f9.m43114b(strM75344b, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), AbstractC35745c.m113246h(14), null, C28780r.f116540G, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 199680, 0, 131026);
            AbstractC15011f9.m43114b(c25616e.getAddress() + " · rssi=" + c25616e.getRssi() + " · " + c25616e.getProtocol(), null, AbstractC13673n.m38559f(c38072d, c28655q, i15, 0.6f), AbstractC35745c.m113246h(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 3072, 0, 131058);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC12350b.m34578a(interfaceC4339a2, null, z4, null, null, null, null, null, C36554b.f156475a.m117208t(), c28655q, ((i16 >> 6) & 14) | 805306368 | ((i16 << 3) & 896), 506);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(c25616e, z4, interfaceC4339a, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m117235o(C25616e c25616e, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m117234n(c25616e, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m117236p(InterfaceC14766b interfaceC14766b, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(937310586);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC14766b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC14766b.getState(), c28655q, 0);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
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
            String strM8299l = AbstractC2875y.m8299l(interfaceC14766b.getId(), z4 ? " (primary)" : "");
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC15011f9.m43114b(strM8299l, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), AbstractC35745c.m113246h(14), null, C28780r.f116540G, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 199680, 0, 131026);
            AbstractC15011f9.m43114b(interfaceC14766b.getProtocol() + " · state=" + m117237q(interfaceC28601c1M87261o), null, AbstractC13673n.m38559f(c38072d, c28655q, i15, 0.6f), AbstractC35745c.m113246h(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 3072, 0, 131058);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC12350b.m34582c(interfaceC4339a2, null, z13, null, null, C36554b.f156475a.m117204p(), c28655q, ((i14 >> 9) & 14) | 805306368 | (i14 & 896), 506);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15418s0(interfaceC14766b, z4, z13, interfaceC4339a, i13, 1);
        }
    }

    /* JADX INFO: renamed from: q */
    private static final InterfaceC25614c m117237q(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC25614c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m117238r(InterfaceC14766b interfaceC14766b, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m117236p(interfaceC14766b, z4, z13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m117239s(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1533649998);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 4, 1), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m117240t(int i13, Composer composer, int i14) {
        m117239s(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m117241u(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(439005601);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            c28655q = c28655q2;
            AbstractC15011f9.m43114b(str, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, f13, 0.0f, f13, 5), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite(), AbstractC35745c.m113246h(16), null, C28780r.f116542I, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, (i14 & 14) | 199728, 0, 131024);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m117242v(String str, int i13, Composer composer, int i14) {
        m117241u(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m117243w(C36557e viewModel, InterfaceC4339a onNavigateBack, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(onNavigateBack, "onNavigateBack");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-226474984);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigateBack) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewModel.getUiState(), c28655q, 0);
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
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("WHOOP BLE DEBUG"), null, Integer.valueOf(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, onNavigateBack, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 6) & 7168), 53);
            Modifier modifierM3394p = AbstractC1099a.m3394p(16, AbstractC1102d.m3407d(1.0f, c2314t));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(12);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(viewModel);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C35076b(16, interfaceC28601c1M87261o, viewModel);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifierM3394p, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24582, 494);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(viewModel, onNavigateBack, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C36556d m117244x(InterfaceC28670t2 interfaceC28670t2) {
        return (C36556d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m117245y(InterfaceC28670t2 interfaceC28670t2, C36557e c36557e, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C36554b c36554b = C36554b.f156475a;
        InterfaceC26064q.m77556b(LazyColumn, null, c36554b.m117203o(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C16201o(interfaceC28670t2, 1), true, 1068283606), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c36554b.m117207s(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C16201o(interfaceC28670t2, 2), true, -1424547820), 3);
        if (m117244x(interfaceC28670t2).m117261e().isEmpty()) {
            InterfaceC26064q.m77556b(LazyColumn, null, c36554b.m117199k(), 3);
        } else {
            List<InterfaceC14766b> listM117261e = m117244x(interfaceC28670t2).m117261e();
            C36478d c36478d = new C36478d(16);
            e eVar = e.f156490w;
            ((C26053f) LazyColumn).m77529r(listM117261e.size(), new f(c36478d, listM117261e), new g(eVar, listM117261e), new C37816b(new h(listM117261e, c36557e, interfaceC28670t2), true, 802480018));
        }
        InterfaceC26064q.m77556b(LazyColumn, null, c36554b.m117202n(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C36538d(1, c36557e, interfaceC28670t2), true, 377588050), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, c36554b.m117206r(), 3);
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C16201o(interfaceC28670t2, 3), true, -2115243376), 3);
        if (m117244x(interfaceC28670t2).m117260d().isEmpty()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C16201o(interfaceC28670t2, 4), true, -1193936613), 3);
        } else {
            List<C25616e> listM117260d = m117244x(interfaceC28670t2).m117260d();
            C36478d c36478d2 = new C36478d(17);
            i iVar = i.f156498w;
            ((C26053f) LazyColumn).m77529r(listM117260d.size(), new j(c36478d2, listM117260d), new k(iVar, listM117260d), new C37816b(new l(listM117260d, c36557e, interfaceC28670t2), true, 802480018));
        }
        InterfaceC26064q.m77556b(LazyColumn, null, c36554b.m117200l(), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m117246z(InterfaceC28670t2 interfaceC28670t2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m117241u("Primary sensor", c28655q, 6);
            InterfaceC14765a interfaceC14765aM117262f = m117244x(interfaceC28670t2).getPrimarySensor();
            if (interfaceC14765aM117262f == null) {
                c28655q.m87150e0(-470612645);
                AbstractC15011f9.m43114b("None", null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), AbstractC35745c.m113246h(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 3078, 0, 131058);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-470395521);
                InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC14765aM117262f.getState(), c28655q, 0);
                AbstractC15011f9.m43114b(interfaceC14765aM117262f.getId() + " · " + interfaceC14765aM117262f.getProtocol() + " · " + m117209A(interfaceC28601c1M87261o), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), AbstractC35745c.m113246h(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 3072, 0, 131058);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
