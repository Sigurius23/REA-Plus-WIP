package ti0;

import androidx.core.app.NotificationCompat;
import com.whoop.archv2.feature.domain.EnumC6009o;
import com.whoop.navigation.models.ApiRequest;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ti0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lti0/g;", "", "Lcom/whoop/archv2/feature/domain/o;", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/navigation/models/ApiRequest;", "nextPageRequest", "", "messageText", "retryActionText", "<init>", "(Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/archv2/feature/domain/o;", "d", "()Lcom/whoop/archv2/feature/domain/o;", "b", "Lcom/whoop/navigation/models/ApiRequest;", "()Lcom/whoop/navigation/models/ApiRequest;", "c", "Ljava/lang/String;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33842g {

    /* JADX INFO: renamed from: e */
    public static final int f141729e = ApiRequest.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC6009o status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ApiRequest nextPageRequest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String messageText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String retryActionText;

    public C33842g(EnumC6009o status, ApiRequest nextPageRequest, String messageText, String str) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(nextPageRequest, "nextPageRequest");
        AbstractC22676k.m65750j(messageText, "messageText");
        this.status = status;
        this.nextPageRequest = nextPageRequest;
        this.messageText = messageText;
        this.retryActionText = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ApiRequest getNextPageRequest() {
        return this.nextPageRequest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRetryActionText() {
        return this.retryActionText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC6009o getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33842g)) {
            return false;
        }
        C33842g c33842g = (C33842g) other;
        return this.status == c33842g.status && AbstractC22676k.m65745e(this.nextPageRequest, c33842g.nextPageRequest) && AbstractC22676k.m65745e(this.messageText, c33842g.messageText) && AbstractC22676k.m65745e(this.retryActionText, c33842g.retryActionText);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.nextPageRequest.hashCode() + (this.status.hashCode() * 31)) * 31, 31, this.messageText);
        String str = this.retryActionText;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        EnumC6009o enumC6009o = this.status;
        ApiRequest apiRequest = this.nextPageRequest;
        String str = this.messageText;
        String str2 = this.retryActionText;
        StringBuilder sb4 = new StringBuilder("PaginationControlViewState(status=");
        sb4.append(enumC6009o);
        sb4.append(", nextPageRequest=");
        sb4.append(apiRequest);
        sb4.append(", messageText=");
        return AbstractC11266d.m30464r(sb4, str, ", retryActionText=", str2, ")");
    }
}
