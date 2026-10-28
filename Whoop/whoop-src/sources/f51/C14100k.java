package f51;

import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: f51.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lf51/k;", "Lm91/u;", "", "Lf51/l;", "questionGroups", "Lcom/whoop/design/util/TextResource;", "additionalInfoText", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14100k implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C14101l> questionGroups;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource additionalInfoText;

    public C14100k(List<C14101l> questionGroups, TextResource textResource) {
        AbstractC22676k.m65750j(questionGroups, "questionGroups");
        this.questionGroups = questionGroups;
        this.additionalInfoText = textResource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    /* JADX INFO: renamed from: b */
    public final List<C14101l> m40165b() {
        return this.questionGroups;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14100k)) {
            return false;
        }
        C14100k c14100k = (C14100k) other;
        return AbstractC22676k.m65745e(this.questionGroups, c14100k.questionGroups) && AbstractC22676k.m65745e(this.additionalInfoText, c14100k.additionalInfoText);
    }

    public int hashCode() {
        int iHashCode = this.questionGroups.hashCode() * 31;
        TextResource textResource = this.additionalInfoText;
        return iHashCode + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        return "ImpactMagnitudeQuestionsViewState(questionGroups=" + this.questionGroups + ", additionalInfoText=" + this.additionalInfoText + ")";
    }
}
