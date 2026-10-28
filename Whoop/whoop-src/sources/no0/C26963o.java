package no0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import lo0.C24578f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.o */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26963o implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f107577E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f107578F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107579w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f107580x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C24578f f107581y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f107582z;

    public /* synthetic */ C26963o(Modifier modifier, C24578f c24578f, Function1 function1, int i13, int i14, int i15) {
        this.f107579w = i15;
        this.f107580x = modifier;
        this.f107581y = c24578f;
        this.f107582z = function1;
        this.f107577E = i13;
        this.f107578F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f107579w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC26965p.m80737j(this.f107580x, this.f107581y, this.f107582z, this.f107577E, this.f107578F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26965p.m80743p(this.f107580x, this.f107581y, this.f107582z, this.f107577E, this.f107578F, (Composer) obj, iIntValue2);
        }
    }
}
