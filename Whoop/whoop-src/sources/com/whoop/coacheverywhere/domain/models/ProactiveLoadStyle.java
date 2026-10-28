package com.whoop.coacheverywhere.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ep0.EnumC13400f;
import ep0.EnumC13401g;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;", "", "Lep0/f;", "onLoadStyle", "Lep0/g;", "loadStyle", "<init>", "(Lep0/f;Lep0/g;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILep0/f;Lep0/g;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$coach_everywhere_release", "(Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lep0/f;", "component2", "()Lep0/g;", "copy", "(Lep0/f;Lep0/g;)Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lep0/f;", "getOnLoadStyle", "Lep0/g;", "getLoadStyle", "Companion", "$serializer", "a", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProactiveLoadStyle {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EnumC13401g loadStyle;
    private final EnumC13400f onLoadStyle;

    /* JADX INFO: renamed from: com.whoop.coacheverywhere.domain.models.ProactiveLoadStyle$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywhere/domain/models/ProactiveLoadStyle;", "serializer", "()Lwc3/c;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProactiveLoadStyle$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C33691b(22)), AbstractC30060g.m92087G(enumC23463i, new C33691b(23))};
    }

    public /* synthetic */ ProactiveLoadStyle(int i13, EnumC13400f enumC13400f, EnumC13401g enumC13401g, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ProactiveLoadStyle$$serializer.INSTANCE.getDescriptor());
        }
        this.onLoadStyle = enumC13400f;
        this.loadStyle = enumC13401g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.coacheverywherecommon.models.ProactiveLoadAction", EnumC13400f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.coacheverywherecommon.models.ProactiveLoadingStyle", EnumC13401g.values());
    }

    public static /* synthetic */ ProactiveLoadStyle copy$default(ProactiveLoadStyle proactiveLoadStyle, EnumC13400f enumC13400f, EnumC13401g enumC13401g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC13400f = proactiveLoadStyle.onLoadStyle;
        }
        if ((i13 & 2) != 0) {
            enumC13401g = proactiveLoadStyle.loadStyle;
        }
        return proactiveLoadStyle.copy(enumC13400f, enumC13401g);
    }

    public static final /* synthetic */ void write$Self$coach_everywhere_release(ProactiveLoadStyle self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.onLoadStyle);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.loadStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC13400f getOnLoadStyle() {
        return this.onLoadStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC13401g getLoadStyle() {
        return this.loadStyle;
    }

    public final ProactiveLoadStyle copy(EnumC13400f onLoadStyle, EnumC13401g loadStyle) {
        AbstractC22676k.m65750j(onLoadStyle, "onLoadStyle");
        AbstractC22676k.m65750j(loadStyle, "loadStyle");
        return new ProactiveLoadStyle(onLoadStyle, loadStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProactiveLoadStyle)) {
            return false;
        }
        ProactiveLoadStyle proactiveLoadStyle = (ProactiveLoadStyle) other;
        return this.onLoadStyle == proactiveLoadStyle.onLoadStyle && this.loadStyle == proactiveLoadStyle.loadStyle;
    }

    public final EnumC13401g getLoadStyle() {
        return this.loadStyle;
    }

    public final EnumC13400f getOnLoadStyle() {
        return this.onLoadStyle;
    }

    public int hashCode() {
        return this.loadStyle.hashCode() + (this.onLoadStyle.hashCode() * 31);
    }

    public String toString() {
        return "ProactiveLoadStyle(onLoadStyle=" + this.onLoadStyle + ", loadStyle=" + this.loadStyle + ")";
    }

    public ProactiveLoadStyle(EnumC13400f onLoadStyle, EnumC13401g loadStyle) {
        AbstractC22676k.m65750j(onLoadStyle, "onLoadStyle");
        AbstractC22676k.m65750j(loadStyle, "loadStyle");
        this.onLoadStyle = onLoadStyle;
        this.loadStyle = loadStyle;
    }
}
