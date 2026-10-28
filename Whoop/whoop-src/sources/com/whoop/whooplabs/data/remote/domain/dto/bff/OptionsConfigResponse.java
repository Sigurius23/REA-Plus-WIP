package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import dx2.C12431b;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB7\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015JD\u0010\u0017\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J'\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0015R'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b,\u0010\u0015R\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001d\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u001d\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b3\u0010/R\u001d\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b5\u0010/R\u001d\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b7\u0010/R\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b9\u0010/R\u001d\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b;\u0010/R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b=\u0010/R\u001d\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\b?\u0010/R\u001d\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\bA\u0010/R\u001d\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\bC\u0010/R\u001d\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\bE\u0010/R#\u0010J\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0G0-8F¢\u0006\u0006\u001a\u0004\bI\u0010/R\u001d\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040-8F¢\u0006\u0006\u001a\u0004\bK\u0010/¨\u0006O"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;", "", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOptionResponse;", "bottomSheetOptions", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigString;", "configStrings", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "action", "get", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/Map;", "getBottomSheetOptions", "getConfigStrings", "Lkotlin/Function1;", "getTitle", "()Lkotlin/jvm/functions/Function1;", "title", "getBody", "body", "getPositiveCta", "positiveCta", "getNegativeCta", "negativeCta", "getErrorTitle", "errorTitle", "getErrorBody", "errorBody", "getErrorPositiveCta", "errorPositiveCta", "getErrorNegativeCta", "errorNegativeCta", "getCancelScreenTitle", "cancelScreenTitle", "getCancelScreenSubtitle", "cancelScreenSubtitle", "getCancelScreenBottomText", "cancelScreenBottomText", "getCancelScreenCtaText", "cancelScreenCtaText", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenOptionResponse;", "getCancelScreenOptions", "cancelScreenOptions", "getCancelScreenBackText", "cancelScreenBackText", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OptionsConfigResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<BottomSheetOption, String> bottomSheetOptions;
    private final Map<BottomSheetOption, ConfigStringResponse> configStrings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OptionsConfigResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C12430a(8)), AbstractC30060g.m92087G(enumC23463i, new C12430a(9))};
    }

    public /* synthetic */ OptionsConfigResponse(int i13, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, OptionsConfigResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.bottomSheetOptions = map;
        this.configStrings = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(BottomSheetOption.INSTANCE.serializer(), StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(BottomSheetOption.INSTANCE.serializer(), ConfigStringResponse$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_body_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String body = configStringResponse != null ? configStringResponse.getBody() : null;
        return body == null ? "" : body;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cancelScreenBackText_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        CancelScreenConfigResponse cancelScreen;
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String backText = (configStringResponse == null || (cancelScreen = configStringResponse.getCancelScreen()) == null) ? null : cancelScreen.getBackText();
        return backText == null ? "" : backText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cancelScreenBottomText_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        CancelScreenConfigResponse cancelScreen;
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String bottomText = (configStringResponse == null || (cancelScreen = configStringResponse.getCancelScreen()) == null) ? null : cancelScreen.getBottomText();
        return bottomText == null ? "" : bottomText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cancelScreenCtaText_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        CancelScreenConfigResponse cancelScreen;
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String ctaText = (configStringResponse == null || (cancelScreen = configStringResponse.getCancelScreen()) == null) ? null : cancelScreen.getCtaText();
        return ctaText == null ? "" : ctaText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _get_cancelScreenOptions_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        CancelScreenConfigResponse cancelScreen;
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        List<CancelScreenOptionResponse> options = (configStringResponse == null || (cancelScreen = configStringResponse.getCancelScreen()) == null) ? null : cancelScreen.getOptions();
        return options == null ? C25271y.f99162w : options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cancelScreenSubtitle_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        CancelScreenConfigResponse cancelScreen;
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String subtitle = (configStringResponse == null || (cancelScreen = configStringResponse.getCancelScreen()) == null) ? null : cancelScreen.getSubtitle();
        return subtitle == null ? "" : subtitle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cancelScreenTitle_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        CancelScreenConfigResponse cancelScreen;
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String title = (configStringResponse == null || (cancelScreen = configStringResponse.getCancelScreen()) == null) ? null : cancelScreen.getTitle();
        return title == null ? "" : title;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_errorBody_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String errorBody = configStringResponse != null ? configStringResponse.getErrorBody() : null;
        return errorBody == null ? "" : errorBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_errorNegativeCta_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String errorNegativeCta = configStringResponse != null ? configStringResponse.getErrorNegativeCta() : null;
        return errorNegativeCta == null ? "" : errorNegativeCta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_errorPositiveCta_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String errorPositiveCta = configStringResponse != null ? configStringResponse.getErrorPositiveCta() : null;
        return errorPositiveCta == null ? "" : errorPositiveCta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_errorTitle_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String errorTitle = configStringResponse != null ? configStringResponse.getErrorTitle() : null;
        return errorTitle == null ? "" : errorTitle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_negativeCta_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String negativeCta = configStringResponse != null ? configStringResponse.getNegativeCta() : null;
        return negativeCta == null ? "" : negativeCta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_positiveCta_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String positiveCta = configStringResponse != null ? configStringResponse.getPositiveCta() : null;
        return positiveCta == null ? "" : positiveCta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_title_$lambda$0(OptionsConfigResponse optionsConfigResponse, BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        ConfigStringResponse configStringResponse = optionsConfigResponse.get(action);
        String title = configStringResponse != null ? configStringResponse.getTitle() : null;
        return title == null ? "" : title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsConfigResponse copy$default(OptionsConfigResponse optionsConfigResponse, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = optionsConfigResponse.bottomSheetOptions;
        }
        if ((i13 & 2) != 0) {
            map2 = optionsConfigResponse.configStrings;
        }
        return optionsConfigResponse.copy(map, map2);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(OptionsConfigResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.bottomSheetOptions);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.configStrings);
    }

    public final Map<BottomSheetOption, String> component1() {
        return this.bottomSheetOptions;
    }

    public final Map<BottomSheetOption, ConfigStringResponse> component2() {
        return this.configStrings;
    }

    public final OptionsConfigResponse copy(Map<BottomSheetOption, String> bottomSheetOptions, Map<BottomSheetOption, ConfigStringResponse> configStrings) {
        AbstractC22676k.m65750j(bottomSheetOptions, "bottomSheetOptions");
        AbstractC22676k.m65750j(configStrings, "configStrings");
        return new OptionsConfigResponse(bottomSheetOptions, configStrings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsConfigResponse)) {
            return false;
        }
        OptionsConfigResponse optionsConfigResponse = (OptionsConfigResponse) other;
        return AbstractC22676k.m65745e(this.bottomSheetOptions, optionsConfigResponse.bottomSheetOptions) && AbstractC22676k.m65745e(this.configStrings, optionsConfigResponse.configStrings);
    }

    public final ConfigStringResponse get(BottomSheetOption action) {
        AbstractC22676k.m65750j(action, "action");
        return this.configStrings.get(action);
    }

    public final Function1 getBody() {
        return new C12431b(this, 8);
    }

    public final Map<BottomSheetOption, String> getBottomSheetOptions() {
        return this.bottomSheetOptions;
    }

    public final Function1 getCancelScreenBackText() {
        return new C12431b(this, 1);
    }

    public final Function1 getCancelScreenBottomText() {
        return new C12431b(this, 11);
    }

    public final Function1 getCancelScreenCtaText() {
        return new C12431b(this, 9);
    }

    public final Function1 getCancelScreenOptions() {
        return new C12431b(this, 6);
    }

    public final Function1 getCancelScreenSubtitle() {
        return new C12431b(this, 12);
    }

    public final Function1 getCancelScreenTitle() {
        return new C12431b(this, 2);
    }

    public final Map<BottomSheetOption, ConfigStringResponse> getConfigStrings() {
        return this.configStrings;
    }

    public final Function1 getErrorBody() {
        return new C12431b(this, 10);
    }

    public final Function1 getErrorNegativeCta() {
        return new C12431b(this, 5);
    }

    public final Function1 getErrorPositiveCta() {
        return new C12431b(this, 4);
    }

    public final Function1 getErrorTitle() {
        return new C12431b(this, 3);
    }

    public final Function1 getNegativeCta() {
        return new C12431b(this, 0);
    }

    public final Function1 getPositiveCta() {
        return new C12431b(this, 7);
    }

    public final Function1 getTitle() {
        return new C12431b(this, 13);
    }

    public int hashCode() {
        return this.configStrings.hashCode() + (this.bottomSheetOptions.hashCode() * 31);
    }

    public String toString() {
        return "OptionsConfigResponse(bottomSheetOptions=" + this.bottomSheetOptions + ", configStrings=" + this.configStrings + ")";
    }

    public OptionsConfigResponse(Map<BottomSheetOption, String> bottomSheetOptions, Map<BottomSheetOption, ConfigStringResponse> configStrings) {
        AbstractC22676k.m65750j(bottomSheetOptions, "bottomSheetOptions");
        AbstractC22676k.m65750j(configStrings, "configStrings");
        this.bottomSheetOptions = bottomSheetOptions;
        this.configStrings = configStrings;
    }
}
