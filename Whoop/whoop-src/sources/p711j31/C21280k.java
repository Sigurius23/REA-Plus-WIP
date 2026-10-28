package p711j31;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import l83.C23454a0;
import p180h0.EnumC16377d2;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p390p1.C28621h1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: j31.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u007f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b!\u0010\"J9\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0014¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u00102\u001a\u00020\u000f*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u00020\u000f*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0018\u00106\u001a\u00020\u000f*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0018\u00108\u001a\u00020\u000f*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0018\u0010:\u001a\u00020\u000f*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b9\u00101R\u0018\u0010<\u001a\u00020\u000f*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b;\u00101R\u0018\u0010>\u001a\u00020\u000f*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b=\u00101R\u0018\u0010B\u001a\u00020?*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020 8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010L\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bK\u0010GR\u0014\u0010N\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bM\u0010G¨\u0006O"}, m65681d2 = {"Lj31/k;", "Lj31/m;", "Ln0/g;", "Ln0/u;", "listState", "Lbc3/c0;", "scope", "", "maxScrollPerFrame", "Lkotlin/Function2;", "Lj31/d;", "Ll83/a0;", "onMove", "", "canDragOver", "", "onDragEnd", "Lj31/b;", "dragCancelledAnimation", "<init>", "(Ln0/u;Lbc3/c0;FLc93/m;Lc93/m;Lc93/m;Lj31/b;)V", "index", MapboxMap.QFE_OFFSET, "S", "(IILq83/d;)Ljava/lang/Object;", "offsetX", "offsetY", "R", "(II)Z", "x", "y", "selected", "", "a0", "(IILn0/g;)Ljava/util/List;", "draggedItemInfo", "items", "curX", "curY", "Z", "(Ln0/g;Ljava/util/List;II)Ln0/g;", "s", "Ln0/u;", "g0", "()Ln0/u;", "O", "()Z", "isVerticalScroll", "f0", "(Ln0/g;)I", "left", "i0", "top", "h0", "right", "b0", "bottom", "j0", "width", "c0", "height", "d0", "itemIndex", "", "e0", "(Ln0/g;)Ljava/lang/Object;", "itemKey", "M", "()Ljava/util/List;", "visibleItemsInfo", "L", "()I", "viewportStartOffset", "K", "viewportEndOffset", "z", "firstVisibleItemIndex", "A", "firstVisibleItemScrollOffset", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21280k extends AbstractC21282m<InterfaceC26054g> {

    /* JADX INFO: renamed from: t */
    public static final int f81267t = 8;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C26068u listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21280k(C26068u listState, InterfaceC2994c0 scope, float f13, InterfaceC4351m onMove, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC21271b dragCancelledAnimation) {
        super(scope, f13, onMove, interfaceC4351m, interfaceC4351m2, dragCancelledAnimation);
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(onMove, "onMove");
        AbstractC22676k.m65750j(dragCancelledAnimation, "dragCancelledAnimation");
        this.listState = listState;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: A */
    public int mo59717A() {
        return ((C28621h1) this.listState.f103222e.f91959c).m87024x();
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: K */
    public int mo59724K() {
        return this.listState.m77565h().f103179m;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: L */
    public int mo59725L() {
        return this.listState.m77565h().f103178l;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List<n0.g>] */
    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: M */
    public List<InterfaceC26054g> mo59726M() {
        return this.listState.m77565h().f103177k;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: O */
    public boolean mo59728O() {
        return this.listState.m77565h().f103181o == EnumC16377d2.f62971w;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: R */
    public boolean mo59729R(int offsetX, int offsetY) {
        return mo59728O() ? super.mo59729R(0, offsetY) : super.mo59729R(offsetX, 0);
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: S */
    public Object mo59730S(int i13, int i14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM77567j = this.listState.m77567j(i13, i14, interfaceC30057d);
        return objM77567j == EnumC31071a.f128113w ? objM77567j : C23454a0.f92919a;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public InterfaceC26054g mo59742p(InterfaceC26054g draggedItemInfo, List<? extends InterfaceC26054g> items, int curX, int curY) {
        AbstractC22676k.m65750j(items, "items");
        return mo59728O() ? (InterfaceC26054g) super.mo59742p(draggedItemInfo, items, 0, curY) : (InterfaceC26054g) super.mo59742p(draggedItemInfo, items, curX, 0);
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC26054g> mo59743q(int x3, int y13, InterfaceC26054g selected) {
        AbstractC22676k.m65750j(selected, "selected");
        return mo59728O() ? super.mo59743q(0, y13, selected) : super.mo59743q(x3, 0, selected);
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int mo59744r(InterfaceC26054g interfaceC26054g) {
        AbstractC22676k.m65750j(interfaceC26054g, "<this>");
        if (!mo59728O()) {
            return 0;
        }
        this.listState.m77565h().getClass();
        C26062o c26062o = (C26062o) interfaceC26054g;
        return c26062o.f103198o + c26062o.f103199p;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public int mo59718B(InterfaceC26054g interfaceC26054g) {
        AbstractC22676k.m65750j(interfaceC26054g, "<this>");
        if (mo59728O()) {
            return ((C26062o) interfaceC26054g).f103199p;
        }
        return 0;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public int mo59719D(InterfaceC26054g interfaceC26054g) {
        AbstractC22676k.m65750j(interfaceC26054g, "<this>");
        return ((C26062o) interfaceC26054g).f103184a;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public Object mo59720E(InterfaceC26054g interfaceC26054g) {
        AbstractC22676k.m65750j(interfaceC26054g, "<this>");
        return ((C26062o) interfaceC26054g).f103194k;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public int mo59721F(InterfaceC26054g interfaceC26054g) {
        AbstractC22676k.m65750j(interfaceC26054g, "<this>");
        if (mo59728O()) {
            return 0;
        }
        this.listState.m77565h().getClass();
        return ((C26062o) interfaceC26054g).f103198o;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final C26068u getListState() {
        return this.listState;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public int mo59722G(InterfaceC26054g interfaceC26054g) {
        AbstractC22676k.m65750j(interfaceC26054g, "<this>");
        if (mo59728O()) {
            return 0;
        }
        this.listState.m77565h().getClass();
        C26062o c26062o = (C26062o) interfaceC26054g;
        return c26062o.f103198o + c26062o.f103199p;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public int mo59723J(InterfaceC26054g interfaceC26054g) {
        AbstractC22676k.m65750j(interfaceC26054g, "<this>");
        if (!mo59728O()) {
            return 0;
        }
        this.listState.m77565h().getClass();
        return ((C26062o) interfaceC26054g).f103198o;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public int mo59727N(InterfaceC26054g interfaceC26054g) {
        AbstractC22676k.m65750j(interfaceC26054g, "<this>");
        if (mo59728O()) {
            return 0;
        }
        return ((C26062o) interfaceC26054g).f103199p;
    }

    @Override // p711j31.AbstractC21282m
    /* JADX INFO: renamed from: z */
    public int mo59745z() {
        return ((C28621h1) this.listState.f103222e.f91958b).m87024x();
    }
}
