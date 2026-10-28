package com.whoop.p057ai.chat.models;

import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xa1.C38138a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, m65681d2 = {"Lcom/whoop/ai/chat/models/Attachment;", "", "", QueryParams.URL, "Lcom/whoop/ai/chat/models/AttachmentType;", "type", "title", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;Lcom/whoop/ai/chat/models/AttachmentType;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/ai/chat/models/AttachmentType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/Attachment;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/ai/chat/models/AttachmentType;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/ai/chat/models/AttachmentType;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/models/Attachment;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lcom/whoop/ai/chat/models/AttachmentType;", "getType", "getTitle", "getDate", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Attachment {
    public static final int $stable = 0;
    private final String date;
    private final String title;
    private final AttachmentType type;
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38138a(19)), null, null};

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.Attachment$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/Attachment$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/Attachment;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Attachment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Attachment(int i13, String str, AttachmentType attachmentType, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, Attachment$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.type = attachmentType;
        if ((i13 & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i13 & 8) == 0) {
            this.date = null;
        } else {
            this.date = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AttachmentType.INSTANCE.serializer();
    }

    public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, AttachmentType attachmentType, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = attachment.url;
        }
        if ((i13 & 2) != 0) {
            attachmentType = attachment.type;
        }
        if ((i13 & 4) != 0) {
            str2 = attachment.title;
        }
        if ((i13 & 8) != 0) {
            str3 = attachment.date;
        }
        return attachment.copy(str, attachmentType, str2, str3);
    }

    public static final /* synthetic */ void write$Self$bot_release(Attachment self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.url);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.title);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.date == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AttachmentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final Attachment copy(String url, AttachmentType type, String title, String date) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(type, "type");
        return new Attachment(url, type, title, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) other;
        return AbstractC22676k.m65745e(this.url, attachment.url) && this.type == attachment.type && AbstractC22676k.m65745e(this.title, attachment.title) && AbstractC22676k.m65745e(this.date, attachment.date);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AttachmentType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.url.hashCode() * 31)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.date;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.url;
        AttachmentType attachmentType = this.type;
        String str2 = this.title;
        String str3 = this.date;
        StringBuilder sb4 = new StringBuilder("Attachment(url=");
        sb4.append(str);
        sb4.append(", type=");
        sb4.append(attachmentType);
        sb4.append(", title=");
        return AbstractC11266d.m30464r(sb4, str2, ", date=", str3, ")");
    }

    public Attachment(String url, AttachmentType type, String str, String str2) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(type, "type");
        this.url = url;
        this.type = type;
        this.title = str;
        this.date = str2;
    }

    public /* synthetic */ Attachment(String str, AttachmentType attachmentType, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attachmentType, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
