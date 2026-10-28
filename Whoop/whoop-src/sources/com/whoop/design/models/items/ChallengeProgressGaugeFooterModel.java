package com.whoop.design.models.items;

import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.MarkdownTextModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;", "", "", "icon", "Lcom/whoop/design/models/MarkdownTextModel;", "primaryText", "secondaryText", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/MarkdownTextModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/MarkdownTextModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/MarkdownTextModel;", "component3", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/MarkdownTextModel;)Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lcom/whoop/design/models/MarkdownTextModel;", "getPrimaryText", "getSecondaryText", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChallengeProgressGaugeFooterModel {
    private final String icon;
    private final MarkdownTextModel primaryText;
    private final MarkdownTextModel secondaryText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChallengeProgressGaugeFooterModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChallengeProgressGaugeFooterModel(int i13, String str, MarkdownTextModel markdownTextModel, MarkdownTextModel markdownTextModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, ChallengeProgressGaugeFooterModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        this.primaryText = markdownTextModel;
        if ((i13 & 4) == 0) {
            this.secondaryText = null;
        } else {
            this.secondaryText = markdownTextModel2;
        }
    }

    public static /* synthetic */ ChallengeProgressGaugeFooterModel copy$default(ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel, String str, MarkdownTextModel markdownTextModel, MarkdownTextModel markdownTextModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = challengeProgressGaugeFooterModel.icon;
        }
        if ((i13 & 2) != 0) {
            markdownTextModel = challengeProgressGaugeFooterModel.primaryText;
        }
        if ((i13 & 4) != 0) {
            markdownTextModel2 = challengeProgressGaugeFooterModel.secondaryText;
        }
        return challengeProgressGaugeFooterModel.copy(str, markdownTextModel, markdownTextModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ChallengeProgressGaugeFooterModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.icon);
        }
        MarkdownTextModel$$serializer markdownTextModel$$serializer = MarkdownTextModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, markdownTextModel$$serializer, self.primaryText);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.secondaryText == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, markdownTextModel$$serializer, self.secondaryText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarkdownTextModel getPrimaryText() {
        return this.primaryText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarkdownTextModel getSecondaryText() {
        return this.secondaryText;
    }

    public final ChallengeProgressGaugeFooterModel copy(String icon, MarkdownTextModel primaryText, MarkdownTextModel secondaryText) {
        AbstractC22676k.m65750j(primaryText, "primaryText");
        return new ChallengeProgressGaugeFooterModel(icon, primaryText, secondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeProgressGaugeFooterModel)) {
            return false;
        }
        ChallengeProgressGaugeFooterModel challengeProgressGaugeFooterModel = (ChallengeProgressGaugeFooterModel) other;
        return AbstractC22676k.m65745e(this.icon, challengeProgressGaugeFooterModel.icon) && AbstractC22676k.m65745e(this.primaryText, challengeProgressGaugeFooterModel.primaryText) && AbstractC22676k.m65745e(this.secondaryText, challengeProgressGaugeFooterModel.secondaryText);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final MarkdownTextModel getPrimaryText() {
        return this.primaryText;
    }

    public final MarkdownTextModel getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (this.primaryText.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        MarkdownTextModel markdownTextModel = this.secondaryText;
        return iHashCode + (markdownTextModel != null ? markdownTextModel.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeProgressGaugeFooterModel(icon=" + this.icon + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
    }

    public ChallengeProgressGaugeFooterModel(String str, MarkdownTextModel primaryText, MarkdownTextModel markdownTextModel) {
        AbstractC22676k.m65750j(primaryText, "primaryText");
        this.icon = str;
        this.primaryText = primaryText;
        this.secondaryText = markdownTextModel;
    }

    public /* synthetic */ ChallengeProgressGaugeFooterModel(String str, MarkdownTextModel markdownTextModel, MarkdownTextModel markdownTextModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, markdownTextModel, (i13 & 4) != 0 ? null : markdownTextModel2);
    }
}
