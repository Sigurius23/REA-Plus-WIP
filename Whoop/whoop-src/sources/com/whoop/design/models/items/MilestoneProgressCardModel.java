package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorThemeModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md1.C25452a;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J^\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b=\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/design/models/items/MilestoneProgressCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "description", "", "style", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "colors", "Lcom/whoop/design/models/items/MilestoneItem;", "currentMilestone", "nextMilestone", "", "progressPercent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MilestoneProgressCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/design/models/colortheme/ColorThemeModel;", "component5", "()Lcom/whoop/design/models/items/MilestoneItem;", "component6", "component7", "()D", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)Lcom/whoop/design/models/items/MilestoneProgressCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getDescription", "Ljava/lang/String;", "getStyle", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "getColors", "Lcom/whoop/design/models/items/MilestoneItem;", "getCurrentMilestone", "getNextMilestone", "D", "getProgressPercent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MilestoneProgressCardModel implements DesignSystemModel {
    private final ColorThemeModel colors;
    private final MilestoneItem currentMilestone;
    private final TextResource description;
    private final MilestoneItem nextMilestone;
    private final double progressPercent;
    private final String style;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MilestoneProgressCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MilestoneProgressCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MilestoneProgressCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MilestoneProgressCardModel(int i13, TextResource textResource, TextResource textResource2, String str, ColorThemeModel colorThemeModel, MilestoneItem milestoneItem, MilestoneItem milestoneItem2, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (67 != (i13 & 67)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 67, MilestoneProgressCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.description = textResource2;
        if ((i13 & 4) == 0) {
            this.style = null;
        } else {
            this.style = str;
        }
        if ((i13 & 8) == 0) {
            this.colors = null;
        } else {
            this.colors = colorThemeModel;
        }
        if ((i13 & 16) == 0) {
            this.currentMilestone = null;
        } else {
            this.currentMilestone = milestoneItem;
        }
        if ((i13 & 32) == 0) {
            this.nextMilestone = null;
        } else {
            this.nextMilestone = milestoneItem2;
        }
        this.progressPercent = d3;
    }

    public static /* synthetic */ MilestoneProgressCardModel copy$default(MilestoneProgressCardModel milestoneProgressCardModel, TextResource textResource, TextResource textResource2, String str, ColorThemeModel colorThemeModel, MilestoneItem milestoneItem, MilestoneItem milestoneItem2, double d3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = milestoneProgressCardModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = milestoneProgressCardModel.description;
        }
        if ((i13 & 4) != 0) {
            str = milestoneProgressCardModel.style;
        }
        if ((i13 & 8) != 0) {
            colorThemeModel = milestoneProgressCardModel.colors;
        }
        if ((i13 & 16) != 0) {
            milestoneItem = milestoneProgressCardModel.currentMilestone;
        }
        if ((i13 & 32) != 0) {
            milestoneItem2 = milestoneProgressCardModel.nextMilestone;
        }
        if ((i13 & 64) != 0) {
            d3 = milestoneProgressCardModel.progressPercent;
        }
        double d14 = d3;
        MilestoneItem milestoneItem3 = milestoneItem;
        MilestoneItem milestoneItem4 = milestoneItem2;
        return milestoneProgressCardModel.copy(textResource, textResource2, str, colorThemeModel, milestoneItem3, milestoneItem4, d14);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MilestoneProgressCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.description);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.colors != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, ColorThemeModel$$serializer.INSTANCE, self.colors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.currentMilestone != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, MilestoneItem$$serializer.INSTANCE, self.currentMilestone);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.nextMilestone != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, MilestoneItem$$serializer.INSTANCE, self.nextMilestone);
        }
        output.encodeDoubleElement(serialDesc, 6, self.progressPercent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ColorThemeModel getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MilestoneItem getCurrentMilestone() {
        return this.currentMilestone;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MilestoneItem getNextMilestone() {
        return this.nextMilestone;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getProgressPercent() {
        return this.progressPercent;
    }

    public final MilestoneProgressCardModel copy(TextResource title, TextResource description, String style, ColorThemeModel colors, MilestoneItem currentMilestone, MilestoneItem nextMilestone, double progressPercent) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        return new MilestoneProgressCardModel(title, description, style, colors, currentMilestone, nextMilestone, progressPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilestoneProgressCardModel)) {
            return false;
        }
        MilestoneProgressCardModel milestoneProgressCardModel = (MilestoneProgressCardModel) other;
        return AbstractC22676k.m65745e(this.title, milestoneProgressCardModel.title) && AbstractC22676k.m65745e(this.description, milestoneProgressCardModel.description) && AbstractC22676k.m65745e(this.style, milestoneProgressCardModel.style) && AbstractC22676k.m65745e(this.colors, milestoneProgressCardModel.colors) && AbstractC22676k.m65745e(this.currentMilestone, milestoneProgressCardModel.currentMilestone) && AbstractC22676k.m65745e(this.nextMilestone, milestoneProgressCardModel.nextMilestone) && Double.compare(this.progressPercent, milestoneProgressCardModel.progressPercent) == 0;
    }

    public final ColorThemeModel getColors() {
        return this.colors;
    }

    public final MilestoneItem getCurrentMilestone() {
        return this.currentMilestone;
    }

    public final TextResource getDescription() {
        return this.description;
    }

    public final MilestoneItem getNextMilestone() {
        return this.nextMilestone;
    }

    public final double getProgressPercent() {
        return this.progressPercent;
    }

    public final String getStyle() {
        return this.style;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31);
        String str = this.style;
        int iHashCode = (iM95625a + (str == null ? 0 : str.hashCode())) * 31;
        ColorThemeModel colorThemeModel = this.colors;
        int iHashCode2 = (iHashCode + (colorThemeModel == null ? 0 : colorThemeModel.hashCode())) * 31;
        MilestoneItem milestoneItem = this.currentMilestone;
        int iHashCode3 = (iHashCode2 + (milestoneItem == null ? 0 : milestoneItem.hashCode())) * 31;
        MilestoneItem milestoneItem2 = this.nextMilestone;
        return Double.hashCode(this.progressPercent) + ((iHashCode3 + (milestoneItem2 != null ? milestoneItem2.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        String str = this.style;
        ColorThemeModel colorThemeModel = this.colors;
        MilestoneItem milestoneItem = this.currentMilestone;
        MilestoneItem milestoneItem2 = this.nextMilestone;
        double d3 = this.progressPercent;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MilestoneProgressCardModel(title=", textResource, ", description=", textResource2, ", style=");
        sbM106658q.append(str);
        sbM106658q.append(", colors=");
        sbM106658q.append(colorThemeModel);
        sbM106658q.append(", currentMilestone=");
        sbM106658q.append(milestoneItem);
        sbM106658q.append(", nextMilestone=");
        sbM106658q.append(milestoneItem2);
        sbM106658q.append(", progressPercent=");
        return AbstractC30007c.m91836f(d3, ")", sbM106658q);
    }

    public MilestoneProgressCardModel(TextResource title, TextResource description, String str, ColorThemeModel colorThemeModel, MilestoneItem milestoneItem, MilestoneItem milestoneItem2, double d3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.description = description;
        this.style = str;
        this.colors = colorThemeModel;
        this.currentMilestone = milestoneItem;
        this.nextMilestone = milestoneItem2;
        this.progressPercent = d3;
    }

    public /* synthetic */ MilestoneProgressCardModel(TextResource textResource, TextResource textResource2, String str, ColorThemeModel colorThemeModel, MilestoneItem milestoneItem, MilestoneItem milestoneItem2, double d3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : colorThemeModel, (i13 & 16) != 0 ? null : milestoneItem, (i13 & 32) != 0 ? null : milestoneItem2, d3);
    }
}
