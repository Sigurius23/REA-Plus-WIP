package com.whoop.design.models.items;

import com.whoop.design.atomic.organism.historylistitem.HistoryListItemStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36958e;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u009a\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b@\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\bA\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bB\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bC\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bH\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bI\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010(¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/items/HistoryListItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "subtitle", "trailingText", "leftIcon", "imageUrl", "rightIcon", "Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;", "style", "Lcom/whoop/navigation/e;", "destination", "warning", "caption", "Lcom/whoop/design/models/items/HistoryListItemExpandedContentModel;", "expandedContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HistoryListItemExpandedContentModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HistoryListItemExpandedContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;", "component9", "()Lcom/whoop/navigation/e;", "component10", "component11", "component12", "()Lcom/whoop/design/models/items/HistoryListItemExpandedContentModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HistoryListItemExpandedContentModel;)Lcom/whoop/design/models/items/HistoryListItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HistoryListItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getTrailingText", "getLeftIcon", "getImageUrl", "getRightIcon", "Lcom/whoop/design/atomic/organism/historylistitem/HistoryListItemStyle;", "getStyle", "Lcom/whoop/navigation/e;", "getDestination", "getWarning", "getCaption", "Lcom/whoop/design/models/items/HistoryListItemExpandedContentModel;", "getExpandedContent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HistoryListItemModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String caption;
    private final C9598e destination;
    private final HistoryListItemExpandedContentModel expandedContent;
    private final String id;
    private final String imageUrl;
    private final String leftIcon;
    private final String rightIcon;
    private final HistoryListItemStyle style;
    private final String subtitle;
    private final String title;
    private final String trailingText;
    private final String warning;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HistoryListItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HistoryListItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HistoryListItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36958e(21)), AbstractC30060g.m92087G(enumC23463i, new C36958e(22)), null, null, null};
    }

    public /* synthetic */ HistoryListItemModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, HistoryListItemStyle historyListItemStyle, C9598e c9598e, String str8, String str9, HistoryListItemExpandedContentModel historyListItemExpandedContentModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (3967 != (i13 & 3967)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3967, HistoryListItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.trailingText = str4;
        this.leftIcon = str5;
        this.imageUrl = str6;
        this.rightIcon = str7;
        if ((i13 & 128) == 0) {
            this.style = HistoryListItemStyle.DEFAULT;
        } else {
            this.style = historyListItemStyle;
        }
        this.destination = c9598e;
        this.warning = str8;
        this.caption = str9;
        this.expandedContent = historyListItemExpandedContentModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return HistoryListItemStyle.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ HistoryListItemModel copy$default(HistoryListItemModel historyListItemModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, HistoryListItemStyle historyListItemStyle, C9598e c9598e, String str8, String str9, HistoryListItemExpandedContentModel historyListItemExpandedContentModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = historyListItemModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = historyListItemModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = historyListItemModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = historyListItemModel.trailingText;
        }
        if ((i13 & 16) != 0) {
            str5 = historyListItemModel.leftIcon;
        }
        if ((i13 & 32) != 0) {
            str6 = historyListItemModel.imageUrl;
        }
        if ((i13 & 64) != 0) {
            str7 = historyListItemModel.rightIcon;
        }
        if ((i13 & 128) != 0) {
            historyListItemStyle = historyListItemModel.style;
        }
        if ((i13 & 256) != 0) {
            c9598e = historyListItemModel.destination;
        }
        if ((i13 & 512) != 0) {
            str8 = historyListItemModel.warning;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str9 = historyListItemModel.caption;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            historyListItemExpandedContentModel = historyListItemModel.expandedContent;
        }
        String str10 = str9;
        HistoryListItemExpandedContentModel historyListItemExpandedContentModel2 = historyListItemExpandedContentModel;
        C9598e c9598e2 = c9598e;
        String str11 = str8;
        String str12 = str7;
        HistoryListItemStyle historyListItemStyle2 = historyListItemStyle;
        String str13 = str5;
        String str14 = str6;
        return historyListItemModel.copy(str, str2, str3, str4, str13, str14, str12, historyListItemStyle2, c9598e2, str11, str10, historyListItemExpandedContentModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HistoryListItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.trailingText);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.leftIcon);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.rightIcon);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.style != HistoryListItemStyle.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.style);
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.warning);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.caption);
        output.encodeNullableSerializableElement(serialDesc, 11, HistoryListItemExpandedContentModel$$serializer.INSTANCE, self.expandedContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final HistoryListItemExpandedContentModel getExpandedContent() {
        return this.expandedContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrailingText() {
        return this.trailingText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HistoryListItemStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final HistoryListItemModel copy(String id4, String title, String subtitle, String trailingText, String leftIcon, String imageUrl, String rightIcon, HistoryListItemStyle style, C9598e destination, String warning, String caption, HistoryListItemExpandedContentModel expandedContent) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        return new HistoryListItemModel(id4, title, subtitle, trailingText, leftIcon, imageUrl, rightIcon, style, destination, warning, caption, expandedContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryListItemModel)) {
            return false;
        }
        HistoryListItemModel historyListItemModel = (HistoryListItemModel) other;
        return AbstractC22676k.m65745e(this.id, historyListItemModel.id) && AbstractC22676k.m65745e(this.title, historyListItemModel.title) && AbstractC22676k.m65745e(this.subtitle, historyListItemModel.subtitle) && AbstractC22676k.m65745e(this.trailingText, historyListItemModel.trailingText) && AbstractC22676k.m65745e(this.leftIcon, historyListItemModel.leftIcon) && AbstractC22676k.m65745e(this.imageUrl, historyListItemModel.imageUrl) && AbstractC22676k.m65745e(this.rightIcon, historyListItemModel.rightIcon) && this.style == historyListItemModel.style && AbstractC22676k.m65745e(this.destination, historyListItemModel.destination) && AbstractC22676k.m65745e(this.warning, historyListItemModel.warning) && AbstractC22676k.m65745e(this.caption, historyListItemModel.caption) && AbstractC22676k.m65745e(this.expandedContent, historyListItemModel.expandedContent);
    }

    public final String getCaption() {
        return this.caption;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final HistoryListItemExpandedContentModel getExpandedContent() {
        return this.expandedContent;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final HistoryListItemStyle getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrailingText() {
        return this.trailingText;
    }

    public final String getWarning() {
        return this.warning;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trailingText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leftIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rightIcon;
        int iHashCode5 = (this.style.hashCode() + ((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        C9598e c9598e = this.destination;
        int iHashCode6 = (iHashCode5 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str6 = this.warning;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.caption;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        HistoryListItemExpandedContentModel historyListItemExpandedContentModel = this.expandedContent;
        return iHashCode8 + (historyListItemExpandedContentModel != null ? historyListItemExpandedContentModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.trailingText;
        String str5 = this.leftIcon;
        String str6 = this.imageUrl;
        String str7 = this.rightIcon;
        HistoryListItemStyle historyListItemStyle = this.style;
        C9598e c9598e = this.destination;
        String str8 = this.warning;
        String str9 = this.caption;
        HistoryListItemExpandedContentModel historyListItemExpandedContentModel = this.expandedContent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HistoryListItemModel(id=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", trailingText=", str4, ", leftIcon=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", imageUrl=", str6, ", rightIcon=");
        sbM32001t.append(str7);
        sbM32001t.append(", style=");
        sbM32001t.append(historyListItemStyle);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", warning=");
        sbM32001t.append(str8);
        sbM32001t.append(", caption=");
        sbM32001t.append(str9);
        sbM32001t.append(", expandedContent=");
        sbM32001t.append(historyListItemExpandedContentModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HistoryListItemModel(String id4, String title, String str, String str2, String str3, String str4, String str5, HistoryListItemStyle style, C9598e c9598e, String str6, String str7, HistoryListItemExpandedContentModel historyListItemExpandedContentModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.title = title;
        this.subtitle = str;
        this.trailingText = str2;
        this.leftIcon = str3;
        this.imageUrl = str4;
        this.rightIcon = str5;
        this.style = style;
        this.destination = c9598e;
        this.warning = str6;
        this.caption = str7;
        this.expandedContent = historyListItemExpandedContentModel;
    }

    public /* synthetic */ HistoryListItemModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, HistoryListItemStyle historyListItemStyle, C9598e c9598e, String str8, String str9, HistoryListItemExpandedContentModel historyListItemExpandedContentModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i13 & 128) != 0 ? HistoryListItemStyle.DEFAULT : historyListItemStyle, c9598e, str8, str9, historyListItemExpandedContentModel);
    }
}
