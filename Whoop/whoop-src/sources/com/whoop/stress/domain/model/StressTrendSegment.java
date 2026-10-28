package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih1.C18518b;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001b¨\u00063"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressTrendSegment;", "", "", "startX", "endX", "Lcom/whoop/stress/domain/model/StressTrendType;", "style", "<init>", "(FFLcom/whoop/stress/domain/model/StressTrendType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFLcom/whoop/stress/domain/model/StressTrendType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressTrendSegment;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "component3", "()Lcom/whoop/stress/domain/model/StressTrendType;", "copy", "(FFLcom/whoop/stress/domain/model/StressTrendType;)Lcom/whoop/stress/domain/model/StressTrendSegment;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getStartX", "getStartX$annotations", "()V", "getEndX", "getEndX$annotations", "Lcom/whoop/stress/domain/model/StressTrendType;", "getStyle", "getStyle$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressTrendSegment {
    public static final int $stable = 0;

    @SerializedName("end_x")
    private final float endX;

    @SerializedName("start_x")
    private final float startX;

    @SerializedName("style")
    private final StressTrendType style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C18518b(18))};

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressTrendSegment$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressTrendSegment$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressTrendSegment;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressTrendSegment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StressTrendSegment(float f13, float f14, StressTrendType style) {
        AbstractC22676k.m65750j(style, "style");
        this.startX = f13;
        this.endX = f14;
        this.style = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return StressTrendType.INSTANCE.serializer();
    }

    public static /* synthetic */ StressTrendSegment copy$default(StressTrendSegment stressTrendSegment, float f13, float f14, StressTrendType stressTrendType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = stressTrendSegment.startX;
        }
        if ((i13 & 2) != 0) {
            f14 = stressTrendSegment.endX;
        }
        if ((i13 & 4) != 0) {
            stressTrendType = stressTrendSegment.style;
        }
        return stressTrendSegment.copy(f13, f14, stressTrendType);
    }

    @InterfaceC37143h("end_x")
    public static /* synthetic */ void getEndX$annotations() {
    }

    @InterfaceC37143h("start_x")
    public static /* synthetic */ void getStartX$annotations() {
    }

    @InterfaceC37143h("style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressTrendSegment self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeFloatElement(serialDesc, 0, self.startX);
        output.encodeFloatElement(serialDesc, 1, self.endX);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStartX() {
        return this.startX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getEndX() {
        return this.endX;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StressTrendType getStyle() {
        return this.style;
    }

    public final StressTrendSegment copy(float startX, float endX, StressTrendType style) {
        AbstractC22676k.m65750j(style, "style");
        return new StressTrendSegment(startX, endX, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressTrendSegment)) {
            return false;
        }
        StressTrendSegment stressTrendSegment = (StressTrendSegment) other;
        return Float.compare(this.startX, stressTrendSegment.startX) == 0 && Float.compare(this.endX, stressTrendSegment.endX) == 0 && this.style == stressTrendSegment.style;
    }

    public final float getEndX() {
        return this.endX;
    }

    public final float getStartX() {
        return this.startX;
    }

    public final StressTrendType getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11266d.m30447a(this.endX, Float.hashCode(this.startX) * 31, 31);
    }

    public String toString() {
        float f13 = this.startX;
        float f14 = this.endX;
        StressTrendType stressTrendType = this.style;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("StressTrendSegment(startX=", f13, ", endX=", f14, ", style=");
        sbM8307t.append(stressTrendType);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    public /* synthetic */ StressTrendSegment(int i13, float f13, float f14, StressTrendType stressTrendType, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, StressTrendSegment$$serializer.INSTANCE.getDescriptor());
        }
        this.startX = f13;
        this.endX = f14;
        this.style = stressTrendType;
    }
}
