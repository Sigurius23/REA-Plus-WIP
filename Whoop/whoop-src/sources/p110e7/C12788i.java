package p110e7;

import android.content.Context;
import java.util.Collection;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: e7.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12788i extends C22672i implements Function1 {
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<String> p13 = (Collection) obj;
        AbstractC22676k.m65750j(p13, "p0");
        ((Context) this.receiver).revokeSelfPermissionsOnKill(p13);
        return C23454a0.f92919a;
    }
}
