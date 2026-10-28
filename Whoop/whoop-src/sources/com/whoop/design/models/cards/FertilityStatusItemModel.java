package com.whoop.design.models.cards;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/cards/FertilityStatusItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "startTitle", "endTitle", "icon", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/FertilityStatusItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/FertilityStatusItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartTitle", "getEndTitle", "getIcon", "getStatus", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FertilityStatusItemModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String endTitle;
    private final String icon;
    private final String startTitle;
    private final String status;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/FertilityStatusItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/FertilityStatusItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FertilityStatusItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FertilityStatusItemModel(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, FertilityStatusItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.startTitle = str;
        this.endTitle = str2;
        this.icon = str3;
        this.status = str4;
    }

    public static /* synthetic */ FertilityStatusItemModel copy$default(FertilityStatusItemModel fertilityStatusItemModel, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fertilityStatusItemModel.startTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = fertilityStatusItemModel.endTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = fertilityStatusItemModel.icon;
        }
        if ((i13 & 8) != 0) {
            str4 = fertilityStatusItemModel.status;
        }
        return fertilityStatusItemModel.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FertilityStatusItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.startTitle);
        output.encodeStringElement(serialDesc, 1, self.endTitle);
        output.encodeStringElement(serialDesc, 2, self.icon);
        output.encodeStringElement(serialDesc, 3, self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartTitle() {
        return this.startTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndTitle() {
        return this.endTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final FertilityStatusItemModel copy(String startTitle, String endTitle, String icon, String status) {
        AbstractC22676k.m65750j(startTitle, "startTitle");
        AbstractC22676k.m65750j(endTitle, "endTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(status, "status");
        return new FertilityStatusItemModel(startTitle, endTitle, icon, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FertilityStatusItemModel)) {
            return false;
        }
        FertilityStatusItemModel fertilityStatusItemModel = (FertilityStatusItemModel) other;
        return AbstractC22676k.m65745e(this.startTitle, fertilityStatusItemModel.startTitle) && AbstractC22676k.m65745e(this.endTitle, fertilityStatusItemModel.endTitle) && AbstractC22676k.m65745e(this.icon, fertilityStatusItemModel.icon) && AbstractC22676k.m65745e(this.status, fertilityStatusItemModel.status);
    }

    public final String getEndTitle() {
        return this.endTitle;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getStartTitle() {
        return this.startTitle;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.startTitle.hashCode() * 31, 31, this.endTitle), 31, this.icon);
    }

    public String toString() {
        String str = this.startTitle;
        String str2 = this.endTitle;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("FertilityStatusItemModel(startTitle=", str, ", endTitle=", str2, ", icon="), this.icon, ", status=", this.status, ")");
    }

    public FertilityStatusItemModel(String startTitle, String endTitle, String icon, String status) {
        AbstractC22676k.m65750j(startTitle, "startTitle");
        AbstractC22676k.m65750j(endTitle, "endTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(status, "status");
        this.startTitle = startTitle;
        this.endTitle = endTitle;
        this.icon = icon;
        this.status = status;
    }
}
