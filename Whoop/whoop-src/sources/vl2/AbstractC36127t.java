package vl2;

import androidx.profileinstaller.ProfileVerifier;
import cm2.EnumC4821i;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.trends.data.model.CardioFitnessLevelModel;
import com.whoop.trends.data.model.IntegrationsUpsellDtoV3;
import com.whoop.trends.data.model.ManualMeasurementSheet;
import com.whoop.trends.data.model.MeasurementRecord;
import com.whoop.trends.data.model.MetaData;
import com.whoop.trends.data.model.MetricEducationV3;
import com.whoop.trends.data.model.NavigationSectionV3;
import com.whoop.trends.data.model.RecordedData;
import com.whoop.trends.data.model.SegmentControllerDtoV3;
import com.whoop.trends.data.model.TimeSegmentDtoV3;
import com.whoop.trends.data.model.TrendMenuItemModel;
import com.whoop.trends.data.model.TrendsMenuItemDtoV3;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.EnumC28166h0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: vl2.t */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lvl2/t;", "", "<init>", "()V", "b", "a", "c", "Lvl2/t$a;", "Lvl2/t$b;", "Lvl2/t$c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36127t {

    /* JADX INFO: renamed from: vl2.t$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lvl2/t$a;", "Lvl2/t;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36127t {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.message, ((a) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ErrorV3(message=", this.message, ")");
        }
    }

    /* JADX INFO: renamed from: vl2.t$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvl2/t$b;", "Lvl2/t;", "<init>", "()V", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC36127t {

        /* JADX INFO: renamed from: a */
        public static final b f154435a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC36127t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36127t() {
    }

    /* JADX INFO: renamed from: vl2.t$c */
    @Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bL\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000f\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000f\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u000f\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\u0006\u00104\u001a\u00020 \u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u000f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\b\b\u0002\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J¼\u0003\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u000f2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00104\u001a\u00020 2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u000f2\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\b\b\u0002\u0010<\u001a\u00020;HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010D\u001a\u00020CHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020 2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010J\u001a\u0004\bK\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010BR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010J\u001a\u0004\bS\u0010BR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bK\u0010Y\u001a\u0004\bR\u0010[R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bd\u0010J\u001a\u0004\b`\u0010BR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\b^\u0010gR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\b\\\u0010jR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\be\u0010mR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bh\u0010pR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bq\u0010o\u001a\u0004\br\u0010pR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bk\u0010uR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0017\u0010\"\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bV\u0010{\u001a\u0004\b\"\u0010}R\u0017\u0010#\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b~\u0010{\u001a\u0004\b\u007f\u0010}R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u000f\n\u0005\b]\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000f8\u0006¢\u0006\r\n\u0004\bb\u0010a\u001a\u0005\b\u0083\u0001\u0010cR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\bQ\u0010\u0084\u0001\u001a\u0005\bT\u0010\u0085\u0001R\u001f\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bS\u0010a\u001a\u0004\b~\u0010cR\u001f\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bx\u0010a\u001a\u0004\bd\u0010cR\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b|\u0010J\u001a\u0004\bn\u0010BR!\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010a\u001a\u0005\b\u0087\u0001\u0010cR\u001b\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000e\n\u0005\br\u0010\u0088\u0001\u001a\u0005\bP\u0010\u0089\u0001R\u001b\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\u000e\n\u0005\bN\u0010\u008a\u0001\u001a\u0005\bs\u0010\u008b\u0001R\u0018\u00104\u001a\u00020 8\u0006¢\u0006\r\n\u0004\b_\u0010{\u001a\u0005\b\u0086\u0001\u0010}R\u001b\u00106\u001a\u0004\u0018\u0001058\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u008c\u0001\u001a\u0005\bq\u0010\u008d\u0001R \u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u000f8\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010a\u001a\u0004\bX\u0010cR\u001c\u0010:\u001a\u0004\u0018\u0001098\u0006¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u008e\u0001\u001a\u0005\bz\u0010\u008f\u0001R\u001a\u0010<\u001a\u00020;8\u0006¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0090\u0001\u001a\u0005\bv\u0010\u0091\u0001¨\u0006\u0092\u0001"}, m65681d2 = {"Lvl2/t$c;", "Lvl2/t;", "", "headerNameDisplay", "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "segmentController", "noDataNameDisplay", "noDataSubtextNameDisplay", "Lcom/whoop/trends/data/model/MetricEducationV3;", "metricEducation", "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "weekTimeSegment", "monthTimeSegment", "sixMonthTimeSegment", "allTimeSegment", "", "Lcom/whoop/trends/data/model/NavigationSectionV3;", "navSections", "infoCallout", "Lor2/h0;", "graphKey", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "educationCarouselModel", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "integrationsUpsell", "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "manualMeasurementItem", "seeAllDataItem", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "manualMeasurementSheet", "Lcom/whoop/trends/data/model/RecordedData;", "recordedData", "", "recordedDataError", "isLoadingMoreRecordedData", "successSavingManualMeasurement", "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "upsellCard", "Lcom/whoop/design/models/items/MenuItemModel;", "trendsMenuList", "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "cardioFitnessLevel", "metricEducationList", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCalloutList", "manualMeasurementTextDisplay", "Lcom/whoop/trends/data/model/TrendMenuItemModel;", "trendMenus", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "additionalInfoText", "Lcom/whoop/trends/data/model/MeasurementRecord;", "measurementRecord", "refreshAllMeasurementsScreen", "Lcm2/i;", "measurementId", "Lcom/whoop/design/models/DesignSystemModel;", "designItems", "Lcom/whoop/trends/data/model/MetaData;", "metadata", "Lvl2/e;", "measurementRecordDeleteState", "<init>", "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;Ljava/lang/String;Lor2/h0;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/RecordedData;ZZZLcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/trends/data/model/MeasurementRecord;ZLcm2/i;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lvl2/e;)V", "a", "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;Ljava/lang/String;Lor2/h0;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/RecordedData;ZZZLcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/trends/data/model/MeasurementRecord;ZLcm2/i;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lvl2/e;)Lvl2/t$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "D", "()Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "c", "x", "d", "y", "e", "Lcom/whoop/trends/data/model/MetricEducationV3;", "t", "()Lcom/whoop/trends/data/model/MetricEducationV3;", "f", "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "J", "()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "g", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "E", "j", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Ljava/util/List;", "k", "l", "Lor2/h0;", "()Lor2/h0;", "m", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "n", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "()Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "o", "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "p", "C", "q", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "()Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "r", "Lcom/whoop/trends/data/model/RecordedData;", "z", "()Lcom/whoop/trends/data/model/RecordedData;", "s", "Z", "A", "()Z", "u", "F", "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "I", "()Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "H", "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "()Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "B", "G", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "Lcom/whoop/trends/data/model/MeasurementRecord;", "()Lcom/whoop/trends/data/model/MeasurementRecord;", "Lcm2/i;", "()Lcm2/i;", "Lcom/whoop/trends/data/model/MetaData;", "()Lcom/whoop/trends/data/model/MetaData;", "Lvl2/e;", "()Lvl2/e;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36127t {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final String manualMeasurementTextDisplay;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private final List<TrendMenuItemModel> trendMenus;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private final AdditionalInfoTextModel additionalInfoText;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private final MeasurementRecord measurementRecord;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private final boolean refreshAllMeasurementsScreen;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final List<DesignSystemModel> designItems;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private final MetaData metadata;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        private final AbstractC36112e measurementRecordDeleteState;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String headerNameDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final SegmentControllerDtoV3 segmentController;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String noDataNameDisplay;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String noDataSubtextNameDisplay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final MetricEducationV3 metricEducation;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TimeSegmentDtoV3 weekTimeSegment;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TimeSegmentDtoV3 monthTimeSegment;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TimeSegmentDtoV3 sixMonthTimeSegment;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TimeSegmentDtoV3 allTimeSegment;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final List<NavigationSectionV3> navSections;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String infoCallout;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final ArticleTileCarouselModel educationCarouselModel;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final IntegrationsUpsellDtoV3 integrationsUpsell;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final TrendsMenuItemDtoV3 manualMeasurementItem;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final TrendsMenuItemDtoV3 seeAllDataItem;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final ManualMeasurementSheet manualMeasurementSheet;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final RecordedData recordedData;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final boolean recordedDataError;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final boolean isLoadingMoreRecordedData;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final boolean successSavingManualMeasurement;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final TextWithIllustrationCardModel upsellCard;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final List<MenuItemModel> trendsMenuList;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final CardioFitnessLevelModel cardioFitnessLevel;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final List<MetricEducationV3> metricEducationList;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final List<InfoCalloutTileModel> infoCalloutList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String headerNameDisplay, SegmentControllerDtoV3 segmentController, String noDataNameDisplay, String noDataSubtextNameDisplay, MetricEducationV3 metricEducationV3, TimeSegmentDtoV3 timeSegmentDtoV3, TimeSegmentDtoV3 monthTimeSegment, TimeSegmentDtoV3 sixMonthTimeSegment, TimeSegmentDtoV3 timeSegmentDtoV4, List<NavigationSectionV3> navSections, String str, EnumC28166h0 graphKey, ArticleTileCarouselModel articleTileCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV4, ManualMeasurementSheet manualMeasurementSheet, RecordedData recordedData, boolean z4, boolean z13, boolean z14, TextWithIllustrationCardModel textWithIllustrationCardModel, List<MenuItemModel> trendsMenuList, CardioFitnessLevelModel cardioFitnessLevelModel, List<MetricEducationV3> list, List<InfoCalloutTileModel> list2, String str2, List<TrendMenuItemModel> list3, AdditionalInfoTextModel additionalInfoTextModel, MeasurementRecord measurementRecord, boolean z15, EnumC4821i enumC4821i, List<? extends DesignSystemModel> list4, MetaData metaData, AbstractC36112e measurementRecordDeleteState) {
            super(null);
            AbstractC22676k.m65750j(headerNameDisplay, "headerNameDisplay");
            AbstractC22676k.m65750j(segmentController, "segmentController");
            AbstractC22676k.m65750j(noDataNameDisplay, "noDataNameDisplay");
            AbstractC22676k.m65750j(noDataSubtextNameDisplay, "noDataSubtextNameDisplay");
            AbstractC22676k.m65750j(monthTimeSegment, "monthTimeSegment");
            AbstractC22676k.m65750j(sixMonthTimeSegment, "sixMonthTimeSegment");
            AbstractC22676k.m65750j(navSections, "navSections");
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(trendsMenuList, "trendsMenuList");
            AbstractC22676k.m65750j(measurementRecordDeleteState, "measurementRecordDeleteState");
            this.headerNameDisplay = headerNameDisplay;
            this.segmentController = segmentController;
            this.noDataNameDisplay = noDataNameDisplay;
            this.noDataSubtextNameDisplay = noDataSubtextNameDisplay;
            this.metricEducation = metricEducationV3;
            this.weekTimeSegment = timeSegmentDtoV3;
            this.monthTimeSegment = monthTimeSegment;
            this.sixMonthTimeSegment = sixMonthTimeSegment;
            this.allTimeSegment = timeSegmentDtoV4;
            this.navSections = navSections;
            this.infoCallout = str;
            this.graphKey = graphKey;
            this.educationCarouselModel = articleTileCarouselModel;
            this.integrationsUpsell = integrationsUpsellDtoV3;
            this.manualMeasurementItem = trendsMenuItemDtoV3;
            this.seeAllDataItem = trendsMenuItemDtoV4;
            this.manualMeasurementSheet = manualMeasurementSheet;
            this.recordedData = recordedData;
            this.recordedDataError = z4;
            this.isLoadingMoreRecordedData = z13;
            this.successSavingManualMeasurement = z14;
            this.upsellCard = textWithIllustrationCardModel;
            this.trendsMenuList = trendsMenuList;
            this.cardioFitnessLevel = cardioFitnessLevelModel;
            this.metricEducationList = list;
            this.infoCalloutList = list2;
            this.manualMeasurementTextDisplay = str2;
            this.trendMenus = list3;
            this.additionalInfoText = additionalInfoTextModel;
            this.measurementRecord = measurementRecord;
            this.refreshAllMeasurementsScreen = z15;
            this.measurementId = enumC4821i;
            this.designItems = list4;
            this.metadata = metaData;
            this.measurementRecordDeleteState = measurementRecordDeleteState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m114821b(c cVar, String str, SegmentControllerDtoV3 segmentControllerDtoV3, String str2, String str3, MetricEducationV3 metricEducationV3, TimeSegmentDtoV3 timeSegmentDtoV3, TimeSegmentDtoV3 timeSegmentDtoV4, TimeSegmentDtoV3 timeSegmentDtoV5, TimeSegmentDtoV3 timeSegmentDtoV6, List list, String str4, EnumC28166h0 enumC28166h0, ArticleTileCarouselModel articleTileCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV4, ManualMeasurementSheet manualMeasurementSheet, RecordedData recordedData, boolean z4, boolean z13, boolean z14, TextWithIllustrationCardModel textWithIllustrationCardModel, List list2, CardioFitnessLevelModel cardioFitnessLevelModel, List list3, List list4, String str5, List list5, AdditionalInfoTextModel additionalInfoTextModel, MeasurementRecord measurementRecord, boolean z15, EnumC4821i enumC4821i, List list6, MetaData metaData, AbstractC36112e abstractC36112e, int i13, int i14, Object obj) {
            AbstractC36112e abstractC36112e2;
            MetaData metaData2;
            String str6 = (i13 & 1) != 0 ? cVar.headerNameDisplay : str;
            SegmentControllerDtoV3 segmentControllerDtoV4 = (i13 & 2) != 0 ? cVar.segmentController : segmentControllerDtoV3;
            String str7 = (i13 & 4) != 0 ? cVar.noDataNameDisplay : str2;
            String str8 = (i13 & 8) != 0 ? cVar.noDataSubtextNameDisplay : str3;
            MetricEducationV3 metricEducationV4 = (i13 & 16) != 0 ? cVar.metricEducation : metricEducationV3;
            TimeSegmentDtoV3 timeSegmentDtoV7 = (i13 & 32) != 0 ? cVar.weekTimeSegment : timeSegmentDtoV3;
            TimeSegmentDtoV3 timeSegmentDtoV8 = (i13 & 64) != 0 ? cVar.monthTimeSegment : timeSegmentDtoV4;
            TimeSegmentDtoV3 timeSegmentDtoV9 = (i13 & 128) != 0 ? cVar.sixMonthTimeSegment : timeSegmentDtoV5;
            TimeSegmentDtoV3 timeSegmentDtoV10 = (i13 & 256) != 0 ? cVar.allTimeSegment : timeSegmentDtoV6;
            List list7 = (i13 & 512) != 0 ? cVar.navSections : list;
            String str9 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? cVar.infoCallout : str4;
            EnumC28166h0 enumC28166h1 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? cVar.graphKey : enumC28166h0;
            ArticleTileCarouselModel articleTileCarouselModel2 = (i13 & 4096) != 0 ? cVar.educationCarouselModel : articleTileCarouselModel;
            IntegrationsUpsellDtoV3 integrationsUpsellDtoV4 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? cVar.integrationsUpsell : integrationsUpsellDtoV3;
            String str10 = str6;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV5 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? cVar.manualMeasurementItem : trendsMenuItemDtoV3;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV6 = (i13 & 32768) != 0 ? cVar.seeAllDataItem : trendsMenuItemDtoV4;
            ManualMeasurementSheet manualMeasurementSheet2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? cVar.manualMeasurementSheet : manualMeasurementSheet;
            RecordedData recordedData2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? cVar.recordedData : recordedData;
            boolean z16 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? cVar.recordedDataError : z4;
            boolean z17 = (i13 & 524288) != 0 ? cVar.isLoadingMoreRecordedData : z13;
            boolean z18 = (i13 & 1048576) != 0 ? cVar.successSavingManualMeasurement : z14;
            TextWithIllustrationCardModel textWithIllustrationCardModel2 = (i13 & 2097152) != 0 ? cVar.upsellCard : textWithIllustrationCardModel;
            List list8 = (i13 & 4194304) != 0 ? cVar.trendsMenuList : list2;
            CardioFitnessLevelModel cardioFitnessLevelModel2 = (i13 & 8388608) != 0 ? cVar.cardioFitnessLevel : cardioFitnessLevelModel;
            List list9 = (i13 & 16777216) != 0 ? cVar.metricEducationList : list3;
            List list10 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? cVar.infoCalloutList : list4;
            String str11 = (i13 & 67108864) != 0 ? cVar.manualMeasurementTextDisplay : str5;
            List list11 = (i13 & 134217728) != 0 ? cVar.trendMenus : list5;
            AdditionalInfoTextModel additionalInfoTextModel2 = (i13 & 268435456) != 0 ? cVar.additionalInfoText : additionalInfoTextModel;
            MeasurementRecord measurementRecord2 = (i13 & 536870912) != 0 ? cVar.measurementRecord : measurementRecord;
            boolean z19 = (i13 & 1073741824) != 0 ? cVar.refreshAllMeasurementsScreen : z15;
            EnumC4821i enumC4821i2 = (i13 & Integer.MIN_VALUE) != 0 ? cVar.measurementId : enumC4821i;
            List list12 = (i14 & 1) != 0 ? cVar.designItems : list6;
            MetaData metaData3 = (i14 & 2) != 0 ? cVar.metadata : metaData;
            if ((i14 & 4) != 0) {
                metaData2 = metaData3;
                abstractC36112e2 = cVar.measurementRecordDeleteState;
            } else {
                abstractC36112e2 = abstractC36112e;
                metaData2 = metaData3;
            }
            return cVar.m114832a(str10, segmentControllerDtoV4, str7, str8, metricEducationV4, timeSegmentDtoV7, timeSegmentDtoV8, timeSegmentDtoV9, timeSegmentDtoV10, list7, str9, enumC28166h1, articleTileCarouselModel2, integrationsUpsellDtoV4, trendsMenuItemDtoV5, trendsMenuItemDtoV6, manualMeasurementSheet2, recordedData2, z16, z17, z18, textWithIllustrationCardModel2, list8, cardioFitnessLevelModel2, list9, list10, str11, list11, additionalInfoTextModel2, measurementRecord2, z19, enumC4821i2, list12, metaData2, abstractC36112e2);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final boolean getRecordedDataError() {
            return this.recordedDataError;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getRefreshAllMeasurementsScreen() {
            return this.refreshAllMeasurementsScreen;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final TrendsMenuItemDtoV3 getSeeAllDataItem() {
            return this.seeAllDataItem;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final SegmentControllerDtoV3 getSegmentController() {
            return this.segmentController;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final TimeSegmentDtoV3 getSixMonthTimeSegment() {
            return this.sixMonthTimeSegment;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final boolean getSuccessSavingManualMeasurement() {
            return this.successSavingManualMeasurement;
        }

        /* JADX INFO: renamed from: G */
        public final List<TrendMenuItemModel> m114828G() {
            return this.trendMenus;
        }

        /* JADX INFO: renamed from: H */
        public final List<MenuItemModel> m114829H() {
            return this.trendsMenuList;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final TextWithIllustrationCardModel getUpsellCard() {
            return this.upsellCard;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final TimeSegmentDtoV3 getWeekTimeSegment() {
            return this.weekTimeSegment;
        }

        /* JADX INFO: renamed from: a */
        public final c m114832a(String headerNameDisplay, SegmentControllerDtoV3 segmentController, String noDataNameDisplay, String noDataSubtextNameDisplay, MetricEducationV3 metricEducation, TimeSegmentDtoV3 weekTimeSegment, TimeSegmentDtoV3 monthTimeSegment, TimeSegmentDtoV3 sixMonthTimeSegment, TimeSegmentDtoV3 allTimeSegment, List<NavigationSectionV3> navSections, String infoCallout, EnumC28166h0 graphKey, ArticleTileCarouselModel educationCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsell, TrendsMenuItemDtoV3 manualMeasurementItem, TrendsMenuItemDtoV3 seeAllDataItem, ManualMeasurementSheet manualMeasurementSheet, RecordedData recordedData, boolean recordedDataError, boolean isLoadingMoreRecordedData, boolean successSavingManualMeasurement, TextWithIllustrationCardModel upsellCard, List<MenuItemModel> trendsMenuList, CardioFitnessLevelModel cardioFitnessLevel, List<MetricEducationV3> metricEducationList, List<InfoCalloutTileModel> infoCalloutList, String manualMeasurementTextDisplay, List<TrendMenuItemModel> trendMenus, AdditionalInfoTextModel additionalInfoText, MeasurementRecord measurementRecord, boolean refreshAllMeasurementsScreen, EnumC4821i measurementId, List<? extends DesignSystemModel> designItems, MetaData metadata, AbstractC36112e measurementRecordDeleteState) {
            AbstractC22676k.m65750j(headerNameDisplay, "headerNameDisplay");
            AbstractC22676k.m65750j(segmentController, "segmentController");
            AbstractC22676k.m65750j(noDataNameDisplay, "noDataNameDisplay");
            AbstractC22676k.m65750j(noDataSubtextNameDisplay, "noDataSubtextNameDisplay");
            AbstractC22676k.m65750j(monthTimeSegment, "monthTimeSegment");
            AbstractC22676k.m65750j(sixMonthTimeSegment, "sixMonthTimeSegment");
            AbstractC22676k.m65750j(navSections, "navSections");
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(trendsMenuList, "trendsMenuList");
            AbstractC22676k.m65750j(measurementRecordDeleteState, "measurementRecordDeleteState");
            return new c(headerNameDisplay, segmentController, noDataNameDisplay, noDataSubtextNameDisplay, metricEducation, weekTimeSegment, monthTimeSegment, sixMonthTimeSegment, allTimeSegment, navSections, infoCallout, graphKey, educationCarouselModel, integrationsUpsell, manualMeasurementItem, seeAllDataItem, manualMeasurementSheet, recordedData, recordedDataError, isLoadingMoreRecordedData, successSavingManualMeasurement, upsellCard, trendsMenuList, cardioFitnessLevel, metricEducationList, infoCalloutList, manualMeasurementTextDisplay, trendMenus, additionalInfoText, measurementRecord, refreshAllMeasurementsScreen, measurementId, designItems, metadata, measurementRecordDeleteState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AdditionalInfoTextModel getAdditionalInfoText() {
            return this.additionalInfoText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TimeSegmentDtoV3 getAllTimeSegment() {
            return this.allTimeSegment;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final CardioFitnessLevelModel getCardioFitnessLevel() {
            return this.cardioFitnessLevel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.headerNameDisplay, cVar.headerNameDisplay) && AbstractC22676k.m65745e(this.segmentController, cVar.segmentController) && AbstractC22676k.m65745e(this.noDataNameDisplay, cVar.noDataNameDisplay) && AbstractC22676k.m65745e(this.noDataSubtextNameDisplay, cVar.noDataSubtextNameDisplay) && AbstractC22676k.m65745e(this.metricEducation, cVar.metricEducation) && AbstractC22676k.m65745e(this.weekTimeSegment, cVar.weekTimeSegment) && AbstractC22676k.m65745e(this.monthTimeSegment, cVar.monthTimeSegment) && AbstractC22676k.m65745e(this.sixMonthTimeSegment, cVar.sixMonthTimeSegment) && AbstractC22676k.m65745e(this.allTimeSegment, cVar.allTimeSegment) && AbstractC22676k.m65745e(this.navSections, cVar.navSections) && AbstractC22676k.m65745e(this.infoCallout, cVar.infoCallout) && this.graphKey == cVar.graphKey && AbstractC22676k.m65745e(this.educationCarouselModel, cVar.educationCarouselModel) && AbstractC22676k.m65745e(this.integrationsUpsell, cVar.integrationsUpsell) && AbstractC22676k.m65745e(this.manualMeasurementItem, cVar.manualMeasurementItem) && AbstractC22676k.m65745e(this.seeAllDataItem, cVar.seeAllDataItem) && AbstractC22676k.m65745e(this.manualMeasurementSheet, cVar.manualMeasurementSheet) && AbstractC22676k.m65745e(this.recordedData, cVar.recordedData) && this.recordedDataError == cVar.recordedDataError && this.isLoadingMoreRecordedData == cVar.isLoadingMoreRecordedData && this.successSavingManualMeasurement == cVar.successSavingManualMeasurement && AbstractC22676k.m65745e(this.upsellCard, cVar.upsellCard) && AbstractC22676k.m65745e(this.trendsMenuList, cVar.trendsMenuList) && AbstractC22676k.m65745e(this.cardioFitnessLevel, cVar.cardioFitnessLevel) && AbstractC22676k.m65745e(this.metricEducationList, cVar.metricEducationList) && AbstractC22676k.m65745e(this.infoCalloutList, cVar.infoCalloutList) && AbstractC22676k.m65745e(this.manualMeasurementTextDisplay, cVar.manualMeasurementTextDisplay) && AbstractC22676k.m65745e(this.trendMenus, cVar.trendMenus) && AbstractC22676k.m65745e(this.additionalInfoText, cVar.additionalInfoText) && AbstractC22676k.m65745e(this.measurementRecord, cVar.measurementRecord) && this.refreshAllMeasurementsScreen == cVar.refreshAllMeasurementsScreen && this.measurementId == cVar.measurementId && AbstractC22676k.m65745e(this.designItems, cVar.designItems) && AbstractC22676k.m65745e(this.metadata, cVar.metadata) && AbstractC22676k.m65745e(this.measurementRecordDeleteState, cVar.measurementRecordDeleteState);
        }

        /* JADX INFO: renamed from: f */
        public final List<DesignSystemModel> m114836f() {
            return this.designItems;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ArticleTileCarouselModel getEducationCarouselModel() {
            return this.educationCarouselModel;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.segmentController.hashCode() + (this.headerNameDisplay.hashCode() * 31)) * 31, 31, this.noDataNameDisplay), 31, this.noDataSubtextNameDisplay);
            MetricEducationV3 metricEducationV3 = this.metricEducation;
            int iHashCode = (iM30450d + (metricEducationV3 == null ? 0 : metricEducationV3.hashCode())) * 31;
            TimeSegmentDtoV3 timeSegmentDtoV3 = this.weekTimeSegment;
            int iHashCode2 = (this.sixMonthTimeSegment.hashCode() + ((this.monthTimeSegment.hashCode() + ((iHashCode + (timeSegmentDtoV3 == null ? 0 : timeSegmentDtoV3.hashCode())) * 31)) * 31)) * 31;
            TimeSegmentDtoV3 timeSegmentDtoV4 = this.allTimeSegment;
            int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (timeSegmentDtoV4 == null ? 0 : timeSegmentDtoV4.hashCode())) * 31, 31, this.navSections);
            String str = this.infoCallout;
            int iHashCode3 = (this.graphKey.hashCode() + ((iM31983b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            ArticleTileCarouselModel articleTileCarouselModel = this.educationCarouselModel;
            int iHashCode4 = (iHashCode3 + (articleTileCarouselModel == null ? 0 : articleTileCarouselModel.hashCode())) * 31;
            IntegrationsUpsellDtoV3 integrationsUpsellDtoV3 = this.integrationsUpsell;
            int iHashCode5 = (iHashCode4 + (integrationsUpsellDtoV3 == null ? 0 : integrationsUpsellDtoV3.hashCode())) * 31;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV3 = this.manualMeasurementItem;
            int iHashCode6 = (iHashCode5 + (trendsMenuItemDtoV3 == null ? 0 : trendsMenuItemDtoV3.hashCode())) * 31;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV4 = this.seeAllDataItem;
            int iHashCode7 = (iHashCode6 + (trendsMenuItemDtoV4 == null ? 0 : trendsMenuItemDtoV4.hashCode())) * 31;
            ManualMeasurementSheet manualMeasurementSheet = this.manualMeasurementSheet;
            int iHashCode8 = (iHashCode7 + (manualMeasurementSheet == null ? 0 : manualMeasurementSheet.hashCode())) * 31;
            RecordedData recordedData = this.recordedData;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode8 + (recordedData == null ? 0 : recordedData.hashCode())) * 31, 31, this.recordedDataError), 31, this.isLoadingMoreRecordedData), 31, this.successSavingManualMeasurement);
            TextWithIllustrationCardModel textWithIllustrationCardModel = this.upsellCard;
            int iM31983b2 = AbstractC11895b.m31983b((iM8289b + (textWithIllustrationCardModel == null ? 0 : textWithIllustrationCardModel.hashCode())) * 31, 31, this.trendsMenuList);
            CardioFitnessLevelModel cardioFitnessLevelModel = this.cardioFitnessLevel;
            int iHashCode9 = (iM31983b2 + (cardioFitnessLevelModel == null ? 0 : cardioFitnessLevelModel.hashCode())) * 31;
            List<MetricEducationV3> list = this.metricEducationList;
            int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
            List<InfoCalloutTileModel> list2 = this.infoCalloutList;
            int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str2 = this.manualMeasurementTextDisplay;
            int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<TrendMenuItemModel> list3 = this.trendMenus;
            int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
            AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
            int iHashCode14 = (iHashCode13 + (additionalInfoTextModel == null ? 0 : additionalInfoTextModel.hashCode())) * 31;
            MeasurementRecord measurementRecord = this.measurementRecord;
            int iM8289b2 = AbstractC2875y.m8289b((iHashCode14 + (measurementRecord == null ? 0 : measurementRecord.hashCode())) * 31, 31, this.refreshAllMeasurementsScreen);
            EnumC4821i enumC4821i = this.measurementId;
            int iHashCode15 = (iM8289b2 + (enumC4821i == null ? 0 : enumC4821i.hashCode())) * 31;
            List<DesignSystemModel> list4 = this.designItems;
            int iHashCode16 = (iHashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
            MetaData metaData = this.metadata;
            return this.measurementRecordDeleteState.hashCode() + ((iHashCode16 + (metaData != null ? metaData.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getHeaderNameDisplay() {
            return this.headerNameDisplay;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getInfoCallout() {
            return this.infoCallout;
        }

        /* JADX INFO: renamed from: k */
        public final List<InfoCalloutTileModel> m114841k() {
            return this.infoCalloutList;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final IntegrationsUpsellDtoV3 getIntegrationsUpsell() {
            return this.integrationsUpsell;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TrendsMenuItemDtoV3 getManualMeasurementItem() {
            return this.manualMeasurementItem;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final ManualMeasurementSheet getManualMeasurementSheet() {
            return this.manualMeasurementSheet;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getManualMeasurementTextDisplay() {
            return this.manualMeasurementTextDisplay;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final EnumC4821i getMeasurementId() {
            return this.measurementId;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final MeasurementRecord getMeasurementRecord() {
            return this.measurementRecord;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final AbstractC36112e getMeasurementRecordDeleteState() {
            return this.measurementRecordDeleteState;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final MetaData getMetadata() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final MetricEducationV3 getMetricEducation() {
            return this.metricEducation;
        }

        public String toString() {
            String str = this.headerNameDisplay;
            SegmentControllerDtoV3 segmentControllerDtoV3 = this.segmentController;
            String str2 = this.noDataNameDisplay;
            String str3 = this.noDataSubtextNameDisplay;
            MetricEducationV3 metricEducationV3 = this.metricEducation;
            TimeSegmentDtoV3 timeSegmentDtoV3 = this.weekTimeSegment;
            TimeSegmentDtoV3 timeSegmentDtoV4 = this.monthTimeSegment;
            TimeSegmentDtoV3 timeSegmentDtoV5 = this.sixMonthTimeSegment;
            TimeSegmentDtoV3 timeSegmentDtoV6 = this.allTimeSegment;
            List<NavigationSectionV3> list = this.navSections;
            String str4 = this.infoCallout;
            EnumC28166h0 enumC28166h0 = this.graphKey;
            ArticleTileCarouselModel articleTileCarouselModel = this.educationCarouselModel;
            IntegrationsUpsellDtoV3 integrationsUpsellDtoV3 = this.integrationsUpsell;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV3 = this.manualMeasurementItem;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV4 = this.seeAllDataItem;
            ManualMeasurementSheet manualMeasurementSheet = this.manualMeasurementSheet;
            RecordedData recordedData = this.recordedData;
            boolean z4 = this.recordedDataError;
            boolean z13 = this.isLoadingMoreRecordedData;
            boolean z14 = this.successSavingManualMeasurement;
            TextWithIllustrationCardModel textWithIllustrationCardModel = this.upsellCard;
            List<MenuItemModel> list2 = this.trendsMenuList;
            CardioFitnessLevelModel cardioFitnessLevelModel = this.cardioFitnessLevel;
            List<MetricEducationV3> list3 = this.metricEducationList;
            List<InfoCalloutTileModel> list4 = this.infoCalloutList;
            String str5 = this.manualMeasurementTextDisplay;
            List<TrendMenuItemModel> list5 = this.trendMenus;
            AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
            MeasurementRecord measurementRecord = this.measurementRecord;
            boolean z15 = this.refreshAllMeasurementsScreen;
            EnumC4821i enumC4821i = this.measurementId;
            List<DesignSystemModel> list6 = this.designItems;
            MetaData metaData = this.metadata;
            AbstractC36112e abstractC36112e = this.measurementRecordDeleteState;
            StringBuilder sb4 = new StringBuilder("ResultV3(headerNameDisplay=");
            sb4.append(str);
            sb4.append(", segmentController=");
            sb4.append(segmentControllerDtoV3);
            sb4.append(", noDataNameDisplay=");
            AbstractC11266d.m30444B(sb4, str2, ", noDataSubtextNameDisplay=", str3, ", metricEducation=");
            sb4.append(metricEducationV3);
            sb4.append(", weekTimeSegment=");
            sb4.append(timeSegmentDtoV3);
            sb4.append(", monthTimeSegment=");
            sb4.append(timeSegmentDtoV4);
            sb4.append(", sixMonthTimeSegment=");
            sb4.append(timeSegmentDtoV5);
            sb4.append(", allTimeSegment=");
            sb4.append(timeSegmentDtoV6);
            sb4.append(", navSections=");
            sb4.append(list);
            sb4.append(", infoCallout=");
            sb4.append(str4);
            sb4.append(", graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", educationCarouselModel=");
            sb4.append(articleTileCarouselModel);
            sb4.append(", integrationsUpsell=");
            sb4.append(integrationsUpsellDtoV3);
            sb4.append(", manualMeasurementItem=");
            sb4.append(trendsMenuItemDtoV3);
            sb4.append(", seeAllDataItem=");
            sb4.append(trendsMenuItemDtoV4);
            sb4.append(", manualMeasurementSheet=");
            sb4.append(manualMeasurementSheet);
            sb4.append(", recordedData=");
            sb4.append(recordedData);
            sb4.append(", recordedDataError=");
            AbstractC38963t7.m124392v(sb4, z4, ", isLoadingMoreRecordedData=", z13, ", successSavingManualMeasurement=");
            sb4.append(z14);
            sb4.append(", upsellCard=");
            sb4.append(textWithIllustrationCardModel);
            sb4.append(", trendsMenuList=");
            sb4.append(list2);
            sb4.append(", cardioFitnessLevel=");
            sb4.append(cardioFitnessLevelModel);
            sb4.append(", metricEducationList=");
            AbstractC21702c.m61148s(sb4, list3, ", infoCalloutList=", list4, ", manualMeasurementTextDisplay=");
            AbstractC36095b.m114694v(str5, ", trendMenus=", ", additionalInfoText=", sb4, list5);
            sb4.append(additionalInfoTextModel);
            sb4.append(", measurementRecord=");
            sb4.append(measurementRecord);
            sb4.append(", refreshAllMeasurementsScreen=");
            sb4.append(z15);
            sb4.append(", measurementId=");
            sb4.append(enumC4821i);
            sb4.append(", designItems=");
            sb4.append(list6);
            sb4.append(", metadata=");
            sb4.append(metaData);
            sb4.append(", measurementRecordDeleteState=");
            sb4.append(abstractC36112e);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX INFO: renamed from: u */
        public final List<MetricEducationV3> m114851u() {
            return this.metricEducationList;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final TimeSegmentDtoV3 getMonthTimeSegment() {
            return this.monthTimeSegment;
        }

        /* JADX INFO: renamed from: w */
        public final List<NavigationSectionV3> m114853w() {
            return this.navSections;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getNoDataNameDisplay() {
            return this.noDataNameDisplay;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getNoDataSubtextNameDisplay() {
            return this.noDataSubtextNameDisplay;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final RecordedData getRecordedData() {
            return this.recordedData;
        }

        public /* synthetic */ c(String str, SegmentControllerDtoV3 segmentControllerDtoV3, String str2, String str3, MetricEducationV3 metricEducationV3, TimeSegmentDtoV3 timeSegmentDtoV3, TimeSegmentDtoV3 timeSegmentDtoV4, TimeSegmentDtoV3 timeSegmentDtoV5, TimeSegmentDtoV3 timeSegmentDtoV6, List list, String str4, EnumC28166h0 enumC28166h0, ArticleTileCarouselModel articleTileCarouselModel, IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV4, ManualMeasurementSheet manualMeasurementSheet, RecordedData recordedData, boolean z4, boolean z13, boolean z14, TextWithIllustrationCardModel textWithIllustrationCardModel, List list2, CardioFitnessLevelModel cardioFitnessLevelModel, List list3, List list4, String str5, List list5, AdditionalInfoTextModel additionalInfoTextModel, MeasurementRecord measurementRecord, boolean z15, EnumC4821i enumC4821i, List list6, MetaData metaData, AbstractC36112e abstractC36112e, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, segmentControllerDtoV3, str2, str3, (i13 & 16) != 0 ? null : metricEducationV3, timeSegmentDtoV3, timeSegmentDtoV4, timeSegmentDtoV5, timeSegmentDtoV6, list, str4, enumC28166h0, articleTileCarouselModel, integrationsUpsellDtoV3, trendsMenuItemDtoV3, trendsMenuItemDtoV4, manualMeasurementSheet, recordedData, z4, z13, z14, textWithIllustrationCardModel, list2, cardioFitnessLevelModel, list3, list4, str5, list5, additionalInfoTextModel, measurementRecord, z15, enumC4821i, (i14 & 1) != 0 ? null : list6, (i14 & 2) != 0 ? null : metaData, (i14 & 4) != 0 ? AbstractC36112e.d.f154376a : abstractC36112e);
        }
    }
}
