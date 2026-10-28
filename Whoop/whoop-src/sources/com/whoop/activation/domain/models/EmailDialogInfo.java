package com.whoop.activation.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q70.C30009a;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#¨\u00067"}, m65681d2 = {"Lcom/whoop/activation/domain/models/EmailDialogInfo;", "", "", "title", "", "paragraphs", "backText", "confirmationText", "suggestedEmail", "", "originalValid", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/EmailDialogInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/activation/domain/models/EmailDialogInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getParagraphs", "getBackText", "getConfirmationText", "getSuggestedEmail", "Z", "getOriginalValid", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EmailDialogInfo {

    @SerializedName("back_text")
    private final String backText;

    @SerializedName("confirmation_text")
    private final String confirmationText;
    private final boolean originalValid;

    @SerializedName("paragraphs")
    private final List<String> paragraphs;

    @SerializedName("suggested_email")
    private final String suggestedEmail;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30009a(3)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/EmailDialogInfo$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EmailDialogInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EmailDialogInfo(int i13, String str, List list, String str2, String str3, String str4, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, EmailDialogInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.paragraphs = list;
        this.backText = str2;
        this.confirmationText = str3;
        this.suggestedEmail = str4;
        if ((i13 & 32) == 0) {
            this.originalValid = false;
        } else {
            this.originalValid = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmailDialogInfo copy$default(EmailDialogInfo emailDialogInfo, String str, List list, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = emailDialogInfo.title;
        }
        if ((i13 & 2) != 0) {
            list = emailDialogInfo.paragraphs;
        }
        if ((i13 & 4) != 0) {
            str2 = emailDialogInfo.backText;
        }
        if ((i13 & 8) != 0) {
            str3 = emailDialogInfo.confirmationText;
        }
        if ((i13 & 16) != 0) {
            str4 = emailDialogInfo.suggestedEmail;
        }
        if ((i13 & 32) != 0) {
            z4 = emailDialogInfo.originalValid;
        }
        String str5 = str4;
        boolean z13 = z4;
        return emailDialogInfo.copy(str, list, str2, str3, str5, z13);
    }

    public static final /* synthetic */ void write$Self$activation_release(EmailDialogInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.paragraphs);
        output.encodeStringElement(serialDesc, 2, self.backText);
        output.encodeStringElement(serialDesc, 3, self.confirmationText);
        output.encodeStringElement(serialDesc, 4, self.suggestedEmail);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.originalValid) {
            output.encodeBooleanElement(serialDesc, 5, self.originalValid);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component2() {
        return this.paragraphs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackText() {
        return this.backText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConfirmationText() {
        return this.confirmationText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuggestedEmail() {
        return this.suggestedEmail;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getOriginalValid() {
        return this.originalValid;
    }

    public final EmailDialogInfo copy(String title, List<String> paragraphs, String backText, String confirmationText, String suggestedEmail, boolean originalValid) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(paragraphs, "paragraphs");
        AbstractC22676k.m65750j(backText, "backText");
        AbstractC22676k.m65750j(confirmationText, "confirmationText");
        AbstractC22676k.m65750j(suggestedEmail, "suggestedEmail");
        return new EmailDialogInfo(title, paragraphs, backText, confirmationText, suggestedEmail, originalValid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailDialogInfo)) {
            return false;
        }
        EmailDialogInfo emailDialogInfo = (EmailDialogInfo) other;
        return AbstractC22676k.m65745e(this.title, emailDialogInfo.title) && AbstractC22676k.m65745e(this.paragraphs, emailDialogInfo.paragraphs) && AbstractC22676k.m65745e(this.backText, emailDialogInfo.backText) && AbstractC22676k.m65745e(this.confirmationText, emailDialogInfo.confirmationText) && AbstractC22676k.m65745e(this.suggestedEmail, emailDialogInfo.suggestedEmail) && this.originalValid == emailDialogInfo.originalValid;
    }

    public final String getBackText() {
        return this.backText;
    }

    public final String getConfirmationText() {
        return this.confirmationText;
    }

    public final boolean getOriginalValid() {
        return this.originalValid;
    }

    public final List<String> getParagraphs() {
        return this.paragraphs;
    }

    public final String getSuggestedEmail() {
        return this.suggestedEmail;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.originalValid) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.paragraphs), 31, this.backText), 31, this.confirmationText), 31, this.suggestedEmail);
    }

    public String toString() {
        String str = this.title;
        List<String> list = this.paragraphs;
        String str2 = this.backText;
        String str3 = this.confirmationText;
        String str4 = this.suggestedEmail;
        boolean z4 = this.originalValid;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("EmailDialogInfo(title=", str, ", paragraphs=", ", backText=", list);
        AbstractC11266d.m30444B(sbM94766o, str2, ", confirmationText=", str3, ", suggestedEmail=");
        return AbstractC21702c.m61137h(sbM94766o, str4, ", originalValid=", z4, ")");
    }

    public EmailDialogInfo(String title, List<String> paragraphs, String backText, String confirmationText, String suggestedEmail, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(paragraphs, "paragraphs");
        AbstractC22676k.m65750j(backText, "backText");
        AbstractC22676k.m65750j(confirmationText, "confirmationText");
        AbstractC22676k.m65750j(suggestedEmail, "suggestedEmail");
        this.title = title;
        this.paragraphs = paragraphs;
        this.backText = backText;
        this.confirmationText = confirmationText;
        this.suggestedEmail = suggestedEmail;
        this.originalValid = z4;
    }

    public /* synthetic */ EmailDialogInfo(String str, List list, String str2, String str3, String str4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, str3, str4, (i13 & 32) != 0 ? false : z4);
    }
}
