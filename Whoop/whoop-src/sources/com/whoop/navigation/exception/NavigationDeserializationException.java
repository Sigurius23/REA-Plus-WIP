package com.whoop.navigation.exception;

import androidx.annotation.Keep;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/navigation/exception/NavigationDeserializationException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "unrecognizedScreen", "Lkotlinx/serialization/json/JsonElement;", "rawParameters", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "Ljava/lang/String;", "getUnrecognizedScreen", "()Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "getRawParameters", "()Lkotlinx/serialization/json/JsonElement;", "metricValue", "getMetricValue", "Companion", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NavigationDeserializationException extends IllegalStateException {
    private final String metricValue;
    private final JsonElement rawParameters;
    private final String unrecognizedScreen;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.exception.NavigationDeserializationException$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/navigation/exception/NavigationDeserializationException$a;", "", "<init>", "()V", "", "screenName", "Lkotlinx/serialization/json/JsonElement;", "parameters", "b", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;", "unrecognizedScreen", "rawParameters", "Ltr2/n;", "logger", "Liy1/c;", "metricWriter", "Lcom/whoop/navigation/exception/NavigationDeserializationException;", "c", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ltr2/n;Liy1/c;)Lcom/whoop/navigation/exception/NavigationDeserializationException;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final String m23133b(String screenName, JsonElement parameters) {
            return "Failed to deserialize NavigationAction: Unknown screen '" + screenName + "' with parameters: " + parameters;
        }

        /* JADX INFO: renamed from: c */
        public final NavigationDeserializationException m23134c(String unrecognizedScreen, JsonElement rawParameters, InterfaceC34116n logger, InterfaceC21030c metricWriter) {
            AbstractC22676k.m65750j(unrecognizedScreen, "unrecognizedScreen");
            AbstractC22676k.m65750j(rawParameters, "rawParameters");
            AbstractC22676k.m65750j(logger, "logger");
            AbstractC22676k.m65750j(metricWriter, "metricWriter");
            NavigationDeserializationException navigationDeserializationException = new NavigationDeserializationException(unrecognizedScreen, rawParameters);
            logger.mo85230v("Unidentified navigation screen: ".concat(unrecognizedScreen), navigationDeserializationException, new AbstractC30556a.a[0]);
            metricWriter.mo58701b(new C22047a(0, "mobile.navigation.failures", null, AbstractC37056f.m118958J("screen_name:".concat(unrecognizedScreen)), null, 17, null));
            return navigationDeserializationException;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDeserializationException(String unrecognizedScreen, JsonElement rawParameters) {
        super(INSTANCE.m23133b(unrecognizedScreen, rawParameters));
        AbstractC22676k.m65750j(unrecognizedScreen, "unrecognizedScreen");
        AbstractC22676k.m65750j(rawParameters, "rawParameters");
        this.unrecognizedScreen = unrecognizedScreen;
        this.rawParameters = rawParameters;
        this.metricValue = unrecognizedScreen;
    }

    public final String getMetricValue() {
        return this.metricValue;
    }

    public final JsonElement getRawParameters() {
        return this.rawParameters;
    }

    public final String getUnrecognizedScreen() {
        return this.unrecognizedScreen;
    }
}
