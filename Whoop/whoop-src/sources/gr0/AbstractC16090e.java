package gr0;

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

/* JADX INFO: renamed from: gr0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0014*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/models/items/FollowerRequestModel;", "Lgr0/f;", "stage", "e", "(Lcom/whoop/design/models/items/FollowerRequestModel;Lgr0/f;)Lcom/whoop/design/models/items/FollowerRequestModel;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "items", "", "", "stages", "Lgr0/d;", "c", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/util/Map;)Lgr0/d;", "model", "d", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/FollowerRequestModel;Lgr0/f;)Lgr0/d;", "Lcom/whoop/design/models/items/FollowerRequestButtonModel;", "performed", "", "a", "(Lcom/whoop/design/models/items/FollowerRequestButtonModel;Lcom/whoop/whoopaction/domain/models/Action;)Z", "other", "b", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)Z", "community-follower-lookup-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16090e {

    /* JADX INFO: renamed from: gr0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60986a;

        static {
            int[] iArr = new int[EnumC16091f.values().length];
            try {
                iArr[EnumC16091f.AFTER_PRIMARY_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16091f.AFTER_SECONDARY_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60986a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m45488a(FollowerRequestButtonModel followerRequestButtonModel, Action action) {
        DialogButton primaryButton;
        Action action2;
        if (followerRequestButtonModel == null) {
            return false;
        }
        Action action3 = followerRequestButtonModel.getAction();
        if (action3 != null && m45489b(action3, action)) {
            return true;
        }
        AnyModal modal = followerRequestButtonModel.getModal();
        Modal modal2 = modal != null ? modal.getModal() : null;
        DialogModel dialogModel = modal2 instanceof DialogModel ? (DialogModel) modal2 : null;
        return (dialogModel == null || (primaryButton = dialogModel.getPrimaryButton()) == null || (action2 = primaryButton.getAction()) == null || !m45489b(action2, action)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private static final boolean m45489b(Action action, Action action2) {
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
    public static final AbstractC16089d m45490c(Action action, List<FollowerRequestModel> items, Map<String, ? extends EnumC16091f> stages) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(stages, "stages");
        for (FollowerRequestModel followerRequestModel : items) {
            AbstractC16089d abstractC16089dM45491d = m45491d(action, followerRequestModel, stages.get(followerRequestModel.getId()));
            if (abstractC16089dM45491d != null) {
                return abstractC16089dM45491d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static final AbstractC16089d m45491d(Action action, FollowerRequestModel followerRequestModel, EnumC16091f enumC16091f) {
        int i13 = enumC16091f == null ? -1 : a.f60986a[enumC16091f.ordinal()];
        if (i13 == -1) {
            if (m45488a(followerRequestModel.getEndButton(), action)) {
                return new AbstractC16089d.a(followerRequestModel.getId());
            }
            if (m45488a(followerRequestModel.getStartButton(), action)) {
                return new AbstractC16089d.b(followerRequestModel.getId(), followerRequestModel.getSecondaryStartButton() != null);
            }
            return null;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (m45488a(followerRequestModel.getSecondaryStartButton(), action)) {
            return new AbstractC16089d.c(followerRequestModel.getId());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final FollowerRequestModel m45492e(FollowerRequestModel followerRequestModel, EnumC16091f enumC16091f) {
        AbstractC22676k.m65750j(followerRequestModel, "<this>");
        int i13 = enumC16091f == null ? -1 : a.f60986a[enumC16091f.ordinal()];
        if (i13 == -1) {
            return followerRequestModel;
        }
        if (i13 == 1) {
            return FollowerRequestModel.copy$default(followerRequestModel, null, null, null, null, null, followerRequestModel.getSecondaryStartButton(), null, null, null, null, null, null, 3999, null);
        }
        if (i13 == 2) {
            return FollowerRequestModel.copy$default(followerRequestModel, null, null, null, null, null, followerRequestModel.getTertiaryStartButton(), null, null, null, null, null, null, 3999, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
