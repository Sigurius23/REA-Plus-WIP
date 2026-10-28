package gj0;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p368og.EnumC27905b;
import p368og.InterfaceC27910g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: gj0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0013J+\u0010\u0018\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lgj0/b;", "Log/g;", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "Log/b;", "level", "Lgj0/a;", "a", "(Log/b;)Lgj0/a;", "", "t", "Lkotlin/Function0;", "", "Laws/smithy/kotlin/runtime/telemetry/logging/MessageSupplier;", NotificationCompat.CATEGORY_MESSAGE, "Ll83/a0;", "u", "(Ljava/lang/Throwable;Lc93/a;)V", "", "j", "(Log/b;)Z", "s", "n", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15915b implements InterfaceC27910g {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C15915b(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C15914a mo44899g(EnumC27905b level) {
        AbstractC22676k.m65750j(level, "level");
        return new C15914a(this.logger, level);
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: j */
    public boolean mo389j(EnumC27905b level) {
        AbstractC22676k.m65750j(level, "level");
        return true;
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: n */
    public void mo390n(Throwable t14, InterfaceC4339a msg) {
        AbstractC22676k.m65750j(msg, "msg");
        if (t14 != null) {
            this.logger.mo85213c((String) msg.invoke(), t14, new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85226q((String) msg.invoke(), new AbstractC30556a.a[0]);
        }
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: s */
    public void mo394s(Throwable t14, InterfaceC4339a msg) {
        AbstractC22676k.m65750j(msg, "msg");
        if (t14 != null) {
            this.logger.mo85227s((String) msg.invoke(), t14, new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85219j((String) msg.invoke(), new AbstractC30556a.a[0]);
        }
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: u */
    public void mo396u(Throwable t14, InterfaceC4339a msg) {
        AbstractC22676k.m65750j(msg, "msg");
        if (t14 != null) {
            this.logger.mo85218i((String) msg.invoke(), t14, new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85228t((String) msg.invoke(), new AbstractC30556a.a[0]);
        }
    }
}
