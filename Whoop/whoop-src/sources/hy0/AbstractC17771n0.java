package hy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import ep1.C13412g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.AbstractC21048g;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27248d1;
import ny0.EnumC27250e0;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.C22976l1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.n0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lhy0/p0;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lhy0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isToggled", "onToggle", "f", "(Landroidx/compose/ui/Modifier;Lhy0/p0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "m", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17771n0 {

    /* JADX INFO: renamed from: hy0.n0$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.atom.OptionInfoKt$OptionInfo$1$1", m100430f = "OptionInfo.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f69114w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17777p0 f69115x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f69116y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C17777p0 c17777p0, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f69115x = c17777p0;
            this.f69116y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f69115x, this.f69116y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f69114w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f69115x.getIsChecked() != AbstractC17771n0.m51047i(this.f69116y)) {
                AbstractC17771n0.m51048j(this.f69116y, this.f69115x.getIsChecked());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hy0.n0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f69117a;

        static {
            int[] iArr = new int[EnumC17774o0.values().length];
            try {
                iArr[EnumC17774o0.CHECKBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17774o0.RADIO_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f69117a = iArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m51044f(Modifier modifier, C17777p0 viewState, boolean z4, Function1 onToggle, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(471307518);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onToggle) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            float f13 = 0;
            AbstractC33087j.m104824f(viewState.getLabel(), new AbstractC33088k.a(null, null, null, false, 15, null), z4, true, 0, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), modifier, new C22976l1(f13, f13, f13, f13), false, 0L, onToggle, c28655q, (i14 & 896) | 113249280 | ((i14 << 18) & 3670016), (i14 >> 9) & 14, 528);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17765l0(modifier, viewState, z4, onToggle, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m51045g(Modifier modifier, C17777p0 c17777p0, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m51044f(modifier, c17777p0, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m51046h(Modifier modifier, C17777p0 viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1664399689);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsChecked()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Boolean boolValueOf = Boolean.valueOf(viewState.getIsChecked());
            int i17 = i15 & 112;
            boolean z4 = i17 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new a(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
            boolean z13 = (i17 == 32) | ((i15 & 896) == 256);
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = new C13412g(onViewEvent, viewState, interfaceC28601c1, 25);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            int i18 = b.f69117a[viewState.getStyle().ordinal()];
            if (i18 == 1) {
                c28655q.m87150e0(-1760249055);
                m51044f(modifier3, viewState, m51047i(interfaceC28601c1), function1, c28655q, i15 & 126);
                c28655q.m87173q(false);
            } else {
                if (i18 != 2) {
                    throw AbstractC11895b.m32003v(-1760250796, c28655q, false);
                }
                c28655q.m87150e0(-1760244354);
                m51051m(modifier3, viewState, m51047i(interfaceC28601c1), function1, c28655q, i15 & 126);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 1, modifier3, (Object) viewState, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final boolean m51047i(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m51048j(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m51049k(Function1 function1, C17777p0 c17777p0, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        function1.invoke(new C17757j0(c17777p0.getId(), z4));
        m51048j(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m51050l(Modifier modifier, C17777p0 c17777p0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51046h(modifier, c17777p0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m51051m(Modifier modifier, C17777p0 viewState, boolean z4, Function1 onToggle, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1929431962);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onToggle) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            int i15 = i14;
            AbstractC27248d1.m82113e(modifier, viewState.getLabel(), EnumC27250e0.TEXT, 0L, z4, false, null, AbstractC37817c.m121344e(1041840220, c28655q, new C17768m0(viewState, 0)), onToggle, c28655q, (i15 & 14) | 12583296 | (57344 & (i15 << 6)) | ((i15 << 15) & 234881024), 104);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17765l0(modifier, viewState, z4, onToggle, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m51052n(C17777p0 c17777p0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC21048g.m58807M(AbstractC8693b.m21274h(c17777p0.getLabel(), c28655q, 0), null, false, null, null, 0, 0, 0, false, c28655q, 0, 510);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m51053o(Modifier modifier, C17777p0 c17777p0, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m51051m(modifier, c17777p0, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
