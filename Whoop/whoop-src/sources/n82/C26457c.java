package n82;

import com.mapbox.common.MapboxServices;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wb3.AbstractC37056f;
import y71.C39282o;

/* JADX INFO: renamed from: n82.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0092\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b$\u0010'R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b+\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b)\u00103¨\u00064"}, m65681d2 = {"Ln82/c;", "", "Lcom/whoop/design/util/TextResource;", "selectActivityTitleDisplay", "", MapboxServices.SEARCH, "", "Ly71/o;", "mostRecentList", "allList", "imagesList", "Ln82/a;", "activityScreenTypes", "pageType", "genericActivityText", "", "prefetch", "crossScoreTypeSearchEnabled", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;Z)Ln82/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getSelectActivityTitleDisplay", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "j", "c", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "d", "e", "g", "f", "Ln82/a;", "i", "()Ln82/a;", "Ljava/lang/Boolean;", "getPrefetch", "()Ljava/lang/Boolean;", "Z", "()Z", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26457c {

    /* JADX INFO: renamed from: k */
    public static final int f105074k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource selectActivityTitleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String search;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C39282o> mostRecentList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C39282o> allList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C39282o> imagesList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<EnumC26455a> activityScreenTypes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC26455a pageType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource genericActivityText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Boolean prefetch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean crossScoreTypeSearchEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public C26457c(TextResource selectActivityTitleDisplay, String search, List<C39282o> mostRecentList, List<C39282o> allList, List<C39282o> list, List<? extends EnumC26455a> activityScreenTypes, EnumC26455a pageType, TextResource textResource, Boolean bool, boolean z4) {
        AbstractC22676k.m65750j(selectActivityTitleDisplay, "selectActivityTitleDisplay");
        AbstractC22676k.m65750j(search, "search");
        AbstractC22676k.m65750j(mostRecentList, "mostRecentList");
        AbstractC22676k.m65750j(allList, "allList");
        AbstractC22676k.m65750j(activityScreenTypes, "activityScreenTypes");
        AbstractC22676k.m65750j(pageType, "pageType");
        this.selectActivityTitleDisplay = selectActivityTitleDisplay;
        this.search = search;
        this.mostRecentList = mostRecentList;
        this.allList = allList;
        this.imagesList = list;
        this.activityScreenTypes = activityScreenTypes;
        this.pageType = pageType;
        this.genericActivityText = textResource;
        this.prefetch = bool;
        this.crossScoreTypeSearchEnabled = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26457c m78350b(C26457c c26457c, TextResource textResource, String str, List list, List list2, List list3, List list4, EnumC26455a enumC26455a, TextResource textResource2, Boolean bool, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c26457c.selectActivityTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str = c26457c.search;
        }
        if ((i13 & 4) != 0) {
            list = c26457c.mostRecentList;
        }
        if ((i13 & 8) != 0) {
            list2 = c26457c.allList;
        }
        if ((i13 & 16) != 0) {
            list3 = c26457c.imagesList;
        }
        if ((i13 & 32) != 0) {
            list4 = c26457c.activityScreenTypes;
        }
        if ((i13 & 64) != 0) {
            enumC26455a = c26457c.pageType;
        }
        if ((i13 & 128) != 0) {
            textResource2 = c26457c.genericActivityText;
        }
        if ((i13 & 256) != 0) {
            bool = c26457c.prefetch;
        }
        if ((i13 & 512) != 0) {
            z4 = c26457c.crossScoreTypeSearchEnabled;
        }
        Boolean bool2 = bool;
        boolean z13 = z4;
        EnumC26455a enumC26455a2 = enumC26455a;
        TextResource textResource3 = textResource2;
        List list5 = list3;
        List list6 = list4;
        return c26457c.m78351a(textResource, str, list, list2, list5, list6, enumC26455a2, textResource3, bool2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C26457c m78351a(TextResource selectActivityTitleDisplay, String search, List<C39282o> mostRecentList, List<C39282o> allList, List<C39282o> imagesList, List<? extends EnumC26455a> activityScreenTypes, EnumC26455a pageType, TextResource genericActivityText, Boolean prefetch, boolean crossScoreTypeSearchEnabled) {
        AbstractC22676k.m65750j(selectActivityTitleDisplay, "selectActivityTitleDisplay");
        AbstractC22676k.m65750j(search, "search");
        AbstractC22676k.m65750j(mostRecentList, "mostRecentList");
        AbstractC22676k.m65750j(allList, "allList");
        AbstractC22676k.m65750j(activityScreenTypes, "activityScreenTypes");
        AbstractC22676k.m65750j(pageType, "pageType");
        return new C26457c(selectActivityTitleDisplay, search, mostRecentList, allList, imagesList, activityScreenTypes, pageType, genericActivityText, prefetch, crossScoreTypeSearchEnabled);
    }

    /* JADX INFO: renamed from: c */
    public final List<EnumC26455a> m78352c() {
        return this.activityScreenTypes;
    }

    /* JADX INFO: renamed from: d */
    public final List<C39282o> m78353d() {
        return this.allList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getCrossScoreTypeSearchEnabled() {
        return this.crossScoreTypeSearchEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26457c)) {
            return false;
        }
        C26457c c26457c = (C26457c) other;
        return AbstractC22676k.m65745e(this.selectActivityTitleDisplay, c26457c.selectActivityTitleDisplay) && AbstractC22676k.m65745e(this.search, c26457c.search) && AbstractC22676k.m65745e(this.mostRecentList, c26457c.mostRecentList) && AbstractC22676k.m65745e(this.allList, c26457c.allList) && AbstractC22676k.m65745e(this.imagesList, c26457c.imagesList) && AbstractC22676k.m65745e(this.activityScreenTypes, c26457c.activityScreenTypes) && this.pageType == c26457c.pageType && AbstractC22676k.m65745e(this.genericActivityText, c26457c.genericActivityText) && AbstractC22676k.m65745e(this.prefetch, c26457c.prefetch) && this.crossScoreTypeSearchEnabled == c26457c.crossScoreTypeSearchEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getGenericActivityText() {
        return this.genericActivityText;
    }

    /* JADX INFO: renamed from: g */
    public final List<C39282o> m78356g() {
        return this.imagesList;
    }

    /* JADX INFO: renamed from: h */
    public final List<C39282o> m78357h() {
        return this.mostRecentList;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.selectActivityTitleDisplay.hashCode() * 31, 31, this.search), 31, this.mostRecentList), 31, this.allList);
        List<C39282o> list = this.imagesList;
        int iHashCode = (this.pageType.hashCode() + AbstractC11895b.m31983b((iM31983b + (list == null ? 0 : list.hashCode())) * 31, 31, this.activityScreenTypes)) * 31;
        TextResource textResource = this.genericActivityText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        Boolean bool = this.prefetch;
        return Boolean.hashCode(this.crossScoreTypeSearchEnabled) + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC26455a getPageType() {
        return this.pageType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSearch() {
        return this.search;
    }

    public String toString() {
        TextResource textResource = this.selectActivityTitleDisplay;
        String str = this.search;
        List<C39282o> list = this.mostRecentList;
        List<C39282o> list2 = this.allList;
        List<C39282o> list3 = this.imagesList;
        List<EnumC26455a> list4 = this.activityScreenTypes;
        EnumC26455a enumC26455a = this.pageType;
        TextResource textResource2 = this.genericActivityText;
        Boolean bool = this.prefetch;
        boolean z4 = this.crossScoreTypeSearchEnabled;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("SelectActivityViewState(selectActivityTitleDisplay=", textResource, ", search=", str, ", mostRecentList=");
        AbstractC21702c.m61148s(sbM91845o, list, ", allList=", list2, ", imagesList=");
        AbstractC21702c.m61148s(sbM91845o, list3, ", activityScreenTypes=", list4, ", pageType=");
        sbM91845o.append(enumC26455a);
        sbM91845o.append(", genericActivityText=");
        sbM91845o.append(textResource2);
        sbM91845o.append(", prefetch=");
        sbM91845o.append(bool);
        sbM91845o.append(", crossScoreTypeSearchEnabled=");
        sbM91845o.append(z4);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C26457c(TextResource textResource, String str, List list, List list2, List list3, List list4, EnumC26455a enumC26455a, TextResource textResource2, Boolean bool, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        textResource = (i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource;
        str = (i13 & 2) != 0 ? "" : str;
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(textResource, str, i14 != 0 ? c25271y : list, (i13 & 8) != 0 ? c25271y : list2, (i13 & 16) != 0 ? null : list3, (i13 & 32) != 0 ? AbstractC37056f.m118959K(EnumC26455a.ALL, EnumC26455a.STRAIN, EnumC26455a.RECOVERY, EnumC26455a.SLEEP) : list4, (i13 & 64) != 0 ? EnumC26455a.ALL : enumC26455a, (i13 & 128) != 0 ? null : textResource2, (i13 & 256) != 0 ? Boolean.TRUE : bool, (i13 & 512) != 0 ? false : z4);
    }
}
