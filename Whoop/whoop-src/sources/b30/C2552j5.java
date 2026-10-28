package b30;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.AbstractC15376j4;
import g40.AbstractC15416r3;
import g40.C15341e;
import g40.InterfaceC15391m3;
import h00.C16523q0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import m83.C25235a0;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p164g2.C15247s;
import p390p1.C28635l;
import p390p1.C28655q;
import p547v8.AbstractC35785b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import x30.C37884e0;
import x30.C37887f0;
import x30.C37901k;

/* JADX INFO: renamed from: b30.j5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2552j5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9916w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f9917x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f9918y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f9919z;

    public C2552j5(InterfaceC4339a interfaceC4339a, String str, boolean z4) {
        this.f9916w = 6;
        this.f9918y = interfaceC4339a;
        this.f9919z = str;
        this.f9917x = z4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ff  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C37887f0 c37887f0;
        int i13;
        IdentifierSpec identifierSpec;
        int i14;
        C37901k c37901k;
        int i15;
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        switch (this.f9916w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        c37887f0 = (C37887f0) this.f9918y;
                        C37884e0 c37884e0 = c37887f0.f162235c;
                        boolean z4 = !this.f9917x;
                        Modifier modifier = AbstractC1126a.m3483b(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), (C15247s) this.f9919z);
                        int i16 = (IdentifierSpec.$stable << 9) | 289856;
                        c37884e0.getClass();
                        AbstractC22676k.m65750j(modifier, "modifier");
                        C28655q c28655q3 = (C28655q) composer;
                        c28655q3.m87150e0(-441413865);
                        if (AbstractC22676k.m65745e(null, c37887f0.mo43531a())) {
                            i13 = 7;
                        } else {
                            i13 = 6;
                        }
                        int i17 = (i16 >> 15) & 14;
                        int i18 = i16 << 3;
                        AbstractC15376j4.m43587c(c37884e0, z4, i13, modifier, null, 0, 0, null, false, false, c28655q3, i17 | (i18 & 112) | (i18 & 7168), MessageListItemViewType.GIPHY);
                        c28655q3.m87173q(false);
                    }
                } else {
                    c37887f0 = (C37887f0) this.f9918y;
                    C37884e0 c37884e1 = c37887f0.f162235c;
                    boolean z13 = !this.f9917x;
                    Modifier modifier2 = AbstractC1126a.m3483b(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), (C15247s) this.f9919z);
                    int i19 = (IdentifierSpec.$stable << 9) | 289856;
                    c37884e1.getClass();
                    AbstractC22676k.m65750j(modifier2, "modifier");
                    C28655q c28655q4 = (C28655q) composer;
                    c28655q4.m87150e0(-441413865);
                    if (AbstractC22676k.m65745e(null, c37887f0.mo43531a())) {
                        i13 = 7;
                    } else {
                        i13 = 6;
                    }
                    int i110 = (i19 >> 15) & 14;
                    int i111 = i19 << 3;
                    AbstractC15376j4.m43587c(c37884e1, z13, i13, modifier2, null, 0, 0, null, false, false, c28655q4, i110 | (i111 & 112) | (i111 & 7168), MessageListItemViewType.GIPHY);
                    c28655q4.m87173q(false);
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q5 = (C28655q) composer2;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        AbstractC15376j4.m43586b((AbstractC15416r3) this.f9918y, this.f9917x, (Function1) this.f9919z, composer2, 0);
                    }
                } else {
                    AbstractC15376j4.m43586b((AbstractC15416r3) this.f9918y, this.f9917x, (Function1) this.f9919z, composer2, 0);
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q6 = (C28655q) composer3;
                    if (c28655q6.m87121F()) {
                        c28655q6.m87138X();
                    } else {
                        ((C37816b) this.f9918y).invoke(Boolean.valueOf(this.f9917x), (InterfaceC4339a) this.f9919z, composer3, 0);
                    }
                } else {
                    ((C37816b) this.f9918y).invoke(Boolean.valueOf(this.f9917x), (InterfaceC4339a) this.f9919z, composer3, 0);
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q7 = (C28655q) composer4;
                    if (c28655q7.m87121F()) {
                        c28655q7.m87138X();
                    } else {
                        AbstractC35785b.m113406b(this.f9917x, (C15341e) this.f9918y, C25235a0.f99113w, (IdentifierSpec) this.f9919z, null, composer4, 448 | (IdentifierSpec.$stable << 9), 16);
                    }
                } else {
                    AbstractC35785b.m113406b(this.f9917x, (C15341e) this.f9918y, C25235a0.f99113w, (IdentifierSpec) this.f9919z, null, composer4, 448 | (IdentifierSpec.$stable << 9), 16);
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q8 = (C28655q) composer5;
                    if (c28655q8.m87121F()) {
                        c28655q8.m87138X();
                    } else {
                        InterfaceC15391m3 interfaceC15391m3 = (InterfaceC15391m3) this.f9918y;
                        identifierSpec = (IdentifierSpec) this.f9919z;
                        IdentifierSpec.Companion.getClass();
                        if (AbstractC22676k.m65745e(identifierSpec, IdentifierSpec.Email)) {
                            i14 = 7;
                        } else {
                            i14 = 6;
                        }
                        AbstractC15376j4.m43587c(interfaceC15391m3, this.f9917x, i14, null, null, 0, 0, null, false, false, composer5, 0, MessageListItemViewType.UNREAD_SEPARATOR);
                    }
                } else {
                    InterfaceC15391m3 interfaceC15391m4 = (InterfaceC15391m3) this.f9918y;
                    identifierSpec = (IdentifierSpec) this.f9919z;
                    IdentifierSpec.Companion.getClass();
                    if (AbstractC22676k.m65745e(identifierSpec, IdentifierSpec.Email)) {
                        i14 = 7;
                    } else {
                        i14 = 6;
                    }
                    AbstractC15376j4.m43587c(interfaceC15391m4, this.f9917x, i14, null, null, 0, 0, null, false, false, composer5, 0, MessageListItemViewType.UNREAD_SEPARATOR);
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q9 = (C28655q) composer6;
                    if (c28655q9.m87121F()) {
                        c28655q9.m87138X();
                    } else {
                        c37901k = (C37901k) this.f9918y;
                        InterfaceC15391m3 interfaceC15391m5 = c37901k.f162282c.f57610c;
                        if (AbstractC22676k.m65745e((IdentifierSpec) this.f9919z, c37901k.f162280a)) {
                            i15 = 7;
                        } else {
                            i15 = 6;
                        }
                        AbstractC15376j4.m43587c(interfaceC15391m5, this.f9917x, i15, null, null, 0, 0, null, false, false, composer6, 0, MessageListItemViewType.UNREAD_SEPARATOR);
                    }
                } else {
                    c37901k = (C37901k) this.f9918y;
                    InterfaceC15391m3 interfaceC15391m6 = c37901k.f162282c.f57610c;
                    if (AbstractC22676k.m65745e((IdentifierSpec) this.f9919z, c37901k.f162280a)) {
                        i15 = 7;
                    } else {
                        i15 = 6;
                    }
                    AbstractC15376j4.m43587c(interfaceC15391m6, this.f9917x, i15, null, null, 0, 0, null, false, false, composer6, 0, MessageListItemViewType.UNREAD_SEPARATOR);
                }
                break;
            default:
                Composer composer7 = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f9918y;
                if ((iIntValue & 3) == 2) {
                    C28655q c28655q10 = (C28655q) composer7;
                    if (c28655q10.m87121F()) {
                        c28655q10.m87138X();
                    } else {
                        Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "simple_dialog_confirm_button");
                        c28655q = (C28655q) composer7;
                        c28655q.m87150e0(-1803938456);
                        zM87153g = c28655q.m87153g(interfaceC4339a);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == C28635l.f115821a) {
                            objM87133R = new C31918g(interfaceC4339a, 27);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        AbstractC12350b.m34583d((InterfaceC4339a) objM87133R, modifierM3599a, false, null, null, null, null, AbstractC37817c.m121344e(1995969808, c28655q, new C16523q0((String) this.f9919z, this.f9917x, 2)), c28655q, 805306416, 508);
                    }
                } else {
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "simple_dialog_confirm_button");
                    c28655q = (C28655q) composer7;
                    c28655q.m87150e0(-1803938456);
                    zM87153g = c28655q.m87153g(interfaceC4339a);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = new C31918g(interfaceC4339a, 27);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C31918g(interfaceC4339a, 27);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC12350b.m34583d((InterfaceC4339a) objM87133R, modifierM3599a2, false, null, null, null, null, AbstractC37817c.m121344e(1995969808, c28655q, new C16523q0((String) this.f9919z, this.f9917x, 2)), c28655q, 805306416, 508);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2552j5(Object obj, boolean z4, Object obj2, int i13) {
        this.f9916w = i13;
        this.f9918y = obj;
        this.f9917x = z4;
        this.f9919z = obj2;
    }

    public C2552j5(boolean z4, C15341e c15341e, IdentifierSpec identifierSpec) {
        this.f9916w = 3;
        this.f9917x = z4;
        this.f9918y = c15341e;
        this.f9919z = identifierSpec;
    }
}
