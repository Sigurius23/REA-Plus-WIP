package com.whoop.health.monitor.medical.domain.model;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p031b9.AbstractC2875y;
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
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "header", "", "error", "", "items", "<init>", "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$kennel_release", "(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "getHeader", "Z", "getError", "Ljava/util/List;", "getItems", "Companion", "$serializer", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabradorEnabledCardModel implements DesignSystemModel {
    private final boolean error;
    private final SamdCardHeaderModel header;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(4))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;", "serializer", "()Lwc3/c;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabradorEnabledCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LabradorEnabledCardModel() {
        this((SamdCardHeaderModel) null, false, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabradorEnabledCardModel copy$default(LabradorEnabledCardModel labradorEnabledCardModel, SamdCardHeaderModel samdCardHeaderModel, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            samdCardHeaderModel = labradorEnabledCardModel.header;
        }
        if ((i13 & 2) != 0) {
            z4 = labradorEnabledCardModel.error;
        }
        if ((i13 & 4) != 0) {
            list = labradorEnabledCardModel.items;
        }
        return labradorEnabledCardModel.copy(samdCardHeaderModel, z4, list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static final /* synthetic */ void write$Self$kennel_release(LabradorEnabledCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, SamdCardHeaderModel$$serializer.INSTANCE, self.header);
        } else {
            if (!AbstractC22676k.m65745e(self.header, new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 0, SamdCardHeaderModel$$serializer.INSTANCE, self.header);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.error) {
            output.encodeBooleanElement(serialDesc, 1, self.error);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SamdCardHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    public final LabradorEnabledCardModel copy(SamdCardHeaderModel header, boolean error, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        return new LabradorEnabledCardModel(header, error, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabradorEnabledCardModel)) {
            return false;
        }
        LabradorEnabledCardModel labradorEnabledCardModel = (LabradorEnabledCardModel) other;
        return AbstractC22676k.m65745e(this.header, labradorEnabledCardModel.header) && this.error == labradorEnabledCardModel.error && AbstractC22676k.m65745e(this.items, labradorEnabledCardModel.items);
    }

    public final boolean getError() {
        return this.error;
    }

    public final SamdCardHeaderModel getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC2875y.m8289b(this.header.hashCode() * 31, 31, this.error);
    }

    public String toString() {
        SamdCardHeaderModel samdCardHeaderModel = this.header;
        boolean z4 = this.error;
        List<DesignSystemModel> list = this.items;
        StringBuilder sb4 = new StringBuilder("LabradorEnabledCardModel(header=");
        sb4.append(samdCardHeaderModel);
        sb4.append(", error=");
        sb4.append(z4);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public /* synthetic */ LabradorEnabledCardModel(int i13, SamdCardHeaderModel samdCardHeaderModel, boolean z4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.header = new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.header = samdCardHeaderModel;
        }
        if ((i13 & 2) == 0) {
            this.error = false;
        } else {
            this.error = z4;
        }
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LabradorEnabledCardModel(SamdCardHeaderModel header, boolean z4, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(items, "items");
        this.header = header;
        this.error = z4;
        this.items = items;
    }

    public /* synthetic */ LabradorEnabledCardModel(SamdCardHeaderModel samdCardHeaderModel, boolean z4, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            samdCardHeaderModel = new SamdCardHeaderModel((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null);
        }
        this(samdCardHeaderModel, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
