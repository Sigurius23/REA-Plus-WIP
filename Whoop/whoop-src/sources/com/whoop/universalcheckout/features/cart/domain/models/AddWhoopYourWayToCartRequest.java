package com.whoop.universalcheckout.features.cart.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJX\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00066"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;", "", "", "cartId", "wywSku", "bandSku", "claspSku", "hookSku", "fastLinkSku", "storeDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCartId", "getWywSku", "getBandSku", "getClaspSku", "getHookSku", "getFastLinkSku", "getStoreDomain", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AddWhoopYourWayToCartRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String bandSku;
    private final String cartId;
    private final String claspSku;
    private final String fastLinkSku;
    private final String hookSku;
    private final String storeDomain;
    private final String wywSku;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.models.AddWhoopYourWayToCartRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AddWhoopYourWayToCartRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AddWhoopYourWayToCartRequest(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, AddWhoopYourWayToCartRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.cartId = str;
        this.wywSku = str2;
        this.bandSku = str3;
        this.claspSku = str4;
        this.hookSku = str5;
        this.fastLinkSku = str6;
        this.storeDomain = str7;
    }

    public static /* synthetic */ AddWhoopYourWayToCartRequest copy$default(AddWhoopYourWayToCartRequest addWhoopYourWayToCartRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = addWhoopYourWayToCartRequest.cartId;
        }
        if ((i13 & 2) != 0) {
            str2 = addWhoopYourWayToCartRequest.wywSku;
        }
        if ((i13 & 4) != 0) {
            str3 = addWhoopYourWayToCartRequest.bandSku;
        }
        if ((i13 & 8) != 0) {
            str4 = addWhoopYourWayToCartRequest.claspSku;
        }
        if ((i13 & 16) != 0) {
            str5 = addWhoopYourWayToCartRequest.hookSku;
        }
        if ((i13 & 32) != 0) {
            str6 = addWhoopYourWayToCartRequest.fastLinkSku;
        }
        if ((i13 & 64) != 0) {
            str7 = addWhoopYourWayToCartRequest.storeDomain;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return addWhoopYourWayToCartRequest.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(AddWhoopYourWayToCartRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.cartId);
        output.encodeStringElement(serialDesc, 1, self.wywSku);
        output.encodeStringElement(serialDesc, 2, self.bandSku);
        output.encodeStringElement(serialDesc, 3, self.claspSku);
        output.encodeStringElement(serialDesc, 4, self.hookSku);
        output.encodeStringElement(serialDesc, 5, self.fastLinkSku);
        output.encodeStringElement(serialDesc, 6, self.storeDomain);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWywSku() {
        return this.wywSku;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBandSku() {
        return this.bandSku;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClaspSku() {
        return this.claspSku;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHookSku() {
        return this.hookSku;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFastLinkSku() {
        return this.fastLinkSku;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStoreDomain() {
        return this.storeDomain;
    }

    public final AddWhoopYourWayToCartRequest copy(String cartId, String wywSku, String bandSku, String claspSku, String hookSku, String fastLinkSku, String storeDomain) {
        AbstractC22676k.m65750j(wywSku, "wywSku");
        AbstractC22676k.m65750j(bandSku, "bandSku");
        AbstractC22676k.m65750j(claspSku, "claspSku");
        AbstractC22676k.m65750j(hookSku, "hookSku");
        AbstractC22676k.m65750j(fastLinkSku, "fastLinkSku");
        AbstractC22676k.m65750j(storeDomain, "storeDomain");
        return new AddWhoopYourWayToCartRequest(cartId, wywSku, bandSku, claspSku, hookSku, fastLinkSku, storeDomain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddWhoopYourWayToCartRequest)) {
            return false;
        }
        AddWhoopYourWayToCartRequest addWhoopYourWayToCartRequest = (AddWhoopYourWayToCartRequest) other;
        return AbstractC22676k.m65745e(this.cartId, addWhoopYourWayToCartRequest.cartId) && AbstractC22676k.m65745e(this.wywSku, addWhoopYourWayToCartRequest.wywSku) && AbstractC22676k.m65745e(this.bandSku, addWhoopYourWayToCartRequest.bandSku) && AbstractC22676k.m65745e(this.claspSku, addWhoopYourWayToCartRequest.claspSku) && AbstractC22676k.m65745e(this.hookSku, addWhoopYourWayToCartRequest.hookSku) && AbstractC22676k.m65745e(this.fastLinkSku, addWhoopYourWayToCartRequest.fastLinkSku) && AbstractC22676k.m65745e(this.storeDomain, addWhoopYourWayToCartRequest.storeDomain);
    }

    public final String getBandSku() {
        return this.bandSku;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final String getClaspSku() {
        return this.claspSku;
    }

    public final String getFastLinkSku() {
        return this.fastLinkSku;
    }

    public final String getHookSku() {
        return this.hookSku;
    }

    public final String getStoreDomain() {
        return this.storeDomain;
    }

    public final String getWywSku() {
        return this.wywSku;
    }

    public int hashCode() {
        String str = this.cartId;
        return this.storeDomain.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.wywSku), 31, this.bandSku), 31, this.claspSku), 31, this.hookSku), 31, this.fastLinkSku);
    }

    public String toString() {
        String str = this.cartId;
        String str2 = this.wywSku;
        String str3 = this.bandSku;
        String str4 = this.claspSku;
        String str5 = this.hookSku;
        String str6 = this.fastLinkSku;
        String str7 = this.storeDomain;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AddWhoopYourWayToCartRequest(cartId=", str, ", wywSku=", str2, ", bandSku=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", claspSku=", str4, ", hookSku=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", fastLinkSku=", str6, ", storeDomain=");
        return AbstractC25012a.m73376i(str7, ")", sbM32001t);
    }

    public AddWhoopYourWayToCartRequest(String str, String wywSku, String bandSku, String claspSku, String hookSku, String fastLinkSku, String storeDomain) {
        AbstractC22676k.m65750j(wywSku, "wywSku");
        AbstractC22676k.m65750j(bandSku, "bandSku");
        AbstractC22676k.m65750j(claspSku, "claspSku");
        AbstractC22676k.m65750j(hookSku, "hookSku");
        AbstractC22676k.m65750j(fastLinkSku, "fastLinkSku");
        AbstractC22676k.m65750j(storeDomain, "storeDomain");
        this.cartId = str;
        this.wywSku = wywSku;
        this.bandSku = bandSku;
        this.claspSku = claspSku;
        this.hookSku = hookSku;
        this.fastLinkSku = fastLinkSku;
        this.storeDomain = storeDomain;
    }
}
