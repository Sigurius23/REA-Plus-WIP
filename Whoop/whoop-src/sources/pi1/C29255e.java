package pi1;

import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pi1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u001c\u0010\u000e¨\u0006!"}, m65681d2 = {"Lpi1/e;", "", "", "action", "eventName", "label", "category", "value", "", "properties", "screenToView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getEventName", "c", "d", "e", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "g", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29255e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String action;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String eventName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<String, String> properties;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String screenToView;

    public C29255e(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        this.action = str;
        this.eventName = str2;
        this.label = str3;
        this.category = str4;
        this.value = str5;
        this.properties = map;
        this.screenToView = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m88880d() {
        return this.properties;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScreenToView() {
        return this.screenToView;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29255e)) {
            return false;
        }
        C29255e c29255e = (C29255e) other;
        return AbstractC22676k.m65745e(this.action, c29255e.action) && AbstractC22676k.m65745e(this.eventName, c29255e.eventName) && AbstractC22676k.m65745e(this.label, c29255e.label) && AbstractC22676k.m65745e(this.category, c29255e.category) && AbstractC22676k.m65745e(this.value, c29255e.value) && AbstractC22676k.m65745e(this.properties, c29255e.properties) && AbstractC22676k.m65745e(this.screenToView, c29255e.screenToView);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.action;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.value;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.properties;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.screenToView;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.action;
        String str2 = this.eventName;
        String str3 = this.label;
        String str4 = this.category;
        String str5 = this.value;
        Map<String, String> map = this.properties;
        String str6 = this.screenToView;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HeartScreenerEventData(action=", str, ", eventName=", str2, ", label=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", category=", str4, ", value=");
        AbstractC36095b.m114695w(sbM32001t, str5, ", properties=", map, ", screenToView=");
        return AbstractC25012a.m73376i(str6, ")", sbM32001t);
    }

    public /* synthetic */ C29255e(String str, String str2, String str3, String str4, String str5, Map map, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : map, (i13 & 64) != 0 ? null : str6);
    }
}
