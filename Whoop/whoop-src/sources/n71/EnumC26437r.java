package n71;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import mx1.C26009o;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISCONNECTED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: n71.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, m65681d2 = {"Ln71/r;", "", "Lcom/whoop/design/util/TextResource;", "zoneText", "Ly81/f;", "zoneColor", "Li91/a;", "graphBackground", "Lgz0/m0;", "icon", "<init>", "(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;)V", "", "isActive", "()Z", "shouldDrawMarkerLine", "isCalibrating", "Lcom/whoop/design/util/TextResource;", "getZoneText", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "getZoneColor", "()Ly81/f;", "Li91/a;", "getGraphBackground", "()Li91/a;", "Lgz0/m0;", "getIcon", "()Lgz0/m0;", "ZONE_0", "ZONE_1", "ZONE_2", "ZONE_3", "ZONE_4", "ZONE_5", "DISCONNECTED", "CALIBRATING", "DEVICE_OFF_BODY", "FW_UPDATE_IN_PROGRESS", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC26437r {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC26437r[] $VALUES;
    public static final EnumC26437r CALIBRATING;
    public static final EnumC26437r DEVICE_OFF_BODY;
    public static final EnumC26437r DISCONNECTED;
    public static final EnumC26437r FW_UPDATE_IN_PROGRESS;
    public static final EnumC26437r ZONE_0 = new EnumC26437r("ZONE_0", 0, AbstractC8693b.m21277k(AbstractC16277f.f62294X0), EnumC39333f.STRAIN, AbstractC18249c.m52572j(new C26009o(23)), null, 8, null);
    public static final EnumC26437r ZONE_1 = new EnumC26437r("ZONE_1", 1, AbstractC8693b.m21277k(AbstractC16277f.f62297Y0), EnumC39333f.STRAIN_ZONE_1, AbstractC18249c.m52572j(new C26009o(24)), null, 8, null);
    public static final EnumC26437r ZONE_2 = new EnumC26437r("ZONE_2", 2, AbstractC8693b.m21277k(AbstractC16277f.f62300Z0), EnumC39333f.STRAIN_ZONE_2, AbstractC18249c.m52572j(new C26009o(25)), null, 8, null);
    public static final EnumC26437r ZONE_3 = new EnumC26437r("ZONE_3", 3, AbstractC8693b.m21277k(AbstractC16277f.f62304a1), EnumC39333f.STRAIN_ZONE_3, AbstractC18249c.m52572j(new C26009o(26)), null, 8, null);
    public static final EnumC26437r ZONE_4 = new EnumC26437r("ZONE_4", 4, AbstractC8693b.m21277k(AbstractC16277f.f62308b1), EnumC39333f.STRAIN_ZONE_4, AbstractC18249c.m52572j(new C26009o(27)), null, 8, null);
    public static final EnumC26437r ZONE_5 = new EnumC26437r("ZONE_5", 5, AbstractC8693b.m21277k(AbstractC16277f.f62312c1), EnumC39333f.STRAIN_ZONE_5, AbstractC18249c.m52572j(new C26009o(28)), null, 8, null);
    private final AbstractC18247a graphBackground;
    private final EnumC16313m0 icon;
    private final EnumC39333f zoneColor;
    private final TextResource zoneText;

    private static final /* synthetic */ EnumC26437r[] $values() {
        return new EnumC26437r[]{ZONE_0, ZONE_1, ZONE_2, ZONE_3, ZONE_4, ZONE_5, DISCONNECTED, CALIBRATING, DEVICE_OFF_BODY, FW_UPDATE_IN_PROGRESS};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62282T0);
        EnumC39333f enumC39333f = EnumC39333f.WHITE_50;
        DISCONNECTED = new EnumC26437r("DISCONNECTED", 6, c8688bM21277k, enumC39333f, 0 == true ? 1 : 0, EnumC16313m0.BLUETOOTH, 4, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        AbstractC18247a abstractC18247a = null;
        CALIBRATING = new EnumC26437r("CALIBRATING", 7, AbstractC8693b.m21277k(AbstractC16277f.f62279S0), enumC39333f, abstractC18247a, null, 12, defaultConstructorMarker);
        int i13 = 4;
        DEVICE_OFF_BODY = new EnumC26437r("DEVICE_OFF_BODY", 8, AbstractC8693b.m21277k(AbstractC16277f.f62285U0), enumC39333f, abstractC18247a, EnumC16313m0.REMOVE_STRAP, i13, defaultConstructorMarker);
        FW_UPDATE_IN_PROGRESS = new EnumC26437r("FW_UPDATE_IN_PROGRESS", 9, AbstractC8693b.m21277k(AbstractC16277f.f62288V0), enumC39333f, abstractC18247a, EnumC16313m0.STRAP, i13, defaultConstructorMarker);
        EnumC26437r[] enumC26437rArr$values = $values();
        $VALUES = enumC26437rArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC26437rArr$values);
    }

    private EnumC26437r(String str, int i13, TextResource textResource, EnumC39333f enumC39333f, AbstractC18247a abstractC18247a, EnumC16313m0 enumC16313m0) {
        super(str, i13);
        this.zoneText = textResource;
        this.zoneColor = enumC39333f;
        this.graphBackground = abstractC18247a;
        this.icon = enumC16313m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$0(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getStrain()), new C17919x(brushBackground.getTransparent())), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$1(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getStrainZone1()), new C17919x(brushBackground.getTransparent())), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$2(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getStrainZone2()), new C17919x(brushBackground.getTransparent())), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$3(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getStrainZone3()), new C17919x(brushBackground.getTransparent())), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$4(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getStrainZone4()), new C17919x(brushBackground.getTransparent())), 0L, 0L, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$5(C39336i brushBackground) {
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        return C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(brushBackground.getStrainZone5()), new C17919x(brushBackground.getTransparent())), 0L, 0L, 14);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC26437r valueOf(String str) {
        return (EnumC26437r) Enum.valueOf(EnumC26437r.class, str);
    }

    public static EnumC26437r[] values() {
        return (EnumC26437r[]) $VALUES.clone();
    }

    public final AbstractC18247a getGraphBackground() {
        return this.graphBackground;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final EnumC39333f getZoneColor() {
        return this.zoneColor;
    }

    public final TextResource getZoneText() {
        return this.zoneText;
    }

    public final boolean isActive() {
        return (this == DISCONNECTED || this == DEVICE_OFF_BODY || this == FW_UPDATE_IN_PROGRESS || this == CALIBRATING) ? false : true;
    }

    public final boolean isCalibrating() {
        return this == CALIBRATING;
    }

    public final boolean shouldDrawMarkerLine() {
        return (this == DISCONNECTED || this == DEVICE_OFF_BODY || this == FW_UPDATE_IN_PROGRESS) ? false : true;
    }

    public /* synthetic */ EnumC26437r(String str, int i13, TextResource textResource, EnumC39333f enumC39333f, AbstractC18247a abstractC18247a, EnumC16313m0 enumC16313m0, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, textResource, enumC39333f, (i14 & 4) != 0 ? null : abstractC18247a, (i14 & 8) != 0 ? EnumC16313m0.TINY_HEART_RATE : enumC16313m0);
    }
}
