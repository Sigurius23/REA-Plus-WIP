package p106e2;

import e10.C12554k0;
import p005a3.EnumC0236o2;
import p512u2.AbstractC34455e;
import p603x2.AbstractC37831a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22659b0;

/* JADX INFO: renamed from: e2.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C12590e extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42972w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22659b0 f42973x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12590e(C12554k0 c12554k0, C12591f c12591f, C22659b0 c22659b0) {
        super(1);
        this.f42973x = c22659b0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42972w) {
            case 0:
                C12591f c12591f = (C12591f) obj;
                if (!c12591f.f9141N) {
                    return EnumC0236o2.f808x;
                }
                if (c12591f.f42975P != null) {
                    AbstractC37831a.m121374b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                c12591f.f42975P = null;
                C22659b0 c22659b0 = this.f42973x;
                c22659b0.f89329w = c22659b0.f89329w;
                return EnumC0236o2.f807w;
            default:
                if (!((AbstractC34455e) obj).f144759Q) {
                    return EnumC0236o2.f807w;
                }
                this.f42973x.f89329w = false;
                return EnumC0236o2.f809y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12590e(C22659b0 c22659b0) {
        super(1);
        this.f42973x = c22659b0;
    }
}
