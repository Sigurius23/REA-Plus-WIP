package jm1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p01.C28582b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: jm1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001d\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006*"}, m65681d2 = {"Ljm1/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "body", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "", "completedStepsText", "totalStepsText", "Lp01/b;", "circularProgressIndicator", "", "completed", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lp01/b;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lcom/whoop/navigation/e;", "f", "()Lcom/whoop/navigation/e;", "d", "Ljava/lang/String;", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lp01/b;", "()Lp01/b;", "Z", "()Z", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21793d implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f83939h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String completedStepsText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String totalStepsText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C28582b circularProgressIndicator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean completed;

    static {
        int i13 = C28582b.f115652u | C9598e.f28134d;
        int i14 = TextResource.$stable;
        f83939h = i13 | i14 | i14;
    }

    public C21793d(TextResource title, TextResource body, C9598e navigation, String completedStepsText, String totalStepsText, C28582b circularProgressIndicator, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(navigation, "navigation");
        AbstractC22676k.m65750j(completedStepsText, "completedStepsText");
        AbstractC22676k.m65750j(totalStepsText, "totalStepsText");
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        this.title = title;
        this.body = body;
        this.navigation = navigation;
        this.completedStepsText = completedStepsText;
        this.totalStepsText = totalStepsText;
        this.circularProgressIndicator = circularProgressIndicator;
        this.completed = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C28582b getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCompletedStepsText() {
        return this.completedStepsText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21793d)) {
            return false;
        }
        C21793d c21793d = (C21793d) other;
        return AbstractC22676k.m65745e(this.title, c21793d.title) && AbstractC22676k.m65745e(this.body, c21793d.body) && AbstractC22676k.m65745e(this.navigation, c21793d.navigation) && AbstractC22676k.m65745e(this.completedStepsText, c21793d.completedStepsText) && AbstractC22676k.m65745e(this.totalStepsText, c21793d.totalStepsText) && AbstractC22676k.m65745e(this.circularProgressIndicator, c21793d.circularProgressIndicator) && this.completed == c21793d.completed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTotalStepsText() {
        return this.totalStepsText;
    }

    public int hashCode() {
        return Boolean.hashCode(this.completed) + ((this.circularProgressIndicator.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC36095b.m114673a(this.navigation, AbstractC31061c.m95625a(this.title.hashCode() * 31, this.body, 31), 31), 31, this.completedStepsText), 31, this.totalStepsText)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.body;
        C9598e c9598e = this.navigation;
        String str = this.completedStepsText;
        String str2 = this.totalStepsText;
        C28582b c28582b = this.circularProgressIndicator;
        boolean z4 = this.completed;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CalibrationTimelineCardState(title=", textResource, ", body=", textResource2, ", navigation=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", completedStepsText=");
        sbM106658q.append(str);
        sbM106658q.append(", totalStepsText=");
        sbM106658q.append(str2);
        sbM106658q.append(", circularProgressIndicator=");
        sbM106658q.append(c28582b);
        sbM106658q.append(", completed=");
        return AbstractC18489d0.m53372m(sbM106658q, z4, ")");
    }

    public /* synthetic */ C21793d(TextResource textResource, TextResource textResource2, C9598e c9598e, String str, String str2, C28582b c28582b, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, c9598e, str, str2, c28582b, (i13 & 64) != 0 ? false : z4);
    }
}
