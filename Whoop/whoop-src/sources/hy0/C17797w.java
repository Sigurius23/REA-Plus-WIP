package hy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import i21.AbstractC18004n;
import java.util.List;
import p208i2.InterfaceC17869a1;
import p748zc1.AbstractC40372j8;

/* JADX INFO: renamed from: hy0.w */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17797w implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f69217E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f69218F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f69219G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69220w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f69221x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f69222y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f69223z;

    public /* synthetic */ C17797w(long j7, long j13, TextResource textResource, TextResource textResource2, int i13, int i14) {
        this.f69221x = j7;
        this.f69222y = j13;
        this.f69218F = textResource;
        this.f69219G = textResource2;
        this.f69223z = i13;
        this.f69217E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69220w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17803y.m51169n((EnumC17806z) this.f69218F, this.f69221x, this.f69222y, (Modifier) this.f69219G, this.f69223z, this.f69217E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18004n.m51673i(this.f69221x, this.f69222y, (TextResource) this.f69218F, (TextResource) this.f69219G, this.f69223z, this.f69217E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC40372j8.m130126e((List) this.f69218F, this.f69221x, (InterfaceC17869a1) this.f69219G, this.f69222y, this.f69223z, this.f69217E, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C17797w(EnumC17806z enumC17806z, long j7, long j13, Modifier modifier, int i13, int i14) {
        this.f69218F = enumC17806z;
        this.f69221x = j7;
        this.f69222y = j13;
        this.f69219G = modifier;
        this.f69223z = i13;
        this.f69217E = i14;
    }

    public /* synthetic */ C17797w(List list, long j7, InterfaceC17869a1 interfaceC17869a1, long j13, int i13, int i14) {
        this.f69218F = list;
        this.f69221x = j7;
        this.f69219G = interfaceC17869a1;
        this.f69222y = j13;
        this.f69223z = i13;
        this.f69217E = i14;
    }
}
