package i20;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m03.AbstractC24888d;
import mk1.AbstractC25631c;
import mk1.C25633e;
import p292l1.C23067b0;
import p390p1.AbstractC28683x;
import p395p6.InterfaceC28923u1;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import w11.AbstractC36695b;
import w11.C36696c;

/* JADX INFO: renamed from: i20.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17956k0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f69761E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69762w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f69763x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f69764y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f69765z;

    public /* synthetic */ C17956k0(int i13, String str, long j7, String str2) {
        this.f69762w = 2;
        this.f69765z = str;
        this.f69761E = str2;
        this.f69764y = j7;
        this.f69763x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f69762w;
        int i14 = this.f69763x;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f69761E;
        Object obj4 = this.f69765z;
        switch (i13) {
            case 0:
                C37816b c37816b = AbstractC17986x0.f69826a;
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(i14 | 1);
                AbstractC17960l1.m51579f((C17982v0) obj4, (Integer) obj3, this.f69764y, (Composer) obj, iM87244L);
                return c23454a0;
            case 1:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(3121);
                ((C23067b0) obj4).m67044b(this.f69764y, (Modifier) obj3, this.f69763x, (Composer) obj, iM87244L2);
                return c23454a0;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC24888d.m72986e((String) obj4, (String) obj3, this.f69764y, this.f69763x, (Composer) obj, iIntValue);
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC25631c.m75418n(this.f69764y, (C25633e) obj4, (Function1) obj3, this.f69763x, (Composer) obj, iIntValue2);
            case 4:
                InterfaceC28923u1 interfaceC28923u1 = (InterfaceC28923u1) obj4;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) obj3;
                ((Integer) obj2).getClass();
                AbstractC5583n.m16777f(AbstractC28683x.m87244L(i14 | 1), this.f69764y, (Composer) obj, interfaceC4351m, interfaceC28923u1);
                return c23454a0;
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC36695b.m117789z(this.f69764y, (C36696c) obj4, (Function1) obj3, this.f69763x, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C17956k0(long j7, Object obj, InterfaceC23459e interfaceC23459e, int i13, int i14) {
        this.f69762w = i14;
        this.f69764y = j7;
        this.f69765z = obj;
        this.f69761E = interfaceC23459e;
        this.f69763x = i13;
    }

    public /* synthetic */ C17956k0(C17982v0 c17982v0, Integer num, long j7, int i13) {
        this.f69762w = 0;
        C37816b c37816b = AbstractC17986x0.f69826a;
        this.f69765z = c17982v0;
        this.f69761E = num;
        this.f69764y = j7;
        this.f69763x = i13;
    }

    public /* synthetic */ C17956k0(C23067b0 c23067b0, int i13, Modifier modifier, long j7, int i14) {
        this.f69762w = 1;
        this.f69765z = c23067b0;
        this.f69763x = i13;
        this.f69761E = modifier;
        this.f69764y = j7;
    }
}
