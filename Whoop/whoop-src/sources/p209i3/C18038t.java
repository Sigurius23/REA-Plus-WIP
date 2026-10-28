package p209i3;

import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25265s;
import p042c2.C3861f;
import p042c2.InterfaceC3871p;
import p208i2.InterfaceC17869a1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: i3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C18038t extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public static final C18038t f70000E;

    /* JADX INFO: renamed from: F */
    public static final C18038t f70001F;

    /* JADX INFO: renamed from: G */
    public static final C18038t f70002G;

    /* JADX INFO: renamed from: H */
    public static final C18038t f70003H;

    /* JADX INFO: renamed from: I */
    public static final C18038t f70004I;

    /* JADX INFO: renamed from: J */
    public static final C18038t f70005J;

    /* JADX INFO: renamed from: K */
    public static final C18038t f70006K;

    /* JADX INFO: renamed from: L */
    public static final C18038t f70007L;

    /* JADX INFO: renamed from: M */
    public static final C18038t f70008M;

    /* JADX INFO: renamed from: N */
    public static final C18038t f70009N;

    /* JADX INFO: renamed from: O */
    public static final C18038t f70010O;

    /* JADX INFO: renamed from: P */
    public static final C18038t f70011P;

    /* JADX INFO: renamed from: Q */
    public static final C18038t f70012Q;

    /* JADX INFO: renamed from: R */
    public static final C18038t f70013R;

    /* JADX INFO: renamed from: S */
    public static final C18038t f70014S;

    /* JADX INFO: renamed from: x */
    public static final C18038t f70015x;

    /* JADX INFO: renamed from: y */
    public static final C18038t f70016y;

    /* JADX INFO: renamed from: z */
    public static final C18038t f70017z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f70018w;

    static {
        int i13 = 2;
        f70015x = new C18038t(i13, 0);
        f70016y = new C18038t(i13, 1);
        f70017z = new C18038t(i13, 2);
        f70000E = new C18038t(i13, 3);
        f70001F = new C18038t(i13, 4);
        f70002G = new C18038t(i13, 5);
        f70003H = new C18038t(i13, 6);
        f70004I = new C18038t(i13, 7);
        f70005J = new C18038t(i13, 8);
        f70006K = new C18038t(i13, 9);
        f70007L = new C18038t(i13, 10);
        f70008M = new C18038t(i13, 11);
        f70009N = new C18038t(i13, 12);
        f70010O = new C18038t(i13, 13);
        f70011P = new C18038t(i13, 14);
        f70012Q = new C18038t(i13, 15);
        f70013R = new C18038t(i13, 16);
        f70014S = new C18038t(i13, 17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18038t(int i13, int i14) {
        super(i13);
        this.f70018w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC23459e interfaceC23459e;
        switch (this.f70018w) {
            case 0:
                return (C3861f) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(list);
                arrayListM74097F1.addAll(list2);
                return arrayListM74097F1;
            case 2:
                return (InterfaceC3871p) obj;
            case 3:
                return (C23454a0) obj;
            case 4:
                return (C23454a0) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (C23454a0) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                C18027i c18027i = (C18027i) obj;
                int i13 = ((C18027i) obj2).f69949a;
                return c18027i;
            case 10:
                return (InterfaceC17869a1) obj;
            case 11:
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(list3);
                arrayListM74097F2.addAll(list4);
                return arrayListM74097F2;
            case 13:
                Float f13 = (Float) obj;
                ((Number) obj2).floatValue();
                return f13;
            case 14:
                return (String) obj;
            case 15:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                C18017a c18017a = (C18017a) obj;
                C18017a c18017a2 = (C18017a) obj2;
                if (c18017a == null || (str = c18017a.f69928a) == null) {
                    str = c18017a2.f69928a;
                }
                if (c18017a == null || (interfaceC23459e = c18017a.f69929b) == null) {
                    interfaceC23459e = c18017a2.f69929b;
                }
                return new C18017a(str, interfaceC23459e);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
