package wr0;

import android.app.Application;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.InterfaceC1583f2;
import b03.C2205b;
import bc3.InterfaceC2994c0;
import c41.C4048j0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import e31.AbstractC12610b;
import e31.C12611c;
import e31.C12612d;
import ec3.InterfaceC13037f2;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33220t0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vx0.C36553a;
import w71.C36891k;
import wb3.AbstractC37056f;
import wo1.C37445e0;
import x81.C38072d;

/* JADX INFO: renamed from: wr0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u001aA\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\f\u0010\u0012\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lwr0/h;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lwr0/c;", "defaultViewState", "q", "(Landroidx/compose/ui/Modifier;Lwr0/h;Lkotlin/jvm/functions/Function1;Lwr0/c;Landroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_EVENT, "Lwr0/a;", "toViewModel", "toParent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "viewState", "", "path", "onEvent", "j", "(Landroidx/compose/ui/Modifier;Lwr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "n", "(Landroidx/compose/ui/Modifier;Lwr0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "community-moments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37528g {

    /* JADX INFO: renamed from: wr0.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.communitymoments.view.CommunityMomentsContainerWrapperKt$CommunityMomentsContainerWrapper$2$1", m100430f = "CommunityMomentsContainerWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160486w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C37520c, AbstractC37516a> f160487x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C37530h f160488y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C37520c, AbstractC37516a> abstractC23864c, C37530h c37530h, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160487x = abstractC23864c;
            this.f160488y = c37530h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f160487x, this.f160488y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f160486w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f160487x.mo1216g(new AbstractC37516a.b(this.f160488y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wr0.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements Function1 {
        public b(Object obj) {
            super(1, 0, AbstractC23864c.class, obj, "sendViewEvent", "sendViewEvent(Ljava/lang/Object;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m120362a(AbstractC37516a p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((AbstractC23864c) this.receiver).mo1216g(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m120362a((AbstractC37516a) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:79:0x013c  */
    /* JADX WARN: Code duplicated, block: B:80:0x013e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0190  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01af  */
    /* JADX INFO: renamed from: j */
    public static final void m120348j(Modifier modifier, C37520c viewState, String str, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        String str3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(204742444);
        int i18 = i14 & 1;
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
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
                    if (i18 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i19 != 0) {
                        str2 = "";
                    } else {
                        str2 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C37445e0(12);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
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
                    if (viewState.getIsLoading()) {
                        c28655q.m87150e0(-1649520432);
                        AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, C12611c.f43049g, 6);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState.getIsError()) {
                            c28655q.m87150e0(-1649515815);
                            C12611c c12611cM35368c = C12612d.f43056a.m35368c();
                            if ((i15 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | z13;
                            objM87133R = c28655q.m87133R();
                            if (z15 || objM87133R == c28676v0) {
                                objM87133R = new C4048j0(function4, str2, 16);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC12610b.m35349f(c12611cM35368c, null, (InterfaceC4339a) objM87133R, c28655q, C12611c.f43049g, 2);
                            c28655q.m87173q(false);
                        } else if (viewState.m120310a().isEmpty()) {
                            function5 = function4;
                            c28655q.m87150e0(404994652);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1649507682);
                            function5 = function4;
                            m120352n(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function3 = function5;
                        modifier3 = modifier4;
                    }
                    function5 = function4;
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                str3 = str2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k(modifier3, (Object) viewState, (Object) str3, (Object) function3, i13, i14, 5);
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
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    str2 = "";
                } else {
                    str2 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37445e0(12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
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
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(-1649520432);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(-1649515815);
                        C12611c c12611cM35368c2 = C12612d.f43056a.m35368c();
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C4048j0(function4, str2, 16);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C4048j0(function4, str2, 16);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c2, null, (InterfaceC4339a) objM87133R, c28655q, C12611c.f43049g, 2);
                        c28655q.m87173q(false);
                    } else if (viewState.m120310a().isEmpty()) {
                        c28655q.m87150e0(-1649507682);
                        function5 = function4;
                        m120352n(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                        c28655q.m87173q(false);
                    } else {
                        function5 = function4;
                        c28655q.m87150e0(404994652);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                }
                function5 = function4;
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(modifier3, (Object) viewState, (Object) str3, (Object) function3, i13, i14, 5);
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
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i19 != 0) {
                    str2 = "";
                } else {
                    str2 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37445e0(12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
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
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(-1649520432);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, C12611c.f43049g, 6);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(-1649515815);
                        C12611c c12611cM35368c3 = C12612d.f43056a.m35368c();
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | z13;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C4048j0(function4, str2, 16);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C4048j0(function4, str2, 16);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c3, null, (InterfaceC4339a) objM87133R, c28655q, C12611c.f43049g, 2);
                        c28655q.m87173q(false);
                    } else if (viewState.m120310a().isEmpty()) {
                        c28655q.m87150e0(-1649507682);
                        function5 = function4;
                        m120352n(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                        c28655q.m87173q(false);
                    } else {
                        function5 = function4;
                        c28655q.m87150e0(404994652);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                }
                function5 = function4;
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            str3 = str2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(modifier3, (Object) viewState, (Object) str3, (Object) function3, i13, i14, 5);
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
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i19 != 0) {
                str2 = "";
            } else {
                str2 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C37445e0(12);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier4);
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
            if (viewState.getIsLoading()) {
                c28655q.m87150e0(-1649520432);
                AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, C12611c.f43049g, 6);
                c28655q.m87173q(false);
            } else {
                if (viewState.getIsError()) {
                    c28655q.m87150e0(-1649515815);
                    C12611c c12611cM35368c4 = C12612d.f43056a.m35368c();
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C4048j0(function4, str2, 16);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C4048j0(function4, str2, 16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c4, null, (InterfaceC4339a) objM87133R, c28655q, C12611c.f43049g, 2);
                    c28655q.m87173q(false);
                } else if (viewState.m120310a().isEmpty()) {
                    c28655q.m87150e0(-1649507682);
                    function5 = function4;
                    m120352n(null, viewState, function5, c28655q, (i15 & 112) | ((i15 >> 3) & 896), 1);
                    c28655q.m87173q(false);
                } else {
                    function5 = function4;
                    c28655q.m87150e0(404994652);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            }
            function5 = function4;
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        str3 = str2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, (Object) viewState, (Object) str3, (Object) function3, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m120349k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m120350l(Function1 function1, String str) {
        function1.invoke(new AbstractC37516a.b(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m120351m(Modifier modifier, C37520c c37520c, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m120348j(modifier, c37520c, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m120352n(Modifier modifier, C37520c c37520c, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1809200302);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c37520c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC33220t0.m105391c(c37520c.getSectionViewAnalyticEvent(), function1, c28655q, (i17 >> 3) & 112);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
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
            c28655q.m87150e0(1531613648);
            int i18 = 0;
            for (Object obj : c37520c.m120310a()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C25306o c25306o = (C25306o) obj;
                Object objM74316c = c25306o.m74316c();
                if (objM74316c == null) {
                    objM74316c = Integer.valueOf(i18);
                }
                c28655q.m87144b0(1567828501, objM74316c);
                AbstractC25303l.m74290q(c25306o, null, new C36553a(17), function1, c28655q, ((i17 << 3) & 7168) | C25306o.f99297c, 2);
                c28655q.m87173q(false);
                i18 = i19;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 0, modifier, c37520c, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Modifier m120353o(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1634211507);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m120354p(Modifier modifier, C37520c c37520c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m120352n(modifier, c37520c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x0205  */
    /* JADX WARN: Code duplicated, block: B:120:0x020b  */
    /* JADX WARN: Code duplicated, block: B:126:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0224  */
    /* JADX WARN: Code duplicated, block: B:133:0x0241  */
    /* JADX WARN: Code duplicated, block: B:134:0x0245  */
    /* JADX WARN: Code duplicated, block: B:136:0x0248  */
    /* JADX WARN: Code duplicated, block: B:137:0x024d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0250  */
    /* JADX WARN: Code duplicated, block: B:140:0x025b  */
    /* JADX WARN: Code duplicated, block: B:142:0x026a  */
    /* JADX WARN: Code duplicated, block: B:143:0x028d  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x02db  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:163:0x0302  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0170 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0172  */
    /* JADX WARN: Code duplicated, block: B:97:0x0191  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    /* JADX INFO: renamed from: q */
    public static final void m120355q(Modifier modifier, C37530h itemState, Function1 function1, C37520c c37520c, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        C37520c c37520c2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C37520c c37520c3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Modifier modifier4;
        C37520c c37520c4;
        Object objM87133R;
        String id4;
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
        C37520c c37520c5;
        AbstractC23864c abstractC23864c;
        AbstractC37518b abstractC37518b;
        InterfaceC13037f2 viewState;
        InterfaceC28601c1 interfaceC28601c1M87261o;
        C28676v0 c28676v1;
        InterfaceC30057d interfaceC30057d;
        boolean z14;
        boolean z15;
        Object objM87133R4;
        boolean zM87157i;
        Object objM87133R5;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R6;
        boolean zM87153g3;
        Object objM87133R7;
        int i19;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(487966154);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    c37520c2 = c37520c;
                    if (c28655q.m87157i(c37520c2)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i19;
                } else {
                    c37520c2 = c37520c;
                }
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i19;
            } else {
                c37520c2 = c37520c;
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
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i25 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C37445e0(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c37520c4 = new C37520c(true, false, null, null, 14, null);
                    }
                    c28655q.m87175r();
                    id4 = itemState.getId();
                    i17 = i15 & 112;
                    if (i17 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C37524e(0, itemState);
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
                        zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(id4) | c28655q.m87153g(interfaceC4339a);
                        objM87133R3 = c28655q.m87133R();
                        if (!zM87153g || objM87133R3 == c28676v0) {
                            c37520c5 = c37520c4;
                            objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c37520c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, id4);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            c37520c5 = c37520c4;
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
                            zM87153g2 = c28655q.m87153g(id4) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87153g2 || objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, new C23863b(c37520c4), id4);
                                c28655q.m87172p0(objM87133R6);
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R6;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(id4) | c28655q.m87153g(interfaceC4339a);
                            objM87133R7 = c28655q.m87133R();
                            if (zM87153g3 || objM87133R7 == c28676v0) {
                                objM87133R7 = new C23863b(c37520c4);
                                c28655q.m87172p0(objM87133R7);
                            }
                            abstractC23864c = (C23863b) objM87133R7;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                        c37520c5 = c37520c4;
                    }
                    if (abstractC23864c instanceof AbstractC37518b) {
                        abstractC37518b = (AbstractC37518b) abstractC23864c;
                    } else {
                        abstractC37518b = null;
                    }
                    if (abstractC37518b != null) {
                        viewState = abstractC37518b.getViewState();
                    } else {
                        viewState = null;
                    }
                    if (viewState == null) {
                        c28655q.m87150e0(-1463908249);
                        c28655q.m87173q(false);
                        interfaceC28601c1M87261o = null;
                    } else {
                        c28655q.m87150e0(784061146);
                        interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    if (interfaceC28601c1M87261o == null) {
                        c28655q.m87150e0(784062698);
                        interfaceC30057d = null;
                        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c37520c5, null, c28655q, (i15 >> 6) & 112, 2);
                        c28655q.m87173q(false);
                        c28676v1 = c28676v0;
                        interfaceC28601c1M87261o = interfaceC28601c1M87260n;
                    } else {
                        c28676v1 = c28676v0;
                        interfaceC30057d = null;
                        c28655q.m87150e0(784059257);
                        c28655q.m87173q(false);
                    }
                    String strM120363a = itemState.getPath();
                    boolean zM87157i2 = c28655q.m87157i(abstractC23864c);
                    if (i17 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i2 | z14;
                    objM87133R4 = c28655q.m87133R();
                    if (z15 || objM87133R4 == c28676v1) {
                        objM87133R4 = new a(abstractC23864c, itemState, interfaceC30057d);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM120363a);
                    C37520c c37520cM120358t = m120358t(interfaceC28601c1M87261o);
                    String strM120363a2 = itemState.getPath();
                    zM87157i = c28655q.m87157i(abstractC23864c) | ((i15 & 896) == 256);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i || objM87133R5 == c28676v1) {
                        objM87133R5 = new C2205b(abstractC23864c, function3, 9);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifier5 = modifier4;
                    m120348j(modifier5, c37520cM120358t, strM120363a2, (Function1) objM87133R5, c28655q, i15 & 14, 0);
                    c28655q = c28655q;
                    modifier3 = modifier5;
                    c37520c3 = c37520c5;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    modifier4 = modifier2;
                    function3 = function2;
                }
                c37520c4 = c37520c2;
                c28655q.m87175r();
                id4 = itemState.getId();
                i17 = i15 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C37524e(0, itemState);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C37524e(0, itemState);
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
                        zM87153g2 = c28655q.m87153g(id4) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, new C23863b(c37520c4), id4);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, new C23863b(c37520c4), id4);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R6;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(id4) | c28655q.m87153g(interfaceC4339a);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R7 = new C23863b(c37520c4);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C23863b(c37520c4);
                            c28655q.m87172p0(objM87133R7);
                        }
                        abstractC23864c = (C23863b) objM87133R7;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    c37520c5 = c37520c4;
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(id4) | c28655q.m87153g(interfaceC4339a);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        c37520c5 = c37520c4;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c37520c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, id4);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        c37520c5 = c37520c4;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c37520c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, id4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c instanceof AbstractC37518b) {
                    abstractC37518b = (AbstractC37518b) abstractC23864c;
                } else {
                    abstractC37518b = null;
                }
                if (abstractC37518b != null) {
                    viewState = abstractC37518b.getViewState();
                } else {
                    viewState = null;
                }
                if (viewState == null) {
                    c28655q.m87150e0(-1463908249);
                    c28655q.m87173q(false);
                    interfaceC28601c1M87261o = null;
                } else {
                    c28655q.m87150e0(784061146);
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                    c28655q.m87173q(false);
                }
                if (interfaceC28601c1M87261o == null) {
                    c28655q.m87150e0(784062698);
                    interfaceC30057d = null;
                    InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c37520c5, null, c28655q, (i15 >> 6) & 112, 2);
                    c28655q.m87173q(false);
                    c28676v1 = c28676v0;
                    interfaceC28601c1M87261o = interfaceC28601c1M87260n2;
                } else {
                    c28676v1 = c28676v0;
                    interfaceC30057d = null;
                    c28655q.m87150e0(784059257);
                    c28655q.m87173q(false);
                }
                String strM120363a3 = itemState.getPath();
                boolean zM87157i3 = c28655q.m87157i(abstractC23864c);
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i3 | z14;
                objM87133R4 = c28655q.m87133R();
                if (z15) {
                    objM87133R4 = new a(abstractC23864c, itemState, interfaceC30057d);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(abstractC23864c, itemState, interfaceC30057d);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM120363a3);
                C37520c c37520cM120358t2 = m120358t(interfaceC28601c1M87261o);
                String strM120363a4 = itemState.getPath();
                zM87157i = c28655q.m87157i(abstractC23864c) | ((i15 & 896) == 256);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R5 = new C2205b(abstractC23864c, function3, 9);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C2205b(abstractC23864c, function3, 9);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifier6 = modifier4;
                m120348j(modifier6, c37520cM120358t2, strM120363a4, (Function1) objM87133R5, c28655q, i15 & 14, 0);
                c28655q = c28655q;
                modifier3 = modifier6;
                c37520c3 = c37520c5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c37520c3 = c37520c2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(modifier3, (InterfaceC25312u) itemState, function3, (Object) c37520c3, i13, i14, 4);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c37520c2 = c37520c;
                if (c28655q.m87157i(c37520c2)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i19;
            } else {
                c37520c2 = c37520c;
            }
            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i19;
        } else {
            c37520c2 = c37520c;
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
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C37445e0(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c37520c4 = new C37520c(true, false, null, null, 14, null);
                } else {
                    c37520c4 = c37520c2;
                }
            } else {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C37445e0(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c37520c4 = new C37520c(true, false, null, null, 14, null);
                } else {
                    c37520c4 = c37520c2;
                }
            }
            c28655q.m87175r();
            id4 = itemState.getId();
            i17 = i15 & 112;
            if (i17 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C37524e(0, itemState);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C37524e(0, itemState);
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
                    zM87153g2 = c28655q.m87153g(id4) | ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(interfaceC4339a);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, new C23863b(c37520c4), id4);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, new C23863b(c37520c4), id4);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R6;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(id4) | c28655q.m87153g(interfaceC4339a);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R7 = new C23863b(c37520c4);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C23863b(c37520c4);
                        c28655q.m87172p0(objM87133R7);
                    }
                    abstractC23864c = (C23863b) objM87133R7;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                c37520c5 = c37520c4;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = ((((i18 & 14) ^ 6) <= 4 && c28655q.m87153g(c37520c4)) || (i18 & 6) == 4) | c28655q.m87153g(id4) | c28655q.m87153g(interfaceC4339a);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    c37520c5 = c37520c4;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c37520c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, id4);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    c37520c5 = c37520c4;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c37520c5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC37518b.class), interfaceC4339a, id4);
                    c28655q.m87172p0(objM87133R3);
                }
                abstractC23864c = (AbstractC23864c) objM87133R3;
                c28655q.m87173q(false);
            }
            if (abstractC23864c instanceof AbstractC37518b) {
                abstractC37518b = (AbstractC37518b) abstractC23864c;
            } else {
                abstractC37518b = null;
            }
            if (abstractC37518b != null) {
                viewState = abstractC37518b.getViewState();
            } else {
                viewState = null;
            }
            if (viewState == null) {
                c28655q.m87150e0(-1463908249);
                c28655q.m87173q(false);
                interfaceC28601c1M87261o = null;
            } else {
                c28655q.m87150e0(784061146);
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState, c28655q, 0);
                c28655q.m87173q(false);
            }
            if (interfaceC28601c1M87261o == null) {
                c28655q.m87150e0(784062698);
                interfaceC30057d = null;
                InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c37520c5, null, c28655q, (i15 >> 6) & 112, 2);
                c28655q.m87173q(false);
                c28676v1 = c28676v0;
                interfaceC28601c1M87261o = interfaceC28601c1M87260n3;
            } else {
                c28676v1 = c28676v0;
                interfaceC30057d = null;
                c28655q.m87150e0(784059257);
                c28655q.m87173q(false);
            }
            String strM120363a5 = itemState.getPath();
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
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM120363a5);
            C37520c c37520cM120358t3 = m120358t(interfaceC28601c1M87261o);
            String strM120363a6 = itemState.getPath();
            zM87157i = c28655q.m87157i(abstractC23864c) | ((i15 & 896) == 256);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R5 = new C2205b(abstractC23864c, function3, 9);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2205b(abstractC23864c, function3, 9);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifier7 = modifier4;
            m120348j(modifier7, c37520cM120358t3, strM120363a6, (Function1) objM87133R5, c28655q, i15 & 14, 0);
            c28655q = c28655q;
            modifier3 = modifier7;
            c37520c3 = c37520c5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c37520c3 = c37520c2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier3, (InterfaceC25312u) itemState, function3, (Object) c37520c3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m120356r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C34911a m120357s(C37530h c37530h) {
        return AbstractC15751g.m44431K(c37530h.getRefreshScope());
    }

    /* JADX INFO: renamed from: t */
    private static final C37520c m120358t(InterfaceC28670t2 interfaceC28670t2) {
        return (C37520c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m120359u(AbstractC23864c abstractC23864c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m120361w(event, new b(abstractC23864c), function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m120360v(Modifier modifier, C37530h c37530h, Function1 function1, C37520c c37520c, int i13, int i14, Composer composer, int i15) {
        m120355q(modifier, c37530h, function1, c37520c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m120361w(Object event, Function1 toViewModel, Function1 toParent) {
        Object actionArgument;
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(toViewModel, "toViewModel");
        AbstractC22676k.m65750j(toParent, "toParent");
        DesignItemInteraction designItemInteraction = event instanceof DesignItemInteraction ? (DesignItemInteraction) event : null;
        if (designItemInteraction == null || (actionArgument = designItemInteraction.getActionArgument()) == null) {
            actionArgument = event;
        }
        if (actionArgument instanceof C37541m0) {
            C37541m0 c37541m0 = (C37541m0) actionArgument;
            toViewModel.invoke(new AbstractC37516a.a(c37541m0.getId(), c37541m0.getFrontIndex()));
        } else if (actionArgument instanceof AbstractC37516a) {
            toViewModel.invoke(actionArgument);
        } else {
            toParent.invoke(event);
        }
    }
}
