package p173gj;

import p255jk.C21743a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gj.i */
/* JADX INFO: loaded from: classes.dex */
public final class C15908i {

    /* JADX INFO: renamed from: a */
    public final C21743a f60176a;

    public C15908i(C21743a event) {
        AbstractC22676k.m65750j(event, "event");
        this.f60176a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15908i) && AbstractC22676k.m65745e(this.f60176a, ((C15908i) obj).f60176a);
    }

    public final int hashCode() {
        return this.f60176a.hashCode();
    }

    public final String toString() {
        return "EventQueueMessage(event=" + this.f60176a + ')';
    }
}
