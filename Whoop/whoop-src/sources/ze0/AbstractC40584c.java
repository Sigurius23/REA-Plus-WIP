package ze0;

import androidx.core.app.NotificationCompat;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kf0.C22436k;
import mf0.C25508g;
import ns1.AbstractC27104b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;

/* JADX INFO: renamed from: ze0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m65681d2 = {"Lze0/c;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "e", "c", "d", "b", "a", "Lze0/c$c;", "Lze0/c$e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40584c implements InterfaceC14875k {

    /* JADX INFO: renamed from: ze0.c$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lze0/c$a;", "", "", "title", "description", "Lze0/c$b;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lze0/c$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lze0/c$b;", "()Lze0/c$b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final b button;

        public a(String title, String description, b bVar) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            this.title = title;
            this.description = description;
            this.button = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.description, aVar.description) && AbstractC22676k.m65745e(this.button, aVar.button);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description);
            b bVar = this.button;
            return iM30450d + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.title;
            String str2 = this.description;
            b bVar = this.button;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("BottomSheetViewState(title=", str, ", description=", str2, ", button=");
            sbM32001t.append(bVar);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: ze0.c$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lze0/c$b;", "", "", "text", "Lze0/a;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;Lze0/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lze0/a;", "()Lze0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC40582a event;

        public b(String text, InterfaceC40582a interfaceC40582a) {
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
            this.event = interfaceC40582a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC40582a getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.text, bVar.text) && AbstractC22676k.m65745e(this.event, bVar.event);
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            InterfaceC40582a interfaceC40582a = this.event;
            return iHashCode + (interfaceC40582a == null ? 0 : interfaceC40582a.hashCode());
        }

        public String toString() {
            return "ButtonViewState(text=" + this.text + ", event=" + this.event + ")";
        }
    }

    /* JADX INFO: renamed from: ze0.c$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lze0/c$d;", "", "", "navigationTitle", "Lhy0/h1;", "tag", "<init>", "(Ljava/lang/String;Lhy0/h1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lhy0/h1;", "()Lhy0/h1;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: c */
        public static final int f174836c = C17750h1.f69012w;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String navigationTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C17750h1 tag;

        public d(String navigationTitle, C17750h1 c17750h1) {
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            this.navigationTitle = navigationTitle;
            this.tag = c17750h1;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNavigationTitle() {
            return this.navigationTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C17750h1 getTag() {
            return this.tag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.navigationTitle, dVar.navigationTitle) && AbstractC22676k.m65745e(this.tag, dVar.tag);
        }

        public int hashCode() {
            int iHashCode = this.navigationTitle.hashCode() * 31;
            C17750h1 c17750h1 = this.tag;
            return iHashCode + (c17750h1 == null ? 0 : c17750h1.hashCode());
        }

        public String toString() {
            return "NavigationBarViewState(navigationTitle=" + this.navigationTitle + ", tag=" + this.tag + ")";
        }
    }

    /* JADX INFO: renamed from: ze0.c$e */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m65681d2 = {"Lze0/c$e;", "Lze0/c;", "<init>", "()V", "Lze0/c$a;", "b", "()Lze0/c$a;", "bottomSheet", "a", "c", "Lze0/c$e$a;", "Lze0/c$e$b;", "Lze0/c$e$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class e extends AbstractC40584c {

        /* JADX INFO: renamed from: ze0.c$e$a */
        @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lze0/c$e$a;", "Lze0/c$e;", "Lze0/c$d;", "navigationBar", "Lze0/c$a;", "bottomSheet", "Lmf0/g;", "testInputViewState", "<init>", "(Lze0/c$d;Lze0/c$a;Lmf0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lze0/c$d;", "getNavigationBar", "()Lze0/c$d;", "c", "Lze0/c$a;", "()Lze0/c$a;", "d", "Lmf0/g;", "()Lmf0/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends e {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final d navigationBar;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final a bottomSheet;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final C25508g testInputViewState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d navigationBar, a aVar, C25508g testInputViewState) {
                super(null);
                AbstractC22676k.m65750j(navigationBar, "navigationBar");
                AbstractC22676k.m65750j(testInputViewState, "testInputViewState");
                this.navigationBar = navigationBar;
                this.bottomSheet = aVar;
                this.testInputViewState = testInputViewState;
            }

            @Override // ze0.AbstractC40584c.e
            /* JADX INFO: renamed from: b, reason: from getter */
            public a getBottomSheet() {
                return this.bottomSheet;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C25508g getTestInputViewState() {
                return this.testInputViewState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.navigationBar, aVar.navigationBar) && AbstractC22676k.m65745e(this.bottomSheet, aVar.bottomSheet) && AbstractC22676k.m65745e(this.testInputViewState, aVar.testInputViewState);
            }

            public int hashCode() {
                int iHashCode = this.navigationBar.hashCode() * 31;
                a aVar = this.bottomSheet;
                return this.testInputViewState.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
            }

            public String toString() {
                return "Input(navigationBar=" + this.navigationBar + ", bottomSheet=" + this.bottomSheet + ", testInputViewState=" + this.testInputViewState + ")";
            }
        }

        /* JADX INFO: renamed from: ze0.c$e$b */
        @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b \u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u0014¨\u00061"}, m65681d2 = {"Lze0/c$e$b;", "Lze0/c$e;", "Lze0/c$d;", "navigationBar", "Lze0/c$a;", "bottomSheet", "", "coachFooter", "Lze0/c$b;", "reuploadButton", "saveButton", "", "Lns1/b;", "processedFiles", "", "processedFileCount", "processedFileTypes", "<init>", "(Lze0/c$d;Lze0/c$a;Ljava/lang/String;Lze0/c$b;Lze0/c$b;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lze0/c$d;", "d", "()Lze0/c$d;", "c", "Lze0/c$a;", "()Lze0/c$a;", "Ljava/lang/String;", "e", "Lze0/c$b;", "f", "()Lze0/c$b;", "g", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/Integer;", "getProcessedFileCount", "()Ljava/lang/Integer;", "i", "getProcessedFileTypes", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends e {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final d navigationBar;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final a bottomSheet;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String coachFooter;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final b reuploadButton;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final b saveButton;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final List<AbstractC27104b> processedFiles;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final Integer processedFileCount;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final String processedFileTypes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(d navigationBar, a aVar, String str, b reuploadButton, b saveButton, List<? extends AbstractC27104b> processedFiles, Integer num, String str2) {
                super(null);
                AbstractC22676k.m65750j(navigationBar, "navigationBar");
                AbstractC22676k.m65750j(reuploadButton, "reuploadButton");
                AbstractC22676k.m65750j(saveButton, "saveButton");
                AbstractC22676k.m65750j(processedFiles, "processedFiles");
                this.navigationBar = navigationBar;
                this.bottomSheet = aVar;
                this.coachFooter = str;
                this.reuploadButton = reuploadButton;
                this.saveButton = saveButton;
                this.processedFiles = processedFiles;
                this.processedFileCount = num;
                this.processedFileTypes = str2;
            }

            @Override // ze0.AbstractC40584c.e
            /* JADX INFO: renamed from: b, reason: from getter */
            public a getBottomSheet() {
                return this.bottomSheet;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getCoachFooter() {
                return this.coachFooter;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public d getNavigationBar() {
                return this.navigationBar;
            }

            /* JADX INFO: renamed from: e */
            public final List<AbstractC27104b> m131605e() {
                return this.processedFiles;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.navigationBar, bVar.navigationBar) && AbstractC22676k.m65745e(this.bottomSheet, bVar.bottomSheet) && AbstractC22676k.m65745e(this.coachFooter, bVar.coachFooter) && AbstractC22676k.m65745e(this.reuploadButton, bVar.reuploadButton) && AbstractC22676k.m65745e(this.saveButton, bVar.saveButton) && AbstractC22676k.m65745e(this.processedFiles, bVar.processedFiles) && AbstractC22676k.m65745e(this.processedFileCount, bVar.processedFileCount) && AbstractC22676k.m65745e(this.processedFileTypes, bVar.processedFileTypes);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final b getReuploadButton() {
                return this.reuploadButton;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final b getSaveButton() {
                return this.saveButton;
            }

            public int hashCode() {
                int iHashCode = this.navigationBar.hashCode() * 31;
                a aVar = this.bottomSheet;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str = this.coachFooter;
                int iM31983b = AbstractC11895b.m31983b((this.saveButton.hashCode() + ((this.reuploadButton.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.processedFiles);
                Integer num = this.processedFileCount;
                int iHashCode3 = (iM31983b + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.processedFileTypes;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Preview(navigationBar=" + this.navigationBar + ", bottomSheet=" + this.bottomSheet + ", coachFooter=" + this.coachFooter + ", reuploadButton=" + this.reuploadButton + ", saveButton=" + this.saveButton + ", processedFiles=" + this.processedFiles + ", processedFileCount=" + this.processedFileCount + ", processedFileTypes=" + this.processedFileTypes + ")";
            }
        }

        /* JADX INFO: renamed from: ze0.c$e$c */
        @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u001d\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, m65681d2 = {"Lze0/c$e$c;", "Lze0/c$e;", "Lze0/c$d;", "navigationBar", "Lze0/c$a;", "bottomSheet", "", "Lkf0/k;", "sections", "Lze0/c$b;", "fileSelectButton", "imageSelectButton", "<init>", "(Lze0/c$d;Lze0/c$a;Ljava/util/List;Lze0/c$b;Lze0/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lze0/c$d;", "e", "()Lze0/c$d;", "c", "Lze0/c$a;", "()Lze0/c$a;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lze0/c$b;", "()Lze0/c$b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends e {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final d navigationBar;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final a bottomSheet;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final List<C22436k> sections;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final b fileSelectButton;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final b imageSelectButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d navigationBar, a aVar, List<C22436k> sections, b fileSelectButton, b imageSelectButton) {
                super(null);
                AbstractC22676k.m65750j(navigationBar, "navigationBar");
                AbstractC22676k.m65750j(sections, "sections");
                AbstractC22676k.m65750j(fileSelectButton, "fileSelectButton");
                AbstractC22676k.m65750j(imageSelectButton, "imageSelectButton");
                this.navigationBar = navigationBar;
                this.bottomSheet = aVar;
                this.sections = sections;
                this.fileSelectButton = fileSelectButton;
                this.imageSelectButton = imageSelectButton;
            }

            @Override // ze0.AbstractC40584c.e
            /* JADX INFO: renamed from: b, reason: from getter */
            public a getBottomSheet() {
                return this.bottomSheet;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final b getFileSelectButton() {
                return this.fileSelectButton;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final b getImageSelectButton() {
                return this.imageSelectButton;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public d getNavigationBar() {
                return this.navigationBar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return AbstractC22676k.m65745e(this.navigationBar, cVar.navigationBar) && AbstractC22676k.m65745e(this.bottomSheet, cVar.bottomSheet) && AbstractC22676k.m65745e(this.sections, cVar.sections) && AbstractC22676k.m65745e(this.fileSelectButton, cVar.fileSelectButton) && AbstractC22676k.m65745e(this.imageSelectButton, cVar.imageSelectButton);
            }

            /* JADX INFO: renamed from: f */
            public final List<C22436k> m131611f() {
                return this.sections;
            }

            public int hashCode() {
                int iHashCode = this.navigationBar.hashCode() * 31;
                a aVar = this.bottomSheet;
                return this.imageSelectButton.hashCode() + ((this.fileSelectButton.hashCode() + AbstractC11895b.m31983b((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.sections)) * 31);
            }

            public String toString() {
                return "Upload(navigationBar=" + this.navigationBar + ", bottomSheet=" + this.bottomSheet + ", sections=" + this.sections + ", fileSelectButton=" + this.fileSelectButton + ", imageSelectButton=" + this.imageSelectButton + ")";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public abstract a getBottomSheet();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC40584c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (!(this instanceof c)) {
            if (this instanceof e) {
                return ScreenState.SUCCESS;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC33208p0 type = ((c) this).getModalState().getType();
        if (AbstractC22676k.m65745e(type, AbstractC33208p0.c.f138471e)) {
            return ScreenState.LOADING;
        }
        if (type instanceof AbstractC33208p0.b) {
            return ScreenState.ERROR;
        }
        return type instanceof AbstractC33208p0.h ? ScreenState.SUCCESS : ScreenState.OTHER;
    }

    private AbstractC40584c() {
    }

    /* JADX INFO: renamed from: ze0.c$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lze0/c$c;", "Lze0/c;", "Lsz0/q0;", "modalState", "Lze0/a;", "primaryClickEvent", "secondaryClickEvent", "<init>", "(Lsz0/q0;Lze0/a;Lze0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lsz0/q0;", "()Lsz0/q0;", "c", "Lze0/a;", "()Lze0/a;", "d", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC40584c {

        /* JADX INFO: renamed from: e */
        public static final int f174832e = C33211q0.f138501k;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C33211q0 modalState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC40582a primaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC40582a secondaryClickEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C33211q0 modalState, InterfaceC40582a interfaceC40582a, InterfaceC40582a interfaceC40582a2) {
            super(null);
            AbstractC22676k.m65750j(modalState, "modalState");
            this.modalState = modalState;
            this.primaryClickEvent = interfaceC40582a;
            this.secondaryClickEvent = interfaceC40582a2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C33211q0 getModalState() {
            return this.modalState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC40582a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC40582a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.modalState, cVar.modalState) && AbstractC22676k.m65745e(this.primaryClickEvent, cVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, cVar.secondaryClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.modalState.hashCode() * 31;
            InterfaceC40582a interfaceC40582a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC40582a == null ? 0 : interfaceC40582a.hashCode())) * 31;
            InterfaceC40582a interfaceC40582a2 = this.secondaryClickEvent;
            return iHashCode2 + (interfaceC40582a2 != null ? interfaceC40582a2.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(modalState=" + this.modalState + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ c(C33211q0 c33211q0, InterfaceC40582a interfaceC40582a, InterfaceC40582a interfaceC40582a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC40582a, (i13 & 4) != 0 ? null : interfaceC40582a2);
        }
    }
}
