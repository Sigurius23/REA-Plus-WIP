package com.whoop.connectivityCore.batteryPack.models;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "", "", "byte", "<init>", "(Ljava/lang/String;IB)V", "B", "getByte", "()B", "Companion", "a", "PUFFIN", "PENGUIN", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum BatteryPackType {
    PUFFIN((byte) 12),
    PENGUIN((byte) 14);

    private static final Map<Byte, BatteryPackType> map;
    private final byte byte;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.whoop.connectivityCore.batteryPack.models.BatteryPackType$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;", "", "<init>", "()V", "", "byte", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "a", "(B)Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "", "map", "Ljava/util/Map;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final BatteryPackType m19627a(byte b) {
            BatteryPackType batteryPackType = (BatteryPackType) BatteryPackType.map.get(Byte.valueOf(b));
            return batteryPackType == null ? BatteryPackType.PUFFIN : batteryPackType;
        }

        private Companion() {
        }
    }

    static {
        BatteryPackType[] batteryPackTypeArrValues = values();
        int iM73988W = AbstractC25247g0.m73988W(batteryPackTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W);
        for (BatteryPackType batteryPackType : batteryPackTypeArrValues) {
            linkedHashMap.put(Byte.valueOf(batteryPackType.byte), batteryPackType);
        }
        map = linkedHashMap;
    }

    BatteryPackType(byte b) {
        this.byte = b;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final byte getByte() {
        return this.byte;
    }
}
