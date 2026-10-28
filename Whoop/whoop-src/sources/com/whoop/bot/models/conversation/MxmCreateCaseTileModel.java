package com.whoop.bot.models.conversation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.util.UUID;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o91.C27690g;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BL\u0012\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBK\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b$\u0010%JU\u0010&\u001a\u00020\u00002\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R*\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b3\u0010!R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b4\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010%¨\u00069"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Ljava/util/UUID;", "Lcom/whoop/design/json/serializers/SerializableUUID;", "Lwc3/i;", "with", "Lj93/d;", "id", "", "leftIcon", "title", "confirmationMessage", "", "completed", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Z", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Ljava/lang/String;", "getLeftIcon", "getTitle", "getConfirmationMessage", "Z", "getCompleted", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MxmCreateCaseTileModel implements DesignSystemModel {
    private final boolean completed;
    private final String confirmationMessage;
    private final UUID id;
    private final String leftIcon;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/MxmCreateCaseTileModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MxmCreateCaseTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MxmCreateCaseTileModel() {
        this((UUID) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ MxmCreateCaseTileModel copy$default(MxmCreateCaseTileModel mxmCreateCaseTileModel, UUID uuid, String str, String str2, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            uuid = mxmCreateCaseTileModel.id;
        }
        if ((i13 & 2) != 0) {
            str = mxmCreateCaseTileModel.leftIcon;
        }
        if ((i13 & 4) != 0) {
            str2 = mxmCreateCaseTileModel.title;
        }
        if ((i13 & 8) != 0) {
            str3 = mxmCreateCaseTileModel.confirmationMessage;
        }
        if ((i13 & 16) != 0) {
            z4 = mxmCreateCaseTileModel.completed;
        }
        boolean z13 = z4;
        String str4 = str2;
        return mxmCreateCaseTileModel.copy(uuid, str, str4, str3, z13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final /* synthetic */ void write$Self$bot_release(MxmCreateCaseTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, C27690g.f111466a, self.id);
        } else {
            UUID uuid = self.id;
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            if (!AbstractC22676k.m65745e(uuid, uuidRandomUUID)) {
                output.encodeSerializableElement(serialDesc, 0, C27690g.f111466a, self.id);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.leftIcon, "")) {
            output.encodeStringElement(serialDesc, 1, self.leftIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 2, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.confirmationMessage, "")) {
            output.encodeStringElement(serialDesc, 3, self.confirmationMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.completed) {
            output.encodeBooleanElement(serialDesc, 4, self.completed);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConfirmationMessage() {
        return this.confirmationMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    public final MxmCreateCaseTileModel copy(UUID id4, String leftIcon, String title, String confirmationMessage, boolean completed) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(confirmationMessage, "confirmationMessage");
        return new MxmCreateCaseTileModel(id4, leftIcon, title, confirmationMessage, completed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MxmCreateCaseTileModel)) {
            return false;
        }
        MxmCreateCaseTileModel mxmCreateCaseTileModel = (MxmCreateCaseTileModel) other;
        return AbstractC22676k.m65745e(this.id, mxmCreateCaseTileModel.id) && AbstractC22676k.m65745e(this.leftIcon, mxmCreateCaseTileModel.leftIcon) && AbstractC22676k.m65745e(this.title, mxmCreateCaseTileModel.title) && AbstractC22676k.m65745e(this.confirmationMessage, mxmCreateCaseTileModel.confirmationMessage) && this.completed == mxmCreateCaseTileModel.completed;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final String getConfirmationMessage() {
        return this.confirmationMessage;
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.completed) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.leftIcon), 31, this.title), 31, this.confirmationMessage);
    }

    public String toString() {
        UUID uuid = this.id;
        String str = this.leftIcon;
        String str2 = this.title;
        String str3 = this.confirmationMessage;
        boolean z4 = this.completed;
        StringBuilder sb4 = new StringBuilder("MxmCreateCaseTileModel(id=");
        sb4.append(uuid);
        sb4.append(", leftIcon=");
        sb4.append(str);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str2, ", confirmationMessage=", str3, ", completed=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ MxmCreateCaseTileModel(int i13, UUID uuid, String str, String str2, String str3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            uuid = UUID.randomUUID();
            AbstractC22676k.m65749i(uuid, "randomUUID(...)");
        }
        this.id = uuid;
        if ((i13 & 2) == 0) {
            this.leftIcon = "";
        } else {
            this.leftIcon = str;
        }
        if ((i13 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 8) == 0) {
            this.confirmationMessage = "";
        } else {
            this.confirmationMessage = str3;
        }
        if ((i13 & 16) == 0) {
            this.completed = false;
        } else {
            this.completed = z4;
        }
    }

    public MxmCreateCaseTileModel(UUID id4, String leftIcon, String title, String confirmationMessage, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(confirmationMessage, "confirmationMessage");
        this.id = id4;
        this.leftIcon = leftIcon;
        this.title = title;
        this.confirmationMessage = confirmationMessage;
        this.completed = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MxmCreateCaseTileModel(UUID uuid, String str, String str2, String str3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            uuid = UUID.randomUUID();
            AbstractC22676k.m65749i(uuid, "randomUUID(...)");
        }
        this(uuid, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? false : z4);
    }
}
