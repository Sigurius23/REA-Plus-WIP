package com.whoop.puffin.sync;

import a52.C0397d;
import f52.C14104b;
import f52.C14109g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.puffin.sync.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0007\n\u000b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/puffin/sync/e;", "", "Lf52/g;", "a", "()Lf52/g;", "burstData", "Lf52/b;", "c", "()Lf52/b;", "metadata", "b", "d", "Lcom/whoop/puffin/sync/e$b;", "Lcom/whoop/puffin/sync/e$c;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC9822e {

    /* JADX INFO: renamed from: com.whoop.puffin.sync.e$a */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/puffin/sync/e$a;", "Lcom/whoop/puffin/sync/e$c;", "Lf52/g;", "burstData", "Lf52/b;", "metadata", "La52/d;", "failurePacket", "<init>", "(Lf52/g;Lf52/b;La52/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf52/g;", "()Lf52/g;", "b", "Lf52/b;", "c", "()Lf52/b;", "La52/d;", "()La52/d;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14109g burstData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14104b metadata;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C0397d failurePacket;

        public a(C14109g burstData, C14104b metadata, C0397d failurePacket) {
            AbstractC22676k.m65750j(burstData, "burstData");
            AbstractC22676k.m65750j(metadata, "metadata");
            AbstractC22676k.m65750j(failurePacket, "failurePacket");
            this.burstData = burstData;
            this.metadata = metadata;
            this.failurePacket = failurePacket;
        }

        @Override // com.whoop.puffin.sync.InterfaceC9822e
        /* JADX INFO: renamed from: a, reason: from getter */
        public C14109g getBurstData() {
            return this.burstData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C0397d getFailurePacket() {
            return this.failurePacket;
        }

        @Override // com.whoop.puffin.sync.InterfaceC9822e
        /* JADX INFO: renamed from: c, reason: from getter */
        public C14104b getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.burstData, aVar.burstData) && AbstractC22676k.m65745e(this.metadata, aVar.metadata) && AbstractC22676k.m65745e(this.failurePacket, aVar.failurePacket);
        }

        public int hashCode() {
            return this.failurePacket.hashCode() + ((this.metadata.hashCode() + (this.burstData.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "BurstState.FailedValidation(" + getBurstData() + ", metadata=" + getMetadata() + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.e$c */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/puffin/sync/e$c;", "Lcom/whoop/puffin/sync/e;", "Lcom/whoop/puffin/sync/e$a;", "Lcom/whoop/puffin/sync/e$d;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface c extends InterfaceC9822e {
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.e$d */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/puffin/sync/e$d;", "Lcom/whoop/puffin/sync/e$c;", "Lf52/g;", "burstData", "Lf52/b;", "metadata", "La52/d;", "successPacket", "<init>", "(Lf52/g;Lf52/b;La52/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf52/g;", "()Lf52/g;", "b", "Lf52/b;", "c", "()Lf52/b;", "La52/d;", "()La52/d;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14109g burstData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14104b metadata;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C0397d successPacket;

        public d(C14109g burstData, C14104b metadata, C0397d successPacket) {
            AbstractC22676k.m65750j(burstData, "burstData");
            AbstractC22676k.m65750j(metadata, "metadata");
            AbstractC22676k.m65750j(successPacket, "successPacket");
            this.burstData = burstData;
            this.metadata = metadata;
            this.successPacket = successPacket;
        }

        @Override // com.whoop.puffin.sync.InterfaceC9822e
        /* JADX INFO: renamed from: a, reason: from getter */
        public C14109g getBurstData() {
            return this.burstData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C0397d getSuccessPacket() {
            return this.successPacket;
        }

        @Override // com.whoop.puffin.sync.InterfaceC9822e
        /* JADX INFO: renamed from: c, reason: from getter */
        public C14104b getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.burstData, dVar.burstData) && AbstractC22676k.m65745e(this.metadata, dVar.metadata) && AbstractC22676k.m65745e(this.successPacket, dVar.successPacket);
        }

        public int hashCode() {
            return this.successPacket.hashCode() + ((this.metadata.hashCode() + (this.burstData.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "BurstState.Validated(" + getBurstData() + ", metadata=" + getMetadata() + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    C14109g getBurstData();

    /* JADX INFO: renamed from: c */
    C14104b getMetadata();

    /* JADX INFO: renamed from: com.whoop.puffin.sync.e$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/puffin/sync/e$b;", "Lcom/whoop/puffin/sync/e;", "Lf52/g;", "burstData", "Lf52/b;", "metadata", "<init>", "(Lf52/g;Lf52/b;)V", "", "toString", "()Ljava/lang/String;", "b", "(Lf52/g;Lf52/b;)Lcom/whoop/puffin/sync/e$b;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf52/g;", "()Lf52/g;", "Lf52/b;", "c", "()Lf52/b;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC9822e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14109g burstData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14104b metadata;

        public b(C14109g burstData, C14104b metadata) {
            AbstractC22676k.m65750j(burstData, "burstData");
            AbstractC22676k.m65750j(metadata, "metadata");
            this.burstData = burstData;
            this.metadata = metadata;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ b m23689d(b bVar, C14109g c14109g, C14104b c14104b, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c14109g = bVar.burstData;
            }
            if ((i13 & 2) != 0) {
                c14104b = bVar.metadata;
            }
            return bVar.m23690b(c14109g, c14104b);
        }

        @Override // com.whoop.puffin.sync.InterfaceC9822e
        /* JADX INFO: renamed from: a, reason: from getter */
        public C14109g getBurstData() {
            return this.burstData;
        }

        /* JADX INFO: renamed from: b */
        public final b m23690b(C14109g burstData, C14104b metadata) {
            AbstractC22676k.m65750j(burstData, "burstData");
            AbstractC22676k.m65750j(metadata, "metadata");
            return new b(burstData, metadata);
        }

        @Override // com.whoop.puffin.sync.InterfaceC9822e
        /* JADX INFO: renamed from: c, reason: from getter */
        public C14104b getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.burstData, bVar.burstData) && AbstractC22676k.m65745e(this.metadata, bVar.metadata);
        }

        public int hashCode() {
            return this.metadata.hashCode() + (this.burstData.hashCode() * 31);
        }

        public String toString() {
            return "BurstState.Running(" + getBurstData() + ", metadata=" + getMetadata() + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ b(C14109g c14109g, C14104b c14104b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i13 & 1) != 0) {
                c14109g = new C14109g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
            if ((i13 & 2) != 0) {
                c14104b = new C14104b(null, (byte) 0, null, null, 15, null);
            }
            this(c14109g, c14104b);
        }
    }
}
