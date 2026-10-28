package com.whoop.communityeverydaystats.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xo1.C38492a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b#\u0010$Jd\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006;"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "titleDisplay", "subtitleDisplay", "subtitleStyle", "imageUrl", "iconKey", "", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;", "stats", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_everyday_stats_release", "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitleDisplay", "getSubtitleDisplay", "getSubtitleStyle", "getImageUrl", "getIconKey", "Ljava/util/List;", "getStats", "Companion", "$serializer", "a", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SnapshotExerciseTileModel implements DesignSystemModel {
    private final String iconKey;
    private final String id;
    private final String imageUrl;
    private final List<SnapshotExerciseStatModel> stats;
    private final String subtitleDisplay;
    private final String subtitleStyle;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38492a(7))};

    /* JADX INFO: renamed from: com.whoop.communityeverydaystats.domain.models.SnapshotExerciseTileModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;", "serializer", "()Lwc3/c;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SnapshotExerciseTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SnapshotExerciseTileModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, SnapshotExerciseTileModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.titleDisplay = str2;
        this.subtitleDisplay = str3;
        if ((i13 & 8) == 0) {
            this.subtitleStyle = null;
        } else {
            this.subtitleStyle = str4;
        }
        if ((i13 & 16) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str5;
        }
        if ((i13 & 32) == 0) {
            this.iconKey = null;
        } else {
            this.iconKey = str6;
        }
        if ((i13 & 64) == 0) {
            this.stats = C25271y.f99162w;
        } else {
            this.stats = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SnapshotExerciseStatModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SnapshotExerciseTileModel copy$default(SnapshotExerciseTileModel snapshotExerciseTileModel, String str, String str2, String str3, String str4, String str5, String str6, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = snapshotExerciseTileModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = snapshotExerciseTileModel.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = snapshotExerciseTileModel.subtitleDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = snapshotExerciseTileModel.subtitleStyle;
        }
        if ((i13 & 16) != 0) {
            str5 = snapshotExerciseTileModel.imageUrl;
        }
        if ((i13 & 32) != 0) {
            str6 = snapshotExerciseTileModel.iconKey;
        }
        if ((i13 & 64) != 0) {
            list = snapshotExerciseTileModel.stats;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return snapshotExerciseTileModel.copy(str, str2, str9, str4, str8, str7, list2);
    }

    public static final /* synthetic */ void write$Self$community_everyday_stats_release(SnapshotExerciseTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeStringElement(serialDesc, 2, self.subtitleDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.subtitleStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtitleStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.iconKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.iconKey);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.stats, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.stats);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconKey() {
        return this.iconKey;
    }

    public final List<SnapshotExerciseStatModel> component7() {
        return this.stats;
    }

    public final SnapshotExerciseTileModel copy(String id4, String titleDisplay, String subtitleDisplay, String subtitleStyle, String imageUrl, String iconKey, List<SnapshotExerciseStatModel> stats) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(stats, "stats");
        return new SnapshotExerciseTileModel(id4, titleDisplay, subtitleDisplay, subtitleStyle, imageUrl, iconKey, stats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapshotExerciseTileModel)) {
            return false;
        }
        SnapshotExerciseTileModel snapshotExerciseTileModel = (SnapshotExerciseTileModel) other;
        return AbstractC22676k.m65745e(this.id, snapshotExerciseTileModel.id) && AbstractC22676k.m65745e(this.titleDisplay, snapshotExerciseTileModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, snapshotExerciseTileModel.subtitleDisplay) && AbstractC22676k.m65745e(this.subtitleStyle, snapshotExerciseTileModel.subtitleStyle) && AbstractC22676k.m65745e(this.imageUrl, snapshotExerciseTileModel.imageUrl) && AbstractC22676k.m65745e(this.iconKey, snapshotExerciseTileModel.iconKey) && AbstractC22676k.m65745e(this.stats, snapshotExerciseTileModel.stats);
    }

    public final String getIconKey() {
        return this.iconKey;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<SnapshotExerciseStatModel> getStats() {
        return this.stats;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getSubtitleStyle() {
        return this.subtitleStyle;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.titleDisplay), 31, this.subtitleDisplay);
        String str2 = this.subtitleStyle;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconKey;
        return this.stats.hashCode() + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.titleDisplay;
        String str3 = this.subtitleDisplay;
        String str4 = this.subtitleStyle;
        String str5 = this.imageUrl;
        String str6 = this.iconKey;
        List<SnapshotExerciseStatModel> list = this.stats;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SnapshotExerciseTileModel(id=", str, ", titleDisplay=", str2, ", subtitleDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitleStyle=", str4, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", iconKey=", str6, ", stats=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public SnapshotExerciseTileModel(String str, String titleDisplay, String subtitleDisplay, String str2, String str3, String str4, List<SnapshotExerciseStatModel> stats) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(stats, "stats");
        this.id = str;
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.subtitleStyle = str2;
        this.imageUrl = str3;
        this.iconKey = str4;
        this.stats = stats;
    }

    public /* synthetic */ SnapshotExerciseTileModel(String str, String str2, String str3, String str4, String str5, String str6, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? C25271y.f99162w : list);
    }
}
