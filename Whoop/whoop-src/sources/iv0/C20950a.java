package iv0;

import at0.InterfaceC1984b;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase;
import com.whoop.consolePackets.data.api.ConsolePacketsApi;
import gv0.C16226a;
import hv0.C17670a;
import in0.C18719a;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import java.util.Set;
import js0.AbstractC21909c;
import jv0.C21967a;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import or2.C28162g;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import r80.AbstractC31061c;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u82.AbstractC34650k;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;
import yt0.InterfaceC39765d;

/* JADX INFO: renamed from: iv0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Liv0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "console-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20950a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: renamed from: f */
    private static final C23454a0 m58206f(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C18719a c18719a = new C18719a(17);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(ConsolePacketsApi.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c18719a, 2)), false);
        C18719a c18719a2 = new C18719a(18);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C17670a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c18719a2, 2)), false);
        C18719a c18719a3 = new C18719a(19);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC39765d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c18719a3, 1)), false);
        C18719a c18719a4 = new C18719a(20);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C16226a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c18719a4, 2)), false);
        C18719a c18719a5 = new C18719a(21);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(InterfaceC1984b.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass5, null, c18719a5, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final ConsolePacketsApi m58207g(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Gson gsonCreate = new GsonBuilder().create();
        Set<String> setM34570S = AbstractC12350b.m34570S("kt-serialization-console-packets");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, AbstractC34650k.m109496c(), setM34570S);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88731e((C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC31061c.m95649y((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, "defaultOkHttpClient")));
        c29222x0.m88728b(c34643dM109481a);
        Object objM88733b = c29222x0.m88730d().m88733b(ConsolePacketsApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (ConsolePacketsApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C17670a m58208h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17670a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC39765d m58209i(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentStrapPacketDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19633b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C16226a m58210j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC39765d interfaceC39765d = (InterfaceC39765d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39765d.class), null);
        ConsolePacketsApi consolePacketsApi = (ConsolePacketsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ConsolePacketsApi.class), null);
        AbstractC21909c abstractC21909c = (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C16226a(interfaceC39765d, consolePacketsApi, abstractC21909c, clockSystemUTC, (C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC1984b m58211k(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21967a((C17670a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17670a.class), null), (InterfaceC39765d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39765d.class), null), (C16226a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C16226a.class), null), null, 8, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m58206f(c33768a);
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
