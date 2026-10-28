package cy0;

import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.C9598e;
import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import tu1.C34188a;

/* JADX INFO: renamed from: cy0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcy0/a;", "", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "g", "e", "b", "c", "f", "a", "j", "i", "Lcy0/a$a;", "Lcy0/a$g;", "Lcy0/a$k;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11182a {

    /* JADX INFO: renamed from: cy0.a$a */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lcy0/a$a;", "Lcy0/a;", "Lcy0/a$i;", "Lcy0/a$j;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC11182a {
    }

    /* JADX INFO: renamed from: cy0.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lcy0/a$b;", "Lcy0/a$g;", "Lm91/u;", "itemViewState", "", "source", "<init>", "(Lm91/u;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "()Lm91/u;", "b", "Ljava/lang/String;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC25312u itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public b(InterfaceC25312u itemViewState, String source) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(source, "source");
            this.itemViewState = itemViewState;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25312u getItemViewState() {
            return this.itemViewState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.itemViewState, bVar.itemViewState) && AbstractC22676k.m65745e(this.source, bVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.itemViewState.hashCode() * 31);
        }

        public String toString() {
            return "AppDrivenNavigation(itemViewState=" + this.itemViewState + ", source=" + this.source + ")";
        }
    }

    /* JADX INFO: renamed from: cy0.a$c */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcy0/a$c;", "Lcy0/a$g;", "Lcom/whoop/navigation/e;", "navAction", "", "source", "Lm91/u;", "itemViewState", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "c", "Lm91/u;", "()Lm91/u;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC25312u itemViewState;

        public c(C9598e navAction, String source, InterfaceC25312u interfaceC25312u) {
            AbstractC22676k.m65750j(navAction, "navAction");
            AbstractC22676k.m65750j(source, "source");
            this.navAction = navAction;
            this.source = source;
            this.itemViewState = interfaceC25312u;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25312u getItemViewState() {
            return this.itemViewState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.navAction, cVar.navAction) && AbstractC22676k.m65745e(this.source, cVar.source) && AbstractC22676k.m65745e(this.itemViewState, cVar.itemViewState);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.navAction.hashCode() * 31, 31, this.source);
            InterfaceC25312u interfaceC25312u = this.itemViewState;
            return iM30450d + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode());
        }

        public String toString() {
            return "BackendDrivenNavigation(navAction=" + this.navAction + ", source=" + this.source + ", itemViewState=" + this.itemViewState + ")";
        }
    }

    /* JADX INFO: renamed from: cy0.a$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcy0/a$d;", "Lcy0/a$k;", "Ltu1/a;", "state", "<init>", "(Ltu1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltu1/a;", "()Ltu1/a;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements k {

        /* JADX INFO: renamed from: b */
        public static final int f35806b = C34188a.f143397d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C34188a state;

        public d(C34188a c34188a) {
            this.state = c34188a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C34188a getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.state, ((d) other).state);
        }

        public int hashCode() {
            C34188a c34188a = this.state;
            if (c34188a == null) {
                return 0;
            }
            return c34188a.hashCode();
        }

        public String toString() {
            return "BottomSheetClicked(state=" + this.state + ")";
        }
    }

    /* JADX INFO: renamed from: cy0.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcy0/a$e;", "Lcy0/a$g;", "<init>", "()V", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements g {

        /* JADX INFO: renamed from: a */
        public static final e f35808a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: cy0.a$f */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, m65681d2 = {"Lcy0/a$f;", "", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "element", "", "source", "<init>", "(Ljava/lang/Object;Lm91/u;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lm91/u;", "()Lm91/u;", "c", "Ljava/lang/String;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC11182a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25312u element;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        public f(Object event, InterfaceC25312u element, String source) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            AbstractC22676k.m65750j(source, "source");
            this.event = event;
            this.element = element;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25312u getElement() {
            return this.element;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.event, fVar.event) && AbstractC22676k.m65745e(this.element, fVar.element) && AbstractC22676k.m65745e(this.source, fVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC11478a.m30851c(this.element, this.event.hashCode() * 31, 31);
        }

        public String toString() {
            Object obj = this.event;
            InterfaceC25312u interfaceC25312u = this.element;
            String str = this.source;
            StringBuilder sb4 = new StringBuilder("ItemClicked(event=");
            sb4.append(obj);
            sb4.append(", element=");
            sb4.append(interfaceC25312u);
            sb4.append(", source=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: cy0.a$g */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lcy0/a$g;", "Lcy0/a;", "Lcy0/a$b;", "Lcy0/a$c;", "Lcy0/a$e;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface g extends InterfaceC11182a {
    }

    /* JADX INFO: renamed from: cy0.a$h */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcy0/a$h;", "Lcy0/a$k;", "", "pillar", HttpHeaders.DATE, "", "manualRefresh", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "getManualRefresh", "()Z", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String pillar;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean manualRefresh;

        public h(String pillar, String str, boolean z4) {
            AbstractC22676k.m65750j(pillar, "pillar");
            this.pillar = pillar;
            this.date = str;
            this.manualRefresh = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPillar() {
            return this.pillar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.pillar, hVar.pillar) && AbstractC22676k.m65745e(this.date, hVar.date) && this.manualRefresh == hVar.manualRefresh;
        }

        public int hashCode() {
            int iHashCode = this.pillar.hashCode() * 31;
            String str = this.date;
            return Boolean.hashCode(this.manualRefresh) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.pillar;
            String str2 = this.date;
            return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("Refresh(pillar=", str, ", date=", str2, ", manualRefresh="), this.manualRefresh, ")");
        }

        public /* synthetic */ h(String str, String str2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i13 & 4) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: cy0.a$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lcy0/a$i;", "Lcy0/a$a;", "", "label", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        public i(String label, String source) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(source, "source");
            this.label = label;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.label, iVar.label) && AbstractC22676k.m65745e(this.source, iVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + (this.label.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ScreenViewEvent(label=", this.label, ", source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: cy0.a$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcy0/a$j;", "Lcy0/a$a;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        public j(String source) {
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.source, ((j) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ScrolledToBottomAnalyticEvent(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: cy0.a$k */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lcy0/a$k;", "Lcy0/a;", "Lcy0/a$d;", "Lcy0/a$h;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface k extends InterfaceC11182a {
    }
}
