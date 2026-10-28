package mm1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import lz0.C24816a;
import lz0.C24817b;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: mm1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b\u001f\u0010+R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b'\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b,\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b#\u00102¨\u00063"}, m65681d2 = {"Lmm1/f;", "Lm91/u;", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "endIcon", "Ly81/f;", "activeColor", "dueDate", "", "Llz0/a;", "progressBars", "Llz0/b;", "labels", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "e", "()Lgz0/m0;", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "d", "getEndIcon", "Ly81/f;", "()Ly81/f;", "f", "g", "Ljava/util/List;", "()Ljava/util/List;", "i", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25692f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f activeColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource dueDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C24816a> progressBars;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C24817b> labels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C9598e destination;

    public C25692f(EnumC16313m0 enumC16313m0, TextResource title, TextResource subtitle, EnumC16313m0 enumC16313m1, EnumC39333f activeColor, TextResource dueDate, List<C24816a> progressBars, List<C24817b> labels, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(activeColor, "activeColor");
        AbstractC22676k.m65750j(dueDate, "dueDate");
        AbstractC22676k.m65750j(progressBars, "progressBars");
        AbstractC22676k.m65750j(labels, "labels");
        AbstractC22676k.m65750j(destination, "destination");
        this.icon = enumC16313m0;
        this.title = title;
        this.subtitle = subtitle;
        this.endIcon = enumC16313m1;
        this.activeColor = activeColor;
        this.dueDate = dueDate;
        this.progressBars = progressBars;
        this.labels = labels;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getActiveColor() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25692f)) {
            return false;
        }
        C25692f c25692f = (C25692f) other;
        return this.icon == c25692f.icon && AbstractC22676k.m65745e(this.title, c25692f.title) && AbstractC22676k.m65745e(this.subtitle, c25692f.subtitle) && this.endIcon == c25692f.endIcon && this.activeColor == c25692f.activeColor && AbstractC22676k.m65745e(this.dueDate, c25692f.dueDate) && AbstractC22676k.m65745e(this.progressBars, c25692f.progressBars) && AbstractC22676k.m65745e(this.labels, c25692f.labels) && AbstractC22676k.m65745e(this.destination, c25692f.destination);
    }

    /* JADX INFO: renamed from: f */
    public final List<C24817b> m75670f() {
        return this.labels;
    }

    /* JADX INFO: renamed from: g */
    public final List<C24816a> m75671g() {
        return this.progressBars;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31, this.title, 31), this.subtitle, 31);
        EnumC16313m0 enumC16313m1 = this.endIcon;
        return this.destination.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.activeColor, (iM95625a + (enumC16313m1 != null ? enumC16313m1.hashCode() : 0)) * 31, 31), this.dueDate, 31), 31, this.progressBars), 31, this.labels);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        EnumC16313m0 enumC16313m1 = this.endIcon;
        EnumC39333f enumC39333f = this.activeColor;
        TextResource textResource3 = this.dueDate;
        List<C24816a> list = this.progressBars;
        List<C24817b> list2 = this.labels;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("PregnancyTileState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", subtitle=");
        sb4.append(textResource2);
        sb4.append(", endIcon=");
        sb4.append(enumC16313m1);
        sb4.append(", activeColor=");
        sb4.append(enumC39333f);
        sb4.append(", dueDate=");
        sb4.append(textResource3);
        sb4.append(", progressBars=");
        AbstractC21702c.m61148s(sb4, list, ", labels=", list2, ", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public /* synthetic */ C25692f(EnumC16313m0 enumC16313m0, TextResource textResource, TextResource textResource2, EnumC16313m0 enumC16313m1, EnumC39333f enumC39333f, TextResource textResource3, List list, List list2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC16313m0, textResource, textResource2, (i13 & 8) != 0 ? null : enumC16313m1, enumC39333f, textResource3, list, list2, c9598e);
    }
}
