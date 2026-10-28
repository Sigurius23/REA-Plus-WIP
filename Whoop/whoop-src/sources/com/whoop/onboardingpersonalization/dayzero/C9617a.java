package com.whoop.onboardingpersonalization.dayzero;

import ad3.AbstractC0757c;
import android.os.Bundle;
import com.whoop.navigation.models.ChatHeaderMetadata;
import l02.C23050a;
import live.hms.video.sdk.models.enums.HMSMessageType;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p734sl0.C32645n0;
import qr2.AbstractC30556a;
import r12.EnumC30858c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.whoop.onboardingpersonalization.dayzero.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lcom/whoop/onboardingpersonalization/dayzero/a;", "", "Lsl0/n0;", HMSMessageType.CHAT, "", "dismissible", "Lcom/whoop/navigation/models/ChatHeaderMetadata;", "headerMetaData", "Lr12/c;", "headerMetaDataFailure", "<init>", "(Lsl0/n0;ZLcom/whoop/navigation/models/ChatHeaderMetadata;Lr12/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsl0/n0;", "b", "()Lsl0/n0;", "Z", "c", "()Z", "Lcom/whoop/navigation/models/ChatHeaderMetadata;", "d", "()Lcom/whoop/navigation/models/ChatHeaderMetadata;", "Lr12/c;", "e", "()Lr12/c;", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C9617a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f28213f = ChatHeaderMetadata.$stable | C32645n0.f135304t;

    /* JADX INFO: renamed from: g */
    private static final C23050a f28214g = new C23050a(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C32645n0 chat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean dismissible;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ChatHeaderMetadata headerMetaData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC30858c headerMetaDataFailure;

    /* JADX INFO: renamed from: com.whoop.onboardingpersonalization.dayzero.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/onboardingpersonalization/dayzero/a$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "", "key", "b", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "arguments", "Lcom/whoop/onboardingpersonalization/dayzero/a;", "a", "(Landroid/os/Bundle;)Lcom/whoop/onboardingpersonalization/dayzero/a;", "Ll02/a;", "deserializer", "Ll02/a;", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        private final String m23175b(Bundle bundle, String str) {
            String string;
            if (bundle == null || (string = bundle.getString(str)) == null || AbstractC39414r.m125890i0(string)) {
                return null;
            }
            return string;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004d  */
        /* JADX INFO: renamed from: a */
        public final C9617a m23176a(Bundle arguments) {
            Object objM1831b;
            String strM23175b = m23175b(arguments, "headerMetaData");
            C23050a c23050a = C9617a.f28214g;
            EnumC30858c enumC30858c = null;
            if (strM23175b != null) {
                try {
                    String str = strM23175b.length() > 0 ? strM23175b : null;
                    if (str != null) {
                        AbstractC0757c json = c23050a.getJson();
                        json.getClass();
                        objM1831b = json.m1831b(ChatHeaderMetadata.INSTANCE.serializer(), str);
                    } else {
                        objM1831b = null;
                    }
                } catch (Exception e5) {
                    c23050a.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChatHeaderMetadata.class).getSimpleName()), e5, new AbstractC30556a.a[0]);
                }
            } else {
                objM1831b = null;
            }
            ChatHeaderMetadata chatHeaderMetadata = (ChatHeaderMetadata) objM1831b;
            ChatHeaderMetadata chatHeaderMetadata2 = (chatHeaderMetadata == null || AbstractC39414r.m125890i0(chatHeaderMetadata.getPath())) ? null : chatHeaderMetadata;
            String strM23175b2 = m23175b(arguments, "fingerprint");
            String strM23175b3 = m23175b(arguments, "sourceId");
            String str2 = strM23175b3 == null ? "" : strM23175b3;
            String strM23175b4 = m23175b(arguments, "sourceType");
            String str3 = strM23175b4 == null ? "" : strM23175b4;
            String strM23175b5 = m23175b(arguments, "source");
            String strM23175b6 = m23175b(arguments, "conversationSeedId");
            C32645n0 c32645n0 = new C32645n0(null, null, null, strM23175b6 == null ? "" : strM23175b6, strM23175b2, null, str3, null, null, false, str2, null, strM23175b5, false, null, null, null, true, 125863, null);
            boolean z4 = arguments != null ? arguments.getBoolean("dismissible", true) : true;
            if (strM23175b != null) {
                if (chatHeaderMetadata == null) {
                    enumC30858c = EnumC30858c.DECODE_FAILED;
                } else if (chatHeaderMetadata2 == null) {
                    enumC30858c = EnumC30858c.BLANK_PATH;
                }
            }
            return new C9617a(c32645n0, z4, chatHeaderMetadata2, enumC30858c);
        }

        private Companion() {
        }
    }

    public C9617a(C32645n0 chat, boolean z4, ChatHeaderMetadata chatHeaderMetadata, EnumC30858c enumC30858c) {
        AbstractC22676k.m65750j(chat, "chat");
        this.chat = chat;
        this.dismissible = z4;
        this.headerMetaData = chatHeaderMetadata;
        this.headerMetaDataFailure = enumC30858c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C32645n0 getChat() {
        return this.chat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ChatHeaderMetadata getHeaderMetaData() {
        return this.headerMetaData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC30858c getHeaderMetaDataFailure() {
        return this.headerMetaDataFailure;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C9617a)) {
            return false;
        }
        C9617a c9617a = (C9617a) other;
        return AbstractC22676k.m65745e(this.chat, c9617a.chat) && this.dismissible == c9617a.dismissible && AbstractC22676k.m65745e(this.headerMetaData, c9617a.headerMetaData) && this.headerMetaDataFailure == c9617a.headerMetaDataFailure;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.chat.hashCode() * 31, 31, this.dismissible);
        ChatHeaderMetadata chatHeaderMetadata = this.headerMetaData;
        int iHashCode = (iM8289b + (chatHeaderMetadata == null ? 0 : chatHeaderMetadata.hashCode())) * 31;
        EnumC30858c enumC30858c = this.headerMetaDataFailure;
        return iHashCode + (enumC30858c != null ? enumC30858c.hashCode() : 0);
    }

    public String toString() {
        return "DayZeroPersonalizationArgs(chat=" + this.chat + ", dismissible=" + this.dismissible + ", headerMetaData=" + this.headerMetaData + ", headerMetaDataFailure=" + this.headerMetaDataFailure + ")";
    }
}
