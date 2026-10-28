package rz0;

import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import i91.AbstractC18247a;
import i91.C18250d;
import i91.C18252f;
import p208i2.AbstractC17911t;
import p712j91.Function1;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import qc1.C30217a;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: rz0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m65681d2 = {"Lrz0/f;", "", "Lj91/b;", "borderBrush", "Li91/a;", "background", "leadingAccentBrush", "<init>", "(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;)V", "Lj91/b;", "getBorderBrush", "()Lj91/b;", "Li91/a;", "getBackground", "()Li91/a;", "getLeadingAccentBrush", "DEFAULT", "ONBOARDING_GRADIENT_FILL", "AMERICA_250_REWARDS", "AI_ACCENT", "AI_GRADIENT", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC31927f {
    DEFAULT(null, null, null, 7, null),
    ONBOARDING_GRADIENT_FILL(Function1.m60318a(AbstractC15673b0.m44000O()), new C18250d(Function1.m60318a(AbstractC15673b0.m43985G0()), 0.05f), null, 4, null),
    AMERICA_250_REWARDS(Function1.m60319b(new C30217a(10)), new C18250d(Function1.m60319b(new C30217a(11)), 0.1f), null, 4, null),
    AI_ACCENT(null, 0 == true ? 1 : 0, Function1.m60318a(AbstractC15673b0.m43972A()), 3, null),
    AI_GRADIENT(Function1.m60318a(AbstractC15673b0.m43972A()), new C18250d(Function1.m60318a(AbstractC15673b0.m43972A()), 0.1f), null, 4, null);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final AbstractC18247a background;
    private final InterfaceC21430b borderBrush;
    private final InterfaceC21430b leadingAccentBrush;

    EnumC31927f(InterfaceC21430b interfaceC21430b, AbstractC18247a abstractC18247a, InterfaceC21430b interfaceC21430b2) {
        this.borderBrush = interfaceC21430b;
        this.background = abstractC18247a;
        this.leadingAccentBrush = interfaceC21430b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$0(C39336i whoopBrush) {
        AbstractC22676k.m65750j(whoopBrush, "$this$whoopBrush");
        return AbstractC15673b0.m44047l(whoopBrush);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC17911t _init_$lambda$1(C39336i whoopBrush) {
        AbstractC22676k.m65750j(whoopBrush, "$this$whoopBrush");
        return AbstractC15673b0.m44047l(whoopBrush);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final AbstractC18247a getBackground() {
        return this.background;
    }

    public final InterfaceC21430b getBorderBrush() {
        return this.borderBrush;
    }

    public final InterfaceC21430b getLeadingAccentBrush() {
        return this.leadingAccentBrush;
    }

    /* synthetic */ EnumC31927f(InterfaceC21430b interfaceC21430b, AbstractC18247a abstractC18247a, InterfaceC21430b interfaceC21430b2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC21430b, (i13 & 2) != 0 ? new C18252f(EnumC39333f.WHITE_10, null, 2, null) : abstractC18247a, (i13 & 4) != 0 ? null : interfaceC21430b2);
    }
}
