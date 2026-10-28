package jn0;

import androidx.core.app.NotificationCompat;
import com.whoop.challengedetails.domain.models.JoinChallengeResponseStatus;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: jn0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ljn0/d;", "", "Lcom/whoop/design/util/TextResource;", "text", "subText", "ctaText", "ctaClose", "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;", "()Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21801d {

    /* JADX INFO: renamed from: f */
    public static final int f83996f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource ctaClose;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final JoinChallengeResponseStatus status;

    public C21801d(TextResource text, TextResource subText, TextResource textResource, TextResource textResource2, JoinChallengeResponseStatus status) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(subText, "subText");
        AbstractC22676k.m65750j(status, "status");
        this.text = text;
        this.subText = subText;
        this.ctaText = textResource;
        this.ctaClose = textResource2;
        this.status = status;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCtaClose() {
        return this.ctaClose;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final JoinChallengeResponseStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21801d)) {
            return false;
        }
        C21801d c21801d = (C21801d) other;
        return AbstractC22676k.m65745e(this.text, c21801d.text) && AbstractC22676k.m65745e(this.subText, c21801d.subText) && AbstractC22676k.m65745e(this.ctaText, c21801d.ctaText) && AbstractC22676k.m65745e(this.ctaClose, c21801d.ctaClose) && this.status == c21801d.status;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.text.hashCode() * 31, this.subText, 31);
        TextResource textResource = this.ctaText;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.ctaClose;
        return this.status.hashCode() + ((iHashCode + (textResource2 != null ? textResource2.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.text;
        TextResource textResource2 = this.subText;
        TextResource textResource3 = this.ctaText;
        TextResource textResource4 = this.ctaClose;
        JoinChallengeResponseStatus joinChallengeResponseStatus = this.status;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("JoinChallengeState(text=", textResource, ", subText=", textResource2, ", ctaText=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", ctaClose=", textResource4, ", status=");
        sbM106658q.append(joinChallengeResponseStatus);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C21801d(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, JoinChallengeResponseStatus joinChallengeResponseStatus, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, (i13 & 4) != 0 ? null : textResource3, (i13 & 8) != 0 ? null : textResource4, joinChallengeResponseStatus);
    }
}
