package rw2;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j93.InterfaceC21461d;
import java.util.Set;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: rw2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\b\u0010\u0007R\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lrw2/a;", "Lod1/g;", "Lqw2/a;", "Lqw2/b;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "b", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "a", "()Ljava/util/Set;", "actionTypes", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC31871a extends InterfaceC27844g<InterfaceC30693a, AbstractC30694b> {

    /* JADX INFO: renamed from: rw2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f132187w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC31871a f132188x;

        /* JADX INFO: renamed from: rw2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42298a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f132189w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC31871a f132190x;

            /* JADX INFO: renamed from: rw2.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.ActionHandler$interact$$inlined$filter$1$2", m100430f = "ActionHandler.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42299a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f132192F;

                /* JADX INFO: renamed from: G */
                Object f132193G;

                /* JADX INFO: renamed from: H */
                int f132194H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f132195w;

                /* JADX INFO: renamed from: x */
                int f132196x;

                /* JADX INFO: renamed from: y */
                Object f132197y;

                /* JADX INFO: renamed from: z */
                Object f132198z;

                public C42299a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f132195w = obj;
                    this.f132196x |= Integer.MIN_VALUE;
                    return C42298a.this.emit(null, this);
                }
            }

            public C42298a(InterfaceC13062m interfaceC13062m, InterfaceC31871a interfaceC31871a) {
                this.f132189w = interfaceC13062m;
                this.f132190x = interfaceC31871a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42299a c42299a;
                if (interfaceC30057d instanceof C42299a) {
                    c42299a = (C42299a) interfaceC30057d;
                    int i13 = c42299a.f132196x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42299a.f132196x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42299a = new C42299a(interfaceC30057d);
                    }
                } else {
                    c42299a = new C42299a(interfaceC30057d);
                }
                Object obj2 = c42299a.f132195w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42299a.f132196x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f132189w;
                    if (this.f132190x.mo28414a().contains(AbstractC22671h0.f89337a.getOrCreateKotlinClass(((InterfaceC30693a) obj).getAction().getClass()))) {
                        c42299a.f132197y = null;
                        c42299a.f132198z = null;
                        c42299a.f132192F = null;
                        c42299a.f132193G = null;
                        c42299a.f132194H = 0;
                        c42299a.f132196x = 1;
                        if (interfaceC13062m.emit(obj, c42299a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, InterfaceC31871a interfaceC31871a) {
            this.f132187w = interfaceC13058l;
            this.f132188x = interfaceC31871a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f132187w.collect(new C42298a(interfaceC13062m, this.f132188x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    Set<InterfaceC21461d> mo28414a();

    /* JADX INFO: renamed from: b */
    InterfaceC13058l mo28415b(InterfaceC13058l upstream);

    @Override // od1.InterfaceC27844g
    default InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return mo28415b(new a(upstream, this));
    }
}
