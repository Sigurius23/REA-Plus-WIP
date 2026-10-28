package com.whoop.limitedtimeoffer.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlin.C2012k;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "pillIcon", "pillTitle", "timerMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$limited_time_offer_release", "(Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/DesignSystemModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getPillIcon", "getPillTitle", "Lcom/whoop/design/models/DesignSystemModel;", "getTimerMetadata", "Companion", "$serializer", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TimerPillModel implements DesignSystemModel {
    private final String id;
    private final String pillIcon;
    private final String pillTitle;
    private final DesignSystemModel timerMetadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C2012k(7))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;", "serializer", "()Lwc3/c;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TimerPillModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TimerPillModel(int i13, String str, String str2, String str3, DesignSystemModel designSystemModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, TimerPillModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.pillIcon = str2;
        this.pillTitle = str3;
        this.timerMetadata = designSystemModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ TimerPillModel copy$default(TimerPillModel timerPillModel, String str, String str2, String str3, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = timerPillModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = timerPillModel.pillIcon;
        }
        if ((i13 & 4) != 0) {
            str3 = timerPillModel.pillTitle;
        }
        if ((i13 & 8) != 0) {
            designSystemModel = timerPillModel.timerMetadata;
        }
        return timerPillModel.copy(str, str2, str3, designSystemModel);
    }

    public static final /* synthetic */ void write$Self$limited_time_offer_release(TimerPillModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.pillIcon);
        output.encodeStringElement(serialDesc, 2, self.pillTitle);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.timerMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPillIcon() {
        return this.pillIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPillTitle() {
        return this.pillTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getTimerMetadata() {
        return this.timerMetadata;
    }

    public final TimerPillModel copy(String id4, String pillIcon, String pillTitle, DesignSystemModel timerMetadata) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pillIcon, "pillIcon");
        AbstractC22676k.m65750j(pillTitle, "pillTitle");
        return new TimerPillModel(id4, pillIcon, pillTitle, timerMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerPillModel)) {
            return false;
        }
        TimerPillModel timerPillModel = (TimerPillModel) other;
        return AbstractC22676k.m65745e(this.id, timerPillModel.id) && AbstractC22676k.m65745e(this.pillIcon, timerPillModel.pillIcon) && AbstractC22676k.m65745e(this.pillTitle, timerPillModel.pillTitle) && AbstractC22676k.m65745e(this.timerMetadata, timerPillModel.timerMetadata);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPillIcon() {
        return this.pillIcon;
    }

    public final String getPillTitle() {
        return this.pillTitle;
    }

    public final DesignSystemModel getTimerMetadata() {
        return this.timerMetadata;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.pillIcon), 31, this.pillTitle);
        DesignSystemModel designSystemModel = this.timerMetadata;
        return iM30450d + (designSystemModel == null ? 0 : designSystemModel.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pillIcon;
        String str3 = this.pillTitle;
        DesignSystemModel designSystemModel = this.timerMetadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TimerPillModel(id=", str, ", pillIcon=", str2, ", pillTitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", timerMetadata=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public TimerPillModel(String id4, String pillIcon, String pillTitle, DesignSystemModel designSystemModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(pillIcon, "pillIcon");
        AbstractC22676k.m65750j(pillTitle, "pillTitle");
        this.id = id4;
        this.pillIcon = pillIcon;
        this.pillTitle = pillTitle;
        this.timerMetadata = designSystemModel;
    }
}
