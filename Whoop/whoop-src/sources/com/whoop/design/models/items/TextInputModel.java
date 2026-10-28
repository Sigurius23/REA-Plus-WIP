package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0002qpB¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aBÙ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u0019\u0010\"J#\u0010%\u001a\u00020\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b6\u0010(J\u0012\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b7\u0010(J\u0012\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b<\u0010(JÈ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b?\u0010(J\u0010\u0010@\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010C\u001a\u00020\u000f2\b\u0010B\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\bC\u0010DJ'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010N\u001a\u0004\bO\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\bP\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bQ\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bR\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bS\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bT\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bU\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\bW\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b\u0010\u00104R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\b\u0011\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\b[\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\b\\\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010]\u001a\u0004\b^\u00109R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010_\u0012\u0004\ba\u0010b\u001a\u0004\b`\u0010;R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010N\u0012\u0004\bd\u0010b\u001a\u0004\bc\u0010(R0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iRE\u0010\u001f\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`j¢\u0006\f\bk\u0012\b\bl\u0012\u0004\b\t0m8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010e\u001a\u0004\bn\u0010g\"\u0004\bo\u0010i¨\u0006r"}, m65681d2 = {"Lcom/whoop/design/models/items/TextInputModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "label", "placeholder", "text", "icon", "suffix", "caption", "", "maxLength", "Lcom/whoop/design/models/items/TextInputKeyboardType;", "keyboardType", "", "isSecure", "isDisabled", "stateUpdateValueKey", "errorStateKey", "Lcom/whoop/navigation/models/GenericInteraction;", "overrideTapInteraction", "Lcom/whoop/design/models/items/TextInputValidation;", "textInputValidation", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)V", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "()Lcom/whoop/design/models/items/TextInputKeyboardType;", "component10", "()Z", "component11", "component12", "component13", "component14", "()Lcom/whoop/navigation/models/GenericInteraction;", "component15", "()Lcom/whoop/design/models/items/TextInputValidation;", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)Lcom/whoop/design/models/items/TextInputModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TextInputModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getLabel", "getPlaceholder", "getText", "getIcon", "getSuffix", "getCaption", "Ljava/lang/Integer;", "getMaxLength", "Lcom/whoop/design/models/items/TextInputKeyboardType;", "getKeyboardType", "Z", "getStateUpdateValueKey", "getErrorStateKey", "Lcom/whoop/navigation/models/GenericInteraction;", "getOverrideTapInteraction", "Lcom/whoop/design/models/items/TextInputValidation;", "getTextInputValidation", "getTextInputValidation$annotations", "()V", "getErrorMessage", "getErrorMessage$annotations", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextInputModel implements WithGeneratedBindings, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String caption;
    private final String errorMessage;
    private final String errorStateKey;
    private final String icon;
    private final String id;
    private final boolean isDisabled;
    private final boolean isSecure;
    private final TextInputKeyboardType keyboardType;
    private final String label;
    private final Integer maxLength;
    private final GenericInteraction overrideTapInteraction;
    private final String placeholder;
    private final String stateUpdateValueKey;
    private final String suffix;
    private final String text;

    @SerializedName("validation")
    private final TextInputValidation textInputValidation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TextInputModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TextInputModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextInputModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(12)), null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(13)), null};
    }

    public /* synthetic */ TextInputModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, TextInputKeyboardType textInputKeyboardType, boolean z4, boolean z13, String str8, String str9, GenericInteraction genericInteraction, TextInputValidation textInputValidation, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, TextInputModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.label = str2;
        this.placeholder = str3;
        this.text = str4;
        this.icon = str5;
        this.suffix = str6;
        this.caption = str7;
        this.maxLength = num;
        if ((i13 & 256) == 0) {
            this.keyboardType = TextInputKeyboardType.DEFAULT;
        } else {
            this.keyboardType = textInputKeyboardType;
        }
        if ((i13 & 512) == 0) {
            this.isSecure = false;
        } else {
            this.isSecure = z4;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.isDisabled = true;
        } else {
            this.isDisabled = z13;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.stateUpdateValueKey = null;
        } else {
            this.stateUpdateValueKey = str8;
        }
        if ((i13 & 4096) == 0) {
            this.errorStateKey = null;
        } else {
            this.errorStateKey = str9;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.overrideTapInteraction = null;
        } else {
            this.overrideTapInteraction = genericInteraction;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.textInputValidation = null;
        } else {
            this.textInputValidation = textInputValidation;
        }
        this.errorMessage = null;
        if ((32768 & i13) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.TextInputKeyboardType", TextInputKeyboardType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ TextInputModel copy$default(TextInputModel textInputModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, TextInputKeyboardType textInputKeyboardType, boolean z4, boolean z13, String str8, String str9, GenericInteraction genericInteraction, TextInputValidation textInputValidation, String str10, int i13, Object obj) {
        return textInputModel.copy((i13 & 1) != 0 ? textInputModel.id : str, (i13 & 2) != 0 ? textInputModel.label : str2, (i13 & 4) != 0 ? textInputModel.placeholder : str3, (i13 & 8) != 0 ? textInputModel.text : str4, (i13 & 16) != 0 ? textInputModel.icon : str5, (i13 & 32) != 0 ? textInputModel.suffix : str6, (i13 & 64) != 0 ? textInputModel.caption : str7, (i13 & 128) != 0 ? textInputModel.maxLength : num, (i13 & 256) != 0 ? textInputModel.keyboardType : textInputKeyboardType, (i13 & 512) != 0 ? textInputModel.isSecure : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? textInputModel.isDisabled : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? textInputModel.stateUpdateValueKey : str8, (i13 & 4096) != 0 ? textInputModel.errorStateKey : str9, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? textInputModel.overrideTapInteraction : genericInteraction, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? textInputModel.textInputValidation : textInputValidation, (i13 & 32768) != 0 ? textInputModel.errorMessage : str10);
    }

    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    @InterfaceC37143h("validation")
    public static /* synthetic */ void getTextInputValidation$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(TextInputModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.label);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.placeholder);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.text);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.suffix);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.caption);
        output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.maxLength);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.keyboardType != TextInputKeyboardType.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.keyboardType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.isSecure) {
            output.encodeBooleanElement(serialDesc, 9, self.isSecure);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !self.isDisabled) {
            output.encodeBooleanElement(serialDesc, 10, self.isDisabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.stateUpdateValueKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.stateUpdateValueKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.errorStateKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.errorStateKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.overrideTapInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, GenericInteraction$$serializer.INSTANCE, self.overrideTapInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.textInputValidation != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, TextInputValidation$$serializer.INSTANCE, self.textInputValidation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, (InterfaceC37145j) interfaceC23462hArr[15].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 16) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 16, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        String str;
        String str2;
        Object obj;
        String invalidMessage;
        Boolean bool;
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        TextInputModel textInputModelGeneratedBind = TextInputModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
        TextInputValidation textInputValidation = this.textInputValidation;
        String stateText = null;
        if (textInputValidation == null) {
            str = this.errorStateKey;
            if (str != null) {
                obj = accumulatedState.get(str);
                if (obj instanceof String) {
                    invalidMessage = (String) obj;
                } else {
                    invalidMessage = null;
                }
                str2 = invalidMessage;
            } else {
                str2 = null;
            }
        } else {
            String validityKey = textInputValidation.getValidityKey();
            if (validityKey != null) {
                Object obj2 = accumulatedState.get(validityKey);
                if (obj2 instanceof Boolean) {
                    bool = (Boolean) obj2;
                } else {
                    bool = null;
                }
            } else {
                bool = null;
            }
            if (!AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                bool = null;
            }
            invalidMessage = bool != null ? textInputValidation.getInvalidMessage() : null;
            if (invalidMessage == null) {
                str = this.errorStateKey;
                if (str != null) {
                    obj = accumulatedState.get(str);
                    if (obj instanceof String) {
                        invalidMessage = (String) obj;
                    } else {
                        invalidMessage = null;
                    }
                    str2 = invalidMessage;
                } else {
                    str2 = null;
                }
            } else {
                str2 = invalidMessage;
            }
        }
        String str3 = this.stateUpdateValueKey;
        if (str3 != null) {
            Map<String, String> bindings = getBindings();
            boolean z4 = false;
            if (bindings != null && bindings.containsKey("text")) {
                z4 = true;
            }
            if (z4) {
                str3 = null;
            }
            if (str3 != null) {
                stateText = TextInputModelKt.toStateText(accumulatedState.get(str3));
            }
        }
        if (stateText == null) {
            stateText = textInputModelGeneratedBind.text;
        }
        return copy$default(textInputModelGeneratedBind, null, null, null, stateText, null, null, null, null, null, false, false, null, null, null, null, str2, 32759, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsSecure() {
        return this.isSecure;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getErrorStateKey() {
        return this.errorStateKey;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final GenericInteraction getOverrideTapInteraction() {
        return this.overrideTapInteraction;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final TextInputValidation getTextInputValidation() {
        return this.textInputValidation;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextInputKeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public final TextInputModel copy(String id4, String label, String placeholder, String text, String icon, String suffix, String caption, Integer maxLength, TextInputKeyboardType keyboardType, boolean isSecure, boolean isDisabled, String stateUpdateValueKey, String errorStateKey, GenericInteraction overrideTapInteraction, TextInputValidation textInputValidation, String errorMessage) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(keyboardType, "keyboardType");
        return new TextInputModel(id4, label, placeholder, text, icon, suffix, caption, maxLength, keyboardType, isSecure, isDisabled, stateUpdateValueKey, errorStateKey, overrideTapInteraction, textInputValidation, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputModel)) {
            return false;
        }
        TextInputModel textInputModel = (TextInputModel) other;
        return AbstractC22676k.m65745e(this.id, textInputModel.id) && AbstractC22676k.m65745e(this.label, textInputModel.label) && AbstractC22676k.m65745e(this.placeholder, textInputModel.placeholder) && AbstractC22676k.m65745e(this.text, textInputModel.text) && AbstractC22676k.m65745e(this.icon, textInputModel.icon) && AbstractC22676k.m65745e(this.suffix, textInputModel.suffix) && AbstractC22676k.m65745e(this.caption, textInputModel.caption) && AbstractC22676k.m65745e(this.maxLength, textInputModel.maxLength) && this.keyboardType == textInputModel.keyboardType && this.isSecure == textInputModel.isSecure && this.isDisabled == textInputModel.isDisabled && AbstractC22676k.m65745e(this.stateUpdateValueKey, textInputModel.stateUpdateValueKey) && AbstractC22676k.m65745e(this.errorStateKey, textInputModel.errorStateKey) && AbstractC22676k.m65745e(this.overrideTapInteraction, textInputModel.overrideTapInteraction) && AbstractC22676k.m65745e(this.textInputValidation, textInputModel.textInputValidation) && AbstractC22676k.m65745e(this.errorMessage, textInputModel.errorMessage);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorStateKey() {
        return this.errorStateKey;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final TextInputKeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final GenericInteraction getOverrideTapInteraction() {
        return this.overrideTapInteraction;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getText() {
        return this.text;
    }

    public final TextInputValidation getTextInputValidation() {
        return this.textInputValidation;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.suffix;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.caption;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.maxLength;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.keyboardType.hashCode() + ((iHashCode7 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.isSecure), 31, this.isDisabled);
        String str7 = this.stateUpdateValueKey;
        int iHashCode8 = (iM8289b + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.errorStateKey;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        GenericInteraction genericInteraction = this.overrideTapInteraction;
        int iHashCode10 = (iHashCode9 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        TextInputValidation textInputValidation = this.textInputValidation;
        int iHashCode11 = (iHashCode10 + (textInputValidation == null ? 0 : textInputValidation.hashCode())) * 31;
        String str9 = this.errorMessage;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public final boolean isSecure() {
        return this.isSecure;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.placeholder;
        String str4 = this.text;
        String str5 = this.icon;
        String str6 = this.suffix;
        String str7 = this.caption;
        Integer num = this.maxLength;
        TextInputKeyboardType textInputKeyboardType = this.keyboardType;
        boolean z4 = this.isSecure;
        boolean z13 = this.isDisabled;
        String str8 = this.stateUpdateValueKey;
        String str9 = this.errorStateKey;
        GenericInteraction genericInteraction = this.overrideTapInteraction;
        TextInputValidation textInputValidation = this.textInputValidation;
        String str10 = this.errorMessage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextInputModel(id=", str, ", label=", str2, ", placeholder=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", text=", str4, ", icon=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", suffix=", str6, ", caption=");
        AbstractC30007c.m91853w(num, str7, ", maxLength=", ", keyboardType=", sbM32001t);
        sbM32001t.append(textInputKeyboardType);
        sbM32001t.append(", isSecure=");
        sbM32001t.append(z4);
        sbM32001t.append(", isDisabled=");
        AbstractC38963t7.m124391u(sbM32001t, z13, ", stateUpdateValueKey=", str8, ", errorStateKey=");
        sbM32001t.append(str9);
        sbM32001t.append(", overrideTapInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", textInputValidation=");
        sbM32001t.append(textInputValidation);
        sbM32001t.append(", errorMessage=");
        sbM32001t.append(str10);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public TextInputModel(String id4, String str, String str2, String str3, String str4, String str5, String str6, Integer num, TextInputKeyboardType keyboardType, boolean z4, boolean z13, String str7, String str8, GenericInteraction genericInteraction, TextInputValidation textInputValidation, String str9) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(keyboardType, "keyboardType");
        this.id = id4;
        this.label = str;
        this.placeholder = str2;
        this.text = str3;
        this.icon = str4;
        this.suffix = str5;
        this.caption = str6;
        this.maxLength = num;
        this.keyboardType = keyboardType;
        this.isSecure = z4;
        this.isDisabled = z13;
        this.stateUpdateValueKey = str7;
        this.errorStateKey = str8;
        this.overrideTapInteraction = genericInteraction;
        this.textInputValidation = textInputValidation;
        this.errorMessage = str9;
    }

    public /* synthetic */ TextInputModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, TextInputKeyboardType textInputKeyboardType, boolean z4, boolean z13, String str8, String str9, GenericInteraction genericInteraction, TextInputValidation textInputValidation, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, num, (i13 & 256) != 0 ? TextInputKeyboardType.DEFAULT : textInputKeyboardType, (i13 & 512) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str8, (i13 & 4096) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : genericInteraction, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : textInputValidation, (i13 & 32768) != 0 ? null : str10);
    }
}
