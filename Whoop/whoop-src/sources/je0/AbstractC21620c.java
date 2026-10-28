package je0;

import androidx.core.app.NotificationCompat;
import c31.C3927k;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import fy1.InterfaceC14875k;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: je0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lje0/c;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lje0/c$a;", "Lje0/c$b;", "Lje0/c$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21620c implements InterfaceC14875k {

    /* JADX INFO: renamed from: je0.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lje0/c$a;", "Lje0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC21620c {

        /* JADX INFO: renamed from: b */
        public static final a f82981b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: je0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lje0/c$b;", "Lje0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21620c {

        /* JADX INFO: renamed from: b */
        public static final b f82982b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: je0.c$c */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0018\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006$"}, m65681d2 = {"Lje0/c$c;", "Lje0/c;", "", "title", "subtitle", "", "Lm91/u;", "items", "Lc31/k;", "button", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc31/k;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "c", "e", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lc31/k;", "()Lc31/k;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC21620c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C3927k button;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C9598e navigation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String title, String subtitle, List<? extends InterfaceC25312u> items, C3927k button, C9598e c9598e) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(button, "button");
            this.title = title;
            this.subtitle = subtitle;
            this.items = items;
            this.button = button;
            this.navigation = c9598e;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C3927k getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC25312u> m60805c() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C9598e getNavigation() {
            return this.navigation;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.items, cVar.items) && AbstractC22676k.m65745e(this.button, cVar.button) && AbstractC22676k.m65745e(this.navigation, cVar.navigation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = (this.button.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.items)) * 31;
            C9598e c9598e = this.navigation;
            return iHashCode + (c9598e == null ? 0 : c9598e.hashCode());
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            List<InterfaceC25312u> list = this.items;
            C3927k c3927k = this.button;
            C9598e c9598e = this.navigation;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Success(title=", str, ", subtitle=", str2, ", items=");
            sbM32001t.append(list);
            sbM32001t.append(", button=");
            sbM32001t.append(c3927k);
            sbM32001t.append(", navigation=");
            return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
        }
    }

    public /* synthetic */ AbstractC21620c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof b) {
            return ScreenState.LOADING;
        }
        if (this instanceof a) {
            return ScreenState.ERROR;
        }
        if (this instanceof c) {
            return ScreenState.SUCCESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC21620c() {
    }
}
