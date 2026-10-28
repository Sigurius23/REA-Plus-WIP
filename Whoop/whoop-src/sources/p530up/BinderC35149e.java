package p530up;

import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import e10.C12554k0;
import eu.C13601a0;
import eu.C13603b0;
import eu.C13610f;
import eu.C13612g;
import eu.C13614h;
import eu.C13616i;
import eu.C13617i0;
import eu.C13619j0;
import eu.C13627n0;
import eu.C13633t;
import eu.C13634u;
import eu.C13635v;
import eu.EnumC13600a;
import eu.EnumC13618j;
import eu.InterfaceC13637x;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p002a0.C0006a1;
import p072cp.BinderC10935b;
import p229ip.AbstractBinderC20797h;
import p375op.AbstractBinderC28070b;
import p375op.AbstractC28076h;
import p375op.C28072d;
import p375op.C28073e;
import p375op.C28080l;
import p375op.C28081m;
import p375op.C28082n;
import p375op.InterfaceC28071c;
import p375op.InterfaceC28075g;
import p390p1.C28647o;
import p505ts.AbstractC34132o;
import p529uo.AbstractC35135w;
import p558vp.C36261e;
import p591wp.C37487h;
import p591wp.C37490k;
import p591wp.C37491l;
import p602x1.C37816b;
import p619xl.C38445a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: up.e */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC35149e extends AbstractBinderC20797h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f149136g = 4;

    /* JADX INFO: renamed from: h */
    public final Object f149137h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C12554k0 c12554k0) {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener", 3);
        this.f149137h = c12554k0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v27 */
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
    @Override // p229ip.AbstractBinderC20797h
    /* JADX INFO: renamed from: l0 */
    public final boolean mo57332l0(int i13, Parcel parcel, Parcel parcel2) {
        Function1 function1;
        Function1 function2;
        Function1 function3;
        Function1 function4;
        Function3 function5;
        Function3 function6;
        InterfaceC28075g c28073e;
        Object next;
        Function1 function7;
        int i14 = this.f149136g;
        C36261e c36261e = null;
        EnumC13600a enumC13600a = null;
        C28072d c28072d = null;
        C28080l c28080l = null;
        C28081m c28081m = null;
        C28082n c28082n = null;
        composeView = null;
        ComposeView composeView = null;
        composeView = null;
        ComposeView composeView2 = null;
        Object obj = this.f149137h;
        ?? BooleanValue = 0;
        BooleanValue = 0;
        int i15 = 1;
        switch (i14) {
            case 0:
                if (i13 != 1) {
                    return false;
                }
                InterfaceC28071c interfaceC28071cM84848n0 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                AbstractC28076h.m84850b(parcel);
                C37487h c37487h = new C37487h(interfaceC28071cM84848n0);
                C13617i0 c13617i0M121654o = AbstractC37978j.m121654o(((C13634u) obj).f48319a.f48321F, c37487h);
                if (c13617i0M121654o != null && (function1 = c13617i0M121654o.f48227d) != null) {
                    BooleanValue = ((Boolean) function1.invoke(c37487h)).booleanValue();
                }
                parcel2.writeNoException();
                parcel2.writeInt(BooleanValue);
                return true;
            case 1:
                if (i13 != 1) {
                    return false;
                }
                LatLng it = (LatLng) AbstractC28076h.m84849a(parcel, LatLng.CREATOR);
                AbstractC28076h.m84850b(parcel);
                C13603b0 c13603b0 = ((C13601a0) obj).f48100a;
                AbstractC22676k.m65750j(it, "it");
                ((Function1) c13603b0.f48133b.f48324c.getValue()).invoke(it);
                parcel2.writeNoException();
                return true;
            case 2:
                C13610f c13610f = (C13610f) obj;
                if (i13 == 1) {
                    c13610f.f48174x.resumeWith(C23454a0.f92919a);
                } else {
                    if (i13 != 2) {
                        return false;
                    }
                    c13610f.f48174x.resumeWith(AbstractC34132o.m107888l(new CancellationException("Animation cancelled")));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                if (i13 != 1) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    c36261e = iInterfaceQueryLocalInterface instanceof C36261e ? (C36261e) iInterfaceQueryLocalInterface : new C36261e(strongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 3);
                }
                AbstractC28076h.m84850b(parcel);
                C35146b c35146b = new C35146b(c36261e);
                C13633t c13633t = (C13633t) obj;
                c13633t.getClass();
                c13633t.f48318a.resumeWith(c35146b);
                parcel2.writeNoException();
                return true;
            case 4:
                C13635v c13635v = (C13635v) ((C12554k0) obj).f42881x;
                if (i13 == 1) {
                    InterfaceC28071c interfaceC28071cM84848n1 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                    AbstractC28076h.m84850b(parcel);
                    C37487h c37487h2 = new C37487h(interfaceC28071cM84848n1);
                    C13617i0 c13617i0M121654o2 = AbstractC37978j.m121654o(c13635v.f48321F, c37487h2);
                    C13619j0 c13619j0 = c13617i0M121654o2 != null ? c13617i0M121654o2.f48226c : null;
                    if (c13619j0 != null) {
                        LatLng latLngM120172a = c37487h2.m120172a();
                        AbstractC22676k.m65749i(latLngM120172a, "marker.position");
                        c13619j0.f48237a.setValue(latLngM120172a);
                    }
                    C13619j0 c13619j1 = c13617i0M121654o2 != null ? c13617i0M121654o2.f48226c : null;
                    if (c13619j1 != null) {
                        c13619j1.f48238b.setValue(EnumC13618j.f48233w);
                    }
                } else if (i13 == 2) {
                    InterfaceC28071c interfaceC28071cM84848n2 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                    AbstractC28076h.m84850b(parcel);
                    C37487h c37487h3 = new C37487h(interfaceC28071cM84848n2);
                    C13617i0 c13617i0M121654o3 = AbstractC37978j.m121654o(c13635v.f48321F, c37487h3);
                    C13619j0 c13619j2 = c13617i0M121654o3 != null ? c13617i0M121654o3.f48226c : null;
                    if (c13619j2 != null) {
                        LatLng latLngM120172a2 = c37487h3.m120172a();
                        AbstractC22676k.m65749i(latLngM120172a2, "marker.position");
                        c13619j2.f48237a.setValue(latLngM120172a2);
                    }
                    C13619j0 c13619j3 = c13617i0M121654o3 != null ? c13617i0M121654o3.f48226c : null;
                    if (c13619j3 != null) {
                        c13619j3.f48238b.setValue(EnumC13618j.f48234x);
                    }
                } else {
                    if (i13 != 3) {
                        return false;
                    }
                    InterfaceC28071c interfaceC28071cM84848n3 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                    AbstractC28076h.m84850b(parcel);
                    C37487h c37487h4 = new C37487h(interfaceC28071cM84848n3);
                    C13617i0 c13617i0M121654o4 = AbstractC37978j.m121654o(c13635v.f48321F, c37487h4);
                    C13619j0 c13619j4 = c13617i0M121654o4 != null ? c13617i0M121654o4.f48226c : null;
                    if (c13619j4 != null) {
                        LatLng latLngM120172a3 = c37487h4.m120172a();
                        AbstractC22676k.m65749i(latLngM120172a3, "marker.position");
                        c13619j4.f48237a.setValue(latLngM120172a3);
                    }
                    C13619j0 c13619j5 = c13617i0M121654o4 != null ? c13617i0M121654o4.f48226c : null;
                    if (c13619j5 != null) {
                        c13619j5.f48238b.setValue(EnumC13618j.f48235y);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
                if (i13 != 1) {
                    return false;
                }
                InterfaceC28071c interfaceC28071cM84848n4 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                AbstractC28076h.m84850b(parcel);
                C37487h c37487h5 = new C37487h(interfaceC28071cM84848n4);
                C13617i0 c13617i0M121654o5 = AbstractC37978j.m121654o(((C13634u) obj).f48319a.f48321F, c37487h5);
                if (c13617i0M121654o5 != null && (function2 = c13617i0M121654o5.f48228e) != null) {
                    function2.invoke(c37487h5);
                }
                parcel2.writeNoException();
                return true;
            case 6:
                if (i13 != 1) {
                    return false;
                }
                InterfaceC28071c interfaceC28071cM84848n5 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                AbstractC28076h.m84850b(parcel);
                C37487h c37487h6 = new C37487h(interfaceC28071cM84848n5);
                C13617i0 c13617i0M121654o6 = AbstractC37978j.m121654o(((C13634u) obj).f48319a.f48321F, c37487h6);
                if (c13617i0M121654o6 != null && (function3 = c13617i0M121654o6.f48230g) != null) {
                    function3.invoke(c37487h6);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                if (i13 != 1) {
                    return false;
                }
                InterfaceC28071c interfaceC28071cM84848n6 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                AbstractC28076h.m84850b(parcel);
                C37487h c37487h7 = new C37487h(interfaceC28071cM84848n6);
                C13617i0 c13617i0M121654o7 = AbstractC37978j.m121654o(((C13634u) obj).f48319a.f48321F, c37487h7);
                if (c13617i0M121654o7 != null && (function4 = c13617i0M121654o7.f48229f) != null) {
                    function4.invoke(c37487h7);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                C38445a c38445a = (C38445a) obj;
                C35147c c35147c = (C35147c) c38445a.f164636x;
                C0006a1 c0006a1 = (C0006a1) c38445a.f164637y;
                if (i13 == 1) {
                    InterfaceC28071c interfaceC28071cM84848n7 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                    AbstractC28076h.m84850b(parcel);
                    C37487h c37487h8 = new C37487h(interfaceC28071cM84848n7);
                    C13617i0 c13617i0 = (C13617i0) c0006a1.invoke(c37487h8);
                    if (c13617i0 != null && (function5 = c13617i0.f48231h) != null) {
                        Context context = c35147c.getContext();
                        AbstractC22676k.m65749i(context, "mapView.context");
                        ComposeView composeView3 = new ComposeView(context, null, 6);
                        c35147c.addView(composeView3);
                        C28647o c28647o = c13617i0.f48224a;
                        C37816b c37816b = new C37816b(new C13614h(function5, c37487h8, i15), true, 10795116);
                        composeView3.setParentCompositionContext(c28647o);
                        composeView3.setContent(c37816b);
                        ViewParent parent = composeView3.getParent();
                        C35147c c35147c2 = parent instanceof C35147c ? (C35147c) parent : null;
                        if (c35147c2 != null) {
                            c35147c2.removeView(composeView3);
                        }
                        composeView2 = composeView3;
                    }
                    BinderC10935b binderC10935b = new BinderC10935b(composeView2);
                    parcel2.writeNoException();
                    AbstractC28076h.m84852d(parcel2, binderC10935b);
                } else {
                    if (i13 != 2) {
                        return false;
                    }
                    InterfaceC28071c interfaceC28071cM84848n8 = AbstractBinderC28070b.m84848n0(parcel.readStrongBinder());
                    AbstractC28076h.m84850b(parcel);
                    C37487h c37487h9 = new C37487h(interfaceC28071cM84848n8);
                    C13617i0 c13617i1 = (C13617i0) c0006a1.invoke(c37487h9);
                    if (c13617i1 != null && (function6 = c13617i1.f48232i) != null) {
                        Context context2 = c35147c.getContext();
                        AbstractC22676k.m65749i(context2, "mapView.context");
                        ComposeView composeView4 = new ComposeView(context2, null, 6);
                        c35147c.addView(composeView4);
                        C28647o c28647o2 = c13617i1.f48224a;
                        C37816b c37816b2 = new C37816b(new C13614h(function6, c37487h9, BooleanValue == true ? 1 : 0), true, -546559146);
                        composeView4.setParentCompositionContext(c28647o2);
                        composeView4.setContent(c37816b2);
                        ViewParent parent2 = composeView4.getParent();
                        C35147c c35147c3 = parent2 instanceof C35147c ? (C35147c) parent2 : null;
                        if (c35147c3 != null) {
                            c35147c3.removeView(composeView4);
                        }
                        composeView = composeView4;
                    }
                    BinderC10935b binderC10935b2 = new BinderC10935b(composeView);
                    parcel2.writeNoException();
                    AbstractC28076h.m84852d(parcel2, binderC10935b2);
                }
                return true;
            case 9:
                if (i13 != 1) {
                    return false;
                }
                boolean zBooleanValue = ((Boolean) ((InterfaceC4339a) ((C13601a0) obj).f48100a.f48133b.f48326e.getValue()).invoke()).booleanValue();
                parcel2.writeNoException();
                int i16 = AbstractC28076h.f113570a;
                parcel2.writeInt(zBooleanValue ? 1 : 0);
                return true;
            case 10:
                if (i13 != 1) {
                    return false;
                }
                Location it3 = (Location) AbstractC28076h.m84849a(parcel, Location.CREATOR);
                AbstractC28076h.m84850b(parcel);
                C13603b0 c13603b1 = ((C13601a0) obj).f48100a;
                AbstractC22676k.m65750j(it3, "it");
                ((Function1) c13603b1.f48133b.f48327f.getValue()).invoke(it3);
                parcel2.writeNoException();
                return true;
            case 11:
                if (i13 != 1) {
                    return false;
                }
                ((InterfaceC4339a) ((C13601a0) obj).f48100a.f48133b.f48325d.getValue()).invoke();
                parcel2.writeNoException();
                return true;
            case 12:
                C13603b0 c13603b2 = (C13603b0) ((C12554k0) obj).f42881x;
                if (i13 == 1) {
                    ((C13616i) c13603b2.f48133b.f48322a.getValue()).getClass();
                } else {
                    if (i13 != 2) {
                        return false;
                    }
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                        c28082n = iInterfaceQueryLocalInterface2 instanceof C28082n ? (C28082n) iInterfaceQueryLocalInterface2 : new C28082n(strongBinder2, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate", 3);
                    }
                    AbstractC28076h.m84850b(parcel);
                    AbstractC35135w.m111095g(c28082n, "delegate");
                    ((C13616i) c13603b2.f48133b.f48322a.getValue()).getClass();
                }
                parcel2.writeNoException();
                return true;
            case 13:
                if (i13 != 1) {
                    return false;
                }
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    c28081m = iInterfaceQueryLocalInterface3 instanceof C28081m ? (C28081m) iInterfaceQueryLocalInterface3 : new C28081m(strongBinder3, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate", 3);
                }
                AbstractC28076h.m84850b(parcel);
                AbstractC35135w.m111094f(c28081m);
                for (InterfaceC13637x interfaceC13637x : ((C13634u) obj).f48319a.f48321F) {
                }
                parcel2.writeNoException();
                return true;
            case 14:
                if (i13 != 1) {
                    return false;
                }
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    c28080l = iInterfaceQueryLocalInterface4 instanceof C28080l ? (C28080l) iInterfaceQueryLocalInterface4 : new C28080l(strongBinder4, "com.google.android.gms.maps.model.internal.ICircleDelegate", 3);
                }
                AbstractC28076h.m84850b(parcel);
                AbstractC35135w.m111094f(c28080l);
                for (InterfaceC13637x interfaceC13637x2 : ((C13634u) obj).f48319a.f48321F) {
                }
                parcel2.writeNoException();
                return true;
            case 15:
                if (i13 != 1) {
                    return false;
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    c28072d = iInterfaceQueryLocalInterface5 instanceof C28072d ? (C28072d) iInterfaceQueryLocalInterface5 : new C28072d(strongBinder5, "com.google.android.gms.maps.model.internal.IPolygonDelegate", 3);
                }
                AbstractC28076h.m84850b(parcel);
                AbstractC35135w.m111094f(c28072d);
                for (InterfaceC13637x interfaceC13637x3 : ((C13634u) obj).f48319a.f48321F) {
                }
                parcel2.writeNoException();
                return true;
            case 16:
                if (i13 != 1) {
                    return false;
                }
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    c28073e = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                    c28073e = iInterfaceQueryLocalInterface6 instanceof InterfaceC28075g ? (InterfaceC28075g) iInterfaceQueryLocalInterface6 : new C28073e(strongBinder6, "com.google.android.gms.maps.model.internal.IPolylineDelegate", 3);
                }
                AbstractC28076h.m84850b(parcel);
                C37491l c37491l = new C37491l(c28073e);
                Iterator it4 = ((C13634u) obj).f48319a.f48321F.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        InterfaceC13637x interfaceC13637x4 = (InterfaceC13637x) next;
                        if (!(interfaceC13637x4 instanceof C13627n0) || !((C13627n0) interfaceC13637x4).f48299a.equals(c37491l)) {
                        }
                    } else {
                        next = null;
                    }
                }
                C13627n0 c13627n0 = next instanceof C13627n0 ? (C13627n0) next : null;
                if (c13627n0 != null && (function7 = c13627n0.f48300b) != null) {
                    function7.invoke(c37491l);
                }
                parcel2.writeNoException();
                return true;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                if (i13 != 1) {
                    return false;
                }
                C37490k it5 = (C37490k) AbstractC28076h.m84849a(parcel, C37490k.CREATOR);
                AbstractC28076h.m84850b(parcel);
                C13603b0 c13603b3 = ((C13601a0) obj).f48100a;
                AbstractC22676k.m65750j(it5, "it");
                ((Function1) c13603b3.f48133b.f48328g.getValue()).invoke(it5);
                parcel2.writeNoException();
                return true;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if (i13 != 1) {
                    return false;
                }
                int i17 = parcel.readInt();
                AbstractC28076h.m84850b(parcel);
                C13603b0 c13603b4 = ((C13601a0) obj).f48100a;
                C13612g c13612g = c13603b4.f48136e;
                for (EnumC13600a enumC13600a2 : EnumC13600a.values()) {
                    if (enumC13600a2.f48099w == i17) {
                        enumC13600a = enumC13600a2;
                        if (enumC13600a == null) {
                            enumC13600a = EnumC13600a.UNKNOWN;
                        }
                        c13612g.getClass();
                        c13612g.f48188b.setValue(enumC13600a);
                        c13603b4.f48136e.f48187a.setValue(Boolean.TRUE);
                        parcel2.writeNoException();
                        return true;
                    }
                }
                if (enumC13600a == null) {
                    enumC13600a = EnumC13600a.UNKNOWN;
                }
                c13612g.getClass();
                c13612g.f48188b.setValue(enumC13600a);
                c13603b4.f48136e.f48187a.setValue(Boolean.TRUE);
                parcel2.writeNoException();
                return true;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (i13 != 1) {
                    return false;
                }
                C13603b0 c13603b5 = ((C13601a0) obj).f48100a;
                C13612g c13612g2 = c13603b5.f48136e;
                CameraPosition cameraPositionM111146a = c13603b5.f48132a.m111146a();
                AbstractC22676k.m65749i(cameraPositionM111146a, "map.cameraPosition");
                c13612g2.f48189c.setValue(cameraPositionM111146a);
                parcel2.writeNoException();
                return true;
            case 20:
                if (i13 != 1) {
                    return false;
                }
                ((C13601a0) obj).f48100a.f48136e.f48187a.setValue(Boolean.FALSE);
                parcel2.writeNoException();
                return true;
            case 21:
                if (i13 != 1) {
                    return false;
                }
                C13603b0 c13603b6 = ((C13601a0) obj).f48100a;
                c13603b6.f48136e.f48187a.setValue(Boolean.FALSE);
                C13612g c13612g3 = c13603b6.f48136e;
                CameraPosition cameraPositionM111146a2 = c13603b6.f48132a.m111146a();
                AbstractC22676k.m65749i(cameraPositionM111146a2, "map.cameraPosition");
                c13612g3.f48189c.setValue(cameraPositionM111146a2);
                parcel2.writeNoException();
                return true;
            default:
                if (i13 != 1) {
                    return false;
                }
                LatLng it6 = (LatLng) AbstractC28076h.m84849a(parcel, LatLng.CREATOR);
                AbstractC28076h.m84850b(parcel);
                C13603b0 c13603b7 = ((C13601a0) obj).f48100a;
                AbstractC22676k.m65750j(it6, "it");
                ((Function1) c13603b7.f48133b.f48323b.getValue()).invoke(it6);
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C12554k0 c12554k0, byte b) {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener", 3);
        this.f149137h = c12554k0;
    }

    public BinderC35149e(C13610f c13610f) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 3);
        this.f149137h = c13610f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13633t c13633t) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 3);
        this.f149137h = c13633t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13634u c13634u) {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener", 3);
        this.f149137h = c13634u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13634u c13634u, byte b) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 3);
        this.f149137h = c13634u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13634u c13634u, byte b, byte b6) {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener", 3);
        this.f149137h = c13634u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13634u c13634u, byte b, char c3) {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener", 3);
        this.f149137h = c13634u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13634u c13634u, byte b, boolean z4) {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener", 3);
        this.f149137h = c13634u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13634u c13634u, char c3) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener", 3);
        this.f149137h = c13634u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13634u c13634u, int i13) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener", 3);
        this.f149137h = c13634u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13634u c13634u, short s13) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener", 3);
        this.f149137h = c13634u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, byte b) {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, byte b, byte b6) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, byte b, char c3) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, byte b, int i13) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, byte b, short s13) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, byte b, boolean z4) {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, char c3) {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, int i13) {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C13601a0 c13601a0, short s13) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 3);
        this.f149137h = c13601a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC35149e(C38445a c38445a) {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter", 3);
        this.f149137h = c38445a;
    }
}
