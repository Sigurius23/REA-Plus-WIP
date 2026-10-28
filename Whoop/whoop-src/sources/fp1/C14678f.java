package fp1;

import bm.C3383g;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.postpartum.domain.models.BabyData;
import com.whoop.hormonalinsights.postpartum.domain.models.DeliveryType;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumRequest;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fp1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010\u001bJ+\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lfp1/f;", "Lod1/g;", "Lfp1/c;", "Lfp1/e;", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;)V", "Lfp1/c$c;", "action", "l", "(Lfp1/c$c;Lq83/d;)Ljava/lang/Object;", "Lfp1/c$d;", "previousState", "q", "(Lfp1/c$d;Lfp1/e;Lq83/d;)Ljava/lang/Object;", "Lfp1/d;", "saveRequest", "Lfp1/g;", "progressResult", "", "isStealthModeOn", "o", "(Lfp1/d;Lfp1/g;ZLq83/d;)Ljava/lang/Object;", "t", "(Lfp1/e;)Lfp1/e;", "Lfp1/c$b;", "n", "(Lfp1/c$b;Lfp1/e;Lq83/d;)Ljava/lang/Object;", "m", "Lfp1/c$f;", "s", "(Lfp1/c$f;Lfp1/e;)Lfp1/e;", "r", "previousData", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "currentScreen", "content", "p", "(Lfp1/d;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lfp1/d;)Lfp1/d;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "b", "Ltr2/n;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14678f implements InterfaceC27844g<AbstractC14675c, InterfaceC14677e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fp1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54213a;

        static {
            int[] iArr = new int[HormonalScreenId.values().length];
            try {
                iArr[HormonalScreenId.DELIVERY_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalScreenId.CHILDREN_COUNT_NUMBER_PICKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HormonalScreenId.CHILDREN_WEIGHTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HormonalScreenId.CHILDREN_COUNT_MULTI_SELECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HormonalScreenId.DELIVERY_METHOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HormonalScreenId.PREGNANCY_NAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HormonalScreenId.CELEBRATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HormonalScreenId.POST_PARTUM_CONTINUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f54213a = iArr;
        }
    }

    /* JADX INFO: renamed from: fp1.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor", m100430f = "PostPartumInteractor.kt", m100431l = {44}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f54214w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f54215x;

        /* JADX INFO: renamed from: z */
        int f54217z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f54215x = obj;
            this.f54217z |= Integer.MIN_VALUE;
            return C14678f.this.m41979l(null, this);
        }
    }

    /* JADX INFO: renamed from: fp1.f$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor$fetchData$response$1", m100430f = "PostPartumInteractor.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f54218w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC14675c.c f54220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC14675c.c cVar, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f54220y = cVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14678f.this.new c(this.f54220y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54218w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C14678f.this.api;
            String strName = this.f54220y.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().name();
            String id4 = this.f54220y.getId();
            this.f54218w = 1;
            Object pregnancyPostPartum = hormonalInsightsApi.getPregnancyPostPartum(strName, id4, this);
            return pregnancyPostPartum == enumC31071a ? enumC31071a : pregnancyPostPartum;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PostPartumResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fp1.f$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PostPartumInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f54221w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f54222x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54223y;

        public d(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC14675c abstractC14675c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f54222x = interfaceC13062m;
            dVar.f54223y = abstractC14675c;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54221w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f54222x;
                AbstractC14675c abstractC14675c = (AbstractC14675c) this.f54223y;
                InterfaceC13058l c3383g = ((abstractC14675c instanceof AbstractC14675c.b) && ((AbstractC14675c.b) abstractC14675c).getNextScreen() == null) ? new C3383g(new AbstractC14675c[]{AbstractC14675c.e.f54186a, abstractC14675c}, 3) : new C0456u(abstractC14675c, 1);
                this.f54222x = null;
                this.f54223y = null;
                this.f54221w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c3383g, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC14675c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fp1.f$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor$interact$2", m100430f = "PostPartumInteractor.kt", m100431l = {33, 34, 39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lfp1/e;", "previousState", "Lfp1/c;", "action", "<anonymous>", "(Lfp1/e;Lfp1/c;)Lfp1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f54224w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f54225x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54226y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14677e interfaceC14677e, AbstractC14675c abstractC14675c, InterfaceC30057d<? super InterfaceC14677e> interfaceC30057d) {
            e eVar = C14678f.this.new e(interfaceC30057d);
            eVar.f54225x = interfaceC14677e;
            eVar.f54226y = abstractC14675c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        
            if (r8 == r2) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        
            if (r8 == r2) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
        
            if (r8 == r2) goto L46;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f54225x
                fp1.e r0 = (fp1.InterfaceC14677e) r0
                java.lang.Object r1 = r7.f54226y
                fp1.c r1 = (fp1.AbstractC14675c) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r7.f54224w
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L2c
                if (r3 == r6) goto L28
                if (r3 == r5) goto L24
                if (r3 != r4) goto L1c
                p505ts.AbstractC34132o.m107864I(r8)
                goto Lab
            L1c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L24:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5d
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L45
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                boolean r8 = r1 instanceof fp1.AbstractC14675c.c
                r3 = 0
                if (r8 == 0) goto L48
                fp1.f r8 = fp1.C14678f.this
                fp1.c$c r1 = (fp1.AbstractC14675c.c) r1
                r7.f54225x = r3
                r7.f54226y = r3
                r7.f54224w = r6
                java.lang.Object r8 = fp1.C14678f.m41970c(r8, r1, r7)
                if (r8 != r2) goto L45
                goto Laa
            L45:
                fp1.e r8 = (fp1.InterfaceC14677e) r8
                return r8
            L48:
                boolean r8 = r1 instanceof fp1.AbstractC14675c.b
                if (r8 == 0) goto L60
                fp1.f r8 = fp1.C14678f.this
                fp1.c$b r1 = (fp1.AbstractC14675c.b) r1
                r7.f54225x = r3
                r7.f54226y = r3
                r7.f54224w = r5
                java.lang.Object r8 = fp1.C14678f.m41973f(r8, r1, r0, r7)
                if (r8 != r2) goto L5d
                goto Laa
            L5d:
                fp1.e r8 = (fp1.InterfaceC14677e) r8
                return r8
            L60:
                boolean r8 = r1 instanceof fp1.AbstractC14675c.f
                if (r8 == 0) goto L6d
                fp1.f r8 = fp1.C14678f.this
                fp1.c$f r1 = (fp1.AbstractC14675c.f) r1
                fp1.e r8 = fp1.C14678f.m41977j(r8, r1, r0)
                return r8
            L6d:
                fp1.c$a r8 = fp1.AbstractC14675c.a.f54180a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r8)
                if (r8 == 0) goto L7c
                fp1.f r8 = fp1.C14678f.this
                fp1.e r8 = fp1.C14678f.m41972e(r8, r0)
                return r8
            L7c:
                fp1.c$g r8 = fp1.AbstractC14675c.g.f54188a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r8)
                if (r8 == 0) goto L8b
                fp1.f r8 = fp1.C14678f.this
                fp1.e r8 = fp1.C14678f.m41978k(r8, r0)
                return r8
            L8b:
                boolean r8 = r1 instanceof fp1.AbstractC14675c.e
                if (r8 == 0) goto L96
                fp1.f r8 = fp1.C14678f.this
                fp1.e r8 = fp1.C14678f.m41976i(r8, r0)
                return r8
            L96:
                boolean r8 = r1 instanceof fp1.AbstractC14675c.d
                if (r8 == 0) goto Lae
                fp1.f r8 = fp1.C14678f.this
                fp1.c$d r1 = (fp1.AbstractC14675c.d) r1
                r7.f54225x = r3
                r7.f54226y = r3
                r7.f54224w = r4
                java.lang.Object r8 = fp1.C14678f.m41975h(r8, r1, r0, r7)
                if (r8 != r2) goto Lab
            Laa:
                return r2
            Lab:
                fp1.e r8 = (fp1.InterfaceC14677e) r8
                return r8
            Lae:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fp1.C14678f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fp1.f$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor", m100430f = "PostPartumInteractor.kt", m100431l = {86}, m100432m = "performSave", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f54228E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f54229F;

        /* JADX INFO: renamed from: H */
        int f54231H;

        /* JADX INFO: renamed from: w */
        Object f54232w;

        /* JADX INFO: renamed from: x */
        Object f54233x;

        /* JADX INFO: renamed from: y */
        Object f54234y;

        /* JADX INFO: renamed from: z */
        Object f54235z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f54229F = obj;
            this.f54231H |= Integer.MIN_VALUE;
            return C14678f.this.m41982o(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: fp1.f$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor$performSave$response$1", m100430f = "PostPartumInteractor.kt", m100431l = {88, 90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ PostPartumRequest f54236E;

        /* JADX INFO: renamed from: w */
        int f54237w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14676d f54238x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14678f f54239y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f54240z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C14676d c14676d, C14678f c14678f, String str, PostPartumRequest postPartumRequest, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f54238x = c14676d;
            this.f54239y = c14678f;
            this.f54240z = str;
            this.f54236E = postPartumRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f54238x, this.f54239y, this.f54240z, this.f54236E, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f54237w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L56
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L3c
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                fp1.d r5 = r4.f54238x
                com.whoop.hormonalinsights.postpartum.domain.models.PostPartumScreenType r5 = r5.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()
                com.whoop.hormonalinsights.postpartum.domain.models.PostPartumScreenType r1 = com.whoop.hormonalinsights.postpartum.domain.models.PostPartumScreenType.ALL
                if (r5 != r1) goto L3f
                fp1.f r5 = r4.f54239y
                com.whoop.hormonalinsights.api.HormonalInsightsApi r5 = fp1.C14678f.m41971d(r5)
                java.lang.String r1 = r4.f54240z
                com.whoop.hormonalinsights.postpartum.domain.models.PostPartumRequest r2 = r4.f54236E
                r4.f54237w = r3
                java.lang.Object r5 = r5.savePregnancy(r1, r2, r4)
                if (r5 != r0) goto L3c
                goto L55
            L3c:
                pg3.v0 r5 = (pg3.C29218v0) r5
                return r5
            L3f:
                fp1.f r5 = r4.f54239y
                com.whoop.hormonalinsights.api.HormonalInsightsApi r5 = fp1.C14678f.m41971d(r5)
                fp1.d r1 = r4.f54238x
                java.lang.String r1 = r1.getId()
                com.whoop.hormonalinsights.postpartum.domain.models.PostPartumRequest r3 = r4.f54236E
                r4.f54237w = r2
                java.lang.Object r5 = r5.updatePregnancy(r1, r3, r4)
                if (r5 != r0) goto L56
            L55:
                return r0
            L56:
                pg3.v0 r5 = (pg3.C29218v0) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: fp1.C14678f.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14678f(HormonalInsightsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: l */
    public final Object m41979l(AbstractC14675c.c cVar, InterfaceC30057d<? super InterfaceC14677e> interfaceC30057d) {
        b bVar;
        AbstractC14675c.c cVar2 = cVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f54217z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f54217z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f54215x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f54217z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar3 = new c(cVar2, null);
            bVar2.f54214w = cVar2;
            bVar2.f54217z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar3, bVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = (AbstractC14675c.c) bVar2.f54214w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC14677e.a(cVar2.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), cVar2.getId());
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar4 = (InterfaceC34385a.c) interfaceC34385a;
        HormonalScreenId initialPregnancyScreen = ((PostPartumResponse) cVar4.m108735a()).getInitialPregnancyScreen();
        if (initialPregnancyScreen == null) {
            initialPregnancyScreen = HormonalScreenId.CELEBRATION;
        }
        return new InterfaceC14677e.f((PostPartumResponse) cVar4.m108735a(), new C14679g(initialPregnancyScreen, C25271y.f99162w), new C14676d(null, null, null, false, null, 0, null, null, cVar2.getId(), cVar2.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), 255, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC14677e m41980m(InterfaceC14677e previousState) {
        AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.Success");
        InterfaceC14677e.f fVar = (InterfaceC14677e.f) previousState;
        HormonalScreenId hormonalScreenId = (HormonalScreenId) AbstractC25265s.m74112P0(fVar.getProgressResult().m41990b());
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(fVar.getProgressResult().m41990b());
        if (!arrayListM74097F1.isEmpty()) {
            arrayListM74097F1.remove(AbstractC37056f.m118951C(arrayListM74097F1));
        }
        return InterfaceC14677e.f.m41965b(fVar, null, new C14679g(hormonalScreenId, arrayListM74097F1), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final Object m41981n(AbstractC14675c.b bVar, InterfaceC14677e interfaceC14677e, InterfaceC30057d<? super InterfaceC14677e> interfaceC30057d) {
        C14679g progressResult;
        C14676d saveRequest;
        boolean z4 = interfaceC14677e instanceof InterfaceC14677e.f;
        InterfaceC14677e.f fVar = z4 ? (InterfaceC14677e.f) interfaceC14677e : null;
        if (fVar == null || (progressResult = fVar.getProgressResult()) == null) {
            AbstractC22676k.m65748h(interfaceC14677e, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.Saving");
            progressResult = ((InterfaceC14677e.e) interfaceC14677e).getProgressResult();
        }
        InterfaceC14677e.f fVar2 = z4 ? (InterfaceC14677e.f) interfaceC14677e : null;
        if (fVar2 == null || (saveRequest = fVar2.getSaveRequest()) == null) {
            AbstractC22676k.m65748h(interfaceC14677e, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.Saving");
            saveRequest = ((InterfaceC14677e.e) interfaceC14677e).getSaveRequest();
        }
        HormonalScreenId currentScreen = progressResult.getCurrentScreen();
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(progressResult.m41990b());
        arrayListM74097F1.add(currentScreen);
        C14676d c14676dM41983p = m41983p(saveRequest, currentScreen, bVar.getContent());
        if (bVar.getNextScreen() == null) {
            return m41982o(c14676dM41983p, progressResult, false, interfaceC30057d);
        }
        AbstractC22676k.m65748h(interfaceC14677e, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.Success");
        return InterfaceC14677e.f.m41965b((InterfaceC14677e.f) interfaceC14677e, null, new C14679g(bVar.getNextScreen(), arrayListM74097F1), c14676dM41983p, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: o */
    public final Object m41982o(C14676d c14676d, C14679g c14679g, boolean z4, InterfaceC30057d<? super InterfaceC14677e> interfaceC30057d) {
        f fVar;
        DeliveryType deliveryType;
        ArrayList arrayList;
        boolean z13;
        C14676d c14676d2;
        C14679g c14679g2;
        String strName;
        DeliveryType deliveryType2;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f54231H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f54231H = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f54229F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f54231H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            String id4 = c14676d.getId();
            String deliveryDate = c14676d.getDeliveryDate();
            EnumC14674b deliveryMethod = c14676d.getDeliveryMethod();
            if (deliveryMethod == null || (strName = deliveryMethod.name()) == null) {
                deliveryType = null;
            } else {
                DeliveryType[] deliveryTypeArrValues = DeliveryType.values();
                int length = deliveryTypeArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        deliveryType2 = null;
                        break;
                    }
                    deliveryType2 = deliveryTypeArrValues[i15];
                    if (AbstractC22676k.m65745e(deliveryType2.name(), strName)) {
                        break;
                    }
                    i15++;
                }
                deliveryType = deliveryType2;
            }
            List<C14673a> listM41949c = c14676d.m41949c();
            if (listM41949c != null) {
                List<C14673a> list = listM41949c;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new BabyData(((C14673a) it.next()).getWeight()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            z13 = z4;
            PostPartumRequest postPartumRequest = new PostPartumRequest(deliveryDate, deliveryType, arrayList, z13, c14676d.getPregnancyName());
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c14676d2 = c14676d;
            g gVar = new g(c14676d2, this, id4, postPartumRequest, null);
            fVar2.f54232w = c14676d2;
            c14679g2 = c14679g;
            fVar2.f54233x = c14679g2;
            fVar2.f54234y = null;
            fVar2.f54235z = null;
            fVar2.f54228E = z13;
            fVar2.f54231H = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, gVar, fVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z14 = fVar2.f54228E;
            C14679g c14679g3 = (C14679g) fVar2.f54233x;
            C14676d c14676d3 = (C14676d) fVar2.f54232w;
            AbstractC34132o.m107864I(objM108729b);
            z13 = z14;
            c14679g2 = c14679g3;
            c14676d2 = c14676d3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return InterfaceC14677e.d.f54205a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new InterfaceC14677e.c(z13, c14679g2, c14676d2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    private final C14676d m41983p(C14676d previousData, HormonalScreenId currentScreen, C14676d content) {
        List<String> listM41957k;
        List<String> listM41956j;
        switch (currentScreen == null ? -1 : a.f54213a[currentScreen.ordinal()]) {
            case 1:
                return C14676d.m41947b(previousData, content != null ? content.getDeliveryDate() : null, null, null, false, null, 0, null, null, null, null, 1022, null);
            case 2:
                return C14676d.m41947b(previousData, null, null, null, false, null, content != null ? content.getBabyCount() : 1, null, null, null, null, 991, null);
            case 3:
                List<C14673a> listM41949c = content != null ? content.m41949c() : null;
                C25271y c25271y = C25271y.f99162w;
                return C14676d.m41947b(previousData, null, null, listM41949c, false, null, 0, (content == null || (listM41956j = content.m41956j()) == null) ? c25271y : listM41956j, (content == null || (listM41957k = content.m41957k()) == null) ? c25271y : listM41957k, null, null, 827, null);
            case 4:
                return C14676d.m41947b(previousData, null, null, null, false, null, content != null ? content.getBabyCount() : 1, null, null, null, null, 991, null);
            case 5:
                return C14676d.m41947b(previousData, null, content != null ? content.getDeliveryMethod() : null, null, false, null, 0, null, null, null, null, 1021, null);
            case 6:
                return C14676d.m41947b(previousData, null, null, null, false, content != null ? content.getPregnancyName() : null, 0, null, null, null, null, MessageListItemViewType.TYPING_INDICATOR, null);
            default:
                return previousData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final Object m41984q(AbstractC14675c.d dVar, InterfaceC14677e interfaceC14677e, InterfaceC30057d<? super InterfaceC14677e> interfaceC30057d) {
        AbstractC22676k.m65748h(interfaceC14677e, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.Saving");
        InterfaceC14677e.e eVar = (InterfaceC14677e.e) interfaceC14677e;
        return m41982o(eVar.getSaveRequest(), eVar.getProgressResult(), dVar.getIsStealthModeOn(), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC14677e m41985r(InterfaceC14677e previousState) {
        C14676d saveRequest;
        C14679g progressResult;
        boolean z4 = previousState instanceof InterfaceC14677e.f;
        InterfaceC14677e.f fVar = z4 ? (InterfaceC14677e.f) previousState : null;
        if (fVar == null || (saveRequest = fVar.getSaveRequest()) == null) {
            AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.SaveError");
            saveRequest = ((InterfaceC14677e.c) previousState).getSaveRequest();
        }
        InterfaceC14677e.f fVar2 = z4 ? (InterfaceC14677e.f) previousState : null;
        if (fVar2 == null || (progressResult = fVar2.getProgressResult()) == null) {
            AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.SaveError");
            progressResult = ((InterfaceC14677e.c) previousState).getProgressResult();
        }
        return new InterfaceC14677e.e(progressResult, saveRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final InterfaceC14677e m41986s(AbstractC14675c.f action, InterfaceC14677e previousState) {
        AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.Success");
        InterfaceC14677e.f fVar = (InterfaceC14677e.f) previousState;
        HormonalScreenId currentScreen = fVar.getProgressResult().getCurrentScreen();
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(fVar.getProgressResult().m41990b());
        arrayListM74097F1.add(currentScreen);
        return InterfaceC14677e.f.m41965b(fVar, null, new C14679g(action.getNextScreen(), arrayListM74097F1), m41983p(fVar.getSaveRequest(), currentScreen, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC14677e m41987t(InterfaceC14677e previousState) {
        AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.PostPartumDomainResult.Success");
        InterfaceC14677e.f fVar = (InterfaceC14677e.f) previousState;
        HormonalScreenId currentScreen = fVar.getProgressResult().getCurrentScreen();
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(fVar.getProgressResult().m41990b());
        arrayListM74097F1.add(currentScreen);
        return InterfaceC14677e.f.m41965b(fVar, null, new C14679g(fVar.getResponse().getCongratulationsScreen().getNextPregnancyScreen(), arrayListM74097F1), null, 5, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC14677e.b.f54201a, AbstractC13091v.m36590P(upstream, new d(null)), new e(null));
    }

    public /* synthetic */ C14678f(HormonalInsightsApi hormonalInsightsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hormonalInsightsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PregnancyInsightsInteractor") : interfaceC34116n);
    }
}
