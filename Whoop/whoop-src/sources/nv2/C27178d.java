package nv2;

import com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainDialogType;
import com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsDomainState;
import e31.C12612d;
import java.util.List;
import ov2.C28397a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: nv2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lnv2/d;", "", "<init>", "()V", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;", "", "path", "Lnv2/c;", "b", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;Ljava/lang/String;)Lnv2/c;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;", "c", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;)Lnv2/c;", "domainState", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27178d {
    /* JADX INFO: renamed from: b */
    private final C27177c m81757b(ExerciseRecordsDomainDialogType.FullScreenModal fullScreenModal, String str) {
        if (fullScreenModal instanceof ExerciseRecordsDomainDialogType.Loading) {
            return new C27177c(new C27177c.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, null, 4, null);
        }
        if (fullScreenModal instanceof ExerciseRecordsDomainDialogType.NetworkError) {
            return new C27177c(new C27177c.a(C12612d.f43056a.m35367b(), new InterfaceC27175a.b(str), null, 4, null), null, null, 4, null);
        }
        if (fullScreenModal instanceof ExerciseRecordsDomainDialogType.RequestFailed) {
            return new C27177c(new C27177c.a(C12612d.f43056a.m35368c(), new InterfaceC27175a.b(str), new InterfaceC27175a.b(str)), null, null, 4, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final C27177c m81758c(ExerciseRecordsDomainState exerciseRecordsDomainState) {
        if (exerciseRecordsDomainState.getResponse() == null) {
            String path = exerciseRecordsDomainState.getPath();
            if (path == null) {
                path = "";
            }
            ExerciseRecordsDomainDialogType.RequestFailed requestFailed = new ExerciseRecordsDomainDialogType.RequestFailed(path);
            String path2 = exerciseRecordsDomainState.getPath();
            return m81757b(requestFailed, path2 != null ? path2 : "");
        }
        List<InterfaceC25312u> listM60545m = AbstractC27179e.f108782a.m60545m(exerciseRecordsDomainState.getResponse());
        String nextStartDate = exerciseRecordsDomainState.getNextStartDate();
        boolean z4 = (nextStartDate == null || nextStartDate.length() == 0 || exerciseRecordsDomainState.isLoadingMore()) ? false : true;
        boolean zIsLoadingMore = exerciseRecordsDomainState.isLoadingMore();
        String nextStartDate2 = exerciseRecordsDomainState.getNextStartDate();
        String path3 = exerciseRecordsDomainState.getPath();
        if (path3 == null) {
            path3 = "";
        }
        return new C27177c(null, new C27177c.b(new C28397a(listM60545m, z4, zIsLoadingMore, nextStartDate2, path3)), exerciseRecordsDomainState.getAnalyticsActionFromApi(), 1, null);
    }

    /* JADX INFO: renamed from: a */
    public final C27177c m81759a(ExerciseRecordsDomainState domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (!(domainState.getCurrentDialogType() instanceof ExerciseRecordsDomainDialogType.FullScreenModal)) {
            return m81758c(domainState);
        }
        ExerciseRecordsDomainDialogType.FullScreenModal fullScreenModal = (ExerciseRecordsDomainDialogType.FullScreenModal) domainState.getCurrentDialogType();
        String path = domainState.getPath();
        if (path == null) {
            path = "";
        }
        return m81757b(fullScreenModal, path);
    }
}
