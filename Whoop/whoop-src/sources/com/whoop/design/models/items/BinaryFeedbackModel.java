package com.whoop.design.models.items;

import com.whoop.design.models.BinaryIconModel;
import com.whoop.design.models.BinaryIconModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ:\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/BinaryFeedbackModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "text", "selection", "Lcom/whoop/design/models/BinaryIconModel;", "binaryIconPositive", "binaryIconNegative", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/BinaryIconModel;Lcom/whoop/design/models/BinaryIconModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/BinaryIconModel;Lcom/whoop/design/models/BinaryIconModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BinaryFeedbackModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/BinaryIconModel;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/BinaryIconModel;Lcom/whoop/design/models/BinaryIconModel;)Lcom/whoop/design/models/items/BinaryFeedbackModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getSelection", "Lcom/whoop/design/models/BinaryIconModel;", "getBinaryIconPositive", "getBinaryIconNegative", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BinaryFeedbackModel implements DesignSystemModel {
    private final BinaryIconModel binaryIconNegative;
    private final BinaryIconModel binaryIconPositive;
    private final String selection;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BinaryFeedbackModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BinaryFeedbackModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BinaryFeedbackModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BinaryFeedbackModel(int i13, String str, String str2, BinaryIconModel binaryIconModel, BinaryIconModel binaryIconModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i13 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 14, BinaryFeedbackModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        this.selection = str2;
        this.binaryIconPositive = binaryIconModel;
        this.binaryIconNegative = binaryIconModel2;
    }

    public static /* synthetic */ BinaryFeedbackModel copy$default(BinaryFeedbackModel binaryFeedbackModel, String str, String str2, BinaryIconModel binaryIconModel, BinaryIconModel binaryIconModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = binaryFeedbackModel.text;
        }
        if ((i13 & 2) != 0) {
            str2 = binaryFeedbackModel.selection;
        }
        if ((i13 & 4) != 0) {
            binaryIconModel = binaryFeedbackModel.binaryIconPositive;
        }
        if ((i13 & 8) != 0) {
            binaryIconModel2 = binaryFeedbackModel.binaryIconNegative;
        }
        return binaryFeedbackModel.copy(str, str2, binaryIconModel, binaryIconModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BinaryFeedbackModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.text);
        }
        output.encodeStringElement(serialDesc, 1, self.selection);
        BinaryIconModel$$serializer binaryIconModel$$serializer = BinaryIconModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, binaryIconModel$$serializer, self.binaryIconPositive);
        output.encodeSerializableElement(serialDesc, 3, binaryIconModel$$serializer, self.binaryIconNegative);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BinaryIconModel getBinaryIconPositive() {
        return this.binaryIconPositive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BinaryIconModel getBinaryIconNegative() {
        return this.binaryIconNegative;
    }

    public final BinaryFeedbackModel copy(String text, String selection, BinaryIconModel binaryIconPositive, BinaryIconModel binaryIconNegative) {
        AbstractC22676k.m65750j(selection, "selection");
        AbstractC22676k.m65750j(binaryIconPositive, "binaryIconPositive");
        AbstractC22676k.m65750j(binaryIconNegative, "binaryIconNegative");
        return new BinaryFeedbackModel(text, selection, binaryIconPositive, binaryIconNegative);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinaryFeedbackModel)) {
            return false;
        }
        BinaryFeedbackModel binaryFeedbackModel = (BinaryFeedbackModel) other;
        return AbstractC22676k.m65745e(this.text, binaryFeedbackModel.text) && AbstractC22676k.m65745e(this.selection, binaryFeedbackModel.selection) && AbstractC22676k.m65745e(this.binaryIconPositive, binaryFeedbackModel.binaryIconPositive) && AbstractC22676k.m65745e(this.binaryIconNegative, binaryFeedbackModel.binaryIconNegative);
    }

    public final BinaryIconModel getBinaryIconNegative() {
        return this.binaryIconNegative;
    }

    public final BinaryIconModel getBinaryIconPositive() {
        return this.binaryIconPositive;
    }

    public final String getSelection() {
        return this.selection;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        return this.binaryIconNegative.hashCode() + ((this.binaryIconPositive.hashCode() + AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.selection)) * 31);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.selection;
        BinaryIconModel binaryIconModel = this.binaryIconPositive;
        BinaryIconModel binaryIconModel2 = this.binaryIconNegative;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BinaryFeedbackModel(text=", str, ", selection=", str2, ", binaryIconPositive=");
        sbM32001t.append(binaryIconModel);
        sbM32001t.append(", binaryIconNegative=");
        sbM32001t.append(binaryIconModel2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public BinaryFeedbackModel(String str, String selection, BinaryIconModel binaryIconPositive, BinaryIconModel binaryIconNegative) {
        AbstractC22676k.m65750j(selection, "selection");
        AbstractC22676k.m65750j(binaryIconPositive, "binaryIconPositive");
        AbstractC22676k.m65750j(binaryIconNegative, "binaryIconNegative");
        this.text = str;
        this.selection = selection;
        this.binaryIconPositive = binaryIconPositive;
        this.binaryIconNegative = binaryIconNegative;
    }

    public /* synthetic */ BinaryFeedbackModel(String str, String str2, BinaryIconModel binaryIconModel, BinaryIconModel binaryIconModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, binaryIconModel, binaryIconModel2);
    }
}
