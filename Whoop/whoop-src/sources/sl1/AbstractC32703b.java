package sl1;

import a11.EnumC0124b;
import a11.EnumC0125c;
import a11.EnumC0126d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import os0.AbstractC28312h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sl1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012!\u00171\u001f#2%\u001b\u001d3(0-'\u0019\u001c45B\u0095\u0001\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b\u0017\u0010*R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b\u001b\u0010,R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001d\u0010/R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b\u0014\u0010&\u0082\u0001\u00126789:;<=>?@ABCDEFG¨\u0006H"}, m65681d2 = {"Lsl1/b;", "", "Lcom/whoop/design/util/TextResource;", "titleMessage", "subTitleMessage", "subTitleTrailingMessage", "", "leftIcon", "", "leftLottieAnimation", "dataLabel", "timeLabel", "ctaButtonLabel", "useSolidCtaButton", "La11/d;", "connectivityInfoTileType", "La11/b;", "connectivityNavType", "La11/c;", "connectivityStatusType", "isVisible", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/b;La11/c;Z)V", "a", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "getSubTitleTrailingMessage", "d", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "e", "Z", "g", "()Z", "i", "k", "La11/d;", "()La11/d;", "La11/b;", "()La11/b;", "l", "La11/c;", "()La11/c;", "m", "p", "q", "r", "n", "o", "Lsl1/b$a;", "Lsl1/b$b;", "Lsl1/b$c;", "Lsl1/b$d;", "Lsl1/b$e;", "Lsl1/b$f;", "Lsl1/b$g;", "Lsl1/b$h;", "Lsl1/b$i;", "Lsl1/b$j;", "Lsl1/b$k;", "Lsl1/b$l;", "Lsl1/b$m;", "Lsl1/b$n;", "Lsl1/b$o;", "Lsl1/b$p;", "Lsl1/b$q;", "Lsl1/b$r;", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32703b {

    /* JADX INFO: renamed from: n */
    public static final int f135839n = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleMessage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subTitleMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subTitleTrailingMessage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer leftIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean leftLottieAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource dataLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource timeLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource ctaButtonLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean useSolidCtaButton;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC0126d connectivityInfoTileType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC0124b connectivityNavType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC0125c connectivityStatusType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: sl1.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$a;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final a f135853o = new a();

        /* JADX INFO: renamed from: p */
        public static final int f135854p = TextResource.$stable;

        private a() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114177m), AbstractC8693b.m21277k(AbstractC28312h.f114176l), null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getBluetooth()), false, null, null, AbstractC8693b.m21277k(AbstractC28312h.f114175k), false, null, EnumC0124b.BLUETOOTH, null, false, 7028, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$b;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final b f135855o = new b();

        /* JADX INFO: renamed from: p */
        public static final int f135856p = TextResource.$stable;

        private b() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114179o), null, null, Integer.valueOf(C38072d.f163053a.m121951d().getStrap().getStrap()), false, null, null, null, false, null, null, EnumC0125c.LOADING, false, 6134, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$c;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final c f135857o = new c();

        /* JADX INFO: renamed from: p */
        public static final int f135858p = TextResource.$stable;

        private c() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114180p), null, null, Integer.valueOf(C38072d.f163053a.m121951d().getStrap().getStrap()), false, null, null, null, false, null, null, EnumC0125c.ERROR, false, 6134, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, m65681d2 = {"Lsl1/b$d;", "Lsl1/b;", "Lcom/whoop/design/util/TextResource;", "time", "", "minBehind", "<init>", "(Lcom/whoop/design/util/TextResource;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "o", "Lcom/whoop/design/util/TextResource;", "getTime", "()Lcom/whoop/design/util/TextResource;", "p", "I", "getMinBehind", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC32703b {

        /* JADX INFO: renamed from: q */
        public static final int f135859q = TextResource.$stable;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final TextResource time;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final int minBehind;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextResource time, int i13) {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114182r), null, null, Integer.valueOf(C38072d.f163053a.m121951d().getConnections().getCloud()), false, AbstractC8693b.m21277k(AbstractC28312h.f114181q), time, null, false, null, null, EnumC0125c.LOADING, false, 6038, null);
            AbstractC22676k.m65750j(time, "time");
            this.time = time;
            this.minBehind = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.time, dVar.time) && this.minBehind == dVar.minBehind;
        }

        public int hashCode() {
            return Integer.hashCode(this.minBehind) + (this.time.hashCode() * 31);
        }

        public String toString() {
            return "DataCatchingUpConnectivityTile(time=" + this.time + ", minBehind=" + this.minBehind + ")";
        }
    }

    /* JADX INFO: renamed from: sl1.b$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lsl1/b$e;", "Lsl1/b;", "Lcom/whoop/design/util/TextResource;", "time", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "o", "Lcom/whoop/design/util/TextResource;", "getTime", "()Lcom/whoop/design/util/TextResource;", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC32703b {

        /* JADX INFO: renamed from: p */
        public static final int f135862p = TextResource.$stable;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final TextResource time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextResource time) {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114183s), null, null, null, false, AbstractC8693b.m21277k(AbstractC28312h.f114181q), time, null, false, null, null, EnumC0125c.COMPLETE, false, 6046, null);
            AbstractC22676k.m65750j(time, "time");
            this.time = time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.time, ((e) other).time);
        }

        public int hashCode() {
            return this.time.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("DataCaughtUpConnectivityTile(time=", this.time, ")");
        }
    }

    /* JADX INFO: renamed from: sl1.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$f;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final f f135864o = new f();

        /* JADX INFO: renamed from: p */
        public static final int f135865p = TextResource.$stable;

        private f() {
            super(AbstractC8693b.m21267a(), null, null, null, false, null, null, null, false, null, null, null, false, 4094, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lsl1/b$g;", "Lsl1/b;", "", "deviceName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "o", "Ljava/lang/String;", "getDeviceName", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC32703b {

        /* JADX INFO: renamed from: p */
        public static final int f135866p = TextResource.$stable;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final String deviceName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String deviceName) {
            super(new TextResource.C8688b(AbstractC28312h.f114178n, (List<? extends TextResource.AbstractC8690d>) AbstractC37056f.m118958J(new TextResource.AbstractC8690d.a(deviceName))), null, null, Integer.valueOf(C38072d.f163053a.m121951d().getStrap().getStrap()), false, null, null, null, false, null, null, EnumC0125c.COMPLETE, false, 6134, null);
            AbstractC22676k.m65750j(deviceName, "deviceName");
            this.deviceName = deviceName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.deviceName, ((g) other).deviceName);
        }

        public int hashCode() {
            return this.deviceName.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeviceConnectedTile(deviceName=", this.deviceName, ")");
        }
    }

    /* JADX INFO: renamed from: sl1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$h;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final h f135868o = new h();

        /* JADX INFO: renamed from: p */
        public static final int f135869p = TextResource.$stable;

        private h() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114139D), AbstractC8693b.m21277k(AbstractC28312h.f114163a0), null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getChip()), false, null, null, AbstractC8693b.m21277k(AbstractC28312h.f114161Z), true, null, null, null, false, 7796, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$i;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final i f135870o = new i();

        /* JADX INFO: renamed from: p */
        public static final int f135871p = TextResource.$stable;

        private i() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114148M), null, null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getAttentionOrange()), false, null, null, null, false, EnumC0126d.WARNING, null, EnumC0125c.CROSS, false, 5622, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$j;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final j f135872o = new j();

        /* JADX INFO: renamed from: p */
        public static final int f135873p = TextResource.$stable;

        private j() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114148M), AbstractC8693b.m21277k(AbstractC28312h.f114147L), null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getAttentionOrange()), false, null, null, null, false, EnumC0126d.WARNING, null, EnumC0125c.RETRY, false, 5620, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$k */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$k;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final k f135874o = new k();

        /* JADX INFO: renamed from: p */
        public static final int f135875p = TextResource.$stable;

        private k() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114152Q), AbstractC8693b.m21277k(AbstractC28312h.f114140E), null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getChip()), false, null, null, AbstractC8693b.m21277k(AbstractC28312h.f114141F), false, null, null, null, false, 8052, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$l */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$l;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final l f135876o = new l();

        /* JADX INFO: renamed from: p */
        public static final int f135877p = TextResource.$stable;

        private l() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114151P), AbstractC8693b.m21277k(AbstractC28312h.f114150O), null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getCheckmark()), false, null, null, null, false, EnumC0126d.SUCCESS, null, EnumC0125c.CROSS, false, 5620, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$m */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$m;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final m f135878o = new m();

        /* JADX INFO: renamed from: p */
        public static final int f135879p = TextResource.$stable;

        private m() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114154S), AbstractC8693b.m21277k(AbstractC28312h.f114153R), null, null, true, null, null, null, false, null, null, null, false, 8172, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$n */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$n;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final n f135880o = new n();

        /* JADX INFO: renamed from: p */
        public static final int f135881p = TextResource.$stable;

        private n() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114138C), AbstractC8693b.m21277k(AbstractC28312h.f114167c0), null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getChip()), false, null, null, AbstractC8693b.m21277k(AbstractC28312h.f114137B), true, null, null, null, false, 7796, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$o */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lsl1/b$o;", "Lsl1/b;", "", "batteryPercentage", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "o", "I", "getBatteryPercentage", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC32703b {

        /* JADX INFO: renamed from: p */
        public static final int f135882p = TextResource.$stable;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final int batteryPercentage;

        public o(int i13) {
            super(new TextResource.C8688b(AbstractC28312h.f114171g, (List<? extends TextResource.AbstractC8690d>) AbstractC37056f.m118958J(new TextResource.AbstractC8690d.a(AbstractC31061c.m95635k(i13, "%")))), AbstractC8693b.m21277k(AbstractC28312h.f114170f), null, Integer.valueOf(C38072d.f163053a.m121951d().getTinyIcons().getTinyStrap()), false, null, null, null, false, null, null, EnumC0125c.CROSS, false, 6132, null);
            this.batteryPercentage = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && this.batteryPercentage == ((o) other).batteryPercentage;
        }

        public int hashCode() {
            return Integer.hashCode(this.batteryPercentage);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.batteryPercentage, "LowBatteryOnceADayTile(batteryPercentage=", ")");
        }
    }

    /* JADX INFO: renamed from: sl1.b$p */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$p;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final p f135884o = new p();

        /* JADX INFO: renamed from: p */
        public static final int f135885p = TextResource.$stable;

        private p() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114185u), AbstractC8693b.m21277k(AbstractC28312h.f114184t), null, Integer.valueOf(C38072d.f163053a.m121951d().getConnections().getNoNetworkRed()), false, null, null, null, false, null, null, null, false, 8180, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$q;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final q f135886o = new q();

        /* JADX INFO: renamed from: p */
        public static final int f135887p = TextResource.$stable;

        /* JADX WARN: Illegal instructions before constructor call */
        private q() {
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC28312h.f114187w);
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC28312h.f114186v);
            int iM46212b = C38072d.f163053a.m121951d().getStrap().getPairStrap();
            EnumC0125c enumC0125c = EnumC0125c.ARROW;
            TextResource textResource = null;
            boolean z4 = false;
            TextResource textResource2 = null;
            TextResource textResource3 = null;
            TextResource textResource4 = null;
            boolean z13 = false;
            EnumC0126d enumC0126d = null;
            super(c8688bM21277k, c8688bM21277k2, textResource, Integer.valueOf(iM46212b), z4, textResource2, textResource3, textResource4, z13, enumC0126d, EnumC0124b.PAIR_STRAP, enumC0125c, false, 5108, null);
        }
    }

    /* JADX INFO: renamed from: sl1.b$r */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lsl1/b$r;", "Lsl1/b;", "<init>", "()V", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32703b {

        /* JADX INFO: renamed from: o */
        public static final r f135888o = new r();

        /* JADX INFO: renamed from: p */
        public static final int f135889p = TextResource.$stable;

        private r() {
            super(AbstractC8693b.m21277k(AbstractC28312h.f114173i), AbstractC8693b.m21277k(AbstractC28312h.f114172h), null, Integer.valueOf(C38072d.f163053a.m121951d().getStrap().getStrap()), false, null, null, null, false, null, null, null, false, 8180, null);
        }
    }

    public /* synthetic */ AbstractC32703b(TextResource textResource, TextResource textResource2, TextResource textResource3, Integer num, boolean z4, TextResource textResource4, TextResource textResource5, TextResource textResource6, boolean z13, EnumC0126d enumC0126d, EnumC0124b enumC0124b, EnumC0125c enumC0125c, boolean z14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, num, z4, textResource4, textResource5, textResource6, z13, enumC0126d, enumC0124b, enumC0125c, z14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC0126d getConnectivityInfoTileType() {
        return this.connectivityInfoTileType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC0124b getConnectivityNavType() {
        return this.connectivityNavType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC0125c getConnectivityStatusType() {
        return this.connectivityStatusType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getCtaButtonLabel() {
        return this.ctaButtonLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDataLabel() {
        return this.dataLabel;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getLeftLottieAnimation() {
        return this.leftLottieAnimation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getSubTitleMessage() {
        return this.subTitleMessage;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTimeLabel() {
        return this.timeLabel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitleMessage() {
        return this.titleMessage;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getUseSolidCtaButton() {
        return this.useSolidCtaButton;
    }

    private AbstractC32703b(TextResource textResource, TextResource textResource2, TextResource textResource3, Integer num, boolean z4, TextResource textResource4, TextResource textResource5, TextResource textResource6, boolean z13, EnumC0126d enumC0126d, EnumC0124b enumC0124b, EnumC0125c enumC0125c, boolean z14) {
        this.titleMessage = textResource;
        this.subTitleMessage = textResource2;
        this.subTitleTrailingMessage = textResource3;
        this.leftIcon = num;
        this.leftLottieAnimation = z4;
        this.dataLabel = textResource4;
        this.timeLabel = textResource5;
        this.ctaButtonLabel = textResource6;
        this.useSolidCtaButton = z13;
        this.connectivityInfoTileType = enumC0126d;
        this.connectivityNavType = enumC0124b;
        this.connectivityStatusType = enumC0125c;
        this.isVisible = z14;
    }

    public /* synthetic */ AbstractC32703b(TextResource textResource, TextResource textResource2, TextResource textResource3, Integer num, boolean z4, TextResource textResource4, TextResource textResource5, TextResource textResource6, boolean z13, EnumC0126d enumC0126d, EnumC0124b enumC0124b, EnumC0125c enumC0125c, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : textResource3, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : textResource4, (i13 & 64) != 0 ? null : textResource5, (i13 & 128) != 0 ? null : textResource6, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? EnumC0126d.STANDARD : enumC0126d, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC0124b.DEFAULT : enumC0124b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC0125c.NONE : enumC0125c, (i13 & 4096) != 0 ? true : z14, null);
    }
}
