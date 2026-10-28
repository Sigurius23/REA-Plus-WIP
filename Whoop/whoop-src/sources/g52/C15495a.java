package g52;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.puffin.workManager.PuffinScanWorker;
import io.getstream.chat.android.client.ChatClient;
import j93.InterfaceC21461d;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import js0.AbstractC21909c;
import js0.C21908b;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18358g;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18368l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;
import us0.InterfaceC35208d;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: g52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lg52/a;", "", "Ljs0/c;", "configurationRepository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lic/p0;", "workManager", "Ltr2/n;", "logger", "<init>", "(Ljs0/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lic/p0;Ltr2/n;)V", "", "b", "()J", "Ll83/a0;", "a", "()V", "Lkotlin/time/Duration;", "initialDelay", "c", "(J)V", "Ljs0/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lic/p0;", "d", "Ltr2/n;", "e", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15495a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C15495a(AbstractC21909c configurationRepository, FeatureFlagChecker featureFlagChecker, AbstractC18377p0 workManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.configurationRepository = configurationRepository;
        this.featureFlagChecker = featureFlagChecker;
        this.workManager = workManager;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final long m43705b() {
        AbstractC21909c abstractC21909c = this.configurationRepository;
        Companion.C41623a c41623a = Companion.C41623a.f58160a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = c41623a.getName();
        Object defaultValue = c41623a.getDefaultValue();
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
    public final void m43706a() {
        this.logger.mo85216g("Enqueuing periodic Puffin!", new AbstractC30556a.a[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key_source", InterfaceC35208d.c.PERIODIC_SCAN.getValue());
        C18358g c18358g = new C18358g(linkedHashMap);
        AbstractC29125c.m88515X(c18358g);
        long jM43705b = m43705b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.workManager.mo52875d("PeriodicPuffinScanWorker", EnumC18366k.f71500x, (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(PuffinScanWorker.class, jM43705b, timeUnit).m52882h(c18358g)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b());
        this.logger.mo85216g(AbstractC31061c.m95636l(m43705b(), "Enqueuing periodic Puffin scan work with cadence: ", " ms"), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m43707c(long initialDelay) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key_source", InterfaceC35208d.c.DISCONNECT_RETRY.getValue());
        C18358g c18358g = new C18358g(linkedHashMap);
        AbstractC29125c.m88515X(c18358g);
        C18392z c18392z = new C18392z(PuffinScanWorker.class);
        Duration durationOfSeconds = Duration.ofSeconds(p715kotlin.time.Duration.m134276getInWholeSecondsimpl(initialDelay), p715kotlin.time.Duration.m134278getNanosecondsComponentimpl(initialDelay));
        AbstractC22676k.m65749i(durationOfSeconds, "toComponents-impl(...)");
        c18392z.f71544c.f123640g = durationOfSeconds.toMillis();
        if (Long.MAX_VALUE - System.currentTimeMillis() <= c18392z.f71544c.f123640g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
        this.workManager.m52876e("OneTimePuffinScanWorker", EnumC18368l.f71504x, (C18347a0) ((C18392z) ((C18392z) c18392z.m52882h(c18358g)).m52877a("OneTimePuffinScanWorker")).m52878b());
        this.logger.mo85216g("Enqueuing one-time Puffin scan work", new AbstractC30556a.a[0]);
    }
}
