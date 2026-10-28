package m72;

import ep0.C13404j;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m72.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lm72/a;", "", "", "hasOnboarded", "", "Lm72/i;", "sections", "Lep0/j;", "screenContextMetadata", "<init>", "(ZLjava/util/List;Lep0/j;)V", "a", "(ZLjava/util/List;Lep0/j;)Lm72/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lep0/j;", "d", "()Lep0/j;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25202a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean hasOnboarded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C25210i> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C13404j screenContextMetadata;

    public C25202a(boolean z4, List<C25210i> sections, C13404j c13404j) {
        AbstractC22676k.m65750j(sections, "sections");
        this.hasOnboarded = z4;
        this.sections = sections;
        this.screenContextMetadata = c13404j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C25202a m73793b(C25202a c25202a, boolean z4, List list, C13404j c13404j, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c25202a.hasOnboarded;
        }
        if ((i13 & 2) != 0) {
            list = c25202a.sections;
        }
        if ((i13 & 4) != 0) {
            c13404j = c25202a.screenContextMetadata;
        }
        return c25202a.m73794a(z4, list, c13404j);
    }

    /* JADX INFO: renamed from: a */
    public final C25202a m73794a(boolean hasOnboarded, List<C25210i> sections, C13404j screenContextMetadata) {
        AbstractC22676k.m65750j(sections, "sections");
        return new C25202a(hasOnboarded, sections, screenContextMetadata);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasOnboarded() {
        return this.hasOnboarded;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C13404j getScreenContextMetadata() {
        return this.screenContextMetadata;
    }

    /* JADX INFO: renamed from: e */
    public final List<C25210i> m73797e() {
        return this.sections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25202a)) {
            return false;
        }
        C25202a c25202a = (C25202a) other;
        return this.hasOnboarded == c25202a.hasOnboarded && AbstractC22676k.m65745e(this.sections, c25202a.sections) && AbstractC22676k.m65745e(this.screenContextMetadata, c25202a.screenContextMetadata);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(Boolean.hashCode(this.hasOnboarded) * 31, 31, this.sections);
        C13404j c13404j = this.screenContextMetadata;
        return iM31983b + (c13404j == null ? 0 : c13404j.hashCode());
    }

    public String toString() {
        return "ContentViewState(hasOnboarded=" + this.hasOnboarded + ", sections=" + this.sections + ", screenContextMetadata=" + this.screenContextMetadata + ")";
    }
}
