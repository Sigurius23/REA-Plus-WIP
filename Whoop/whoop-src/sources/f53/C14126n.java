package f53;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import g53.C15498c;
import g53.C15499d;
import g53.C15500e;
import g53.C15501f;
import g53.C15502g;
import g53.C15503h;
import g53.C15504i;
import g53.C15505j;
import g53.C15507l;
import g53.C15509n;
import g53.C15510o;
import g53.C15512q;
import g53.C15513r;
import g53.C15514s;
import g53.C15515t;
import g53.C15516u;
import g53.C15517v;
import g53.C15518w;
import g53.EnumC15496a;
import g53.EnumC15497b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import rb3.AbstractC31199g;

/* JADX INFO: renamed from: f53.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C14126n extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public static final C14126n f50778E;

    /* JADX INFO: renamed from: F */
    public static final C14126n f50779F;

    /* JADX INFO: renamed from: G */
    public static final C14126n f50780G;

    /* JADX INFO: renamed from: H */
    public static final C14126n f50781H;

    /* JADX INFO: renamed from: I */
    public static final C14126n f50782I;

    /* JADX INFO: renamed from: J */
    public static final C14126n f50783J;

    /* JADX INFO: renamed from: K */
    public static final C14126n f50784K;

    /* JADX INFO: renamed from: L */
    public static final C14126n f50785L;

    /* JADX INFO: renamed from: M */
    public static final C14126n f50786M;

    /* JADX INFO: renamed from: N */
    public static final C14126n f50787N;

    /* JADX INFO: renamed from: O */
    public static final C14126n f50788O;

    /* JADX INFO: renamed from: P */
    public static final C14126n f50789P;

    /* JADX INFO: renamed from: Q */
    public static final C14126n f50790Q;

    /* JADX INFO: renamed from: R */
    public static final C14126n f50791R;

    /* JADX INFO: renamed from: S */
    public static final C14126n f50792S;

    /* JADX INFO: renamed from: T */
    public static final C14126n f50793T;

    /* JADX INFO: renamed from: U */
    public static final C14126n f50794U;

    /* JADX INFO: renamed from: V */
    public static final C14126n f50795V;

    /* JADX INFO: renamed from: W */
    public static final C14126n f50796W;

    /* JADX INFO: renamed from: X */
    public static final C14126n f50797X;

    /* JADX INFO: renamed from: Y */
    public static final C14126n f50798Y;

    /* JADX INFO: renamed from: Z */
    public static final C14126n f50799Z;

    /* JADX INFO: renamed from: a0 */
    public static final C14126n f50800a0;

    /* JADX INFO: renamed from: b0 */
    public static final C14126n f50801b0;

    /* JADX INFO: renamed from: c0 */
    public static final C14126n f50802c0;

    /* JADX INFO: renamed from: d0 */
    public static final C14126n f50803d0;

    /* JADX INFO: renamed from: e0 */
    public static final C14126n f50804e0;

    /* JADX INFO: renamed from: x */
    public static final C14126n f50805x;

    /* JADX INFO: renamed from: y */
    public static final C14126n f50806y;

    /* JADX INFO: renamed from: z */
    public static final C14126n f50807z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50808w;

    static {
        int i13 = 2;
        f50805x = new C14126n(i13, 0);
        f50806y = new C14126n(i13, 1);
        f50807z = new C14126n(i13, 2);
        f50778E = new C14126n(i13, 3);
        f50779F = new C14126n(i13, 4);
        f50780G = new C14126n(i13, 5);
        f50781H = new C14126n(i13, 6);
        f50782I = new C14126n(i13, 7);
        f50783J = new C14126n(i13, 8);
        f50784K = new C14126n(i13, 9);
        f50785L = new C14126n(i13, 10);
        f50786M = new C14126n(i13, 11);
        f50787N = new C14126n(i13, 12);
        f50788O = new C14126n(i13, 13);
        f50789P = new C14126n(i13, 14);
        f50790Q = new C14126n(i13, 15);
        f50791R = new C14126n(i13, 16);
        f50792S = new C14126n(i13, 17);
        f50793T = new C14126n(i13, 18);
        f50794U = new C14126n(i13, 19);
        f50795V = new C14126n(i13, 20);
        f50796W = new C14126n(i13, 21);
        f50797X = new C14126n(i13, 22);
        f50798Y = new C14126n(i13, 23);
        f50799Z = new C14126n(i13, 24);
        f50800a0 = new C14126n(i13, 25);
        f50801b0 = new C14126n(i13, 26);
        f50802c0 = new C14126n(i13, 27);
        f50803d0 = new C14126n(i13, 28);
        f50804e0 = new C14126n(i13, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14126n(int i13, int i14) {
        super(i13);
        this.f50808w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50808w) {
            case 0:
                C15501f onEvent = (C15501f) obj;
                C15509n it = (C15509n) obj2;
                AbstractC22676k.m65750j(onEvent, "$this$onEvent");
                AbstractC22676k.m65750j(it, "it");
                AbstractC31199g abstractC31199g = it.f58178a;
                EnumC15497b enumC15497b = it.f58179b;
                int iOrdinal = enumC15497b.ordinal();
                if (iOrdinal == 0) {
                    return new C15499d(abstractC31199g, enumC15497b);
                }
                if (iOrdinal == 1) {
                    return onEvent;
                }
                if (iOrdinal == 2) {
                    return new C15499d(abstractC31199g, enumC15497b);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                AbstractC22676k.m65750j((C15501f) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15514s) obj2, "it");
                return C15500e.f58171a;
            case 2:
                C15509n it3 = (C15509n) obj2;
                AbstractC22676k.m65750j((C15507l) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it3, "it");
                return new C15499d(it3.f58178a, it3.f58179b);
            case 3:
                C15510o it4 = (C15510o) obj2;
                AbstractC22676k.m65750j((C15507l) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it4, "it");
                return new C15498c(it4.f58180a);
            case 4:
                AbstractC22676k.m65750j((C15507l) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15518w) obj2, "it");
                return C15505j.f58176a;
            case 5:
                AbstractC22676k.m65750j((C15507l) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15513r) obj2, "it");
                return C15503h.f58174a;
            case 6:
                C15517v it5 = (C15517v) obj2;
                AbstractC22676k.m65750j((C15507l) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it5, "it");
                return new C15501f(it5.f58187a);
            case 7:
                C15512q it6 = (C15512q) obj2;
                AbstractC22676k.m65750j((C15507l) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it6, "it");
                return new C15502g(it6.f58182a);
            case 8:
                AbstractC22676k.m65750j((C15507l) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15514s) obj2, "it");
                return C15500e.f58171a;
            case 9:
                AbstractC22676k.m65750j((C15507l) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15516u) obj2, "it");
                return C15504i.f58175a;
            case 10:
                C15509n it7 = (C15509n) obj2;
                AbstractC22676k.m65750j((C15499d) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it7, "it");
                return new C15499d(it7.f58178a, it7.f58179b);
            case 11:
                C15510o it8 = (C15510o) obj2;
                AbstractC22676k.m65750j((C15499d) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it8, "it");
                return new C15498c(it8.f58180a);
            case 12:
                AbstractC22676k.m65750j((C15499d) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15518w) obj2, "it");
                return C15505j.f58176a;
            case 13:
                AbstractC22676k.m65750j((C15499d) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15513r) obj2, "it");
                return C15503h.f58174a;
            case 14:
                C15517v it9 = (C15517v) obj2;
                AbstractC22676k.m65750j((C15499d) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it9, "it");
                return new C15501f(it9.f58187a);
            case 15:
                C15512q it10 = (C15512q) obj2;
                AbstractC22676k.m65750j((C15499d) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it10, "it");
                return new C15502g(it10.f58182a);
            case 16:
                AbstractC22676k.m65750j((C15499d) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15514s) obj2, "it");
                return C15500e.f58171a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC22676k.m65750j((C15499d) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15516u) obj2, "it");
                return C15504i.f58175a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C15510o it11 = (C15510o) obj2;
                AbstractC22676k.m65750j((C15498c) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it11, "it");
                return new C15498c(it11.f58180a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                AbstractC22676k.m65750j((C15498c) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15518w) obj2, "it");
                return C15505j.f58176a;
            case 20:
                AbstractC22676k.m65750j((C15498c) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15513r) obj2, "it");
                return C15503h.f58174a;
            case 21:
                C15517v it12 = (C15517v) obj2;
                AbstractC22676k.m65750j((C15498c) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it12, "it");
                return new C15501f(it12.f58187a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C15512q it13 = (C15512q) obj2;
                AbstractC22676k.m65750j((C15498c) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it13, "it");
                return new C15502g(it13.f58182a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC22676k.m65750j((C15498c) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15514s) obj2, "it");
                return C15500e.f58171a;
            case 24:
                AbstractC22676k.m65750j((C15498c) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15516u) obj2, "it");
                return C15504i.f58175a;
            case 25:
                AbstractC22676k.m65750j((C15504i) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15514s) obj2, "it");
                return C15500e.f58171a;
            case 26:
                C15509n it14 = (C15509n) obj2;
                AbstractC22676k.m65750j((C15504i) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it14, "it");
                return new C15499d(it14.f58178a, it14.f58179b);
            case 27:
                AbstractC22676k.m65750j((C15504i) obj, "$this$onEvent");
                AbstractC22676k.m65750j((C15515t) obj2, "it");
                return new C15507l(EnumC15496a.f58161w);
            case 28:
                C15509n it15 = (C15509n) obj2;
                AbstractC22676k.m65750j((C15503h) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it15, "it");
                return new C15499d(it15.f58178a, it15.f58179b);
            default:
                C15510o it16 = (C15510o) obj2;
                AbstractC22676k.m65750j((C15503h) obj, "$this$onEvent");
                AbstractC22676k.m65750j(it16, "it");
                return new C15498c(it16.f58180a);
        }
    }
}
