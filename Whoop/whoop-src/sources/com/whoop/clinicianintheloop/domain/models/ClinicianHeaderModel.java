package com.whoop.clinicianintheloop.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImageUrlModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J^\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/models/items/ImageUrlModel;", "headshot", "subtitle", "title", "Lcom/whoop/design/models/items/TagModel;", "tag", "Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;", "icon", "", "useTileBackground", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/ImageUrlModel;", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/TagModel;", "component6", "()Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;", "component7", "()Z", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;Z)Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/ImageUrlModel;", "getHeadshot", "getSubtitle", "getTitle", "Lcom/whoop/design/models/items/TagModel;", "getTag", "Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;", "getIcon", "Z", "getUseTileBackground", "Companion", "$serializer", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ClinicianHeaderModel implements DesignSystemModel {
    private final ImageUrlModel headshot;
    private final TappableIconModel icon;
    private final String id;
    private final String subtitle;
    private final TagModel tag;
    private final String title;
    private final boolean useTileBackground;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = (AnyModal.$stable | TagModel.$stable) | ImageUrlModel.$stable;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ClinicianHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClinicianHeaderModel(int i13, String str, ImageUrlModel imageUrlModel, String str2, String str3, TagModel tagModel, TappableIconModel tappableIconModel, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ClinicianHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.headshot = imageUrlModel;
        this.subtitle = str2;
        this.title = str3;
        this.tag = tagModel;
        this.icon = tappableIconModel;
        if ((i13 & 64) == 0) {
            this.useTileBackground = false;
        } else {
            this.useTileBackground = z4;
        }
    }

    public static /* synthetic */ ClinicianHeaderModel copy$default(ClinicianHeaderModel clinicianHeaderModel, String str, ImageUrlModel imageUrlModel, String str2, String str3, TagModel tagModel, TappableIconModel tappableIconModel, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = clinicianHeaderModel.id;
        }
        if ((i13 & 2) != 0) {
            imageUrlModel = clinicianHeaderModel.headshot;
        }
        if ((i13 & 4) != 0) {
            str2 = clinicianHeaderModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str3 = clinicianHeaderModel.title;
        }
        if ((i13 & 16) != 0) {
            tagModel = clinicianHeaderModel.tag;
        }
        if ((i13 & 32) != 0) {
            tappableIconModel = clinicianHeaderModel.icon;
        }
        if ((i13 & 64) != 0) {
            z4 = clinicianHeaderModel.useTileBackground;
        }
        TappableIconModel tappableIconModel2 = tappableIconModel;
        boolean z13 = z4;
        TagModel tagModel2 = tagModel;
        String str4 = str2;
        return clinicianHeaderModel.copy(str, imageUrlModel, str4, str3, tagModel2, tappableIconModel2, z13);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(ClinicianHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, ImageUrlModel$$serializer.INSTANCE, self.headshot);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.title);
        output.encodeNullableSerializableElement(serialDesc, 4, TagModel$$serializer.INSTANCE, self.tag);
        output.encodeNullableSerializableElement(serialDesc, 5, TappableIconModel$$serializer.INSTANCE, self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.useTileBackground) {
            output.encodeBooleanElement(serialDesc, 6, self.useTileBackground);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageUrlModel getHeadshot() {
        return this.headshot;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TappableIconModel getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getUseTileBackground() {
        return this.useTileBackground;
    }

    public final ClinicianHeaderModel copy(String id4, ImageUrlModel headshot, String subtitle, String title, TagModel tag, TappableIconModel icon, boolean useTileBackground) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        return new ClinicianHeaderModel(id4, headshot, subtitle, title, tag, icon, useTileBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClinicianHeaderModel)) {
            return false;
        }
        ClinicianHeaderModel clinicianHeaderModel = (ClinicianHeaderModel) other;
        return AbstractC22676k.m65745e(this.id, clinicianHeaderModel.id) && AbstractC22676k.m65745e(this.headshot, clinicianHeaderModel.headshot) && AbstractC22676k.m65745e(this.subtitle, clinicianHeaderModel.subtitle) && AbstractC22676k.m65745e(this.title, clinicianHeaderModel.title) && AbstractC22676k.m65745e(this.tag, clinicianHeaderModel.tag) && AbstractC22676k.m65745e(this.icon, clinicianHeaderModel.icon) && this.useTileBackground == clinicianHeaderModel.useTileBackground;
    }

    public final ImageUrlModel getHeadshot() {
        return this.headshot;
    }

    public final TappableIconModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getUseTileBackground() {
        return this.useTileBackground;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        ImageUrlModel imageUrlModel = this.headshot;
        int iHashCode2 = (iHashCode + (imageUrlModel == null ? 0 : imageUrlModel.hashCode())) * 31;
        String str = this.subtitle;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
        TagModel tagModel = this.tag;
        int iHashCode3 = (iM30450d + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        TappableIconModel tappableIconModel = this.icon;
        return Boolean.hashCode(this.useTileBackground) + ((iHashCode3 + (tappableIconModel != null ? tappableIconModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        ImageUrlModel imageUrlModel = this.headshot;
        String str2 = this.subtitle;
        String str3 = this.title;
        TagModel tagModel = this.tag;
        TappableIconModel tappableIconModel = this.icon;
        boolean z4 = this.useTileBackground;
        StringBuilder sb4 = new StringBuilder("ClinicianHeaderModel(id=");
        sb4.append(str);
        sb4.append(", headshot=");
        sb4.append(imageUrlModel);
        sb4.append(", subtitle=");
        AbstractC11266d.m30444B(sb4, str2, ", title=", str3, ", tag=");
        sb4.append(tagModel);
        sb4.append(", icon=");
        sb4.append(tappableIconModel);
        sb4.append(", useTileBackground=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public ClinicianHeaderModel(String id4, ImageUrlModel imageUrlModel, String str, String title, TagModel tagModel, TappableIconModel tappableIconModel, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.headshot = imageUrlModel;
        this.subtitle = str;
        this.title = title;
        this.tag = tagModel;
        this.icon = tappableIconModel;
        this.useTileBackground = z4;
    }

    public /* synthetic */ ClinicianHeaderModel(String str, ImageUrlModel imageUrlModel, String str2, String str3, TagModel tagModel, TappableIconModel tappableIconModel, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, imageUrlModel, str2, str3, tagModel, tappableIconModel, (i13 & 64) != 0 ? false : z4);
    }
}
