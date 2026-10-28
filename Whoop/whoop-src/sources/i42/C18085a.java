package i42;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.privacyconsent.api.PrivacyConsentApi;
import fi0.InterfaceC14515a;
import g42.C15462a;
import i12.C17865a;
import j93.InterfaceC21461d;
import java.util.List;
import k42.C22197g;
import l83.C23454a0;
import m42.C25054a;
import nd1.InterfaceC26584j;
import od1.C27858u;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p42.C28841a;
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
import v82.C35799a;
import vf3.C35953c;
import we1.InterfaceC37217a;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: i42.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Li42/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18085a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: f */
    private static final C23454a0 m51930f(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C17865a c17865a = new C17865a(7);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C28841a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c17865a, 2)), false);
        C17865a c17865a2 = new C17865a(8);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C22197g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c17865a2, 2)), false);
        C17865a c17865a3 = new C17865a(9);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C25054a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c17865a3, 2)), false);
        C17865a c17865a4 = new C17865a(10);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C15462a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c17865a4, 2)), false);
        C17865a c17865a5 = new C17865a(11);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(PrivacyConsentApi.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass5, null, c17865a5, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C28841a m51931g(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28841a((C22197g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22197g.class), null), (C25054a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25054a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C22197g m51932h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22197g((PrivacyConsentApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PrivacyConsentApi.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C25054a m51933i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25054a((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC37217a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C15462a m51934j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15462a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final PrivacyConsentApi m51935k(C38266c c38266c, C34911a c34911a) {
        return (PrivacyConsentApi) ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(PrivacyConsentApi.class);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m51930f(c33768a);
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
