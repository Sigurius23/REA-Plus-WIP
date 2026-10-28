package ms1;

import ad3.C0764g;
import ad3.C0775r;
import cd3.C4455g;
import com.whoop.labfileupload.domain.LabFileUploadApi;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.C9602a;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import md2.C25453a;
import mm1.C25694h;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import or2.C28143a;
import or2.C28144a0;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import ps1.C29503a;
import ps1.C29504b;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u82.AbstractC34645f;
import u82.AbstractC34650k;
import ud3.C34826l0;
import uf3.C34911a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ms1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lms1/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lnd1/i;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25929a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C26583i> dependencies = AbstractC37056f.m118958J(new C26583i());

    /* JADX INFO: renamed from: e */
    private static final C23454a0 m76698e(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C25453a c25453a = new C25453a(26);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(LabFileUploadApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c25453a, 1)), false);
        C25453a c25453a2 = new C25453a(27);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C29504b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c25453a2, 2)), false);
        C25453a c25453a3 = new C25453a(28);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C29503a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass3, null, c25453a3, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final LabFileUploadApi m76699f(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C0775r c0775rM107878b = AbstractC34132o.m107878b(AbstractC34650k.m109496c(), new C25694h(23));
        C29222x0 c29222x0 = new C29222x0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0.m88729c(((AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(c0775rM107878b));
        return (LabFileUploadApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), LabFileUploadApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m76700g(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        C4455g c4455g = new C4455g();
        c4455g.mo2325k(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), new C9602a(null, null, 3, null));
        Json.f2788o = c4455g.m13953r();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final C29504b m76701h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29504b(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C29503a m76702i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29503a((C28144a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28144a0.class), null), (C28143a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28143a.class), null), (C29504b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29504b.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), null, 16, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m76698e(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C26583i> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
