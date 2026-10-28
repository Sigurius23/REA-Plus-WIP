package f01;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: f01.a1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b!\u0010'¨\u0006("}, m65681d2 = {"Lf01/a1;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "description", "buttonText", "Lf01/x;", "style", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf01/x;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "e", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lf01/x;", "f", "()Lf01/x;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13844a1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f49386g = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC13909x style;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    public C13844a1(AbstractC22403o image, TextResource textResource, TextResource textResource2, TextResource buttonText, EnumC13909x enumC13909x, C9598e c9598e) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        this.image = image;
        this.title = textResource;
        this.description = textResource2;
        this.buttonText = buttonText;
        this.style = enumC13909x;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13844a1)) {
            return false;
        }
        C13844a1 c13844a1 = (C13844a1) other;
        return AbstractC22676k.m65745e(this.image, c13844a1.image) && AbstractC22676k.m65745e(this.title, c13844a1.title) && AbstractC22676k.m65745e(this.description, c13844a1.description) && AbstractC22676k.m65745e(this.buttonText, c13844a1.buttonText) && this.style == c13844a1.style && AbstractC22676k.m65745e(this.destination, c13844a1.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC13909x getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode() * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.description;
        int iM95625a = AbstractC31061c.m95625a((iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, this.buttonText, 31);
        EnumC13909x enumC13909x = this.style;
        int iHashCode3 = (iM95625a + (enumC13909x == null ? 0 : enumC13909x.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.buttonText;
        EnumC13909x enumC13909x = this.style;
        C9598e c9598e = this.destination;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("ImageAndButtonCardViewState(image=", textResource, abstractC22403o, ", title=", ", description=");
        AbstractC30007c.m91855y(sbM114683k, textResource2, ", buttonText=", textResource3, ", style=");
        sbM114683k.append(enumC13909x);
        sbM114683k.append(", destination=");
        sbM114683k.append(c9598e);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }
}
