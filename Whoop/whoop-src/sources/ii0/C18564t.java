package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.p069ui.views.ColoredImageView;
import com.whoop.p069ui.views.WhoopScrollView;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.t */
/* JADX INFO: loaded from: classes7.dex */
public class C18564t extends AbstractC18563s {

    /* JADX INFO: renamed from: o1 */
    private static final C1191u f72509o1 = null;

    /* JADX INFO: renamed from: p1 */
    private static final SparseIntArray f72510p1;

    /* JADX INFO: renamed from: m1 */
    private final ConstraintLayout f72511m1;

    /* JADX INFO: renamed from: n1 */
    private long f72512n1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72510p1 = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66772k4, 1);
        sparseIntArray.put(AbstractC17307e.f66807p4, 2);
        sparseIntArray.put(AbstractC17307e.f66602K0, 3);
        sparseIntArray.put(AbstractC17307e.f66793n4, 4);
        sparseIntArray.put(AbstractC17307e.f66779l4, 5);
        sparseIntArray.put(AbstractC17307e.f66608L0, 6);
        sparseIntArray.put(AbstractC17307e.f66814q4, 7);
        sparseIntArray.put(AbstractC17307e.f66676W2, 8);
        sparseIntArray.put(AbstractC17307e.f66751h4, 9);
        sparseIntArray.put(AbstractC17307e.f66744g4, 10);
        sparseIntArray.put(AbstractC17307e.f66741g1, 11);
        sparseIntArray.put(AbstractC17307e.f66614M0, 12);
        sparseIntArray.put(AbstractC17307e.f66657T1, 13);
        sparseIntArray.put(AbstractC17307e.f66663U1, 14);
        sparseIntArray.put(AbstractC17307e.f66646R2, 15);
        sparseIntArray.put(AbstractC17307e.f66854w2, 16);
        sparseIntArray.put(AbstractC17307e.f66861x2, 17);
        sparseIntArray.put(AbstractC17307e.f66868y2, 18);
        sparseIntArray.put(AbstractC17307e.f66620N0, 19);
        sparseIntArray.put(AbstractC17307e.f66758i4, 20);
        sparseIntArray.put(AbstractC17307e.f66752h5, 21);
        sparseIntArray.put(AbstractC17307e.f66827s3, 22);
        sparseIntArray.put(AbstractC17307e.f66834t3, 23);
        sparseIntArray.put(AbstractC17307e.f66841u3, 24);
        sparseIntArray.put(AbstractC17307e.f66842u4, 25);
        sparseIntArray.put(AbstractC17307e.f66770k2, 26);
        sparseIntArray.put(AbstractC17307e.f66756i2, 27);
        sparseIntArray.put(AbstractC17307e.f66763j2, 28);
        sparseIntArray.put(AbstractC17307e.f66721d2, 29);
        sparseIntArray.put(AbstractC17307e.f66798o2, 30);
        sparseIntArray.put(AbstractC17307e.f66784m2, 31);
        sparseIntArray.put(AbstractC17307e.f66791n2, 32);
        sparseIntArray.put(AbstractC17307e.f66777l2, 33);
        sparseIntArray.put(AbstractC17307e.f66749h2, 34);
        sparseIntArray.put(AbstractC17307e.f66735f2, 35);
        sparseIntArray.put(AbstractC17307e.f66742g2, 36);
        sparseIntArray.put(AbstractC17307e.f66728e2, 37);
        sparseIntArray.put(AbstractC17307e.f66864x5, 38);
        sparseIntArray.put(AbstractC17307e.f66687Y1, 39);
        sparseIntArray.put(AbstractC17307e.f66675W1, 40);
        sparseIntArray.put(AbstractC17307e.f66681X1, 41);
        sparseIntArray.put(AbstractC17307e.f66669V1, 42);
        sparseIntArray.put(AbstractC17307e.f66700a2, 43);
        sparseIntArray.put(AbstractC17307e.f66693Z1, 44);
        sparseIntArray.put(AbstractC17307e.f66707b2, 45);
        sparseIntArray.put(AbstractC17307e.f66719d0, 46);
        sparseIntArray.put(AbstractC17307e.f66711c, 47);
        sparseIntArray.put(AbstractC17307e.f66750h3, 48);
        sparseIntArray.put(AbstractC17307e.f66736f3, 49);
        sparseIntArray.put(AbstractC17307e.f66743g3, 50);
        sparseIntArray.put(AbstractC17307e.f66757i3, 51);
        sparseIntArray.put(AbstractC17307e.f66771k3, 52);
        sparseIntArray.put(AbstractC17307e.f66764j3, 53);
        sparseIntArray.put(AbstractC17307e.f66778l3, 54);
        sparseIntArray.put(AbstractC17307e.f66690Y4, 55);
        sparseIntArray.put(AbstractC17307e.f66678W4, 56);
        sparseIntArray.put(AbstractC17307e.f66654S4, 57);
        sparseIntArray.put(AbstractC17307e.f66684X4, 58);
        sparseIntArray.put(AbstractC17307e.f66836t5, 59);
        sparseIntArray.put(AbstractC17307e.f66829s5, 60);
        sparseIntArray.put(AbstractC17307e.f66843u5, 61);
        sparseIntArray.put(AbstractC17307e.f66698a0, 62);
        sparseIntArray.put(AbstractC17307e.f66691Z, 63);
        sparseIntArray.put(AbstractC17307e.f66705b0, 64);
        sparseIntArray.put(AbstractC17307e.f66622N2, 65);
        sparseIntArray.put(AbstractC17307e.f66616M2, 66);
        sparseIntArray.put(AbstractC17307e.f66640Q2, 67);
        sparseIntArray.put(AbstractC17307e.f66580G2, 68);
        sparseIntArray.put(AbstractC17307e.f66574F2, 69);
        sparseIntArray.put(AbstractC17307e.f66786m4, 70);
        sparseIntArray.put(AbstractC17307e.f66551B4, 71);
        sparseIntArray.put(AbstractC17307e.f66544A4, 72);
        sparseIntArray.put(AbstractC17307e.f66558C4, 73);
        sparseIntArray.put(AbstractC17307e.f66604K2, 74);
        sparseIntArray.put(AbstractC17307e.f66598J2, 75);
        sparseIntArray.put(AbstractC17307e.f66806p3, 76);
        sparseIntArray.put(AbstractC17307e.f66799o3, 77);
        sparseIntArray.put(AbstractC17307e.f66813q3, 78);
        sparseIntArray.put(AbstractC17307e.f66664U2, 79);
        sparseIntArray.put(AbstractC17307e.f66658T2, 80);
        sparseIntArray.put(AbstractC17307e.f66670V2, 81);
        sparseIntArray.put(AbstractC17307e.f66560D0, 82);
        sparseIntArray.put(AbstractC17307e.f66554C0, 83);
        sparseIntArray.put(AbstractC17307e.f66566E0, 84);
        sparseIntArray.put(AbstractC17307e.f66578G0, 85);
        sparseIntArray.put(AbstractC17307e.f66572F0, 86);
        sparseIntArray.put(AbstractC17307e.f66584H0, 87);
        sparseIntArray.put(AbstractC17307e.f66708b3, 88);
        sparseIntArray.put(AbstractC17307e.f66846v1, 89);
        sparseIntArray.put(AbstractC17307e.f66543A3, 90);
        sparseIntArray.put(AbstractC17307e.f66876z3, 91);
        sparseIntArray.put(AbstractC17307e.f66801o5, 92);
        sparseIntArray.put(AbstractC17307e.f66794n5, 93);
        sparseIntArray.put(AbstractC17307e.f66808p5, 94);
        sparseIntArray.put(AbstractC17307e.f66863x4, 95);
        sparseIntArray.put(AbstractC17307e.f66860x1, 96);
        sparseIntArray.put(AbstractC17307e.f66853w1, 97);
        sparseIntArray.put(AbstractC17307e.f66724d5, 98);
        sparseIntArray.put(AbstractC17307e.f66552B5, 99);
        sparseIntArray.put(AbstractC17307e.f66545A5, 100);
        sparseIntArray.put(AbstractC17307e.f66871y5, 101);
        sparseIntArray.put(AbstractC17307e.f66878z5, 102);
        sparseIntArray.put(AbstractC17307e.f66549B2, 103);
        sparseIntArray.put(AbstractC17307e.f66542A2, 104);
        sparseIntArray.put(AbstractC17307e.f66857w5, 105);
        sparseIntArray.put(AbstractC17307e.f66715c3, 106);
        sparseIntArray.put(AbstractC17307e.f66766j5, 107);
        sparseIntArray.put(AbstractC17307e.f66759i5, 108);
        sparseIntArray.put(AbstractC17307e.f66704b, 109);
        sparseIntArray.put(AbstractC17307e.f66697a, 110);
        sparseIntArray.put(AbstractC17307e.f66569E3, 111);
        sparseIntArray.put(AbstractC17307e.f66563D3, 112);
        sparseIntArray.put(AbstractC17307e.f66800o4, 113);
        sparseIntArray.put(AbstractC17307e.f66737f4, 114);
        sparseIntArray.put(AbstractC17307e.f66821r4, 115);
        sparseIntArray.put(AbstractC17307e.f66765j4, 116);
    }

    public C18564t(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 117, f72509o1, f72510p1));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72512n1 = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72512n1 != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72512n1 = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        return false;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C18564t(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ColoredImageView) objArr[110], (ConstraintLayout) objArr[109], (TextView) objArr[47], (ColoredImageView) objArr[63], (ConstraintLayout) objArr[62], (TextView) objArr[64], (ComposeView) objArr[46], (ColoredImageView) objArr[83], (ConstraintLayout) objArr[82], (TextView) objArr[84], (ColoredImageView) objArr[86], (ConstraintLayout) objArr[85], (TextView) objArr[87], (ImageView) objArr[3], (FrameLayout) objArr[6], (Barrier) objArr[12], (Barrier) objArr[19], (StrokedPillButton) objArr[11], (ImageView) objArr[89], (ColoredImageView) objArr[97], (ConstraintLayout) objArr[96], (ConstraintLayout) objArr[13], (TextView) objArr[14], (TextView) objArr[42], (ColoredImageView) objArr[40], (TextView) objArr[41], (ConstraintLayout) objArr[39], (ConstraintLayout) objArr[44], (ConstraintLayout) objArr[43], (TextView) objArr[45], (TextView) objArr[29], (TextView) objArr[37], (ColoredImageView) objArr[35], (TextView) objArr[36], (ConstraintLayout) objArr[34], (ColoredImageView) objArr[27], (TextView) objArr[28], (ConstraintLayout) objArr[26], (TextView) objArr[33], (ColoredImageView) objArr[31], (TextView) objArr[32], (ConstraintLayout) objArr[30], (ColoredImageView) objArr[16], (TextView) objArr[17], (TextView) objArr[18], (ColoredImageView) objArr[104], (ConstraintLayout) objArr[103], (ColoredImageView) objArr[69], (ConstraintLayout) objArr[68], (ColoredImageView) objArr[75], (ConstraintLayout) objArr[74], (ColoredImageView) objArr[66], (ConstraintLayout) objArr[65], (TextView) objArr[67], (ConstraintLayout) objArr[15], (ColoredImageView) objArr[80], (ConstraintLayout) objArr[79], (TextView) objArr[81], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[88], (TextView) objArr[106], (ColoredImageView) objArr[49], (TextView) objArr[50], (ConstraintLayout) objArr[48], (TextView) objArr[51], (ConstraintLayout) objArr[53], (ConstraintLayout) objArr[52], (TextView) objArr[54], (ColoredImageView) objArr[77], (ConstraintLayout) objArr[76], (TextView) objArr[78], (ConstraintLayout) objArr[22], (ColoredImageView) objArr[23], (TextView) objArr[24], (ColoredImageView) objArr[91], (ConstraintLayout) objArr[90], (ColoredImageView) objArr[112], (ConstraintLayout) objArr[111], (TextView) objArr[114], (TextView) objArr[10], (TextView) objArr[9], (FrameLayout) objArr[20], (TextView) objArr[116], (ComposeView) objArr[1], (ConstraintLayout) objArr[5], (TextView) objArr[70], (WhoopScrollView) objArr[4], (StrokedPillButton) objArr[113], (ComposeView) objArr[2], (FrameLayout) objArr[7], (TextView) objArr[115], (TextView) objArr[25], (ComposeView) objArr[95], (ColoredImageView) objArr[72], (ConstraintLayout) objArr[71], (TextView) objArr[73], (ColoredImageView) objArr[57], (ConstraintLayout) objArr[56], (TextView) objArr[58], (ConstraintLayout) objArr[55], (TextView) objArr[98], (ConstraintLayout) objArr[21], (ColoredImageView) objArr[108], (ConstraintLayout) objArr[107], (ColoredImageView) objArr[93], (ConstraintLayout) objArr[92], (TextView) objArr[94], (ImageView) objArr[60], (ConstraintLayout) objArr[59], (TextView) objArr[61], (TextView) objArr[105], (ComposeView) objArr[38], (TextView) objArr[101], (TextView) objArr[102], (ColoredImageView) objArr[100], (ConstraintLayout) objArr[99]);
        this.f72512n1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72511m1 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
