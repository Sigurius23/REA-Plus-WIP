package p322m7;

import java.time.Instant;
import jh3.AbstractC21702c;
import p452r7.C31036s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C25165p {

    /* JADX INFO: renamed from: a */
    public final Instant f98738a;

    /* JADX INFO: renamed from: b */
    public final Instant f98739b;

    /* JADX INFO: renamed from: c */
    public final C31036s f98740c;

    public C25165p(Instant instant, Instant instant2, C31036s c31036s) {
        this.f98738a = instant;
        this.f98739b = instant2;
        this.f98740c = c31036s;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (c31036s != null) {
            double dM95562a = c31036s.m95562a();
            if (0.0d > dM95562a || dM95562a > 1000000.0d) {
                throw new IllegalArgumentException("length valid range: 0-1000000.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Instant m73697a() {
        return this.f98739b;
    }

    /* JADX INFO: renamed from: b */
    public final Instant m73698b() {
        return this.f98738a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25165p)) {
            return false;
        }
        C25165p c25165p = (C25165p) obj;
        return AbstractC22676k.m65745e(this.f98738a, c25165p.f98738a) && AbstractC22676k.m65745e(this.f98739b, c25165p.f98739b) && AbstractC22676k.m65745e(this.f98740c, c25165p.f98740c);
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f98739b, this.f98738a.hashCode() * 31, 31);
        C31036s c31036s = this.f98740c;
        return iM61131b + (c31036s != null ? c31036s.hashCode() : 0);
    }
}
