package com.whoop.design.atomic.atom.icon;

import ge3.AbstractC15751g;
import gw1.C16268a;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "", "Ly81/f;", "color", "<init>", "(Ljava/lang/String;ILy81/f;)V", "Ly81/f;", "getColor", "()Ly81/f;", "Companion", "a", "STRAIN", "ACCENT_GREEN", "BRAND_WHITE", "BRAND_BLACK", "RECOVERY", "ONBOARDING", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum GlowStyle {
    STRAIN(EnumC39333f.STRAIN),
    ACCENT_GREEN(EnumC39333f.ACCENT_POSITIVE_TREND),
    BRAND_WHITE(EnumC39333f.BRAND_WHITE),
    BRAND_BLACK(EnumC39333f.BRAND_BLACK),
    RECOVERY(EnumC39333f.RECOVERY),
    ONBOARDING(EnumC39333f.ACCENT_ONBOARDING_ACTION);

    private final EnumC39333f color;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16268a(26));

    /* JADX INFO: renamed from: com.whoop.design.atomic.atom.icon.GlowStyle$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/atomic/atom/icon/GlowStyle$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "serializer", "()Lwc3/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC37138c m20109a() {
            return (InterfaceC37138c) GlowStyle.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return m20109a();
        }

        private Companion() {
        }
    }

    GlowStyle(EnumC39333f enumC39333f) {
        this.color = enumC39333f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.GlowStyle", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final EnumC39333f getColor() {
        return this.color;
    }
}
