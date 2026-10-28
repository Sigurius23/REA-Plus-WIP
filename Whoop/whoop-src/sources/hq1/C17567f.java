package hq1;

import gq1.C16081a;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hq1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lhq1/f;", "", "", "impactId", "Lgq1/a$b;", "source", "", "isNew", "<init>", "(Ljava/lang/String;Lgq1/a$b;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lgq1/a$b;", "()Lgq1/a$b;", "c", "Z", "()Z", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17567f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String impactId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16081a.b source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isNew;

    public C17567f(String impactId, C16081a.b source, boolean z4) {
        AbstractC22676k.m65750j(impactId, "impactId");
        AbstractC22676k.m65750j(source, "source");
        this.impactId = impactId;
        this.source = source;
        this.isNew = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getImpactId() {
        return this.impactId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C16081a.b getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17567f)) {
            return false;
        }
        C17567f c17567f = (C17567f) other;
        return AbstractC22676k.m65745e(this.impactId, c17567f.impactId) && this.source == c17567f.source && this.isNew == c17567f.isNew;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNew) + ((this.source.hashCode() + (this.impactId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.impactId;
        C16081a.b bVar = this.source;
        boolean z4 = this.isNew;
        StringBuilder sb4 = new StringBuilder("ImpactDetailsMetadata(impactId=");
        sb4.append(str);
        sb4.append(", source=");
        sb4.append(bVar);
        sb4.append(", isNew=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
