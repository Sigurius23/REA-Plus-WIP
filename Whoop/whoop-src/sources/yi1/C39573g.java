package yi1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: yi1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lyi1/g;", "Lm91/u;", "Lyi1/l;", "sectionHeader", "Lcom/whoop/design/util/TextResource;", "body", "<init>", "(Lyi1/l;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyi1/l;", "b", "()Lyi1/l;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39573g implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f170285c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39578l sectionHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource body;

    static {
        int i13 = TextResource.$stable;
        f170285c = i13 | C9598e.f28134d | i13 | i13;
    }

    public C39573g(C39578l sectionHeader, TextResource body) {
        AbstractC22676k.m65750j(sectionHeader, "sectionHeader");
        AbstractC22676k.m65750j(body, "body");
        this.sectionHeader = sectionHeader;
        this.body = body;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39578l getSectionHeader() {
        return this.sectionHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39573g)) {
            return false;
        }
        C39573g c39573g = (C39573g) other;
        return AbstractC22676k.m65745e(this.sectionHeader, c39573g.sectionHeader) && AbstractC22676k.m65745e(this.body, c39573g.body);
    }

    public int hashCode() {
        return this.body.hashCode() + (this.sectionHeader.hashCode() * 31);
    }

    public String toString() {
        return "HeartScreenerIntroViewState(sectionHeader=" + this.sectionHeader + ", body=" + this.body + ")";
    }
}
