package com.whoop.design.models.items;

import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.CelebrationMediaModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/MilestoneItem;", "", "", "iconUrl", "text", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "media", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MilestoneItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Lcom/whoop/design/models/items/MilestoneItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconUrl", "getText", "Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "getMedia", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MilestoneItem {
    private final String iconUrl;
    private final CelebrationMediaModel media;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MilestoneItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MilestoneItem;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MilestoneItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MilestoneItem() {
        this((String) null, (String) null, (CelebrationMediaModel) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MilestoneItem copy$default(MilestoneItem milestoneItem, String str, String str2, CelebrationMediaModel celebrationMediaModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = milestoneItem.iconUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = milestoneItem.text;
        }
        if ((i13 & 4) != 0) {
            celebrationMediaModel = milestoneItem.media;
        }
        return milestoneItem.copy(str, str2, celebrationMediaModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MilestoneItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.iconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.iconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.text);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.media == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, CelebrationMediaModel$$serializer.INSTANCE, self.media);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CelebrationMediaModel getMedia() {
        return this.media;
    }

    public final MilestoneItem copy(String iconUrl, String text, CelebrationMediaModel media) {
        return new MilestoneItem(iconUrl, text, media);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilestoneItem)) {
            return false;
        }
        MilestoneItem milestoneItem = (MilestoneItem) other;
        return AbstractC22676k.m65745e(this.iconUrl, milestoneItem.iconUrl) && AbstractC22676k.m65745e(this.text, milestoneItem.text) && AbstractC22676k.m65745e(this.media, milestoneItem.media);
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final CelebrationMediaModel getMedia() {
        return this.media;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CelebrationMediaModel celebrationMediaModel = this.media;
        return iHashCode2 + (celebrationMediaModel != null ? celebrationMediaModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.iconUrl;
        String str2 = this.text;
        CelebrationMediaModel celebrationMediaModel = this.media;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MilestoneItem(iconUrl=", str, ", text=", str2, ", media=");
        sbM32001t.append(celebrationMediaModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ MilestoneItem(int i13, String str, String str2, CelebrationMediaModel celebrationMediaModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str;
        }
        if ((i13 & 2) == 0) {
            this.text = null;
        } else {
            this.text = str2;
        }
        if ((i13 & 4) == 0) {
            this.media = null;
        } else {
            this.media = celebrationMediaModel;
        }
    }

    public MilestoneItem(String str, String str2, CelebrationMediaModel celebrationMediaModel) {
        this.iconUrl = str;
        this.text = str2;
        this.media = celebrationMediaModel;
    }

    public /* synthetic */ MilestoneItem(String str, String str2, CelebrationMediaModel celebrationMediaModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : celebrationMediaModel);
    }
}
