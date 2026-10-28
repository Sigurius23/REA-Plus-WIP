package k41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import aw0.C2101a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp1.C21852d;
import l83.C23454a0;
import m83.AbstractC25265s;
import p026b2.C2314t;
import p245j8.AbstractC21412c;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: k41.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lk41/d;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lk41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lk41/a;", "Ljava/time/Instant;", "instant", "", "j", "(Ljava/util/List;Ljava/time/Instant;)Ljava/lang/Integer;", "currentIndex", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22189c {

    /* JADX INFO: renamed from: k41.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.timedcontent.TimedContentKt$TimedContent$1$1", m100430f = "TimedContent.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86062w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC1585g0 f86063x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22190d f86064y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f86065z;

        /* JADX INFO: renamed from: k41.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.timedcontent.TimedContentKt$TimedContent$1$1$1", m100430f = "TimedContent.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41873a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f86066E;

            /* JADX INFO: renamed from: w */
            Object f86067w;

            /* JADX INFO: renamed from: x */
            Object f86068x;

            /* JADX INFO: renamed from: y */
            int f86069y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C22190d f86070z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41873a(C22190d c22190d, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C41873a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f86070z = c22190d;
                this.f86066E = interfaceC28601c1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41873a(this.f86070z, this.f86066E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41873a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                long millis;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f86069y;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(obj);
                do {
                    Instant instant = Clock.systemUTC().instant();
                    AbstractC22676k.m65749i(instant, "instant(...)");
                    AbstractC22189c.m63540e(this.f86066E, AbstractC22189c.m63545j(this.f86070z.m63546a(), instant));
                    List<C22187a> listM63546a = this.f86070z.m63546a();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = listM63546a.iterator();
                    while (it.hasNext()) {
                        Instant until = ((C22187a) it.next()).getUntil();
                        if (until != null) {
                            arrayList.add(until);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((Instant) obj2).isAfter(instant)) {
                            arrayList2.add(obj2);
                        }
                    }
                    Instant instant2 = (Instant) AbstractC25265s.m74120X0(arrayList2);
                    if (instant2 == null) {
                        return C23454a0.f92919a;
                    }
                    millis = Duration.between(instant, instant2).toMillis();
                    this.f86067w = null;
                    this.f86068x = null;
                    this.f86069y = 1;
                } while (AbstractC3034m0.m8782b(millis, this) != enumC31071a);
                return enumC31071a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1585g0 interfaceC1585g0, C22190d c22190d, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86063x = interfaceC1585g0;
            this.f86064y = c22190d;
            this.f86065z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f86063x, this.f86064y, this.f86065z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86062w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC1638x lifecycle = this.f86063x.getLifecycle();
                EnumC1635w enumC1635w = EnumC1635w.f6323E;
                C41873a c41873a = new C41873a(this.f86064y, this.f86065z, null);
                this.f86062w = 1;
                if (AbstractC1613o1.m5022l(lifecycle, enumC1635w, c41873a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m63538c(Modifier modifier, C22190d state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        C22187a c22187a;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(757796602);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            boolean zM87153g = c28655q.m87153g(state.m63546a());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                List<C22187a> listM63546a = state.m63546a();
                Instant instant = Clock.systemUTC().instant();
                AbstractC22676k.m65749i(instant, "instant(...)");
                objM87133R = AbstractC28683x.m87272z(m63545j(listM63546a, instant));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
            List<C22187a> listM63546a2 = state.m63546a();
            boolean zM87157i = c28655q.m87157i(interfaceC1585g0) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(state);
            Object objM87133R2 = c28655q.m87133R();
            C25306o item = null;
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new a(interfaceC1585g0, state, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(listM63546a2, interfaceC1585g0, (InterfaceC4351m) objM87133R2, c28655q);
            Integer numM63539d = m63539d(interfaceC28601c1);
            if (numM63539d != null && (c22187a = (C22187a) AbstractC25265s.m74102I0(numM63539d.intValue(), state.m63546a())) != null) {
                item = c22187a.getItem();
            }
            C25306o c25306o = item;
            if (c25306o != null) {
                c28655q.m87150e0(1171549578);
                AbstractC25303l.m74290q(c25306o, null, new C2101a(6, modifier), onViewEvent, c28655q, (i15 << 3) & 7168, 2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1171701416);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(modifier2, state, onViewEvent, i13, i14, 7);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final Integer m63539d(InterfaceC28601c1 interfaceC28601c1) {
        return (Integer) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m63540e(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        interfaceC28601c1.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m63541f(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(498577765);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m63542g(Modifier modifier, C22190d c22190d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m63538c(modifier, c22190d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Integer m63545j(List<C22187a> list, Instant instant) {
        Iterator<C22187a> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            C22187a next = it.next();
            if (next.getUntil() == null || next.getUntil().isAfter(instant)) {
                break;
            }
            i13++;
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }
}
