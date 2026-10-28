package um0;

import android.database.sqlite.SQLiteException;
import fy1.C14878n;
import fy1.InterfaceC14871g;
import j93.InterfaceC21461d;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vm0.C36144b;
import vm0.InterfaceC36143a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: um0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u000f\u0012B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lum0/e;", "", "Lum0/a;", "dao", "Ljs0/c;", "configurationRepository", "Lvm0/b;", "events", "Lfy1/g;", "nanoClock", "Ltr2/n;", "logger", "<init>", "(Lum0/a;Ljs0/c;Lvm0/b;Lfy1/g;Ltr2/n;)V", "Ll83/a0;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lum0/a;", "b", "Ljs0/c;", "c", "Lvm0/b;", "d", "Lfy1/g;", "e", "Ltr2/n;", "f", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35079e {

    /* JADX INFO: renamed from: f */
    private static final b f148821f = new b(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC35075a dao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36144b events;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14871g nanoClock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: um0.e$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lum0/e$a;", "Ljs0/a;", "", "<init>", "()V", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final a f148827a = new a();

        private a() {
            super("BFF_CACHE_LIMIT", 100);
        }
    }

    /* JADX INFO: renamed from: um0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lum0/e$b;", "", "<init>", "()V", "", "NANOS_PER_MS", "J", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: um0.e$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.persistence.CacheMaintainer", m100430f = "CacheMaintainer.kt", m100431l = {33, 36}, m100432m = "maintain", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f148828E;

        /* JADX INFO: renamed from: w */
        int f148829w;

        /* JADX INFO: renamed from: x */
        long f148830x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f148831y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f148831y = obj;
            this.f148828E |= Integer.MIN_VALUE;
            return C35079e.this.m110926a(this);
        }
    }

    public C35079e(AbstractC35075a dao, AbstractC21909c configurationRepository, C36144b events, InterfaceC14871g nanoClock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(events, "events");
        AbstractC22676k.m65750j(nanoClock, "nanoClock");
        AbstractC22676k.m65750j(logger, "logger");
        this.dao = dao;
        this.configurationRepository = configurationRepository;
        this.events = events;
        this.nanoClock = nanoClock;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m110926a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        int iIntValue;
        long j7;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f148828E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f148828E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo18333g = cVar.f148831y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f148828E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iIntValue = cVar.f148829w;
                    AbstractC34132o.m107864I(objMo18333g);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j7 = cVar.f148830x;
                    AbstractC34132o.m107864I(objMo18333g);
                }
                this.events.m114975a(new InterfaceC36143a.c(((Number) objMo18333g).intValue(), (this.nanoClock.mo42899a() - j7) / 1000000));
                return c23454a0;
            }
            AbstractC34132o.m107864I(objMo18333g);
            AbstractC21909c abstractC21909c = this.configurationRepository;
            a aVar = a.f148827a;
            C21908b configurations = abstractC21909c.getConfigurations();
            String name = aVar.getName();
            Object defaultValue = aVar.getDefaultValue();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
            Object objM125868N0 = null;
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                String str = (String) configurations.get(name);
                if (str != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                String str2 = (String) configurations.get(name);
                if (str2 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str2);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                String str3 = (String) configurations.get(name);
                if (str3 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str3);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                String str4 = (String) configurations.get(name);
                if (str4 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str4);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                String str5 = (String) configurations.get(name);
                if (str5 != null) {
                    objM125868N0 = AbstractC39414r.m125868N0(str5);
                }
            } else {
                objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
            }
            if (objM125868N0 != null) {
                defaultValue = objM125868N0;
            }
            if (defaultValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            iIntValue = ((Integer) defaultValue).intValue();
            if (iIntValue <= 0) {
                return c23454a0;
            }
            AbstractC35075a abstractC35075a = this.dao;
            cVar.f148829w = iIntValue;
            cVar.f148828E = 1;
            objMo18333g = abstractC35075a.mo18333g(cVar);
            if (objMo18333g == enumC31071a) {
            }
            return enumC31071a;
            if (((Number) objMo18333g).intValue() < iIntValue) {
                return c23454a0;
            }
            long jMo42899a = this.nanoClock.mo42899a();
            cVar.f148829w = iIntValue;
            cVar.f148830x = jMo42899a;
            cVar.f148828E = 2;
            objMo18333g = this.dao.mo18329c(iIntValue / 2, cVar);
            if (objMo18333g != enumC31071a) {
                j7 = jMo42899a;
                this.events.m114975a(new InterfaceC36143a.c(((Number) objMo18333g).intValue(), (this.nanoClock.mo42899a() - j7) / 1000000));
                return c23454a0;
            }
            return enumC31071a;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("BFF cache maintenance failed", e5, new AbstractC30556a.a[0]);
        }
    }

    public /* synthetic */ C35079e(AbstractC35075a abstractC35075a, AbstractC21909c abstractC21909c, C36144b c36144b, InterfaceC14871g interfaceC14871g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC35075a, abstractC21909c, c36144b, (i13 & 8) != 0 ? new C14878n() : interfaceC14871g, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CacheMaintainer") : interfaceC34116n);
    }
}
