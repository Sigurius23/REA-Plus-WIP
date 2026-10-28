package s23;

import io.getstream.chat.android.models.Attachment;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s23.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C32093f {

    /* JADX INFO: renamed from: a */
    public final int f133095a;

    /* JADX INFO: renamed from: b */
    public final Attachment f133096b;

    public C32093f(int i13, Attachment attachment) {
        this.f133095a = i13;
        this.f133096b = attachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32093f)) {
            return false;
        }
        C32093f c32093f = (C32093f) obj;
        return this.f133095a == c32093f.f133095a && AbstractC22676k.m65745e(this.f133096b, c32093f.f133096b);
    }

    public final int hashCode() {
        return this.f133096b.hashCode() + (Integer.hashCode(this.f133095a) * 31);
    }

    public final String toString() {
        return "RecordedMedia(durationInMs=" + this.f133095a + ", attachment=" + this.f133096b + ")";
    }
}
