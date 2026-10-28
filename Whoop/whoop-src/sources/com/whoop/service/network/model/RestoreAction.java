package com.whoop.service.network.model;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, m65681d2 = {"Lcom/whoop/service/network/model/RestoreAction;", "", "", "screenName", "Lcom/whoop/service/network/model/ActionParameters;", "parameters", "<init>", "(Ljava/lang/String;Lcom/whoop/service/network/model/ActionParameters;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/service/network/model/ActionParameters;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/RestoreAction;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/service/network/model/ActionParameters;", "copy", "(Ljava/lang/String;Lcom/whoop/service/network/model/ActionParameters;)Lcom/whoop/service/network/model/RestoreAction;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreenName", "Lcom/whoop/service/network/model/ActionParameters;", "getParameters", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RestoreAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("parameters")
    private final ActionParameters parameters;

    @SerializedName("screen_name")
    private final String screenName;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/RestoreAction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/RestoreAction;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RestoreAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RestoreAction(int i13, String str, ActionParameters actionParameters, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, RestoreAction$$serializer.INSTANCE.getDescriptor());
        }
        this.screenName = str;
        this.parameters = actionParameters;
    }

    public static /* synthetic */ RestoreAction copy$default(RestoreAction restoreAction, String str, ActionParameters actionParameters, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = restoreAction.screenName;
        }
        if ((i13 & 2) != 0) {
            actionParameters = restoreAction.parameters;
        }
        return restoreAction.copy(str, actionParameters);
    }

    public static final /* synthetic */ void write$Self$core_release(RestoreAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.screenName);
        output.encodeSerializableElement(serialDesc, 1, ActionParameters$$serializer.INSTANCE, self.parameters);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActionParameters getParameters() {
        return this.parameters;
    }

    public final RestoreAction copy(String screenName, ActionParameters parameters) {
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new RestoreAction(screenName, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestoreAction)) {
            return false;
        }
        RestoreAction restoreAction = (RestoreAction) other;
        return AbstractC22676k.m65745e(this.screenName, restoreAction.screenName) && AbstractC22676k.m65745e(this.parameters, restoreAction.parameters);
    }

    public final ActionParameters getParameters() {
        return this.parameters;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.screenName.hashCode() * 31);
    }

    public String toString() {
        return "RestoreAction(screenName=" + this.screenName + ", parameters=" + this.parameters + ")";
    }

    public RestoreAction(String screenName, ActionParameters parameters) {
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.screenName = screenName;
        this.parameters = parameters;
    }
}
