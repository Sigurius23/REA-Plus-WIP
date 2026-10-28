package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;", "Lcom/whoop/navigation/ActivationNavigationModel;", "", "source", "startScreen", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "getStartScreen", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AfterActivationFinalScreensScreenModel implements ActivationNavigationModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String source;
    private final String startScreen;

    /* JADX INFO: renamed from: com.whoop.navigation.AfterActivationFinalScreensScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AfterActivationFinalScreensScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfterActivationFinalScreensScreenModel() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ AfterActivationFinalScreensScreenModel copy$default(AfterActivationFinalScreensScreenModel afterActivationFinalScreensScreenModel, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = afterActivationFinalScreensScreenModel.source;
        }
        if ((i13 & 2) != 0) {
            str2 = afterActivationFinalScreensScreenModel.startScreen;
        }
        return afterActivationFinalScreensScreenModel.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(AfterActivationFinalScreensScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.source);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.getStartScreen(), AppScreen.C9311g.f27610w.getName())) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.getStartScreen());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartScreen() {
        return this.startScreen;
    }

    public final AfterActivationFinalScreensScreenModel copy(String source, String startScreen) {
        AbstractC22676k.m65750j(startScreen, "startScreen");
        return new AfterActivationFinalScreensScreenModel(source, startScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AfterActivationFinalScreensScreenModel)) {
            return false;
        }
        AfterActivationFinalScreensScreenModel afterActivationFinalScreensScreenModel = (AfterActivationFinalScreensScreenModel) other;
        return AbstractC22676k.m65745e(this.source, afterActivationFinalScreensScreenModel.source) && AbstractC22676k.m65745e(this.startScreen, afterActivationFinalScreensScreenModel.startScreen);
    }

    public final String getSource() {
        return this.source;
    }

    @Override // com.whoop.navigation.ActivationNavigationModel
    public String getStartScreen() {
        return this.startScreen;
    }

    public int hashCode() {
        String str = this.source;
        return this.startScreen.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("AfterActivationFinalScreensScreenModel(source=", this.source, ", startScreen=", this.startScreen, ")");
    }

    public /* synthetic */ AfterActivationFinalScreensScreenModel(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.source = (i13 & 1) == 0 ? null : str;
        if ((i13 & 2) == 0) {
            this.startScreen = AppScreen.C9311g.f27610w.getName();
        } else {
            this.startScreen = str2;
        }
    }

    public AfterActivationFinalScreensScreenModel(String str, String startScreen) {
        AbstractC22676k.m65750j(startScreen, "startScreen");
        this.source = str;
        this.startScreen = startScreen;
    }

    public /* synthetic */ AfterActivationFinalScreensScreenModel(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? AppScreen.C9311g.f27610w.getName() : str2);
    }
}
