package qu1;

import com.whoop.design.util.TextResource;
import mc1.EnumC25417b;
import ny0.C27273p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import tu1.C34188a;

/* JADX INFO: renamed from: qu1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lqu1/b;", "", "c", "b", "a", "Lqu1/b$a;", "Lqu1/b$b;", "Lqu1/b$c;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC30626b {

    /* JADX INFO: renamed from: qu1.b$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lqu1/b$a;", "Lqu1/b;", "", "componentId", "Ltu1/a;", "bottomSheetState", "<init>", "(Ljava/lang/String;Ltu1/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ltu1/a;", "()Ltu1/a;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC30626b {

        /* JADX INFO: renamed from: c */
        public static final int f125917c = C27273p0.f109116o;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String componentId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C34188a bottomSheetState;

        public a(String componentId, C34188a bottomSheetState) {
            AbstractC22676k.m65750j(componentId, "componentId");
            AbstractC22676k.m65750j(bottomSheetState, "bottomSheetState");
            this.componentId = componentId;
            this.bottomSheetState = bottomSheetState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C34188a getBottomSheetState() {
            return this.bottomSheetState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getComponentId() {
            return this.componentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.componentId, aVar.componentId) && AbstractC22676k.m65745e(this.bottomSheetState, aVar.bottomSheetState);
        }

        public int hashCode() {
            return this.bottomSheetState.hashCode() + (this.componentId.hashCode() * 31);
        }

        public String toString() {
            return "BottomSheetClick(componentId=" + this.componentId + ", bottomSheetState=" + this.bottomSheetState + ")";
        }
    }

    /* JADX INFO: renamed from: qu1.b$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\u001f¨\u0006 "}, m65681d2 = {"Lqu1/b$b;", "Lqu1/b;", "", "componentId", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "timeDisplay", "Ly81/e;", "scrubColor", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Ly81/e;", "()Ly81/e;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC30626b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String componentId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource valueDisplay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource unitDisplay;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource timeDisplay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC39332e scrubColor;

        public b(String componentId, TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC39332e interfaceC39332e) {
            AbstractC22676k.m65750j(componentId, "componentId");
            this.componentId = componentId;
            this.valueDisplay = textResource;
            this.unitDisplay = textResource2;
            this.timeDisplay = textResource3;
            this.scrubColor = interfaceC39332e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getComponentId() {
            return this.componentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC39332e getScrubColor() {
            return this.scrubColor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getTimeDisplay() {
            return this.timeDisplay;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getUnitDisplay() {
            return this.unitDisplay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getValueDisplay() {
            return this.valueDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.componentId, bVar.componentId) && AbstractC22676k.m65745e(this.valueDisplay, bVar.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, bVar.unitDisplay) && AbstractC22676k.m65745e(this.timeDisplay, bVar.timeDisplay) && AbstractC22676k.m65745e(this.scrubColor, bVar.scrubColor);
        }

        public int hashCode() {
            int iHashCode = this.componentId.hashCode() * 31;
            TextResource textResource = this.valueDisplay;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            TextResource textResource2 = this.unitDisplay;
            int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
            TextResource textResource3 = this.timeDisplay;
            int iHashCode4 = (iHashCode3 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
            InterfaceC39332e interfaceC39332e = this.scrubColor;
            return iHashCode4 + (interfaceC39332e != null ? interfaceC39332e.hashCode() : 0);
        }

        public String toString() {
            String str = this.componentId;
            TextResource textResource = this.valueDisplay;
            TextResource textResource2 = this.unitDisplay;
            TextResource textResource3 = this.timeDisplay;
            InterfaceC39332e interfaceC39332e = this.scrubColor;
            StringBuilder sbM91847q = AbstractC30007c.m91847q("OnGraphScrub(componentId=", str, ", valueDisplay=", textResource, ", unitDisplay=");
            AbstractC30007c.m91855y(sbM91847q, textResource2, ", timeDisplay=", textResource3, ", scrubColor=");
            sbM91847q.append(interfaceC39332e);
            sbM91847q.append(")");
            return sbM91847q.toString();
        }
    }

    /* JADX INFO: renamed from: qu1.b$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lqu1/b$c;", "Lqu1/b;", "", "componentId", "Lmc1/b;", "heartZoneType", "<init>", "(Ljava/lang/String;Lmc1/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lmc1/b;", "()Lmc1/b;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC30626b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String componentId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC25417b heartZoneType;

        public c(String componentId, EnumC25417b heartZoneType) {
            AbstractC22676k.m65750j(componentId, "componentId");
            AbstractC22676k.m65750j(heartZoneType, "heartZoneType");
            this.componentId = componentId;
            this.heartZoneType = heartZoneType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getComponentId() {
            return this.componentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC25417b getHeartZoneType() {
            return this.heartZoneType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.componentId, cVar.componentId) && this.heartZoneType == cVar.heartZoneType;
        }

        public int hashCode() {
            return this.heartZoneType.hashCode() + (this.componentId.hashCode() * 31);
        }

        public String toString() {
            return "OnHrBarClicked(componentId=" + this.componentId + ", heartZoneType=" + this.heartZoneType + ")";
        }
    }
}
