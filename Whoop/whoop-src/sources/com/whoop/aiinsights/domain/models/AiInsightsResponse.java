package com.whoop.aiinsights.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VWB\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010&J\u009a\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\bA\u0010=\u001a\u0004\b@\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\bE\u0010=\u001a\u0004\bD\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\bG\u0010=\u001a\u0004\bF\u0010\u001aR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010H\u0012\u0004\bJ\u0010=\u001a\u0004\bI\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\bL\u0010=\u001a\u0004\bK\u0010\u001aR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010M\u0012\u0004\bO\u0010=\u001a\u0004\bN\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010P\u0012\u0004\bR\u0010=\u001a\u0004\bQ\u0010&R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010P\u0012\u0004\bT\u0010=\u001a\u0004\bS\u0010&¨\u0006X"}, m65681d2 = {"Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;", "", "", "conversationSeedId", "sourceType", "header", "rightIcon", "title", "message", "", "Lcom/whoop/design/models/DesignSystemModel;", "content", "displayStyle", "Lcom/whoop/aiinsights/domain/models/SecondaryButton;", "contentActionButton", "Lcom/whoop/aiinsights/domain/models/PrimaryButton;", "leftButton", "rightButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "()Lcom/whoop/aiinsights/domain/models/SecondaryButton;", "component10", "()Lcom/whoop/aiinsights/domain/models/PrimaryButton;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$ai_insights_release", "(Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getConversationSeedId", "getConversationSeedId$annotations", "()V", "getSourceType", "getSourceType$annotations", "getHeader", "getHeader$annotations", "getRightIcon", "getRightIcon$annotations", "getTitle", "getTitle$annotations", "getMessage", "getMessage$annotations", "Ljava/util/List;", "getContent", "getContent$annotations", "getDisplayStyle", "getDisplayStyle$annotations", "Lcom/whoop/aiinsights/domain/models/SecondaryButton;", "getContentActionButton", "getContentActionButton$annotations", "Lcom/whoop/aiinsights/domain/models/PrimaryButton;", "getLeftButton", "getLeftButton$annotations", "getRightButton", "getRightButton$annotations", "Companion", "$serializer", "a", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiInsightsResponse {
    private final List<DesignSystemModel> content;
    private final SecondaryButton contentActionButton;
    private final String conversationSeedId;
    private final String displayStyle;
    private final String header;
    private final PrimaryButton leftButton;
    private final String message;
    private final PrimaryButton rightButton;
    private final String rightIcon;
    private final String sourceType;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33691b(16)), null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.aiinsights.domain.models.AiInsightsResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/aiinsights/domain/models/AiInsightsResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;", "serializer", "()Lwc3/c;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiInsightsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AiInsightsResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (SecondaryButton) null, (PrimaryButton) null, (PrimaryButton) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiInsightsResponse copy$default(AiInsightsResponse aiInsightsResponse, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, SecondaryButton secondaryButton, PrimaryButton primaryButton, PrimaryButton primaryButton2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiInsightsResponse.conversationSeedId;
        }
        if ((i13 & 2) != 0) {
            str2 = aiInsightsResponse.sourceType;
        }
        if ((i13 & 4) != 0) {
            str3 = aiInsightsResponse.header;
        }
        if ((i13 & 8) != 0) {
            str4 = aiInsightsResponse.rightIcon;
        }
        if ((i13 & 16) != 0) {
            str5 = aiInsightsResponse.title;
        }
        if ((i13 & 32) != 0) {
            str6 = aiInsightsResponse.message;
        }
        if ((i13 & 64) != 0) {
            list = aiInsightsResponse.content;
        }
        if ((i13 & 128) != 0) {
            str7 = aiInsightsResponse.displayStyle;
        }
        if ((i13 & 256) != 0) {
            secondaryButton = aiInsightsResponse.contentActionButton;
        }
        if ((i13 & 512) != 0) {
            primaryButton = aiInsightsResponse.leftButton;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            primaryButton2 = aiInsightsResponse.rightButton;
        }
        PrimaryButton primaryButton3 = primaryButton;
        PrimaryButton primaryButton4 = primaryButton2;
        String str8 = str7;
        SecondaryButton secondaryButton2 = secondaryButton;
        String str9 = str6;
        List list2 = list;
        String str10 = str5;
        String str11 = str3;
        return aiInsightsResponse.copy(str, str2, str11, str4, str10, str9, list2, str8, secondaryButton2, primaryButton3, primaryButton4);
    }

    @InterfaceC37143h("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    @InterfaceC37143h("contentActionButton")
    public static /* synthetic */ void getContentActionButton$annotations() {
    }

    @InterfaceC37143h("conversation_seed_id")
    public static /* synthetic */ void getConversationSeedId$annotations() {
    }

    @InterfaceC37143h("displayStyle")
    public static /* synthetic */ void getDisplayStyle$annotations() {
    }

    @InterfaceC37143h("header")
    public static /* synthetic */ void getHeader$annotations() {
    }

    @InterfaceC37143h("leftButton")
    public static /* synthetic */ void getLeftButton$annotations() {
    }

    @InterfaceC37143h("message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    @InterfaceC37143h("rightButton")
    public static /* synthetic */ void getRightButton$annotations() {
    }

    @InterfaceC37143h("rightIcon")
    public static /* synthetic */ void getRightIcon$annotations() {
    }

    @InterfaceC37143h("source_type")
    public static /* synthetic */ void getSourceType$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$ai_insights_release(AiInsightsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.conversationSeedId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.conversationSeedId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sourceType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.sourceType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.header);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.rightIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.rightIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.message != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.message);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.content != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.content);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.displayStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.displayStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.contentActionButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, SecondaryButton$$serializer.INSTANCE, self.contentActionButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.leftButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, PrimaryButton$$serializer.INSTANCE, self.leftButton);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.rightButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, PrimaryButton$$serializer.INSTANCE, self.rightButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PrimaryButton getLeftButton() {
        return this.leftButton;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PrimaryButton getRightButton() {
        return this.rightButton;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<DesignSystemModel> component7() {
        return this.content;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisplayStyle() {
        return this.displayStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SecondaryButton getContentActionButton() {
        return this.contentActionButton;
    }

    public final AiInsightsResponse copy(String conversationSeedId, String sourceType, String header, String rightIcon, String title, String message, List<? extends DesignSystemModel> content, String displayStyle, SecondaryButton contentActionButton, PrimaryButton leftButton, PrimaryButton rightButton) {
        return new AiInsightsResponse(conversationSeedId, sourceType, header, rightIcon, title, message, content, displayStyle, contentActionButton, leftButton, rightButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiInsightsResponse)) {
            return false;
        }
        AiInsightsResponse aiInsightsResponse = (AiInsightsResponse) other;
        return AbstractC22676k.m65745e(this.conversationSeedId, aiInsightsResponse.conversationSeedId) && AbstractC22676k.m65745e(this.sourceType, aiInsightsResponse.sourceType) && AbstractC22676k.m65745e(this.header, aiInsightsResponse.header) && AbstractC22676k.m65745e(this.rightIcon, aiInsightsResponse.rightIcon) && AbstractC22676k.m65745e(this.title, aiInsightsResponse.title) && AbstractC22676k.m65745e(this.message, aiInsightsResponse.message) && AbstractC22676k.m65745e(this.content, aiInsightsResponse.content) && AbstractC22676k.m65745e(this.displayStyle, aiInsightsResponse.displayStyle) && AbstractC22676k.m65745e(this.contentActionButton, aiInsightsResponse.contentActionButton) && AbstractC22676k.m65745e(this.leftButton, aiInsightsResponse.leftButton) && AbstractC22676k.m65745e(this.rightButton, aiInsightsResponse.rightButton);
    }

    public final List<DesignSystemModel> getContent() {
        return this.content;
    }

    public final SecondaryButton getContentActionButton() {
        return this.contentActionButton;
    }

    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    public final String getDisplayStyle() {
        return this.displayStyle;
    }

    public final String getHeader() {
        return this.header;
    }

    public final PrimaryButton getLeftButton() {
        return this.leftButton;
    }

    public final String getMessage() {
        return this.message;
    }

    public final PrimaryButton getRightButton() {
        return this.rightButton;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.conversationSeedId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.header;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightIcon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.message;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<DesignSystemModel> list = this.content;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.displayStyle;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        SecondaryButton secondaryButton = this.contentActionButton;
        int iHashCode9 = (iHashCode8 + (secondaryButton == null ? 0 : secondaryButton.hashCode())) * 31;
        PrimaryButton primaryButton = this.leftButton;
        int iHashCode10 = (iHashCode9 + (primaryButton == null ? 0 : primaryButton.hashCode())) * 31;
        PrimaryButton primaryButton2 = this.rightButton;
        return iHashCode10 + (primaryButton2 != null ? primaryButton2.hashCode() : 0);
    }

    public String toString() {
        String str = this.conversationSeedId;
        String str2 = this.sourceType;
        String str3 = this.header;
        String str4 = this.rightIcon;
        String str5 = this.title;
        String str6 = this.message;
        List<DesignSystemModel> list = this.content;
        String str7 = this.displayStyle;
        SecondaryButton secondaryButton = this.contentActionButton;
        PrimaryButton primaryButton = this.leftButton;
        PrimaryButton primaryButton2 = this.rightButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiInsightsResponse(conversationSeedId=", str, ", sourceType=", str2, ", header=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", rightIcon=", str4, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", message=", str6, ", content=");
        AbstractC17176i.m48511m(", displayStyle=", str7, ", contentActionButton=", sbM32001t, list);
        sbM32001t.append(secondaryButton);
        sbM32001t.append(", leftButton=");
        sbM32001t.append(primaryButton);
        sbM32001t.append(", rightButton=");
        sbM32001t.append(primaryButton2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ AiInsightsResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, SecondaryButton secondaryButton, PrimaryButton primaryButton, PrimaryButton primaryButton2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.conversationSeedId = null;
        } else {
            this.conversationSeedId = str;
        }
        if ((i13 & 2) == 0) {
            this.sourceType = null;
        } else {
            this.sourceType = str2;
        }
        if ((i13 & 4) == 0) {
            this.header = null;
        } else {
            this.header = str3;
        }
        if ((i13 & 8) == 0) {
            this.rightIcon = null;
        } else {
            this.rightIcon = str4;
        }
        if ((i13 & 16) == 0) {
            this.title = null;
        } else {
            this.title = str5;
        }
        if ((i13 & 32) == 0) {
            this.message = null;
        } else {
            this.message = str6;
        }
        if ((i13 & 64) == 0) {
            this.content = null;
        } else {
            this.content = list;
        }
        if ((i13 & 128) == 0) {
            this.displayStyle = null;
        } else {
            this.displayStyle = str7;
        }
        if ((i13 & 256) == 0) {
            this.contentActionButton = null;
        } else {
            this.contentActionButton = secondaryButton;
        }
        if ((i13 & 512) == 0) {
            this.leftButton = null;
        } else {
            this.leftButton = primaryButton;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.rightButton = null;
        } else {
            this.rightButton = primaryButton2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiInsightsResponse(String str, String str2, String str3, String str4, String str5, String str6, List<? extends DesignSystemModel> list, String str7, SecondaryButton secondaryButton, PrimaryButton primaryButton, PrimaryButton primaryButton2) {
        this.conversationSeedId = str;
        this.sourceType = str2;
        this.header = str3;
        this.rightIcon = str4;
        this.title = str5;
        this.message = str6;
        this.content = list;
        this.displayStyle = str7;
        this.contentActionButton = secondaryButton;
        this.leftButton = primaryButton;
        this.rightButton = primaryButton2;
    }

    public /* synthetic */ AiInsightsResponse(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, SecondaryButton secondaryButton, PrimaryButton primaryButton, PrimaryButton primaryButton2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : list, (i13 & 128) != 0 ? null : str7, (i13 & 256) != 0 ? null : secondaryButton, (i13 & 512) != 0 ? null : primaryButton, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : primaryButton2);
    }
}
