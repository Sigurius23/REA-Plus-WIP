package sw0;

import com.whoop.custombottomsheet.api.CustomBottomSheetApi;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.GroupedTogglesModel;
import com.whoop.design.models.items.TogglesModel;
import com.whoop.service.network.JournalApi;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qw0.C30686a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wr2.AbstractC37575c;

/* JADX INFO: renamed from: sw0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001c\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0015J\u001c\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\"*\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020%*\b\u0012\u0004\u0012\u00020\u00020%2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00162\u0006\u0010-\u001a\u00020\u0003H\u0000¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00162\u0006\u0010-\u001a\u00020\u0003H\u0000¢\u0006\u0004\b1\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m65681d2 = {"Lsw0/f;", "Lod1/g;", "Lsw0/d;", "Lsw0/e;", "Lcom/whoop/custombottomsheet/api/CustomBottomSheetApi;", "api", "Lcom/whoop/service/network/JournalApi;", "journalApi", "Ltr2/n;", "logger", "Lqw0/a;", "analyticsHelper", "<init>", "(Lcom/whoop/custombottomsheet/api/CustomBottomSheetApi;Lcom/whoop/service/network/JournalApi;Ltr2/n;Lqw0/a;)V", "", "category", "p", "(Lsw0/e;I)Lsw0/e;", "", "id", "q", "(Lsw0/e;Ljava/lang/String;)Lsw0/e;", "", "preselectedIds", "l", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "isFromModal", "r", "(Lsw0/e;ZLq83/d;)Ljava/lang/Object;", "query", "t", "u", "(Lsw0/e;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lsw0/g;", "s", "(Lsw0/g;Ljava/lang/String;)Lsw0/g;", "Lec3/l;", "", "timeoutMs", "k", "(Lec3/l;J)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "domainState", "Lsw0/j;", "n", "(Lsw0/e;)Ljava/util/List;", "o", "a", "Lcom/whoop/custombottomsheet/api/CustomBottomSheetApi;", "b", "Lcom/whoop/service/network/JournalApi;", "c", "Ltr2/n;", "d", "Lqw0/a;", "e", "Ljava/util/List;", "lastSavedSelection", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33049f implements InterfaceC27844g<AbstractC33047d, C33048e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CustomBottomSheetApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JournalApi journalApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C30686a analyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private List<String> lastSavedSelection;

    /* JADX INFO: renamed from: sw0.f$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f137754w;

        /* JADX INFO: renamed from: sw0.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42349a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f137755w;

            /* JADX INFO: renamed from: sw0.f$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor$debounceFuzzySearch$$inlined$filterIsInstance$1$2", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42350a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f137757F;

                /* JADX INFO: renamed from: G */
                Object f137758G;

                /* JADX INFO: renamed from: H */
                int f137759H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f137760w;

                /* JADX INFO: renamed from: x */
                int f137761x;

                /* JADX INFO: renamed from: y */
                Object f137762y;

                /* JADX INFO: renamed from: z */
                Object f137763z;

                public C42350a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f137760w = obj;
                    this.f137761x |= Integer.MIN_VALUE;
                    return C42349a.this.emit(null, this);
                }
            }

            public C42349a(InterfaceC13062m interfaceC13062m) {
                this.f137755w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42350a c42350a;
                if (interfaceC30057d instanceof C42350a) {
                    c42350a = (C42350a) interfaceC30057d;
                    int i13 = c42350a.f137761x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42350a.f137761x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42350a = new C42350a(interfaceC30057d);
                    }
                } else {
                    c42350a = new C42350a(interfaceC30057d);
                }
                Object obj2 = c42350a.f137760w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42350a.f137761x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f137755w;
                    if (obj instanceof AbstractC33047d.e) {
                        c42350a.f137762y = null;
                        c42350a.f137763z = null;
                        c42350a.f137757F = null;
                        c42350a.f137758G = null;
                        c42350a.f137759H = 0;
                        c42350a.f137761x = 1;
                        if (interfaceC13062m.emit(obj, c42350a) == enumC31071a) {
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
            this.f137754w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f137754w.collect(new C42349a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sw0.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f137764w;

        /* JADX INFO: renamed from: sw0.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f137765w;

            /* JADX INFO: renamed from: sw0.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor$debounceFuzzySearch$$inlined$filterNot$1$2", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42351a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f137767F;

                /* JADX INFO: renamed from: G */
                Object f137768G;

                /* JADX INFO: renamed from: H */
                int f137769H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f137770w;

                /* JADX INFO: renamed from: x */
                int f137771x;

                /* JADX INFO: renamed from: y */
                Object f137772y;

                /* JADX INFO: renamed from: z */
                Object f137773z;

                public C42351a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f137770w = obj;
                    this.f137771x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f137765w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42351a c42351a;
                if (interfaceC30057d instanceof C42351a) {
                    c42351a = (C42351a) interfaceC30057d;
                    int i13 = c42351a.f137771x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42351a.f137771x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42351a = new C42351a(interfaceC30057d);
                    }
                } else {
                    c42351a = new C42351a(interfaceC30057d);
                }
                Object obj2 = c42351a.f137770w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42351a.f137771x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f137765w;
                    if (!(((AbstractC33047d) obj) instanceof AbstractC33047d.e)) {
                        c42351a.f137772y = null;
                        c42351a.f137773z = null;
                        c42351a.f137767F = null;
                        c42351a.f137768G = null;
                        c42351a.f137769H = 0;
                        c42351a.f137771x = 1;
                        if (interfaceC13062m.emit(obj, c42351a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f137764w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f137764w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sw0.f$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {71}, m100432m = "fetchBottomSheetContent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f137774w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f137775x;

        /* JADX INFO: renamed from: z */
        int f137777z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f137775x = obj;
            this.f137777z |= Integer.MIN_VALUE;
            return C33049f.this.m104615l(null, this);
        }
    }

    /* JADX INFO: renamed from: sw0.f$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor$fetchBottomSheetContent$response$1", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {72}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f137778w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33049f.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137778w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CustomBottomSheetApi customBottomSheetApi = C33049f.this.api;
            this.f137778w = 1;
            Object customJournalBottomSheet = customBottomSheetApi.getCustomJournalBottomSheet(this);
            return customJournalBottomSheet == enumC31071a ? enumC31071a : customJournalBottomSheet;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CustomizeBottomSheetSelectorModel> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: sw0.f$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {106}, m100432m = "handleSaveCustomBehaviorApiCall", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f137780E;

        /* JADX INFO: renamed from: F */
        Object f137781F;

        /* JADX INFO: renamed from: G */
        boolean f137782G;

        /* JADX INFO: renamed from: H */
        boolean f137783H;

        /* JADX INFO: renamed from: I */
        int f137784I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f137785J;

        /* JADX INFO: renamed from: L */
        int f137787L;

        /* JADX INFO: renamed from: w */
        Object f137788w;

        /* JADX INFO: renamed from: x */
        Object f137789x;

        /* JADX INFO: renamed from: y */
        Object f137790y;

        /* JADX INFO: renamed from: z */
        Object f137791z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f137785J = obj;
            this.f137787L |= Integer.MIN_VALUE;
            return C33049f.this.m104619r(null, false, this);
        }
    }

    /* JADX INFO: renamed from: sw0.f$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor$handleSaveCustomBehaviorApiCall$2$response$1", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f137792w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<Integer> f137794y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<Integer> list, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f137794y = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33049f.this.new f(this.f137794y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137792w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JournalApi journalApi = C33049f.this.journalApi;
            ArrayList<Integer> arrayList = new ArrayList<>(this.f137794y);
            this.f137792w = 1;
            Object objUpdateUserSelectedJournalBehaviors = journalApi.updateUserSelectedJournalBehaviors(arrayList, this);
            return objUpdateUserSelectedJournalBehaviors == enumC31071a ? enumC31071a : objUpdateUserSelectedJournalBehaviors;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: sw0.f$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f137795w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f137796x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f137797y;

        public g(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC33047d abstractC33047d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f137796x = interfaceC13062m;
            gVar.f137797y = abstractC33047d;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137795w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f137796x;
                AbstractC33047d abstractC33047d = (AbstractC33047d) this.f137797y;
                this.f137796x = null;
                this.f137797y = null;
                this.f137795w = 1;
                AbstractC13091v.m36615y(interfaceC13062m);
                Object objEmit = interfaceC13062m.emit(abstractC33047d, this);
                if (objEmit != EnumC31071a.f128113w) {
                    objEmit = c23454a0;
                }
                if (objEmit != EnumC31071a.f128113w) {
                    objEmit = c23454a0;
                }
                if (objEmit == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC33047d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sw0.f$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor$interact$2", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {36, 38, 43, 46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lsw0/e;", "currentState", "Lsw0/d;", "currentAction", "<anonymous>", "(Lsw0/e;Lsw0/d;)Lsw0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f137798w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f137799x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f137800y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C33048e c33048e, AbstractC33047d abstractC33047d, InterfaceC30057d<? super C33048e> interfaceC30057d) {
            h hVar = C33049f.this.new h(interfaceC30057d);
            hVar.f137799x = c33048e;
            hVar.f137800y = abstractC33047d;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r9 == r2) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if (r9 == r2) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        
            if (r9 == r2) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
        
            if (r9 == r2) goto L57;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sw0.C33049f.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sw0.f$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {126}, m100432m = "performFuzzySearch", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f137802E;

        /* JADX INFO: renamed from: w */
        Object f137803w;

        /* JADX INFO: renamed from: x */
        Object f137804x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f137805y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f137805y = obj;
            this.f137802E |= Integer.MIN_VALUE;
            return C33049f.this.m104622u(null, null, this);
        }
    }

    /* JADX INFO: renamed from: sw0.f$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor$performFuzzySearch$response$1", m100430f = "CustomBottomSheetInteractor.kt", m100431l = {126}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f137807w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f137809y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f137809y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33049f.this.new j(this.f137809y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137807w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CustomBottomSheetApi customBottomSheetApi = C33049f.this.api;
            String str = this.f137809y;
            this.f137807w = 1;
            Object relatedBehaviorTrackerIds = customBottomSheetApi.getRelatedBehaviorTrackerIds(str, this);
            return relatedBehaviorTrackerIds == enumC31071a ? enumC31071a : relatedBehaviorTrackerIds;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<Integer>> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C33049f(CustomBottomSheetApi api, JournalApi journalApi, InterfaceC34116n logger, C30686a analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(journalApi, "journalApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.journalApi = journalApi;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC13058l m104614k(InterfaceC13058l interfaceC13058l, long j7) {
        return AbstractC13091v.m36584J(AbstractC13091v.m36608r(new a(interfaceC13058l), j7), new b(interfaceC13058l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: l */
    public final Object m104615l(List<String> list, InterfaceC30057d<? super C33048e> interfaceC30057d) {
        c cVar;
        List<String> list2;
        Object objM108729b;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f137777z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f137777z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f137775x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f137777z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.lastSavedSelection = null;
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(null);
            list2 = list;
            cVar2.f137774w = list2;
            cVar2.f137777z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch bottomsheet content", dVar, cVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<String> list3 = (List) cVar2.f137774w;
            AbstractC34132o.m107864I(obj);
            objM108729b = obj;
            list2 = list3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                return new C33048e(InterfaceC33046c.b.f137734a, null, null, null, null, 30, null);
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                return new C33048e(InterfaceC33046c.c.f137735a, null, null, null, null, 30, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar3 = (InterfaceC34385a.c) interfaceC34385a;
        List<GroupedTogglesModel> groupedTogglesModels = ((CustomizeBottomSheetSelectorModel) cVar3.m108735a()).getGroupedTogglesModels();
        if (groupedTogglesModels == null) {
            groupedTogglesModels = C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = groupedTogglesModels.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((GroupedTogglesModel) it.next()).getToggles());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (AbstractC22676k.m65745e(((TogglesModel) obj2).getSelected(), Boolean.TRUE)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((TogglesModel) it3.next()).getId());
        }
        List listM74159y0 = AbstractC25265s.m74159y0(AbstractC25265s.m74129g1(list2, arrayList3));
        return new C33048e(null, C33050g.m104626b(AbstractC33051h.m104642c((CustomizeBottomSheetSelectorModel) cVar3.m108735a(), null, false, listM74159y0, 3, null), null, null, null, null, null, null, null, listM74159y0, null, null, null, null, 3967, null), AbstractC25265s.m74097F1(listM74159y0), null, null, 25, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m104616m(C33049f c33049f, List list, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = C25271y.f99162w;
        }
        return c33049f.m104615l(list, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final C33048e m104617p(C33048e c33048e, int i13) {
        if (c33048e.getBottomSheetDomainState() != null) {
            return C33048e.m104599b(c33048e, null, C33050g.m104626b(c33048e.getBottomSheetDomainState(), null, null, null, null, c33048e.getBottomSheetDomainState().m104629d().get(i13), null, null, null, null, null, null, null, 4079, null), null, null, null, 21, null);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final C33048e m104618q(C33048e c33048e, String str) {
        if (c33048e.getBottomSheetDomainState() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        List<String> listM104605g = c33048e.m104605g();
        if (listM104605g.contains(str)) {
            listM104605g.remove(str);
        } else {
            listM104605g.add(str);
        }
        List<C33053j> listM104624o = m104624o(c33048e);
        return C33048e.m104599b(c33048e, null, m104620s(c33048e.getBottomSheetDomainState(), str), c33048e.m104605g(), null, listM104624o, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m104619r(C33048e c33048e, boolean z4, InterfaceC30057d<? super C33048e> interfaceC30057d) {
        e eVar;
        List<String> list;
        C33048e c33048e2;
        List<C33053j> list2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f137787L;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f137787L = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f137785J;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f137787L;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!c33048e.m104604f().isEmpty() && !z4) {
                return c33048e;
            }
            List<String> listM74093D1 = AbstractC25265s.m74093D1(c33048e.m104605g());
            boolean zEquals = listM74093D1.equals(this.lastSavedSelection);
            List<C33053j> listM104623n = zEquals ? C25271y.f99162w : m104623n(c33048e);
            List<String> list3 = listM74093D1;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(Integer.parseInt((String) it.next())));
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(arrayList, null);
            eVar2.f137788w = null;
            eVar2.f137789x = c33048e;
            eVar2.f137790y = null;
            eVar2.f137791z = listM74093D1;
            eVar2.f137780E = listM104623n;
            eVar2.f137781F = null;
            eVar2.f137782G = z4;
            eVar2.f137784I = 0;
            eVar2.f137783H = zEquals;
            eVar2.f137787L = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Error updating selected journal behaviors", fVar, eVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            obj = objM108729b;
            list = listM74093D1;
            c33048e2 = c33048e;
            list2 = listM104623n;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) eVar2.f137780E;
            list = (List) eVar2.f137791z;
            c33048e2 = (C33048e) eVar2.f137789x;
            AbstractC34132o.m107864I(obj);
        }
        if (((InterfaceC34385a) obj) instanceof InterfaceC34385a.c) {
            this.lastSavedSelection = list;
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                this.analyticsHelper.m94286a(((C33053j) it3.next()).getId());
            }
        }
        return c33048e2;
    }

    /* JADX INFO: renamed from: s */
    private final C33050g m104620s(C33050g c33050g, String str) {
        List<C33052i> listM104635j = c33050g.m104635j();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM104635j, 10));
        for (C33052i c33052i : listM104635j) {
            List<C33053j> listM104651f = c33052i.m104651f();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
            for (C33053j c33053jM104653d : listM104651f) {
                if (AbstractC22676k.m65745e(c33053jM104653d.getId(), str)) {
                    boolean isSelected = c33053jM104653d.getIsSelected();
                    c33053jM104653d = c33053jM104653d.m104653d((65531 & 1) != 0 ? c33053jM104653d.id : null, (65531 & 2) != 0 ? c33053jM104653d.title : null, (65531 & 4) != 0 ? c33053jM104653d.isSelected : !isSelected, (65531 & 8) != 0 ? c33053jM104653d.sortPriority : 0, (65531 & 16) != 0 ? c33053jM104653d.selectedValue : !isSelected ? 1 : null, (65531 & 32) != 0 ? c33053jM104653d.categories : null, (65531 & 64) != 0 ? c33053jM104653d.iconUrl : null, (65531 & 128) != 0 ? c33053jM104653d.subtitle : null, (65531 & 256) != 0 ? c33053jM104653d.avoidanceText : null, (65531 & 512) != 0 ? c33053jM104653d.trend : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33053jM104653d.style : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33053jM104653d.dayOptions : null, (65531 & 4096) != 0 ? c33053jM104653d.bottomSheetInfo : null, (65531 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33053jM104653d.weeklyPlanGoal : false, (65531 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33053jM104653d.tag : null, (65531 & 32768) != 0 ? c33053jM104653d.isCustom : false);
                }
                arrayList2.add(c33053jM104653d);
            }
            arrayList.add(C33052i.m104646b(c33052i, null, 0, arrayList2, null, 11, null));
        }
        return C33050g.m104626b(c33050g, null, null, null, null, null, arrayList, null, null, null, null, null, null, 4063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final C33048e m104621t(C33048e c33048e, String str) {
        if (c33048e.getBottomSheetDomainState() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        List<C33052i> listM104635j = c33048e.getBottomSheetDomainState().m104635j();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM104635j.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C33052i) it.next()).m104651f());
        }
        return C33048e.m104599b(c33048e, null, C33050g.m104626b(c33048e.getBottomSheetDomainState(), null, str, null, null, null, null, null, null, null, null, null, null, 4093, null), null, AbstractC37575c.m120636o(arrayList, str, null, 2, null).isEmpty() ? str : null, null, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: u */
    public final Object m104622u(C33048e c33048e, String str, InterfaceC30057d<? super C33048e> interfaceC30057d) {
        i iVar;
        C33048e c33048e2;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f137802E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f137802E = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM108729b = iVar2.f137805y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar2.f137802E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            j jVar = new j(str, null);
            iVar2.f137803w = c33048e;
            iVar2.f137804x = null;
            iVar2.f137802E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, jVar, iVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            c33048e2 = c33048e;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C33048e c33048e3 = (C33048e) iVar2.f137803w;
            AbstractC34132o.m107864I(objM108729b);
            c33048e2 = c33048e3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            C33050g bottomSheetDomainState = c33048e2.getBottomSheetDomainState();
            return C33048e.m104599b(c33048e2, null, bottomSheetDomainState != null ? C33050g.m104626b(bottomSheetDomainState, null, null, null, null, null, null, null, null, (List) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, null, null, 3839, null) : null, null, null, null, 21, null);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        C33050g bottomSheetDomainState2 = c33048e2.getBottomSheetDomainState();
        return C33048e.m104599b(c33048e2, null, bottomSheetDomainState2 != null ? C33050g.m104626b(bottomSheetDomainState2, null, null, null, null, null, null, null, null, C25271y.f99162w, null, null, null, 3839, null) : null, null, null, null, 21, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C33048e(InterfaceC33046c.a.f137733a, null, null, null, null, 30, null), AbstractC13091v.m36590P(m104614k(upstream, 300L), new g(null)), new h(null));
    }

    /* JADX INFO: renamed from: n */
    public final List<C33053j> m104623n(C33048e domainState) {
        List<C33052i> listM104635j;
        AbstractC22676k.m65750j(domainState, "domainState");
        C33050g bottomSheetDomainState = domainState.getBottomSheetDomainState();
        ArrayList arrayList = null;
        List<String> listM104636k = bottomSheetDomainState != null ? bottomSheetDomainState.m104636k() : null;
        C25271y c25271y = C25271y.f99162w;
        if (listM104636k == null) {
            listM104636k = c25271y;
        }
        List<String> listM104605g = domainState.m104605g();
        C33050g bottomSheetDomainState2 = domainState.getBottomSheetDomainState();
        if (bottomSheetDomainState2 != null && (listM104635j = bottomSheetDomainState2.m104635j()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listM104635j.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList2, ((C33052i) it.next()).m104651f());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                C33053j c33053j = (C33053j) obj;
                if (listM104636k.contains(c33053j.getId()) && c33053j.getIsCustom() && !listM104605g.contains(c33053j.getId())) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? c25271y : arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final List<C33053j> m104624o(C33048e domainState) {
        List<C33052i> listM104635j;
        AbstractC22676k.m65750j(domainState, "domainState");
        C33050g bottomSheetDomainState = domainState.getBottomSheetDomainState();
        ArrayList arrayList = null;
        List<String> listM104636k = bottomSheetDomainState != null ? bottomSheetDomainState.m104636k() : null;
        C25271y c25271y = C25271y.f99162w;
        if (listM104636k == null) {
            listM104636k = c25271y;
        }
        List<String> listM104605g = domainState.m104605g();
        C33050g bottomSheetDomainState2 = domainState.getBottomSheetDomainState();
        if (bottomSheetDomainState2 != null && (listM104635j = bottomSheetDomainState2.m104635j()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listM104635j.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList2, ((C33052i) it.next()).m104651f());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                C33053j c33053j = (C33053j) obj;
                if (listM104636k.contains(c33053j.getId()) && c33053j.getWeeklyPlanGoal() && !listM104605g.contains(c33053j.getId())) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? c25271y : arrayList;
    }
}
