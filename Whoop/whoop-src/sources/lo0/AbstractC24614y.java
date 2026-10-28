package lo0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import fy1.InterfaceC14875k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: lo0.y */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Llo0/y;", "Lfy1/k;", "<init>", "()V", "d", "b", "c", "a", "Llo0/y$a;", "Llo0/y$b;", "Llo0/y$c;", "Llo0/y$d;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24614y implements InterfaceC14875k {

    /* JADX INFO: renamed from: lo0.y$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Llo0/y$a;", "Llo0/y;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC24614y {

        /* JADX INFO: renamed from: b */
        public static final a f96212b = new a();

        private a() {
            super(null);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return ScreenState.ERROR;
        }
    }

    /* JADX INFO: renamed from: lo0.y$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Llo0/y$b;", "Llo0/y;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC24614y {

        /* JADX INFO: renamed from: b */
        public static final b f96213b = new b();

        private b() {
            super(null);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return ScreenState.LOADING;
        }
    }

    /* JADX INFO: renamed from: lo0.y$c */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Llo0/y$c;", "Llo0/y;", "Lcom/whoop/design/util/TextResource;", "savingTitle", "savingSubtitle", "Lcom/whoop/navigation/e;", "saveSuccessDestination", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC24614y {

        /* JADX INFO: renamed from: e */
        public static final int f96214e;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource savingTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource savingSubtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C9598e saveSuccessDestination;

        static {
            int i13 = C9598e.f28134d;
            int i14 = TextResource.$stable;
            f96214e = i13 | i14 | i14;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource savingTitle, TextResource savingSubtitle, C9598e c9598e) {
            super(null);
            AbstractC22676k.m65750j(savingTitle, "savingTitle");
            AbstractC22676k.m65750j(savingSubtitle, "savingSubtitle");
            this.savingTitle = savingTitle;
            this.savingSubtitle = savingSubtitle;
            this.saveSuccessDestination = c9598e;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getSaveSuccessDestination() {
            return this.saveSuccessDestination;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getSavingSubtitle() {
            return this.savingSubtitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getSavingTitle() {
            return this.savingTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.savingTitle, cVar.savingTitle) && AbstractC22676k.m65745e(this.savingSubtitle, cVar.savingSubtitle) && AbstractC22676k.m65745e(this.saveSuccessDestination, cVar.saveSuccessDestination);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return ScreenState.OTHER;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(this.savingTitle.hashCode() * 31, this.savingSubtitle, 31);
            C9598e c9598e = this.saveSuccessDestination;
            return iM95625a + (c9598e == null ? 0 : c9598e.hashCode());
        }

        public String toString() {
            TextResource textResource = this.savingTitle;
            TextResource textResource2 = this.savingSubtitle;
            return AbstractC33745d.m106656o(AbstractC33745d.m106658q("Saving(savingTitle=", textResource, ", savingSubtitle=", textResource2, ", saveSuccessDestination="), this.saveSuccessDestination, ")");
        }
    }

    /* JADX INFO: renamed from: lo0.y$d */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Llo0/y$d;", "Llo0/y;", "Llo0/w;", "screenState", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Llo0/w;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Llo0/w;", "c", "()Llo0/w;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC24614y {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C24612w screenState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AnalyticEventModel analyticEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C24612w screenState, AnalyticEventModel analyticEventModel) {
            super(null);
            AbstractC22676k.m65750j(screenState, "screenState");
            this.screenState = screenState;
            this.analyticEvent = analyticEventModel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C24612w getScreenState() {
            return this.screenState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.screenState, dVar.screenState) && AbstractC22676k.m65745e(this.analyticEvent, dVar.analyticEvent);
        }

        @Override // fy1.InterfaceC14875k
        public ScreenState getState() {
            return ScreenState.SUCCESS;
        }

        public int hashCode() {
            int iHashCode = this.screenState.hashCode() * 31;
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            return iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
        }

        public String toString() {
            return "Success(screenState=" + this.screenState + ", analyticEvent=" + this.analyticEvent + ")";
        }
    }

    public /* synthetic */ AbstractC24614y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24614y() {
    }
}
