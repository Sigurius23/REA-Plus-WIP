package p047c9;

import android.media.metrics.LogSessionId;
import java.util.Objects;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: c9.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C4323n {

    /* JADX INFO: renamed from: a */
    public final String f17573a;

    /* JADX INFO: renamed from: b */
    public final C4322m f17574b;

    /* JADX INFO: renamed from: c */
    public final Object f17575c;

    static {
        new C4323n("");
    }

    public C4323n(String str) {
        this.f17573a = str;
        this.f17574b = AbstractC38065t.f163031a >= 31 ? new C4322m() : null;
        this.f17575c = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized LogSessionId m13633a() {
        C4322m c4322m;
        c4322m = this.f17574b;
        c4322m.getClass();
        return (LogSessionId) c4322m.f17572b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4323n)) {
            return false;
        }
        C4323n c4323n = (C4323n) obj;
        return Objects.equals(this.f17573a, c4323n.f17573a) && Objects.equals(this.f17574b, c4323n.f17574b) && Objects.equals(this.f17575c, c4323n.f17575c);
    }

    public final int hashCode() {
        return Objects.hash(this.f17573a, this.f17574b, this.f17575c);
    }
}
