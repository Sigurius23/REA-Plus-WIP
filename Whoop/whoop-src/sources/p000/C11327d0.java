package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bs2.C3609b;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Action;
import com.amplitude.android.engagement.types.ButtonMeta;
import com.amplitude.android.engagement.types.ButtonType;
import com.amplitude.android.engagement.types.GoToNudgeStepAction;
import com.amplitude.android.engagement.types.Nudge;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.whoop.android.R;
import dj.AbstractC12058c;
import fk.InterfaceC14544a;
import ih0.AbstractC18489d0;
import io.ktor.utils.p228io.InterfaceC20024q;
import io.ktor.utils.p228io.jvm.javaio.AbstractC20010d;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import l63.C23388b;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.C25271y;
import n30.C26212c;
import n30.InterfaceC26213d;
import p00.C28573j;
import p028b4.C2696g;
import p133f1.C13977s1;
import p319m4.AbstractC25012a;
import p328mj.C25594a;
import p328mj.C25609p;
import p33.C28820m;
import p343nk.C26792m;
import p390p1.C28621h1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p409q0.C29674b;
import p426qi.C30387i;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p510u0.C34306c0;
import p510u0.InterfaceC34310d1;
import p512u2.InterfaceC34476v;
import p584wi.C37303c;
import p617xj.C38329a;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33192k;
import q30.C29938w0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32139c0;
import s63.C32236a;
import s83.AbstractC32275i;
import t20.C33321b;
import t20.C33326g;
import t20.C33333n;
import t20.C33342w;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: d0 */
/* JADX INFO: loaded from: classes10.dex */
public final class C11327d0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f36282E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36283w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f36284x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f36285y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f36286z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11327d0(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f36283w = i13;
        this.f36284x = obj;
        this.f36285y = obj2;
        this.f36286z = obj3;
        this.f36282E = obj4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f36283w) {
            case 0:
                C11327d0 c11327d0 = new C11327d0((C12476e0) this.f36285y, (InterfaceC28690z0) this.f36286z, (InterfaceC28690z0) this.f36282E, interfaceC30057d, 0);
                c11327d0.f36284x = obj;
                return c11327d0;
            case 1:
                return new C11327d0((InterfaceC20024q) this.f36284x, (Charset) this.f36285y, (C23388b) this.f36286z, (C32236a) this.f36282E, interfaceC30057d, 1);
            case 2:
                return new C11327d0((C25594a) this.f36284x, (InterfaceC2994c0) this.f36285y, (C29674b) this.f36286z, (InterfaceC28593a1) this.f36282E, interfaceC30057d, 2);
            case 3:
                return new C11327d0((C29674b) this.f36284x, (InterfaceC28593a1) this.f36285y, (C4861a) this.f36286z, (Nudge) this.f36282E, interfaceC30057d, 3);
            case 4:
                return new C11327d0((C26792m) this.f36284x, (String) this.f36285y, (ArrayList) this.f36286z, (ArrayList) this.f36282E, interfaceC30057d, 4);
            case 5:
                return new C11327d0((InterfaceC2994c0) this.f36284x, (String) this.f36285y, (C25609p) this.f36286z, (InterfaceC28601c1) this.f36282E, interfaceC30057d, 5);
            case 6:
                C11327d0 c11327d1 = new C11327d0((C29938w0) this.f36285y, (String) this.f36286z, (String) this.f36282E, interfaceC30057d, 6);
                c11327d1.f36284x = obj;
                return c11327d1;
            case 7:
                return new C11327d0((C33342w) this.f36284x, (C33333n) this.f36285y, (InterfaceC28601c1) this.f36286z, (InterfaceC28601c1) this.f36282E, interfaceC30057d, 7);
            case 8:
                C11327d0 c11327d2 = new C11327d0((InterfaceC34476v) this.f36285y, (InterfaceC34310d1) this.f36286z, (C13977s1) this.f36282E, interfaceC30057d, 8);
                c11327d2.f36284x = obj;
                return c11327d2;
            case 9:
                return new C11327d0((C30387i) this.f36284x, (Context) this.f36285y, (String) this.f36286z, (String) this.f36282E, interfaceC30057d, 9);
            default:
                return new C11327d0((View) this.f36284x, (C23465k) this.f36285y, (List) this.f36286z, (InterfaceC14544a) this.f36282E, interfaceC30057d, 10);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f36283w) {
            case 0:
                C11327d0 c11327d0 = (C11327d0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c11327d0.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                return ((C11327d0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 2:
                C11327d0 c11327d1 = (C11327d0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c11327d1.invokeSuspend(c23454a1);
                return c23454a1;
            case 3:
                C11327d0 c11327d2 = (C11327d0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c11327d2.invokeSuspend(c23454a2);
                return c23454a2;
            case 4:
                C11327d0 c11327d3 = (C11327d0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c11327d3.invokeSuspend(c23454a3);
                return c23454a3;
            case 5:
                C11327d0 c11327d4 = (C11327d0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c11327d4.invokeSuspend(c23454a4);
                return c23454a4;
            case 6:
                return ((C11327d0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 7:
                C11327d0 c11327d5 = (C11327d0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c11327d5.invokeSuspend(c23454a5);
                return c23454a5;
            case 8:
                C11327d0 c11327d6 = (C11327d0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a6 = C23454a0.f92919a;
                c11327d6.invokeSuspend(c23454a6);
                return c23454a6;
            case 9:
                C11327d0 c11327d7 = (C11327d0) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a7 = C23454a0.f92919a;
                c11327d7.invokeSuspend(c23454a7);
                return c23454a7;
            default:
                return ((C11327d0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM107888l;
        int i13;
        int i14 = this.f36283w;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i15 = 1;
        int i16 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f36282E;
        Object obj3 = this.f36286z;
        Object obj4 = this.f36285y;
        switch (i14) {
            case 0:
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f36284x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C12476e0 c12476e0 = (C12476e0) obj4;
                c12476e0.getClass();
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C3721c0(c12476e0, (InterfaceC28690z0) obj3, objArr2 == true ? 1 : 0, i16), 3);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C3721c0(c12476e0, (InterfaceC28690z0) obj2, objArr == true ? 1 : 0, i15), 3);
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return ((C23388b) obj3).f92690a.fromJson(new InputStreamReader(AbstractC20010d.m55815a(null, (InterfaceC20024q) this.f36284x), (Charset) obj4), ((C32236a) obj2).f133489b);
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C25594a) this.f36284x).f100414a = new C2696g((InterfaceC2994c0) obj4, (C29674b) obj3, (InterfaceC28593a1) obj2, 7);
                return c23454a0;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C29674b c29674b = (C29674b) this.f36284x;
                C28621h1 c28621h1 = (C28621h1) ((InterfaceC28593a1) obj4);
                if (c29674b.m91162k() != c28621h1.m87024x()) {
                    ((C4861a) obj3).m15517c(((Nudge) obj2).getVariantId(), new GoToNudgeStepAction(c29674b.m91162k()), new ButtonMeta((String) null, (Action) null, (ButtonType) null, (List) null, (Action) null, 31, (DefaultConstructorMarker) null));
                    c28621h1.m87025y(c29674b.m91162k());
                }
                return c23454a0;
            case 4:
                String str = (String) obj4;
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C26792m c26792m = (C26792m) this.f36284x;
                InterfaceC14544a interfaceC14544a = c26792m.f106719e;
                if (interfaceC14544a != null) {
                    interfaceC14544a.debug("--> remove file: " + AbstractC25265s.m74158x1(2, AbstractC39414r.m125906y0(str, new String[]{"-"}, 6)) + ", dropped events: " + ((ArrayList) obj3).size() + ", retry events: " + ((ArrayList) obj2).size());
                }
                c26792m.f106715a.m33432i(str);
                return c23454a0;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                AbstractC3006f0.m8732z((InterfaceC2994c0) this.f36284x, null, null, new C28820m((String) obj4, (C25609p) obj3, (InterfaceC28601c1) obj2, (InterfaceC30057d) null, 3), 3);
                return c23454a0;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C29938w0 c29938w0 = (C29938w0) obj4;
                try {
                    objM107888l = C29938w0.m91541a(c29938w0, (String) obj3, (String) obj2);
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                Throwable thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    ((C26212c) ((InterfaceC26213d) c29938w0.f122261y)).m77828c(thM68037a);
                }
                Throwable thM68037a2 = C23468n.m68037a(objM107888l);
                if (thM68037a2 == null) {
                    return objM107888l;
                }
                throw new SDKRuntimeException(thM68037a2);
            case 7:
                C33342w c33342w = (C33342w) this.f36284x;
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj3;
                C33326g screenState = (C33326g) interfaceC28601c1.getValue();
                C33326g c33326g = (C33326g) interfaceC28601c1.getValue();
                boolean z4 = !(c33326g.f139010y && c33326g.f139011z == null);
                if (((Boolean) ((InterfaceC28601c1) obj2).getValue()).booleanValue()) {
                    C33326g c33326g2 = (C33326g) interfaceC28601c1.getValue();
                    if (c33326g2.f139010y && c33326g2.f139011z == null) {
                        i15 = 0;
                    }
                } else {
                    i15 = 0;
                }
                int i17 = 0;
                C28573j c28573j = new C28573j(i17, c33342w, C33342w.class, "handlePrimaryButtonClick", "handlePrimaryButtonClick()V", 0, 18);
                C28573j c28573j2 = new C28573j(i17, c33342w, C33342w.class, "validate", "validate()V", 0, 19);
                C33333n c33333n = (C33333n) obj4;
                AbstractC22676k.m65750j(c33333n, "<this>");
                Function1 function1 = c33333n.f139038q;
                AbstractC22676k.m65750j(screenState, "screenState");
                C33321b c33321b = screenState.f139011z;
                InterfaceC41211c interfaceC41211c = screenState.f139007E;
                if (interfaceC41211c != null) {
                    c33333n.f139040s.invoke(interfaceC41211c);
                }
                if (c33321b == null) {
                    function1.invoke(new C3609b(AbstractC32128i.m100064s(R.string.stripe_continue_button_label, new Object[0], C25271y.f99162w), z4, c28573j2, (boolean) i15, c33333n, c33333n.f139027f, c28573j));
                } else {
                    function1.invoke(new C33192k(18));
                }
                c33333n.f139036o.invoke(c33321b != null ? c33321b.f138996F : null, Boolean.FALSE);
                return c23454a0;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f36284x;
                EnumC2998d0 enumC2998d0 = EnumC2998d0.f12007z;
                InterfaceC34476v interfaceC34476v = (InterfaceC34476v) obj4;
                AbstractC3006f0.m8732z(interfaceC2994c1, null, enumC2998d0, new C34306c0(interfaceC34476v, (InterfaceC34310d1) obj3, objArr4 == true ? 1 : 0, i16), 1);
                AbstractC3006f0.m8732z(interfaceC2994c1, null, enumC2998d0, new C32139c0((Object) interfaceC34476v, obj2, (InterfaceC30057d) (objArr3 == true ? 1 : 0), 13), 1);
                return c23454a0;
            case 9:
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                for (C37303c font : ((C30387i) this.f36284x).f124686f.values()) {
                    Context context = (Context) obj4;
                    AbstractC22676k.m65749i(font, "font");
                    try {
                        Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), AbstractC25012a.m73376i(font.f159508a, (String) obj2, AbstractC18489d0.m53374o((String) obj3)));
                        try {
                            AbstractC22676k.m65749i(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                            String str2 = font.f159510c;
                            AbstractC22676k.m65749i(str2, "font.style");
                            boolean zM125876U = AbstractC39414r.m125876U(str2, "Italic", false);
                            boolean zM125876U2 = AbstractC39414r.m125876U(str2, "Bold", false);
                            if (zM125876U && zM125876U2) {
                                i13 = 3;
                            } else if (zM125876U) {
                                i13 = 2;
                            } else {
                                i13 = zM125876U2 ? 1 : 0;
                            }
                            if (typefaceWithDefaultStyle.getStyle() != i13) {
                                typefaceWithDefaultStyle = Typeface.create(typefaceWithDefaultStyle, i13);
                            }
                            font.f159511d = typefaceWithDefaultStyle;
                        } catch (Exception unused) {
                            AbstractC12058c.f39982a.getClass();
                        }
                    } catch (Exception unused2) {
                        AbstractC12058c.f39982a.getClass();
                    }
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return C38329a.m122889a((View) this.f36284x, (C23465k) obj4, (List) obj3, (InterfaceC14544a) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11327d0(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f36283w = i13;
        this.f36285y = obj;
        this.f36286z = obj2;
        this.f36282E = obj3;
    }
}
