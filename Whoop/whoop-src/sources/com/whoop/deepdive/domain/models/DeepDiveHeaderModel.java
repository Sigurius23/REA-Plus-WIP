package com.whoop.deepdive.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlin.C2012k;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;", "", "", "title", "endIcon", "Lcom/whoop/design/models/DesignSystemModel;", "endItem", "deepDiveScoreType", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$deep_dive_release", "(Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/DesignSystemModel;", "component4", "component5", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getEndIcon", "Lcom/whoop/design/models/DesignSystemModel;", "getEndItem", "getDeepDiveScoreType", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DeepDiveHeaderModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String deepDiveScoreType;
    private final C9598e destination;
    private final String endIcon;
    private final DesignSystemModel endItem;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;", "serializer", "()Lwc3/c;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DeepDiveHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C2012k(17)), null, AbstractC30060g.m92087G(enumC23463i, new C2012k(18))};
    }

    public /* synthetic */ DeepDiveHeaderModel(int i13, String str, String str2, DesignSystemModel designSystemModel, String str3, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (25 != (i13 & 25)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 25, DeepDiveHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = str2;
        }
        if ((i13 & 4) == 0) {
            this.endItem = null;
        } else {
            this.endItem = designSystemModel;
        }
        this.deepDiveScoreType = str3;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ DeepDiveHeaderModel copy$default(DeepDiveHeaderModel deepDiveHeaderModel, String str, String str2, DesignSystemModel designSystemModel, String str3, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = deepDiveHeaderModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = deepDiveHeaderModel.endIcon;
        }
        if ((i13 & 4) != 0) {
            designSystemModel = deepDiveHeaderModel.endItem;
        }
        if ((i13 & 8) != 0) {
            str3 = deepDiveHeaderModel.deepDiveScoreType;
        }
        if ((i13 & 16) != 0) {
            c9598e = deepDiveHeaderModel.destination;
        }
        C9598e c9598e2 = c9598e;
        DesignSystemModel designSystemModel2 = designSystemModel;
        return deepDiveHeaderModel.copy(str, str2, designSystemModel2, str3, c9598e2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$deep_dive_release(DeepDiveHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.endIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.endIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.endItem != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.endItem);
        }
        output.encodeStringElement(serialDesc, 3, self.deepDiveScoreType);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DesignSystemModel getEndItem() {
        return this.endItem;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeepDiveScoreType() {
        return this.deepDiveScoreType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final DeepDiveHeaderModel copy(String title, String endIcon, DesignSystemModel endItem, String deepDiveScoreType, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(deepDiveScoreType, "deepDiveScoreType");
        AbstractC22676k.m65750j(destination, "destination");
        return new DeepDiveHeaderModel(title, endIcon, endItem, deepDiveScoreType, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepDiveHeaderModel)) {
            return false;
        }
        DeepDiveHeaderModel deepDiveHeaderModel = (DeepDiveHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, deepDiveHeaderModel.title) && AbstractC22676k.m65745e(this.endIcon, deepDiveHeaderModel.endIcon) && AbstractC22676k.m65745e(this.endItem, deepDiveHeaderModel.endItem) && AbstractC22676k.m65745e(this.deepDiveScoreType, deepDiveHeaderModel.deepDiveScoreType) && AbstractC22676k.m65745e(this.destination, deepDiveHeaderModel.destination);
    }

    public final String getDeepDiveScoreType() {
        return this.deepDiveScoreType;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final DesignSystemModel getEndItem() {
        return this.endItem;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.endIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.endItem;
        return this.destination.hashCode() + AbstractC11266d.m30450d((iHashCode2 + (designSystemModel != null ? designSystemModel.hashCode() : 0)) * 31, 31, this.deepDiveScoreType);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.endIcon;
        DesignSystemModel designSystemModel = this.endItem;
        String str3 = this.deepDiveScoreType;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DeepDiveHeaderModel(title=", str, ", endIcon=", str2, ", endItem=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", deepDiveScoreType=");
        sbM32001t.append(str3);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public DeepDiveHeaderModel(String title, String str, DesignSystemModel designSystemModel, String deepDiveScoreType, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(deepDiveScoreType, "deepDiveScoreType");
        AbstractC22676k.m65750j(destination, "destination");
        this.title = title;
        this.endIcon = str;
        this.endItem = designSystemModel;
        this.deepDiveScoreType = deepDiveScoreType;
        this.destination = destination;
    }

    public /* synthetic */ DeepDiveHeaderModel(String str, String str2, DesignSystemModel designSystemModel, String str3, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : designSystemModel, str3, c9598e);
    }
}
