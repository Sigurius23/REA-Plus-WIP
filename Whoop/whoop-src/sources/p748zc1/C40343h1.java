package p748zc1;

import androidx.compose.runtime.Composer;
import com.whoop.design.models.items.IconSize;
import com.whoop.design.models.items.TagBackgroundStyle;
import com.whoop.design.models.items.TagModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import java.util.List;
import l83.C23454a0;
import p291l0.InterfaceC22996s0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23699q4;

/* JADX INFO: renamed from: zc1.h1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40343h1 {

    /* JADX INFO: renamed from: a */
    public static final C40343h1 f174272a = new C40343h1();

    /* JADX INFO: renamed from: b */
    private static Function3 f174273b = new C37816b(new C40518y0(16), false, 280877121);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m129849c(InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (TagBackgroundStyle tagBackgroundStyle : TagBackgroundStyle.getEntries()) {
                AbstractC17746g1.m50872h(AbstractC23699q4.m69314d(new TagModel((String) null, tagBackgroundStyle.name(), (String) null, tagBackgroundStyle, (String) null, (String) null, (C9598e) null, (Action) null, (String) null, (String) null, (List) null, (IconSize) null, (GenericInteraction) null, 8181, (DefaultConstructorMarker) null)), null, null, c28655q, C17750h1.f69012w, 6);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Function3 m129850b() {
        return f174273b;
    }
}
