package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, m65681d2 = {"Lcom/whoop/navigation/ActivationHwOnlyProfileScreenModel;", "Lcom/whoop/navigation/ActivationNavigationModel;", "", "startScreen", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/ActivationHwOnlyProfileScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/whoop/navigation/ActivationHwOnlyProfileScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartScreen", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationHwOnlyProfileScreenModel implements ActivationNavigationModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String startScreen;

    /* JADX INFO: renamed from: com.whoop.navigation.ActivationHwOnlyProfileScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/ActivationHwOnlyProfileScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/ActivationHwOnlyProfileScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationHwOnlyProfileScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivationHwOnlyProfileScreenModel() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ActivationHwOnlyProfileScreenModel copy$default(ActivationHwOnlyProfileScreenModel activationHwOnlyProfileScreenModel, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activationHwOnlyProfileScreenModel.startScreen;
        }
        return activationHwOnlyProfileScreenModel.copy(str);
    }

    public static final /* synthetic */ void write$Self$navigation_release(ActivationHwOnlyProfileScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && AbstractC22676k.m65745e(self.getStartScreen(), AppScreen.C9383p.f27837w.getName())) {
            return;
        }
        output.encodeStringElement(serialDesc, 0, self.getStartScreen());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartScreen() {
        return this.startScreen;
    }

    public final ActivationHwOnlyProfileScreenModel copy(String startScreen) {
        AbstractC22676k.m65750j(startScreen, "startScreen");
        return new ActivationHwOnlyProfileScreenModel(startScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActivationHwOnlyProfileScreenModel) && AbstractC22676k.m65745e(this.startScreen, ((ActivationHwOnlyProfileScreenModel) other).startScreen);
    }

    @Override // com.whoop.navigation.ActivationNavigationModel
    public String getStartScreen() {
        return this.startScreen;
    }

    public int hashCode() {
        return this.startScreen.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("ActivationHwOnlyProfileScreenModel(startScreen=", this.startScreen, ")");
    }

    public /* synthetic */ ActivationHwOnlyProfileScreenModel(int i13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.startScreen = AppScreen.C9383p.f27837w.getName();
        } else {
            this.startScreen = str;
        }
    }

    public ActivationHwOnlyProfileScreenModel(String startScreen) {
        AbstractC22676k.m65750j(startScreen, "startScreen");
        this.startScreen = startScreen;
    }

    public /* synthetic */ ActivationHwOnlyProfileScreenModel(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AppScreen.C9383p.f27837w.getName() : str);
    }
}
