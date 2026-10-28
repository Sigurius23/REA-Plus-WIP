package com.whoop.streaks.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.TitleSubTitleModel$$serializer;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.CelebrationMediaModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import ri2.C31469a;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RQBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0092\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bB\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bG\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bH\u0010\u001cR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010\u001eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bN\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bP\u0010+¨\u0006S"}, m65681d2 = {"Lcom/whoop/streaks/domain/models/StreaksResponse;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "lottieUrl", "imageUrl", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "celebrationMedia", "Lcom/whoop/design/models/TitleSubTitleModel;", "titleSubtitle", "streakValue", "streakSubtitle", "streakState", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "headerIcon", "Lcom/whoop/navigation/e;", "headerIconDestination", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "component5", "()Lcom/whoop/design/models/TitleSubTitleModel;", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/streaks/domain/models/StreaksResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$streaks_release", "(Lcom/whoop/streaks/domain/models/StreaksResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getLottieUrl", "getImageUrl", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "getCelebrationMedia", "Lcom/whoop/design/models/TitleSubTitleModel;", "getTitleSubtitle", "getStreakValue", "getStreakSubtitle", "getStreakState", "getStreakState$annotations", "()V", "Ljava/util/List;", "getItems", "getHeaderIcon", "Lcom/whoop/navigation/e;", "getHeaderIconDestination", "Companion", "$serializer", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StreaksResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("celebration_media")
    private final CelebrationMediaModel celebrationMedia;

    @SerializedName("header_icon")
    private final String headerIcon;

    @SerializedName("header_icon_destination")
    private final C9598e headerIconDestination;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("items")
    private final List<DesignSystemModel> items;

    @SerializedName("lottie_url")
    private final String lottieUrl;

    @SerializedName("today_streak_state")
    private final String streakState;

    @SerializedName("streak_subtitle")
    private final TextResource streakSubtitle;

    @SerializedName("streak_value")
    private final TextResource streakValue;

    @SerializedName("title")
    private final TextResource title;

    @SerializedName("title_subtitle")
    private final TitleSubTitleModel titleSubtitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/streaks/domain/models/StreaksResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/streaks/domain/models/StreaksResponse;", "serializer", "()Lwc3/c;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StreaksResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C31469a(1)), null, AbstractC30060g.m92087G(enumC23463i, new C31469a(2))};
    }

    public /* synthetic */ StreaksResponse(int i13, TextResource textResource, String str, String str2, CelebrationMediaModel celebrationMediaModel, TitleSubTitleModel titleSubTitleModel, TextResource textResource2, TextResource textResource3, String str3, List list, String str4, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (1959 != (i13 & 1959)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1959, StreaksResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.lottieUrl = str;
        this.imageUrl = str2;
        if ((i13 & 8) == 0) {
            this.celebrationMedia = null;
        } else {
            this.celebrationMedia = celebrationMediaModel;
        }
        if ((i13 & 16) == 0) {
            this.titleSubtitle = null;
        } else {
            this.titleSubtitle = titleSubTitleModel;
        }
        this.streakValue = textResource2;
        if ((i13 & 64) == 0) {
            this.streakSubtitle = null;
        } else {
            this.streakSubtitle = textResource3;
        }
        this.streakState = str3;
        this.items = list;
        this.headerIcon = str4;
        this.headerIconDestination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreaksResponse copy$default(StreaksResponse streaksResponse, TextResource textResource, String str, String str2, CelebrationMediaModel celebrationMediaModel, TitleSubTitleModel titleSubTitleModel, TextResource textResource2, TextResource textResource3, String str3, List list, String str4, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = streaksResponse.title;
        }
        if ((i13 & 2) != 0) {
            str = streaksResponse.lottieUrl;
        }
        if ((i13 & 4) != 0) {
            str2 = streaksResponse.imageUrl;
        }
        if ((i13 & 8) != 0) {
            celebrationMediaModel = streaksResponse.celebrationMedia;
        }
        if ((i13 & 16) != 0) {
            titleSubTitleModel = streaksResponse.titleSubtitle;
        }
        if ((i13 & 32) != 0) {
            textResource2 = streaksResponse.streakValue;
        }
        if ((i13 & 64) != 0) {
            textResource3 = streaksResponse.streakSubtitle;
        }
        if ((i13 & 128) != 0) {
            str3 = streaksResponse.streakState;
        }
        if ((i13 & 256) != 0) {
            list = streaksResponse.items;
        }
        if ((i13 & 512) != 0) {
            str4 = streaksResponse.headerIcon;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c9598e = streaksResponse.headerIconDestination;
        }
        String str5 = str4;
        C9598e c9598e2 = c9598e;
        String str6 = str3;
        List list2 = list;
        TextResource textResource4 = textResource2;
        TextResource textResource5 = textResource3;
        TitleSubTitleModel titleSubTitleModel2 = titleSubTitleModel;
        String str7 = str2;
        return streaksResponse.copy(textResource, str, str7, celebrationMediaModel, titleSubTitleModel2, textResource4, textResource5, str6, list2, str5, c9598e2);
    }

    @InterfaceC37143h("today_streak_state")
    public static /* synthetic */ void getStreakState$annotations() {
    }

    public static final /* synthetic */ void write$Self$streaks_release(StreaksResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.lottieUrl);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.imageUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.celebrationMedia != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, CelebrationMediaModel$$serializer.INSTANCE, self.celebrationMedia);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.titleSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, TitleSubTitleModel$$serializer.INSTANCE, self.titleSubtitle);
        }
        output.encodeSerializableElement(serialDesc, 5, c25452a, self.streakValue);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.streakSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, c25452a, self.streakSubtitle);
        }
        output.encodeStringElement(serialDesc, 7, self.streakState);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.headerIcon);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.headerIconDestination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C9598e getHeaderIconDestination() {
        return this.headerIconDestination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CelebrationMediaModel getCelebrationMedia() {
        return this.celebrationMedia;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TitleSubTitleModel getTitleSubtitle() {
        return this.titleSubtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getStreakValue() {
        return this.streakValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextResource getStreakSubtitle() {
        return this.streakSubtitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStreakState() {
        return this.streakState;
    }

    public final List<DesignSystemModel> component9() {
        return this.items;
    }

    public final StreaksResponse copy(TextResource title, String lottieUrl, String imageUrl, CelebrationMediaModel celebrationMedia, TitleSubTitleModel titleSubtitle, TextResource streakValue, TextResource streakSubtitle, String streakState, List<? extends DesignSystemModel> items, String headerIcon, C9598e headerIconDestination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(streakValue, "streakValue");
        AbstractC22676k.m65750j(streakState, "streakState");
        AbstractC22676k.m65750j(items, "items");
        return new StreaksResponse(title, lottieUrl, imageUrl, celebrationMedia, titleSubtitle, streakValue, streakSubtitle, streakState, items, headerIcon, headerIconDestination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreaksResponse)) {
            return false;
        }
        StreaksResponse streaksResponse = (StreaksResponse) other;
        return AbstractC22676k.m65745e(this.title, streaksResponse.title) && AbstractC22676k.m65745e(this.lottieUrl, streaksResponse.lottieUrl) && AbstractC22676k.m65745e(this.imageUrl, streaksResponse.imageUrl) && AbstractC22676k.m65745e(this.celebrationMedia, streaksResponse.celebrationMedia) && AbstractC22676k.m65745e(this.titleSubtitle, streaksResponse.titleSubtitle) && AbstractC22676k.m65745e(this.streakValue, streaksResponse.streakValue) && AbstractC22676k.m65745e(this.streakSubtitle, streaksResponse.streakSubtitle) && AbstractC22676k.m65745e(this.streakState, streaksResponse.streakState) && AbstractC22676k.m65745e(this.items, streaksResponse.items) && AbstractC22676k.m65745e(this.headerIcon, streaksResponse.headerIcon) && AbstractC22676k.m65745e(this.headerIconDestination, streaksResponse.headerIconDestination);
    }

    public final CelebrationMediaModel getCelebrationMedia() {
        return this.celebrationMedia;
    }

    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    public final C9598e getHeaderIconDestination() {
        return this.headerIconDestination;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    public final String getStreakState() {
        return this.streakState;
    }

    public final TextResource getStreakSubtitle() {
        return this.streakSubtitle;
    }

    public final TextResource getStreakValue() {
        return this.streakValue;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final TitleSubTitleModel getTitleSubtitle() {
        return this.titleSubtitle;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.lottieUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CelebrationMediaModel celebrationMediaModel = this.celebrationMedia;
        int iHashCode4 = (iHashCode3 + (celebrationMediaModel == null ? 0 : celebrationMediaModel.hashCode())) * 31;
        TitleSubTitleModel titleSubTitleModel = this.titleSubtitle;
        int iM95625a = AbstractC31061c.m95625a((iHashCode4 + (titleSubTitleModel == null ? 0 : titleSubTitleModel.hashCode())) * 31, this.streakValue, 31);
        TextResource textResource = this.streakSubtitle;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.streakState), 31, this.items);
        String str3 = this.headerIcon;
        int iHashCode5 = (iM31983b + (str3 == null ? 0 : str3.hashCode())) * 31;
        C9598e c9598e = this.headerIconDestination;
        return iHashCode5 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.lottieUrl;
        String str2 = this.imageUrl;
        CelebrationMediaModel celebrationMediaModel = this.celebrationMedia;
        TitleSubTitleModel titleSubTitleModel = this.titleSubtitle;
        TextResource textResource2 = this.streakValue;
        TextResource textResource3 = this.streakSubtitle;
        String str3 = this.streakState;
        List<DesignSystemModel> list = this.items;
        String str4 = this.headerIcon;
        C9598e c9598e = this.headerIconDestination;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("StreaksResponse(title=", textResource, ", lottieUrl=", str, ", imageUrl=");
        sbM91845o.append(str2);
        sbM91845o.append(", celebrationMedia=");
        sbM91845o.append(celebrationMediaModel);
        sbM91845o.append(", titleSubtitle=");
        sbM91845o.append(titleSubTitleModel);
        sbM91845o.append(", streakValue=");
        sbM91845o.append(textResource2);
        sbM91845o.append(", streakSubtitle=");
        AbstractC30007c.m91856z(sbM91845o, textResource3, ", streakState=", str3, ", items=");
        AbstractC17176i.m48511m(", headerIcon=", str4, ", headerIconDestination=", sbM91845o, list);
        return AbstractC33745d.m106656o(sbM91845o, c9598e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreaksResponse(TextResource title, String str, String str2, CelebrationMediaModel celebrationMediaModel, TitleSubTitleModel titleSubTitleModel, TextResource streakValue, TextResource textResource, String streakState, List<? extends DesignSystemModel> items, String str3, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(streakValue, "streakValue");
        AbstractC22676k.m65750j(streakState, "streakState");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.lottieUrl = str;
        this.imageUrl = str2;
        this.celebrationMedia = celebrationMediaModel;
        this.titleSubtitle = titleSubTitleModel;
        this.streakValue = streakValue;
        this.streakSubtitle = textResource;
        this.streakState = streakState;
        this.items = items;
        this.headerIcon = str3;
        this.headerIconDestination = c9598e;
    }

    public /* synthetic */ StreaksResponse(TextResource textResource, String str, String str2, CelebrationMediaModel celebrationMediaModel, TitleSubTitleModel titleSubTitleModel, TextResource textResource2, TextResource textResource3, String str3, List list, String str4, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, str2, (i13 & 8) != 0 ? null : celebrationMediaModel, (i13 & 16) != 0 ? null : titleSubTitleModel, textResource2, (i13 & 64) != 0 ? null : textResource3, str3, list, str4, c9598e);
    }
}
