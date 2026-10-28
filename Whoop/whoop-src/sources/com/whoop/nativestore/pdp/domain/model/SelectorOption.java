package com.whoop.nativestore.pdp.domain.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;", "", "", "key", "content", "label", "", "hasStock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getContent", "getLabel", "Z", "getHasStock", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SelectorOption {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String content;
    private final boolean hasStock;
    private final String key;
    private final String label;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.SelectorOption$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/SelectorOption$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SelectorOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SelectorOption() {
        this((String) null, (String) null, (String) null, false, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SelectorOption copy$default(SelectorOption selectorOption, String str, String str2, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = selectorOption.key;
        }
        if ((i13 & 2) != 0) {
            str2 = selectorOption.content;
        }
        if ((i13 & 4) != 0) {
            str3 = selectorOption.label;
        }
        if ((i13 & 8) != 0) {
            z4 = selectorOption.hasStock;
        }
        return selectorOption.copy(str, str2, str3, z4);
    }

    public static final /* synthetic */ void write$Self$native_store_release(SelectorOption self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.key, "")) {
            output.encodeStringElement(serialDesc, 0, self.key);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.content, "")) {
            output.encodeStringElement(serialDesc, 1, self.content);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.label, "")) {
            output.encodeStringElement(serialDesc, 2, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.hasStock) {
            output.encodeBooleanElement(serialDesc, 3, self.hasStock);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasStock() {
        return this.hasStock;
    }

    public final SelectorOption copy(String key, String content, String label, boolean hasStock) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(label, "label");
        return new SelectorOption(key, content, label, hasStock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectorOption)) {
            return false;
        }
        SelectorOption selectorOption = (SelectorOption) other;
        return AbstractC22676k.m65745e(this.key, selectorOption.key) && AbstractC22676k.m65745e(this.content, selectorOption.content) && AbstractC22676k.m65745e(this.label, selectorOption.label) && this.hasStock == selectorOption.hasStock;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean getHasStock() {
        return this.hasStock;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasStock) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.key.hashCode() * 31, 31, this.content), 31, this.label);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.content;
        return AbstractC21702c.m61137h(AbstractC11895b.m32001t("SelectorOption(key=", str, ", content=", str2, ", label="), this.label, ", hasStock=", this.hasStock, ")");
    }

    public /* synthetic */ SelectorOption(int i13, String str, String str2, String str3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.key = "";
        } else {
            this.key = str;
        }
        if ((i13 & 2) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i13 & 4) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i13 & 8) == 0) {
            this.hasStock = false;
        } else {
            this.hasStock = z4;
        }
    }

    public SelectorOption(String key, String content, String label, boolean z4) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(label, "label");
        this.key = key;
        this.content = content;
        this.label = label;
        this.hasStock = z4;
    }

    public /* synthetic */ SelectorOption(String str, String str2, String str3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? false : z4);
    }
}
