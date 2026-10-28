package mm0;

import java.util.Set;
import ne3.C26624l;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mm0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, m65681d2 = {"Lmm0/b;", "", "", "uri", "Lne3/l;", "data", "", "lastUpdated", "", "scopes", "<init>", "(Ljava/lang/String;Lne3/l;JLjava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lne3/l;", "()Lne3/l;", "c", "J", "()J", "Ljava/util/Set;", "()Ljava/util/Set;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25683b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26624l data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long lastUpdated;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<String> scopes;

    public C25683b(String uri, C26624l data, long j7, Set<String> scopes) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(scopes, "scopes");
        this.uri = uri;
        this.data = data;
        this.lastUpdated = j7;
        this.scopes = scopes;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26624l getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: c */
    public final Set<String> m75629c() {
        return this.scopes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25683b)) {
            return false;
        }
        C25683b c25683b = (C25683b) other;
        return AbstractC22676k.m65745e(this.uri, c25683b.uri) && AbstractC22676k.m65745e(this.data, c25683b.data) && this.lastUpdated == c25683b.lastUpdated && AbstractC22676k.m65745e(this.scopes, c25683b.scopes);
    }

    public int hashCode() {
        return this.scopes.hashCode() + AbstractC11266d.m30451e((this.data.hashCode() + (this.uri.hashCode() * 31)) * 31, this.lastUpdated, 31);
    }

    public String toString() {
        return "CacheEntry(uri=" + this.uri + ", data=" + this.data + ", lastUpdated=" + this.lastUpdated + ", scopes=" + this.scopes + ")";
    }
}
