package z41;

import a51.AbstractC0387b;
import a51.C0386a;
import a51.C0389d;
import a51.C0390e;
import a51.C0393h;
import b51.InterfaceC2737a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: z41.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0014\"\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006*"}, m65681d2 = {"Lz41/e;", "", "Lz41/g;", "particleSystemSettings", "", "createdAt", "", "La51/h;", "initialParticles", "", "pixelDensity", "<init>", "(Lz41/g;JLjava/util/List;F)V", "deltaTime", "Lb51/a;", "drawArea", "g", "(FLb51/a;Lq83/d;)Ljava/lang/Object;", "", "f", "()Z", "a", "Lz41/g;", "e", "()Lz41/g;", "b", "J", "c", "()J", "Ljava/util/List;", "getInitialParticles", "()Ljava/util/List;", "d", "Z", "setEnabled", "(Z)V", "enabled", "La51/b;", "La51/b;", "emitter", "", "activeParticles", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40070e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C40072g particleSystemSettings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long createdAt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C0393h> initialParticles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private AbstractC0387b emitter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C0393h> activeParticles;

    /* JADX INFO: renamed from: z41.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.particles.ParticleSystem$render$2", m100430f = "ParticleSystem.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "La51/h;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172903w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f172905y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2737a f172906z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f13, InterfaceC2737a interfaceC2737a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f172905y = f13;
            this.f172906z = interfaceC2737a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m128421h(C0393h c0393h) {
            return c0393h.m1084h();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40070e.this.new a(this.f172905y, this.f172906z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<C0393h>> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C0390e c0390eM1063a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f172903w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (C40070e.this.getEnabled()) {
                C40070e.this.activeParticles.addAll(C40070e.this.emitter.mo1059a(this.f172905y, C40070e.this.getParticleSystemSettings(), this.f172906z));
            }
            C0389d animations = C40070e.this.getParticleSystemSettings().getEmitter().getAnimations();
            if (animations != null) {
                Duration.Companion companion = Duration.INSTANCE;
                c0390eM1063a = animations.m1063a((float) Duration.m134298toDoubleimpl(DurationKt.toDuration(System.currentTimeMillis() - C40070e.this.getCreatedAt(), DurationUnit.MILLISECONDS), DurationUnit.SECONDS), this.f172906z);
            } else {
                c0390eM1063a = null;
            }
            List list = C40070e.this.activeParticles;
            float f13 = this.f172905y;
            InterfaceC2737a interfaceC2737a = this.f172906z;
            C40070e c40070e = C40070e.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C0393h) it.next()).m1085j(f13, interfaceC2737a, c0390eM1063a, c40070e.getParticleSystemSettings().getRotationSpeed());
            }
            AbstractC25265s.m74132j1(C40070e.this.activeParticles, new C40069d());
            List list2 = C40070e.this.activeParticles;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((C0393h) obj2).getDrawParticle()) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    public C40070e(C40072g particleSystemSettings, long j7, List<C0393h> initialParticles, float f13) {
        AbstractC22676k.m65750j(particleSystemSettings, "particleSystemSettings");
        AbstractC22676k.m65750j(initialParticles, "initialParticles");
        this.particleSystemSettings = particleSystemSettings;
        this.createdAt = j7;
        this.initialParticles = initialParticles;
        this.enabled = true;
        this.emitter = new C0386a(particleSystemSettings.getEmitter(), f13, null, 4, null);
        this.activeParticles = AbstractC25265s.m74097F1(initialParticles);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C40072g getParticleSystemSettings() {
        return this.particleSystemSettings;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m128418f() {
        if (this.emitter.mo1060b() && this.activeParticles.size() == 0) {
            return true;
        }
        return !this.enabled && this.activeParticles.size() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final Object m128419g(float f13, InterfaceC2737a interfaceC2737a, InterfaceC30057d<? super List<C0393h>> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new a(f13, interfaceC2737a, null), interfaceC30057d);
    }

    public /* synthetic */ C40070e(C40072g c40072g, long j7, List list, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40072g, (i13 & 2) != 0 ? System.currentTimeMillis() : j7, (i13 & 4) != 0 ? C25271y.f99162w : list, f13);
    }
}
