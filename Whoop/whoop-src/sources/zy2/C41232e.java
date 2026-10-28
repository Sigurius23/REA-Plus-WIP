package zy2;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: zy2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, m65681d2 = {"Lzy2/e;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Lm91/u;", "campaigns", "Lzy2/a;", "emptyState", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lzy2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lzy2/a;", "()Lzy2/a;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41232e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> campaigns;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C41228a emptyState;

    /* JADX WARN: Multi-variable type inference failed */
    public C41232e(TextResource textResource, TextResource textResource2, List<? extends InterfaceC25312u> campaigns, C41228a c41228a) {
        AbstractC22676k.m65750j(campaigns, "campaigns");
        this.title = textResource;
        this.subtitle = textResource2;
        this.campaigns = campaigns;
        this.emptyState = c41228a;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m133943a() {
        return this.campaigns;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C41228a getEmptyState() {
        return this.emptyState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41232e)) {
            return false;
        }
        C41232e c41232e = (C41232e) other;
        return AbstractC22676k.m65745e(this.title, c41232e.title) && AbstractC22676k.m65745e(this.subtitle, c41232e.subtitle) && AbstractC22676k.m65745e(this.campaigns, c41232e.campaigns) && AbstractC22676k.m65745e(this.emptyState, c41232e.emptyState);
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.subtitle;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.campaigns);
        C41228a c41228a = this.emptyState;
        return iM31983b + (c41228a != null ? c41228a.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<InterfaceC25312u> list = this.campaigns;
        C41228a c41228a = this.emptyState;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CompletedCampaignsSectionViewState(title=", textResource, ", subtitle=", textResource2, ", campaigns=");
        sbM106658q.append(list);
        sbM106658q.append(", emptyState=");
        sbM106658q.append(c41228a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
