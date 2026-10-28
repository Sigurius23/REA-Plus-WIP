package oe1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oe1.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\r\u0006\u0010\n\u0011\u0012\u0013\u0014\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\t\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001eÀ\u0006\u0003"}, m65681d2 = {"Loe1/a;", "", "", "c", "()Ljava/lang/String;", "category", "a", "action", "getLabel", "label", "b", "eventName", "", "d", "()Ljava/util/Map;", "otherProperties", "e", "i", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Loe1/a$a;", "Loe1/a$b;", "Loe1/a$c;", "Loe1/a$d;", "Loe1/a$e;", "Loe1/a$f;", "Loe1/a$g;", "Loe1/a$h;", "Loe1/a$i;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC27871a {
    /* JADX INFO: renamed from: a */
    String getAction();

    /* JADX INFO: renamed from: b */
    String getEventName();

    /* JADX INFO: renamed from: c */
    String getCategory();

    /* JADX INFO: renamed from: d */
    Map<String, Object> mo84133d();

    String getLabel();

    /* JADX INFO: renamed from: oe1.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$a;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
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

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ClosedEducationScreen(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "Close" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "Explainer Page" : str4, map);
        }
    }

    /* JADX INFO: renamed from: oe1.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$b;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public b(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
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
            return AbstractC22676k.m65745e(this.category, bVar.category) && AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.label, bVar.label) && AbstractC22676k.m65745e(this.eventName, bVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, bVar.otherProperties);
        }

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ClosedVideo(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "Close Video" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "Explainer Page" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: oe1.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$c;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
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

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("CtaClicked(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ c(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "Click CTA" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "Explainer Page" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: oe1.a$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$d;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public d(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
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
            return AbstractC22676k.m65745e(this.category, dVar.category) && AbstractC22676k.m65745e(this.action, dVar.action) && AbstractC22676k.m65745e(this.label, dVar.label) && AbstractC22676k.m65745e(this.eventName, dVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, dVar.otherProperties);
        }

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OpenedEducationScreen(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ d(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "Open" : str2, str3, (i13 & 8) != 0 ? "Explainer Page" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: oe1.a$e */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$e;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public e(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
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
            return AbstractC22676k.m65745e(this.category, eVar.category) && AbstractC22676k.m65745e(this.action, eVar.action) && AbstractC22676k.m65745e(this.label, eVar.label) && AbstractC22676k.m65745e(this.eventName, eVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, eVar.otherProperties);
        }

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("OpenedVideo(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "Open Video" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "Explainer Page" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: oe1.a$f */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$f;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
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

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("PlayPodcast(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ f(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "Play Podcast" : str2, str3, (i13 & 8) != 0 ? "Education Tile" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: oe1.a$g */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$g;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
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

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("SelectedMediaPlayer(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ g(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "Selected Media Player" : str2, str3, (i13 & 8) != 0 ? "Education Tile" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: oe1.a$h */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$h;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
            return this.otherProperties;
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

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ShareButtonClicked(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ h(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "Share Button" : str2, str3, (i13 & 8) != 0 ? "Education Tile" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }

    /* JADX INFO: renamed from: oe1.a$i */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Loe1/a$i;", "Loe1/a;", "", "category", "action", "label", "eventName", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getLabel", "d", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements InterfaceC27871a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        public i(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties) {
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

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // oe1.InterfaceC27871a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo84133d() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.category, iVar.category) && AbstractC22676k.m65745e(this.action, iVar.action) && AbstractC22676k.m65745e(this.label, iVar.label) && AbstractC22676k.m65745e(this.eventName, iVar.eventName) && AbstractC22676k.m65745e(this.otherProperties, iVar.otherProperties);
        }

        @Override // oe1.InterfaceC27871a
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
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ViewedFullVideo(category=", str, ", action=", str2, ", label=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", eventName=", str4, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public /* synthetic */ i(String str, String str2, String str3, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? "Viewed Full Video" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "Explainer Page" : str4, (i13 & 16) != 0 ? C25272z.f99163w : map);
        }
    }
}
