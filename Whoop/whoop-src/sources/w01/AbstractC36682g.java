package w01;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import b03.C2205b;
import bc3.InterfaceC2994c0;
import c41.C4048j0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import cp0.C10965i;
import cp0.C10967i1;
import e31.AbstractC12610b;
import e31.C12611c;
import e31.C12612d;
import ec3.InterfaceC13037f2;
import ge3.AbstractC15751g;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import hy0.AbstractC17755i2;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27254g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p208i2.C17924z0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p294l3.C23267m0;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p505ts.AbstractC34132o;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25300i;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p734sl0.C32632k2;
import p736sz0.AbstractC33220t0;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import v01.C35508j;
import v11.C35552j;
import v31.C35608d;
import v41.AbstractC35684p;
import v41.C35657b0;
import v41.C35658c;
import v41.InterfaceC35689r0;
import vs2.C36478d;
import vv1.C36532c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: w01.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u001aA\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a'\u0010$\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0006H\u0003¢\u0006\u0004\b&\u0010'¨\u0006(²\u0006\f\u0010\f\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lw01/h;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lw01/c;", "defaultViewState", "A", "(Landroidx/compose/ui/Modifier;Lw01/h;Lkotlin/jvm/functions/Function1;Lw01/c;Landroidx/compose/runtime/Composer;II)V", "viewState", "", "path", "onEvent", "q", "(Landroidx/compose/ui/Modifier;Lw01/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "v", "(Landroidx/compose/ui/Modifier;Lw01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lny0/h;", "state", "Lcom/whoop/analytics/AnalyticEventModel;", "primaryAnalyticEvent", "P", "(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "N", "(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)Lc93/a;", "title", "", "count", "I", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "error", "onDismiss", "G", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "K", "(Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36682g {

    /* JADX INFO: renamed from: w01.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.communityfollowerlookup.CommunityFollowerLookupWrapperKt$CommunityFollowerLookupWrapper$2$1", m100430f = "CommunityFollowerLookupWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157100w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C36678c, AbstractC36676a> f157101x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36683h f157102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C36678c, AbstractC36676a> abstractC23864c, C36683h c36683h, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157101x = abstractC23864c;
            this.f157102y = c36683h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f157101x, this.f157102y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157100w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f157101x.mo1216g(new AbstractC36676a.d(this.f157102y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w01.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.communityfollowerlookup.CommunityFollowerLookupWrapperKt$CommunityFollowerLookupWrapper$3$1", m100430f = "CommunityFollowerLookupWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157103w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f157104x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f157105y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC23864c<C36678c, AbstractC36676a> f157106z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28670t2 interfaceC28670t2, Function1 function1, AbstractC23864c<C36678c, AbstractC36676a> abstractC23864c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157104x = interfaceC28670t2;
            this.f157105y = function1;
            this.f157106z = abstractC23864c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f157104x, this.f157105y, this.f157106z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157103w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            GenericInteraction genericInteractionM117703d = AbstractC36682g.m117716D(this.f157104x).getPendingHostInteraction();
            if (genericInteractionM117703d != null) {
                Function1 function1 = this.f157105y;
                AbstractC23864c<C36678c, AbstractC36676a> abstractC23864c = this.f157106z;
                function1.invoke(genericInteractionM117703d);
                abstractC23864c.mo1216g(AbstractC36676a.a.f157079a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w01.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.communityfollowerlookup.CommunityFollowerLookupWrapperKt$ErrorToastEffect$1$1", m100430f = "CommunityFollowerLookupWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157107w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f157108x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f157109y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157108x = context;
            this.f157109y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f157108x, this.f157109y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157107w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Context context = this.f157108x;
            Toast.makeText(context, context.getString(AbstractC16277f.f62281T), 1).show();
            this.f157109y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:114:0x0205  */
    /* JADX WARN: Code duplicated, block: B:115:0x020a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0216  */
    /* JADX WARN: Code duplicated, block: B:120:0x021c  */
    /* JADX WARN: Code duplicated, block: B:126:0x022f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0235  */
    /* JADX WARN: Code duplicated, block: B:133:0x0252  */
    /* JADX WARN: Code duplicated, block: B:134:0x0256  */
    /* JADX WARN: Code duplicated, block: B:136:0x0259  */
    /* JADX WARN: Code duplicated, block: B:137:0x025e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:140:0x026c  */
    /* JADX WARN: Code duplicated, block: B:142:0x027b  */
    /* JADX WARN: Code duplicated, block: B:143:0x029e  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:162:0x0312  */
    /* JADX WARN: Code duplicated, block: B:165:0x031a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x031c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0337  */
    /* JADX WARN: Code duplicated, block: B:171:0x0343  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6 A[PHI: r0 r3 r4
      0x00a6: PHI (r0v8 androidx.compose.ui.Modifier) = (r0v5 androidx.compose.ui.Modifier), (r0v10 androidx.compose.ui.Modifier) binds: [B:68:0x00c6, B:56:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r3v13 kotlin.jvm.functions.Function1) = (r3v7 kotlin.jvm.functions.Function1), (r3v14 kotlin.jvm.functions.Function1) binds: [B:68:0x00c6, B:56:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r4v16 int) = (r4v10 int), (r4v17 int) binds: [B:68:0x00c6, B:56:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:76:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:83:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b2  */
    /* JADX INFO: renamed from: A */
    public static final void m117713A(Modifier modifier, C36683h itemState, Function1 function1, C36678c c36678c, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        C36678c c36678c2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C36678c c36678c3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Modifier modifier4;
        C36678c c36678c4;
        Object objM87133R;
        String strM117755a;
        int i17;
        boolean z13;
        Object objM87133R2;
        InterfaceC4339a interfaceC4339a;
        int i18;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R3;
        C36678c c36678c5;
        AbstractC23864c abstractC23864c;
        AbstractC36677b abstractC36677b;
        InterfaceC13037f2 viewState;
        InterfaceC28601c1 interfaceC28601c1M87261o;
        C28676v0 c28676v1;
        InterfaceC30057d interfaceC30057d;
        boolean z14;
        boolean z15;
        Object objM87133R4;
        int i19;
        boolean z16;
        boolean zM87157i;
        Object objM87133R5;
        boolean zM87157i2;
        Object objM87133R6;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R7;
        boolean zM87153g3;
        Object objM87133R8;
        int i24;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1057309307);
        int i25 = i14 & 1;
        int i26 = 4;
        if (i25 != 0) {
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
            i15 |= c28655q.m87153g(itemState) ? 32 : 16;
        }
        int i27 = i14 & 4;
        if (i27 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    c36678c2 = c36678c;
                    if (c28655q.m87157i(c36678c2)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i24;
                } else {
                    c36678c2 = c36678c;
                }
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i24;
            } else {
                c36678c2 = c36678c;
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
                    if (i25 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C36478d(28);
                            c28655q.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c36678c4 = new C36678c(true, false, false, null, null, false, null, null, 0, null, null, null, null, 8190, null);
                    }
                    c28655q.m87175r();
                    strM117755a = itemState.getPath();
                    i17 = i15 & 112;
                    if (i17 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C36532c(itemState, i26);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    i18 = i15 >> 9;
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(strM117755a) | c28655q.m87153g(interfaceC4339a);
                        objM87133R3 = c28655q.m87133R();
                        if (!zM87153g || objM87133R3 == c28676v0) {
                            c36678c5 = c36678c4;
                            objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c36678c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, strM117755a);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            c36678c5 = c36678c4;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext2;
                            zM87153g2 = c28655q.m87153g(strM117755a) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                            objM87133R7 = c28655q.m87133R();
                            if (zM87153g2 || objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, new C23863b(c36678c4), strM117755a);
                                c28655q.m87172p0(objM87133R7);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R7;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(strM117755a) | c28655q.m87153g(interfaceC4339a);
                            objM87133R8 = c28655q.m87133R();
                            if (zM87153g3 || objM87133R8 == c28676v0) {
                                objM87133R8 = new C23863b(c36678c4);
                                c28655q.m87172p0(objM87133R8);
                            }
                            abstractC23864c = (C23863b) objM87133R8;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                        c36678c5 = c36678c4;
                    }
                    if (abstractC23864c instanceof AbstractC36677b) {
                        abstractC36677b = (AbstractC36677b) abstractC23864c;
                    } else {
                        abstractC36677b = null;
                    }
                    if (abstractC36677b != null) {
                        viewState = abstractC36677b.getViewState();
                    } else {
                        viewState = null;
                    }
                    if (viewState == null) {
                        c28655q.m87150e0(-987905002);
                        c28655q.m87173q(false);
                        interfaceC28601c1M87261o = null;
                    } else {
                        c28655q.m87150e0(-1832983221);
                        interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    if (interfaceC28601c1M87261o == null) {
                        c28655q.m87150e0(-1832981669);
                        interfaceC30057d = null;
                        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c36678c5, null, c28655q, (i15 >> 6) & 112, 2);
                        c28655q.m87173q(false);
                        c28676v1 = c28676v0;
                        interfaceC28601c1M87261o = interfaceC28601c1M87260n;
                    } else {
                        c28676v1 = c28676v0;
                        interfaceC30057d = null;
                        c28655q.m87150e0(-1832985048);
                        c28655q.m87173q(false);
                    }
                    String strM117755a2 = itemState.getPath();
                    boolean zM87157i3 = c28655q.m87157i(abstractC23864c);
                    if (i17 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i3 | z14;
                    objM87133R4 = c28655q.m87133R();
                    if (z15 || objM87133R4 == c28676v1) {
                        objM87133R4 = new a(abstractC23864c, itemState, interfaceC30057d);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM117755a2);
                    GenericInteraction genericInteractionM117703d = m117716D(interfaceC28601c1M87261o).getPendingHostInteraction();
                    boolean zM87153g4 = c28655q.m87153g(interfaceC28601c1M87261o);
                    i19 = i15 & 896;
                    if (i19 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i = zM87153g4 | z16 | c28655q.m87157i(abstractC23864c);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i || objM87133R5 == c28676v1) {
                        objM87133R5 = new b(interfaceC28601c1M87261o, function3, abstractC23864c, interfaceC30057d);
                        c28655q.m87172p0(objM87133R5);
                    }
                    GenericInteraction.Companion companion = GenericInteraction.INSTANCE;
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, genericInteractionM117703d);
                    C36678c c36678cM117716D = m117716D(interfaceC28601c1M87261o);
                    String strM117755a3 = itemState.getPath();
                    zM87157i2 = c28655q.m87157i(abstractC23864c) | (i19 == 256);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R6 == c28676v1) {
                        objM87133R6 = new C2205b(abstractC23864c, function3, 8);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifier5 = modifier4;
                    m117745q(modifier5, c36678cM117716D, strM117755a3, (Function1) objM87133R6, c28655q, i15 & 14, 0);
                    c28655q = c28655q;
                    modifier3 = modifier5;
                    c36678c3 = c36678c5;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    modifier4 = modifier2;
                    function3 = function2;
                }
                c36678c4 = c36678c2;
                c28655q.m87175r();
                strM117755a = itemState.getPath();
                i17 = i15 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C36532c(itemState, i26);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C36532c(itemState, i26);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R2;
                i18 = i15 >> 9;
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext3;
                        zM87153g2 = c28655q.m87153g(strM117755a) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R7 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, new C23863b(c36678c4), strM117755a);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, new C23863b(c36678c4), strM117755a);
                            c28655q.m87172p0(objM87133R7);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R7;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(strM117755a) | c28655q.m87153g(interfaceC4339a);
                        objM87133R8 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R8 = new C23863b(c36678c4);
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C23863b(c36678c4);
                            c28655q.m87172p0(objM87133R8);
                        }
                        abstractC23864c = (C23863b) objM87133R8;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    c36678c5 = c36678c4;
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(strM117755a) | c28655q.m87153g(interfaceC4339a);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        c36678c5 = c36678c4;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c36678c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, strM117755a);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        c36678c5 = c36678c4;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c36678c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, strM117755a);
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c instanceof AbstractC36677b) {
                    abstractC36677b = (AbstractC36677b) abstractC23864c;
                } else {
                    abstractC36677b = null;
                }
                if (abstractC36677b != null) {
                    viewState = abstractC36677b.getViewState();
                } else {
                    viewState = null;
                }
                if (viewState == null) {
                    c28655q.m87150e0(-987905002);
                    c28655q.m87173q(false);
                    interfaceC28601c1M87261o = null;
                } else {
                    c28655q.m87150e0(-1832983221);
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                    c28655q.m87173q(false);
                }
                if (interfaceC28601c1M87261o == null) {
                    c28655q.m87150e0(-1832981669);
                    interfaceC30057d = null;
                    InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c36678c5, null, c28655q, (i15 >> 6) & 112, 2);
                    c28655q.m87173q(false);
                    c28676v1 = c28676v0;
                    interfaceC28601c1M87261o = interfaceC28601c1M87260n2;
                } else {
                    c28676v1 = c28676v0;
                    interfaceC30057d = null;
                    c28655q.m87150e0(-1832985048);
                    c28655q.m87173q(false);
                }
                String strM117755a4 = itemState.getPath();
                boolean zM87157i4 = c28655q.m87157i(abstractC23864c);
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i4 | z14;
                objM87133R4 = c28655q.m87133R();
                if (z15) {
                    objM87133R4 = new a(abstractC23864c, itemState, interfaceC30057d);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(abstractC23864c, itemState, interfaceC30057d);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM117755a4);
                GenericInteraction genericInteractionM117703d2 = m117716D(interfaceC28601c1M87261o).getPendingHostInteraction();
                boolean zM87153g5 = c28655q.m87153g(interfaceC28601c1M87261o);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = zM87153g5 | z16 | c28655q.m87157i(abstractC23864c);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R5 = new b(interfaceC28601c1M87261o, function3, abstractC23864c, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(interfaceC28601c1M87261o, function3, abstractC23864c, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                }
                GenericInteraction.Companion companion2 = GenericInteraction.INSTANCE;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, genericInteractionM117703d2);
                C36678c c36678cM117716D2 = m117716D(interfaceC28601c1M87261o);
                String strM117755a5 = itemState.getPath();
                zM87157i2 = c28655q.m87157i(abstractC23864c) | (i19 == 256);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R6 = new C2205b(abstractC23864c, function3, 8);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C2205b(abstractC23864c, function3, 8);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifier6 = modifier4;
                m117745q(modifier6, c36678cM117716D2, strM117755a5, (Function1) objM87133R6, c28655q, i15 & 14, 0);
                c28655q = c28655q;
                modifier3 = modifier6;
                c36678c3 = c36678c5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c36678c3 = c36678c2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier3, itemState, function3, c36678c3, i13, i14, 25);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c36678c2 = c36678c;
                if (c28655q.m87157i(c36678c2)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i24;
            } else {
                c36678c2 = c36678c;
            }
            i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i24;
        } else {
            c36678c2 = c36678c;
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
            if (i16 != 0) {
                if (i25 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i27 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C36478d(28);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c36678c4 = new C36678c(true, false, false, null, null, false, null, null, 0, null, null, null, null, 8190, null);
                } else {
                    c36678c4 = c36678c2;
                }
            } else {
                if (i25 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i27 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C36478d(28);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c36678c4 = new C36678c(true, false, false, null, null, false, null, null, 0, null, null, null, null, 8190, null);
                } else {
                    c36678c4 = c36678c2;
                }
            }
            c28655q.m87175r();
            strM117755a = itemState.getPath();
            i17 = i15 & 112;
            if (i17 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C36532c(itemState, i26);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C36532c(itemState, i26);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC4339a = (InterfaceC4339a) objM87133R2;
            i18 = i15 >> 9;
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext4 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext4, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext4;
                    zM87153g2 = c28655q.m87153g(strM117755a) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R7 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, new C23863b(c36678c4), strM117755a);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, new C23863b(c36678c4), strM117755a);
                        c28655q.m87172p0(objM87133R7);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R7;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(strM117755a) | c28655q.m87153g(interfaceC4339a);
                    objM87133R8 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R8 = new C23863b(c36678c4);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C23863b(c36678c4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    abstractC23864c = (C23863b) objM87133R8;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                c36678c5 = c36678c4;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c36678c4)) || (i18 & 6) == 4) | c28655q.m87153g(strM117755a) | c28655q.m87153g(interfaceC4339a);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    c36678c5 = c36678c4;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c36678c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, strM117755a);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    c36678c5 = c36678c4;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c36678c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC36677b.class), interfaceC4339a, strM117755a);
                    c28655q.m87172p0(objM87133R3);
                }
                abstractC23864c = (AbstractC23864c) objM87133R3;
                c28655q.m87173q(false);
            }
            if (abstractC23864c instanceof AbstractC36677b) {
                abstractC36677b = (AbstractC36677b) abstractC23864c;
            } else {
                abstractC36677b = null;
            }
            if (abstractC36677b != null) {
                viewState = abstractC36677b.getViewState();
            } else {
                viewState = null;
            }
            if (viewState == null) {
                c28655q.m87150e0(-987905002);
                c28655q.m87173q(false);
                interfaceC28601c1M87261o = null;
            } else {
                c28655q.m87150e0(-1832983221);
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                c28655q.m87173q(false);
            }
            if (interfaceC28601c1M87261o == null) {
                c28655q.m87150e0(-1832981669);
                interfaceC30057d = null;
                InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c36678c5, null, c28655q, (i15 >> 6) & 112, 2);
                c28655q.m87173q(false);
                c28676v1 = c28676v0;
                interfaceC28601c1M87261o = interfaceC28601c1M87260n3;
            } else {
                c28676v1 = c28676v0;
                interfaceC30057d = null;
                c28655q.m87150e0(-1832985048);
                c28655q.m87173q(false);
            }
            String strM117755a6 = itemState.getPath();
            boolean zM87157i5 = c28655q.m87157i(abstractC23864c);
            if (i17 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i5 | z14;
            objM87133R4 = c28655q.m87133R();
            if (z15) {
                objM87133R4 = new a(abstractC23864c, itemState, interfaceC30057d);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(abstractC23864c, itemState, interfaceC30057d);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM117755a6);
            GenericInteraction genericInteractionM117703d3 = m117716D(interfaceC28601c1M87261o).getPendingHostInteraction();
            boolean zM87153g6 = c28655q.m87153g(interfaceC28601c1M87261o);
            i19 = i15 & 896;
            if (i19 == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i = zM87153g6 | z16 | c28655q.m87157i(abstractC23864c);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R5 = new b(interfaceC28601c1M87261o, function3, abstractC23864c, interfaceC30057d);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new b(interfaceC28601c1M87261o, function3, abstractC23864c, interfaceC30057d);
                c28655q.m87172p0(objM87133R5);
            }
            GenericInteraction.Companion companion3 = GenericInteraction.INSTANCE;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, genericInteractionM117703d3);
            C36678c c36678cM117716D3 = m117716D(interfaceC28601c1M87261o);
            String strM117755a7 = itemState.getPath();
            zM87157i2 = c28655q.m87157i(abstractC23864c) | (i19 == 256);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R6 = new C2205b(abstractC23864c, function3, 8);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C2205b(abstractC23864c, function3, 8);
                c28655q.m87172p0(objM87133R6);
            }
            Modifier modifier7 = modifier4;
            m117745q(modifier7, c36678cM117716D3, strM117755a7, (Function1) objM87133R6, c28655q, i15 & 14, 0);
            c28655q = c28655q;
            modifier3 = modifier7;
            c36678c3 = c36678c5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c36678c3 = c36678c2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(modifier3, itemState, function3, c36678c3, i13, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m117714B(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m117715C(C36683h c36683h) {
        return AbstractC15751g.m44431K(c36683h.getRefreshScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C36678c m117716D(InterfaceC28670t2 interfaceC28670t2) {
        return (C36678c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m117717E(AbstractC23864c abstractC23864c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC36676a) {
            abstractC23864c.mo1216g(event);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m117718F(Modifier modifier, C36683h c36683h, Function1 function1, C36678c c36678c, int i13, int i14, Composer composer, int i15) {
        m117713A(modifier, c36683h, function1, c36678c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final void m117719G(String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(74008721);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            if (str != null) {
                c28655q.m87150e0(1475715223);
                boolean zM87157i = c28655q.m87157i(context) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new c(context, interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, str);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1475955473);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(str, interfaceC4339a, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m117720H(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m117719G(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0182  */
    /* JADX WARN: Code duplicated, block: B:51:0x018f  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x007a, please report this as an issue */
    /* JADX INFO: renamed from: I */
    private static final void m117721I(Modifier modifier, String str, Integer num, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Integer num2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        Integer num3;
        C28677v1 c28677v1M87180u;
        Integer num4;
        List listM118958J;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-215424450);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                num2 = num;
                i15 |= c28655q2.m87153g(num2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (num4 != null) {
                    c28655q2.m87150e0(-1028486199);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    C38072d c38072d = C38072d.f163053a;
                    listM118958J = AbstractC37056f.m118959K(new C23465k(upperCase, new C23267m0(c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534)), new C23465k(" (" + num4 + ")", new C23267m0(c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534)));
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1028297006);
                    String upperCase2 = str.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                    listM118958J = AbstractC37056f.m118958J(new C23465k(upperCase2, new C23267m0(C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534)));
                    c28655q2.m87173q(false);
                }
                float f13 = ((float) 0.25d) * 4;
                c28655q = c28655q2;
                AbstractC30795n.m94704e(listM118958J, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier3), 8 * ((float) 0.5d), f13, 0.0f, f13, 4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C38072d.f163053a.m121952e(c28655q2, 6).getSh4(), c28655q, 0, 0, 131068);
                num3 = num4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(modifier3, str, num3, i13, i14, 19);
            }
        }
        i15 |= 384;
        num2 = num;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i17 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (num4 != null) {
                c28655q2.m87150e0(-1028486199);
                String upperCase3 = str.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                C38072d c38072d2 = C38072d.f163053a;
                listM118958J = AbstractC37056f.m118959K(new C23465k(upperCase3, new C23267m0(c38072d2.m121949b(c28655q2, 6).getBrandWhite(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534)), new C23465k(" (" + num4 + ")", new C23267m0(c38072d2.m121949b(c28655q2, 6).getWhite70(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534)));
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1028297006);
                String upperCase4 = str.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                listM118958J = AbstractC37056f.m118958J(new C23465k(upperCase4, new C23267m0(C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534)));
                c28655q2.m87173q(false);
            }
            float f14 = ((float) 0.25d) * 4;
            c28655q = c28655q2;
            AbstractC30795n.m94704e(listM118958J, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier3), 8 * ((float) 0.5d), f14, 0.0f, f14, 4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C38072d.f163053a.m121952e(c28655q2, 6).getSh4(), c28655q, 0, 0, 131068);
            num3 = num4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            num3 = num2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier3, str, num3, i13, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m117722J(Modifier modifier, String str, Integer num, int i13, int i14, Composer composer, int i15) {
        m117721I(modifier, str, num, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final void m117723K(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(495523158);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, EnumC27254g.COMPACT.getVerticalPadding(), 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 4;
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(f13 * f13, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m117724L(int i13, Composer composer, int i14) {
        m117723K(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final InterfaceC4339a m117726N(C27256h c27256h, AnalyticEventModel analyticEventModel, Function1 function1) {
        return new C35508j(c27256h, analyticEventModel, function1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m117727O(C27256h c27256h, AnalyticEventModel analyticEventModel, Function1 function1) {
        m117728P(c27256h, analyticEventModel, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final void m117728P(C27256h c27256h, AnalyticEventModel analyticEventModel, Function1 function1) {
        Action action = c27256h.getAction();
        if (action != null) {
            if (analyticEventModel != null) {
                AbstractC13673n.m38578y(null, analyticEventModel, function1);
            }
            function1.invoke(new AbstractC36676a.e(action));
        } else if (analyticEventModel != null) {
            function1.invoke(new DesignItemInteraction(c27256h, analyticEventModel));
        } else {
            function1.invoke(c27256h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0185  */
    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x010c  */
    /* JADX WARN: Code duplicated, block: B:79:0x011a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:89:0x0158  */
    /* JADX WARN: Code duplicated, block: B:90:0x015a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:0x0163  */
    /* JADX WARN: Code duplicated, block: B:97:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x016d  */
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
    /* JADX INFO: renamed from: q */
    private static final void m117745q(Modifier modifier, C36678c c36678c, String str, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        String str3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        String str4;
        C28676v0 c28676v0;
        String strM117700a;
        int i18;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function4;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2010061275);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q.m87157i(c36678c) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 2048;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i24 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C36680e(0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function2 = (Function1) objM87133R3;
                    }
                    strM117700a = c36678c.getActionError();
                    if (strM117700a == null) {
                        strM117700a = c36678c.getLoadMoreError();
                    }
                    i18 = i15 & 7168;
                    if (i18 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C36681f(function2, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    m117719G(strM117700a, (InterfaceC4339a) objM87133R, c28655q, 0);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (c36678c.getIsLoading()) {
                        c28655q.m87150e0(1286107659);
                        AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                        c28655q.m87173q(false);
                    } else {
                        if (c36678c.getIsError()) {
                            c28655q.m87150e0(1286112274);
                            C12611c c12611cM35368c = C12612d.f43056a.m35368c();
                            if (i18 == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z15 | z14;
                            objM87133R2 = c28655q.m87133R();
                            if (z16 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C4048j0(function2, str4, 14);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC12610b.m35349f(c12611cM35368c, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                            c28655q.m87173q(false);
                        } else if (c36678c.m117701b().isEmpty()) {
                            function4 = function2;
                            c28655q.m87150e0(1215401249);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1286120598);
                            function4 = function2;
                            m117750v(AbstractC1099a.m3394p(2 * 8, AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q, 6).getWhite5())), c36678c, function4, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 0);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        function3 = function4;
                        str3 = str4;
                    }
                    function4 = function2;
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    function3 = function4;
                    str3 = str4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    str3 = str2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(modifier3, c36678c, str3, function3, i13, i14, 26);
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
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                if (i24 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C36680e(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function2 = (Function1) objM87133R3;
                }
                strM117700a = c36678c.getActionError();
                if (strM117700a == null) {
                    strM117700a = c36678c.getLoadMoreError();
                }
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C36681f(function2, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C36681f(function2, 0);
                    c28655q.m87172p0(objM87133R);
                }
                m117719G(strM117700a, (InterfaceC4339a) objM87133R, c28655q, 0);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (c36678c.getIsLoading()) {
                    c28655q.m87150e0(1286107659);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                    c28655q.m87173q(false);
                } else {
                    if (c36678c.getIsError()) {
                        c28655q.m87150e0(1286112274);
                        C12611c c12611cM35368c2 = C12612d.f43056a.m35368c();
                        if (i18 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C4048j0(function2, str4, 14);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4048j0(function2, str4, 14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c2, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                        c28655q.m87173q(false);
                    } else if (c36678c.m117701b().isEmpty()) {
                        c28655q.m87150e0(1286120598);
                        function4 = function2;
                        m117750v(AbstractC1099a.m3394p(2 * 8, AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q, 6).getWhite5())), c36678c, function4, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 0);
                        c28655q.m87173q(false);
                    } else {
                        function4 = function2;
                        c28655q.m87150e0(1215401249);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    function3 = function4;
                    str3 = str4;
                }
                function4 = function2;
                c28655q.m87173q(true);
                modifier3 = modifier2;
                function3 = function4;
                str3 = str4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                str3 = str2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier3, c36678c, str3, function3, i13, i14, 26);
            }
        }
        i15 |= 384;
        str2 = str;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                if (i24 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C36680e(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function2 = (Function1) objM87133R3;
                }
                strM117700a = c36678c.getActionError();
                if (strM117700a == null) {
                    strM117700a = c36678c.getLoadMoreError();
                }
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = new C36681f(function2, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C36681f(function2, 0);
                    c28655q.m87172p0(objM87133R);
                }
                m117719G(strM117700a, (InterfaceC4339a) objM87133R, c28655q, 0);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier2);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                if (c36678c.getIsLoading()) {
                    c28655q.m87150e0(1286107659);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                    c28655q.m87173q(false);
                } else {
                    if (c36678c.getIsError()) {
                        c28655q.m87150e0(1286112274);
                        C12611c c12611cM35368c3 = C12612d.f43056a.m35368c();
                        if (i18 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | z14;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C4048j0(function2, str4, 14);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C4048j0(function2, str4, 14);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c3, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                        c28655q.m87173q(false);
                    } else if (c36678c.m117701b().isEmpty()) {
                        c28655q.m87150e0(1286120598);
                        function4 = function2;
                        m117750v(AbstractC1099a.m3394p(2 * 8, AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q, 6).getWhite5())), c36678c, function4, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 0);
                        c28655q.m87173q(false);
                    } else {
                        function4 = function2;
                        c28655q.m87150e0(1215401249);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    function3 = function4;
                    str3 = str4;
                }
                function4 = function2;
                c28655q.m87173q(true);
                modifier3 = modifier2;
                function3 = function4;
                str3 = str4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                str3 = str2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier3, c36678c, str3, function3, i13, i14, 26);
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
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            if (i24 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C36680e(0);
                    c28655q.m87172p0(objM87133R3);
                }
                function2 = (Function1) objM87133R3;
            }
            strM117700a = c36678c.getActionError();
            if (strM117700a == null) {
                strM117700a = c36678c.getLoadMoreError();
            }
            i18 = i15 & 7168;
            if (i18 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C36681f(function2, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C36681f(function2, 0);
                c28655q.m87172p0(objM87133R);
            }
            m117719G(strM117700a, (InterfaceC4339a) objM87133R, c28655q, 0);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            if (c36678c.getIsLoading()) {
                c28655q.m87150e0(1286107659);
                AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                c28655q.m87173q(false);
            } else {
                if (c36678c.getIsError()) {
                    c28655q.m87150e0(1286112274);
                    C12611c c12611cM35368c4 = C12612d.f43056a.m35368c();
                    if (i18 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C4048j0(function2, str4, 14);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4048j0(function2, str4, 14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c4, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                    c28655q.m87173q(false);
                } else if (c36678c.m117701b().isEmpty()) {
                    c28655q.m87150e0(1286120598);
                    function4 = function2;
                    m117750v(AbstractC1099a.m3394p(2 * 8, AbstractC11895b.m31987f(3, 4, c2314t, C38072d.f163053a.m121949b(c28655q, 6).getWhite5())), c36678c, function4, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 0);
                    c28655q.m87173q(false);
                } else {
                    function4 = function2;
                    c28655q.m87150e0(1215401249);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier2;
                function3 = function4;
                str3 = str4;
            }
            function4 = function2;
            c28655q.m87173q(true);
            modifier3 = modifier2;
            function3 = function4;
            str3 = str4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            str3 = str2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(modifier3, c36678c, str3, function3, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m117746r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m117747s(Function1 function1) {
        function1.invoke(AbstractC36676a.b.f157080a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m117748t(Function1 function1, String str) {
        function1.invoke(new AbstractC36676a.d(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m117749u(Modifier modifier, C36678c c36678c, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m117745q(modifier, c36678c, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7131. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:61)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:298)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: v */
    private static final void m117750v(Modifier modifier, C36678c c36678c, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        C2314t c2314t;
        C28655q c28655q2;
        int i16;
        boolean z4;
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1660049555);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(c36678c) ? 32 : 16;
        }
        int i18 = 256;
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(function1) ? 256 : 128;
        }
        int i19 = i15;
        boolean z13 = 0;
        if (c28655q3.m87135U(i19 & 1, (i19 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t2;
            }
            AbstractC33220t0.m105391c(c36678c.getSectionViewAnalyticEvent(), function1, c28655q3, (i19 >> 3) & 112);
            float f13 = 1.0f;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            String strM117705f = c36678c.getTitle();
            if (strM117705f == null || AbstractC39414r.m125890i0(strM117705f)) {
                strM117705f = null;
            }
            if (strM117705f == null) {
                c28655q3.m87150e0(-1460196560);
                c28655q3.m87173q(false);
                c2314t = c2314t2;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(-1460196559);
                C28655q c28655q4 = c28655q3;
                c2314t = c2314t2;
                m117721I(null, strM117705f, Integer.valueOf(c36678c.getTotalRequest()), c28655q4, 0, 1);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            c28655q2.m87150e0(-185643908);
            int i24 = 0;
            C28655q c28655q5 = c28655q2;
            for (Object obj : c36678c.m117701b()) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C25306o c25306o = (C25306o) obj;
                Object objM74316c = c25306o.m74316c();
                if (objM74316c == null) {
                    objM74316c = Integer.valueOf(i24);
                }
                c28655q5.m87144b0(-1856611323, objM74316c);
                InterfaceC25312u interfaceC25312uM74318e = c25306o.getState();
                if (interfaceC25312uM74318e instanceof C27256h) {
                    c28655q5.m87150e0(-1856609236);
                    if (c36678c.getIsLoadingMore()) {
                        c28655q5.m87150e0(-1856607880);
                        m117723K(c28655q5, z13);
                        c28655q5.m87173q(z13);
                        i16 = i25;
                        c28655q5 = c28655q5;
                    } else {
                        c28655q5.m87150e0(-1856605848);
                        C27256h c27256h = (C27256h) interfaceC25312uM74318e;
                        C28655q c28655q6 = c28655q5;
                        i16 = i25;
                        AbstractC27249e.m82121d(AbstractC1102d.m3409f(f13, c2314t), c27256h, null, m117726N(c27256h, c25306o.getPrimaryAnalyticEvent(), function1), c28655q6, 6, 4);
                        C28655q c28655q7 = c28655q6;
                        c28655q7.m87173q(z13);
                        c28655q5 = c28655q7;
                    }
                    c28655q5.m87173q(z13);
                    c2305k = c2305k;
                    c2314t = c2314t;
                    i18 = i18;
                    i19 = i19;
                    z4 = z13;
                } else {
                    i16 = i25;
                    if (interfaceC25312uM74318e instanceof C35552j) {
                        c28655q5.m87150e0(-1719713197);
                        boolean z14 = i24 == AbstractC37056f.m118951C(c36678c.m117701b()) ? 1 : z13;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, c2314t);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q5, z13);
                        int iHashCode2 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM3409f2);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j = C0217k.f724b;
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m2);
                        C0209i c0209i2 = C0217k.f732j;
                        if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N2);
                        C10967i1 c10967i1 = new C10967i1(z14, 4);
                        boolean z15 = (i19 & 896) == i18;
                        Object objM87133R = c28655q5.m87133R();
                        if (z15 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C35657b0(function1, 14);
                            c28655q5.m87172p0(objM87133R);
                        }
                        C28655q c28655q8 = c28655q5;
                        AbstractC25303l.m74290q(c25306o, null, c10967i1, (Function1) objM87133R, c28655q8, 0, 2);
                        C28655q c28655q9 = c28655q8;
                        i16 = i16;
                        C25306o c25306o2 = (C25306o) AbstractC25265s.m74102I0(i16, c36678c.m117701b());
                        if ((c25306o2 != null ? c25306o2.getState() : null) instanceof C35552j) {
                            c28655q9.m87150e0(-1729990449);
                            z4 = 0;
                            AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q9, 0, 255);
                            c28655q5 = c28655q9;
                        } else {
                            z4 = 0;
                            c28655q9.m87150e0(-2090082911);
                            c28655q5 = c28655q9;
                        }
                        c28655q5.m87173q(z4);
                        c28655q5.m87173q(true);
                        c28655q5.m87173q(z4);
                    } else {
                        c2305k = c2305k;
                        c2314t = c2314t;
                        i18 = i18;
                        i19 = i19;
                        z4 = z13;
                        c28655q5.m87150e0(-1856542039);
                        c28655q5.m87173q(z4);
                    }
                }
                c28655q5.m87173q(z4);
                z13 = z4;
                c2314t = c2314t;
                i24 = i16;
                i18 = i18;
                i19 = i19;
                c2305k = c2305k;
                f13 = 1.0f;
                c28655q5 = c28655q5;
            }
            c28655q5.m87173q(z13);
            c28655q5.m87173q(true);
            c28655q = c28655q5;
        } else {
            C28655q c28655q10 = c28655q3;
            c28655q10.m87138X();
            c28655q = c28655q10;
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier3, c36678c, function1, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Modifier m117751w(boolean z4, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(140793105);
        float f13 = 8;
        float f14 = 2 * f13;
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, f14, 0.0f, z4 ? 0 * f13 : f14, 5);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m117752x(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof DesignItemInteraction) {
            AbstractC25300i.m74263a((DesignItemInteraction) event, function1, new C36478d(29));
        } else if (event instanceof Action) {
            function1.invoke(new AbstractC36676a.c((Action) event));
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Object m117753y(Action it) {
        AbstractC22676k.m65750j(it, "it");
        return new AbstractC36676a.c(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m117754z(Modifier modifier, C36678c c36678c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m117750v(modifier, c36678c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
