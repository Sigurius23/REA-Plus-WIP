package com.whoop.core.details.network.model.sleep;

import ge3.AbstractC15751g;
import gp1.C16065a;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import x81.C38072d;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WAKE_EVENTS' uses external variables
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;", "", "icon", "", "<init>", "(Ljava/lang/String;II)V", "getIcon", "()I", "WAKE_EVENTS", "EFFICIENCY", "LATENCY", "RESPIRATORY_RATE", "Companion", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class SleepDetailsKeyMetricTileType {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ SleepDetailsKeyMetricTileType[] $VALUES;
    private static final InterfaceC23462h $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SleepDetailsKeyMetricTileType EFFICIENCY;
    public static final SleepDetailsKeyMetricTileType LATENCY;
    public static final SleepDetailsKeyMetricTileType RESPIRATORY_RATE;
    public static final SleepDetailsKeyMetricTileType WAKE_EVENTS;
    private final int icon;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) SleepDetailsKeyMetricTileType.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SleepDetailsKeyMetricTileType[] $values() {
        return new SleepDetailsKeyMetricTileType[]{WAKE_EVENTS, EFFICIENCY, LATENCY, RESPIRATORY_RATE};
    }

    static {
        C38072d c38072d = C38072d.f163053a;
        WAKE_EVENTS = new SleepDetailsKeyMetricTileType("WAKE_EVENTS", 0, c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getDisturbances());
        EFFICIENCY = new SleepDetailsKeyMetricTileType("EFFICIENCY", 1, c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getEfficiency());
        LATENCY = new SleepDetailsKeyMetricTileType("LATENCY", 2, c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getLatency());
        RESPIRATORY_RATE = new SleepDetailsKeyMetricTileType("RESPIRATORY_RATE", 3, c38072d.m121951d().getRecovery().getRespiratoryRate());
        SleepDetailsKeyMetricTileType[] sleepDetailsKeyMetricTileTypeArr$values = $values();
        $VALUES = sleepDetailsKeyMetricTileTypeArr$values;
        $ENTRIES = AbstractC15751g.m44468u(sleepDetailsKeyMetricTileTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16065a(19));
    }

    private SleepDetailsKeyMetricTileType(String str, int i13, int i14) {
        super(str, i13);
        this.icon = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.core.details.network.model.sleep.SleepDetailsKeyMetricTileType", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static SleepDetailsKeyMetricTileType valueOf(String str) {
        return (SleepDetailsKeyMetricTileType) Enum.valueOf(SleepDetailsKeyMetricTileType.class, str);
    }

    public static SleepDetailsKeyMetricTileType[] values() {
        return (SleepDetailsKeyMetricTileType[]) $VALUES.clone();
    }

    public final int getIcon() {
        return this.icon;
    }
}
