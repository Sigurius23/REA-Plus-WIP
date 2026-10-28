package s03;

import android.annotation.SuppressLint;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import com.whoop.workmanager.logserviceworkmanager.LogUploadWorker;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.AbstractC25265s;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18358g;
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
import pf.AbstractC29125c;
import q83.InterfaceC30063j;
import vf3.C35953c;

/* JADX INFO: renamed from: s03.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Ls03/a;", "Lof3/a;", "Lbc3/c0;", "<init>", "()V", "Lic/e;", "a", "()Lic/e;", "Lic/k0;", "d", "()Lic/k0;", "Lic/a0;", "c", "()Lic/a0;", "Lic/g;", "b", "()Lic/g;", "Ll83/a0;", "f", "e", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "tag", "Ljava/util/UUID;", "x", "Ljava/util/UUID;", "periodicWorkId", "Lic/p0;", "y", "Lic/p0;", "workManagerInstance", "Lbc3/u;", "z", "Lbc3/u;", "job", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@SuppressLint({"LogNotTimber"})
public final class C32052a implements InterfaceC27903a, InterfaceC2994c0 {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private UUID periodicWorkId;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String tag = "LogEventUploadScheduler";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC18377p0 workManagerInstance = (AbstractC18377p0) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance"));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC3061u job = AbstractC3006f0.m8710d();

    /* JADX INFO: renamed from: a */
    private final C18354e m99623a() {
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
    }

    /* JADX INFO: renamed from: b */
    private final C18358g m99624b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("FORCE_UPLOAD_ALL_LOGS", Boolean.TRUE);
        C18358g c18358g = new C18358g(linkedHashMap);
        AbstractC29125c.m88515X(c18358g);
        return c18358g;
    }

    /* JADX INFO: renamed from: c */
    private final C18347a0 m99625c() {
        return (C18347a0) ((C18392z) ((C18392z) ((C18392z) new C18392z(LogUploadWorker.class).m52882h(m99624b())).m52880f(m99623a())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
    }

    /* JADX INFO: renamed from: d */
    private final C18367k0 m99626d() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(LogUploadWorker.class, 900000L, timeUnit).m52880f(m99623a())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
    }

    /* JADX INFO: renamed from: e */
    public final void m99627e() {
        this.workManagerInstance.m52876e("ONE_TIME_CONNECTED_UPLOAD_LOGS", EnumC18368l.f71505y, m99625c());
        Log.d(this.tag, "Enqueued one time work request");
    }

    /* JADX INFO: renamed from: f */
    public final void m99628f() {
        C18367k0 c18367k0M99626d = m99626d();
        this.periodicWorkId = c18367k0M99626d.f71547a;
        this.workManagerInstance.mo52875d("PERIODIC_CONNECTED_UPLOAD_LOGS", EnumC18366k.f71499w, c18367k0M99626d);
        Log.d(this.tag, "Enqueued periodic work of uploading logs over wifi or cellular");
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return ExecutorC22364d.f87316w.plus(this.job);
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
