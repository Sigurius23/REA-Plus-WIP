package si0;

import com.whoop.design.models.items.FooterModel;
import java.util.Map;
import jb1.C21535a;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ri0.C31442a;

/* JADX INFO: renamed from: si0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/FooterModel;", "", "", "", "accumulatedState", "Ljb1/a;", "reducer", "Lri0/a;", "a", "(Lcom/whoop/design/models/items/FooterModel;Ljava/util/Map;Ljb1/a;)Lri0/a;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32538d {
    /* JADX INFO: renamed from: a */
    public static final C31442a m101552a(FooterModel footerModel, Map<String, ? extends Object> accumulatedState, C21535a reducer) {
        AbstractC22676k.m65750j(footerModel, "<this>");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(reducer, "reducer");
        return new C31442a(!footerModel.getItems().isEmpty() ? reducer.m60543j(footerModel.getItems(), accumulatedState) : C25271y.f99162w);
    }
}
