package v33;

import io.getstream.android.video.generated.models.VideoEvent;
import p715kotlin.jvm.internal.AbstractC22671h0;

/* JADX INFO: renamed from: v33.w */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC35638w extends VideoEvent {
    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "UnknownEvent" : simpleName;
    }
}
