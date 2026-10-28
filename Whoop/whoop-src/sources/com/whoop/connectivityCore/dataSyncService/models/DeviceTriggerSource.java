package com.whoop.connectivityCore.dataSyncService.models;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "", "<init>", "(Ljava/lang/String;I)V", "APP", "SLEEP_PROCESS_NOW", "ACTIVITY_PROCESS_NOW", "IMPLICIT_UPLOAD", "STRAP", "NONE", "Companion", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum DeviceTriggerSource {
    APP,
    SLEEP_PROCESS_NOW,
    ACTIVITY_PROCESS_NOW,
    IMPLICIT_UPLOAD,
    STRAP,
    NONE;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0015\u0010\b\u001a\u00020\t*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;", "", "<init>", "()V", "valueOfOrDefault", "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "value", "", "isProcessNow", "", "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)Z", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isProcessNow(DeviceTriggerSource deviceTriggerSource) {
            AbstractC22676k.m65750j(deviceTriggerSource, "<this>");
            return deviceTriggerSource == DeviceTriggerSource.SLEEP_PROCESS_NOW || deviceTriggerSource == DeviceTriggerSource.ACTIVITY_PROCESS_NOW;
        }

        public final DeviceTriggerSource valueOfOrDefault(String value) {
            DeviceTriggerSource deviceTriggerSource;
            if (value != null) {
                DeviceTriggerSource[] deviceTriggerSourceArrValues = DeviceTriggerSource.values();
                int length = deviceTriggerSourceArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        deviceTriggerSource = null;
                        break;
                    }
                    deviceTriggerSource = deviceTriggerSourceArrValues[i13];
                    if (AbstractC22676k.m65745e(deviceTriggerSource.name(), value)) {
                        break;
                    }
                    i13++;
                }
                if (deviceTriggerSource != null) {
                    return deviceTriggerSource;
                }
            }
            return DeviceTriggerSource.NONE;
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
