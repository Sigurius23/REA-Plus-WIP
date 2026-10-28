package q51;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: q51.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lq51/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "greetingText", "subtitleText", "Lkd1/o;", "photo", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lkd1/o;", "()Lkd1/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29982d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource greetingText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitleText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o photo;

    public C29982d(TextResource greetingText, TextResource subtitleText, AbstractC22403o photo) {
        AbstractC22676k.m65750j(greetingText, "greetingText");
        AbstractC22676k.m65750j(subtitleText, "subtitleText");
        AbstractC22676k.m65750j(photo, "photo");
        this.greetingText = greetingText;
        this.subtitleText = subtitleText;
        this.photo = photo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getGreetingText() {
        return this.greetingText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubtitleText() {
        return this.subtitleText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29982d)) {
            return false;
        }
        C29982d c29982d = (C29982d) other;
        return AbstractC22676k.m65745e(this.greetingText, c29982d.greetingText) && AbstractC22676k.m65745e(this.subtitleText, c29982d.subtitleText) && AbstractC22676k.m65745e(this.photo, c29982d.photo);
    }

    public int hashCode() {
        return this.photo.hashCode() + AbstractC31061c.m95625a(this.greetingText.hashCode() * 31, this.subtitleText, 31);
    }

    public String toString() {
        TextResource textResource = this.greetingText;
        TextResource textResource2 = this.subtitleText;
        AbstractC22403o abstractC22403o = this.photo;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ContextHubHeaderViewState(greetingText=", textResource, ", subtitleText=", textResource2, ", photo=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
