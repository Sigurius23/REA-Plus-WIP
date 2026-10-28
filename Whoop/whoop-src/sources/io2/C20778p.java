package io2;

import androidx.compose.p018ui.Modifier;
import c31.EnumC3919c;
import com.whoop.navigation.C9598e;
import l01.AbstractC23041m;
import le0.AbstractC23873b;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io2.p */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C20778p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78026w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C9598e f78027x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f78028y;

    public /* synthetic */ C20778p(C9598e c9598e, Function1 function1) {
        this.f78026w = 0;
        this.f78028y = function1;
        this.f78027x = c9598e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78026w) {
            case 0:
                return AbstractC20782s.m57284t(this.f78028y, this.f78027x, (InterfaceC18044z) obj);
            case 1:
                return AbstractC23041m.m66889m0(this.f78027x, this.f78028y, (Modifier) obj);
            default:
                return AbstractC23873b.m70138n(this.f78027x, this.f78028y, (EnumC3919c) obj);
        }
    }

    public /* synthetic */ C20778p(C9598e c9598e, Function1 function1, int i13) {
        this.f78026w = i13;
        this.f78027x = c9598e;
        this.f78028y = function1;
    }
}
