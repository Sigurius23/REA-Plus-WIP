package com.whoop.sleep.coach.data.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ4\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/VowDto;", "", "", "header", "key", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/VowDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/sleep/coach/data/network/model/Vow;", "toVow", "()Lcom/whoop/sleep/coach/data/network/model/Vow;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/VowDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getKey", "getText", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VowDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("header")
    private final String header;

    @SerializedName("key")
    private final String key;

    @SerializedName("text")
    private final String text;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/VowDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/VowDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VowDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VowDto(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, VowDto$$serializer.INSTANCE.getDescriptor());
        }
        this.header = str;
        this.key = str2;
        this.text = str3;
    }

    public static /* synthetic */ VowDto copy$default(VowDto vowDto, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = vowDto.header;
        }
        if ((i13 & 2) != 0) {
            str2 = vowDto.key;
        }
        if ((i13 & 4) != 0) {
            str3 = vowDto.text;
        }
        return vowDto.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(VowDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.header);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.key);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final VowDto copy(String header, String key, String text) {
        return new VowDto(header, key, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VowDto)) {
            return false;
        }
        VowDto vowDto = (VowDto) other;
        return AbstractC22676k.m65745e(this.header, vowDto.header) && AbstractC22676k.m65745e(this.key, vowDto.key) && AbstractC22676k.m65745e(this.text, vowDto.text);
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.text, ")", AbstractC11895b.m32001t("VowDto(header=", this.header, ", key=", this.key, ", text="));
    }

    public final Vow toVow() {
        String str = this.header;
        String str2 = this.key;
        AbstractC22676k.m65747g(str2);
        String str3 = this.text;
        AbstractC22676k.m65747g(str3);
        return new Vow(str, str2, str3);
    }

    public VowDto(String str, String str2, String str3) {
        this.header = str;
        this.key = str2;
        this.text = str3;
    }
}
