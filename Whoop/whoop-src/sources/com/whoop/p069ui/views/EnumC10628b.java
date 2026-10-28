package com.whoop.p069ui.views;

import ge3.AbstractC15751g;
import hi0.AbstractC17305c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: com.whoop.ui.views.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ui/views/b;", "", "", "colorResId", "<init>", "(Ljava/lang/String;II)V", "I", "getColorResId", "()I", "Companion", "a", "EMPTY", "LOW", "MEDIUM", "HIGH", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC10628b {
    EMPTY(AbstractC36510a.f156005N),
    LOW(AbstractC17305c.f66528i),
    MEDIUM(AbstractC17305c.f66529j),
    HIGH(AbstractC17305c.f66527h);

    private final int colorResId;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.whoop.ui.views.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/ui/views/b$a;", "", "<init>", "()V", "", "batteryPercentage", "Lcom/whoop/ui/views/b;", "a", "(I)Lcom/whoop/ui/views/b;", "b", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC10628b m27486a(int batteryPercentage) {
            if (batteryPercentage >= 50) {
                return EnumC10628b.HIGH;
            }
            if (20 > batteryPercentage || batteryPercentage >= 50) {
                return (batteryPercentage < 0 || batteryPercentage >= 20) ? EnumC10628b.EMPTY : EnumC10628b.LOW;
            }
            return EnumC10628b.MEDIUM;
        }

        /* JADX INFO: renamed from: b */
        public final EnumC10628b m27487b(int batteryPercentage) {
            if (batteryPercentage >= 90) {
                return EnumC10628b.HIGH;
            }
            if (25 > batteryPercentage || batteryPercentage >= 90) {
                return (batteryPercentage < 0 || batteryPercentage >= 25) ? EnumC10628b.EMPTY : EnumC10628b.LOW;
            }
            return EnumC10628b.MEDIUM;
        }

        private Companion() {
        }
    }

    EnumC10628b(int i13) {
        this.colorResId = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getColorResId() {
        return this.colorResId;
    }
}
