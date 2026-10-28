package com.whoop.nativestore.pdp.domain.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductRating;", "", "", "value", "", "numberOfReviews", "<init>", "(DLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/ProductRating;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Ljava/lang/String;", "copy", "(DLjava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/ProductRating;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getValue", "Ljava/lang/String;", "getNumberOfReviews", "getNumberOfReviews$annotations", "()V", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductRating {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String numberOfReviews;
    private final double value;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.ProductRating$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductRating$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/ProductRating;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductRating$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProductRating() {
        this(0.0d, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProductRating copy$default(ProductRating productRating, double d3, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = productRating.value;
        }
        if ((i13 & 2) != 0) {
            str = productRating.numberOfReviews;
        }
        return productRating.copy(d3, str);
    }

    @InterfaceC37143h("num_reviews")
    public static /* synthetic */ void getNumberOfReviews$annotations() {
    }

    public static final /* synthetic */ void write$Self$native_store_release(ProductRating self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Double.compare(self.value, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 0, self.value);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.numberOfReviews, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.numberOfReviews);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumberOfReviews() {
        return this.numberOfReviews;
    }

    public final ProductRating copy(double value, String numberOfReviews) {
        AbstractC22676k.m65750j(numberOfReviews, "numberOfReviews");
        return new ProductRating(value, numberOfReviews);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductRating)) {
            return false;
        }
        ProductRating productRating = (ProductRating) other;
        return Double.compare(this.value, productRating.value) == 0 && AbstractC22676k.m65745e(this.numberOfReviews, productRating.numberOfReviews);
    }

    public final String getNumberOfReviews() {
        return this.numberOfReviews;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.numberOfReviews.hashCode() + (Double.hashCode(this.value) * 31);
    }

    public String toString() {
        return "ProductRating(value=" + this.value + ", numberOfReviews=" + this.numberOfReviews + ")";
    }

    public ProductRating(double d3, String numberOfReviews) {
        AbstractC22676k.m65750j(numberOfReviews, "numberOfReviews");
        this.value = d3;
        this.numberOfReviews = numberOfReviews;
    }

    public /* synthetic */ ProductRating(int i13, double d3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.value = (i13 & 1) == 0 ? 0.0d : d3;
        if ((i13 & 2) == 0) {
            this.numberOfReviews = "";
        } else {
            this.numberOfReviews = str;
        }
    }

    public /* synthetic */ ProductRating(double d3, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0d : d3, (i13 & 2) != 0 ? "" : str);
    }
}
