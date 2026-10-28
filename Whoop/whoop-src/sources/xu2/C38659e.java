package xu2;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.weightlifting.data.domain.VolumeInputFormat;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import cu2.AbstractC11127g;
import d13.AbstractC11478a;
import eu2.C13659p;
import fu2.InterfaceC14790e;
import gy0.AbstractC16277f;
import hu2.C17657d;
import hu2.C17660g;
import hu2.C17662i;
import hu2.InterfaceC17655b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iu2.AbstractC20939c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import l83.C23454a0;
import m83.AbstractC25267u;
import o11.AbstractC27407m;
import o11.InterfaceC27402h;
import o81.C27656a;
import od1.C27858u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r41.AbstractC30925i;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import wu2.C37646b;
import wu2.InterfaceC37645a;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: xu2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0012*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010'\u001a\u00020&*\u00020\u00182\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(JA\u0010.\u001a\u00020-*\u00020)2\u0006\u0010!\u001a\u00020 2\u0006\u0010*\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001aH\u0002¢\u0006\u0004\b.\u0010/J3\u00106\u001a\u000205*\u0002002\u0006\u00101\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001aH\u0002¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u0002092\u0006\u00108\u001a\u00020\u0011¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010<R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u00020\u001a*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010AR\u0018\u0010D\u001a\u00020\u001a*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010A¨\u0006E"}, m65681d2 = {"Lxu2/e;", "", "Lod1/u;", "userContext", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lod1/u;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lwu2/a$c;", "Lxu2/d$c;", "i", "(Lwu2/a$c;)Lxu2/d$c;", "Lfu2/e;", NotificationCompat.CATEGORY_EVENT, "Lhu2/b;", "f", "(Lfu2/e;)Lhu2/b;", "Lwu2/b;", "Lxu2/b;", "dialog", "Lxu2/d$b;", "g", "(Lwu2/b;Lxu2/b;)Lxu2/d$b;", "", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "groups", "", "a", "(Ljava/util/List;)Z", "Lwu2/a$k;", "e", "(Lwu2/a$k;)Lxu2/b;", "", "groupIndex", "", "Ljava/util/UUID;", "idsOfExercisesBeingEdited", "isLastGroup", "Leu2/p;", "k", "(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;ILjava/util/Set;Z)Leu2/p;", "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "exerciseIndex", "isLastExercise", "isPartOfSuperset", "Lo11/m$b$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;IILjava/util/Set;ZZ)Lo11/m$b$a;", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "setIndex", "Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;", "volumeInputFormat", "noMoreSets", "Lr41/i$d;", "j", "(Lcom/whoop/weightlifting/data/domain/WorkoutSet;IILcom/whoop/weightlifting/data/domain/VolumeInputFormat;Z)Lr41/i$d;", "domainState", "Lxu2/d;", "d", "(Lwu2/b;)Lxu2/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lcom/whoop/domain/model/UnitSystem;", "b", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "(Lwu2/b;)Z", "canSaveWorkout", "c", "canStartWorkout", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38659e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final UnitSystem unitSystem;

    public C38659e(C27858u userContext, FeatureFlagChecker featureFlagChecker) {
        UserProfile profile;
        UnitSystem unitSystem;
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
        User userM84055f = userContext.m84055f();
        this.unitSystem = (userM84055f == null || (profile = userM84055f.getProfile()) == null || (unitSystem = profile.getUnitSystem()) == null) ? AbstractC20939c.m58198a() : unitSystem;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m123986a(List<WorkoutGroup> groups) {
        List<WorkoutGroup> list = groups;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<WorkoutExercise> exercises = ((WorkoutGroup) it.next()).getExercises();
            if (!(exercises instanceof Collection) || !exercises.isEmpty()) {
                for (WorkoutExercise workoutExercise : exercises) {
                    if (AbstractC22676k.m65745e(workoutExercise.getExercise().getExerciseId(), "OTHEREXERCISE") || AbstractC39421y.m125921F(workoutExercise.getExercise().getName(), "Other", true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m123987b(C37646b c37646b) {
        Iterator<T> it = c37646b.getWorkoutTemplate().getGroups().iterator();
        int numSetsPerExercise = 0;
        while (it.hasNext()) {
            numSetsPerExercise += ((WorkoutGroup) it.next()).getNumSetsPerExercise();
        }
        return numSetsPerExercise > 0;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m123988c(C37646b c37646b) {
        if (c37646b.getWorkoutTemplate().getGroups().isEmpty()) {
            return false;
        }
        List<WorkoutGroup> groups = c37646b.getWorkoutTemplate().getGroups();
        if ((groups instanceof Collection) && groups.isEmpty()) {
            return true;
        }
        for (WorkoutGroup workoutGroup : groups) {
            if (workoutGroup.getExercises().isEmpty()) {
                return false;
            }
            List<WorkoutExercise> exercises = workoutGroup.getExercises();
            if (!(exercises instanceof Collection) || !exercises.isEmpty()) {
                Iterator<T> it = exercises.iterator();
                while (it.hasNext()) {
                    if (((WorkoutExercise) it.next()).getSets().isEmpty()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC38656b m123989e(InterfaceC37645a.k kVar) {
        if (kVar instanceof InterfaceC37645a.a) {
            InterfaceC37645a.a aVar = (InterfaceC37645a.a) kVar;
            return new AbstractC38656b.a(aVar.getGroupIndex(), aVar.getExerciseIndex());
        }
        if (kVar instanceof InterfaceC37645a.o) {
            return AbstractC38656b.d.f166342e;
        }
        if (kVar instanceof InterfaceC37645a.b) {
            return new AbstractC38656b.b(((InterfaceC37645a.b) kVar).getGoBackToCoach());
        }
        if (kVar instanceof InterfaceC37645a.i) {
            return AbstractC38656b.c.f166335e;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC17655b m123990f(InterfaceC14790e event) {
        if (AbstractC22676k.m65745e(event, InterfaceC14790e.b.f54892a)) {
            return InterfaceC17655b.c.f68493w;
        }
        if (AbstractC22676k.m65745e(event, InterfaceC14790e.a.f54891a)) {
            return InterfaceC17655b.b.f68492w;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC38658d.b m123991g(C37646b c37646b, AbstractC38656b abstractC38656b) {
        TextResource textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, c37646b.getWorkoutTemplate().getName(), "toUpperCase(...)");
        TextResource subtitle = c37646b.getSubtitle();
        AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM30853e, subtitle != null ? new C27656a(subtitle, false, 2, null) : null, c37646b.getIsSharedWorkout() ? new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)) : new C39274g(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward(), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), null, null, null, false, null, null, null, null, null, null, null, null, 32760, null);
        List<WorkoutGroup> groups = c37646b.getWorkoutTemplate().getGroups();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : groups) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            WorkoutGroup workoutGroup = (WorkoutGroup) obj;
            C13659p c13659pM123995k = workoutGroup.getExercises().isEmpty() ? null : m123995k(workoutGroup, i13, c37646b.m120986e(), i13 == AbstractC37056f.m118951C(c37646b.getWorkoutTemplate().getGroups()));
            if (c13659pM123995k != null) {
                arrayList.add(c13659pM123995k);
            }
            i13 = i14;
        }
        return new InterfaceC38658d.b(aVar, arrayList, c37646b.m120991j() ? new InterfaceC38655a.b(m123987b(c37646b)) : c37646b.getLinkedActivityId() != null ? InterfaceC38655a.a.f166304a : new InterfaceC38655a.c(m123988c(c37646b)), abstractC38656b, c37646b.m120991j() ? InterfaceC17655b.i.f68498w : c37646b.getIsFromWhoopCoach() ? InterfaceC17655b.d.f68494w : InterfaceC17655b.c.f68493w, m123986a(c37646b.getWorkoutTemplate().getGroups()));
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC27407m.b.a m123992h(WorkoutExercise workoutExercise, int i13, int i14, Set<UUID> set, boolean z4, boolean z13) {
        UUID id4 = workoutExercise.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(workoutExercise.getExercise().getName());
        TextResource.C8689c c8689c = new TextResource.C8689c(AbstractC11127g.f35369a, workoutExercise.getSets().size(), AbstractC37056f.m118958J(new TextResource.AbstractC8690d.b(Integer.valueOf(workoutExercise.getSets().size()))));
        String imageUrl = workoutExercise.getExercise().getImageUrl();
        int drag = !z13 ? C38072d.f163053a.m121951d().getVarious().getDrag() : C38072d.f163053a.m121951d().getTinyIcons().getDownArrow();
        C17660g c17660g = new C17660g(workoutExercise.getId());
        Object gVar = new InterfaceC17655b.g(workoutExercise.getExercise().getExerciseId());
        if (!this.featureFlagChecker.isFeatureEnabled("exercise-details-image-navigation-android")) {
            gVar = null;
        }
        if (gVar == null) {
            gVar = C23454a0.f92919a;
        }
        Object obj = gVar;
        boolean zContains = set.contains(workoutExercise.getId());
        List<WorkoutSet> sets = workoutExercise.getSets();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sets, 10));
        int i15 = 0;
        for (Object obj2 : sets) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(m123994j((WorkoutSet) obj2, i15, i13, workoutExercise.getExercise().getVolumeInputFormat(), z4 && i15 == AbstractC37056f.m118951C(workoutExercise.getSets())));
            i15 = i16;
        }
        return new AbstractC27407m.b.a(id4, textResourceM21278l, c8689c, imageUrl, null, drag, c17660g, obj, zContains, new InterfaceC27402h.b(arrayList, this.unitSystem, AbstractC8693b.m21277k(workoutExercise.getExercise().getVolumeInputFormat() == VolumeInputFormat.Time ? AbstractC16277f.f62351m0 : AbstractC16277f.f62347l0), workoutExercise.getExercise().getRepsWeightInfoText(), false, true, false, false, false, new C17657d(i13), null, new InterfaceC17655b.a(i13, i14), 464, null), false, 1040, null);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC38658d.c m123993i(InterfaceC37645a.c cVar) {
        if (AbstractC22676k.m65745e(cVar, InterfaceC37645a.h.f161260a)) {
            return InterfaceC38658d.c.INSTANCE.m123980b();
        }
        if (cVar instanceof InterfaceC37645a.l) {
            return InterfaceC38658d.c.m123969i(InterfaceC38658d.c.INSTANCE.m123985g(), null, null, false, null, null, m123990f(((InterfaceC37645a.l) cVar).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()), null, null, 223, null);
        }
        if (cVar instanceof InterfaceC37645a.j) {
            return InterfaceC38658d.c.m123969i(InterfaceC38658d.c.INSTANCE.m123981c(), null, null, false, null, null, m123990f(((InterfaceC37645a.j) cVar).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()), null, null, 223, null);
        }
        if (cVar instanceof InterfaceC37645a.n) {
            return InterfaceC38658d.c.m123969i(InterfaceC38658d.c.INSTANCE.m123984f(), null, null, false, null, null, null, null, new InterfaceC17655b.n(((InterfaceC37645a.n) cVar).getIsCopyFlow()), 127, null);
        }
        if (cVar instanceof InterfaceC37645a.m) {
            return InterfaceC38658d.c.m123969i(InterfaceC38658d.c.INSTANCE.m123983e(), null, null, false, null, null, null, null, InterfaceC17655b.b.f68492w, 127, null);
        }
        if (cVar instanceof InterfaceC37645a.g) {
            return InterfaceC38658d.c.m123969i(InterfaceC38658d.c.INSTANCE.m123984f(), null, null, false, null, null, null, null, InterfaceC17655b.e.f68495w, 127, null);
        }
        if (cVar instanceof InterfaceC37645a.f) {
            return InterfaceC38658d.c.m123969i(InterfaceC38658d.c.INSTANCE.m123983e(), null, null, false, null, null, null, null, InterfaceC17655b.h.f68497w, 127, null);
        }
        if (cVar instanceof InterfaceC37645a.d) {
            return InterfaceC38658d.c.m123969i(InterfaceC38658d.c.INSTANCE.m123979a(), null, null, false, null, null, InterfaceC17655b.h.f68497w, null, null, 223, null);
        }
        if (cVar instanceof InterfaceC37645a.e) {
            return InterfaceC38658d.c.m123969i(InterfaceC38658d.c.INSTANCE.m123982d(), null, null, false, null, null, InterfaceC17655b.j.f68499w, InterfaceC17655b.b.f68492w, null, 159, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC30925i.d m123994j(WorkoutSet workoutSet, int i13, int i14, VolumeInputFormat volumeInputFormat, boolean z4) {
        return new AbstractC30925i.d(workoutSet.getId(), i13, AbstractC8693b.m21278l(String.valueOf(i13 + 1)), AbstractC8693b.m21278l(workoutSet.getNumberOfReps()), AbstractC8693b.m21278l(workoutSet.getTime()), volumeInputFormat == VolumeInputFormat.Time, AbstractC8693b.m21278l(workoutSet.getWeight()), z4 ? 7 : 6, new C17662i(i14, i13), null);
    }

    /* JADX INFO: renamed from: k */
    private final C13659p m123995k(WorkoutGroup workoutGroup, int i13, Set<UUID> set, boolean z4) {
        UUID id4 = workoutGroup.getId();
        List<WorkoutExercise> exercises = workoutGroup.getExercises();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
        int i14 = 0;
        for (Object obj : exercises) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(m123992h((WorkoutExercise) obj, i13, i14, set, z4 && i14 == AbstractC37056f.m118951C(workoutGroup.getExercises()), workoutGroup.isSuperset()));
            i14 = i15;
        }
        return new C13659p(id4, false, false, arrayList, 6, null);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC38658d m123996d(C37646b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        InterfaceC37645a currentDialogType = domainState.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC37645a.c) {
            return m123993i((InterfaceC37645a.c) domainState.getCurrentDialogType());
        }
        if (currentDialogType instanceof InterfaceC37645a.k) {
            return m123991g(domainState, m123989e((InterfaceC37645a.k) domainState.getCurrentDialogType()));
        }
        if (currentDialogType == null) {
            return m123991g(domainState, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
