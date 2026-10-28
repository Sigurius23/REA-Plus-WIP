package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/navigation/CommunityScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "Lcom/whoop/navigation/AiAction;", "aiAction", "", "shareCode", "<init>", "(Lcom/whoop/navigation/AiAction;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/AiAction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/CommunityScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/AiAction;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/navigation/AiAction;Ljava/lang/String;)Lcom/whoop/navigation/CommunityScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Ljava/lang/String;", "getShareCode", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityScreenModel implements CommonNavigationScreenModel {
    private final AiAction aiAction;
    private final String shareCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.CommunityScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/CommunityScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/CommunityScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommunityScreenModel() {
        this((AiAction) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CommunityScreenModel copy$default(CommunityScreenModel communityScreenModel, AiAction aiAction, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aiAction = communityScreenModel.aiAction;
        }
        if ((i13 & 2) != 0) {
            str = communityScreenModel.shareCode;
        }
        return communityScreenModel.copy(aiAction, str);
    }

    public static final /* synthetic */ void write$Self$navigation_release(CommunityScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.aiAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, AiAction$$serializer.INSTANCE, self.aiAction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.shareCode == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.shareCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    public final CommunityScreenModel copy(AiAction aiAction, String shareCode) {
        return new CommunityScreenModel(aiAction, shareCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityScreenModel)) {
            return false;
        }
        CommunityScreenModel communityScreenModel = (CommunityScreenModel) other;
        return AbstractC22676k.m65745e(this.aiAction, communityScreenModel.aiAction) && AbstractC22676k.m65745e(this.shareCode, communityScreenModel.shareCode);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public int hashCode() {
        AiAction aiAction = this.aiAction;
        int iHashCode = (aiAction == null ? 0 : aiAction.hashCode()) * 31;
        String str = this.shareCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CommunityScreenModel(aiAction=" + this.aiAction + ", shareCode=" + this.shareCode + ")";
    }

    public /* synthetic */ CommunityScreenModel(int i13, AiAction aiAction, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
        if ((i13 & 2) == 0) {
            this.shareCode = null;
        } else {
            this.shareCode = str;
        }
    }

    public CommunityScreenModel(AiAction aiAction, String str) {
        this.aiAction = aiAction;
        this.shareCode = str;
    }

    public /* synthetic */ CommunityScreenModel(AiAction aiAction, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aiAction, (i13 & 2) != 0 ? null : str);
    }
}
