package v72;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: v72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lv72/d;", "", "<init>", "()V", "b", "c", "a", "Lv72/d$a;", "Lv72/d$b;", "Lv72/d$c;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35773d {

    /* JADX INFO: renamed from: v72.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lv72/d$a;", "Lv72/d;", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35773d {

        /* JADX INFO: renamed from: b */
        public static final int f152137b = ArticleTileModelEvent.Url.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ArticleTileModelEvent.Url event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArticleTileModelEvent.Url event) {
            super(null);
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ArticleTileModelEvent.Url getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.event, ((a) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "ArticleTileClicked(event=" + this.event + ")";
        }
    }

    /* JADX INFO: renamed from: v72.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lv72/d$b;", "Lv72/d;", "<init>", "()V", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC35773d {

        /* JADX INFO: renamed from: a */
        public static final b f152139a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: v72.d$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lv72/d$c;", "Lv72/d;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC35773d {

        /* JADX INFO: renamed from: b */
        public static final int f152140b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9598e navAction) {
            super(null);
            AbstractC22676k.m65750j(navAction, "navAction");
            this.navAction = navAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.navAction, ((c) other).navAction);
        }

        public int hashCode() {
            return this.navAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenWaitlistNavigation(navAction=", this.navAction, ")");
        }
    }

    public /* synthetic */ AbstractC35773d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35773d() {
    }
}
