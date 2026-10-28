package a01;

import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import v21.C35585c;

/* JADX INFO: renamed from: a01.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 JÌ\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b5\u0010@R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b/\u0010CR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b>\u0010FR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b9\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b.\u0010J\u001a\u0004\bD\u0010KR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b<\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b6\u0010O\u001a\u0004\bA\u0010PR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b7\u0010SR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b4\u0010T\u001a\u0004\bQ\u0010U¨\u0006V"}, m65681d2 = {"La01/h;", "Lm91/u;", "", "id", "title", "Lgz0/m0;", "icon", "value", "unit", "La01/m;", "statusType", "Lhy0/c2;", "trend", "La01/a;", "disclaimer", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "", "categoryIds", "La01/n;", "rangeMeter", "", "lastRecording", "Lv21/c;", "miniCallout", "Lj71/c;", "graph", "", "useTileBackground", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;La01/m;Lhy0/c2;La01/a;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;La01/n;Ljava/lang/Integer;Lv21/c;Lj71/c;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;La01/m;Lhy0/c2;La01/a;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;La01/n;Ljava/lang/Integer;Lv21/c;Lj71/c;Z)La01/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "l", "c", "Lgz0/m0;", "g", "()Lgz0/m0;", "d", "p", "e", "n", "f", "La01/m;", "k", "()La01/m;", "Lhy0/c2;", "m", "()Lhy0/c2;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "La01/a;", "()La01/a;", "i", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "j", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Ljava/util/List;", "getCategoryIds", "()Ljava/util/List;", "La01/n;", "()La01/n;", "Ljava/lang/Integer;", "getLastRecording", "()Ljava/lang/Integer;", "Lv21/c;", "()Lv21/c;", "o", "Lj71/c;", "()Lj71/c;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0088h implements InterfaceC25312u {

    /* JADX INFO: renamed from: q */
    public static final int f270q = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String unit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC0093m statusType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C0081a disclaimer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<String> categoryIds;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C0094n rangeMeter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Integer lastRecording;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C35585c miniCallout;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C21395c graph;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean useTileBackground;

    public C0088h(String id4, String title, EnumC16313m0 enumC16313m0, String value, String str, EnumC0093m statusType, C17731c2 c17731c2, C0081a c0081a, C9598e c9598e, GenericInteraction genericInteraction, List<String> list, C0094n c0094n, Integer num, C35585c c35585c, C21395c c21395c, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(statusType, "statusType");
        this.id = id4;
        this.title = title;
        this.icon = enumC16313m0;
        this.value = value;
        this.unit = str;
        this.statusType = statusType;
        this.trend = c17731c2;
        this.disclaimer = c0081a;
        this.destination = c9598e;
        this.interaction = genericInteraction;
        this.categoryIds = list;
        this.rangeMeter = c0094n;
        this.lastRecording = num;
        this.miniCallout = c35585c;
        this.graph = c21395c;
        this.useTileBackground = z4;
    }

    /* JADX INFO: renamed from: a */
    public final C0088h m229a(String id4, String title, EnumC16313m0 icon, String value, String unit, EnumC0093m statusType, C17731c2 trend, C0081a disclaimer, C9598e destination, GenericInteraction interaction, List<String> categoryIds, C0094n rangeMeter, Integer lastRecording, C35585c miniCallout, C21395c graph, boolean useTileBackground) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(statusType, "statusType");
        return new C0088h(id4, title, icon, value, unit, statusType, trend, disclaimer, destination, interaction, categoryIds, rangeMeter, lastRecording, miniCallout, graph, useTileBackground);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C0081a getDisclaimer() {
        return this.disclaimer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0088h)) {
            return false;
        }
        C0088h c0088h = (C0088h) other;
        return AbstractC22676k.m65745e(this.id, c0088h.id) && AbstractC22676k.m65745e(this.title, c0088h.title) && this.icon == c0088h.icon && AbstractC22676k.m65745e(this.value, c0088h.value) && AbstractC22676k.m65745e(this.unit, c0088h.unit) && this.statusType == c0088h.statusType && AbstractC22676k.m65745e(this.trend, c0088h.trend) && AbstractC22676k.m65745e(this.disclaimer, c0088h.disclaimer) && AbstractC22676k.m65745e(this.destination, c0088h.destination) && AbstractC22676k.m65745e(this.interaction, c0088h.interaction) && AbstractC22676k.m65745e(this.categoryIds, c0088h.categoryIds) && AbstractC22676k.m65745e(this.rangeMeter, c0088h.rangeMeter) && AbstractC22676k.m65745e(this.lastRecording, c0088h.lastRecording) && AbstractC22676k.m65745e(this.miniCallout, c0088h.miniCallout) && AbstractC22676k.m65745e(this.graph, c0088h.graph) && this.useTileBackground == c0088h.useTileBackground;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C21395c getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31, this.value);
        String str = this.unit;
        int iHashCode = (this.statusType.hashCode() + ((iM30450d2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        C17731c2 c17731c2 = this.trend;
        int iHashCode2 = (iHashCode + (c17731c2 == null ? 0 : c17731c2.hashCode())) * 31;
        C0081a c0081a = this.disclaimer;
        int iHashCode3 = (iHashCode2 + (c0081a == null ? 0 : c0081a.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode5 = (iHashCode4 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        List<String> list = this.categoryIds;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        C0094n c0094n = this.rangeMeter;
        int iHashCode7 = (iHashCode6 + (c0094n == null ? 0 : c0094n.hashCode())) * 31;
        Integer num = this.lastRecording;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        C35585c c35585c = this.miniCallout;
        int iHashCode9 = (iHashCode8 + (c35585c == null ? 0 : c35585c.hashCode())) * 31;
        C21395c c21395c = this.graph;
        return Boolean.hashCode(this.useTileBackground) + ((iHashCode9 + (c21395c != null ? c21395c.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C35585c getMiniCallout() {
        return this.miniCallout;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C0094n getRangeMeter() {
        return this.rangeMeter;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC0093m getStatusType() {
        return this.statusType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUseTileBackground() {
        return this.useTileBackground;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str3 = this.value;
        String str4 = this.unit;
        EnumC0093m enumC0093m = this.statusType;
        C17731c2 c17731c2 = this.trend;
        C0081a c0081a = this.disclaimer;
        C9598e c9598e = this.destination;
        GenericInteraction genericInteraction = this.interaction;
        List<String> list = this.categoryIds;
        C0094n c0094n = this.rangeMeter;
        Integer num = this.lastRecording;
        C35585c c35585c = this.miniCallout;
        C21395c c21395c = this.graph;
        boolean z4 = this.useTileBackground;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BiomarkerCardViewState(id=", str, ", title=", str2, ", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", value=");
        sbM32001t.append(str3);
        sbM32001t.append(", unit=");
        sbM32001t.append(str4);
        sbM32001t.append(", statusType=");
        sbM32001t.append(enumC0093m);
        sbM32001t.append(", trend=");
        sbM32001t.append(c17731c2);
        sbM32001t.append(", disclaimer=");
        sbM32001t.append(c0081a);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", categoryIds=");
        sbM32001t.append(list);
        sbM32001t.append(", rangeMeter=");
        sbM32001t.append(c0094n);
        sbM32001t.append(", lastRecording=");
        sbM32001t.append(num);
        sbM32001t.append(", miniCallout=");
        sbM32001t.append(c35585c);
        sbM32001t.append(", graph=");
        sbM32001t.append(c21395c);
        sbM32001t.append(", useTileBackground=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C0088h(String str, String str2, EnumC16313m0 enumC16313m0, String str3, String str4, EnumC0093m enumC0093m, C17731c2 c17731c2, C0081a c0081a, C9598e c9598e, GenericInteraction genericInteraction, List list, C0094n c0094n, Integer num, C35585c c35585c, C21395c c21395c, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, enumC16313m0, str3, str4, enumC0093m, (i13 & 64) != 0 ? null : c17731c2, (i13 & 128) != 0 ? null : c0081a, (i13 & 256) != 0 ? null : c9598e, (i13 & 512) != 0 ? null : genericInteraction, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c0094n, (i13 & 4096) != 0 ? null : num, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c35585c, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : c21395c, (i13 & 32768) != 0 ? true : z4);
    }
}
