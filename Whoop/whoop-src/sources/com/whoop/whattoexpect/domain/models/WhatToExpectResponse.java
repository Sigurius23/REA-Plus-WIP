package com.whoop.whattoexpect.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import jp1.C21864p;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "title", "subtitle", "Lcom/whoop/whattoexpect/domain/models/DailyProgress;", "dailyProgress", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;", "progressIndicator", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Ljava/util/List;Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Ljava/util/List;Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$what_to_expect_release", "(Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Lcom/whoop/whattoexpect/domain/models/DailyProgress;", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Ljava/util/List;Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;)Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getToolbarTitle", "getTitle", "getSubtitle", "Lcom/whoop/whattoexpect/domain/models/DailyProgress;", "getDailyProgress", "Ljava/util/List;", "getItems", "Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;", "getProgressIndicator", "Companion", "$serializer", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhatToExpectResponse {
    private final DailyProgress dailyProgress;
    private final List<DesignSystemModel> items;
    private final ProgressIndicator progressIndicator;
    private final TextResource subtitle;
    private final TextResource title;
    private final TextResource toolbarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21864p(29)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;", "serializer", "()Lwc3/c;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhatToExpectResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WhatToExpectResponse(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, DailyProgress dailyProgress, List list, ProgressIndicator progressIndicator, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, WhatToExpectResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.toolbarTitle = textResource;
        this.title = textResource2;
        this.subtitle = textResource3;
        this.dailyProgress = dailyProgress;
        this.items = list;
        if ((i13 & 32) == 0) {
            this.progressIndicator = null;
        } else {
            this.progressIndicator = progressIndicator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhatToExpectResponse copy$default(WhatToExpectResponse whatToExpectResponse, TextResource textResource, TextResource textResource2, TextResource textResource3, DailyProgress dailyProgress, List list, ProgressIndicator progressIndicator, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = whatToExpectResponse.toolbarTitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = whatToExpectResponse.title;
        }
        if ((i13 & 4) != 0) {
            textResource3 = whatToExpectResponse.subtitle;
        }
        if ((i13 & 8) != 0) {
            dailyProgress = whatToExpectResponse.dailyProgress;
        }
        if ((i13 & 16) != 0) {
            list = whatToExpectResponse.items;
        }
        if ((i13 & 32) != 0) {
            progressIndicator = whatToExpectResponse.progressIndicator;
        }
        List list2 = list;
        ProgressIndicator progressIndicator2 = progressIndicator;
        return whatToExpectResponse.copy(textResource, textResource2, textResource3, dailyProgress, list2, progressIndicator2);
    }

    public static final /* synthetic */ void write$Self$what_to_expect_release(WhatToExpectResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.toolbarTitle);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, DailyProgress$$serializer.INSTANCE, self.dailyProgress);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.items);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.progressIndicator == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, ProgressIndicator$$serializer.INSTANCE, self.progressIndicator);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DailyProgress getDailyProgress() {
        return this.dailyProgress;
    }

    public final List<DesignSystemModel> component5() {
        return this.items;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProgressIndicator getProgressIndicator() {
        return this.progressIndicator;
    }

    public final WhatToExpectResponse copy(TextResource toolbarTitle, TextResource title, TextResource subtitle, DailyProgress dailyProgress, List<? extends DesignSystemModel> items, ProgressIndicator progressIndicator) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(items, "items");
        return new WhatToExpectResponse(toolbarTitle, title, subtitle, dailyProgress, items, progressIndicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhatToExpectResponse)) {
            return false;
        }
        WhatToExpectResponse whatToExpectResponse = (WhatToExpectResponse) other;
        return AbstractC22676k.m65745e(this.toolbarTitle, whatToExpectResponse.toolbarTitle) && AbstractC22676k.m65745e(this.title, whatToExpectResponse.title) && AbstractC22676k.m65745e(this.subtitle, whatToExpectResponse.subtitle) && AbstractC22676k.m65745e(this.dailyProgress, whatToExpectResponse.dailyProgress) && AbstractC22676k.m65745e(this.items, whatToExpectResponse.items) && AbstractC22676k.m65745e(this.progressIndicator, whatToExpectResponse.progressIndicator);
    }

    public final DailyProgress getDailyProgress() {
        return this.dailyProgress;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final ProgressIndicator getProgressIndicator() {
        return this.progressIndicator;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final TextResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.toolbarTitle.hashCode() * 31, this.title, 31), this.subtitle, 31);
        DailyProgress dailyProgress = this.dailyProgress;
        int iM31983b = AbstractC11895b.m31983b((iM95625a + (dailyProgress == null ? 0 : dailyProgress.hashCode())) * 31, 31, this.items);
        ProgressIndicator progressIndicator = this.progressIndicator;
        return iM31983b + (progressIndicator != null ? progressIndicator.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.toolbarTitle;
        TextResource textResource2 = this.title;
        TextResource textResource3 = this.subtitle;
        DailyProgress dailyProgress = this.dailyProgress;
        List<DesignSystemModel> list = this.items;
        ProgressIndicator progressIndicator = this.progressIndicator;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("WhatToExpectResponse(toolbarTitle=", textResource, ", title=", textResource2, ", subtitle=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", dailyProgress=");
        sbM106658q.append(dailyProgress);
        sbM106658q.append(", items=");
        sbM106658q.append(list);
        sbM106658q.append(", progressIndicator=");
        sbM106658q.append(progressIndicator);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WhatToExpectResponse(TextResource toolbarTitle, TextResource title, TextResource subtitle, DailyProgress dailyProgress, List<? extends DesignSystemModel> items, ProgressIndicator progressIndicator) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(items, "items");
        this.toolbarTitle = toolbarTitle;
        this.title = title;
        this.subtitle = subtitle;
        this.dailyProgress = dailyProgress;
        this.items = items;
        this.progressIndicator = progressIndicator;
    }

    public /* synthetic */ WhatToExpectResponse(TextResource textResource, TextResource textResource2, TextResource textResource3, DailyProgress dailyProgress, List list, ProgressIndicator progressIndicator, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, textResource3, dailyProgress, list, (i13 & 32) != 0 ? null : progressIndicator);
    }
}
