package lv0;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lv0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\f\u000b\u0010\u0005\u0007\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000b\u0010\bR(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m65681d2 = {"Llv0/a;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "category", "action", "c", "f", "value", "d", "label", "e", "eventName", "", "Ljava/util/Map;", "()Ljava/util/Map;", "otherProperties", "Llv0/a$a;", "Llv0/a$b;", "Llv0/a$c;", "Llv0/a$d;", "Llv0/a$e;", "Llv0/a$f;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24758a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String action;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<String, Object> otherProperties;

    public /* synthetic */ AbstractC24758a(DefaultConstructorMarker defaultConstructorMarker) {
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

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e */
    public abstract Map<String, Object> mo72497e();

    /* JADX INFO: renamed from: f, reason: from getter */
    public String getValue() {
        return this.value;
    }

    private AbstractC24758a() {
        this.category = "";
        this.action = "";
        this.value = "";
        this.label = "";
        this.eventName = "Content Explore";
        this.otherProperties = C25272z.f99163w;
    }

    /* JADX INFO: renamed from: lv0.a$e */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Llv0/a$e;", "Llv0/a;", "", "action", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Ljava/lang/String;", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Map;", "e", "()Ljava/util/Map;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC24758a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String action, Map<String, ? extends Object> otherProperties) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.action = action;
            this.otherProperties = otherProperties;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: e */
        public Map<String, Object> mo72497e() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.action, eVar.action) && AbstractC22676k.m65745e(this.otherProperties, eVar.otherProperties);
        }

        public int hashCode() {
            return this.otherProperties.hashCode() + (this.action.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114680h("ViewSearchScreen(action=", this.action, ", otherProperties=", ")", this.otherProperties);
        }

        public e(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "View Search Screen" : str, (i13 & 2) != 0 ? AbstractC31061c.m95645u("Screen", "Results") : map);
        }
    }

    /* JADX INFO: renamed from: lv0.a$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Llv0/a$a;", "Llv0/a;", "", "action", "", "", "otherProperties", "value", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Ljava/lang/String;", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Map;", "e", "()Ljava/util/Map;", "i", "f", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC24758a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String action, Map<String, ? extends Object> otherProperties, String value) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            AbstractC22676k.m65750j(value, "value");
            this.action = action;
            this.otherProperties = otherProperties;
            this.value = value;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: e */
        public Map<String, Object> mo72497e() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.otherProperties, aVar.otherProperties) && AbstractC22676k.m65745e(this.value, aVar.value);
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + AbstractC3855a.m11821e(this.otherProperties, this.action.hashCode() * 31, 31);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.value, ")", AbstractC36095b.m114686n("CancelPressed(action=", this.action, ", otherProperties=", ", value=", this.otherProperties));
        }

        public a(String str, Map map, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Press Cancel" : str, (i13 & 2) != 0 ? AbstractC31061c.m95645u("Screen", "Results") : map, str2);
        }
    }

    /* JADX INFO: renamed from: lv0.a$f */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Llv0/a$f;", "Llv0/a;", "", "entryPoint", "action", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Ljava/lang/String;", "getEntryPoint", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "i", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC24758a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String entryPoint;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String entryPoint, String action, Map<String, ? extends Object> otherProperties) {
            super(null);
            AbstractC22676k.m65750j(entryPoint, "entryPoint");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.entryPoint = entryPoint;
            this.action = action;
            this.otherProperties = otherProperties;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: e */
        public Map<String, Object> mo72497e() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.entryPoint, fVar.entryPoint) && AbstractC22676k.m65745e(this.action, fVar.action) && AbstractC22676k.m65745e(this.otherProperties, fVar.otherProperties);
        }

        public int hashCode() {
            return this.otherProperties.hashCode() + AbstractC11266d.m30450d(this.entryPoint.hashCode() * 31, 31, this.action);
        }

        public String toString() {
            String str = this.entryPoint;
            String str2 = this.action;
            return AbstractC13673n.m38565l(AbstractC11895b.m32001t("ViewedLandingScreen(entryPoint=", str, ", action=", str2, ", otherProperties="), this.otherProperties, ")");
        }

        public f(String str, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "View" : str2, (i13 & 4) != 0 ? AbstractC25247g0.m73990Y(new C23465k("Screen", "Results"), new C23465k("Source", str)) : map);
        }
    }

    /* JADX INFO: renamed from: lv0.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, m65681d2 = {"Llv0/a$c;", "Llv0/a;", "", "type", "action", "", "", "otherProperties", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Ljava/lang/String;", "getType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "i", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "j", "f", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC24758a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String type, String action, Map<String, ? extends Object> otherProperties, String value) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            AbstractC22676k.m65750j(value, "value");
            this.type = type;
            this.action = action;
            this.otherProperties = otherProperties;
            this.value = value;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: e */
        public Map<String, Object> mo72497e() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.type, cVar.type) && AbstractC22676k.m65745e(this.action, cVar.action) && AbstractC22676k.m65745e(this.otherProperties, cVar.otherProperties) && AbstractC22676k.m65745e(this.value, cVar.value);
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + AbstractC3855a.m11821e(this.otherProperties, AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.action), 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.action;
            Map<String, Object> map = this.otherProperties;
            String str3 = this.value;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("FilterClicked(type=", str, ", action=", str2, ", otherProperties=");
            sbM32001t.append(map);
            sbM32001t.append(", value=");
            sbM32001t.append(str3);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public c(String str, String str2, Map map, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "Filter" : str2, (i13 & 4) != 0 ? AbstractC25247g0.m73990Y(new C23465k("Screen", "Results"), new C23465k("Type", str)) : map, str3);
        }
    }

    /* JADX INFO: renamed from: lv0.a$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, m65681d2 = {"Llv0/a$d;", "Llv0/a;", "", "type", "action", "", "", "otherProperties", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Ljava/lang/String;", "getType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "i", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "j", "f", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC24758a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String type, String action, Map<String, ? extends Object> otherProperties, String value) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            AbstractC22676k.m65750j(value, "value");
            this.type = type;
            this.action = action;
            this.otherProperties = otherProperties;
            this.value = value;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: e */
        public Map<String, Object> mo72497e() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.type, dVar.type) && AbstractC22676k.m65745e(this.action, dVar.action) && AbstractC22676k.m65745e(this.otherProperties, dVar.otherProperties) && AbstractC22676k.m65745e(this.value, dVar.value);
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + AbstractC3855a.m11821e(this.otherProperties, AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.action), 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.action;
            Map<String, Object> map = this.otherProperties;
            String str3 = this.value;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("NoResult(type=", str, ", action=", str2, ", otherProperties=");
            sbM32001t.append(map);
            sbM32001t.append(", value=");
            sbM32001t.append(str3);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public d(String str, String str2, Map map, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "No Results State" : str2, (i13 & 4) != 0 ? AbstractC25247g0.m73990Y(new C23465k("Screen", "Results"), new C23465k("Type", str)) : map, str3);
        }
    }

    /* JADX INFO: renamed from: lv0.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\r¨\u0006\""}, m65681d2 = {"Llv0/a$b;", "Llv0/a;", "", "type", "action", "", "", "otherProperties", "label", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Ljava/lang/String;", "getType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "i", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "j", "d", "k", "f", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC24758a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String type, String action, Map<String, ? extends Object> otherProperties, String label, String value) {
            super(null);
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(value, "value");
            this.type = type;
            this.action = action;
            this.otherProperties = otherProperties;
            this.label = label;
            this.value = value;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getLabel() {
            return this.label;
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: e */
        public Map<String, Object> mo72497e() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.type, bVar.type) && AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.otherProperties, bVar.otherProperties) && AbstractC22676k.m65745e(this.label, bVar.label) && AbstractC22676k.m65745e(this.value, bVar.value);
        }

        @Override // lv0.AbstractC24758a
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + AbstractC11266d.m30450d(AbstractC3855a.m11821e(this.otherProperties, AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.action), 31), 31, this.label);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.action;
            Map<String, Object> map = this.otherProperties;
            String str3 = this.label;
            String str4 = this.value;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ContentClicked(type=", str, ", action=", str2, ", otherProperties=");
            sbM32001t.append(map);
            sbM32001t.append(", label=");
            sbM32001t.append(str3);
            sbM32001t.append(", value=");
            return AbstractC25012a.m73376i(str4, ")", sbM32001t);
        }

        public b(String str, String str2, Map map, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "Click Content" : str2, (i13 & 4) != 0 ? AbstractC25247g0.m73990Y(new C23465k("Screen", "Results"), new C23465k("Type", str)) : map, str3, str4);
        }
    }
}
