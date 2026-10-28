package com.whoop.whattoexpect.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jp1.C21864p;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;", "", "", "title", "body", "icon", "Lcom/whoop/whattoexpect/domain/models/CtaLocation;", "ctaLocation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whattoexpect/domain/models/CtaLocation;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whattoexpect/domain/models/CtaLocation;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$what_to_expect_release", "(Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/whattoexpect/domain/models/CtaLocation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whattoexpect/domain/models/CtaLocation;)Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getBody", "getIcon", "Lcom/whoop/whattoexpect/domain/models/CtaLocation;", "getCtaLocation", "Companion", "$serializer", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhatToExpectEntryPointResponse {
    public static final int $stable = 0;
    private final String body;
    private final CtaLocation ctaLocation;
    private final String icon;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21864p(28))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;", "serializer", "()Lwc3/c;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhatToExpectEntryPointResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WhatToExpectEntryPointResponse(int i13, String str, String str2, String str3, CtaLocation ctaLocation, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, WhatToExpectEntryPointResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.body = str2;
        this.icon = str3;
        this.ctaLocation = ctaLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return CtaLocation.INSTANCE.serializer();
    }

    public static /* synthetic */ WhatToExpectEntryPointResponse copy$default(WhatToExpectEntryPointResponse whatToExpectEntryPointResponse, String str, String str2, String str3, CtaLocation ctaLocation, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = whatToExpectEntryPointResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = whatToExpectEntryPointResponse.body;
        }
        if ((i13 & 4) != 0) {
            str3 = whatToExpectEntryPointResponse.icon;
        }
        if ((i13 & 8) != 0) {
            ctaLocation = whatToExpectEntryPointResponse.ctaLocation;
        }
        return whatToExpectEntryPointResponse.copy(str, str2, str3, ctaLocation);
    }

    public static final /* synthetic */ void write$Self$what_to_expect_release(WhatToExpectEntryPointResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.body);
        output.encodeStringElement(serialDesc, 2, self.icon);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.ctaLocation);
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
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CtaLocation getCtaLocation() {
        return this.ctaLocation;
    }

    public final WhatToExpectEntryPointResponse copy(String title, String body, String icon, CtaLocation ctaLocation) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(ctaLocation, "ctaLocation");
        return new WhatToExpectEntryPointResponse(title, body, icon, ctaLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhatToExpectEntryPointResponse)) {
            return false;
        }
        WhatToExpectEntryPointResponse whatToExpectEntryPointResponse = (WhatToExpectEntryPointResponse) other;
        return AbstractC22676k.m65745e(this.title, whatToExpectEntryPointResponse.title) && AbstractC22676k.m65745e(this.body, whatToExpectEntryPointResponse.body) && AbstractC22676k.m65745e(this.icon, whatToExpectEntryPointResponse.icon) && this.ctaLocation == whatToExpectEntryPointResponse.ctaLocation;
    }

    public final String getBody() {
        return this.body;
    }

    public final CtaLocation getCtaLocation() {
        return this.ctaLocation;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.body;
        return this.ctaLocation.hashCode() + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        String str3 = this.icon;
        CtaLocation ctaLocation = this.ctaLocation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WhatToExpectEntryPointResponse(title=", str, ", body=", str2, ", icon=");
        sbM32001t.append(str3);
        sbM32001t.append(", ctaLocation=");
        sbM32001t.append(ctaLocation);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public WhatToExpectEntryPointResponse(String title, String str, String icon, CtaLocation ctaLocation) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(ctaLocation, "ctaLocation");
        this.title = title;
        this.body = str;
        this.icon = icon;
        this.ctaLocation = ctaLocation;
    }
}
