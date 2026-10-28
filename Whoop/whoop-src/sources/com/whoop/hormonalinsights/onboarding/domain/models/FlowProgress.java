package com.whoop.hormonalinsights.onboarding.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "", "", "text", "", "screenCount", "maxScreenCount", "<init>", "(Ljava/lang/String;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "I", "getScreenCount", "getMaxScreenCount", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FlowProgress {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int maxScreenCount;
    private final int screenCount;
    private final String text;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FlowProgress$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FlowProgress(int i13, String str, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, FlowProgress$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.screenCount = i14;
        this.maxScreenCount = i15;
    }

    public static /* synthetic */ FlowProgress copy$default(FlowProgress flowProgress, String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = flowProgress.text;
        }
        if ((i15 & 2) != 0) {
            i13 = flowProgress.screenCount;
        }
        if ((i15 & 4) != 0) {
            i14 = flowProgress.maxScreenCount;
        }
        return flowProgress.copy(str, i13, i14);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(FlowProgress self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.text);
        output.encodeIntElement(serialDesc, 1, self.screenCount);
        output.encodeIntElement(serialDesc, 2, self.maxScreenCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getScreenCount() {
        return this.screenCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxScreenCount() {
        return this.maxScreenCount;
    }

    public final FlowProgress copy(String text, int screenCount, int maxScreenCount) {
        AbstractC22676k.m65750j(text, "text");
        return new FlowProgress(text, screenCount, maxScreenCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowProgress)) {
            return false;
        }
        FlowProgress flowProgress = (FlowProgress) other;
        return AbstractC22676k.m65745e(this.text, flowProgress.text) && this.screenCount == flowProgress.screenCount && this.maxScreenCount == flowProgress.maxScreenCount;
    }

    public final int getMaxScreenCount() {
        return this.maxScreenCount;
    }

    public final int getScreenCount() {
        return this.screenCount;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxScreenCount) + AbstractC11266d.m30448b(this.screenCount, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.text;
        int i13 = this.screenCount;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(i13, "FlowProgress(text=", str, ", screenCount=", ", maxScreenCount="), this.maxScreenCount, ")");
    }

    public FlowProgress(String text, int i13, int i14) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.screenCount = i13;
        this.maxScreenCount = i14;
    }
}
