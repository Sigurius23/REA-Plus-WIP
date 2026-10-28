package lo0;

import c13.AbstractC3855a;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lo0.v0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u001e\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001b\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b)\u0010-¨\u0006."}, m65681d2 = {"Llo0/v0;", "Lm91/u;", "", "title", "subtitle", "Lkd1/o;", "imageUrl", "Lhy0/h1;", "endTag", "Lgz0/m0;", "endIcon", "Lcom/whoop/navigation/e;", "destination", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/h1;Lgz0/m0;Lcom/whoop/navigation/e;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "g", "c", "Lkd1/o;", "e", "()Lkd1/o;", "d", "Lhy0/h1;", "()Lhy0/h1;", "Lgz0/m0;", "()Lgz0/m0;", "f", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ljava/util/List;", "()Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24611v0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17750h1 endTag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C24611v0(String title, String str, AbstractC22403o abstractC22403o, C17750h1 c17750h1, EnumC16313m0 enumC16313m0, C9598e destination, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.subtitle = str;
        this.imageUrl = abstractC22403o;
        this.endTag = c17750h1;
        this.endIcon = enumC16313m0;
        this.destination = destination;
        this.items = items;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17750h1 getEndTag() {
        return this.endTag;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24611v0)) {
            return false;
        }
        C24611v0 c24611v0 = (C24611v0) other;
        return AbstractC22676k.m65745e(this.title, c24611v0.title) && AbstractC22676k.m65745e(this.subtitle, c24611v0.subtitle) && AbstractC22676k.m65745e(this.imageUrl, c24611v0.imageUrl) && AbstractC22676k.m65745e(this.endTag, c24611v0.endTag) && this.endIcon == c24611v0.endIcon && AbstractC22676k.m65745e(this.destination, c24611v0.destination) && AbstractC22676k.m65745e(this.items, c24611v0.items);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m71859f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C17750h1 c17750h1 = this.endTag;
        int iHashCode4 = (iHashCode3 + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        return this.items.hashCode() + AbstractC36095b.m114673a(this.destination, (iHashCode4 + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AbstractC22403o abstractC22403o = this.imageUrl;
        C17750h1 c17750h1 = this.endTag;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        C9598e c9598e = this.destination;
        List<InterfaceC25312u> list = this.items;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VisitDetailItemViewState(title=", str, ", subtitle=", str2, ", imageUrl=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", endTag=");
        sbM32001t.append(c17750h1);
        sbM32001t.append(", endIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", items=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }
}
