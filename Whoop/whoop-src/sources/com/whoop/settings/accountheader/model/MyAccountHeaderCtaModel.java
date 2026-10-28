package com.whoop.settings.accountheader.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p719m22.C24958m;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, m65681d2 = {"Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;", "", "", "text", "Lcom/whoop/navigation/e;", "destination", "tracking", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$settings_release", "(Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/e;", "component3", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lcom/whoop/navigation/e;", "getDestination", "getTracking", "Companion", "$serializer", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MyAccountHeaderCtaModel {

    @SerializedName("destination")
    private final C9598e destination;

    @SerializedName("text")
    private final String text;

    @SerializedName("tracking")
    private final String tracking;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24958m(14)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;", "serializer", "()Lwc3/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MyAccountHeaderCtaModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MyAccountHeaderCtaModel(int i13, String str, C9598e c9598e, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, MyAccountHeaderCtaModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.destination = c9598e;
        this.tracking = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ MyAccountHeaderCtaModel copy$default(MyAccountHeaderCtaModel myAccountHeaderCtaModel, String str, C9598e c9598e, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = myAccountHeaderCtaModel.text;
        }
        if ((i13 & 2) != 0) {
            c9598e = myAccountHeaderCtaModel.destination;
        }
        if ((i13 & 4) != 0) {
            str2 = myAccountHeaderCtaModel.tracking;
        }
        return myAccountHeaderCtaModel.copy(str, c9598e, str2);
    }

    public static final /* synthetic */ void write$Self$settings_release(MyAccountHeaderCtaModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.text);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.destination);
        output.encodeStringElement(serialDesc, 2, self.tracking);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTracking() {
        return this.tracking;
    }

    public final MyAccountHeaderCtaModel copy(String text, C9598e destination, String tracking) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(tracking, "tracking");
        return new MyAccountHeaderCtaModel(text, destination, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyAccountHeaderCtaModel)) {
            return false;
        }
        MyAccountHeaderCtaModel myAccountHeaderCtaModel = (MyAccountHeaderCtaModel) other;
        return AbstractC22676k.m65745e(this.text, myAccountHeaderCtaModel.text) && AbstractC22676k.m65745e(this.destination, myAccountHeaderCtaModel.destination) && AbstractC22676k.m65745e(this.tracking, myAccountHeaderCtaModel.tracking);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        C9598e c9598e = this.destination;
        return this.tracking.hashCode() + ((iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31);
    }

    public String toString() {
        String str = this.text;
        C9598e c9598e = this.destination;
        String str2 = this.tracking;
        StringBuilder sb4 = new StringBuilder("MyAccountHeaderCtaModel(text=");
        sb4.append(str);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", tracking=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public MyAccountHeaderCtaModel(String text, C9598e c9598e, String tracking) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(tracking, "tracking");
        this.text = text;
        this.destination = c9598e;
        this.tracking = tracking;
    }
}
