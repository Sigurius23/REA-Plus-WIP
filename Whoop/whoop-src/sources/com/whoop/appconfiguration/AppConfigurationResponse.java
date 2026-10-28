package com.whoop.appconfiguration;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/appconfiguration/AppConfigurationResponse;", "", "Lcom/whoop/appconfiguration/TabsConfiguration;", "tabs", "", "shouldFetchAiContext", "<init>", "(Lcom/whoop/appconfiguration/TabsConfiguration;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/appconfiguration/TabsConfiguration;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$app_configuration_release", "(Lcom/whoop/appconfiguration/AppConfigurationResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/appconfiguration/TabsConfiguration;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/whoop/appconfiguration/TabsConfiguration;Ljava/lang/Boolean;)Lcom/whoop/appconfiguration/AppConfigurationResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/appconfiguration/TabsConfiguration;", "getTabs", "Ljava/lang/Boolean;", "getShouldFetchAiContext", "Companion", "$serializer", "a", "app-configuration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AppConfigurationResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean shouldFetchAiContext;
    private final TabsConfiguration tabs;

    /* JADX INFO: renamed from: com.whoop.appconfiguration.AppConfigurationResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/appconfiguration/AppConfigurationResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/appconfiguration/AppConfigurationResponse;", "serializer", "()Lwc3/c;", "app-configuration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AppConfigurationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppConfigurationResponse(int i13, TabsConfiguration tabsConfiguration, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AppConfigurationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.tabs = tabsConfiguration;
        this.shouldFetchAiContext = bool;
    }

    public static /* synthetic */ AppConfigurationResponse copy$default(AppConfigurationResponse appConfigurationResponse, TabsConfiguration tabsConfiguration, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tabsConfiguration = appConfigurationResponse.tabs;
        }
        if ((i13 & 2) != 0) {
            bool = appConfigurationResponse.shouldFetchAiContext;
        }
        return appConfigurationResponse.copy(tabsConfiguration, bool);
    }

    public static final /* synthetic */ void write$Self$app_configuration_release(AppConfigurationResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, TabsConfiguration$$serializer.INSTANCE, self.tabs);
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.shouldFetchAiContext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TabsConfiguration getTabs() {
        return this.tabs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getShouldFetchAiContext() {
        return this.shouldFetchAiContext;
    }

    public final AppConfigurationResponse copy(TabsConfiguration tabs, Boolean shouldFetchAiContext) {
        return new AppConfigurationResponse(tabs, shouldFetchAiContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfigurationResponse)) {
            return false;
        }
        AppConfigurationResponse appConfigurationResponse = (AppConfigurationResponse) other;
        return AbstractC22676k.m65745e(this.tabs, appConfigurationResponse.tabs) && AbstractC22676k.m65745e(this.shouldFetchAiContext, appConfigurationResponse.shouldFetchAiContext);
    }

    public final Boolean getShouldFetchAiContext() {
        return this.shouldFetchAiContext;
    }

    public final TabsConfiguration getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        TabsConfiguration tabsConfiguration = this.tabs;
        int iHashCode = (tabsConfiguration == null ? 0 : tabsConfiguration.hashCode()) * 31;
        Boolean bool = this.shouldFetchAiContext;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "AppConfigurationResponse(tabs=" + this.tabs + ", shouldFetchAiContext=" + this.shouldFetchAiContext + ")";
    }

    public AppConfigurationResponse(TabsConfiguration tabsConfiguration, Boolean bool) {
        this.tabs = tabsConfiguration;
        this.shouldFetchAiContext = bool;
    }
}
