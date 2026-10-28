package ed1;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4351m;
import com.whoop.design.showcase.navigation.DesignShowcaseNavigationEvent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import wr2.InterfaceC37576d;
import yb3.C39412p;

/* JADX INFO: renamed from: ed1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b&\u0010\u0013¨\u0006/"}, m65681d2 = {"Led1/b;", "Lm91/u;", "Lwr2/d;", "", "text", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "navigationEvent", NotificationCompat.CATEGORY_EVENT, "location", "", "showLocation", "Lkotlin/Function0;", "Ll83/a0;", "preview", "<init>", "(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Ljava/lang/String;Ljava/lang/String;ZLc93/m;)V", "f", "(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Ljava/lang/String;Ljava/lang/String;ZLc93/m;)Led1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "l", "b", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "i", "()Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "c", "getEvent", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Z", "k", "()Z", "Lc93/m;", "j", "()Lc93/m;", "g", "userFacingText", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13113b implements InterfaceC25312u, InterfaceC37576d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DesignShowcaseNavigationEvent navigationEvent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String event;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String location;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showLocation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4351m preview;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String userFacingText;

    public C13113b(String text, DesignShowcaseNavigationEvent navigationEvent, String event, String location, boolean z4, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(location, "location");
        this.text = text;
        this.navigationEvent = navigationEvent;
        this.event = event;
        this.location = location;
        this.showLocation = z4;
        this.preview = interfaceC4351m;
        this.userFacingText = text;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C13113b m36660g(C13113b c13113b, String str, DesignShowcaseNavigationEvent designShowcaseNavigationEvent, String str2, String str3, boolean z4, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c13113b.text;
        }
        if ((i13 & 2) != 0) {
            designShowcaseNavigationEvent = c13113b.navigationEvent;
        }
        if ((i13 & 4) != 0) {
            str2 = c13113b.event;
        }
        if ((i13 & 8) != 0) {
            str3 = c13113b.location;
        }
        if ((i13 & 16) != 0) {
            z4 = c13113b.showLocation;
        }
        if ((i13 & 32) != 0) {
            interfaceC4351m = c13113b.preview;
        }
        boolean z13 = z4;
        InterfaceC4351m interfaceC4351m2 = interfaceC4351m;
        return c13113b.m36661f(str, designShowcaseNavigationEvent, str2, str3, z13, interfaceC4351m2);
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: a */
    public /* bridge */ C39412p getSearchQueryDelimiter() {
        return super.getSearchQueryDelimiter();
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: b */
    public /* bridge */ List<String> mo30154b() {
        return super.mo30154b();
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: c */
    public /* bridge */ Iterable<String> mo30155c() {
        return super.mo30155c();
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUserFacingText() {
        return this.userFacingText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13113b)) {
            return false;
        }
        C13113b c13113b = (C13113b) other;
        return AbstractC22676k.m65745e(this.text, c13113b.text) && AbstractC22676k.m65745e(this.navigationEvent, c13113b.navigationEvent) && AbstractC22676k.m65745e(this.event, c13113b.event) && AbstractC22676k.m65745e(this.location, c13113b.location) && this.showLocation == c13113b.showLocation && AbstractC22676k.m65745e(this.preview, c13113b.preview);
    }

    /* JADX INFO: renamed from: f */
    public final C13113b m36661f(String text, DesignShowcaseNavigationEvent navigationEvent, String event, String location, boolean showLocation, InterfaceC4351m preview) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(location, "location");
        return new C13113b(text, navigationEvent, event, location, showLocation, preview);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.navigationEvent.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.event), 31, this.location), 31, this.showLocation);
        InterfaceC4351m interfaceC4351m = this.preview;
        return iM8289b + (interfaceC4351m == null ? 0 : interfaceC4351m.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final DesignShowcaseNavigationEvent getNavigationEvent() {
        return this.navigationEvent;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC4351m getPreview() {
        return this.preview;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowLocation() {
        return this.showLocation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public String toString() {
        String str = this.text;
        DesignShowcaseNavigationEvent designShowcaseNavigationEvent = this.navigationEvent;
        String str2 = this.event;
        String str3 = this.location;
        boolean z4 = this.showLocation;
        InterfaceC4351m interfaceC4351m = this.preview;
        StringBuilder sb4 = new StringBuilder("DesignShowcaseMenuItemState(text=");
        sb4.append(str);
        sb4.append(", navigationEvent=");
        sb4.append(designShowcaseNavigationEvent);
        sb4.append(", event=");
        AbstractC11266d.m30444B(sb4, str2, ", location=", str3, ", showLocation=");
        sb4.append(z4);
        sb4.append(", preview=");
        sb4.append(interfaceC4351m);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C13113b(String str, DesignShowcaseNavigationEvent designShowcaseNavigationEvent, String str2, String str3, boolean z4, InterfaceC4351m interfaceC4351m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        this(str, (i13 & 2) != 0 ? new DesignShowcaseNavigationEvent.PresentMenu(null, 1, null) : designShowcaseNavigationEvent, (i13 & 4) != 0 ? str : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : interfaceC4351m);
    }
}
