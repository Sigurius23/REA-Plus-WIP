package h00;

import a23.C0175b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.android.R;
import g00.AbstractC14936g;
import g00.C14931b;
import g00.C14934e;
import l83.C23454a0;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.AbstractC15067l1;
import p163g1.C14970c1;
import p163g1.C15033h9;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p291l0.InterfaceC22997s1;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: h00.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16523q0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63521w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f63522x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f63523y;

    public /* synthetic */ C16523q0(String str, boolean z4, int i13) {
        this.f63521w = i13;
        this.f63523y = str;
        this.f63522x = z4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    /* JADX WARN: Code duplicated, block: B:36:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x0162  */
    /* JADX WARN: Code duplicated, block: B:48:0x0180  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28655q c28655q;
        long j7;
        float f13;
        C28655q c28655q2;
        long jM43088c;
        switch (this.f63521w) {
            case 0:
                InterfaceC22997s1 TextButton = (InterfaceC22997s1) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q3 = (C28655q) composer;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        c28655q = (C28655q) composer;
                        c28655q.m87150e0(-443512897);
                        C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                        c28655q.m87173q(false);
                        long j13 = c14931b.f55678q;
                        if (this.f63522x) {
                            c28655q.m87150e0(1561607408);
                            long j14 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            f13 = (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j14)) >= 0.5d : ((double) AbstractC17918w0.m51536x(j14)) <= 0.5d) ? 0.87f : 1.0f;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1561608148);
                            j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                            if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                                AbstractC17918w0.m51536x(j7);
                            } else {
                                AbstractC17918w0.m51536x(j7);
                            }
                            c28655q.m87173q(false);
                            f13 = 0.38f;
                        }
                        long jM51541c = C17919x.m51541c(f13, j13);
                        c28655q.m87150e0(-1418551394);
                        C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
                        c28655q.m87173q(false);
                        AbstractC15011f9.m43114b(this.f63523y, null, jM51541c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c14934e.f55696c, composer, 0, 0, 65530);
                    }
                } else {
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b2 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    long j15 = c14931b2.f55678q;
                    if (this.f63522x) {
                        c28655q.m87150e0(1561607408);
                        long j16 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                        }
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1561608148);
                        j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                            AbstractC17918w0.m51536x(j7);
                        } else {
                            AbstractC17918w0.m51536x(j7);
                        }
                        c28655q.m87173q(false);
                        f13 = 0.38f;
                    }
                    long jM51541c2 = C17919x.m51541c(f13, j15);
                    c28655q.m87150e0(-1418551394);
                    C14934e c14934e2 = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
                    c28655q.m87173q(false);
                    AbstractC15011f9.m43114b(this.f63523y, null, jM51541c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c14934e2.f55696c, composer, 0, 0, 65530);
                }
                return C23454a0.f92919a;
            case 1:
                Modifier composed = (Modifier) obj;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(composed, "$this$composed");
                C28655q c28655q4 = (C28655q) ((Composer) obj2);
                c28655q4.m87150e0(1787698759);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q4, R.string.default_error_message);
                if (this.f63522x) {
                    c28655q4.m87150e0(-1347526150);
                    String str = this.f63523y;
                    boolean zM87153g = c28655q4.m87153g(str) | c28655q4.m87153g(strM92103Y);
                    Object objM87133R = c28655q4.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new C0175b(str, strM92103Y, 3);
                        c28655q4.m87172p0(objM87133R);
                    }
                    c28655q4.m87173q(false);
                    composed = AbstractC18032n.m51775c(composed, false, (Function1) objM87133R);
                }
                c28655q4.m87173q(false);
                return composed;
            default:
                InterfaceC22997s1 TextButton2 = (InterfaceC22997s1) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TextButton2, "$this$TextButton");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q5 = (C28655q) composer2;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        c28655q2 = (C28655q) composer2;
                        c28655q2.m87150e0(399781910);
                        if (this.f63522x) {
                            jM43088c = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43088c();
                        } else {
                            jM43088c = C17919x.f69637n;
                        }
                        long j17 = jM43088c;
                        c28655q2.m87173q(false);
                        AbstractC15011f9.m43114b(this.f63523y, null, j17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56282i, c28655q2, 0, 0, 65530);
                    }
                } else {
                    c28655q2 = (C28655q) composer2;
                    c28655q2.m87150e0(399781910);
                    if (this.f63522x) {
                        jM43088c = ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43088c();
                    } else {
                        jM43088c = C17919x.f69637n;
                    }
                    long j18 = jM43088c;
                    c28655q2.m87173q(false);
                    AbstractC15011f9.m43114b(this.f63523y, null, j18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56282i, c28655q2, 0, 0, 65530);
                }
                return C23454a0.f92919a;
        }
    }

    public C16523q0(boolean z4, String str) {
        this.f63521w = 1;
        this.f63522x = z4;
        this.f63523y = str;
    }
}
