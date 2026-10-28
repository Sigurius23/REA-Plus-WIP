package n03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import b30.C2665z;
import d03.AbstractC11446a;
import d03.AbstractC11447b;
import ge3.AbstractC15751g;
import k71.C22252i;
import l83.C23454a0;
import mw1.C25985a;
import p031b9.AbstractC2875y;
import p138f6.AbstractC14134f;
import p335n6.AbstractC26391h;
import p335n6.InterfaceC26395l;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p395p6.AbstractC28880g0;
import p395p6.C28920t1;
import p395p6.InterfaceC28923u1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p639y6.C39256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: n03.h */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Ln03/h;", "Lp6/g0;", "<init>", "()V", "Ll83/a0;", "v", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "Ln6/l;", "id", "l", "(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;", "Ly6/h;", "E", "Ly6/h;", "y", "()Ly6/h;", "stateDefinition", "Lp6/u1;", "F", "Lp6/u1;", "g", "()Lp6/u1;", "sizeMode", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26097h extends AbstractC28880g0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C39256h stateDefinition = C39256h.f168775a;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC28923u1 sizeMode = C28920t1.f117030a;

    /* JADX INFO: renamed from: n03.h$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.single.SmallWidgetSteps", m100430f = "SmallWidgetSteps.kt", m100431l = {24}, m100432m = "provideGlance", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f103369E;

        /* JADX INFO: renamed from: w */
        Object f103370w;

        /* JADX INFO: renamed from: x */
        Object f103371x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f103372y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f103372y = obj;
            this.f103369E |= Integer.MIN_VALUE;
            return C26097h.this.mo63263l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m77640v(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1218214373);
        int i14 = i13 & 1;
        if (c28655q.m87135U(i14, i14 != 0)) {
            c28655q.m87152f0(-534706435);
            Object objM87161k = c28655q.m87161k(AbstractC26391h.m78102c());
            if (objM87161k == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            }
            c28655q.m87173q(false);
            String string = (String) ((AbstractC14134f) objM87161k).mo40227b(AbstractC15751g.m44441U("WIDGET_KEY_STEPS_COUNT"));
            if (string == null) {
                c28655q.m87150e0(-1822054235);
                string = ((Context) c28655q.m87161k(AbstractC26391h.m78100a())).getString(AbstractC11447b.f36718a);
                AbstractC22676k.m65749i(string, "getString(...)");
            } else {
                c28655q.m87150e0(-1822056591);
            }
            c28655q.m87173q(false);
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-595144246, c28655q, new C2665z(string, 9, (byte) 0)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(this, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m77641w(String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC26094e.m77617d((Context) c28655q.m87161k(AbstractC26391h.m78100a()), str, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), AbstractC11446a.f36712k, null, null, null, 0.0f, c28655q, 0, 240);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m77642x(C26097h c26097h, int i13, Composer composer, int i14) {
        c26097h.m77640v(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m77643z(C26097h c26097h, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c26097h.m77640v(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: g, reason: from getter */
    public InterfaceC28923u1 getSizeMode() {
        return this.sizeMode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: l */
    public Object mo63263l(Context context, InterfaceC26395l interfaceC26395l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f103369E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f103369E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f103372y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f103369E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2875y.m8309v(obj);
        }
        AbstractC34132o.m107864I(obj);
        C37816b c37816b = new C37816b(new C25985a(this, 4), true, -250575760);
        aVar.f103370w = null;
        aVar.f103371x = null;
        aVar.f103369E = 1;
        AbstractC29125c.m88508Q(c37816b, aVar);
        return enumC31071a;
    }

    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: y, reason: from getter and merged with bridge method [inline-methods] */
    public C39256h getStateDefinition() {
        return this.stateDefinition;
    }
}
