package tr2;

import android.annotation.SuppressLint;
import androidx.core.app.NotificationCompat;
import com.whoop.domain.model.event.LoggableEvent;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tr2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Ltr2/a;", "Ltr2/k;", "Ltr2/e;", "logDistributor", "<init>", "(Ltr2/e;)V", "Lcom/whoop/domain/model/event/LoggableEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lcom/whoop/domain/model/event/LoggableEvent;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34103a implements InterfaceC34113k {
    public C34103a(C34107e logDistributor) {
        AbstractC22676k.m65750j(logDistributor, "logDistributor");
        logDistributor.m107806y(this);
    }

    @Override // tr2.InterfaceC34113k
    @SuppressLint({"LogNotTimber"})
    /* JADX INFO: renamed from: a */
    public void mo107800a(LoggableEvent event) {
        AbstractC22676k.m65750j(event, "event");
    }
}
