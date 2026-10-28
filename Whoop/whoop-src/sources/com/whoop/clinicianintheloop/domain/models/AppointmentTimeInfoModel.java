package com.whoop.clinicianintheloop.domain.models;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;", HttpHeaders.DATE, "time", "Lcom/whoop/design/models/items/TagModel;", "confirmationTag", "<init>", "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;", "component3", "component4", "()Lcom/whoop/design/models/items/TagModel;", "copy", "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;)Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/clinicianintheloop/domain/models/AppointmentDate;", "getDate", "getTime", "Lcom/whoop/design/models/items/TagModel;", "getConfirmationTag", "Companion", "$serializer", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AppointmentTimeInfoModel implements DesignSystemModel {
    private final TagModel confirmationTag;
    private final AppointmentDate date;
    private final String id;
    private final String time;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TagModel.$stable;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AppointmentTimeInfoModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppointmentTimeInfoModel(int i13, String str, AppointmentDate appointmentDate, String str2, TagModel tagModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AppointmentTimeInfoModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.date = appointmentDate;
        this.time = str2;
        this.confirmationTag = tagModel;
    }

    public static /* synthetic */ AppointmentTimeInfoModel copy$default(AppointmentTimeInfoModel appointmentTimeInfoModel, String str, AppointmentDate appointmentDate, String str2, TagModel tagModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = appointmentTimeInfoModel.id;
        }
        if ((i13 & 2) != 0) {
            appointmentDate = appointmentTimeInfoModel.date;
        }
        if ((i13 & 4) != 0) {
            str2 = appointmentTimeInfoModel.time;
        }
        if ((i13 & 8) != 0) {
            tagModel = appointmentTimeInfoModel.confirmationTag;
        }
        return appointmentTimeInfoModel.copy(str, appointmentDate, str2, tagModel);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(AppointmentTimeInfoModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, AppointmentDate$$serializer.INSTANCE, self.date);
        output.encodeStringElement(serialDesc, 2, self.time);
        output.encodeSerializableElement(serialDesc, 3, TagModel$$serializer.INSTANCE, self.confirmationTag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppointmentDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TagModel getConfirmationTag() {
        return this.confirmationTag;
    }

    public final AppointmentTimeInfoModel copy(String id4, AppointmentDate date, String time, TagModel confirmationTag) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(confirmationTag, "confirmationTag");
        return new AppointmentTimeInfoModel(id4, date, time, confirmationTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentTimeInfoModel)) {
            return false;
        }
        AppointmentTimeInfoModel appointmentTimeInfoModel = (AppointmentTimeInfoModel) other;
        return AbstractC22676k.m65745e(this.id, appointmentTimeInfoModel.id) && AbstractC22676k.m65745e(this.date, appointmentTimeInfoModel.date) && AbstractC22676k.m65745e(this.time, appointmentTimeInfoModel.time) && AbstractC22676k.m65745e(this.confirmationTag, appointmentTimeInfoModel.confirmationTag);
    }

    public final TagModel getConfirmationTag() {
        return this.confirmationTag;
    }

    public final AppointmentDate getDate() {
        return this.date;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.confirmationTag.hashCode() + AbstractC11266d.m30450d((this.date.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.time);
    }

    public String toString() {
        return "AppointmentTimeInfoModel(id=" + this.id + ", date=" + this.date + ", time=" + this.time + ", confirmationTag=" + this.confirmationTag + ")";
    }

    public AppointmentTimeInfoModel(String id4, AppointmentDate date, String time, TagModel confirmationTag) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(confirmationTag, "confirmationTag");
        this.id = id4;
        this.date = date;
        this.time = time;
        this.confirmationTag = confirmationTag;
    }
}
