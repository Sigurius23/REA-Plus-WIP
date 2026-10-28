package u70;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u70.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lu70/c;", "Lm91/u;", "Lkd1/o;", "backgroundImage", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "description", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "d", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34563c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f145566e = TextResource.$stable | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource description;

    public C34563c(AbstractC22403o backgroundImage, TextResource title, TextResource subtitle, TextResource description) {
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(description, "description");
        this.backgroundImage = backgroundImage;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34563c)) {
            return false;
        }
        C34563c c34563c = (C34563c) other;
        return AbstractC22676k.m65745e(this.backgroundImage, c34563c.backgroundImage) && AbstractC22676k.m65745e(this.title, c34563c.title) && AbstractC22676k.m65745e(this.subtitle, c34563c.subtitle) && AbstractC22676k.m65745e(this.description, c34563c.description);
    }

    public int hashCode() {
        return this.description.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.backgroundImage.hashCode() * 31, this.title, 31), this.subtitle, 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.backgroundImage;
        TextResource textResource = this.title;
        return AbstractC33745d.m106655n(AbstractC36095b.m114683k("OrderConfirmationHeroViewState(backgroundImage=", textResource, abstractC22403o, ", title=", ", subtitle="), this.subtitle, ", description=", this.description, ")");
    }

    public /* synthetic */ C34563c(AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC22403o, textResource, textResource2, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource3);
    }
}
