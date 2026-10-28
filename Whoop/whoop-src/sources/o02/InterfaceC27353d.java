package o02;

import com.whoop.navigation.NavigationScreenModel;
import j02.InterfaceC21134c;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o02.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u000e\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\f0\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lo02/d;", "", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/c;", "a", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;", "", "mappers", "", "Lj93/d;", "Lkotlin/Function1;", "Lcom/whoop/navigation/reducer/NavigationScreenConfig;", "configs", "b", "(Ljava/util/List;Ljava/util/Map;)Lo02/d;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC27353d {
    /* JADX INFO: renamed from: a */
    InterfaceC21134c mo67681a(NavigationScreenModel navigationScreenModel);

    /* JADX INFO: renamed from: b */
    default InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> mappers, Map<InterfaceC21461d, ? extends Function1> configs) {
        AbstractC22676k.m65750j(mappers, "mappers");
        AbstractC22676k.m65750j(configs, "configs");
        return this;
    }
}
