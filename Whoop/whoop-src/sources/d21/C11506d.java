package d21;

import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import eu2.AbstractC13658o;
import fu2.C14789d;
import g21.AbstractC15280b;
import ih0.AbstractC18502l;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import v90.AbstractC35814f;
import v90.AbstractC35825q;

/* JADX INFO: renamed from: d21.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11506d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37015w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f37016x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f37017y;

    public /* synthetic */ C11506d(Function1 function1, int i13, int i14) {
        this.f37015w = i14;
        this.f37016x = function1;
        this.f37017y = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37015w) {
            case 0:
                return AbstractC11508f.m30954f(this.f37016x, this.f37017y, (String) obj);
            case 1:
                return AbstractC11508f.m30955g(this.f37016x, this.f37017y, (String) obj);
            case 2:
                return AbstractC13658o.m38520j(this.f37016x, this.f37017y, obj);
            case 3:
                return C14789d.m42481I(this.f37016x, this.f37017y, (WorkoutExercise) obj);
            case 4:
                return C14789d.m42473A(this.f37016x, this.f37017y, (WorkoutGroup) obj);
            case 5:
                return AbstractC15280b.m43376f(this.f37016x, this.f37017y, ((Boolean) obj).booleanValue());
            case 6:
                return AbstractC18502l.m53574U(this.f37016x, this.f37017y, (C29891y) obj);
            case 7:
                return AbstractC18502l.m53578Y(this.f37016x, this.f37017y, (C29891y) obj);
            case 8:
                return AbstractC35814f.m113561s(this.f37016x, this.f37017y, ((Boolean) obj).booleanValue());
            default:
                return AbstractC35825q.m113656q(this.f37016x, this.f37017y, ((Boolean) obj).booleanValue());
        }
    }
}
