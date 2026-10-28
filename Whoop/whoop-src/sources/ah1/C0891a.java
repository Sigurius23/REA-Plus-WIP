package ah1;

import com.whoop.firmwarefeatureflag.workManager.PeriodicFirmwareFeatureFlagUpdateWorker;
import io.getstream.chat.android.client.ChatClient;
import j93.InterfaceC21461d;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import js0.AbstractC21909c;
import js0.C21908b;
import m83.AbstractC25265s;
import p218ic.AbstractC18377p0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ah1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lah1/a;", "", "Ljs0/c;", "configurationRepository", "Lic/p0;", "workManager", "Ltr2/n;", "logger", "<init>", "(Ljs0/c;Lic/p0;Ltr2/n;)V", "", "b", "()J", "Ll83/a0;", "a", "()V", "Ljs0/c;", "Lic/p0;", "c", "Ltr2/n;", "d", "firmware-feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0891a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C0891a(AbstractC21909c configurationRepository, AbstractC18377p0 workManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.configurationRepository = configurationRepository;
        this.workManager = workManager;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final long m2185b() {
        AbstractC21909c abstractC21909c = this.configurationRepository;
        Companion.C41274a c41274a = Companion.C41274a.f3273a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c41274a.getName();
        Object defaultValue = c41274a.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue != null) {
            return ((Long) defaultValue).longValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    /* JADX INFO: renamed from: a */
    public final void m2186a() {
        C18354e c18354e = new C18354e(new C31222e(null), EnumC18390x.f71560w, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(new LinkedHashSet()));
        long jM2185b = m2185b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.workManager.mo52875d("PeriodicFirmwareFeatureFlagUpdateWorker", EnumC18366k.f71499w, (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(PeriodicFirmwareFeatureFlagUpdateWorker.class, jM2185b, timeUnit).m52880f(c18354e)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b());
    }
}
