package com.whoop.clinicianintheloop.api;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/design/models/ProgressButtonModel;", "progressButton", "", "backgroundImageUrl", "Ly81/f;", "gradientColor", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ly81/f;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ly81/f;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/ProgressButtonModel;", "component3", "()Ljava/lang/String;", "component4", "()Ly81/f;", "copy", "(Ljava/util/List;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ly81/f;)Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressButton", "Ljava/lang/String;", "getBackgroundImageUrl", "Ly81/f;", "getGradientColor", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SchedulingConfirmationResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String backgroundImageUrl;
    private final EnumC39333f gradientColor;
    private final List<DesignSystemModel> items;
    private final ProgressButtonModel progressButton;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.SchedulingConfirmationResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SchedulingConfirmationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C15999a(13)), null, null, AbstractC30060g.m92087G(enumC23463i, new C15999a(14))};
    }

    public /* synthetic */ SchedulingConfirmationResponse(int i13, List list, ProgressButtonModel progressButtonModel, String str, EnumC39333f enumC39333f, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SchedulingConfirmationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        this.progressButton = progressButtonModel;
        if ((i13 & 4) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str;
        }
        if ((i13 & 8) == 0) {
            this.gradientColor = null;
        } else {
            this.gradientColor = enumC39333f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchedulingConfirmationResponse copy$default(SchedulingConfirmationResponse schedulingConfirmationResponse, List list, ProgressButtonModel progressButtonModel, String str, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = schedulingConfirmationResponse.items;
        }
        if ((i13 & 2) != 0) {
            progressButtonModel = schedulingConfirmationResponse.progressButton;
        }
        if ((i13 & 4) != 0) {
            str = schedulingConfirmationResponse.backgroundImageUrl;
        }
        if ((i13 & 8) != 0) {
            enumC39333f = schedulingConfirmationResponse.gradientColor;
        }
        return schedulingConfirmationResponse.copy(list, progressButtonModel, str, enumC39333f);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(SchedulingConfirmationResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.items);
        output.encodeSerializableElement(serialDesc, 1, ProgressButtonModel$$serializer.INSTANCE, self.progressButton);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.backgroundImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.backgroundImageUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.gradientColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.gradientColor);
    }

    public final List<DesignSystemModel> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC39333f getGradientColor() {
        return this.gradientColor;
    }

    public final SchedulingConfirmationResponse copy(List<? extends DesignSystemModel> items, ProgressButtonModel progressButton, String backgroundImageUrl, EnumC39333f gradientColor) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(progressButton, "progressButton");
        return new SchedulingConfirmationResponse(items, progressButton, backgroundImageUrl, gradientColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulingConfirmationResponse)) {
            return false;
        }
        SchedulingConfirmationResponse schedulingConfirmationResponse = (SchedulingConfirmationResponse) other;
        return AbstractC22676k.m65745e(this.items, schedulingConfirmationResponse.items) && AbstractC22676k.m65745e(this.progressButton, schedulingConfirmationResponse.progressButton) && AbstractC22676k.m65745e(this.backgroundImageUrl, schedulingConfirmationResponse.backgroundImageUrl) && this.gradientColor == schedulingConfirmationResponse.gradientColor;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final EnumC39333f getGradientColor() {
        return this.gradientColor;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    public int hashCode() {
        int iHashCode = (this.progressButton.hashCode() + (this.items.hashCode() * 31)) * 31;
        String str = this.backgroundImageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC39333f enumC39333f = this.gradientColor;
        return iHashCode2 + (enumC39333f != null ? enumC39333f.hashCode() : 0);
    }

    public String toString() {
        return "SchedulingConfirmationResponse(items=" + this.items + ", progressButton=" + this.progressButton + ", backgroundImageUrl=" + this.backgroundImageUrl + ", gradientColor=" + this.gradientColor + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SchedulingConfirmationResponse(List<? extends DesignSystemModel> items, ProgressButtonModel progressButton, String str, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(progressButton, "progressButton");
        this.items = items;
        this.progressButton = progressButton;
        this.backgroundImageUrl = str;
        this.gradientColor = enumC39333f;
    }

    public /* synthetic */ SchedulingConfirmationResponse(List list, ProgressButtonModel progressButtonModel, String str, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, progressButtonModel, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : enumC39333f);
    }
}
