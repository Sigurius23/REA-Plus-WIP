package ix2;

import android.bluetooth.BluetoothAdapter;
import androidx.core.app.NotificationManagerCompat;
import androidx.health.platform.client.proto.C1533u;
import ao1.C1873h;
import az2.C2174a;
import bc3.InterfaceC2994c0;
import by2.C3701a;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.whooplabs.C10823a;
import com.whoop.whooplabs.data.network.WhoopLabsApi;
import com.whoop.whooplabs.data.network.WhoopLabsBffApi;
import com.whoop.whooplabs.p070io.HrDeviceConnection;
import dy2.C12453c;
import dz2.C12472c;
import ex2.C13730a;
import ex2.C13731b;
import ex2.C13732c;
import ey2.C13754a;
import ez2.C13761a;
import fi0.InterfaceC14515a;
import fu1.InterfaceC14783b;
import fx2.InterfaceC14849a;
import ge3.AbstractC15751g;
import gt0.InterfaceC16183e;
import gy2.C16282a;
import in0.C18719a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.C19383k;
import iy2.C21036c;
import iz2.C21060a;
import j93.InterfaceC21461d;
import java.util.List;
import jt0.InterfaceC21934a;
import jy2.C22051a;
import kx2.C22885b;
import l83.C23454a0;
import lm0.C24506a;
import ly2.C24803a;
import mx2.C26021h;
import mz2.C26042a;
import mz2.C26044c;
import mz2.C26045d;
import mz2.C26046e;
import nd1.InterfaceC26584j;
import nx2.C27227a;
import nz2.AbstractC27308b;
import nz2.C27313g;
import od1.C27858u;
import or2.C28144a0;
import or2.C28205u0;
import org.joda.time.DateTimeZone;
import oy2.C28479e;
import oy2.C28480f;
import oy2.C28484j;
import oz2.C28500b;
import oz2.C28502d;
import oz2.InterfaceC28499a;
import oz2.InterfaceC28501c;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29222x0;
import qf3.C30330b;
import qx2.C30761a;
import qy2.C30778b;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import sr2.AbstractC32943y;
import sx2.C33077c;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tx2.C34245a;
import ud3.C34826l0;
import uf3.C34911a;
import uy2.C35386a;
import v82.C35799a;
import vf3.C35953c;
import vx2.C36560a;
import wf3.C37247a;
import xf3.C38266c;
import xx2.C38696c;
import xy2.C38709c;
import yw2.C39829a;
import yw2.C39834f;
import yw2.C39836h;
import yx2.C39846a;
import yy2.C39897a;
import z92.InterfaceC40205a;
import zr2.C41072c;
import zr2.InterfaceC41070a;
import zw2.C41178b;

/* JADX INFO: renamed from: ix2.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lix2/c;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21024c implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C34911a m58596A0(C38266c c38266c) {
        return AbstractC15751g.m44431K(AbstractC29125c.m88532i(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C35386a m58598B0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35386a((C28479e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28479e.class), null), (C30778b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30778b.class), null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C28479e m58600C0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28479e((C13732c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13732c.class), null), (C10823a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C10823a.class), null), null, (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), new C28480f(AbstractC27308b.m82458a("CampaignStepsInteractor")), (C13731b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13731b.class), null), (C41178b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41178b.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC16183e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C16282a m58602D0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C16282a((C12453c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12453c.class), null), (C13754a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13754a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public static final C12453c m58604E0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12453c((C13731b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13731b.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C13754a m58606F0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13754a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C24803a m58608G0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24803a((C21036c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21036c.class), null), (C22051a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22051a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public static final C21036c m58610H0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21036c((C13731b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13731b.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C22051a m58612I0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22051a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C26045d m58614J0(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26045d(BluetoothAdapter.getDefaultAdapter(), AbstractC27308b.m82458a("HrDeviceScanner"), (InterfaceC2994c0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class)), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C26042a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26042a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C27313g m58616K0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27313g((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C28484j m58618L0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28484j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public static final C28480f m58620M0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28480f(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final InterfaceC28501c m58622N0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C28502d((AbstractC18377p0) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final NotificationManagerCompat m58624O0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return NotificationManagerCompat.from(AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final InterfaceC28499a m58626P0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C28500b((AbstractC18377p0) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C26046e m58628Q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26046e((InterfaceC2994c0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), null), AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final HrDeviceConnection m58630R0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new HrDeviceConnection((InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), AbstractC29125c.m88532i(single), (C24506a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C24506a.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C26044c m58632S0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C26044c((FeatureFlagChecker) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final WhoopLabsApi m58634T0(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return (WhoopLabsApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q(AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null), c29222x0M73382o, "defaultOkHttpClient")), WhoopLabsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C13732c m58636U0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C13732c((InterfaceC14849a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14849a.class), null));
    }

    /* JADX INFO: renamed from: X */
    private static final C23454a0 m58639X(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C18719a c18719a = new C18719a(22);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C39836h.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c18719a, 2)), false);
        C18719a c18719a2 = new C18719a(24);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C39829a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c18719a2, 2)), false);
        final int i13 = 6;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C10823a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, interfaceC4351m, 1)), false);
        final int i14 = 18;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C26042a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, interfaceC4351m2, 1)), false);
        final int i15 = 26;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C26045d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, interfaceC4351m3, 2)), false);
        final int i16 = 27;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C26046e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, interfaceC4351m4, 2)), false);
        final int i17 = 28;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(HrDeviceConnection.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, interfaceC4351m5, 1)), false);
        final int i18 = 29;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C26044c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, interfaceC4351m6, 1)), false);
        C21023b c21023b = new C21023b(0);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(WhoopLabsApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass9, null, c21023b, 1)), false);
        C21023b c21023b2 = new C21023b(1);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C13732c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass10, null, c21023b2, 1)), false);
        final int i19 = 3;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C13731b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass11, null, interfaceC4351m7, 1)), false);
        final int i24 = 14;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C13730a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass12, null, interfaceC4351m8, 1)), false);
        final int i25 = 25;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C39834f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass13, null, interfaceC4351m9, 1)), false);
        C21023b c21023b3 = new C21023b(2);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C41178b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c21023b3, 2)), false);
        C21023b c21023b4 = new C21023b(3);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(WhoopLabsBffApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass15, null, c21023b4, 1)), false);
        C21023b c21023b5 = new C21023b(4);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C3701a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c21023b5, 2)), false);
        C21023b c21023b6 = new C21023b(5);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C38696c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c21023b6, 2)), false);
        C21023b c21023b7 = new C21023b(6);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C39846a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c21023b7, 2)), false);
        C21023b c21023b8 = new C21023b(7);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C2174a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c21023b8, 2)), false);
        C18719a c18719a3 = new C18719a(23);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C38709c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c18719a3, 2)), false);
        C30330b c30330b = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C39897a.class), null, new C18719a(25), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b.f124471b, null, c35953c), new C31362a(c30330b), false);
        C30330b c30330b2 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21060a.class), null, new C18719a(26), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b2.f124471b, null, c35953c), new C31362a(c30330b2), false);
        C30330b c30330b3 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C12472c.class), null, new C18719a(27), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b3.f124471b, null, c35953c), new C31362a(c30330b3), false);
        C30330b c30330b4 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C13761a.class), null, new C18719a(28), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b4.f124471b, null, c35953c), new C31362a(c30330b4), false);
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30761a.class), null, new C18719a(29), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), new C31362a(c30330b5), false);
        final int i26 = 0;
        C30330b c30330b6 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C26021h.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b6.f124471b, null, c35953c), new C31362a(c30330b6), false);
        final int i27 = 1;
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22885b.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b7.f124471b, null, c35953c), new C31362a(c30330b7), false);
        final int i28 = 2;
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27227a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, null, c35953c), new C31362a(c30330b8), false);
        final int i29 = 4;
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36560a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31362a(c30330b9), false);
        final int i34 = 5;
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C33077c.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c), new C31362a(c30330b10), false);
        final int i35 = 7;
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34245a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), new C31362a(c30330b11), false);
        final int i36 = 8;
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30778b.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b12.f124471b, null, c35953c), new C31362a(c30330b12), false);
        final int i37 = 9;
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35386a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, null, c35953c), new C31362a(c30330b13), false);
        final int i38 = 10;
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28479e.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31362a(c30330b14), false);
        final int i39 = 11;
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C16282a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31362a(c30330b15), false);
        final int i44 = 12;
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C12453c.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31362a(c30330b16), false);
        final int i45 = 13;
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C13754a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31362a(c30330b17), false);
        final int i46 = 15;
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24803a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c), new C31362a(c30330b18), false);
        final int i47 = 16;
        C30330b c30330b19 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C21036c.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b19.f124471b, null, c35953c), new C31362a(c30330b19), false);
        final int i48 = 17;
        C30330b c30330b20 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22051a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b20.f124471b, null, c35953c), new C31362a(c30330b20), false);
        final int i49 = 19;
        C30330b c30330b21 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C27313g.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b21.f124471b, null, c35953c), new C31362a(c30330b21), false);
        final int i54 = 20;
        C30330b c30330b22 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28484j.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b22.f124471b, null, c35953c), new C31362a(c30330b22), false);
        final int i55 = 21;
        C30330b c30330b23 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28480f.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b23.f124471b, null, c35953c), new C31362a(c30330b23), false);
        final int i56 = 22;
        C30330b c30330b24 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(InterfaceC28501c.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b24.f124471b, null, c35953c), new C31365d(c30330b24), false);
        final int i57 = 23;
        C30330b c30330b25 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(NotificationManagerCompat.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b25.f124471b, null, c35953c), new C31362a(c30330b25), false);
        final int i58 = 24;
        C30330b c30330b26 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(InterfaceC28499a.class), null, new InterfaceC4351m() { // from class: ix2.a
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C21024c.m58679s0(c38266c, c34911a);
                    case 1:
                        return C21024c.m58681t0(c38266c, c34911a);
                    case 2:
                        return C21024c.m58683u0(c38266c, c34911a);
                    case 3:
                        return C21024c.m58647c0(c38266c, c34911a);
                    case 4:
                        return C21024c.m58685v0(c38266c, c34911a);
                    case 5:
                        return C21024c.m58687w0(c38266c, c34911a);
                    case 6:
                        return C21024c.m58667m0(c38266c, c34911a);
                    case 7:
                        return C21024c.m58691y0(c38266c, c34911a);
                    case 8:
                        return C21024c.m58693z0(c38266c, c34911a);
                    case 9:
                        return C21024c.m58598B0(c38266c, c34911a);
                    case 10:
                        return C21024c.m58600C0(c38266c, c34911a);
                    case 11:
                        return C21024c.m58602D0(c38266c, c34911a);
                    case 12:
                        return C21024c.m58604E0(c38266c, c34911a);
                    case 13:
                        return C21024c.m58606F0(c38266c, c34911a);
                    case 14:
                        return C21024c.m58649d0(c38266c, c34911a);
                    case 15:
                        return C21024c.m58608G0(c38266c, c34911a);
                    case 16:
                        return C21024c.m58610H0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C21024c.m58612I0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C21024c.m58689x0(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C21024c.m58616K0(c38266c, c34911a);
                    case 20:
                        return C21024c.m58618L0(c38266c, c34911a);
                    case 21:
                        return C21024c.m58620M0(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C21024c.m58622N0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C21024c.m58624O0(c38266c, c34911a);
                    case 24:
                        return C21024c.m58626P0(c38266c, c34911a);
                    case 25:
                        return C21024c.m58651e0(c38266c, c34911a);
                    case 26:
                        return C21024c.m58614J0(c38266c, c34911a);
                    case 27:
                        return C21024c.m58628Q0(c38266c, c34911a);
                    case 28:
                        return C21024c.m58630R0(c38266c, c34911a);
                    default:
                        return C21024c.m58632S0(c38266c, c34911a);
                }
            }
        }, 1);
        AbstractC11895b.m31980C(c30330b26, module, AbstractC21598x.m60669Y(c30330b26.f124471b, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C39836h m58640Y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39836h((InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), AbstractC27308b.m82458a("WhoopLabsServiceModel"), (C13732c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13732c.class), null), (FileDownloaderApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FileDownloaderApi.class), null), (C28144a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28144a0.class), null), (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (WhoopLabsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopLabsApi.class), null), (C26046e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26046e.class), null), (HrDeviceConnection) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HrDeviceConnection.class), null), new C41072c(new C19383k(26), new C19383k(27)), (C39834f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39834f.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C27313g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27313g.class), null), (InterfaceC21934a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21934a.class), null), (C41178b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41178b.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC28501c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28501c.class), null), (InterfaceC28499a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28499a.class), null), (C39829a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39829a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final long m58641Z() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final DateTimeZone m58643a0() {
        DateTimeZone UTC = DateTimeZone.UTC;
        AbstractC22676k.m65749i(UTC, "UTC");
        return UTC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C39829a m58645b0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39829a((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null), AbstractC27308b.m82458a("BtHrTimestampStore"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C13731b m58647c0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13731b((C27858u) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953cM73387t), (InterfaceC18732d) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC31766c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), AbstractC27308b.m82458a("WhoopLabsCampaignRepo"), (InterfaceC14849a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14849a.class), null), (WhoopLabsApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopLabsApi.class), null), (InterfaceC33704b) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (FileDownloaderApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FileDownloaderApi.class), null), (C28144a0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C28144a0.class), null), (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (WhoopLabsBffApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopLabsBffApi.class), null), (InterfaceC41070a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (InterfaceC40205a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (C28484j) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C28484j.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C13730a m58649d0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13730a((InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (WhoopLabsBffApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopLabsBffApi.class), null), (InterfaceC14849a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14849a.class), null), AbstractC27308b.m82458a("DwlLandingRepository"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C39834f m58651e0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39834f((InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC14783b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14783b.class), null), AbstractC27308b.m82458a("StrapConnection"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C41178b m58653f0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41178b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final WhoopLabsBffApi m58655g0(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return (WhoopLabsBffApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q(AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null), c29222x0M73382o, "defaultOkHttpClient")), WhoopLabsBffApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C3701a m58657h0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3701a((C38696c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38696c.class), null), (C39846a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39846a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static final C38696c m58659i0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38696c((C13731b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13731b.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C39846a m58661j0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39846a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C2174a m58663k0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C2174a((C38709c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38709c.class), null), (C39897a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39897a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public static final C38709c m58665l0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38709c((C13731b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13731b.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C10823a m58667m0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C10823a(AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C39897a m58669n0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39897a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C21060a m58671o0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21060a((C12472c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12472c.class), null), (C13761a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13761a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C12472c m58673p0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12472c((C13730a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13730a.class), null), AbstractC27308b.m82458a("DwlLandingInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public static final C13761a m58675q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13761a(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C30761a m58677r0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30761a((C26021h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C26021h.class), null), (C27227a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27227a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C26021h m58679s0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26021h((C22885b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C22885b.class), null), (C10823a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C10823a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C22885b m58681t0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C22885b((C13731b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13731b.class), null), (C41178b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C41178b.class), null), (C10823a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C10823a.class), null), (C13732c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13732c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C27227a m58683u0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27227a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C36560a m58685v0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36560a((C33077c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33077c.class), null), (C34245a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34245a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public static final C33077c m58687w0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33077c((C13731b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13731b.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C26042a m58689x0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C26042a(AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C34245a m58691y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34245a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C30778b m58693z0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30778b((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C28205u0) factory.m122602a(new C1873h(factory, 17), c22673i0.getOrCreateKotlinClass(C28205u0.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m58639X(c33768a);
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
