package live.hms.video.connection.degredation;

import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JX\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0016R\u001b\u0010.\u001a\u00020)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Llive/hms/video/connection/degredation/QualityLimitationReasons;", "", "", "stringReason", "", "bandWidth", "cpu", "none", "other", "", "qualityLimitationResolutionChanges", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)V", "component1$lib_release", "()Ljava/lang/String;", "component1", "component2", "()Ljava/lang/Double;", "component3", "component4", "component5", "component6", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)Llive/hms/video/connection/degredation/QualityLimitationReasons;", "toString", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStringReason$lib_release", "Ljava/lang/Double;", "getBandWidth", "getCpu", "getNone", "getOther", "Ljava/lang/Long;", "getQualityLimitationResolutionChanges", "Llive/hms/video/connection/degredation/QualityLimitationReason;", "reason$delegate", "Ll83/h;", "getReason", "()Llive/hms/video/connection/degredation/QualityLimitationReason;", "reason", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class QualityLimitationReasons {
    private final Double bandWidth;
    private final Double cpu;
    private final Double none;
    private final Double other;
    private final Long qualityLimitationResolutionChanges;

    /* JADX INFO: renamed from: reason$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h reason;
    private final String stringReason;

    public QualityLimitationReasons() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ QualityLimitationReasons copy$default(QualityLimitationReasons qualityLimitationReasons, String str, Double d3, Double d14, Double d15, Double d16, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = qualityLimitationReasons.stringReason;
        }
        if ((i13 & 2) != 0) {
            d3 = qualityLimitationReasons.bandWidth;
        }
        if ((i13 & 4) != 0) {
            d14 = qualityLimitationReasons.cpu;
        }
        if ((i13 & 8) != 0) {
            d15 = qualityLimitationReasons.none;
        }
        if ((i13 & 16) != 0) {
            d16 = qualityLimitationReasons.other;
        }
        if ((i13 & 32) != 0) {
            l7 = qualityLimitationReasons.qualityLimitationResolutionChanges;
        }
        Double d17 = d16;
        Long l12 = l7;
        return qualityLimitationReasons.copy(str, d3, d14, d15, d17, l12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final QualityLimitationReason reason_delegate$lambda$0(QualityLimitationReasons this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        String str = this$0.stringReason;
        if (str != null) {
            switch (str.hashCode()) {
                case -1965768527:
                    if (str.equals("bandwidth")) {
                        return QualityLimitationReason.BANDWIDTH;
                    }
                    break;
                case 98728:
                    if (str.equals("cpu")) {
                        return QualityLimitationReason.CPU;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        return QualityLimitationReason.NONE;
                    }
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        return QualityLimitationReason.OTHER;
                    }
                    break;
            }
        }
        return QualityLimitationReason.UNKNOWN;
    }

    /* JADX INFO: renamed from: component1$lib_release, reason: from getter */
    public final String getStringReason() {
        return this.stringReason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getBandWidth() {
        return this.bandWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getCpu() {
        return this.cpu;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getNone() {
        return this.none;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getOther() {
        return this.other;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getQualityLimitationResolutionChanges() {
        return this.qualityLimitationResolutionChanges;
    }

    public final QualityLimitationReasons copy(String stringReason, Double bandWidth, Double cpu, Double none, Double other, Long qualityLimitationResolutionChanges) {
        return new QualityLimitationReasons(stringReason, bandWidth, cpu, none, other, qualityLimitationResolutionChanges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QualityLimitationReasons)) {
            return false;
        }
        QualityLimitationReasons qualityLimitationReasons = (QualityLimitationReasons) other;
        return AbstractC22676k.m65745e(this.stringReason, qualityLimitationReasons.stringReason) && AbstractC22676k.m65745e(this.bandWidth, qualityLimitationReasons.bandWidth) && AbstractC22676k.m65745e(this.cpu, qualityLimitationReasons.cpu) && AbstractC22676k.m65745e(this.none, qualityLimitationReasons.none) && AbstractC22676k.m65745e(this.other, qualityLimitationReasons.other) && AbstractC22676k.m65745e(this.qualityLimitationResolutionChanges, qualityLimitationReasons.qualityLimitationResolutionChanges);
    }

    public final Double getBandWidth() {
        return this.bandWidth;
    }

    public final Double getCpu() {
        return this.cpu;
    }

    public final Double getNone() {
        return this.none;
    }

    public final Double getOther() {
        return this.other;
    }

    public final Long getQualityLimitationResolutionChanges() {
        return this.qualityLimitationResolutionChanges;
    }

    public final QualityLimitationReason getReason() {
        return (QualityLimitationReason) this.reason.getValue();
    }

    public final String getStringReason$lib_release() {
        return this.stringReason;
    }

    public int hashCode() {
        String str = this.stringReason;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d3 = this.bandWidth;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.cpu;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.none;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.other;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Long l7 = this.qualityLimitationResolutionChanges;
        return iHashCode5 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "QualityLimitationReasons(stringReason=" + this.stringReason + ", bandWidth=" + this.bandWidth + ", cpu=" + this.cpu + ", none=" + this.none + ", other=" + this.other + ", qualityLimitationResolutionChanges=" + this.qualityLimitationResolutionChanges + ')';
    }

    public QualityLimitationReasons(String str, Double d3, Double d14, Double d15, Double d16, Long l7) {
        this.stringReason = str;
        this.bandWidth = d3;
        this.cpu = d14;
        this.none = d15;
        this.other = d16;
        this.qualityLimitationResolutionChanges = l7;
        this.reason = AbstractC30060g.m92088H(new C19683b(this, 29));
    }

    public /* synthetic */ QualityLimitationReasons(String str, Double d3, Double d14, Double d15, Double d16, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : d3, (i13 & 4) != 0 ? null : d14, (i13 & 8) != 0 ? null : d15, (i13 & 16) != 0 ? null : d16, (i13 & 32) != 0 ? null : l7);
    }
}
