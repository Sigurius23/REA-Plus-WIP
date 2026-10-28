package x43;

import io.getstream.android.video.generated.models.VideoEvent;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x43.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C37983o extends AbstractC37984p {

    /* JADX INFO: renamed from: a */
    public final VideoEvent f162642a;

    public C37983o(VideoEvent videoEvent) {
        AbstractC22676k.m65750j(videoEvent, "videoEvent");
        this.f162642a = videoEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37983o) && AbstractC22676k.m65745e(this.f162642a, ((C37983o) obj).f162642a);
    }

    public final int hashCode() {
        return this.f162642a.hashCode();
    }

    public final String toString() {
        return "VideoMessage(videoEvent=" + this.f162642a + ")";
    }
}
