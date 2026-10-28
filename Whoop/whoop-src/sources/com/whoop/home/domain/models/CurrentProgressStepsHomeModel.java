package com.whoop.home.domain.models;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;", "", "Lcom/whoop/design/util/TextResource;", "textDisplay", "", "currentStep", "totalSteps", "", "style", "<init>", "(Lcom/whoop/design/util/TextResource;IILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()I", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;IILjava/lang/String;)Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTextDisplay", "I", "getCurrentStep", "getTotalSteps", "Ljava/lang/String;", "getStyle", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CurrentProgressStepsHomeModel {
    private final int currentStep;
    private final String style;
    private final TextResource textDisplay;
    private final int totalSteps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CurrentProgressStepsHomeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CurrentProgressStepsHomeModel(int i13, TextResource textResource, int i14, int i15, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CurrentProgressStepsHomeModel$$serializer.INSTANCE.getDescriptor());
        }
        this.textDisplay = textResource;
        this.currentStep = i14;
        this.totalSteps = i15;
        this.style = str;
    }

    public static /* synthetic */ CurrentProgressStepsHomeModel copy$default(CurrentProgressStepsHomeModel currentProgressStepsHomeModel, TextResource textResource, int i13, int i14, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            textResource = currentProgressStepsHomeModel.textDisplay;
        }
        if ((i15 & 2) != 0) {
            i13 = currentProgressStepsHomeModel.currentStep;
        }
        if ((i15 & 4) != 0) {
            i14 = currentProgressStepsHomeModel.totalSteps;
        }
        if ((i15 & 8) != 0) {
            str = currentProgressStepsHomeModel.style;
        }
        return currentProgressStepsHomeModel.copy(textResource, i13, i14, str);
    }

    public static final /* synthetic */ void write$Self$home_release(CurrentProgressStepsHomeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.textDisplay);
        output.encodeIntElement(serialDesc, 1, self.currentStep);
        output.encodeIntElement(serialDesc, 2, self.totalSteps);
        output.encodeStringElement(serialDesc, 3, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTextDisplay() {
        return this.textDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final CurrentProgressStepsHomeModel copy(TextResource textDisplay, int currentStep, int totalSteps, String style) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(style, "style");
        return new CurrentProgressStepsHomeModel(textDisplay, currentStep, totalSteps, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentProgressStepsHomeModel)) {
            return false;
        }
        CurrentProgressStepsHomeModel currentProgressStepsHomeModel = (CurrentProgressStepsHomeModel) other;
        return AbstractC22676k.m65745e(this.textDisplay, currentProgressStepsHomeModel.textDisplay) && this.currentStep == currentProgressStepsHomeModel.currentStep && this.totalSteps == currentProgressStepsHomeModel.totalSteps && AbstractC22676k.m65745e(this.style, currentProgressStepsHomeModel.style);
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final String getStyle() {
        return this.style;
    }

    public final TextResource getTextDisplay() {
        return this.textDisplay;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11266d.m30448b(this.totalSteps, AbstractC11266d.m30448b(this.currentStep, this.textDisplay.hashCode() * 31, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.textDisplay;
        int i13 = this.currentStep;
        int i14 = this.totalSteps;
        String str = this.style;
        StringBuilder sb4 = new StringBuilder("CurrentProgressStepsHomeModel(textDisplay=");
        sb4.append(textResource);
        sb4.append(", currentStep=");
        sb4.append(i13);
        sb4.append(", totalSteps=");
        return AbstractC38963t7.m124376f(i14, ", style=", str, ")", sb4);
    }

    public CurrentProgressStepsHomeModel(TextResource textDisplay, int i13, int i14, String style) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.textDisplay = textDisplay;
        this.currentStep = i13;
        this.totalSteps = i14;
        this.style = style;
    }
}
