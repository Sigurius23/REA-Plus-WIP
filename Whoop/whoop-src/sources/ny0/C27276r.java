package ny0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import sy0.AbstractC33087j;
import y71.C39274g;

/* JADX INFO: renamed from: ny0.r */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C27276r implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f109145E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f109146F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f109147G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f109148H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109149w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f109150x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f109151y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f109152z;

    public /* synthetic */ C27276r(C39274g c39274g, long j7, boolean z4, boolean z13, Function1 function1, int i13, int i14) {
        this.f109148H = c39274g;
        this.f109145E = j7;
        this.f109150x = z4;
        this.f109152z = z13;
        this.f109151y = function1;
        this.f109146F = i13;
        this.f109147G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f109149w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC27278s.m82284e((C39274g) this.f109148H, this.f109145E, this.f109150x, this.f109152z, this.f109151y, this.f109146F, this.f109147G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC33087j.m104823e(this.f109150x, this.f109151y, this.f109152z, this.f109145E, (Modifier) this.f109148H, this.f109146F, this.f109147G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C27276r(boolean z4, Function1 function1, boolean z13, long j7, Modifier modifier, int i13, int i14) {
        this.f109150x = z4;
        this.f109151y = function1;
        this.f109152z = z13;
        this.f109145E = j7;
        this.f109148H = modifier;
        this.f109146F = i13;
        this.f109147G = i14;
    }
}
