package bl1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.C25272z;
import n83.C26463f;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: bl1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\b\u0010\u0011\u0006\u0012\u0003\r\n\u0013R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001bÀ\u0006\u0003"}, m65681d2 = {"Lbl1/a;", "", "", "c", "()Ljava/lang/String;", "category", "a", "action", "getLabel", "label", "b", "eventName", "", "d", "()Ljava/util/Map;", "otherProperties", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "g", "e", "Lbl1/a$a;", "Lbl1/a$b;", "Lbl1/a$c;", "Lbl1/a$d;", "Lbl1/a$f;", "Lbl1/a$g;", "Lbl1/a$h;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC3370a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f13149a;

    /* JADX INFO: renamed from: bl1.a$e, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lbl1/a$e;", "", "<init>", "()V", "", "aiActionPresent", "", "routeTaken", "sourceType", "", "b", "(ZLjava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f13149a = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final Map<String, Object> m9735b(boolean aiActionPresent, String routeTaken, String sourceType) {
            C26463f c26463f = new C26463f();
            c26463f.put("ai_action_present", Boolean.valueOf(aiActionPresent));
            c26463f.put("route_taken", routeTaken);
            if (sourceType != null) {
                c26463f.put("source_type", sourceType);
            }
            return c26463f.m78380b();
        }
    }

    /* JADX INFO: renamed from: a */
    String getAction();

    /* JADX INFO: renamed from: b */
    String getEventName();

    /* JADX INFO: renamed from: c */
    String getCategory();

    /* JADX INFO: renamed from: d */
    Map<String, Object> mo9733d();

    String getLabel();

    /* JADX INFO: renamed from: bl1.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lbl1/a$a;", "Lbl1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "a", "d", "getLabel", "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC3370a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public a(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.category = category;
            this.action = action;
            this.label = label;
            this.eventName = eventName;
            this.otherProperties = otherProperties;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo9733d() {
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
            return AbstractC22676k.m65745e(this.category, aVar.category) && AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.label, aVar.label) && AbstractC22676k.m65745e(this.eventName, aVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, aVar.otherProperties);
        }

        @Override // bl1.InterfaceC3370a
        public String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.otherProperties.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.category.hashCode() * 31, 31, this.action), 31, this.label), 31, this.eventName);
        }

        public String toString() {
            String str = this.category;
            String str2 = this.action;
            String str3 = this.label;
            String str4 = this.eventName;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ClickBrowseAll(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public a(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "Click Browse All Topics" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "Help Center" : str4, (i13 & 16) != 0 ? AbstractC31061c.m95645u("Screen", "Help Center") : map);
        }
    }

    /* JADX INFO: renamed from: bl1.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lbl1/a$c;", "Lbl1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "a", "d", "getLabel", "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC3370a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public c(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.category = category;
            this.action = action;
            this.label = label;
            this.eventName = eventName;
            this.otherProperties = otherProperties;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo9733d() {
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
            return AbstractC22676k.m65745e(this.category, cVar.category) && AbstractC22676k.m65745e(this.action, cVar.action) && AbstractC22676k.m65745e(this.label, cVar.label) && AbstractC22676k.m65745e(this.eventName, cVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, cVar.otherProperties);
        }

        @Override // bl1.InterfaceC3370a
        public String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.otherProperties.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.category.hashCode() * 31, 31, this.action), 31, this.label), 31, this.eventName);
        }

        public String toString() {
            String str = this.category;
            String str2 = this.action;
            String str3 = this.label;
            String str4 = this.eventName;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ClickChatWithWhoop(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ c(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "Click CTA Button" : str2, (i13 & 4) != 0 ? "Chat With Whoop" : str3, (i13 & 8) != 0 ? "Help Center" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: bl1.a$f */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lbl1/a$f;", "Lbl1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "a", "d", "getLabel", "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC3370a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public f(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.category = category;
            this.action = action;
            this.label = label;
            this.eventName = eventName;
            this.otherProperties = otherProperties;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo9733d() {
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
            return AbstractC22676k.m65745e(this.category, fVar.category) && AbstractC22676k.m65745e(this.action, fVar.action) && AbstractC22676k.m65745e(this.label, fVar.label) && AbstractC22676k.m65745e(this.eventName, fVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, fVar.otherProperties);
        }

        @Override // bl1.InterfaceC3370a
        public String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.otherProperties.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.category.hashCode() * 31, 31, this.action), 31, this.label), 31, this.eventName);
        }

        public String toString() {
            String str = this.category;
            String str2 = this.action;
            String str3 = this.label;
            String str4 = this.eventName;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("PressHelpCenterTile(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ f(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "Click Tile" : str2, str3, (i13 & 8) != 0 ? "Help Center" : str4, map);
        }
    }

    /* JADX INFO: renamed from: bl1.a$g */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lbl1/a$g;", "Lbl1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "a", "d", "getLabel", "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC3370a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public g(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.category = category;
            this.action = action;
            this.label = label;
            this.eventName = eventName;
            this.otherProperties = otherProperties;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo9733d() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.category, gVar.category) && AbstractC22676k.m65745e(this.action, gVar.action) && AbstractC22676k.m65745e(this.label, gVar.label) && AbstractC22676k.m65745e(this.eventName, gVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, gVar.otherProperties);
        }

        @Override // bl1.InterfaceC3370a
        public String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.otherProperties.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.category.hashCode() * 31, 31, this.action), 31, this.label), 31, this.eventName);
        }

        public String toString() {
            String str = this.category;
            String str2 = this.action;
            String str3 = this.label;
            String str4 = this.eventName;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ShowErrorScreen(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public g(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "View Error Screen" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "Help Center" : str4, (i13 & 16) != 0 ? AbstractC31061c.m95645u("Screen", "Help Center") : map);
        }
    }

    /* JADX INFO: renamed from: bl1.a$h */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJN\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, m65681d2 = {"Lbl1/a$h;", "Lbl1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lbl1/a$h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "a", "d", "getLabel", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC3370a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public h(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.category = category;
            this.action = action;
            this.label = label;
            this.eventName = eventName;
            this.otherProperties = otherProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ h m9736f(h hVar, String str, String str2, String str3, String str4, Map map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = hVar.category;
            }
            if ((i13 & 2) != 0) {
                str2 = hVar.action;
            }
            if ((i13 & 4) != 0) {
                str3 = hVar.label;
            }
            if ((i13 & 8) != 0) {
                str4 = hVar.eventName;
            }
            if ((i13 & 16) != 0) {
                map = hVar.otherProperties;
            }
            Map map2 = map;
            String str5 = str3;
            return hVar.m9737e(str, str2, str5, str4, map2);
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo9733d() {
            return this.otherProperties;
        }

        /* JADX INFO: renamed from: e */
        public final h m9737e(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            return new h(category, action, label, eventName, otherProperties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.category, hVar.category) && AbstractC22676k.m65745e(this.action, hVar.action) && AbstractC22676k.m65745e(this.label, hVar.label) && AbstractC22676k.m65745e(this.eventName, hVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, hVar.otherProperties);
        }

        @Override // bl1.InterfaceC3370a
        public String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.otherProperties.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.category.hashCode() * 31, 31, this.action), 31, this.label), 31, this.eventName);
        }

        public String toString() {
            String str = this.category;
            String str2 = this.action;
            String str3 = this.label;
            String str4 = this.eventName;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ViewedHelpScreen(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public h(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "View" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "Help Center" : str4, (i13 & 16) != 0 ? AbstractC31061c.m95645u("Screen", "Help Center") : map);
        }
    }

    /* JADX INFO: renamed from: bl1.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, m65681d2 = {"Lbl1/a$b;", "Lbl1/a;", "", "phoneNumber", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getPhoneNumber", "c", "d", "a", "e", "getLabel", "f", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC3370a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String phoneNumber;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public b(String phoneNumber, String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
            AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.phoneNumber = phoneNumber;
            this.category = category;
            this.action = action;
            this.label = label;
            this.eventName = eventName;
            this.otherProperties = otherProperties;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo9733d() {
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
            return AbstractC22676k.m65745e(this.phoneNumber, bVar.phoneNumber) && AbstractC22676k.m65745e(this.category, bVar.category) && AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.label, bVar.label) && AbstractC22676k.m65745e(this.eventName, bVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, bVar.otherProperties);
        }

        @Override // bl1.InterfaceC3370a
        public String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.otherProperties.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.phoneNumber.hashCode() * 31, 31, this.category), 31, this.action), 31, this.label), 31, this.eventName);
        }

        public String toString() {
            String str = this.phoneNumber;
            String str2 = this.category;
            String str3 = this.action;
            String str4 = this.label;
            String str5 = this.eventName;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ClickCallTile(phoneNumber=", str, ", category=", str2, ", action=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", label=", str4, ", eventName=");
            return AbstractC30007c.m91842l(sbM32001t, str5, ", otherProperties=", map, ")");
        }

        public b(String str, String str2, String str3, String str4, String str5, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "Click Call Tile" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "Help Center" : str5, (i13 & 32) != 0 ? AbstractC31061c.m95645u("number", str) : map);
        }
    }

    /* JADX INFO: renamed from: bl1.a$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b\u0018\u0010\u0011R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)¨\u0006*"}, m65681d2 = {"Lbl1/a$d;", "Lbl1/a;", "", "aiActionPresent", "", "routeTaken", "sourceType", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getAiActionPresent", "()Z", "c", "Ljava/lang/String;", "getRouteTaken", "d", "getSourceType", "e", "f", "a", "g", "getLabel", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ljava/util/Map;", "()Ljava/util/Map;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC3370a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean aiActionPresent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String routeTaken;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String sourceType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public d(boolean z4, String routeTaken, String str, String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
            AbstractC22676k.m65750j(routeTaken, "routeTaken");
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(otherProperties, "otherProperties");
            this.aiActionPresent = z4;
            this.routeTaken = routeTaken;
            this.sourceType = str;
            this.category = category;
            this.action = action;
            this.label = label;
            this.eventName = eventName;
            this.otherProperties = otherProperties;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // bl1.InterfaceC3370a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo9733d() {
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
            return this.aiActionPresent == dVar.aiActionPresent && AbstractC22676k.m65745e(this.routeTaken, dVar.routeTaken) && AbstractC22676k.m65745e(this.sourceType, dVar.sourceType) && AbstractC22676k.m65745e(this.category, dVar.category) && AbstractC22676k.m65745e(this.action, dVar.action) && AbstractC22676k.m65745e(this.label, dVar.label) && AbstractC22676k.m65745e(this.eventName, dVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, dVar.otherProperties);
        }

        @Override // bl1.InterfaceC3370a
        public String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(Boolean.hashCode(this.aiActionPresent) * 31, 31, this.routeTaken);
            String str = this.sourceType;
            return this.otherProperties.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.category), 31, this.action), 31, this.label), 31, this.eventName);
        }

        public String toString() {
            boolean z4 = this.aiActionPresent;
            String str = this.routeTaken;
            String str2 = this.sourceType;
            String str3 = this.category;
            String str4 = this.action;
            String str5 = this.label;
            String str6 = this.eventName;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM38567n = AbstractC13673n.m38567n("ClickMessageUs(aiActionPresent=", ", routeTaken=", str, ", sourceType=", z4);
            AbstractC11266d.m30444B(sbM38567n, str2, ", category=", str3, ", action=");
            AbstractC11266d.m30444B(sbM38567n, str4, ", label=", str5, ", eventName=");
            return AbstractC30007c.m91842l(sbM38567n, str6, ", otherProperties=", map, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ d(boolean z4, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            String str7 = (i13 & 4) != 0 ? null : str2;
            this(z4, str, str7, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "Click CTA Button" : str4, (i13 & 32) != 0 ? "Message Us" : str5, (i13 & 64) != 0 ? "Help Center — Click Message Us" : str6, (i13 & 128) != 0 ? InterfaceC3370a.INSTANCE.m9735b(z4, str, str7) : map);
        }
    }
}
