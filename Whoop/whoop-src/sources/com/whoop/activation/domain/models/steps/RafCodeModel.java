package com.whoop.activation.domain.models.steps;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001c¨\u00062"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/RafCodeModel;", "", "Lcom/whoop/design/util/TextResource;", "code", "", "imageUrl", "ctaText", "sharedCtaText", "sharedText", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/RafCodeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/activation/domain/models/steps/RafCodeModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getCode", "Ljava/lang/String;", "getImageUrl", "getCtaText", "getSharedCtaText", "getSharedText", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RafCodeModel {
    private final TextResource code;
    private final TextResource ctaText;
    private final String imageUrl;
    private final TextResource sharedCtaText;
    private final String sharedText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/RafCodeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/RafCodeModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RafCodeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RafCodeModel(int i13, TextResource textResource, String str, TextResource textResource2, TextResource textResource3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, RafCodeModel$$serializer.INSTANCE.getDescriptor());
        }
        this.code = textResource;
        this.imageUrl = str;
        this.ctaText = textResource2;
        this.sharedCtaText = textResource3;
        this.sharedText = str2;
    }

    public static /* synthetic */ RafCodeModel copy$default(RafCodeModel rafCodeModel, TextResource textResource, String str, TextResource textResource2, TextResource textResource3, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = rafCodeModel.code;
        }
        if ((i13 & 2) != 0) {
            str = rafCodeModel.imageUrl;
        }
        if ((i13 & 4) != 0) {
            textResource2 = rafCodeModel.ctaText;
        }
        if ((i13 & 8) != 0) {
            textResource3 = rafCodeModel.sharedCtaText;
        }
        if ((i13 & 16) != 0) {
            str2 = rafCodeModel.sharedText;
        }
        String str3 = str2;
        TextResource textResource4 = textResource2;
        return rafCodeModel.copy(textResource, str, textResource4, textResource3, str3);
    }

    public static final /* synthetic */ void write$Self$activation_release(RafCodeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.code);
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.ctaText);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.sharedCtaText);
        output.encodeStringElement(serialDesc, 4, self.sharedText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getSharedCtaText() {
        return this.sharedCtaText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSharedText() {
        return this.sharedText;
    }

    public final RafCodeModel copy(TextResource code, String imageUrl, TextResource ctaText, TextResource sharedCtaText, String sharedText) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(sharedCtaText, "sharedCtaText");
        AbstractC22676k.m65750j(sharedText, "sharedText");
        return new RafCodeModel(code, imageUrl, ctaText, sharedCtaText, sharedText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RafCodeModel)) {
            return false;
        }
        RafCodeModel rafCodeModel = (RafCodeModel) other;
        return AbstractC22676k.m65745e(this.code, rafCodeModel.code) && AbstractC22676k.m65745e(this.imageUrl, rafCodeModel.imageUrl) && AbstractC22676k.m65745e(this.ctaText, rafCodeModel.ctaText) && AbstractC22676k.m65745e(this.sharedCtaText, rafCodeModel.sharedCtaText) && AbstractC22676k.m65745e(this.sharedText, rafCodeModel.sharedText);
    }

    public final TextResource getCode() {
        return this.code;
    }

    public final TextResource getCtaText() {
        return this.ctaText;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final TextResource getSharedCtaText() {
        return this.sharedCtaText;
    }

    public final String getSharedText() {
        return this.sharedText;
    }

    public int hashCode() {
        return this.sharedText.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.code.hashCode() * 31, 31, this.imageUrl), this.ctaText, 31), this.sharedCtaText, 31);
    }

    public String toString() {
        TextResource textResource = this.code;
        String str = this.imageUrl;
        TextResource textResource2 = this.ctaText;
        TextResource textResource3 = this.sharedCtaText;
        String str2 = this.sharedText;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("RafCodeModel(code=", textResource, ", imageUrl=", str, ", ctaText=");
        AbstractC30007c.m91855y(sbM91845o, textResource2, ", sharedCtaText=", textResource3, ", sharedText=");
        return AbstractC25012a.m73376i(str2, ")", sbM91845o);
    }

    public RafCodeModel(TextResource code, String imageUrl, TextResource ctaText, TextResource sharedCtaText, String sharedText) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(sharedCtaText, "sharedCtaText");
        AbstractC22676k.m65750j(sharedText, "sharedText");
        this.code = code;
        this.imageUrl = imageUrl;
        this.ctaText = ctaText;
        this.sharedCtaText = sharedCtaText;
        this.sharedText = sharedText;
    }
}
