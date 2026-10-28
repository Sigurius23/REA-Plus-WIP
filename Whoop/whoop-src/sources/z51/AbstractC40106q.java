package z51;

import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: z51.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"", "Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "a", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40106q {
    /* JADX INFO: renamed from: a */
    public static final List<C23454a0> m128652a(Composer composer, int i13) {
        AbstractC40104o.m128646k(EnumC40108s.RECOVERY_LOW, 0.25f, AbstractC8693b.m21278l("25"), false, 0.0f, null, composer, 54, 56);
        AbstractC40104o.m128646k(EnumC40108s.RECOVERY_MEDIUM, 0.5f, AbstractC8693b.m21278l("50"), false, 0.0f, null, composer, 54, 56);
        AbstractC40104o.m128646k(EnumC40108s.RECOVERY_HIGH, 0.75f, AbstractC8693b.m21278l("75"), false, 0.0f, null, composer, 54, 56);
        AbstractC40104o.m128646k(EnumC40108s.CALIBRATING, 0.75f, AbstractC8693b.m21278l("75"), false, 0.0f, null, composer, 54, 56);
        C23454a0 c23454a0 = C23454a0.f92919a;
        return AbstractC37056f.m118959K(c23454a0, c23454a0, c23454a0, c23454a0);
    }

    /* JADX INFO: renamed from: b */
    public static final List<C23454a0> m128653b(Composer composer, int i13) {
        EnumC40108s enumC40108s = EnumC40108s.STRAIN;
        AbstractC40104o.m128646k(enumC40108s, 0.5f, AbstractC8693b.m21278l("17.6"), false, 0.0f, null, composer, 54, 56);
        AbstractC40104o.m128646k(enumC40108s, 0.5f, AbstractC8693b.m21278l("17.6"), true, 0.75f, null, composer, 27702, 32);
        C23454a0 c23454a0 = C23454a0.f92919a;
        return AbstractC37056f.m118959K(c23454a0, c23454a0);
    }
}
