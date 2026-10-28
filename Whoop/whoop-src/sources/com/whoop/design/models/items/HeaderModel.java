package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import un1.C35100f;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 Y2\u00020\u0001:\u0002ZYB·\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017B¯\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010 JÀ\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b@\u0010AR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bG\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bH\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bI\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bJ\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bK\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bL\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bO\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bP\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bQ\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u0010-R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010T\u0012\u0004\bV\u0010W\u001a\u0004\bU\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bX\u0010 ¨\u0006["}, m65681d2 = {"Lcom/whoop/design/models/items/HeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "subtitleEnd", "description", "cta", "icon", "ctaState", "Lcom/whoop/design/models/items/HeaderStyle;", "style", "typography", "subtitleTypography", "subtitleLocation", "", "leadingButton", "Lcom/whoop/navigation/e;", "destination", "titleEnd", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/design/models/items/HeaderStyle;", "component10", "component11", "component12", "component13", "()Z", "component14", "()Lcom/whoop/navigation/e;", "component15", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/HeaderModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "getSubtitleEnd", "getDescription", "getCta", "getIcon", "getCtaState", "Lcom/whoop/design/models/items/HeaderStyle;", "getStyle", "getTypography", "getSubtitleTypography", "getSubtitleLocation", "Z", "getLeadingButton", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getTitleEnd", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeaderModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cta;
    private final String ctaState;
    private final TextResource description;
    private final C9598e destination;
    private final String icon;
    private final String id;
    private final boolean leadingButton;
    private final HeaderStyle style;
    private final TextResource subtitle;
    private final TextResource subtitleEnd;
    private final String subtitleLocation;
    private final String subtitleTypography;
    private final TextResource title;
    private final TextResource titleEnd;
    private final String typography;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HeaderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = TextResource.$stable;
        $stable = i13 | C9598e.f28134d | i13 | i13 | i13 | i13;
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35100f(14)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35100f(15)), null};
    }

    public HeaderModel() {
        this((String) null, (TextResource) null, (TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, (HeaderStyle) null, (String) null, (String) null, (String) null, false, (C9598e) null, (TextResource) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.HeaderStyle", HeaderStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(HeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, C25452a.f99689a, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.subtitleEnd != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, C25452a.f99689a, self.subtitleEnd);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, C25452a.f99689a, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.cta != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.cta);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.ctaState != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.ctaState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.typography != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.typography);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.subtitleTypography != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.subtitleTypography);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.subtitleLocation != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.subtitleLocation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.leadingButton) {
            output.encodeBooleanElement(serialDesc, 12, self.leadingButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.destination);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 14) && self.titleEnd == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 14, C25452a.f99689a, self.titleEnd);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTypography() {
        return this.typography;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSubtitleTypography() {
        return this.subtitleTypography;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSubtitleLocation() {
        return this.subtitleLocation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getLeadingButton() {
        return this.leadingButton;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final TextResource getTitleEnd() {
        return this.titleEnd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getSubtitleEnd() {
        return this.subtitleEnd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCtaState() {
        return this.ctaState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HeaderStyle getStyle() {
        return this.style;
    }

    public final HeaderModel copy(String id4, TextResource title, TextResource subtitle, TextResource subtitleEnd, TextResource description, String cta, String icon, String ctaState, HeaderStyle style, String typography, String subtitleTypography, String subtitleLocation, boolean leadingButton, C9598e destination, TextResource titleEnd) {
        AbstractC22676k.m65750j(title, "title");
        return new HeaderModel(id4, title, subtitle, subtitleEnd, description, cta, icon, ctaState, style, typography, subtitleTypography, subtitleLocation, leadingButton, destination, titleEnd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderModel)) {
            return false;
        }
        HeaderModel headerModel = (HeaderModel) other;
        return AbstractC22676k.m65745e(this.id, headerModel.id) && AbstractC22676k.m65745e(this.title, headerModel.title) && AbstractC22676k.m65745e(this.subtitle, headerModel.subtitle) && AbstractC22676k.m65745e(this.subtitleEnd, headerModel.subtitleEnd) && AbstractC22676k.m65745e(this.description, headerModel.description) && AbstractC22676k.m65745e(this.cta, headerModel.cta) && AbstractC22676k.m65745e(this.icon, headerModel.icon) && AbstractC22676k.m65745e(this.ctaState, headerModel.ctaState) && this.style == headerModel.style && AbstractC22676k.m65745e(this.typography, headerModel.typography) && AbstractC22676k.m65745e(this.subtitleTypography, headerModel.subtitleTypography) && AbstractC22676k.m65745e(this.subtitleLocation, headerModel.subtitleLocation) && this.leadingButton == headerModel.leadingButton && AbstractC22676k.m65745e(this.destination, headerModel.destination) && AbstractC22676k.m65745e(this.titleEnd, headerModel.titleEnd);
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getCtaState() {
        return this.ctaState;
    }

    public final TextResource getDescription() {
        return this.description;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getLeadingButton() {
        return this.leadingButton;
    }

    public final HeaderStyle getStyle() {
        return this.style;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getSubtitleEnd() {
        return this.subtitleEnd;
    }

    public final String getSubtitleLocation() {
        return this.subtitleLocation;
    }

    public final String getSubtitleTypography() {
        return this.subtitleTypography;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final TextResource getTitleEnd() {
        return this.titleEnd;
    }

    public final String getTypography() {
        return this.typography;
    }

    public int hashCode() {
        String str = this.id;
        int iM95625a = AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.subtitleEnd;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.description;
        int iHashCode3 = (iHashCode2 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        String str2 = this.cta;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ctaState;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HeaderStyle headerStyle = this.style;
        int iHashCode7 = (iHashCode6 + (headerStyle == null ? 0 : headerStyle.hashCode())) * 31;
        String str5 = this.typography;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitleTypography;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.subtitleLocation;
        int iM8289b = AbstractC2875y.m8289b((iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.leadingButton);
        C9598e c9598e = this.destination;
        int iHashCode10 = (iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        TextResource textResource4 = this.titleEnd;
        return iHashCode10 + (textResource4 != null ? textResource4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.subtitleEnd;
        TextResource textResource4 = this.description;
        String str2 = this.cta;
        String str3 = this.icon;
        String str4 = this.ctaState;
        HeaderStyle headerStyle = this.style;
        String str5 = this.typography;
        String str6 = this.subtitleTypography;
        String str7 = this.subtitleLocation;
        boolean z4 = this.leadingButton;
        C9598e c9598e = this.destination;
        TextResource textResource5 = this.titleEnd;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("HeaderModel(id=", str, ", title=", textResource, ", subtitle=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", subtitleEnd=", textResource3, ", description=");
        AbstractC30007c.m91856z(sbM91847q, textResource4, ", cta=", str2, ", icon=");
        AbstractC11266d.m30444B(sbM91847q, str3, ", ctaState=", str4, ", style=");
        sbM91847q.append(headerStyle);
        sbM91847q.append(", typography=");
        sbM91847q.append(str5);
        sbM91847q.append(", subtitleTypography=");
        AbstractC11266d.m30444B(sbM91847q, str6, ", subtitleLocation=", str7, ", leadingButton=");
        sbM91847q.append(z4);
        sbM91847q.append(", destination=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", titleEnd=");
        return AbstractC30007c.m91841k(sbM91847q, textResource5, ")");
    }

    public /* synthetic */ HeaderModel(int i13, String str, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str2, String str3, String str4, HeaderStyle headerStyle, String str5, String str6, String str7, boolean z4, C9598e c9598e, TextResource textResource5, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.title = AbstractC8693b.m21267a();
        } else {
            this.title = textResource;
        }
        if ((i13 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = textResource2;
        }
        if ((i13 & 8) == 0) {
            this.subtitleEnd = null;
        } else {
            this.subtitleEnd = textResource3;
        }
        if ((i13 & 16) == 0) {
            this.description = null;
        } else {
            this.description = textResource4;
        }
        if ((i13 & 32) == 0) {
            this.cta = null;
        } else {
            this.cta = str2;
        }
        if ((i13 & 64) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i13 & 128) == 0) {
            this.ctaState = null;
        } else {
            this.ctaState = str4;
        }
        if ((i13 & 256) == 0) {
            this.style = null;
        } else {
            this.style = headerStyle;
        }
        if ((i13 & 512) == 0) {
            this.typography = null;
        } else {
            this.typography = str5;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.subtitleTypography = null;
        } else {
            this.subtitleTypography = str6;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.subtitleLocation = null;
        } else {
            this.subtitleLocation = str7;
        }
        if ((i13 & 4096) == 0) {
            this.leadingButton = false;
        } else {
            this.leadingButton = z4;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.titleEnd = null;
        } else {
            this.titleEnd = textResource5;
        }
    }

    public HeaderModel(String str, TextResource title, TextResource textResource, TextResource textResource2, TextResource textResource3, String str2, String str3, String str4, HeaderStyle headerStyle, String str5, String str6, String str7, boolean z4, C9598e c9598e, TextResource textResource4) {
        AbstractC22676k.m65750j(title, "title");
        this.id = str;
        this.title = title;
        this.subtitle = textResource;
        this.subtitleEnd = textResource2;
        this.description = textResource3;
        this.cta = str2;
        this.icon = str3;
        this.ctaState = str4;
        this.style = headerStyle;
        this.typography = str5;
        this.subtitleTypography = str6;
        this.subtitleLocation = str7;
        this.leadingButton = z4;
        this.destination = c9598e;
        this.titleEnd = textResource4;
    }

    public /* synthetic */ HeaderModel(String str, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str2, String str3, String str4, HeaderStyle headerStyle, String str5, String str6, String str7, boolean z4, C9598e c9598e, TextResource textResource5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? null : textResource2, (i13 & 8) != 0 ? null : textResource3, (i13 & 16) != 0 ? null : textResource4, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : headerStyle, (i13 & 512) != 0 ? null : str5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str7, (i13 & 4096) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c9598e, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : textResource5);
    }
}
