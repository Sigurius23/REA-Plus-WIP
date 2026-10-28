package zg0;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bh0.C3248a;
import c93.InterfaceC4351m;
import com.whoop.p057ai.chat.models.AIConversation;
import com.whoop.p057ai.chat.models.AIConversationMetadata;
import com.whoop.p057ai.chat.models.AttachmentType;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import fl0.C14567l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd1.AbstractC22403o;
import l83.C23454a0;
import ld1.AbstractC23864c;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import nl0.EnumC26811m;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg0.AbstractC31380a;
import rg0.C31381b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tg0.C33778c;
import ug0.C34934c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zg0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00107\u001a\b\u0012\u0004\u0012\u00020\u00180/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103¨\u00068"}, m65681d2 = {"Lzg0/h;", "Lld1/c;", "Lzg0/i;", "Lzg0/g;", "Lor2/m;", "coroutineScope", "Lrg0/b;", "analyticsHelper", "Lug0/c;", "combiner", "Lbh0/a;", "reducer", "", "initialEvents", "<init>", "(Lor2/m;Lrg0/b;Lug0/c;Lbh0/a;Ljava/util/List;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lzg0/g;)V", "state", "u", "(Lzg0/i;)V", "", "", "Lzg0/k;", "pending", "r", "(Lzg0/i;Ljava/util/Map;)Lzg0/i;", "viewEvent", "t", "v", "x", "Lor2/m;", "y", "Lrg0/b;", "Lec3/o1;", "z", "Lec3/o1;", "viewEventFlow", "E", "Ljava/lang/String;", "currentFingerprint", "Lec3/p1;", "F", "Lec3/p1;", "pendingAttachments", "Lec3/l;", "G", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "H", "q", "turnCompletions", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40625h extends AbstractC23864c<C40626i, AbstractC40624g> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private String currentFingerprint;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13075p1 pendingAttachments;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l turnCompletions;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C31381b analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 viewEventFlow;

    /* JADX INFO: renamed from: zg0.h$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.AiChatViewModel$sendViewEvent$1", m100430f = "AiChatViewModel.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f175145w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC40624g f175147y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC40624g abstractC40624g, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f175147y = abstractC40624g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40625h.this.new a(this.f175147y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f175145w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C40625h.this.m131816t(this.f175147y);
                InterfaceC13072o1 interfaceC13072o1 = C40625h.this.viewEventFlow;
                AbstractC40624g abstractC40624g = this.f175147y;
                this.f175145w = 1;
                if (interfaceC13072o1.emit(abstractC40624g, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zg0.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f175148w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3248a f175149x;

        /* JADX INFO: renamed from: zg0.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f175150w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3248a f175151x;

            /* JADX INFO: renamed from: zg0.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.AiChatViewModel$special$$inlined$map$1$2", m100430f = "AiChatViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42750a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f175152E;

                /* JADX INFO: renamed from: F */
                Object f175153F;

                /* JADX INFO: renamed from: G */
                Object f175154G;

                /* JADX INFO: renamed from: H */
                int f175155H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f175156w;

                /* JADX INFO: renamed from: x */
                int f175157x;

                /* JADX INFO: renamed from: y */
                Object f175158y;

                public C42750a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f175156w = obj;
                    this.f175157x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3248a c3248a) {
                this.f175150w = interfaceC13062m;
                this.f175151x = c3248a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42750a c42750a;
                if (interfaceC30057d instanceof C42750a) {
                    c42750a = (C42750a) interfaceC30057d;
                    int i13 = c42750a.f175157x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42750a.f175157x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42750a = new C42750a(interfaceC30057d);
                    }
                } else {
                    c42750a = new C42750a(interfaceC30057d);
                }
                Object obj2 = c42750a.f175156w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42750a.f175157x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f175150w;
                    C40626i c40626iM9408h = this.f175151x.m9408h((C33778c) obj);
                    c42750a.f175158y = null;
                    c42750a.f175152E = null;
                    c42750a.f175153F = null;
                    c42750a.f175154G = null;
                    c42750a.f175155H = 0;
                    c42750a.f175157x = 1;
                    if (interfaceC13062m.emit(c40626iM9408h, c42750a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C3248a c3248a) {
            this.f175148w = interfaceC13058l;
            this.f175149x = c3248a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f175148w.collect(new a(interfaceC13062m, this.f175149x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zg0.h$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.AiChatViewModel$viewState$1", m100430f = "AiChatViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzg0/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f175160E;

        /* JADX INFO: renamed from: F */
        int f175161F;

        /* JADX INFO: renamed from: G */
        int f175162G;

        /* JADX INFO: renamed from: H */
        private /* synthetic */ Object f175163H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ List<AbstractC40624g> f175164I;

        /* JADX INFO: renamed from: w */
        Object f175165w;

        /* JADX INFO: renamed from: x */
        Object f175166x;

        /* JADX INFO: renamed from: y */
        Object f175167y;

        /* JADX INFO: renamed from: z */
        Object f175168z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends AbstractC40624g> list, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f175164I = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f175164I, interfaceC30057d);
            cVar.f175163H = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            int i13;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f175163H;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f175162G;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                it = this.f175164I.iterator();
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f175160E;
                it = (Iterator) this.f175166x;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                AbstractC40624g abstractC40624g = (AbstractC40624g) it.next();
                this.f175163H = interfaceC13062m;
                this.f175165w = null;
                this.f175166x = it;
                this.f175167y = null;
                this.f175168z = null;
                this.f175160E = i13;
                this.f175161F = 0;
                this.f175162G = 1;
                if (interfaceC13062m.emit(abstractC40624g, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zg0.h$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.AiChatViewModel$viewState$2", m100430f = "AiChatViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ltg0/c;", "it", "Ll83/a0;", "<anonymous>", "(Ltg0/c;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f175169w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f175170x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C40625h.this.new d(interfaceC30057d);
            dVar.f175170x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C33778c c33778c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(c33778c, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String fingerprint;
            AIConversationMetadata metadata;
            C33778c c33778c = (C33778c) this.f175170x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f175169w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C40625h c40625h = C40625h.this;
            AIConversation conversation = c33778c.getAiChatDomainResult().getConversation();
            if (conversation == null || (metadata = conversation.getMetadata()) == null || (fingerprint = metadata.getFingerprint()) == null) {
                fingerprint = "";
            }
            c40625h.currentFingerprint = fingerprint;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zg0.h$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.AiChatViewModel$viewState$4", m100430f = "AiChatViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lzg0/i;", "it", "Ll83/a0;", "<anonymous>", "(Lzg0/i;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f175172w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f175173x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C40625h.this.new e(interfaceC30057d);
            eVar.f175173x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C40626i c40626i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c40626i, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C40626i c40626i = (C40626i) this.f175173x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f175172w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C40625h.this.m131817u(c40626i);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zg0.h$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.presentation.AiChatViewModel$viewState$5", m100430f = "AiChatViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lzg0/i;", "state", "", "", "Lzg0/k;", "pending", "<anonymous>", "(Lzg0/i;Ljava/util/Map;)Lzg0/i;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f175175w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f175176x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f175177y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C40626i c40626i, Map<String, C40628k> map, InterfaceC30057d<? super C40626i> interfaceC30057d) {
            f fVar = C40625h.this.new f(interfaceC30057d);
            fVar.f175176x = c40626i;
            fVar.f175177y = map;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C40626i c40626i = (C40626i) this.f175176x;
            Map map = (Map) this.f175177y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f175175w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C40625h.this.m131815r(c40626i, map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40625h(C28180m coroutineScope, C31381b analyticsHelper, C34934c combiner, C3248a reducer, List<? extends AbstractC40624g> initialEvents) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(initialEvents, "initialEvents");
        this.coroutineScope = coroutineScope;
        this.analyticsHelper = analyticsHelper;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this.viewEventFlow = c13096w1M36592b;
        this.currentFingerprint = "";
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25272z.f99163w);
        this.pendingAttachments = c13045h2M36593c;
        C13060l1 c13060l1 = new C13060l1(new C13052j1(new b(new C13052j1(AbstractC27845h.m83945a(new C13015a0(new c(initialEvents, null), c13096w1M36592b), combiner), new d(null), 0), reducer), new e(null), 0), c13045h2M36593c, new f(null), 1);
        C13021b2 c13021b2 = C13105z1.f45288a;
        this.viewState = AbstractC13091v.m36586L(c13060l1, coroutineScope, c13021b2, 1);
        this.turnCompletions = AbstractC13091v.m36586L(AbstractC40629l.m131857b(getViewState()), coroutineScope, c13021b2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final C40626i m131815r(C40626i state, Map<String, C40628k> pending) {
        if (pending.isEmpty()) {
            return state;
        }
        List<C40628k> listM131827d = state.m131827d();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM131827d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Uri uri = ((C40628k) it.next()).getUri();
            String string = uri != null ? uri.toString() : null;
            if (string != null) {
                arrayList.add(string);
            }
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        Collection<C40628k> collectionValues = pending.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            Set set = setM74103I1;
            Uri uri2 = ((C40628k) obj).getUri();
            if (!AbstractC25265s.m74155w0(set, uri2 != null ? uri2.toString() : null)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.isEmpty() ? state : C40626i.m131824b(state, 0, null, false, false, null, null, null, null, null, false, null, false, false, AbstractC25265s.m74129g1(state.m131827d(), arrayList2), null, null, null, null, false, false, false, null, false, false, 16769023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m131816t(AbstractC40624g viewEvent) {
        if (viewEvent instanceof AbstractC40624g.b) {
            AbstractC40624g.b bVar = (AbstractC40624g.b) viewEvent;
            if (bVar.getIsPastConversation()) {
                this.analyticsHelper.m96620a(new AbstractC31380a.b0(bVar.getFingerprint()));
                return;
            }
            return;
        }
        if (viewEvent instanceof AbstractC40624g.q) {
            this.analyticsHelper.m96620a(AbstractC31380a.e0.f129057a);
            return;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC40624g.g.f175109a)) {
            this.analyticsHelper.m96620a(new AbstractC31380a.d(this.currentFingerprint));
            return;
        }
        if (viewEvent instanceof AbstractC40624g.n) {
            C14567l analyticsData = ((AbstractC40624g.n) viewEvent).getAnalyticsData();
            if (analyticsData != null) {
                this.analyticsHelper.m96620a(new AbstractC31380a.c0(analyticsData.getRole(), analyticsData.getMessageType(), analyticsData.getFailureReason()));
                return;
            }
            return;
        }
        if (viewEvent instanceof AbstractC40624g.e) {
            this.analyticsHelper.m96620a(new AbstractC31380a.f(((AbstractC40624g.e) viewEvent).getFingerprint()));
            return;
        }
        if (viewEvent instanceof AbstractC40624g.c) {
            this.analyticsHelper.m96620a(new AbstractC31380a.y(this.currentFingerprint));
            return;
        }
        if (viewEvent instanceof AbstractC40624g.w) {
            String method = ((AbstractC40624g.w) viewEvent).getMethod();
            if (method != null) {
                this.analyticsHelper.m96620a(new AbstractC31380a.t(this.currentFingerprint, method));
                return;
            }
            return;
        }
        if (viewEvent instanceof AbstractC40624g.v) {
            this.analyticsHelper.m96620a(AbstractC31380a.m.f129080a);
            return;
        }
        if ((viewEvent instanceof AbstractC40624g.d) || (viewEvent instanceof AbstractC40624g.m) || (viewEvent instanceof AbstractC40624g.l) || (viewEvent instanceof AbstractC40624g.h) || (viewEvent instanceof AbstractC40624g.f) || (viewEvent instanceof AbstractC40624g.t) || (viewEvent instanceof AbstractC40624g.u) || (viewEvent instanceof AbstractC40624g.j) || (viewEvent instanceof AbstractC40624g.i) || (viewEvent instanceof AbstractC40624g.k) || (viewEvent instanceof AbstractC40624g.r) || (viewEvent instanceof AbstractC40624g.s) || (viewEvent instanceof AbstractC40624g.a) || (viewEvent instanceof AbstractC40624g.p)) {
            return;
        }
        if (!(viewEvent instanceof AbstractC40624g.o)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC40624g.o oVar = (AbstractC40624g.o) viewEvent;
        this.analyticsHelper.m96620a(new AbstractC31380a.g0(this.currentFingerprint, oVar.getIndex(), oVar.getMessageCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m131817u(C40626i state) {
        C13045h2 c13045h2;
        Object value;
        LinkedHashMap linkedHashMap;
        if (((Map) ((C13045h2) this.pendingAttachments).getValue()).isEmpty()) {
            return;
        }
        if (state.getLoadingState() == EnumC26811m.SCREEN_ERROR) {
            C13045h2 c13045h3 = (C13045h2) this.pendingAttachments;
            c13045h3.getClass();
            c13045h3.m36571k(null, C25272z.f99163w);
            return;
        }
        List<C40628k> listM131827d = state.m131827d();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM131827d.iterator();
        while (it.hasNext()) {
            Uri uri = ((C40628k) it.next()).getUri();
            String string = uri != null ? uri.toString() : null;
            if (string != null) {
                arrayList.add(string);
            }
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        if (setM74103I1.isEmpty()) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p1 = this.pendingAttachments;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) value).entrySet()) {
                if (!setM74103I1.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } while (!c13045h2.m36569i(value, linkedHashMap));
    }

    /* JADX INFO: renamed from: w */
    private final void m131818w(AbstractC40624g event) {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        ArrayList arrayList;
        C13045h2 c13045h4;
        Object value3;
        Map map;
        LinkedHashMap linkedHashMap;
        if (event instanceof AbstractC40624g.w) {
            List<Uri> listM131808b = ((AbstractC40624g.w) event).m131808b();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM131808b, 10));
            for (Uri uri : listM131808b) {
                arrayList.add(new C40628k(AttachmentType.IMAGE, true, false, uri, null, null, new AbstractC22403o.c(uri.toString(), 0, 0, 0, 14, null), 52, null));
            }
        } else {
            if (!(event instanceof AbstractC40624g.v)) {
                if (event instanceof AbstractC40624g.m) {
                    InterfaceC13075p1 interfaceC13075p1 = this.pendingAttachments;
                    do {
                        c13045h3 = (C13045h2) interfaceC13075p1;
                        value2 = c13045h3.getValue();
                    } while (!c13045h3.m36569i(value2, AbstractC25247g0.m73991Z(((AbstractC40624g.m) event).getUri().toString(), (Map) value2)));
                    return;
                }
                if (event instanceof AbstractC40624g.l) {
                    InterfaceC13075p1 interfaceC13075p2 = this.pendingAttachments;
                    do {
                        c13045h2 = (C13045h2) interfaceC13075p2;
                        value = c13045h2.getValue();
                    } while (!c13045h2.m36569i(value, AbstractC25247g0.m73991Z(((AbstractC40624g.l) event).getFileUri().toString(), (Map) value)));
                    return;
                }
                if (event instanceof AbstractC40624g.q) {
                    C13045h2 c13045h5 = (C13045h2) this.pendingAttachments;
                    c13045h5.getClass();
                    c13045h5.m36571k(null, C25272z.f99163w);
                    return;
                }
                return;
            }
            AbstractC40624g.v vVar = (AbstractC40624g.v) event;
            List<Uri> listM131806c = vVar.m131806c();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM131806c, 10));
            int i13 = 0;
            for (Object obj : listM131806c) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                Uri uri2 = (Uri) obj;
                AttachmentType attachmentType = AttachmentType.PDF;
                List<String> listM131804a = vVar.m131804a();
                arrayList2.add(new C40628k(attachmentType, true, false, uri2, (i13 < 0 || i13 >= listM131804a.size()) ? "" : listM131804a.get(i13), null, null, 100, null));
                i13 = i14;
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p3 = this.pendingAttachments;
        do {
            c13045h4 = (C13045h2) interfaceC13075p3;
            value3 = c13045h4.getValue();
            map = (Map) value3;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(String.valueOf(((C40628k) obj2).getUri()), obj2);
            }
        } while (!c13045h4.m36569i(value3, AbstractC25247g0.m73995d0(map, linkedHashMap)));
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC13058l getTurnCompletions() {
        return this.turnCompletions;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC40624g event) {
        AbstractC22676k.m65750j(event, "event");
        m131818w(event);
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }
}
