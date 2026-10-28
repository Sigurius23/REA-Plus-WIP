package rw2;

import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ReloadAction;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j93.InterfaceC21461d;
import java.util.Set;
import l83.C23454a0;
import p098dt.AbstractC12350b;
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

/* JADX INFO: renamed from: rw2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lrw2/f;", "Lrw2/a;", "<init>", "()V", "Lec3/l;", "Lqw2/a;", "upstream", "Lqw2/b;", "b", "(Lec3/l;)Lec3/l;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "actionTypes", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31876f implements InterfaceC31871a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<InterfaceC21461d> actionTypes = AbstractC12350b.m34570S(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ReloadAction.class));

    /* JADX INFO: renamed from: rw2.f$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f132282w;

        /* JADX INFO: renamed from: rw2.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42303a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f132283w;

            /* JADX INFO: renamed from: rw2.f$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.ReloadActionHandler$handleActions$$inlined$mapNotNull$1$2", m100430f = "ReloadActionHandler.kt", m100431l = {53}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42304a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f132284E;

                /* JADX INFO: renamed from: F */
                Object f132285F;

                /* JADX INFO: renamed from: G */
                Object f132286G;

                /* JADX INFO: renamed from: H */
                Object f132287H;

                /* JADX INFO: renamed from: I */
                int f132288I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f132289w;

                /* JADX INFO: renamed from: x */
                int f132290x;

                /* JADX INFO: renamed from: y */
                Object f132291y;

                public C42304a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f132289w = obj;
                    this.f132290x |= Integer.MIN_VALUE;
                    return C42303a.this.emit(null, this);
                }
            }

            public C42303a(InterfaceC13062m interfaceC13062m) {
                this.f132283w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42304a c42304a;
                if (interfaceC30057d instanceof C42304a) {
                    c42304a = (C42304a) interfaceC30057d;
                    int i13 = c42304a.f132290x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42304a.f132290x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42304a = new C42304a(interfaceC30057d);
                    }
                } else {
                    c42304a = new C42304a(interfaceC30057d);
                }
                Object obj2 = c42304a.f132289w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42304a.f132290x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f132283w;
                    Action action = ((InterfaceC30693a) obj).getAction();
                    ReloadAction reloadAction = action instanceof ReloadAction ? (ReloadAction) action : null;
                    AbstractC30694b.g gVar = reloadAction == null ? null : new AbstractC30694b.g(reloadAction);
                    if (gVar != null) {
                        c42304a.f132291y = null;
                        c42304a.f132284E = null;
                        c42304a.f132285F = null;
                        c42304a.f132286G = null;
                        c42304a.f132287H = null;
                        c42304a.f132288I = 0;
                        c42304a.f132290x = 1;
                        if (interfaceC13062m.emit(gVar, c42304a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f132282w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f132282w.collect(new C42303a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: a */
    public Set<InterfaceC21461d> mo28414a() {
        return this.actionTypes;
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo28415b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }

    @Override // rw2.InterfaceC31871a, od1.InterfaceC27844g
    public /* bridge */ InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return super.interact(interfaceC13058l);
    }
}
