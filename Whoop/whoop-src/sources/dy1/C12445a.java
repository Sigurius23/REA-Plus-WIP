package dy1;

import com.whoop.data.repositories.MemfaultBatteryPackApiToken;
import j93.InterfaceC21461d;
import js0.AbstractC21909c;
import js0.C21908b;
import p087db.C11856j0;
import p100dw.C12400e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: dy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ldy1/a;", "", "Ljs0/c;", "configurationRepository", "Ltr2/n;", "logger", "<init>", "(Ljs0/c;Ltr2/n;)V", "Ldw/e;", "a", "()Ldw/e;", "Ljs0/c;", "b", "Ltr2/n;", "memfault_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12445a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C12445a(AbstractC21909c configurationRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.configurationRepository = configurationRepository;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX INFO: renamed from: a */
    public final C12400e m35021a() {
        Object objM125868N0;
        AbstractC21909c abstractC21909c = this.configurationRepository;
        MemfaultBatteryPackApiToken memfaultBatteryPackApiToken = MemfaultBatteryPackApiToken.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = memfaultBatteryPackApiToken.getName();
        Object defaultValue = memfaultBatteryPackApiToken.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
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
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str6 = (String) defaultValue;
        if (str6.length() <= 0) {
            this.logger.mo85226q("Memfault API Token for battery pack was empty, returning null for memfault cloud.", new AbstractC30556a.a[0]);
            return null;
        }
        C11856j0 c11856j0 = new C11856j0(1);
        c11856j0.m31828n(str6);
        return c11856j0.m31822f();
    }

    public /* synthetic */ C12445a(AbstractC21909c abstractC21909c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC21909c, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PuffinMemfaultInitializer") : interfaceC34116n);
    }
}
