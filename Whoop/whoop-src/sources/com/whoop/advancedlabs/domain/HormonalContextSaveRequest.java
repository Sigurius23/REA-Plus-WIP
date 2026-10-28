package com.whoop.advancedlabs.domain;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;", "", "", "testId", "hormonalMode", "contraception", "cyclePhase", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "getHormonalMode", "getContraception", "getCyclePhase", "getSource", "Companion", "$serializer", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalContextSaveRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String contraception;
    private final String cyclePhase;
    private final String hormonalMode;
    private final String source;
    private final String testId;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.domain.HormonalContextSaveRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalContextSaveRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HormonalContextSaveRequest(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, HormonalContextSaveRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.testId = str;
        this.hormonalMode = str2;
        this.contraception = str3;
        this.cyclePhase = str4;
        this.source = str5;
    }

    public static /* synthetic */ HormonalContextSaveRequest copy$default(HormonalContextSaveRequest hormonalContextSaveRequest, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalContextSaveRequest.testId;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalContextSaveRequest.hormonalMode;
        }
        if ((i13 & 4) != 0) {
            str3 = hormonalContextSaveRequest.contraception;
        }
        if ((i13 & 8) != 0) {
            str4 = hormonalContextSaveRequest.cyclePhase;
        }
        if ((i13 & 16) != 0) {
            str5 = hormonalContextSaveRequest.source;
        }
        String str6 = str5;
        String str7 = str3;
        return hormonalContextSaveRequest.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(HormonalContextSaveRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.testId);
        output.encodeStringElement(serialDesc, 1, self.hormonalMode);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.contraception);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.cyclePhase);
        output.encodeStringElement(serialDesc, 4, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHormonalMode() {
        return this.hormonalMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContraception() {
        return this.contraception;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCyclePhase() {
        return this.cyclePhase;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final HormonalContextSaveRequest copy(String testId, String hormonalMode, String contraception, String cyclePhase, String source) {
        AbstractC22676k.m65750j(testId, "testId");
        AbstractC22676k.m65750j(hormonalMode, "hormonalMode");
        AbstractC22676k.m65750j(source, "source");
        return new HormonalContextSaveRequest(testId, hormonalMode, contraception, cyclePhase, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalContextSaveRequest)) {
            return false;
        }
        HormonalContextSaveRequest hormonalContextSaveRequest = (HormonalContextSaveRequest) other;
        return AbstractC22676k.m65745e(this.testId, hormonalContextSaveRequest.testId) && AbstractC22676k.m65745e(this.hormonalMode, hormonalContextSaveRequest.hormonalMode) && AbstractC22676k.m65745e(this.contraception, hormonalContextSaveRequest.contraception) && AbstractC22676k.m65745e(this.cyclePhase, hormonalContextSaveRequest.cyclePhase) && AbstractC22676k.m65745e(this.source, hormonalContextSaveRequest.source);
    }

    public final String getContraception() {
        return this.contraception;
    }

    public final String getCyclePhase() {
        return this.cyclePhase;
    }

    public final String getHormonalMode() {
        return this.hormonalMode;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTestId() {
        return this.testId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.testId.hashCode() * 31, 31, this.hormonalMode);
        String str = this.contraception;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cyclePhase;
        return this.source.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.testId;
        String str2 = this.hormonalMode;
        String str3 = this.contraception;
        String str4 = this.cyclePhase;
        String str5 = this.source;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalContextSaveRequest(testId=", str, ", hormonalMode=", str2, ", contraception=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", cyclePhase=", str4, ", source=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public HormonalContextSaveRequest(String testId, String hormonalMode, String str, String str2, String source) {
        AbstractC22676k.m65750j(testId, "testId");
        AbstractC22676k.m65750j(hormonalMode, "hormonalMode");
        AbstractC22676k.m65750j(source, "source");
        this.testId = testId;
        this.hormonalMode = hormonalMode;
        this.contraception = str;
        this.cyclePhase = str2;
        this.source = source;
    }
}
