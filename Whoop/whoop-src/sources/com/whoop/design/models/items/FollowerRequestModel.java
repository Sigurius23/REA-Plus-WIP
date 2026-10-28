package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
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
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36957d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u009e\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bB\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bC\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bD\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bE\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bF\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010&¨\u0006K"}, m65681d2 = {"Lcom/whoop/design/models/items/FollowerRequestModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "subtitle", "subtext", "avatarUrl", "Lcom/whoop/design/models/items/FollowerRequestButtonModel;", "startButton", "endButton", "secondaryStartButton", "tertiaryStartButton", "secondaryEndButton", "tertiaryEndButton", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/design/models/items/FollowerRequestButtonModel;", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/FollowerRequestModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/FollowerRequestModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getSubtext", "getAvatarUrl", "Lcom/whoop/design/models/items/FollowerRequestButtonModel;", "getStartButton", "getEndButton", "getSecondaryStartButton", "getTertiaryStartButton", "getSecondaryEndButton", "getTertiaryEndButton", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FollowerRequestModel implements DesignSystemModel {
    private final String avatarUrl;
    private final C9598e destination;
    private final FollowerRequestButtonModel endButton;
    private final String id;
    private final FollowerRequestButtonModel secondaryEndButton;
    private final FollowerRequestButtonModel secondaryStartButton;
    private final FollowerRequestButtonModel startButton;
    private final String subtext;
    private final String subtitle;
    private final FollowerRequestButtonModel tertiaryEndButton;
    private final FollowerRequestButtonModel tertiaryStartButton;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36957d(29))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/FollowerRequestModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/FollowerRequestModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FollowerRequestModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FollowerRequestModel(int i13, String str, String str2, String str3, String str4, String str5, FollowerRequestButtonModel followerRequestButtonModel, FollowerRequestButtonModel followerRequestButtonModel2, FollowerRequestButtonModel followerRequestButtonModel3, FollowerRequestButtonModel followerRequestButtonModel4, FollowerRequestButtonModel followerRequestButtonModel5, FollowerRequestButtonModel followerRequestButtonModel6, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, FollowerRequestModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
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
            this.subtext = null;
        } else {
            this.subtext = str4;
        }
        if ((i13 & 16) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str5;
        }
        if ((i13 & 32) == 0) {
            this.startButton = null;
        } else {
            this.startButton = followerRequestButtonModel;
        }
        if ((i13 & 64) == 0) {
            this.endButton = null;
        } else {
            this.endButton = followerRequestButtonModel2;
        }
        if ((i13 & 128) == 0) {
            this.secondaryStartButton = null;
        } else {
            this.secondaryStartButton = followerRequestButtonModel3;
        }
        if ((i13 & 256) == 0) {
            this.tertiaryStartButton = null;
        } else {
            this.tertiaryStartButton = followerRequestButtonModel4;
        }
        if ((i13 & 512) == 0) {
            this.secondaryEndButton = null;
        } else {
            this.secondaryEndButton = followerRequestButtonModel5;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.tertiaryEndButton = null;
        } else {
            this.tertiaryEndButton = followerRequestButtonModel6;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ FollowerRequestModel copy$default(FollowerRequestModel followerRequestModel, String str, String str2, String str3, String str4, String str5, FollowerRequestButtonModel followerRequestButtonModel, FollowerRequestButtonModel followerRequestButtonModel2, FollowerRequestButtonModel followerRequestButtonModel3, FollowerRequestButtonModel followerRequestButtonModel4, FollowerRequestButtonModel followerRequestButtonModel5, FollowerRequestButtonModel followerRequestButtonModel6, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = followerRequestModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = followerRequestModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = followerRequestModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = followerRequestModel.subtext;
        }
        if ((i13 & 16) != 0) {
            str5 = followerRequestModel.avatarUrl;
        }
        if ((i13 & 32) != 0) {
            followerRequestButtonModel = followerRequestModel.startButton;
        }
        if ((i13 & 64) != 0) {
            followerRequestButtonModel2 = followerRequestModel.endButton;
        }
        if ((i13 & 128) != 0) {
            followerRequestButtonModel3 = followerRequestModel.secondaryStartButton;
        }
        if ((i13 & 256) != 0) {
            followerRequestButtonModel4 = followerRequestModel.tertiaryStartButton;
        }
        if ((i13 & 512) != 0) {
            followerRequestButtonModel5 = followerRequestModel.secondaryEndButton;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            followerRequestButtonModel6 = followerRequestModel.tertiaryEndButton;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c9598e = followerRequestModel.destination;
        }
        FollowerRequestButtonModel followerRequestButtonModel7 = followerRequestButtonModel6;
        C9598e c9598e2 = c9598e;
        FollowerRequestButtonModel followerRequestButtonModel8 = followerRequestButtonModel4;
        FollowerRequestButtonModel followerRequestButtonModel9 = followerRequestButtonModel5;
        FollowerRequestButtonModel followerRequestButtonModel10 = followerRequestButtonModel2;
        FollowerRequestButtonModel followerRequestButtonModel11 = followerRequestButtonModel3;
        String str6 = str5;
        FollowerRequestButtonModel followerRequestButtonModel12 = followerRequestButtonModel;
        return followerRequestModel.copy(str, str2, str3, str4, str6, followerRequestButtonModel12, followerRequestButtonModel10, followerRequestButtonModel11, followerRequestButtonModel8, followerRequestButtonModel9, followerRequestButtonModel7, c9598e2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FollowerRequestModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.subtext != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.avatarUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.avatarUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.startButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, FollowerRequestButtonModel$$serializer.INSTANCE, self.startButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.endButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, FollowerRequestButtonModel$$serializer.INSTANCE, self.endButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.secondaryStartButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, FollowerRequestButtonModel$$serializer.INSTANCE, self.secondaryStartButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.tertiaryStartButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, FollowerRequestButtonModel$$serializer.INSTANCE, self.tertiaryStartButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.secondaryEndButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, FollowerRequestButtonModel$$serializer.INSTANCE, self.secondaryEndButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.tertiaryEndButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, FollowerRequestButtonModel$$serializer.INSTANCE, self.tertiaryEndButton);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final FollowerRequestButtonModel getSecondaryEndButton() {
        return this.secondaryEndButton;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final FollowerRequestButtonModel getTertiaryEndButton() {
        return this.tertiaryEndButton;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
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
    public final String getSubtext() {
        return this.subtext;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FollowerRequestButtonModel getStartButton() {
        return this.startButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FollowerRequestButtonModel getEndButton() {
        return this.endButton;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final FollowerRequestButtonModel getSecondaryStartButton() {
        return this.secondaryStartButton;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FollowerRequestButtonModel getTertiaryStartButton() {
        return this.tertiaryStartButton;
    }

    public final FollowerRequestModel copy(String id4, String title, String subtitle, String subtext, String avatarUrl, FollowerRequestButtonModel startButton, FollowerRequestButtonModel endButton, FollowerRequestButtonModel secondaryStartButton, FollowerRequestButtonModel tertiaryStartButton, FollowerRequestButtonModel secondaryEndButton, FollowerRequestButtonModel tertiaryEndButton, C9598e destination) {
        AbstractC22676k.m65750j(id4, "id");
        return new FollowerRequestModel(id4, title, subtitle, subtext, avatarUrl, startButton, endButton, secondaryStartButton, tertiaryStartButton, secondaryEndButton, tertiaryEndButton, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowerRequestModel)) {
            return false;
        }
        FollowerRequestModel followerRequestModel = (FollowerRequestModel) other;
        return AbstractC22676k.m65745e(this.id, followerRequestModel.id) && AbstractC22676k.m65745e(this.title, followerRequestModel.title) && AbstractC22676k.m65745e(this.subtitle, followerRequestModel.subtitle) && AbstractC22676k.m65745e(this.subtext, followerRequestModel.subtext) && AbstractC22676k.m65745e(this.avatarUrl, followerRequestModel.avatarUrl) && AbstractC22676k.m65745e(this.startButton, followerRequestModel.startButton) && AbstractC22676k.m65745e(this.endButton, followerRequestModel.endButton) && AbstractC22676k.m65745e(this.secondaryStartButton, followerRequestModel.secondaryStartButton) && AbstractC22676k.m65745e(this.tertiaryStartButton, followerRequestModel.tertiaryStartButton) && AbstractC22676k.m65745e(this.secondaryEndButton, followerRequestModel.secondaryEndButton) && AbstractC22676k.m65745e(this.tertiaryEndButton, followerRequestModel.tertiaryEndButton) && AbstractC22676k.m65745e(this.destination, followerRequestModel.destination);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final FollowerRequestButtonModel getEndButton() {
        return this.endButton;
    }

    public final String getId() {
        return this.id;
    }

    public final FollowerRequestButtonModel getSecondaryEndButton() {
        return this.secondaryEndButton;
    }

    public final FollowerRequestButtonModel getSecondaryStartButton() {
        return this.secondaryStartButton;
    }

    public final FollowerRequestButtonModel getStartButton() {
        return this.startButton;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final FollowerRequestButtonModel getTertiaryEndButton() {
        return this.tertiaryEndButton;
    }

    public final FollowerRequestButtonModel getTertiaryStartButton() {
        return this.tertiaryStartButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtext;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatarUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FollowerRequestButtonModel followerRequestButtonModel = this.startButton;
        int iHashCode6 = (iHashCode5 + (followerRequestButtonModel == null ? 0 : followerRequestButtonModel.hashCode())) * 31;
        FollowerRequestButtonModel followerRequestButtonModel2 = this.endButton;
        int iHashCode7 = (iHashCode6 + (followerRequestButtonModel2 == null ? 0 : followerRequestButtonModel2.hashCode())) * 31;
        FollowerRequestButtonModel followerRequestButtonModel3 = this.secondaryStartButton;
        int iHashCode8 = (iHashCode7 + (followerRequestButtonModel3 == null ? 0 : followerRequestButtonModel3.hashCode())) * 31;
        FollowerRequestButtonModel followerRequestButtonModel4 = this.tertiaryStartButton;
        int iHashCode9 = (iHashCode8 + (followerRequestButtonModel4 == null ? 0 : followerRequestButtonModel4.hashCode())) * 31;
        FollowerRequestButtonModel followerRequestButtonModel5 = this.secondaryEndButton;
        int iHashCode10 = (iHashCode9 + (followerRequestButtonModel5 == null ? 0 : followerRequestButtonModel5.hashCode())) * 31;
        FollowerRequestButtonModel followerRequestButtonModel6 = this.tertiaryEndButton;
        int iHashCode11 = (iHashCode10 + (followerRequestButtonModel6 == null ? 0 : followerRequestButtonModel6.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode11 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.subtext;
        String str5 = this.avatarUrl;
        FollowerRequestButtonModel followerRequestButtonModel = this.startButton;
        FollowerRequestButtonModel followerRequestButtonModel2 = this.endButton;
        FollowerRequestButtonModel followerRequestButtonModel3 = this.secondaryStartButton;
        FollowerRequestButtonModel followerRequestButtonModel4 = this.tertiaryStartButton;
        FollowerRequestButtonModel followerRequestButtonModel5 = this.secondaryEndButton;
        FollowerRequestButtonModel followerRequestButtonModel6 = this.tertiaryEndButton;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FollowerRequestModel(id=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtext=", str4, ", avatarUrl=");
        sbM32001t.append(str5);
        sbM32001t.append(", startButton=");
        sbM32001t.append(followerRequestButtonModel);
        sbM32001t.append(", endButton=");
        sbM32001t.append(followerRequestButtonModel2);
        sbM32001t.append(", secondaryStartButton=");
        sbM32001t.append(followerRequestButtonModel3);
        sbM32001t.append(", tertiaryStartButton=");
        sbM32001t.append(followerRequestButtonModel4);
        sbM32001t.append(", secondaryEndButton=");
        sbM32001t.append(followerRequestButtonModel5);
        sbM32001t.append(", tertiaryEndButton=");
        sbM32001t.append(followerRequestButtonModel6);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public FollowerRequestModel(String id4, String str, String str2, String str3, String str4, FollowerRequestButtonModel followerRequestButtonModel, FollowerRequestButtonModel followerRequestButtonModel2, FollowerRequestButtonModel followerRequestButtonModel3, FollowerRequestButtonModel followerRequestButtonModel4, FollowerRequestButtonModel followerRequestButtonModel5, FollowerRequestButtonModel followerRequestButtonModel6, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.title = str;
        this.subtitle = str2;
        this.subtext = str3;
        this.avatarUrl = str4;
        this.startButton = followerRequestButtonModel;
        this.endButton = followerRequestButtonModel2;
        this.secondaryStartButton = followerRequestButtonModel3;
        this.tertiaryStartButton = followerRequestButtonModel4;
        this.secondaryEndButton = followerRequestButtonModel5;
        this.tertiaryEndButton = followerRequestButtonModel6;
        this.destination = c9598e;
    }

    public /* synthetic */ FollowerRequestModel(String str, String str2, String str3, String str4, String str5, FollowerRequestButtonModel followerRequestButtonModel, FollowerRequestButtonModel followerRequestButtonModel2, FollowerRequestButtonModel followerRequestButtonModel3, FollowerRequestButtonModel followerRequestButtonModel4, FollowerRequestButtonModel followerRequestButtonModel5, FollowerRequestButtonModel followerRequestButtonModel6, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : followerRequestButtonModel, (i13 & 64) != 0 ? null : followerRequestButtonModel2, (i13 & 128) != 0 ? null : followerRequestButtonModel3, (i13 & 256) != 0 ? null : followerRequestButtonModel4, (i13 & 512) != 0 ? null : followerRequestButtonModel5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : followerRequestButtonModel6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c9598e);
    }
}
