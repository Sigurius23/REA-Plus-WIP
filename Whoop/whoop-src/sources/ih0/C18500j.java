package ih0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.List;
import p412q3.C29891y;
import p713jm0.AbstractC21789d;
import p715kotlin.jvm.functions.Function1;
import ql0.InterfaceC30468c;

/* JADX INFO: renamed from: ih0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18500j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f72047E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f72048F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f72049G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f72050H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ boolean f72051I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f72052J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f72053K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f72054L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f72055M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object f72056N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Object f72057O;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72058w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f72059x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f72060y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f72061z;

    public /* synthetic */ C18500j(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, InterfaceC30468c interfaceC30468c, boolean z15, float f13, InterfaceC4339a interfaceC4339a, Function1 function2, int i14, int i15) {
        this.f72059x = str;
        this.f72055M = c29891y;
        this.f72061z = function1;
        this.f72052J = i13;
        this.f72060y = z4;
        this.f72049G = z13;
        this.f72050H = z14;
        this.f72057O = interfaceC30468c;
        this.f72051I = z15;
        this.f72047E = f13;
        this.f72048F = interfaceC4339a;
        this.f72056N = function2;
        this.f72053K = i14;
        this.f72054L = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f72058w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18502l.m53572S(this.f72059x, (C29891y) this.f72055M, this.f72061z, this.f72052J, this.f72060y, this.f72049G, this.f72050H, (InterfaceC30468c) this.f72057O, this.f72051I, this.f72047E, this.f72048F, (Function1) this.f72056N, this.f72053K, this.f72054L, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21789d.m61638q((List) this.f72055M, this.f72059x, this.f72060y, this.f72061z, (Modifier) this.f72056N, this.f72047E, this.f72048F, this.f72049G, this.f72050H, this.f72051I, (String) this.f72057O, this.f72052J, this.f72053K, this.f72054L, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C18500j(List list, String str, boolean z4, Function1 function1, Modifier modifier, float f13, InterfaceC4339a interfaceC4339a, boolean z13, boolean z14, boolean z15, String str2, int i13, int i14, int i15) {
        this.f72055M = list;
        this.f72059x = str;
        this.f72060y = z4;
        this.f72061z = function1;
        this.f72056N = modifier;
        this.f72047E = f13;
        this.f72048F = interfaceC4339a;
        this.f72049G = z13;
        this.f72050H = z14;
        this.f72051I = z15;
        this.f72057O = str2;
        this.f72052J = i13;
        this.f72053K = i14;
        this.f72054L = i15;
    }
}
