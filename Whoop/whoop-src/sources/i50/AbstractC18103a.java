package i50;

import com.whoop.access.careupdateentrypointtile.models.CareUpdateEntrypointTileModel;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import j50.C21332d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i50.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;", "Lj50/d;", "a", "(Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;)Lj50/d;", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18103a {
    /* JADX INFO: renamed from: a */
    public static final C21332d m51958a(CareUpdateEntrypointTileModel careUpdateEntrypointTileModel) {
        AbstractC22676k.m65750j(careUpdateEntrypointTileModel, "<this>");
        return new C21332d(careUpdateEntrypointTileModel.getTitle(), careUpdateEntrypointTileModel.getSubtitle(), careUpdateEntrypointTileModel.getPreviewText(), AbstractC16315n0.m46378c(careUpdateEntrypointTileModel.getLeftIcon(), EnumC16313m0.NOTES_EDIT), AbstractC16315n0.m46377b(careUpdateEntrypointTileModel.getRightIcon()), careUpdateEntrypointTileModel.getDestination());
    }
}
