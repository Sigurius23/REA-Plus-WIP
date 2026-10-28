package ia2;

import ad3.AbstractC0757c;
import android.app.Activity;
import com.google.gson.Gson;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.settings.accountheader.api.NativeAccountHeaderApi;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import h02.C16587n0;
import ha2.C17057a;
import i12.C17865a;
import ih0.AbstractC18489d0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.List;
import ka2.C22308a;
import l83.C23454a0;
import la2.C23554b;
import na2.C26512a;
import na2.C26513b;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import oa2.C27757e;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vc2.C35879b;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: ia2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lia2/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18294b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f71221c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: l */
    private static final C23454a0 m52675l(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C17865a c17865a = new C17865a(22);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C23554b.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, null, c17865a, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false, "my-account-header-gson");
        C17865a c17865a2 = new C17865a(23);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c17865a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "my-account-header-json");
        C17865a c17865a3 = new C17865a(24);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r2, c17865a3, 2)), false);
        C17865a c17865a4 = new C17865a(25);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(NativeAccountHeaderApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, c17865a4, 1)), false);
        C17865a c17865a5 = new C17865a(26);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C35879b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c17865a5, 1)), false);
        C17865a c17865a6 = new C17865a(27);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C27757e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c17865a6, 1)), false);
        C17865a c17865a7 = new C17865a(28);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C26513b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c17865a7, 2)), false);
        C17865a c17865a8 = new C17865a(29);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C22308a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c17865a8, 2)), false);
        C18293a c18293a = new C18293a(0);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C26512a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c18293a, 2)), false);
        C18293a c18293a2 = new C18293a(1);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C17057a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass10, null, c18293a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23554b m52676m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C23554b((NativeAccountHeaderApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(NativeAccountHeaderApi.class), null), (C17057a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17057a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Gson m52677n(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it"), null, null, 3, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final AbstractC0757c m52678o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final NativeAccountHeaderApi m52679p(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("my-account-header-gson")), (AbstractC0757c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("my-account-header-json")), AbstractC12350b.m34570S("kt-serialization-settings"));
        C29222x0 c29222x0 = new C29222x0();
        return (NativeAccountHeaderApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), NativeAccountHeaderApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static final C35879b m52680q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C35879b((NativeAccountHeaderApi) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(NativeAccountHeaderApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C27757e m52681r(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C27757e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C26513b m52682s(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26513b((InterfaceC21159o0) factory.m122602a(new C16587n0((Activity) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Activity.class)), 14), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C34911a m52683t(Activity activity) {
        return AbstractC15751g.m44431K(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C22308a m52684u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22308a((C23554b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C23554b.class), null), (C35879b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35879b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C26512a m52685v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26512a((C17057a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17057a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C17057a m52686w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17057a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m52675l(c33768a);
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
