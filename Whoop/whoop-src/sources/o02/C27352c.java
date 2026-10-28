package o02;

import com.whoop.navigation.NavigationScreenModel;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSConstantsKt;
import m83.C25272z;
import n83.C26460c;
import n83.C26463f;
import nm1.C26842g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: o02.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012(\b\u0002\u0010\t\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0010\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022&\u0010\t\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R4\u0010\t\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lo02/c;", "Lo02/d;", "", "mappers", "", "Lj93/d;", "Lkotlin/Function1;", "Lj02/c;", "Lcom/whoop/navigation/reducer/NavigationScreenConfig;", "configs", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "a", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;", "b", "(Ljava/util/List;Ljava/util/Map;)Lo02/d;", "Ljava/util/List;", "Ljava/util/Map;", "c", "Lkotlin/jvm/functions/Function1;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27352c implements InterfaceC27353d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC27353d> mappers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<InterfaceC21461d, Function1> configs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 default;

    /* JADX WARN: Multi-variable type inference failed */
    public C27352c(List<? extends InterfaceC27353d> mappers, Map<InterfaceC21461d, ? extends Function1> configs) {
        AbstractC22676k.m65750j(mappers, "mappers");
        AbstractC22676k.m65750j(configs, "configs");
        this.mappers = mappers;
        this.configs = configs;
        this.default = new C26842g(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC21134c m82529d(InterfaceC21134c it) {
        AbstractC22676k.m65750j(it, "it");
        return it;
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: a */
    public InterfaceC21134c mo67681a(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        Iterator<T> it = this.mappers.iterator();
        while (it.hasNext()) {
            InterfaceC21134c interfaceC21134cMo67681a = ((InterfaceC27353d) it.next()).mo67681a(navigationScreenModel);
            if (!AbstractC22676k.m65745e(interfaceC21134cMo67681a, AbstractC21155m0.j3.f80414b)) {
                return (InterfaceC21134c) this.configs.getOrDefault(AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC21134cMo67681a.getClass()), this.default).invoke(interfaceC21134cMo67681a);
            }
        }
        return AbstractC21155m0.j3.f80414b;
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> mappers, Map<InterfaceC21461d, ? extends Function1> configs) {
        AbstractC22676k.m65750j(mappers, "mappers");
        AbstractC22676k.m65750j(configs, "configs");
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.addAll(mappers);
        c26460cM119000x.addAll(this.mappers);
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        C26463f c26463f = new C26463f();
        c26463f.putAll(this.configs);
        c26463f.putAll(configs);
        return new C27352c(c26460cM118988k, c26463f.m78380b());
    }

    public /* synthetic */ C27352c(List list, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
