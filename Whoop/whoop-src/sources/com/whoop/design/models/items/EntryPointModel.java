package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36956c;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002^]B\u0087\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018B\u009d\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001fJ¦\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u001fJ\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bJ\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bK\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bL\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bM\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010P\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\bU\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010V\u001a\u0004\bW\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\bY\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\b[\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\b\\\u0010\u001f¨\u0006_"}, m65681d2 = {"Lcom/whoop/design/models/items/EntryPointModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "endIcon", "body", "backgroundStyle", "imageUrl", "Lcom/whoop/design/models/items/EntryPointModelCta;", "callToAction", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/TagModel;", "navigationTag", "Lcom/whoop/whoopaction/domain/models/Action;", "dismissAction", "Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;", "analyticEvents", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "dismissId", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/design/models/items/EntryPointModelCta;", "component8", "()Lcom/whoop/navigation/e;", "component9", "()Lcom/whoop/design/models/items/TagModel;", "component10", "()Lcom/whoop/whoopaction/domain/models/Action;", "component11", "()Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;", "component12", "()Lcom/whoop/navigation/models/GenericInteraction;", "component13", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Lcom/whoop/design/models/items/EntryPointModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/EntryPointModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/util/TextResource;", "getTitle", "getEndIcon", "getBody", "getBackgroundStyle", "getImageUrl", "Lcom/whoop/design/models/items/EntryPointModelCta;", "getCallToAction", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/design/models/items/TagModel;", "getNavigationTag", "Lcom/whoop/whoopaction/domain/models/Action;", "getDismissAction", "Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;", "getAnalyticEvents", "Lcom/whoop/navigation/models/GenericInteraction;", "getGenericInteraction", "getDismissId", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EntryPointModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final EntryPointAnalyticEventsModel analyticEvents;
    private final String backgroundStyle;
    private final TextResource body;
    private final EntryPointModelCta callToAction;
    private final C9598e destination;
    private final Action dismissAction;
    private final String dismissId;
    private final String endIcon;
    private final GenericInteraction genericInteraction;
    private final String id;
    private final String imageUrl;
    private final TagModel navigationTag;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/EntryPointModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/EntryPointModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EntryPointModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36956c(23)), null, AbstractC30060g.m92087G(enumC23463i, new C36956c(24)), null, null, null};
    }

    public /* synthetic */ EntryPointModel(int i13, String str, TextResource textResource, String str2, TextResource textResource2, String str3, String str4, EntryPointModelCta entryPointModelCta, C9598e c9598e, TagModel tagModel, Action action, EntryPointAnalyticEventsModel entryPointAnalyticEventsModel, GenericInteraction genericInteraction, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, EntryPointModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = textResource;
        this.endIcon = str2;
        this.body = textResource2;
        this.backgroundStyle = str3;
        this.imageUrl = str4;
        this.callToAction = entryPointModelCta;
        this.destination = c9598e;
        this.navigationTag = tagModel;
        this.dismissAction = action;
        this.analyticEvents = entryPointAnalyticEventsModel;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.genericInteraction = null;
        } else {
            this.genericInteraction = genericInteraction;
        }
        if ((i13 & 4096) == 0) {
            this.dismissId = null;
        } else {
            this.dismissId = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ EntryPointModel copy$default(EntryPointModel entryPointModel, String str, TextResource textResource, String str2, TextResource textResource2, String str3, String str4, EntryPointModelCta entryPointModelCta, C9598e c9598e, TagModel tagModel, Action action, EntryPointAnalyticEventsModel entryPointAnalyticEventsModel, GenericInteraction genericInteraction, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = entryPointModel.id;
        }
        return entryPointModel.copy(str, (i13 & 2) != 0 ? entryPointModel.title : textResource, (i13 & 4) != 0 ? entryPointModel.endIcon : str2, (i13 & 8) != 0 ? entryPointModel.body : textResource2, (i13 & 16) != 0 ? entryPointModel.backgroundStyle : str3, (i13 & 32) != 0 ? entryPointModel.imageUrl : str4, (i13 & 64) != 0 ? entryPointModel.callToAction : entryPointModelCta, (i13 & 128) != 0 ? entryPointModel.destination : c9598e, (i13 & 256) != 0 ? entryPointModel.navigationTag : tagModel, (i13 & 512) != 0 ? entryPointModel.dismissAction : action, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? entryPointModel.analyticEvents : entryPointAnalyticEventsModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? entryPointModel.genericInteraction : genericInteraction, (i13 & 4096) != 0 ? entryPointModel.dismissId : str5);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(EntryPointModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        C25452a c25452a = C25452a.f99689a;
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.endIcon);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.body);
        output.encodeStringElement(serialDesc, 4, self.backgroundStyle);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 6, EntryPointModelCta$$serializer.INSTANCE, self.callToAction);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 8, TagModel$$serializer.INSTANCE, self.navigationTag);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.dismissAction);
        output.encodeNullableSerializableElement(serialDesc, 10, EntryPointAnalyticEventsModel$$serializer.INSTANCE, self.analyticEvents);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.genericInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, GenericInteraction$$serializer.INSTANCE, self.genericInteraction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.dismissId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.dismissId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Action getDismissAction() {
        return this.dismissAction;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final EntryPointAnalyticEventsModel getAnalyticEvents() {
        return this.analyticEvents;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDismissId() {
        return this.dismissId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EntryPointModelCta getCallToAction() {
        return this.callToAction;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    public final EntryPointModel copy(String id4, TextResource title, String endIcon, TextResource body, String backgroundStyle, String imageUrl, EntryPointModelCta callToAction, C9598e destination, TagModel navigationTag, Action dismissAction, EntryPointAnalyticEventsModel analyticEvents, GenericInteraction genericInteraction, String dismissId) {
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(callToAction, "callToAction");
        return new EntryPointModel(id4, title, endIcon, body, backgroundStyle, imageUrl, callToAction, destination, navigationTag, dismissAction, analyticEvents, genericInteraction, dismissId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryPointModel)) {
            return false;
        }
        EntryPointModel entryPointModel = (EntryPointModel) other;
        return AbstractC22676k.m65745e(this.id, entryPointModel.id) && AbstractC22676k.m65745e(this.title, entryPointModel.title) && AbstractC22676k.m65745e(this.endIcon, entryPointModel.endIcon) && AbstractC22676k.m65745e(this.body, entryPointModel.body) && AbstractC22676k.m65745e(this.backgroundStyle, entryPointModel.backgroundStyle) && AbstractC22676k.m65745e(this.imageUrl, entryPointModel.imageUrl) && AbstractC22676k.m65745e(this.callToAction, entryPointModel.callToAction) && AbstractC22676k.m65745e(this.destination, entryPointModel.destination) && AbstractC22676k.m65745e(this.navigationTag, entryPointModel.navigationTag) && AbstractC22676k.m65745e(this.dismissAction, entryPointModel.dismissAction) && AbstractC22676k.m65745e(this.analyticEvents, entryPointModel.analyticEvents) && AbstractC22676k.m65745e(this.genericInteraction, entryPointModel.genericInteraction) && AbstractC22676k.m65745e(this.dismissId, entryPointModel.dismissId);
    }

    public final EntryPointAnalyticEventsModel getAnalyticEvents() {
        return this.analyticEvents;
    }

    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final TextResource getBody() {
        return this.body;
    }

    public final EntryPointModelCta getCallToAction() {
        return this.callToAction;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final Action getDismissAction() {
        return this.dismissAction;
    }

    public final String getDismissId() {
        return this.dismissId;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str2 = this.endIcon;
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.body, 31), 31, this.backgroundStyle);
        String str3 = this.imageUrl;
        int iHashCode3 = (this.callToAction.hashCode() + ((iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        TagModel tagModel = this.navigationTag;
        int iHashCode5 = (iHashCode4 + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        Action action = this.dismissAction;
        int iHashCode6 = (iHashCode5 + (action == null ? 0 : action.hashCode())) * 31;
        EntryPointAnalyticEventsModel entryPointAnalyticEventsModel = this.analyticEvents;
        int iHashCode7 = (iHashCode6 + (entryPointAnalyticEventsModel == null ? 0 : entryPointAnalyticEventsModel.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        int iHashCode8 = (iHashCode7 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        String str4 = this.dismissId;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        String str2 = this.endIcon;
        TextResource textResource2 = this.body;
        String str3 = this.backgroundStyle;
        String str4 = this.imageUrl;
        EntryPointModelCta entryPointModelCta = this.callToAction;
        C9598e c9598e = this.destination;
        TagModel tagModel = this.navigationTag;
        Action action = this.dismissAction;
        EntryPointAnalyticEventsModel entryPointAnalyticEventsModel = this.analyticEvents;
        GenericInteraction genericInteraction = this.genericInteraction;
        String str5 = this.dismissId;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("EntryPointModel(id=", str, ", title=", textResource, ", endIcon=");
        AbstractC30007c.m91826A(sbM91847q, str2, ", body=", textResource2, ", backgroundStyle=");
        AbstractC11266d.m30444B(sbM91847q, str3, ", imageUrl=", str4, ", callToAction=");
        sbM91847q.append(entryPointModelCta);
        sbM91847q.append(", destination=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", navigationTag=");
        sbM91847q.append(tagModel);
        sbM91847q.append(", dismissAction=");
        sbM91847q.append(action);
        sbM91847q.append(", analyticEvents=");
        sbM91847q.append(entryPointAnalyticEventsModel);
        sbM91847q.append(", genericInteraction=");
        sbM91847q.append(genericInteraction);
        sbM91847q.append(", dismissId=");
        return AbstractC25012a.m73376i(str5, ")", sbM91847q);
    }

    public EntryPointModel(String str, TextResource textResource, String str2, TextResource body, String backgroundStyle, String str3, EntryPointModelCta callToAction, C9598e c9598e, TagModel tagModel, Action action, EntryPointAnalyticEventsModel entryPointAnalyticEventsModel, GenericInteraction genericInteraction, String str4) {
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(callToAction, "callToAction");
        this.id = str;
        this.title = textResource;
        this.endIcon = str2;
        this.body = body;
        this.backgroundStyle = backgroundStyle;
        this.imageUrl = str3;
        this.callToAction = callToAction;
        this.destination = c9598e;
        this.navigationTag = tagModel;
        this.dismissAction = action;
        this.analyticEvents = entryPointAnalyticEventsModel;
        this.genericInteraction = genericInteraction;
        this.dismissId = str4;
    }

    public /* synthetic */ EntryPointModel(String str, TextResource textResource, String str2, TextResource textResource2, String str3, String str4, EntryPointModelCta entryPointModelCta, C9598e c9598e, TagModel tagModel, Action action, EntryPointAnalyticEventsModel entryPointAnalyticEventsModel, GenericInteraction genericInteraction, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, str2, textResource2, str3, str4, entryPointModelCta, c9598e, tagModel, action, entryPointAnalyticEventsModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : genericInteraction, (i13 & 4096) != 0 ? null : str5);
    }
}
