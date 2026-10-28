package oj2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.educationModels.FeatureEducationScreenDto;
import com.whoop.educationModels.NavBarDto;
import ej2.AbstractC13266c;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oj2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "Lcom/whoop/educationModels/FeatureEducationScreenDto;", "Lcom/whoop/design/util/TextResource;", "b", "(Ljava/util/List;)Lcom/whoop/design/util/TextResource;", "Lcom/whoop/educationModels/FeatureEducationDto;", "a", "(Lcom/whoop/educationModels/FeatureEducationDto;)Lcom/whoop/design/util/TextResource;", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27982c {
    /* JADX INFO: renamed from: a */
    public static final TextResource m84414a(FeatureEducationDto featureEducationDto) {
        String title;
        TextResource textResourceM21278l;
        AbstractC22676k.m65750j(featureEducationDto, "<this>");
        NavBarDto navBar = featureEducationDto.getNavBar();
        return (navBar == null || (title = navBar.getTitle()) == null || (textResourceM21278l = AbstractC8693b.m21278l(title)) == null) ? m84415b(featureEducationDto.getScreens()) : textResourceM21278l;
    }

    /* JADX INFO: renamed from: b */
    public static final TextResource m84415b(List<FeatureEducationScreenDto> list) {
        Object next;
        NavBarDto navBar;
        String title;
        TextResource textResourceM21278l;
        AbstractC22676k.m65750j(list, "<this>");
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((FeatureEducationScreenDto) next).getNavBar() == null);
        FeatureEducationScreenDto featureEducationScreenDto = (FeatureEducationScreenDto) next;
        return (featureEducationScreenDto == null || (navBar = featureEducationScreenDto.getNavBar()) == null || (title = navBar.getTitle()) == null || (textResourceM21278l = AbstractC8693b.m21278l(title)) == null) ? new TextResource.C8688b(AbstractC13266c.f45933e, null, 2, null) : textResourceM21278l;
    }
}
