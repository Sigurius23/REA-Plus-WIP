package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0018¨\u00062"}, m65681d2 = {"Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "", "", "title", "body", "buttonText", "dismissText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getBody", "getBody$annotations", "getButtonText", "getButtonText$annotations", "getDismissText", "getDismissText$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OnboardingDismissDialog {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("body_display")
    private final String body;

    @SerializedName("button_text_display")
    private final String buttonText;

    @SerializedName("dismiss_text_display")
    private final String dismissText;

    @SerializedName("title_display")
    private final String title;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.OnboardingDismissDialog$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/OnboardingDismissDialog$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OnboardingDismissDialog$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OnboardingDismissDialog(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, OnboardingDismissDialog$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.body = str2;
        this.buttonText = str3;
        this.dismissText = str4;
    }

    public static /* synthetic */ OnboardingDismissDialog copy$default(OnboardingDismissDialog onboardingDismissDialog, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = onboardingDismissDialog.title;
        }
        if ((i13 & 2) != 0) {
            str2 = onboardingDismissDialog.body;
        }
        if ((i13 & 4) != 0) {
            str3 = onboardingDismissDialog.buttonText;
        }
        if ((i13 & 8) != 0) {
            str4 = onboardingDismissDialog.dismissText;
        }
        return onboardingDismissDialog.copy(str, str2, str3, str4);
    }

    @InterfaceC37143h("body_display")
    public static /* synthetic */ void getBody$annotations() {
    }

    @InterfaceC37143h("button_text_display")
    public static /* synthetic */ void getButtonText$annotations() {
    }

    @InterfaceC37143h("dismiss_text_display")
    public static /* synthetic */ void getDismissText$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(OnboardingDismissDialog self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.body);
        output.encodeStringElement(serialDesc, 2, self.buttonText);
        output.encodeStringElement(serialDesc, 3, self.dismissText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDismissText() {
        return this.dismissText;
    }

    public final OnboardingDismissDialog copy(String title, String body, String buttonText, String dismissText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(dismissText, "dismissText");
        return new OnboardingDismissDialog(title, body, buttonText, dismissText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingDismissDialog)) {
            return false;
        }
        OnboardingDismissDialog onboardingDismissDialog = (OnboardingDismissDialog) other;
        return AbstractC22676k.m65745e(this.title, onboardingDismissDialog.title) && AbstractC22676k.m65745e(this.body, onboardingDismissDialog.body) && AbstractC22676k.m65745e(this.buttonText, onboardingDismissDialog.buttonText) && AbstractC22676k.m65745e(this.dismissText, onboardingDismissDialog.dismissText);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDismissText() {
        return this.dismissText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.dismissText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31, this.buttonText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("OnboardingDismissDialog(title=", str, ", body=", str2, ", buttonText="), this.buttonText, ", dismissText=", this.dismissText, ")");
    }

    public OnboardingDismissDialog(String title, String body, String buttonText, String dismissText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(dismissText, "dismissText");
        this.title = title;
        this.body = body;
        this.buttonText = buttonText;
        this.dismissText = dismissText;
    }
}
