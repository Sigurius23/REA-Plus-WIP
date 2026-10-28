package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vy2.C36605c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u001f¨\u0006;"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;", "", "", "submittingTitle", "submittingSubtitle", "submittedTitle", "submittedSubtitle", "submittedErrorTitle", "submittedErrorSubtitle", "submittedErrorPositiveCta", "submittedErrorNegativeCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lvy2/c;", "toDomain", "()Lvy2/c;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubmittingTitle", "getSubmittingSubtitle", "getSubmittedTitle", "getSubmittedSubtitle", "getSubmittedErrorTitle", "getSubmittedErrorSubtitle", "getSubmittedErrorPositiveCta", "getSubmittedErrorNegativeCta", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScreeningConfigDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String submittedErrorNegativeCta;
    private final String submittedErrorPositiveCta;
    private final String submittedErrorSubtitle;
    private final String submittedErrorTitle;
    private final String submittedSubtitle;
    private final String submittedTitle;
    private final String submittingSubtitle;
    private final String submittingTitle;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningConfigDto;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScreeningConfigDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScreeningConfigDto(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, ScreeningConfigDto$$serializer.INSTANCE.getDescriptor());
        }
        this.submittingTitle = str;
        this.submittingSubtitle = str2;
        this.submittedTitle = str3;
        this.submittedSubtitle = str4;
        this.submittedErrorTitle = str5;
        this.submittedErrorSubtitle = str6;
        this.submittedErrorPositiveCta = str7;
        this.submittedErrorNegativeCta = str8;
    }

    public static /* synthetic */ ScreeningConfigDto copy$default(ScreeningConfigDto screeningConfigDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = screeningConfigDto.submittingTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = screeningConfigDto.submittingSubtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = screeningConfigDto.submittedTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = screeningConfigDto.submittedSubtitle;
        }
        if ((i13 & 16) != 0) {
            str5 = screeningConfigDto.submittedErrorTitle;
        }
        if ((i13 & 32) != 0) {
            str6 = screeningConfigDto.submittedErrorSubtitle;
        }
        if ((i13 & 64) != 0) {
            str7 = screeningConfigDto.submittedErrorPositiveCta;
        }
        if ((i13 & 128) != 0) {
            str8 = screeningConfigDto.submittedErrorNegativeCta;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return screeningConfigDto.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(ScreeningConfigDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.submittingTitle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.submittingSubtitle);
        output.encodeStringElement(serialDesc, 2, self.submittedTitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.submittedSubtitle);
        output.encodeStringElement(serialDesc, 4, self.submittedErrorTitle);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.submittedErrorSubtitle);
        output.encodeStringElement(serialDesc, 6, self.submittedErrorPositiveCta);
        output.encodeStringElement(serialDesc, 7, self.submittedErrorNegativeCta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubmittingTitle() {
        return this.submittingTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubmittingSubtitle() {
        return this.submittingSubtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubmittedTitle() {
        return this.submittedTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubmittedSubtitle() {
        return this.submittedSubtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubmittedErrorTitle() {
        return this.submittedErrorTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubmittedErrorSubtitle() {
        return this.submittedErrorSubtitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubmittedErrorPositiveCta() {
        return this.submittedErrorPositiveCta;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubmittedErrorNegativeCta() {
        return this.submittedErrorNegativeCta;
    }

    public final ScreeningConfigDto copy(String submittingTitle, String submittingSubtitle, String submittedTitle, String submittedSubtitle, String submittedErrorTitle, String submittedErrorSubtitle, String submittedErrorPositiveCta, String submittedErrorNegativeCta) {
        AbstractC22676k.m65750j(submittingTitle, "submittingTitle");
        AbstractC22676k.m65750j(submittedTitle, "submittedTitle");
        AbstractC22676k.m65750j(submittedErrorTitle, "submittedErrorTitle");
        AbstractC22676k.m65750j(submittedErrorPositiveCta, "submittedErrorPositiveCta");
        AbstractC22676k.m65750j(submittedErrorNegativeCta, "submittedErrorNegativeCta");
        return new ScreeningConfigDto(submittingTitle, submittingSubtitle, submittedTitle, submittedSubtitle, submittedErrorTitle, submittedErrorSubtitle, submittedErrorPositiveCta, submittedErrorNegativeCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreeningConfigDto)) {
            return false;
        }
        ScreeningConfigDto screeningConfigDto = (ScreeningConfigDto) other;
        return AbstractC22676k.m65745e(this.submittingTitle, screeningConfigDto.submittingTitle) && AbstractC22676k.m65745e(this.submittingSubtitle, screeningConfigDto.submittingSubtitle) && AbstractC22676k.m65745e(this.submittedTitle, screeningConfigDto.submittedTitle) && AbstractC22676k.m65745e(this.submittedSubtitle, screeningConfigDto.submittedSubtitle) && AbstractC22676k.m65745e(this.submittedErrorTitle, screeningConfigDto.submittedErrorTitle) && AbstractC22676k.m65745e(this.submittedErrorSubtitle, screeningConfigDto.submittedErrorSubtitle) && AbstractC22676k.m65745e(this.submittedErrorPositiveCta, screeningConfigDto.submittedErrorPositiveCta) && AbstractC22676k.m65745e(this.submittedErrorNegativeCta, screeningConfigDto.submittedErrorNegativeCta);
    }

    public final String getSubmittedErrorNegativeCta() {
        return this.submittedErrorNegativeCta;
    }

    public final String getSubmittedErrorPositiveCta() {
        return this.submittedErrorPositiveCta;
    }

    public final String getSubmittedErrorSubtitle() {
        return this.submittedErrorSubtitle;
    }

    public final String getSubmittedErrorTitle() {
        return this.submittedErrorTitle;
    }

    public final String getSubmittedSubtitle() {
        return this.submittedSubtitle;
    }

    public final String getSubmittedTitle() {
        return this.submittedTitle;
    }

    public final String getSubmittingSubtitle() {
        return this.submittingSubtitle;
    }

    public final String getSubmittingTitle() {
        return this.submittingTitle;
    }

    public int hashCode() {
        int iHashCode = this.submittingTitle.hashCode() * 31;
        String str = this.submittingSubtitle;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.submittedTitle);
        String str2 = this.submittedSubtitle;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.submittedErrorTitle);
        String str3 = this.submittedErrorSubtitle;
        return this.submittedErrorNegativeCta.hashCode() + AbstractC11266d.m30450d((iM30450d2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.submittedErrorPositiveCta);
    }

    public final C36605c toDomain() {
        return new C36605c(this.submittingTitle, this.submittingSubtitle, this.submittedTitle, this.submittedSubtitle, this.submittedErrorTitle, this.submittedErrorSubtitle, this.submittedErrorPositiveCta, this.submittedErrorNegativeCta);
    }

    public String toString() {
        String str = this.submittingTitle;
        String str2 = this.submittingSubtitle;
        String str3 = this.submittedTitle;
        String str4 = this.submittedSubtitle;
        String str5 = this.submittedErrorTitle;
        String str6 = this.submittedErrorSubtitle;
        String str7 = this.submittedErrorPositiveCta;
        String str8 = this.submittedErrorNegativeCta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScreeningConfigDto(submittingTitle=", str, ", submittingSubtitle=", str2, ", submittedTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", submittedSubtitle=", str4, ", submittedErrorTitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", submittedErrorSubtitle=", str6, ", submittedErrorPositiveCta=");
        return AbstractC11266d.m30464r(sbM32001t, str7, ", submittedErrorNegativeCta=", str8, ")");
    }

    public ScreeningConfigDto(String submittingTitle, String str, String submittedTitle, String str2, String submittedErrorTitle, String str3, String submittedErrorPositiveCta, String submittedErrorNegativeCta) {
        AbstractC22676k.m65750j(submittingTitle, "submittingTitle");
        AbstractC22676k.m65750j(submittedTitle, "submittedTitle");
        AbstractC22676k.m65750j(submittedErrorTitle, "submittedErrorTitle");
        AbstractC22676k.m65750j(submittedErrorPositiveCta, "submittedErrorPositiveCta");
        AbstractC22676k.m65750j(submittedErrorNegativeCta, "submittedErrorNegativeCta");
        this.submittingTitle = submittingTitle;
        this.submittingSubtitle = str;
        this.submittedTitle = submittedTitle;
        this.submittedSubtitle = str2;
        this.submittedErrorTitle = submittedErrorTitle;
        this.submittedErrorSubtitle = str3;
        this.submittedErrorPositiveCta = submittedErrorPositiveCta;
        this.submittedErrorNegativeCta = submittedErrorNegativeCta;
    }
}
