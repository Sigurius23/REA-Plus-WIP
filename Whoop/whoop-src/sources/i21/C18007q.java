package i21;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import t71.InterfaceC33570g;
import y11.C39065r;

/* JADX INFO: renamed from: i21.q */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C18007q implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ TextResource f69904E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long f69905F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ TextResource f69906G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function1 f69907H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f69908I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f69909J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f69910K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f69911L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69912w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f69913x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f69914y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f69915z;

    public /* synthetic */ C18007q(Modifier modifier, TextResource textResource, long j7, TextResource textResource2, long j13, TextResource textResource3, Object obj, Object obj2, Function1 function1, int i13, int i14, int i15) {
        this.f69912w = i15;
        this.f69913x = modifier;
        this.f69914y = textResource;
        this.f69915z = j7;
        this.f69904E = textResource2;
        this.f69905F = j13;
        this.f69906G = textResource3;
        this.f69910K = obj;
        this.f69911L = obj2;
        this.f69907H = function1;
        this.f69908I = i13;
        this.f69909J = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69912w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18009s.m51704m(this.f69913x, this.f69914y, this.f69915z, this.f69904E, this.f69905F, this.f69906G, (InterfaceC33570g.a) this.f69910K, (List) this.f69911L, this.f69907H, this.f69908I, this.f69909J, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18010t.m51715k(this.f69913x, this.f69914y, this.f69915z, this.f69904E, this.f69905F, this.f69906G, (C39065r) this.f69910K, (InterfaceC33570g.b) this.f69911L, this.f69907H, this.f69908I, this.f69909J, (Composer) obj, iIntValue2);
        }
    }
}
