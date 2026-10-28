package w72;

import com.whoop.design.util.TextResource;
import com.whoop.metrics.common.ScreenState;
import com.whoop.sanguine.domain.models.SanguineWaitlistFooter;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: w72.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lw72/g;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lw72/g$a;", "Lw72/g$b;", "Lw72/g$c;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36914g implements InterfaceC14875k {

    /* JADX INFO: renamed from: w72.g$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lw72/g$a;", "Lw72/g;", "<init>", "()V", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC36914g {

        /* JADX INFO: renamed from: b */
        public static final a f157950b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: w72.g$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lw72/g$b;", "Lw72/g;", "<init>", "()V", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC36914g {

        /* JADX INFO: renamed from: b */
        public static final b f157951b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: w72.g$c */
    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b%\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m65681d2 = {"Lw72/g$c;", "Lw72/g;", "Lkd1/o;", "headerImage", "Lcom/whoop/design/util/TextResource;", "headerText", "", "Lm91/u;", "items", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;", "footer", "Lw72/a;", "analyticsInfo", "Lsz0/p0;", "waitlistJoinModalState", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lw72/a;Lsz0/p0;)V", "b", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lw72/a;Lsz0/p0;)Lw72/g$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", "f", "()Lkd1/o;", "c", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "e", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;", "()Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;", "Lw72/a;", "()Lw72/a;", "Lsz0/p0;", "i", "()Lsz0/p0;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36914g {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC22403o headerImage;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource headerText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<InterfaceC25312u> items;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final SanguineWaitlistFooter footer;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C36908a analyticsInfo;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final AbstractC33208p0 waitlistJoinModalState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC22403o headerImage, TextResource headerText, List<? extends InterfaceC25312u> items, SanguineWaitlistFooter sanguineWaitlistFooter, C36908a c36908a, AbstractC33208p0 abstractC33208p0) {
            super(null);
            AbstractC22676k.m65750j(headerImage, "headerImage");
            AbstractC22676k.m65750j(headerText, "headerText");
            AbstractC22676k.m65750j(items, "items");
            this.headerImage = headerImage;
            this.headerText = headerText;
            this.items = items;
            this.footer = sanguineWaitlistFooter;
            this.analyticsInfo = c36908a;
            this.waitlistJoinModalState = abstractC33208p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ c m118537c(c cVar, AbstractC22403o abstractC22403o, TextResource textResource, List list, SanguineWaitlistFooter sanguineWaitlistFooter, C36908a c36908a, AbstractC33208p0 abstractC33208p0, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC22403o = cVar.headerImage;
            }
            if ((i13 & 2) != 0) {
                textResource = cVar.headerText;
            }
            if ((i13 & 4) != 0) {
                list = cVar.items;
            }
            if ((i13 & 8) != 0) {
                sanguineWaitlistFooter = cVar.footer;
            }
            if ((i13 & 16) != 0) {
                c36908a = cVar.analyticsInfo;
            }
            if ((i13 & 32) != 0) {
                abstractC33208p0 = cVar.waitlistJoinModalState;
            }
            C36908a c36908a2 = c36908a;
            AbstractC33208p0 abstractC33208p1 = abstractC33208p0;
            return cVar.m118538b(abstractC22403o, textResource, list, sanguineWaitlistFooter, c36908a2, abstractC33208p1);
        }

        /* JADX INFO: renamed from: b */
        public final c m118538b(AbstractC22403o headerImage, TextResource headerText, List<? extends InterfaceC25312u> items, SanguineWaitlistFooter footer, C36908a analyticsInfo, AbstractC33208p0 waitlistJoinModalState) {
            AbstractC22676k.m65750j(headerImage, "headerImage");
            AbstractC22676k.m65750j(headerText, "headerText");
            AbstractC22676k.m65750j(items, "items");
            return new c(headerImage, headerText, items, footer, analyticsInfo, waitlistJoinModalState);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C36908a getAnalyticsInfo() {
            return this.analyticsInfo;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final SanguineWaitlistFooter getFooter() {
            return this.footer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.headerImage, cVar.headerImage) && AbstractC22676k.m65745e(this.headerText, cVar.headerText) && AbstractC22676k.m65745e(this.items, cVar.items) && AbstractC22676k.m65745e(this.footer, cVar.footer) && AbstractC22676k.m65745e(this.analyticsInfo, cVar.analyticsInfo) && AbstractC22676k.m65745e(this.waitlistJoinModalState, cVar.waitlistJoinModalState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AbstractC22403o getHeaderImage() {
            return this.headerImage;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getHeaderText() {
            return this.headerText;
        }

        /* JADX INFO: renamed from: h */
        public final List<InterfaceC25312u> m118543h() {
            return this.items;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.headerImage.hashCode() * 31, this.headerText, 31), 31, this.items);
            SanguineWaitlistFooter sanguineWaitlistFooter = this.footer;
            int iHashCode = (iM31983b + (sanguineWaitlistFooter == null ? 0 : sanguineWaitlistFooter.hashCode())) * 31;
            C36908a c36908a = this.analyticsInfo;
            int iHashCode2 = (iHashCode + (c36908a == null ? 0 : c36908a.hashCode())) * 31;
            AbstractC33208p0 abstractC33208p0 = this.waitlistJoinModalState;
            return iHashCode2 + (abstractC33208p0 != null ? abstractC33208p0.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final AbstractC33208p0 getWaitlistJoinModalState() {
            return this.waitlistJoinModalState;
        }

        public String toString() {
            AbstractC22403o abstractC22403o = this.headerImage;
            TextResource textResource = this.headerText;
            List<InterfaceC25312u> list = this.items;
            SanguineWaitlistFooter sanguineWaitlistFooter = this.footer;
            C36908a c36908a = this.analyticsInfo;
            AbstractC33208p0 abstractC33208p0 = this.waitlistJoinModalState;
            StringBuilder sbM114683k = AbstractC36095b.m114683k("Success(headerImage=", textResource, abstractC22403o, ", headerText=", ", items=");
            sbM114683k.append(list);
            sbM114683k.append(", footer=");
            sbM114683k.append(sanguineWaitlistFooter);
            sbM114683k.append(", analyticsInfo=");
            sbM114683k.append(c36908a);
            sbM114683k.append(", waitlistJoinModalState=");
            sbM114683k.append(abstractC33208p0);
            sbM114683k.append(")");
            return sbM114683k.toString();
        }
    }

    public /* synthetic */ AbstractC36914g(DefaultConstructorMarker defaultConstructorMarker) {
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

    private AbstractC36914g() {
    }
}
