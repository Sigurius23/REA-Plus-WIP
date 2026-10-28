package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ.\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;", "", "", "textDisplay", "", "percentage", "style", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;", "toCurrentProgressPercentage", "()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "copy", "(Ljava/lang/String;DLjava/lang/String;)Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextDisplay", "D", "getPercentage", "getStyle", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CurrentProgressPercentageDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("percentage")
    private final double percentage;

    @SerializedName("style")
    private final String style;

    @SerializedName("text_display")
    private final String textDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CurrentProgressPercentageDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CurrentProgressPercentageDto(int i13, String str, double d3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CurrentProgressPercentageDto$$serializer.INSTANCE.getDescriptor());
        }
        this.textDisplay = str;
        this.percentage = d3;
        this.style = str2;
    }

    public static /* synthetic */ CurrentProgressPercentageDto copy$default(CurrentProgressPercentageDto currentProgressPercentageDto, String str, double d3, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = currentProgressPercentageDto.textDisplay;
        }
        if ((i13 & 2) != 0) {
            d3 = currentProgressPercentageDto.percentage;
        }
        if ((i13 & 4) != 0) {
            str2 = currentProgressPercentageDto.style;
        }
        return currentProgressPercentageDto.copy(str, d3, str2);
    }

    public static final /* synthetic */ void write$Self$core_release(CurrentProgressPercentageDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.textDisplay);
        output.encodeDoubleElement(serialDesc, 1, self.percentage);
        output.encodeStringElement(serialDesc, 2, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextDisplay() {
        return this.textDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final CurrentProgressPercentageDto copy(String textDisplay, double percentage, String style) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(style, "style");
        return new CurrentProgressPercentageDto(textDisplay, percentage, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentProgressPercentageDto)) {
            return false;
        }
        CurrentProgressPercentageDto currentProgressPercentageDto = (CurrentProgressPercentageDto) other;
        return AbstractC22676k.m65745e(this.textDisplay, currentProgressPercentageDto.textDisplay) && Double.compare(this.percentage, currentProgressPercentageDto.percentage) == 0 && AbstractC22676k.m65745e(this.style, currentProgressPercentageDto.style);
    }

    public final double getPercentage() {
        return this.percentage;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTextDisplay() {
        return this.textDisplay;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC17176i.m48499a(this.textDisplay.hashCode() * 31, 31, this.percentage);
    }

    public final CurrentProgressPercentage toCurrentProgressPercentage() {
        return new CurrentProgressPercentage(this.textDisplay, this.percentage, JournalResponseDtoKt.convertToCircularProgressStyleEnum(this.style));
    }

    public String toString() {
        String str = this.textDisplay;
        double d3 = this.percentage;
        String str2 = this.style;
        StringBuilder sb4 = new StringBuilder("CurrentProgressPercentageDto(textDisplay=");
        sb4.append(str);
        sb4.append(", percentage=");
        sb4.append(d3);
        return AbstractC2875y.m8304q(sb4, ", style=", str2, ")");
    }

    public CurrentProgressPercentageDto(String textDisplay, double d3, String style) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.textDisplay = textDisplay;
        this.percentage = d3;
        this.style = style;
    }
}
