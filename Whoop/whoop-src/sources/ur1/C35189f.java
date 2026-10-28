package ur1;

import com.whoop.data.repositories.JournalRepository;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ur1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lur1/f;", "Lod1/g;", "Lur1/e;", "Lur1/n;", "Lcom/whoop/data/repositories/JournalRepository;", "journalRepository", "<init>", "(Lcom/whoop/data/repositories/JournalRepository;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/data/repositories/JournalRepository;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35189f implements InterfaceC27844g<AbstractC35188e, AbstractC35197n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final JournalRepository journalRepository;

    /* JADX INFO: renamed from: ur1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149406w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35189f f149407x;

        /* JADX INFO: renamed from: ur1.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42493a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149408w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35189f f149409x;

            /* JADX INFO: renamed from: ur1.f$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalConfigInteractor$interact$$inlined$map$1$2", m100430f = "JournalConfigInteractor.kt", m100431l = {53, 65, 81, 88, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42494a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149410E;

                /* JADX INFO: renamed from: F */
                Object f149411F;

                /* JADX INFO: renamed from: G */
                Object f149412G;

                /* JADX INFO: renamed from: H */
                Object f149413H;

                /* JADX INFO: renamed from: I */
                Object f149414I;

                /* JADX INFO: renamed from: J */
                Object f149415J;

                /* JADX INFO: renamed from: K */
                int f149416K;

                /* JADX INFO: renamed from: L */
                int f149417L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149418w;

                /* JADX INFO: renamed from: x */
                int f149419x;

                /* JADX INFO: renamed from: y */
                Object f149420y;

                public C42494a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149418w = obj;
                    this.f149419x |= Integer.MIN_VALUE;
                    return C42493a.this.emit(null, this);
                }
            }

            public C42493a(InterfaceC13062m interfaceC13062m, C35189f c35189f) {
                this.f149408w = interfaceC13062m;
                this.f149409x = c35189f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0181, code lost:
            
                if (r12.emit(r11, r0) == r1) goto L53;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, q83.InterfaceC30057d r12) {
                /*
                    Method dump skipped, instruction units count: 397
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ur1.C35189f.a.C42493a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C35189f c35189f) {
            this.f149406w = interfaceC13058l;
            this.f149407x = c35189f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149406w.collect(new C42493a(interfaceC13062m, this.f149407x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C35189f(JournalRepository journalRepository) {
        AbstractC22676k.m65750j(journalRepository, "journalRepository");
        this.journalRepository = journalRepository;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}
