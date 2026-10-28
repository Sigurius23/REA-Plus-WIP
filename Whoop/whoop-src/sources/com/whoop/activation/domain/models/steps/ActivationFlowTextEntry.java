package com.whoop.activation.domain.models.steps;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010\u001f¨\u00060"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;", "", "", "textType", "text", "preFill", "fieldType", "", "isReadOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextType", "getText", "getPreFill", "getFieldType", "Z", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationFlowTextEntry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fieldType;
    private final boolean isReadOnly;
    private final String preFill;
    private final String text;
    private final String textType;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationFlowTextEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivationFlowTextEntry(int i13, String str, String str2, String str3, String str4, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ActivationFlowTextEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.textType = str;
        this.text = str2;
        this.preFill = str3;
        this.fieldType = str4;
        if ((i13 & 16) == 0) {
            this.isReadOnly = false;
        } else {
            this.isReadOnly = z4;
        }
    }

    public static /* synthetic */ ActivationFlowTextEntry copy$default(ActivationFlowTextEntry activationFlowTextEntry, String str, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activationFlowTextEntry.textType;
        }
        if ((i13 & 2) != 0) {
            str2 = activationFlowTextEntry.text;
        }
        if ((i13 & 4) != 0) {
            str3 = activationFlowTextEntry.preFill;
        }
        if ((i13 & 8) != 0) {
            str4 = activationFlowTextEntry.fieldType;
        }
        if ((i13 & 16) != 0) {
            z4 = activationFlowTextEntry.isReadOnly;
        }
        boolean z13 = z4;
        String str5 = str3;
        return activationFlowTextEntry.copy(str, str2, str5, str4, z13);
    }

    public static final /* synthetic */ void write$Self$activation_release(ActivationFlowTextEntry self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.textType);
        output.encodeStringElement(serialDesc, 1, self.text);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.preFill);
        output.encodeStringElement(serialDesc, 3, self.fieldType);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isReadOnly) {
            output.encodeBooleanElement(serialDesc, 4, self.isReadOnly);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextType() {
        return this.textType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPreFill() {
        return this.preFill;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFieldType() {
        return this.fieldType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final ActivationFlowTextEntry copy(String textType, String text, String preFill, String fieldType, boolean isReadOnly) {
        AbstractC22676k.m65750j(textType, "textType");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(fieldType, "fieldType");
        return new ActivationFlowTextEntry(textType, text, preFill, fieldType, isReadOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationFlowTextEntry)) {
            return false;
        }
        ActivationFlowTextEntry activationFlowTextEntry = (ActivationFlowTextEntry) other;
        return AbstractC22676k.m65745e(this.textType, activationFlowTextEntry.textType) && AbstractC22676k.m65745e(this.text, activationFlowTextEntry.text) && AbstractC22676k.m65745e(this.preFill, activationFlowTextEntry.preFill) && AbstractC22676k.m65745e(this.fieldType, activationFlowTextEntry.fieldType) && this.isReadOnly == activationFlowTextEntry.isReadOnly;
    }

    public final String getFieldType() {
        return this.fieldType;
    }

    public final String getPreFill() {
        return this.preFill;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextType() {
        return this.textType;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.textType.hashCode() * 31, 31, this.text);
        String str = this.preFill;
        return Boolean.hashCode(this.isReadOnly) + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.fieldType);
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
    }

    public String toString() {
        String str = this.textType;
        String str2 = this.text;
        String str3 = this.preFill;
        String str4 = this.fieldType;
        boolean z4 = this.isReadOnly;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivationFlowTextEntry(textType=", str, ", text=", str2, ", preFill=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", fieldType=", str4, ", isReadOnly=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public ActivationFlowTextEntry(String textType, String text, String str, String fieldType, boolean z4) {
        AbstractC22676k.m65750j(textType, "textType");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(fieldType, "fieldType");
        this.textType = textType;
        this.text = text;
        this.preFill = str;
        this.fieldType = fieldType;
        this.isReadOnly = z4;
    }

    public /* synthetic */ ActivationFlowTextEntry(String str, String str2, String str3, String str4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? false : z4);
    }
}
