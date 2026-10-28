package p106e2;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.p018ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import e10.C12554k0;
import p002a0.C0006a1;
import p002a0.C0007b;
import p002a0.C0025h;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p027b3.C2436s;
import p108e4.AbstractC12667a;
import p715kotlin.jvm.internal.C22659b0;

/* JADX INFO: renamed from: e2.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC12586a implements View.OnDragListener, InterfaceC12588c {

    /* JADX INFO: renamed from: a */
    public final C12591f f42965a;

    /* JADX INFO: renamed from: b */
    public final C0025h f42966b;

    /* JADX INFO: renamed from: c */
    public final AndroidDragAndDropManager$modifier$1 f42967c;

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public ViewOnDragListenerC12586a(C2436s c2436s) {
        C12591f c12591f = new C12591f();
        c12591f.f42976Q = 0L;
        this.f42965a = c12591f;
        this.f42966b = new C0025h(0);
        this.f42967c = new AbstractC0207h1() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            @Override // p005a3.AbstractC0207h1
            public final AbstractC2316v create() {
                return this.f4774w.f42965a;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f4774w.f42965a.hashCode();
            }

            @Override // p005a3.AbstractC0207h1
            public final void inspectableProperties(C2404l2 c2404l2) {
                c2404l2.m7401c("RootDragAndDropNode");
            }

            @Override // p005a3.AbstractC0207h1
            public final /* bridge */ /* synthetic */ void update(AbstractC2316v abstractC2316v) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C12554k0 c12554k0 = new C12554k0(dragEvent, 1);
        int action = dragEvent.getAction();
        C0025h c0025h = this.f42966b;
        C12591f c12591f = this.f42965a;
        switch (action) {
            case 1:
                C22659b0 c22659b0 = new C22659b0();
                AbstractC12667a.m35464p(c12591f, new C12590e(c12554k0, c12591f, c22659b0));
                boolean z4 = c22659b0.f89329w;
                c0025h.getClass();
                C0007b c0007b = new C0007b(c0025h);
                while (c0007b.hasNext()) {
                    ((C12591f) c0007b.next()).m35292b1(c12554k0);
                }
                return z4;
            case 2:
                c12591f.m35291a1(c12554k0);
                return false;
            case 3:
                return c12591f.m35288X0(c12554k0);
            case 4:
                AbstractC12667a.m35464p(c12591f, new C0006a1(c12554k0, 16));
                c0025h.clear();
                return false;
            case 5:
                c12591f.m35289Y0(c12554k0);
                return false;
            case 6:
                c12591f.m35290Z0(c12554k0);
                return false;
            default:
                return false;
        }
    }
}
