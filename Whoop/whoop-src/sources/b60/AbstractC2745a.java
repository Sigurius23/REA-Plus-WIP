package b60;

import c60.C4268a;
import c60.C4271d;
import com.whoop.access.programgoaltile.models.ProgramGoalStatModel;
import com.whoop.access.programgoaltile.models.ProgramGoalTileModel;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b60.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;", "Lc60/d;", "a", "(Lcom/whoop/access/programgoaltile/models/ProgramGoalTileModel;)Lc60/d;", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2745a {
    /* JADX INFO: renamed from: a */
    public static final C4271d m7763a(ProgramGoalTileModel programGoalTileModel) {
        AbstractC22676k.m65750j(programGoalTileModel, "<this>");
        String titleDisplay = programGoalTileModel.getTitleDisplay();
        String subtitleDisplay = programGoalTileModel.getSubtitleDisplay();
        List<ProgramGoalStatModel> stats = programGoalTileModel.getStats();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(stats, 10));
        for (ProgramGoalStatModel programGoalStatModel : stats) {
            arrayList.add(new C4268a(programGoalStatModel.getLabel(), programGoalStatModel.getValue(), programGoalStatModel.getUnit()));
        }
        return new C4271d(titleDisplay, subtitleDisplay, arrayList, programGoalTileModel.getCaptionDisplay());
    }
}
