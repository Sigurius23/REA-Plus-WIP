package com.whoop.design.models.colortheme;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import v40.C35652d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, m65681d2 = {"Lcom/whoop/design/models/colortheme/ColorValueModel;", "", "Ly81/f;", "token", "", "hex", "<init>", "(Ly81/f;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILy81/f;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/colortheme/ColorValueModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ly81/f;", "component2", "()Ljava/lang/String;", "copy", "(Ly81/f;Ljava/lang/String;)Lcom/whoop/design/models/colortheme/ColorValueModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly81/f;", "getToken", "Ljava/lang/String;", "getHex", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ColorValueModel {
    public static final int $stable = 0;
    private final String hex;
    private final EnumC39333f token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35652d(21)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/colortheme/ColorValueModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/colortheme/ColorValueModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ColorValueModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ColorValueModel() {
        this((EnumC39333f) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    public static /* synthetic */ ColorValueModel copy$default(ColorValueModel colorValueModel, EnumC39333f enumC39333f, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC39333f = colorValueModel.token;
        }
        if ((i13 & 2) != 0) {
            str = colorValueModel.hex;
        }
        return colorValueModel.copy(enumC39333f, str);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ColorValueModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.token != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.token);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.hex == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.hex);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC39333f getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHex() {
        return this.hex;
    }

    public final ColorValueModel copy(EnumC39333f token, String hex) {
        return new ColorValueModel(token, hex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorValueModel)) {
            return false;
        }
        ColorValueModel colorValueModel = (ColorValueModel) other;
        return this.token == colorValueModel.token && AbstractC22676k.m65745e(this.hex, colorValueModel.hex);
    }

    public final String getHex() {
        return this.hex;
    }

    public final EnumC39333f getToken() {
        return this.token;
    }

    public int hashCode() {
        EnumC39333f enumC39333f = this.token;
        int iHashCode = (enumC39333f == null ? 0 : enumC39333f.hashCode()) * 31;
        String str = this.hex;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ColorValueModel(token=" + this.token + ", hex=" + this.hex + ")";
    }

    public /* synthetic */ ColorValueModel(int i13, EnumC39333f enumC39333f, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.token = null;
        } else {
            this.token = enumC39333f;
        }
        if ((i13 & 2) == 0) {
            this.hex = null;
        } else {
            this.hex = str;
        }
    }

    public ColorValueModel(EnumC39333f enumC39333f, String str) {
        this.token = enumC39333f;
        this.hex = str;
    }

    public /* synthetic */ ColorValueModel(EnumC39333f enumC39333f, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC39333f, (i13 & 2) != 0 ? null : str);
    }
}
