package com.whoop.advancedlabs.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b8\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b9\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010%¨\u0006>"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;", "", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "title", "icon", "description", "Lcom/whoop/design/models/modal/AnyModal;", "dialog", "<init>", "(Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/AnyModal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/AnyModal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/e;", "component2", "()Lcom/whoop/whoopaction/domain/models/Action;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/whoop/design/models/modal/AnyModal;", "copy", "(Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/e;", "getNavigation", "getNavigation$annotations", "()V", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "getAction$annotations", "Ljava/lang/String;", "getTitle", "getIcon", "getDescription", "Lcom/whoop/design/models/modal/AnyModal;", "getDialog", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestResultBottomSheetItem {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private final String description;
    private final AnyModal dialog;
    private final String icon;
    private final C9598e navigation;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestResultBottomSheetItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C33691b(4)), AbstractC30060g.m92087G(enumC23463i, new C33691b(5)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33691b(6))};
    }

    public /* synthetic */ TestResultBottomSheetItem(int i13, C9598e c9598e, Action action, String str, String str2, String str3, AnyModal anyModal, SerializationConstructorMarker serializationConstructorMarker) {
        if (60 != (i13 & 60)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 60, TestResultBottomSheetItem$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.navigation = null;
        } else {
            this.navigation = c9598e;
        }
        if ((i13 & 2) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        this.title = str;
        this.icon = str2;
        this.description = str3;
        this.dialog = anyModal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return AnyModal.INSTANCE.serializer();
    }

    public static /* synthetic */ TestResultBottomSheetItem copy$default(TestResultBottomSheetItem testResultBottomSheetItem, C9598e c9598e, Action action, String str, String str2, String str3, AnyModal anyModal, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c9598e = testResultBottomSheetItem.navigation;
        }
        if ((i13 & 2) != 0) {
            action = testResultBottomSheetItem.action;
        }
        if ((i13 & 4) != 0) {
            str = testResultBottomSheetItem.title;
        }
        if ((i13 & 8) != 0) {
            str2 = testResultBottomSheetItem.icon;
        }
        if ((i13 & 16) != 0) {
            str3 = testResultBottomSheetItem.description;
        }
        if ((i13 & 32) != 0) {
            anyModal = testResultBottomSheetItem.dialog;
        }
        String str4 = str3;
        AnyModal anyModal2 = anyModal;
        return testResultBottomSheetItem.copy(c9598e, action, str, str2, str4, anyModal2);
    }

    public static /* synthetic */ void getAction$annotations() {
    }

    public static /* synthetic */ void getNavigation$annotations() {
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(TestResultBottomSheetItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.navigation != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.navigation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.action);
        }
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.description);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.dialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnyModal getDialog() {
        return this.dialog;
    }

    public final TestResultBottomSheetItem copy(C9598e navigation, Action action, String title, String icon, String description, AnyModal dialog) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        return new TestResultBottomSheetItem(navigation, action, title, icon, description, dialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestResultBottomSheetItem)) {
            return false;
        }
        TestResultBottomSheetItem testResultBottomSheetItem = (TestResultBottomSheetItem) other;
        return AbstractC22676k.m65745e(this.navigation, testResultBottomSheetItem.navigation) && AbstractC22676k.m65745e(this.action, testResultBottomSheetItem.action) && AbstractC22676k.m65745e(this.title, testResultBottomSheetItem.title) && AbstractC22676k.m65745e(this.icon, testResultBottomSheetItem.icon) && AbstractC22676k.m65745e(this.description, testResultBottomSheetItem.description) && AbstractC22676k.m65745e(this.dialog, testResultBottomSheetItem.dialog);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AnyModal getDialog() {
        return this.dialog;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        C9598e c9598e = this.navigation;
        int iHashCode = (c9598e == null ? 0 : c9598e.hashCode()) * 31;
        Action action = this.action;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (action == null ? 0 : action.hashCode())) * 31, 31, this.title), 31, this.icon);
        String str = this.description;
        int iHashCode2 = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        AnyModal anyModal = this.dialog;
        return iHashCode2 + (anyModal != null ? anyModal.hashCode() : 0);
    }

    public String toString() {
        C9598e c9598e = this.navigation;
        Action action = this.action;
        String str = this.title;
        String str2 = this.icon;
        String str3 = this.description;
        AnyModal anyModal = this.dialog;
        StringBuilder sb4 = new StringBuilder("TestResultBottomSheetItem(navigation=");
        sb4.append(c9598e);
        sb4.append(", action=");
        sb4.append(action);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str, ", icon=", str2, ", description=");
        sb4.append(str3);
        sb4.append(", dialog=");
        sb4.append(anyModal);
        sb4.append(")");
        return sb4.toString();
    }

    public TestResultBottomSheetItem(C9598e c9598e, Action action, String title, String icon, String str, AnyModal anyModal) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        this.navigation = c9598e;
        this.action = action;
        this.title = title;
        this.icon = icon;
        this.description = str;
        this.dialog = anyModal;
    }

    public /* synthetic */ TestResultBottomSheetItem(C9598e c9598e, Action action, String str, String str2, String str3, AnyModal anyModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c9598e, (i13 & 2) != 0 ? null : action, str, str2, str3, anyModal);
    }
}
