package mi2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ji2.C21733l;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25585h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f100378E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100379w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21733l f100380x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f100381y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f100382z;

    public /* synthetic */ C25585h(C21733l c21733l, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f100379w = i14;
        this.f100380x = c21733l;
        this.f100381y = function1;
        this.f100382z = interfaceC4339a;
        this.f100378E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f100379w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC25586i.m75243B(this.f100380x, this.f100381y, this.f100382z, this.f100378E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC25589l.m75310w(this.f100380x, this.f100381y, this.f100382z, this.f100378E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC25593p.m75323j(this.f100380x, this.f100381y, this.f100382z, this.f100378E, (Composer) obj, iIntValue3);
        }
    }
}
