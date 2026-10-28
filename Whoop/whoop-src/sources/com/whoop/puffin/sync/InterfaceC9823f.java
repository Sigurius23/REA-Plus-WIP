package com.whoop.puffin.sync;

import ih0.AbstractC18489d0;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.puffin.sync.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/puffin/sync/f;", "", "", "b", "()I", "savedConsoleLogPacketsCount", "a", "savedFirmwareEventPacketsCount", "c", "burstCount", "Lcom/whoop/puffin/sync/f$a;", "Lcom/whoop/puffin/sync/f$b;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC9823f {
    /* JADX INFO: renamed from: a */
    int getSavedFirmwareEventPacketsCount();

    /* JADX INFO: renamed from: b */
    int getSavedConsoleLogPacketsCount();

    /* JADX INFO: renamed from: c */
    int getBurstCount();

    /* JADX INFO: renamed from: com.whoop.puffin.sync.f$b */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/puffin/sync/f$b;", "Lcom/whoop/puffin/sync/f;", "c", "b", "d", "a", "Lcom/whoop/puffin/sync/f$b$a;", "Lcom/whoop/puffin/sync/f$b$b;", "Lcom/whoop/puffin/sync/f$b$c;", "Lcom/whoop/puffin/sync/f$b$d;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b extends InterfaceC9823f {

        /* JADX INFO: renamed from: com.whoop.puffin.sync.f$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/puffin/sync/f$b$b;", "Lcom/whoop/puffin/sync/f$b;", "", "savedConsoleLogPacketsCount", "savedFirmwareEventPacketsCount", "burstCount", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41403b implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int savedConsoleLogPacketsCount;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int savedFirmwareEventPacketsCount;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final int burstCount;

            public C41403b(int i13, int i14, int i15) {
                this.savedConsoleLogPacketsCount = i13;
                this.savedFirmwareEventPacketsCount = i14;
                this.burstCount = i15;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: a, reason: from getter */
            public int getSavedFirmwareEventPacketsCount() {
                return this.savedFirmwareEventPacketsCount;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: b, reason: from getter */
            public int getSavedConsoleLogPacketsCount() {
                return this.savedConsoleLogPacketsCount;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getBurstCount() {
                return this.burstCount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41403b)) {
                    return false;
                }
                C41403b c41403b = (C41403b) other;
                return this.savedConsoleLogPacketsCount == c41403b.savedConsoleLogPacketsCount && this.savedFirmwareEventPacketsCount == c41403b.savedFirmwareEventPacketsCount && this.burstCount == c41403b.burstCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.burstCount) + AbstractC11266d.m30448b(this.savedFirmwareEventPacketsCount, Integer.hashCode(this.savedConsoleLogPacketsCount) * 31, 31);
            }

            public String toString() {
                int burstCount = getBurstCount();
                int savedConsoleLogPacketsCount = getSavedConsoleLogPacketsCount();
                return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(burstCount, savedConsoleLogPacketsCount, "HPS.MetadataEventWhileNotSyncing(burstCount=", ", consoleCount=", ", firmwareCount="), getSavedFirmwareEventPacketsCount(), ")");
            }
        }

        /* JADX INFO: renamed from: com.whoop.puffin.sync.f$b$c */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/puffin/sync/f$b$c;", "Lcom/whoop/puffin/sync/f$b;", "", "savedConsoleLogPacketsCount", "savedFirmwareEventPacketsCount", "burstCount", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int savedConsoleLogPacketsCount;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int savedFirmwareEventPacketsCount;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final int burstCount;

            public c(int i13, int i14, int i15) {
                this.savedConsoleLogPacketsCount = i13;
                this.savedFirmwareEventPacketsCount = i14;
                this.burstCount = i15;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: a, reason: from getter */
            public int getSavedFirmwareEventPacketsCount() {
                return this.savedFirmwareEventPacketsCount;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: b, reason: from getter */
            public int getSavedConsoleLogPacketsCount() {
                return this.savedConsoleLogPacketsCount;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getBurstCount() {
                return this.burstCount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return this.savedConsoleLogPacketsCount == cVar.savedConsoleLogPacketsCount && this.savedFirmwareEventPacketsCount == cVar.savedFirmwareEventPacketsCount && this.burstCount == cVar.burstCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.burstCount) + AbstractC11266d.m30448b(this.savedFirmwareEventPacketsCount, Integer.hashCode(this.savedConsoleLogPacketsCount) * 31, 31);
            }

            public String toString() {
                int burstCount = getBurstCount();
                int savedConsoleLogPacketsCount = getSavedConsoleLogPacketsCount();
                return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(burstCount, savedConsoleLogPacketsCount, "HPS.Success(burstCount=", ", consoleCount=", ", firmwareCount="), getSavedFirmwareEventPacketsCount(), ")");
            }
        }

        /* JADX INFO: renamed from: com.whoop.puffin.sync.f$b$a */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/puffin/sync/f$b$a;", "Lcom/whoop/puffin/sync/f$b;", "", "savedConsoleLogPacketsCount", "savedFirmwareEventPacketsCount", "burstCount", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int savedConsoleLogPacketsCount;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int savedFirmwareEventPacketsCount;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final int burstCount;

            public a(int i13, int i14, int i15) {
                this.savedConsoleLogPacketsCount = i13;
                this.savedFirmwareEventPacketsCount = i14;
                this.burstCount = i15;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: a, reason: from getter */
            public int getSavedFirmwareEventPacketsCount() {
                return this.savedFirmwareEventPacketsCount;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: b, reason: from getter */
            public int getSavedConsoleLogPacketsCount() {
                return this.savedConsoleLogPacketsCount;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getBurstCount() {
                return this.burstCount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return this.savedConsoleLogPacketsCount == aVar.savedConsoleLogPacketsCount && this.savedFirmwareEventPacketsCount == aVar.savedFirmwareEventPacketsCount && this.burstCount == aVar.burstCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.burstCount) + AbstractC11266d.m30448b(this.savedFirmwareEventPacketsCount, Integer.hashCode(this.savedConsoleLogPacketsCount) * 31, 31);
            }

            public String toString() {
                int burstCount = getBurstCount();
                int savedConsoleLogPacketsCount = getSavedConsoleLogPacketsCount();
                return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(burstCount, savedConsoleLogPacketsCount, "HPS.Error(burstCount=", ", consoleCount=", ", firmwareCount="), getSavedFirmwareEventPacketsCount(), ")");
            }

            public /* synthetic */ a(int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
                this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15);
            }
        }

        /* JADX INFO: renamed from: com.whoop.puffin.sync.f$b$d */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/puffin/sync/f$b$d;", "Lcom/whoop/puffin/sync/f$b;", "", "savedConsoleLogPacketsCount", "savedFirmwareEventPacketsCount", "burstCount", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int savedConsoleLogPacketsCount;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final int savedFirmwareEventPacketsCount;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final int burstCount;

            public d(int i13, int i14, int i15) {
                this.savedConsoleLogPacketsCount = i13;
                this.savedFirmwareEventPacketsCount = i14;
                this.burstCount = i15;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: a, reason: from getter */
            public int getSavedFirmwareEventPacketsCount() {
                return this.savedFirmwareEventPacketsCount;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: b, reason: from getter */
            public int getSavedConsoleLogPacketsCount() {
                return this.savedConsoleLogPacketsCount;
            }

            @Override // com.whoop.puffin.sync.InterfaceC9823f
            /* JADX INFO: renamed from: c, reason: from getter */
            public int getBurstCount() {
                return this.burstCount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return this.savedConsoleLogPacketsCount == dVar.savedConsoleLogPacketsCount && this.savedFirmwareEventPacketsCount == dVar.savedFirmwareEventPacketsCount && this.burstCount == dVar.burstCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.burstCount) + AbstractC11266d.m30448b(this.savedFirmwareEventPacketsCount, Integer.hashCode(this.savedConsoleLogPacketsCount) * 31, 31);
            }

            public String toString() {
                int burstCount = getBurstCount();
                int savedConsoleLogPacketsCount = getSavedConsoleLogPacketsCount();
                return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(burstCount, savedConsoleLogPacketsCount, "HPS.Timeout(burstCount=", ", consoleCount=", ", firmwareCount="), getSavedFirmwareEventPacketsCount(), ")");
            }

            public /* synthetic */ d(int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
                this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15);
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.f$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/puffin/sync/f$a;", "Lcom/whoop/puffin/sync/f;", "Lcom/whoop/puffin/sync/e;", "openBurst", "", "savedConsoleLogPacketsCount", "savedFirmwareEventPacketsCount", "burstCount", "<init>", "(Lcom/whoop/puffin/sync/e;III)V", "", "toString", "()Ljava/lang/String;", "d", "(Lcom/whoop/puffin/sync/e;III)Lcom/whoop/puffin/sync/f$a;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/puffin/sync/e;", "f", "()Lcom/whoop/puffin/sync/e;", "b", "I", "c", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC9823f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC9822e openBurst;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int savedConsoleLogPacketsCount;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int savedFirmwareEventPacketsCount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int burstCount;

        public a(InterfaceC9822e openBurst, int i13, int i14, int i15) {
            AbstractC22676k.m65750j(openBurst, "openBurst");
            this.openBurst = openBurst;
            this.savedConsoleLogPacketsCount = i13;
            this.savedFirmwareEventPacketsCount = i14;
            this.burstCount = i15;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ a m23695e(a aVar, InterfaceC9822e interfaceC9822e, int i13, int i14, int i15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                interfaceC9822e = aVar.openBurst;
            }
            if ((i16 & 2) != 0) {
                i13 = aVar.savedConsoleLogPacketsCount;
            }
            if ((i16 & 4) != 0) {
                i14 = aVar.savedFirmwareEventPacketsCount;
            }
            if ((i16 & 8) != 0) {
                i15 = aVar.burstCount;
            }
            return aVar.m23696d(interfaceC9822e, i13, i14, i15);
        }

        @Override // com.whoop.puffin.sync.InterfaceC9823f
        /* JADX INFO: renamed from: a, reason: from getter */
        public int getSavedFirmwareEventPacketsCount() {
            return this.savedFirmwareEventPacketsCount;
        }

        @Override // com.whoop.puffin.sync.InterfaceC9823f
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getSavedConsoleLogPacketsCount() {
            return this.savedConsoleLogPacketsCount;
        }

        @Override // com.whoop.puffin.sync.InterfaceC9823f
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getBurstCount() {
            return this.burstCount;
        }

        /* JADX INFO: renamed from: d */
        public final a m23696d(InterfaceC9822e openBurst, int savedConsoleLogPacketsCount, int savedFirmwareEventPacketsCount, int burstCount) {
            AbstractC22676k.m65750j(openBurst, "openBurst");
            return new a(openBurst, savedConsoleLogPacketsCount, savedFirmwareEventPacketsCount, burstCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.openBurst, aVar.openBurst) && this.savedConsoleLogPacketsCount == aVar.savedConsoleLogPacketsCount && this.savedFirmwareEventPacketsCount == aVar.savedFirmwareEventPacketsCount && this.burstCount == aVar.burstCount;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC9822e getOpenBurst() {
            return this.openBurst;
        }

        public int hashCode() {
            return Integer.hashCode(this.burstCount) + AbstractC11266d.m30448b(this.savedFirmwareEventPacketsCount, AbstractC11266d.m30448b(this.savedConsoleLogPacketsCount, this.openBurst.hashCode() * 31, 31), 31);
        }

        public String toString() {
            InterfaceC9822e interfaceC9822e = this.openBurst;
            int burstCount = getBurstCount();
            int savedConsoleLogPacketsCount = getSavedConsoleLogPacketsCount();
            int savedFirmwareEventPacketsCount = getSavedFirmwareEventPacketsCount();
            StringBuilder sb4 = new StringBuilder("HPS.Running(openBurst=");
            sb4.append(interfaceC9822e);
            sb4.append(", burstCount=");
            sb4.append(burstCount);
            sb4.append(", consoleCount=");
            return AbstractC26725a.m79505i(sb4, savedConsoleLogPacketsCount, ", firmwareCount=", savedFirmwareEventPacketsCount, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ a(InterfaceC9822e interfaceC9822e, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i16 & 1) != 0) {
                interfaceC9822e = new InterfaceC9822e.b(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
            this(interfaceC9822e, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
        }
    }
}
