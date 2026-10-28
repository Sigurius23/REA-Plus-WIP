package com.whoop.clinicianintheloop.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HealthIntakeResponseItem;", "", "", "screenId", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;", "response", "<init>", "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/HealthIntakeResponseItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;", "copy", "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;)Lcom/whoop/clinicianintheloop/api/HealthIntakeResponseItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreenId", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponse;", "getResponse", "getResponse$annotations", "()V", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthIntakeResponseItem {
    private final HealthIntakeResponse response;
    private final String screenId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15999a(7))};

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.HealthIntakeResponseItem$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/HealthIntakeResponseItem$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/HealthIntakeResponseItem;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthIntakeResponseItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthIntakeResponseItem(int i13, String str, HealthIntakeResponse healthIntakeResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, HealthIntakeResponseItem$$serializer.INSTANCE.getDescriptor());
        }
        this.screenId = str;
        this.response = healthIntakeResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new C6166a();
    }

    public static /* synthetic */ HealthIntakeResponseItem copy$default(HealthIntakeResponseItem healthIntakeResponseItem, String str, HealthIntakeResponse healthIntakeResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthIntakeResponseItem.screenId;
        }
        if ((i13 & 2) != 0) {
            healthIntakeResponse = healthIntakeResponseItem.response;
        }
        return healthIntakeResponseItem.copy(str, healthIntakeResponse);
    }

    @InterfaceC37144i(with = C6166a.class)
    public static /* synthetic */ void getResponse$annotations() {
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(HealthIntakeResponseItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.screenId);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.response);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthIntakeResponse getResponse() {
        return this.response;
    }

    public final HealthIntakeResponseItem copy(String screenId, HealthIntakeResponse response) {
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(response, "response");
        return new HealthIntakeResponseItem(screenId, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthIntakeResponseItem)) {
            return false;
        }
        HealthIntakeResponseItem healthIntakeResponseItem = (HealthIntakeResponseItem) other;
        return AbstractC22676k.m65745e(this.screenId, healthIntakeResponseItem.screenId) && AbstractC22676k.m65745e(this.response, healthIntakeResponseItem.response);
    }

    public final HealthIntakeResponse getResponse() {
        return this.response;
    }

    public final String getScreenId() {
        return this.screenId;
    }

    public int hashCode() {
        return this.response.hashCode() + (this.screenId.hashCode() * 31);
    }

    public String toString() {
        return "HealthIntakeResponseItem(screenId=" + this.screenId + ", response=" + this.response + ")";
    }

    public HealthIntakeResponseItem(String screenId, HealthIntakeResponse response) {
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(response, "response");
        this.screenId = screenId;
        this.response = response;
    }
}
