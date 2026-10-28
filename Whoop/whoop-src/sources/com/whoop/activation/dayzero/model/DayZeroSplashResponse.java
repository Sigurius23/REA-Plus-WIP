package com.whoop.activation.dayzero.model;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
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
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import yo0.C39681c;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "footer", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "getFooter", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "$serializer", "a", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DayZeroSplashResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final AnalyticEventModel analyticEvent;
    private final List<DesignSystemModel> footer;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.activation.dayzero.model.DayZeroSplashResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DayZeroSplashResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C39681c(23)), AbstractC30060g.m92087G(enumC23463i, new C39681c(24)), null};
    }

    public DayZeroSplashResponse() {
        this((List) null, (List) null, (AnalyticEventModel) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DayZeroSplashResponse copy$default(DayZeroSplashResponse dayZeroSplashResponse, List list, List list2, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = dayZeroSplashResponse.items;
        }
        if ((i13 & 2) != 0) {
            list2 = dayZeroSplashResponse.footer;
        }
        if ((i13 & 4) != 0) {
            analyticEventModel = dayZeroSplashResponse.analyticEvent;
        }
        return dayZeroSplashResponse.copy(list, list2, analyticEventModel);
    }

    public static final /* synthetic */ void write$Self$activation_release(DayZeroSplashResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 0);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.items, c25271y)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.footer, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.footer);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.analyticEvent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
    }

    public final List<DesignSystemModel> component1() {
        return this.items;
    }

    public final List<DesignSystemModel> component2() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final DayZeroSplashResponse copy(List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> footer, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(footer, "footer");
        return new DayZeroSplashResponse(items, footer, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayZeroSplashResponse)) {
            return false;
        }
        DayZeroSplashResponse dayZeroSplashResponse = (DayZeroSplashResponse) other;
        return AbstractC22676k.m65745e(this.items, dayZeroSplashResponse.items) && AbstractC22676k.m65745e(this.footer, dayZeroSplashResponse.footer) && AbstractC22676k.m65745e(this.analyticEvent, dayZeroSplashResponse.analyticEvent);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> getFooter() {
        return this.footer;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.items.hashCode() * 31, 31, this.footer);
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iM31983b + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
    }

    public String toString() {
        List<DesignSystemModel> list = this.items;
        List<DesignSystemModel> list2 = this.footer;
        return AbstractC38963t7.m124378h(AbstractC38963t7.m124380j("DayZeroSplashResponse(items=", ", footer=", list, ", analyticEvent=", list2), this.analyticEvent, ")");
    }

    public /* synthetic */ DayZeroSplashResponse(int i13, List list, List list2, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.items = c25271y;
        } else {
            this.items = list;
        }
        if ((i13 & 2) == 0) {
            this.footer = c25271y;
        } else {
            this.footer = list2;
        }
        if ((i13 & 4) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DayZeroSplashResponse(List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> footer, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(footer, "footer");
        this.items = items;
        this.footer = footer;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DayZeroSplashResponse(List list, List list2, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, (i13 & 4) != 0 ? null : analyticEventModel);
    }
}
