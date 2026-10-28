package r32;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsDialogType;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsDomainState;
import com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsExerciseDto;
import com.whoop.personalrecords.miniarch.domain.models.PersonalRecordsModel;
import e31.C12612d;
import java.util.ArrayList;
import java.util.List;
import jb1.C21535a;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q32.C29952d;
import q32.InterfaceC29949a;
import q32.InterfaceC29950b;
import s32.C32109a;

/* JADX INFO: renamed from: r32.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lr32/b;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;", "Lq32/d;", "b", "(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;)Lq32/d;", "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;", "c", "(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;)Lq32/d;", "domainResult", "a", "Ljb1/a;", "personal-records-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30913b {

    /* JADX INFO: renamed from: b */
    public static final int f127487b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C30913b(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: b */
    private final C29952d m95042b(PersonalRecordsDialogType.MiniArchModal miniArchModal) {
        if (miniArchModal instanceof PersonalRecordsDialogType.Loading) {
            return new C29952d(new C29952d.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, null, 6, null);
        }
        if (miniArchModal instanceof PersonalRecordsDialogType.NetworkError) {
            return new C29952d(new C29952d.a(C12612d.f43056a.m35367b(), null, null, 6, null), null, null, 6, null);
        }
        if (miniArchModal instanceof PersonalRecordsDialogType.RequestFailed) {
            PersonalRecordsDialogType.RequestFailed requestFailed = (PersonalRecordsDialogType.RequestFailed) miniArchModal;
            return new C29952d(C29952d.a.m91629b(new C29952d.a(C12612d.f43056a.m35368c(), null, null, 6, null), null, new InterfaceC29949a.c(requestFailed.getPath()), new InterfaceC29949a.c(requestFailed.getPath()), 1, null), null, null, 6, null);
        }
        if (miniArchModal instanceof PersonalRecordsDialogType.Success) {
            return new C29952d(new C29952d.a(C12612d.f43056a.m35369d(), null, null, 6, null), null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX INFO: renamed from: c */
    private final C29952d m95043c(PersonalRecordsDomainState personalRecordsDomainState) {
        ?? arrayList;
        List<PersonalRecordsExerciseDto> tiles;
        PersonalRecordsModel response = personalRecordsDomainState.getResponse();
        if (response == null || (tiles = response.getTiles()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<PersonalRecordsExerciseDto> list = tiles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (PersonalRecordsExerciseDto personalRecordsExerciseDto : list) {
                String exerciseId = personalRecordsExerciseDto.getExerciseId();
                if (exerciseId == null) {
                    exerciseId = "";
                }
                InterfaceC29950b.a aVar = new InterfaceC29950b.a(exerciseId);
                String name = personalRecordsExerciseDto.getName();
                if (name == null) {
                    name = "";
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(name);
                String volumeInputValue = personalRecordsExerciseDto.getVolumeInputValue();
                if (volumeInputValue == null) {
                    volumeInputValue = "";
                }
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(volumeInputValue);
                String volumeInputUnit = personalRecordsExerciseDto.getVolumeInputUnit();
                if (volumeInputUnit == null) {
                    volumeInputUnit = "";
                }
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(volumeInputUnit);
                String imageUrl = personalRecordsExerciseDto.getImageUrl();
                arrayList.add(new C32109a(aVar, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, new AbstractC22403o.c(imageUrl == null ? "" : imageUrl, 0, 0, 0, 14, null)));
            }
        }
        ?? r10 = arrayList;
        PersonalRecordsModel response2 = personalRecordsDomainState.getResponse();
        boolean showMore = response2 != null ? response2.getShowMore() : false;
        PersonalRecordsModel response3 = personalRecordsDomainState.getResponse();
        Integer nextExerciseOffset = response3 != null ? response3.getNextExerciseOffset() : null;
        PersonalRecordsModel response4 = personalRecordsDomainState.getResponse();
        String nextEndDate = response4 != null ? response4.getNextEndDate() : null;
        PersonalRecordsModel response5 = personalRecordsDomainState.getResponse();
        C29952d.b bVar = new C29952d.b(r10, showMore, nextExerciseOffset, nextEndDate, response5 != null ? response5.getNextStartDate() : null, personalRecordsDomainState.isLoadingMore());
        PersonalRecordsModel response6 = personalRecordsDomainState.getResponse();
        return new C29952d(null, bVar, response6 != null ? response6.getAnalyticsAction() : null, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public final C29952d m95044a(PersonalRecordsDomainState domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof PersonalRecordsDialogType.MiniArchModal ? m95042b((PersonalRecordsDialogType.MiniArchModal) domainResult.getCurrentDialogType()) : m95043c(domainResult);
    }

    public /* synthetic */ C30913b(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC30914c.m95047c() : c21535a);
    }
}
