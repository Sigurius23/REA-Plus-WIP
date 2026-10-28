package p711j31;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.mapbox.maps.MapboxMap;
import dc3.InterfaceC11927l;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.C21045d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.AbstractC25265s;
import p007a6.C0456u;
import p181h2.C16617b;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: j31.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b+\b'\u0018\u0000 1*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00017Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0000¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00028\u0000H\u0014¢\u0006\u0004\b&\u0010'J9\u0010,\u001a\u0004\u0018\u00018\u00002\b\u0010(\u001a\u0004\u0018\u00018\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0005H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u0010 J\u001f\u00105\u001a\u00020\u00052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0005H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R(\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR/\u0010J\u001a\u0004\u0018\u00010\r2\b\u0010C\u001a\u0004\u0018\u00010\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010PR+\u0010Z\u001a\u00020U2\u0006\u0010C\u001a\u00020U8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010E\u001a\u0004\bW\u0010X\"\u0004\b\u0001\u0010YR/\u0010%\u001a\u0004\u0018\u00018\u00002\b\u0010C\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010E\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010eR\u0013\u0010i\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bh\u0010]R\u0018\u0010k\u001a\u00020\r*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b:\u0010jR\u0018\u0010m\u001a\u00020\r*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bl\u0010jR\u0018\u0010o\u001a\u00020\r*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bn\u0010jR\u0018\u0010q\u001a\u00020\r*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bp\u0010jR\u0018\u0010s\u001a\u00020\r*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\br\u0010jR\u0018\u0010u\u001a\u00020\r*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bt\u0010jR\u0018\u0010w\u001a\u00020\r*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bv\u0010jR\u0018\u0010z\u001a\u00020\u0002*\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020\r8$X¤\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020\r8$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u007fR\u0016\u0010\u0084\u0001\u001a\u00020\r8$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u007fR\u0016\u0010\u0086\u0001\u001a\u00020\r8$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u007fR\u0014\u0010\u0089\u0001\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010\u008a\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b#\u0010\u0088\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008e\u0001\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010]¨\u0006\u008f\u0001"}, m65681d2 = {"Lj31/m;", "T", "", "Lbc3/c0;", "scope", "", "maxScrollPerFrame", "Lkotlin/Function2;", "Lj31/d;", "Ll83/a0;", "onMove", "", "canDragOver", "", "onDragEnd", "Lj31/b;", "dragCancelledAnimation", "<init>", "(Lbc3/c0;FLc93/m;Lc93/m;Lc93/m;Lj31/b;)V", "index", MapboxMap.QFE_OFFSET, "S", "(IILq83/d;)Ljava/lang/Object;", "Lec3/l;", "", "W", "()Lec3/l;", "offsetX", "offsetY", "R", "(II)Z", "Q", "()V", "P", "(II)V", "x", "y", "selected", "q", "(IILjava/lang/Object;)Ljava/util/List;", "draggedItemInfo", "items", "curX", "curY", "p", "(Ljava/lang/Object;Ljava/util/List;II)Ljava/lang/Object;", "scrollOffset", "m", "(F)V", "o", "", "time", "maxScroll", "n", "(JF)F", "a", "Lbc3/c0;", "b", "F", "c", "Lc93/m;", "d", "e", "f", "Lj31/b;", "s", "()Lj31/b;", "<set-?>", "g", "Lp1/c1;", "u", "()Ljava/lang/Integer;", "U", "(Ljava/lang/Integer;)V", "draggingItemIndex", "Ldc3/l;", "Lj31/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ldc3/l;", "C", "()Ldc3/l;", "interactions", "i", "H", "scrollChannel", "Lh2/b;", "j", "t", "()J", "(J)V", "draggingDelta", "k", "I", "()Ljava/lang/Object;", "V", "(Ljava/lang/Object;)V", "Lbc3/k1;", "l", "Lbc3/k1;", "autoscroller", "", "Ljava/util/List;", "targets", "distances", "v", "draggingItemKey", "(Ljava/lang/Object;)I", "left", "J", "top", "G", "right", "r", "bottom", "N", "width", "B", "height", "D", "itemIndex", "E", "(Ljava/lang/Object;)Ljava/lang/Object;", "itemKey", "M", "()Ljava/util/List;", "visibleItemsInfo", "z", "()I", "firstVisibleItemIndex", "A", "firstVisibleItemScrollOffset", "L", "viewportStartOffset", "K", "viewportEndOffset", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()F", "draggingItemLeft", "draggingItemTop", "O", "()Z", "isVerticalScroll", "draggingLayoutInfo", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21282m<T> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p */
    public static final int f81280p = 8;

    /* JADX INFO: renamed from: q */
    private static final Function1 f81281q = new C21045d(18);

    /* JADX INFO: renamed from: r */
    private static final Function1 f81282r = new C21045d(19);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float maxScrollPerFrame;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4351m onMove;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4351m canDragOver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC4351m onDragEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC21271b dragCancelledAnimation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC28601c1 draggingItemIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC11927l interactions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC11927l scrollChannel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC28601c1 draggingDelta;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC28601c1 selected;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private InterfaceC3027k1 autoscroller;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final List<T> targets;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final List<Integer> distances;

    /* JADX INFO: renamed from: j31.m$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lj31/m$a;", "", "<init>", "()V", "", "viewSize", "", "viewSizeOutOfBounds", "", "time", "maxScroll", "b", "(IFJF)F", "ACCELERATION_LIMIT_TIME_MS", "J", "Lkotlin/Function1;", "EaseOutQuadInterpolator", "Lkotlin/jvm/functions/Function1;", "EaseInQuintInterpolator", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final float m59782b(int viewSize, float viewSizeOutOfBounds, long time, float maxScroll) {
            if (viewSizeOutOfBounds == 0.0f) {
                return 0.0f;
            }
            float fFloatValue = ((Number) AbstractC21282m.f81282r.invoke(Float.valueOf(time > 1500 ? 1.0f : time / 1500))).floatValue() * ((Number) AbstractC21282m.f81281q.invoke(Float.valueOf(Math.min(1.0f, (Math.abs(viewSizeOutOfBounds) * 1.0f) / viewSize)))).floatValue() * Math.signum(viewSizeOutOfBounds) * maxScroll;
            if (fFloatValue == 0.0f) {
                return viewSizeOutOfBounds > 0.0f ? 1.0f : -1.0f;
            }
            return fFloatValue;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: j31.m$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableState$autoscroll$1", m100430f = "ReorderableState.kt", m100431l = {174}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC21282m<T> f81297E;

        /* JADX INFO: renamed from: w */
        Object f81298w;

        /* JADX INFO: renamed from: x */
        Object f81299x;

        /* JADX INFO: renamed from: y */
        int f81300y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f81301z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f13, AbstractC21282m<T> abstractC21282m, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81301z = f13;
            this.f81297E = abstractC21282m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m59784h(C22667f0 c22667f0, C22663d0 c22663d0, AbstractC21282m abstractC21282m, long j7) {
            long j13 = c22667f0.f89335w;
            if (j13 == 0) {
                c22667f0.f89335w = j7;
            } else {
                c22663d0.f89331w = abstractC21282m.m59767n(j7 - j13, abstractC21282m.maxScrollPerFrame);
            }
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f81301z, this.f81297E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0037  */
        /* JADX WARN: Code duplicated, block: B:18:0x0058 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0056 -> B:19:0x0059). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0037
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f81300y
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r6.f81299x
                kotlin.jvm.internal.f0 r1 = (p715kotlin.jvm.internal.C22667f0) r1
                java.lang.Object r3 = r6.f81298w
                kotlin.jvm.internal.d0 r3 = (p715kotlin.jvm.internal.C22663d0) r3
                p505ts.AbstractC34132o.m107864I(r7)
                goto L59
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                kotlin.jvm.internal.d0 r7 = new kotlin.jvm.internal.d0
                r7.<init>()
                float r1 = r6.f81301z
                r7.f89331w = r1
                kotlin.jvm.internal.f0 r1 = new kotlin.jvm.internal.f0
                r1.<init>()
                r3 = r7
            L2f:
                float r7 = r3.f89331w
                r4 = 0
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r7 != 0) goto L37
                goto L6a
            L37:
                j31.m<T> r7 = r6.f81297E
                bc3.k1 r7 = p711j31.AbstractC21282m.m59761h(r7)
                if (r7 == 0) goto L6a
                boolean r7 = r7.isActive()
                if (r7 != r2) goto L6a
                j31.m<T> r7 = r6.f81297E
                j31.n r4 = new j31.n
                r4.<init>()
                r6.f81298w = r3
                r6.f81299x = r1
                r6.f81300y = r2
                java.lang.Object r7 = p390p1.AbstractC28683x.m87246N(r4, r6)
                if (r7 != r0) goto L59
                return r0
            L59:
                j31.m<T> r7 = r6.f81297E
                dc3.l r7 = r7.getScrollChannel()
                float r4 = r3.f89331w
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r4)
                r7.mo32218s(r5)
                goto L2f
            L6a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p711j31.AbstractC21282m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: j31.m$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableState$onDrag$1$1", m100430f = "ReorderableState.kt", m100431l = {149}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81302w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC21282m<T> f81303x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ T f81304y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ T f81305z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC21282m<T> abstractC21282m, T t14, T t15, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81303x = abstractC21282m;
            this.f81304y = t14;
            this.f81305z = t15;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f81303x, this.f81304y, this.f81305z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81302w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ((AbstractC21282m) this.f81303x).onMove.invoke(new C21273d(this.f81303x.mo59719D(this.f81304y), this.f81303x.mo59720E(this.f81304y)), new C21273d(this.f81303x.mo59719D(this.f81305z), this.f81303x.mo59720E(this.f81305z)));
                AbstractC21282m<T> abstractC21282m = this.f81303x;
                int iMo59745z = abstractC21282m.mo59745z();
                int iMo59717A = this.f81303x.mo59717A();
                this.f81302w = 1;
                if (abstractC21282m.mo59730S(iMo59745z, iMo59717A, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j31.m$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableState$onDragCanceled$1", m100430f = "ReorderableState.kt", m100431l = {115}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81306w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC21282m<T> f81307x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21273d f81308y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f81309z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC21282m<T> abstractC21282m, C21273d c21273d, long j7, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81307x = abstractC21282m;
            this.f81308y = c21273d;
            this.f81309z = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f81307x, this.f81308y, this.f81309z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81306w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21271b dragCancelledAnimation = this.f81307x.getDragCancelledAnimation();
                C21273d c21273d = this.f81308y;
                long j7 = this.f81309z;
                this.f81306w = 1;
                if (dragCancelledAnimation.mo59685b(c21273d, j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j31.m$e */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableState$visibleItemsChanged$$inlined$flatMapLatest$1", m100430f = "ReorderableState.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f81310w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f81311x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f81312y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC21282m f81313z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, AbstractC21282m abstractC21282m) {
            super(3, interfaceC30057d);
            this.f81313z = abstractC21282m;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f81313z);
            eVar.f81311x = interfaceC13062m;
            eVar.f81312y = bool;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81310w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f81311x;
                InterfaceC13058l interfaceC13058lM87240H = ((Boolean) this.f81312y).booleanValue() ? AbstractC28683x.m87240H(new f(this.f81313z)) : new C0456u(null, 1);
                this.f81311x = null;
                this.f81312y = null;
                this.f81310w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM87240H, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: j31.m$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractC21282m<T> f81314w;

        public f(AbstractC21282m<T> abstractC21282m) {
            this.f81314w = abstractC21282m;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<T> invoke() {
            return this.f81314w.mo59726M();
        }
    }

    public AbstractC21282m(InterfaceC2994c0 scope, float f13, InterfaceC4351m onMove, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC21271b dragCancelledAnimation) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(onMove, "onMove");
        AbstractC22676k.m65750j(dragCancelledAnimation, "dragCancelledAnimation");
        this.scope = scope;
        this.maxScrollPerFrame = f13;
        this.onMove = onMove;
        this.canDragOver = interfaceC4351m;
        this.onDragEnd = interfaceC4351m2;
        this.dragCancelledAnimation = dragCancelledAnimation;
        this.draggingItemIndex = AbstractC28683x.m87272z(null);
        this.interactions = AbstractC30060g.m92111d(0, 7, null);
        this.scrollChannel = AbstractC30060g.m92111d(0, 7, null);
        this.draggingDelta = AbstractC28683x.m87272z(new C16617b(0L));
        this.selected = AbstractC28683x.m87272z(null);
        this.targets = new ArrayList();
        this.distances = new ArrayList();
    }

    /* JADX INFO: renamed from: I */
    private final T m59748I() {
        return (T) this.selected.getValue();
    }

    /* JADX INFO: renamed from: T */
    private final void m59749T(long j7) {
        this.draggingDelta.setValue(new C16617b(j7));
    }

    /* JADX INFO: renamed from: U */
    private final void m59750U(Integer num) {
        this.draggingItemIndex.setValue(num);
    }

    /* JADX INFO: renamed from: V */
    private final void m59751V(T t14) {
        this.selected.setValue(t14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final boolean m59752X(AbstractC21282m abstractC21282m) {
        return abstractC21282m.m59777u() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static final boolean m59753Y(AbstractC21282m abstractC21282m, List old, List list) {
        AbstractC22676k.m65750j(old, "old");
        AbstractC22676k.m65750j(list, "new");
        Object objM74100H0 = AbstractC25265s.m74100H0(old);
        Integer numValueOf = objM74100H0 != null ? Integer.valueOf(abstractC21282m.mo59719D(objM74100H0)) : null;
        Object objM74100H1 = AbstractC25265s.m74100H0(list);
        return AbstractC22676k.m65745e(numValueOf, objM74100H1 != null ? Integer.valueOf(abstractC21282m.mo59719D(objM74100H1)) : null) && old.size() == list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final float m59758e(float f13) {
        return f13 * f13 * f13 * f13 * f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final float m59759f(float f13) {
        float f14 = 1;
        float f15 = f14 - f13;
        return f14 - (((f15 * f15) * f15) * f15);
    }

    /* JADX INFO: renamed from: m */
    private final void m59766m(float scrollOffset) {
        if (scrollOffset == 0.0f) {
            m59768o();
            return;
        }
        InterfaceC3027k1 interfaceC3027k1 = this.autoscroller;
        if (interfaceC3027k1 == null || !interfaceC3027k1.isActive()) {
            this.autoscroller = AbstractC3006f0.m8732z(this.scope, null, null, new b(scrollOffset, this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x005a A[PHI: r2
      0x005a: PHI (r2v11 float) = (r2v10 float), (r2v14 float) binds: [B:19:0x006a, B:12:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: n */
    public final float m59767n(long time, float maxScroll) {
        float fM59779w;
        float fMo59727N;
        float fIntBitsToFloat;
        float fMo59725L;
        T tM59770y = m59770y();
        float f13 = 0.0f;
        if (tM59770y == null) {
            return 0.0f;
        }
        if (mo59728O()) {
            fM59779w = m59780x() + mo59723J(tM59770y);
            fMo59727N = mo59718B(tM59770y) + fM59779w;
            fIntBitsToFloat = Float.intBitsToFloat((int) (m59769t() & 4294967295L));
        } else {
            fM59779w = m59779w() + mo59721F(tM59770y);
            fMo59727N = mo59727N(tM59770y) + fM59779w;
            fIntBitsToFloat = Float.intBitsToFloat((int) (m59769t() >> 32));
        }
        if (fIntBitsToFloat > 0.0f) {
            fMo59725L = fMo59727N - mo59724K();
            if (fMo59725L >= 0.0f) {
                f13 = fMo59725L;
            }
        } else if (fIntBitsToFloat < 0.0f) {
            fMo59725L = fM59779w - mo59725L();
            if (fMo59725L <= 0.0f) {
                f13 = fMo59725L;
            }
        }
        return INSTANCE.m59782b((int) (fMo59727N - fM59779w), f13, time, maxScroll);
    }

    /* JADX INFO: renamed from: o */
    private final void m59768o() {
        InterfaceC3027k1 interfaceC3027k1 = this.autoscroller;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.autoscroller = null;
    }

    /* JADX INFO: renamed from: t */
    private final long m59769t() {
        return ((C16617b) this.draggingDelta.getValue()).f63937a;
    }

    /* JADX INFO: renamed from: y */
    private final T m59770y() {
        for (T t14 : mo59726M()) {
            int iMo59719D = mo59719D(t14);
            Integer numM59777u = m59777u();
            if (numM59777u != null && iMo59719D == numM59777u.intValue()) {
                return t14;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo59717A();

    /* JADX INFO: renamed from: B */
    public abstract int mo59718B(T t14);

    /* JADX INFO: renamed from: C, reason: from getter */
    public final InterfaceC11927l getInteractions() {
        return this.interactions;
    }

    /* JADX INFO: renamed from: D */
    public abstract int mo59719D(T t14);

    /* JADX INFO: renamed from: E */
    public abstract Object mo59720E(T t14);

    /* JADX INFO: renamed from: F */
    public abstract int mo59721F(T t14);

    /* JADX INFO: renamed from: G */
    public abstract int mo59722G(T t14);

    /* JADX INFO: renamed from: H, reason: from getter */
    public final InterfaceC11927l getScrollChannel() {
        return this.scrollChannel;
    }

    /* JADX INFO: renamed from: J */
    public abstract int mo59723J(T t14);

    /* JADX INFO: renamed from: K */
    public abstract int mo59724K();

    /* JADX INFO: renamed from: L */
    public abstract int mo59725L();

    /* JADX INFO: renamed from: M */
    public abstract List<T> mo59726M();

    /* JADX INFO: renamed from: N */
    public abstract int mo59727N(T t14);

    /* JADX INFO: renamed from: O */
    public abstract boolean mo59728O();

    /* JADX INFO: renamed from: P */
    public final void m59773P(int offsetX, int offsetY) {
        T tM59748I = m59748I();
        if (tM59748I == null) {
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m59769t() >> 32)) + offsetX;
        m59749T((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (m59769t() & 4294967295L)) + offsetY)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        T tM59770y = m59770y();
        if (tM59770y == null) {
            return;
        }
        T tMo59742p = mo59742p(tM59770y, mo59743q((int) Float.intBitsToFloat((int) (m59769t() >> 32)), (int) Float.intBitsToFloat((int) (m59769t() & 4294967295L)), tM59748I), (int) (m59779w() + mo59721F(tM59770y)), (int) (m59780x() + mo59723J(tM59770y)));
        if (tMo59742p != null) {
            if (mo59719D(tMo59742p) == mo59745z() || mo59719D(tM59770y) == mo59745z()) {
                AbstractC3006f0.m8732z(this.scope, null, null, new c(this, tM59770y, tMo59742p, null), 3);
            } else {
                this.onMove.invoke(new C21273d(mo59719D(tM59770y), mo59720E(tM59770y)), new C21273d(mo59719D(tMo59742p), mo59720E(tMo59742p)));
            }
            m59750U(Integer.valueOf(mo59719D(tMo59742p)));
        }
        float fM59767n = m59767n(0L, this.maxScrollPerFrame);
        if (fM59767n == 0.0f) {
            return;
        }
        m59766m(fM59767n);
    }

    /* JADX INFO: renamed from: Q */
    public final void m59774Q() {
        AbstractC21282m<T> abstractC21282m;
        Integer numM59777u = m59777u();
        if (numM59777u != null) {
            int iIntValue = numM59777u.intValue();
            T tM59748I = m59748I();
            abstractC21282m = this;
            AbstractC3006f0.m8732z(this.scope, null, null, new d(abstractC21282m, new C21273d(iIntValue, tM59748I != null ? mo59720E(tM59748I) : null), (((long) Float.floatToRawIntBits(m59779w())) << 32) | (((long) Float.floatToRawIntBits(m59780x())) & 4294967295L), null), 3);
        } else {
            abstractC21282m = this;
        }
        T tM59748I2 = m59748I();
        Integer numValueOf = tM59748I2 != null ? Integer.valueOf(mo59719D(tM59748I2)) : null;
        Integer numM59777u2 = m59777u();
        m59751V(null);
        m59749T(0L);
        m59750U(null);
        m59768o();
        InterfaceC4351m interfaceC4351m = abstractC21282m.onDragEnd;
        if (interfaceC4351m == null || numValueOf == null || numM59777u2 == null) {
            return;
        }
        interfaceC4351m.invoke(numValueOf, numM59777u2);
    }

    /* JADX INFO: renamed from: R */
    public boolean mo59729R(int offsetX, int offsetY) {
        T t14;
        T next;
        if (mo59728O()) {
            offsetY += mo59725L();
        } else {
            offsetX += mo59725L();
        }
        Iterator<T> it = mo59726M().iterator();
        while (true) {
            t14 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iMo59721F = mo59721F(next);
            if (offsetX <= mo59722G(next) && iMo59721F <= offsetX) {
                int iMo59723J = mo59723J(next);
                if (offsetY <= mo59744r(next) && iMo59723J <= offsetY) {
                    break;
                }
            }
        }
        if (next != null) {
            m59751V(next);
            m59750U(Integer.valueOf(mo59719D(next)));
            t14 = next;
        }
        return t14 != null;
    }

    /* JADX INFO: renamed from: S */
    public abstract Object mo59730S(int i13, int i14, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: W */
    public final InterfaceC13058l m59775W() {
        return AbstractC13091v.m36609s(new C21279j(this, 1), new C4588i(AbstractC13091v.m36590P(AbstractC28683x.m87240H(new C21278i(this, 2)), new e(null, this)), 2));
    }

    /* JADX INFO: renamed from: p */
    public T mo59742p(T draggedItemInfo, List<? extends T> items, int curX, int curY) {
        int iMo59744r;
        int iAbs;
        int iMo59723J;
        int iAbs2;
        int iMo59721F;
        int iAbs3;
        int iMo59722G;
        int iAbs4;
        AbstractC22676k.m65750j(items, "items");
        T t14 = null;
        if (draggedItemInfo == null) {
            if (m59777u() != null) {
                return (T) AbstractC25265s.m74114R0(items);
            }
            return null;
        }
        int iMo59727N = mo59727N(draggedItemInfo) + curX;
        int iMo59718B = mo59718B(draggedItemInfo) + curY;
        int iMo59721F2 = curX - mo59721F(draggedItemInfo);
        int iMo59723J2 = curY - mo59723J(draggedItemInfo);
        int size = items.size();
        int i13 = -1;
        for (int i14 = 0; i14 < size; i14++) {
            T t15 = items.get(i14);
            if (iMo59721F2 > 0 && (iMo59722G = mo59722G(t15) - iMo59727N) < 0 && mo59722G(t15) > mo59722G(draggedItemInfo) && (iAbs4 = Math.abs(iMo59722G)) > i13) {
                t14 = t15;
                i13 = iAbs4;
            }
            if (iMo59721F2 < 0 && (iMo59721F = mo59721F(t15) - curX) > 0 && mo59721F(t15) < mo59721F(draggedItemInfo) && (iAbs3 = Math.abs(iMo59721F)) > i13) {
                t14 = t15;
                i13 = iAbs3;
            }
            if (iMo59723J2 < 0 && (iMo59723J = mo59723J(t15) - curY) > 0 && mo59723J(t15) < mo59723J(draggedItemInfo) && (iAbs2 = Math.abs(iMo59723J)) > i13) {
                t14 = t15;
                i13 = iAbs2;
            }
            if (iMo59723J2 > 0 && (iMo59744r = mo59744r(t15) - iMo59718B) < 0 && mo59744r(t15) > mo59744r(draggedItemInfo) && (iAbs = Math.abs(iMo59744r)) > i13) {
                t14 = t15;
                i13 = iAbs;
            }
        }
        return t14;
    }

    /* JADX INFO: renamed from: q */
    public List<T> mo59743q(int x3, int y13, T selected) {
        int i13;
        this.targets.clear();
        this.distances.clear();
        int iMo59721F = mo59721F(selected) + x3;
        int iMo59722G = mo59722G(selected) + x3;
        int iMo59723J = mo59723J(selected) + y13;
        int iMo59744r = mo59744r(selected) + y13;
        int i14 = (iMo59721F + iMo59722G) / 2;
        int i15 = (iMo59723J + iMo59744r) / 2;
        List<T> listMo59726M = mo59726M();
        int size = listMo59726M.size();
        int i16 = 0;
        while (i16 < size) {
            T t14 = listMo59726M.get(i16);
            int iMo59719D = mo59719D(t14);
            Integer numM59777u = m59777u();
            if ((numM59777u != null && iMo59719D == numM59777u.intValue()) || mo59744r(t14) < iMo59723J || mo59723J(t14) > iMo59744r || mo59722G(t14) < iMo59721F || mo59721F(t14) > iMo59722G) {
                i13 = iMo59721F;
            } else {
                InterfaceC4351m interfaceC4351m = this.canDragOver;
                if (interfaceC4351m != null) {
                    i13 = iMo59721F;
                    if (!((Boolean) interfaceC4351m.invoke(new C21273d(mo59719D(t14), mo59720E(t14)), new C21273d(mo59719D(selected), mo59720E(selected)))).booleanValue()) {
                    }
                } else {
                    i13 = iMo59721F;
                }
                int iAbs = Math.abs(i14 - ((mo59722G(t14) + mo59721F(t14)) / 2));
                int iAbs2 = Math.abs(i15 - ((mo59744r(t14) + mo59723J(t14)) / 2));
                int i17 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                int size2 = this.targets.size();
                int i18 = 0;
                for (int i19 = 0; i19 < size2 && i17 > this.distances.get(i19).intValue(); i19++) {
                    i18++;
                }
                this.targets.add(i18, t14);
                this.distances.add(i18, Integer.valueOf(i17));
            }
            i16++;
            iMo59721F = i13;
        }
        return this.targets;
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo59744r(T t14);

    /* JADX INFO: renamed from: s, reason: from getter */
    public final InterfaceC21271b getDragCancelledAnimation() {
        return this.dragCancelledAnimation;
    }

    /* JADX INFO: renamed from: u */
    public final Integer m59777u() {
        return (Integer) this.draggingItemIndex.getValue();
    }

    /* JADX INFO: renamed from: v */
    public final Object m59778v() {
        T tM59748I = m59748I();
        if (tM59748I != null) {
            return mo59720E(tM59748I);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final float m59779w() {
        T tM59770y = m59770y();
        if (tM59770y == null) {
            return 0.0f;
        }
        T tM59748I = m59748I();
        return (Float.intBitsToFloat((int) (m59769t() >> 32)) + (tM59748I != null ? mo59721F(tM59748I) : 0)) - mo59721F(tM59770y);
    }

    /* JADX INFO: renamed from: x */
    public final float m59780x() {
        T tM59770y = m59770y();
        if (tM59770y == null) {
            return 0.0f;
        }
        T tM59748I = m59748I();
        return (Float.intBitsToFloat((int) (m59769t() & 4294967295L)) + (tM59748I != null ? mo59723J(tM59748I) : 0)) - mo59723J(tM59770y);
    }

    /* JADX INFO: renamed from: z */
    public abstract int mo59745z();
}
