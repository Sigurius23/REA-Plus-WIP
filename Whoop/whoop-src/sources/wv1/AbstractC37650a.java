package wv1;

import java.util.Map;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wv1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u0005\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\bR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\b\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, m65681d2 = {"Lwv1/a;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "category", "c", "eventName", "e", "value", "", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "otherProperties", "action", "Lwv1/a$a;", "Lwv1/a$b;", "Lwv1/a$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37650a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, Object> otherProperties;

    public /* synthetic */ AbstractC37650a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getAction();

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c */
    public abstract String getEventName();

    /* JADX INFO: renamed from: d */
    public Map<String, Object> m121034d() {
        return this.otherProperties;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getValue() {
        return this.value;
    }

    private AbstractC37650a() {
        this.eventName = "";
    }

    /* JADX INFO: renamed from: wv1.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lwv1/a$a;", "Lwv1/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37650a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // wv1.AbstractC37650a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // wv1.AbstractC37650a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.eventName, aVar.eventName) && AbstractC22676k.m65745e(this.action, aVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnClickDunningBottomSheetCta(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ a(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Payment Failure Pop Up Sheet" : str, (i13 & 2) != 0 ? "Click" : str2);
        }
    }

    /* JADX INFO: renamed from: wv1.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lwv1/a$b;", "Lwv1/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC37650a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // wv1.AbstractC37650a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // wv1.AbstractC37650a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.eventName, bVar.eventName) && AbstractC22676k.m65745e(this.action, bVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnCloseDunningBottomSheet(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ b(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Payment Failure Pop Up Sheet" : str, (i13 & 2) != 0 ? "Close" : str2);
        }
    }

    /* JADX INFO: renamed from: wv1.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lwv1/a$c;", "Lwv1/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "c", "f", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37650a {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // wv1.AbstractC37650a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // wv1.AbstractC37650a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.eventName, cVar.eventName) && AbstractC22676k.m65745e(this.action, cVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("OnViewDunningBottomSheet(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ c(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Payment Failure Pop Up Sheet" : str, (i13 & 2) != 0 ? "View" : str2);
        }
    }
}
