package com.whoop.clinicianintheloop.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'Jd\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'¨\u0006?"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "imageUrl", "Lcom/whoop/design/models/items/TagModel;", "endTag", "endIcon", "Lcom/whoop/navigation/e;", "destination", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/TagModel;", "component5", "component6", "()Lcom/whoop/navigation/e;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;)Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getImageUrl", "Lcom/whoop/design/models/items/TagModel;", "getEndTag", "getEndIcon", "Lcom/whoop/navigation/e;", "getDestination", "Ljava/util/List;", "getItems", "Companion", "$serializer", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VisitDetailItemModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final String endIcon;
    private final TagModel endTag;
    private final String imageUrl;
    private final List<DesignSystemModel> items;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VisitDetailItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(24)), AbstractC30060g.m92087G(enumC23463i, new C21769a(25))};
    }

    public /* synthetic */ VisitDetailItemModel(int i13, String str, String str2, String str3, TagModel tagModel, String str4, C9598e c9598e, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, VisitDetailItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.imageUrl = str3;
        this.endTag = tagModel;
        this.endIcon = str4;
        this.destination = c9598e;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisitDetailItemModel copy$default(VisitDetailItemModel visitDetailItemModel, String str, String str2, String str3, TagModel tagModel, String str4, C9598e c9598e, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = visitDetailItemModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = visitDetailItemModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = visitDetailItemModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            tagModel = visitDetailItemModel.endTag;
        }
        if ((i13 & 16) != 0) {
            str4 = visitDetailItemModel.endIcon;
        }
        if ((i13 & 32) != 0) {
            c9598e = visitDetailItemModel.destination;
        }
        if ((i13 & 64) != 0) {
            list = visitDetailItemModel.items;
        }
        C9598e c9598e2 = c9598e;
        List list2 = list;
        String str5 = str4;
        String str6 = str3;
        return visitDetailItemModel.copy(str, str2, str6, tagModel, str5, c9598e2, list2);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(VisitDetailItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 3, TagModel$$serializer.INSTANCE, self.endTag);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.endIcon);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.destination);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TagModel getEndTag() {
        return this.endTag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final List<DesignSystemModel> component7() {
        return this.items;
    }

    public final VisitDetailItemModel copy(String title, String subtitle, String imageUrl, TagModel endTag, String endIcon, C9598e destination, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(items, "items");
        return new VisitDetailItemModel(title, subtitle, imageUrl, endTag, endIcon, destination, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisitDetailItemModel)) {
            return false;
        }
        VisitDetailItemModel visitDetailItemModel = (VisitDetailItemModel) other;
        return AbstractC22676k.m65745e(this.title, visitDetailItemModel.title) && AbstractC22676k.m65745e(this.subtitle, visitDetailItemModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, visitDetailItemModel.imageUrl) && AbstractC22676k.m65745e(this.endTag, visitDetailItemModel.endTag) && AbstractC22676k.m65745e(this.endIcon, visitDetailItemModel.endIcon) && AbstractC22676k.m65745e(this.destination, visitDetailItemModel.destination) && AbstractC22676k.m65745e(this.items, visitDetailItemModel.items);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final TagModel getEndTag() {
        return this.endTag;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TagModel tagModel = this.endTag;
        int iHashCode4 = (iHashCode3 + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        String str3 = this.endIcon;
        return this.items.hashCode() + AbstractC36095b.m114673a(this.destination, (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.imageUrl;
        TagModel tagModel = this.endTag;
        String str4 = this.endIcon;
        C9598e c9598e = this.destination;
        List<DesignSystemModel> list = this.items;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VisitDetailItemModel(title=", str, ", subtitle=", str2, ", imageUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(", endTag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(", endIcon=");
        AbstractC30007c.m91827B(sbM32001t, str4, ", destination=", c9598e, ", items=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VisitDetailItemModel(String title, String str, String str2, TagModel tagModel, String str3, C9598e destination, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.subtitle = str;
        this.imageUrl = str2;
        this.endTag = tagModel;
        this.endIcon = str3;
        this.destination = destination;
        this.items = items;
    }
}
