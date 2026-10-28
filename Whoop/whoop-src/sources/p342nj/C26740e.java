package p342nj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p108e4.AbstractC12667a;
import p390p1.AbstractC28683x;
import p401pj.C29282p;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: nj.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C26740e extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C29282p f106350w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f106351x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f106352y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26740e(C29282p c29282p, long j7, Modifier modifier, int i13) {
        super(2);
        this.f106350w = c29282p;
        this.f106351x = j7;
        this.f106352y = modifier;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM87244L = AbstractC28683x.m87244L(9);
        AbstractC12667a.m35450b(this.f106350w, this.f106351x, this.f106352y, (Composer) obj, iM87244L);
        return C23454a0.f92919a;
    }
}
