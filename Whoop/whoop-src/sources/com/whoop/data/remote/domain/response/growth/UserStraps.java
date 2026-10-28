package com.whoop.data.remote.domain.response.growth;

import c13.AbstractC3855a;
import java.util.List;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/growth/UserStraps;", "", "lastSeenStrap", "Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;", "orderedStrap", "previousStraps", "", "<init>", "(Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;Ljava/util/List;)V", "getLastSeenStrap", "()Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;", "getOrderedStrap", "getPreviousStraps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Strap", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class UserStraps {
    private final Strap lastSeenStrap;
    private final Strap orderedStrap;
    private final List<Strap> previousStraps;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;", "", "generation", "Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;", "serial", "", "firstSeen", "<init>", "(Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;Ljava/lang/String;Ljava/lang/String;)V", "getGeneration", "()Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;", "getSerial", "()Ljava/lang/String;", "getFirstSeen", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Strap {
        private final String firstSeen;
        private final StrapGeneration generation;
        private final String serial;

        public Strap(StrapGeneration generation, String str, String str2) {
            AbstractC22676k.m65750j(generation, "generation");
            this.generation = generation;
            this.serial = str;
            this.firstSeen = str2;
        }

        public static /* synthetic */ Strap copy$default(Strap strap, StrapGeneration strapGeneration, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                strapGeneration = strap.generation;
            }
            if ((i13 & 2) != 0) {
                str = strap.serial;
            }
            if ((i13 & 4) != 0) {
                str2 = strap.firstSeen;
            }
            return strap.copy(strapGeneration, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final StrapGeneration getGeneration() {
            return this.generation;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSerial() {
            return this.serial;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFirstSeen() {
            return this.firstSeen;
        }

        public final Strap copy(StrapGeneration generation, String serial, String firstSeen) {
            AbstractC22676k.m65750j(generation, "generation");
            return new Strap(generation, serial, firstSeen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Strap)) {
                return false;
            }
            Strap strap = (Strap) other;
            return this.generation == strap.generation && AbstractC22676k.m65745e(this.serial, strap.serial) && AbstractC22676k.m65745e(this.firstSeen, strap.firstSeen);
        }

        public final String getFirstSeen() {
            return this.firstSeen;
        }

        public final StrapGeneration getGeneration() {
            return this.generation;
        }

        public final String getSerial() {
            return this.serial;
        }

        public int hashCode() {
            int iHashCode = this.generation.hashCode() * 31;
            String str = this.serial;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.firstSeen;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StrapGeneration strapGeneration = this.generation;
            String str = this.serial;
            String str2 = this.firstSeen;
            StringBuilder sb4 = new StringBuilder("Strap(generation=");
            sb4.append(strapGeneration);
            sb4.append(", serial=");
            sb4.append(str);
            sb4.append(", firstSeen=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    public UserStraps(Strap strap, Strap strap2, List<Strap> previousStraps) {
        AbstractC22676k.m65750j(previousStraps, "previousStraps");
        this.lastSeenStrap = strap;
        this.orderedStrap = strap2;
        this.previousStraps = previousStraps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserStraps copy$default(UserStraps userStraps, Strap strap, Strap strap2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            strap = userStraps.lastSeenStrap;
        }
        if ((i13 & 2) != 0) {
            strap2 = userStraps.orderedStrap;
        }
        if ((i13 & 4) != 0) {
            list = userStraps.previousStraps;
        }
        return userStraps.copy(strap, strap2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Strap getLastSeenStrap() {
        return this.lastSeenStrap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Strap getOrderedStrap() {
        return this.orderedStrap;
    }

    public final List<Strap> component3() {
        return this.previousStraps;
    }

    public final UserStraps copy(Strap lastSeenStrap, Strap orderedStrap, List<Strap> previousStraps) {
        AbstractC22676k.m65750j(previousStraps, "previousStraps");
        return new UserStraps(lastSeenStrap, orderedStrap, previousStraps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStraps)) {
            return false;
        }
        UserStraps userStraps = (UserStraps) other;
        return AbstractC22676k.m65745e(this.lastSeenStrap, userStraps.lastSeenStrap) && AbstractC22676k.m65745e(this.orderedStrap, userStraps.orderedStrap) && AbstractC22676k.m65745e(this.previousStraps, userStraps.previousStraps);
    }

    public final Strap getLastSeenStrap() {
        return this.lastSeenStrap;
    }

    public final Strap getOrderedStrap() {
        return this.orderedStrap;
    }

    public final List<Strap> getPreviousStraps() {
        return this.previousStraps;
    }

    public int hashCode() {
        Strap strap = this.lastSeenStrap;
        int iHashCode = (strap == null ? 0 : strap.hashCode()) * 31;
        Strap strap2 = this.orderedStrap;
        return this.previousStraps.hashCode() + ((iHashCode + (strap2 != null ? strap2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Strap strap = this.lastSeenStrap;
        Strap strap2 = this.orderedStrap;
        List<Strap> list = this.previousStraps;
        StringBuilder sb4 = new StringBuilder("UserStraps(lastSeenStrap=");
        sb4.append(strap);
        sb4.append(", orderedStrap=");
        sb4.append(strap2);
        sb4.append(", previousStraps=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
