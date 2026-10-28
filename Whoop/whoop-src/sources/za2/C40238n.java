package za2;

import androidx.core.app.NotificationCompat;
import j02.InterfaceC21159o0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: za2.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lza2/n;", "", "Lj02/o0;", "navigator", "<init>", "(Lj02/o0;)V", "Lza2/m;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lza2/m;)V", "Lj02/o0;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40238n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C40238n(InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m129228a(AbstractC40237m event) {
        AbstractC22676k.m65750j(event, "event");
        this.navigator.mo59392a(event.getAction());
    }
}
