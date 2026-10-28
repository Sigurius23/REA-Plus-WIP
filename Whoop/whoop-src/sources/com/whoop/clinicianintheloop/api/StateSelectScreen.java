package com.whoop.clinicianintheloop.api;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImageUrlModel$$serializer;
import com.whoop.design.models.items.SearchFieldModel;
import com.whoop.design.models.items.SelectableCellListModel;
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
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/StateSelectScreen;", "Lgo0/c;", "", "title", "subtitle", "Lcom/whoop/design/models/items/ImageUrlModel;", "image", "Lcom/whoop/design/models/InfoCalloutTileModel;", "disclaimer", "Lcom/whoop/clinicianintheloop/api/StateSelector;", "stateSelector", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/StateSelectScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/ImageUrlModel;", "component4", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component5", "()Lcom/whoop/clinicianintheloop/api/StateSelector;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;)Lcom/whoop/clinicianintheloop/api/StateSelectScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/design/models/items/ImageUrlModel;", "getImage", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getDisclaimer", "Lcom/whoop/clinicianintheloop/api/StateSelector;", "getStateSelector", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StateSelectScreen implements InterfaceC16013c {
    private final InfoCalloutTileModel disclaimer;
    private final ImageUrlModel image;
    private final StateSelector stateSelector;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ((SelectableCellListModel.$stable | SearchFieldModel.$stable) | InfoCalloutTileModel.$stable) | ImageUrlModel.$stable;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.StateSelectScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/StateSelectScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/StateSelectScreen;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StateSelectScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StateSelectScreen(int i13, String str, String str2, ImageUrlModel imageUrlModel, InfoCalloutTileModel infoCalloutTileModel, StateSelector stateSelector, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StateSelectScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.image = imageUrlModel;
        this.disclaimer = infoCalloutTileModel;
        this.stateSelector = stateSelector;
    }

    public static /* synthetic */ StateSelectScreen copy$default(StateSelectScreen stateSelectScreen, String str, String str2, ImageUrlModel imageUrlModel, InfoCalloutTileModel infoCalloutTileModel, StateSelector stateSelector, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stateSelectScreen.title;
        }
        if ((i13 & 2) != 0) {
            str2 = stateSelectScreen.subtitle;
        }
        if ((i13 & 4) != 0) {
            imageUrlModel = stateSelectScreen.image;
        }
        if ((i13 & 8) != 0) {
            infoCalloutTileModel = stateSelectScreen.disclaimer;
        }
        if ((i13 & 16) != 0) {
            stateSelector = stateSelectScreen.stateSelector;
        }
        StateSelector stateSelector2 = stateSelector;
        ImageUrlModel imageUrlModel2 = imageUrlModel;
        return stateSelectScreen.copy(str, str2, imageUrlModel2, infoCalloutTileModel, stateSelector2);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(StateSelectScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, ImageUrlModel$$serializer.INSTANCE, self.image);
        output.encodeNullableSerializableElement(serialDesc, 3, InfoCalloutTileModel$$serializer.INSTANCE, self.disclaimer);
        output.encodeSerializableElement(serialDesc, 4, StateSelector$$serializer.INSTANCE, self.stateSelector);
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
    public final InfoCalloutTileModel getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StateSelector getStateSelector() {
        return this.stateSelector;
    }

    public final StateSelectScreen copy(String title, String subtitle, ImageUrlModel image, InfoCalloutTileModel disclaimer, StateSelector stateSelector) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(stateSelector, "stateSelector");
        return new StateSelectScreen(title, subtitle, image, disclaimer, stateSelector);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateSelectScreen)) {
            return false;
        }
        StateSelectScreen stateSelectScreen = (StateSelectScreen) other;
        return AbstractC22676k.m65745e(this.title, stateSelectScreen.title) && AbstractC22676k.m65745e(this.subtitle, stateSelectScreen.subtitle) && AbstractC22676k.m65745e(this.image, stateSelectScreen.image) && AbstractC22676k.m65745e(this.disclaimer, stateSelectScreen.disclaimer) && AbstractC22676k.m65745e(this.stateSelector, stateSelectScreen.stateSelector);
    }

    public final InfoCalloutTileModel getDisclaimer() {
        return this.disclaimer;
    }

    public final ImageUrlModel getImage() {
        return this.image;
    }

    public final StateSelector getStateSelector() {
        return this.stateSelector;
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
        int iHashCode3 = (iHashCode2 + (imageUrlModel == null ? 0 : imageUrlModel.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.disclaimer;
        return this.stateSelector.hashCode() + ((iHashCode3 + (infoCalloutTileModel != null ? infoCalloutTileModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ImageUrlModel imageUrlModel = this.image;
        InfoCalloutTileModel infoCalloutTileModel = this.disclaimer;
        StateSelector stateSelector = this.stateSelector;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StateSelectScreen(title=", str, ", subtitle=", str2, ", image=");
        sbM32001t.append(imageUrlModel);
        sbM32001t.append(", disclaimer=");
        sbM32001t.append(infoCalloutTileModel);
        sbM32001t.append(", stateSelector=");
        sbM32001t.append(stateSelector);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public StateSelectScreen(String title, String str, ImageUrlModel imageUrlModel, InfoCalloutTileModel infoCalloutTileModel, StateSelector stateSelector) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(stateSelector, "stateSelector");
        this.title = title;
        this.subtitle = str;
        this.image = imageUrlModel;
        this.disclaimer = infoCalloutTileModel;
        this.stateSelector = stateSelector;
    }
}
