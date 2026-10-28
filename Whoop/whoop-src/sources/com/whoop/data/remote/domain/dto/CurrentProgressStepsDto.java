package com.whoop.data.remote.domain.dto;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import vw0.C36541a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b#\u0010$JJ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010 J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010$¨\u00067"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;", "", "", "textDisplay", "", "currentStep", "totalSteps", "style", "", "Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;", "textDisplayOptions", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;", "toCurrentProgressSteps", "()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextDisplay", "I", "getCurrentStep", "getTotalSteps", "getStyle", "Ljava/util/List;", "getTextDisplayOptions", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CurrentProgressStepsDto {

    @SerializedName("current_step")
    private final int currentStep;

    @SerializedName("style")
    private final String style;

    @SerializedName("text_display")
    private final String textDisplay;

    @SerializedName("text_display_options")
    private final List<TextDisplayOptionDto> textDisplayOptions;

    @SerializedName("total_steps")
    private final int totalSteps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36541a(1))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CurrentProgressStepsDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CurrentProgressStepsDto(int i13, String str, int i14, int i15, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, CurrentProgressStepsDto$$serializer.INSTANCE.getDescriptor());
        }
        this.textDisplay = str;
        this.currentStep = i14;
        this.totalSteps = i15;
        this.style = str2;
        this.textDisplayOptions = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TextDisplayOptionDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentProgressStepsDto copy$default(CurrentProgressStepsDto currentProgressStepsDto, String str, int i13, int i14, String str2, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = currentProgressStepsDto.textDisplay;
        }
        if ((i15 & 2) != 0) {
            i13 = currentProgressStepsDto.currentStep;
        }
        if ((i15 & 4) != 0) {
            i14 = currentProgressStepsDto.totalSteps;
        }
        if ((i15 & 8) != 0) {
            str2 = currentProgressStepsDto.style;
        }
        if ((i15 & 16) != 0) {
            list = currentProgressStepsDto.textDisplayOptions;
        }
        List list2 = list;
        int i16 = i14;
        return currentProgressStepsDto.copy(str, i13, i16, str2, list2);
    }

    public static final /* synthetic */ void write$Self$core_release(CurrentProgressStepsDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.textDisplay);
        output.encodeIntElement(serialDesc, 1, self.currentStep);
        output.encodeIntElement(serialDesc, 2, self.totalSteps);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.style);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.textDisplayOptions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextDisplay() {
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

    public final List<TextDisplayOptionDto> component5() {
        return this.textDisplayOptions;
    }

    public final CurrentProgressStepsDto copy(String textDisplay, int currentStep, int totalSteps, String style, List<TextDisplayOptionDto> textDisplayOptions) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(textDisplayOptions, "textDisplayOptions");
        return new CurrentProgressStepsDto(textDisplay, currentStep, totalSteps, style, textDisplayOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentProgressStepsDto)) {
            return false;
        }
        CurrentProgressStepsDto currentProgressStepsDto = (CurrentProgressStepsDto) other;
        return AbstractC22676k.m65745e(this.textDisplay, currentProgressStepsDto.textDisplay) && this.currentStep == currentProgressStepsDto.currentStep && this.totalSteps == currentProgressStepsDto.totalSteps && AbstractC22676k.m65745e(this.style, currentProgressStepsDto.style) && AbstractC22676k.m65745e(this.textDisplayOptions, currentProgressStepsDto.textDisplayOptions);
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTextDisplay() {
        return this.textDisplay;
    }

    public final List<TextDisplayOptionDto> getTextDisplayOptions() {
        return this.textDisplayOptions;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.totalSteps, AbstractC11266d.m30448b(this.currentStep, this.textDisplay.hashCode() * 31, 31), 31);
        String str = this.style;
        return this.textDisplayOptions.hashCode() + ((iM30448b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final CurrentProgressSteps toCurrentProgressSteps() {
        String str = this.textDisplay;
        int i13 = this.currentStep;
        int i14 = this.totalSteps;
        String str2 = this.style;
        CircularProgressStyle circularProgressStyleConvertToCircularProgressStyleEnum = str2 != null ? JournalResponseDtoKt.convertToCircularProgressStyleEnum(str2) : null;
        List<TextDisplayOptionDto> list = this.textDisplayOptions;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TextDisplayOptionDto) it.next()).toTextDisplayOption());
        }
        return new CurrentProgressSteps(str, i13, i14, circularProgressStyleConvertToCircularProgressStyleEnum, arrayList);
    }

    public String toString() {
        String str = this.textDisplay;
        int i13 = this.currentStep;
        int i14 = this.totalSteps;
        String str2 = this.style;
        List<TextDisplayOptionDto> list = this.textDisplayOptions;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "CurrentProgressStepsDto(textDisplay=", str, ", currentStep=", ", totalSteps=");
        AbstractC11895b.m31979B(i14, ", style=", str2, ", textDisplayOptions=", sbM30467u);
        return AbstractC3855a.m11829m(sbM30467u, list, ")");
    }

    public CurrentProgressStepsDto(String textDisplay, int i13, int i14, String str, List<TextDisplayOptionDto> textDisplayOptions) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(textDisplayOptions, "textDisplayOptions");
        this.textDisplay = textDisplay;
        this.currentStep = i13;
        this.totalSteps = i14;
        this.style = str;
        this.textDisplayOptions = textDisplayOptions;
    }
}
