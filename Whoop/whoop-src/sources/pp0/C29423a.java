package pp0;

import j93.InterfaceC21461d;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import js0.C21908b;
import org.joda.time.JodaTimeUtilKt;
import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import sp0.EnumC32861a;
import sp0.InterfaceC32865e;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: pp0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lpp0/a;", "", "Lzr2/a;", "dateAndTimeProvider", "Ljs0/c;", "configurationRepository", "<init>", "(Lzr2/a;Ljs0/c;)V", "Lorg/joda/time/LocalDateTime;", "endTime", "", "b", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)Z", "", "maxDurationInHours", "a", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;I)Z", "Lsp0/a;", "activityType", "c", "(Lsp0/a;)I", "startTime", "Lsp0/e;", "d", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lsp0/a;)Lsp0/e;", "Lzr2/a;", "getDateAndTimeProvider", "()Lzr2/a;", "Ljs0/c;", "getConfigurationRepository", "()Ljs0/c;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29423a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: pp0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lpp0/a$a;", "Ljs0/a;", "", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final a f119465a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f119466b = 8;

        private a() {
            super("MAX_ACTIVITY_DURATION", 24);
        }
    }

    /* JADX INFO: renamed from: pp0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lpp0/a$b;", "Ljs0/a;", "", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final b f119467a = new b();

        /* JADX INFO: renamed from: b */
        public static final int f119468b = 8;

        private b() {
            super("MAX_SLEEP_DURATION", 24);
        }
    }

    public C29423a(InterfaceC41070a dateAndTimeProvider, AbstractC21909c configurationRepository) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.configurationRepository = configurationRepository;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m89693a(LocalDateTime localDateTime, LocalDateTime localDateTime2, int i13) {
        return JodaTimeUtilKt.millis(localDateTime2) - JodaTimeUtilKt.millis(localDateTime) >= ((long) i13) * 3600000;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m89694b(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        return JodaTimeUtilKt.millis(localDateTime) / 60000 == JodaTimeUtilKt.millis(localDateTime2) / 60000;
    }

    /* JADX INFO: renamed from: c */
    private final int m89695c(EnumC32861a activityType) {
        EnumC32861a enumC32861a = EnumC32861a.SLEEP;
        Class cls = Boolean.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Long.TYPE;
        Class cls5 = Integer.TYPE;
        Object objM125868N0 = null;
        if (activityType == enumC32861a) {
            AbstractC21909c abstractC21909c = this.configurationRepository;
            b bVar = b.f119467a;
            C21908b configurations = abstractC21909c.getConfigurations();
            String name = bVar.getName();
            Object defaultValue = bVar.getDefaultValue();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                String str = (String) configurations.get(name);
                if (str != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                String str2 = (String) configurations.get(name);
                if (str2 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str2);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                String str3 = (String) configurations.get(name);
                if (str3 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str3);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                String str4 = (String) configurations.get(name);
                if (str4 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str4);
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
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
            if (defaultValue != null) {
                return ((Integer) defaultValue).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        AbstractC21909c abstractC21909c2 = this.configurationRepository;
        a aVar = a.f119465a;
        C21908b configurations2 = abstractC21909c2.getConfigurations();
        String name2 = aVar.getName();
        Object defaultValue2 = aVar.getDefaultValue();
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass2 = c22673i1.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls5))) {
            String str6 = (String) configurations2.get(name2);
            if (str6 != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str6);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls4))) {
            String str7 = (String) configurations2.get(name2);
            if (str7 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str7);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls3))) {
            String str8 = (String) configurations2.get(name2);
            if (str8 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str8);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls2))) {
            String str9 = (String) configurations2.get(name2);
            if (str9 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str9);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(cls))) {
            String str10 = (String) configurations2.get(name2);
            if (str10 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str10);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i1.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
        }
        if (objM125868N0 != null) {
            defaultValue2 = objM125868N0;
        }
        if (defaultValue2 != null) {
            return ((Integer) defaultValue2).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC32865e m89696d(LocalDateTime startTime, LocalDateTime endTime, EnumC32861a activityType) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        if (startTime.isAfter(this.dateAndTimeProvider.mo133362a()) || endTime.isAfter(this.dateAndTimeProvider.mo133362a())) {
            return InterfaceC32865e.b.f136903a;
        }
        if (startTime.isAfter(endTime) || m89694b(startTime, endTime)) {
            return InterfaceC32865e.d.f136905a;
        }
        return (activityType == null || !m89693a(startTime, endTime, m89695c(activityType))) ? InterfaceC32865e.c.f136904a : new InterfaceC32865e.a(m89695c(activityType));
    }
}
