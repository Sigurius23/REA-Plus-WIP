package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36963j;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0002rqBø\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012+\b\u0002\u0010 \u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f¢\u0006\u0004\b!\u0010\"Bå\u0001\b\u0010\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b!\u0010'J#\u0010*\u001a\u00020\u00022\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u0019H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b4\u0010-J\u0010\u00105\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b5\u00103J\u0010\u00106\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b6\u00103J\u0010\u00107\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b7\u00103J\u0012\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b<\u00109J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u001e\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bB\u0010CJ3\u0010D\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001fHÆ\u0003¢\u0006\u0004\bD\u0010CJ\u008d\u0002\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00192+\b\u0002\u0010 \u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001fHÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bG\u0010-J\u0010\u0010H\u001a\u00020#HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\bK\u0010LJ'\u0010U\u001a\u00020R2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0001¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bW\u0010-R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010V\u001a\u0004\bX\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bY\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bZ\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\b[\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\\\u001a\u0004\b]\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\b^\u0010-R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\\\u001a\u0004\b_\u00103R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\\\u001a\u0004\b`\u00103R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\b\u000e\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010a\u001a\u0004\bb\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010c\u001a\u0004\bd\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\be\u00109R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010f\u001a\u0004\bg\u0010>R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bh\u0010-R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010i\u001a\u0004\bj\u0010AR0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010k\u001a\u0004\bl\u0010C\"\u0004\bm\u0010nRE\u0010 \u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010k\u001a\u0004\bo\u0010C\"\u0004\bp\u0010n¨\u0006s"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectableCellModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "title", "subtitle", "leftIcon", "leftImageUrl", "", "shouldTintLeftImage", "selectionStyle", "selected", "showCheckbox", "isDisabled", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "deselectAction", "", "searchKeys", "sectionTitle", "", "fixedHeightSize", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "component11", "()Lcom/whoop/whoopaction/domain/models/Action;", "component12", "()Lcom/whoop/navigation/models/GenericInteraction;", "component13", "component14", "()Ljava/util/List;", "component15", "component16", "()Ljava/lang/Double;", "component17", "()Ljava/util/Map;", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SelectableCellModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getLeftIcon", "getLeftImageUrl", "Z", "getShouldTintLeftImage", "getSelectionStyle", "getSelected", "getShowCheckbox", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "getDeselectAction", "Ljava/util/List;", "getSearchKeys", "getSectionTitle", "Ljava/lang/Double;", "getFixedHeightSize", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SelectableCellModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final Action deselectAction;
    private final Double fixedHeightSize;
    private final String id;
    private final GenericInteraction interaction;
    private final boolean isDisabled;
    private final String leftIcon;
    private final String leftImageUrl;
    private final List<String> searchKeys;
    private final String sectionTitle;
    private final boolean selected;
    private final String selectionStyle;
    private final boolean shouldTintLeftImage;
    private final boolean showCheckbox;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectableCellModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SelectableCellModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SelectableCellModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(6)), null, AbstractC30060g.m92087G(enumC23463i, new C36963j(7)), AbstractC30060g.m92087G(enumC23463i, new C36963j(8)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(9)), null};
    }

    public /* synthetic */ SelectableCellModel(int i13, String str, String str2, String str3, String str4, String str5, boolean z4, String str6, boolean z13, boolean z14, boolean z15, Action action, GenericInteraction genericInteraction, Action action2, List list, String str7, Double d3, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (207 != (i13 & 207)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 207, SelectableCellModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.leftIcon = str4;
        if ((i13 & 16) == 0) {
            this.leftImageUrl = null;
        } else {
            this.leftImageUrl = str5;
        }
        if ((i13 & 32) == 0) {
            this.shouldTintLeftImage = false;
        } else {
            this.shouldTintLeftImage = z4;
        }
        this.selectionStyle = str6;
        this.selected = z13;
        if ((i13 & 256) == 0) {
            this.showCheckbox = false;
        } else {
            this.showCheckbox = z14;
        }
        if ((i13 & 512) == 0) {
            this.isDisabled = false;
        } else {
            this.isDisabled = z15;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
        if ((i13 & 4096) == 0) {
            this.deselectAction = null;
        } else {
            this.deselectAction = action2;
        }
        this.searchKeys = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? C25271y.f99162w : list;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.sectionTitle = null;
        } else {
            this.sectionTitle = str7;
        }
        if ((32768 & i13) == 0) {
            this.fixedHeightSize = null;
        } else {
            this.fixedHeightSize = d3;
        }
        if ((65536 & i13) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectableCellModel copy$default(SelectableCellModel selectableCellModel, String str, String str2, String str3, String str4, String str5, boolean z4, String str6, boolean z13, boolean z14, boolean z15, Action action, GenericInteraction genericInteraction, Action action2, List list, String str7, Double d3, Map map, Map map2, int i13, Object obj) {
        Map map3;
        Map map4;
        String str8 = (i13 & 1) != 0 ? selectableCellModel.id : str;
        String str9 = (i13 & 2) != 0 ? selectableCellModel.title : str2;
        String str10 = (i13 & 4) != 0 ? selectableCellModel.subtitle : str3;
        String str11 = (i13 & 8) != 0 ? selectableCellModel.leftIcon : str4;
        String str12 = (i13 & 16) != 0 ? selectableCellModel.leftImageUrl : str5;
        boolean z16 = (i13 & 32) != 0 ? selectableCellModel.shouldTintLeftImage : z4;
        String str13 = (i13 & 64) != 0 ? selectableCellModel.selectionStyle : str6;
        boolean z17 = (i13 & 128) != 0 ? selectableCellModel.selected : z13;
        boolean z18 = (i13 & 256) != 0 ? selectableCellModel.showCheckbox : z14;
        boolean z19 = (i13 & 512) != 0 ? selectableCellModel.isDisabled : z15;
        Action action3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? selectableCellModel.action : action;
        GenericInteraction genericInteraction2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? selectableCellModel.interaction : genericInteraction;
        Action action4 = (i13 & 4096) != 0 ? selectableCellModel.deselectAction : action2;
        List list2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? selectableCellModel.searchKeys : list;
        String str14 = str8;
        String str15 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? selectableCellModel.sectionTitle : str7;
        Double d14 = (i13 & 32768) != 0 ? selectableCellModel.fixedHeightSize : d3;
        Map map5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? selectableCellModel.bindings : map;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            map4 = map5;
            map3 = selectableCellModel.aggregateBindings;
        } else {
            map3 = map2;
            map4 = map5;
        }
        return selectableCellModel.copy(str14, str9, str10, str11, str12, z16, str13, z17, z18, z19, action3, genericInteraction2, action4, list2, str15, d14, map4, map3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SelectableCellModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.leftIcon);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.leftImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.leftImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.shouldTintLeftImage) {
            output.encodeBooleanElement(serialDesc, 5, self.shouldTintLeftImage);
        }
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.selectionStyle);
        output.encodeBooleanElement(serialDesc, 7, self.selected);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.showCheckbox) {
            output.encodeBooleanElement(serialDesc, 8, self.showCheckbox);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.isDisabled) {
            output.encodeBooleanElement(serialDesc, 9, self.isDisabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.interaction != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, GenericInteraction$$serializer.INSTANCE, self.interaction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.deselectAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.deselectAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || !AbstractC22676k.m65745e(self.searchKeys, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.searchKeys);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.sectionTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.sectionTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.fixedHeightSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, DoubleSerializer.INSTANCE, self.fixedHeightSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, (InterfaceC37145j) interfaceC23462hArr[16].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 17) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 17, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return SelectableCellModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Action getDeselectAction() {
        return this.deselectAction;
    }

    public final List<String> component14() {
        return this.searchKeys;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getFixedHeightSize() {
        return this.fixedHeightSize;
    }

    public final Map<String, String> component17() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component18() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeftImageUrl() {
        return this.leftImageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShouldTintLeftImage() {
        return this.shouldTintLeftImage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSelectionStyle() {
        return this.selectionStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    public final SelectableCellModel copy(String id4, String title, String subtitle, String leftIcon, String leftImageUrl, boolean shouldTintLeftImage, String selectionStyle, boolean selected, boolean showCheckbox, boolean isDisabled, Action action, GenericInteraction interaction, Action deselectAction, List<String> searchKeys, String sectionTitle, Double fixedHeightSize, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(searchKeys, "searchKeys");
        return new SelectableCellModel(id4, title, subtitle, leftIcon, leftImageUrl, shouldTintLeftImage, selectionStyle, selected, showCheckbox, isDisabled, action, interaction, deselectAction, searchKeys, sectionTitle, fixedHeightSize, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableCellModel)) {
            return false;
        }
        SelectableCellModel selectableCellModel = (SelectableCellModel) other;
        return AbstractC22676k.m65745e(this.id, selectableCellModel.id) && AbstractC22676k.m65745e(this.title, selectableCellModel.title) && AbstractC22676k.m65745e(this.subtitle, selectableCellModel.subtitle) && AbstractC22676k.m65745e(this.leftIcon, selectableCellModel.leftIcon) && AbstractC22676k.m65745e(this.leftImageUrl, selectableCellModel.leftImageUrl) && this.shouldTintLeftImage == selectableCellModel.shouldTintLeftImage && AbstractC22676k.m65745e(this.selectionStyle, selectableCellModel.selectionStyle) && this.selected == selectableCellModel.selected && this.showCheckbox == selectableCellModel.showCheckbox && this.isDisabled == selectableCellModel.isDisabled && AbstractC22676k.m65745e(this.action, selectableCellModel.action) && AbstractC22676k.m65745e(this.interaction, selectableCellModel.interaction) && AbstractC22676k.m65745e(this.deselectAction, selectableCellModel.deselectAction) && AbstractC22676k.m65745e(this.searchKeys, selectableCellModel.searchKeys) && AbstractC22676k.m65745e(this.sectionTitle, selectableCellModel.sectionTitle) && AbstractC22676k.m65745e(this.fixedHeightSize, selectableCellModel.fixedHeightSize) && AbstractC22676k.m65745e(this.bindings, selectableCellModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, selectableCellModel.aggregateBindings);
    }

    public final Action getAction() {
        return this.action;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final Action getDeselectAction() {
        return this.deselectAction;
    }

    public final Double getFixedHeightSize() {
        return this.fixedHeightSize;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getLeftImageUrl() {
        return this.leftImageUrl;
    }

    public final List<String> getSearchKeys() {
        return this.searchKeys;
    }

    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getSelectionStyle() {
        return this.selectionStyle;
    }

    public final boolean getShouldTintLeftImage() {
        return this.shouldTintLeftImage;
    }

    public final boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.leftIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leftImageUrl;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.shouldTintLeftImage);
        String str4 = this.selectionStyle;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.selected), 31, this.showCheckbox), 31, this.isDisabled);
        Action action = this.action;
        int iHashCode3 = (iM8289b2 + (action == null ? 0 : action.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode4 = (iHashCode3 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        Action action2 = this.deselectAction;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (action2 == null ? 0 : action2.hashCode())) * 31, 31, this.searchKeys);
        String str5 = this.sectionTitle;
        int iHashCode5 = (iM31983b + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d3 = this.fixedHeightSize;
        int iHashCode6 = (iHashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode7 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
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
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.leftIcon;
        String str5 = this.leftImageUrl;
        boolean z4 = this.shouldTintLeftImage;
        String str6 = this.selectionStyle;
        boolean z13 = this.selected;
        boolean z14 = this.showCheckbox;
        boolean z15 = this.isDisabled;
        Action action = this.action;
        GenericInteraction genericInteraction = this.interaction;
        Action action2 = this.deselectAction;
        List<String> list = this.searchKeys;
        String str7 = this.sectionTitle;
        Double d3 = this.fixedHeightSize;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SelectableCellModel(id=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", leftIcon=", str4, ", leftImageUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str5, ", shouldTintLeftImage=", z4, ", selectionStyle=");
        AbstractC38963t7.m124390t(sbM32001t, str6, ", selected=", z13, ", showCheckbox=");
        AbstractC38963t7.m124392v(sbM32001t, z14, ", isDisabled=", z15, ", action=");
        sbM32001t.append(action);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", deselectAction=");
        sbM32001t.append(action2);
        sbM32001t.append(", searchKeys=");
        sbM32001t.append(list);
        sbM32001t.append(", sectionTitle=");
        sbM32001t.append(str7);
        sbM32001t.append(", fixedHeightSize=");
        sbM32001t.append(d3);
        sbM32001t.append(", bindings=");
        return AbstractC30802r.m94765n(sbM32001t, map, ", aggregateBindings=", map2, ")");
    }

    public SelectableCellModel(String id4, String title, String str, String str2, String str3, boolean z4, String str4, boolean z13, boolean z14, boolean z15, Action action, GenericInteraction genericInteraction, Action action2, List<String> searchKeys, String str5, Double d3, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(searchKeys, "searchKeys");
        this.id = id4;
        this.title = title;
        this.subtitle = str;
        this.leftIcon = str2;
        this.leftImageUrl = str3;
        this.shouldTintLeftImage = z4;
        this.selectionStyle = str4;
        this.selected = z13;
        this.showCheckbox = z14;
        this.isDisabled = z15;
        this.action = action;
        this.interaction = genericInteraction;
        this.deselectAction = action2;
        this.searchKeys = searchKeys;
        this.sectionTitle = str5;
        this.fixedHeightSize = d3;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ SelectableCellModel(String str, String str2, String str3, String str4, String str5, boolean z4, String str6, boolean z13, boolean z14, boolean z15, Action action, GenericInteraction genericInteraction, Action action2, List list, String str7, Double d3, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? false : z4, str6, z13, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? false : z15, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : action, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : genericInteraction, (i13 & 4096) != 0 ? null : action2, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C25271y.f99162w : list, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str7, (32768 & i13) != 0 ? null : d3, (65536 & i13) != 0 ? null : map, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : map2);
    }
}
