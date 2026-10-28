package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0018¨\u00063"}, m65681d2 = {"Lcom/whoop/educationModels/InsetDto;", "", "", "top", "leading", "bottom", "trailing", "<init>", "(DDDD)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/InsetDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "component3", "component4", "copy", "(DDDD)Lcom/whoop/educationModels/InsetDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getTop", "getTop$annotations", "()V", "getLeading", "getLeading$annotations", "getBottom", "getBottom$annotations", "getTrailing", "getTrailing$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InsetDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("bottom")
    private final double bottom;

    @SerializedName("leading")
    private final double leading;

    @SerializedName("top")
    private final double top;

    @SerializedName("trailing")
    private final double trailing;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/InsetDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/InsetDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InsetDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public InsetDto(double d3, double d14, double d15, double d16) {
        this.top = d3;
        this.leading = d14;
        this.bottom = d15;
        this.trailing = d16;
    }

    public static /* synthetic */ InsetDto copy$default(InsetDto insetDto, double d3, double d14, double d15, double d16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = insetDto.top;
        }
        double d17 = d3;
        if ((i13 & 2) != 0) {
            d14 = insetDto.leading;
        }
        double d18 = d14;
        if ((i13 & 4) != 0) {
            d15 = insetDto.bottom;
        }
        return insetDto.copy(d17, d18, d15, (i13 & 8) != 0 ? insetDto.trailing : d16);
    }

    @InterfaceC37143h("bottom")
    public static /* synthetic */ void getBottom$annotations() {
    }

    @InterfaceC37143h("leading")
    public static /* synthetic */ void getLeading$annotations() {
    }

    @InterfaceC37143h("top")
    public static /* synthetic */ void getTop$annotations() {
    }

    @InterfaceC37143h("trailing")
    public static /* synthetic */ void getTrailing$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(InsetDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.top);
        output.encodeDoubleElement(serialDesc, 1, self.leading);
        output.encodeDoubleElement(serialDesc, 2, self.bottom);
        output.encodeDoubleElement(serialDesc, 3, self.trailing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLeading() {
        return this.leading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTrailing() {
        return this.trailing;
    }

    public final InsetDto copy(double top, double leading, double bottom, double trailing) {
        return new InsetDto(top, leading, bottom, trailing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetDto)) {
            return false;
        }
        InsetDto insetDto = (InsetDto) other;
        return Double.compare(this.top, insetDto.top) == 0 && Double.compare(this.leading, insetDto.leading) == 0 && Double.compare(this.bottom, insetDto.bottom) == 0 && Double.compare(this.trailing, insetDto.trailing) == 0;
    }

    public final double getBottom() {
        return this.bottom;
    }

    public final double getLeading() {
        return this.leading;
    }

    public final double getTop() {
        return this.top;
    }

    public final double getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return Double.hashCode(this.trailing) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.top) * 31, 31, this.leading), 31, this.bottom);
    }

    public String toString() {
        double d3 = this.top;
        double d14 = this.leading;
        double d15 = this.bottom;
        double d16 = this.trailing;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("InsetDto(top=", d3, ", leading=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", bottom=", d15, ", trailing=");
        return AbstractC30007c.m91836f(d16, ")", sbM8306s);
    }

    public /* synthetic */ InsetDto(int i13, double d3, double d14, double d15, double d16, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, InsetDto$$serializer.INSTANCE.getDescriptor());
        }
        this.top = d3;
        this.leading = d14;
        this.bottom = d15;
        this.trailing = d16;
    }
}
