package ji2;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ji2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b$\u0010!R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b\"\u0010'\"\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b.\u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b+\u0010!R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b\u001e\u00101R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b/\u0010!R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u0010\u0017R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b(\u0010'¨\u00064"}, m65681d2 = {"Lji2/e;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "searchQuery", "", "displayKeyboard", "searchPlaceHolder", "description", "allTextDisplay", "allActivities", "popularTitle", "otherTitle", "", "Lji2/c;", "activities", "saveSelectionDisplay", "", "templateName", "automaticallyImportEnabled", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "b", "k", "c", "Z", "f", "()Z", "d", "j", "e", "g", "setAllActivities", "(Z)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ljava/util/List;", "()Ljava/util/List;", "l", "Ljava/lang/String;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21726e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource searchQuery;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean displayKeyboard;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource searchPlaceHolder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource allTextDisplay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean allActivities;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource popularTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource otherTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<C21724c> activities;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource saveSelectionDisplay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String templateName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean automaticallyImportEnabled;

    public C21726e(TextResource titleDisplay, TextResource searchQuery, boolean z4, TextResource searchPlaceHolder, TextResource description, TextResource allTextDisplay, boolean z13, TextResource popularTitle, TextResource otherTitle, List<C21724c> activities, TextResource saveSelectionDisplay, String templateName, boolean z14) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        AbstractC22676k.m65750j(searchPlaceHolder, "searchPlaceHolder");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(allTextDisplay, "allTextDisplay");
        AbstractC22676k.m65750j(popularTitle, "popularTitle");
        AbstractC22676k.m65750j(otherTitle, "otherTitle");
        AbstractC22676k.m65750j(activities, "activities");
        AbstractC22676k.m65750j(saveSelectionDisplay, "saveSelectionDisplay");
        AbstractC22676k.m65750j(templateName, "templateName");
        this.titleDisplay = titleDisplay;
        this.searchQuery = searchQuery;
        this.displayKeyboard = z4;
        this.searchPlaceHolder = searchPlaceHolder;
        this.description = description;
        this.allTextDisplay = allTextDisplay;
        this.allActivities = z13;
        this.popularTitle = popularTitle;
        this.otherTitle = otherTitle;
        this.activities = activities;
        this.saveSelectionDisplay = saveSelectionDisplay;
        this.templateName = templateName;
        this.automaticallyImportEnabled = z14;
    }

    /* JADX INFO: renamed from: a */
    public final List<C21724c> m61215a() {
        return this.activities;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllActivities() {
        return this.allActivities;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getAllTextDisplay() {
        return this.allTextDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAutomaticallyImportEnabled() {
        return this.automaticallyImportEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21726e)) {
            return false;
        }
        C21726e c21726e = (C21726e) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c21726e.titleDisplay) && AbstractC22676k.m65745e(this.searchQuery, c21726e.searchQuery) && this.displayKeyboard == c21726e.displayKeyboard && AbstractC22676k.m65745e(this.searchPlaceHolder, c21726e.searchPlaceHolder) && AbstractC22676k.m65745e(this.description, c21726e.description) && AbstractC22676k.m65745e(this.allTextDisplay, c21726e.allTextDisplay) && this.allActivities == c21726e.allActivities && AbstractC22676k.m65745e(this.popularTitle, c21726e.popularTitle) && AbstractC22676k.m65745e(this.otherTitle, c21726e.otherTitle) && AbstractC22676k.m65745e(this.activities, c21726e.activities) && AbstractC22676k.m65745e(this.saveSelectionDisplay, c21726e.saveSelectionDisplay) && AbstractC22676k.m65745e(this.templateName, c21726e.templateName) && this.automaticallyImportEnabled == c21726e.automaticallyImportEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDisplayKeyboard() {
        return this.displayKeyboard;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getOtherTitle() {
        return this.otherTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getPopularTitle() {
        return this.popularTitle;
    }

    public int hashCode() {
        return Boolean.hashCode(this.automaticallyImportEnabled) + AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.searchQuery, 31), 31, this.displayKeyboard), this.searchPlaceHolder, 31), this.description, 31), this.allTextDisplay, 31), 31, this.allActivities), this.popularTitle, 31), this.otherTitle, 31), 31, this.activities), this.saveSelectionDisplay, 31), 31, this.templateName);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getSaveSelectionDisplay() {
        return this.saveSelectionDisplay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getSearchPlaceHolder() {
        return this.searchPlaceHolder;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.searchQuery;
        boolean z4 = this.displayKeyboard;
        TextResource textResource3 = this.searchPlaceHolder;
        TextResource textResource4 = this.description;
        TextResource textResource5 = this.allTextDisplay;
        boolean z13 = this.allActivities;
        TextResource textResource6 = this.popularTitle;
        TextResource textResource7 = this.otherTitle;
        List<C21724c> list = this.activities;
        TextResource textResource8 = this.saveSelectionDisplay;
        String str = this.templateName;
        boolean z14 = this.automaticallyImportEnabled;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StravaSelectedActivities(titleDisplay=", textResource, ", searchQuery=", textResource2, ", displayKeyboard=");
        AbstractC21702c.m61144o(textResource3, ", searchPlaceHolder=", ", description=", sbM106658q, z4);
        AbstractC30007c.m91855y(sbM106658q, textResource4, ", allTextDisplay=", textResource5, ", allActivities=");
        AbstractC21702c.m61144o(textResource6, ", popularTitle=", ", otherTitle=", sbM106658q, z13);
        AbstractC21702c.m61143n(textResource7, ", activities=", ", saveSelectionDisplay=", sbM106658q, list);
        AbstractC30007c.m91856z(sbM106658q, textResource8, ", templateName=", str, ", automaticallyImportEnabled=");
        return AbstractC18489d0.m53372m(sbM106658q, z14, ")");
    }
}
