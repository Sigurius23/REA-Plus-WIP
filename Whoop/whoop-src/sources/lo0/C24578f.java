package lo0;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import hy0.C17749h0;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lo0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b!\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001d\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b'\u0010,¨\u0006-"}, m65681d2 = {"Llo0/f;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lhy0/h0;", "headshot", "Lhy0/h1;", "tag", "Llo0/p0;", "icon", "", "useTileBackground", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/h0;Lhy0/h1;Llo0/p0;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lhy0/h0;", "()Lhy0/h0;", "Lhy0/h1;", "()Lhy0/h1;", "f", "Llo0/p0;", "()Llo0/p0;", "g", "Z", "()Z", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24578f implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f96043h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17749h0 headshot;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17750h1 tag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C24599p0 icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean useTileBackground;

    static {
        int i13 = AnyModal.$stable | C17750h1.f69012w | C17749h0.f69004h;
        int i14 = TextResource.$stable;
        f96043h = i13 | i14 | i14;
    }

    public C24578f(String id4, TextResource title, TextResource textResource, C17749h0 c17749h0, C17750h1 c17750h1, C24599p0 c24599p0, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.title = title;
        this.subtitle = textResource;
        this.headshot = c17749h0;
        this.tag = c17750h1;
        this.icon = c24599p0;
        this.useTileBackground = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C17749h0 getHeadshot() {
        return this.headshot;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C24599p0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24578f)) {
            return false;
        }
        C24578f c24578f = (C24578f) other;
        return AbstractC22676k.m65745e(this.id, c24578f.id) && AbstractC22676k.m65745e(this.title, c24578f.title) && AbstractC22676k.m65745e(this.subtitle, c24578f.subtitle) && AbstractC22676k.m65745e(this.headshot, c24578f.headshot) && AbstractC22676k.m65745e(this.tag, c24578f.tag) && AbstractC22676k.m65745e(this.icon, c24578f.icon) && this.useTileBackground == c24578f.useTileBackground;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getUseTileBackground() {
        return this.useTileBackground;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C17749h0 c17749h0 = this.headshot;
        int iHashCode2 = (iHashCode + (c17749h0 == null ? 0 : c17749h0.hashCode())) * 31;
        C17750h1 c17750h1 = this.tag;
        int iHashCode3 = (iHashCode2 + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
        C24599p0 c24599p0 = this.icon;
        return Boolean.hashCode(this.useTileBackground) + ((iHashCode3 + (c24599p0 != null ? c24599p0.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C17749h0 c17749h0 = this.headshot;
        C17750h1 c17750h1 = this.tag;
        C24599p0 c24599p0 = this.icon;
        boolean z4 = this.useTileBackground;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("ClinicianHeaderViewState(id=", str, ", title=", textResource, ", subtitle=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", headshot=");
        sbM91847q.append(c17749h0);
        sbM91847q.append(", tag=");
        sbM91847q.append(c17750h1);
        sbM91847q.append(", icon=");
        sbM91847q.append(c24599p0);
        sbM91847q.append(", useTileBackground=");
        return AbstractC18489d0.m53372m(sbM91847q, z4, ")");
    }
}
