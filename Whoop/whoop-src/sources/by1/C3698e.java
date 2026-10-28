package by1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p715kotlin.jvm.functions.Function1;
import vs2.AbstractC36479e;

/* JADX INFO: renamed from: by1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3698e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15115w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f15116x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f15117y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f15118z;

    public /* synthetic */ C3698e(TextResource textResource, Function1 function1, int i13, int i14) {
        this.f15115w = i14;
        this.f15116x = textResource;
        this.f15117y = function1;
        this.f15118z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f15115w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3699f.m11511e(this.f15116x, this.f15117y, this.f15118z, composer, iIntValue);
            default:
                return AbstractC36479e.m116880h0(this.f15116x, this.f15117y, this.f15118z, composer, iIntValue);
        }
    }
}
