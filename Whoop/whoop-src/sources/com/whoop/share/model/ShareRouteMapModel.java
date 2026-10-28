package com.whoop.share.model;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.Coordinates;
import com.whoop.design.models.items.Coordinates$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ<\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/share/model/ShareRouteMapModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "activityIconUrl", "", "Lcom/whoop/design/models/items/Coordinates;", "gpsCoordinates", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$share_release", "(Lcom/whoop/share/model/ShareRouteMapModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/whoop/share/model/ShareRouteMapModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityIconUrl", "Ljava/util/List;", "getGpsCoordinates", "getItems", "Companion", "$serializer", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShareRouteMapModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String activityIconUrl;
    private final List<Coordinates> gpsCoordinates;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/share/model/ShareRouteMapModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/share/model/ShareRouteMapModel;", "serializer", "()Lwc3/c;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShareRouteMapModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C15620a(7)), AbstractC30060g.m92087G(enumC23463i, new C15620a(8))};
    }

    public ShareRouteMapModel() {
        this((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Coordinates$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareRouteMapModel copy$default(ShareRouteMapModel shareRouteMapModel, String str, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shareRouteMapModel.activityIconUrl;
        }
        if ((i13 & 2) != 0) {
            list = shareRouteMapModel.gpsCoordinates;
        }
        if ((i13 & 4) != 0) {
            list2 = shareRouteMapModel.items;
        }
        return shareRouteMapModel.copy(str, list, list2);
    }

    public static final /* synthetic */ void write$Self$share_release(ShareRouteMapModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.activityIconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.activityIconUrl);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.gpsCoordinates, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.gpsCoordinates);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.items, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityIconUrl() {
        return this.activityIconUrl;
    }

    public final List<Coordinates> component2() {
        return this.gpsCoordinates;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    public final ShareRouteMapModel copy(String activityIconUrl, List<Coordinates> gpsCoordinates, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(gpsCoordinates, "gpsCoordinates");
        AbstractC22676k.m65750j(items, "items");
        return new ShareRouteMapModel(activityIconUrl, gpsCoordinates, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareRouteMapModel)) {
            return false;
        }
        ShareRouteMapModel shareRouteMapModel = (ShareRouteMapModel) other;
        return AbstractC22676k.m65745e(this.activityIconUrl, shareRouteMapModel.activityIconUrl) && AbstractC22676k.m65745e(this.gpsCoordinates, shareRouteMapModel.gpsCoordinates) && AbstractC22676k.m65745e(this.items, shareRouteMapModel.items);
    }

    public final String getActivityIconUrl() {
        return this.activityIconUrl;
    }

    public final List<Coordinates> getGpsCoordinates() {
        return this.gpsCoordinates;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        String str = this.activityIconUrl;
        return this.items.hashCode() + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.gpsCoordinates);
    }

    public String toString() {
        String str = this.activityIconUrl;
        List<Coordinates> list = this.gpsCoordinates;
        return AbstractC3855a.m11829m(AbstractC30802r.m94766o("ShareRouteMapModel(activityIconUrl=", str, ", gpsCoordinates=", ", items=", list), this.items, ")");
    }

    public /* synthetic */ ShareRouteMapModel(int i13, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.activityIconUrl = (i13 & 1) == 0 ? null : str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.gpsCoordinates = c25271y;
        } else {
            this.gpsCoordinates = list;
        }
        if ((i13 & 4) == 0) {
            this.items = c25271y;
        } else {
            this.items = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareRouteMapModel(String str, List<Coordinates> gpsCoordinates, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(gpsCoordinates, "gpsCoordinates");
        AbstractC22676k.m65750j(items, "items");
        this.activityIconUrl = str;
        this.gpsCoordinates = gpsCoordinates;
        this.items = items;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ShareRouteMapModel(String str, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? null : str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2);
    }
}
