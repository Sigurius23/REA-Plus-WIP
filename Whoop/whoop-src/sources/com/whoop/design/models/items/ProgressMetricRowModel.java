package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.CircularProgressStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJT\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/ProgressMetricRowModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", NotificationCompat.CATEGORY_PROGRESS, "progressDisplay", "Lcom/whoop/design/models/CircularProgressStyle;", "style", "titleDisplay", "subtitleDisplay", "<init>", "(Ljava/lang/String;FLjava/lang/String;Lcom/whoop/design/models/CircularProgressStyle;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;FLjava/lang/String;Lcom/whoop/design/models/CircularProgressStyle;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ProgressMetricRowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "component4", "()Lcom/whoop/design/models/CircularProgressStyle;", "component5", "component6", "copy", "(Ljava/lang/String;FLjava/lang/String;Lcom/whoop/design/models/CircularProgressStyle;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/ProgressMetricRowModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "F", "getProgress", "getProgressDisplay", "Lcom/whoop/design/models/CircularProgressStyle;", "getStyle", "getTitleDisplay", "getSubtitleDisplay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressMetricRowModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final String id;
    private final float progress;
    private final String progressDisplay;
    private final CircularProgressStyle style;
    private final String subtitleDisplay;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36962i(8)), null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ProgressMetricRowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ProgressMetricRowModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressMetricRowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressMetricRowModel(int i13, String str, float f13, String str2, CircularProgressStyle circularProgressStyle, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ProgressMetricRowModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.progress = f13;
        this.progressDisplay = str2;
        this.style = circularProgressStyle;
        this.titleDisplay = str3;
        this.subtitleDisplay = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.CircularProgressStyle", CircularProgressStyle.values());
    }

    public static /* synthetic */ ProgressMetricRowModel copy$default(ProgressMetricRowModel progressMetricRowModel, String str, float f13, String str2, CircularProgressStyle circularProgressStyle, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = progressMetricRowModel.id;
        }
        if ((i13 & 2) != 0) {
            f13 = progressMetricRowModel.progress;
        }
        if ((i13 & 4) != 0) {
            str2 = progressMetricRowModel.progressDisplay;
        }
        if ((i13 & 8) != 0) {
            circularProgressStyle = progressMetricRowModel.style;
        }
        if ((i13 & 16) != 0) {
            str3 = progressMetricRowModel.titleDisplay;
        }
        if ((i13 & 32) != 0) {
            str4 = progressMetricRowModel.subtitleDisplay;
        }
        String str5 = str3;
        String str6 = str4;
        return progressMetricRowModel.copy(str, f13, str2, circularProgressStyle, str5, str6);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProgressMetricRowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeFloatElement(serialDesc, 1, self.progress);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.progressDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        output.encodeStringElement(serialDesc, 4, self.titleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.subtitleDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProgressDisplay() {
        return this.progressDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CircularProgressStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final ProgressMetricRowModel copy(String id4, float progress, String progressDisplay, CircularProgressStyle style, String titleDisplay, String subtitleDisplay) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        return new ProgressMetricRowModel(id4, progress, progressDisplay, style, titleDisplay, subtitleDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressMetricRowModel)) {
            return false;
        }
        ProgressMetricRowModel progressMetricRowModel = (ProgressMetricRowModel) other;
        return AbstractC22676k.m65745e(this.id, progressMetricRowModel.id) && Float.compare(this.progress, progressMetricRowModel.progress) == 0 && AbstractC22676k.m65745e(this.progressDisplay, progressMetricRowModel.progressDisplay) && this.style == progressMetricRowModel.style && AbstractC22676k.m65745e(this.titleDisplay, progressMetricRowModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, progressMetricRowModel.subtitleDisplay);
    }

    public final String getId() {
        return this.id;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final String getProgressDisplay() {
        return this.progressDisplay;
    }

    public final CircularProgressStyle getStyle() {
        return this.style;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.id;
        int iM30447a = AbstractC11266d.m30447a(this.progress, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.progressDisplay;
        int iHashCode = (iM30447a + (str2 == null ? 0 : str2.hashCode())) * 31;
        CircularProgressStyle circularProgressStyle = this.style;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (circularProgressStyle == null ? 0 : circularProgressStyle.hashCode())) * 31, 31, this.titleDisplay);
        String str3 = this.subtitleDisplay;
        return iM30450d + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        float f13 = this.progress;
        String str2 = this.progressDisplay;
        CircularProgressStyle circularProgressStyle = this.style;
        String str3 = this.titleDisplay;
        String str4 = this.subtitleDisplay;
        StringBuilder sb4 = new StringBuilder("ProgressMetricRowModel(id=");
        sb4.append(str);
        sb4.append(", progress=");
        sb4.append(f13);
        sb4.append(", progressDisplay=");
        sb4.append(str2);
        sb4.append(", style=");
        sb4.append(circularProgressStyle);
        sb4.append(", titleDisplay=");
        return AbstractC11266d.m30464r(sb4, str3, ", subtitleDisplay=", str4, ")");
    }

    public ProgressMetricRowModel(String str, float f13, String str2, CircularProgressStyle circularProgressStyle, String titleDisplay, String str3) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        this.id = str;
        this.progress = f13;
        this.progressDisplay = str2;
        this.style = circularProgressStyle;
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = str3;
    }
}
