package com.whoop.bot.models.conversation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.HorizontalStatModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JR\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b7\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b:\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010&¨\u0006?"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "Lcom/whoop/bot/models/conversation/SleepBoundModel;", "sleepBounds", "predictionTitle", "Lcom/whoop/design/models/items/HorizontalStatModel;", "hoursOfSleepStat", "consistencyStat", "Lcom/whoop/design/models/items/CardButtonModel;", "editButton", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/whoop/design/models/items/HorizontalStatModel;", "component5", "component6", "()Lcom/whoop/design/models/items/CardButtonModel;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/util/List;", "getSleepBounds", "getPredictionTitle", "Lcom/whoop/design/models/items/HorizontalStatModel;", "getHoursOfSleepStat", "getConsistencyStat", "Lcom/whoop/design/models/items/CardButtonModel;", "getEditButton", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BedtimeRecommendationTileModel implements DesignSystemModel {
    private final HorizontalStatModel consistencyStat;
    private final CardButtonModel editButton;
    private final HorizontalStatModel hoursOfSleepStat;
    private final TextResource predictionTitle;
    private final List<SleepBoundModel> sleepBounds;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21769a(3)), null, null, null, null};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BedtimeRecommendationTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BedtimeRecommendationTileModel(int i13, TextResource textResource, List list, TextResource textResource2, HorizontalStatModel horizontalStatModel, HorizontalStatModel horizontalStatModel2, CardButtonModel cardButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, BedtimeRecommendationTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.sleepBounds = list;
        this.predictionTitle = textResource2;
        this.hoursOfSleepStat = horizontalStatModel;
        this.consistencyStat = horizontalStatModel2;
        this.editButton = cardButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SleepBoundModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BedtimeRecommendationTileModel copy$default(BedtimeRecommendationTileModel bedtimeRecommendationTileModel, TextResource textResource, List list, TextResource textResource2, HorizontalStatModel horizontalStatModel, HorizontalStatModel horizontalStatModel2, CardButtonModel cardButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = bedtimeRecommendationTileModel.title;
        }
        if ((i13 & 2) != 0) {
            list = bedtimeRecommendationTileModel.sleepBounds;
        }
        if ((i13 & 4) != 0) {
            textResource2 = bedtimeRecommendationTileModel.predictionTitle;
        }
        if ((i13 & 8) != 0) {
            horizontalStatModel = bedtimeRecommendationTileModel.hoursOfSleepStat;
        }
        if ((i13 & 16) != 0) {
            horizontalStatModel2 = bedtimeRecommendationTileModel.consistencyStat;
        }
        if ((i13 & 32) != 0) {
            cardButtonModel = bedtimeRecommendationTileModel.editButton;
        }
        HorizontalStatModel horizontalStatModel3 = horizontalStatModel2;
        CardButtonModel cardButtonModel2 = cardButtonModel;
        return bedtimeRecommendationTileModel.copy(textResource, list, textResource2, horizontalStatModel, horizontalStatModel3, cardButtonModel2);
    }

    public static final /* synthetic */ void write$Self$bot_release(BedtimeRecommendationTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sleepBounds);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.predictionTitle);
        HorizontalStatModel$$serializer horizontalStatModel$$serializer = HorizontalStatModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, horizontalStatModel$$serializer, self.hoursOfSleepStat);
        output.encodeSerializableElement(serialDesc, 4, horizontalStatModel$$serializer, self.consistencyStat);
        output.encodeSerializableElement(serialDesc, 5, CardButtonModel$$serializer.INSTANCE, self.editButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final List<SleepBoundModel> component2() {
        return this.sleepBounds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getPredictionTitle() {
        return this.predictionTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HorizontalStatModel getHoursOfSleepStat() {
        return this.hoursOfSleepStat;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HorizontalStatModel getConsistencyStat() {
        return this.consistencyStat;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardButtonModel getEditButton() {
        return this.editButton;
    }

    public final BedtimeRecommendationTileModel copy(TextResource title, List<SleepBoundModel> sleepBounds, TextResource predictionTitle, HorizontalStatModel hoursOfSleepStat, HorizontalStatModel consistencyStat, CardButtonModel editButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sleepBounds, "sleepBounds");
        AbstractC22676k.m65750j(predictionTitle, "predictionTitle");
        AbstractC22676k.m65750j(hoursOfSleepStat, "hoursOfSleepStat");
        AbstractC22676k.m65750j(consistencyStat, "consistencyStat");
        AbstractC22676k.m65750j(editButton, "editButton");
        return new BedtimeRecommendationTileModel(title, sleepBounds, predictionTitle, hoursOfSleepStat, consistencyStat, editButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BedtimeRecommendationTileModel)) {
            return false;
        }
        BedtimeRecommendationTileModel bedtimeRecommendationTileModel = (BedtimeRecommendationTileModel) other;
        return AbstractC22676k.m65745e(this.title, bedtimeRecommendationTileModel.title) && AbstractC22676k.m65745e(this.sleepBounds, bedtimeRecommendationTileModel.sleepBounds) && AbstractC22676k.m65745e(this.predictionTitle, bedtimeRecommendationTileModel.predictionTitle) && AbstractC22676k.m65745e(this.hoursOfSleepStat, bedtimeRecommendationTileModel.hoursOfSleepStat) && AbstractC22676k.m65745e(this.consistencyStat, bedtimeRecommendationTileModel.consistencyStat) && AbstractC22676k.m65745e(this.editButton, bedtimeRecommendationTileModel.editButton);
    }

    public final HorizontalStatModel getConsistencyStat() {
        return this.consistencyStat;
    }

    public final CardButtonModel getEditButton() {
        return this.editButton;
    }

    public final HorizontalStatModel getHoursOfSleepStat() {
        return this.hoursOfSleepStat;
    }

    public final TextResource getPredictionTitle() {
        return this.predictionTitle;
    }

    public final List<SleepBoundModel> getSleepBounds() {
        return this.sleepBounds;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.editButton.hashCode() + ((this.consistencyStat.hashCode() + ((this.hoursOfSleepStat.hashCode() + AbstractC31061c.m95625a(AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.sleepBounds), this.predictionTitle, 31)) * 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        List<SleepBoundModel> list = this.sleepBounds;
        TextResource textResource2 = this.predictionTitle;
        HorizontalStatModel horizontalStatModel = this.hoursOfSleepStat;
        HorizontalStatModel horizontalStatModel2 = this.consistencyStat;
        CardButtonModel cardButtonModel = this.editButton;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "BedtimeRecommendationTileModel(title=", ", sleepBounds=", ", predictionTitle=", list);
        sbM106657p.append(textResource2);
        sbM106657p.append(", hoursOfSleepStat=");
        sbM106657p.append(horizontalStatModel);
        sbM106657p.append(", consistencyStat=");
        sbM106657p.append(horizontalStatModel2);
        sbM106657p.append(", editButton=");
        sbM106657p.append(cardButtonModel);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }

    public BedtimeRecommendationTileModel(TextResource title, List<SleepBoundModel> sleepBounds, TextResource predictionTitle, HorizontalStatModel hoursOfSleepStat, HorizontalStatModel consistencyStat, CardButtonModel editButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sleepBounds, "sleepBounds");
        AbstractC22676k.m65750j(predictionTitle, "predictionTitle");
        AbstractC22676k.m65750j(hoursOfSleepStat, "hoursOfSleepStat");
        AbstractC22676k.m65750j(consistencyStat, "consistencyStat");
        AbstractC22676k.m65750j(editButton, "editButton");
        this.title = title;
        this.sleepBounds = sleepBounds;
        this.predictionTitle = predictionTitle;
        this.hoursOfSleepStat = hoursOfSleepStat;
        this.consistencyStat = consistencyStat;
        this.editButton = editButton;
    }
}
