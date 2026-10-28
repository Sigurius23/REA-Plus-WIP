package pv0;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import nv0.EnumC27166d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: pv0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b'\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00109\u001a\u0004\b:\u0010\u001dR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b;\u00108R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b+\u0010=R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b4\u0010.R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b#\u0010.R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b/\u0010.¨\u0006?"}, m65681d2 = {"Lpv0/d;", "", "", "isLoading", "isContentListLoading", "isError", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "", "toolbarLeftIcon", "searchTextPlaceholder", "searchQuery", "", "filterTypes", "", "selectedFilter", "Lm91/u;", "tiles", "Lnv0/d;", "paginationState", "searchLandingTitle", "searchLandingSubTitle", "searchLandingIcon", "nextToken", "errorText", "retryButtonText", "<init>", "(ZZZLcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lnv0/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "p", "()Z", "b", "n", "c", "o", "d", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "e", "I", "getToolbarLeftIcon", "f", "j", "g", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "k", "l", "Lnv0/d;", "()Lnv0/d;", "q", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29577d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isContentListLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource toolbarTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int toolbarLeftIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource searchTextPlaceholder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource searchQuery;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<TextResource> filterTypes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String selectedFilter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<InterfaceC25312u> tiles;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC27166d paginationState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource searchLandingTitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final TextResource searchLandingSubTitle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int searchLandingIcon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String nextToken;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final TextResource errorText;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final TextResource retryButtonText;

    /* JADX WARN: Multi-variable type inference failed */
    public C29577d(boolean z4, boolean z13, boolean z14, TextResource toolbarTitle, int i13, TextResource searchTextPlaceholder, TextResource searchQuery, List<? extends TextResource> filterTypes, String str, List<? extends InterfaceC25312u> tiles, EnumC27166d paginationState, TextResource searchLandingTitle, TextResource searchLandingSubTitle, int i14, String str2, TextResource errorText, TextResource retryButtonText) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(searchTextPlaceholder, "searchTextPlaceholder");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(filterTypes, "filterTypes");
        AbstractC22676k.m65750j(tiles, "tiles");
        AbstractC22676k.m65750j(paginationState, "paginationState");
        AbstractC22676k.m65750j(searchLandingTitle, "searchLandingTitle");
        AbstractC22676k.m65750j(searchLandingSubTitle, "searchLandingSubTitle");
        AbstractC22676k.m65750j(errorText, "errorText");
        AbstractC22676k.m65750j(retryButtonText, "retryButtonText");
        this.isLoading = z4;
        this.isContentListLoading = z13;
        this.isError = z14;
        this.toolbarTitle = toolbarTitle;
        this.toolbarLeftIcon = i13;
        this.searchTextPlaceholder = searchTextPlaceholder;
        this.searchQuery = searchQuery;
        this.filterTypes = filterTypes;
        this.selectedFilter = str;
        this.tiles = tiles;
        this.paginationState = paginationState;
        this.searchLandingTitle = searchLandingTitle;
        this.searchLandingSubTitle = searchLandingSubTitle;
        this.searchLandingIcon = i14;
        this.nextToken = str2;
        this.errorText = errorText;
        this.retryButtonText = retryButtonText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getErrorText() {
        return this.errorText;
    }

    /* JADX INFO: renamed from: b */
    public final List<TextResource> m90673b() {
        return this.filterTypes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNextToken() {
        return this.nextToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC27166d getPaginationState() {
        return this.paginationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getRetryButtonText() {
        return this.retryButtonText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29577d)) {
            return false;
        }
        C29577d c29577d = (C29577d) other;
        return this.isLoading == c29577d.isLoading && this.isContentListLoading == c29577d.isContentListLoading && this.isError == c29577d.isError && AbstractC22676k.m65745e(this.toolbarTitle, c29577d.toolbarTitle) && this.toolbarLeftIcon == c29577d.toolbarLeftIcon && AbstractC22676k.m65745e(this.searchTextPlaceholder, c29577d.searchTextPlaceholder) && AbstractC22676k.m65745e(this.searchQuery, c29577d.searchQuery) && AbstractC22676k.m65745e(this.filterTypes, c29577d.filterTypes) && AbstractC22676k.m65745e(this.selectedFilter, c29577d.selectedFilter) && AbstractC22676k.m65745e(this.tiles, c29577d.tiles) && this.paginationState == c29577d.paginationState && AbstractC22676k.m65745e(this.searchLandingTitle, c29577d.searchLandingTitle) && AbstractC22676k.m65745e(this.searchLandingSubTitle, c29577d.searchLandingSubTitle) && this.searchLandingIcon == c29577d.searchLandingIcon && AbstractC22676k.m65745e(this.nextToken, c29577d.nextToken) && AbstractC22676k.m65745e(this.errorText, c29577d.errorText) && AbstractC22676k.m65745e(this.retryButtonText, c29577d.retryButtonText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSearchLandingIcon() {
        return this.searchLandingIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getSearchLandingSubTitle() {
        return this.searchLandingSubTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getSearchLandingTitle() {
        return this.searchLandingTitle;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.toolbarLeftIcon, AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isContentListLoading), 31, this.isError), this.toolbarTitle, 31), 31), this.searchTextPlaceholder, 31), this.searchQuery, 31), 31, this.filterTypes);
        String str = this.selectedFilter;
        int iM30448b = AbstractC11266d.m30448b(this.searchLandingIcon, AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.paginationState.hashCode() + AbstractC11895b.m31983b((iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31, this.tiles)) * 31, this.searchLandingTitle, 31), this.searchLandingSubTitle, 31), 31);
        String str2 = this.nextToken;
        return this.retryButtonText.hashCode() + AbstractC31061c.m95625a((iM30448b + (str2 != null ? str2.hashCode() : 0)) * 31, this.errorText, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getSearchTextPlaceholder() {
        return this.searchTextPlaceholder;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSelectedFilter() {
        return this.selectedFilter;
    }

    /* JADX INFO: renamed from: l */
    public final List<InterfaceC25312u> m90683l() {
        return this.tiles;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsContentListLoading() {
        return this.isContentListLoading;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isContentListLoading;
        boolean z14 = this.isError;
        TextResource textResource = this.toolbarTitle;
        int i13 = this.toolbarLeftIcon;
        TextResource textResource2 = this.searchTextPlaceholder;
        TextResource textResource3 = this.searchQuery;
        List<TextResource> list = this.filterTypes;
        String str = this.selectedFilter;
        List<InterfaceC25312u> list2 = this.tiles;
        EnumC27166d enumC27166d = this.paginationState;
        TextResource textResource4 = this.searchLandingTitle;
        TextResource textResource5 = this.searchLandingSubTitle;
        int i14 = this.searchLandingIcon;
        String str2 = this.nextToken;
        TextResource textResource6 = this.errorText;
        TextResource textResource7 = this.retryButtonText;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ContentSearchViewState(isLoading=", ", isContentListLoading=", ", isError=", z4, z13);
        AbstractC21702c.m61144o(textResource, ", toolbarTitle=", ", toolbarLeftIcon=", sbM32002u, z14);
        sbM32002u.append(i13);
        sbM32002u.append(", searchTextPlaceholder=");
        sbM32002u.append(textResource2);
        sbM32002u.append(", searchQuery=");
        AbstractC21702c.m61143n(textResource3, ", filterTypes=", ", selectedFilter=", sbM32002u, list);
        AbstractC36095b.m114694v(str, ", tiles=", ", paginationState=", sbM32002u, list2);
        sbM32002u.append(enumC27166d);
        sbM32002u.append(", searchLandingTitle=");
        sbM32002u.append(textResource4);
        sbM32002u.append(", searchLandingSubTitle=");
        sbM32002u.append(textResource5);
        sbM32002u.append(", searchLandingIcon=");
        sbM32002u.append(i14);
        sbM32002u.append(", nextToken=");
        AbstractC30007c.m91826A(sbM32002u, str2, ", errorText=", textResource6, ", retryButtonText=");
        return AbstractC30007c.m91841k(sbM32002u, textResource7, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C29577d(boolean z4, boolean z13, boolean z14, TextResource textResource, int i13, TextResource textResource2, TextResource textResource3, List list, String str, List list2, EnumC27166d enumC27166d, TextResource textResource4, TextResource textResource5, int i14, String str2, TextResource textResource6, TextResource textResource7, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z15 = (i15 & 1) != 0 ? true : z4;
        boolean z16 = (i15 & 2) == 0 ? z13 : true;
        boolean z17 = (i15 & 4) != 0 ? false : z14;
        TextResource textResourceM21267a = (i15 & 8) != 0 ? AbstractC8693b.m21267a() : textResource;
        int whoopIcon = (i15 & 16) != 0 ? EnumC16313m0.CROSS.toWhoopIcon() : i13;
        TextResource textResourceM21267a2 = (i15 & 32) != 0 ? AbstractC8693b.m21267a() : textResource2;
        TextResource textResourceM21267a3 = (i15 & 64) != 0 ? AbstractC8693b.m21267a() : textResource3;
        int i16 = i15 & 128;
        List list3 = C25271y.f99162w;
        this(z15, z16, z17, textResourceM21267a, whoopIcon, textResourceM21267a2, textResourceM21267a3, i16 != 0 ? list3 : list, (i15 & 256) != 0 ? null : str, (i15 & 512) == 0 ? list2 : list3, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC27166d.IDLE : enumC27166d, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC8693b.m21267a() : textResource4, (i15 & 4096) != 0 ? AbstractC8693b.m21267a() : textResource5, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC16313m0.SEARCH.toWhoopIcon() : i14, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str2, (i15 & 32768) != 0 ? AbstractC8693b.m21267a() : textResource6, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? AbstractC8693b.m21267a() : textResource7);
    }
}
