package zg0;

import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.AiMessageStatus;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nl0.EnumC26800b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: zg0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"", "Lzg0/e;", "sections", "", "isLatestTurnComplete", "", "", "a", "(Ljava/util/List;Z)Ljava/util/Set;", "c", "Lec3/l;", "Lzg0/i;", "b", "(Lec3/l;)Lec3/l;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40629l {

    /* JADX INFO: renamed from: zg0.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.TurnCompletionKt$turnCompletions$1", m100430f = "TurnCompletion.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f175215w;

        /* JADX INFO: renamed from: x */
        int f175216x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f175217y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f175218z;

        /* JADX INFO: renamed from: zg0.l$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42751a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C40630m f175219w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f175220x;

            /* JADX INFO: renamed from: zg0.l$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.TurnCompletionKt$turnCompletions$1$1", m100430f = "TurnCompletion.kt", m100431l = {71}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42752a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f175221E;

                /* JADX INFO: renamed from: F */
                Object f175222F;

                /* JADX INFO: renamed from: G */
                int f175223G;

                /* JADX INFO: renamed from: H */
                int f175224H;

                /* JADX INFO: renamed from: I */
                /* synthetic */ Object f175225I;

                /* JADX INFO: renamed from: J */
                final /* synthetic */ C42751a<T> f175226J;

                /* JADX INFO: renamed from: K */
                int f175227K;

                /* JADX INFO: renamed from: w */
                Object f175228w;

                /* JADX INFO: renamed from: x */
                Object f175229x;

                /* JADX INFO: renamed from: y */
                Object f175230y;

                /* JADX INFO: renamed from: z */
                Object f175231z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42752a(C42751a<? super T> c42751a, InterfaceC30057d<? super C42752a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f175226J = c42751a;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f175225I = obj;
                    this.f175227K |= Integer.MIN_VALUE;
                    return this.f175226J.emit(null, this);
                }
            }

            public C42751a(C40630m c40630m, InterfaceC13062m interfaceC13062m) {
                this.f175219w = c40630m;
                this.f175220x = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C40626i c40626i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C42752a c42752a;
                Iterator<T> it;
                InterfaceC13062m interfaceC13062m;
                int i13;
                if (interfaceC30057d instanceof C42752a) {
                    c42752a = (C42752a) interfaceC30057d;
                    int i14 = c42752a.f175227K;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c42752a.f175227K = i14 - Integer.MIN_VALUE;
                    } else {
                        c42752a = new C42752a(this, interfaceC30057d);
                    }
                } else {
                    c42752a = new C42752a(this, interfaceC30057d);
                }
                Object obj = c42752a.f175225I;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c42752a.f175227K;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C40630m c40630m = this.f175219w;
                    String fingerprint = c40626i.getConversation().getFingerprint();
                    List<C40622e> listM131761e = c40626i.getConversation().m131761e();
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM131761e, 10));
                    Iterator<T> it3 = listM131761e.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((C40622e) it3.next()).getTurnId());
                    }
                    List<String> listM131860a = c40630m.m131860a(fingerprint, arrayList, AbstractC40629l.m131856a(c40626i.getConversation().m131761e(), c40626i.getIsLatestTurnComplete()));
                    InterfaceC13062m interfaceC13062m2 = this.f175220x;
                    it = listM131860a.iterator();
                    interfaceC13062m = interfaceC13062m2;
                    i13 = 0;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = c42752a.f175223G;
                    it = (Iterator) c42752a.f175231z;
                    interfaceC13062m = (InterfaceC13062m) c42752a.f175230y;
                    AbstractC34132o.m107864I(obj);
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    c42752a.f175228w = null;
                    c42752a.f175229x = null;
                    c42752a.f175230y = interfaceC13062m;
                    c42752a.f175231z = it;
                    c42752a.f175221E = null;
                    c42752a.f175222F = null;
                    c42752a.f175223G = i13;
                    c42752a.f175224H = 0;
                    c42752a.f175227K = 1;
                    if (interfaceC13062m.emit(str, c42752a) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f175218z = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f175218z, interfaceC30057d);
            aVar.f175217y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f175217y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f175216x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C40630m c40630m = new C40630m();
                InterfaceC13058l interfaceC13058l = this.f175218z;
                C42751a c42751a = new C42751a(c40630m, interfaceC13062m);
                this.f175217y = null;
                this.f175215w = null;
                this.f175216x = 1;
                if (interfaceC13058l.collect(c42751a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: a */
    public static final Set<String> m131856a(List<C40622e> sections, boolean z4) {
        AbstractC22676k.m65750j(sections, "sections");
        C40622e c40622e = (C40622e) AbstractC25265s.m74114R0(sections);
        String turnId = c40622e != null ? c40622e.getTurnId() : null;
        ArrayList arrayList = new ArrayList();
        for (Object obj : sections) {
            C40622e c40622e2 = (C40622e) obj;
            if (c40622e2.getTurnStatus() != AiMessageStatus.ACTIVE && (!AbstractC22676k.m65745e(c40622e2.getTurnId(), turnId) || z4)) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C40622e) it.next()).getTurnId());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC13058l m131857b(InterfaceC13058l interfaceC13058l) {
        AbstractC22676k.m65750j(interfaceC13058l, "<this>");
        return new C13084s1(new a(interfaceC13058l, null));
    }

    /* JADX INFO: renamed from: c */
    public static final Set<String> m131858c(List<C40622e> sections, boolean z4) {
        AbstractC22676k.m65750j(sections, "sections");
        C40622e c40622e = (C40622e) AbstractC25265s.m74114R0(sections);
        String turnId = c40622e != null ? c40622e.getTurnId() : null;
        ArrayList arrayList = new ArrayList();
        for (Object obj : sections) {
            C40622e c40622e2 = (C40622e) obj;
            C40621d c40621d = (C40621d) AbstractC25265s.m74114R0(c40622e2.m131752c());
            if (c40621d != null && c40621d.getRole() == EnumC26800b.ASSISTANT && (c40621d.getMessageStatus() == AiMessageStatus.COMPLETE || c40621d.getMessageStatus() == AiMessageStatus.STOPPED)) {
                if (!AbstractC22676k.m65745e(c40622e2.getTurnId(), turnId) || z4) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C40622e) it.next()).getTurnId());
        }
        return linkedHashSet;
    }
}
