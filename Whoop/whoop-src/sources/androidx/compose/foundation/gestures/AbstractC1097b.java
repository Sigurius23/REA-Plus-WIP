package androidx.compose.foundation.gestures;

import androidx.compose.p018ui.Modifier;
import gm1.C15992b;
import p132f0.C13774c;
import p132f0.EnumC13840z0;
import p180h0.C16372c3;
import p180h0.C16423m2;
import p180h0.C16428n2;
import p180h0.C16433o2;
import p180h0.C16438p2;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16478x2;
import p181h2.C16617b;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1097b {

    /* JADX INFO: renamed from: a */
    public static final C15992b f4538a = new C15992b(28);

    /* JADX INFO: renamed from: b */
    public static final C16428n2 f4539b = new C16428n2();

    /* JADX INFO: renamed from: c */
    public static final C16423m2 f4540c = new C16423m2();

    /* JADX INFO: renamed from: d */
    public static final C16433o2 f4541d = new C16433o2();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m3373a(C16372c3 c16372c3, long j7, AbstractC32269c abstractC32269c) {
        C16438p2 c16438p2;
        C22663d0 c22663d0;
        C16372c3 c16372c4;
        if (abstractC32269c instanceof C16438p2) {
            c16438p2 = (C16438p2) abstractC32269c;
            int i13 = c16438p2.f63169z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16438p2.f63169z = i13 - Integer.MIN_VALUE;
            } else {
                c16438p2 = new C16438p2(abstractC32269c);
            }
        } else {
            c16438p2 = new C16438p2(abstractC32269c);
        }
        Object obj = c16438p2.f63168y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16438p2.f63169z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c22663d0 = new C22663d0();
            EnumC13840z0 enumC13840z0 = EnumC13840z0.f49374w;
            C13774c c13774c = new C13774c(c16372c3, j7, c22663d0, (InterfaceC30057d) null, 3);
            c16438p2.f63166w = c16372c3;
            c16438p2.f63167x = c22663d0;
            c16438p2.f63169z = 1;
            if (c16372c3.m46573f(enumC13840z0, c13774c, c16438p2) == enumC31071a) {
                return enumC31071a;
            }
            c16372c4 = c16372c3;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C22663d0 c22663d1 = c16438p2.f63167x;
            C16372c3 c16372c5 = c16438p2.f63166w;
            AbstractC34132o.m107864I(obj);
            c22663d0 = c22663d1;
            c16372c4 = c16372c5;
        }
        return new C16617b(c16372c4.m46575h(c22663d0.f89331w));
    }

    /* JADX INFO: renamed from: b */
    public static Modifier m3374b(Modifier modifier, InterfaceC16478x2 interfaceC16478x2, EnumC16377d2 enumC16377d2, boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, int i13) {
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        boolean z14 = z4;
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        boolean z15 = z13;
        if ((i13 & 32) != 0) {
            interfaceC21083i = null;
        }
        return modifier.mo3471e(new ScrollableElement(interfaceC16478x2, enumC16377d2, z14, z15, interfaceC21083i));
    }
}
