package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import t42.C33538a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0002hgB³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dBÇ\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b:\u0010;JÔ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010#J\u0010\u0010?\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020\u00112\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DJ'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010N\u001a\u0004\bP\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\bQ\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bR\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bS\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010T\u001a\u0004\bU\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\bW\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010X\u001a\u0004\bY\u0010-R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\b[\u0010/R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b\\\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010]\u001a\u0004\b\u0012\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\b^\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00105R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010a\u001a\u0004\bb\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\bd\u00109R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010e\u001a\u0004\bf\u0010;¨\u0006i"}, m65681d2 = {"Lcom/whoop/design/models/cards/ButtonCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "body", "imageUrl", "imageUrlAlignment", "", "imageSize", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "Lcom/whoop/design/models/items/TagModel;", "tag", "", "items", "expandedItems", "", "isExpanded", "dismissIcon", "Lcom/whoop/whoopaction/domain/models/Action;", "dismissAction", "Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;", "style", "Lcom/whoop/design/models/cards/ButtonCardPriceModel;", "price", "Ly81/f;", "titleColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()Lcom/whoop/design/models/items/CardButtonModel;", "component8", "()Lcom/whoop/design/models/items/TagModel;", "component9", "()Ljava/util/List;", "component10", "component11", "()Ljava/lang/Boolean;", "component12", "component13", "()Lcom/whoop/whoopaction/domain/models/Action;", "component14", "()Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;", "component15", "()Lcom/whoop/design/models/cards/ButtonCardPriceModel;", "component16", "()Ly81/f;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;Lcom/whoop/design/models/cards/ButtonCardPriceModel;Ly81/f;)Lcom/whoop/design/models/cards/ButtonCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/ButtonCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getBody", "getImageUrl", "getImageUrlAlignment", "Ljava/lang/Integer;", "getImageSize", "Lcom/whoop/design/models/items/CardButtonModel;", "getButton", "Lcom/whoop/design/models/items/TagModel;", "getTag", "Ljava/util/List;", "getItems", "getExpandedItems", "Ljava/lang/Boolean;", "getDismissIcon", "Lcom/whoop/whoopaction/domain/models/Action;", "getDismissAction", "Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;", "getStyle", "Lcom/whoop/design/models/cards/ButtonCardPriceModel;", "getPrice", "Ly81/f;", "getTitleColor", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ButtonCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String body;
    private final CardButtonModel button;
    private final Action dismissAction;
    private final String dismissIcon;
    private final List<DesignSystemModel> expandedItems;
    private final String id;
    private final Integer imageSize;
    private final String imageUrl;
    private final String imageUrlAlignment;
    private final Boolean isExpanded;
    private final List<DesignSystemModel> items;
    private final ButtonCardPriceModel price;
    private final ButtonCardStyleDtoEnum style;
    private final TagModel tag;
    private final String title;
    private final EnumC39333f titleColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/ButtonCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/ButtonCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ButtonCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(2)), AbstractC30060g.m92087G(enumC23463i, new C33538a(3)), null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(4)), AbstractC30060g.m92087G(enumC23463i, new C33538a(5)), null, AbstractC30060g.m92087G(enumC23463i, new C33538a(6))};
    }

    public /* synthetic */ ButtonCardModel(int i13, String str, String str2, String str3, String str4, String str5, Integer num, CardButtonModel cardButtonModel, TagModel tagModel, List list, List list2, Boolean bool, String str6, Action action, ButtonCardStyleDtoEnum buttonCardStyleDtoEnum, ButtonCardPriceModel buttonCardPriceModel, EnumC39333f enumC39333f, SerializationConstructorMarker serializationConstructorMarker) {
        if (8159 != (i13 & 8159)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 8159, ButtonCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.body = str3;
        this.imageUrl = str4;
        this.imageUrlAlignment = str5;
        if ((i13 & 32) == 0) {
            this.imageSize = null;
        } else {
            this.imageSize = num;
        }
        this.button = cardButtonModel;
        this.tag = tagModel;
        this.items = list;
        this.expandedItems = list2;
        this.isExpanded = bool;
        this.dismissIcon = str6;
        this.dismissAction = action;
        this.style = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? ButtonCardStyleDtoEnum.DEFAULT : buttonCardStyleDtoEnum;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.price = null;
        } else {
            this.price = buttonCardPriceModel;
        }
        if ((i13 & 32768) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = enumC39333f;
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.cards.ButtonCardStyleDtoEnum", ButtonCardStyleDtoEnum.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    public static final /* synthetic */ void write$Self$design_models_release(ButtonCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.body);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.imageUrlAlignment);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.imageSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.imageSize);
        }
        output.encodeNullableSerializableElement(serialDesc, 6, CardButtonModel$$serializer.INSTANCE, self.button);
        output.encodeNullableSerializableElement(serialDesc, 7, TagModel$$serializer.INSTANCE, self.tag);
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.expandedItems);
        output.encodeNullableSerializableElement(serialDesc, 10, BooleanSerializer.INSTANCE, self.isExpanded);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.dismissIcon);
        output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.dismissAction);
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.style != ButtonCardStyleDtoEnum.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.price != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, ButtonCardPriceModel$$serializer.INSTANCE, self.price);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && self.titleColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 15, (InterfaceC37145j) interfaceC23462hArr[15].getValue(), self.titleColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> component10() {
        return this.expandedItems;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDismissIcon() {
        return this.dismissIcon;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Action getDismissAction() {
        return this.dismissAction;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ButtonCardStyleDtoEnum getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ButtonCardPriceModel getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrlAlignment() {
        return this.imageUrlAlignment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getImageSize() {
        return this.imageSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CardButtonModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    public final List<DesignSystemModel> component9() {
        return this.items;
    }

    public final ButtonCardModel copy(String id4, String title, String body, String imageUrl, String imageUrlAlignment, Integer imageSize, CardButtonModel button, TagModel tag, List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> expandedItems, Boolean isExpanded, String dismissIcon, Action dismissAction, ButtonCardStyleDtoEnum style, ButtonCardPriceModel price, EnumC39333f titleColor) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(style, "style");
        return new ButtonCardModel(id4, title, body, imageUrl, imageUrlAlignment, imageSize, button, tag, items, expandedItems, isExpanded, dismissIcon, dismissAction, style, price, titleColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonCardModel)) {
            return false;
        }
        ButtonCardModel buttonCardModel = (ButtonCardModel) other;
        return AbstractC22676k.m65745e(this.id, buttonCardModel.id) && AbstractC22676k.m65745e(this.title, buttonCardModel.title) && AbstractC22676k.m65745e(this.body, buttonCardModel.body) && AbstractC22676k.m65745e(this.imageUrl, buttonCardModel.imageUrl) && AbstractC22676k.m65745e(this.imageUrlAlignment, buttonCardModel.imageUrlAlignment) && AbstractC22676k.m65745e(this.imageSize, buttonCardModel.imageSize) && AbstractC22676k.m65745e(this.button, buttonCardModel.button) && AbstractC22676k.m65745e(this.tag, buttonCardModel.tag) && AbstractC22676k.m65745e(this.items, buttonCardModel.items) && AbstractC22676k.m65745e(this.expandedItems, buttonCardModel.expandedItems) && AbstractC22676k.m65745e(this.isExpanded, buttonCardModel.isExpanded) && AbstractC22676k.m65745e(this.dismissIcon, buttonCardModel.dismissIcon) && AbstractC22676k.m65745e(this.dismissAction, buttonCardModel.dismissAction) && this.style == buttonCardModel.style && AbstractC22676k.m65745e(this.price, buttonCardModel.price) && this.titleColor == buttonCardModel.titleColor;
    }

    public final String getBody() {
        return this.body;
    }

    public final CardButtonModel getButton() {
        return this.button;
    }

    public final Action getDismissAction() {
        return this.dismissAction;
    }

    public final String getDismissIcon() {
        return this.dismissIcon;
    }

    public final List<DesignSystemModel> getExpandedItems() {
        return this.expandedItems;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getImageSize() {
        return this.imageSize;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageUrlAlignment() {
        return this.imageUrlAlignment;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final ButtonCardPriceModel getPrice() {
        return this.price;
    }

    public final ButtonCardStyleDtoEnum getStyle() {
        return this.style;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title), 31, this.body);
        String str = this.imageUrl;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrlAlignment;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.imageSize;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.button;
        int iHashCode4 = (iHashCode3 + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31;
        TagModel tagModel = this.tag;
        int iHashCode5 = (iHashCode4 + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.items;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<DesignSystemModel> list2 = this.expandedItems;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isExpanded;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.dismissIcon;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Action action = this.dismissAction;
        int iHashCode10 = (this.style.hashCode() + ((iHashCode9 + (action == null ? 0 : action.hashCode())) * 31)) * 31;
        ButtonCardPriceModel buttonCardPriceModel = this.price;
        int iHashCode11 = (iHashCode10 + (buttonCardPriceModel == null ? 0 : buttonCardPriceModel.hashCode())) * 31;
        EnumC39333f enumC39333f = this.titleColor;
        return iHashCode11 + (enumC39333f != null ? enumC39333f.hashCode() : 0);
    }

    public final Boolean isExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.body;
        String str4 = this.imageUrl;
        String str5 = this.imageUrlAlignment;
        Integer num = this.imageSize;
        CardButtonModel cardButtonModel = this.button;
        TagModel tagModel = this.tag;
        List<DesignSystemModel> list = this.items;
        List<DesignSystemModel> list2 = this.expandedItems;
        Boolean bool = this.isExpanded;
        String str6 = this.dismissIcon;
        Action action = this.dismissAction;
        ButtonCardStyleDtoEnum buttonCardStyleDtoEnum = this.style;
        ButtonCardPriceModel buttonCardPriceModel = this.price;
        EnumC39333f enumC39333f = this.titleColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ButtonCardModel(id=", str, ", title=", str2, ", body=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", imageUrl=", str4, ", imageUrlAlignment=");
        AbstractC30007c.m91853w(num, str5, ", imageSize=", ", button=", sbM32001t);
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", tag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(", items=");
        AbstractC21702c.m61148s(sbM32001t, list, ", expandedItems=", list2, ", isExpanded=");
        AbstractC13673n.m38576w(bool, ", dismissIcon=", str6, ", dismissAction=", sbM32001t);
        sbM32001t.append(action);
        sbM32001t.append(", style=");
        sbM32001t.append(buttonCardStyleDtoEnum);
        sbM32001t.append(", price=");
        sbM32001t.append(buttonCardPriceModel);
        sbM32001t.append(", titleColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonCardModel(String id4, String title, String body, String str, String str2, Integer num, CardButtonModel cardButtonModel, TagModel tagModel, List<? extends DesignSystemModel> list, List<? extends DesignSystemModel> list2, Boolean bool, String str3, Action action, ButtonCardStyleDtoEnum style, ButtonCardPriceModel buttonCardPriceModel, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.title = title;
        this.body = body;
        this.imageUrl = str;
        this.imageUrlAlignment = str2;
        this.imageSize = num;
        this.button = cardButtonModel;
        this.tag = tagModel;
        this.items = list;
        this.expandedItems = list2;
        this.isExpanded = bool;
        this.dismissIcon = str3;
        this.dismissAction = action;
        this.style = style;
        this.price = buttonCardPriceModel;
        this.titleColor = enumC39333f;
    }

    public /* synthetic */ ButtonCardModel(String str, String str2, String str3, String str4, String str5, Integer num, CardButtonModel cardButtonModel, TagModel tagModel, List list, List list2, Boolean bool, String str6, Action action, ButtonCardStyleDtoEnum buttonCardStyleDtoEnum, ButtonCardPriceModel buttonCardPriceModel, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i13 & 32) != 0 ? null : num, cardButtonModel, tagModel, list, list2, bool, str6, action, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? ButtonCardStyleDtoEnum.DEFAULT : buttonCardStyleDtoEnum, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : buttonCardPriceModel, (i13 & 32768) != 0 ? null : enumC39333f);
    }
}
