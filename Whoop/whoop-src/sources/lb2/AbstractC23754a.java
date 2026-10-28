package lb2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lb2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\bR2\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, m65681d2 = {"Llb2/a;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "eventName", "b", "category", "", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "f", "(Ljava/util/Map;)V", "otherProperties", "e", "promotion", "action", "Llb2/a$a;", "Llb2/a$b;", "Llb2/a$c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23754a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Map<String, ? extends Object> otherProperties;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String promotion;

    public /* synthetic */ AbstractC23754a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getAction();

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, Object> mo69801d() {
        return this.otherProperties;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getPromotion() {
        return this.promotion;
    }

    /* JADX INFO: renamed from: f */
    public void mo69803f(Map<String, ? extends Object> map) {
        this.otherProperties = map;
    }

    /* JADX INFO: renamed from: lb2.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Llb2/a$b;", "Llb2/a;", "", "action", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "a", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC23754a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.action, ((b) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("TrackErrorView(action=", this.action, ")");
        }

        public /* synthetic */ b(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "View Error State" : str);
        }
    }

    private AbstractC23754a() {
        this.eventName = "Gift Hub";
        this.category = "Gift Hub";
    }

    /* JADX INFO: renamed from: lb2.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\fR2\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0017\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Llb2/a$a;", "Llb2/a;", "", "action", "trackingId", "promotion", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "a", "f", "getTrackingId", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Map;", "d", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC23754a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String trackingId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String promotion;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private Map<String, ? extends Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String action, String trackingId, String str, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(trackingId, "trackingId");
            this.action = action;
            this.trackingId = trackingId;
            this.promotion = str;
            this.otherProperties = map;
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo69801d() {
            return this.otherProperties;
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPromotion() {
            return this.promotion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.trackingId, aVar.trackingId) && AbstractC22676k.m65745e(this.promotion, aVar.promotion) && AbstractC22676k.m65745e(this.otherProperties, aVar.otherProperties);
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: f */
        public void mo69803f(Map<String, ? extends Object> map) {
            this.otherProperties = map;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.action.hashCode() * 31, 31, this.trackingId);
            String str = this.promotion;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, ? extends Object> map = this.otherProperties;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.action;
            String str2 = this.trackingId;
            return AbstractC30007c.m91842l(AbstractC11895b.m32001t("TrackClick(action=", str, ", trackingId=", str2, ", promotion="), this.promotion, ", otherProperties=", this.otherProperties, ")");
        }

        public a(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Click" : str, str2, str3, (i13 & 8) != 0 ? AbstractC31061c.m95645u("item_clicked", str2) : map);
        }
    }

    /* JADX INFO: renamed from: lb2.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR2\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0017\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Llb2/a$c;", "Llb2/a;", "", "action", "promotion", "source", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "a", "f", "g", "getSource", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Map;", "d", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC23754a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String promotion;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private Map<String, ? extends Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String action, String str, String str2, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.promotion = str;
            this.source = str2;
            this.otherProperties = map;
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo69801d() {
            return this.otherProperties;
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPromotion() {
            return this.promotion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.action, cVar.action) && AbstractC22676k.m65745e(this.promotion, cVar.promotion) && AbstractC22676k.m65745e(this.source, cVar.source) && AbstractC22676k.m65745e(this.otherProperties, cVar.otherProperties);
        }

        @Override // lb2.AbstractC23754a
        /* JADX INFO: renamed from: f */
        public void mo69803f(Map<String, ? extends Object> map) {
            this.otherProperties = map;
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.promotion;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, ? extends Object> map = this.otherProperties;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.action;
            String str2 = this.promotion;
            return AbstractC30007c.m91842l(AbstractC11895b.m32001t("TrackView(action=", str, ", promotion=", str2, ", source="), this.source, ", otherProperties=", this.otherProperties, ")");
        }

        public c(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "View" : str, str2, str3, (i13 & 8) != 0 ? str3 != null ? AbstractC31061c.m95645u("source", str3) : null : map);
        }
    }
}
