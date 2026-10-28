package com.whoop.nativestore.pdp.domain.model;

import com.whoop.design.models.items.AnnotatedTextModel;
import com.whoop.design.models.items.AnnotatedTextModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionEntry;", "", "", "title", "Lcom/whoop/design/models/items/AnnotatedTextModel;", "annotatedText", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/AnnotatedTextModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/AnnotatedTextModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionEntry;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/AnnotatedTextModel;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/AnnotatedTextModel;)Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionEntry;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/design/models/items/AnnotatedTextModel;", "getAnnotatedText", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductAccordionEntry {
    private final AnnotatedTextModel annotatedText;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AnnotatedTextModel.$stable;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.ProductAccordionEntry$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionEntry$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionEntry;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductAccordionEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductAccordionEntry() {
        this((String) null, (AnnotatedTextModel) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ProductAccordionEntry copy$default(ProductAccordionEntry productAccordionEntry, String str, AnnotatedTextModel annotatedTextModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productAccordionEntry.title;
        }
        if ((i13 & 2) != 0) {
            annotatedTextModel = productAccordionEntry.annotatedText;
        }
        return productAccordionEntry.copy(str, annotatedTextModel);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ProductAccordionEntry self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.annotatedText, new AnnotatedTextModel(""))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, AnnotatedTextModel$$serializer.INSTANCE, self.annotatedText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnnotatedTextModel getAnnotatedText() {
        return this.annotatedText;
    }

    public final ProductAccordionEntry copy(String title, AnnotatedTextModel annotatedText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(annotatedText, "annotatedText");
        return new ProductAccordionEntry(title, annotatedText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductAccordionEntry)) {
            return false;
        }
        ProductAccordionEntry productAccordionEntry = (ProductAccordionEntry) other;
        return AbstractC22676k.m65745e(this.title, productAccordionEntry.title) && AbstractC22676k.m65745e(this.annotatedText, productAccordionEntry.annotatedText);
    }

    public final AnnotatedTextModel getAnnotatedText() {
        return this.annotatedText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.annotatedText.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "ProductAccordionEntry(title=" + this.title + ", annotatedText=" + this.annotatedText + ")";
    }

    public /* synthetic */ ProductAccordionEntry(int i13, String str, AnnotatedTextModel annotatedTextModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.annotatedText = new AnnotatedTextModel("");
        } else {
            this.annotatedText = annotatedTextModel;
        }
    }

    public ProductAccordionEntry(String title, AnnotatedTextModel annotatedText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(annotatedText, "annotatedText");
        this.title = title;
        this.annotatedText = annotatedText;
    }

    public /* synthetic */ ProductAccordionEntry(String str, AnnotatedTextModel annotatedTextModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? new AnnotatedTextModel("") : annotatedTextModel);
    }
}
