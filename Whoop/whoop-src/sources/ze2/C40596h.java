package ze2;

import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.commons.Status;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSaveDto;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSavingErrorDto;
import com.whoop.sleep.coach.data.network.model.sleepSchedule.AlarmScheduleFooterDto;
import com.whoop.sleep.coach.data.network.model.sleepSchedule.AlarmScheduleListDto;
import com.whoop.sleep.coach.data.network.model.sleepSchedule.ScheduleButtonComponentDto;
import com.whoop.sleep.coach.data.network.model.sleepSchedule.SleepScheduleDto;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ef2.C13151a;
import ff2.C14430a;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import xe2.EnumC38232a;
import ye2.C39479a;
import ye2.C39480b;

/* JADX INFO: renamed from: ze2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u00016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\rJ\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0%*\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010,\u001a\u00020+*\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u00100\u001a\u00020/*\u00020.H\u0002¢\u0006\u0004\b0\u00101J!\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\n¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m65681d2 = {"Lze2/h;", "", "Lef2/a;", "sleepCoachScheduleRepository", "Lff2/a;", "smartAlarmHandler", "Ltr2/n;", "logger", "<init>", "(Lef2/a;Lff2/a;Ltr2/n;)V", "Lec3/l;", "Lze2/g;", "k", "(Lq83/d;)Ljava/lang/Object;", "", "scheduleId", "Lze2/e;", "domain", "i", "(Ljava/lang/String;Lze2/e;Lq83/d;)Ljava/lang/Object;", "", "isScheduleEnabled", "s", "(ZLze2/e;Lq83/d;)Ljava/lang/Object;", "Lze2/h$a;", "j", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "r", "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;)Lze2/e;", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;", "Lye2/a;", "o", "(Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;)Lye2/a;", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;", "Lye2/b;", "p", "(Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lye2/b;", "", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;", "Lze2/b;", "n", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;", "Lze2/a;", "m", "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;)Lze2/a;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;", "Lze2/c;", "q", "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;)Lze2/c;", "Lze2/f;", "upstream", "l", "(Lec3/l;)Lec3/l;", "a", "Lef2/a;", "b", "Lff2/a;", "c", "Ltr2/n;", "d", "Lze2/e;", "domainStateCache", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40596h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13151a sleepCoachScheduleRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14430a smartAlarmHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C40593e domainStateCache;

    /* JADX INFO: renamed from: ze2.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lze2/h$a;", "", "<init>", "()V", "b", "a", "Lze2/h$a$a;", "Lze2/h$a$b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: ze2.h$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lze2/h$a$a;", "Lze2/h$a;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42747a extends a {

            /* JADX INFO: renamed from: a */
            public static final C42747a f174908a = new C42747a();

            private C42747a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: ze2.h$a$b */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lze2/h$a$b;", "Lze2/h$a;", "Lze2/e;", "sleepScheduleDomain", "<init>", "(Lze2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lze2/e;", "()Lze2/e;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C40593e sleepScheduleDomain;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C40593e sleepScheduleDomain) {
                super(null);
                AbstractC22676k.m65750j(sleepScheduleDomain, "sleepScheduleDomain");
                this.sleepScheduleDomain = sleepScheduleDomain;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C40593e getSleepScheduleDomain() {
                return this.sleepScheduleDomain;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.sleepScheduleDomain, ((b) other).sleepScheduleDomain);
            }

            public int hashCode() {
                return this.sleepScheduleDomain.hashCode();
            }

            public String toString() {
                return "ScheduleListSuccess(sleepScheduleDomain=" + this.sleepScheduleDomain + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ze2.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.sleepSchedule.SleepScheduleListInteractor$deleteScheduleById$2", m100430f = "SleepScheduleListInteractor.kt", m100431l = {79, 80, 82, 84, 87, 90, 91, 92, 97, 101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lze2/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f174910E;

        /* JADX INFO: renamed from: F */
        int f174911F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f174912G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C40593e f174913H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C40596h f174914I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f174915J;

        /* JADX INFO: renamed from: w */
        Object f174916w;

        /* JADX INFO: renamed from: x */
        Object f174917x;

        /* JADX INFO: renamed from: y */
        Object f174918y;

        /* JADX INFO: renamed from: z */
        Object f174919z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C40593e c40593e, C40596h c40596h, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174913H = c40593e;
            this.f174914I = c40596h;
            this.f174915J = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f174913H, this.f174914I, this.f174915J, interfaceC30057d);
            bVar.f174912G = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:21:0x00b2 A[PHI: r11
          0x00b2: PHI (r11v6 java.lang.Object) = (r11v5 java.lang.Object), (r11v0 java.lang.Object) binds: [B:19:0x00ae, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:26:0x00db  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00fe A[PHI: r2 r5 r11
          0x00fe: PHI (r2v12 int) = (r2v9 int), (r2v14 int) binds: [B:30:0x00fa, B:11:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x00fe: PHI (r5v11 ze2.h) = (r5v4 ze2.h), (r5v20 ze2.h) binds: [B:30:0x00fa, B:11:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x00fe: PHI (r11v22 java.lang.Object) = (r11v21 java.lang.Object), (r11v0 java.lang.Object) binds: [B:30:0x00fa, B:11:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:34:0x0108  */
        /* JADX WARN: Code duplicated, block: B:37:0x012a  */
        /* JADX WARN: Code duplicated, block: B:39:0x012e  */
        /* JADX WARN: Code duplicated, block: B:42:0x0154  */
        /* JADX WARN: Code duplicated, block: B:46:0x016c A[PHI: r2 r3
          0x016c: PHI (r2v17 int) = (r2v15 int), (r2v19 int) binds: [B:44:0x0168, B:6:0x0015] A[DONT_GENERATE, DONT_INLINE]
          0x016c: PHI (r3v11 ze2.h$a) = (r3v8 ze2.h$a), (r3v15 ze2.h$a) binds: [B:44:0x0168, B:6:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:49:0x0191  */
        /* JADX WARN: Code duplicated, block: B:51:0x0197  */
        /* JADX WARN: Code duplicated, block: B:54:0x01cb  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0126, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x018e, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x01c8, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01ee, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L56;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 526
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ze2.C40596h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ze2.h$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.sleepSchedule.SleepScheduleListInteractor", m100430f = "SleepScheduleListInteractor.kt", m100431l = {132}, m100432m = "fetchSleepScheduleList", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f174920w;

        /* JADX INFO: renamed from: y */
        int f174922y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f174920w = obj;
            this.f174922y |= Integer.MIN_VALUE;
            return C40596h.this.m131661j(this);
        }
    }

    /* JADX INFO: renamed from: ze2.h$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.sleepSchedule.SleepScheduleListInteractor$getSleepScheduleList$2", m100430f = "SleepScheduleListInteractor.kt", m100431l = {72, 73, 74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lze2/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f174923w;

        /* JADX INFO: renamed from: x */
        int f174924x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f174925y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C40596h.this.new d(interfaceC30057d);
            dVar.f174925y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        
            if (r0.emit(r2, r6) == r1) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f174925y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f174924x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L28
                if (r2 == r5) goto L24
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                java.lang.Object r0 = r6.f174923w
                ze2.h$a r0 = (ze2.C40596h.a) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L73
            L24:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L38
            L28:
                p505ts.AbstractC34132o.m107864I(r7)
                ze2.h r7 = ze2.C40596h.this
                r6.f174925y = r0
                r6.f174924x = r5
                java.lang.Object r7 = ze2.C40596h.m131653b(r7, r6)
                if (r7 != r1) goto L38
                goto L72
            L38:
                ze2.h$a r7 = (ze2.C40596h.a) r7
                ze2.h$a$a r2 = ze2.C40596h.a.C42747a.f174908a
                boolean r2 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r7, r2)
                r5 = 0
                if (r2 == 0) goto L52
                ze2.g$a r7 = ze2.InterfaceC40595g.a.f174901a
                r6.f174925y = r5
                r6.f174923w = r5
                r6.f174924x = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L73
                goto L72
            L52:
                boolean r2 = r7 instanceof ze2.C40596h.a.b
                if (r2 == 0) goto L76
                ze2.g$c r2 = new ze2.g$c
                ze2.d$d r4 = new ze2.d$d
                ze2.h$a$b r7 = (ze2.C40596h.a.b) r7
                ze2.e r7 = r7.getSleepScheduleDomain()
                r4.<init>(r7)
                r2.<init>(r4)
                r6.f174925y = r5
                r6.f174923w = r5
                r6.f174924x = r3
                java.lang.Object r7 = r0.emit(r2, r6)
                if (r7 != r1) goto L73
            L72:
                return r1
            L73:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            L76:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ze2.C40596h.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ze2.h$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.sleepSchedule.SleepScheduleListInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SleepScheduleListInteractor.kt", m100431l = {191, 194, 197, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f174927E;

        /* JADX INFO: renamed from: F */
        Object f174928F;

        /* JADX INFO: renamed from: G */
        Object f174929G;

        /* JADX INFO: renamed from: H */
        int f174930H;

        /* JADX INFO: renamed from: w */
        int f174931w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f174932x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f174933y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C40596h f174934z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C40596h c40596h) {
            super(3, interfaceC30057d);
            this.f174934z = c40596h;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC40594f abstractC40594f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f174934z);
            eVar.f174932x = interfaceC13062m;
            eVar.f174933y = abstractC40594f;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r10, r9) == r0) goto L32;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ze2.C40596h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC40594f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ze2.h$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.sleepSchedule.SleepScheduleListInteractor$toggleSleepSchedule$2", m100430f = "SleepScheduleListInteractor.kt", m100431l = {107, 109, 111, 113, 114, 116, 117, 118, 123, 127}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lze2/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f174935E;

        /* JADX INFO: renamed from: F */
        int f174936F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f174937G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C40593e f174938H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ boolean f174939I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C40596h f174940J;

        /* JADX INFO: renamed from: w */
        Object f174941w;

        /* JADX INFO: renamed from: x */
        Object f174942x;

        /* JADX INFO: renamed from: y */
        Object f174943y;

        /* JADX INFO: renamed from: z */
        boolean f174944z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C40593e c40593e, boolean z4, C40596h c40596h, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174938H = c40593e;
            this.f174939I = z4;
            this.f174940J = c40596h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f174938H, this.f174939I, this.f174940J, interfaceC30057d);
            fVar.f174937G = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:21:0x00ac A[PHI: r10
          0x00ac: PHI (r10v6 java.lang.Object) = (r10v5 java.lang.Object), (r10v0 java.lang.Object) binds: [B:19:0x00a8, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:29:0x00df  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:35:0x0101  */
        /* JADX WARN: Code duplicated, block: B:38:0x0118  */
        /* JADX WARN: Code duplicated, block: B:40:0x011c  */
        /* JADX WARN: Code duplicated, block: B:43:0x0142  */
        /* JADX WARN: Code duplicated, block: B:47:0x015a A[PHI: r2 r3
          0x015a: PHI (r2v15 int) = (r2v13 int), (r2v17 int) binds: [B:45:0x0156, B:6:0x0015] A[DONT_GENERATE, DONT_INLINE]
          0x015a: PHI (r3v12 ze2.h$a) = (r3v9 ze2.h$a), (r3v16 ze2.h$a) binds: [B:45:0x0156, B:6:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:50:0x017f  */
        /* JADX WARN: Code duplicated, block: B:52:0x0185  */
        /* JADX WARN: Code duplicated, block: B:55:0x01b7  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0114, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x017c, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01b4, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01da, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L57;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ze2.C40596h.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C40596h(C13151a sleepCoachScheduleRepository, C14430a smartAlarmHandler, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(sleepCoachScheduleRepository, "sleepCoachScheduleRepository");
        AbstractC22676k.m65750j(smartAlarmHandler, "smartAlarmHandler");
        AbstractC22676k.m65750j(logger, "logger");
        this.sleepCoachScheduleRepository = sleepCoachScheduleRepository;
        this.smartAlarmHandler = smartAlarmHandler;
        this.logger = logger;
        C40589a c40589a = new C40589a("", "", false, false, false);
        C40591c c40591c = new C40591c(false, "");
        C39479a c39479a = new C39479a("", "");
        this.domainStateCache = new C40593e("", C25271y.f99162w, c40589a, c40591c, false, false, "", new C39479a("", ""), c39479a, new C39480b("", "", "", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Object m131660i(String str, C40593e c40593e, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new b(c40593e, this, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m131661j(InterfaceC30057d<? super a> interfaceC30057d) {
        c cVar;
        SleepScheduleDto sleepScheduleDto;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f174922y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f174922y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36838j = cVar.f174920w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f174922y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36838j);
            C13151a c13151a = this.sleepCoachScheduleRepository;
            cVar.f174922y = 1;
            objM36838j = c13151a.m36838j(cVar);
            if (objM36838j == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36838j);
        }
        Resource resource = (Resource) objM36838j;
        if (resource.getStatus() == Status.SUCCESS && (sleepScheduleDto = (SleepScheduleDto) resource.getData()) != null) {
            C40593e c40593eM131668r = m131668r(sleepScheduleDto);
            this.domainStateCache = c40593eM131668r;
            return new a.b(c40593eM131668r);
        }
        return a.C42747a.f174908a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Object m131662k(InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new d(null));
    }

    /* JADX INFO: renamed from: m */
    private final C40589a m131663m(AlarmScheduleFooterDto alarmScheduleFooterDto) {
        return new C40589a(alarmScheduleFooterDto.getDescriptionTextDisplay(), alarmScheduleFooterDto.getCalloutTextHeaderDisplay(), alarmScheduleFooterDto.getScheduleComplete(), alarmScheduleFooterDto.getShouldShowCalloutText(), alarmScheduleFooterDto.getShouldShowDescriptionText());
    }

    /* JADX INFO: renamed from: n */
    private final List<C40590b> m131664n(List<AlarmScheduleListDto> list) {
        List<AlarmScheduleListDto> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (AlarmScheduleListDto alarmScheduleListDto : list2) {
            arrayList.add(new C40590b(EnumC38232a.INSTANCE.m122509a(alarmScheduleListDto.getAlarmMode()), alarmScheduleListDto.getDaysScheduledLabelDisplayList(), alarmScheduleListDto.getAlarmModeLabelDisplay(), alarmScheduleListDto.getEditLabelDisplay(), alarmScheduleListDto.getDeleteLabelDisplay(), alarmScheduleListDto.getLatestWakeTime(), alarmScheduleListDto.getAlarmOn(), alarmScheduleListDto.getScheduleDaysList(), alarmScheduleListDto.getScheduleId()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private final C39479a m131665o(ScheduleSaveDto scheduleSaveDto) {
        return new C39479a(scheduleSaveDto.getModalTitleDisplay(), scheduleSaveDto.getModalSubtextDisplay());
    }

    /* JADX INFO: renamed from: p */
    private final C39480b m131666p(ScheduleSavingErrorDto scheduleSavingErrorDto) {
        return new C39480b(scheduleSavingErrorDto.getButtonActionDisplayText(), scheduleSavingErrorDto.getDismissActionDisplayText(), scheduleSavingErrorDto.getModalTitleDisplay(), scheduleSavingErrorDto.getModalSubtextDisplay());
    }

    /* JADX INFO: renamed from: q */
    private final C40591c m131667q(ScheduleButtonComponentDto scheduleButtonComponentDto) {
        return new C40591c(scheduleButtonComponentDto.getShouldShowAddScheduleButton(), scheduleButtonComponentDto.getAddScheduleButtonLabelDisplay());
    }

    /* JADX INFO: renamed from: r */
    private final C40593e m131668r(SleepScheduleDto sleepScheduleDto) {
        C39479a c39479a;
        C39479a c39479a2;
        C39480b c39480b;
        String allAlarmScheduleLabelDisplay = sleepScheduleDto.getAllAlarmScheduleLabelDisplay();
        List<C40590b> listM131664n = m131664n(sleepScheduleDto.getAlarmScheduleList());
        C40589a c40589aM131663m = m131663m(sleepScheduleDto.getAlarmScheduleFooter());
        C40591c c40591cM131667q = m131667q(sleepScheduleDto.getScheduleButtonComponent());
        boolean zIsScheduleEnabled = sleepScheduleDto.isScheduleEnabled();
        boolean shouldShowOverlay = sleepScheduleDto.getShouldShowOverlay();
        String scheduleDisabledText = sleepScheduleDto.getScheduleDisabledText();
        ScheduleSaveDto deleteInProgressModal = sleepScheduleDto.getDeleteInProgressModal();
        if (deleteInProgressModal == null || (c39479a = m131665o(deleteInProgressModal)) == null) {
            c39479a = new C39479a("", "");
        }
        C39479a c39479a3 = c39479a;
        ScheduleSaveDto deletingSuccessModal = sleepScheduleDto.getDeletingSuccessModal();
        if (deletingSuccessModal == null || (c39479a2 = m131665o(deletingSuccessModal)) == null) {
            c39479a2 = new C39479a("", "");
        }
        ScheduleSavingErrorDto deleteErrorModal = sleepScheduleDto.getDeleteErrorModal();
        if (deleteErrorModal == null || (c39480b = m131666p(deleteErrorModal)) == null) {
            c39480b = new C39480b("", "", "", "");
        }
        return new C40593e(allAlarmScheduleLabelDisplay, listM131664n, c40589aM131663m, c40591cM131667q, zIsScheduleEnabled, shouldShowOverlay, scheduleDisabledText, c39479a2, c39479a3, c39480b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final Object m131669s(boolean z4, C40593e c40593e, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new f(c40593e, z4, this, null));
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m131670l(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new e(null, this));
    }
}
