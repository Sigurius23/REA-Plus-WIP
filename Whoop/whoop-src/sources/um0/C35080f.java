package um0;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: um0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lum0/f;", "", "", "id", "", "uri", "scope", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35080f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String uri;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String scope;

    public C35080f(long j7, String uri, String scope) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(scope, "scope");
        this.id = j7;
        this.uri = uri;
        this.scope = scope;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35080f)) {
            return false;
        }
        C35080f c35080f = (C35080f) other;
        return this.id == c35080f.id && AbstractC22676k.m65745e(this.uri, c35080f.uri) && AbstractC22676k.m65745e(this.scope, c35080f.scope);
    }

    public int hashCode() {
        return this.scope.hashCode() + AbstractC11266d.m30450d(Long.hashCode(this.id) * 31, 31, this.uri);
    }

    public String toString() {
        long j7 = this.id;
        String str = this.uri;
        return AbstractC2875y.m8304q(AbstractC36095b.m114685m("CacheScopeEntity(id=", ", uri=", j7, str), ", scope=", this.scope, ")");
    }

    public /* synthetic */ C35080f(long j7, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j7, str, str2);
    }
}
