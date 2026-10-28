package com.whoop.nativestore.pdp.domain.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;", "", "", "initiallySelectedSku", "", "initialVariantHasStock", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInitiallySelectedSku", "Ljava/lang/Boolean;", "getInitialVariantHasStock", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PackItemProductMetadata {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean initialVariantHasStock;
    private final String initiallySelectedSku;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.PackItemProductMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PackItemProductMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PackItemProductMetadata(int i13, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, PackItemProductMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.initiallySelectedSku = str;
        if ((i13 & 2) == 0) {
            this.initialVariantHasStock = null;
        } else {
            this.initialVariantHasStock = bool;
        }
    }

    public static /* synthetic */ PackItemProductMetadata copy$default(PackItemProductMetadata packItemProductMetadata, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = packItemProductMetadata.initiallySelectedSku;
        }
        if ((i13 & 2) != 0) {
            bool = packItemProductMetadata.initialVariantHasStock;
        }
        return packItemProductMetadata.copy(str, bool);
    }

    public static final /* synthetic */ void write$Self$native_store_release(PackItemProductMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.initiallySelectedSku);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.initialVariantHasStock == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.initialVariantHasStock);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInitiallySelectedSku() {
        return this.initiallySelectedSku;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getInitialVariantHasStock() {
        return this.initialVariantHasStock;
    }

    public final PackItemProductMetadata copy(String initiallySelectedSku, Boolean initialVariantHasStock) {
        AbstractC22676k.m65750j(initiallySelectedSku, "initiallySelectedSku");
        return new PackItemProductMetadata(initiallySelectedSku, initialVariantHasStock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackItemProductMetadata)) {
            return false;
        }
        PackItemProductMetadata packItemProductMetadata = (PackItemProductMetadata) other;
        return AbstractC22676k.m65745e(this.initiallySelectedSku, packItemProductMetadata.initiallySelectedSku) && AbstractC22676k.m65745e(this.initialVariantHasStock, packItemProductMetadata.initialVariantHasStock);
    }

    public final Boolean getInitialVariantHasStock() {
        return this.initialVariantHasStock;
    }

    public final String getInitiallySelectedSku() {
        return this.initiallySelectedSku;
    }

    public int hashCode() {
        int iHashCode = this.initiallySelectedSku.hashCode() * 31;
        Boolean bool = this.initialVariantHasStock;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "PackItemProductMetadata(initiallySelectedSku=" + this.initiallySelectedSku + ", initialVariantHasStock=" + this.initialVariantHasStock + ")";
    }

    public PackItemProductMetadata(String initiallySelectedSku, Boolean bool) {
        AbstractC22676k.m65750j(initiallySelectedSku, "initiallySelectedSku");
        this.initiallySelectedSku = initiallySelectedSku;
        this.initialVariantHasStock = bool;
    }

    public /* synthetic */ PackItemProductMetadata(String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : bool);
    }
}
