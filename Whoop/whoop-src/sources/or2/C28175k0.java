package or2;

import android.content.Intent;
import com.whoop.domain.model.WhoopUri;
import com.whoop.domain.model.WhoopUriKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.k0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lor2/k0;", "", "<init>", "()V", "", "action", "Lcom/whoop/domain/model/WhoopUri;", "uri", "Landroid/content/Intent;", "a", "(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUri;)Landroid/content/Intent;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28175k0 {
    /* JADX INFO: renamed from: a */
    public final Intent m85288a(String action, WhoopUri uri) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(uri, "uri");
        return new Intent(action, WhoopUriKt.asUri(uri));
    }
}
