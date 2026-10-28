package com.whoop.design.models.items;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md1.C25452a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010%Jn\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b;\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b\u000b\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b?\u0010%¨\u0006B"}, m65681d2 = {"Lcom/whoop/design/models/items/ActivityTileSelectionModel;", "", "Lcom/whoop/design/util/TextResource;", "title", "scoreDisplay", "startTimeText", "endTimeText", "", "iconUrl", "activityV2Id", "", "isGpsEnabled", "Lcom/whoop/design/models/items/During;", "during", "internalName", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/During;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/During;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ActivityTileSelectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Z", "component8", "()Lcom/whoop/design/models/items/During;", "component9", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/During;Ljava/lang/String;)Lcom/whoop/design/models/items/ActivityTileSelectionModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getScoreDisplay", "getStartTimeText", "getEndTimeText", "Ljava/lang/String;", "getIconUrl", "getActivityV2Id", "Z", "Lcom/whoop/design/models/items/During;", "getDuring", "getInternalName", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityTileSelectionModel {
    private final String activityV2Id;
    private final During during;
    private final TextResource endTimeText;
    private final String iconUrl;
    private final String internalName;
    private final boolean isGpsEnabled;
    private final TextResource scoreDisplay;
    private final TextResource startTimeText;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ActivityTileSelectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ActivityTileSelectionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityTileSelectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ActivityTileSelectionModel() {
        this((TextResource) null, (TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, false, (During) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ActivityTileSelectionModel copy$default(ActivityTileSelectionModel activityTileSelectionModel, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, boolean z4, During during, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = activityTileSelectionModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = activityTileSelectionModel.scoreDisplay;
        }
        if ((i13 & 4) != 0) {
            textResource3 = activityTileSelectionModel.startTimeText;
        }
        if ((i13 & 8) != 0) {
            textResource4 = activityTileSelectionModel.endTimeText;
        }
        if ((i13 & 16) != 0) {
            str = activityTileSelectionModel.iconUrl;
        }
        if ((i13 & 32) != 0) {
            str2 = activityTileSelectionModel.activityV2Id;
        }
        if ((i13 & 64) != 0) {
            z4 = activityTileSelectionModel.isGpsEnabled;
        }
        if ((i13 & 128) != 0) {
            during = activityTileSelectionModel.during;
        }
        if ((i13 & 256) != 0) {
            str3 = activityTileSelectionModel.internalName;
        }
        During during2 = during;
        String str4 = str3;
        String str5 = str2;
        boolean z13 = z4;
        String str6 = str;
        TextResource textResource5 = textResource3;
        return activityTileSelectionModel.copy(textResource, textResource2, textResource5, textResource4, str6, str5, z13, during2, str4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ActivityTileSelectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.scoreDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.scoreDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.startTimeText, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.startTimeText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.endTimeText, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 3, C25452a.f99689a, self.endTimeText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.iconUrl, "")) {
            output.encodeStringElement(serialDesc, 4, self.iconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.activityV2Id, "")) {
            output.encodeStringElement(serialDesc, 5, self.activityV2Id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.isGpsEnabled) {
            output.encodeBooleanElement(serialDesc, 6, self.isGpsEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.during != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, During$$serializer.INSTANCE, self.during);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.internalName == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.internalName);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getStartTimeText() {
        return this.startTimeText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getEndTimeText() {
        return this.endTimeText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getActivityV2Id() {
        return this.activityV2Id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsGpsEnabled() {
        return this.isGpsEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final During getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    public final ActivityTileSelectionModel copy(TextResource title, TextResource scoreDisplay, TextResource startTimeText, TextResource endTimeText, String iconUrl, String activityV2Id, boolean isGpsEnabled, During during, String internalName) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(startTimeText, "startTimeText");
        AbstractC22676k.m65750j(endTimeText, "endTimeText");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(activityV2Id, "activityV2Id");
        return new ActivityTileSelectionModel(title, scoreDisplay, startTimeText, endTimeText, iconUrl, activityV2Id, isGpsEnabled, during, internalName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityTileSelectionModel)) {
            return false;
        }
        ActivityTileSelectionModel activityTileSelectionModel = (ActivityTileSelectionModel) other;
        return AbstractC22676k.m65745e(this.title, activityTileSelectionModel.title) && AbstractC22676k.m65745e(this.scoreDisplay, activityTileSelectionModel.scoreDisplay) && AbstractC22676k.m65745e(this.startTimeText, activityTileSelectionModel.startTimeText) && AbstractC22676k.m65745e(this.endTimeText, activityTileSelectionModel.endTimeText) && AbstractC22676k.m65745e(this.iconUrl, activityTileSelectionModel.iconUrl) && AbstractC22676k.m65745e(this.activityV2Id, activityTileSelectionModel.activityV2Id) && this.isGpsEnabled == activityTileSelectionModel.isGpsEnabled && AbstractC22676k.m65745e(this.during, activityTileSelectionModel.during) && AbstractC22676k.m65745e(this.internalName, activityTileSelectionModel.internalName);
    }

    public final String getActivityV2Id() {
        return this.activityV2Id;
    }

    public final During getDuring() {
        return this.during;
    }

    public final TextResource getEndTimeText() {
        return this.endTimeText;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getInternalName() {
        return this.internalName;
    }

    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    public final TextResource getStartTimeText() {
        return this.startTimeText;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.scoreDisplay, 31), this.startTimeText, 31), this.endTimeText, 31), 31, this.iconUrl), 31, this.activityV2Id), 31, this.isGpsEnabled);
        During during = this.during;
        int iHashCode = (iM8289b + (during == null ? 0 : during.hashCode())) * 31;
        String str = this.internalName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isGpsEnabled() {
        return this.isGpsEnabled;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.scoreDisplay;
        TextResource textResource3 = this.startTimeText;
        TextResource textResource4 = this.endTimeText;
        String str = this.iconUrl;
        String str2 = this.activityV2Id;
        boolean z4 = this.isGpsEnabled;
        During during = this.during;
        String str3 = this.internalName;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ActivityTileSelectionModel(title=", textResource, ", scoreDisplay=", textResource2, ", startTimeText=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", endTimeText=", textResource4, ", iconUrl=");
        AbstractC11266d.m30444B(sbM106658q, str, ", activityV2Id=", str2, ", isGpsEnabled=");
        sbM106658q.append(z4);
        sbM106658q.append(", during=");
        sbM106658q.append(during);
        sbM106658q.append(", internalName=");
        return AbstractC25012a.m73376i(str3, ")", sbM106658q);
    }

    public /* synthetic */ ActivityTileSelectionModel(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, boolean z4, During during, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.scoreDisplay = AbstractC8693b.m21267a();
        } else {
            this.scoreDisplay = textResource2;
        }
        if ((i13 & 4) == 0) {
            this.startTimeText = AbstractC8693b.m21267a();
        } else {
            this.startTimeText = textResource3;
        }
        if ((i13 & 8) == 0) {
            this.endTimeText = AbstractC8693b.m21267a();
        } else {
            this.endTimeText = textResource4;
        }
        if ((i13 & 16) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str;
        }
        if ((i13 & 32) == 0) {
            this.activityV2Id = "";
        } else {
            this.activityV2Id = str2;
        }
        if ((i13 & 64) == 0) {
            this.isGpsEnabled = false;
        } else {
            this.isGpsEnabled = z4;
        }
        if ((i13 & 128) == 0) {
            this.during = null;
        } else {
            this.during = during;
        }
        if ((i13 & 256) == 0) {
            this.internalName = null;
        } else {
            this.internalName = str3;
        }
    }

    public ActivityTileSelectionModel(TextResource title, TextResource scoreDisplay, TextResource startTimeText, TextResource endTimeText, String iconUrl, String activityV2Id, boolean z4, During during, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(startTimeText, "startTimeText");
        AbstractC22676k.m65750j(endTimeText, "endTimeText");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(activityV2Id, "activityV2Id");
        this.title = title;
        this.scoreDisplay = scoreDisplay;
        this.startTimeText = startTimeText;
        this.endTimeText = endTimeText;
        this.iconUrl = iconUrl;
        this.activityV2Id = activityV2Id;
        this.isGpsEnabled = z4;
        this.during = during;
        this.internalName = str;
    }

    public /* synthetic */ ActivityTileSelectionModel(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str, String str2, boolean z4, During during, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? "" : str2, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? null : during, (i13 & 256) != 0 ? null : str3);
    }
}
