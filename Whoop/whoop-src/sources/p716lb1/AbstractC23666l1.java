package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ExerciseRecordHeaderModel;
import com.whoop.design.models.items.ExerciseRecordMetricModel;
import gz0.EnumC16313m0;
import l83.C23454a0;
import n11.C26162b;
import n11.C26163c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.l1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;", "Ln11/b;", "f", "(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "exerciseRecordHeaderMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23666l1 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93846a = Function1.m68251a(new C23617e1(7));

    /* JADX INFO: renamed from: lb1.l1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93847w;

        public a(Function1 function1) {
            this.f93847w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93847w.invoke((ExerciseRecordHeaderModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69018c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExerciseRecordHeaderModel.class), new a(new C23617e1(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C26162b m69019d(ExerciseRecordHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69021f(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69020e() {
        return f93846a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX INFO: renamed from: f */
    public static final C26162b m69021f(ExerciseRecordHeaderModel exerciseRecordHeaderModel) {
        Integer numValueOf;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(exerciseRecordHeaderModel, "<this>");
        String achievementIcon = exerciseRecordHeaderModel.getAchievementIcon();
        if (achievementIcon != null) {
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), achievementIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                numValueOf = Integer.valueOf(enumC16313m0.toWhoopIcon());
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        C26163c c26163c = new C26163c(exerciseRecordHeaderModel.getRecordTitle().getValue(), exerciseRecordHeaderModel.getRecordTitle().getUnit());
        ExerciseRecordMetricModel recordSubtitle = exerciseRecordHeaderModel.getRecordSubtitle();
        return new C26162b(numValueOf, c26163c, recordSubtitle != null ? new C26163c(recordSubtitle.getValue(), recordSubtitle.getUnit()) : null, exerciseRecordHeaderModel.getRecordDate());
    }
}
