package si0;

import com.whoop.archv2.model.template.NavigationTemplate;
import com.whoop.design.models.items.NavigationBarModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ti0.C33841f;

/* JADX INFO: renamed from: si0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lsi0/j;", "", "<init>", "()V", "Lcom/whoop/archv2/model/template/NavigationTemplate;", "template", "Lti0/f;", "a", "(Lcom/whoop/archv2/model/template/NavigationTemplate;)Lti0/f;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32544j {
    /* JADX INFO: renamed from: a */
    public final C33841f m101575a(NavigationTemplate template) {
        AbstractC22676k.m65750j(template, "template");
        NavigationBarModel navigationBar = template.getNavigationBar();
        return new C33841f(navigationBar != null ? AbstractC32543i.m101573b(navigationBar, false, false, null, 7, null) : null, template.getDestination());
    }
}
