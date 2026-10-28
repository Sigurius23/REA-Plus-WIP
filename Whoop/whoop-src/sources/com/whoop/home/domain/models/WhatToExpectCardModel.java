package com.whoop.home.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JB\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010#¨\u0006;"}, m65681d2 = {"Lcom/whoop/home/domain/models/WhatToExpectCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "body", "Lcom/whoop/home/domain/models/DailyProgressModel;", "dailyProgress", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/WhatToExpectCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lgz0/m0;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "()Lcom/whoop/home/domain/models/DailyProgressModel;", "component5", "()Lcom/whoop/navigation/e;", "copy", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/home/domain/models/DailyProgressModel;Lcom/whoop/navigation/e;)Lcom/whoop/home/domain/models/WhatToExpectCardModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "getIcon", "Lcom/whoop/design/util/TextResource;", "getTitle", "getBody", "Lcom/whoop/home/domain/models/DailyProgressModel;", "getDailyProgress", "Lcom/whoop/navigation/e;", "getNavigation", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhatToExpectCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TextResource body;
    private final DailyProgressModel dailyProgress;
    private final EnumC16313m0 icon;
    private final C9598e navigation;
    private final TextResource title;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/WhatToExpectCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/WhatToExpectCardModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhatToExpectCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14 | i14;
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C39434a(25)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C39434a(26))};
    }

    public /* synthetic */ WhatToExpectCardModel(int i13, EnumC16313m0 enumC16313m0, TextResource textResource, TextResource textResource2, DailyProgressModel dailyProgressModel, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, WhatToExpectCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = enumC16313m0;
        this.title = textResource;
        this.body = textResource2;
        this.dailyProgress = dailyProgressModel;
        this.navigation = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ WhatToExpectCardModel copy$default(WhatToExpectCardModel whatToExpectCardModel, EnumC16313m0 enumC16313m0, TextResource textResource, TextResource textResource2, DailyProgressModel dailyProgressModel, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = whatToExpectCardModel.icon;
        }
        if ((i13 & 2) != 0) {
            textResource = whatToExpectCardModel.title;
        }
        if ((i13 & 4) != 0) {
            textResource2 = whatToExpectCardModel.body;
        }
        if ((i13 & 8) != 0) {
            dailyProgressModel = whatToExpectCardModel.dailyProgress;
        }
        if ((i13 & 16) != 0) {
            c9598e = whatToExpectCardModel.navigation;
        }
        C9598e c9598e2 = c9598e;
        TextResource textResource3 = textResource2;
        return whatToExpectCardModel.copy(enumC16313m0, textResource, textResource3, dailyProgressModel, c9598e2);
    }

    public static final /* synthetic */ void write$Self$home_release(WhatToExpectCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.icon);
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.body);
        output.encodeSerializableElement(serialDesc, 3, DailyProgressModel$$serializer.INSTANCE, self.dailyProgress);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.navigation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DailyProgressModel getDailyProgress() {
        return this.dailyProgress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final WhatToExpectCardModel copy(EnumC16313m0 icon, TextResource title, TextResource body, DailyProgressModel dailyProgress, C9598e navigation) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(dailyProgress, "dailyProgress");
        AbstractC22676k.m65750j(navigation, "navigation");
        return new WhatToExpectCardModel(icon, title, body, dailyProgress, navigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhatToExpectCardModel)) {
            return false;
        }
        WhatToExpectCardModel whatToExpectCardModel = (WhatToExpectCardModel) other;
        return this.icon == whatToExpectCardModel.icon && AbstractC22676k.m65745e(this.title, whatToExpectCardModel.title) && AbstractC22676k.m65745e(this.body, whatToExpectCardModel.body) && AbstractC22676k.m65745e(this.dailyProgress, whatToExpectCardModel.dailyProgress) && AbstractC22676k.m65745e(this.navigation, whatToExpectCardModel.navigation);
    }

    public final TextResource getBody() {
        return this.body;
    }

    public final DailyProgressModel getDailyProgress() {
        return this.dailyProgress;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.navigation.hashCode() + ((this.dailyProgress.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.icon.hashCode() * 31, this.title, 31), this.body, 31)) * 31);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.body;
        DailyProgressModel dailyProgressModel = this.dailyProgress;
        C9598e c9598e = this.navigation;
        StringBuilder sb4 = new StringBuilder("WhatToExpectCardModel(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", body=");
        sb4.append(textResource2);
        sb4.append(", dailyProgress=");
        sb4.append(dailyProgressModel);
        sb4.append(", navigation=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public WhatToExpectCardModel(EnumC16313m0 icon, TextResource title, TextResource body, DailyProgressModel dailyProgress, C9598e navigation) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(dailyProgress, "dailyProgress");
        AbstractC22676k.m65750j(navigation, "navigation");
        this.icon = icon;
        this.title = title;
        this.body = body;
        this.dailyProgress = dailyProgress;
        this.navigation = navigation;
    }
}
