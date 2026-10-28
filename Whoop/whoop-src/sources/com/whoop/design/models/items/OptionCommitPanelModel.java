package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36961h;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0002ONB\u0092\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00022\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J3\u0010,\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0003¢\u0006\u0004\b,\u0010+J\u009d\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b@\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bA\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010)R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010+\"\u0004\bJ\u0010KRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010H\u001a\u0004\bL\u0010+\"\u0004\bM\u0010K¨\u0006P"}, m65681d2 = {"Lcom/whoop/design/models/items/OptionCommitPanelModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "title", "subtitle", "", "subtitleSupportsMarkdown", "", "options", "Lcom/whoop/design/models/items/CardButtonModel;", "primaryButton", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/design/models/items/CardButtonModel;", "component7", "()Ljava/util/Map;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/OptionCommitPanelModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/OptionCommitPanelModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Z", "getSubtitleSupportsMarkdown", "Ljava/util/List;", "getOptions", "Lcom/whoop/design/models/items/CardButtonModel;", "getPrimaryButton", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OptionCommitPanelModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String id;
    private final List<DesignSystemModel> options;
    private final CardButtonModel primaryButton;
    private final String subtitle;
    private final boolean subtitleSupportsMarkdown;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/OptionCommitPanelModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/OptionCommitPanelModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OptionCommitPanelModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36961h(14)), null, AbstractC30060g.m92087G(enumC23463i, new C36961h(15)), null};
    }

    public /* synthetic */ OptionCommitPanelModel(int i13, String str, String str2, String str3, boolean z4, List list, CardButtonModel cardButtonModel, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (32 != (i13 & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 32, OptionCommitPanelModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i13 & 8) == 0) {
            this.subtitleSupportsMarkdown = false;
        } else {
            this.subtitleSupportsMarkdown = z4;
        }
        if ((i13 & 16) == 0) {
            this.options = C25271y.f99162w;
        } else {
            this.options = list;
        }
        this.primaryButton = cardButtonModel;
        if ((i13 & 64) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 128) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionCommitPanelModel copy$default(OptionCommitPanelModel optionCommitPanelModel, String str, String str2, String str3, boolean z4, List list, CardButtonModel cardButtonModel, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = optionCommitPanelModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = optionCommitPanelModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = optionCommitPanelModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            z4 = optionCommitPanelModel.subtitleSupportsMarkdown;
        }
        if ((i13 & 16) != 0) {
            list = optionCommitPanelModel.options;
        }
        if ((i13 & 32) != 0) {
            cardButtonModel = optionCommitPanelModel.primaryButton;
        }
        if ((i13 & 64) != 0) {
            map = optionCommitPanelModel.bindings;
        }
        if ((i13 & 128) != 0) {
            map2 = optionCommitPanelModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        List list2 = list;
        CardButtonModel cardButtonModel2 = cardButtonModel;
        return optionCommitPanelModel.copy(str, str2, str3, z4, list2, cardButtonModel2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(OptionCommitPanelModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.subtitleSupportsMarkdown) {
            output.encodeBooleanElement(serialDesc, 3, self.subtitleSupportsMarkdown);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.options, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.options);
        }
        output.encodeSerializableElement(serialDesc, 5, CardButtonModel$$serializer.INSTANCE, self.primaryButton);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        String str;
        boolean z4;
        Map<String, JsonElement> state;
        JsonElement jsonElement;
        Map<String, ? extends Object> accumulatedState2 = accumulatedState;
        AbstractC22676k.m65750j(accumulatedState2, "accumulatedState");
        List<DesignSystemModel> list = this.options;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DesignSystemModel designSystemModel = (DesignSystemModel) it.next();
            SelectableCellModel selectableCellModel = designSystemModel instanceof SelectableCellModel ? (SelectableCellModel) designSystemModel : null;
            Action action = selectableCellModel != null ? selectableCellModel.getAction() : null;
            StateUpdateAction stateUpdateAction = action instanceof StateUpdateAction ? (StateUpdateAction) action : null;
            Map<String, JsonElement> state2 = stateUpdateAction != null ? stateUpdateAction.getState() : null;
            if (state2 != null) {
                arrayList.add(state2);
            }
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                str = null;
                break;
            }
            str = (String) AbstractC25265s.m74098G0(((Map) it3.next()).keySet());
        } while (str == null);
        Object obj = str != null ? accumulatedState2.get(str) : null;
        if (obj == null) {
            z4 = false;
        } else {
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Map map = (Map) it4.next();
                        if (!map.isEmpty()) {
                            Iterator it5 = map.entrySet().iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it5.next();
                                    if (!OptionCommitPanelModelKt.matchesStateValue((JsonElement) entry.getValue(), accumulatedState2.get((String) entry.getKey()))) {
                                    }
                                }
                            }
                        }
                        z4 = false;
                    }
                }
            }
            z4 = true;
        }
        if (z4) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                AbstractC25265s.m74141p0(arrayList2, ((Map) it6.next()).keySet());
            }
            accumulatedState2 = AbstractC25247g0.m73992a0(accumulatedState2, AbstractC25265s.m74103I1(arrayList2));
        }
        OptionCommitPanelModel optionCommitPanelModelGeneratedBind = OptionCommitPanelModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState2);
        AbstractC22676k.m65748h(optionCommitPanelModelGeneratedBind, "null cannot be cast to non-null type com.whoop.design.models.items.OptionCommitPanelModel");
        if (str == null || obj == null || z4) {
            return optionCommitPanelModelGeneratedBind;
        }
        List<DesignSystemModel> list2 = optionCommitPanelModelGeneratedBind.options;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Object objCopy$default : list2) {
            if (objCopy$default instanceof SelectableCellModel) {
                SelectableCellModel selectableCellModel2 = (SelectableCellModel) objCopy$default;
                Action action2 = selectableCellModel2.getAction();
                StateUpdateAction stateUpdateAction2 = action2 instanceof StateUpdateAction ? (StateUpdateAction) action2 : null;
                if (stateUpdateAction2 != null && (state = stateUpdateAction2.getState()) != null && (jsonElement = state.get(str)) != null) {
                    objCopy$default = SelectableCellModel.copy$default(selectableCellModel2, null, null, null, null, null, false, null, OptionCommitPanelModelKt.matchesStateValue(jsonElement, obj), false, false, null, null, null, null, null, null, null, null, 262015, null);
                }
            }
            arrayList3.add(objCopy$default);
        }
        return copy$default(optionCommitPanelModelGeneratedBind, null, null, null, false, arrayList3, null, null, null, 239, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final boolean getSubtitleSupportsMarkdown() {
        return this.subtitleSupportsMarkdown;
    }

    public final List<DesignSystemModel> component5() {
        return this.options;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final Map<String, String> component7() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component8() {
        return this.aggregateBindings;
    }

    public final OptionCommitPanelModel copy(String id4, String title, String subtitle, boolean subtitleSupportsMarkdown, List<? extends DesignSystemModel> options, CardButtonModel primaryButton, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        return new OptionCommitPanelModel(id4, title, subtitle, subtitleSupportsMarkdown, options, primaryButton, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionCommitPanelModel)) {
            return false;
        }
        OptionCommitPanelModel optionCommitPanelModel = (OptionCommitPanelModel) other;
        return AbstractC22676k.m65745e(this.id, optionCommitPanelModel.id) && AbstractC22676k.m65745e(this.title, optionCommitPanelModel.title) && AbstractC22676k.m65745e(this.subtitle, optionCommitPanelModel.subtitle) && this.subtitleSupportsMarkdown == optionCommitPanelModel.subtitleSupportsMarkdown && AbstractC22676k.m65745e(this.options, optionCommitPanelModel.options) && AbstractC22676k.m65745e(this.primaryButton, optionCommitPanelModel.primaryButton) && AbstractC22676k.m65745e(this.bindings, optionCommitPanelModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, optionCommitPanelModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getOptions() {
        return this.options;
    }

    public final CardButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getSubtitleSupportsMarkdown() {
        return this.subtitleSupportsMarkdown;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (this.primaryButton.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.subtitleSupportsMarkdown), 31, this.options)) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
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
        boolean z4 = this.subtitleSupportsMarkdown;
        List<DesignSystemModel> list = this.options;
        CardButtonModel cardButtonModel = this.primaryButton;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OptionCommitPanelModel(id=", str, ", title=", str2, ", subtitle=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", subtitleSupportsMarkdown=", z4, ", options=");
        sbM32001t.append(list);
        sbM32001t.append(", primaryButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", bindings=");
        return AbstractC30802r.m94765n(sbM32001t, map, ", aggregateBindings=", map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionCommitPanelModel(String str, String str2, String str3, boolean z4, List<? extends DesignSystemModel> options, CardButtonModel primaryButton, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.subtitleSupportsMarkdown = z4;
        this.options = options;
        this.primaryButton = primaryButton;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ OptionCommitPanelModel(String str, String str2, String str3, boolean z4, List list, CardButtonModel cardButtonModel, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? C25271y.f99162w : list, cardButtonModel, (i13 & 64) != 0 ? null : map, (i13 & 128) != 0 ? null : map2);
    }
}
