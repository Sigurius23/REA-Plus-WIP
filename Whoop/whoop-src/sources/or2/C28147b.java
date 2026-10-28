package or2;

import com.whoop.data.repositories.DefaultApiRateLimitRemaining;
import com.whoop.data.repositories.DefaultApiRateLimitWaitSeconds;
import j93.InterfaceC21461d;
import java.util.concurrent.atomic.AtomicInteger;
import js0.AbstractC21909c;
import js0.C21908b;
import live.hms.video.error.ErrorCodes;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import xf3.C38266c;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import z82.C40191e;

/* JADX INFO: renamed from: or2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, m65681d2 = {"Lor2/b;", "Lof3/a;", "<init>", "()V", "Ll83/a0;", "d", "c", "Ltr2/n;", "x", "Ltr2/n;", "logger", "Ljava/util/concurrent/atomic/AtomicInteger;", "value", "y", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "()Ljava/util/concurrent/atomic/AtomicInteger;", "defaultRateLimitRemaining", "z", "b", "defaultRateLimitResetSeconds", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28147b implements InterfaceC27903a {

    /* JADX INFO: renamed from: w */
    public static final C28147b f113814w = new C28147b();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("ApiRateLimitingConfigUtil");

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static AtomicInteger defaultRateLimitRemaining = new AtomicInteger(ErrorCodes.InitAPIErrors.cServerErrors);

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static AtomicInteger defaultRateLimitResetSeconds = new AtomicInteger(300);

    private C28147b() {
    }

    /* JADX INFO: renamed from: a */
    public final AtomicInteger m85171a() {
        return defaultRateLimitRemaining;
    }

    /* JADX INFO: renamed from: b */
    public final AtomicInteger m85172b() {
        return defaultRateLimitResetSeconds;
    }

    /* JADX INFO: renamed from: c */
    public final void m85173c() {
        try {
            ((C40191e) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40191e.class), null)).m129003N();
        } catch (Exception e5) {
            logger.mo85230v("Caught an exception when trying to send event to segment", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0051  */
    /* JADX INFO: renamed from: d */
    public final void m85174d() {
        Object objM125868N0;
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM125868N1 = null;
        AbstractC21909c abstractC21909c = (AbstractC21909c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        AtomicInteger atomicInteger = defaultRateLimitRemaining;
        DefaultApiRateLimitRemaining defaultApiRateLimitRemaining = DefaultApiRateLimitRemaining.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = defaultApiRateLimitRemaining.getName();
        Object defaultValue = defaultApiRateLimitRemaining.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Class cls = Integer.TYPE;
        boolean zM65745e = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        if (zM65745e) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            } else {
                objM125868N0 = null;
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        atomicInteger.set(((Integer) defaultValue).intValue());
        AtomicInteger atomicInteger2 = defaultRateLimitResetSeconds;
        DefaultApiRateLimitWaitSeconds defaultApiRateLimitWaitSeconds = DefaultApiRateLimitWaitSeconds.INSTANCE;
        C21908b configurations2 = abstractC21909c.getConfigurations();
        String name2 = defaultApiRateLimitWaitSeconds.getName();
        Object defaultValue2 = defaultApiRateLimitWaitSeconds.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls))) {
            String str6 = (String) configurations2.get(name2);
            if (str6 != null) {
                objM125868N1 = AbstractC39421y.m125932Q(str6);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str7 = (String) configurations2.get(name2);
            if (str7 != null) {
                objM125868N1 = AbstractC39421y.m125933R(str7);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str8 = (String) configurations2.get(name2);
            if (str8 != null) {
                objM125868N1 = AbstractC39420x.m125915y(str8);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str9 = (String) configurations2.get(name2);
            if (str9 != null) {
                objM125868N1 = AbstractC39420x.m125914x(str9);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str10 = (String) configurations2.get(name2);
            if (str10 != null) {
                objM125868N1 = AbstractC39414r.m125868N0(str10);
            }
        } else {
            objM125868N1 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
        }
        if (objM125868N1 != null) {
            defaultValue2 = objM125868N1;
        }
        if (defaultValue2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        atomicInteger2.set(((Integer) defaultValue2).intValue());
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
