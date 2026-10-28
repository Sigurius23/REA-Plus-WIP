package com.whoop.core.details.activitytargets;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wr1.C37572f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b\t\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/ActivityTargetZone;", "", "", "label", "value", "target", "Ly81/f;", "color", "", "isCompleted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/activitytargets/ActivityTargetZone;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ly81/f;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)Lcom/whoop/core/details/activitytargets/ActivityTargetZone;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getValue", "getTarget", "Ly81/f;", "getColor", "Z", "Companion", "$serializer", "a", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityTargetZone {
    public static final int $stable = 0;
    private final EnumC39333f color;
    private final boolean isCompleted;
    private final String label;
    private final String target;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(7)), null};

    /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.ActivityTargetZone$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/ActivityTargetZone$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/activitytargets/ActivityTargetZone;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityTargetZone$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivityTargetZone(int i13, String str, String str2, String str3, EnumC39333f enumC39333f, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ActivityTargetZone$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.value = str2;
        this.target = str3;
        this.color = enumC39333f;
        this.isCompleted = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    public static /* synthetic */ ActivityTargetZone copy$default(ActivityTargetZone activityTargetZone, String str, String str2, String str3, EnumC39333f enumC39333f, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activityTargetZone.label;
        }
        if ((i13 & 2) != 0) {
            str2 = activityTargetZone.value;
        }
        if ((i13 & 4) != 0) {
            str3 = activityTargetZone.target;
        }
        if ((i13 & 8) != 0) {
            enumC39333f = activityTargetZone.color;
        }
        if ((i13 & 16) != 0) {
            z4 = activityTargetZone.isCompleted;
        }
        boolean z13 = z4;
        String str4 = str3;
        return activityTargetZone.copy(str, str2, str4, enumC39333f, z13);
    }

    public static final /* synthetic */ void write$Self$core_details_release(ActivityTargetZone self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeStringElement(serialDesc, 1, self.value);
        output.encodeStringElement(serialDesc, 2, self.target);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.color);
        output.encodeBooleanElement(serialDesc, 4, self.isCompleted);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public final ActivityTargetZone copy(String label, String value, String target, EnumC39333f color, boolean isCompleted) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(target, "target");
        AbstractC22676k.m65750j(color, "color");
        return new ActivityTargetZone(label, value, target, color, isCompleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityTargetZone)) {
            return false;
        }
        ActivityTargetZone activityTargetZone = (ActivityTargetZone) other;
        return AbstractC22676k.m65745e(this.label, activityTargetZone.label) && AbstractC22676k.m65745e(this.value, activityTargetZone.value) && AbstractC22676k.m65745e(this.target, activityTargetZone.target) && this.color == activityTargetZone.color && this.isCompleted == activityTargetZone.isCompleted;
    }

    public final EnumC39333f getColor() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCompleted) + AbstractC21702c.m61132c(this.color, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.value), 31, this.target), 31);
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        String str = this.label;
        String str2 = this.value;
        String str3 = this.target;
        EnumC39333f enumC39333f = this.color;
        boolean z4 = this.isCompleted;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityTargetZone(label=", str, ", value=", str2, ", target=");
        sbM32001t.append(str3);
        sbM32001t.append(", color=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", isCompleted=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public ActivityTargetZone(String label, String value, String target, EnumC39333f color, boolean z4) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(target, "target");
        AbstractC22676k.m65750j(color, "color");
        this.label = label;
        this.value = value;
        this.target = target;
        this.color = color;
        this.isCompleted = z4;
    }
}
