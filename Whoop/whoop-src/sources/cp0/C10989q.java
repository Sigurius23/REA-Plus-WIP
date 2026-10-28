package cp0;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p479s4.AbstractC32128i;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: cp0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001Ba\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R0\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lcp0/q;", "Lt2/a;", "Lkotlin/Function1;", "", "", "canDrag", "dispatchDelta", "Lkotlin/Function2;", "Lq83/d;", "", "settleDrawer", "Lkotlin/Function0;", "Ll83/a0;", "onDragStart", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;)V", "velocity", "Ly3/q;", "b", "(FLq83/d;)Ljava/lang/Object;", "Lh2/b;", "available", "source", "l0", "(JI)J", "consumed", "J", "(JJI)J", "p0", "(JLq83/d;)Ljava/lang/Object;", "V", "(JJLq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkotlin/jvm/functions/Function1;", "x", "y", "Lc93/m;", "z", "Lc93/a;", "E", "Z", "dragging", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10989q implements InterfaceC33313a {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean dragging;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Function1 canDrag;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Function1 dispatchDelta;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC4351m settleDrawer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC4339a onDragStart;

    /* JADX INFO: renamed from: cp0.q$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollConnection", m100430f = "CoachDrawerOverScroll.kt", m100431l = {147}, m100432m = "settle-OhffZ5M", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        float f34280w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f34281x;

        /* JADX INFO: renamed from: z */
        int f34283z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34281x = obj;
            this.f34283z |= Integer.MIN_VALUE;
            return C10989q.this.m29340b(0.0f, this);
        }
    }

    public C10989q(Function1 canDrag, Function1 dispatchDelta, InterfaceC4351m settleDrawer, InterfaceC4339a onDragStart) {
        AbstractC22676k.m65750j(canDrag, "canDrag");
        AbstractC22676k.m65750j(dispatchDelta, "dispatchDelta");
        AbstractC22676k.m65750j(settleDrawer, "settleDrawer");
        AbstractC22676k.m65750j(onDragStart, "onDragStart");
        this.canDrag = canDrag;
        this.dispatchDelta = dispatchDelta;
        this.settleDrawer = settleDrawer;
        this.onDragStart = onDragStart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m29340b(float f13, InterfaceC30057d<? super C39185q> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f34283z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f34283z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objInvoke = aVar.f34281x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f34283z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            InterfaceC4351m interfaceC4351m = this.settleDrawer;
            Float f14 = new Float(f13);
            aVar.f34280w = f13;
            aVar.f34283z = 1;
            objInvoke = interfaceC4351m.invoke(f14, aVar);
            if (objInvoke == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f13 = aVar.f34280w;
            AbstractC34132o.m107864I(objInvoke);
        }
        return new C39185q(AbstractC32128i.m100047a(0.0f, f13 - ((Number) objInvoke).floatValue()));
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public long mo9761J(long consumed, long available, int source) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (available & 4294967295L));
        if (source != 1 || fIntBitsToFloat == 0.0f || !((Boolean) this.canDrag.invoke(Float.valueOf(fIntBitsToFloat))).booleanValue()) {
            return 0L;
        }
        if (!this.dragging) {
            this.onDragStart.invoke();
            this.dragging = true;
        }
        return (4294967295L & ((long) Float.floatToRawIntBits(((Number) this.dispatchDelta.invoke(Float.valueOf(fIntBitsToFloat))).floatValue()))) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: V */
    public Object mo9762V(long j7, long j13, InterfaceC30057d<? super C39185q> interfaceC30057d) {
        this.dragging = false;
        if (C39185q.m124814e(j13) == 0.0f || !((Boolean) this.canDrag.invoke(new Float(C39185q.m124814e(j13)))).booleanValue()) {
            return new C39185q(0L);
        }
        this.onDragStart.invoke();
        return m29340b(C39185q.m124814e(j13), interfaceC30057d);
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: l0 */
    public long mo29341l0(long available, int source) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (available & 4294967295L));
        if (!this.dragging || source != 1 || fIntBitsToFloat == 0.0f || !((Boolean) this.canDrag.invoke(Float.valueOf(fIntBitsToFloat))).booleanValue()) {
            return 0L;
        }
        float fFloatValue = ((Number) this.dispatchDelta.invoke(Float.valueOf(fIntBitsToFloat))).floatValue();
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fFloatValue)));
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: p0 */
    public Object mo29342p0(long j7, InterfaceC30057d<? super C39185q> interfaceC30057d) {
        if (!this.dragging) {
            return new C39185q(0L);
        }
        this.dragging = false;
        return m29340b(C39185q.m124814e(j7), interfaceC30057d);
    }
}
