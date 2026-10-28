package h62;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: h62.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0014\u0015\u0007\u0016\u0017\u0005\u000e\r\u000b\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\r\u0010\u0012\u0082\u0001\f\u001b\u001c\u001d\u001e\u001f !\"#$%&¨\u0006'"}, m65681d2 = {"Lh62/a;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "category", "action", "c", "eventName", "d", "e", "value", "", "Ljava/util/Map;", "()Ljava/util/Map;", "otherProperties", "k", "f", "g", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "i", "Lh62/a$a;", "Lh62/a$b;", "Lh62/a$c;", "Lh62/a$d;", "Lh62/a$e;", "Lh62/a$f;", "Lh62/a$g;", "Lh62/a$h;", "Lh62/a$i;", "Lh62/a$j;", "Lh62/a$k;", "Lh62/a$l;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16981a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String action;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Map<String, Object> otherProperties;

    public /* synthetic */ AbstractC16981a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c */
    public abstract String getEventName();

    /* JADX INFO: renamed from: d */
    public Map<String, Object> mo47807d() {
        return this.otherProperties;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getValue() {
        return this.value;
    }

    private AbstractC16981a() {
        this.category = "";
        this.eventName = "";
    }

    /* JADX INFO: renamed from: h62.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lh62/a$a;", "Lh62/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "a", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
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
            return AbstractC2875y.m8300m("TrackCopyDiscountCode(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ a(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "RAF Promotions" : str, (i13 & 2) != 0 ? "Clicked Copy Discount" : str2);
        }
    }

    /* JADX INFO: renamed from: h62.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lh62/a$e;", "Lh62/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "a", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.eventName, eVar.eventName) && AbstractC22676k.m65745e(this.action, eVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("TrackOpenShop(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ e(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "RAF Promotions" : str, (i13 & 2) != 0 ? "Clicked Go to Shop" : str2);
        }
    }

    /* JADX INFO: renamed from: h62.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lh62/a$g;", "Lh62/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "a", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.eventName, gVar.eventName) && AbstractC22676k.m65745e(this.action, gVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("TrackSeeTerms(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ g(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "RAF Promotions" : str, (i13 & 2) != 0 ? "Clicked See Terms on RAF Promotion" : str2);
        }
    }

    /* JADX INFO: renamed from: h62.a$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lh62/a$h;", "Lh62/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "a", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.eventName, hVar.eventName) && AbstractC22676k.m65745e(this.action, hVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("TrackTrialsContinue(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ h(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "RAF Trials" : str, (i13 & 2) != 0 ? "Clicked continue" : str2);
        }
    }

    /* JADX INFO: renamed from: h62.a$l */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, m65681d2 = {"Lh62/a$l;", "Lh62/a;", "", "eventName", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "a", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String eventName, String action) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.action = action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.eventName, lVar.eventName) && AbstractC22676k.m65745e(this.action, lVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.eventName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("TrackViewDiscount(eventName=", this.eventName, ", action=", this.action, ")");
        }

        public /* synthetic */ l(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "RAF Promotions" : str, (i13 & 2) != 0 ? "Clicked View Discount" : str2);
        }
    }

    /* JADX INFO: renamed from: h62.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lh62/a$b;", "Lh62/a;", "", "eventName", "category", "action", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "i", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String eventName, String category, String action, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.category = category;
            this.action = action;
            this.otherProperties = map;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo47807d() {
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
            return AbstractC22676k.m65745e(this.eventName, bVar.eventName) && AbstractC22676k.m65745e(this.category, bVar.category) && AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.otherProperties, bVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.category), 31, this.action);
            Map<String, Object> map = this.otherProperties;
            return iM30450d + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.category;
            return AbstractC30007c.m91842l(AbstractC11895b.m32001t("TrackErrorView(eventName=", str, ", category=", str2, ", action="), this.action, ", otherProperties=", this.otherProperties, ")");
        }

        public b(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "RAF Hub" : str, (i13 & 2) != 0 ? "RAF Hub" : str2, (i13 & 4) != 0 ? "View" : str3, (i13 & 8) != 0 ? AbstractC31061c.m95645u("State", "Error") : map);
        }
    }

    /* JADX INFO: renamed from: h62.a$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lh62/a$d;", "Lh62/a;", "", "eventName", "category", "checkoutOrigin", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getCheckoutOrigin", "i", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String checkoutOrigin;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String eventName, String category, String str, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.category = category;
            this.checkoutOrigin = str;
            this.otherProperties = map;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo47807d() {
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
            return AbstractC22676k.m65745e(this.eventName, dVar.eventName) && AbstractC22676k.m65745e(this.category, dVar.category) && AbstractC22676k.m65745e(this.checkoutOrigin, dVar.checkoutOrigin) && AbstractC22676k.m65745e(this.otherProperties, dVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.category);
            String str = this.checkoutOrigin;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, Object> map = this.otherProperties;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.category;
            return AbstractC30007c.m91842l(AbstractC11895b.m32001t("TrackOpenShareSheet(eventName=", str, ", category=", str2, ", checkoutOrigin="), this.checkoutOrigin, ", otherProperties=", this.otherProperties, ")");
        }

        public d(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Refer Friend- Invite Friend" : str, (i13 & 2) != 0 ? "Referral" : str2, str3, (i13 & 8) != 0 ? AbstractC31061c.m95645u("Region", str3) : map);
        }
    }

    /* JADX INFO: renamed from: h62.a$k */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lh62/a$k;", "Lh62/a;", "", "eventName", "category", "action", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "i", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String eventName, String category, String action, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.category = category;
            this.action = action;
            this.otherProperties = map;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo47807d() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.eventName, kVar.eventName) && AbstractC22676k.m65745e(this.category, kVar.category) && AbstractC22676k.m65745e(this.action, kVar.action) && AbstractC22676k.m65745e(this.otherProperties, kVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.category), 31, this.action);
            Map<String, Object> map = this.otherProperties;
            return iM30450d + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.category;
            return AbstractC30007c.m91842l(AbstractC11895b.m32001t("TrackView(eventName=", str, ", category=", str2, ", action="), this.action, ", otherProperties=", this.otherProperties, ")");
        }

        public k(String str, String str2, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "RAF Hub" : str, (i13 & 2) != 0 ? "RAF Hub" : str2, (i13 & 4) != 0 ? "View" : str3, (i13 & 8) != 0 ? AbstractC31061c.m95645u("State", "Normal") : map);
        }
    }

    /* JADX INFO: renamed from: h62.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, m65681d2 = {"Lh62/a$c;", "Lh62/a;", "", "eventName", "category", "checkoutOrigin", "", "analyticsProperties", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getCheckoutOrigin", "i", "Ljava/util/Map;", "getAnalyticsProperties", "()Ljava/util/Map;", "j", "d", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String checkoutOrigin;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Map<String, String> analyticsProperties;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String eventName, String category, String str, Map<String, String> map, Map<String, ? extends Object> map2) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(category, "category");
            this.eventName = eventName;
            this.category = category;
            this.checkoutOrigin = str;
            this.analyticsProperties = map;
            this.otherProperties = map2;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo47807d() {
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
            return AbstractC22676k.m65745e(this.eventName, cVar.eventName) && AbstractC22676k.m65745e(this.category, cVar.category) && AbstractC22676k.m65745e(this.checkoutOrigin, cVar.checkoutOrigin) && AbstractC22676k.m65745e(this.analyticsProperties, cVar.analyticsProperties) && AbstractC22676k.m65745e(this.otherProperties, cVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.category);
            String str = this.checkoutOrigin;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, String> map = this.analyticsProperties;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, Object> map2 = this.otherProperties;
            return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.category;
            String str3 = this.checkoutOrigin;
            Map<String, String> map = this.analyticsProperties;
            Map<String, Object> map2 = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackInviteFriend(eventName=", str, ", category=", str2, ", checkoutOrigin=");
            AbstractC36095b.m114695w(sbM32001t, str3, ", analyticsProperties=", map, ", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map2, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public c(String str, String str2, String str3, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i13 & 1) != 0 ? "Referral Invitation Sent" : str;
            map = (i13 & 8) != 0 ? null : map;
            if ((i13 & 16) != 0) {
                map2 = AbstractC25247g0.m73993b0(new C23465k("Region", str3));
                if (map != null) {
                    map2.putAll(map);
                }
            }
            this(str, str2, str3, map, map2);
        }
    }

    /* JADX INFO: renamed from: h62.a$j */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000eR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lh62/a$j;", "Lh62/a;", "", "eventName", "action", "Lh62/b$a$a;", "source", "codeNumber", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lh62/b$a$a;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lh62/b$a$a;", "getSource", "()Lh62/b$a$a;", "i", "getCodeNumber", "j", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C16982b.Companion.EnumC41682a source;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String codeNumber;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String eventName, String action, C16982b.Companion.EnumC41682a source, String codeNumber, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(codeNumber, "codeNumber");
            this.eventName = eventName;
            this.action = action;
            this.source = source;
            this.codeNumber = codeNumber;
            this.otherProperties = map;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo47807d() {
            return this.otherProperties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.eventName, jVar.eventName) && AbstractC22676k.m65745e(this.action, jVar.action) && this.source == jVar.source && AbstractC22676k.m65745e(this.codeNumber, jVar.codeNumber) && AbstractC22676k.m65745e(this.otherProperties, jVar.otherProperties);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d((this.source.hashCode() + AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action)) * 31, 31, this.codeNumber);
            Map<String, Object> map = this.otherProperties;
            return iM30450d + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            C16982b.Companion.EnumC41682a enumC41682a = this.source;
            String str3 = this.codeNumber;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackTrialsShareCode(eventName=", str, ", action=", str2, ", source=");
            sbM32001t.append(enumC41682a);
            sbM32001t.append(", codeNumber=");
            sbM32001t.append(str3);
            sbM32001t.append(", otherProperties=");
            return AbstractC13673n.m38565l(sbM32001t, map, ")");
        }

        public j(String str, String str2, C16982b.Companion.EnumC41682a enumC41682a, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "RAF Trials" : str, (i13 & 2) != 0 ? "Click Share" : str2, enumC41682a, str3, (i13 & 16) != 0 ? AbstractC25247g0.m73990Y(new C23465k("Source", enumC41682a.getValue()), new C23465k("Code Number", str3)) : map);
        }
    }

    /* JADX INFO: renamed from: h62.a$f */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lh62/a$f;", "Lh62/a;", "", "eventName", "category", "action", "", "inPromotionalPeriod", "", "promotionalCredits", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "i", "Z", "getInPromotionalPeriod", "()Z", "j", "I", "getPromotionalCredits", "k", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean inPromotionalPeriod;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final int promotionalCredits;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String eventName, String category, String action, boolean z4, int i13, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(category, "category");
            AbstractC22676k.m65750j(action, "action");
            this.eventName = eventName;
            this.category = category;
            this.action = action;
            this.inPromotionalPeriod = z4;
            this.promotionalCredits = i13;
            this.otherProperties = map;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getCategory() {
            return this.category;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo47807d() {
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
            return AbstractC22676k.m65745e(this.eventName, fVar.eventName) && AbstractC22676k.m65745e(this.category, fVar.category) && AbstractC22676k.m65745e(this.action, fVar.action) && this.inPromotionalPeriod == fVar.inPromotionalPeriod && this.promotionalCredits == fVar.promotionalCredits && AbstractC22676k.m65745e(this.otherProperties, fVar.otherProperties);
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.promotionalCredits, AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.category), 31, this.action), 31, this.inPromotionalPeriod), 31);
            Map<String, Object> map = this.otherProperties;
            return iM30448b + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.category;
            String str3 = this.action;
            boolean z4 = this.inPromotionalPeriod;
            int i13 = this.promotionalCredits;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackPromotionView(eventName=", str, ", category=", str2, ", action=");
            AbstractC38963t7.m124390t(sbM32001t, str3, ", inPromotionalPeriod=", z4, ", promotionalCredits=");
            sbM32001t.append(i13);
            sbM32001t.append(", otherProperties=");
            sbM32001t.append(map);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public f(String str, String str2, String str3, boolean z4, int i13, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i14 & 1) != 0 ? "RAF Hub" : str;
            str2 = (i14 & 2) != 0 ? "RAF Hub" : str2;
            str3 = (i14 & 4) != 0 ? "View" : str3;
            if ((i14 & 32) != 0) {
                map = AbstractC25247g0.m73990Y(new C23465k("State", "Promotion"), new C23465k("In Promotional Period?", z4 ? "Yes" : "No"), new C23465k("Promotional Credit Number", Integer.valueOf(i13)));
            }
            this(str, str2, str3, z4, i13, map);
        }
    }

    /* JADX INFO: renamed from: h62.a$i */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0006\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lh62/a$i;", "Lh62/a;", "", "eventName", "action", "", "isFromConfirmSkipLightbox", "value", "Lh62/b$a$b;", "state", "", "", "otherProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lh62/b$a$b;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "c", "g", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "i", "e", "j", "Lh62/b$a$b;", "getState", "()Lh62/b$a$b;", "k", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC16981a {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isFromConfirmSkipLightbox;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C16982b.Companion.b state;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final Map<String, Object> otherProperties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String eventName, String action, boolean z4, String str, C16982b.Companion.b state, Map<String, ? extends Object> map) {
            super(null);
            AbstractC22676k.m65750j(eventName, "eventName");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(state, "state");
            this.eventName = eventName;
            this.action = action;
            this.isFromConfirmSkipLightbox = z4;
            this.value = str;
            this.state = state;
            this.otherProperties = map;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAction() {
            return this.action;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: d */
        public Map<String, Object> mo47807d() {
            return this.otherProperties;
        }

        @Override // h62.AbstractC16981a
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.eventName, iVar.eventName) && AbstractC22676k.m65745e(this.action, iVar.action) && this.isFromConfirmSkipLightbox == iVar.isFromConfirmSkipLightbox && AbstractC22676k.m65745e(this.value, iVar.value) && this.state == iVar.state && AbstractC22676k.m65745e(this.otherProperties, iVar.otherProperties);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.action), 31, this.isFromConfirmSkipLightbox);
            String str = this.value;
            int iHashCode = (this.state.hashCode() + ((iM8289b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Map<String, Object> map = this.otherProperties;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.eventName;
            String str2 = this.action;
            boolean z4 = this.isFromConfirmSkipLightbox;
            String str3 = this.value;
            C16982b.Companion.b bVar = this.state;
            Map<String, Object> map = this.otherProperties;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackTrialsDismiss(eventName=", str, ", action=", str2, ", isFromConfirmSkipLightbox=");
            AbstractC38963t7.m124391u(sbM32001t, z4, ", value=", str3, ", state=");
            sbM32001t.append(bVar);
            sbM32001t.append(", otherProperties=");
            sbM32001t.append(map);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public i(String str, String str2, boolean z4, String str3, C16982b.Companion.b bVar, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i13 & 1) != 0 ? "RAF Trials" : str;
            str2 = (i13 & 2) != 0 ? "Dismiss" : str2;
            z4 = (i13 & 4) != 0 ? false : z4;
            if ((i13 & 8) != 0) {
                str3 = z4 ? "Confirm Skip Lightbox" : null;
            }
            this(str, str2, z4, str3, bVar, (i13 & 32) != 0 ? AbstractC31061c.m95645u("State", bVar.getValue()) : map);
        }
    }
}
