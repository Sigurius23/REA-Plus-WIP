package p711j31;

import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.Collection;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34471q;
import p512u2.C34462h0;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32274h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: j31.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0012"}, m65681d2 = {"Lu2/v;", "Lu2/r;", "initialDown", "b", "(Lu2/v;Lu2/r;Lq83/d;)Ljava/lang/Object;", "Lu2/k;", "Lu2/q;", "pointerId", "", "c", "(Lu2/k;J)Z", "Ly3/f;", "a", "F", "mouseSlop", "defaultTouchSlop", "", "mouseToTouchSlopRatio", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21272c {

    /* JADX INFO: renamed from: a */
    private static final float f81222a;

    /* JADX INFO: renamed from: b */
    private static final float f81223b;

    /* JADX INFO: renamed from: c */
    private static final float f81224c;

    /* JADX INFO: renamed from: j31.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.DragGestureKt", m100430f = "DragGesture.kt", m100431l = {LogPriority.NONE}, m100432m = "awaitLongPressOrCancellation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f81225E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f81226F;

        /* JADX INFO: renamed from: G */
        int f81227G;

        /* JADX INFO: renamed from: w */
        Object f81228w;

        /* JADX INFO: renamed from: x */
        Object f81229x;

        /* JADX INFO: renamed from: y */
        Object f81230y;

        /* JADX INFO: renamed from: z */
        Object f81231z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81226F = obj;
            this.f81227G |= Integer.MIN_VALUE;
            return AbstractC21272c.m59687b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: j31.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.DragGestureKt$awaitLongPressOrCancellation$2", m100430f = "DragGesture.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81232w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC34476v f81233x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22669g0 f81234y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22669g0 f81235z;

        /* JADX INFO: renamed from: j31.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.DragGestureKt$awaitLongPressOrCancellation$2$1", m100430f = "DragGesture.kt", m100431l = {103, 120}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32274h implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            private /* synthetic */ Object f81236E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ C22669g0 f81237F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ C22669g0 f81238G;

            /* JADX INFO: renamed from: x */
            Object f81239x;

            /* JADX INFO: renamed from: y */
            int f81240y;

            /* JADX INFO: renamed from: z */
            int f81241z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22669g0 c22669g0, C22669g0 c22669g1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f81237F = c22669g0;
                this.f81238G = c22669g1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f81237F, this.f81238G, interfaceC30057d);
                aVar.f81236E = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0057  */
            /* JADX WARN: Code duplicated, block: B:20:0x0064 A[LOOP:2: B:16:0x0055->B:20:0x0064, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:68:0x0067 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:69:0x0068 A[EDGE_INSN: B:69:0x0068->B:22:0x0068 BREAK  A[LOOP:2: B:16:0x0055->B:20:0x0064], SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:34:0x00aa). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // s83.AbstractC32267a
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instruction units count: 308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p711j31.AbstractC21272c.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC34476v interfaceC34476v, C22669g0 c22669g0, C22669g0 c22669g1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81233x = interfaceC34476v;
            this.f81234y = c22669g0;
            this.f81235z = c22669g1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f81233x, this.f81234y, this.f81235z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81232w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34476v interfaceC34476v = this.f81233x;
                a aVar = new a(this.f81234y, this.f81235z, null);
                this.f81232w = 1;
                if (((C34462h0) interfaceC34476v).m108934X0(aVar, this) == enumC31071a) {
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

    static {
        float f13 = (float) 0.125d;
        f81222a = f13;
        float f14 = 18;
        f81223b = f14;
        f81224c = f13 / f14;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m59687b(InterfaceC34476v interfaceC34476v, C34472r c34472r, InterfaceC30057d<? super C34472r> interfaceC30057d) {
        a aVar;
        C22669g0 c22669g0;
        C34472r c34472r2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f81227G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f81227G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f81226F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f81227G;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) aVar.f81230y;
            c34472r = (C34472r) aVar.f81229x;
            try {
                AbstractC34132o.m107864I(obj);
                return null;
            } catch (TimeoutCancellationException unused) {
                c34472r2 = (C34472r) c22669g0.f89336w;
                if (c34472r2 == null) {
                    return c34472r;
                }
                return c34472r2;
            }
        }
        C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
        C22669g0 c22669g1 = new C22669g0();
        c22669g1.f89336w = c34472r;
        C34462h0 c34462h0 = (C34462h0) interfaceC34476v;
        c34462h0.getClass();
        long longPressTimeoutMillis = AbstractC0201g.m516p(c34462h0).f778Z.getLongPressTimeoutMillis();
        try {
            b bVar = new b(interfaceC34476v, c22669g1, c22669g0M32004w, null);
            aVar.f81228w = null;
            aVar.f81229x = c34472r;
            aVar.f81230y = c22669g0M32004w;
            aVar.f81231z = null;
            aVar.f81225E = longPressTimeoutMillis;
            aVar.f81227G = 1;
            if (AbstractC3028k2.m8748b(longPressTimeoutMillis, bVar, aVar) == enumC31071a) {
                return enumC31071a;
            }
            return null;
        } catch (TimeoutCancellationException unused2) {
            c22669g0 = c22669g0M32004w;
            c34472r2 = (C34472r) c22669g0.f89336w;
            if (c34472r2 == null) {
                return c34472r;
            }
            return c34472r2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public static final boolean m59688c(C34465k c34465k, long j7) {
        Object obj;
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        boolean z4 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = r10.get(i13);
            if (AbstractC34471q.m108943a(((C34472r) obj).f144815a, j7)) {
                break;
            }
            i13++;
        }
        C34472r c34472r = (C34472r) obj;
        if (c34472r != null && c34472r.f144818d) {
            z4 = true;
        }
        return true ^ z4;
    }
}
