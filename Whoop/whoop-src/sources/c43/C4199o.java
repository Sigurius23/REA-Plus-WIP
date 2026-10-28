package c43;

import io.getstream.android.video.generated.models.ReactionResponse;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C4199o {

    /* JADX INFO: renamed from: a */
    public final String f17055a;

    /* JADX INFO: renamed from: b */
    public final ReactionResponse f17056b;

    /* JADX INFO: renamed from: c */
    public final long f17057c;

    public C4199o(String str, ReactionResponse response, long j7) {
        AbstractC22676k.m65750j(response, "response");
        this.f17055a = str;
        this.f17056b = response;
        this.f17057c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4199o)) {
            return false;
        }
        C4199o c4199o = (C4199o) obj;
        return this.f17055a.equals(c4199o.f17055a) && AbstractC22676k.m65745e(this.f17056b, c4199o.f17056b) && this.f17057c == c4199o.f17057c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC11266d.m30451e((this.f17056b.hashCode() + (this.f17055a.hashCode() * 31)) * 31, this.f17057c, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Reaction(id=");
        sb4.append(this.f17055a);
        sb4.append(", response=");
        sb4.append(this.f17056b);
        sb4.append(", createdAt=");
        return AbstractC11266d.m30457k(this.f17057c, ", isConsumed=false)", sb4);
    }
}
