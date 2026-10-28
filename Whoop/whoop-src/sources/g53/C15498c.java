package g53;

import io.getstream.android.video.generated.models.ConnectedEvent;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g53.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15498c extends AbstractC15508m {

    /* JADX INFO: renamed from: a */
    public final ConnectedEvent f58168a;

    public C15498c(ConnectedEvent event) {
        AbstractC22676k.m65750j(event, "event");
        this.f58168a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15498c) && AbstractC22676k.m65745e(this.f58168a, ((C15498c) obj).f58168a);
    }

    public final int hashCode() {
        return this.f58168a.hashCode();
    }

    public final String toString() {
        return "Connected(event=" + this.f58168a + ")";
    }
}
