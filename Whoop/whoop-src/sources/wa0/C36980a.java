package wa0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsRecordingSection;
import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import ta0.AbstractC33671b;
import va0.AbstractC35841c;

/* JADX INFO: renamed from: wa0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lwa0/a;", "", "<init>", "()V", "Lec3/l;", "Lta0/b;", "upstream", "Lva0/c;", "a", "(Lec3/l;)Lec3/l;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36980a {

    /* JADX INFO: renamed from: wa0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f158296w;

        /* JADX INFO: renamed from: wa0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42580a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f158297w;

            /* JADX INFO: renamed from: wa0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.allrecordings.presentation.reducers.AllRecordingsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "AllRecordingsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42581a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f158298E;

                /* JADX INFO: renamed from: F */
                Object f158299F;

                /* JADX INFO: renamed from: G */
                Object f158300G;

                /* JADX INFO: renamed from: H */
                int f158301H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f158302w;

                /* JADX INFO: renamed from: x */
                int f158303x;

                /* JADX INFO: renamed from: y */
                Object f158304y;

                public C42581a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f158302w = obj;
                    this.f158303x |= Integer.MIN_VALUE;
                    return C42580a.this.emit(null, this);
                }
            }

            public C42580a(InterfaceC13062m interfaceC13062m) {
                this.f158297w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42581a c42581a;
                Object cVar;
                if (interfaceC30057d instanceof C42581a) {
                    c42581a = (C42581a) interfaceC30057d;
                    int i13 = c42581a.f158303x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42581a.f158303x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42581a = new C42581a(interfaceC30057d);
                    }
                } else {
                    c42581a = new C42581a(interfaceC30057d);
                }
                Object obj2 = c42581a.f158302w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42581a.f158303x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f158297w;
                    AbstractC33671b abstractC33671b = (AbstractC33671b) obj;
                    if (abstractC33671b instanceof AbstractC33671b.b) {
                        cVar = AbstractC35841c.b.f152601b;
                    } else if (abstractC33671b instanceof AbstractC33671b.a) {
                        cVar = AbstractC35841c.a.f152600b;
                    } else {
                        if (!(abstractC33671b instanceof AbstractC33671b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC33671b.c cVar2 = (AbstractC33671b.c) abstractC33671b;
                        NavigationBarModel navigationBar = cVar2.getResponse().getNavigationBar();
                        String title = cVar2.getResponse().getRecordHistory().getTitle();
                        String subtitle = cVar2.getResponse().getRecordHistory().getSubtitle();
                        List<AdvancedLabsRecordingSection> records = cVar2.getResponse().getRecordHistory().getPaginatedRecordings().getRecords();
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(records, 10));
                        Iterator<T> it = records.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC25448c.m74762z0().m60541h((AdvancedLabsRecordingSection) it.next()));
                        }
                        cVar = new AbstractC35841c.c(navigationBar, title, subtitle, arrayList, cVar2.getResponse().getBottomSheet());
                    }
                    c42581a.f158304y = null;
                    c42581a.f158298E = null;
                    c42581a.f158299F = null;
                    c42581a.f158300G = null;
                    c42581a.f158301H = 0;
                    c42581a.f158303x = 1;
                    if (interfaceC13062m.emit(cVar, c42581a) == enumC31071a) {
                        return enumC31071a;
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
            this.f158296w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f158296w.collect(new C42580a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m118713a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }
}
