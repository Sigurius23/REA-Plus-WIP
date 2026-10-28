package com.whoop.navigation;

import ad3.C0756b0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21174w;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/navigation/NavigationScreenModel;", "", "None", "DeserializationError", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface NavigationScreenModel {

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, m65681d2 = {"Lcom/whoop/navigation/NavigationScreenModel$DeserializationError;", "Lcom/whoop/navigation/NavigationScreenModel;", "", "unrecognizedScreen", "Lkotlinx/serialization/json/JsonObject;", "rawParameters", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/NavigationScreenModel$DeserializationError;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "()Ljava/lang/String;", "component1", "component2", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/whoop/navigation/NavigationScreenModel$DeserializationError;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUnrecognizedScreen", "Lkotlinx/serialization/json/JsonObject;", "getRawParameters", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class DeserializationError implements NavigationScreenModel {
        private final JsonObject rawParameters;
        private final String unrecognizedScreen;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        /* JADX INFO: renamed from: com.whoop.navigation.NavigationScreenModel$DeserializationError$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/NavigationScreenModel$DeserializationError$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/NavigationScreenModel$DeserializationError;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return NavigationScreenModel$DeserializationError$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ DeserializationError(int i13, String str, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, NavigationScreenModel$DeserializationError$$serializer.INSTANCE.getDescriptor());
            }
            this.unrecognizedScreen = str;
            this.rawParameters = jsonObject;
        }

        public static /* synthetic */ DeserializationError copy$default(DeserializationError deserializationError, String str, JsonObject jsonObject, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = deserializationError.unrecognizedScreen;
            }
            if ((i13 & 2) != 0) {
                jsonObject = deserializationError.rawParameters;
            }
            return deserializationError.copy(str, jsonObject);
        }

        public static final /* synthetic */ void write$Self$navigation_release(DeserializationError self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.unrecognizedScreen);
            output.encodeSerializableElement(serialDesc, 1, C0756b0.f2760a, self.rawParameters);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUnrecognizedScreen() {
            return this.unrecognizedScreen;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final JsonObject getRawParameters() {
            return this.rawParameters;
        }

        public final DeserializationError copy(String unrecognizedScreen, JsonObject rawParameters) {
            AbstractC22676k.m65750j(unrecognizedScreen, "unrecognizedScreen");
            AbstractC22676k.m65750j(rawParameters, "rawParameters");
            return new DeserializationError(unrecognizedScreen, rawParameters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeserializationError)) {
                return false;
            }
            DeserializationError deserializationError = (DeserializationError) other;
            return AbstractC22676k.m65745e(this.unrecognizedScreen, deserializationError.unrecognizedScreen) && AbstractC22676k.m65745e(this.rawParameters, deserializationError.rawParameters);
        }

        public final JsonObject getRawParameters() {
            return this.rawParameters;
        }

        public final String getUnrecognizedScreen() {
            return this.unrecognizedScreen;
        }

        public int hashCode() {
            return this.rawParameters.hashCode() + (this.unrecognizedScreen.hashCode() * 31);
        }

        public String toString() {
            return "NavigationDeserializationError(screen='" + this.unrecognizedScreen + "', parameters=" + this.rawParameters + ")";
        }

        public DeserializationError(String unrecognizedScreen, JsonObject rawParameters) {
            AbstractC22676k.m65750j(unrecognizedScreen, "unrecognizedScreen");
            AbstractC22676k.m65750j(rawParameters, "rawParameters");
            this.unrecognizedScreen = unrecognizedScreen;
            this.rawParameters = rawParameters;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/navigation/NavigationScreenModel$None;", "Lcom/whoop/navigation/NavigationScreenModel;", "<init>", "()V", "Lwc3/c;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final class None implements NavigationScreenModel {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();
        private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21174w(1));

        private None() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return new ObjectSerializer("com.whoop.navigation.NavigationScreenModel.None", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }
    }
}
