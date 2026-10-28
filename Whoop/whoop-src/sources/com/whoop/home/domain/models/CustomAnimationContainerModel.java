package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
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
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JP\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/home/domain/models/CustomAnimationContainerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "key", "", "finalIndex", "initial", "completed", "Lcom/whoop/home/domain/models/ContainerBorderStyle;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/CustomAnimationContainerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Lcom/whoop/design/models/DesignSystemModel;", "component5", "component6", "()Lcom/whoop/home/domain/models/ContainerBorderStyle;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/home/domain/models/ContainerBorderStyle;)Lcom/whoop/home/domain/models/CustomAnimationContainerModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getKey", "I", "getFinalIndex", "Lcom/whoop/design/models/DesignSystemModel;", "getInitial", "getCompleted", "Lcom/whoop/home/domain/models/ContainerBorderStyle;", "getStyle", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomAnimationContainerModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final DesignSystemModel completed;
    private final int finalIndex;
    private final String id;
    private final DesignSystemModel initial;
    private final String key;
    private final ContainerBorderStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/CustomAnimationContainerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/CustomAnimationContainerModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomAnimationContainerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C39434a(16)), AbstractC30060g.m92087G(enumC23463i, new C39434a(17)), AbstractC30060g.m92087G(enumC23463i, new C39434a(18))};
    }

    public /* synthetic */ CustomAnimationContainerModel(int i13, String str, String str2, int i14, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, ContainerBorderStyle containerBorderStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, CustomAnimationContainerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.key = str2;
        this.finalIndex = i14;
        this.initial = designSystemModel;
        this.completed = designSystemModel2;
        if ((i13 & 32) == 0) {
            this.style = ContainerBorderStyle.ONBOARDING;
        } else {
            this.style = containerBorderStyle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.home.domain.models.ContainerBorderStyle", ContainerBorderStyle.values());
    }

    public static /* synthetic */ CustomAnimationContainerModel copy$default(CustomAnimationContainerModel customAnimationContainerModel, String str, String str2, int i13, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, ContainerBorderStyle containerBorderStyle, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = customAnimationContainerModel.id;
        }
        if ((i14 & 2) != 0) {
            str2 = customAnimationContainerModel.key;
        }
        if ((i14 & 4) != 0) {
            i13 = customAnimationContainerModel.finalIndex;
        }
        if ((i14 & 8) != 0) {
            designSystemModel = customAnimationContainerModel.initial;
        }
        if ((i14 & 16) != 0) {
            designSystemModel2 = customAnimationContainerModel.completed;
        }
        if ((i14 & 32) != 0) {
            containerBorderStyle = customAnimationContainerModel.style;
        }
        DesignSystemModel designSystemModel3 = designSystemModel2;
        ContainerBorderStyle containerBorderStyle2 = containerBorderStyle;
        return customAnimationContainerModel.copy(str, str2, i13, designSystemModel, designSystemModel3, containerBorderStyle2);
    }

    public static final /* synthetic */ void write$Self$home_release(CustomAnimationContainerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.key);
        output.encodeIntElement(serialDesc, 2, self.finalIndex);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.initial);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.completed);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.style == ContainerBorderStyle.ONBOARDING) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFinalIndex() {
        return this.finalIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getInitial() {
        return this.initial;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ContainerBorderStyle getStyle() {
        return this.style;
    }

    public final CustomAnimationContainerModel copy(String id4, String key, int finalIndex, DesignSystemModel initial, DesignSystemModel completed, ContainerBorderStyle style) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(style, "style");
        return new CustomAnimationContainerModel(id4, key, finalIndex, initial, completed, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAnimationContainerModel)) {
            return false;
        }
        CustomAnimationContainerModel customAnimationContainerModel = (CustomAnimationContainerModel) other;
        return AbstractC22676k.m65745e(this.id, customAnimationContainerModel.id) && AbstractC22676k.m65745e(this.key, customAnimationContainerModel.key) && this.finalIndex == customAnimationContainerModel.finalIndex && AbstractC22676k.m65745e(this.initial, customAnimationContainerModel.initial) && AbstractC22676k.m65745e(this.completed, customAnimationContainerModel.completed) && this.style == customAnimationContainerModel.style;
    }

    public final DesignSystemModel getCompleted() {
        return this.completed;
    }

    public final int getFinalIndex() {
        return this.finalIndex;
    }

    public final String getId() {
        return this.id;
    }

    public final DesignSystemModel getInitial() {
        return this.initial;
    }

    public final String getKey() {
        return this.key;
    }

    public final ContainerBorderStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.finalIndex, AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.key), 31);
        DesignSystemModel designSystemModel = this.initial;
        int iHashCode = (iM30448b + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        DesignSystemModel designSystemModel2 = this.completed;
        return this.style.hashCode() + ((iHashCode + (designSystemModel2 != null ? designSystemModel2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.key;
        int i13 = this.finalIndex;
        DesignSystemModel designSystemModel = this.initial;
        DesignSystemModel designSystemModel2 = this.completed;
        ContainerBorderStyle containerBorderStyle = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CustomAnimationContainerModel(id=", str, ", key=", str2, ", finalIndex=");
        sbM32001t.append(i13);
        sbM32001t.append(", initial=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", completed=");
        sbM32001t.append(designSystemModel2);
        sbM32001t.append(", style=");
        sbM32001t.append(containerBorderStyle);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CustomAnimationContainerModel(String id4, String key, int i13, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, ContainerBorderStyle style) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.key = key;
        this.finalIndex = i13;
        this.initial = designSystemModel;
        this.completed = designSystemModel2;
        this.style = style;
    }

    public /* synthetic */ CustomAnimationContainerModel(String str, String str2, int i13, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, ContainerBorderStyle containerBorderStyle, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i13, designSystemModel, designSystemModel2, (i14 & 32) != 0 ? ContainerBorderStyle.ONBOARDING : containerBorderStyle);
    }
}
