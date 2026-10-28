package gf2;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.s */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC15810s extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final RadioButton f59678a;

    /* JADX INFO: renamed from: b */
    public final RadioButton f59679b;

    /* JADX INFO: renamed from: c */
    public final RadioButton f59680c;

    /* JADX INFO: renamed from: d */
    public final RadioButton f59681d;

    /* JADX INFO: renamed from: e */
    public final RadioButton f59682e;

    /* JADX INFO: renamed from: f */
    public final RadioButton f59683f;

    /* JADX INFO: renamed from: g */
    public final RadioButton f59684g;

    /* JADX INFO: renamed from: h */
    public final RadioGroup f59685h;

    /* JADX INFO: renamed from: i */
    protected int f59686i;

    /* JADX INFO: renamed from: j */
    protected int f59687j;

    /* JADX INFO: renamed from: k */
    protected String f59688k;

    public AbstractC15810s(Object obj, View view, int i13, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, RadioButton radioButton6, RadioButton radioButton7, RadioGroup radioGroup) {
        super(view, i13, obj);
        this.f59678a = radioButton;
        this.f59679b = radioButton2;
        this.f59680c = radioButton3;
        this.f59681d = radioButton4;
        this.f59682e = radioButton5;
        this.f59683f = radioButton6;
        this.f59684g = radioButton7;
        this.f59685h = radioGroup;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC15810s m44610c(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m44611d(view, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC15810s m44611d(View view, Object obj) {
        return (AbstractC15810s) AbstractC1168a0.bind(obj, view, AbstractC30313f.f124230r);
    }

    /* JADX INFO: renamed from: e */
    public int m44612e() {
        return this.f59686i;
    }

    /* JADX INFO: renamed from: f */
    public int m44613f() {
        return this.f59687j;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo44614g(int i13);

    /* JADX INFO: renamed from: h */
    public abstract void mo44615h(String str);

    /* JADX INFO: renamed from: i */
    public abstract void mo44616i(int i13);
}
