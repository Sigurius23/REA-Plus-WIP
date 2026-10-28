package j01;

import androidx.compose.runtime.Composer;
import c41.AbstractC4125u0;
import c41.C4118t0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import java.util.List;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: j01.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lj01/d;", "a", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21126c {
    /* JADX INFO: renamed from: a */
    public static final List<C21127d> m58949a(Composer composer, int i13) {
        C38072d c38072d = C38072d.f163053a;
        int strap = c38072d.m121951d().getStrap().getStrap();
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        return AbstractC37056f.m118959K(new C21127d("SLEEP PLANNER", "11:23pm", "BED TIME", "8:45h", "TIME IN BED", "8:00am", "WAKETIME", new C4118t0(null, null, new AbstractC4125u0.e(strap, enumC39333f, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("8:00am"), AbstractC8693b.m21278l("PLAN YOUR\nBEDTIME")), null, 11, null), null), new C21127d("SLEEP PLANNER", "11:23pm", "BED TIME", "8:45h", "TIME IN BED", "8:00am", "WAKETIME", new C4118t0(null, null, new AbstractC4125u0.e(c38072d.m121951d().getStrap().getStrap(), enumC39333f, AbstractC8693b.m21278l("ALARM ON"), AbstractC8693b.m21278l("8:00am"), AbstractC8693b.m21278l("PLAN YOUR\nBEDTIME")), null, 11, null), new C9598e(AppScreen.C9373n5.f27805w, NavigationScreenModel.None.INSTANCE, null, 4, null)));
    }
}
