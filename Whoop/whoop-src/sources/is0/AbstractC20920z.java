package is0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import d13.AbstractC11478a;
import ec3.InterfaceC13062m;
import es0.EnumC13588a;
import hy0.C17794v;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p163g1.C15079m3;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: is0.z */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0082@¢\u0006\u0004\b\n\u0010\t\u001aG\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u0011H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"", "id", "u", "(Ljava/lang/String;)Ljava/lang/String;", "t", "s", "Lf0/r1;", "Ll83/a0;", "x", "(Lf0/r1;Lq83/d;)Ljava/lang/Object;", "v", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lis0/e;", "comments", "scrollState", "Lkotlin/Function1;", "Lis0/r0;", "onEvent", "i", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "comment", "l", "(Landroidx/compose/ui/Modifier;Lis0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/o;", "a", "J", "EMOJI_ONLY_COMMENT_SIZE", "b", "EMOJI_ONLY_COMMENT_LINE_HEIGHT", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20920z {

    /* JADX INFO: renamed from: a */
    private static final long f78818a;

    /* JADX INFO: renamed from: b */
    private static final long f78819b;

    /* JADX INFO: renamed from: is0.z$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsCommentListKt$ReactionsCommentList$2$1", m100430f = "ReactionsCommentList.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78820w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f78821x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13821r1 c13821r1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78821x = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f78821x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78820w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13821r1 c13821r1 = this.f78821x;
                this.f78820w = 1;
                if (AbstractC20920z.m58027x(c13821r1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: is0.z$b */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsCommentListKt$ReactionsCommentList$3$1", m100430f = "ReactionsCommentList.kt", m100431l = {94}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78822w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f78823x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Set<String> f78824y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13821r1 f78825z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Set<String> set, C13821r1 c13821r1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78823x = str;
            this.f78824y = set;
            this.f78825z = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f78823x, this.f78824y, this.f78825z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78822w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str = this.f78823x;
                if (str != null && this.f78824y.add(str)) {
                    C13821r1 c13821r1 = this.f78825z;
                    this.f78822w = 1;
                    if (AbstractC20920z.m58027x(c13821r1, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: is0.z$c */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsCommentListKt$ReactionsCommentList$4$1", m100430f = "ReactionsCommentList.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78826w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f78827x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13821r1 f78828y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, C13821r1 c13821r1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78827x = z4;
            this.f78828y = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f78827x, this.f78828y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78826w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f78827x) {
                    C13821r1 c13821r1 = this.f78828y;
                    this.f78826w = 1;
                    if (AbstractC20920z.m58027x(c13821r1, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: is0.z$d */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsCommentListKt$ReactionsCommentList$5$1", m100430f = "ReactionsCommentList.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78829w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f78830x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C13821r1 c13821r1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78830x = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f78830x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78829w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13821r1 c13821r1 = this.f78830x;
                this.f78829w = 1;
                if (AbstractC20920z.m58025v(c13821r1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: is0.z$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78831a;

        static {
            int[] iArr = new int[EnumC13588a.values().length];
            try {
                iArr[EnumC13588a.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13588a.EMOJI_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78831a = iArr;
        }
    }

    /* JADX INFO: renamed from: is0.z$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22665e0 f78832w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f78833x;

        /* JADX INFO: renamed from: is0.z$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsCommentListKt$keepNewestVisibleWhenViewportShrinks$3", m100430f = "ReactionsCommentList.kt", m100431l = {72}, m100432m = "emit", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32269c {

            /* JADX INFO: renamed from: w */
            int f78834w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f78835x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ f<T> f78836y;

            /* JADX INFO: renamed from: z */
            int f78837z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(f<? super T> fVar, InterfaceC30057d<? super a> interfaceC30057d) {
                super(interfaceC30057d);
                this.f78836y = fVar;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f78835x = obj;
                this.f78837z |= Integer.MIN_VALUE;
                return this.f78836y.m58029b(0, this);
            }
        }

        public f(C22665e0 c22665e0, C13821r1 c13821r1) {
            this.f78832w = c22665e0;
            this.f78833x = c13821r1;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: b */
        public final Object m58029b(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar;
            if (interfaceC30057d instanceof a) {
                aVar = (a) interfaceC30057d;
                int i14 = aVar.f78837z;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f78837z = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, interfaceC30057d);
                }
            } else {
                aVar = new a(this, interfaceC30057d);
            }
            Object obj = aVar.f78835x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = aVar.f78837z;
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                if (i13 > this.f78832w.f89334w && this.f78833x.f49318a.m87024x() >= this.f78832w.f89334w) {
                    C13821r1 c13821r1 = this.f78833x;
                    aVar.f78834w = i13;
                    aVar.f78837z = 1;
                    if (c13821r1.m39185g(i13, aVar) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = aVar.f78834w;
                AbstractC34132o.m107864I(obj);
            }
            this.f78832w.f89334w = i13;
            return C23454a0.f92919a;
        }

        @Override // ec3.InterfaceC13062m
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
            return m58029b(((Number) obj).intValue(), interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: is0.z$g */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsCommentListKt", m100430f = "ReactionsCommentList.kt", m100431l = {64, 65}, m100432m = "scrollToNewest", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f78838w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f78839x;

        /* JADX INFO: renamed from: y */
        int f78840y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f78839x = obj;
            this.f78840y |= Integer.MIN_VALUE;
            return AbstractC20920z.m58027x(null, this);
        }
    }

    static {
        long jM113246h = AbstractC35745c.m113246h(56);
        f78818a = jM113246h;
        AbstractC35745c.m113242a(jM113246h);
        f78819b = AbstractC11478a.m30852d(jM113246h, 1095216660480L & jM113246h, 1.25f);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x015d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0189  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:132:0x0210  */
    /* JADX WARN: Code duplicated, block: B:133:0x0214  */
    /* JADX WARN: Code duplicated, block: B:138:0x0235  */
    /* JADX WARN: Code duplicated, block: B:142:0x0250 A[LOOP:0: B:140:0x024a->B:142:0x0250, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x028b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0297  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX INFO: renamed from: i */
    public static final void m58012i(Modifier modifier, List<C20878e> comments, C13821r1 c13821r1, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C13821r1 c13821r2;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        C13821r1 c13821r3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Modifier modifier4;
        C13821r1 c13821r1M92099U;
        int i17;
        Object objM87133R;
        C20878e c20878e;
        String id4;
        Object objM87133R2;
        Set set;
        boolean zBooleanValue;
        boolean z13;
        Object objM87133R3;
        boolean zM87153g;
        Object objM87133R4;
        boolean zM87155h;
        Object objM87133R5;
        boolean z14;
        Object objM87133R6;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(comments, "comments");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-89555296);
        int i18 = i14 & 1;
        int i19 = 4;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(comments) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c13821r2 = c13821r1;
                int i24 = c28655q.m87153g(c13821r2) ? 256 : 128;
                i15 |= i24;
            } else {
                c13821r2 = c13821r1;
            }
            i15 |= i24;
        } else {
            c13821r2 = c13821r1;
        }
        int i25 = i14 & 8;
        if (i25 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i14 & 4) != 0) {
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        i15 &= -897;
                    } else {
                        c13821r1M92099U = c13821r2;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C20918y(i19);
                            c28655q.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    i17 = i15;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                    modifier4 = modifier2;
                    i17 = i15;
                    c13821r1M92099U = c13821r2;
                }
                c28655q.m87175r();
                c20878e = (C20878e) AbstractC25265s.m74114R0(comments);
                if (c20878e == null) {
                    id4 = null;
                } else {
                    if (!c20878e.getIsPending()) {
                        c20878e = null;
                    }
                    if (c20878e != null) {
                        id4 = c20878e.getId();
                    } else {
                        id4 = null;
                    }
                }
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new LinkedHashSet();
                    c28655q.m87172p0(objM87133R2);
                }
                set = (Set) objM87133R2;
                WeakHashMap weakHashMap = C22944c2.f90553v;
                Boolean bool = (Boolean) C22949e.m66712e(c28655q).f90556c.f90544d.getValue();
                zBooleanValue = bool.booleanValue();
                int i26 = (i17 & 896) ^ 384;
                z13 = (i26 <= 256 && c28655q.m87153g(c13821r1M92099U)) || (i17 & 384) == 256;
                objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new a(c13821r1M92099U, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                zM87153g = c28655q.m87153g(id4) | c28655q.m87157i(set) | ((i26 <= 256 && c28655q.m87153g(c13821r1M92099U)) || (i17 & 384) == 256);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g || objM87133R4 == c28676v0) {
                    objM87133R4 = new b(id4, set, c13821r1M92099U, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, id4);
                zM87155h = c28655q.m87155h(zBooleanValue) | ((i26 <= 256 && c28655q.m87153g(c13821r1M92099U)) || (i17 & 384) == 256);
                objM87133R5 = c28655q.m87133R();
                if (zM87155h || objM87133R5 == c28676v0) {
                    objM87133R5 = new c(zBooleanValue, c13821r1M92099U, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool);
                z14 = (i26 <= 256 && c28655q.m87153g(c13821r1M92099U)) || (i17 & 384) == 256;
                objM87133R6 = c28655q.m87133R();
                if (z14 || objM87133R6 == c28676v0) {
                    objM87133R6 = new d(c13821r1M92099U, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c13821r1M92099U);
                float f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsCommentList")), c13821r1M92099U, 14), f14, 0.0f, f14, ((float) 3.5d) * f13, 2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(73185304);
                for (C20878e c20878e2 : comments) {
                    c28655q.m87144b0(1427617587, c20878e2.getId());
                    int i27 = AbstractC22403o.f87638a;
                    int i28 = TextResource.$stable;
                    int i29 = (((((i27 | i28) | i28) | i28) | GenericInteraction.$stable) << 3) | ((i17 >> 3) & 896);
                    Function1 function4 = function2;
                    m58015l(null, c20878e2, function4, c28655q, i29, 1);
                    c28655q.m87173q(false);
                    function2 = function4;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier3 = modifier4;
                c13821r3 = c13821r1M92099U;
                function3 = function2;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                c13821r3 = c13821r2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(modifier3, comments, c13821r3, function3, i13, i14, 16);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    i15 &= -897;
                } else {
                    c13821r1M92099U = c13821r2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C20918y(i19);
                        c28655q.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                i17 = i15;
            } else {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i14 & 4) != 0) {
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    i15 &= -897;
                } else {
                    c13821r1M92099U = c13821r2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C20918y(i19);
                        c28655q.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                i17 = i15;
            }
            c28655q.m87175r();
            c20878e = (C20878e) AbstractC25265s.m74114R0(comments);
            if (c20878e == null) {
                id4 = null;
            } else {
                if (!c20878e.getIsPending()) {
                    c20878e = null;
                }
                if (c20878e != null) {
                    id4 = c20878e.getId();
                } else {
                    id4 = null;
                }
            }
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new LinkedHashSet();
                c28655q.m87172p0(objM87133R2);
            }
            set = (Set) objM87133R2;
            WeakHashMap weakHashMap2 = C22944c2.f90553v;
            Boolean bool2 = (Boolean) C22949e.m66712e(c28655q).f90556c.f90544d.getValue();
            zBooleanValue = bool2.booleanValue();
            int i210 = (i17 & 896) ^ 384;
            if (i210 <= 256) {
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                objM87133R3 = new a(c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            zM87153g = c28655q.m87153g(id4) | c28655q.m87157i(set) | ((i210 <= 256 && c28655q.m87153g(c13821r1M92099U)) || (i17 & 384) == 256);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R4 = new b(id4, set, c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new b(id4, set, c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, id4);
            zM87155h = c28655q.m87155h(zBooleanValue) | ((i210 <= 256 && c28655q.m87153g(c13821r1M92099U)) || (i17 & 384) == 256);
            objM87133R5 = c28655q.m87133R();
            if (zM87155h) {
                objM87133R5 = new c(zBooleanValue, c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new c(zBooleanValue, c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool2);
            if (i210 <= 256) {
            }
            objM87133R6 = c28655q.m87133R();
            if (z14) {
                objM87133R6 = new d(c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new d(c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, c13821r1M92099U);
            float f15 = 8;
            float f16 = 2 * f15;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "ReactionsCommentList")), c13821r1M92099U, 14), f16, 0.0f, f16, ((float) 3.5d) * f15, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f15), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(73185304);
            while (r1.hasNext()) {
                c28655q.m87144b0(1427617587, c20878e2.getId());
                int i211 = AbstractC22403o.f87638a;
                int i212 = TextResource.$stable;
                int i213 = (((((i211 | i212) | i212) | i212) | GenericInteraction.$stable) << 3) | ((i17 >> 3) & 896);
                Function1 function5 = function2;
                m58015l(null, c20878e2, function5, c28655q, i213, 1);
                c28655q.m87173q(false);
                function2 = function5;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier3 = modifier4;
            c13821r3 = c13821r1M92099U;
            function3 = function2;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            c13821r3 = c13821r2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(modifier3, comments, c13821r3, function3, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m58013j(AbstractC20905r0 it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m58014k(Modifier modifier, List list, C13821r1 c13821r1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m58012i(modifier, list, c13821r1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x028a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0297  */
    /* JADX WARN: Code duplicated, block: B:107:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:115:0x031e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0322  */
    /* JADX WARN: Code duplicated, block: B:121:0x033d  */
    /* JADX WARN: Code duplicated, block: B:124:0x034d  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x0419  */
    /* JADX WARN: Code duplicated, block: B:134:0x0422  */
    /* JADX WARN: Code duplicated, block: B:137:0x043b  */
    /* JADX WARN: Code duplicated, block: B:139:0x043e  */
    /* JADX WARN: Code duplicated, block: B:140:0x046c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0474  */
    /* JADX WARN: Code duplicated, block: B:144:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:147:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x0233  */
    /* JADX WARN: Code duplicated, block: B:89:0x0235  */
    /* JADX WARN: Code duplicated, block: B:91:0x0238  */
    /* JADX WARN: Code duplicated, block: B:94:0x0267  */
    /* JADX WARN: Code duplicated, block: B:95:0x026b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v11, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r28v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v13, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r2v25, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r2v7, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r3v19, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v13, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v14, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v15, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v16, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public static final void m58015l(Modifier modifier, C20878e comment, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        ?? r14;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        GenericInteraction longPressAction;
        Object objM87133R;
        boolean z13;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        Modifier modifierM3363h;
        float f13;
        float f14;
        C2306l c2306l;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean isPending;
        C17916v0 c17916v0;
        float f15;
        float f16;
        C0209i c0209i5;
        Function1 function5;
        C2306l c2306l2;
        C2314t c2314t2;
        C0209i c0209i6;
        ?? r10;
        boolean z14;
        ?? r15;
        ?? r16;
        float f17;
        int iHashCode2;
        C2314t c2314t3;
        int iHashCode3;
        C2314t c2314t4;
        ?? r17;
        TextResource badge;
        ?? r18;
        ?? r19;
        Modifier modifierM107879c;
        int i16;
        C2886a c2886a;
        Object objM87133R4;
        AbstractC22676k.m65750j(comment, "comment");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-841181157);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(comment) : c28655q.m87157i(comment) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C20918y(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                longPressAction = comment.getLongPressAction();
                if (comment.getIsPending()) {
                    longPressAction = null;
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier2), m58024u(comment.getId()));
                if (longPressAction == null) {
                    c28655q.m87150e0(1506732183);
                    c28655q.m87173q(false);
                    modifierM3363h = c2314t;
                } else {
                    c28655q.m87150e0(1506824687);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q.m87157i(longPressAction);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C20887i0(2, function4, longPressAction);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C20886i(4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    modifierM3363h = AbstractC1092a.m3363h(c2314t, interfaceC21083i, interfaceC4339a, (InterfaceC4339a) objM87133R3, 444);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e = modifierM3599a.mo3471e(modifierM3363h);
                f13 = 1;
                f14 = 8;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * f14);
                c2306l = C2299e.f9107J;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                isPending = comment.getIsPending();
                c17916v0 = AbstractC17918w0.f69621a;
                if (isPending) {
                    c28655q.m87150e0(-718984120);
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f14, AbstractC1136a.m3599a(c2314t, m58022s(comment.getId()))), AbstractC33253j.f138651a), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), c17916v0), c28655q, 0);
                    c28655q.m87173q(false);
                    r10 = 0;
                    f16 = f13;
                    function5 = function4;
                    f15 = f14;
                    c2306l2 = c2306l;
                    c0209i6 = c0209i3;
                    r15 = c28655q;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    z14 = true;
                } else {
                    c28655q.m87150e0(-718682676);
                    f15 = f14;
                    f16 = f13;
                    c0209i5 = c0209i;
                    function5 = function4;
                    c2306l2 = c2306l;
                    c2314t2 = c2314t;
                    c0209i6 = c0209i3;
                    r10 = 0;
                    z14 = true;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(comment.getAvatar(), null, null, c28655q, AbstractC22403o.f87638a, 3), AbstractC8693b.m21274h(comment.getName(), c28655q, TextResource.$stable), AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f15, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
                    C28655q c28655q2 = c28655q;
                    c28655q2.m87173q(false);
                    r15 = c28655q2;
                }
                if (1.0f > 0.0d) {
                    r16 = z14;
                } else {
                    r16 = r10;
                }
                if (r16 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z14);
                f17 = ((float) 0.5d) * f15;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), C2299e.f9110M, r15, 6);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, layoutWeightElement);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i5, c23010xM66775a);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m2);
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N2);
                if (comment.getIsPending()) {
                    r15.m87150e0(-933183787);
                    c2314t3 = c2314t2;
                    float f18 = 4;
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3411h(f18 * f18, AbstractC1102d.m3424u(12 * f18, AbstractC1136a.m3599a(c2314t3, m58023t(comment.getId())))), f16, f18), C38072d.f163053a.m121949b(r15, C38072d.f163054b).getWhite10(), c17916v0), r15, r10);
                    r15.m87173q(r10);
                } else {
                    c2314t3 = c2314t2;
                    if (AbstractC8693b.m21270d(comment.getName()) && comment.getBadge() == null) {
                        r15.m87150e0(-932011987);
                        r15.m87173q(r10);
                    } else {
                        r15.m87150e0(-932737542);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f17), c2306l2, r15, 6);
                        iHashCode3 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, c2314t3);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i5, c22994r1M66759a2);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m3);
                        if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                        }
                        AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N3);
                        if (AbstractC8693b.m21270d(comment.getName())) {
                            r15.m87150e0(-651805565);
                            String strM21274h = AbstractC8693b.m21274h(comment.getName(), r15, TextResource.$stable);
                            ?? r24 = C38072d.f163053a;
                            int i19 = C38072d.f163054b;
                            c2314t4 = c2314t3;
                            ?? r28 = r15;
                            AbstractC30795n.m94707h(strM21274h, null, r24.m121949b(r15, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r24.m121952e(r15, i19).getB3(), null, r28, 0, C2886a.f11498d << 18, 196602);
                            ?? r25 = r28;
                            r25.m87173q(r10);
                            r17 = r25;
                        } else {
                            c2314t4 = c2314t3;
                            r15.m87150e0(-651566555);
                            r15.m87173q(r10);
                            r17 = r15;
                        }
                        badge = comment.getBadge();
                        if (badge == null) {
                            r17.m87150e0(-651522257);
                            r17.m87173q(r10);
                            r18 = r17;
                        } else {
                            r17.m87150e0(-651522256);
                            String strM21274h2 = AbstractC8693b.m21274h(badge, r17, TextResource.$stable);
                            ?? r26 = C38072d.f163053a;
                            int i24 = C38072d.f163054b;
                            ?? r29 = r17;
                            AbstractC30795n.m94707h(strM21274h2, null, r26.m121949b(r17, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r26.m121952e(r17, i24).getB3(), null, r29, 0, C2886a.f11498d << 18, 196602);
                            ?? r27 = r29;
                            r27.m87173q(r10);
                            r18 = r27;
                        }
                        r18.m87173q(z14);
                        r18.m87173q(r10);
                        r19 = r18;
                    }
                    if (comment.getIsPending()) {
                        modifierM107879c = AbstractC34132o.m107879c(0.4f, c2314t4);
                    } else {
                        modifierM107879c = c2314t4;
                    }
                    String strM21274h3 = AbstractC8693b.m21274h(comment.getText(), r19, TextResource.$stable);
                    i16 = e.f78831a[comment.getRenderStyle().ordinal()];
                    if (i16 != z14) {
                        r19.m87150e0(-168602825);
                        C2886a c2886aM8420a = C38072d.f163053a.m121952e(r19, C38072d.f163054b).getB1();
                        r19.m87173q(r10);
                        c2886a = c2886aM8420a;
                    } else {
                        if (i16 == 2) {
                            throw AbstractC11895b.m32003v(-168605579, r19, r10);
                        }
                        r19.m87150e0(-168600730);
                        r19.m87173q(r10);
                        c2886a = new C2886a(new C23285v0(0L, f78818a, null, null, null, 0L, null, null, 0, f78819b, 16646141), null, 2, null);
                    }
                    ?? r210 = r19;
                    AbstractC30795n.m94707h(strM21274h3, modifierM107879c, C38072d.f163053a.m121949b(r19, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, r210, 0, C2886a.f11498d << 18, 196600);
                    ?? r110 = r210;
                    r110.m87173q(z14);
                    r110.m87173q(z14);
                    function3 = function5;
                    modifier2 = modifier2;
                    r14 = r110;
                }
                c2314t4 = c2314t3;
                r19 = r15;
                if (comment.getIsPending()) {
                    modifierM107879c = AbstractC34132o.m107879c(0.4f, c2314t4);
                } else {
                    modifierM107879c = c2314t4;
                }
                String strM21274h4 = AbstractC8693b.m21274h(comment.getText(), r19, TextResource.$stable);
                i16 = e.f78831a[comment.getRenderStyle().ordinal()];
                if (i16 != z14) {
                    r19.m87150e0(-168602825);
                    C2886a c2886aM8420a2 = C38072d.f163053a.m121952e(r19, C38072d.f163054b).getB1();
                    r19.m87173q(r10);
                    c2886a = c2886aM8420a2;
                } else {
                    if (i16 == 2) {
                        throw AbstractC11895b.m32003v(-168605579, r19, r10);
                    }
                    r19.m87150e0(-168600730);
                    r19.m87173q(r10);
                    c2886a = new C2886a(new C23285v0(0L, f78818a, null, null, null, 0L, null, null, 0, f78819b, 16646141), null, 2, null);
                }
                ?? r211 = r19;
                AbstractC30795n.m94707h(strM21274h4, modifierM107879c, C38072d.f163053a.m121949b(r19, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, r211, 0, C2886a.f11498d << 18, 196600);
                ?? r111 = r211;
                r111.m87173q(z14);
                r111.m87173q(z14);
                function3 = function5;
                modifier2 = modifier2;
                r14 = r111;
            } else {
                c28655q.m87138X();
                function3 = function2;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 21, modifier2, (Object) comment, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C20918y(6);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            longPressAction = comment.getLongPressAction();
            if (comment.getIsPending()) {
                longPressAction = null;
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier2), m58024u(comment.getId()));
            if (longPressAction == null) {
                c28655q.m87150e0(1506732183);
                c28655q.m87173q(false);
                modifierM3363h = c2314t;
            } else {
                c28655q.m87150e0(1506824687);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q.m87157i(longPressAction);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C20887i0(2, function4, longPressAction);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C20887i0(2, function4, longPressAction);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C20886i(4);
                    c28655q.m87172p0(objM87133R3);
                }
                modifierM3363h = AbstractC1092a.m3363h(c2314t, interfaceC21083i2, interfaceC4339a2, (InterfaceC4339a) objM87133R3, 444);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e2 = modifierM3599a2.mo3471e(modifierM3363h);
            f13 = 1;
            f14 = 8;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f13 * f14);
            c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            isPending = comment.getIsPending();
            c17916v0 = AbstractC17918w0.f69621a;
            if (isPending) {
                c28655q.m87150e0(-718984120);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f14, AbstractC1136a.m3599a(c2314t, m58022s(comment.getId()))), AbstractC33253j.f138651a), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), c17916v0), c28655q, 0);
                c28655q.m87173q(false);
                r10 = 0;
                f16 = f13;
                function5 = function4;
                f15 = f14;
                c2306l2 = c2306l;
                c0209i6 = c0209i3;
                r15 = c28655q;
                c0209i5 = c0209i;
                c2314t2 = c2314t;
                z14 = true;
            } else {
                c28655q.m87150e0(-718682676);
                f15 = f14;
                f16 = f13;
                c0209i5 = c0209i;
                function5 = function4;
                c2306l2 = c2306l;
                c2314t2 = c2314t;
                c0209i6 = c0209i3;
                r10 = 0;
                z14 = true;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(comment.getAvatar(), null, null, c28655q, AbstractC22403o.f87638a, 3), AbstractC8693b.m21274h(comment.getName(), c28655q, TextResource.$stable), AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f15, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
                C28655q c28655q3 = c28655q;
                c28655q3.m87173q(false);
                r15 = c28655q3;
            }
            if (1.0f > 0.0d) {
                r16 = z14;
            } else {
                r16 = r10;
            }
            if (r16 == 0) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, z14);
            f17 = ((float) 0.5d) * f15;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), C2299e.f9110M, r15, 6);
            iHashCode2 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, layoutWeightElement2);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m5);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N5);
            if (comment.getIsPending()) {
                r15.m87150e0(-933183787);
                c2314t3 = c2314t2;
                float f19 = 4;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3411h(f19 * f19, AbstractC1102d.m3424u(12 * f19, AbstractC1136a.m3599a(c2314t3, m58023t(comment.getId())))), f16, f19), C38072d.f163053a.m121949b(r15, C38072d.f163054b).getWhite10(), c17916v0), r15, r10);
                r15.m87173q(r10);
            } else {
                c2314t3 = c2314t2;
                if (AbstractC8693b.m21270d(comment.getName())) {
                }
                r15.m87150e0(-932737542);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f17), c2306l2, r15, 6);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = r15.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(r15, c2314t3);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i5, c22994r1M66759a4);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m6);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N6);
                if (AbstractC8693b.m21270d(comment.getName())) {
                    r15.m87150e0(-651805565);
                    String strM21274h5 = AbstractC8693b.m21274h(comment.getName(), r15, TextResource.$stable);
                    ?? r212 = C38072d.f163053a;
                    int i110 = C38072d.f163054b;
                    c2314t4 = c2314t3;
                    ?? r213 = r15;
                    AbstractC30795n.m94707h(strM21274h5, null, r212.m121949b(r15, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r212.m121952e(r15, i110).getB3(), null, r213, 0, C2886a.f11498d << 18, 196602);
                    ?? r214 = r213;
                    r214.m87173q(r10);
                    r17 = r214;
                } else {
                    c2314t4 = c2314t3;
                    r15.m87150e0(-651566555);
                    r15.m87173q(r10);
                    r17 = r15;
                }
                badge = comment.getBadge();
                if (badge == null) {
                    r17.m87150e0(-651522257);
                    r17.m87173q(r10);
                    r18 = r17;
                } else {
                    r17.m87150e0(-651522256);
                    String strM21274h6 = AbstractC8693b.m21274h(badge, r17, TextResource.$stable);
                    ?? r215 = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    ?? r216 = r17;
                    AbstractC30795n.m94707h(strM21274h6, null, r215.m121949b(r17, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r215.m121952e(r17, i25).getB3(), null, r216, 0, C2886a.f11498d << 18, 196602);
                    ?? r217 = r216;
                    r217.m87173q(r10);
                    r18 = r217;
                }
                r18.m87173q(z14);
                r18.m87173q(r10);
                r19 = r18;
                if (comment.getIsPending()) {
                    modifierM107879c = AbstractC34132o.m107879c(0.4f, c2314t4);
                } else {
                    modifierM107879c = c2314t4;
                }
                String strM21274h7 = AbstractC8693b.m21274h(comment.getText(), r19, TextResource.$stable);
                i16 = e.f78831a[comment.getRenderStyle().ordinal()];
                if (i16 != z14) {
                    r19.m87150e0(-168602825);
                    C2886a c2886aM8420a3 = C38072d.f163053a.m121952e(r19, C38072d.f163054b).getB1();
                    r19.m87173q(r10);
                    c2886a = c2886aM8420a3;
                } else {
                    if (i16 == 2) {
                        throw AbstractC11895b.m32003v(-168605579, r19, r10);
                    }
                    r19.m87150e0(-168600730);
                    r19.m87173q(r10);
                    c2886a = new C2886a(new C23285v0(0L, f78818a, null, null, null, 0L, null, null, 0, f78819b, 16646141), null, 2, null);
                }
                ?? r218 = r19;
                AbstractC30795n.m94707h(strM21274h7, modifierM107879c, C38072d.f163053a.m121949b(r19, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, r218, 0, C2886a.f11498d << 18, 196600);
                ?? r112 = r218;
                r112.m87173q(z14);
                r112.m87173q(z14);
                function3 = function5;
                modifier2 = modifier2;
                r14 = r112;
            }
            c2314t4 = c2314t3;
            r19 = r15;
            if (comment.getIsPending()) {
                modifierM107879c = AbstractC34132o.m107879c(0.4f, c2314t4);
            } else {
                modifierM107879c = c2314t4;
            }
            String strM21274h8 = AbstractC8693b.m21274h(comment.getText(), r19, TextResource.$stable);
            i16 = e.f78831a[comment.getRenderStyle().ordinal()];
            if (i16 != z14) {
                r19.m87150e0(-168602825);
                C2886a c2886aM8420a4 = C38072d.f163053a.m121952e(r19, C38072d.f163054b).getB1();
                r19.m87173q(r10);
                c2886a = c2886aM8420a4;
            } else {
                if (i16 == 2) {
                    throw AbstractC11895b.m32003v(-168605579, r19, r10);
                }
                r19.m87150e0(-168600730);
                r19.m87173q(r10);
                c2886a = new C2886a(new C23285v0(0L, f78818a, null, null, null, 0L, null, null, 0, f78819b, 16646141), null, 2, null);
            }
            ?? r219 = r19;
            AbstractC30795n.m94707h(strM21274h8, modifierM107879c, C38072d.f163053a.m121949b(r19, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, r219, 0, C2886a.f11498d << 18, 196600);
            ?? r113 = r219;
            r113.m87173q(z14);
            r113.m87173q(z14);
            function3 = function5;
            modifier2 = modifier2;
            r14 = r113;
        } else {
            c28655q.m87138X();
            function3 = function2;
            r14 = c28655q;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 21, modifier2, (Object) comment, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m58016m(AbstractC20905r0 it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m58017n(Function1 function1, GenericInteraction genericInteraction) {
        function1.invoke(new AbstractC20905r0.b(genericInteraction));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m58018o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m58019p(Modifier modifier, C20878e c20878e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m58015l(modifier, c20878e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final String m58022s(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return "ReactionsCommentAvatarSkeleton_".concat(id4);
    }

    /* JADX INFO: renamed from: t */
    public static final String m58023t(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return "ReactionsCommentNameSkeleton_".concat(id4);
    }

    /* JADX INFO: renamed from: u */
    public static final String m58024u(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return "ReactionsCommentRow_".concat(id4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Object m58025v(C13821r1 c13821r1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C22665e0 c22665e0 = new C22665e0();
        c22665e0.f89334w = c13821r1.f49321d.m87024x();
        Object objCollect = AbstractC28683x.m87240H(new C20910u(c13821r1, 1)).collect(new f(c22665e0, c13821r1), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final int m58026w(C13821r1 c13821r1) {
        return c13821r1.f49321d.m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r5.m39185g(r6, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m58027x(p132f0.C13821r1 r5, q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            boolean r0 = r6 instanceof is0.AbstractC20920z.g
            if (r0 == 0) goto L13
            r0 = r6
            is0.z$g r0 = (is0.AbstractC20920z.g) r0
            int r1 = r0.f78840y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78840y = r1
            goto L18
        L13:
            is0.z$g r0 = new is0.z$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f78839x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f78840y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f78838w
            f0.r1 r5 = (p132f0.C13821r1) r5
            p505ts.AbstractC34132o.m107864I(r6)
            goto L6c
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.f78838w
            f0.r1 r5 = (p132f0.C13821r1) r5
            p505ts.AbstractC34132o.m107864I(r6)
            goto L5a
        L3e:
            p505ts.AbstractC34132o.m107864I(r6)
            is0.y r6 = new is0.y
            r2 = 5
            r6.<init>(r2)
            r0.f78838w = r5
            r0.f78840y = r4
            q83.j r2 = r0.getContext()
            p1.w0 r2 = p390p1.AbstractC28683x.m87268v(r2)
            java.lang.Object r6 = r2.mo7286k(r6, r0)
            if (r6 != r1) goto L5a
            goto L6b
        L5a:
            p1.h1 r6 = r5.f49321d
            int r6 = r6.m87024x()
            r2 = 0
            r0.f78838w = r2
            r0.f78840y = r3
            java.lang.Object r5 = r5.m39185g(r6, r0)
            if (r5 != r1) goto L6c
        L6b:
            return r1
        L6c:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: is0.AbstractC20920z.m58027x(f0.r1, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m58028y(long j7) {
        return C23454a0.f92919a;
    }
}
