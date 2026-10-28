package xz0;

import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.C9598e;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xz0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b(\u00100R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b1\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b!\u00106R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b*\u0010:\u001a\u0004\b.\u0010;¨\u0006<"}, m65681d2 = {"Lxz0/f;", "Lm91/u;", "", "header", "Lxz0/b;", "iconButton", "Lhy0/h1;", "tag", "title", "Lkd1/o;", "descriptionImageSource", "description", "imageUrl", "Lxz0/c;", "imageAlignment", "Lxz0/a;", HttpHeaders.DATE, "", "items", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Lxz0/b;", "g", "()Lxz0/b;", "c", "Lhy0/h1;", "k", "()Lhy0/h1;", "d", "l", "e", "Lkd1/o;", "()Lkd1/o;", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lxz0/c;", "()Lxz0/c;", "Lxz0/a;", "()Lxz0/a;", "j", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38755f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38751b iconButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17750h1 tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o descriptionImageSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC38752c imageAlignment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C38750a date;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX WARN: Multi-variable type inference failed */
    public C38755f(String str, C38751b c38751b, C17750h1 c17750h1, String title, AbstractC22403o abstractC22403o, String description, AbstractC22403o abstractC22403o2, EnumC38752c imageAlignment, C38750a c38750a, List<? extends InterfaceC25312u> items, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(imageAlignment, "imageAlignment");
        AbstractC22676k.m65750j(items, "items");
        this.header = str;
        this.iconButton = c38751b;
        this.tag = c17750h1;
        this.title = title;
        this.descriptionImageSource = abstractC22403o;
        this.description = description;
        this.imageUrl = abstractC22403o2;
        this.imageAlignment = imageAlignment;
        this.date = c38750a;
        this.items = items;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C38750a getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getDescriptionImageSource() {
        return this.descriptionImageSource;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38755f)) {
            return false;
        }
        C38755f c38755f = (C38755f) other;
        return AbstractC22676k.m65745e(this.header, c38755f.header) && AbstractC22676k.m65745e(this.iconButton, c38755f.iconButton) && AbstractC22676k.m65745e(this.tag, c38755f.tag) && AbstractC22676k.m65745e(this.title, c38755f.title) && AbstractC22676k.m65745e(this.descriptionImageSource, c38755f.descriptionImageSource) && AbstractC22676k.m65745e(this.description, c38755f.description) && AbstractC22676k.m65745e(this.imageUrl, c38755f.imageUrl) && this.imageAlignment == c38755f.imageAlignment && AbstractC22676k.m65745e(this.date, c38755f.date) && AbstractC22676k.m65745e(this.items, c38755f.items) && AbstractC22676k.m65745e(this.destination, c38755f.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C38751b getIconButton() {
        return this.iconButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC38752c getImageAlignment() {
        return this.imageAlignment;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C38751b c38751b = this.iconButton;
        int iHashCode2 = (iHashCode + (c38751b == null ? 0 : c38751b.hashCode())) * 31;
        C17750h1 c17750h1 = this.tag;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31, 31, this.title);
        AbstractC22403o abstractC22403o = this.descriptionImageSource;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.description);
        AbstractC22403o abstractC22403o2 = this.imageUrl;
        int iHashCode3 = (this.imageAlignment.hashCode() + ((iM30450d2 + (abstractC22403o2 == null ? 0 : abstractC22403o2.hashCode())) * 31)) * 31;
        C38750a c38750a = this.date;
        int iM31983b = AbstractC11895b.m31983b((iHashCode3 + (c38750a == null ? 0 : c38750a.hashCode())) * 31, 31, this.items);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: j */
    public final List<InterfaceC25312u> m124221j() {
        return this.items;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.header;
        C38751b c38751b = this.iconButton;
        C17750h1 c17750h1 = this.tag;
        String str2 = this.title;
        AbstractC22403o abstractC22403o = this.descriptionImageSource;
        String str3 = this.description;
        AbstractC22403o abstractC22403o2 = this.imageUrl;
        EnumC38752c enumC38752c = this.imageAlignment;
        C38750a c38750a = this.date;
        List<InterfaceC25312u> list = this.items;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("AppointmentCardViewState(header=");
        sb4.append(str);
        sb4.append(", iconButton=");
        sb4.append(c38751b);
        sb4.append(", tag=");
        sb4.append(c17750h1);
        sb4.append(", title=");
        sb4.append(str2);
        sb4.append(", descriptionImageSource=");
        sb4.append(abstractC22403o);
        sb4.append(", description=");
        sb4.append(str3);
        sb4.append(", imageUrl=");
        sb4.append(abstractC22403o2);
        sb4.append(", imageAlignment=");
        sb4.append(enumC38752c);
        sb4.append(", date=");
        sb4.append(c38750a);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public /* synthetic */ C38755f(String str, C38751b c38751b, C17750h1 c17750h1, String str2, AbstractC22403o abstractC22403o, String str3, AbstractC22403o abstractC22403o2, EnumC38752c enumC38752c, C38750a c38750a, List list, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : c38751b, (i13 & 4) != 0 ? null : c17750h1, str2, (i13 & 16) != 0 ? null : abstractC22403o, str3, (i13 & 64) != 0 ? null : abstractC22403o2, (i13 & 128) != 0 ? EnumC38752c.LEADING : enumC38752c, (i13 & 256) != 0 ? null : c38750a, (i13 & 512) != 0 ? C25271y.f99162w : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c9598e);
    }
}
