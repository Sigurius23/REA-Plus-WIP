package y11;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: y11.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Ly11/t;", "", "", "similarMemberPosition", "Lcom/whoop/design/util/TextResource;", "similarMemberMainText", "similarMemberSubText", "<init>", "(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "a", "(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Ly11/t;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "d", "()Ljava/lang/Float;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39067t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Float similarMemberPosition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource similarMemberMainText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource similarMemberSubText;

    public C39067t(Float f13, TextResource textResource, TextResource textResource2) {
        this.similarMemberPosition = f13;
        this.similarMemberMainText = textResource;
        this.similarMemberSubText = textResource2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39067t m124582b(C39067t c39067t, Float f13, TextResource textResource, TextResource textResource2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c39067t.similarMemberPosition;
        }
        if ((i13 & 2) != 0) {
            textResource = c39067t.similarMemberMainText;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c39067t.similarMemberSubText;
        }
        return c39067t.m124583a(f13, textResource, textResource2);
    }

    /* JADX INFO: renamed from: a */
    public final C39067t m124583a(Float similarMemberPosition, TextResource similarMemberMainText, TextResource similarMemberSubText) {
        return new C39067t(similarMemberPosition, similarMemberMainText, similarMemberSubText);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSimilarMemberMainText() {
        return this.similarMemberMainText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getSimilarMemberPosition() {
        return this.similarMemberPosition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSimilarMemberSubText() {
        return this.similarMemberSubText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39067t)) {
            return false;
        }
        C39067t c39067t = (C39067t) other;
        return AbstractC22676k.m65745e(this.similarMemberPosition, c39067t.similarMemberPosition) && AbstractC22676k.m65745e(this.similarMemberMainText, c39067t.similarMemberMainText) && AbstractC22676k.m65745e(this.similarMemberSubText, c39067t.similarMemberSubText);
    }

    public int hashCode() {
        Float f13 = this.similarMemberPosition;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        TextResource textResource = this.similarMemberMainText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.similarMemberSubText;
        return iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0);
    }

    public String toString() {
        Float f13 = this.similarMemberPosition;
        TextResource textResource = this.similarMemberMainText;
        TextResource textResource2 = this.similarMemberSubText;
        StringBuilder sb4 = new StringBuilder("SimilarMarkerViewState(similarMemberPosition=");
        sb4.append(f13);
        sb4.append(", similarMemberMainText=");
        sb4.append(textResource);
        sb4.append(", similarMemberSubText=");
        return AbstractC30007c.m91841k(sb4, textResource2, ")");
    }
}
