package dy1;

import com.whoop.data.repositories.MemfaultApiToken;
import j93.InterfaceC21461d;
import js0.AbstractC21909c;
import js0.C21908b;
import p087db.C11856j0;
import p100dw.C12400e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: dy1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Ldy1/b;", "", "Ljs0/c;", "configurationRepository", "<init>", "(Ljs0/c;)V", "Ldw/e;", "a", "()Ldw/e;", "Ljs0/c;", "Ltr2/n;", "b", "Ltr2/n;", "logger", "c", "Ldw/e;", "memfaultCloud", "memfault_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12446b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C12400e memfaultCloud;

    public C12446b(AbstractC21909c configurationRepository) {
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        this.configurationRepository = configurationRepository;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("MemfaultInitializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX INFO: renamed from: a */
    public final C12400e m35022a() {
        Object objM125868N0;
        AbstractC21909c abstractC21909c = this.configurationRepository;
        MemfaultApiToken memfaultApiToken = MemfaultApiToken.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = memfaultApiToken.getName();
        Object defaultValue = memfaultApiToken.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        C12400e c12400eM31822f = null;
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
        if (str6.length() > 0) {
            C11856j0 c11856j0 = new C11856j0(1);
            c11856j0.m31828n(str6);
            c12400eM31822f = c11856j0.m31822f();
        } else {
            this.logger.mo85226q("Memfault API Token was empty, returning null for memfault cloud.", new AbstractC30556a.a[0]);
        }
        this.memfaultCloud = c12400eM31822f;
        return c12400eM31822f;
    }
}
