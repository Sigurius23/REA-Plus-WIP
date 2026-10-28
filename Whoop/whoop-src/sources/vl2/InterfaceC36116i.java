package vl2;

import com.whoop.trends.data.model.ManualMeasurementModelV2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vl2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lvl2/i;", "", "a", "Lvl2/i$a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC36116i {

    /* JADX INFO: renamed from: vl2.i$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lvl2/i$a;", "Lvl2/i;", "Lcom/whoop/trends/data/model/ManualMeasurementModelV2;", "trendMenuSheet", "Lvl2/h$a;", "trendMenuSheetDomainState", "<init>", "(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lvl2/h$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/trends/data/model/ManualMeasurementModelV2;", "()Lcom/whoop/trends/data/model/ManualMeasurementModelV2;", "b", "Lvl2/h$a;", "()Lvl2/h$a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC36116i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ManualMeasurementModelV2 trendMenuSheet;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC36115h.a trendMenuSheetDomainState;

        public a(ManualMeasurementModelV2 trendMenuSheet, InterfaceC36115h.a aVar) {
            AbstractC22676k.m65750j(trendMenuSheet, "trendMenuSheet");
            this.trendMenuSheet = trendMenuSheet;
            this.trendMenuSheetDomainState = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ManualMeasurementModelV2 getTrendMenuSheet() {
            return this.trendMenuSheet;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC36115h.a getTrendMenuSheetDomainState() {
            return this.trendMenuSheetDomainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.trendMenuSheet, aVar.trendMenuSheet) && AbstractC22676k.m65745e(this.trendMenuSheetDomainState, aVar.trendMenuSheetDomainState);
        }

        public int hashCode() {
            int iHashCode = this.trendMenuSheet.hashCode() * 31;
            InterfaceC36115h.a aVar = this.trendMenuSheetDomainState;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Vo2MaxState(trendMenuSheet=" + this.trendMenuSheet + ", trendMenuSheetDomainState=" + this.trendMenuSheetDomainState + ")";
        }
    }
}
