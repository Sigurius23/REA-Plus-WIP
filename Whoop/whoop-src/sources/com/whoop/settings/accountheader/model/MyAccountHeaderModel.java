package com.whoop.settings.accountheader.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u0010\u001f¨\u00065"}, m65681d2 = {"Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;", "", "", "icon", "title", "subtitle", "Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;", "joinCta", "switchCta", "cancelCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$settings_release", "(Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "getSubtitle", "Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;", "getJoinCta", "getSwitchCta", "getCancelCta", "Companion", "$serializer", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MyAccountHeaderModel {

    @SerializedName("cancel_cta")
    private final MyAccountHeaderCtaModel cancelCta;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("join_cta")
    private final MyAccountHeaderCtaModel joinCta;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("switch_cta")
    private final MyAccountHeaderCtaModel switchCta;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;", "serializer", "()Lwc3/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MyAccountHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MyAccountHeaderModel(int i13, String str, String str2, String str3, MyAccountHeaderCtaModel myAccountHeaderCtaModel, MyAccountHeaderCtaModel myAccountHeaderCtaModel2, MyAccountHeaderCtaModel myAccountHeaderCtaModel3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MyAccountHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.title = str2;
        this.subtitle = str3;
        this.joinCta = myAccountHeaderCtaModel;
        this.switchCta = myAccountHeaderCtaModel2;
        this.cancelCta = myAccountHeaderCtaModel3;
    }

    public static /* synthetic */ MyAccountHeaderModel copy$default(MyAccountHeaderModel myAccountHeaderModel, String str, String str2, String str3, MyAccountHeaderCtaModel myAccountHeaderCtaModel, MyAccountHeaderCtaModel myAccountHeaderCtaModel2, MyAccountHeaderCtaModel myAccountHeaderCtaModel3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = myAccountHeaderModel.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = myAccountHeaderModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = myAccountHeaderModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            myAccountHeaderCtaModel = myAccountHeaderModel.joinCta;
        }
        if ((i13 & 16) != 0) {
            myAccountHeaderCtaModel2 = myAccountHeaderModel.switchCta;
        }
        if ((i13 & 32) != 0) {
            myAccountHeaderCtaModel3 = myAccountHeaderModel.cancelCta;
        }
        MyAccountHeaderCtaModel myAccountHeaderCtaModel4 = myAccountHeaderCtaModel2;
        MyAccountHeaderCtaModel myAccountHeaderCtaModel5 = myAccountHeaderCtaModel3;
        return myAccountHeaderModel.copy(str, str2, str3, myAccountHeaderCtaModel, myAccountHeaderCtaModel4, myAccountHeaderCtaModel5);
    }

    public static final /* synthetic */ void write$Self$settings_release(MyAccountHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        MyAccountHeaderCtaModel$$serializer myAccountHeaderCtaModel$$serializer = MyAccountHeaderCtaModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, myAccountHeaderCtaModel$$serializer, self.joinCta);
        output.encodeNullableSerializableElement(serialDesc, 4, myAccountHeaderCtaModel$$serializer, self.switchCta);
        output.encodeSerializableElement(serialDesc, 5, myAccountHeaderCtaModel$$serializer, self.cancelCta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
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
    public final MyAccountHeaderCtaModel getJoinCta() {
        return this.joinCta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MyAccountHeaderCtaModel getSwitchCta() {
        return this.switchCta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MyAccountHeaderCtaModel getCancelCta() {
        return this.cancelCta;
    }

    public final MyAccountHeaderModel copy(String icon, String title, String subtitle, MyAccountHeaderCtaModel joinCta, MyAccountHeaderCtaModel switchCta, MyAccountHeaderCtaModel cancelCta) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(joinCta, "joinCta");
        AbstractC22676k.m65750j(cancelCta, "cancelCta");
        return new MyAccountHeaderModel(icon, title, subtitle, joinCta, switchCta, cancelCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyAccountHeaderModel)) {
            return false;
        }
        MyAccountHeaderModel myAccountHeaderModel = (MyAccountHeaderModel) other;
        return AbstractC22676k.m65745e(this.icon, myAccountHeaderModel.icon) && AbstractC22676k.m65745e(this.title, myAccountHeaderModel.title) && AbstractC22676k.m65745e(this.subtitle, myAccountHeaderModel.subtitle) && AbstractC22676k.m65745e(this.joinCta, myAccountHeaderModel.joinCta) && AbstractC22676k.m65745e(this.switchCta, myAccountHeaderModel.switchCta) && AbstractC22676k.m65745e(this.cancelCta, myAccountHeaderModel.cancelCta);
    }

    public final MyAccountHeaderCtaModel getCancelCta() {
        return this.cancelCta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final MyAccountHeaderCtaModel getJoinCta() {
        return this.joinCta;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final MyAccountHeaderCtaModel getSwitchCta() {
        return this.switchCta;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.joinCta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31;
        MyAccountHeaderCtaModel myAccountHeaderCtaModel = this.switchCta;
        return this.cancelCta.hashCode() + ((iHashCode + (myAccountHeaderCtaModel == null ? 0 : myAccountHeaderCtaModel.hashCode())) * 31);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.subtitle;
        MyAccountHeaderCtaModel myAccountHeaderCtaModel = this.joinCta;
        MyAccountHeaderCtaModel myAccountHeaderCtaModel2 = this.switchCta;
        MyAccountHeaderCtaModel myAccountHeaderCtaModel3 = this.cancelCta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MyAccountHeaderModel(icon=", str, ", title=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", joinCta=");
        sbM32001t.append(myAccountHeaderCtaModel);
        sbM32001t.append(", switchCta=");
        sbM32001t.append(myAccountHeaderCtaModel2);
        sbM32001t.append(", cancelCta=");
        sbM32001t.append(myAccountHeaderCtaModel3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MyAccountHeaderModel(String icon, String title, String subtitle, MyAccountHeaderCtaModel joinCta, MyAccountHeaderCtaModel myAccountHeaderCtaModel, MyAccountHeaderCtaModel cancelCta) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(joinCta, "joinCta");
        AbstractC22676k.m65750j(cancelCta, "cancelCta");
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.joinCta = joinCta;
        this.switchCta = myAccountHeaderCtaModel;
        this.cancelCta = cancelCta;
    }
}
