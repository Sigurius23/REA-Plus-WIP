package com.whoop.design.models.celebration;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import ty1.C34260e;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u008a\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b=\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b@\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bC\u0010\u0018R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010$¨\u0006H"}, m65681d2 = {"Lcom/whoop/design/models/celebration/CelebrationOverlayModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "celebrationId", "confettiStyle", "", "items", "topItems", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lcom/whoop/design/models/celebration/CelebrationButtonsModel;", "buttons", "alignment", "", "analyticProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/CelebrationButtonsModel;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/CelebrationButtonsModel;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/whoop/design/util/TextResource;", "component6", "component7", "()Lcom/whoop/design/models/celebration/CelebrationButtonsModel;", "component8", "component9", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/CelebrationButtonsModel;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/design/models/celebration/CelebrationOverlayModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getCelebrationId", "getConfettiStyle", "Ljava/util/List;", "getItems", "getTopItems", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Lcom/whoop/design/models/celebration/CelebrationButtonsModel;", "getButtons", "getAlignment", "Ljava/util/Map;", "getAnalyticProperties", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CelebrationOverlayModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String alignment;
    private final Map<String, String> analyticProperties;
    private final CelebrationButtonsModel buttons;
    private final String celebrationId;
    private final String confettiStyle;
    private final List<DesignSystemModel> items;
    private final TextResource subtitle;
    private final TextResource title;
    private final List<DesignSystemModel> topItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/CelebrationOverlayModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/CelebrationOverlayModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CelebrationOverlayModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C34260e(18)), AbstractC30060g.m92087G(enumC23463i, new C34260e(19)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C34260e(20))};
    }

    public /* synthetic */ CelebrationOverlayModel(int i13, String str, String str2, List list, List list2, TextResource textResource, TextResource textResource2, CelebrationButtonsModel celebrationButtonsModel, String str3, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (193 != (i13 & 193)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 193, CelebrationOverlayModel$$serializer.INSTANCE.getDescriptor());
        }
        this.celebrationId = str;
        if ((i13 & 2) == 0) {
            this.confettiStyle = null;
        } else {
            this.confettiStyle = str2;
        }
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.items = c25271y;
        } else {
            this.items = list;
        }
        if ((i13 & 8) == 0) {
            this.topItems = c25271y;
        } else {
            this.topItems = list2;
        }
        if ((i13 & 16) == 0) {
            this.title = null;
        } else {
            this.title = textResource;
        }
        if ((i13 & 32) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = textResource2;
        }
        this.buttons = celebrationButtonsModel;
        this.alignment = str3;
        if ((i13 & 256) == 0) {
            this.analyticProperties = null;
        } else {
            this.analyticProperties = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CelebrationOverlayModel copy$default(CelebrationOverlayModel celebrationOverlayModel, String str, String str2, List list, List list2, TextResource textResource, TextResource textResource2, CelebrationButtonsModel celebrationButtonsModel, String str3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = celebrationOverlayModel.celebrationId;
        }
        if ((i13 & 2) != 0) {
            str2 = celebrationOverlayModel.confettiStyle;
        }
        if ((i13 & 4) != 0) {
            list = celebrationOverlayModel.items;
        }
        if ((i13 & 8) != 0) {
            list2 = celebrationOverlayModel.topItems;
        }
        if ((i13 & 16) != 0) {
            textResource = celebrationOverlayModel.title;
        }
        if ((i13 & 32) != 0) {
            textResource2 = celebrationOverlayModel.subtitle;
        }
        if ((i13 & 64) != 0) {
            celebrationButtonsModel = celebrationOverlayModel.buttons;
        }
        if ((i13 & 128) != 0) {
            str3 = celebrationOverlayModel.alignment;
        }
        if ((i13 & 256) != 0) {
            map = celebrationOverlayModel.analyticProperties;
        }
        String str4 = str3;
        Map map2 = map;
        TextResource textResource3 = textResource2;
        CelebrationButtonsModel celebrationButtonsModel2 = celebrationButtonsModel;
        TextResource textResource4 = textResource;
        List list3 = list;
        return celebrationOverlayModel.copy(str, str2, list3, list2, textResource4, textResource3, celebrationButtonsModel2, str4, map2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CelebrationOverlayModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.celebrationId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.confettiStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.confettiStyle);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.items, c25271y)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.topItems, c25271y)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.topItems);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, C25452a.f99689a, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 6, CelebrationButtonsModel$$serializer.INSTANCE, self.buttons);
        output.encodeStringElement(serialDesc, 7, self.alignment);
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.analyticProperties == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.analyticProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCelebrationId() {
        return this.celebrationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfettiStyle() {
        return this.confettiStyle;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    public final List<DesignSystemModel> component4() {
        return this.topItems;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CelebrationButtonsModel getButtons() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    public final Map<String, String> component9() {
        return this.analyticProperties;
    }

    public final CelebrationOverlayModel copy(String celebrationId, String confettiStyle, List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> topItems, TextResource title, TextResource subtitle, CelebrationButtonsModel buttons, String alignment, Map<String, String> analyticProperties) {
        AbstractC22676k.m65750j(celebrationId, "celebrationId");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(topItems, "topItems");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(alignment, "alignment");
        return new CelebrationOverlayModel(celebrationId, confettiStyle, items, topItems, title, subtitle, buttons, alignment, analyticProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CelebrationOverlayModel)) {
            return false;
        }
        CelebrationOverlayModel celebrationOverlayModel = (CelebrationOverlayModel) other;
        return AbstractC22676k.m65745e(this.celebrationId, celebrationOverlayModel.celebrationId) && AbstractC22676k.m65745e(this.confettiStyle, celebrationOverlayModel.confettiStyle) && AbstractC22676k.m65745e(this.items, celebrationOverlayModel.items) && AbstractC22676k.m65745e(this.topItems, celebrationOverlayModel.topItems) && AbstractC22676k.m65745e(this.title, celebrationOverlayModel.title) && AbstractC22676k.m65745e(this.subtitle, celebrationOverlayModel.subtitle) && AbstractC22676k.m65745e(this.buttons, celebrationOverlayModel.buttons) && AbstractC22676k.m65745e(this.alignment, celebrationOverlayModel.alignment) && AbstractC22676k.m65745e(this.analyticProperties, celebrationOverlayModel.analyticProperties);
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final Map<String, String> getAnalyticProperties() {
        return this.analyticProperties;
    }

    public final CelebrationButtonsModel getButtons() {
        return this.buttons;
    }

    public final String getCelebrationId() {
        return this.celebrationId;
    }

    public final String getConfettiStyle() {
        return this.confettiStyle;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> getTopItems() {
        return this.topItems;
    }

    public int hashCode() {
        int iHashCode = this.celebrationId.hashCode() * 31;
        String str = this.confettiStyle;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items), 31, this.topItems);
        TextResource textResource = this.title;
        int iHashCode2 = (iM31983b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.subtitle;
        int iM30450d = AbstractC11266d.m30450d((this.buttons.hashCode() + ((iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31)) * 31, 31, this.alignment);
        Map<String, String> map = this.analyticProperties;
        return iM30450d + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.celebrationId;
        String str2 = this.confettiStyle;
        List<DesignSystemModel> list = this.items;
        List<DesignSystemModel> list2 = this.topItems;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        CelebrationButtonsModel celebrationButtonsModel = this.buttons;
        String str3 = this.alignment;
        Map<String, String> map = this.analyticProperties;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CelebrationOverlayModel(celebrationId=", str, ", confettiStyle=", str2, ", items=");
        AbstractC21702c.m61148s(sbM32001t, list, ", topItems=", list2, ", title=");
        AbstractC30007c.m91855y(sbM32001t, textResource, ", subtitle=", textResource2, ", buttons=");
        sbM32001t.append(celebrationButtonsModel);
        sbM32001t.append(", alignment=");
        sbM32001t.append(str3);
        sbM32001t.append(", analyticProperties=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CelebrationOverlayModel(String celebrationId, String str, List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> topItems, TextResource textResource, TextResource textResource2, CelebrationButtonsModel buttons, String alignment, Map<String, String> map) {
        AbstractC22676k.m65750j(celebrationId, "celebrationId");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(topItems, "topItems");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(alignment, "alignment");
        this.celebrationId = celebrationId;
        this.confettiStyle = str;
        this.items = items;
        this.topItems = topItems;
        this.title = textResource;
        this.subtitle = textResource2;
        this.buttons = buttons;
        this.alignment = alignment;
        this.analyticProperties = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CelebrationOverlayModel(String str, String str2, List list, List list2, TextResource textResource, TextResource textResource2, CelebrationButtonsModel celebrationButtonsModel, String str3, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str2 = (i13 & 2) != 0 ? null : str2;
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, i14 != 0 ? c25271y : list, (i13 & 8) != 0 ? c25271y : list2, (i13 & 16) != 0 ? null : textResource, (i13 & 32) != 0 ? null : textResource2, celebrationButtonsModel, str3, (i13 & 256) != 0 ? null : map);
    }
}
