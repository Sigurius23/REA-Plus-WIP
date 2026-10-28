package l01;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.stories.OnboardingStoriesDebugFragment;
import f70.C14201q0;
import hms.webrtc.VideoFrame;
import j32.C21295j;
import j72.C21397b;
import j72.C21398c;
import j72.C21399d;
import java.util.LinkedHashMap;
import jc0.C21604d;
import ji2.C21724c;
import jz1.C22075c;
import l32.AbstractC23324c;
import l32.C23323b;
import l72.AbstractC23397d;
import l72.AbstractC23398e;
import l72.AbstractC23402i;
import l80.AbstractC23437n;
import l83.C23454a0;
import lc0.AbstractC23828j;
import ld0.C23842a;
import ld0.C23850i;
import ld0.C23860s;
import ld1.AbstractC23864c;
import lf0.AbstractC23901b2;
import lf0.AbstractC23904c1;
import lf0.AbstractC23925h2;
import lf0.AbstractC23927i0;
import lf0.AbstractC23961q2;
import lf0.C23894a;
import lf0.C23908d1;
import lf0.C23923h0;
import lf0.C23965r2;
import lg2.AbstractC24038c;
import lg2.C24037b;
import live.hms.video.factories.noisecancellation.NoiseCancellationStatusChecker;
import live.hms.video.plugin.video.HMSVideoPlugin;
import live.hms.video.plugin.video.HMSVideoPluginsManager;
import live.hms.video.sdk.SignatureChecker;
import live.hms.video.transport.HMSTransport;
import live.hms.video.utils.HMSAgentOs;
import lm1.AbstractC24513c;
import lm1.C24514d;
import lq0.C24656d;
import mc.AbstractC25412i;
import mc.C25410g;
import mf0.AbstractC25506e;
import mh0.AbstractC25557i;
import mh0.C25556h;
import mi2.AbstractC25580c;
import p218ic.C18389w;
import p292l1.C23123k2;
import p292l1.C23196w3;
import p292l1.C23203x4;
import p292l1.EnumC23202x3;
import p316m1.C24908j;
import p390p1.InterfaceC28601c1;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p718lz1.Function0;
import p719m22.AbstractC24949d;
import qt0.C30586b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: l01.q */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C23045q implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90888w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f90889x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f90890y;

    public /* synthetic */ C23045q(int i13, Object obj, Object obj2) {
        this.f90888w = i13;
        this.f90889x = obj;
        this.f90890y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f90888w) {
            case 0:
                return AbstractC23046r.m66967l((C23047s) this.f90889x, (Function1) this.f90890y);
            case 1:
                C23196w3 c23196w3 = (C23196w3) this.f90889x;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f90890y;
                if (((Boolean) c23196w3.f91787e.f97544d.invoke(EnumC23202x3.f91822y)).booleanValue()) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C23123k2(c23196w3, null, 7), 3);
                }
                return Boolean.TRUE;
            case 2:
                return AbstractC23324c.m67533h((C21295j) this.f90889x, (C23323b) this.f90890y);
            case 3:
                return AbstractC23397d.m67751l((C21397b) this.f90889x, (Function1) this.f90890y);
            case 4:
                return AbstractC23398e.m67758f((Function1) this.f90890y, (C21398c) this.f90889x);
            case 5:
                return AbstractC23402i.m67769J((C39967p) this.f90889x, (C21399d) this.f90890y);
            case 6:
                return AbstractC23437n.m67952f0((Function1) this.f90890y, (C14201q0) this.f90889x);
            case 7:
                return AbstractC23828j.m70012v((C21604d.c.a) this.f90889x, (Function1) this.f90890y);
            case 8:
                return AbstractC23828j.m70014x((C21604d.d) this.f90889x, (InterfaceC28601c1) this.f90890y);
            case 9:
                return C23894a.m70177d((Function1) this.f90890y, (C23842a) this.f90889x);
            case 10:
                return AbstractC23927i0.m70416t((C23923h0) this.f90889x, (Function1) this.f90890y);
            case 11:
                return AbstractC23904c1.m70267d((Function1) this.f90890y, (C23908d1) this.f90889x);
            case 12:
                return AbstractC23901b2.m70256o((Function1) this.f90890y, (C23850i) this.f90889x);
            case 13:
                return AbstractC23925h2.m70394f((C23860s) this.f90889x, (Function1) this.f90890y);
            case 14:
                return AbstractC23961q2.m70614f((Function1) this.f90890y, (C23965r2) this.f90889x);
            case 15:
                return AbstractC24038c.m70927n((Function1) this.f90890y, (C24037b) this.f90889x);
            case 16:
                return OnboardingStoriesDebugFragment.m26129R((OnboardingStoriesDebugFragment) this.f90889x, (InterfaceC28601c1) this.f90890y);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return OnboardingStoriesDebugFragment.C10255a.m26134e((Function1) this.f90890y, (OnboardingStoriesDebugFragment.C10256b) this.f90889x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(NoiseCancellationStatusChecker.libraryPresent_delegate$lambda$0((Context) this.f90889x, (NoiseCancellationStatusChecker) this.f90890y));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return HMSVideoPluginsManager.processFramesThroughPlugins$lambda$0((HMSVideoPlugin) this.f90889x, (VideoFrame) this.f90890y);
            case 20:
                return HMSTransport.hmsPeerConnectionFactory_delegate$lambda$0((Context) this.f90889x, (HMSTransport) this.f90890y);
            case 21:
                return HMSAgentOs.userAgentV2_delegate$lambda$2((SignatureChecker) this.f90889x, (HMSAgentOs) this.f90890y);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC24513c.m71391n((Function1) this.f90890y, (C24514d) this.f90889x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Function0.m72765y((Function1) this.f90890y, (C22075c.a) this.f90889x);
            case 24:
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f90889x, null, null, new C24908j((C23203x4) this.f90890y, null, 0), 3);
                return Boolean.TRUE;
            case 25:
                return AbstractC24949d.m73130s((Function1) this.f90890y, (C30586b) this.f90889x);
            case 26:
                C24656d c24656d = (C24656d) this.f90889x;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f90890y;
                synchronized (C25410g.f99510b) {
                    LinkedHashMap linkedHashMap = C25410g.f99511c;
                    linkedHashMap.remove(c24656d);
                    if (linkedHashMap.isEmpty()) {
                        C18389w.m52886d().m52888a(AbstractC25412i.f99516a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(C25410g.f99509a);
                        C25410g.f99514f = false;
                        C25410g.f99512d = null;
                        C25410g.f99513e = false;
                    }
                    break;
                }
                return C23454a0.f92919a;
            case 27:
                return Boolean.valueOf(AbstractC25506e.m74924O((InterfaceC41070a) this.f90889x, (InterfaceC28601c1) this.f90890y));
            case 28:
                return AbstractC25557i.m75155e((AbstractC23864c) this.f90889x, (C25556h) this.f90890y);
            default:
                return AbstractC25580c.m75225n((Function1) this.f90890y, (C21724c) this.f90889x);
        }
    }

    public /* synthetic */ C23045q(Function1 function1, Object obj, int i13) {
        this.f90888w = i13;
        this.f90890y = function1;
        this.f90889x = obj;
    }
}
