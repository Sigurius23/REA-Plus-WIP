package vl2;

import cm2.EnumC4821i;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.trends.data.model.CardioFitnessLevelModel;
import com.whoop.trends.data.model.IntegrationsUpsellDtoV3;
import com.whoop.trends.data.model.ManualMeasurementSheet;
import com.whoop.trends.data.model.MetaData;
import com.whoop.trends.data.model.MetricEducationV3;
import com.whoop.trends.data.model.NavigationSectionV3;
import com.whoop.trends.data.model.RecordedData;
import com.whoop.trends.data.model.SegmentControllerDtoV3;
import com.whoop.trends.data.model.TimeSegmentDtoV3;
import com.whoop.trends.data.model.TrendsMenuItemDtoV3;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import or2.EnumC28166h0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vl2.w */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lvl2/w;", "", "<init>", "()V", "a", "b", "c", "Lvl2/w$a;", "Lvl2/w$b;", "Lvl2/w$c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36130w {

    /* JADX INFO: renamed from: vl2.w$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0015\u0010\f¨\u0006\u001f"}, m65681d2 = {"Lvl2/w$a;", "Lvl2/w;", "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "", "message", HttpHeaders.DATE, "<init>", "(Lor2/h0;Lvl2/a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "c", "()Lor2/h0;", "b", "Lvl2/a;", "()Lvl2/a;", "Ljava/lang/String;", "getMessage", "d", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36130w {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC28166h0 graphKey, EnumC36106a duration, String message, String date) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(date, "date");
            this.graphKey = graphKey;
            this.duration = duration;
            this.message = message;
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC36106a getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.graphKey == aVar.graphKey && this.duration == aVar.duration && AbstractC22676k.m65745e(this.message, aVar.message) && AbstractC22676k.m65745e(this.date, aVar.date);
        }

        public int hashCode() {
            return this.date.hashCode() + AbstractC11266d.m30450d((this.duration.hashCode() + (this.graphKey.hashCode() * 31)) * 31, 31, this.message);
        }

        public String toString() {
            EnumC28166h0 enumC28166h0 = this.graphKey;
            EnumC36106a enumC36106a = this.duration;
            String str = this.message;
            String str2 = this.date;
            StringBuilder sb4 = new StringBuilder("ErrorV3(graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", duration=");
            sb4.append(enumC36106a);
            sb4.append(", message=");
            return AbstractC11266d.m30464r(sb4, str, ", date=", str2, ")");
        }
    }

    /* JADX INFO: renamed from: vl2.w$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvl2/w$b;", "Lvl2/w;", "Lor2/h0;", "graphKey", "<init>", "(Lor2/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lor2/h0;", "()Lor2/h0;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC36130w {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC28166h0 graphKey) {
            super(null);
            AbstractC22676k.m65750j(graphKey, "graphKey");
            this.graphKey = graphKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC28166h0 getGraphKey() {
            return this.graphKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.graphKey == ((b) other).graphKey;
        }

        public int hashCode() {
            return this.graphKey.hashCode();
        }

        public String toString() {
            return "Loading(graphKey=" + this.graphKey + ")";
        }
    }

    /* JADX INFO: renamed from: vl2.w$c */
    @Metadata(m65680d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010'\u001a\u00020%\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000f\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u000f\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u000f\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00108\u001a\u00020%\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u000f\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020%2\b\u0010I\u001a\u0004\u0018\u00010HHÖ\u0003¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010DR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010DR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010M\u001a\u0004\bV\u0010DR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bc\u0010\\\u001a\u0004\bO\u0010^R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\ba\u0010jR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\b[\u0010mR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010M\u001a\u0004\bU\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\b_\u0010qR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010M\u001a\u0004\bc\u0010DR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bh\u0010uR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f8\u0006¢\u0006\f\n\u0004\bv\u0010e\u001a\u0004\bw\u0010gR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bk\u0010zR\u0019\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bY\u0010y\u001a\u0004\b{\u0010zR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bo\u0010~R\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0004\b`\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010&\u001a\u00020%8\u0006¢\u0006\u000f\n\u0005\bf\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010'\u001a\u00020%8\u0006¢\u0006\u000f\n\u0005\bT\u0010\u0082\u0001\u001a\u0006\b\u0085\u0001\u0010\u0084\u0001R\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000f\n\u0005\bV\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010e\u001a\u0005\b\u0089\u0001\u0010gR\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u008a\u0001\u001a\u0005\bS\u0010\u008b\u0001R\u001f\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bw\u0010e\u001a\u0004\b|\u0010gR\u001f\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b{\u0010e\u001a\u0004\bd\u0010gR\u0019\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\br\u0010DR \u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u000f8\u0006¢\u0006\r\n\u0004\bb\u0010e\u001a\u0005\b\u008c\u0001\u0010gR\u001c\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\bL\u0010\u008f\u0001R\u001c\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0090\u0001\u001a\u0005\bn\u0010\u0091\u0001R\u001b\u00108\u001a\u00020%8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0082\u0001\u001a\u0006\b\u008d\u0001\u0010\u0084\u0001R\u001c\u0010:\u001a\u0004\u0018\u0001098\u0006¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u0092\u0001\u001a\u0005\bs\u0010\u0093\u0001R \u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u000f8\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010e\u001a\u0004\bW\u0010gR\u001b\u0010>\u001a\u0004\u0018\u00010=8\u0006¢\u0006\u000e\n\u0005\b]\u0010\u0094\u0001\u001a\u0005\bx\u0010\u0095\u0001R\u001a\u0010@\u001a\u00020?8\u0006¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\bv\u0010\u0098\u0001¨\u0006\u0099\u0001"}, m65681d2 = {"Lvl2/w$c;", "Lvl2/w;", "", "headerNameDisplay", "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "segmentController", "noDataNameDisplay", "noDataSubtextNameDisplay", "Lcom/whoop/trends/data/model/MetricEducationV3;", "metricEducation", "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "weekGraph", "monthGraph", "sixMonthGraph", "allTimeGraph", "", "Lcom/whoop/trends/data/model/NavigationSectionV3;", "navSections", "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, HttpHeaders.DATE, "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "educationCarouselModel", "infoCallout", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "integrationsUpsell", "Lvl2/z;", "scrubberValue", "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "manualMeasurementItem", "seeAllDataItem", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "manualMeasurementSheet", "Lcom/whoop/trends/data/model/RecordedData;", "recordedData", "", "recordedDataError", "successSavingManualMeasurement", "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "upsellCard", "Lcom/whoop/design/models/items/MenuItemModel;", "trendMenuList", "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "cardioFitnessLevel", "metricEducationList", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCalloutList", "manualMeasurementTextDisplay", "Lvl2/m;", "trendMenus", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "additionalInfoText", "Lvl2/f;", "manualMeasurementRecords", "successDeleteMeasurement", "Lcm2/i;", "measurementId", "Lcom/whoop/design/models/DesignSystemModel;", "designItems", "Lcom/whoop/trends/data/model/MetaData;", "metadata", "Lvl2/e;", "measurementRecordDeleteState", "<init>", "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;Lor2/h0;Lvl2/a;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/util/List;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/RecordedData;ZZLcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lvl2/f;ZLcm2/i;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lvl2/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getHeaderNameDisplay", "b", "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "C", "()Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "d", "x", "e", "Lcom/whoop/trends/data/model/MetricEducationV3;", "s", "()Lcom/whoop/trends/data/model/MetricEducationV3;", "f", "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "J", "()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "g", "u", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "D", "i", "j", "Ljava/util/List;", "v", "()Ljava/util/List;", "k", "Lor2/h0;", "()Lor2/h0;", "l", "Lvl2/a;", "()Lvl2/a;", "m", "n", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "o", "p", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "()Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "q", "A", "r", "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "B", "t", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "()Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "Lcom/whoop/trends/data/model/RecordedData;", "y", "()Lcom/whoop/trends/data/model/RecordedData;", "Z", "z", "()Z", "F", "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "I", "()Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;", "G", "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "()Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "H", "E", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "Lvl2/f;", "()Lvl2/f;", "Lcm2/i;", "()Lcm2/i;", "Lcom/whoop/trends/data/model/MetaData;", "()Lcom/whoop/trends/data/model/MetaData;", "K", "Lvl2/e;", "()Lvl2/e;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36130w {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final List<MetricEducationV3> metricEducationList;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private final List<InfoCalloutTileModel> infoCalloutList;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private final String manualMeasurementTextDisplay;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private final List<C36120m> trendMenus;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private final AdditionalInfoTextModel additionalInfoText;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final C36113f manualMeasurementRecords;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final boolean successDeleteMeasurement;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private final EnumC4821i measurementId;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        private final List<DesignSystemModel> designItems;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        private final MetaData metadata;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
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
        private final TimeSegmentDtoV3 weekGraph;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TimeSegmentDtoV3 monthGraph;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TimeSegmentDtoV3 sixMonthGraph;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final TimeSegmentDtoV3 allTimeGraph;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final List<NavigationSectionV3> navSections;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final EnumC28166h0 graphKey;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final EnumC36106a duration;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final ArticleTileCarouselModel educationCarouselModel;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final String infoCallout;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final IntegrationsUpsellDtoV3 integrationsUpsell;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final List<C36133z> scrubberValue;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final TrendsMenuItemDtoV3 manualMeasurementItem;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final TrendsMenuItemDtoV3 seeAllDataItem;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final ManualMeasurementSheet manualMeasurementSheet;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final RecordedData recordedData;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final boolean recordedDataError;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final boolean successSavingManualMeasurement;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final TextWithIllustrationCardModel upsellCard;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final List<MenuItemModel> trendMenuList;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final CardioFitnessLevelModel cardioFitnessLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String headerNameDisplay, SegmentControllerDtoV3 segmentController, String noDataNameDisplay, String noDataSubtextNameDisplay, MetricEducationV3 metricEducationV3, TimeSegmentDtoV3 timeSegmentDtoV3, TimeSegmentDtoV3 monthGraph, TimeSegmentDtoV3 sixMonthGraph, TimeSegmentDtoV3 timeSegmentDtoV4, List<NavigationSectionV3> navSections, EnumC28166h0 graphKey, EnumC36106a duration, String date, ArticleTileCarouselModel articleTileCarouselModel, String str, IntegrationsUpsellDtoV3 integrationsUpsellDtoV3, List<C36133z> scrubberValue, TrendsMenuItemDtoV3 trendsMenuItemDtoV3, TrendsMenuItemDtoV3 trendsMenuItemDtoV4, ManualMeasurementSheet manualMeasurementSheet, RecordedData recordedData, boolean z4, boolean z13, TextWithIllustrationCardModel textWithIllustrationCardModel, List<MenuItemModel> trendMenuList, CardioFitnessLevelModel cardioFitnessLevelModel, List<MetricEducationV3> list, List<InfoCalloutTileModel> list2, String str2, List<C36120m> list3, AdditionalInfoTextModel additionalInfoTextModel, C36113f c36113f, boolean z14, EnumC4821i enumC4821i, List<? extends DesignSystemModel> list4, MetaData metaData, AbstractC36112e measurementRecordDeleteState) {
            super(null);
            AbstractC22676k.m65750j(headerNameDisplay, "headerNameDisplay");
            AbstractC22676k.m65750j(segmentController, "segmentController");
            AbstractC22676k.m65750j(noDataNameDisplay, "noDataNameDisplay");
            AbstractC22676k.m65750j(noDataSubtextNameDisplay, "noDataSubtextNameDisplay");
            AbstractC22676k.m65750j(monthGraph, "monthGraph");
            AbstractC22676k.m65750j(sixMonthGraph, "sixMonthGraph");
            AbstractC22676k.m65750j(navSections, "navSections");
            AbstractC22676k.m65750j(graphKey, "graphKey");
            AbstractC22676k.m65750j(duration, "duration");
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(scrubberValue, "scrubberValue");
            AbstractC22676k.m65750j(trendMenuList, "trendMenuList");
            AbstractC22676k.m65750j(measurementRecordDeleteState, "measurementRecordDeleteState");
            this.headerNameDisplay = headerNameDisplay;
            this.segmentController = segmentController;
            this.noDataNameDisplay = noDataNameDisplay;
            this.noDataSubtextNameDisplay = noDataSubtextNameDisplay;
            this.metricEducation = metricEducationV3;
            this.weekGraph = timeSegmentDtoV3;
            this.monthGraph = monthGraph;
            this.sixMonthGraph = sixMonthGraph;
            this.allTimeGraph = timeSegmentDtoV4;
            this.navSections = navSections;
            this.graphKey = graphKey;
            this.duration = duration;
            this.date = date;
            this.educationCarouselModel = articleTileCarouselModel;
            this.infoCallout = str;
            this.integrationsUpsell = integrationsUpsellDtoV3;
            this.scrubberValue = scrubberValue;
            this.manualMeasurementItem = trendsMenuItemDtoV3;
            this.seeAllDataItem = trendsMenuItemDtoV4;
            this.manualMeasurementSheet = manualMeasurementSheet;
            this.recordedData = recordedData;
            this.recordedDataError = z4;
            this.successSavingManualMeasurement = z13;
            this.upsellCard = textWithIllustrationCardModel;
            this.trendMenuList = trendMenuList;
            this.cardioFitnessLevel = cardioFitnessLevelModel;
            this.metricEducationList = list;
            this.infoCalloutList = list2;
            this.manualMeasurementTextDisplay = str2;
            this.trendMenus = list3;
            this.additionalInfoText = additionalInfoTextModel;
            this.manualMeasurementRecords = c36113f;
            this.successDeleteMeasurement = z14;
            this.measurementId = enumC4821i;
            this.designItems = list4;
            this.metadata = metaData;
            this.measurementRecordDeleteState = measurementRecordDeleteState;
        }

        /* JADX INFO: renamed from: A */
        public final List<C36133z> m114909A() {
            return this.scrubberValue;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final TrendsMenuItemDtoV3 getSeeAllDataItem() {
            return this.seeAllDataItem;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final SegmentControllerDtoV3 getSegmentController() {
            return this.segmentController;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final TimeSegmentDtoV3 getSixMonthGraph() {
            return this.sixMonthGraph;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final boolean getSuccessDeleteMeasurement() {
            return this.successDeleteMeasurement;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final boolean getSuccessSavingManualMeasurement() {
            return this.successSavingManualMeasurement;
        }

        /* JADX INFO: renamed from: G */
        public final List<MenuItemModel> m114915G() {
            return this.trendMenuList;
        }

        /* JADX INFO: renamed from: H */
        public final List<C36120m> m114916H() {
            return this.trendMenus;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final TextWithIllustrationCardModel getUpsellCard() {
            return this.upsellCard;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final TimeSegmentDtoV3 getWeekGraph() {
            return this.weekGraph;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdditionalInfoTextModel getAdditionalInfoText() {
            return this.additionalInfoText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TimeSegmentDtoV3 getAllTimeGraph() {
            return this.allTimeGraph;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CardioFitnessLevelModel getCardioFitnessLevel() {
            return this.cardioFitnessLevel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: e */
        public final List<DesignSystemModel> m114923e() {
            return this.designItems;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.headerNameDisplay, cVar.headerNameDisplay) && AbstractC22676k.m65745e(this.segmentController, cVar.segmentController) && AbstractC22676k.m65745e(this.noDataNameDisplay, cVar.noDataNameDisplay) && AbstractC22676k.m65745e(this.noDataSubtextNameDisplay, cVar.noDataSubtextNameDisplay) && AbstractC22676k.m65745e(this.metricEducation, cVar.metricEducation) && AbstractC22676k.m65745e(this.weekGraph, cVar.weekGraph) && AbstractC22676k.m65745e(this.monthGraph, cVar.monthGraph) && AbstractC22676k.m65745e(this.sixMonthGraph, cVar.sixMonthGraph) && AbstractC22676k.m65745e(this.allTimeGraph, cVar.allTimeGraph) && AbstractC22676k.m65745e(this.navSections, cVar.navSections) && this.graphKey == cVar.graphKey && this.duration == cVar.duration && AbstractC22676k.m65745e(this.date, cVar.date) && AbstractC22676k.m65745e(this.educationCarouselModel, cVar.educationCarouselModel) && AbstractC22676k.m65745e(this.infoCallout, cVar.infoCallout) && AbstractC22676k.m65745e(this.integrationsUpsell, cVar.integrationsUpsell) && AbstractC22676k.m65745e(this.scrubberValue, cVar.scrubberValue) && AbstractC22676k.m65745e(this.manualMeasurementItem, cVar.manualMeasurementItem) && AbstractC22676k.m65745e(this.seeAllDataItem, cVar.seeAllDataItem) && AbstractC22676k.m65745e(this.manualMeasurementSheet, cVar.manualMeasurementSheet) && AbstractC22676k.m65745e(this.recordedData, cVar.recordedData) && this.recordedDataError == cVar.recordedDataError && this.successSavingManualMeasurement == cVar.successSavingManualMeasurement && AbstractC22676k.m65745e(this.upsellCard, cVar.upsellCard) && AbstractC22676k.m65745e(this.trendMenuList, cVar.trendMenuList) && AbstractC22676k.m65745e(this.cardioFitnessLevel, cVar.cardioFitnessLevel) && AbstractC22676k.m65745e(this.metricEducationList, cVar.metricEducationList) && AbstractC22676k.m65745e(this.infoCalloutList, cVar.infoCalloutList) && AbstractC22676k.m65745e(this.manualMeasurementTextDisplay, cVar.manualMeasurementTextDisplay) && AbstractC22676k.m65745e(this.trendMenus, cVar.trendMenus) && AbstractC22676k.m65745e(this.additionalInfoText, cVar.additionalInfoText) && AbstractC22676k.m65745e(this.manualMeasurementRecords, cVar.manualMeasurementRecords) && this.successDeleteMeasurement == cVar.successDeleteMeasurement && this.measurementId == cVar.measurementId && AbstractC22676k.m65745e(this.designItems, cVar.designItems) && AbstractC22676k.m65745e(this.metadata, cVar.metadata) && AbstractC22676k.m65745e(this.measurementRecordDeleteState, cVar.measurementRecordDeleteState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC36106a getDuration() {
            return this.duration;
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
            TimeSegmentDtoV3 timeSegmentDtoV3 = this.weekGraph;
            int iHashCode2 = (this.sixMonthGraph.hashCode() + ((this.monthGraph.hashCode() + ((iHashCode + (timeSegmentDtoV3 == null ? 0 : timeSegmentDtoV3.hashCode())) * 31)) * 31)) * 31;
            TimeSegmentDtoV3 timeSegmentDtoV4 = this.allTimeGraph;
            int iM30450d2 = AbstractC11266d.m30450d((this.duration.hashCode() + ((this.graphKey.hashCode() + AbstractC11895b.m31983b((iHashCode2 + (timeSegmentDtoV4 == null ? 0 : timeSegmentDtoV4.hashCode())) * 31, 31, this.navSections)) * 31)) * 31, 31, this.date);
            ArticleTileCarouselModel articleTileCarouselModel = this.educationCarouselModel;
            int iHashCode3 = (iM30450d2 + (articleTileCarouselModel == null ? 0 : articleTileCarouselModel.hashCode())) * 31;
            String str = this.infoCallout;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            IntegrationsUpsellDtoV3 integrationsUpsellDtoV3 = this.integrationsUpsell;
            int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (integrationsUpsellDtoV3 == null ? 0 : integrationsUpsellDtoV3.hashCode())) * 31, 31, this.scrubberValue);
            TrendsMenuItemDtoV3 trendsMenuItemDtoV3 = this.manualMeasurementItem;
            int iHashCode5 = (iM31983b + (trendsMenuItemDtoV3 == null ? 0 : trendsMenuItemDtoV3.hashCode())) * 31;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV4 = this.seeAllDataItem;
            int iHashCode6 = (iHashCode5 + (trendsMenuItemDtoV4 == null ? 0 : trendsMenuItemDtoV4.hashCode())) * 31;
            ManualMeasurementSheet manualMeasurementSheet = this.manualMeasurementSheet;
            int iHashCode7 = (iHashCode6 + (manualMeasurementSheet == null ? 0 : manualMeasurementSheet.hashCode())) * 31;
            RecordedData recordedData = this.recordedData;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode7 + (recordedData == null ? 0 : recordedData.hashCode())) * 31, 31, this.recordedDataError), 31, this.successSavingManualMeasurement);
            TextWithIllustrationCardModel textWithIllustrationCardModel = this.upsellCard;
            int iM31983b2 = AbstractC11895b.m31983b((iM8289b + (textWithIllustrationCardModel == null ? 0 : textWithIllustrationCardModel.hashCode())) * 31, 31, this.trendMenuList);
            CardioFitnessLevelModel cardioFitnessLevelModel = this.cardioFitnessLevel;
            int iHashCode8 = (iM31983b2 + (cardioFitnessLevelModel == null ? 0 : cardioFitnessLevelModel.hashCode())) * 31;
            List<MetricEducationV3> list = this.metricEducationList;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            List<InfoCalloutTileModel> list2 = this.infoCalloutList;
            int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str2 = this.manualMeasurementTextDisplay;
            int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<C36120m> list3 = this.trendMenus;
            int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
            AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
            int iHashCode13 = (iHashCode12 + (additionalInfoTextModel == null ? 0 : additionalInfoTextModel.hashCode())) * 31;
            C36113f c36113f = this.manualMeasurementRecords;
            int iM8289b2 = AbstractC2875y.m8289b((iHashCode13 + (c36113f == null ? 0 : c36113f.hashCode())) * 31, 31, this.successDeleteMeasurement);
            EnumC4821i enumC4821i = this.measurementId;
            int iHashCode14 = (iM8289b2 + (enumC4821i == null ? 0 : enumC4821i.hashCode())) * 31;
            List<DesignSystemModel> list4 = this.designItems;
            int iHashCode15 = (iHashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
            MetaData metaData = this.metadata;
            return this.measurementRecordDeleteState.hashCode() + ((iHashCode15 + (metaData != null ? metaData.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getInfoCallout() {
            return this.infoCallout;
        }

        /* JADX INFO: renamed from: j */
        public final List<InfoCalloutTileModel> m114928j() {
            return this.infoCalloutList;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final IntegrationsUpsellDtoV3 getIntegrationsUpsell() {
            return this.integrationsUpsell;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TrendsMenuItemDtoV3 getManualMeasurementItem() {
            return this.manualMeasurementItem;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final C36113f getManualMeasurementRecords() {
            return this.manualMeasurementRecords;
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
        public final AbstractC36112e getMeasurementRecordDeleteState() {
            return this.measurementRecordDeleteState;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final MetaData getMetadata() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final MetricEducationV3 getMetricEducation() {
            return this.metricEducation;
        }

        /* JADX INFO: renamed from: t */
        public final List<MetricEducationV3> m114938t() {
            return this.metricEducationList;
        }

        public String toString() {
            String str = this.headerNameDisplay;
            SegmentControllerDtoV3 segmentControllerDtoV3 = this.segmentController;
            String str2 = this.noDataNameDisplay;
            String str3 = this.noDataSubtextNameDisplay;
            MetricEducationV3 metricEducationV3 = this.metricEducation;
            TimeSegmentDtoV3 timeSegmentDtoV3 = this.weekGraph;
            TimeSegmentDtoV3 timeSegmentDtoV4 = this.monthGraph;
            TimeSegmentDtoV3 timeSegmentDtoV5 = this.sixMonthGraph;
            TimeSegmentDtoV3 timeSegmentDtoV6 = this.allTimeGraph;
            List<NavigationSectionV3> list = this.navSections;
            EnumC28166h0 enumC28166h0 = this.graphKey;
            EnumC36106a enumC36106a = this.duration;
            String str4 = this.date;
            ArticleTileCarouselModel articleTileCarouselModel = this.educationCarouselModel;
            String str5 = this.infoCallout;
            IntegrationsUpsellDtoV3 integrationsUpsellDtoV3 = this.integrationsUpsell;
            List<C36133z> list2 = this.scrubberValue;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV3 = this.manualMeasurementItem;
            TrendsMenuItemDtoV3 trendsMenuItemDtoV4 = this.seeAllDataItem;
            ManualMeasurementSheet manualMeasurementSheet = this.manualMeasurementSheet;
            RecordedData recordedData = this.recordedData;
            boolean z4 = this.recordedDataError;
            boolean z13 = this.successSavingManualMeasurement;
            TextWithIllustrationCardModel textWithIllustrationCardModel = this.upsellCard;
            List<MenuItemModel> list3 = this.trendMenuList;
            CardioFitnessLevelModel cardioFitnessLevelModel = this.cardioFitnessLevel;
            List<MetricEducationV3> list4 = this.metricEducationList;
            List<InfoCalloutTileModel> list5 = this.infoCalloutList;
            String str6 = this.manualMeasurementTextDisplay;
            List<C36120m> list6 = this.trendMenus;
            AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
            C36113f c36113f = this.manualMeasurementRecords;
            boolean z14 = this.successDeleteMeasurement;
            EnumC4821i enumC4821i = this.measurementId;
            List<DesignSystemModel> list7 = this.designItems;
            MetaData metaData = this.metadata;
            AbstractC36112e abstractC36112e = this.measurementRecordDeleteState;
            StringBuilder sb4 = new StringBuilder("ResultV3(headerNameDisplay=");
            sb4.append(str);
            sb4.append(", segmentController=");
            sb4.append(segmentControllerDtoV3);
            sb4.append(", noDataNameDisplay=");
            AbstractC11266d.m30444B(sb4, str2, ", noDataSubtextNameDisplay=", str3, ", metricEducation=");
            sb4.append(metricEducationV3);
            sb4.append(", weekGraph=");
            sb4.append(timeSegmentDtoV3);
            sb4.append(", monthGraph=");
            sb4.append(timeSegmentDtoV4);
            sb4.append(", sixMonthGraph=");
            sb4.append(timeSegmentDtoV5);
            sb4.append(", allTimeGraph=");
            sb4.append(timeSegmentDtoV6);
            sb4.append(", navSections=");
            sb4.append(list);
            sb4.append(", graphKey=");
            sb4.append(enumC28166h0);
            sb4.append(", duration=");
            sb4.append(enumC36106a);
            sb4.append(", date=");
            sb4.append(str4);
            sb4.append(", educationCarouselModel=");
            sb4.append(articleTileCarouselModel);
            sb4.append(", infoCallout=");
            sb4.append(str5);
            sb4.append(", integrationsUpsell=");
            sb4.append(integrationsUpsellDtoV3);
            sb4.append(", scrubberValue=");
            sb4.append(list2);
            sb4.append(", manualMeasurementItem=");
            sb4.append(trendsMenuItemDtoV3);
            sb4.append(", seeAllDataItem=");
            sb4.append(trendsMenuItemDtoV4);
            sb4.append(", manualMeasurementSheet=");
            sb4.append(manualMeasurementSheet);
            sb4.append(", recordedData=");
            sb4.append(recordedData);
            sb4.append(", recordedDataError=");
            sb4.append(z4);
            sb4.append(", successSavingManualMeasurement=");
            sb4.append(z13);
            sb4.append(", upsellCard=");
            sb4.append(textWithIllustrationCardModel);
            sb4.append(", trendMenuList=");
            sb4.append(list3);
            sb4.append(", cardioFitnessLevel=");
            sb4.append(cardioFitnessLevelModel);
            sb4.append(", metricEducationList=");
            AbstractC21702c.m61148s(sb4, list4, ", infoCalloutList=", list5, ", manualMeasurementTextDisplay=");
            AbstractC36095b.m114694v(str6, ", trendMenus=", ", additionalInfoText=", sb4, list6);
            sb4.append(additionalInfoTextModel);
            sb4.append(", manualMeasurementRecords=");
            sb4.append(c36113f);
            sb4.append(", successDeleteMeasurement=");
            sb4.append(z14);
            sb4.append(", measurementId=");
            sb4.append(enumC4821i);
            sb4.append(", designItems=");
            sb4.append(list7);
            sb4.append(", metadata=");
            sb4.append(metaData);
            sb4.append(", measurementRecordDeleteState=");
            sb4.append(abstractC36112e);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final TimeSegmentDtoV3 getMonthGraph() {
            return this.monthGraph;
        }

        /* JADX INFO: renamed from: v */
        public final List<NavigationSectionV3> m114940v() {
            return this.navSections;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final String getNoDataNameDisplay() {
            return this.noDataNameDisplay;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getNoDataSubtextNameDisplay() {
            return this.noDataSubtextNameDisplay;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final RecordedData getRecordedData() {
            return this.recordedData;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean getRecordedDataError() {
            return this.recordedDataError;
        }
    }

    public /* synthetic */ AbstractC36130w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36130w() {
    }
}
