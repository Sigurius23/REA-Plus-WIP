package f01;

import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import p712j91.Function1;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: f01.x */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lf01/x;", "", "Lj91/b;", "buttonBrush", "Ly81/f;", "buttonColor", "<init>", "(Ljava/lang/String;ILj91/b;Ly81/f;)V", "Lj91/b;", "getButtonBrush", "()Lj91/b;", "Ly81/f;", "getButtonColor", "()Ly81/f;", "NORMAL", "ONBOARDING", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC13909x {
    NORMAL(null, null, 3, null),
    ONBOARDING(Function1.m60318a(AbstractC15673b0.m44000O()), null, 2, null);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final InterfaceC21430b buttonBrush;
    private final EnumC39333f buttonColor;

    EnumC13909x(InterfaceC21430b interfaceC21430b, EnumC39333f enumC39333f) {
        this.buttonBrush = interfaceC21430b;
        this.buttonColor = enumC39333f;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final InterfaceC21430b getButtonBrush() {
        return this.buttonBrush;
    }

    public final EnumC39333f getButtonColor() {
        return this.buttonColor;
    }

    /* synthetic */ EnumC13909x(InterfaceC21430b interfaceC21430b, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC21430b, (i13 & 2) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f);
    }
}
