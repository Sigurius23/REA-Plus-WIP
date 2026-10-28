package pb0;

import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd0.C22383c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pb0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\t¨\u0006\n"}, m65681d2 = {"Lpb0/d;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "Lpb0/d$a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29053d implements InterfaceC14875k {

    /* JADX INFO: renamed from: pb0.d$a */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\\\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b$\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b\"\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lpb0/d$a;", "Lpb0/d;", "Lkd0/c$e;", "navigationBar", "", "title", "description", "", "Lpb0/b;", "checkboxes", "buttonLabel", "Lpb0/a;", "button", "", "isButtonEnabled", "<init>", "(Lkd0/c$e;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lpb0/a;Z)V", "b", "(Lkd0/c$e;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lpb0/a;Z)Lpb0/d$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd0/c$e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd0/c$e;", "c", "Ljava/lang/String;", "i", "d", "g", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lpb0/a;", "()Lpb0/a;", "Z", "j", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC29053d {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C22383c.e navigationBar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C29051b> checkboxes;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String buttonLabel;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C29050a button;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isButtonEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22383c.e navigationBar, String title, String description, List<C29051b> checkboxes, String buttonLabel, C29050a button, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(navigationBar, "navigationBar");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(checkboxes, "checkboxes");
            AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
            AbstractC22676k.m65750j(button, "button");
            this.navigationBar = navigationBar;
            this.title = title;
            this.description = description;
            this.checkboxes = checkboxes;
            this.buttonLabel = buttonLabel;
            this.button = button;
            this.isButtonEnabled = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ a m88304c(a aVar, C22383c.e eVar, String str, String str2, List list, String str3, C29050a c29050a, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                eVar = aVar.navigationBar;
            }
            if ((i13 & 2) != 0) {
                str = aVar.title;
            }
            if ((i13 & 4) != 0) {
                str2 = aVar.description;
            }
            if ((i13 & 8) != 0) {
                list = aVar.checkboxes;
            }
            if ((i13 & 16) != 0) {
                str3 = aVar.buttonLabel;
            }
            if ((i13 & 32) != 0) {
                c29050a = aVar.button;
            }
            if ((i13 & 64) != 0) {
                z4 = aVar.isButtonEnabled;
            }
            C29050a c29050a2 = c29050a;
            boolean z13 = z4;
            String str4 = str3;
            String str5 = str2;
            return aVar.m88305b(eVar, str, str5, list, str4, c29050a2, z13);
        }

        /* JADX INFO: renamed from: b */
        public final a m88305b(C22383c.e navigationBar, String title, String description, List<C29051b> checkboxes, String buttonLabel, C29050a button, boolean isButtonEnabled) {
            AbstractC22676k.m65750j(navigationBar, "navigationBar");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(checkboxes, "checkboxes");
            AbstractC22676k.m65750j(buttonLabel, "buttonLabel");
            AbstractC22676k.m65750j(button, "button");
            return new a(navigationBar, title, description, checkboxes, buttonLabel, button, isButtonEnabled);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C29050a getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.navigationBar, aVar.navigationBar) && AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.description, aVar.description) && AbstractC22676k.m65745e(this.checkboxes, aVar.checkboxes) && AbstractC22676k.m65745e(this.buttonLabel, aVar.buttonLabel) && AbstractC22676k.m65745e(this.button, aVar.button) && this.isButtonEnabled == aVar.isButtonEnabled;
        }

        /* JADX INFO: renamed from: f */
        public final List<C29051b> m88308f() {
            return this.checkboxes;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C22383c.e getNavigationBar() {
            return this.navigationBar;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isButtonEnabled) + ((this.button.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.title), 31, this.description), 31, this.checkboxes), 31, this.buttonLabel)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsButtonEnabled() {
            return this.isButtonEnabled;
        }

        public String toString() {
            C22383c.e eVar = this.navigationBar;
            String str = this.title;
            String str2 = this.description;
            List<C29051b> list = this.checkboxes;
            String str3 = this.buttonLabel;
            C29050a c29050a = this.button;
            boolean z4 = this.isButtonEnabled;
            StringBuilder sb4 = new StringBuilder("Success(navigationBar=");
            sb4.append(eVar);
            sb4.append(", title=");
            sb4.append(str);
            sb4.append(", description=");
            AbstractC36095b.m114694v(str2, ", checkboxes=", ", buttonLabel=", sb4, list);
            sb4.append(str3);
            sb4.append(", button=");
            sb4.append(c29050a);
            sb4.append(", isButtonEnabled=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    public /* synthetic */ AbstractC29053d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof a) {
            return ScreenState.SUCCESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC29053d() {
    }
}
