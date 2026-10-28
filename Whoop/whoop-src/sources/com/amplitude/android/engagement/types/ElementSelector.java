package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBO\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/ElementSelector;", "", "", "selector", "text", "tag", "", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/ElementSelector;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/amplitude/android/engagement/types/ElementSelector;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelector", "getText", "getTag", "Ljava/util/Map;", "getAttributes", "Companion", "$serializer", "com/amplitude/android/engagement/types/t", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ElementSelector {
    private static final InterfaceC37138c[] $childSerializers;
    public static final int $stable = 8;
    public static final C4934t Companion = new C4934t();
    private final Map<String, String> attributes;
    private final String selector;
    private final String tag;
    private final String text;

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new InterfaceC37138c[]{null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    @InterfaceC23457c
    public /* synthetic */ ElementSelector(int i13, String str, String str2, String str3, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ElementSelector$$serializer.INSTANCE.getDescriptor());
        }
        this.selector = str;
        this.text = str2;
        this.tag = str3;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ElementSelector copy$default(ElementSelector elementSelector, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = elementSelector.selector;
        }
        if ((i13 & 2) != 0) {
            str2 = elementSelector.text;
        }
        if ((i13 & 4) != 0) {
            str3 = elementSelector.tag;
        }
        if ((i13 & 8) != 0) {
            map = elementSelector.attributes;
        }
        return elementSelector.copy(str, str2, str3, map);
    }

    public static final /* synthetic */ void write$Self(ElementSelector self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.selector);
        output.encodeStringElement(serialDesc, 1, self.text);
        output.encodeStringElement(serialDesc, 2, self.tag);
        output.encodeSerializableElement(serialDesc, 3, interfaceC37138cArr[3], self.attributes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelector() {
        return this.selector;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final Map<String, String> component4() {
        return this.attributes;
    }

    public final ElementSelector copy(String selector, String text, String tag, Map<String, String> attributes) {
        AbstractC22676k.m65750j(selector, "selector");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(attributes, "attributes");
        return new ElementSelector(selector, text, tag, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElementSelector)) {
            return false;
        }
        ElementSelector elementSelector = (ElementSelector) other;
        return AbstractC22676k.m65745e(this.selector, elementSelector.selector) && AbstractC22676k.m65745e(this.text, elementSelector.text) && AbstractC22676k.m65745e(this.tag, elementSelector.tag) && AbstractC22676k.m65745e(this.attributes, elementSelector.attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final String getSelector() {
        return this.selector;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.attributes.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.selector.hashCode() * 31, 31, this.text), 31, this.tag);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("ElementSelector(selector=");
        sb4.append(this.selector);
        sb4.append(", text=");
        sb4.append(this.text);
        sb4.append(", tag=");
        sb4.append(this.tag);
        sb4.append(", attributes=");
        return AbstractC30802r.m94764m(sb4, this.attributes, ')');
    }

    public ElementSelector(String selector, String text, String tag, Map<String, String> attributes) {
        AbstractC22676k.m65750j(selector, "selector");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(attributes, "attributes");
        this.selector = selector;
        this.text = text;
        this.tag = tag;
        this.attributes = attributes;
    }
}
