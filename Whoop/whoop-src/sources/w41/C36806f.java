package w41;

import eu.C13612g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: w41.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR:\u0010\u0015\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R:\u0010\u0018\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R:\u0010\u001b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R+\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lw41/f;", "", "Leu/g;", "cameraPositionState", "<init>", "(Leu/g;)V", "Ll83/a0;", "f", "(Lq83/d;)Ljava/lang/Object;", "k", "l", "a", "Leu/g;", "()Leu/g;", "Lkotlin/Function1;", "Lq83/d;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "g", "(Lkotlin/jvm/functions/Function1;)V", "recenterAction", "c", "i", "zoomInAction", "d", "j", "zoomOutAction", "", "<set-?>", "e", "Lp1/c1;", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Z)V", "isRecenterAvailable", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36806f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13612g cameraPositionState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function1 recenterAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function1 zoomInAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1 zoomOutAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC28601c1 isRecenterAvailable;

    /* JADX INFO: renamed from: w41.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.ActivityMapController$recenter$2", m100430f = "ActivityMapController.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f157446w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36806f.this.new a(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f157446w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function1 recenterAction = C36806f.this.getRecenterAction();
                if (recenterAction != null) {
                    this.f157446w = 1;
                    if (recenterAction.invoke(this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: w41.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.ActivityMapController$zoomIn$2", m100430f = "ActivityMapController.kt", m100431l = {30, 32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f157448w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36806f.this.new b(interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            if (r7.invoke(r6) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            if (r7.m38430b(r1, 300, r6) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f157448w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L15:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L62
            L19:
                p505ts.AbstractC34132o.m107864I(r7)
                w41.f r7 = w41.C36806f.this
                kotlin.jvm.functions.Function1 r7 = r7.getZoomInAction()
                if (r7 == 0) goto L35
                w41.f r7 = w41.C36806f.this
                kotlin.jvm.functions.Function1 r7 = r7.getZoomInAction()
                if (r7 == 0) goto L62
                r6.f157448w = r3
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L62
                goto L61
            L35:
                w41.f r7 = w41.C36806f.this
                eu.g r7 = r7.getCameraPositionState()
                up.a r1 = new up.a     // Catch: android.os.RemoteException -> L65
                vp.a r4 = s30.AbstractC32103e.m99894q()     // Catch: android.os.RemoteException -> L65
                android.os.Parcel r5 = r4.m57322k0()     // Catch: android.os.RemoteException -> L65
                android.os.Parcel r3 = r4.m57321j0(r5, r3)     // Catch: android.os.RemoteException -> L65
                android.os.IBinder r4 = r3.readStrongBinder()     // Catch: android.os.RemoteException -> L65
                cp.a r4 = p072cp.BinderC10935b.m28986X(r4)     // Catch: android.os.RemoteException -> L65
                r3.recycle()     // Catch: android.os.RemoteException -> L65
                r1.<init>(r4)     // Catch: android.os.RemoteException -> L65
                r6.f157448w = r2
                r2 = 300(0x12c, float:4.2E-43)
                java.lang.Object r7 = r7.m38430b(r1, r2, r6)
                if (r7 != r0) goto L62
            L61:
                return r0
            L62:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            L65:
                r7 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w41.C36806f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: w41.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.activitymap.ActivityMapController$zoomOut$2", m100430f = "ActivityMapController.kt", m100431l = {38, 40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f157450w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C36806f.this.new c(interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            if (r6.invoke(r5) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            if (r6.m38430b(r1, 300, r5) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f157450w
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L19
                if (r1 == r2) goto L15
                if (r1 != r3) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L62
            L19:
                p505ts.AbstractC34132o.m107864I(r6)
                w41.f r6 = w41.C36806f.this
                kotlin.jvm.functions.Function1 r6 = r6.getZoomOutAction()
                if (r6 == 0) goto L35
                w41.f r6 = w41.C36806f.this
                kotlin.jvm.functions.Function1 r6 = r6.getZoomOutAction()
                if (r6 == 0) goto L62
                r5.f157450w = r2
                java.lang.Object r6 = r6.invoke(r5)
                if (r6 != r0) goto L62
                goto L61
            L35:
                w41.f r6 = w41.C36806f.this
                eu.g r6 = r6.getCameraPositionState()
                up.a r1 = new up.a     // Catch: android.os.RemoteException -> L65
                vp.a r2 = s30.AbstractC32103e.m99894q()     // Catch: android.os.RemoteException -> L65
                android.os.Parcel r4 = r2.m57322k0()     // Catch: android.os.RemoteException -> L65
                android.os.Parcel r2 = r2.m57321j0(r4, r3)     // Catch: android.os.RemoteException -> L65
                android.os.IBinder r4 = r2.readStrongBinder()     // Catch: android.os.RemoteException -> L65
                cp.a r4 = p072cp.BinderC10935b.m28986X(r4)     // Catch: android.os.RemoteException -> L65
                r2.recycle()     // Catch: android.os.RemoteException -> L65
                r1.<init>(r4)     // Catch: android.os.RemoteException -> L65
                r5.f157450w = r3
                r2 = 300(0x12c, float:4.2E-43)
                java.lang.Object r6 = r6.m38430b(r1, r2, r5)
                if (r6 != r0) goto L62
            L61:
                return r0
            L62:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            L65:
                r6 = move-exception
                com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w41.C36806f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C36806f(C13612g cameraPositionState) {
        AbstractC22676k.m65750j(cameraPositionState, "cameraPositionState");
        this.cameraPositionState = cameraPositionState;
        this.isRecenterAvailable = AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C13612g getCameraPositionState() {
        return this.cameraPositionState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Function1 getRecenterAction() {
        return this.recenterAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Function1 getZoomInAction() {
        return this.zoomInAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Function1 getZoomOutAction() {
        return this.zoomOutAction;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m117964e() {
        return ((Boolean) this.isRecenterAvailable.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final Object m117965f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM117946d = AbstractC36803c.m117946d(new a(null), interfaceC30057d);
        return objM117946d == EnumC31071a.f128113w ? objM117946d : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final void m117966g(Function1 function1) {
        this.recenterAction = function1;
    }

    /* JADX INFO: renamed from: h */
    public final void m117967h(boolean z4) {
        this.isRecenterAvailable.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: i */
    public final void m117968i(Function1 function1) {
        this.zoomInAction = function1;
    }

    /* JADX INFO: renamed from: j */
    public final void m117969j(Function1 function1) {
        this.zoomOutAction = function1;
    }

    /* JADX INFO: renamed from: k */
    public final Object m117970k(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM117946d = AbstractC36803c.m117946d(new b(null), interfaceC30057d);
        return objM117946d == EnumC31071a.f128113w ? objM117946d : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m117971l(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM117946d = AbstractC36803c.m117946d(new c(null), interfaceC30057d);
        return objM117946d == EnumC31071a.f128113w ? objM117946d : C23454a0.f92919a;
    }
}
