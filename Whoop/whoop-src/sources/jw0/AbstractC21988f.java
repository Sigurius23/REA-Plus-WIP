package jw0;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.core.details.network.model.sleep.SleepMetricTypeModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.graph.GraphModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import mc1.EnumC25417b;
import mw0.C25973a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.AbstractC27201h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jw0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Ljw0/f;", "", "<init>", "()V", "c", "a", "d", "b", "Ljw0/f$a;", "Ljw0/f$b;", "Ljw0/f$c;", "Ljw0/f$d;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21988f {

    /* JADX INFO: renamed from: jw0.f$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ljw0/f$a;", "Ljw0/f;", "", "sleepIdV2", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21988f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String sleepIdV2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String sleepIdV2) {
            super(null);
            AbstractC22676k.m65750j(sleepIdV2, "sleepIdV2");
            this.sleepIdV2 = sleepIdV2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSleepIdV2() {
            return this.sleepIdV2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.sleepIdV2, ((a) other).sleepIdV2);
        }

        public int hashCode() {
            return this.sleepIdV2.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(sleepIdV2=", this.sleepIdV2, ")");
        }
    }

    /* JADX INFO: renamed from: jw0.f$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljw0/f$c;", "Ljw0/f;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC21988f {

        /* JADX INFO: renamed from: a */
        public static final c f85178a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC21988f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21988f() {
    }

    /* JADX INFO: renamed from: jw0.f$b */
    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J~\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b1\u00106R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b7\u00104R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b-\u00109¨\u0006:"}, m65681d2 = {"Ljw0/f$b;", "Ljw0/f;", "", "screenTitle", "Ljw0/a;", "keyMetrics", "Lnw0/h;", "dialog", "Ll83/k;", "Lorg/joda/time/LocalDateTime;", "editBounds", "Lmw0/a;", "missingHrData", "", "isNap", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "heartRateZoneContainer", "isNapToSleepAvailable", "Lcom/whoop/design/models/items/graph/GraphModel;", "graphModel", "<init>", "(Ljava/lang/String;Ljw0/a;Lnw0/h;Ll83/k;Lmw0/a;ZLcom/whoop/design/models/items/BarGraphContainerModel;ZLcom/whoop/design/models/items/graph/GraphModel;)V", "a", "(Ljava/lang/String;Ljw0/a;Lnw0/h;Ll83/k;Lmw0/a;ZLcom/whoop/design/models/items/BarGraphContainerModel;ZLcom/whoop/design/models/items/graph/GraphModel;)Ljw0/f$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "Ljw0/a;", "g", "()Ljw0/a;", "c", "Lnw0/h;", "()Lnw0/h;", "d", "Ll83/k;", "()Ll83/k;", "e", "Lmw0/a;", "getMissingHrData", "()Lmw0/a;", "f", "Z", "i", "()Z", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "()Lcom/whoop/design/models/items/BarGraphContainerModel;", "j", "Lcom/whoop/design/models/items/graph/GraphModel;", "()Lcom/whoop/design/models/items/graph/GraphModel;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21988f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C21983a keyMetrics;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC27201h dialog;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C23465k editBounds;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C25973a missingHrData;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isNap;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final BarGraphContainerModel heartRateZoneContainer;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean isNapToSleepAvailable;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final GraphModel graphModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String screenTitle, C21983a keyMetrics, AbstractC27201h abstractC27201h, C23465k c23465k, C25973a c25973a, boolean z4, BarGraphContainerModel barGraphContainerModel, boolean z13, GraphModel graphModel) {
            super(null);
            AbstractC22676k.m65750j(screenTitle, "screenTitle");
            AbstractC22676k.m65750j(keyMetrics, "keyMetrics");
            AbstractC22676k.m65750j(graphModel, "graphModel");
            this.screenTitle = screenTitle;
            this.keyMetrics = keyMetrics;
            this.dialog = abstractC27201h;
            this.editBounds = c23465k;
            this.missingHrData = c25973a;
            this.isNap = z4;
            this.heartRateZoneContainer = barGraphContainerModel;
            this.isNapToSleepAvailable = z13;
            this.graphModel = graphModel;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m62792b(b bVar, String str, C21983a c21983a, AbstractC27201h abstractC27201h, C23465k c23465k, C25973a c25973a, boolean z4, BarGraphContainerModel barGraphContainerModel, boolean z13, GraphModel graphModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = bVar.screenTitle;
            }
            if ((i13 & 2) != 0) {
                c21983a = bVar.keyMetrics;
            }
            if ((i13 & 4) != 0) {
                abstractC27201h = bVar.dialog;
            }
            if ((i13 & 8) != 0) {
                c23465k = bVar.editBounds;
            }
            if ((i13 & 16) != 0) {
                c25973a = bVar.missingHrData;
            }
            if ((i13 & 32) != 0) {
                z4 = bVar.isNap;
            }
            if ((i13 & 64) != 0) {
                barGraphContainerModel = bVar.heartRateZoneContainer;
            }
            if ((i13 & 128) != 0) {
                z13 = bVar.isNapToSleepAvailable;
            }
            if ((i13 & 256) != 0) {
                graphModel = bVar.graphModel;
            }
            boolean z14 = z13;
            GraphModel graphModel2 = graphModel;
            boolean z15 = z4;
            BarGraphContainerModel barGraphContainerModel2 = barGraphContainerModel;
            C25973a c25973a2 = c25973a;
            AbstractC27201h abstractC27201h2 = abstractC27201h;
            return bVar.m62793a(str, c21983a, abstractC27201h2, c23465k, c25973a2, z15, barGraphContainerModel2, z14, graphModel2);
        }

        /* JADX INFO: renamed from: a */
        public final b m62793a(String screenTitle, C21983a keyMetrics, AbstractC27201h dialog, C23465k editBounds, C25973a missingHrData, boolean isNap, BarGraphContainerModel heartRateZoneContainer, boolean isNapToSleepAvailable, GraphModel graphModel) {
            AbstractC22676k.m65750j(screenTitle, "screenTitle");
            AbstractC22676k.m65750j(keyMetrics, "keyMetrics");
            AbstractC22676k.m65750j(graphModel, "graphModel");
            return new b(screenTitle, keyMetrics, dialog, editBounds, missingHrData, isNap, heartRateZoneContainer, isNapToSleepAvailable, graphModel);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC27201h getDialog() {
            return this.dialog;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C23465k getEditBounds() {
            return this.editBounds;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final GraphModel getGraphModel() {
            return this.graphModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.screenTitle, bVar.screenTitle) && AbstractC22676k.m65745e(this.keyMetrics, bVar.keyMetrics) && AbstractC22676k.m65745e(this.dialog, bVar.dialog) && AbstractC22676k.m65745e(this.editBounds, bVar.editBounds) && AbstractC22676k.m65745e(this.missingHrData, bVar.missingHrData) && this.isNap == bVar.isNap && AbstractC22676k.m65745e(this.heartRateZoneContainer, bVar.heartRateZoneContainer) && this.isNapToSleepAvailable == bVar.isNapToSleepAvailable && AbstractC22676k.m65745e(this.graphModel, bVar.graphModel);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final BarGraphContainerModel getHeartRateZoneContainer() {
            return this.heartRateZoneContainer;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C21983a getKeyMetrics() {
            return this.keyMetrics;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getScreenTitle() {
            return this.screenTitle;
        }

        public int hashCode() {
            int iHashCode = (this.keyMetrics.hashCode() + (this.screenTitle.hashCode() * 31)) * 31;
            AbstractC27201h abstractC27201h = this.dialog;
            int iHashCode2 = (iHashCode + (abstractC27201h == null ? 0 : abstractC27201h.hashCode())) * 31;
            C23465k c23465k = this.editBounds;
            int iHashCode3 = (iHashCode2 + (c23465k == null ? 0 : c23465k.hashCode())) * 31;
            C25973a c25973a = this.missingHrData;
            int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (c25973a == null ? 0 : c25973a.hashCode())) * 31, 31, this.isNap);
            BarGraphContainerModel barGraphContainerModel = this.heartRateZoneContainer;
            return this.graphModel.hashCode() + AbstractC2875y.m8289b((iM8289b + (barGraphContainerModel != null ? barGraphContainerModel.hashCode() : 0)) * 31, 31, this.isNapToSleepAvailable);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsNap() {
            return this.isNap;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsNapToSleepAvailable() {
            return this.isNapToSleepAvailable;
        }

        public String toString() {
            return "Incomplete(screenTitle=" + this.screenTitle + ", keyMetrics=" + this.keyMetrics + ", dialog=" + this.dialog + ", editBounds=" + this.editBounds + ", missingHrData=" + this.missingHrData + ", isNap=" + this.isNap + ", heartRateZoneContainer=" + this.heartRateZoneContainer + ", isNapToSleepAvailable=" + this.isNapToSleepAvailable + ", graphModel=" + this.graphModel + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(String str, C21983a c21983a, AbstractC27201h abstractC27201h, C23465k c23465k, C25973a c25973a, boolean z4, BarGraphContainerModel barGraphContainerModel, boolean z13, GraphModel graphModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z14;
            boolean z15;
            abstractC27201h = (i13 & 4) != 0 ? null : abstractC27201h;
            c23465k = (i13 & 8) != 0 ? null : c23465k;
            c25973a = (i13 & 16) != 0 ? null : c25973a;
            z4 = (i13 & 32) != 0 ? false : z4;
            barGraphContainerModel = (i13 & 64) != 0 ? null : barGraphContainerModel;
            if ((i13 & 128) != 0) {
                z15 = z4;
                z14 = z15;
            } else {
                z14 = z13;
                z15 = z4;
            }
            this(str, c21983a, abstractC27201h, c23465k, c25973a, z15, barGraphContainerModel, z14, graphModel);
        }
    }

    /* JADX INFO: renamed from: jw0.f$d */
    @Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&Jð\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bB\u0010LR%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bF\u0010OR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bH\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u00102\u001a\u0004\bS\u00104R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b9\u0010T\u001a\u0004\bJ\u0010UR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010V\u001a\u0004\bM\u0010WR\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010X\u001a\u0004\b>\u0010YR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b@\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b[\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bD\u0010`\u001a\u0004\b8\u0010aR\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b^\u0010b\u001a\u0004\b:\u0010c¨\u0006d"}, m65681d2 = {"Ljw0/f$d;", "Ljw0/f;", "", "isNap", "", "screenTitle", "screenSubtitle", "Ljw0/b;", "scrubbingHorizontalStatState", "Ljw0/i;", "selectedSleepMetricType", "", "Lmc1/b;", "sleepStageTypeLabelMap", "Ljw0/a;", "keyMetrics", "Lnw0/h;", "dialog", "Ll83/k;", "Lorg/joda/time/LocalDateTime;", "editBounds", "Lmw0/a;", "missingHrData", "isNapToSleepAvailable", "Lcom/whoop/design/models/items/graph/GraphModel;", "graphModel", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "heartRateZoneContainer", "currentHeartZoneType", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "selectedTooltip", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVowModel", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "additionalInfoText", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljw0/b;Ljw0/i;Ljava/util/Map;Ljw0/a;Lnw0/h;Ll83/k;Lmw0/a;ZLcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lmc1/b;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "a", "(ZLjava/lang/String;Ljava/lang/String;Ljw0/b;Ljw0/i;Ljava/util/Map;Ljw0/a;Lnw0/h;Ll83/k;Lmw0/a;ZLcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lmc1/b;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Ljw0/f$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "s", "()Z", "b", "Ljava/lang/String;", "m", "c", "l", "d", "Ljw0/b;", "n", "()Ljw0/b;", "e", "Ljw0/i;", "o", "()Ljw0/i;", "f", "Ljava/util/Map;", "q", "()Ljava/util/Map;", "g", "Ljw0/a;", "j", "()Ljw0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lnw0/h;", "()Lnw0/h;", "i", "Ll83/k;", "()Ll83/k;", "Lmw0/a;", "k", "()Lmw0/a;", "t", "Lcom/whoop/design/models/items/graph/GraphModel;", "()Lcom/whoop/design/models/items/graph/GraphModel;", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "()Lcom/whoop/design/models/items/BarGraphContainerModel;", "Lmc1/b;", "()Lmc1/b;", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "p", "()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "r", "()Lcom/whoop/design/models/items/WhoopCoachVowModel;", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC21988f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isNap;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String screenTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String screenSubtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C21984b scrubbingHorizontalStatState;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final AbstractC21991i selectedSleepMetricType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<EnumC25417b, AbstractC21991i> sleepStageTypeLabelMap;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C21983a keyMetrics;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final AbstractC27201h dialog;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C23465k editBounds;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C25973a missingHrData;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean isNapToSleepAvailable;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final GraphModel graphModel;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final BarGraphContainerModel heartRateZoneContainer;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final EnumC25417b currentHeartZoneType;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final SleepMetricTypeModel selectedTooltip;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final WhoopCoachVowModel whoopCoachVowModel;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final AdditionalInfoTextModel additionalInfoText;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final AiContextMetadata aiContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(boolean z4, String screenTitle, String screenSubtitle, C21984b c21984b, AbstractC21991i abstractC21991i, Map<EnumC25417b, ? extends AbstractC21991i> sleepStageTypeLabelMap, C21983a keyMetrics, AbstractC27201h abstractC27201h, C23465k c23465k, C25973a c25973a, boolean z13, GraphModel graphModel, BarGraphContainerModel barGraphContainerModel, EnumC25417b currentHeartZoneType, SleepMetricTypeModel sleepMetricTypeModel, WhoopCoachVowModel whoopCoachVowModel, AdditionalInfoTextModel additionalInfoTextModel, AiContextMetadata aiContextMetadata) {
            super(null);
            AbstractC22676k.m65750j(screenTitle, "screenTitle");
            AbstractC22676k.m65750j(screenSubtitle, "screenSubtitle");
            AbstractC22676k.m65750j(sleepStageTypeLabelMap, "sleepStageTypeLabelMap");
            AbstractC22676k.m65750j(keyMetrics, "keyMetrics");
            AbstractC22676k.m65750j(graphModel, "graphModel");
            AbstractC22676k.m65750j(currentHeartZoneType, "currentHeartZoneType");
            this.isNap = z4;
            this.screenTitle = screenTitle;
            this.screenSubtitle = screenSubtitle;
            this.scrubbingHorizontalStatState = c21984b;
            this.selectedSleepMetricType = abstractC21991i;
            this.sleepStageTypeLabelMap = sleepStageTypeLabelMap;
            this.keyMetrics = keyMetrics;
            this.dialog = abstractC27201h;
            this.editBounds = c23465k;
            this.missingHrData = c25973a;
            this.isNapToSleepAvailable = z13;
            this.graphModel = graphModel;
            this.heartRateZoneContainer = barGraphContainerModel;
            this.currentHeartZoneType = currentHeartZoneType;
            this.selectedTooltip = sleepMetricTypeModel;
            this.whoopCoachVowModel = whoopCoachVowModel;
            this.additionalInfoText = additionalInfoTextModel;
            this.aiContextMetadata = aiContextMetadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ d m62802b(d dVar, boolean z4, String str, String str2, C21984b c21984b, AbstractC21991i abstractC21991i, Map map, C21983a c21983a, AbstractC27201h abstractC27201h, C23465k c23465k, C25973a c25973a, boolean z13, GraphModel graphModel, BarGraphContainerModel barGraphContainerModel, EnumC25417b enumC25417b, SleepMetricTypeModel sleepMetricTypeModel, WhoopCoachVowModel whoopCoachVowModel, AdditionalInfoTextModel additionalInfoTextModel, AiContextMetadata aiContextMetadata, int i13, Object obj) {
            AiContextMetadata aiContextMetadata2;
            AdditionalInfoTextModel additionalInfoTextModel2;
            boolean z14 = (i13 & 1) != 0 ? dVar.isNap : z4;
            String str3 = (i13 & 2) != 0 ? dVar.screenTitle : str;
            String str4 = (i13 & 4) != 0 ? dVar.screenSubtitle : str2;
            C21984b c21984b2 = (i13 & 8) != 0 ? dVar.scrubbingHorizontalStatState : c21984b;
            AbstractC21991i abstractC21991i2 = (i13 & 16) != 0 ? dVar.selectedSleepMetricType : abstractC21991i;
            Map map2 = (i13 & 32) != 0 ? dVar.sleepStageTypeLabelMap : map;
            C21983a c21983a2 = (i13 & 64) != 0 ? dVar.keyMetrics : c21983a;
            AbstractC27201h abstractC27201h2 = (i13 & 128) != 0 ? dVar.dialog : abstractC27201h;
            C23465k c23465k2 = (i13 & 256) != 0 ? dVar.editBounds : c23465k;
            C25973a c25973a2 = (i13 & 512) != 0 ? dVar.missingHrData : c25973a;
            boolean z15 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? dVar.isNapToSleepAvailable : z13;
            GraphModel graphModel2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? dVar.graphModel : graphModel;
            BarGraphContainerModel barGraphContainerModel2 = (i13 & 4096) != 0 ? dVar.heartRateZoneContainer : barGraphContainerModel;
            EnumC25417b enumC25417b2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? dVar.currentHeartZoneType : enumC25417b;
            boolean z16 = z14;
            SleepMetricTypeModel sleepMetricTypeModel2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? dVar.selectedTooltip : sleepMetricTypeModel;
            WhoopCoachVowModel whoopCoachVowModel2 = (i13 & 32768) != 0 ? dVar.whoopCoachVowModel : whoopCoachVowModel;
            AdditionalInfoTextModel additionalInfoTextModel3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? dVar.additionalInfoText : additionalInfoTextModel;
            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
                additionalInfoTextModel2 = additionalInfoTextModel3;
                aiContextMetadata2 = dVar.aiContextMetadata;
            } else {
                aiContextMetadata2 = aiContextMetadata;
                additionalInfoTextModel2 = additionalInfoTextModel3;
            }
            return dVar.m62803a(z16, str3, str4, c21984b2, abstractC21991i2, map2, c21983a2, abstractC27201h2, c23465k2, c25973a2, z15, graphModel2, barGraphContainerModel2, enumC25417b2, sleepMetricTypeModel2, whoopCoachVowModel2, additionalInfoTextModel2, aiContextMetadata2);
        }

        /* JADX INFO: renamed from: a */
        public final d m62803a(boolean isNap, String screenTitle, String screenSubtitle, C21984b scrubbingHorizontalStatState, AbstractC21991i selectedSleepMetricType, Map<EnumC25417b, ? extends AbstractC21991i> sleepStageTypeLabelMap, C21983a keyMetrics, AbstractC27201h dialog, C23465k editBounds, C25973a missingHrData, boolean isNapToSleepAvailable, GraphModel graphModel, BarGraphContainerModel heartRateZoneContainer, EnumC25417b currentHeartZoneType, SleepMetricTypeModel selectedTooltip, WhoopCoachVowModel whoopCoachVowModel, AdditionalInfoTextModel additionalInfoText, AiContextMetadata aiContextMetadata) {
            AbstractC22676k.m65750j(screenTitle, "screenTitle");
            AbstractC22676k.m65750j(screenSubtitle, "screenSubtitle");
            AbstractC22676k.m65750j(sleepStageTypeLabelMap, "sleepStageTypeLabelMap");
            AbstractC22676k.m65750j(keyMetrics, "keyMetrics");
            AbstractC22676k.m65750j(graphModel, "graphModel");
            AbstractC22676k.m65750j(currentHeartZoneType, "currentHeartZoneType");
            return new d(isNap, screenTitle, screenSubtitle, scrubbingHorizontalStatState, selectedSleepMetricType, sleepStageTypeLabelMap, keyMetrics, dialog, editBounds, missingHrData, isNapToSleepAvailable, graphModel, heartRateZoneContainer, currentHeartZoneType, selectedTooltip, whoopCoachVowModel, additionalInfoText, aiContextMetadata);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AdditionalInfoTextModel getAdditionalInfoText() {
            return this.additionalInfoText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AiContextMetadata getAiContextMetadata() {
            return this.aiContextMetadata;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC25417b getCurrentHeartZoneType() {
            return this.currentHeartZoneType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.isNap == dVar.isNap && AbstractC22676k.m65745e(this.screenTitle, dVar.screenTitle) && AbstractC22676k.m65745e(this.screenSubtitle, dVar.screenSubtitle) && AbstractC22676k.m65745e(this.scrubbingHorizontalStatState, dVar.scrubbingHorizontalStatState) && AbstractC22676k.m65745e(this.selectedSleepMetricType, dVar.selectedSleepMetricType) && AbstractC22676k.m65745e(this.sleepStageTypeLabelMap, dVar.sleepStageTypeLabelMap) && AbstractC22676k.m65745e(this.keyMetrics, dVar.keyMetrics) && AbstractC22676k.m65745e(this.dialog, dVar.dialog) && AbstractC22676k.m65745e(this.editBounds, dVar.editBounds) && AbstractC22676k.m65745e(this.missingHrData, dVar.missingHrData) && this.isNapToSleepAvailable == dVar.isNapToSleepAvailable && AbstractC22676k.m65745e(this.graphModel, dVar.graphModel) && AbstractC22676k.m65745e(this.heartRateZoneContainer, dVar.heartRateZoneContainer) && this.currentHeartZoneType == dVar.currentHeartZoneType && this.selectedTooltip == dVar.selectedTooltip && AbstractC22676k.m65745e(this.whoopCoachVowModel, dVar.whoopCoachVowModel) && AbstractC22676k.m65745e(this.additionalInfoText, dVar.additionalInfoText) && AbstractC22676k.m65745e(this.aiContextMetadata, dVar.aiContextMetadata);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AbstractC27201h getDialog() {
            return this.dialog;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C23465k getEditBounds() {
            return this.editBounds;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final GraphModel getGraphModel() {
            return this.graphModel;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.isNap) * 31, 31, this.screenTitle), 31, this.screenSubtitle);
            C21984b c21984b = this.scrubbingHorizontalStatState;
            int iHashCode = (iM30450d + (c21984b == null ? 0 : c21984b.hashCode())) * 31;
            AbstractC21991i abstractC21991i = this.selectedSleepMetricType;
            int iHashCode2 = (this.keyMetrics.hashCode() + AbstractC3855a.m11821e(this.sleepStageTypeLabelMap, (iHashCode + (abstractC21991i == null ? 0 : abstractC21991i.hashCode())) * 31, 31)) * 31;
            AbstractC27201h abstractC27201h = this.dialog;
            int iHashCode3 = (iHashCode2 + (abstractC27201h == null ? 0 : abstractC27201h.hashCode())) * 31;
            C23465k c23465k = this.editBounds;
            int iHashCode4 = (iHashCode3 + (c23465k == null ? 0 : c23465k.hashCode())) * 31;
            C25973a c25973a = this.missingHrData;
            int iHashCode5 = (this.graphModel.hashCode() + AbstractC2875y.m8289b((iHashCode4 + (c25973a == null ? 0 : c25973a.hashCode())) * 31, 31, this.isNapToSleepAvailable)) * 31;
            BarGraphContainerModel barGraphContainerModel = this.heartRateZoneContainer;
            int iHashCode6 = (this.currentHeartZoneType.hashCode() + ((iHashCode5 + (barGraphContainerModel == null ? 0 : barGraphContainerModel.hashCode())) * 31)) * 31;
            SleepMetricTypeModel sleepMetricTypeModel = this.selectedTooltip;
            int iHashCode7 = (iHashCode6 + (sleepMetricTypeModel == null ? 0 : sleepMetricTypeModel.hashCode())) * 31;
            WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVowModel;
            int iHashCode8 = (iHashCode7 + (whoopCoachVowModel == null ? 0 : whoopCoachVowModel.hashCode())) * 31;
            AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
            int iHashCode9 = (iHashCode8 + (additionalInfoTextModel == null ? 0 : additionalInfoTextModel.hashCode())) * 31;
            AiContextMetadata aiContextMetadata = this.aiContextMetadata;
            return iHashCode9 + (aiContextMetadata != null ? aiContextMetadata.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final BarGraphContainerModel getHeartRateZoneContainer() {
            return this.heartRateZoneContainer;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final C21983a getKeyMetrics() {
            return this.keyMetrics;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final C25973a getMissingHrData() {
            return this.missingHrData;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getScreenSubtitle() {
            return this.screenSubtitle;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getScreenTitle() {
            return this.screenTitle;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final C21984b getScrubbingHorizontalStatState() {
            return this.scrubbingHorizontalStatState;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final AbstractC21991i getSelectedSleepMetricType() {
            return this.selectedSleepMetricType;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final SleepMetricTypeModel getSelectedTooltip() {
            return this.selectedTooltip;
        }

        /* JADX INFO: renamed from: q */
        public final Map<EnumC25417b, AbstractC21991i> m62818q() {
            return this.sleepStageTypeLabelMap;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final WhoopCoachVowModel getWhoopCoachVowModel() {
            return this.whoopCoachVowModel;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsNap() {
            return this.isNap;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsNapToSleepAvailable() {
            return this.isNapToSleepAvailable;
        }

        public String toString() {
            boolean z4 = this.isNap;
            String str = this.screenTitle;
            String str2 = this.screenSubtitle;
            C21984b c21984b = this.scrubbingHorizontalStatState;
            AbstractC21991i abstractC21991i = this.selectedSleepMetricType;
            Map<EnumC25417b, AbstractC21991i> map = this.sleepStageTypeLabelMap;
            C21983a c21983a = this.keyMetrics;
            AbstractC27201h abstractC27201h = this.dialog;
            C23465k c23465k = this.editBounds;
            C25973a c25973a = this.missingHrData;
            boolean z13 = this.isNapToSleepAvailable;
            GraphModel graphModel = this.graphModel;
            BarGraphContainerModel barGraphContainerModel = this.heartRateZoneContainer;
            EnumC25417b enumC25417b = this.currentHeartZoneType;
            SleepMetricTypeModel sleepMetricTypeModel = this.selectedTooltip;
            WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVowModel;
            AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
            AiContextMetadata aiContextMetadata = this.aiContextMetadata;
            StringBuilder sbM38567n = AbstractC13673n.m38567n("Success(isNap=", ", screenTitle=", str, ", screenSubtitle=", z4);
            sbM38567n.append(str2);
            sbM38567n.append(", scrubbingHorizontalStatState=");
            sbM38567n.append(c21984b);
            sbM38567n.append(", selectedSleepMetricType=");
            sbM38567n.append(abstractC21991i);
            sbM38567n.append(", sleepStageTypeLabelMap=");
            sbM38567n.append(map);
            sbM38567n.append(", keyMetrics=");
            sbM38567n.append(c21983a);
            sbM38567n.append(", dialog=");
            sbM38567n.append(abstractC27201h);
            sbM38567n.append(", editBounds=");
            sbM38567n.append(c23465k);
            sbM38567n.append(", missingHrData=");
            sbM38567n.append(c25973a);
            sbM38567n.append(", isNapToSleepAvailable=");
            sbM38567n.append(z13);
            sbM38567n.append(", graphModel=");
            sbM38567n.append(graphModel);
            sbM38567n.append(", heartRateZoneContainer=");
            sbM38567n.append(barGraphContainerModel);
            sbM38567n.append(", currentHeartZoneType=");
            sbM38567n.append(enumC25417b);
            sbM38567n.append(", selectedTooltip=");
            sbM38567n.append(sleepMetricTypeModel);
            sbM38567n.append(", whoopCoachVowModel=");
            sbM38567n.append(whoopCoachVowModel);
            sbM38567n.append(", additionalInfoText=");
            sbM38567n.append(additionalInfoTextModel);
            sbM38567n.append(", aiContextMetadata=");
            sbM38567n.append(aiContextMetadata);
            sbM38567n.append(")");
            return sbM38567n.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ d(boolean z4, String str, String str2, C21984b c21984b, AbstractC21991i abstractC21991i, Map map, C21983a c21983a, AbstractC27201h abstractC27201h, C23465k c23465k, C25973a c25973a, boolean z13, GraphModel graphModel, BarGraphContainerModel barGraphContainerModel, EnumC25417b enumC25417b, SleepMetricTypeModel sleepMetricTypeModel, WhoopCoachVowModel whoopCoachVowModel, AdditionalInfoTextModel additionalInfoTextModel, AiContextMetadata aiContextMetadata, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z14 = (i13 & 1) != 0 ? false : z4;
            this(z14, str, str2, (i13 & 8) != 0 ? null : c21984b, abstractC21991i, map, c21983a, (i13 & 128) != 0 ? null : abstractC27201h, (i13 & 256) != 0 ? null : c23465k, (i13 & 512) != 0 ? null : c25973a, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? z14 : z13, graphModel, barGraphContainerModel, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC25417b.NONE : enumC25417b, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : sleepMetricTypeModel, (32768 & i13) != 0 ? null : whoopCoachVowModel, (65536 & i13) != 0 ? null : additionalInfoTextModel, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : aiContextMetadata);
        }
    }
}
