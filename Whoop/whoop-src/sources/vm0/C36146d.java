package vm0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import iy1.InterfaceC21030c;
import java.util.Iterator;
import java.util.List;
import jy1.C22047a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: vm0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lvm0/d;", "", "Liy1/c;", "metricWriter", "Lec3/t1;", "Lvm0/k;", "events", "Lbc3/c0;", "scope", "<init>", "(Liy1/c;Lec3/t1;Lbc3/c0;)V", "a", "Liy1/c;", "Lbc3/k1;", "b", "Lbc3/k1;", "collector", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36146d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC3027k1 collector;

    /* JADX INFO: renamed from: vm0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.cache.reporting.CacheMetricPublisher$collector$1", m100430f = "CacheMetricPublisher.kt", m100431l = {24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f154661w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC13087t1 f154662x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36146d f154663y;

        /* JADX INFO: renamed from: vm0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42554a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C36146d f154664w;

            public C42554a(C36146d c36146d) {
                this.f154664w = c36146d;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C36153k c36153k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                List listM114985g = AbstractC36147e.m114985g(c36153k.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), c36153k.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
                C36146d c36146d = this.f154664w;
                Iterator<T> it = listM114985g.iterator();
                while (it.hasNext()) {
                    c36146d.metricWriter.mo58701b((C22047a) it.next());
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13087t1 interfaceC13087t1, C36146d c36146d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154662x = interfaceC13087t1;
            this.f154663y = c36146d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f154662x, this.f154663y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154661w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 interfaceC13087t1 = this.f154662x;
                C42554a c42554a = new C42554a(this.f154663y);
                this.f154661w = 1;
                if (interfaceC13087t1.collect(c42554a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public C36146d(InterfaceC21030c metricWriter, InterfaceC13087t1 events, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(events, "events");
        AbstractC22676k.m65750j(scope, "scope");
        this.metricWriter = metricWriter;
        this.collector = AbstractC3006f0.m8732z(scope, null, null, new a(events, this, null), 3);
    }
}
