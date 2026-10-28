package com.whoop.widget.p071ui.healthspan;

import ad3.AbstractC0757c;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.SerializationException;
import l03.C23058h;
import l83.C23454a0;
import p138f6.C14129a;
import p138f6.C14132d;
import p335n6.InterfaceC26395l;
import p395p6.C28901n0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000bJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/widget/ui/healthspan/a;", "", "Landroid/content/Context;", "context", "Lad3/c;", "json", "<init>", "(Landroid/content/Context;Lad3/c;)V", "", "Ln6/l;", "c", "(Lq83/d;)Ljava/lang/Object;", "", "d", "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;", "content", "Ll83/a0;", "f", "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lq83/d;)Ljava/lang/Object;", "", "batteryPercentage", "e", "(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;", "b", "a", "Landroid/content/Context;", "Lad3/c;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10920a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter", m100430f = "HealthspanWidgetStateWriter.kt", m100431l = {68, 72, 77}, m100432m = "clear", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f33719E;

        /* JADX INFO: renamed from: F */
        int f33720F;

        /* JADX INFO: renamed from: G */
        int f33721G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f33722H;

        /* JADX INFO: renamed from: J */
        int f33724J;

        /* JADX INFO: renamed from: w */
        Object f33725w;

        /* JADX INFO: renamed from: x */
        Object f33726x;

        /* JADX INFO: renamed from: y */
        Object f33727y;

        /* JADX INFO: renamed from: z */
        Object f33728z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33722H = obj;
            this.f33724J |= Integer.MIN_VALUE;
            return C10920a.this.m28968b(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter$clear$2$1", m100430f = "HealthspanWidgetStateWriter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33729w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33730x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f33730x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f33730x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33729w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(AbstractC15751g.m44441U("WIDGET_KEY_HEALTHSPAN_VIEW_STATE"));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter", m100430f = "HealthspanWidgetStateWriter.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "hasWidgets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f33731w;

        /* JADX INFO: renamed from: y */
        int f33733y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33731w = obj;
            this.f33733y |= Integer.MIN_VALUE;
            return C10920a.this.m28969d(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter", m100430f = "HealthspanWidgetStateWriter.kt", m100431l = {42, 46, 64}, m100432m = "updateBatteryPercentage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f33734E;

        /* JADX INFO: renamed from: F */
        Object f33735F;

        /* JADX INFO: renamed from: G */
        int f33736G;

        /* JADX INFO: renamed from: H */
        int f33737H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f33738I;

        /* JADX INFO: renamed from: K */
        int f33740K;

        /* JADX INFO: renamed from: w */
        Object f33741w;

        /* JADX INFO: renamed from: x */
        Object f33742x;

        /* JADX INFO: renamed from: y */
        Object f33743y;

        /* JADX INFO: renamed from: z */
        Object f33744z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33738I = obj;
            this.f33740K |= Integer.MIN_VALUE;
            return C10920a.this.m28970e(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter$updateBatteryPercentage$2$1", m100430f = "HealthspanWidgetStateWriter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33745w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33746x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Integer f33748z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Integer num, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33748z = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C10920a.this.new e(this.f33748z, interfaceC30057d);
            eVar.f33746x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            HealthspanWidgetViewState healthspanWidgetViewState;
            C14129a c14129a = (C14129a) this.f33746x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33745w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String str = (String) c14129a.mo40227b(AbstractC15751g.m44441U("WIDGET_KEY_HEALTHSPAN_VIEW_STATE"));
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (str != null) {
                try {
                    healthspanWidgetViewState = (HealthspanWidgetViewState) C10920a.this.json.m1831b(HealthspanWidgetViewState.INSTANCE.serializer(), str);
                } catch (SerializationException e5) {
                    InterfaceC34116n.INSTANCE.m107848a("HealthspanWidgetStateWriter").mo85213c("Failed to decode Healthspan widget state", e5, new AbstractC30556a.a[0]);
                    healthspanWidgetViewState = null;
                }
                HealthspanWidgetViewState healthspanWidgetViewState2 = healthspanWidgetViewState;
                if (healthspanWidgetViewState2 != null) {
                    c14129a.m40231h(AbstractC15751g.m44441U("WIDGET_KEY_HEALTHSPAN_VIEW_STATE"), C10920a.this.json.m1833d(HealthspanWidgetViewState.INSTANCE.serializer(), HealthspanWidgetViewState.copy$default(healthspanWidgetViewState2, null, null, null, null, null, null, null, false, this.f33748z, 255, null)));
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter", m100430f = "HealthspanWidgetStateWriter.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER, 26, 35}, m100432m = "writeContent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f33749E;

        /* JADX INFO: renamed from: F */
        Object f33750F;

        /* JADX INFO: renamed from: G */
        int f33751G;

        /* JADX INFO: renamed from: H */
        int f33752H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f33753I;

        /* JADX INFO: renamed from: K */
        int f33755K;

        /* JADX INFO: renamed from: w */
        Object f33756w;

        /* JADX INFO: renamed from: x */
        Object f33757x;

        /* JADX INFO: renamed from: y */
        Object f33758y;

        /* JADX INFO: renamed from: z */
        Object f33759z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33753I = obj;
            this.f33755K |= Integer.MIN_VALUE;
            return C10920a.this.m28971f(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter$writeContent$2$1", m100430f = "HealthspanWidgetStateWriter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33760w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33761x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ HealthspanWidgetViewState f33763z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HealthspanWidgetViewState healthspanWidgetViewState, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33763z = healthspanWidgetViewState;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C10920a.this.new g(this.f33763z, interfaceC30057d);
            gVar.f33761x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f33761x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33760w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM1833d = C10920a.this.json.m1833d(HealthspanWidgetViewState.INSTANCE.serializer(), this.f33763z);
            C14132d c14132dM44441U = AbstractC15751g.m44441U("WIDGET_KEY_HEALTHSPAN_VIEW_STATE");
            c14129a.getClass();
            c14129a.m40231h(c14132dM44441U, strM1833d);
            return C23454a0.f92919a;
        }
    }

    public C10920a(Context context, AbstractC0757c json) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(json, "json");
        this.context = context;
        this.json = json;
    }

    /* JADX INFO: renamed from: c */
    private final Object m28967c(InterfaceC30057d<? super List<? extends InterfaceC26395l>> interfaceC30057d) {
        return new C28901n0(this.context).m87820b(C23058h.class, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:26:0x0073->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28968b(q83.InterfaceC30057d<? super l83.C23454a0> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.whoop.widget.p071ui.healthspan.C10920a.a
            if (r0 == 0) goto L13
            r0 = r12
            com.whoop.widget.ui.healthspan.a$a r0 = (com.whoop.widget.p071ui.healthspan.C10920a.a) r0
            int r1 = r0.f33724J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33724J = r1
            goto L18
        L13:
            com.whoop.widget.ui.healthspan.a$a r0 = new com.whoop.widget.ui.healthspan.a$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f33722H
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f33724J
            r3 = 0
            l83.a0 r4 = l83.C23454a0.f92919a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L56
            if (r2 == r7) goto L52
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L34
            java.lang.Object r0 = r0.f33725w
            java.util.List r0 = (java.util.List) r0
            p505ts.AbstractC34132o.m107864I(r12)
            return r4
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3c:
            int r2 = r0.f33720F
            java.lang.Object r7 = r0.f33719E
            n6.l r7 = (p335n6.InterfaceC26395l) r7
            java.lang.Object r7 = r0.f33727y
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f33726x
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = r0.f33725w
            java.util.List r8 = (java.util.List) r8
            p505ts.AbstractC34132o.m107864I(r12)
            goto L73
        L52:
            p505ts.AbstractC34132o.m107864I(r12)
            goto L62
        L56:
            p505ts.AbstractC34132o.m107864I(r12)
            r0.f33724J = r7
            java.lang.Object r12 = r11.m28967c(r0)
            if (r12 != r1) goto L62
            goto Lb7
        L62:
            java.util.List r12 = (java.util.List) r12
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L6b
            goto Lb8
        L6b:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r7 = r12
            r2 = r3
        L73:
            boolean r12 = r7.hasNext()
            r8 = 0
            if (r12 == 0) goto L9e
            java.lang.Object r12 = r7.next()
            n6.l r12 = (p335n6.InterfaceC26395l) r12
            android.content.Context r9 = r11.context
            com.whoop.widget.ui.healthspan.a$b r10 = new com.whoop.widget.ui.healthspan.a$b
            r10.<init>(r8)
            r0.f33725w = r8
            r0.f33726x = r8
            r0.f33727y = r7
            r0.f33728z = r8
            r0.f33719E = r8
            r0.f33720F = r2
            r0.f33721G = r3
            r0.f33724J = r6
            java.lang.Object r12 = p481s6.AbstractC32229a.m100264k(r9, r12, r10, r0)
            if (r12 != r1) goto L73
            goto Lb7
        L9e:
            l03.h r12 = new l03.h
            r12.<init>()
            android.content.Context r2 = r11.context
            r0.f33725w = r8
            r0.f33726x = r8
            r0.f33727y = r8
            r0.f33728z = r8
            r0.f33719E = r8
            r0.f33724J = r5
            java.lang.Object r12 = pf.AbstractC29125c.m88519a0(r12, r2, r0)
            if (r12 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.widget.p071ui.healthspan.C10920a.m28968b(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m28969d(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f33733y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f33733y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM28967c = cVar.f33731w;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f33733y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM28967c);
            cVar.f33733y = 1;
            objM28967c = m28967c(cVar);
            if (objM28967c == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM28967c);
        }
        return Boolean.valueOf(!((Collection) objM28967c).isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:26:0x0082->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28970e(java.lang.Integer r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.widget.p071ui.healthspan.C10920a.m28970e(java.lang.Integer, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:26:0x0082->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28971f(com.whoop.widget.p071ui.healthspan.HealthspanWidgetViewState r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.widget.p071ui.healthspan.C10920a.m28971f(com.whoop.widget.ui.healthspan.HealthspanWidgetViewState, q83.d):java.lang.Object");
    }
}
