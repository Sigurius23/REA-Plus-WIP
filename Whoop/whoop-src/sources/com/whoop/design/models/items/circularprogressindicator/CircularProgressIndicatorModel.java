package com.whoop.design.models.items.circularprogressindicator;

import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage$$serializer;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;", "currentProgressSteps", "Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;", "currentProgressPercentage", "<init>", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;", "component3", "()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;", "copy", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;)Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;", "getCurrentProgressSteps", "Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;", "getCurrentProgressPercentage", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CircularProgressIndicatorModel implements DesignSystemModel {
    private final CurrentProgressPercentage currentProgressPercentage;
    private final CurrentProgressSteps currentProgressSteps;
    private final String id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CircularProgressIndicatorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CircularProgressIndicatorModel(int i13, String str, CurrentProgressSteps currentProgressSteps, CurrentProgressPercentage currentProgressPercentage, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CircularProgressIndicatorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.currentProgressSteps = currentProgressSteps;
        this.currentProgressPercentage = currentProgressPercentage;
    }

    public static /* synthetic */ CircularProgressIndicatorModel copy$default(CircularProgressIndicatorModel circularProgressIndicatorModel, String str, CurrentProgressSteps currentProgressSteps, CurrentProgressPercentage currentProgressPercentage, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = circularProgressIndicatorModel.id;
        }
        if ((i13 & 2) != 0) {
            currentProgressSteps = circularProgressIndicatorModel.currentProgressSteps;
        }
        if ((i13 & 4) != 0) {
            currentProgressPercentage = circularProgressIndicatorModel.currentProgressPercentage;
        }
        return circularProgressIndicatorModel.copy(str, currentProgressSteps, currentProgressPercentage);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CircularProgressIndicatorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, CurrentProgressSteps$$serializer.INSTANCE, self.currentProgressSteps);
        output.encodeNullableSerializableElement(serialDesc, 2, CurrentProgressPercentage$$serializer.INSTANCE, self.currentProgressPercentage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CurrentProgressSteps getCurrentProgressSteps() {
        return this.currentProgressSteps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CurrentProgressPercentage getCurrentProgressPercentage() {
        return this.currentProgressPercentage;
    }

    public final CircularProgressIndicatorModel copy(String id4, CurrentProgressSteps currentProgressSteps, CurrentProgressPercentage currentProgressPercentage) {
        return new CircularProgressIndicatorModel(id4, currentProgressSteps, currentProgressPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CircularProgressIndicatorModel)) {
            return false;
        }
        CircularProgressIndicatorModel circularProgressIndicatorModel = (CircularProgressIndicatorModel) other;
        return AbstractC22676k.m65745e(this.id, circularProgressIndicatorModel.id) && AbstractC22676k.m65745e(this.currentProgressSteps, circularProgressIndicatorModel.currentProgressSteps) && AbstractC22676k.m65745e(this.currentProgressPercentage, circularProgressIndicatorModel.currentProgressPercentage);
    }

    public final CurrentProgressPercentage getCurrentProgressPercentage() {
        return this.currentProgressPercentage;
    }

    public final CurrentProgressSteps getCurrentProgressSteps() {
        return this.currentProgressSteps;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CurrentProgressSteps currentProgressSteps = this.currentProgressSteps;
        int iHashCode2 = (iHashCode + (currentProgressSteps == null ? 0 : currentProgressSteps.hashCode())) * 31;
        CurrentProgressPercentage currentProgressPercentage = this.currentProgressPercentage;
        return iHashCode2 + (currentProgressPercentage != null ? currentProgressPercentage.hashCode() : 0);
    }

    public String toString() {
        return "CircularProgressIndicatorModel(id=" + this.id + ", currentProgressSteps=" + this.currentProgressSteps + ", currentProgressPercentage=" + this.currentProgressPercentage + ")";
    }

    public CircularProgressIndicatorModel(String str, CurrentProgressSteps currentProgressSteps, CurrentProgressPercentage currentProgressPercentage) {
        this.id = str;
        this.currentProgressSteps = currentProgressSteps;
        this.currentProgressPercentage = currentProgressPercentage;
    }
}
