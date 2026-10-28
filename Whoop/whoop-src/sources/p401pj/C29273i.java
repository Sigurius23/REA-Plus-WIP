package p401pj;

import android.graphics.Typeface;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p392p3.C28780r;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: pj.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C29273i extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f118463E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f118464F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C28780r f118465G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Typeface f118466H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Function1 f118467I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f118468J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f118469w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f118470x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f118471y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f118472z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29273i(String str, Modifier modifier, long j7, long j13, int i13, float f13, C28780r c28780r, Typeface typeface, Function1 function1, int i14) {
        super(2);
        this.f118469w = str;
        this.f118470x = modifier;
        this.f118471y = j7;
        this.f118472z = j13;
        this.f118463E = i13;
        this.f118464F = f13;
        this.f118465G = c28780r;
        this.f118466H = typeface;
        this.f118467I = function1;
        this.f118468J = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC35902e.m113960d(this.f118469w, this.f118470x, this.f118471y, this.f118472z, this.f118463E, this.f118464F, this.f118465G, this.f118466H, this.f118467I, (Composer) obj, AbstractC28683x.m87244L(this.f118468J | 1));
        return C23454a0.f92919a;
    }
}
