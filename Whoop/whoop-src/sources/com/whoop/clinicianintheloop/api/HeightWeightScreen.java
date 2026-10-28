package com.whoop.clinicianintheloop.api;

import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImageUrlModel$$serializer;
import com.whoop.design.models.items.heightweight.HeightWeightModel;
import com.whoop.design.models.items.heightweight.HeightWeightModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import go0.InterfaceC16013c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HeightWeightScreen;", "Lgo0/c;", "", "title", "subtitle", "Lcom/whoop/design/models/items/ImageUrlModel;", "image", "Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "heightWeightPicker", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/items/heightweight/HeightWeightModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/items/heightweight/HeightWeightModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/HeightWeightScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/ImageUrlModel;", "component4", "()Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/items/heightweight/HeightWeightModel;)Lcom/whoop/clinicianintheloop/api/HeightWeightScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/design/models/items/ImageUrlModel;", "getImage", "Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "getHeightWeightPicker", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeightWeightScreen implements InterfaceC16013c {
    private final HeightWeightModel heightWeightPicker;
    private final ImageUrlModel image;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = HeightWeightModel.$stable | ImageUrlModel.$stable;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.HeightWeightScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HeightWeightScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/HeightWeightScreen;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeightWeightScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeightWeightScreen(int i13, String str, String str2, ImageUrlModel imageUrlModel, HeightWeightModel heightWeightModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, HeightWeightScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.image = imageUrlModel;
        this.heightWeightPicker = heightWeightModel;
    }

    public static /* synthetic */ HeightWeightScreen copy$default(HeightWeightScreen heightWeightScreen, String str, String str2, ImageUrlModel imageUrlModel, HeightWeightModel heightWeightModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = heightWeightScreen.title;
        }
        if ((i13 & 2) != 0) {
            str2 = heightWeightScreen.subtitle;
        }
        if ((i13 & 4) != 0) {
            imageUrlModel = heightWeightScreen.image;
        }
        if ((i13 & 8) != 0) {
            heightWeightModel = heightWeightScreen.heightWeightPicker;
        }
        return heightWeightScreen.copy(str, str2, imageUrlModel, heightWeightModel);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(HeightWeightScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, ImageUrlModel$$serializer.INSTANCE, self.image);
        output.encodeSerializableElement(serialDesc, 3, HeightWeightModel$$serializer.INSTANCE, self.heightWeightPicker);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImageUrlModel getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HeightWeightModel getHeightWeightPicker() {
        return this.heightWeightPicker;
    }

    public final HeightWeightScreen copy(String title, String subtitle, ImageUrlModel image, HeightWeightModel heightWeightPicker) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(heightWeightPicker, "heightWeightPicker");
        return new HeightWeightScreen(title, subtitle, image, heightWeightPicker);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeightWeightScreen)) {
            return false;
        }
        HeightWeightScreen heightWeightScreen = (HeightWeightScreen) other;
        return AbstractC22676k.m65745e(this.title, heightWeightScreen.title) && AbstractC22676k.m65745e(this.subtitle, heightWeightScreen.subtitle) && AbstractC22676k.m65745e(this.image, heightWeightScreen.image) && AbstractC22676k.m65745e(this.heightWeightPicker, heightWeightScreen.heightWeightPicker);
    }

    public final HeightWeightModel getHeightWeightPicker() {
        return this.heightWeightPicker;
    }

    public final ImageUrlModel getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageUrlModel imageUrlModel = this.image;
        return this.heightWeightPicker.hashCode() + ((iHashCode2 + (imageUrlModel != null ? imageUrlModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ImageUrlModel imageUrlModel = this.image;
        HeightWeightModel heightWeightModel = this.heightWeightPicker;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HeightWeightScreen(title=", str, ", subtitle=", str2, ", image=");
        sbM32001t.append(imageUrlModel);
        sbM32001t.append(", heightWeightPicker=");
        sbM32001t.append(heightWeightModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HeightWeightScreen(String title, String str, ImageUrlModel imageUrlModel, HeightWeightModel heightWeightPicker) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(heightWeightPicker, "heightWeightPicker");
        this.title = title;
        this.subtitle = str;
        this.image = imageUrlModel;
        this.heightWeightPicker = heightWeightPicker;
    }
}
