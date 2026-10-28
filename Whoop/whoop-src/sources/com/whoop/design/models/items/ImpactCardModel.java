package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import o91.C27690g;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36959f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 Y2\u00020\u0001:\u0002ZYB\u0086\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0019\u0010\u0018\u001a\u00150\u0013j\u0002`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u008f\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00150\u0013j\u0002`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0003¢\u0006\u0004\b1\u00102J¥\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001b\b\u0002\u0010\u0018\u001a\u00150\u0013j\u0002`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bH\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bI\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bL\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010*R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u00100R*\u0010\u0018\u001a\u00150\u0013j\u0002`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bX\u00102¨\u0006["}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "impactCardTitleDisplay", "impactCardSubtitleDisplay", "impactPercentageDisplay", "Lcom/whoop/design/models/items/InsufficientAnswerCount;", "yesAnswerCount", "noAnswerCount", "Lcom/whoop/design/models/items/ImpactStyle;", "impactStyle", "Lcom/whoop/design/models/items/TileTagModel;", "tileTag", "", "tileTags", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "impactBarSegment", "Lcom/whoop/design/models/items/BackgroundStyle;", "cardBackgroundStyle", "Ljava/util/UUID;", "Lcom/whoop/design/json/serializers/SerializableUUID;", "Lwc3/i;", "with", "Lo91/g;", "impactUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/InsufficientAnswerCount;", "component5", "component6", "()Lcom/whoop/design/models/items/ImpactStyle;", "component7", "()Lcom/whoop/design/models/items/TileTagModel;", "component8", "()Ljava/util/List;", "component9", "()Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "component10", "()Lcom/whoop/design/models/items/BackgroundStyle;", "component11", "()Ljava/util/UUID;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/InsufficientAnswerCount;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lcom/whoop/design/models/items/BackgroundStyle;Ljava/util/UUID;)Lcom/whoop/design/models/items/ImpactCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ImpactCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getImpactCardTitleDisplay", "getImpactCardSubtitleDisplay", "getImpactPercentageDisplay", "Lcom/whoop/design/models/items/InsufficientAnswerCount;", "getYesAnswerCount", "getNoAnswerCount", "Lcom/whoop/design/models/items/ImpactStyle;", "getImpactStyle", "Lcom/whoop/design/models/items/TileTagModel;", "getTileTag", "Ljava/util/List;", "getTileTags", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "getImpactBarSegment", "Lcom/whoop/design/models/items/BackgroundStyle;", "getCardBackgroundStyle", "Ljava/util/UUID;", "getImpactUuid", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImpactCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final BackgroundStyle cardBackgroundStyle;
    private final ImpactBarSegmentModel impactBarSegment;
    private final String impactCardSubtitleDisplay;
    private final String impactCardTitleDisplay;
    private final String impactPercentageDisplay;
    private final ImpactStyle impactStyle;
    private final UUID impactUuid;
    private final InsufficientAnswerCount noAnswerCount;
    private final TileTagModel tileTag;
    private final List<TileTagModel> tileTags;
    private final InsufficientAnswerCount yesAnswerCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ImpactCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImpactCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36959f(10)), null, AbstractC30060g.m92087G(enumC23463i, new C36959f(11)), null, AbstractC30060g.m92087G(enumC23463i, new C36959f(12)), null};
    }

    public /* synthetic */ ImpactCardModel(int i13, String str, String str2, String str3, InsufficientAnswerCount insufficientAnswerCount, InsufficientAnswerCount insufficientAnswerCount2, ImpactStyle impactStyle, TileTagModel tileTagModel, List list, ImpactBarSegmentModel impactBarSegmentModel, BackgroundStyle backgroundStyle, UUID uuid, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, ImpactCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.impactCardTitleDisplay = str;
        this.impactCardSubtitleDisplay = str2;
        this.impactPercentageDisplay = str3;
        this.yesAnswerCount = insufficientAnswerCount;
        this.noAnswerCount = insufficientAnswerCount2;
        this.impactStyle = impactStyle;
        this.tileTag = tileTagModel;
        this.tileTags = list;
        this.impactBarSegment = impactBarSegmentModel;
        this.cardBackgroundStyle = backgroundStyle;
        this.impactUuid = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ImpactStyle", ImpactStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(TileTagModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.BackgroundStyle", BackgroundStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImpactCardModel copy$default(ImpactCardModel impactCardModel, String str, String str2, String str3, InsufficientAnswerCount insufficientAnswerCount, InsufficientAnswerCount insufficientAnswerCount2, ImpactStyle impactStyle, TileTagModel tileTagModel, List list, ImpactBarSegmentModel impactBarSegmentModel, BackgroundStyle backgroundStyle, UUID uuid, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = impactCardModel.impactCardTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = impactCardModel.impactCardSubtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = impactCardModel.impactPercentageDisplay;
        }
        if ((i13 & 8) != 0) {
            insufficientAnswerCount = impactCardModel.yesAnswerCount;
        }
        if ((i13 & 16) != 0) {
            insufficientAnswerCount2 = impactCardModel.noAnswerCount;
        }
        if ((i13 & 32) != 0) {
            impactStyle = impactCardModel.impactStyle;
        }
        if ((i13 & 64) != 0) {
            tileTagModel = impactCardModel.tileTag;
        }
        if ((i13 & 128) != 0) {
            list = impactCardModel.tileTags;
        }
        if ((i13 & 256) != 0) {
            impactBarSegmentModel = impactCardModel.impactBarSegment;
        }
        if ((i13 & 512) != 0) {
            backgroundStyle = impactCardModel.cardBackgroundStyle;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            uuid = impactCardModel.impactUuid;
        }
        BackgroundStyle backgroundStyle2 = backgroundStyle;
        UUID uuid2 = uuid;
        List list2 = list;
        ImpactBarSegmentModel impactBarSegmentModel2 = impactBarSegmentModel;
        ImpactStyle impactStyle2 = impactStyle;
        TileTagModel tileTagModel2 = tileTagModel;
        InsufficientAnswerCount insufficientAnswerCount3 = insufficientAnswerCount2;
        String str4 = str3;
        return impactCardModel.copy(str, str2, str4, insufficientAnswerCount, insufficientAnswerCount3, impactStyle2, tileTagModel2, list2, impactBarSegmentModel2, backgroundStyle2, uuid2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ImpactCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.impactCardTitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.impactCardSubtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.impactPercentageDisplay);
        InsufficientAnswerCount$$serializer insufficientAnswerCount$$serializer = InsufficientAnswerCount$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, insufficientAnswerCount$$serializer, self.yesAnswerCount);
        output.encodeNullableSerializableElement(serialDesc, 4, insufficientAnswerCount$$serializer, self.noAnswerCount);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.impactStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, TileTagModel$$serializer.INSTANCE, self.tileTag);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.tileTags);
        output.encodeSerializableElement(serialDesc, 8, ImpactBarSegmentModel$$serializer.INSTANCE, self.impactBarSegment);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.cardBackgroundStyle);
        output.encodeSerializableElement(serialDesc, 10, C27690g.f111466a, self.impactUuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImpactCardTitleDisplay() {
        return this.impactCardTitleDisplay;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BackgroundStyle getCardBackgroundStyle() {
        return this.cardBackgroundStyle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final UUID getImpactUuid() {
        return this.impactUuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImpactCardSubtitleDisplay() {
        return this.impactCardSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImpactPercentageDisplay() {
        return this.impactPercentageDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InsufficientAnswerCount getYesAnswerCount() {
        return this.yesAnswerCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InsufficientAnswerCount getNoAnswerCount() {
        return this.noAnswerCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ImpactStyle getImpactStyle() {
        return this.impactStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TileTagModel getTileTag() {
        return this.tileTag;
    }

    public final List<TileTagModel> component8() {
        return this.tileTags;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ImpactBarSegmentModel getImpactBarSegment() {
        return this.impactBarSegment;
    }

    public final ImpactCardModel copy(String impactCardTitleDisplay, String impactCardSubtitleDisplay, String impactPercentageDisplay, InsufficientAnswerCount yesAnswerCount, InsufficientAnswerCount noAnswerCount, ImpactStyle impactStyle, TileTagModel tileTag, List<TileTagModel> tileTags, ImpactBarSegmentModel impactBarSegment, BackgroundStyle cardBackgroundStyle, UUID impactUuid) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        AbstractC22676k.m65750j(impactBarSegment, "impactBarSegment");
        AbstractC22676k.m65750j(cardBackgroundStyle, "cardBackgroundStyle");
        AbstractC22676k.m65750j(impactUuid, "impactUuid");
        return new ImpactCardModel(impactCardTitleDisplay, impactCardSubtitleDisplay, impactPercentageDisplay, yesAnswerCount, noAnswerCount, impactStyle, tileTag, tileTags, impactBarSegment, cardBackgroundStyle, impactUuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpactCardModel)) {
            return false;
        }
        ImpactCardModel impactCardModel = (ImpactCardModel) other;
        return AbstractC22676k.m65745e(this.impactCardTitleDisplay, impactCardModel.impactCardTitleDisplay) && AbstractC22676k.m65745e(this.impactCardSubtitleDisplay, impactCardModel.impactCardSubtitleDisplay) && AbstractC22676k.m65745e(this.impactPercentageDisplay, impactCardModel.impactPercentageDisplay) && AbstractC22676k.m65745e(this.yesAnswerCount, impactCardModel.yesAnswerCount) && AbstractC22676k.m65745e(this.noAnswerCount, impactCardModel.noAnswerCount) && this.impactStyle == impactCardModel.impactStyle && AbstractC22676k.m65745e(this.tileTag, impactCardModel.tileTag) && AbstractC22676k.m65745e(this.tileTags, impactCardModel.tileTags) && AbstractC22676k.m65745e(this.impactBarSegment, impactCardModel.impactBarSegment) && this.cardBackgroundStyle == impactCardModel.cardBackgroundStyle && AbstractC22676k.m65745e(this.impactUuid, impactCardModel.impactUuid);
    }

    public final BackgroundStyle getCardBackgroundStyle() {
        return this.cardBackgroundStyle;
    }

    public final ImpactBarSegmentModel getImpactBarSegment() {
        return this.impactBarSegment;
    }

    public final String getImpactCardSubtitleDisplay() {
        return this.impactCardSubtitleDisplay;
    }

    public final String getImpactCardTitleDisplay() {
        return this.impactCardTitleDisplay;
    }

    public final String getImpactPercentageDisplay() {
        return this.impactPercentageDisplay;
    }

    public final ImpactStyle getImpactStyle() {
        return this.impactStyle;
    }

    public final UUID getImpactUuid() {
        return this.impactUuid;
    }

    public final InsufficientAnswerCount getNoAnswerCount() {
        return this.noAnswerCount;
    }

    public final TileTagModel getTileTag() {
        return this.tileTag;
    }

    public final List<TileTagModel> getTileTags() {
        return this.tileTags;
    }

    public final InsufficientAnswerCount getYesAnswerCount() {
        return this.yesAnswerCount;
    }

    public int hashCode() {
        String str = this.impactCardTitleDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.impactCardSubtitleDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.impactPercentageDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InsufficientAnswerCount insufficientAnswerCount = this.yesAnswerCount;
        int iHashCode4 = (iHashCode3 + (insufficientAnswerCount == null ? 0 : insufficientAnswerCount.hashCode())) * 31;
        InsufficientAnswerCount insufficientAnswerCount2 = this.noAnswerCount;
        int iHashCode5 = (this.impactStyle.hashCode() + ((iHashCode4 + (insufficientAnswerCount2 == null ? 0 : insufficientAnswerCount2.hashCode())) * 31)) * 31;
        TileTagModel tileTagModel = this.tileTag;
        int iHashCode6 = (iHashCode5 + (tileTagModel == null ? 0 : tileTagModel.hashCode())) * 31;
        List<TileTagModel> list = this.tileTags;
        return this.impactUuid.hashCode() + ((this.cardBackgroundStyle.hashCode() + ((this.impactBarSegment.hashCode() + ((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.impactCardTitleDisplay;
        String str2 = this.impactCardSubtitleDisplay;
        String str3 = this.impactPercentageDisplay;
        InsufficientAnswerCount insufficientAnswerCount = this.yesAnswerCount;
        InsufficientAnswerCount insufficientAnswerCount2 = this.noAnswerCount;
        ImpactStyle impactStyle = this.impactStyle;
        TileTagModel tileTagModel = this.tileTag;
        List<TileTagModel> list = this.tileTags;
        ImpactBarSegmentModel impactBarSegmentModel = this.impactBarSegment;
        BackgroundStyle backgroundStyle = this.cardBackgroundStyle;
        UUID uuid = this.impactUuid;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ImpactCardModel(impactCardTitleDisplay=", str, ", impactCardSubtitleDisplay=", str2, ", impactPercentageDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", yesAnswerCount=");
        sbM32001t.append(insufficientAnswerCount);
        sbM32001t.append(", noAnswerCount=");
        sbM32001t.append(insufficientAnswerCount2);
        sbM32001t.append(", impactStyle=");
        sbM32001t.append(impactStyle);
        sbM32001t.append(", tileTag=");
        sbM32001t.append(tileTagModel);
        sbM32001t.append(", tileTags=");
        sbM32001t.append(list);
        sbM32001t.append(", impactBarSegment=");
        sbM32001t.append(impactBarSegmentModel);
        sbM32001t.append(", cardBackgroundStyle=");
        sbM32001t.append(backgroundStyle);
        sbM32001t.append(", impactUuid=");
        sbM32001t.append(uuid);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ImpactCardModel(String str, String str2, String str3, InsufficientAnswerCount insufficientAnswerCount, InsufficientAnswerCount insufficientAnswerCount2, ImpactStyle impactStyle, TileTagModel tileTagModel, List<TileTagModel> list, ImpactBarSegmentModel impactBarSegment, BackgroundStyle cardBackgroundStyle, UUID impactUuid) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        AbstractC22676k.m65750j(impactBarSegment, "impactBarSegment");
        AbstractC22676k.m65750j(cardBackgroundStyle, "cardBackgroundStyle");
        AbstractC22676k.m65750j(impactUuid, "impactUuid");
        this.impactCardTitleDisplay = str;
        this.impactCardSubtitleDisplay = str2;
        this.impactPercentageDisplay = str3;
        this.yesAnswerCount = insufficientAnswerCount;
        this.noAnswerCount = insufficientAnswerCount2;
        this.impactStyle = impactStyle;
        this.tileTag = tileTagModel;
        this.tileTags = list;
        this.impactBarSegment = impactBarSegment;
        this.cardBackgroundStyle = cardBackgroundStyle;
        this.impactUuid = impactUuid;
    }
}
