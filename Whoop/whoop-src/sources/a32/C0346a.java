package a32;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import fi0.InterfaceC14515a;
import java.util.Map;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a32.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"La32/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", HMSTrackSource.SCREEN, "Ll83/a0;", "f", "(Ljava/lang/String;)V", "", "properties", "c", "(Ljava/util/Map;)V", "a", "()V", "e", "d", "b", "Lfi0/a;", "Lec3/p1;", "Lec3/p1;", "_analyticsContext", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0346a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 _analyticsContext;

    public C0346a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
        this._analyticsContext = AbstractC13091v.m36593c(C25272z.f99163w);
    }

    /* JADX INFO: renamed from: a */
    public final void m888a() {
        AbstractC0347b.m895b(this.analytics, (Map) ((C13045h2) this._analyticsContext).getValue());
    }

    /* JADX INFO: renamed from: b */
    public final void m889b() {
        AbstractC0347b.m896c(this.analytics);
    }

    /* JADX INFO: renamed from: c */
    public final void m890c(Map<String, String> properties) {
        C13045h2 c13045h2;
        Object value;
        AbstractC22676k.m65750j(properties, "properties");
        InterfaceC13075p1 interfaceC13075p1 = this._analyticsContext;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, properties));
        AbstractC0347b.m897d(this.analytics, (Map) ((C13045h2) this._analyticsContext).getValue());
    }

    /* JADX INFO: renamed from: d */
    public final void m891d() {
        AbstractC0347b.m898e(this.analytics, (Map) ((C13045h2) this._analyticsContext).getValue());
    }

    /* JADX INFO: renamed from: e */
    public final void m892e() {
        AbstractC0347b.m899f(this.analytics, (Map) ((C13045h2) this._analyticsContext).getValue());
    }

    /* JADX INFO: renamed from: f */
    public final void m893f(String screen) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC0347b.m900g(this.analytics, screen);
    }
}
