package com.whoop.nativestore.pdp.domain.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0019¨\u0006/"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayComponentMetadata;", "", "", "initiallySelectedProductKey", "initiallySelectedVariantKey", "", "initialVariantHasStock", "displayLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayComponentMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayComponentMetadata;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInitiallySelectedProductKey", "getInitiallySelectedVariantKey", "Ljava/lang/Boolean;", "getInitialVariantHasStock", "getDisplayLabel", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopYourWayComponentMetadata {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String displayLabel;
    private final Boolean initialVariantHasStock;
    private final String initiallySelectedProductKey;
    private final String initiallySelectedVariantKey;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.WhoopYourWayComponentMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayComponentMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayComponentMetadata;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopYourWayComponentMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WhoopYourWayComponentMetadata(int i13, String str, String str2, Boolean bool, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, WhoopYourWayComponentMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.initiallySelectedProductKey = str;
        this.initiallySelectedVariantKey = str2;
        if ((i13 & 4) == 0) {
            this.initialVariantHasStock = null;
        } else {
            this.initialVariantHasStock = bool;
        }
        if ((i13 & 8) == 0) {
            this.displayLabel = null;
        } else {
            this.displayLabel = str3;
        }
    }

    public static /* synthetic */ WhoopYourWayComponentMetadata copy$default(WhoopYourWayComponentMetadata whoopYourWayComponentMetadata, String str, String str2, Boolean bool, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = whoopYourWayComponentMetadata.initiallySelectedProductKey;
        }
        if ((i13 & 2) != 0) {
            str2 = whoopYourWayComponentMetadata.initiallySelectedVariantKey;
        }
        if ((i13 & 4) != 0) {
            bool = whoopYourWayComponentMetadata.initialVariantHasStock;
        }
        if ((i13 & 8) != 0) {
            str3 = whoopYourWayComponentMetadata.displayLabel;
        }
        return whoopYourWayComponentMetadata.copy(str, str2, bool, str3);
    }

    public static final /* synthetic */ void write$Self$native_store_release(WhoopYourWayComponentMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.initiallySelectedProductKey);
        output.encodeStringElement(serialDesc, 1, self.initiallySelectedVariantKey);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.initialVariantHasStock != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.initialVariantHasStock);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.displayLabel == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.displayLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInitiallySelectedProductKey() {
        return this.initiallySelectedProductKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitiallySelectedVariantKey() {
        return this.initiallySelectedVariantKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getInitialVariantHasStock() {
        return this.initialVariantHasStock;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final WhoopYourWayComponentMetadata copy(String initiallySelectedProductKey, String initiallySelectedVariantKey, Boolean initialVariantHasStock, String displayLabel) {
        AbstractC22676k.m65750j(initiallySelectedProductKey, "initiallySelectedProductKey");
        AbstractC22676k.m65750j(initiallySelectedVariantKey, "initiallySelectedVariantKey");
        return new WhoopYourWayComponentMetadata(initiallySelectedProductKey, initiallySelectedVariantKey, initialVariantHasStock, displayLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopYourWayComponentMetadata)) {
            return false;
        }
        WhoopYourWayComponentMetadata whoopYourWayComponentMetadata = (WhoopYourWayComponentMetadata) other;
        return AbstractC22676k.m65745e(this.initiallySelectedProductKey, whoopYourWayComponentMetadata.initiallySelectedProductKey) && AbstractC22676k.m65745e(this.initiallySelectedVariantKey, whoopYourWayComponentMetadata.initiallySelectedVariantKey) && AbstractC22676k.m65745e(this.initialVariantHasStock, whoopYourWayComponentMetadata.initialVariantHasStock) && AbstractC22676k.m65745e(this.displayLabel, whoopYourWayComponentMetadata.displayLabel);
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final Boolean getInitialVariantHasStock() {
        return this.initialVariantHasStock;
    }

    public final String getInitiallySelectedProductKey() {
        return this.initiallySelectedProductKey;
    }

    public final String getInitiallySelectedVariantKey() {
        return this.initiallySelectedVariantKey;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.initiallySelectedProductKey.hashCode() * 31, 31, this.initiallySelectedVariantKey);
        Boolean bool = this.initialVariantHasStock;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.displayLabel;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.initiallySelectedProductKey;
        String str2 = this.initiallySelectedVariantKey;
        Boolean bool = this.initialVariantHasStock;
        String str3 = this.displayLabel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WhoopYourWayComponentMetadata(initiallySelectedProductKey=", str, ", initiallySelectedVariantKey=", str2, ", initialVariantHasStock=");
        sbM32001t.append(bool);
        sbM32001t.append(", displayLabel=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public WhoopYourWayComponentMetadata(String initiallySelectedProductKey, String initiallySelectedVariantKey, Boolean bool, String str) {
        AbstractC22676k.m65750j(initiallySelectedProductKey, "initiallySelectedProductKey");
        AbstractC22676k.m65750j(initiallySelectedVariantKey, "initiallySelectedVariantKey");
        this.initiallySelectedProductKey = initiallySelectedProductKey;
        this.initiallySelectedVariantKey = initiallySelectedVariantKey;
        this.initialVariantHasStock = bool;
        this.displayLabel = str;
    }

    public /* synthetic */ WhoopYourWayComponentMetadata(String str, String str2, Boolean bool, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : str3);
    }
}
