package com.whoop.universalcheckout.features.checkout.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/HeaderModel;", "header", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;", "previewTileContent", "<init>", "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/HeaderModel;", "component2", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;", "copy", "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/HeaderModel;", "getHeader", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;", "getPreviewTileContent", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PreviewTileModel implements DesignSystemModel {
    private final HeaderModel header;
    private final PreviewTileContent previewTileContent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | HeaderModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PreviewTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PreviewTileModel(int i13, HeaderModel headerModel, PreviewTileContent previewTileContent, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, PreviewTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = headerModel;
        this.previewTileContent = previewTileContent;
    }

    public static /* synthetic */ PreviewTileModel copy$default(PreviewTileModel previewTileModel, HeaderModel headerModel, PreviewTileContent previewTileContent, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            headerModel = previewTileModel.header;
        }
        if ((i13 & 2) != 0) {
            previewTileContent = previewTileModel.previewTileContent;
        }
        return previewTileModel.copy(headerModel, previewTileContent);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(PreviewTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, HeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 1, PreviewTileContent$$serializer.INSTANCE, self.previewTileContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PreviewTileContent getPreviewTileContent() {
        return this.previewTileContent;
    }

    public final PreviewTileModel copy(HeaderModel header, PreviewTileContent previewTileContent) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(previewTileContent, "previewTileContent");
        return new PreviewTileModel(header, previewTileContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewTileModel)) {
            return false;
        }
        PreviewTileModel previewTileModel = (PreviewTileModel) other;
        return AbstractC22676k.m65745e(this.header, previewTileModel.header) && AbstractC22676k.m65745e(this.previewTileContent, previewTileModel.previewTileContent);
    }

    public final HeaderModel getHeader() {
        return this.header;
    }

    public final PreviewTileContent getPreviewTileContent() {
        return this.previewTileContent;
    }

    public int hashCode() {
        return this.previewTileContent.hashCode() + (this.header.hashCode() * 31);
    }

    public String toString() {
        return "PreviewTileModel(header=" + this.header + ", previewTileContent=" + this.previewTileContent + ")";
    }

    public PreviewTileModel(HeaderModel header, PreviewTileContent previewTileContent) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(previewTileContent, "previewTileContent");
        this.header = header;
        this.previewTileContent = previewTileContent;
    }
}
