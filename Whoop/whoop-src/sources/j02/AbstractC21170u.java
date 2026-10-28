package j02;

import com.whoop.navigation.DismissEventModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j02.u */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/navigation/DismissEventModel;", "Lj02/s;", "a", "(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;", "navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21170u {
    /* JADX INFO: renamed from: a */
    public static final C21166s m59413a(DismissEventModel dismissEventModel) {
        AbstractC22676k.m65750j(dismissEventModel, "<this>");
        return new C21166s(dismissEventModel.getType(), dismissEventModel.getPopUpTo(), dismissEventModel.getPopBackCount());
    }
}
