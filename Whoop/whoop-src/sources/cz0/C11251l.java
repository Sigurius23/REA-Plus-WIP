package cz0;

import h11.AbstractC16609d;
import h11.C16613h;
import jn2.AbstractC21808c;
import p077d0.C11344e;
import p134f2.C14015d;
import p208i2.C17893k;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import p730qt2.AbstractC30604j;
import y21.AbstractC39162i;

/* JADX INFO: renamed from: cz0.l */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11251l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36094w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f36095x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f36096y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f36097z;

    public /* synthetic */ C11251l(float f13, C17919x c17919x, long j7) {
        this.f36094w = 4;
        this.f36096y = f13;
        this.f36097z = c17919x;
        this.f36095x = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36094w) {
            case 0:
                return AbstractC11254o.m30382n(this.f36095x, this.f36096y, (C17893k) this.f36097z, (InterfaceC22131e) obj);
            case 1:
                return AbstractC16609d.m47139h((C16613h) this.f36097z, this.f36095x, this.f36096y, (InterfaceC22131e) obj);
            case 2:
                return AbstractC21808c.m61739h(this.f36095x, this.f36096y, (InterfaceC28670t2) this.f36097z, (C14015d) obj);
            case 3:
                return AbstractC30604j.m93900i(this.f36095x, (C11344e) this.f36097z, this.f36096y, (InterfaceC22131e) obj);
            default:
                return AbstractC39162i.m124709Y(this.f36096y, (C17919x) this.f36097z, this.f36095x, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C11251l(long j7, float f13, Object obj, int i13) {
        this.f36094w = i13;
        this.f36095x = j7;
        this.f36096y = f13;
        this.f36097z = obj;
    }

    public /* synthetic */ C11251l(long j7, C11344e c11344e, float f13) {
        this.f36094w = 3;
        this.f36095x = j7;
        this.f36097z = c11344e;
        this.f36096y = f13;
    }

    public /* synthetic */ C11251l(C16613h c16613h, long j7, float f13) {
        this.f36094w = 1;
        this.f36097z = c16613h;
        this.f36095x = j7;
        this.f36096y = f13;
    }
}
