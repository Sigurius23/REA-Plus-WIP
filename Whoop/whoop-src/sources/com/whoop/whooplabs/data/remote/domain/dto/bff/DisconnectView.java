package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0088\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b>\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\bA\u0010\u0017¨\u0006D"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;", "", "", "title", "body", "positiveCta", "negativeCta", "errorTitle", "errorBody", "errorPositiveCta", "errorNegativeCta", "submittingTitle", "submittingBody", "successText", "successSubtext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getBody", "getPositiveCta", "getNegativeCta", "getErrorTitle", "getErrorBody", "getErrorPositiveCta", "getErrorNegativeCta", "getSubmittingTitle", "getSubmittingBody", "getSuccessText", "getSuccessSubtext", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DisconnectView {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String body;
    private final String errorBody;
    private final String errorNegativeCta;
    private final String errorPositiveCta;
    private final String errorTitle;
    private final String negativeCta;
    private final String positiveCta;
    private final String submittingBody;
    private final String submittingTitle;
    private final String successSubtext;
    private final String successText;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DisconnectView$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DisconnectView(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, DisconnectView$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.body = str2;
        this.positiveCta = str3;
        this.negativeCta = str4;
        this.errorTitle = str5;
        this.errorBody = str6;
        this.errorPositiveCta = str7;
        this.errorNegativeCta = str8;
        this.submittingTitle = str9;
        this.submittingBody = str10;
        this.successText = str11;
        this.successSubtext = str12;
    }

    public static /* synthetic */ DisconnectView copy$default(DisconnectView disconnectView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = disconnectView.title;
        }
        if ((i13 & 2) != 0) {
            str2 = disconnectView.body;
        }
        if ((i13 & 4) != 0) {
            str3 = disconnectView.positiveCta;
        }
        if ((i13 & 8) != 0) {
            str4 = disconnectView.negativeCta;
        }
        if ((i13 & 16) != 0) {
            str5 = disconnectView.errorTitle;
        }
        if ((i13 & 32) != 0) {
            str6 = disconnectView.errorBody;
        }
        if ((i13 & 64) != 0) {
            str7 = disconnectView.errorPositiveCta;
        }
        if ((i13 & 128) != 0) {
            str8 = disconnectView.errorNegativeCta;
        }
        if ((i13 & 256) != 0) {
            str9 = disconnectView.submittingTitle;
        }
        if ((i13 & 512) != 0) {
            str10 = disconnectView.submittingBody;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str11 = disconnectView.successText;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str12 = disconnectView.successSubtext;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return disconnectView.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(DisconnectView self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.body);
        output.encodeStringElement(serialDesc, 2, self.positiveCta);
        output.encodeStringElement(serialDesc, 3, self.negativeCta);
        output.encodeStringElement(serialDesc, 4, self.errorTitle);
        output.encodeStringElement(serialDesc, 5, self.errorBody);
        output.encodeStringElement(serialDesc, 6, self.errorPositiveCta);
        output.encodeStringElement(serialDesc, 7, self.errorNegativeCta);
        output.encodeStringElement(serialDesc, 8, self.submittingTitle);
        output.encodeStringElement(serialDesc, 9, self.submittingBody);
        output.encodeStringElement(serialDesc, 10, self.successText);
        output.encodeStringElement(serialDesc, 11, self.successSubtext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubmittingBody() {
        return this.submittingBody;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSuccessText() {
        return this.successText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSuccessSubtext() {
        return this.successSubtext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPositiveCta() {
        return this.positiveCta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNegativeCta() {
        return this.negativeCta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorBody() {
        return this.errorBody;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getErrorPositiveCta() {
        return this.errorPositiveCta;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getErrorNegativeCta() {
        return this.errorNegativeCta;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSubmittingTitle() {
        return this.submittingTitle;
    }

    public final DisconnectView copy(String title, String body, String positiveCta, String negativeCta, String errorTitle, String errorBody, String errorPositiveCta, String errorNegativeCta, String submittingTitle, String submittingBody, String successText, String successSubtext) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(positiveCta, "positiveCta");
        AbstractC22676k.m65750j(negativeCta, "negativeCta");
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(errorBody, "errorBody");
        AbstractC22676k.m65750j(errorPositiveCta, "errorPositiveCta");
        AbstractC22676k.m65750j(errorNegativeCta, "errorNegativeCta");
        AbstractC22676k.m65750j(submittingTitle, "submittingTitle");
        AbstractC22676k.m65750j(submittingBody, "submittingBody");
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(successSubtext, "successSubtext");
        return new DisconnectView(title, body, positiveCta, negativeCta, errorTitle, errorBody, errorPositiveCta, errorNegativeCta, submittingTitle, submittingBody, successText, successSubtext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisconnectView)) {
            return false;
        }
        DisconnectView disconnectView = (DisconnectView) other;
        return AbstractC22676k.m65745e(this.title, disconnectView.title) && AbstractC22676k.m65745e(this.body, disconnectView.body) && AbstractC22676k.m65745e(this.positiveCta, disconnectView.positiveCta) && AbstractC22676k.m65745e(this.negativeCta, disconnectView.negativeCta) && AbstractC22676k.m65745e(this.errorTitle, disconnectView.errorTitle) && AbstractC22676k.m65745e(this.errorBody, disconnectView.errorBody) && AbstractC22676k.m65745e(this.errorPositiveCta, disconnectView.errorPositiveCta) && AbstractC22676k.m65745e(this.errorNegativeCta, disconnectView.errorNegativeCta) && AbstractC22676k.m65745e(this.submittingTitle, disconnectView.submittingTitle) && AbstractC22676k.m65745e(this.submittingBody, disconnectView.submittingBody) && AbstractC22676k.m65745e(this.successText, disconnectView.successText) && AbstractC22676k.m65745e(this.successSubtext, disconnectView.successSubtext);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getErrorBody() {
        return this.errorBody;
    }

    public final String getErrorNegativeCta() {
        return this.errorNegativeCta;
    }

    public final String getErrorPositiveCta() {
        return this.errorPositiveCta;
    }

    public final String getErrorTitle() {
        return this.errorTitle;
    }

    public final String getNegativeCta() {
        return this.negativeCta;
    }

    public final String getPositiveCta() {
        return this.positiveCta;
    }

    public final String getSubmittingBody() {
        return this.submittingBody;
    }

    public final String getSubmittingTitle() {
        return this.submittingTitle;
    }

    public final String getSuccessSubtext() {
        return this.successSubtext;
    }

    public final String getSuccessText() {
        return this.successText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.successSubtext.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31, this.positiveCta), 31, this.negativeCta), 31, this.errorTitle), 31, this.errorBody), 31, this.errorPositiveCta), 31, this.errorNegativeCta), 31, this.submittingTitle), 31, this.submittingBody), 31, this.successText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        String str3 = this.positiveCta;
        String str4 = this.negativeCta;
        String str5 = this.errorTitle;
        String str6 = this.errorBody;
        String str7 = this.errorPositiveCta;
        String str8 = this.errorNegativeCta;
        String str9 = this.submittingTitle;
        String str10 = this.submittingBody;
        String str11 = this.successText;
        String str12 = this.successSubtext;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DisconnectView(title=", str, ", body=", str2, ", positiveCta=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", negativeCta=", str4, ", errorTitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", errorBody=", str6, ", errorPositiveCta=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", errorNegativeCta=", str8, ", submittingTitle=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", submittingBody=", str10, ", successText=");
        return AbstractC11266d.m30464r(sbM32001t, str11, ", successSubtext=", str12, ")");
    }

    public DisconnectView(String title, String body, String positiveCta, String negativeCta, String errorTitle, String errorBody, String errorPositiveCta, String errorNegativeCta, String submittingTitle, String submittingBody, String successText, String successSubtext) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(positiveCta, "positiveCta");
        AbstractC22676k.m65750j(negativeCta, "negativeCta");
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(errorBody, "errorBody");
        AbstractC22676k.m65750j(errorPositiveCta, "errorPositiveCta");
        AbstractC22676k.m65750j(errorNegativeCta, "errorNegativeCta");
        AbstractC22676k.m65750j(submittingTitle, "submittingTitle");
        AbstractC22676k.m65750j(submittingBody, "submittingBody");
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(successSubtext, "successSubtext");
        this.title = title;
        this.body = body;
        this.positiveCta = positiveCta;
        this.negativeCta = negativeCta;
        this.errorTitle = errorTitle;
        this.errorBody = errorBody;
        this.errorPositiveCta = errorPositiveCta;
        this.errorNegativeCta = errorNegativeCta;
        this.submittingTitle = submittingTitle;
        this.submittingBody = submittingBody;
        this.successText = successText;
        this.successSubtext = successSubtext;
    }
}
