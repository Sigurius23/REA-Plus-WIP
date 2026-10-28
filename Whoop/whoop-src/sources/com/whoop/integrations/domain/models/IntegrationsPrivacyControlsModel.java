package com.whoop.integrations.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;", "", "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;", "automaticImportControl", "automaticExportControl", "<init>", "(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$integrations_release", "(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;", "component2", "copy", "(Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;)Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlModel;", "getAutomaticImportControl", "getAutomaticExportControl", "Companion", "$serializer", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntegrationsPrivacyControlsModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("automatic_export_control")
    private final IntegrationsPrivacyControlModel automaticExportControl;

    @SerializedName("automatic_import_control")
    private final IntegrationsPrivacyControlModel automaticImportControl;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;", "serializer", "()Lwc3/c;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntegrationsPrivacyControlsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntegrationsPrivacyControlsModel(int i13, IntegrationsPrivacyControlModel integrationsPrivacyControlModel, IntegrationsPrivacyControlModel integrationsPrivacyControlModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, IntegrationsPrivacyControlsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.automaticImportControl = integrationsPrivacyControlModel;
        this.automaticExportControl = integrationsPrivacyControlModel2;
    }

    public static /* synthetic */ IntegrationsPrivacyControlsModel copy$default(IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel, IntegrationsPrivacyControlModel integrationsPrivacyControlModel, IntegrationsPrivacyControlModel integrationsPrivacyControlModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            integrationsPrivacyControlModel = integrationsPrivacyControlsModel.automaticImportControl;
        }
        if ((i13 & 2) != 0) {
            integrationsPrivacyControlModel2 = integrationsPrivacyControlsModel.automaticExportControl;
        }
        return integrationsPrivacyControlsModel.copy(integrationsPrivacyControlModel, integrationsPrivacyControlModel2);
    }

    public static final /* synthetic */ void write$Self$integrations_release(IntegrationsPrivacyControlsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        IntegrationsPrivacyControlModel$$serializer integrationsPrivacyControlModel$$serializer = IntegrationsPrivacyControlModel$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, integrationsPrivacyControlModel$$serializer, self.automaticImportControl);
        output.encodeNullableSerializableElement(serialDesc, 1, integrationsPrivacyControlModel$$serializer, self.automaticExportControl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IntegrationsPrivacyControlModel getAutomaticImportControl() {
        return this.automaticImportControl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IntegrationsPrivacyControlModel getAutomaticExportControl() {
        return this.automaticExportControl;
    }

    public final IntegrationsPrivacyControlsModel copy(IntegrationsPrivacyControlModel automaticImportControl, IntegrationsPrivacyControlModel automaticExportControl) {
        return new IntegrationsPrivacyControlsModel(automaticImportControl, automaticExportControl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationsPrivacyControlsModel)) {
            return false;
        }
        IntegrationsPrivacyControlsModel integrationsPrivacyControlsModel = (IntegrationsPrivacyControlsModel) other;
        return AbstractC22676k.m65745e(this.automaticImportControl, integrationsPrivacyControlsModel.automaticImportControl) && AbstractC22676k.m65745e(this.automaticExportControl, integrationsPrivacyControlsModel.automaticExportControl);
    }

    public final IntegrationsPrivacyControlModel getAutomaticExportControl() {
        return this.automaticExportControl;
    }

    public final IntegrationsPrivacyControlModel getAutomaticImportControl() {
        return this.automaticImportControl;
    }

    public int hashCode() {
        IntegrationsPrivacyControlModel integrationsPrivacyControlModel = this.automaticImportControl;
        int iHashCode = (integrationsPrivacyControlModel == null ? 0 : integrationsPrivacyControlModel.hashCode()) * 31;
        IntegrationsPrivacyControlModel integrationsPrivacyControlModel2 = this.automaticExportControl;
        return iHashCode + (integrationsPrivacyControlModel2 != null ? integrationsPrivacyControlModel2.hashCode() : 0);
    }

    public String toString() {
        return "IntegrationsPrivacyControlsModel(automaticImportControl=" + this.automaticImportControl + ", automaticExportControl=" + this.automaticExportControl + ")";
    }

    public IntegrationsPrivacyControlsModel(IntegrationsPrivacyControlModel integrationsPrivacyControlModel, IntegrationsPrivacyControlModel integrationsPrivacyControlModel2) {
        this.automaticImportControl = integrationsPrivacyControlModel;
        this.automaticExportControl = integrationsPrivacyControlModel2;
    }
}
