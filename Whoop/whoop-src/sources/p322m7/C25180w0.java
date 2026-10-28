package p322m7;

import java.time.Instant;
import jh3.AbstractC21702c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C25180w0 {

    /* JADX INFO: renamed from: a */
    public final Instant f98792a;

    /* JADX INFO: renamed from: b */
    public final Instant f98793b;

    /* JADX INFO: renamed from: c */
    public final int f98794c;

    public C25180w0(Instant instant, Instant instant2, int i13) {
        this.f98792a = instant;
        this.f98793b = instant2;
        this.f98794c = i13;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final Instant m73704a() {
        return this.f98793b;
    }

    /* JADX INFO: renamed from: b */
    public final Instant m73705b() {
        return this.f98792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25180w0)) {
            return false;
        }
        C25180w0 c25180w0 = (C25180w0) obj;
        return this.f98794c == c25180w0.f98794c && AbstractC22676k.m65745e(this.f98792a, c25180w0.f98792a) && AbstractC22676k.m65745e(this.f98793b, c25180w0.f98793b);
    }

    public final int hashCode() {
        return this.f98793b.hashCode() + AbstractC21702c.m61131b(this.f98792a, Integer.hashCode(this.f98794c) * 31, 31);
    }
}
