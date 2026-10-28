package q21;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p291l0.InterfaceC22997s1;
import w31.AbstractC36791e;
import w31.EnumC36788b;

/* JADX INFO: renamed from: q21.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C29843b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f121962E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f121963F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121964w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f121965x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f121966y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f121967z;

    public /* synthetic */ C29843b(InterfaceC22997s1 interfaceC22997s1, boolean z4, boolean z13, int i13, int i14) {
        this.f121963F = interfaceC22997s1;
        this.f121965x = z4;
        this.f121966y = z13;
        this.f121967z = i13;
        this.f121962E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f121964w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC29844c.m91346j((InterfaceC22997s1) this.f121963F, this.f121965x, this.f121966y, this.f121967z, this.f121962E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36791e.m117901m(this.f121965x, this.f121966y, (EnumC36788b) this.f121963F, this.f121967z, this.f121962E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C29843b(boolean z4, boolean z13, EnumC36788b enumC36788b, int i13, int i14) {
        this.f121965x = z4;
        this.f121966y = z13;
        this.f121963F = enumC36788b;
        this.f121967z = i13;
        this.f121962E = i14;
    }
}
