package vj2;

import ad3.AbstractC0757c;
import ak2.C0953b;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import bk2.C3358e;
import ck2.C4792a;
import com.google.gson.Gson;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.tiltgraph.api.TiltGraphApi;
import fi0.InterfaceC14515a;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import org.koin.core.error.DefinitionParameterException;
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
import tr2.InterfaceC34116n;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import uj2.C35039b;
import un0.C35093a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wj2.C37322c;
import xf3.C38266c;
import xj2.C38409e;
import yj2.C39594b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: vj2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lvj2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36072a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: i */
    private static final C23454a0 m114567i(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C35093a c35093a = new C35093a(19);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(TiltGraphApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c35093a, 2)), false);
        C35093a c35093a2 = new C35093a(20);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C37322c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c35093a2, 2)), false);
        C35093a c35093a3 = new C35093a(21);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C4792a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c35093a3, 2)), false);
        C35093a c35093a4 = new C35093a(22);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C3358e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c35093a4, 2)), false);
        C35093a c35093a5 = new C35093a(23);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C38409e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c35093a5, 2)), false);
        C35093a c35093a6 = new C35093a(24);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C39594b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c35093a6, 2)), false);
        C35093a c35093a7 = new C35093a(25);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C35039b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c35093a7, 1)), false);
        C35093a c35093a8 = new C35093a(26);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C0953b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass8, null, c35093a8, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final TiltGraphApi m114568j(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it"), null, null, 3, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S("kt-serialization-tilt-graph"));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")));
        return (TiltGraphApi) c29222x0.m88730d().m88733b(TiltGraphApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C37322c m114569k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37322c((TiltGraphApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(TiltGraphApi.class), null), null, (C35039b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35039b.class), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C4792a m114570l(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4792a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C3358e m114571m(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3358e((C37322c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37322c.class), null), (C38409e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38409e.class), null), (C39594b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39594b.class), null), (C4792a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C4792a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C38409e m114572n(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38409e((TiltGraphApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(TiltGraphApi.class), null), InterfaceC34116n.INSTANCE.m107848a("TiltGraphCalendarInteractor"), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C39594b m114573o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39594b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C35039b m114574p(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C35039b((InterfaceC14515a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C0953b m114575q(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractComponentCallbacksC1320m0.class));
        if (objM110111b != null) {
            return new C0953b((AbstractComponentCallbacksC1320m0) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractComponentCallbacksC1320m0.class, new StringBuilder("No value found for type '"), '\''));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m114567i(c33768a);
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
