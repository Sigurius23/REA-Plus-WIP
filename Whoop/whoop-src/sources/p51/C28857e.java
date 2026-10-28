package p51;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d13.AbstractC11478a;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: p51.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b\u001e\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0014\u00106\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, m65681d2 = {"Lp51/e;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "isNewText", "Lp51/d;", NotificationCompat.CATEGORY_STATUS, "", "Lhy0/h1;", "tags", "Lcom/whoop/navigation/e;", "destination", "Lp51/a;", "description", "lastUpdatedAtText", "expiresAtText", "", "isUpdateSeen", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp51/d;Ljava/util/List;Lcom/whoop/navigation/e;Lp51/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lp51/d;", "e", "()Lp51/d;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/whoop/navigation/e;", "getDestination", "()Lcom/whoop/navigation/e;", "Lp51/a;", "()Lp51/a;", "i", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getEvent", "()Ljava/lang/Object;", NotificationCompat.CATEGORY_EVENT, "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28857e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource isNewText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC28856d status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C17750h1> tags;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC28853a description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource lastUpdatedAtText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource expiresAtText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Boolean isUpdateSeen;

    public C28857e(TextResource title, TextResource textResource, EnumC28856d status, List<C17750h1> tags, C9598e c9598e, AbstractC28853a abstractC28853a, TextResource textResource2, TextResource textResource3, Boolean bool) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(tags, "tags");
        this.title = title;
        this.isNewText = textResource;
        this.status = status;
        this.tags = tags;
        this.destination = c9598e;
        this.description = abstractC28853a;
        this.lastUpdatedAtText = textResource2;
        this.expiresAtText = textResource3;
        this.isUpdateSeen = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC28853a getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getExpiresAtText() {
        return this.expiresAtText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLastUpdatedAtText() {
        return this.lastUpdatedAtText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC28856d getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28857e)) {
            return false;
        }
        C28857e c28857e = (C28857e) other;
        return AbstractC22676k.m65745e(this.title, c28857e.title) && AbstractC22676k.m65745e(this.isNewText, c28857e.isNewText) && this.status == c28857e.status && AbstractC22676k.m65745e(this.tags, c28857e.tags) && AbstractC22676k.m65745e(this.destination, c28857e.destination) && AbstractC22676k.m65745e(this.description, c28857e.description) && AbstractC22676k.m65745e(this.lastUpdatedAtText, c28857e.lastUpdatedAtText) && AbstractC22676k.m65745e(this.expiresAtText, c28857e.expiresAtText) && AbstractC22676k.m65745e(this.isUpdateSeen, c28857e.isUpdateSeen);
    }

    /* JADX INFO: renamed from: f */
    public final List<C17750h1> m87777f() {
        return this.tags;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        C9598e c9598e = this.destination;
        return c9598e == null ? C23454a0.f92919a : c9598e;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getIsNewText() {
        return this.isNewText;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.isNewText;
        int iM31983b = AbstractC11895b.m31983b((this.status.hashCode() + ((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31)) * 31, 31, this.tags);
        C9598e c9598e = this.destination;
        int iHashCode2 = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AbstractC28853a abstractC28853a = this.description;
        int iHashCode3 = (iHashCode2 + (abstractC28853a == null ? 0 : abstractC28853a.hashCode())) * 31;
        TextResource textResource2 = this.lastUpdatedAtText;
        int iHashCode4 = (iHashCode3 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.expiresAtText;
        int iHashCode5 = (iHashCode4 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        Boolean bool = this.isUpdateSeen;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsUpdateSeen() {
        return this.isUpdateSeen;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.isNewText;
        EnumC28856d enumC28856d = this.status;
        List<C17750h1> list = this.tags;
        C9598e c9598e = this.destination;
        AbstractC28853a abstractC28853a = this.description;
        TextResource textResource3 = this.lastUpdatedAtText;
        TextResource textResource4 = this.expiresAtText;
        Boolean bool = this.isUpdateSeen;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ContextCardViewState(title=", textResource, ", isNewText=", textResource2, ", status=");
        sbM106658q.append(enumC28856d);
        sbM106658q.append(", tags=");
        sbM106658q.append(list);
        sbM106658q.append(", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", description=");
        sbM106658q.append(abstractC28853a);
        sbM106658q.append(", lastUpdatedAtText=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", expiresAtText=", textResource4, ", isUpdateSeen=");
        return AbstractC11478a.m30858j(sbM106658q, bool, ")");
    }
}
