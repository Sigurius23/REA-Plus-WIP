package um0;

import java.util.Arrays;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: um0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lum0/c;", "", "", "uri", "", "data", "", "lastUpdated", "<init>", "(Ljava/lang/String;[BJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "[B", "()[B", "J", "()J", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35077c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte[] data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long lastUpdated;

    public C35077c(String uri, byte[] data, long j7) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(data, "data");
        this.uri = uri;
        this.data = data;
        this.lastUpdated = j7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35077c)) {
            return false;
        }
        C35077c c35077c = (C35077c) other;
        return AbstractC22676k.m65745e(this.uri, c35077c.uri) && this.lastUpdated == c35077c.lastUpdated && Arrays.equals(this.data, c35077c.data);
    }

    public int hashCode() {
        return Long.hashCode(this.lastUpdated) + ((Arrays.hashCode(this.data) + (this.uri.hashCode() * 31)) * 31);
    }

    public String toString() {
        return AbstractC11266d.m30457k(this.lastUpdated, ")", AbstractC11895b.m32001t("CacheEntryEntity(uri=", this.uri, ", data=", Arrays.toString(this.data), ", lastUpdated="));
    }
}
