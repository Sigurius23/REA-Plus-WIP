package com.whoop.contentsearch.domain.models;

import com.whoop.design.models.items.ListItemTileModel;
import com.whoop.design.models.items.ListItemTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ou1.C28376a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJX\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010#J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010!R \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00109\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010#R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b>\u00105\u001a\u0004\b=\u0010%R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bA\u00105\u001a\u0004\b@\u0010'R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\bC\u00105\u001a\u0004\bB\u0010\u001f¨\u0006F"}, m65681d2 = {"Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;", "", "", "", "filterTypes", "Lcom/whoop/contentsearch/domain/models/NavBar;", "navBar", "searchTextPlaceholder", "Lcom/whoop/contentsearch/domain/models/SearchLanding;", "searchLanding", "Lcom/whoop/contentsearch/domain/models/PaginationDetails;", "paginationDetails", "Lcom/whoop/design/models/items/ListItemTileModel;", "tiles", "<init>", "(Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$content_search_release", "(Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/contentsearch/domain/models/NavBar;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/contentsearch/domain/models/SearchLanding;", "component5", "()Lcom/whoop/contentsearch/domain/models/PaginationDetails;", "component6", "copy", "(Ljava/util/List;Lcom/whoop/contentsearch/domain/models/NavBar;Ljava/lang/String;Lcom/whoop/contentsearch/domain/models/SearchLanding;Lcom/whoop/contentsearch/domain/models/PaginationDetails;Ljava/util/List;)Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFilterTypes", "getFilterTypes$annotations", "()V", "Lcom/whoop/contentsearch/domain/models/NavBar;", "getNavBar", "getNavBar$annotations", "Ljava/lang/String;", "getSearchTextPlaceholder", "getSearchTextPlaceholder$annotations", "Lcom/whoop/contentsearch/domain/models/SearchLanding;", "getSearchLanding", "getSearchLanding$annotations", "Lcom/whoop/contentsearch/domain/models/PaginationDetails;", "getPaginationDetails", "getPaginationDetails$annotations", "getTiles", "getTiles$annotations", "Companion", "$serializer", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContentSearchScreen {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> filterTypes;
    private final NavBar navBar;
    private final PaginationDetails paginationDetails;
    private final SearchLanding searchLanding;
    private final String searchTextPlaceholder;
    private final List<ListItemTileModel> tiles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/contentsearch/domain/models/ContentSearchScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;", "serializer", "()Lwc3/c;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContentSearchScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C28376a(3)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C28376a(4))};
    }

    public /* synthetic */ ContentSearchScreen(int i13, List list, NavBar navBar, String str, SearchLanding searchLanding, PaginationDetails paginationDetails, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ContentSearchScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.filterTypes = list;
        this.navBar = navBar;
        this.searchTextPlaceholder = str;
        this.searchLanding = searchLanding;
        this.paginationDetails = paginationDetails;
        this.tiles = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ListItemTileModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentSearchScreen copy$default(ContentSearchScreen contentSearchScreen, List list, NavBar navBar, String str, SearchLanding searchLanding, PaginationDetails paginationDetails, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = contentSearchScreen.filterTypes;
        }
        if ((i13 & 2) != 0) {
            navBar = contentSearchScreen.navBar;
        }
        if ((i13 & 4) != 0) {
            str = contentSearchScreen.searchTextPlaceholder;
        }
        if ((i13 & 8) != 0) {
            searchLanding = contentSearchScreen.searchLanding;
        }
        if ((i13 & 16) != 0) {
            paginationDetails = contentSearchScreen.paginationDetails;
        }
        if ((i13 & 32) != 0) {
            list2 = contentSearchScreen.tiles;
        }
        PaginationDetails paginationDetails2 = paginationDetails;
        List list3 = list2;
        return contentSearchScreen.copy(list, navBar, str, searchLanding, paginationDetails2, list3);
    }

    @InterfaceC37143h("filter_types")
    public static /* synthetic */ void getFilterTypes$annotations() {
    }

    @InterfaceC37143h("nav_bar")
    public static /* synthetic */ void getNavBar$annotations() {
    }

    @InterfaceC37143h("pagination_details")
    public static /* synthetic */ void getPaginationDetails$annotations() {
    }

    @InterfaceC37143h("search_landing")
    public static /* synthetic */ void getSearchLanding$annotations() {
    }

    @InterfaceC37143h("search_text_placeholder")
    public static /* synthetic */ void getSearchTextPlaceholder$annotations() {
    }

    @InterfaceC37143h("tiles")
    public static /* synthetic */ void getTiles$annotations() {
    }

    public static final /* synthetic */ void write$Self$content_search_release(ContentSearchScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.filterTypes);
        output.encodeSerializableElement(serialDesc, 1, NavBar$$serializer.INSTANCE, self.navBar);
        output.encodeStringElement(serialDesc, 2, self.searchTextPlaceholder);
        output.encodeSerializableElement(serialDesc, 3, SearchLanding$$serializer.INSTANCE, self.searchLanding);
        output.encodeSerializableElement(serialDesc, 4, PaginationDetails$$serializer.INSTANCE, self.paginationDetails);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.tiles);
    }

    public final List<String> component1() {
        return this.filterTypes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NavBar getNavBar() {
        return this.navBar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSearchTextPlaceholder() {
        return this.searchTextPlaceholder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SearchLanding getSearchLanding() {
        return this.searchLanding;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaginationDetails getPaginationDetails() {
        return this.paginationDetails;
    }

    public final List<ListItemTileModel> component6() {
        return this.tiles;
    }

    public final ContentSearchScreen copy(List<String> filterTypes, NavBar navBar, String searchTextPlaceholder, SearchLanding searchLanding, PaginationDetails paginationDetails, List<ListItemTileModel> tiles) {
        AbstractC22676k.m65750j(filterTypes, "filterTypes");
        AbstractC22676k.m65750j(navBar, "navBar");
        AbstractC22676k.m65750j(searchTextPlaceholder, "searchTextPlaceholder");
        AbstractC22676k.m65750j(searchLanding, "searchLanding");
        AbstractC22676k.m65750j(paginationDetails, "paginationDetails");
        AbstractC22676k.m65750j(tiles, "tiles");
        return new ContentSearchScreen(filterTypes, navBar, searchTextPlaceholder, searchLanding, paginationDetails, tiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentSearchScreen)) {
            return false;
        }
        ContentSearchScreen contentSearchScreen = (ContentSearchScreen) other;
        return AbstractC22676k.m65745e(this.filterTypes, contentSearchScreen.filterTypes) && AbstractC22676k.m65745e(this.navBar, contentSearchScreen.navBar) && AbstractC22676k.m65745e(this.searchTextPlaceholder, contentSearchScreen.searchTextPlaceholder) && AbstractC22676k.m65745e(this.searchLanding, contentSearchScreen.searchLanding) && AbstractC22676k.m65745e(this.paginationDetails, contentSearchScreen.paginationDetails) && AbstractC22676k.m65745e(this.tiles, contentSearchScreen.tiles);
    }

    public final List<String> getFilterTypes() {
        return this.filterTypes;
    }

    public final NavBar getNavBar() {
        return this.navBar;
    }

    public final PaginationDetails getPaginationDetails() {
        return this.paginationDetails;
    }

    public final SearchLanding getSearchLanding() {
        return this.searchLanding;
    }

    public final String getSearchTextPlaceholder() {
        return this.searchTextPlaceholder;
    }

    public final List<ListItemTileModel> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        return this.tiles.hashCode() + ((this.paginationDetails.hashCode() + ((this.searchLanding.hashCode() + AbstractC11266d.m30450d((this.navBar.hashCode() + (this.filterTypes.hashCode() * 31)) * 31, 31, this.searchTextPlaceholder)) * 31)) * 31);
    }

    public String toString() {
        return "ContentSearchScreen(filterTypes=" + this.filterTypes + ", navBar=" + this.navBar + ", searchTextPlaceholder=" + this.searchTextPlaceholder + ", searchLanding=" + this.searchLanding + ", paginationDetails=" + this.paginationDetails + ", tiles=" + this.tiles + ")";
    }

    public ContentSearchScreen(List<String> filterTypes, NavBar navBar, String searchTextPlaceholder, SearchLanding searchLanding, PaginationDetails paginationDetails, List<ListItemTileModel> tiles) {
        AbstractC22676k.m65750j(filterTypes, "filterTypes");
        AbstractC22676k.m65750j(navBar, "navBar");
        AbstractC22676k.m65750j(searchTextPlaceholder, "searchTextPlaceholder");
        AbstractC22676k.m65750j(searchLanding, "searchLanding");
        AbstractC22676k.m65750j(paginationDetails, "paginationDetails");
        AbstractC22676k.m65750j(tiles, "tiles");
        this.filterTypes = filterTypes;
        this.navBar = navBar;
        this.searchTextPlaceholder = searchTextPlaceholder;
        this.searchLanding = searchLanding;
        this.paginationDetails = paginationDetails;
        this.tiles = tiles;
    }
}
