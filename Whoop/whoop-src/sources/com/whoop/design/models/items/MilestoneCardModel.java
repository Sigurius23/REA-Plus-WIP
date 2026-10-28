package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import w91.C36960g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 f2\u00020\u0001:\u0002gfB¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB¹\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0012\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b8\u00109JÈ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b<\u0010%J\u0010\u0010=\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010L\u001a\u0004\bN\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bP\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bQ\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bR\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010S\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bX\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010W\u001a\u0004\bY\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\b\u000f\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\b[\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\b\\\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010]\u001a\u0004\b^\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00104R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\ba\u0010%R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bc\u00107R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010d\u001a\u0004\be\u00109¨\u0006h"}, m65681d2 = {"Lcom/whoop/design/models/items/MilestoneCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "id", "imageUrl", "cta", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "", "filledCount", "totalCount", "", "isUnlocked", "color", "type", "Lcom/whoop/design/models/items/DialogInfo;", "dialogInfo", "Lcom/whoop/design/models/items/TagModel;", "navigationTag", "progressStyle", "Lcom/whoop/design/models/items/MilestoneAnalytics;", "analytics", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/whoop/navigation/e;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Z", "component10", "component11", "component12", "()Lcom/whoop/design/models/items/DialogInfo;", "component13", "()Lcom/whoop/design/models/items/TagModel;", "component14", "component15", "()Lcom/whoop/design/models/items/MilestoneAnalytics;", "component16", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/MilestoneCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MilestoneCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Ljava/lang/String;", "getId", "getImageUrl", "getCta", "Lcom/whoop/navigation/e;", "getNavigation", "getNavigation$annotations", "()V", "Ljava/lang/Integer;", "getFilledCount", "getTotalCount", "Z", "getColor", "getType", "Lcom/whoop/design/models/items/DialogInfo;", "getDialogInfo", "Lcom/whoop/design/models/items/TagModel;", "getNavigationTag", "getProgressStyle", "Lcom/whoop/design/models/items/MilestoneAnalytics;", "getAnalytics", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MilestoneCardModel implements DesignSystemModel {
    private final MilestoneAnalytics analytics;
    private final String color;
    private final TextResource cta;
    private final DialogInfo dialogInfo;
    private final Integer filledCount;
    private final String id;
    private final String imageUrl;
    private final GenericInteraction interaction;
    private final boolean isUnlocked;
    private final C9598e navigation;
    private final TagModel navigationTag;
    private final String progressStyle;
    private final TextResource subtitle;
    private final TextResource title;
    private final Integer totalCount;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36960g(19)), null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MilestoneCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MilestoneCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MilestoneCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MilestoneCardModel(int i13, TextResource textResource, TextResource textResource2, String str, String str2, TextResource textResource3, C9598e c9598e, Integer num, Integer num2, boolean z4, String str3, String str4, DialogInfo dialogInfo, TagModel tagModel, String str5, MilestoneAnalytics milestoneAnalytics, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (32767 != (i13 & 32767)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 32767, MilestoneCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = textResource2;
        this.id = str;
        this.imageUrl = str2;
        this.cta = textResource3;
        this.navigation = c9598e;
        this.filledCount = num;
        this.totalCount = num2;
        this.isUnlocked = z4;
        this.color = str3;
        this.type = str4;
        this.dialogInfo = dialogInfo;
        this.navigationTag = tagModel;
        this.progressStyle = str5;
        this.analytics = milestoneAnalytics;
        this.interaction = (i13 & 32768) == 0 ? null : genericInteraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ void getNavigation$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(MilestoneCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.subtitle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.id);
        output.encodeStringElement(serialDesc, 3, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 4, c25452a, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.navigation);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, intSerializer, self.filledCount);
        output.encodeNullableSerializableElement(serialDesc, 7, intSerializer, self.totalCount);
        output.encodeBooleanElement(serialDesc, 8, self.isUnlocked);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.color);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.type);
        output.encodeNullableSerializableElement(serialDesc, 11, DialogInfo$$serializer.INSTANCE, self.dialogInfo);
        output.encodeNullableSerializableElement(serialDesc, 12, TagModel$$serializer.INSTANCE, self.navigationTag);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.progressStyle);
        output.encodeNullableSerializableElement(serialDesc, 14, MilestoneAnalytics$$serializer.INSTANCE, self.analytics);
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && self.interaction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 15, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getProgressStyle() {
        return this.progressStyle;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final MilestoneAnalytics getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getFilledCount() {
        return this.filledCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsUnlocked() {
        return this.isUnlocked;
    }

    public final MilestoneCardModel copy(TextResource title, TextResource subtitle, String id4, String imageUrl, TextResource cta, C9598e navigation, Integer filledCount, Integer totalCount, boolean isUnlocked, String color, String type, DialogInfo dialogInfo, TagModel navigationTag, String progressStyle, MilestoneAnalytics analytics, GenericInteraction interaction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        return new MilestoneCardModel(title, subtitle, id4, imageUrl, cta, navigation, filledCount, totalCount, isUnlocked, color, type, dialogInfo, navigationTag, progressStyle, analytics, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilestoneCardModel)) {
            return false;
        }
        MilestoneCardModel milestoneCardModel = (MilestoneCardModel) other;
        return AbstractC22676k.m65745e(this.title, milestoneCardModel.title) && AbstractC22676k.m65745e(this.subtitle, milestoneCardModel.subtitle) && AbstractC22676k.m65745e(this.id, milestoneCardModel.id) && AbstractC22676k.m65745e(this.imageUrl, milestoneCardModel.imageUrl) && AbstractC22676k.m65745e(this.cta, milestoneCardModel.cta) && AbstractC22676k.m65745e(this.navigation, milestoneCardModel.navigation) && AbstractC22676k.m65745e(this.filledCount, milestoneCardModel.filledCount) && AbstractC22676k.m65745e(this.totalCount, milestoneCardModel.totalCount) && this.isUnlocked == milestoneCardModel.isUnlocked && AbstractC22676k.m65745e(this.color, milestoneCardModel.color) && AbstractC22676k.m65745e(this.type, milestoneCardModel.type) && AbstractC22676k.m65745e(this.dialogInfo, milestoneCardModel.dialogInfo) && AbstractC22676k.m65745e(this.navigationTag, milestoneCardModel.navigationTag) && AbstractC22676k.m65745e(this.progressStyle, milestoneCardModel.progressStyle) && AbstractC22676k.m65745e(this.analytics, milestoneCardModel.analytics) && AbstractC22676k.m65745e(this.interaction, milestoneCardModel.interaction);
    }

    public final MilestoneAnalytics getAnalytics() {
        return this.analytics;
    }

    public final String getColor() {
        return this.color;
    }

    public final TextResource getCta() {
        return this.cta;
    }

    public final DialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    public final Integer getFilledCount() {
        return this.filledCount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    public final String getProgressStyle() {
        return this.progressStyle;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31);
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d((iM95625a + (str == null ? 0 : str.hashCode())) * 31, 31, this.imageUrl);
        TextResource textResource = this.cta;
        int iHashCode = (iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C9598e c9598e = this.navigation;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Integer num = this.filledCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.isUnlocked);
        String str2 = this.color;
        int iHashCode4 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DialogInfo dialogInfo = this.dialogInfo;
        int iHashCode6 = (iHashCode5 + (dialogInfo == null ? 0 : dialogInfo.hashCode())) * 31;
        TagModel tagModel = this.navigationTag;
        int iHashCode7 = (iHashCode6 + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        String str4 = this.progressStyle;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MilestoneAnalytics milestoneAnalytics = this.analytics;
        int iHashCode9 = (iHashCode8 + (milestoneAnalytics == null ? 0 : milestoneAnalytics.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode9 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public final boolean isUnlocked() {
        return this.isUnlocked;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str = this.id;
        String str2 = this.imageUrl;
        TextResource textResource3 = this.cta;
        C9598e c9598e = this.navigation;
        Integer num = this.filledCount;
        Integer num2 = this.totalCount;
        boolean z4 = this.isUnlocked;
        String str3 = this.color;
        String str4 = this.type;
        DialogInfo dialogInfo = this.dialogInfo;
        TagModel tagModel = this.navigationTag;
        String str5 = this.progressStyle;
        MilestoneAnalytics milestoneAnalytics = this.analytics;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MilestoneCardModel(title=", textResource, ", subtitle=", textResource2, ", id=");
        AbstractC11266d.m30444B(sbM106658q, str, ", imageUrl=", str2, ", cta=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", navigation=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", filledCount=");
        AbstractC31061c.m95621A(sbM106658q, num, ", totalCount=", num2, ", isUnlocked=");
        AbstractC38963t7.m124391u(sbM106658q, z4, ", color=", str3, ", type=");
        sbM106658q.append(str4);
        sbM106658q.append(", dialogInfo=");
        sbM106658q.append(dialogInfo);
        sbM106658q.append(", navigationTag=");
        sbM106658q.append(tagModel);
        sbM106658q.append(", progressStyle=");
        sbM106658q.append(str5);
        sbM106658q.append(", analytics=");
        sbM106658q.append(milestoneAnalytics);
        sbM106658q.append(", interaction=");
        sbM106658q.append(genericInteraction);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public MilestoneCardModel(TextResource title, TextResource subtitle, String str, String imageUrl, TextResource textResource, C9598e c9598e, Integer num, Integer num2, boolean z4, String str2, String str3, DialogInfo dialogInfo, TagModel tagModel, String str4, MilestoneAnalytics milestoneAnalytics, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        this.title = title;
        this.subtitle = subtitle;
        this.id = str;
        this.imageUrl = imageUrl;
        this.cta = textResource;
        this.navigation = c9598e;
        this.filledCount = num;
        this.totalCount = num2;
        this.isUnlocked = z4;
        this.color = str2;
        this.type = str3;
        this.dialogInfo = dialogInfo;
        this.navigationTag = tagModel;
        this.progressStyle = str4;
        this.analytics = milestoneAnalytics;
        this.interaction = genericInteraction;
    }

    public /* synthetic */ MilestoneCardModel(TextResource textResource, TextResource textResource2, String str, String str2, TextResource textResource3, C9598e c9598e, Integer num, Integer num2, boolean z4, String str3, String str4, DialogInfo dialogInfo, TagModel tagModel, String str5, MilestoneAnalytics milestoneAnalytics, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, str, str2, textResource3, c9598e, num, num2, z4, str3, str4, dialogInfo, tagModel, str5, milestoneAnalytics, (i13 & 32768) != 0 ? null : genericInteraction);
    }
}
