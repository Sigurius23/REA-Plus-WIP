package rv2;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.WorkoutTemplateOverview;
import com.whoop.weightlifting.data.dto.MetaData;
import com.whoop.weightlifting.data.dto.WorkoutLibraryMetadataListItemDto;
import com.whoop.weightlifting.data.dto.WorkoutLibraryModel;
import com.whoop.weightlifting.data.dto.WorkoutTemplateOverviewDto;
import cu2.AbstractC11128h;
import d13.AbstractC11478a;
import d41.C11682h;
import dw2.C12419a;
import ep0.C13404j;
import f01.EnumC13892q1;
import fu2.InterfaceC14790e;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k11.C22123f;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import ny0.C27273p0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import qv2.C30660a;
import qv2.C30663d;
import qv2.EnumC30665f;
import qv2.InterfaceC30661b;
import rm2.C31604d;
import s01.C32048d;
import s01.EnumC32047c;
import wv2.AbstractC37652a;
import x81.C38072d;
import y71.C39271d;
import y71.C39274g;

/* JADX INFO: renamed from: rv2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u001a*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010&\u001a\u00020%2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b&\u0010'J%\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\fH\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020)*\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, m65681d2 = {"Lrv2/e;", "", "<init>", "()V", "Lqv2/b$h;", "Lrv2/c;", "d", "(Lqv2/b$h;)Lrv2/c;", "Lqv2/b$d;", "fullScreenModal", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "workoutLibraryResult", "", "Ldw2/a;", "pendingWorkouts", "Lrv2/h;", "i", "(Lqv2/b$d;Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Ljava/util/List;)Lrv2/h;", "Lfu2/e;", NotificationCompat.CATEGORY_EVENT, "Lrv2/d;", "j", "(Lfu2/e;)Lrv2/d;", "Lqv2/d;", "bffFeed", "dialogState", "Lrv2/h$b;", "e", "(Lqv2/d;Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Lrv2/c;)Lrv2/h$b;", "workoutLibraryModel", "Lrv2/f;", "b", "(Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Ljava/util/List;)Lrv2/f;", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;", "workoutTemplateOverviews", "", "selectedWorkoutKey", "Lcom/whoop/design/util/TextResource;", "c", "(Ljava/util/List;Ljava/lang/Long;)Lcom/whoop/design/util/TextResource;", "workoutTemplates", "Ly71/d;", "k", "(Ljava/util/List;)Ljava/util/List;", "g", "(Ldw2/a;)Ly71/d;", "domainState", "f", "(Lqv2/d;)Lrv2/h;", "Ljb1/a;", "a", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31847e {

    /* JADX INFO: renamed from: b */
    public static final int f132032b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer = AbstractC21537c.m60554d(new C31604d(18));

    /* JADX INFO: renamed from: rv2.e$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f132034a;

        static {
            int[] iArr = new int[EnumC30665f.values().length];
            try {
                iArr[EnumC30665f.LoadingShareableWorkoutLink.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC30665f.LoadingShareableWorkoutQrCode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f132034a = iArr;
        }
    }

    /* JADX INFO: renamed from: rv2.e$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f132035w = new b();

        /* JADX INFO: renamed from: a */
        public final long m98986a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCoachBlue();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m98986a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: rv2.e$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C11682h.m31135b((C11682h) it, null, null, null, null, true, 15, null);
        }
    }

    /* JADX INFO: renamed from: rv2.e$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C27273p0 c27273p0 = (C27273p0) it;
            return c27273p0.m82257a((15359 & 1) != 0 ? c27273p0.text : null, (15359 & 2) != 0 ? c27273p0.navigationAction : null, (15359 & 4) != 0 ? c27273p0.leftIcon : null, (15359 & 8) != 0 ? c27273p0.rightIcon : new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, null), (15359 & 16) != 0 ? c27273p0.tint : p745y81.Function1.m125323a(b.f132035w), (15359 & 32) != 0 ? c27273p0.tintGradient : null, (15359 & 64) != 0 ? c27273p0.useTextPadding : false, (15359 & 128) != 0 ? c27273p0.actionArgument : null, (15359 & 256) != 0 ? c27273p0.analyticEvent : null, (15359 & 512) != 0 ? c27273p0.dismissEvent : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27273p0.alignment : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27273p0.trimStartGutter : false, (15359 & 4096) != 0 ? c27273p0.style : null, (15359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c27273p0.enabled : false);
        }
    }

    /* JADX INFO: renamed from: rv2.e$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C32048d.m99589b((C32048d) it, null, null, null, null, null, null, EnumC32047c.COACH_GRADIENT, 63, null);
        }
    }

    /* JADX INFO: renamed from: rv2.e$f */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C22123f.m63348b((C22123f) it, null, null, null, null, null, null, null, EnumC13892q1.OUTLINED, null, false, false, null, 0.0f, 7039, null);
        }
    }

    /* JADX INFO: renamed from: rv2.e$g */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C27256h.m82144b((C27256h) it, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
        }
    }

    /* JADX INFO: renamed from: b */
    private final EnumC31848f m98976b(WorkoutLibraryModel workoutLibraryModel, List<C12419a> pendingWorkouts) {
        if (workoutLibraryModel == null) {
            return null;
        }
        if (pendingWorkouts.isEmpty()) {
            return workoutLibraryModel.getMyWorkoutsList().isEmpty() ? EnumC31848f.WHOOP_WORKOUTS : EnumC31848f.PERSONAL_WORKOUTS;
        }
        return EnumC31848f.PENDING_SESSIONS;
    }

    /* JADX INFO: renamed from: c */
    private final TextResource m98977c(List<WorkoutTemplateOverview> workoutTemplateOverviews, Long selectedWorkoutKey) {
        Object next;
        String name;
        TextResource textResourceM30853e;
        Iterator<T> it = workoutTemplateOverviews.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long workoutTemplateKey = ((WorkoutTemplateOverview) next).getWorkoutTemplateKey();
            if (selectedWorkoutKey != null && workoutTemplateKey == selectedWorkoutKey.longValue()) {
                break;
            }
        }
        WorkoutTemplateOverview workoutTemplateOverview = (WorkoutTemplateOverview) next;
        return (workoutTemplateOverview == null || (name = workoutTemplateOverview.getName()) == null || (textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, name, "toUpperCase(...)")) == null) ? AbstractC8693b.m21267a() : textResourceM30853e;
    }

    /* JADX INFO: renamed from: d */
    private final C31845c m98978d(InterfaceC30661b.h hVar) {
        if (hVar instanceof InterfaceC30661b.a) {
            return new C31845c(AbstractC8693b.m21277k(AbstractC11128h.f35511u0), AbstractC8693b.m21277k(AbstractC11128h.f35496p0), EnumC39333f.ACCENT_ALERT, AbstractC8693b.m21277k(AbstractC11128h.f35453b0), AbstractC8693b.m21277k(AbstractC11128h.f35514v0), InterfaceC31846d.y.f132030a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01ca  */
    /* JADX INFO: renamed from: e */
    private final InterfaceC31850h.b m98979e(C30663d c30663d, WorkoutLibraryModel workoutLibraryModel, C31845c c31845c) {
        InterfaceC31846d.g gVar;
        ArrayList arrayList;
        Iterator it;
        Object next;
        MetaData metadata;
        AiContextMetadata aiContextMetadata;
        C13404j c13404jM18523a;
        C23465k c23465k;
        List<InterfaceC25312u> listM60540g;
        List<InterfaceC25312u> listM60540g2;
        EnumC31848f enumC31848fM98976b = m98976b(workoutLibraryModel, c30663d.m94236f());
        EnumC31848f enumC31848fM94238h = EnumC31848f.PENDING_SESSIONS;
        EnumC31848f enumC31848f = (enumC31848fM98976b != enumC31848fM94238h && (enumC31848fM94238h = c30663d.getSelectedWorkoutLibraryTab()) == null) ? enumC31848fM98976b : enumC31848fM94238h;
        TextResource.C8691e c8691e = new TextResource.C8691e(workoutLibraryModel.getWorkoutLibraryTitle());
        TextResource.C8691e c8691e2 = new TextResource.C8691e(workoutLibraryModel.getWhoopWorkoutsTitle());
        TextResource.C8691e c8691e3 = new TextResource.C8691e(workoutLibraryModel.getMyWorkoutsTitle());
        String myWorkoutsCtaText = workoutLibraryModel.getMyWorkoutsCtaText();
        TextResource textResourceM21278l = myWorkoutsCtaText != null ? AbstractC8693b.m21278l(myWorkoutsCtaText) : null;
        List<InterfaceC25312u> listM60540g3 = this.reducer.m60540g(workoutLibraryModel.getWhoopWorkoutsList());
        List<WorkoutTemplateOverviewDto> myWorkoutsList = workoutLibraryModel.getMyWorkoutsList();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(myWorkoutsList, 10));
        Iterator<T> it3 = myWorkoutsList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((WorkoutTemplateOverviewDto) it3.next()).toWorkoutTemplate());
        }
        List<C39271d> listM98984k = m98984k(arrayList2);
        List<DesignSystemModel> myWorkoutHeaderItems = workoutLibraryModel.getMyWorkoutHeaderItems();
        List<WorkoutLibraryMetadataListItemDto> list = C25271y.f99162w;
        List list2 = (myWorkoutHeaderItems == null || (listM60540g2 = this.reducer.m60540g(myWorkoutHeaderItems)) == null) ? list : listM60540g2;
        List<WorkoutTemplateOverviewDto> myWorkoutsList2 = workoutLibraryModel.getMyWorkoutsList();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(myWorkoutsList2, 10));
        Iterator<T> it4 = myWorkoutsList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((WorkoutTemplateOverviewDto) it4.next()).toWorkoutTemplate());
        }
        TextResource textResourceM98977c = m98977c(arrayList3, c30663d.getSelectedWorkoutKey());
        C31844b noWorkoutsState = workoutLibraryModel.getMyWorkoutsList().isEmpty() ? workoutLibraryModel.getMyWorkoutsEmptyState().toNoWorkoutsState(this.reducer) : null;
        List<EnumC31848f> listM98992a = EnumC31848f.INSTANCE.m98992a(!c30663d.m94236f().isEmpty());
        boolean z4 = !c30663d.m94236f().isEmpty();
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35491n1);
        List<C12419a> listM94236f = c30663d.m94236f();
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(listM94236f, 10));
        Iterator<T> it5 = listM94236f.iterator();
        while (it5.hasNext()) {
            arrayList4.add(m98980g((C12419a) it5.next()));
        }
        EnumC30665f enumC30665fM94234d = c30663d.getMenuLoadingState();
        EnumC30665f enumC30665fM94234d2 = c30663d.getMenuLoadingState();
        int i13 = enumC30665fM94234d2 == null ? -1 : a.f132034a[enumC30665fM94234d2.ordinal()];
        if (i13 == -1) {
            gVar = null;
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = InterfaceC31846d.g.f132012a;
        }
        C30660a c30660aM94239i = c30663d.getShareableWorkoutLink();
        Long lM94237g = c30663d.getSelectedWorkoutKey();
        List<DesignSystemModel> myProgress = workoutLibraryModel.getMyProgress();
        List list3 = (myProgress == null || (listM60540g = AbstractC37652a.m121041e().m60540g(myProgress)) == null) ? list : listM60540g;
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC11128h.f35500q1);
        List<WorkoutLibraryMetadataListItemDto> metadataList = workoutLibraryModel.getMetadataList();
        if (metadataList != null) {
            list = metadataList;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            WorkoutLibraryMetadataListItemDto workoutLibraryMetadataListItemDto = (WorkoutLibraryMetadataListItemDto) it6.next();
            Iterator<E> it7 = EnumC31848f.getEntries().iterator();
            while (true) {
                if (!it7.hasNext()) {
                    arrayList = arrayList4;
                    it = it6;
                    next = null;
                    break;
                }
                next = it7.next();
                arrayList = arrayList4;
                it = it6;
                if (AbstractC22676k.m65745e(((EnumC31848f) next).name(), workoutLibraryMetadataListItemDto.getId())) {
                    break;
                }
                it6 = it;
                arrayList4 = arrayList;
            }
            EnumC31848f enumC31848f2 = (EnumC31848f) next;
            if (enumC31848f2 == null || (metadata = workoutLibraryMetadataListItemDto.getMetadata()) == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) {
                c23465k = null;
            } else {
                if (aiContextMetadata.getAiAction() == null) {
                    aiContextMetadata = null;
                }
                if (aiContextMetadata == null || (c13404jM18523a = AbstractC6219a.m18523a(aiContextMetadata)) == null) {
                    c23465k = null;
                } else {
                    c23465k = new C23465k(enumC31848f2, c13404jM18523a);
                }
            }
            if (c23465k != null) {
                arrayList5.add(c23465k);
            }
            it6 = it;
            arrayList4 = arrayList;
        }
        return new InterfaceC31850h.b(c31845c, c8691e, c8691e2, c8691e3, textResourceM21278l, listM98992a, listM60540g3, listM98984k, list2, noWorkoutsState, textResourceM98977c, enumC31848f, z4, c8688bM21277k, arrayList4, enumC30665fM94234d, gVar, c30660aM94239i, null, lM94237g, list3, c8688bM21277k2, AbstractC25247g0.m74000i0(arrayList5), c30663d.getIsExerciseDetailsV2ExperimentEnabled(), c30663d.getNavigateToEmptyWorkout(), ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION, null);
    }

    /* JADX INFO: renamed from: g */
    private final C39271d m98980g(C12419a c12419a) {
        String name = c12419a.getName();
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        String upperCase = name.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(upperCase);
        C23454a0 c23454a0 = C23454a0.f92919a;
        return new C39271d(textResourceM21278l, false, false, c23454a0, c23454a0, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m98981h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C11682h.class), new c());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C27273p0.class), new d());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C32048d.class), new e());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C22123f.class), new f());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C27256h.class), new g());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC31850h m98982i(InterfaceC30661b.d fullScreenModal, WorkoutLibraryModel workoutLibraryResult, List<C12419a> pendingWorkouts) {
        InterfaceC31850h.a aVarM99004g;
        EnumC31848f enumC31848fM98976b = m98976b(workoutLibraryResult, pendingWorkouts);
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC30661b.e.f126112a)) {
            aVarM99004g = InterfaceC31850h.a.INSTANCE.m99014c();
        } else if (fullScreenModal instanceof InterfaceC30661b.f) {
            aVarM99004g = InterfaceC31850h.a.m99004g(InterfaceC31850h.a.INSTANCE.m99015d(), null, null, null, m98983j(((InterfaceC30661b.f) fullScreenModal).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()), null, null, 55, null);
        } else if (fullScreenModal instanceof InterfaceC30661b.i) {
            aVarM99004g = InterfaceC31850h.a.m99004g(InterfaceC31850h.a.INSTANCE.m99016e(), null, null, null, m98983j(((InterfaceC30661b.i) fullScreenModal).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()), null, null, 55, null);
        } else if (fullScreenModal instanceof InterfaceC30661b.c) {
            aVarM99004g = InterfaceC31850h.a.m99004g(InterfaceC31850h.a.INSTANCE.m99013b(), null, null, null, null, InterfaceC31846d.f.f132011a, null, 47, null);
        } else {
            if (!(fullScreenModal instanceof InterfaceC30661b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarM99004g = InterfaceC31850h.a.m99004g(InterfaceC31850h.a.INSTANCE.m99012a(), null, null, null, null, InterfaceC31846d.u.f132027a, null, 47, null);
        }
        return InterfaceC31850h.a.m99004g(aVarM99004g, null, null, null, null, null, enumC31848fM98976b, 31, null);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC31846d m98983j(InterfaceC14790e event) {
        if (AbstractC22676k.m65745e(event, InterfaceC14790e.b.f54892a)) {
            return InterfaceC31846d.c.f132008a;
        }
        if (AbstractC22676k.m65745e(event, InterfaceC14790e.a.f54891a)) {
            return InterfaceC31846d.b.f132006a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    private final List<C39271d> m98984k(List<WorkoutTemplateOverview> workoutTemplates) {
        if (workoutTemplates == null) {
            return C25271y.f99162w;
        }
        List<WorkoutTemplateOverview> list = workoutTemplates;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (WorkoutTemplateOverview workoutTemplateOverview : list) {
            arrayList.add(new C39271d(AbstractC11478a.m30853e(Locale.ROOT, workoutTemplateOverview.getName(), "toUpperCase(...)"), false, false, new InterfaceC31846d.j(workoutTemplateOverview.getWorkoutTemplateKey(), false, 2, null), new InterfaceC31846d.p(workoutTemplateOverview.getWorkoutTemplateKey()), false, 38, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC31850h m98985f(C30663d domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.getCurrentDialogType() instanceof InterfaceC30661b.d) {
            return m98982i((InterfaceC30661b.d) domainState.getCurrentDialogType(), domainState.getWorkoutLibraryResult(), domainState.m94236f());
        }
        if (domainState.getWorkoutLibraryResult() == null) {
            return InterfaceC31850h.a.m99004g(InterfaceC31850h.a.INSTANCE.m99016e(), null, null, null, InterfaceC31846d.c.f132008a, null, null, 55, null);
        }
        WorkoutLibraryModel workoutLibraryModelM94240j = domainState.getWorkoutLibraryResult();
        InterfaceC30661b interfaceC30661bM94233c = domainState.getCurrentDialogType();
        InterfaceC30661b.h hVar = interfaceC30661bM94233c instanceof InterfaceC30661b.h ? (InterfaceC30661b.h) interfaceC30661bM94233c : null;
        return m98979e(domainState, workoutLibraryModelM94240j, hVar != null ? m98978d(hVar) : null);
    }
}
