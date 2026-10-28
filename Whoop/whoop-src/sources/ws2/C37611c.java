package ws2;

import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.ToggleContent;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponse;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sw0.AbstractC33051h;
import sw0.C33050g;
import sw0.C33052i;
import sw0.C33053j;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ws2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u0002¢\u0006\u0004\b5\u0010+J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u0002¢\u0006\u0004\b6\u0010+J\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0014\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, m65681d2 = {"Lws2/c;", "Lod1/g;", "Lws2/i;", "Lws2/d;", "Lws2/b;", "apiInteractor", "Lws2/f;", "progressHelper", "<init>", "(Lws2/b;Lws2/f;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "previousState", "", "isRemoving", "v", "(Lws2/d;Z)Lws2/d;", "Lws2/i$d;", "action", "Lws2/e;", "u", "(Lws2/i$d;)Lec3/l;", "Lws2/i$m;", "F", "(Lws2/i$m;)Lec3/l;", "Lws2/i$i;", "B", "(Lws2/i$i;)Lec3/l;", "Lws2/i$l;", "E", "(Lws2/i$l;)Lec3/l;", "Lws2/i$h;", "A", "(Lws2/i$h;)Lec3/l;", "Lws2/i$f;", "y", "(Lws2/i$f;)Lec3/l;", "Lws2/i$c;", "t", "(Lws2/i$c;)Lec3/l;", "x", "()Lec3/l;", "Lws2/i$b;", "s", "(Lws2/i$b;)Lec3/l;", "Lws2/i$n;", "G", "(Lws2/i$n;)Lec3/l;", "Lws2/i$k;", "D", "(Lws2/i$k;)Lec3/l;", "z", "C", "Lws2/i$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lws2/i$a;)Lec3/l;", "a", "Lws2/b;", "b", "Lws2/f;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37611c implements InterfaceC27844g<AbstractC37617i, C37612d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37610b apiInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37614f progressHelper;

    /* JADX INFO: renamed from: ws2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanDomainCombiner$interact$$inlined$flatMapLatest$1", m100430f = "CustomizePlanDomainCombiner.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f160893w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f160894x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f160895y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37611c f160896z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C37611c c37611c) {
            super(3, interfaceC30057d);
            this.f160896z = c37611c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC37617i abstractC37617i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f160896z);
            aVar.f160894x = interfaceC13062m;
            aVar.f160895y = abstractC37617i;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM120774w;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160893w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f160894x;
                AbstractC37617i abstractC37617i = (AbstractC37617i) this.f160895y;
                if (abstractC37617i instanceof AbstractC37617i.d) {
                    interfaceC13058lM120774w = this.f160896z.m120772u((AbstractC37617i.d) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.i) {
                    interfaceC13058lM120774w = this.f160896z.m120748B((AbstractC37617i.i) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.f) {
                    interfaceC13058lM120774w = this.f160896z.m120776y((AbstractC37617i.f) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.h) {
                    interfaceC13058lM120774w = this.f160896z.m120747A((AbstractC37617i.h) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.m) {
                    interfaceC13058lM120774w = this.f160896z.m120752F((AbstractC37617i.m) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.l) {
                    interfaceC13058lM120774w = this.f160896z.m120751E((AbstractC37617i.l) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.c) {
                    interfaceC13058lM120774w = this.f160896z.m120771t((AbstractC37617i.c) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.e) {
                    interfaceC13058lM120774w = this.f160896z.m120775x();
                } else if (abstractC37617i instanceof AbstractC37617i.b) {
                    interfaceC13058lM120774w = this.f160896z.m120770s((AbstractC37617i.b) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.n) {
                    interfaceC13058lM120774w = this.f160896z.m120753G((AbstractC37617i.n) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.k) {
                    interfaceC13058lM120774w = this.f160896z.m120750D((AbstractC37617i.k) abstractC37617i);
                } else if (abstractC37617i instanceof AbstractC37617i.g) {
                    interfaceC13058lM120774w = this.f160896z.m120777z();
                } else if (abstractC37617i instanceof AbstractC37617i.j) {
                    interfaceC13058lM120774w = this.f160896z.m120749C();
                } else {
                    if (!(abstractC37617i instanceof AbstractC37617i.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM120774w = this.f160896z.m120774w((AbstractC37617i.a) abstractC37617i);
                }
                this.f160894x = null;
                this.f160895y = null;
                this.f160893w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM120774w, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC37617i) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ws2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanDomainCombiner$interact$2", m100430f = "CustomizePlanDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lws2/d;", "previousState", "Lws2/e;", "action", "<anonymous>", "(Lws2/d;Lws2/e;)Lws2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f160897w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f160898x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f160899y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C37612d c37612d, AbstractC37613e abstractC37613e, InterfaceC30057d<? super C37612d> interfaceC30057d) {
            b bVar = C37611c.this.new b(interfaceC30057d);
            bVar.f160898x = c37612d;
            bVar.f160899y = abstractC37613e;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:336:0x09d4  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v37, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r12v21 */
        /* JADX WARN: Type inference failed for: r12v25 */
        /* JADX WARN: Type inference failed for: r12v27 */
        /* JADX WARN: Type inference failed for: r3v111 */
        /* JADX WARN: Type inference failed for: r3v112 */
        /* JADX WARN: Type inference failed for: r3v113 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v34 */
        /* JADX WARN: Type inference failed for: r3v56 */
        /* JADX WARN: Type inference failed for: r3v57 */
        /* JADX WARN: Type inference failed for: r3v58 */
        /* JADX WARN: Type inference failed for: r3v63 */
        /* JADX WARN: Type inference failed for: r3v81 */
        /* JADX WARN: Type inference failed for: r3v82 */
        /* JADX WARN: Type inference failed for: r3v83 */
        /* JADX WARN: Type inference failed for: r3v88 */
        /* JADX WARN: Type inference failed for: r4v0, types: [m83.y] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v44 */
        /* JADX WARN: Type inference failed for: r4v45 */
        /* JADX WARN: Type inference failed for: r4v53, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v54 */
        /* JADX WARN: Type inference failed for: r4v70 */
        /* JADX WARN: Type inference failed for: r4v81 */
        /* JADX WARN: Type inference failed for: r4v85, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r9v39, types: [java.util.List] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ?? r10;
            ArrayList arrayList;
            ToggleContent toggleContentCopy$default;
            boolean zBooleanValue;
            List<GoalSettingsTileModel> topInitialToggles;
            List<GoalSettingsTileModel> initialToggles;
            Boolean boolIsAvoidChecked;
            List<GoalSettingsTileModel> topInitialToggles2;
            String str;
            CustomizeBottomSheetSelectorModel bottomSheet;
            List<String> categories;
            ?? r14;
            boolean z4;
            Object next;
            List<GoalSettingsTileModel> topInitialToggles3;
            CustomizeBottomSheetSelectorModel bottomSheet2;
            C33050g c33050gM104642c;
            ToggleContent toggles;
            List<GoalSettingsTileModel> initialToggles2;
            ?? r15;
            CustomizeBottomSheetSelectorModel bottomSheet3;
            C33050g c33050gM104642c2;
            ToggleContent toggles2;
            ToggleContent toggles3;
            List<GoalSettingsTileModel> topInitialToggles4;
            ToggleContent toggleContentCopy$default2;
            ?? r16;
            C33050g c33050g;
            ToggleContent toggles4;
            CustomizeBottomSheetSelectorModel bottomSheet4;
            ToggleContent toggles5;
            List<GoalSettingsTileModel> initialToggles3;
            C37612d c37612d = (C37612d) this.f160898x;
            AbstractC37613e abstractC37613e = (AbstractC37613e) this.f160899y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f160897w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC37613e instanceof AbstractC37613e.e) {
                return C37612d.m120779b(c37612d, new AbstractC37616h.b(((AbstractC37613e.e) abstractC37613e).m120789a()), null, null, null, 14, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.c) {
                AbstractC37613e.c cVar = (AbstractC37613e.c) abstractC37613e;
                return C37612d.m120779b(c37612d, new AbstractC37616h.a(cVar.getId(), cVar.getTargetGoalType()), null, null, null, 14, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.j) {
                AbstractC37613e.j jVar = (AbstractC37613e.j) abstractC37613e;
                return C37612d.m120779b(c37612d, new AbstractC37616h.f(jVar.getId(), jVar.getConfirmTarget()), null, null, null, 14, null);
            }
            boolean z13 = abstractC37613e instanceof AbstractC37613e.m;
            ?? arrayList2 = C25271y.f99162w;
            boolean z14 = false;
            int i13 = 10;
            if (z13) {
                AbstractC37613e.m mVar = (AbstractC37613e.m) abstractC37613e;
                WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) AbstractC25265s.m74102I0(0, mVar.getResult().getScreens());
                if (weeklyPlanCustomizationScreenModel != null && (toggles5 = weeklyPlanCustomizationScreenModel.getToggles()) != null && (initialToggles3 = toggles5.getInitialToggles()) != null) {
                    List<GoalSettingsTileModel> list = initialToggles3;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((GoalSettingsTileModel) it.next()).getId());
                    }
                }
                ?? r17 = arrayList2;
                AbstractC37616h.i iVar = AbstractC37616h.i.f160944a;
                C37615g c37615g = new C37615g(0, mVar.getResult().getScreens().size(), false, 4, null);
                WeeklyPlanCustomizationResponse result = mVar.getResult();
                WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel2 = (WeeklyPlanCustomizationScreenModel) AbstractC25265s.m74102I0(0, mVar.getResult().getScreens());
                if (weeklyPlanCustomizationScreenModel2 == null || (toggles4 = weeklyPlanCustomizationScreenModel2.getToggles()) == null || (bottomSheet4 = toggles4.getBottomSheet()) == null || (c33050g = AbstractC33051h.m104642c(bottomSheet4, null, false, r17, 3, null)) == null) {
                    c33050g = new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
                }
                return c37612d.m120780a(iVar, c37615g, result, c33050g);
            }
            if (abstractC37613e instanceof AbstractC37613e.l) {
                return C37612d.m120779b(c37612d, new AbstractC37616h.h(c37612d.getProgressResult().getIsAtEnd()), null, null, null, 14, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.k) {
                return c37612d.getProgressResult().getIsAtEnd() ? C37612d.m120779b(c37612d, AbstractC37616h.g.f160942a, null, null, null, 14, null) : C37611c.this.m120773v(c37612d, false);
            }
            if (abstractC37613e instanceof AbstractC37613e.h) {
                return C37612d.m120779b(c37612d, new AbstractC37616h.e(c37612d.getProgressResult().getIsAtEnd()), null, null, null, 14, null);
            }
            int i14 = 1;
            if (abstractC37613e instanceof AbstractC37613e.g) {
                return c37612d.getProgressResult().getIsAtEnd() ? C37612d.m120779b(c37612d, AbstractC37616h.d.f160938a, null, null, null, 14, null) : C37611c.this.m120773v(c37612d, true);
            }
            List<GoalSettingsTileModel> initialToggles4 = null;
            if (abstractC37613e instanceof AbstractC37613e.q) {
                WeeklyPlanCustomizationResponse response = c37612d.getResponse();
                List<WeeklyPlanCustomizationScreenModel> screens = c37612d.getResponse().getScreens();
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(screens, 10));
                for (WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModelCopy$default : screens) {
                    AbstractC37613e.q qVar = (AbstractC37613e.q) abstractC37613e;
                    if (qVar.getGoalTypeEnum() == weeklyPlanCustomizationScreenModelCopy$default.getGoal()) {
                        SliderContent slider = weeklyPlanCustomizationScreenModelCopy$default.getSlider();
                        weeklyPlanCustomizationScreenModelCopy$default = WeeklyPlanCustomizationScreenModel.copy$default(weeklyPlanCustomizationScreenModelCopy$default, null, slider != null ? SliderContent.copy$default(slider, null, 0.0d, null, qVar.getValue(), null, null, null, null, null, null, null, 2039, null) : null, null, null, null, null, null, null, null, null, null, null, 4093, null);
                    }
                    arrayList3.add(weeklyPlanCustomizationScreenModelCopy$default);
                }
                return C37612d.m120779b(c37612d, null, null, WeeklyPlanCustomizationResponse.copy$default(response, null, arrayList3, 1, null), null, 11, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.o) {
                WeeklyPlanCustomizationResponse response2 = c37612d.getResponse();
                List<WeeklyPlanCustomizationScreenModel> screens2 = c37612d.getResponse().getScreens();
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(screens2, 10));
                for (WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModelCopy$default2 : screens2) {
                    AbstractC37613e.o oVar = (AbstractC37613e.o) abstractC37613e;
                    if (oVar.getGoalTypeEnum() == weeklyPlanCustomizationScreenModelCopy$default2.getGoal()) {
                        ToggleContent toggles6 = weeklyPlanCustomizationScreenModelCopy$default2.getToggles();
                        if (toggles6 != null) {
                            List<GoalSettingsTileModel> topInitialToggles5 = weeklyPlanCustomizationScreenModelCopy$default2.getToggles().getTopInitialToggles();
                            if (topInitialToggles5 == null) {
                                r16 = topInitialToggles5;
                                r16 = arrayList2;
                            }
                            r16 = topInitialToggles5;
                            Iterable<GoalSettingsTileModel> iterable = (Iterable) r16;
                            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable, i13));
                            for (GoalSettingsTileModel goalSettingsTileModelCopy$default : iterable) {
                                if (AbstractC22676k.m65745e(oVar.getId(), goalSettingsTileModelCopy$default.getId())) {
                                    goalSettingsTileModelCopy$default = GoalSettingsTileModel.copy$default(goalSettingsTileModelCopy$default, null, null, null, null, null, oVar.getIsToggled() ? new Integer(oVar.getSelectedDay()) : null, null, Boolean.valueOf(oVar.getIsAvoid()), oVar.getId(), null, null, 1631, null);
                                }
                                arrayList5.add(goalSettingsTileModelCopy$default);
                            }
                            List<GoalSettingsTileModel> initialToggles5 = weeklyPlanCustomizationScreenModelCopy$default2.getToggles().getInitialToggles();
                            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(initialToggles5, i13));
                            for (GoalSettingsTileModel goalSettingsTileModelCopy$default2 : initialToggles5) {
                                if (AbstractC22676k.m65745e(oVar.getId(), goalSettingsTileModelCopy$default2.getId())) {
                                    goalSettingsTileModelCopy$default2 = GoalSettingsTileModel.copy$default(goalSettingsTileModelCopy$default2, null, null, null, null, null, oVar.getIsToggled() ? new Integer(oVar.getSelectedDay()) : null, null, Boolean.valueOf(oVar.getIsAvoid()), oVar.getId(), null, null, 1631, null);
                                }
                                arrayList6.add(goalSettingsTileModelCopy$default2);
                            }
                            toggleContentCopy$default2 = ToggleContent.copy$default(toggles6, null, arrayList5, null, null, arrayList6, null, null, null, 237, null);
                        } else {
                            toggleContentCopy$default2 = null;
                        }
                        weeklyPlanCustomizationScreenModelCopy$default2 = WeeklyPlanCustomizationScreenModel.copy$default(weeklyPlanCustomizationScreenModelCopy$default2, null, null, toggleContentCopy$default2, null, null, null, null, null, null, null, null, null, 4091, null);
                    }
                    arrayList4.add(weeklyPlanCustomizationScreenModelCopy$default2);
                    i13 = 10;
                    i14 = 1;
                }
                return C37612d.m120779b(c37612d, null, null, WeeklyPlanCustomizationResponse.copy$default(response2, null, arrayList4, i14, null), null, 11, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.d) {
                C37615g c37615gM120802a = C37611c.this.progressHelper.m120802a(c37612d.getProgressResult(), 1);
                WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel3 = (WeeklyPlanCustomizationScreenModel) AbstractC25265s.m74102I0(c37615gM120802a.getCurrentStepIndex(), c37612d.getResponse().getScreens());
                if (weeklyPlanCustomizationScreenModel3 == null || (toggles3 = weeklyPlanCustomizationScreenModel3.getToggles()) == null) {
                    r15 = 0;
                } else {
                    topInitialToggles4 = toggles3.getTopInitialToggles();
                }
                if (r15 == 0) {
                    r15 = topInitialToggles4;
                    r15 = arrayList2;
                }
                r15 = topInitialToggles4;
                Collection collection = (Collection) r15;
                WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel4 = (WeeklyPlanCustomizationScreenModel) AbstractC25265s.m74102I0(c37615gM120802a.getCurrentStepIndex(), c37612d.getResponse().getScreens());
                if (weeklyPlanCustomizationScreenModel4 != null && (toggles2 = weeklyPlanCustomizationScreenModel4.getToggles()) != null) {
                    initialToggles4 = toggles2.getInitialToggles();
                }
                if (initialToggles4 != null) {
                    arrayList2 = initialToggles4;
                }
                ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(collection, (Iterable) arrayList2);
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74129g1, 10));
                Iterator it3 = arrayListM74129g1.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((GoalSettingsTileModel) it3.next()).getId());
                }
                AbstractC37616h.i iVar2 = AbstractC37616h.i.f160944a;
                ToggleContent toggles7 = c37612d.getResponse().getScreens().get(c37615gM120802a.getCurrentStepIndex()).getToggles();
                return C37612d.m120779b(c37612d, iVar2, c37615gM120802a, null, (toggles7 == null || (bottomSheet3 = toggles7.getBottomSheet()) == null || (c33050gM104642c2 = AbstractC33051h.m104642c(bottomSheet3, null, false, arrayList7, 3, null)) == null) ? new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : c33050gM104642c2, 4, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.a) {
                C37615g c37615gM120802a2 = C37611c.this.progressHelper.m120802a(c37612d.getProgressResult(), ((AbstractC37613e.a) abstractC37613e).getChange());
                WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel5 = (WeeklyPlanCustomizationScreenModel) AbstractC25265s.m74102I0(c37615gM120802a2.getCurrentStepIndex(), c37612d.getResponse().getScreens());
                if (weeklyPlanCustomizationScreenModel5 != null && (toggles = weeklyPlanCustomizationScreenModel5.getToggles()) != null && (initialToggles2 = toggles.getInitialToggles()) != null) {
                    List<GoalSettingsTileModel> list2 = initialToggles2;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((GoalSettingsTileModel) it4.next()).getId());
                    }
                }
                ?? r18 = arrayList2;
                AbstractC37616h.i iVar3 = AbstractC37616h.i.f160944a;
                ToggleContent toggles8 = c37612d.getResponse().getScreens().get(c37615gM120802a2.getCurrentStepIndex()).getToggles();
                return C37612d.m120779b(c37612d, iVar3, c37615gM120802a2, null, (toggles8 == null || (bottomSheet2 = toggles8.getBottomSheet()) == null || (c33050gM104642c = AbstractC33051h.m104642c(bottomSheet2, null, false, r18, 3, null)) == null) ? new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : c33050gM104642c, 4, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.f) {
                int currentStepIndex = c37612d.getProgressResult().getCurrentStepIndex();
                ToggleContent toggles9 = c37612d.getResponse().getScreens().get(currentStepIndex).getToggles();
                if (toggles9 != null) {
                    topInitialToggles3 = toggles9.getTopInitialToggles();
                } else {
                    r14 = 0;
                }
                if (r14 == 0) {
                    r14 = topInitialToggles3;
                    r14 = arrayList2;
                }
                r14 = topInitialToggles3;
                Collection collection2 = (Collection) r14;
                ToggleContent toggles10 = c37612d.getResponse().getScreens().get(currentStepIndex).getToggles();
                List<GoalSettingsTileModel> initialToggles6 = toggles10 != null ? toggles10.getInitialToggles() : null;
                if (initialToggles6 != null) {
                    arrayList2 = initialToggles6;
                }
                ArrayList<GoalSettingsTileModel> arrayListM74129g2 = AbstractC25265s.m74129g1(collection2, (Iterable) arrayList2);
                ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74129g2, 10));
                for (GoalSettingsTileModel goalSettingsTileModel : arrayListM74129g2) {
                    arrayList8.add(new C23465k(goalSettingsTileModel.getId(), goalSettingsTileModel.getSelectedValue()));
                }
                List<C33052i> listM104635j = c37612d.getCurrentBottomSheet().m104635j();
                ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(listM104635j, 10));
                for (C33052i c33052i : listM104635j) {
                    int groupPriority = c33052i.getGroupPriority();
                    List<C33053j> listM104651f = c33052i.m104651f();
                    ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
                    for (C33053j c33053j : listM104651f) {
                        if (arrayList8.isEmpty()) {
                            z4 = false;
                            break;
                        }
                        Iterator it5 = arrayList8.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z4 = false;
                                break;
                            }
                            if (AbstractC22676k.m65745e(((C23465k) it5.next()).f92937w, c33053j.getId())) {
                                z4 = true;
                                break;
                            }
                        }
                        Iterator it6 = arrayList8.iterator();
                        do {
                            if (!it6.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it6.next();
                        } while (!AbstractC22676k.m65745e(((C23465k) next).f92937w, c33053j.getId()));
                        C23465k c23465k = (C23465k) next;
                        arrayList10.add(c33053j.m104653d((65531 & 1) != 0 ? c33053j.id : null, (65531 & 2) != 0 ? c33053j.title : null, (65531 & 4) != 0 ? c33053j.isSelected : z4, (65531 & 8) != 0 ? c33053j.sortPriority : 0, (65531 & 16) != 0 ? c33053j.selectedValue : c23465k != null ? (Integer) c23465k.f92938x : null, (65531 & 32) != 0 ? c33053j.categories : null, (65531 & 64) != 0 ? c33053j.iconUrl : null, (65531 & 128) != 0 ? c33053j.subtitle : null, (65531 & 256) != 0 ? c33053j.avoidanceText : null, (65531 & 512) != 0 ? c33053j.trend : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33053j.style : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33053j.dayOptions : null, (65531 & 4096) != 0 ? c33053j.bottomSheetInfo : null, (65531 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33053j.weeklyPlanGoal : false, (65531 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33053j.tag : null, (65531 & 32768) != 0 ? c33053j.isCustom : false));
                    }
                    arrayList9.add(C33052i.m104646b(c33052i, null, groupPriority, arrayList10, null, 9, null));
                }
                C33050g currentBottomSheet = c37612d.getCurrentBottomSheet();
                ArrayList arrayList11 = new ArrayList(AbstractC25267u.m74163i0(arrayList8, 10));
                Iterator it7 = arrayList8.iterator();
                while (it7.hasNext()) {
                    arrayList11.add((String) ((C23465k) it7.next()).f92937w);
                }
                return C37612d.m120779b(c37612d, null, null, null, C33050g.m104626b(currentBottomSheet, null, null, null, null, null, arrayList9, null, arrayList11, null, null, null, null, 3935, null), 7, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.b) {
                ToggleContent toggles11 = c37612d.getResponse().getScreens().get(c37612d.getProgressResult().getCurrentStepIndex()).getToggles();
                if (toggles11 == null || (bottomSheet = toggles11.getBottomSheet()) == null || (categories = bottomSheet.getCategories()) == null || (str = categories.get(((AbstractC37613e.b) abstractC37613e).getCategoryIndex())) == null) {
                    str = "";
                }
                return C37612d.m120779b(c37612d, null, null, null, C33050g.m104626b(c37612d.getCurrentBottomSheet(), null, null, null, null, str, null, null, null, null, null, null, null, 4079, null), 7, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.p) {
                return C37612d.m120779b(c37612d, null, null, null, C33050g.m104626b(c37612d.getCurrentBottomSheet(), null, ((AbstractC37613e.p) abstractC37613e).getQuery(), null, null, null, null, null, null, null, null, null, null, 4093, null), 7, null);
            }
            if (abstractC37613e instanceof AbstractC37613e.n) {
                List<C33052i> listM104635j2 = c37612d.getCurrentBottomSheet().m104635j();
                int i15 = 10;
                ArrayList arrayList12 = new ArrayList(AbstractC25267u.m74163i0(listM104635j2, 10));
                for (C33052i c33052i2 : listM104635j2) {
                    List<C33053j> listM104651f2 = c33052i2.m104651f();
                    ArrayList arrayList13 = new ArrayList(AbstractC25267u.m74163i0(listM104651f2, i15));
                    for (C33053j c33053jM104653d : listM104651f2) {
                        if (AbstractC22676k.m65745e(c33053jM104653d.getId(), ((AbstractC37613e.n) abstractC37613e).getId())) {
                            boolean isSelected = c33053jM104653d.getIsSelected();
                            c33053jM104653d = c33053jM104653d.m104653d((65531 & 1) != 0 ? c33053jM104653d.id : null, (65531 & 2) != 0 ? c33053jM104653d.title : null, (65531 & 4) != 0 ? c33053jM104653d.isSelected : !isSelected, (65531 & 8) != 0 ? c33053jM104653d.sortPriority : 0, (65531 & 16) != 0 ? c33053jM104653d.selectedValue : !isSelected ? new Integer(1) : null, (65531 & 32) != 0 ? c33053jM104653d.categories : null, (65531 & 64) != 0 ? c33053jM104653d.iconUrl : null, (65531 & 128) != 0 ? c33053jM104653d.subtitle : null, (65531 & 256) != 0 ? c33053jM104653d.avoidanceText : null, (65531 & 512) != 0 ? c33053jM104653d.trend : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33053jM104653d.style : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33053jM104653d.dayOptions : null, (65531 & 4096) != 0 ? c33053jM104653d.bottomSheetInfo : null, (65531 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33053jM104653d.weeklyPlanGoal : false, (65531 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33053jM104653d.tag : null, (65531 & 32768) != 0 ? c33053jM104653d.isCustom : false);
                        }
                        arrayList13.add(c33053jM104653d);
                    }
                    arrayList12.add(C33052i.m104646b(c33052i2, null, 0, arrayList13, null, 11, null));
                    i15 = 10;
                }
                return C37612d.m120779b(c37612d, null, null, null, C33050g.m104626b(c37612d.getCurrentBottomSheet(), null, null, null, null, null, arrayList12, null, null, null, null, null, null, 4063, null), 7, null);
            }
            if (!(abstractC37613e instanceof AbstractC37613e.i)) {
                throw new NoWhenBranchMatchedException();
            }
            int currentStepIndex2 = c37612d.getProgressResult().getCurrentStepIndex();
            ToggleContent toggles12 = c37612d.getResponse().getScreens().get(currentStepIndex2).getToggles();
            if (toggles12 != null) {
                topInitialToggles2 = toggles12.getTopInitialToggles();
            } else {
                r10 = 0;
            }
            if (r10 == 0) {
                r10 = topInitialToggles2;
                r10 = arrayList2;
            }
            r10 = topInitialToggles2;
            ToggleContent toggles13 = c37612d.getResponse().getScreens().get(currentStepIndex2).getToggles();
            List<String> topInitialToggleIds = toggles13 != null ? toggles13.getTopInitialToggleIds() : null;
            if (topInitialToggleIds != null) {
                arrayList2 = topInitialToggleIds;
            }
            ?? arrayList14 = (Collection) arrayList2;
            if (arrayList14.isEmpty()) {
                Iterable iterable2 = (Iterable) r10;
                arrayList14 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
                Iterator it8 = iterable2.iterator();
                while (it8.hasNext()) {
                    arrayList14.add(((GoalSettingsTileModel) it8.next()).getId());
                }
            }
            ArrayList arrayList15 = new ArrayList((Collection) arrayList14);
            ArrayList arrayList16 = new ArrayList();
            for (C33052i c33052i3 : c37612d.getCurrentBottomSheet().m104635j()) {
                List<C33053j> listM104651f3 = c33052i3.m104651f();
                ArrayList arrayList17 = new ArrayList();
                for (Object obj2 : listM104651f3) {
                    if (((C33053j) obj2).getIsSelected()) {
                        arrayList17.add(obj2);
                    }
                }
                arrayList16.addAll(arrayList17);
                if (c33052i3.getGroupPriority() == 0) {
                    List<C33053j> listM104651f4 = c33052i3.m104651f();
                    ArrayList arrayList18 = new ArrayList();
                    for (Object obj3 : listM104651f4) {
                        C33053j c33053j2 = (C33053j) obj3;
                        if (c33053j2.getIsSelected() && !arrayList15.contains(c33053j2.getId())) {
                            arrayList18.add(obj3);
                        }
                    }
                    ArrayList arrayList19 = new ArrayList(AbstractC25267u.m74163i0(arrayList18, 10));
                    Iterator it9 = arrayList18.iterator();
                    while (it9.hasNext()) {
                        arrayList19.add(((C33053j) it9.next()).getId());
                    }
                    arrayList15.addAll(arrayList19);
                }
            }
            ArrayList arrayList20 = new ArrayList();
            ArrayList arrayList21 = new ArrayList();
            ArrayList<GoalSettingsTileModel> arrayList22 = new ArrayList(AbstractC25267u.m74163i0(arrayList16, 10));
            Iterator it10 = arrayList16.iterator();
            while (it10.hasNext()) {
                arrayList22.add(AbstractC33051h.m104644e((C33053j) it10.next()));
            }
            for (GoalSettingsTileModel goalSettingsTileModel2 : arrayList22) {
                ToggleContent toggles14 = c37612d.getResponse().getScreens().get(currentStepIndex2).getToggles();
                if (toggles14 == null || (initialToggles = toggles14.getInitialToggles()) == null) {
                    zBooleanValue = z14;
                } else {
                    Iterator it11 = initialToggles.iterator();
                    boolean z15 = z14;
                    Object obj4 = null;
                    while (true) {
                        if (!it11.hasNext()) {
                            if (!z15) {
                                break;
                            }
                            break;
                        }
                        Object next2 = it11.next();
                        if (AbstractC22676k.m65745e(((GoalSettingsTileModel) next2).getId(), goalSettingsTileModel2.getId())) {
                            if (!z15) {
                                obj4 = next2;
                                z15 = true;
                            }
                        }
                        obj4 = null;
                        break;
                    }
                    GoalSettingsTileModel goalSettingsTileModel3 = (GoalSettingsTileModel) obj4;
                    if (goalSettingsTileModel3 == null || (boolIsAvoidChecked = goalSettingsTileModel3.isAvoidChecked()) == null) {
                        zBooleanValue = z14;
                    } else {
                        zBooleanValue = boolIsAvoidChecked.booleanValue();
                    }
                }
                ToggleContent toggles15 = c37612d.getResponse().getScreens().get(currentStepIndex2).getToggles();
                if (toggles15 != null && (topInitialToggles = toggles15.getTopInitialToggles()) != null) {
                    Iterator it12 = topInitialToggles.iterator();
                    boolean z16 = z14;
                    Object obj5 = null;
                    while (true) {
                        if (!it12.hasNext()) {
                            if (!z16) {
                                break;
                            }
                            break;
                        }
                        Object next3 = it12.next();
                        if (AbstractC22676k.m65745e(((GoalSettingsTileModel) next3).getId(), goalSettingsTileModel2.getId())) {
                            if (!z16) {
                                obj5 = next3;
                                z16 = true;
                            }
                        }
                        obj5 = null;
                        break;
                    }
                    GoalSettingsTileModel goalSettingsTileModel4 = (GoalSettingsTileModel) obj5;
                    if (goalSettingsTileModel4 != null) {
                        Boolean boolIsAvoidChecked2 = goalSettingsTileModel4.isAvoidChecked();
                        zBooleanValue = boolIsAvoidChecked2 != null ? boolIsAvoidChecked2.booleanValue() : false;
                    }
                }
                GoalSettingsTileModel goalSettingsTileModelCopy$default3 = GoalSettingsTileModel.copy$default(goalSettingsTileModel2, null, null, null, null, null, null, null, Boolean.valueOf(zBooleanValue), null, null, null, 1919, null);
                if (arrayList15.isEmpty()) {
                    arrayList20.add(goalSettingsTileModelCopy$default3);
                    break;
                }
                Iterator it13 = arrayList15.iterator();
                while (true) {
                    if (!it13.hasNext()) {
                        arrayList20.add(goalSettingsTileModelCopy$default3);
                        break;
                        break;
                    }
                    if (AbstractC22676k.m65745e((String) it13.next(), goalSettingsTileModel2.getId())) {
                        arrayList21.add(goalSettingsTileModelCopy$default3);
                        break;
                    }
                }
                z14 = false;
            }
            WeeklyPlanCustomizationResponse response3 = c37612d.getResponse();
            List<WeeklyPlanCustomizationScreenModel> screens3 = c37612d.getResponse().getScreens();
            ArrayList arrayList23 = new ArrayList(AbstractC25267u.m74163i0(screens3, 10));
            int i16 = 0;
            for (Object obj6 : screens3) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModelCopy$default3 = (WeeklyPlanCustomizationScreenModel) obj6;
                if (i16 == currentStepIndex2) {
                    ToggleContent toggles16 = c37612d.getResponse().getScreens().get(i16).getToggles();
                    if (toggles16 != null) {
                        arrayList = arrayList15;
                        toggleContentCopy$default = ToggleContent.copy$default(toggles16, null, arrayList21, null, null, arrayList20, null, null, arrayList, 109, null);
                    } else {
                        arrayList = arrayList15;
                        toggleContentCopy$default = null;
                    }
                    weeklyPlanCustomizationScreenModelCopy$default3 = WeeklyPlanCustomizationScreenModel.copy$default(weeklyPlanCustomizationScreenModelCopy$default3, null, null, toggleContentCopy$default, null, null, null, null, null, null, null, null, null, 4091, null);
                } else {
                    arrayList = arrayList15;
                }
                arrayList23.add(weeklyPlanCustomizationScreenModelCopy$default3);
                arrayList15 = arrayList;
                i16 = i17;
            }
            return C37612d.m120779b(c37612d, null, null, WeeklyPlanCustomizationResponse.copy$default(response3, null, arrayList23, 1, null), null, 11, null);
        }
    }

    public C37611c(C37610b apiInteractor, C37614f progressHelper) {
        AbstractC22676k.m65750j(apiInteractor, "apiInteractor");
        AbstractC22676k.m65750j(progressHelper, "progressHelper");
        this.apiInteractor = apiInteractor;
        this.progressHelper = progressHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final InterfaceC13058l m120747A(AbstractC37617i.h action) {
        return this.apiInteractor.interact(new C0456u(new AbstractC37609a.c(action.getId(), new ConfirmTarget.ConfirmBehaviorTarget(action.m120830d()), action.getSource()), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC13058l m120748B(AbstractC37617i.i action) {
        return this.apiInteractor.interact(new C0456u(new AbstractC37609a.c(action.getId(), new ConfirmTarget.ConfirmMetricTarget(action.getTarget(), action.getGoalTypeEnum(), action.getMigrateSmartAlarm()), action.getSource()), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final InterfaceC13058l m120749C() {
        return new C0456u(AbstractC37613e.d.f160909a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC13058l m120750D(AbstractC37617i.k action) {
        return new C0456u(new AbstractC37613e.n(action.getId()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final InterfaceC13058l m120751E(AbstractC37617i.l action) {
        return new C0456u(new AbstractC37613e.o(action.getGoalTypeEnum(), action.getId(), action.getIsToggled(), action.getIsAvoid(), action.getSelectedDay()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final InterfaceC13058l m120752F(AbstractC37617i.m action) {
        return new C0456u(new AbstractC37613e.q(action.getValue(), action.getGoalTypeEnum()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final InterfaceC13058l m120753G(AbstractC37617i.n action) {
        return new C0456u(new AbstractC37613e.p(action.getQuery()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final InterfaceC13058l m120770s(AbstractC37617i.b action) {
        return new C0456u(new AbstractC37613e.b(action.getCategoryIndex()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m120771t(AbstractC37617i.c action) {
        return this.apiInteractor.interact(new C0456u(new AbstractC37609a.a(action.getId(), action.getGoalTypeEnum(), action.getSource()), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC13058l m120772u(AbstractC37617i.d action) {
        return this.apiInteractor.interact(new C0456u(new AbstractC37609a.b(action.m120821a()), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final C37612d m120773v(C37612d previousState, boolean isRemoving) {
        List arrayList;
        CustomizeBottomSheetSelectorModel bottomSheet;
        C33050g c33050gM104642c;
        ToggleContent toggles;
        List<GoalSettingsTileModel> initialToggles;
        C37615g c37615gM120802a = this.progressHelper.m120802a(previousState.getProgressResult(), 1);
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) AbstractC25265s.m74102I0(c37615gM120802a.getCurrentStepIndex(), previousState.getResponse().getScreens());
        if (weeklyPlanCustomizationScreenModel == null || (toggles = weeklyPlanCustomizationScreenModel.getToggles()) == null || (initialToggles = toggles.getInitialToggles()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<GoalSettingsTileModel> list = initialToggles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GoalSettingsTileModel) it.next()).getId());
            }
        }
        List list2 = arrayList;
        AbstractC37616h abstractC37616h = isRemoving ? AbstractC37616h.d.f160938a : AbstractC37616h.i.f160944a;
        C37615g progressResult = isRemoving ? previousState.getProgressResult() : c37615gM120802a;
        ToggleContent toggles2 = previousState.getResponse().getScreens().get(c37615gM120802a.getCurrentStepIndex()).getToggles();
        return C37612d.m120779b(previousState, abstractC37616h, progressResult, null, (toggles2 == null || (bottomSheet = toggles2.getBottomSheet()) == null || (c33050gM104642c = AbstractC33051h.m104642c(bottomSheet, null, false, list2, 3, null)) == null) ? new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : c33050gM104642c, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final InterfaceC13058l m120774w(AbstractC37617i.a action) {
        return new C0456u(new AbstractC37613e.a(action.getChange()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final InterfaceC13058l m120775x() {
        return new C0456u(AbstractC37613e.f.f160912a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final InterfaceC13058l m120776y(AbstractC37617i.f action) {
        return this.apiInteractor.interact(new C0456u(new AbstractC37609a.c(action.getId(), new ConfirmTarget.ConfirmActivityTarget(action.m120825d()), action.getSource()), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final InterfaceC13058l m120777z() {
        return new C0456u(AbstractC37613e.i.f160915a, 1);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C37612d(null, null, null, null, 15, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new b(null));
    }
}
