package r03;

import com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploadWorker;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import vf3.C35953c;

/* JADX INFO: renamed from: r03.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lr03/a;", "Lof3/a;", "<init>", "()V", "Lic/a0;", "a", "()Lic/a0;", "Lic/e;", "b", "()Lic/e;", "Lic/k0;", "c", "()Lic/k0;", "Ll83/a0;", "d", "e", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "log", "Lic/p0;", "x", "Lic/p0;", "workManagerInstance", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30844a implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n log = InterfaceC34116n.INSTANCE.m107848a("ConsolePacketUploadScheduler");

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final AbstractC18377p0 workManagerInstance = (AbstractC18377p0) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance"));

    /* JADX INFO: renamed from: a */
    private final C18347a0 m94864a() {
        return (C18347a0) ((C18392z) ((C18392z) new C18392z(ConsolePacketUploadWorker.class).m52880f(m94865b())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
    }

    /* JADX INFO: renamed from: b */
    private final C18354e m94865b() {
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
    }

    /* JADX INFO: renamed from: c */
    private final C18367k0 m94866c() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(ConsolePacketUploadWorker.class, 900000L, timeUnit).m52880f(m94865b())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
    }

    /* JADX INFO: renamed from: d */
    public final void m94867d() {
        this.workManagerInstance.m52876e("ONE_TIME_CONSOLE_PACKET_UPLOAD", EnumC18368l.f71505y, m94864a());
        this.log.mo85228t("Enqueued one time work request", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: e */
    public final void m94868e() {
        this.workManagerInstance.mo52875d("PERIODIC_CONSOLE_PACKET_UPLOAD", EnumC18366k.f71499w, m94866c());
        this.log.mo85228t("Enqueued PeriodicWorkRequest to upload console event packets from strap", new AbstractC30556a.a[0]);
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
