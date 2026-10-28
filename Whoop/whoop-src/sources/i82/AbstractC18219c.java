package i82;

import com.whoop.design.models.items.FollowerRequestButtonModel;
import com.whoop.design.models.items.FollowerRequestModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DialogButton;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.Modal;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.UpdateAction;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i82.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/design/models/items/FollowerRequestModel;", "Li82/b;", "stages", "e", "(Lcom/whoop/design/models/items/FollowerRequestModel;Li82/b;)Lcom/whoop/design/models/items/FollowerRequestModel;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "items", "", "", "Li82/a;", "c", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/util/Map;)Li82/a;", "model", "d", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/FollowerRequestModel;Li82/b;)Li82/a;", "Lcom/whoop/design/models/items/FollowerRequestButtonModel;", "performed", "", "a", "(Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/whoopaction/domain/models/Action;)Z", "other", "b", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)Z", "search-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18219c {

    /* JADX INFO: renamed from: i82.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70813a;

        static {
            int[] iArr = new int[EnumC18221e.values().length];
            try {
                iArr[EnumC18221e.AFTER_PRIMARY_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18221e.AFTER_SECONDARY_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70813a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m52421a(FollowerRequestButtonModel followerRequestButtonModel, Action action) {
        DialogButton primaryButton;
        Action action2;
        if (followerRequestButtonModel == null) {
            return false;
        }
        Action action3 = followerRequestButtonModel.getAction();
        if (action3 != null && m52422b(action3, action)) {
            return true;
        }
        AnyModal modal = followerRequestButtonModel.getModal();
        Modal modal2 = modal != null ? modal.getModal() : null;
        DialogModel dialogModel = modal2 instanceof DialogModel ? (DialogModel) modal2 : null;
        return (dialogModel == null || (primaryButton = dialogModel.getPrimaryButton()) == null || (action2 = primaryButton.getAction()) == null || !m52422b(action2, action)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private static final boolean m52422b(Action action, Action action2) {
        if (action2 == action) {
            return true;
        }
        UpdateAction updateAction = action2 instanceof UpdateAction ? (UpdateAction) action2 : null;
        if (updateAction == null) {
            return false;
        }
        UpdateAction updateAction2 = action instanceof UpdateAction ? (UpdateAction) action : null;
        return updateAction2 != null && AbstractC22676k.m65745e(updateAction.getRequest().getPath(), updateAction2.getRequest().getPath()) && AbstractC39421y.m125921F(updateAction.getRequest().getMethod(), updateAction2.getRequest().getMethod(), true);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC18217a m52423c(Action action, List<FollowerRequestModel> items, Map<String, C18218b> stages) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(stages, "stages");
        for (FollowerRequestModel followerRequestModel : items) {
            C18218b c18218b = stages.get(followerRequestModel.getId());
            if (c18218b == null) {
                c18218b = new C18218b(null, null, false, 7, null);
            }
            AbstractC18217a abstractC18217aM52424d = m52424d(action, followerRequestModel, c18218b);
            if (abstractC18217aM52424d != null) {
                return abstractC18217aM52424d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static final AbstractC18217a m52424d(Action action, FollowerRequestModel followerRequestModel, C18218b c18218b) {
        if (c18218b.getHideAllButtons()) {
            return null;
        }
        EnumC18221e start = c18218b.getStart();
        int i13 = start == null ? -1 : a.f70813a[start.ordinal()];
        if (i13 != -1) {
            if (i13 != 1) {
                if (i13 == 2) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (m52421a(followerRequestModel.getSecondaryStartButton(), action)) {
                return new AbstractC18217a.d(followerRequestModel.getId(), followerRequestModel.getTertiaryStartButton() != null);
            }
            return null;
        }
        EnumC18221e end = c18218b.getEnd();
        int i14 = end == null ? -1 : a.f70813a[end.ordinal()];
        if (i14 == -1) {
            if (m52421a(followerRequestModel.getEndButton(), action)) {
                return new AbstractC18217a.a(followerRequestModel.getId(), followerRequestModel.getSecondaryEndButton() != null);
            }
            if (m52421a(followerRequestModel.getStartButton(), action)) {
                return new AbstractC18217a.c(followerRequestModel.getId(), followerRequestModel.getSecondaryStartButton() != null);
            }
            return null;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (m52421a(followerRequestModel.getSecondaryEndButton(), action)) {
            return new AbstractC18217a.b(followerRequestModel.getId(), followerRequestModel.getTertiaryEndButton() != null);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final FollowerRequestModel m52425e(FollowerRequestModel followerRequestModel, C18218b c18218b) {
        AbstractC22676k.m65750j(followerRequestModel, "<this>");
        if (c18218b != null) {
            if (c18218b.getHideAllButtons()) {
                return FollowerRequestModel.copy$default(followerRequestModel, null, null, null, null, null, null, null, null, null, null, null, null, 3999, null);
            }
            EnumC18221e start = c18218b.getStart();
            if (start != null) {
                int i13 = a.f70813a[start.ordinal()];
                if (i13 == 1) {
                    return FollowerRequestModel.copy$default(followerRequestModel, null, null, null, null, null, followerRequestModel.getSecondaryStartButton(), null, null, null, null, null, null, 3999, null);
                }
                if (i13 == 2) {
                    return FollowerRequestModel.copy$default(followerRequestModel, null, null, null, null, null, followerRequestModel.getTertiaryStartButton(), null, null, null, null, null, null, 3999, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            EnumC18221e end = c18218b.getEnd();
            int i14 = end == null ? -1 : a.f70813a[end.ordinal()];
            if (i14 != -1) {
                if (i14 == 1) {
                    return FollowerRequestModel.copy$default(followerRequestModel, null, null, null, null, null, null, followerRequestModel.getSecondaryEndButton(), null, null, null, null, null, 3999, null);
                }
                if (i14 == 2) {
                    return FollowerRequestModel.copy$default(followerRequestModel, null, null, null, null, null, null, followerRequestModel.getTertiaryEndButton(), null, null, null, null, null, 3999, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return followerRequestModel;
    }
}
