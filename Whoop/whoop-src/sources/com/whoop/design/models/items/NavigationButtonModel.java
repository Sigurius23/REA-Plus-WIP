package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RQBu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u007f\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0086\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bC\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\bD\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\bP\u0010,¨\u0006S"}, m65681d2 = {"Lcom/whoop/design/models/items/NavigationButtonModel;", "", "", "text", "Lgz0/m0;", "icon", "iconUrl", "contentDescription", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/navigation/DismissEventModel;", "dismissEvent", "Lcom/whoop/design/models/modal/AnyModal;", "dismissModal", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lcom/whoop/design/models/items/GlowModel;", "glow", "<init>", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lgz0/m0;", "component3", "component4", "component5", "()Lcom/whoop/navigation/e;", "component6", "()Lcom/whoop/whoopaction/domain/models/Action;", "component7", "()Lcom/whoop/navigation/DismissEventModel;", "component8", "()Lcom/whoop/design/models/modal/AnyModal;", "component9", "()Lcom/whoop/analytics/AnalyticEventModel;", "component10", "()Lcom/whoop/design/models/items/GlowModel;", "copy", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)Lcom/whoop/design/models/items/NavigationButtonModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/NavigationButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getText", "Lgz0/m0;", "getIcon", "getIconUrl", "getContentDescription", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "Lcom/whoop/navigation/DismissEventModel;", "getDismissEvent", "Lcom/whoop/design/models/modal/AnyModal;", "getDismissModal", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Lcom/whoop/design/models/items/GlowModel;", "getGlow", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NavigationButtonModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private final AnalyticEventModel analyticEvent;
    private final String contentDescription;
    private final C9598e destination;
    private final DismissEventModel dismissEvent;
    private final AnyModal dismissModal;
    private final GlowModel glow;
    private final EnumC16313m0 icon;
    private final String iconUrl;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/NavigationButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/NavigationButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NavigationButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36961h(4)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36961h(5)), AbstractC30060g.m92087G(enumC23463i, new C36961h(6)), null, AbstractC30060g.m92087G(enumC23463i, new C36961h(7)), null, null};
    }

    public /* synthetic */ NavigationButtonModel(int i13, String str, EnumC16313m0 enumC16313m0, String str2, String str3, C9598e c9598e, Action action, DismissEventModel dismissEventModel, AnyModal anyModal, AnalyticEventModel analyticEventModel, GlowModel glowModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (58 != (i13 & 58)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 58, NavigationButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        this.icon = enumC16313m0;
        if ((i13 & 4) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str2;
        }
        this.contentDescription = str3;
        this.destination = c9598e;
        this.action = action;
        if ((i13 & 64) == 0) {
            this.dismissEvent = null;
        } else {
            this.dismissEvent = dismissEventModel;
        }
        if ((i13 & 128) == 0) {
            this.dismissModal = null;
        } else {
            this.dismissModal = anyModal;
        }
        if ((i13 & 256) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & 512) == 0) {
            this.glow = null;
        } else {
            this.glow = glowModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return AnyModal.INSTANCE.serializer();
    }

    public static /* synthetic */ NavigationButtonModel copy$default(NavigationButtonModel navigationButtonModel, String str, EnumC16313m0 enumC16313m0, String str2, String str3, C9598e c9598e, Action action, DismissEventModel dismissEventModel, AnyModal anyModal, AnalyticEventModel analyticEventModel, GlowModel glowModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = navigationButtonModel.text;
        }
        if ((i13 & 2) != 0) {
            enumC16313m0 = navigationButtonModel.icon;
        }
        if ((i13 & 4) != 0) {
            str2 = navigationButtonModel.iconUrl;
        }
        if ((i13 & 8) != 0) {
            str3 = navigationButtonModel.contentDescription;
        }
        if ((i13 & 16) != 0) {
            c9598e = navigationButtonModel.destination;
        }
        if ((i13 & 32) != 0) {
            action = navigationButtonModel.action;
        }
        if ((i13 & 64) != 0) {
            dismissEventModel = navigationButtonModel.dismissEvent;
        }
        if ((i13 & 128) != 0) {
            anyModal = navigationButtonModel.dismissModal;
        }
        if ((i13 & 256) != 0) {
            analyticEventModel = navigationButtonModel.analyticEvent;
        }
        if ((i13 & 512) != 0) {
            glowModel = navigationButtonModel.glow;
        }
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        GlowModel glowModel2 = glowModel;
        DismissEventModel dismissEventModel2 = dismissEventModel;
        AnyModal anyModal2 = anyModal;
        C9598e c9598e2 = c9598e;
        Action action2 = action;
        return navigationButtonModel.copy(str, enumC16313m0, str2, str3, c9598e2, action2, dismissEventModel2, anyModal2, analyticEventModel2, glowModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(NavigationButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.text);
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.iconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.iconUrl);
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.contentDescription);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.dismissEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DismissEventModel$$serializer.INSTANCE, self.dismissEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.dismissModal != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.dismissModal);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.glow == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, GlowModel$$serializer.INSTANCE, self.glow);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GlowModel getGlow() {
        return this.glow;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AnyModal getDismissModal() {
        return this.dismissModal;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final NavigationButtonModel copy(String text, EnumC16313m0 icon, String iconUrl, String contentDescription, C9598e destination, Action action, DismissEventModel dismissEvent, AnyModal dismissModal, AnalyticEventModel analyticEvent, GlowModel glow) {
        AbstractC22676k.m65750j(icon, "icon");
        return new NavigationButtonModel(text, icon, iconUrl, contentDescription, destination, action, dismissEvent, dismissModal, analyticEvent, glow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationButtonModel)) {
            return false;
        }
        NavigationButtonModel navigationButtonModel = (NavigationButtonModel) other;
        return AbstractC22676k.m65745e(this.text, navigationButtonModel.text) && this.icon == navigationButtonModel.icon && AbstractC22676k.m65745e(this.iconUrl, navigationButtonModel.iconUrl) && AbstractC22676k.m65745e(this.contentDescription, navigationButtonModel.contentDescription) && AbstractC22676k.m65745e(this.destination, navigationButtonModel.destination) && AbstractC22676k.m65745e(this.action, navigationButtonModel.action) && AbstractC22676k.m65745e(this.dismissEvent, navigationButtonModel.dismissEvent) && AbstractC22676k.m65745e(this.dismissModal, navigationButtonModel.dismissModal) && AbstractC22676k.m65745e(this.analyticEvent, navigationButtonModel.analyticEvent) && AbstractC22676k.m65745e(this.glow, navigationButtonModel.glow);
    }

    public final Action getAction() {
        return this.action;
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    public final AnyModal getDismissModal() {
        return this.dismissModal;
    }

    public final GlowModel getGlow() {
        return this.glow;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iM48500b = AbstractC17176i.m48500b(this.icon, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.iconUrl;
        int iHashCode = (iM48500b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentDescription;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Action action = this.action;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        DismissEventModel dismissEventModel = this.dismissEvent;
        int iHashCode5 = (iHashCode4 + (dismissEventModel == null ? 0 : dismissEventModel.hashCode())) * 31;
        AnyModal anyModal = this.dismissModal;
        int iHashCode6 = (iHashCode5 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode7 = (iHashCode6 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        GlowModel glowModel = this.glow;
        return iHashCode7 + (glowModel != null ? glowModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str2 = this.iconUrl;
        String str3 = this.contentDescription;
        C9598e c9598e = this.destination;
        Action action = this.action;
        DismissEventModel dismissEventModel = this.dismissEvent;
        AnyModal anyModal = this.dismissModal;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        GlowModel glowModel = this.glow;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("NavigationButtonModel(text=", str, ", icon=", enumC16313m0, ", iconUrl=");
        AbstractC11266d.m30444B(sbM61141l, str2, ", contentDescription=", str3, ", destination=");
        sbM61141l.append(c9598e);
        sbM61141l.append(", action=");
        sbM61141l.append(action);
        sbM61141l.append(", dismissEvent=");
        sbM61141l.append(dismissEventModel);
        sbM61141l.append(", dismissModal=");
        sbM61141l.append(anyModal);
        sbM61141l.append(", analyticEvent=");
        sbM61141l.append(analyticEventModel);
        sbM61141l.append(", glow=");
        sbM61141l.append(glowModel);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }

    public NavigationButtonModel(String str, EnumC16313m0 icon, String str2, String str3, C9598e c9598e, Action action, DismissEventModel dismissEventModel, AnyModal anyModal, AnalyticEventModel analyticEventModel, GlowModel glowModel) {
        AbstractC22676k.m65750j(icon, "icon");
        this.text = str;
        this.icon = icon;
        this.iconUrl = str2;
        this.contentDescription = str3;
        this.destination = c9598e;
        this.action = action;
        this.dismissEvent = dismissEventModel;
        this.dismissModal = anyModal;
        this.analyticEvent = analyticEventModel;
        this.glow = glowModel;
    }

    public /* synthetic */ NavigationButtonModel(String str, EnumC16313m0 enumC16313m0, String str2, String str3, C9598e c9598e, Action action, DismissEventModel dismissEventModel, AnyModal anyModal, AnalyticEventModel analyticEventModel, GlowModel glowModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, enumC16313m0, (i13 & 4) != 0 ? null : str2, str3, c9598e, action, (i13 & 64) != 0 ? null : dismissEventModel, (i13 & 128) != 0 ? null : anyModal, (i13 & 256) != 0 ? null : analyticEventModel, (i13 & 512) != 0 ? null : glowModel);
    }
}
