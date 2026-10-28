package yb3;

import c93.InterfaceC4351m;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: yb3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C39399c implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final CharSequence f169559a;

    /* JADX INFO: renamed from: b */
    public final int f169560b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4351m f169561c;

    public C39399c(CharSequence input, int i13, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(input, "input");
        this.f169559a = input;
        this.f169560b = i13;
        this.f169561c = interfaceC4351m;
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        return new C39398b(this);
    }
}
