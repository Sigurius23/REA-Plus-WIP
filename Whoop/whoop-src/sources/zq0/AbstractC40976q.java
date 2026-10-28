package zq0;

import c93.InterfaceC4339a;
import p492t2.InterfaceC33313a;
import p636y3.C39185q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: zq0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lzq0/p;", "tracker", "Lkotlin/Function0;", "", "isAtTop", "", "thresholdPx", "velocityThresholdPx", "Ll83/a0;", "onDismiss", "onSnapBack", "Lt2/a;", "a", "(Lzq0/p;Lc93/a;FFLc93/a;Lc93/a;)Lt2/a;", "community-everyday-stats_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40976q {

    /* JADX INFO: renamed from: zq0.q$a */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"zq0/q$a", "Lt2/a;", "Lh2/b;", "available", "", "source", "l0", "(JI)J", "consumed", "J", "(JJI)J", "Ly3/q;", "p0", "(JLq83/d;)Ljava/lang/Object;", "V", "(JJLq83/d;)Ljava/lang/Object;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC33313a {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4339a f176859E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4339a f176860F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C40975p f176861w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f176862x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f176863y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f176864z;

        public a(C40975p c40975p, InterfaceC4339a interfaceC4339a, float f13, float f14, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3) {
            this.f176861w = c40975p;
            this.f176862x = interfaceC4339a;
            this.f176863y = f13;
            this.f176864z = f14;
            this.f176859E = interfaceC4339a2;
            this.f176860F = interfaceC4339a3;
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: J */
        public long mo9761J(long consumed, long available, int source) {
            if (source != 1 || this.f176861w.getHeaderOwnsGesture()) {
                return 0L;
            }
            float fM133042g = this.f176861w.m133042g();
            this.f176861w.m133047l(Float.intBitsToFloat((int) (available >> 32)), Float.intBitsToFloat((int) (available & 4294967295L)), ((Boolean) this.f176862x.invoke()).booleanValue(), Float.intBitsToFloat((int) (consumed & 4294967295L)) == 0.0f && ((Boolean) this.f176862x.invoke()).booleanValue());
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f176861w.m133042g() - fM133042g)) & 4294967295L);
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: V */
        public Object mo9762V(long j7, long j13, InterfaceC30057d<? super C39185q> interfaceC30057d) {
            this.f176861w.m133048o();
            return new C39185q(0L);
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: l0 */
        public long mo29341l0(long available, int source) {
            if (source != 1 || this.f176861w.getHeaderOwnsGesture()) {
                return 0L;
            }
            this.f176861w.m133039d(((Boolean) this.f176862x.invoke()).booleanValue());
            return this.f176861w.m133038b(available);
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: p0 */
        public Object mo29342p0(long j7, InterfaceC30057d<? super C39185q> interfaceC30057d) {
            if (this.f176861w.getHeaderOwnsGesture()) {
                return new C39185q(0L);
            }
            if (this.f176861w.m133040e(C39185q.m124813d(j7), C39185q.m124814e(j7), ((Boolean) this.f176862x.invoke()).booleanValue(), this.f176863y, this.f176864z)) {
                this.f176859E.invoke();
                return new C39185q(j7);
            }
            if (this.f176861w.m133051t()) {
                this.f176860F.invoke();
            }
            return new C39185q(0L);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC33313a m133053a(C40975p tracker, InterfaceC4339a isAtTop, float f13, float f14, InterfaceC4339a onDismiss, InterfaceC4339a onSnapBack) {
        AbstractC22676k.m65750j(tracker, "tracker");
        AbstractC22676k.m65750j(isAtTop, "isAtTop");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onSnapBack, "onSnapBack");
        return new a(tracker, isAtTop, f13, f14, onDismiss, onSnapBack);
    }
}
