package cj1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import f11.C14005e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import hy0.C17731c2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: cj1.v */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b#\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b'\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\b.\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107¨\u00068"}, m65681d2 = {"Lcj1/v;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "endIcon", "Lcj1/t;", "body", "Lf11/e;", "tickMarks", "Lcj1/u;", "footer", "Lny0/h;", "logButton", "Lcom/whoop/navigation/e;", "navigationAction", "Lhy0/c2;", "trend", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcj1/t;Lf11/e;Lcj1/u;Lny0/h;Lcom/whoop/navigation/e;Lhy0/c2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "getEndIcon", "()Lgz0/m0;", "c", "Lcj1/t;", "()Lcj1/t;", "d", "Lf11/e;", "f", "()Lf11/e;", "e", "Lcj1/u;", "()Lcj1/u;", "Lny0/h;", "()Lny0/h;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lhy0/c2;", "()Lhy0/c2;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4766v implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f19644i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4764t body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14005e tickMarks;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4765u footer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27256h logButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C9598e navigationAction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C17731c2 trend;

    static {
        int i13 = C17731c2.f68917p | C9598e.f28134d | C27256h.f109055z;
        int i14 = TextResource.$stable;
        f19644i = i13 | i14 | C14005e.f49972m | i14 | i14 | i14 | i14 | i14;
    }

    public C4766v(TextResource title, EnumC16313m0 endIcon, C4764t body, C14005e tickMarks, C4765u c4765u, C27256h c27256h, C9598e c9598e, C17731c2 c17731c2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(endIcon, "endIcon");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(tickMarks, "tickMarks");
        this.title = title;
        this.endIcon = endIcon;
        this.body = body;
        this.tickMarks = tickMarks;
        this.footer = c4765u;
        this.logButton = c27256h;
        this.navigationAction = c9598e;
        this.trend = c17731c2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4764t getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4765u getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getLogButton() {
        return this.logButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4766v)) {
            return false;
        }
        C4766v c4766v = (C4766v) other;
        return AbstractC22676k.m65745e(this.title, c4766v.title) && this.endIcon == c4766v.endIcon && AbstractC22676k.m65745e(this.body, c4766v.body) && AbstractC22676k.m65745e(this.tickMarks, c4766v.tickMarks) && AbstractC22676k.m65745e(this.footer, c4766v.footer) && AbstractC22676k.m65745e(this.logButton, c4766v.logButton) && AbstractC22676k.m65745e(this.navigationAction, c4766v.navigationAction) && AbstractC22676k.m65745e(this.trend, c4766v.trend);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C14005e getTickMarks() {
        return this.tickMarks;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iHashCode = (this.tickMarks.hashCode() + ((this.body.hashCode() + AbstractC17176i.m48500b(this.endIcon, this.title.hashCode() * 31, 31)) * 31)) * 31;
        C4765u c4765u = this.footer;
        int iHashCode2 = (iHashCode + (c4765u == null ? 0 : c4765u.hashCode())) * 31;
        C27256h c27256h = this.logButton;
        int iHashCode3 = (iHashCode2 + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        C9598e c9598e = this.navigationAction;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        C17731c2 c17731c2 = this.trend;
        return iHashCode4 + (c17731c2 != null ? c17731c2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        C4764t c4764t = this.body;
        C14005e c14005e = this.tickMarks;
        C4765u c4765u = this.footer;
        C27256h c27256h = this.logButton;
        C9598e c9598e = this.navigationAction;
        C17731c2 c17731c2 = this.trend;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("MenstrualCycleInsightsCardViewState(title=", textResource, ", endIcon=", enumC16313m0, ", body=");
        sbM61140k.append(c4764t);
        sbM61140k.append(", tickMarks=");
        sbM61140k.append(c14005e);
        sbM61140k.append(", footer=");
        sbM61140k.append(c4765u);
        sbM61140k.append(", logButton=");
        sbM61140k.append(c27256h);
        sbM61140k.append(", navigationAction=");
        sbM61140k.append(c9598e);
        sbM61140k.append(", trend=");
        sbM61140k.append(c17731c2);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }

    public /* synthetic */ C4766v(TextResource textResource, EnumC16313m0 enumC16313m0, C4764t c4764t, C14005e c14005e, C4765u c4765u, C27256h c27256h, C9598e c9598e, C17731c2 c17731c2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, enumC16313m0, c4764t, c14005e, c4765u, c27256h, c9598e, (i13 & 128) != 0 ? null : c17731c2);
    }
}
