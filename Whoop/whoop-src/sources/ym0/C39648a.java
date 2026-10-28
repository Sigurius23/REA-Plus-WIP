package ym0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import mm0.C25683b;
import mm0.InterfaceC25682a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vm0.InterfaceC36149g;

/* JADX INFO: renamed from: ym0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lym0/a;", "", "Lmm0/a;", "cache", "Lvm0/g;", "reporter", "<init>", "(Lmm0/a;Lvm0/g;)V", "", "uri", "Lym0/b;", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "c", "(Ljava/lang/String;)Lec3/l;", "a", "Lmm0/a;", "b", "Lvm0/g;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39648a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25682a cache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC36149g reporter;

    /* JADX INFO: renamed from: ym0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.cache.stream.cache.CacheStream$entries$1", m100430f = "CacheStream.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, 21}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lym0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f170589E;

        /* JADX INFO: renamed from: w */
        Object f170590w;

        /* JADX INFO: renamed from: x */
        int f170591x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f170592y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170589E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C39648a.this.new a(this.f170589E, interfaceC30057d);
            aVar.f170592y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f170592y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f170591x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L24
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r5.f170590w
                ym0.b r0 = (ym0.AbstractC39649b) r0
                p505ts.AbstractC34132o.m107864I(r6)
                goto L4f
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L36
            L24:
                p505ts.AbstractC34132o.m107864I(r6)
                ym0.a r6 = ym0.C39648a.this
                java.lang.String r2 = r5.f170589E
                r5.f170592y = r0
                r5.f170591x = r4
                java.lang.Object r6 = ym0.C39648a.m126762a(r6, r2, r5)
                if (r6 != r1) goto L36
                goto L4e
            L36:
                ym0.b r6 = (ym0.AbstractC39649b) r6
                ym0.a r2 = ym0.C39648a.this
                vm0.g r2 = ym0.C39648a.m126763b(r2)
                r2.mo114996j(r6)
                r2 = 0
                r5.f170592y = r2
                r5.f170590w = r2
                r5.f170591x = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L4f
            L4e:
                return r1
            L4f:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ym0.C39648a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ym0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.cache.stream.cache.CacheStream", m100430f = "CacheStream.kt", m100431l = {26}, m100432m = "fetchEntry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f170594w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f170595x;

        /* JADX INFO: renamed from: z */
        int f170597z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f170595x = obj;
            this.f170597z |= Integer.MIN_VALUE;
            return C39648a.this.m126764d(null, this);
        }
    }

    public C39648a(InterfaceC25682a cache, InterfaceC36149g reporter) {
        AbstractC22676k.m65750j(cache, "cache");
        AbstractC22676k.m65750j(reporter, "reporter");
        this.cache = cache;
        this.reporter = reporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m126764d(String str, InterfaceC30057d<? super AbstractC39649b> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f170597z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f170597z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo75620b = bVar.f170595x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f170597z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75620b);
            InterfaceC25682a interfaceC25682a = this.cache;
            bVar.f170594w = str;
            bVar.f170597z = 1;
            objMo75620b = interfaceC25682a.mo75620b(str, bVar);
            if (objMo75620b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f170594w;
            AbstractC34132o.m107864I(objMo75620b);
        }
        C25683b c25683b = (C25683b) objMo75620b;
        return c25683b != null ? new AbstractC39649b.a(c25683b) : new AbstractC39649b.b(str);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m126765c(String uri) {
        AbstractC22676k.m65750j(uri, "uri");
        return new C13084s1(new a(uri, null));
    }
}
