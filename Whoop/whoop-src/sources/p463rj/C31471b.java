package p463rj;

import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyResponseMultiSelect;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C31471b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f129674E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ SurveyListBlock f129675F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List f129676w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f129677x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f129678y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C31485p f129679z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31471b(List list, int i13, List list2, C31485p c31485p, Function1 function1, SurveyListBlock surveyListBlock) {
        super(1);
        this.f129676w = list;
        this.f129677x = i13;
        this.f129678y = list2;
        this.f129679z = c31485p;
        this.f129674E = function1;
        this.f129675F = surveyListBlock;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayListM74124b1;
        ArrayList arrayListM74124b2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i13 = this.f129677x;
        List list = this.f129676w;
        if (zBooleanValue) {
            arrayListM74124b1 = AbstractC25265s.m74128f1(Integer.valueOf(i13), list);
        } else {
            arrayListM74124b1 = AbstractC25265s.m74124b1(list, Integer.valueOf(i13));
        }
        ArrayList arrayList = arrayListM74124b1;
        C31485p c31485p = this.f129679z;
        List list2 = this.f129678y;
        if (zBooleanValue) {
            arrayListM74124b2 = AbstractC25265s.m74128f1(c31485p.f129728a, list2);
        } else {
            arrayListM74124b2 = AbstractC25265s.m74124b1(list2, c31485p.f129728a);
        }
        this.f129674E.invoke(new SurveyResponseMultiSelect(this.f129675F.getUuid(), arrayList, arrayListM74124b2, null, 8, null));
        return C23454a0.f92919a;
    }
}
