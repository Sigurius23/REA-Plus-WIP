package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
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
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTB£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B¡\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J®\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bD\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bE\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bF\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bG\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bH\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bI\u0010\u001dR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010R\u001a\u0004\bS\u0010.¨\u0006V"}, m65681d2 = {"Lcom/whoop/design/models/items/ButtonCellModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "titleType", "leadingIcon", "leadingImageUrl", "trailingIcon", "message", "style", "", "avatars", "Ly81/f;", "tintColor", "", "enabled", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "()Ly81/f;", "component11", "()Z", "component12", "()Lcom/whoop/navigation/e;", "component13", "()Lcom/whoop/design/models/modal/AnyModal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/items/ButtonCellModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ButtonCellModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getSubtitle", "getTitleType", "getLeadingIcon", "getLeadingImageUrl", "getTrailingIcon", "getMessage", "getStyle", "Ljava/util/List;", "getAvatars", "Ly81/f;", "getTintColor", "Z", "getEnabled", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ButtonCellModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> avatars;
    private final C9598e destination;
    private final boolean enabled;
    private final String leadingIcon;
    private final String leadingImageUrl;
    private final String message;
    private final AnyModal modal;
    private final String style;
    private final String subtitle;
    private final EnumC39333f tintColor;
    private final String title;
    private final String titleType;
    private final String trailingIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ButtonCellModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ButtonCellModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ButtonCellModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36954a(18)), AbstractC30060g.m92087G(enumC23463i, new C36954a(19)), null, AbstractC30060g.m92087G(enumC23463i, new C36954a(20)), AbstractC30060g.m92087G(enumC23463i, new C36954a(21))};
    }

    public /* synthetic */ ButtonCellModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, EnumC39333f enumC39333f, boolean z4, C9598e c9598e, AnyModal anyModal, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ButtonCellModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.titleType = null;
        } else {
            this.titleType = str3;
        }
        if ((i13 & 8) == 0) {
            this.leadingIcon = null;
        } else {
            this.leadingIcon = str4;
        }
        if ((i13 & 16) == 0) {
            this.leadingImageUrl = null;
        } else {
            this.leadingImageUrl = str5;
        }
        if ((i13 & 32) == 0) {
            this.trailingIcon = null;
        } else {
            this.trailingIcon = str6;
        }
        if ((i13 & 64) == 0) {
            this.message = null;
        } else {
            this.message = str7;
        }
        if ((i13 & 128) == 0) {
            this.style = null;
        } else {
            this.style = str8;
        }
        if ((i13 & 256) == 0) {
            this.avatars = null;
        } else {
            this.avatars = list;
        }
        if ((i13 & 512) == 0) {
            this.tintColor = null;
        } else {
            this.tintColor = enumC39333f;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.enabled = true;
        } else {
            this.enabled = z4;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 4096) == 0) {
            this.modal = null;
        } else {
            this.modal = anyModal;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return AnyModal.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonCellModel copy$default(ButtonCellModel buttonCellModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, EnumC39333f enumC39333f, boolean z4, C9598e c9598e, AnyModal anyModal, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buttonCellModel.title;
        }
        return buttonCellModel.copy(str, (i13 & 2) != 0 ? buttonCellModel.subtitle : str2, (i13 & 4) != 0 ? buttonCellModel.titleType : str3, (i13 & 8) != 0 ? buttonCellModel.leadingIcon : str4, (i13 & 16) != 0 ? buttonCellModel.leadingImageUrl : str5, (i13 & 32) != 0 ? buttonCellModel.trailingIcon : str6, (i13 & 64) != 0 ? buttonCellModel.message : str7, (i13 & 128) != 0 ? buttonCellModel.style : str8, (i13 & 256) != 0 ? buttonCellModel.avatars : list, (i13 & 512) != 0 ? buttonCellModel.tintColor : enumC39333f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? buttonCellModel.enabled : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? buttonCellModel.destination : c9598e, (i13 & 4096) != 0 ? buttonCellModel.modal : anyModal);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ButtonCellModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.titleType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.titleType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.leadingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.leadingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.leadingImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.leadingImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.trailingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.trailingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.message != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.message);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.avatars != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.avatars);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.tintColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.tintColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !self.enabled) {
            output.encodeBooleanElement(serialDesc, 10, self.enabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.destination);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.modal == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.modal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final EnumC39333f getTintColor() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleType() {
        return this.titleType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeadingImageUrl() {
        return this.leadingImageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrailingIcon() {
        return this.trailingIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final List<String> component9() {
        return this.avatars;
    }

    public final ButtonCellModel copy(String title, String subtitle, String titleType, String leadingIcon, String leadingImageUrl, String trailingIcon, String message, String style, List<String> avatars, EnumC39333f tintColor, boolean enabled, C9598e destination, AnyModal modal) {
        AbstractC22676k.m65750j(title, "title");
        return new ButtonCellModel(title, subtitle, titleType, leadingIcon, leadingImageUrl, trailingIcon, message, style, avatars, tintColor, enabled, destination, modal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonCellModel)) {
            return false;
        }
        ButtonCellModel buttonCellModel = (ButtonCellModel) other;
        return AbstractC22676k.m65745e(this.title, buttonCellModel.title) && AbstractC22676k.m65745e(this.subtitle, buttonCellModel.subtitle) && AbstractC22676k.m65745e(this.titleType, buttonCellModel.titleType) && AbstractC22676k.m65745e(this.leadingIcon, buttonCellModel.leadingIcon) && AbstractC22676k.m65745e(this.leadingImageUrl, buttonCellModel.leadingImageUrl) && AbstractC22676k.m65745e(this.trailingIcon, buttonCellModel.trailingIcon) && AbstractC22676k.m65745e(this.message, buttonCellModel.message) && AbstractC22676k.m65745e(this.style, buttonCellModel.style) && AbstractC22676k.m65745e(this.avatars, buttonCellModel.avatars) && this.tintColor == buttonCellModel.tintColor && this.enabled == buttonCellModel.enabled && AbstractC22676k.m65745e(this.destination, buttonCellModel.destination) && AbstractC22676k.m65745e(this.modal, buttonCellModel.modal);
    }

    public final List<String> getAvatars() {
        return this.avatars;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    public final String getLeadingImageUrl() {
        return this.leadingImageUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final EnumC39333f getTintColor() {
        return this.tintColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleType() {
        return this.titleType;
    }

    public final String getTrailingIcon() {
        return this.trailingIcon;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leadingIcon;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leadingImageUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trailingIcon;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.message;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.style;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list = this.avatars;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        EnumC39333f enumC39333f = this.tintColor;
        int iM8289b = AbstractC2875y.m8289b((iHashCode9 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31, 31, this.enabled);
        C9598e c9598e = this.destination;
        int iHashCode10 = (iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        return iHashCode10 + (anyModal != null ? anyModal.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.titleType;
        String str4 = this.leadingIcon;
        String str5 = this.leadingImageUrl;
        String str6 = this.trailingIcon;
        String str7 = this.message;
        String str8 = this.style;
        List<String> list = this.avatars;
        EnumC39333f enumC39333f = this.tintColor;
        boolean z4 = this.enabled;
        C9598e c9598e = this.destination;
        AnyModal anyModal = this.modal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ButtonCellModel(title=", str, ", subtitle=", str2, ", titleType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", leadingIcon=", str4, ", leadingImageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", trailingIcon=", str6, ", message=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", style=", str8, ", avatars=");
        sbM32001t.append(list);
        sbM32001t.append(", tintColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", enabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", modal=");
        sbM32001t.append(anyModal);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ButtonCellModel(String title, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, EnumC39333f enumC39333f, boolean z4, C9598e c9598e, AnyModal anyModal) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = str;
        this.titleType = str2;
        this.leadingIcon = str3;
        this.leadingImageUrl = str4;
        this.trailingIcon = str5;
        this.message = str6;
        this.style = str7;
        this.avatars = list;
        this.tintColor = enumC39333f;
        this.enabled = z4;
        this.destination = c9598e;
        this.modal = anyModal;
    }

    public /* synthetic */ ButtonCellModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, EnumC39333f enumC39333f, boolean z4, C9598e c9598e, AnyModal anyModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : str8, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : enumC39333f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c9598e, (i13 & 4096) != 0 ? null : anyModal);
    }
}
