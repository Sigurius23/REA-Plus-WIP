package gg0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ny0.C27256h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: gg0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lgg0/a;", "", "m", "i", "j", "d", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "b", "c", "g", "a", "l", "k", "Lgg0/a$a;", "Lgg0/a$h;", "Lgg0/a$m;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC15822a {

    /* JADX INFO: renamed from: gg0.a$a */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lgg0/a$a;", "Lgg0/a;", "Lgg0/a$d;", "Lgg0/a$g;", "Lgg0/a$k;", "Lgg0/a$l;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC15822a {
    }

    /* JADX INFO: renamed from: gg0.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgg0/a$b;", "Lgg0/a$h;", "Lm91/u;", "itemViewState", "<init>", "(Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "()Lm91/u;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC25312u itemViewState;

        public b(InterfaceC25312u itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            this.itemViewState = itemViewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25312u getItemViewState() {
            return this.itemViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.itemViewState, ((b) other).itemViewState);
        }

        public int hashCode() {
            return this.itemViewState.hashCode();
        }

        public String toString() {
            return AbstractC38963t7.m124379i(this.itemViewState, "AppDrivenNavigation(itemViewState=", ")");
        }
    }

    /* JADX INFO: renamed from: gg0.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgg0/a$c;", "Lgg0/a$h;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements h {

        /* JADX INFO: renamed from: b */
        public static final int f59718b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        public c(C9598e navAction) {
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
            return AbstractC33745d.m106650i("BackendDrivenNavigation(navAction=", this.navAction, ")");
        }
    }

    /* JADX INFO: renamed from: gg0.a$d */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lgg0/a$d;", "Lgg0/a$m;", "Lgg0/a$a;", "Lny0/h;", "cardButtonState", "", "selectedSegmentId", "", "isFromDialog", "<init>", "(Lny0/h;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lny0/h;", "()Lny0/h;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements m, a {

        /* JADX INFO: renamed from: d */
        public static final int f59720d = C27256h.f109055z;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27256h cardButtonState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isFromDialog;

        public d(C27256h cardButtonState, String selectedSegmentId, boolean z4) {
            AbstractC22676k.m65750j(cardButtonState, "cardButtonState");
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            this.cardButtonState = cardButtonState;
            this.selectedSegmentId = selectedSegmentId;
            this.isFromDialog = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C27256h getCardButtonState() {
            return this.cardButtonState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsFromDialog() {
            return this.isFromDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.cardButtonState, dVar.cardButtonState) && AbstractC22676k.m65745e(this.selectedSegmentId, dVar.selectedSegmentId) && this.isFromDialog == dVar.isFromDialog;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromDialog) + AbstractC11266d.m30450d(this.cardButtonState.hashCode() * 31, 31, this.selectedSegmentId);
        }

        public String toString() {
            C27256h c27256h = this.cardButtonState;
            String str = this.selectedSegmentId;
            boolean z4 = this.isFromDialog;
            StringBuilder sb4 = new StringBuilder("CardButtonClicked(cardButtonState=");
            sb4.append(c27256h);
            sb4.append(", selectedSegmentId=");
            sb4.append(str);
            sb4.append(", isFromDialog=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: gg0.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgg0/a$e;", "Lgg0/a$m;", "<init>", "()V", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements m {

        /* JADX INFO: renamed from: a */
        public static final e f59724a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: gg0.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgg0/a$f;", "Lgg0/a$h;", "<init>", "()V", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements h {

        /* JADX INFO: renamed from: a */
        public static final f f59725a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: gg0.a$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lgg0/a$g;", "", "Lgg0/a$a;", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "element", "<init>", "(Ljava/lang/Object;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lm91/u;", "()Lm91/u;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC15822a, a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25312u element;

        public g(Object event, InterfaceC25312u element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            this.event = event;
            this.element = element;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25312u getElement() {
            return this.element;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.event, gVar.event) && AbstractC22676k.m65745e(this.element, gVar.element);
        }

        public int hashCode() {
            return this.element.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return AbstractC33745d.m106652k("ItemClicked(event=", this.event, ", element=", this.element, ")");
        }
    }

    /* JADX INFO: renamed from: gg0.a$h */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lgg0/a$h;", "Lgg0/a;", "Lgg0/a$b;", "Lgg0/a$c;", "Lgg0/a$f;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface h extends InterfaceC15822a {
    }

    /* JADX INFO: renamed from: gg0.a$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lgg0/a$i;", "Lgg0/a$m;", "", "source", "testCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testCount;

        public i(String source, String testCount) {
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(testCount, "testCount");
            this.source = source;
            this.testCount = testCount;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestCount() {
            return this.testCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.source, iVar.source) && AbstractC22676k.m65745e(this.testCount, iVar.testCount);
        }

        public int hashCode() {
            return this.testCount.hashCode() + (this.source.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("Refresh(source=", this.source, ", testCount=", this.testCount, ")");
        }
    }

    /* JADX INFO: renamed from: gg0.a$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgg0/a$j;", "Lgg0/a$m;", "", "selectedSegmentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedSegmentId;

        public j(String selectedSegmentId) {
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            this.selectedSegmentId = selectedSegmentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.selectedSegmentId, ((j) other).selectedSegmentId);
        }

        public int hashCode() {
            return this.selectedSegmentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SegmentSelected(selectedSegmentId=", this.selectedSegmentId, ")");
        }
    }

    /* JADX INFO: renamed from: gg0.a$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lgg0/a$k;", "Lgg0/a$a;", "", "testsChangingTo", "testsChangingFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testsChangingTo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testsChangingFrom;

        public k(String testsChangingTo, String testsChangingFrom) {
            AbstractC22676k.m65750j(testsChangingTo, "testsChangingTo");
            AbstractC22676k.m65750j(testsChangingFrom, "testsChangingFrom");
            this.testsChangingTo = testsChangingTo;
            this.testsChangingFrom = testsChangingFrom;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTestsChangingFrom() {
            return this.testsChangingFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestsChangingTo() {
            return this.testsChangingTo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.testsChangingTo, kVar.testsChangingTo) && AbstractC22676k.m65745e(this.testsChangingFrom, kVar.testsChangingFrom);
        }

        public int hashCode() {
            return this.testsChangingFrom.hashCode() + (this.testsChangingTo.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("SwitchingModalPopAnalyticEvent(testsChangingTo=", this.testsChangingTo, ", testsChangingFrom=", this.testsChangingFrom, ")");
        }
    }

    /* JADX INFO: renamed from: gg0.a$l */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lgg0/a$l;", "Lgg0/a$a;", "", "source", "testCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testCount;

        public l(String source, String testCount) {
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(testCount, "testCount");
            this.source = source;
            this.testCount = testCount;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestCount() {
            return this.testCount;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.source, lVar.source) && AbstractC22676k.m65745e(this.testCount, lVar.testCount);
        }

        public int hashCode() {
            return this.testCount.hashCode() + (this.source.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("UpdateTestsScreenViewedAnalyticEvent(source=", this.source, ", testCount=", this.testCount, ")");
        }
    }

    /* JADX INFO: renamed from: gg0.a$m */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lgg0/a$m;", "Lgg0/a;", "Lgg0/a$d;", "Lgg0/a$e;", "Lgg0/a$i;", "Lgg0/a$j;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface m extends InterfaceC15822a {
    }
}
