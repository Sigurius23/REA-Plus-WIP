package kc2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.settings.referafriend.model.RafHubContent;
import com.whoop.settings.referafriend.model.RafMenuItem;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kc2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkc2/j;", "", "<init>", "()V", "Lkc2/d;", "result", "Lkc2/i;", "a", "(Lkc2/d;)Lkc2/i;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22360j {
    /* JADX INFO: renamed from: a */
    public final C22359i m64275a(AbstractC22354d result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.equals(AbstractC22354d.a.f87215a)) {
            return null;
        }
        if (!(result instanceof AbstractC22354d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC12922s.f44583R);
        AbstractC22354d.b bVar = (AbstractC22354d.b) result;
        RafMenuItem rafMenuItem = bVar.getResult().getRafMenuItem();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(rafMenuItem != null ? rafMenuItem.getSubtitle() : null);
        String messageText = bVar.getResult().getShareSheetContent().getMessageText();
        RafHubContent rafHubContent = bVar.getResult().getRafHubContent();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(rafHubContent != null ? rafHubContent.getTitle() : null);
        RafHubContent rafHubContent2 = bVar.getResult().getRafHubContent();
        return new C22359i(c8688bM21277k, textResourceM21278l, messageText, new C22351a(textResourceM21278l2, AbstractC8693b.m21278l(rafHubContent2 != null ? rafHubContent2.getBody() : null)));
    }
}
