package com.whoop.design.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/TimeSegmentLastUpdated;", "", "", "leadingText", "trailingText", "trailingImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/TimeSegmentLastUpdated;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/TimeSegmentLastUpdated;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeadingText", "getLeadingText$annotations", "()V", "getTrailingText", "getTrailingText$annotations", "getTrailingImage", "getTrailingImage$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TimeSegmentLastUpdated {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("leading_text")
    private final String leadingText;

    @SerializedName("trailing_image")
    private final String trailingImage;

    @SerializedName("trailing_text")
    private final String trailingText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/TimeSegmentLastUpdated$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/TimeSegmentLastUpdated;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TimeSegmentLastUpdated$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TimeSegmentLastUpdated(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TimeSegmentLastUpdated$$serializer.INSTANCE.getDescriptor());
        }
        this.leadingText = str;
        this.trailingText = str2;
        this.trailingImage = str3;
    }

    public static /* synthetic */ TimeSegmentLastUpdated copy$default(TimeSegmentLastUpdated timeSegmentLastUpdated, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = timeSegmentLastUpdated.leadingText;
        }
        if ((i13 & 2) != 0) {
            str2 = timeSegmentLastUpdated.trailingText;
        }
        if ((i13 & 4) != 0) {
            str3 = timeSegmentLastUpdated.trailingImage;
        }
        return timeSegmentLastUpdated.copy(str, str2, str3);
    }

    @InterfaceC37143h("leading_text")
    public static /* synthetic */ void getLeadingText$annotations() {
    }

    @InterfaceC37143h("trailing_image")
    public static /* synthetic */ void getTrailingImage$annotations() {
    }

    @InterfaceC37143h("trailing_text")
    public static /* synthetic */ void getTrailingText$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(TimeSegmentLastUpdated self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.leadingText);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.trailingText);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.trailingImage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeadingText() {
        return this.leadingText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrailingText() {
        return this.trailingText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrailingImage() {
        return this.trailingImage;
    }

    public final TimeSegmentLastUpdated copy(String leadingText, String trailingText, String trailingImage) {
        AbstractC22676k.m65750j(leadingText, "leadingText");
        return new TimeSegmentLastUpdated(leadingText, trailingText, trailingImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSegmentLastUpdated)) {
            return false;
        }
        TimeSegmentLastUpdated timeSegmentLastUpdated = (TimeSegmentLastUpdated) other;
        return AbstractC22676k.m65745e(this.leadingText, timeSegmentLastUpdated.leadingText) && AbstractC22676k.m65745e(this.trailingText, timeSegmentLastUpdated.trailingText) && AbstractC22676k.m65745e(this.trailingImage, timeSegmentLastUpdated.trailingImage);
    }

    public final String getLeadingText() {
        return this.leadingText;
    }

    public final String getTrailingImage() {
        return this.trailingImage;
    }

    public final String getTrailingText() {
        return this.trailingText;
    }

    public int hashCode() {
        int iHashCode = this.leadingText.hashCode() * 31;
        String str = this.trailingText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trailingImage;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.trailingImage, ")", AbstractC11895b.m32001t("TimeSegmentLastUpdated(leadingText=", this.leadingText, ", trailingText=", this.trailingText, ", trailingImage="));
    }

    public TimeSegmentLastUpdated(String leadingText, String str, String str2) {
        AbstractC22676k.m65750j(leadingText, "leadingText");
        this.leadingText = leadingText;
        this.trailingText = str;
        this.trailingImage = str2;
    }
}
