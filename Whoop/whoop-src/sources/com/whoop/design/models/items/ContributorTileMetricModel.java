package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.EnumC23701r0;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36955b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u008a\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b@\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bA\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bB\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bE\u0010\u001aR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010%R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010'¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/items/ContributorTileMetricModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "icon", "Lcom/whoop/design/util/TextResource;", "title", NotificationCompat.CATEGORY_STATUS, "statusSubtitle", "statusIcon", "Llb1/r0;", "statusType", "metricStyle", "Lcom/whoop/navigation/e;", "destination", "", "Lcom/whoop/design/models/LegendStyle;", "barStyles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Llb1/r0;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Llb1/r0;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "component5", "component6", "component7", "()Llb1/r0;", "component8", "component9", "()Lcom/whoop/navigation/e;", "component10", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Llb1/r0;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;)Lcom/whoop/design/models/items/ContributorTileMetricModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ContributorTileMetricModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getIcon", "Lcom/whoop/design/util/TextResource;", "getTitle", "getStatus", "getStatusSubtitle", "getStatusIcon", "Llb1/r0;", "getStatusType", "getMetricStyle", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Ljava/util/List;", "getBarStyles", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContributorTileMetricModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<LegendStyle> barStyles;
    private final C9598e destination;
    private final String icon;
    private final String id;
    private final String metricStyle;
    private final TextResource status;
    private final String statusIcon;
    private final TextResource statusSubtitle;
    private final EnumC23701r0 statusType;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ContributorTileMetricModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ContributorTileMetricModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContributorTileMetricModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36955b(15)), null, AbstractC30060g.m92087G(enumC23463i, new C36955b(16)), AbstractC30060g.m92087G(enumC23463i, new C36955b(17))};
    }

    public /* synthetic */ ContributorTileMetricModel(int i13, String str, String str2, TextResource textResource, TextResource textResource2, TextResource textResource3, String str3, EnumC23701r0 enumC23701r0, String str4, C9598e c9598e, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1007 != (i13 & MessageListItemViewType.TYPING_INDICATOR)) {
            PluginExceptionsKt.throwMissingFieldException(i13, MessageListItemViewType.TYPING_INDICATOR, ContributorTileMetricModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.icon = str2;
        this.title = textResource;
        this.status = textResource2;
        if ((i13 & 16) == 0) {
            this.statusSubtitle = null;
        } else {
            this.statusSubtitle = textResource3;
        }
        this.statusIcon = str3;
        this.statusType = enumC23701r0;
        this.metricStyle = str4;
        this.destination = c9598e;
        this.barStyles = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.reducer.mapper.ContributorTileMetricStatusType", EnumC23701r0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(LegendStyle.INSTANCE.serializer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContributorTileMetricModel copy$default(ContributorTileMetricModel contributorTileMetricModel, String str, String str2, TextResource textResource, TextResource textResource2, TextResource textResource3, String str3, EnumC23701r0 enumC23701r0, String str4, C9598e c9598e, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contributorTileMetricModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = contributorTileMetricModel.icon;
        }
        if ((i13 & 4) != 0) {
            textResource = contributorTileMetricModel.title;
        }
        if ((i13 & 8) != 0) {
            textResource2 = contributorTileMetricModel.status;
        }
        if ((i13 & 16) != 0) {
            textResource3 = contributorTileMetricModel.statusSubtitle;
        }
        if ((i13 & 32) != 0) {
            str3 = contributorTileMetricModel.statusIcon;
        }
        if ((i13 & 64) != 0) {
            enumC23701r0 = contributorTileMetricModel.statusType;
        }
        if ((i13 & 128) != 0) {
            str4 = contributorTileMetricModel.metricStyle;
        }
        if ((i13 & 256) != 0) {
            c9598e = contributorTileMetricModel.destination;
        }
        if ((i13 & 512) != 0) {
            list = contributorTileMetricModel.barStyles;
        }
        C9598e c9598e2 = c9598e;
        List list2 = list;
        EnumC23701r0 enumC23701r1 = enumC23701r0;
        String str5 = str4;
        TextResource textResource4 = textResource3;
        String str6 = str3;
        return contributorTileMetricModel.copy(str, str2, textResource, textResource2, textResource4, str6, enumC23701r1, str5, c9598e2, list2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ContributorTileMetricModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.icon);
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.statusSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, c25452a, self.statusSubtitle);
        }
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.statusIcon);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.statusType);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.metricStyle);
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.barStyles);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<LegendStyle> component10() {
        return this.barStyles;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getStatusSubtitle() {
        return this.statusSubtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatusIcon() {
        return this.statusIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EnumC23701r0 getStatusType() {
        return this.statusType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMetricStyle() {
        return this.metricStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final ContributorTileMetricModel copy(String id4, String icon, TextResource title, TextResource status, TextResource statusSubtitle, String statusIcon, EnumC23701r0 statusType, String metricStyle, C9598e destination, List<? extends LegendStyle> barStyles) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        return new ContributorTileMetricModel(id4, icon, title, status, statusSubtitle, statusIcon, statusType, metricStyle, destination, barStyles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributorTileMetricModel)) {
            return false;
        }
        ContributorTileMetricModel contributorTileMetricModel = (ContributorTileMetricModel) other;
        return AbstractC22676k.m65745e(this.id, contributorTileMetricModel.id) && AbstractC22676k.m65745e(this.icon, contributorTileMetricModel.icon) && AbstractC22676k.m65745e(this.title, contributorTileMetricModel.title) && AbstractC22676k.m65745e(this.status, contributorTileMetricModel.status) && AbstractC22676k.m65745e(this.statusSubtitle, contributorTileMetricModel.statusSubtitle) && AbstractC22676k.m65745e(this.statusIcon, contributorTileMetricModel.statusIcon) && this.statusType == contributorTileMetricModel.statusType && AbstractC22676k.m65745e(this.metricStyle, contributorTileMetricModel.metricStyle) && AbstractC22676k.m65745e(this.destination, contributorTileMetricModel.destination) && AbstractC22676k.m65745e(this.barStyles, contributorTileMetricModel.barStyles);
    }

    public final List<LegendStyle> getBarStyles() {
        return this.barStyles;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMetricStyle() {
        return this.metricStyle;
    }

    public final TextResource getStatus() {
        return this.status;
    }

    public final String getStatusIcon() {
        return this.statusIcon;
    }

    public final TextResource getStatusSubtitle() {
        return this.statusSubtitle;
    }

    public final EnumC23701r0 getStatusType() {
        return this.statusType;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.title, 31), this.status, 31);
        TextResource textResource = this.statusSubtitle;
        int iHashCode2 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str3 = this.statusIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC23701r0 enumC23701r0 = this.statusType;
        int iHashCode4 = (iHashCode3 + (enumC23701r0 == null ? 0 : enumC23701r0.hashCode())) * 31;
        String str4 = this.metricStyle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode6 = (iHashCode5 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        List<LegendStyle> list = this.barStyles;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.status;
        TextResource textResource3 = this.statusSubtitle;
        String str3 = this.statusIcon;
        EnumC23701r0 enumC23701r0 = this.statusType;
        String str4 = this.metricStyle;
        C9598e c9598e = this.destination;
        List<LegendStyle> list = this.barStyles;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContributorTileMetricModel(id=", str, ", icon=", str2, ", title=");
        AbstractC30007c.m91855y(sbM32001t, textResource, ", status=", textResource2, ", statusSubtitle=");
        AbstractC30007c.m91856z(sbM32001t, textResource3, ", statusIcon=", str3, ", statusType=");
        sbM32001t.append(enumC23701r0);
        sbM32001t.append(", metricStyle=");
        sbM32001t.append(str4);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", barStyles=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContributorTileMetricModel(String str, String str2, TextResource title, TextResource status, TextResource textResource, String str3, EnumC23701r0 enumC23701r0, String str4, C9598e c9598e, List<? extends LegendStyle> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        this.id = str;
        this.icon = str2;
        this.title = title;
        this.status = status;
        this.statusSubtitle = textResource;
        this.statusIcon = str3;
        this.statusType = enumC23701r0;
        this.metricStyle = str4;
        this.destination = c9598e;
        this.barStyles = list;
    }

    public /* synthetic */ ContributorTileMetricModel(String str, String str2, TextResource textResource, TextResource textResource2, TextResource textResource3, String str3, EnumC23701r0 enumC23701r0, String str4, C9598e c9598e, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, textResource, textResource2, (i13 & 16) != 0 ? null : textResource3, str3, enumC23701r0, str4, c9598e, list);
    }
}
