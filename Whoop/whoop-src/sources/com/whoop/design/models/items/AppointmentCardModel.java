package com.whoop.design.models.items;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w70.C36870a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u0087\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0094\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bD\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bE\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bF\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bG\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bH\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010&R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010*¨\u0006Q"}, m65681d2 = {"Lcom/whoop/design/models/items/AppointmentCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "header", "Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;", "iconButton", "Lcom/whoop/design/models/items/TagModel;", "tag", "title", "descriptionImageUrl", "description", "imageUrl", "imageAlignment", "Lcom/whoop/design/models/items/AppointmentCardDateModel;", HttpHeaders.DATE, "", "items", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AppointmentCardDateModel;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AppointmentCardDateModel;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;", "component3", "()Lcom/whoop/design/models/items/TagModel;", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/design/models/items/AppointmentCardDateModel;", "component10", "()Ljava/util/List;", "component11", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AppointmentCardDateModel;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/AppointmentCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AppointmentCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getHeader", "Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;", "getIconButton", "Lcom/whoop/design/models/items/TagModel;", "getTag", "getTitle", "getDescriptionImageUrl", "getDescription", "getImageUrl", "getImageAlignment", "Lcom/whoop/design/models/items/AppointmentCardDateModel;", "getDate", "Ljava/util/List;", "getItems", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AppointmentCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AppointmentCardDateModel date;
    private final String description;
    private final String descriptionImageUrl;
    private final C9598e destination;
    private final String header;
    private final AppointmentCardIconButtonModel iconButton;
    private final String imageAlignment;
    private final String imageUrl;
    private final List<DesignSystemModel> items;
    private final TagModel tag;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AppointmentCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AppointmentCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AppointmentCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36870a(24)), AbstractC30060g.m92087G(enumC23463i, new C36870a(25))};
    }

    public /* synthetic */ AppointmentCardModel(int i13, String str, AppointmentCardIconButtonModel appointmentCardIconButtonModel, TagModel tagModel, String str2, String str3, String str4, String str5, String str6, AppointmentCardDateModel appointmentCardDateModel, List list, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (40 != (i13 & 40)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 40, AppointmentCardModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.header = null;
        } else {
            this.header = str;
        }
        if ((i13 & 2) == 0) {
            this.iconButton = null;
        } else {
            this.iconButton = appointmentCardIconButtonModel;
        }
        if ((i13 & 4) == 0) {
            this.tag = null;
        } else {
            this.tag = tagModel;
        }
        this.title = str2;
        if ((i13 & 16) == 0) {
            this.descriptionImageUrl = null;
        } else {
            this.descriptionImageUrl = str3;
        }
        this.description = str4;
        if ((i13 & 64) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str5;
        }
        if ((i13 & 128) == 0) {
            this.imageAlignment = null;
        } else {
            this.imageAlignment = str6;
        }
        if ((i13 & 256) == 0) {
            this.date = null;
        } else {
            this.date = appointmentCardDateModel;
        }
        if ((i13 & 512) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppointmentCardModel copy$default(AppointmentCardModel appointmentCardModel, String str, AppointmentCardIconButtonModel appointmentCardIconButtonModel, TagModel tagModel, String str2, String str3, String str4, String str5, String str6, AppointmentCardDateModel appointmentCardDateModel, List list, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = appointmentCardModel.header;
        }
        if ((i13 & 2) != 0) {
            appointmentCardIconButtonModel = appointmentCardModel.iconButton;
        }
        if ((i13 & 4) != 0) {
            tagModel = appointmentCardModel.tag;
        }
        if ((i13 & 8) != 0) {
            str2 = appointmentCardModel.title;
        }
        if ((i13 & 16) != 0) {
            str3 = appointmentCardModel.descriptionImageUrl;
        }
        if ((i13 & 32) != 0) {
            str4 = appointmentCardModel.description;
        }
        if ((i13 & 64) != 0) {
            str5 = appointmentCardModel.imageUrl;
        }
        if ((i13 & 128) != 0) {
            str6 = appointmentCardModel.imageAlignment;
        }
        if ((i13 & 256) != 0) {
            appointmentCardDateModel = appointmentCardModel.date;
        }
        if ((i13 & 512) != 0) {
            list = appointmentCardModel.items;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c9598e = appointmentCardModel.destination;
        }
        List list2 = list;
        C9598e c9598e2 = c9598e;
        String str7 = str6;
        AppointmentCardDateModel appointmentCardDateModel2 = appointmentCardDateModel;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        TagModel tagModel2 = tagModel;
        return appointmentCardModel.copy(str, appointmentCardIconButtonModel, tagModel2, str2, str10, str8, str9, str7, appointmentCardDateModel2, list2, c9598e2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AppointmentCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.header);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iconButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, AppointmentCardIconButtonModel$$serializer.INSTANCE, self.iconButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.tag != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, TagModel$$serializer.INSTANCE, self.tag);
        }
        output.encodeStringElement(serialDesc, 3, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.descriptionImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.descriptionImageUrl);
        }
        output.encodeStringElement(serialDesc, 5, self.description);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.imageAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.imageAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.date != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, AppointmentCardDateModel$$serializer.INSTANCE, self.date);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.items);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> component10() {
        return this.items;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppointmentCardIconButtonModel getIconButton() {
        return this.iconButton;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescriptionImageUrl() {
        return this.descriptionImageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getImageAlignment() {
        return this.imageAlignment;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AppointmentCardDateModel getDate() {
        return this.date;
    }

    public final AppointmentCardModel copy(String header, AppointmentCardIconButtonModel iconButton, TagModel tag, String title, String descriptionImageUrl, String description, String imageUrl, String imageAlignment, AppointmentCardDateModel date, List<? extends DesignSystemModel> items, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(items, "items");
        return new AppointmentCardModel(header, iconButton, tag, title, descriptionImageUrl, description, imageUrl, imageAlignment, date, items, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentCardModel)) {
            return false;
        }
        AppointmentCardModel appointmentCardModel = (AppointmentCardModel) other;
        return AbstractC22676k.m65745e(this.header, appointmentCardModel.header) && AbstractC22676k.m65745e(this.iconButton, appointmentCardModel.iconButton) && AbstractC22676k.m65745e(this.tag, appointmentCardModel.tag) && AbstractC22676k.m65745e(this.title, appointmentCardModel.title) && AbstractC22676k.m65745e(this.descriptionImageUrl, appointmentCardModel.descriptionImageUrl) && AbstractC22676k.m65745e(this.description, appointmentCardModel.description) && AbstractC22676k.m65745e(this.imageUrl, appointmentCardModel.imageUrl) && AbstractC22676k.m65745e(this.imageAlignment, appointmentCardModel.imageAlignment) && AbstractC22676k.m65745e(this.date, appointmentCardModel.date) && AbstractC22676k.m65745e(this.items, appointmentCardModel.items) && AbstractC22676k.m65745e(this.destination, appointmentCardModel.destination);
    }

    public final AppointmentCardDateModel getDate() {
        return this.date;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionImageUrl() {
        return this.descriptionImageUrl;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getHeader() {
        return this.header;
    }

    public final AppointmentCardIconButtonModel getIconButton() {
        return this.iconButton;
    }

    public final String getImageAlignment() {
        return this.imageAlignment;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AppointmentCardIconButtonModel appointmentCardIconButtonModel = this.iconButton;
        int iHashCode2 = (iHashCode + (appointmentCardIconButtonModel == null ? 0 : appointmentCardIconButtonModel.hashCode())) * 31;
        TagModel tagModel = this.tag;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (tagModel == null ? 0 : tagModel.hashCode())) * 31, 31, this.title);
        String str2 = this.descriptionImageUrl;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.description);
        String str3 = this.imageUrl;
        int iHashCode3 = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageAlignment;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AppointmentCardDateModel appointmentCardDateModel = this.date;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (appointmentCardDateModel == null ? 0 : appointmentCardDateModel.hashCode())) * 31, 31, this.items);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.header;
        AppointmentCardIconButtonModel appointmentCardIconButtonModel = this.iconButton;
        TagModel tagModel = this.tag;
        String str2 = this.title;
        String str3 = this.descriptionImageUrl;
        String str4 = this.description;
        String str5 = this.imageUrl;
        String str6 = this.imageAlignment;
        AppointmentCardDateModel appointmentCardDateModel = this.date;
        List<DesignSystemModel> list = this.items;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("AppointmentCardModel(header=");
        sb4.append(str);
        sb4.append(", iconButton=");
        sb4.append(appointmentCardIconButtonModel);
        sb4.append(", tag=");
        sb4.append(tagModel);
        sb4.append(", title=");
        sb4.append(str2);
        sb4.append(", descriptionImageUrl=");
        AbstractC11266d.m30444B(sb4, str3, ", description=", str4, ", imageUrl=");
        AbstractC11266d.m30444B(sb4, str5, ", imageAlignment=", str6, ", date=");
        sb4.append(appointmentCardDateModel);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppointmentCardModel(String str, AppointmentCardIconButtonModel appointmentCardIconButtonModel, TagModel tagModel, String title, String str2, String description, String str3, String str4, AppointmentCardDateModel appointmentCardDateModel, List<? extends DesignSystemModel> items, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(items, "items");
        this.header = str;
        this.iconButton = appointmentCardIconButtonModel;
        this.tag = tagModel;
        this.title = title;
        this.descriptionImageUrl = str2;
        this.description = description;
        this.imageUrl = str3;
        this.imageAlignment = str4;
        this.date = appointmentCardDateModel;
        this.items = items;
        this.destination = c9598e;
    }

    public /* synthetic */ AppointmentCardModel(String str, AppointmentCardIconButtonModel appointmentCardIconButtonModel, TagModel tagModel, String str2, String str3, String str4, String str5, String str6, AppointmentCardDateModel appointmentCardDateModel, List list, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : appointmentCardIconButtonModel, (i13 & 4) != 0 ? null : tagModel, str2, (i13 & 16) != 0 ? null : str3, str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? null : appointmentCardDateModel, (i13 & 512) != 0 ? C25271y.f99162w : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c9598e);
    }
}
