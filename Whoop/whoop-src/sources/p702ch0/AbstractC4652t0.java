package p702ch0;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import zg0.C40622e;

/* JADX INFO: renamed from: ch0.t0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aP\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u000f\u001a\u0004\u0018\u00010\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lf0/r1;", "scrollState", "", "Lzg0/e;", "sections", "", "", "", "turnEndYs", "Lkotlin/Function0;", "viewportTopY", "turnId", "Ll83/a0;", "c", "(Lf0/r1;Ljava/util/List;Ljava/util/Map;Lc93/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "b", "(Ljava/util/List;Ljava/util/Map;F)Ljava/lang/String;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4652t0 {

    /* JADX INFO: renamed from: ch0.t0$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollPositioningKt", m100430f = "AiChatScrollPositioning.kt", m100431l = {20, 32, 50, 54}, m100432m = "restoreAiChatScrollPosition", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f18953E;

        /* JADX INFO: renamed from: F */
        Object f18954F;

        /* JADX INFO: renamed from: G */
        Object f18955G;

        /* JADX INFO: renamed from: H */
        int f18956H;

        /* JADX INFO: renamed from: I */
        int f18957I;

        /* JADX INFO: renamed from: J */
        int f18958J;

        /* JADX INFO: renamed from: K */
        int f18959K;

        /* JADX INFO: renamed from: L */
        int f18960L;

        /* JADX INFO: renamed from: M */
        /* synthetic */ Object f18961M;

        /* JADX INFO: renamed from: N */
        int f18962N;

        /* JADX INFO: renamed from: w */
        Object f18963w;

        /* JADX INFO: renamed from: x */
        Object f18964x;

        /* JADX INFO: renamed from: y */
        Object f18965y;

        /* JADX INFO: renamed from: z */
        Object f18966z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f18961M = obj;
            this.f18962N |= Integer.MIN_VALUE;
            return AbstractC4652t0.m14632c(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m14631b(List<C40622e> sections, Map<String, Float> turnEndYs, float f13) {
        Object next;
        String turnId;
        Float f14;
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(turnEndYs, "turnEndYs");
        Iterator<T> it = sections.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f14 = turnEndYs.get(((C40622e) next).getTurnId());
        } while ((f14 != null ? f14.floatValue() : Float.MAX_VALUE) <= f13);
        C40622e c40622e = (C40622e) next;
        if (c40622e != null && (turnId = c40622e.getTurnId()) != null) {
            return turnId;
        }
        C40622e c40622e2 = (C40622e) AbstractC25265s.m74114R0(sections);
        if (c40622e2 != null) {
            return c40622e2.getTurnId();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:43:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0117 -> B:40:0x011d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m14632c(p132f0.C13821r1 r19, java.util.List<zg0.C40622e> r20, java.util.Map<java.lang.String, java.lang.Float> r21, c93.InterfaceC4339a r22, java.lang.String r23, q83.InterfaceC30057d<? super l83.C23454a0> r24) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p702ch0.AbstractC4652t0.m14632c(f0.r1, java.util.List, java.util.Map, c93.a, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m14633d(long j7) {
        return C23454a0.f92919a;
    }
}
