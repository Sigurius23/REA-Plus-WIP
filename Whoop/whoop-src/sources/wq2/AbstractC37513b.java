package wq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c41.C4119t1;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import d30.C11547l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jp2.C21882m;
import kq2.AbstractC22776b;
import kr2.AbstractC22813b;
import kr2.EnumC22818g;
import l83.C23454a0;
import lr2.C24700a;
import lr2.C24701b;
import m83.AbstractC25265s;
import mq2.AbstractC25890c;
import mq2.AbstractC25894g;
import mq2.C25889b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.C11393q0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q12.C29802c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tg2.C33795i;
import vl0.C36100c;
import wb3.AbstractC37056f;
import xq2.AbstractC38559e0;
import xq2.C38553c0;
import xq2.C38556d0;
import xq2.C38566g1;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wq2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aG\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llr2/b;", "stepState", "", "isCurrentStep", "Lm91/p;", "itemFactory", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Landroidx/compose/ui/Modifier;Llr2/b;ZLm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llr2/a;", "section", "itemViewFactory", "Lmq2/b;", "animationCoordinator", "g", "(Llr2/a;Lm91/p;Lkotlin/jvm/functions/Function1;Lmq2/b;ZLlr2/b;Landroidx/compose/runtime/Composer;I)V", "", "timeCapsuleText", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37513b {

    /* JADX INFO: renamed from: wq2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.InReviewDesignItemStepViewKt$InReviewDesignItemStepViewContent$1$1", m100430f = "InReviewDesignItemStepView.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160436w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f160437x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f160438y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160437x = str;
            this.f160438y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f160437x, this.f160438y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f160436w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f160437x != null && AbstractC37513b.m120285l(this.f160438y).length() == 0) {
                AbstractC37513b.m120286m(this.f160438y, this.f160437x);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wq2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.InReviewDesignItemStepViewKt$InReviewDesignItemStepViewContent$2$1", m100430f = "InReviewDesignItemStepView.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160439w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f160440x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C25889b f160441y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, C25889b c25889b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160440x = z4;
            this.f160441y = c25889b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f160440x, this.f160441y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C25889b c25889b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f160439w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f160440x && (c25889b = this.f160441y) != null) {
                c25889b.m76547e();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m120280g(C24700a c24700a, C25307p c25307p, Function1 function1, C25889b c25889b, boolean z4, C24701b c24701b, Composer composer, int i13) {
        boolean z13;
        boolean z14;
        C25307p c25307p2 = c25307p;
        Function1 function2 = function1;
        boolean z15 = z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1155949776);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(c24700a) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c25307p2) : c28655q.m87157i(c25307p2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        C25889b c25889b2 = c25889b;
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(c25889b2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87155h(z15) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(c24701b) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i15 = i14;
        int i16 = 0;
        if (c28655q.m87135U(i15 & 1, (i15 & 74899) != 74898)) {
            boolean zM65745e = AbstractC22676k.m65745e(c24700a.getSectionId(), "Chronological");
            List<C24700a> listM72308e = c24701b.m72308e();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listM72308e.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((C24700a) it.next()).m72305a());
            }
            if (arrayList.isEmpty()) {
                z13 = false;
                break;
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((InterfaceC25312u) it3.next()) instanceof C38566g1) {
                        z13 = true;
                        break;
                    }
                } else {
                    z13 = false;
                    break;
                }
            }
            boolean z16 = false;
            for (InterfaceC25312u interfaceC25312u : c24700a.m72305a()) {
                if ((zM65745e && z15 && z13 && !(interfaceC25312u instanceof C38566g1)) ? true : z16) {
                    c28655q.m87150e0(-1643686250);
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(-1277938693, c28655q, new C36100c((Object) interfaceC25312u, (Object) c25307p2, function2, 6));
                    int i17 = i15 >> 9;
                    AbstractC25894g.m76584f(c25889b2, z15, i16, null, c37816bM121344e, c28655q, (i17 & 14) | 24576 | (i17 & 112), 8);
                    c28655q.m87173q(z16);
                    z14 = z16;
                    i16++;
                } else {
                    c28655q.m87150e0(-1643281111);
                    z14 = z16;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307p2, null, function2, c28655q, ((i15 << 3) & 7168) | (C25307p.f99300b << 3) | (i15 & 112), 4);
                    c28655q.m87173q(z14);
                    i16 = i16;
                }
                AbstractC11266d.m30469w(2, 8, C2314t.f9131w, c28655q);
                c25307p2 = c25307p;
                function2 = function1;
                c25889b2 = c25889b;
                z15 = z4;
                z16 = z14;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11547l0(c24700a, c25307p, function1, c25889b, z4, c24701b, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m120281h(InterfaceC25312u interfaceC25312u, C25307p c25307p, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC25303l.m74291r(interfaceC25312u, c25307p, null, function1, c28655q, C25307p.f99300b << 3, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m120282i(C24700a c24700a, C25307p c25307p, Function1 function1, C25889b c25889b, boolean z4, C24701b c24701b, int i13, Composer composer, int i14) {
        m120280g(c24700a, c25307p, function1, c25889b, z4, c24701b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX INFO: renamed from: j */
    public static final void m120283j(Modifier modifier, C24701b stepState, boolean z4, C25307p c25307p, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C25307p c25307p2;
        Modifier modifier3;
        boolean z13;
        boolean z14;
        C38556d0 c38556d0;
        Object obj;
        int i16;
        C25307p c25307pM120293b = c25307p;
        AbstractC22676k.m65750j(stepState, "stepState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(911078989);
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
            i15 |= c28655q.m87157i(stepState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) != 0) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else if ((i13 & 4096) == 0 ? c28655q.m87153g(c25307pM120293b) : c28655q.m87157i(c25307pM120293b)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q.m87140Z();
            int i18 = i13 & 1;
            C2314t c2314t = C2314t.f9131w;
            if (i18 == 0 || c28655q.m87118C()) {
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 8) != 0) {
                    c25307pM120293b = AbstractC37514c.m120293b();
                    i15 &= -7169;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            }
            C25307p c25307p3 = c25307pM120293b;
            int i19 = i15;
            Modifier modifier4 = modifier2;
            c28655q.m87175r();
            List<C24700a> listM72308e = stepState.m72308e();
            if (!(listM72308e instanceof Collection) || !listM72308e.isEmpty()) {
                Iterator<T> it = listM72308e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    List<InterfaceC25312u> listM72305a = ((C24700a) it.next()).m72305a();
                    if (!(listM72305a instanceof Collection) || !listM72305a.isEmpty()) {
                        Iterator<T> it3 = listM72305a.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((InterfaceC25312u) it3.next()) instanceof C38553c0) {
                                    z13 = true;
                                    break;
                                }
                            } else {
                                z13 = false;
                                break;
                            }
                        }
                    } else {
                        z13 = false;
                        break;
                        break;
                    }
                    if (z13) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            List<C24700a> listM72308e2 = stepState.m72308e();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it4 = listM72308e2.iterator();
            while (it4.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((C24700a) it4.next()).m72305a());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof C38553c0) {
                    arrayList2.add(obj2);
                }
            }
            C38553c0 c38553c0 = (C38553c0) AbstractC25265s.m74100H0(arrayList2);
            String submittedText = c38553c0 != null ? c38553c0.getSubmittedText() : null;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM87153g = c28655q.m87153g(submittedText);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new a(submittedText, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, submittedText);
            if (z14) {
                c28655q.m87150e0(2056676980);
                boolean zM87153g2 = c28655q.m87153g(m120285l(interfaceC28601c1));
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C38556d0(m120285l(interfaceC28601c1), !AbstractC39414r.m125890i0(m120285l(interfaceC28601c1)) && m120285l(interfaceC28601c1).length() <= 1000, new C29802c(27, interfaceC28601c1));
                    c28655q.m87172p0(objM87133R3);
                }
                c38556d0 = (C38556d0) objM87133R3;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2056961281);
                c28655q.m87173q(false);
                c38556d0 = null;
            }
            C25889b c25889b = (C25889b) c28655q.m87161k(AbstractC25890c.m76553c());
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zM87157i = ((i19 & 896) == 256) | c28655q.m87157i(c25889b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                objM87133R4 = new b(z4, c25889b, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(stepState, boolValueOf, (InterfaceC4351m) objM87133R4, c28655q);
            if (z4) {
                c28655q.m87150e0(2057242017);
                Object objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    obj = objM87133R5;
                    C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
                    c11393q0.m30628I0(Boolean.TRUE);
                    c28655q.m87172p0(c11393q0);
                    obj = c11393q0;
                }
                obj = objM87133R5;
                C11393q0 c11393q1 = (C11393q0) obj;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier4), 2 * 8, 0.0f, 2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(0.12f, c2314t));
                AbstractC28683x.m87247a(AbstractC38559e0.m123626e().mo86977a(c38556d0), AbstractC37817c.m121344e(1142822556, c28655q, new C4119t1(stepState, c25307p3, onViewEvent, c25889b, z4, c11393q1)), c28655q, 56);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2058921845);
                c28655q.m87173q(false);
            }
            c25307p2 = c25307p3;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            c25307p2 = c25307pM120293b;
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(modifier3, stepState, z4, c25307p2, onViewEvent, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m120284k(Modifier modifier, C24701b c24701b, boolean z4, C25307p c25307p, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m120283j(modifier, c24701b, z4, c25307p, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final String m120285l(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m120286m(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m120287n(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m120286m(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m120288o(InterfaceC23013y interfaceC23013y, C24701b c24701b, C25307p c25307p, Function1 function1, C25889b c25889b, boolean z4, C11393q0 c11393q0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(342898426);
            for (C24700a c24700a : c24701b.m72308e()) {
                C28655q c28655q2 = c28655q;
                m120280g(c24700a, c25307p, function1, c25889b, z4, c24701b, c28655q2, C25307p.f99300b << 3);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(c24700a.getSectionType().getSpacing(), c2314t));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, ((C23016z) interfaceC23013y).m66779c(c2314t, true, 1.0f));
            TextResource textResourceM72309f = c24701b.getFooterNote();
            if (textResourceM72309f == null) {
                c28655q.m87150e0(-378121688);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-378121687);
                AbstractC22813b.m66094u(c11393q0, EnumC22818g.BOTTOM, null, AbstractC37817c.m121344e(244964059, c28655q, new C21882m(textResourceM72309f, 4)), c28655q, 3120, 4);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m120289p(TextResource textResource, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC22776b.m65990b(C2314t.f9131w, textResource, null, c28655q, (TextResource.$stable << 3) | 390);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
