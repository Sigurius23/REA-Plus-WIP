package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih1.C18518b;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010 R,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\"¨\u0006<"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressCustomizationOptions;", "", "Lcom/whoop/stress/domain/model/StressCustomizationDrawer;", "drawer", "Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "picker", "", "currentSelection", "", "Lcom/whoop/stress/domain/model/StressCustomizationDisplay;", "options", "<init>", "(Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressCustomizationOptions;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/stress/domain/model/StressCustomizationDrawer;", "component2", "()Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/stress/domain/model/StressCustomizationOptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/stress/domain/model/StressCustomizationDrawer;", "getDrawer", "getDrawer$annotations", "()V", "Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "getPicker", "getPicker$annotations", "Ljava/lang/String;", "getCurrentSelection", "getCurrentSelection$annotations", "Ljava/util/Map;", "getOptions", "getOptions$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressCustomizationOptions {

    @SerializedName("current_selection")
    private final String currentSelection;

    @SerializedName("drawer")
    private final StressCustomizationDrawer drawer;

    @SerializedName("options")
    private final Map<String, StressCustomizationDisplay> options;

    @SerializedName("picker")
    private final StressCustomizationPicker picker;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C18518b(8))};

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressCustomizationOptions$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressCustomizationOptions$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressCustomizationOptions;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressCustomizationOptions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StressCustomizationOptions(int i13, StressCustomizationDrawer stressCustomizationDrawer, StressCustomizationPicker stressCustomizationPicker, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StressCustomizationOptions$$serializer.INSTANCE.getDescriptor());
        }
        this.drawer = stressCustomizationDrawer;
        this.picker = stressCustomizationPicker;
        this.currentSelection = str;
        this.options = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, StressCustomizationDisplay$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressCustomizationOptions copy$default(StressCustomizationOptions stressCustomizationOptions, StressCustomizationDrawer stressCustomizationDrawer, StressCustomizationPicker stressCustomizationPicker, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            stressCustomizationDrawer = stressCustomizationOptions.drawer;
        }
        if ((i13 & 2) != 0) {
            stressCustomizationPicker = stressCustomizationOptions.picker;
        }
        if ((i13 & 4) != 0) {
            str = stressCustomizationOptions.currentSelection;
        }
        if ((i13 & 8) != 0) {
            map = stressCustomizationOptions.options;
        }
        return stressCustomizationOptions.copy(stressCustomizationDrawer, stressCustomizationPicker, str, map);
    }

    @InterfaceC37143h("current_selection")
    public static /* synthetic */ void getCurrentSelection$annotations() {
    }

    @InterfaceC37143h("drawer")
    public static /* synthetic */ void getDrawer$annotations() {
    }

    @InterfaceC37143h("options")
    public static /* synthetic */ void getOptions$annotations() {
    }

    @InterfaceC37143h("picker")
    public static /* synthetic */ void getPicker$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressCustomizationOptions self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StressCustomizationDrawer$$serializer.INSTANCE, self.drawer);
        output.encodeNullableSerializableElement(serialDesc, 1, StressCustomizationPicker$$serializer.INSTANCE, self.picker);
        output.encodeStringElement(serialDesc, 2, self.currentSelection);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.options);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StressCustomizationDrawer getDrawer() {
        return this.drawer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StressCustomizationPicker getPicker() {
        return this.picker;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentSelection() {
        return this.currentSelection;
    }

    public final Map<String, StressCustomizationDisplay> component4() {
        return this.options;
    }

    public final StressCustomizationOptions copy(StressCustomizationDrawer drawer, StressCustomizationPicker picker, String currentSelection, Map<String, StressCustomizationDisplay> options) {
        AbstractC22676k.m65750j(currentSelection, "currentSelection");
        AbstractC22676k.m65750j(options, "options");
        return new StressCustomizationOptions(drawer, picker, currentSelection, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressCustomizationOptions)) {
            return false;
        }
        StressCustomizationOptions stressCustomizationOptions = (StressCustomizationOptions) other;
        return AbstractC22676k.m65745e(this.drawer, stressCustomizationOptions.drawer) && AbstractC22676k.m65745e(this.picker, stressCustomizationOptions.picker) && AbstractC22676k.m65745e(this.currentSelection, stressCustomizationOptions.currentSelection) && AbstractC22676k.m65745e(this.options, stressCustomizationOptions.options);
    }

    public final String getCurrentSelection() {
        return this.currentSelection;
    }

    public final StressCustomizationDrawer getDrawer() {
        return this.drawer;
    }

    public final Map<String, StressCustomizationDisplay> getOptions() {
        return this.options;
    }

    public final StressCustomizationPicker getPicker() {
        return this.picker;
    }

    public int hashCode() {
        StressCustomizationDrawer stressCustomizationDrawer = this.drawer;
        int iHashCode = (stressCustomizationDrawer == null ? 0 : stressCustomizationDrawer.hashCode()) * 31;
        StressCustomizationPicker stressCustomizationPicker = this.picker;
        return this.options.hashCode() + AbstractC11266d.m30450d((iHashCode + (stressCustomizationPicker != null ? stressCustomizationPicker.hashCode() : 0)) * 31, 31, this.currentSelection);
    }

    public String toString() {
        StressCustomizationDrawer stressCustomizationDrawer = this.drawer;
        StressCustomizationPicker stressCustomizationPicker = this.picker;
        String str = this.currentSelection;
        Map<String, StressCustomizationDisplay> map = this.options;
        StringBuilder sb4 = new StringBuilder("StressCustomizationOptions(drawer=");
        sb4.append(stressCustomizationDrawer);
        sb4.append(", picker=");
        sb4.append(stressCustomizationPicker);
        sb4.append(", currentSelection=");
        return AbstractC30007c.m91842l(sb4, str, ", options=", map, ")");
    }

    public StressCustomizationOptions(StressCustomizationDrawer stressCustomizationDrawer, StressCustomizationPicker stressCustomizationPicker, String currentSelection, Map<String, StressCustomizationDisplay> options) {
        AbstractC22676k.m65750j(currentSelection, "currentSelection");
        AbstractC22676k.m65750j(options, "options");
        this.drawer = stressCustomizationDrawer;
        this.picker = stressCustomizationPicker;
        this.currentSelection = currentSelection;
        this.options = options;
    }
}
