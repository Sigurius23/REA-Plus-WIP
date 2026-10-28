package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ExerciseBreakdownCell;
import com.whoop.design.models.items.ExerciseBreakdownModel;
import com.whoop.design.models.items.ExerciseBreakdownRow;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m11.C24929a;
import m11.C24932d;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.k1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/ExerciseBreakdownModel;", "Lm11/d;", "f", "(Lcom/whoop/design/models/items/ExerciseBreakdownModel;)Lm11/d;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "exerciseBreakdownMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23659k1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93833a = Function1.m68251a(new C23617e1(5));

    /* JADX INFO: renamed from: lb1.k1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93834w;

        public a(Function1 function1) {
            this.f93834w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93834w.invoke((ExerciseBreakdownModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68968c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExerciseBreakdownModel.class), new a(new C23617e1(6)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C24932d m68969d(ExerciseBreakdownModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68971f(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68970e() {
        return f93833a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX INFO: renamed from: f */
    private static final C24932d m68971f(ExerciseBreakdownModel exerciseBreakdownModel) {
        Integer numValueOf;
        EnumC16313m0 enumC16313m0;
        int numberOfColumns = exerciseBreakdownModel.getNumberOfColumns();
        if (numberOfColumns < 0) {
            numberOfColumns = 0;
        }
        List<String> tableTitles = exerciseBreakdownModel.getTableTitles();
        List<ExerciseBreakdownRow> rows = exerciseBreakdownModel.getRows();
        int i13 = 10;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(rows, 10));
        Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            List<ExerciseBreakdownCell> listM74156w1 = AbstractC25265s.m74156w1(((ExerciseBreakdownRow) it.next()).getItems(), numberOfColumns);
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74156w1, i13));
            for (ExerciseBreakdownCell exerciseBreakdownCell : listM74156w1) {
                String value = exerciseBreakdownCell.getValue();
                String units = exerciseBreakdownCell.getUnits();
                String achievementIcon = exerciseBreakdownCell.getAchievementIcon();
                EnumC39333f enumC39333f = null;
                if (achievementIcon != null) {
                    EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                    int length = enumC16313m0ArrValues.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            enumC16313m0 = null;
                            break;
                        }
                        enumC16313m0 = enumC16313m0ArrValues[i14];
                        if (AbstractC22676k.m65745e(enumC16313m0.name(), achievementIcon)) {
                            break;
                        }
                        i14++;
                    }
                    if (enumC16313m0 != null) {
                        numValueOf = Integer.valueOf(enumC16313m0.toWhoopIcon());
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                String valueStyle = exerciseBreakdownCell.getValueStyle();
                if (valueStyle != null) {
                    for (EnumC39333f enumC39333f2 : EnumC39333f.values()) {
                        if (AbstractC22676k.m65745e(enumC39333f2.name(), valueStyle)) {
                            enumC39333f = enumC39333f2;
                            break;
                        }
                    }
                }
                arrayList2.add(new C24929a(value, units, numValueOf, enumC39333f));
            }
            arrayList.add(arrayList2);
            i13 = 10;
        }
        return new C24932d(numberOfColumns, tableTitles, arrayList);
    }
}
