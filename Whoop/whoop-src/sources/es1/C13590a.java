package es1;

import ad3.AbstractC0757c;
import ao1.C1872g;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.journalhometile.domain.model.JournalHomeTileModel;
import ek1.C13302a;
import fs1.C14744a;
import fs1.C14747d;
import hs1.C17605b;
import ih0.AbstractC18489d0;
import is1.C20923b;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import u82.C34642c;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: es1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Les1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13590a implements InterfaceC26584j {

    /* JADX INFO: renamed from: b */
    private static final a f47978b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f47979c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: es1.a$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m65681d2 = {"Les1/a$a;", "", "<init>", "()V", "", "JOURNAL_HOME_TILE_MAPPING", "Ljava/lang/String;", "JOURNAL_HOME_TILE_GSON", "JOURNAL_HOME_TILE_JSON", "JOURNAL_HOME_TILE_BFF_CACHE_DESERIALIZER", "JOURNAL_HOME_TILE_CACHED_API_SOURCE", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k */
    private static final C23454a0 m38381k(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "journal-home-tile-mapping");
        C13302a c13302a = new C13302a(15);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c13302a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "JOURNAL_HOME_TILE_GSON");
        C13302a c13302a2 = new C13302a(16);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c13302a2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "JOURNAL_HOME_TILE_JSON");
        C13302a c13302a3 = new C13302a(17);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM53379t2 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass3, c35953cM53379t, c13302a3, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM53379t, c35953c), false, "JOURNAL_HOME_TILE_BFF_CACHE_DESERIALIZER");
        C13302a c13302a4 = new C13302a(18);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass4, c35953cM53379t2, c13302a4, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM53379t2, c35953c), false, "JOURNAL_HOME_TILE_CACHED_API_SOURCE");
        C13302a c13302a5 = new C13302a(19);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, c35953cM73385r2, c13302a5, 2)), false);
        C13302a c13302a6 = new C13302a(20);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C14744a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c13302a6, 2)), false);
        C13302a c13302a7 = new C13302a(21);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C20923b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c13302a7, 2)), false);
        C13302a c13302a8 = new C13302a(22);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C17605b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c13302a8, 2)), false);
        C13302a c13302a9 = new C13302a(23);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C14747d.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass9, null, c13302a9, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Map m38382l(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25247g0.m73989X(new C23465k("JOURNAL_HOME_TILE", AbstractC22671h0.f89337a.getOrCreateKotlinClass(JournalHomeTileModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Gson m38383m(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(new GsonBuilder(), (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "journal-home-tile-mapping")), null, 2, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final AbstractC0757c m38384n(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "journal-home-tile-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC34640a m38385o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("JOURNAL_HOME_TILE_JSON");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c), (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("JOURNAL_HOME_TILE_GSON")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-journal-home-tile"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC26834e m38386p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return (InterfaceC26834e) factory.m122602a(new C1872g(factory, 1), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C34911a m38387q(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("JOURNAL_HOME_TILE_BFF_CACHE_DESERIALIZER"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C14744a m38388r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14744a((C14747d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14747d.class), null), (InterfaceC26834e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), new C35953c("JOURNAL_HOME_TILE_CACHED_API_SOURCE")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C20923b m38389s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C20923b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C17605b m38390t(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17605b((C14744a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14744a.class), null), (C20923b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20923b.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C14747d m38391u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C14747d();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m38381k(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
