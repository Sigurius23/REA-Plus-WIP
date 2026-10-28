package vb2;

import com.whoop.data.repositories.ArabicLanguageEnabledChecker;
import com.whoop.data.repositories.CachedDataLanguageRefresher;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.JournalRepository;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.service.network.JournalApi;
import com.whoop.settings.journalv2.C10111b;
import com.whoop.settings.journalv2.C10116g;
import com.whoop.settings.journalv2.C10118i;
import ec2.C13011b;
import ec2.C13013d;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import in2.InterfaceC18732d;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import or2.C28162g;
import or2.InterfaceC28197r1;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29224y0;
import qf3.C30330b;
import rf3.C31362a;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import un0.C35093a;
import v40.C35652d;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import xb2.C38165a;
import xf3.C38266c;
import yb2.C39395b;

/* JADX INFO: renamed from: vb2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lvb2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35871a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: j */
    private static final C23454a0 m113899j(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C35093a c35093a = new C35093a(11);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(JournalApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c35093a, 2)), false);
        C35093a c35093a2 = new C35093a(12);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C10116g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c35093a2, 2)), false);
        C35093a c35093a3 = new C35093a(13);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C10111b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c35093a3, 2)), false);
        C35093a c35093a4 = new C35093a(14);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C10118i.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c35093a4, 2)), false);
        C35093a c35093a5 = new C35093a(15);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C39395b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c35093a5, 2)), false);
        C35093a c35093a6 = new C35093a(16);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C13011b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c35093a6, 2)), false);
        C35093a c35093a7 = new C35093a(17);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C13013d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c35093a7, 2)), false);
        C35093a c35093a8 = new C35093a(18);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C38165a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass8, null, c35093a8, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final JournalApi m113900k(C38266c c38266c, C34911a c34911a) {
        return (JournalApi) ((C29224y0) c38266c.m122602a(new C35652d(24), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(JournalApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C34911a m113901l() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-journal-settings"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C10116g m113902m(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C10116g((C10111b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C10111b.class), null), (C10118i) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C10118i.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C10111b m113903n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C10111b((InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (JournalRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalRepository.class), null), (JournalApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalApi.class), null), InterfaceC34116n.INSTANCE.m107848a("JournalSettings"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C10118i m113904o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C10118i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C39395b m113905p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39395b((LanguageRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null), (C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null), (InterfaceC28197r1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28197r1.class), null), null, (C38165a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C38165a.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (ArabicLanguageEnabledChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ArabicLanguageEnabledChecker.class), null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C13011b m113906q(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13011b((C39395b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39395b.class), null), (C13013d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13013d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C13013d m113907r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13013d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C38165a m113908s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38165a((LanguageRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null), (InterfaceC28197r1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28197r1.class), null), (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (CachedDataLanguageRefresher) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(CachedDataLanguageRefresher.class), null), null, 16, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m113899j(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C35799a> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
