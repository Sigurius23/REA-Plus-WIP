package k81;

import ge3.AbstractC15751g;
import p026b2.C2299e;
import p026b2.InterfaceC2300f;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: k81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lk81/a;", "", "Lb2/f;", "horizontalAlignment", "<init>", "(Ljava/lang/String;ILb2/f;)V", "Lb2/f;", "getHorizontalAlignment", "()Lb2/f;", "LEADING", "CENTER", "TRAILING", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC22291a {
    LEADING(C2299e.f9110M),
    CENTER(C2299e.f9111N),
    TRAILING(C2299e.f9112O);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final InterfaceC2300f horizontalAlignment;

    EnumC22291a(InterfaceC2300f interfaceC2300f) {
        this.horizontalAlignment = interfaceC2300f;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final InterfaceC2300f getHorizontalAlignment() {
        return this.horizontalAlignment;
    }
}
