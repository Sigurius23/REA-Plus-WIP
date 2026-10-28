package com.whoop.hormonalinsights.pregnancyinsights.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;", "", "", "headerTitle", "headerSubtitle", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;", "cycleReturned", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeaderTitle", "getHeaderSubtitle", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;", "getCycleReturned", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancyCongratulationsHeader {
    private final PregnancyInsightsHeaderButton cycleReturned;
    private final String headerSubtitle;
    private final String headerTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancyCongratulationsHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PregnancyCongratulationsHeader(int i13, String str, String str2, PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PregnancyCongratulationsHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.headerTitle = str;
        this.headerSubtitle = str2;
        this.cycleReturned = pregnancyInsightsHeaderButton;
    }

    public static /* synthetic */ PregnancyCongratulationsHeader copy$default(PregnancyCongratulationsHeader pregnancyCongratulationsHeader, String str, String str2, PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pregnancyCongratulationsHeader.headerTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = pregnancyCongratulationsHeader.headerSubtitle;
        }
        if ((i13 & 4) != 0) {
            pregnancyInsightsHeaderButton = pregnancyCongratulationsHeader.cycleReturned;
        }
        return pregnancyCongratulationsHeader.copy(str, str2, pregnancyInsightsHeaderButton);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PregnancyCongratulationsHeader self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.headerTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.headerSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, PregnancyInsightsHeaderButton$$serializer.INSTANCE, self.cycleReturned);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PregnancyInsightsHeaderButton getCycleReturned() {
        return this.cycleReturned;
    }

    public final PregnancyCongratulationsHeader copy(String headerTitle, String headerSubtitle, PregnancyInsightsHeaderButton cycleReturned) {
        AbstractC22676k.m65750j(headerTitle, "headerTitle");
        return new PregnancyCongratulationsHeader(headerTitle, headerSubtitle, cycleReturned);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancyCongratulationsHeader)) {
            return false;
        }
        PregnancyCongratulationsHeader pregnancyCongratulationsHeader = (PregnancyCongratulationsHeader) other;
        return AbstractC22676k.m65745e(this.headerTitle, pregnancyCongratulationsHeader.headerTitle) && AbstractC22676k.m65745e(this.headerSubtitle, pregnancyCongratulationsHeader.headerSubtitle) && AbstractC22676k.m65745e(this.cycleReturned, pregnancyCongratulationsHeader.cycleReturned);
    }

    public final PregnancyInsightsHeaderButton getCycleReturned() {
        return this.cycleReturned;
    }

    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public int hashCode() {
        int iHashCode = this.headerTitle.hashCode() * 31;
        String str = this.headerSubtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton = this.cycleReturned;
        return iHashCode2 + (pregnancyInsightsHeaderButton != null ? pregnancyInsightsHeaderButton.hashCode() : 0);
    }

    public String toString() {
        String str = this.headerTitle;
        String str2 = this.headerSubtitle;
        PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton = this.cycleReturned;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PregnancyCongratulationsHeader(headerTitle=", str, ", headerSubtitle=", str2, ", cycleReturned=");
        sbM32001t.append(pregnancyInsightsHeaderButton);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PregnancyCongratulationsHeader(String headerTitle, String str, PregnancyInsightsHeaderButton pregnancyInsightsHeaderButton) {
        AbstractC22676k.m65750j(headerTitle, "headerTitle");
        this.headerTitle = headerTitle;
        this.headerSubtitle = str;
        this.cycleReturned = pregnancyInsightsHeaderButton;
    }
}
