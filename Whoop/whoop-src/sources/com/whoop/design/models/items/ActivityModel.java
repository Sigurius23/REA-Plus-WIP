package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
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
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB¥\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B§\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J°\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bF\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bG\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bH\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bI\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bJ\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bK\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bL\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bM\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bO\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bR\u0010\u001dR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010S\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010.¨\u0006Y"}, m65681d2 = {"Lcom/whoop/design/models/items/ActivityModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "scoreDisplay", "startTimeText", "endTimeText", "iconUrl", "secondaryIconUrl", NotificationCompat.CATEGORY_STATUS, "type", "activityV2Id", "Lcom/whoop/design/models/items/During;", "during", "Lcom/whoop/design/models/items/DetectedActivityMetadata;", "detectedActivityMetadata", "ctaState", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/whoop/design/models/items/During;", "component12", "()Lcom/whoop/design/models/items/DetectedActivityMetadata;", "component13", "component14", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ActivityModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ActivityModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/util/TextResource;", "getTitle", "getScoreDisplay", "getStartTimeText", "getEndTimeText", "getIconUrl", "getSecondaryIconUrl", "getStatus", "getType", "getActivityV2Id", "Lcom/whoop/design/models/items/During;", "getDuring", "Lcom/whoop/design/models/items/DetectedActivityMetadata;", "getDetectedActivityMetadata", "getCtaState", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String activityV2Id;
    private final String ctaState;
    private final C9598e destination;
    private final DetectedActivityMetadata detectedActivityMetadata;
    private final During during;
    private final TextResource endTimeText;
    private final String iconUrl;
    private final String id;
    private final TextResource scoreDisplay;
    private final String secondaryIconUrl;
    private final TextResource startTimeText;
    private final String status;
    private final TextResource title;
    private final String type;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ActivityModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ActivityModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14 | i14 | i14;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35100f(8))};
    }

    public /* synthetic */ ActivityModel(int i13, String str, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str2, String str3, String str4, String str5, String str6, During during, DetectedActivityMetadata detectedActivityMetadata, String str7, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (1024 != (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) {
            PluginExceptionsKt.throwMissingFieldException(i13, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, ActivityModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.title = AbstractC8693b.m21267a();
        } else {
            this.title = textResource;
        }
        if ((i13 & 4) == 0) {
            this.scoreDisplay = AbstractC8693b.m21267a();
        } else {
            this.scoreDisplay = textResource2;
        }
        if ((i13 & 8) == 0) {
            this.startTimeText = AbstractC8693b.m21267a();
        } else {
            this.startTimeText = textResource3;
        }
        if ((i13 & 16) == 0) {
            this.endTimeText = AbstractC8693b.m21267a();
        } else {
            this.endTimeText = textResource4;
        }
        if ((i13 & 32) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str2;
        }
        if ((i13 & 64) == 0) {
            this.secondaryIconUrl = null;
        } else {
            this.secondaryIconUrl = str3;
        }
        if ((i13 & 128) == 0) {
            this.status = "";
        } else {
            this.status = str4;
        }
        if ((i13 & 256) == 0) {
            this.type = "";
        } else {
            this.type = str5;
        }
        if ((i13 & 512) == 0) {
            this.activityV2Id = "";
        } else {
            this.activityV2Id = str6;
        }
        this.during = during;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.detectedActivityMetadata = null;
        } else {
            this.detectedActivityMetadata = detectedActivityMetadata;
        }
        if ((i13 & 4096) == 0) {
            this.ctaState = null;
        } else {
            this.ctaState = str7;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ActivityModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.scoreDisplay, AbstractC8693b.m21267a())) {
            output.encodeNullableSerializableElement(serialDesc, 2, C25452a.f99689a, self.scoreDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.startTimeText, AbstractC8693b.m21267a())) {
            output.encodeNullableSerializableElement(serialDesc, 3, C25452a.f99689a, self.startTimeText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.endTimeText, AbstractC8693b.m21267a())) {
            output.encodeNullableSerializableElement(serialDesc, 4, C25452a.f99689a, self.endTimeText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.iconUrl, "")) {
            output.encodeStringElement(serialDesc, 5, self.iconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.secondaryIconUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.secondaryIconUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !AbstractC22676k.m65745e(self.status, "")) {
            output.encodeStringElement(serialDesc, 7, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.type, "")) {
            output.encodeStringElement(serialDesc, 8, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.activityV2Id, "")) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.activityV2Id);
        }
        output.encodeNullableSerializableElement(serialDesc, 10, During$$serializer.INSTANCE, self.during);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.detectedActivityMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, DetectedActivityMetadata$$serializer.INSTANCE, self.detectedActivityMetadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.ctaState != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.ctaState);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getActivityV2Id() {
        return this.activityV2Id;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final During getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DetectedActivityMetadata getDetectedActivityMetadata() {
        return this.detectedActivityMetadata;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCtaState() {
        return this.ctaState;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getStartTimeText() {
        return this.startTimeText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getEndTimeText() {
        return this.endTimeText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSecondaryIconUrl() {
        return this.secondaryIconUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final ActivityModel copy(String id4, TextResource title, TextResource scoreDisplay, TextResource startTimeText, TextResource endTimeText, String iconUrl, String secondaryIconUrl, String status, String type, String activityV2Id, During during, DetectedActivityMetadata detectedActivityMetadata, String ctaState, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(type, "type");
        return new ActivityModel(id4, title, scoreDisplay, startTimeText, endTimeText, iconUrl, secondaryIconUrl, status, type, activityV2Id, during, detectedActivityMetadata, ctaState, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityModel)) {
            return false;
        }
        ActivityModel activityModel = (ActivityModel) other;
        return AbstractC22676k.m65745e(this.id, activityModel.id) && AbstractC22676k.m65745e(this.title, activityModel.title) && AbstractC22676k.m65745e(this.scoreDisplay, activityModel.scoreDisplay) && AbstractC22676k.m65745e(this.startTimeText, activityModel.startTimeText) && AbstractC22676k.m65745e(this.endTimeText, activityModel.endTimeText) && AbstractC22676k.m65745e(this.iconUrl, activityModel.iconUrl) && AbstractC22676k.m65745e(this.secondaryIconUrl, activityModel.secondaryIconUrl) && AbstractC22676k.m65745e(this.status, activityModel.status) && AbstractC22676k.m65745e(this.type, activityModel.type) && AbstractC22676k.m65745e(this.activityV2Id, activityModel.activityV2Id) && AbstractC22676k.m65745e(this.during, activityModel.during) && AbstractC22676k.m65745e(this.detectedActivityMetadata, activityModel.detectedActivityMetadata) && AbstractC22676k.m65745e(this.ctaState, activityModel.ctaState) && AbstractC22676k.m65745e(this.destination, activityModel.destination);
    }

    public final String getActivityV2Id() {
        return this.activityV2Id;
    }

    public final String getCtaState() {
        return this.ctaState;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final DetectedActivityMetadata getDetectedActivityMetadata() {
        return this.detectedActivityMetadata;
    }

    public final During getDuring() {
        return this.during;
    }

    public final TextResource getEndTimeText() {
        return this.endTimeText;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    public final String getSecondaryIconUrl() {
        return this.secondaryIconUrl;
    }

    public final TextResource getStartTimeText() {
        return this.startTimeText;
    }

    public final String getStatus() {
        return this.status;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iM95625a = AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31);
        TextResource textResource = this.scoreDisplay;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.startTimeText;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.endTimeText;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31, 31, this.iconUrl);
        String str2 = this.secondaryIconUrl;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.status), 31, this.type);
        String str3 = this.activityV2Id;
        int iHashCode3 = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        During during = this.during;
        int iHashCode4 = (iHashCode3 + (during == null ? 0 : during.hashCode())) * 31;
        DetectedActivityMetadata detectedActivityMetadata = this.detectedActivityMetadata;
        int iHashCode5 = (iHashCode4 + (detectedActivityMetadata == null ? 0 : detectedActivityMetadata.hashCode())) * 31;
        String str4 = this.ctaState;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode6 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.scoreDisplay;
        TextResource textResource3 = this.startTimeText;
        TextResource textResource4 = this.endTimeText;
        String str2 = this.iconUrl;
        String str3 = this.secondaryIconUrl;
        String str4 = this.status;
        String str5 = this.type;
        String str6 = this.activityV2Id;
        During during = this.during;
        DetectedActivityMetadata detectedActivityMetadata = this.detectedActivityMetadata;
        String str7 = this.ctaState;
        C9598e c9598e = this.destination;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("ActivityModel(id=", str, ", title=", textResource, ", scoreDisplay=");
        AbstractC30007c.m91855y(sbM91847q, textResource2, ", startTimeText=", textResource3, ", endTimeText=");
        AbstractC30007c.m91856z(sbM91847q, textResource4, ", iconUrl=", str2, ", secondaryIconUrl=");
        AbstractC11266d.m30444B(sbM91847q, str3, ", status=", str4, ", type=");
        AbstractC11266d.m30444B(sbM91847q, str5, ", activityV2Id=", str6, ", during=");
        sbM91847q.append(during);
        sbM91847q.append(", detectedActivityMetadata=");
        sbM91847q.append(detectedActivityMetadata);
        sbM91847q.append(", ctaState=");
        return AbstractC13673n.m38563j(sbM91847q, str7, ", destination=", c9598e, ")");
    }

    public ActivityModel(String str, TextResource title, TextResource textResource, TextResource textResource2, TextResource textResource3, String iconUrl, String str2, String status, String type, String str3, During during, DetectedActivityMetadata detectedActivityMetadata, String str4, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(type, "type");
        this.id = str;
        this.title = title;
        this.scoreDisplay = textResource;
        this.startTimeText = textResource2;
        this.endTimeText = textResource3;
        this.iconUrl = iconUrl;
        this.secondaryIconUrl = str2;
        this.status = status;
        this.type = type;
        this.activityV2Id = str3;
        this.during = during;
        this.detectedActivityMetadata = detectedActivityMetadata;
        this.ctaState = str4;
        this.destination = c9598e;
    }

    public /* synthetic */ ActivityModel(String str, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str2, String str3, String str4, String str5, String str6, During during, DetectedActivityMetadata detectedActivityMetadata, String str7, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 32) != 0 ? "" : str2, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? "" : str4, (i13 & 256) != 0 ? "" : str5, (i13 & 512) != 0 ? "" : str6, during, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : detectedActivityMetadata, (i13 & 4096) != 0 ? null : str7, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c9598e);
    }
}
