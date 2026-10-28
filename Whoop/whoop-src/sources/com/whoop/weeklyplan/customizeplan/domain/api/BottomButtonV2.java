package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.design.models.modal.C8527a;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButtonV2;", "", "", "icon", "titleDisplay", "Lcom/whoop/navigation/e;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButtonV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButtonV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitleDisplay", "Lcom/whoop/navigation/e;", "getAction", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BottomButtonV2 {
    private final C9598e action;
    private final String icon;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C8527a(19))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButtonV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButtonV2;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BottomButtonV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BottomButtonV2(int i13, String str, String str2, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, BottomButtonV2$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.titleDisplay = str2;
        this.action = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ BottomButtonV2 copy$default(BottomButtonV2 bottomButtonV2, String str, String str2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bottomButtonV2.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = bottomButtonV2.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            c9598e = bottomButtonV2.action;
        }
        return bottomButtonV2.copy(str, str2, c9598e);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(BottomButtonV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.action);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getAction() {
        return this.action;
    }

    public final BottomButtonV2 copy(String icon, String titleDisplay, C9598e action) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        return new BottomButtonV2(icon, titleDisplay, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomButtonV2)) {
            return false;
        }
        BottomButtonV2 bottomButtonV2 = (BottomButtonV2) other;
        return AbstractC22676k.m65745e(this.icon, bottomButtonV2.icon) && AbstractC22676k.m65745e(this.titleDisplay, bottomButtonV2.titleDisplay) && AbstractC22676k.m65745e(this.action, bottomButtonV2.action);
    }

    public final C9598e getAction() {
        return this.action;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.titleDisplay);
        C9598e c9598e = this.action;
        return iM30450d + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.titleDisplay;
        return AbstractC33745d.m106656o(AbstractC11895b.m32001t("BottomButtonV2(icon=", str, ", titleDisplay=", str2, ", action="), this.action, ")");
    }

    public BottomButtonV2(String icon, String titleDisplay, C9598e c9598e) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        this.icon = icon;
        this.titleDisplay = titleDisplay;
        this.action = c9598e;
    }
}
