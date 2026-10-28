package zf1;

import ag1.C0861c;
import cg1.C4573a;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.filteredlist.api.FilteredListApi;
import dg1.C12008a;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21539e;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25272z;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import qw2.C30695c;
import rf3.C31362a;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u11.AbstractC34437c;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wm0.C37378a;
import xf3.C38266c;
import yf2.C39520a;

/* JADX INFO: renamed from: zf1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lzf1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40612a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: e */
    private static final C23454a0 m131728e(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C39520a c39520a = new C39520a(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(FilteredListApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c39520a, 2)), false);
        C39520a c39520a2 = new C39520a(26);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C0861c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c39520a2, 2)), false);
        C39520a c39520a3 = new C39520a(27);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C12008a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c39520a3, 2)), false);
        C39520a c39520a4 = new C39520a(28);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(AbstractC34437c.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass4, null, c39520a4, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final FilteredListApi m131729f(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        Iterator it = c38266c.m122603b(c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class)).iterator();
        Map mapM73995d0 = C25272z.f99163w;
        while (it.hasNext()) {
            mapM73995d0 = AbstractC25247g0.m73995d0(mapM73995d0, ((InterfaceC21539e) it.next()).mo1798a());
        }
        return (FilteredListApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q(AbstractC6728b.m20380e(c38266c, mapM73995d0, null, null, null, null, 30, null), c29222x0M73382o, "defaultOkHttpClient")), FilteredListApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C0861c m131730g(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0861c((FilteredListApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FilteredListApi.class), null), (C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C12008a m131731h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12008a(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final AbstractC34437c m131732i(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4573a((C0861c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C0861c.class), null), (C12008a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12008a.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m131728e(c33768a);
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
