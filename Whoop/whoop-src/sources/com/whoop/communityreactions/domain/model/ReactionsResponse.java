package com.whoop.communityreactions.domain.model;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ej1.C13228a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b6\u0010\u001f¨\u0006:"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "", "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "input", "", "Lcom/whoop/communityreactions/domain/model/QuickReactionModel;", "quickReactions", "", "previewRotationSeconds", "", "previewSummaryLabel", "Lcom/whoop/design/models/DesignSystemModel;", "items", "<init>", "(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_reactions_arch_mini_release", "(Lcom/whoop/communityreactions/domain/model/ReactionsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "getInput", "Ljava/util/List;", "getQuickReactions", "Ljava/lang/Integer;", "getPreviewRotationSeconds", "Ljava/lang/String;", "getPreviewSummaryLabel", "getItems", "Companion", "$serializer", "a", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReactionsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final ReactionsInputModel input;
    private final List<DesignSystemModel> items;
    private final Integer previewRotationSeconds;
    private final String previewSummaryLabel;
    private final List<QuickReactionModel> quickReactions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.communityreactions.domain.model.ReactionsResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/ReactionsResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "serializer", "()Lwc3/c;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReactionsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C13228a(23)), null, null, AbstractC30060g.m92087G(enumC23463i, new C13228a(24))};
    }

    public /* synthetic */ ReactionsResponse(int i13, ReactionsInputModel reactionsInputModel, List list, Integer num, String str, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i13 & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 13, ReactionsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.input = reactionsInputModel;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.quickReactions = c25271y;
        } else {
            this.quickReactions = list;
        }
        this.previewRotationSeconds = num;
        this.previewSummaryLabel = str;
        if ((i13 & 16) == 0) {
            this.items = c25271y;
        } else {
            this.items = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(QuickReactionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactionsResponse copy$default(ReactionsResponse reactionsResponse, ReactionsInputModel reactionsInputModel, List list, Integer num, String str, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            reactionsInputModel = reactionsResponse.input;
        }
        if ((i13 & 2) != 0) {
            list = reactionsResponse.quickReactions;
        }
        if ((i13 & 4) != 0) {
            num = reactionsResponse.previewRotationSeconds;
        }
        if ((i13 & 8) != 0) {
            str = reactionsResponse.previewSummaryLabel;
        }
        if ((i13 & 16) != 0) {
            list2 = reactionsResponse.items;
        }
        List list3 = list2;
        Integer num2 = num;
        return reactionsResponse.copy(reactionsInputModel, list, num2, str, list3);
    }

    public static final /* synthetic */ void write$Self$community_reactions_arch_mini_release(ReactionsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, ReactionsInputModel$$serializer.INSTANCE, self.input);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.quickReactions, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.quickReactions);
        }
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.previewRotationSeconds);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.previewSummaryLabel);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.items, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ReactionsInputModel getInput() {
        return this.input;
    }

    public final List<QuickReactionModel> component2() {
        return this.quickReactions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPreviewRotationSeconds() {
        return this.previewRotationSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPreviewSummaryLabel() {
        return this.previewSummaryLabel;
    }

    public final List<DesignSystemModel> component5() {
        return this.items;
    }

    public final ReactionsResponse copy(ReactionsInputModel input, List<QuickReactionModel> quickReactions, Integer previewRotationSeconds, String previewSummaryLabel, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(quickReactions, "quickReactions");
        AbstractC22676k.m65750j(items, "items");
        return new ReactionsResponse(input, quickReactions, previewRotationSeconds, previewSummaryLabel, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionsResponse)) {
            return false;
        }
        ReactionsResponse reactionsResponse = (ReactionsResponse) other;
        return AbstractC22676k.m65745e(this.input, reactionsResponse.input) && AbstractC22676k.m65745e(this.quickReactions, reactionsResponse.quickReactions) && AbstractC22676k.m65745e(this.previewRotationSeconds, reactionsResponse.previewRotationSeconds) && AbstractC22676k.m65745e(this.previewSummaryLabel, reactionsResponse.previewSummaryLabel) && AbstractC22676k.m65745e(this.items, reactionsResponse.items);
    }

    public final ReactionsInputModel getInput() {
        return this.input;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final Integer getPreviewRotationSeconds() {
        return this.previewRotationSeconds;
    }

    public final String getPreviewSummaryLabel() {
        return this.previewSummaryLabel;
    }

    public final List<QuickReactionModel> getQuickReactions() {
        return this.quickReactions;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.input.hashCode() * 31, 31, this.quickReactions);
        Integer num = this.previewRotationSeconds;
        int iHashCode = (iM31983b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.previewSummaryLabel;
        return this.items.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        ReactionsInputModel reactionsInputModel = this.input;
        List<QuickReactionModel> list = this.quickReactions;
        Integer num = this.previewRotationSeconds;
        String str = this.previewSummaryLabel;
        List<DesignSystemModel> list2 = this.items;
        StringBuilder sb4 = new StringBuilder("ReactionsResponse(input=");
        sb4.append(reactionsInputModel);
        sb4.append(", quickReactions=");
        sb4.append(list);
        sb4.append(", previewRotationSeconds=");
        AbstractC13673n.m38577x(num, ", previewSummaryLabel=", str, ", items=", sb4);
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReactionsResponse(ReactionsInputModel input, List<QuickReactionModel> quickReactions, Integer num, String str, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(quickReactions, "quickReactions");
        AbstractC22676k.m65750j(items, "items");
        this.input = input;
        this.quickReactions = quickReactions;
        this.previewRotationSeconds = num;
        this.previewSummaryLabel = str;
        this.items = items;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReactionsResponse(ReactionsInputModel reactionsInputModel, List list, Integer num, String str, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(reactionsInputModel, i14 != 0 ? c25271y : list, num, str, (i13 & 16) != 0 ? c25271y : list2);
    }
}
