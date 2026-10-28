package gj0;

import c93.InterfaceC4339a;
import g40.C15449y1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25265s;
import p368og.EnumC27905b;
import p550vd.AbstractC35902e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: gj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lgj0/a;", "Lvd/e;", "Ltr2/n;", "logger", "Log/b;", "level", "<init>", "(Ltr2/n;Log/b;)V", "", "ex", "Ll83/a0;", "a", "(Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "", "Laws/smithy/kotlin/runtime/telemetry/logging/MessageSupplier;", "message", "r", "(Lc93/a;)V", "key", "", "value", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "e", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Log/b;", "y", "Ljava/lang/Throwable;", "cause", "z", "Ljava/lang/String;", "E", "Lc93/a;", "messageSupplier", "", "F", "Ljava/util/Map;", "values", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15914a extends AbstractC35902e {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private InterfaceC4339a messageSupplier;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Map<String, Object> values;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final EnumC27905b level;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private Throwable cause;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private String message;

    public C15914a(InterfaceC34116n logger, EnumC27905b level) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(level, "level");
        this.logger = logger;
        this.level = level;
        this.values = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final CharSequence m44897p0(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    @Override // p550vd.AbstractC35902e, p368og.InterfaceC27908e
    /* JADX INFO: renamed from: a */
    public void mo7486a(Throwable ex3) {
        AbstractC22676k.m65750j(ex3, "ex");
        this.cause = ex3;
    }

    @Override // p550vd.AbstractC35902e, p368og.InterfaceC27908e
    /* JADX INFO: renamed from: c */
    public void mo7487c(String key, Object value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.values.put(key, value);
    }

    @Override // p550vd.AbstractC35902e, p368og.InterfaceC27908e
    /* JADX INFO: renamed from: e */
    public void mo7488e() {
        String strM74110N0 = AbstractC25265s.m74110N0(this.values.entrySet(), null, null, null, new C15449y1(28), 31);
        StringBuilder sb4 = new StringBuilder();
        String str = this.message;
        if (str == null) {
            InterfaceC4339a interfaceC4339a = this.messageSupplier;
            str = interfaceC4339a != null ? (String) interfaceC4339a.invoke() : null;
        }
        sb4.append(str);
        if (strM74110N0.length() > 0) {
            sb4.append(" values: ".concat(strM74110N0));
        }
        String string = sb4.toString();
        int iOrdinal = this.level.ordinal();
        if (iOrdinal == 0) {
            Throwable th3 = this.cause;
            if (th3 != null) {
                this.logger.mo85230v(string, th3, new AbstractC30556a.a[0]);
                return;
            } else {
                this.logger.mo85222m(string, new AbstractC30556a.a[0]);
                return;
            }
        }
        if (iOrdinal == 1) {
            Throwable th4 = this.cause;
            if (th4 != null) {
                this.logger.mo85213c(string, th4, new AbstractC30556a.a[0]);
                return;
            } else {
                this.logger.mo85226q(string, new AbstractC30556a.a[0]);
                return;
            }
        }
        if (iOrdinal == 2) {
            Throwable th5 = this.cause;
            if (th5 != null) {
                this.logger.mo85211a(string, th5, new AbstractC30556a.a[0]);
                return;
            } else {
                this.logger.mo85216g(string, new AbstractC30556a.a[0]);
                return;
            }
        }
        if (iOrdinal == 3) {
            Throwable th6 = this.cause;
            if (th6 != null) {
                this.logger.mo85218i(string, th6, new AbstractC30556a.a[0]);
                return;
            } else {
                this.logger.mo85228t(string, new AbstractC30556a.a[0]);
                return;
            }
        }
        if (iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable th7 = this.cause;
        if (th7 != null) {
            this.logger.mo85227s(string, th7, new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85219j(string, new AbstractC30556a.a[0]);
        }
    }

    @Override // p550vd.AbstractC35902e, p368og.InterfaceC27908e
    /* JADX INFO: renamed from: r */
    public void mo7492r(InterfaceC4339a message) {
        AbstractC22676k.m65750j(message, "message");
        this.messageSupplier = message;
    }
}
