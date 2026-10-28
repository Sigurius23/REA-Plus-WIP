package gv2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.FilterItem;
import cu2.AbstractC11128h;
import fv2.C14818c;
import fv2.C14820e;
import fv2.InterfaceC14816a;
import go1.C16016a;
import gz0.AbstractC16319p0;
import hv2.C17689k;
import hy0.C17736e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import o11.AbstractC27407m;
import or2.AbstractC28188o1;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p745y81.C39336i;
import wb3.AbstractC37056f;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: gv2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010(\u001a\u00020'*\u00020\u00062\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020*¢\u0006\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lgv2/c;", "", "<init>", "()V", "Lfv2/a$a;", "fullScreenModal", "Lfv2/e;", "loaded", "Lhv2/k;", "k", "(Lfv2/a$a;Lfv2/e;)Lhv2/k;", "domainState", "l", "(Lfv2/e;)Lhv2/k;", "", "d", "(Lfv2/e;)Z", "c", "Lgv2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lfv2/e;)Lgv2/e;", "Lgv2/g;", "j", "(Lfv2/e;)Lgv2/g;", "Lgv2/f;", "i", "(Lfv2/e;)Lgv2/f;", "Lm91/u;", "g", "(Lfv2/e;)Lm91/u;", "", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "filterItems", "Lcom/whoop/design/util/TextResource;", "label", "dropDownText", "Lkotlin/Function1;", "Lgv2/a;", "onFilterItemClicked", "Lgv2/d;", "f", "(Lfv2/e;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;)Lgv2/d;", "Lfv2/c;", "e", "(Lfv2/c;)Lhv2/k;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16245c {

    /* JADX INFO: renamed from: gv2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f61750w = new a();

        /* JADX INFO: renamed from: a */
        public final long m46054a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46054a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gv2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f61751w = new b();

        /* JADX INFO: renamed from: a */
        public final long m46055a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46055a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: gv2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f61752w = new c();

        /* JADX INFO: renamed from: a */
        public final long m46056a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m46056a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m46042c(C14820e c14820e) {
        String updatedDescription = c14820e.getUpdatedDescription();
        return updatedDescription == null || updatedDescription.length() <= 5000;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m46043d(C14820e c14820e) {
        String updatedName = c14820e.getUpdatedName();
        return updatedName == null || updatedName.length() <= 55;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r36v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    private final C16246d m46044f(C14820e c14820e, List<FilterItem> list, TextResource textResource, TextResource textResource2, Function1 function1) {
        ?? arrayList;
        C39282o c39282oM125229d = C39282o.Companion.m125229d(C39282o.INSTANCE, textResource2, null, null, null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), null, 2, null), p745y81.Function1.m125323a(a.f61750w), null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388222, null);
        List listM118958J = AbstractC37056f.m118958J(new C17736e(null, null, textResource, 3, null));
        if (list != null) {
            List<FilterItem> list2 = list;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (FilterItem filterItem : list2) {
                arrayList.add(C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21278l(filterItem.getValue()), null, null, null, null, null, null, null, null, null, null, null, null, p745y81.Function1.m125323a(b.f61751w), false, false, null, false, null, null, function1.invoke(filterItem), false, null, 7331838, null));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return new C16246d(textResource, AbstractC25265s.m74129g1(listM118958J, arrayList), c39282oM125229d);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC25312u m46045g(C14820e c14820e) {
        if (c14820e.getLinkedExercise() == null) {
            return C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21277k(AbstractC11128h.f35450a1), null, null, null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), null, 2, null), p745y81.Function1.m125323a(c.f61752w), null, null, null, null, null, false, false, null, false, null, null, InterfaceC16243a.f.f61708a, false, null, 7339646, null);
        }
        return new AbstractC27407m.c.b(c14820e.getLinkedExercise().getExerciseId(), AbstractC8693b.m21278l(c14820e.getLinkedExercise().getName()), c14820e.getLinkedExercise().getImageUrl(), null, InterfaceC16243a.f.f61708a, InterfaceC16243a.p.f61717a, null, 72, null);
    }

    /* JADX INFO: renamed from: h */
    private final C16247e m46046h(C14820e c14820e) {
        return new C16247e(AbstractC28188o1.m85314d(c14820e.getUpdatedName()) && m46043d(c14820e) && (AbstractC28188o1.m85314d(c14820e.getUpdatedDescription()) || m46042c(c14820e)), null, AbstractC8693b.m21277k(c14820e.getCustomExerciseId() != null ? AbstractC11128h.f35378C1 : AbstractC11128h.f35381D1), 2, null);
    }

    /* JADX INFO: renamed from: i */
    private final C16248f m46047i(C14820e c14820e) {
        return new C16248f(AbstractC8693b.m21278l(c14820e.getUpdatedDescription()), !m46042c(c14820e), null, AbstractC8693b.m21277k(AbstractC11128h.f35523y0), null, 0, 0, 116, null);
    }

    /* JADX INFO: renamed from: j */
    private final C16249g m46048j(C14820e c14820e) {
        return new C16249g(AbstractC8693b.m21278l(c14820e.getUpdatedName()), !m46043d(c14820e), 0, AbstractC8693b.m21277k(AbstractC11128h.f35410N0), null, null, 52, null);
    }

    /* JADX INFO: renamed from: k */
    private final C17689k m46049k(InterfaceC14816a.a fullScreenModal, C14820e loaded) {
        if (fullScreenModal instanceof InterfaceC14816a.c) {
            return new C17689k(new C17689k.b(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35473h1), false, null, 6, null), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), InterfaceC16243a.b.f61704a, null, null, null, false, 242, null), null, 2, null);
        }
        if (fullScreenModal instanceof InterfaceC14816a.d) {
            return new C17689k(new C17689k.b(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35506s1), false, null, 6, null), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), InterfaceC16243a.b.f61704a, null, null, null, false, 242, null), null, 2, null);
        }
        if (fullScreenModal instanceof InterfaceC14816a.f) {
            return new C17689k(new C17689k.b(new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC11128h.f35493o0), 0L, null, 6, null), null, null, loaded.getCustomExerciseId() != null ? new InterfaceC16243a.i(((InterfaceC14816a.f) fullScreenModal).getCustomExerciseId()) : new InterfaceC16243a.j(((InterfaceC14816a.f) fullScreenModal).getCustomExerciseId()), null, null, null, false, 246, null), null, 2, null);
        }
        if (fullScreenModal instanceof InterfaceC14816a.b) {
            return new C17689k(new C17689k.b(AbstractC33208p0.c.f138471e, null, null, null, null, null, null, false, 254, null), null, 2, null);
        }
        if (fullScreenModal instanceof InterfaceC14816a.e) {
            return new C17689k(new C17689k.b(AbstractC33208p0.f.f138478e, null, null, null, null, null, InterfaceC16243a.m.f61714a, false, 190, null), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    private final C17689k m46050l(C14820e domainState) {
        TextResource textResourceM21277k;
        TextResource textResourceM21277k2;
        String value;
        String value2;
        C16249g c16249gM46048j = m46048j(domainState);
        C16248f c16248fM46047i = m46047i(domainState);
        InterfaceC25312u interfaceC25312uM46045g = m46045g(domainState);
        List<FilterItem> listM42610c = domainState.m42610c();
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35404L0);
        FilterItem selectedEquipment = domainState.getSelectedEquipment();
        if (selectedEquipment == null || (value2 = selectedEquipment.getValue()) == null || (textResourceM21277k = AbstractC8693b.m21278l(value2)) == null) {
            textResourceM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35387F1);
        }
        C16246d c16246dM46044f = m46044f(domainState, listM42610c, c8688bM21277k, textResourceM21277k, new C16016a(16));
        List<FilterItem> listM42611d = domainState.m42611d();
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC11128h.f35464e1);
        FilterItem selectedMuscleGroup = domainState.getSelectedMuscleGroup();
        if (selectedMuscleGroup == null || (value = selectedMuscleGroup.getValue()) == null || (textResourceM21277k2 = AbstractC8693b.m21278l(value)) == null) {
            textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC11128h.f35390G1);
        }
        return new C17689k(null, new C17689k.c(c16249gM46048j, c16248fM46047i, interfaceC25312uM46045g, c16246dM46044f, m46044f(domainState, listM42611d, c8688bM21277k2, textResourceM21277k2, new C16016a(17)), m46046h(domainState)), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC16243a m46051m(FilterItem it) {
        AbstractC22676k.m65750j(it, "it");
        return new InterfaceC16243a.n(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC16243a m46052n(FilterItem it) {
        AbstractC22676k.m65750j(it, "it");
        return new InterfaceC16243a.o(it);
    }

    /* JADX INFO: renamed from: e */
    public final C17689k m46053e(C14818c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return domainState.getCurrentDialogType() instanceof InterfaceC14816a.a ? m46049k((InterfaceC14816a.a) domainState.getCurrentDialogType(), domainState.getLoaded()) : m46050l(domainState.getLoaded());
    }
}
