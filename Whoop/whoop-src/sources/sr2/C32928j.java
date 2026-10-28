package sr2;

import aa2.InterfaceC0596e;
import ai1.InterfaceC0909a;
import androidx.room.C1818p0;
import c93.InterfaceC4339a;
import com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase;
import com.whoop.data.local.room.PersistentWhoopDatabase;
import com.whoop.data.local.room.WhoopDatabase;
import com.whoop.data.local.room.dao.persistent.RawDataDao;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao;
import com.whoop.data.local.room.dao.wipeable.TeamsDao;
import com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt;
import com.whoop.data.local.room.migrations.WhoopDatabaseMigrationsKt;
import com.whoop.data.onboarding.OnboardingStatusDao;
import fx2.InterfaceC14849a;
import hi0.AbstractC17312j;
import j93.InterfaceC21461d;
import java.util.Arrays;
import java.util.List;
import ji0.InterfaceC21713a;
import l83.C23454a0;
import l83.EnumC23463i;
import lm2.C24515a;
import nd1.InterfaceC26584j;
import np0.C27015h;
import or2.C28144a0;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p325mb.AbstractC25380b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qf3.C30330b;
import rf2.InterfaceC31359a;
import rf3.C31362a;
import rf3.C31365d;
import rk2.InterfaceC31499c;
import rr2.C31778o;
import rr2.InterfaceC31775l;
import tf3.C33768a;
import tr2.C34115m;
import tr2.C34117o;
import tr2.InterfaceC34114l;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uf3.C34911a;
import uh1.InterfaceC34966a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vt0.AbstractC36486c;
import we1.InterfaceC37218b;
import we1.InterfaceC37226j;
import wf3.C37247a;
import x90.InterfaceC38095a;
import xf3.C38266c;
import yu0.C39785b;

/* JADX INFO: renamed from: sr2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lsr2/j;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32928j implements InterfaceC26584j {

    /* JADX INFO: renamed from: sr2.j$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f137213w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f137214x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f137215y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f137213w = c38266c;
            this.f137214x = interfaceC35951a;
            this.f137215y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yu0.b] */
        @Override // c93.InterfaceC4339a
        public final C39785b invoke() {
            return this.f137213w.m122602a(this.f137215y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39785b.class), this.f137214x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final TeamsDao m103758A(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((WhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopDatabase.class), null)).teamsDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC34114l m103759B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        String string = AbstractC29125c.m88532i(factory).getString(AbstractC17312j.f66984g);
        AbstractC22676k.m65749i(string, "getString(...)");
        return new C34115m(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC14849a m103760C(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).whoopLabsDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC34966a m103761D(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).gpsLocationDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC38095a m103762E(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).activeActivitySessionDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final InterfaceC31499c m103763F(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).pendingActivitySaveDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final InterfaceC31359a m103764G(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).smartAlarmUserInfoDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final InterfaceC0909a m103765H(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).foregroundGpsRoutePointDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C27015h m103766I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27015h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final OnboardingStatusDao m103767J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).onboardingStatusDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC0596e m103768K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).userDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final TeamInviteDao m103769L(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((WhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopDatabase.class), null)).teamsInviteDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final InterfaceC21713a m103770M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).appConfigurationCacheDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final InterfaceC37218b m103771N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).entitlementDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final InterfaceC37226j m103772O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentWhoopDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentWhoopDatabase.class), null)).membershipTypeDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C31778o m103773P(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31778o((InterfaceC31775l) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31775l.class), null), AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(factory, null, null)), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final FeatureTeamDao m103774Q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((WhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopDatabase.class), null)).featureTeamDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final MemberStoryDao m103775R(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((WhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopDatabase.class), null)).memberStoryDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final RawDataDao m103776S(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((WhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopDatabase.class), null)).rawDataDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final PersistentWhoopDatabase m103777T(C38266c c38266c, C34911a c34911a) {
        C1818p0 c1818p0M60645C = AbstractC21598x.m60645C(AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c), PersistentWhoopDatabase.class, "persistent_whoop_db");
        AbstractC25380b[] all_migrations = PersistentWhoopDatabaseMigrationsKt.getALL_MIGRATIONS();
        c1818p0M60645C.m5449a((AbstractC25380b[]) Arrays.copyOf(all_migrations, all_migrations.length));
        return (PersistentWhoopDatabase) c1818p0M60645C.m5450b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final PersistentStrapPacketDatabase m103778U(C38266c c38266c, C34911a c34911a) {
        C1818p0 c1818p0M60645C = AbstractC21598x.m60645C(AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c), PersistentStrapPacketDatabase.class, "persistent_packet_db");
        AbstractC25380b[] abstractC25380bArrM116924b = AbstractC36486c.m116924b();
        c1818p0M60645C.m5449a((AbstractC25380b[]) Arrays.copyOf(abstractC25380bArrM116924b, abstractC25380bArrM116924b.length));
        return (PersistentStrapPacketDatabase) c1818p0M60645C.m5450b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C28144a0 m103779V(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C28144a0(AbstractC29125c.m88532i(single), new C34117o((InterfaceC34116n) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34116n.class), null), "FileManager", null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C24515a m103780W(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C24515a((C34660d) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), InterfaceC34116n.INSTANCE.m107848a("AddActivityHistoryStore"));
    }

    /* JADX INFO: renamed from: y */
    private static final C23454a0 m103805y(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C32926h c32926h = new C32926h(2);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(WhoopDatabase.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c32926h, 1)), false);
        C32926h c32926h2 = new C32926h(4);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(TeamsDao.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, null, c32926h2, 1)), false);
        C32926h c32926h3 = new C32926h(9);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(TeamInviteDao.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c32926h3, 1)), false);
        C32926h c32926h4 = new C32926h(10);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(FeatureTeamDao.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, c32926h4, 1)), false);
        C32926h c32926h5 = new C32926h(11);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(MemberStoryDao.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c32926h5, 1)), false);
        C32926h c32926h6 = new C32926h(12);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(RawDataDao.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c32926h6, 1)), false);
        C32926h c32926h7 = new C32926h(14);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(PersistentWhoopDatabase.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c32926h7, 1)), false);
        C32926h c32926h8 = new C32926h(15);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, c32926h8, 1)), false);
        C32926h c32926h9 = new C32926h(16);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C28144a0.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass9, null, c32926h9, 1)), false);
        C32926h c32926h10 = new C32926h(17);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C24515a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c32926h10, 2)), false);
        C32926h c32926h11 = new C32926h(13);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(InterfaceC34114l.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c32926h11, 2)), false);
        C32926h c32926h12 = new C32926h(18);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(InterfaceC14849a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass12, null, c32926h12, 1)), false);
        C32926h c32926h13 = new C32926h(19);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(InterfaceC34966a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass13, null, c32926h13, 1)), false);
        C32926h c32926h14 = new C32926h(20);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(InterfaceC38095a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass14, null, c32926h14, 1)), false);
        C32926h c32926h15 = new C32926h(21);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(InterfaceC31499c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass15, null, c32926h15, 1)), false);
        C32926h c32926h16 = new C32926h(22);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(InterfaceC31359a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass16, null, c32926h16, 1)), false);
        C32926h c32926h17 = new C32926h(23);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(InterfaceC0909a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass17, null, c32926h17, 1)), false);
        C32926h c32926h18 = new C32926h(24);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C27015h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c32926h18, 2)), false);
        C32926h c32926h19 = new C32926h(25);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(OnboardingStatusDao.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c32926h19, 2)), false);
        C32926h c32926h20 = new C32926h(3);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(InterfaceC0596e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c32926h20, 2)), false);
        C32926h c32926h21 = new C32926h(5);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(InterfaceC21713a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c32926h21, 2)), false);
        C32926h c32926h22 = new C32926h(6);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(InterfaceC37218b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c32926h22, 2)), false);
        C32926h c32926h23 = new C32926h(7);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(InterfaceC37226j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass23, null, c32926h23, 2)), false);
        C32926h c32926h24 = new C32926h(8);
        InterfaceC21461d orCreateKotlinClass24 = c22673i0.getOrCreateKotlinClass(C31778o.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass24, null, c32926h24, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass24, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final WhoopDatabase m103806z(C38266c c38266c, C34911a c34911a) {
        C1818p0 c1818p0M60645C = AbstractC21598x.m60645C(AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c), WhoopDatabase.class, "whoop_db");
        c1818p0M60645C.f7157p = false;
        c1818p0M60645C.f7158q = true;
        AbstractC25380b[] whoop_db_all_migrations = WhoopDatabaseMigrationsKt.getWHOOP_DB_ALL_MIGRATIONS();
        c1818p0M60645C.m5449a((AbstractC25380b[]) Arrays.copyOf(whoop_db_all_migrations, whoop_db_all_migrations.length));
        return (WhoopDatabase) c1818p0M60645C.m5450b();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m103805y(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
