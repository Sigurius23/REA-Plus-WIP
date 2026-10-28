package wv2;

import b91.AbstractC2890e;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.LinkedExercise;
import com.whoop.weightlifting.feature.builder.details.ExerciseInstructionsCustomExerciseInfo;
import com.whoop.weightlifting.feature.builder.details.ExerciseInstructionsModel;
import com.whoop.weightlifting.feature.exerciserecords.domain.models.ArchMiniExerciseRecords;
import cu2.AbstractC11128h;
import e31.C12612d;
import ff1.AbstractC14427a;
import gu2.C16214a;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import nv2.C27177c;
import nv2.InterfaceC27175a;
import o11.AbstractC27407m;
import ov2.C28401e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r32.AbstractC30912a;
import uu2.C35254h0;
import wo1.C37445e0;

/* JADX INFO: renamed from: wv2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Ljb1/a;", "a", "Ljb1/a;", "e", "()Ljb1/a;", "miniArchModelReducer", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37652a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f161359a = AbstractC21537c.m60554d(new C37445e0(23));

    /* JADX INFO: renamed from: wv2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f161360w;

        public a(Function1 function1) {
            this.f161360w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f161360w.invoke((ExerciseInstructionsModel) it);
        }
    }

    /* JADX INFO: renamed from: wv2.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f161361w;

        public b(Function1 function1) {
            this.f161361w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f161361w.invoke((ArchMiniExerciseRecords) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C21535a m121041e() {
        return f161359a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m121042f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C37445e0(24));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m121043g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C37445e0 c37445e0 = new C37445e0(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ExerciseInstructionsModel.class), new a(c37445e0));
        AbstractC14427a.m41140b(addModelMapper);
        AbstractC30912a.m95039b(addModelMapper);
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArchMiniExerciseRecords.class), new b(new C37445e0(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C35254h0 m121044h(ExerciseInstructionsModel model) {
        LinkedExercise linkedExercise;
        TextResource textResourceM21277k;
        AbstractC22676k.m65750j(model, "model");
        String exerciseId = model.getExerciseId();
        String equipmentBody = model.getEquipmentBody();
        String name = model.getName();
        String imageUrl = model.getImageUrl();
        AbstractC27407m.c.a aVar = null;
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        String videoUrl = model.getVideoUrl();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getInstructions());
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        C16214a c16214a = new C16214a(textResourceM21278l, enumC39333f, AbstractC2890e.m8450e().getB1());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getEquipmentTitle());
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
        C16214a c16214a2 = new C16214a(textResourceM21278l2, enumC39333f2, AbstractC2890e.m8450e().getB1());
        String equipmentBody2 = model.getEquipmentBody();
        if (equipmentBody2 == null) {
            equipmentBody2 = "";
        }
        C16214a c16214a3 = new C16214a(AbstractC8693b.m21278l(equipmentBody2), enumC39333f, AbstractC2890e.m8450e().getB1());
        C16214a c16214a4 = new C16214a(AbstractC8693b.m21278l(model.getMuscleGroupsTitle()), enumC39333f2, AbstractC2890e.m8450e().getB1());
        String muscleGroupsBody = model.getMuscleGroupsBody();
        C16214a c16214a5 = new C16214a(AbstractC8693b.m21278l(muscleGroupsBody != null ? muscleGroupsBody : ""), enumC39333f, AbstractC2890e.m8450e().getB1());
        ExerciseInstructionsCustomExerciseInfo customExerciseInfo = model.getCustomExerciseInfo();
        C16214a c16214a6 = (customExerciseInfo == null || customExerciseInfo.getLinkedExercise() == null) ? null : new C16214a(AbstractC8693b.m21278l(model.getCustomExerciseInfo().getCustomExerciseTitle()), enumC39333f2, AbstractC2890e.m8450e().getB1());
        ExerciseInstructionsCustomExerciseInfo customExerciseInfo2 = model.getCustomExerciseInfo();
        if (customExerciseInfo2 != null && (linkedExercise = customExerciseInfo2.getLinkedExercise()) != null) {
            String exerciseId2 = linkedExercise.getExerciseId();
            String name2 = linkedExercise.getName();
            if (name2 == null || (textResourceM21277k = AbstractC8693b.m21278l(name2)) == null) {
                textResourceM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35476i1);
            }
            TextResource textResource = textResourceM21277k;
            C23454a0 c23454a0 = C23454a0.f92919a;
            aVar = new AbstractC27407m.c.a(exerciseId2, textResource, linkedExercise.getImageUrl(), null, c23454a0, c23454a0, null, false, 72, null);
        }
        return new C35254h0(null, exerciseId, equipmentBody, name, cVar, videoUrl, c16214a, c16214a2, c16214a3, c16214a4, c16214a5, c16214a6, aVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final C28401e m121045i(ArchMiniExerciseRecords model) {
        AbstractC22676k.m65750j(model, "model");
        InterfaceC27175a interfaceC27175a = null;
        InterfaceC27175a interfaceC27175a2 = null;
        return new C28401e(new C27177c(new C27177c.a(C12612d.f43056a.m35366a(), interfaceC27175a, interfaceC27175a2, 6, null), null, 0 == true ? 1 : 0, 6, null), model.resolvedPath(), model.resolvedExpansionAnalyticsAction());
    }
}
