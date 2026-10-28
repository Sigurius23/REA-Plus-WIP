package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0019¨\u00061"}, m65681d2 = {"Lcom/whoop/navigation/CheckoutWithCartScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "path", "Lcom/whoop/navigation/CheckoutWithCartPayload;", "payload", "source", "method", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/CheckoutWithCartPayload;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/CheckoutWithCartPayload;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/CheckoutWithCartScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/CheckoutWithCartPayload;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/CheckoutWithCartPayload;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/CheckoutWithCartScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Lcom/whoop/navigation/CheckoutWithCartPayload;", "getPayload", "getSource", "getMethod", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CheckoutWithCartScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String method;
    private final String path;
    private final CheckoutWithCartPayload payload;
    private final String source;

    /* JADX INFO: renamed from: com.whoop.navigation.CheckoutWithCartScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/CheckoutWithCartScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/CheckoutWithCartScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CheckoutWithCartScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CheckoutWithCartScreenModel(int i13, String str, CheckoutWithCartPayload checkoutWithCartPayload, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CheckoutWithCartScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        this.payload = checkoutWithCartPayload;
        this.source = str2;
        this.method = str3;
    }

    public static /* synthetic */ CheckoutWithCartScreenModel copy$default(CheckoutWithCartScreenModel checkoutWithCartScreenModel, String str, CheckoutWithCartPayload checkoutWithCartPayload, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = checkoutWithCartScreenModel.path;
        }
        if ((i13 & 2) != 0) {
            checkoutWithCartPayload = checkoutWithCartScreenModel.payload;
        }
        if ((i13 & 4) != 0) {
            str2 = checkoutWithCartScreenModel.source;
        }
        if ((i13 & 8) != 0) {
            str3 = checkoutWithCartScreenModel.method;
        }
        return checkoutWithCartScreenModel.copy(str, checkoutWithCartPayload, str2, str3);
    }

    public static final /* synthetic */ void write$Self$navigation_release(CheckoutWithCartScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.path);
        output.encodeNullableSerializableElement(serialDesc, 1, CheckoutWithCartPayload$$serializer.INSTANCE, self.payload);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.source);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.method);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CheckoutWithCartPayload getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final CheckoutWithCartScreenModel copy(String path, CheckoutWithCartPayload payload, String source, String method) {
        AbstractC22676k.m65750j(path, "path");
        return new CheckoutWithCartScreenModel(path, payload, source, method);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutWithCartScreenModel)) {
            return false;
        }
        CheckoutWithCartScreenModel checkoutWithCartScreenModel = (CheckoutWithCartScreenModel) other;
        return AbstractC22676k.m65745e(this.path, checkoutWithCartScreenModel.path) && AbstractC22676k.m65745e(this.payload, checkoutWithCartScreenModel.payload) && AbstractC22676k.m65745e(this.source, checkoutWithCartScreenModel.source) && AbstractC22676k.m65745e(this.method, checkoutWithCartScreenModel.method);
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getPath() {
        return this.path;
    }

    public final CheckoutWithCartPayload getPayload() {
        return this.payload;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        CheckoutWithCartPayload checkoutWithCartPayload = this.payload;
        int iHashCode2 = (iHashCode + (checkoutWithCartPayload == null ? 0 : checkoutWithCartPayload.hashCode())) * 31;
        String str = this.source;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.method;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        CheckoutWithCartPayload checkoutWithCartPayload = this.payload;
        String str2 = this.source;
        String str3 = this.method;
        StringBuilder sb4 = new StringBuilder("CheckoutWithCartScreenModel(path=");
        sb4.append(str);
        sb4.append(", payload=");
        sb4.append(checkoutWithCartPayload);
        sb4.append(", source=");
        return AbstractC11266d.m30464r(sb4, str2, ", method=", str3, ")");
    }

    public CheckoutWithCartScreenModel(String path, CheckoutWithCartPayload checkoutWithCartPayload, String str, String str2) {
        AbstractC22676k.m65750j(path, "path");
        this.path = path;
        this.payload = checkoutWithCartPayload;
        this.source = str;
        this.method = str2;
    }
}
