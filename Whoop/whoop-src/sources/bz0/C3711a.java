package bz0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.AbstractC4011d5;
import c41.C4018e5;
import c93.InterfaceC4351m;
import fm1.C14605i;
import ht2.C17634f;
import j61.C21372f;
import jk2.AbstractC21768i;
import js1.AbstractC21921l;
import js1.C21917h;
import nm1.AbstractC26843h;
import nm1.C26844i;
import p715kotlin.jvm.functions.Function1;
import p741vn1.C36213q;
import um1.AbstractC35086d;
import ym1.AbstractC39652c;
import yy0.AbstractC39888b;
import yy0.C39889c;

/* JADX INFO: renamed from: bz0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3711a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f15164E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15165w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f15166x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f15167y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f15168z;

    public /* synthetic */ C3711a(C14605i c14605i, Modifier modifier, int i13, int i14) {
        this.f15165w = 2;
        this.f15164E = c14605i;
        this.f15168z = modifier;
        this.f15166x = i13;
        this.f15167y = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15165w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3712b.m11531c((Modifier) this.f15168z, (C21372f) this.f15164E, this.f15166x, this.f15167y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4011d5.m12163i((C4018e5) this.f15168z, (Function1) this.f15164E, this.f15166x, this.f15167y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC21768i.m61501D((C14605i) this.f15164E, (Modifier) this.f15168z, this.f15166x, this.f15167y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC21921l.m62380J((C21917h) this.f15168z, (Function1) this.f15164E, this.f15166x, this.f15167y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC26843h.m80111k((C26844i) this.f15168z, (Function1) this.f15164E, this.f15166x, this.f15167y, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC35086d.m110957m((C36213q) this.f15168z, (Function1) this.f15164E, this.f15166x, this.f15167y, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC39652c.m126782l((C17634f) this.f15168z, (Function1) this.f15164E, this.f15166x, this.f15167y, (Composer) obj, iIntValue7);
            default:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC39888b.m127972d((Modifier) this.f15168z, (C39889c) this.f15164E, this.f15166x, this.f15167y, (Composer) obj, iIntValue8);
        }
    }

    public /* synthetic */ C3711a(Object obj, int i13, Object obj2, int i14, int i15) {
        this.f15165w = i15;
        this.f15168z = obj;
        this.f15164E = obj2;
        this.f15166x = i13;
        this.f15167y = i14;
    }
}
