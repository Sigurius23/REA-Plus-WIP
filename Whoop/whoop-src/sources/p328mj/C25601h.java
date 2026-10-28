package p328mj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.DebugStatus;
import l83.C23454a0;
import p095dp.AbstractC12240d;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: mj.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C25601h extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f100437E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f100438w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DebugStatus f100439x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f100440y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f100441z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25601h(long j7, DebugStatus debugStatus, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13) {
        super(2);
        this.f100438w = j7;
        this.f100439x = debugStatus;
        this.f100440y = modifier;
        this.f100441z = interfaceC4339a;
        this.f100437E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC12240d.m34073j(this.f100438w, this.f100439x, this.f100440y, this.f100441z, (Composer) obj, AbstractC28683x.m87244L(this.f100437E | 1));
        return C23454a0.f92919a;
    }
}
