package va0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsAllRecordingBottomSheet;
import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: va0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lva0/c;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lva0/c$a;", "Lva0/c$b;", "Lva0/c$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35841c implements InterfaceC14875k {

    /* JADX INFO: renamed from: va0.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lva0/c$a;", "Lva0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC35841c {

        /* JADX INFO: renamed from: b */
        public static final a f152600b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: va0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lva0/c$b;", "Lva0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC35841c {

        /* JADX INFO: renamed from: b */
        public static final b f152601b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: va0.c$c */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lva0/c$c;", "Lva0/c;", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "title", "subtitle", "", "Lm91/u;", "sections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;", "bottomSheet", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "c", "Ljava/lang/String;", "e", "d", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;", "getBottomSheet", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC35841c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final NavigationBarModel navigationBar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<InterfaceC25312u> sections;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AdvancedLabsAllRecordingBottomSheet bottomSheet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(NavigationBarModel navigationBar, String title, String subtitle, List<? extends InterfaceC25312u> sections, AdvancedLabsAllRecordingBottomSheet advancedLabsAllRecordingBottomSheet) {
            super(null);
            AbstractC22676k.m65750j(navigationBar, "navigationBar");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(sections, "sections");
            this.navigationBar = navigationBar;
            this.title = title;
            this.subtitle = subtitle;
            this.sections = sections;
            this.bottomSheet = advancedLabsAllRecordingBottomSheet;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final NavigationBarModel getNavigationBar() {
            return this.navigationBar;
        }

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC25312u> m113756c() {
            return this.sections;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.navigationBar, cVar.navigationBar) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.sections, cVar.sections) && AbstractC22676k.m65745e(this.bottomSheet, cVar.bottomSheet);
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.sections);
            AdvancedLabsAllRecordingBottomSheet advancedLabsAllRecordingBottomSheet = this.bottomSheet;
            return iM31983b + (advancedLabsAllRecordingBottomSheet == null ? 0 : advancedLabsAllRecordingBottomSheet.hashCode());
        }

        public String toString() {
            NavigationBarModel navigationBarModel = this.navigationBar;
            String str = this.title;
            String str2 = this.subtitle;
            List<InterfaceC25312u> list = this.sections;
            AdvancedLabsAllRecordingBottomSheet advancedLabsAllRecordingBottomSheet = this.bottomSheet;
            StringBuilder sb4 = new StringBuilder("Success(navigationBar=");
            sb4.append(navigationBarModel);
            sb4.append(", title=");
            sb4.append(str);
            sb4.append(", subtitle=");
            AbstractC36095b.m114694v(str2, ", sections=", ", bottomSheet=", sb4, list);
            sb4.append(advancedLabsAllRecordingBottomSheet);
            sb4.append(")");
            return sb4.toString();
        }
    }

    public /* synthetic */ AbstractC35841c(DefaultConstructorMarker defaultConstructorMarker) {
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

    private AbstractC35841c() {
    }
}
