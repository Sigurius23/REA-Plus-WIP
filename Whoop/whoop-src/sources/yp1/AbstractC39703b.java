package yp1;

import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: yp1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lyp1/b;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lyp1/b$a;", "Lyp1/b$b;", "Lyp1/b$c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39703b implements InterfaceC14875k {

    /* JADX INFO: renamed from: yp1.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lyp1/b$a;", "Lyp1/b;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getErrorMessage", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC39703b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String errorMessage) {
            super(null);
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.errorMessage, ((a) other).errorMessage);
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(errorMessage=", this.errorMessage, ")");
        }
    }

    /* JADX INFO: renamed from: yp1.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lyp1/b$b;", "Lyp1/b;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC39703b {

        /* JADX INFO: renamed from: b */
        public static final b f170891b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: yp1.b$c */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c¨\u0006 "}, m65681d2 = {"Lyp1/b$c;", "Lyp1/b;", "Lcom/whoop/design/util/TextResource;", "navigationTitle", "", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;", "segmentedControlDisplays", "", "selectedSegmentId", "Lm91/u;", "tiles", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "e", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC39703b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource navigationTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<SegmentControlDisplay> segmentedControlDisplays;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<InterfaceC25312u> tiles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(TextResource navigationTitle, List<SegmentControlDisplay> segmentedControlDisplays, String selectedSegmentId, List<? extends InterfaceC25312u> tiles) {
            super(null);
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            AbstractC22676k.m65750j(segmentedControlDisplays, "segmentedControlDisplays");
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            AbstractC22676k.m65750j(tiles, "tiles");
            this.navigationTitle = navigationTitle;
            this.segmentedControlDisplays = segmentedControlDisplays;
            this.selectedSegmentId = selectedSegmentId;
            this.tiles = tiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getNavigationTitle() {
            return this.navigationTitle;
        }

        /* JADX INFO: renamed from: c */
        public final List<SegmentControlDisplay> m127043c() {
            return this.segmentedControlDisplays;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC25312u> m127045e() {
            return this.tiles;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.navigationTitle, cVar.navigationTitle) && AbstractC22676k.m65745e(this.segmentedControlDisplays, cVar.segmentedControlDisplays) && AbstractC22676k.m65745e(this.selectedSegmentId, cVar.selectedSegmentId) && AbstractC22676k.m65745e(this.tiles, cVar.tiles);
        }

        public int hashCode() {
            return this.tiles.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.navigationTitle.hashCode() * 31, 31, this.segmentedControlDisplays), 31, this.selectedSegmentId);
        }

        public String toString() {
            TextResource textResource = this.navigationTitle;
            List<SegmentControlDisplay> list = this.segmentedControlDisplays;
            return AbstractC30007c.m91840j(this.selectedSegmentId, ", tiles=", ")", AbstractC33745d.m106657p(textResource, "Success(navigationTitle=", ", segmentedControlDisplays=", ", selectedSegmentId=", list), this.tiles);
        }
    }

    public /* synthetic */ AbstractC39703b(DefaultConstructorMarker defaultConstructorMarker) {
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

    private AbstractC39703b() {
    }
}
