package r51;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: r51.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJj\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b)\u0010,¨\u0006-"}, m65681d2 = {"Lr51/f;", "Lm91/u;", "Lny0/h;", "confirmButton", "cancelButton", "Lr51/g;", "selectedCountry", "Lcom/whoop/design/util/TextResource;", "title", "header", "searchPlaceHolder", "", "countries", "<init>", "(Lny0/h;Lny0/h;Lr51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "a", "(Lny0/h;Lny0/h;Lr51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)Lr51/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lny0/h;", "e", "()Lny0/h;", "b", "c", "Lr51/g;", "i", "()Lr51/g;", "d", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "g", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30938f implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f127649h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27256h confirmButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27256h cancelButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30939g selectedCountry;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource header;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource searchPlaceHolder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C30939g> countries;

    public C30938f(C27256h c27256h, C27256h c27256h2, C30939g c30939g, TextResource textResource, TextResource textResource2, TextResource textResource3, List<C30939g> list) {
        this.confirmButton = c27256h;
        this.cancelButton = c27256h2;
        this.selectedCountry = c30939g;
        this.title = textResource;
        this.header = textResource2;
        this.searchPlaceHolder = textResource3;
        this.countries = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C30938f m95175b(C30938f c30938f, C27256h c27256h, C27256h c27256h2, C30939g c30939g, TextResource textResource, TextResource textResource2, TextResource textResource3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c27256h = c30938f.confirmButton;
        }
        if ((i13 & 2) != 0) {
            c27256h2 = c30938f.cancelButton;
        }
        if ((i13 & 4) != 0) {
            c30939g = c30938f.selectedCountry;
        }
        if ((i13 & 8) != 0) {
            textResource = c30938f.title;
        }
        if ((i13 & 16) != 0) {
            textResource2 = c30938f.header;
        }
        if ((i13 & 32) != 0) {
            textResource3 = c30938f.searchPlaceHolder;
        }
        if ((i13 & 64) != 0) {
            list = c30938f.countries;
        }
        TextResource textResource4 = textResource3;
        List list2 = list;
        TextResource textResource5 = textResource2;
        C30939g c30939g2 = c30939g;
        return c30938f.m95176a(c27256h, c27256h2, c30939g2, textResource, textResource5, textResource4, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C30938f m95176a(C27256h confirmButton, C27256h cancelButton, C30939g selectedCountry, TextResource title, TextResource header, TextResource searchPlaceHolder, List<C30939g> countries) {
        return new C30938f(confirmButton, cancelButton, selectedCountry, title, header, searchPlaceHolder, countries);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getCancelButton() {
        return this.cancelButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27256h getConfirmButton() {
        return this.confirmButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30938f)) {
            return false;
        }
        C30938f c30938f = (C30938f) other;
        return AbstractC22676k.m65745e(this.confirmButton, c30938f.confirmButton) && AbstractC22676k.m65745e(this.cancelButton, c30938f.cancelButton) && AbstractC22676k.m65745e(this.selectedCountry, c30938f.selectedCountry) && AbstractC22676k.m65745e(this.title, c30938f.title) && AbstractC22676k.m65745e(this.header, c30938f.header) && AbstractC22676k.m65745e(this.searchPlaceHolder, c30938f.searchPlaceHolder) && AbstractC22676k.m65745e(this.countries, c30938f.countries);
    }

    /* JADX INFO: renamed from: f */
    public final List<C30939g> m95179f() {
        return this.countries;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getSearchPlaceHolder() {
        return this.searchPlaceHolder;
    }

    public int hashCode() {
        C27256h c27256h = this.confirmButton;
        int iHashCode = (c27256h == null ? 0 : c27256h.hashCode()) * 31;
        C27256h c27256h2 = this.cancelButton;
        int iHashCode2 = (iHashCode + (c27256h2 == null ? 0 : c27256h2.hashCode())) * 31;
        C30939g c30939g = this.selectedCountry;
        int iHashCode3 = (iHashCode2 + (c30939g == null ? 0 : c30939g.hashCode())) * 31;
        TextResource textResource = this.title;
        int iHashCode4 = (iHashCode3 + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.header;
        int iHashCode5 = (iHashCode4 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.searchPlaceHolder;
        int iHashCode6 = (iHashCode5 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        List<C30939g> list = this.countries;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C30939g getSelectedCountry() {
        return this.selectedCountry;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        C27256h c27256h = this.confirmButton;
        C27256h c27256h2 = this.cancelButton;
        C30939g c30939g = this.selectedCountry;
        TextResource textResource = this.title;
        TextResource textResource2 = this.header;
        TextResource textResource3 = this.searchPlaceHolder;
        List<C30939g> list = this.countries;
        StringBuilder sb4 = new StringBuilder("CountrySelectorViewState(confirmButton=");
        sb4.append(c27256h);
        sb4.append(", cancelButton=");
        sb4.append(c27256h2);
        sb4.append(", selectedCountry=");
        sb4.append(c30939g);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", header=");
        AbstractC30007c.m91855y(sb4, textResource2, ", searchPlaceHolder=", textResource3, ", countries=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
