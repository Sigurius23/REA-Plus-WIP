package l52;

import com.mapbox.common.MapboxOptions;
import com.whoop.data.repositories.MapboxApiToken;
import j93.InterfaceC21461d;
import js0.AbstractC21909c;
import js0.C21908b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: l52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Ll52/a;", "", "Ljs0/c;", "configurationRepository", "<init>", "(Ljs0/c;)V", "", "b", "()Z", "a", "Ljs0/c;", "Z", "initialized", "", "()Ljava/lang/String;", "apiToken", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23359a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean initialized;

    public C23359a(AbstractC21909c configurationRepository) {
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        this.configurationRepository = configurationRepository;
    }

    /* JADX INFO: renamed from: a */
    private final String m67650a() {
        AbstractC21909c abstractC21909c = this.configurationRepository;
        MapboxApiToken mapboxApiToken = MapboxApiToken.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = mapboxApiToken.getName();
        Object defaultValue = mapboxApiToken.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
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
            return (String) defaultValue;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m67651b() {
        if (m67650a().length() > 0 && !this.initialized) {
            MapboxOptions.setAccessToken(m67650a());
            this.initialized = true;
        }
        return this.initialized;
    }
}
