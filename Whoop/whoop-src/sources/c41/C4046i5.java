package c41;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import ny0.C27256h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c41.i5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\\\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b!\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lc41/i5;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lgz0/m0;", "icon", "", "completed", "Lny0/h;", "cardButtonState", "Lcom/whoop/navigation/e;", "destination", "", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;ZLny0/h;Lcom/whoop/navigation/e;Ljava/lang/Object;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;ZLny0/h;Lcom/whoop/navigation/e;Ljava/lang/Object;)Lc41/i5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Lgz0/m0;", "g", "()Lgz0/m0;", "Z", "e", "()Z", "Lny0/h;", "()Lny0/h;", "f", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4046i5 implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f16416h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean completed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27256h cardButtonState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object event;

    public C4046i5(TextResource title, TextResource subtitle, EnumC16313m0 enumC16313m0, boolean z4, C27256h c27256h, C9598e c9598e, Object event) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(event, "event");
        this.title = title;
        this.subtitle = subtitle;
        this.icon = enumC16313m0;
        this.completed = z4;
        this.cardButtonState = c27256h;
        this.destination = c9598e;
        this.event = event;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4046i5 m12346b(C4046i5 c4046i5, TextResource textResource, TextResource textResource2, EnumC16313m0 enumC16313m0, boolean z4, C27256h c27256h, C9598e c9598e, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            textResource = c4046i5.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c4046i5.subtitle;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = c4046i5.icon;
        }
        if ((i13 & 8) != 0) {
            z4 = c4046i5.completed;
        }
        if ((i13 & 16) != 0) {
            c27256h = c4046i5.cardButtonState;
        }
        if ((i13 & 32) != 0) {
            c9598e = c4046i5.destination;
        }
        if ((i13 & 64) != 0) {
            obj = c4046i5.event;
        }
        C9598e c9598e2 = c9598e;
        Object obj3 = obj;
        C27256h c27256h2 = c27256h;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        return c4046i5.m12347a(textResource, textResource2, enumC16313m1, z4, c27256h2, c9598e2, obj3);
    }

    /* JADX INFO: renamed from: a */
    public final C4046i5 m12347a(TextResource title, TextResource subtitle, EnumC16313m0 icon, boolean completed, C27256h cardButtonState, C9598e destination, Object event) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(event, "event");
        return new C4046i5(title, subtitle, icon, completed, cardButtonState, destination, event);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getCardButtonState() {
        return this.cardButtonState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4046i5)) {
            return false;
        }
        C4046i5 c4046i5 = (C4046i5) other;
        return AbstractC22676k.m65745e(this.title, c4046i5.title) && AbstractC22676k.m65745e(this.subtitle, c4046i5.subtitle) && this.icon == c4046i5.icon && this.completed == c4046i5.completed && AbstractC22676k.m65745e(this.cardButtonState, c4046i5.cardButtonState) && AbstractC22676k.m65745e(this.destination, c4046i5.destination) && AbstractC22676k.m65745e(this.event, c4046i5.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31);
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM8289b = AbstractC2875y.m8289b((iM95625a + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31, this.completed);
        C27256h c27256h = this.cardButtonState;
        int iHashCode = (iM8289b + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return this.event.hashCode() + ((iHashCode + (c9598e != null ? c9598e.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        boolean z4 = this.completed;
        C27256h c27256h = this.cardButtonState;
        C9598e c9598e = this.destination;
        Object obj = this.event;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StatusTileState(title=", textResource, ", subtitle=", textResource2, ", icon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", completed=");
        sbM106658q.append(z4);
        sbM106658q.append(", cardButtonState=");
        sbM106658q.append(c27256h);
        sbM106658q.append(", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", event=");
        return AbstractC2875y.m8303p(sbM106658q, ")", obj);
    }

    public /* synthetic */ C4046i5(TextResource textResource, TextResource textResource2, EnumC16313m0 enumC16313m0, boolean z4, C27256h c27256h, C9598e c9598e, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, (i13 & 4) != 0 ? null : enumC16313m0, z4, c27256h, (i13 & 32) != 0 ? null : c9598e, (i13 & 64) != 0 ? C23454a0.f92919a : obj);
    }
}
