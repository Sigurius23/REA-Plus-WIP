package zf2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.models.ApiRequest;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zf2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lzf2/a;", "", "Lj02/o0;", "navigator", "<init>", "(Lj02/o0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Ljava/lang/Object;)V", "Lj02/o0;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40613a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C40613a(InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m131733a(Object event) {
        AbstractC22676k.m65750j(event, "event");
        ApiRequest apiRequest = event instanceof ApiRequest ? (ApiRequest) event : null;
        if (apiRequest != null) {
            this.navigator.mo59393b(new AbstractC21155m0.m1(apiRequest, null, null, null, null, null, null, null, null, null, 1022, null));
        }
    }
}
