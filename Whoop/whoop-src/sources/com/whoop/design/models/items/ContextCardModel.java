package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.MarkdownTextModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w91.C36955b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0092\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b\b\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bB\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\b\u000b\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bD\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bE\u0010\u001bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010'R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010H\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010)¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/items/ContextCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "subtitle", "Lcom/whoop/design/models/MarkdownTextModel;", "description", "isNewText", NotificationCompat.CATEGORY_STATUS, "", "isUpdateSeen", "lastUpdatedAtText", "expiresAtText", "", "Lcom/whoop/design/models/items/ContextCardTagModel;", "tags", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/MarkdownTextModel;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ContextCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ContextCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Lcom/whoop/design/models/MarkdownTextModel;", "getDescription", "getStatus", "Ljava/lang/Boolean;", "getLastUpdatedAtText", "getExpiresAtText", "Ljava/util/List;", "getTags", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContextCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final MarkdownTextModel description;
    private final C9598e destination;
    private final String expiresAtText;
    private final String id;
    private final String isNewText;
    private final Boolean isUpdateSeen;
    private final String lastUpdatedAtText;
    private final String status;
    private final String subtitle;
    private final List<ContextCardTagModel> tags;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ContextCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ContextCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContextCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36955b(11)), AbstractC30060g.m92087G(enumC23463i, new C36955b(12))};
    }

    public /* synthetic */ ContextCardModel(int i13, String str, String str2, String str3, MarkdownTextModel markdownTextModel, String str4, String str5, Boolean bool, String str6, String str7, List list, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (35 != (i13 & 35)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 35, ContextCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        if ((i13 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i13 & 8) == 0) {
            this.description = null;
        } else {
            this.description = markdownTextModel;
        }
        if ((i13 & 16) == 0) {
            this.isNewText = null;
        } else {
            this.isNewText = str4;
        }
        this.status = str5;
        if ((i13 & 64) == 0) {
            this.isUpdateSeen = null;
        } else {
            this.isUpdateSeen = bool;
        }
        if ((i13 & 128) == 0) {
            this.lastUpdatedAtText = null;
        } else {
            this.lastUpdatedAtText = str6;
        }
        if ((i13 & 256) == 0) {
            this.expiresAtText = null;
        } else {
            this.expiresAtText = str7;
        }
        if ((i13 & 512) == 0) {
            this.tags = C25271y.f99162w;
        } else {
            this.tags = list;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ContextCardTagModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContextCardModel copy$default(ContextCardModel contextCardModel, String str, String str2, String str3, MarkdownTextModel markdownTextModel, String str4, String str5, Boolean bool, String str6, String str7, List list, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contextCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = contextCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = contextCardModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            markdownTextModel = contextCardModel.description;
        }
        if ((i13 & 16) != 0) {
            str4 = contextCardModel.isNewText;
        }
        if ((i13 & 32) != 0) {
            str5 = contextCardModel.status;
        }
        if ((i13 & 64) != 0) {
            bool = contextCardModel.isUpdateSeen;
        }
        if ((i13 & 128) != 0) {
            str6 = contextCardModel.lastUpdatedAtText;
        }
        if ((i13 & 256) != 0) {
            str7 = contextCardModel.expiresAtText;
        }
        if ((i13 & 512) != 0) {
            list = contextCardModel.tags;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c9598e = contextCardModel.destination;
        }
        List list2 = list;
        C9598e c9598e2 = c9598e;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        Boolean bool2 = bool;
        String str11 = str4;
        String str12 = str3;
        return contextCardModel.copy(str, str2, str12, markdownTextModel, str11, str10, bool2, str8, str9, list2, c9598e2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ContextCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, MarkdownTextModel$$serializer.INSTANCE, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isNewText != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.isNewText);
        }
        output.encodeStringElement(serialDesc, 5, self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.isUpdateSeen != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.isUpdateSeen);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.lastUpdatedAtText != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.lastUpdatedAtText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.expiresAtText != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.expiresAtText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.tags, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.tags);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<ContextCardTagModel> component10() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
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
    public final MarkdownTextModel getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsNewText() {
        return this.isNewText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsUpdateSeen() {
        return this.isUpdateSeen;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLastUpdatedAtText() {
        return this.lastUpdatedAtText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExpiresAtText() {
        return this.expiresAtText;
    }

    public final ContextCardModel copy(String id4, String title, String subtitle, MarkdownTextModel description, String isNewText, String status, Boolean isUpdateSeen, String lastUpdatedAtText, String expiresAtText, List<ContextCardTagModel> tags, C9598e destination) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(tags, "tags");
        return new ContextCardModel(id4, title, subtitle, description, isNewText, status, isUpdateSeen, lastUpdatedAtText, expiresAtText, tags, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextCardModel)) {
            return false;
        }
        ContextCardModel contextCardModel = (ContextCardModel) other;
        return AbstractC22676k.m65745e(this.id, contextCardModel.id) && AbstractC22676k.m65745e(this.title, contextCardModel.title) && AbstractC22676k.m65745e(this.subtitle, contextCardModel.subtitle) && AbstractC22676k.m65745e(this.description, contextCardModel.description) && AbstractC22676k.m65745e(this.isNewText, contextCardModel.isNewText) && AbstractC22676k.m65745e(this.status, contextCardModel.status) && AbstractC22676k.m65745e(this.isUpdateSeen, contextCardModel.isUpdateSeen) && AbstractC22676k.m65745e(this.lastUpdatedAtText, contextCardModel.lastUpdatedAtText) && AbstractC22676k.m65745e(this.expiresAtText, contextCardModel.expiresAtText) && AbstractC22676k.m65745e(this.tags, contextCardModel.tags) && AbstractC22676k.m65745e(this.destination, contextCardModel.destination);
    }

    public final MarkdownTextModel getDescription() {
        return this.description;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getExpiresAtText() {
        return this.expiresAtText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastUpdatedAtText() {
        return this.lastUpdatedAtText;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<ContextCardTagModel> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        MarkdownTextModel markdownTextModel = this.description;
        int iHashCode2 = (iHashCode + (markdownTextModel == null ? 0 : markdownTextModel.hashCode())) * 31;
        String str2 = this.isNewText;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.status);
        Boolean bool = this.isUpdateSeen;
        int iHashCode3 = (iM30450d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.lastUpdatedAtText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiresAtText;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.tags);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public final String isNewText() {
        return this.isNewText;
    }

    public final Boolean isUpdateSeen() {
        return this.isUpdateSeen;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        MarkdownTextModel markdownTextModel = this.description;
        String str4 = this.isNewText;
        String str5 = this.status;
        Boolean bool = this.isUpdateSeen;
        String str6 = this.lastUpdatedAtText;
        String str7 = this.expiresAtText;
        List<ContextCardTagModel> list = this.tags;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContextCardModel(id=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", description=");
        sbM32001t.append(markdownTextModel);
        sbM32001t.append(", isNewText=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", status=", str5, ", isUpdateSeen=");
        AbstractC13673n.m38576w(bool, ", lastUpdatedAtText=", str6, ", expiresAtText=", sbM32001t);
        AbstractC36095b.m114694v(str7, ", tags=", ", destination=", sbM32001t, list);
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public ContextCardModel(String id4, String title, String str, MarkdownTextModel markdownTextModel, String str2, String status, Boolean bool, String str3, String str4, List<ContextCardTagModel> tags, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(tags, "tags");
        this.id = id4;
        this.title = title;
        this.subtitle = str;
        this.description = markdownTextModel;
        this.isNewText = str2;
        this.status = status;
        this.isUpdateSeen = bool;
        this.lastUpdatedAtText = str3;
        this.expiresAtText = str4;
        this.tags = tags;
        this.destination = c9598e;
    }

    public /* synthetic */ ContextCardModel(String str, String str2, String str3, MarkdownTextModel markdownTextModel, String str4, String str5, Boolean bool, String str6, String str7, List list, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : markdownTextModel, (i13 & 16) != 0 ? null : str4, str5, (i13 & 64) != 0 ? null : bool, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? null : str7, (i13 & 512) != 0 ? C25271y.f99162w : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c9598e);
    }
}
