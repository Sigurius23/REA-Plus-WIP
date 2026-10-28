package ue0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.NavigationButtonModel;
import com.whoop.advancedlabs.domain.models.TestResultBottomSheet;
import com.whoop.advancedlabs.domain.models.TestResultBottomSheetItem;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DialogButton;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import re0.AbstractC31312b;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import te0.AbstractC33749h;
import te0.C33742a;
import te0.C33743b;
import te0.C33744c;
import te0.C33746e;

/* JADX INFO: renamed from: ue0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lue0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lre0/b$e;", "Lte0/h$e;", "d", "(Lre0/b$e;)Lte0/h$e;", "Lcom/whoop/design/models/modal/DialogModel;", "Lte0/e;", "c", "(Lcom/whoop/design/models/modal/DialogModel;)Lte0/e;", "Lec3/l;", "Lre0/b;", "upstream", "Lte0/h;", "b", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34857a {

    /* JADX INFO: renamed from: b */
    public static final int f146803b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: ue0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f146805w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34857a f146806x;

        /* JADX INFO: renamed from: ue0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42458a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f146807w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34857a f146808x;

            /* JADX INFO: renamed from: ue0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.presentation.reducers.TestResultsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "TestResultsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42459a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f146809E;

                /* JADX INFO: renamed from: F */
                Object f146810F;

                /* JADX INFO: renamed from: G */
                Object f146811G;

                /* JADX INFO: renamed from: H */
                int f146812H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f146813w;

                /* JADX INFO: renamed from: x */
                int f146814x;

                /* JADX INFO: renamed from: y */
                Object f146815y;

                public C42459a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f146813w = obj;
                    this.f146814x |= Integer.MIN_VALUE;
                    return C42458a.this.emit(null, this);
                }
            }

            public C42458a(InterfaceC13062m interfaceC13062m, C34857a c34857a) {
                this.f146807w = interfaceC13062m;
                this.f146808x = c34857a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42459a c42459a;
                Object objM109938d;
                if (interfaceC30057d instanceof C42459a) {
                    c42459a = (C42459a) interfaceC30057d;
                    int i13 = c42459a.f146814x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42459a.f146814x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42459a = new C42459a(interfaceC30057d);
                    }
                } else {
                    c42459a = new C42459a(interfaceC30057d);
                }
                Object obj2 = c42459a.f146813w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42459a.f146814x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f146807w;
                    AbstractC31312b abstractC31312b = (AbstractC31312b) obj;
                    if (abstractC31312b instanceof AbstractC31312b.b) {
                        objM109938d = AbstractC33749h.b.f141227b;
                    } else if (abstractC31312b instanceof AbstractC31312b.a) {
                        objM109938d = AbstractC33749h.a.f141226b;
                    } else if (abstractC31312b instanceof AbstractC31312b.d) {
                        objM109938d = AbstractC33749h.d.f141229b;
                    } else if (abstractC31312b instanceof AbstractC31312b.c) {
                        objM109938d = AbstractC33749h.c.f141228b;
                    } else if (abstractC31312b instanceof AbstractC31312b.f) {
                        objM109938d = new AbstractC33749h.f(((AbstractC31312b.f) abstractC31312b).getAction());
                    } else {
                        if (!(abstractC31312b instanceof AbstractC31312b.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM109938d = this.f146808x.m109938d((AbstractC31312b.e) abstractC31312b);
                    }
                    c42459a.f146815y = null;
                    c42459a.f146809E = null;
                    c42459a.f146810F = null;
                    c42459a.f146811G = null;
                    c42459a.f146812H = 0;
                    c42459a.f146814x = 1;
                    if (interfaceC13062m.emit(objM109938d, c42459a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C34857a c34857a) {
            this.f146805w = interfaceC13058l;
            this.f146806x = c34857a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f146805w.collect(new C42458a(interfaceC13062m, this.f146806x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C34857a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: c */
    private final C33746e m109937c(DialogModel dialogModel) {
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        TextResource textResourceM21267a3;
        String title;
        String title2;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dialogModel.getTitle());
        String description = dialogModel.getDescription();
        if (description == null || (textResourceM21267a = AbstractC8693b.m21278l(description)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        DialogButton primaryButton = dialogModel.getPrimaryButton();
        if (primaryButton == null || (title2 = primaryButton.getTitle()) == null || (textResourceM21267a2 = AbstractC8693b.m21278l(title2)) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        DialogButton secondaryButton = dialogModel.getSecondaryButton();
        if (secondaryButton == null || (title = secondaryButton.getTitle()) == null || (textResourceM21267a3 = AbstractC8693b.m21278l(title)) == null) {
            textResourceM21267a3 = AbstractC8693b.m21267a();
        }
        EnumC21213p enumC21213p = EnumC21213p.DEFAULT;
        DialogButton primaryButton2 = dialogModel.getPrimaryButton();
        C9598e destination = primaryButton2 != null ? primaryButton2.getDestination() : null;
        DialogButton secondaryButton2 = dialogModel.getSecondaryButton();
        return new C33746e(textResourceM21278l, textResourceM21267a, textResourceM21267a2, enumC39333f, textResourceM21267a3, true, true, enumC21213p, destination, secondaryButton2 != null ? secondaryButton2.getDestination() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final AbstractC33749h.e m109938d(AbstractC31312b.e eVar) {
        C33743b c33743b;
        EnumC16313m0 icon;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        C33746e c33746eM109937c;
        List<TestResultBottomSheetItem> items;
        TestResultBottomSheetItem testResultBottomSheetItem;
        EnumC16313m0 enumC16313m2;
        C33746e c33746eM109937c2;
        TestResultBottomSheet testResultBottomSheet = eVar.getResponse().getTestResultBottomSheet();
        C33744c c33744c = null;
        if (testResultBottomSheet == null || (items = testResultBottomSheet.getItems()) == null || items.size() != 1 || (testResultBottomSheetItem = (TestResultBottomSheetItem) AbstractC25265s.m74100H0(eVar.getResponse().getTestResultBottomSheet().getItems())) == null) {
            c33743b = null;
        } else {
            C9598e navigation = testResultBottomSheetItem.getNavigation();
            String title = testResultBottomSheetItem.getTitle();
            String icon2 = testResultBottomSheetItem.getIcon();
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m2 = null;
                    break;
                }
                EnumC16313m0 enumC16313m3 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m3.name(), icon2)) {
                    enumC16313m2 = enumC16313m3;
                    break;
                }
                i13++;
            }
            Action action = testResultBottomSheetItem.getAction();
            String description = testResultBottomSheetItem.getDescription();
            AnyModal dialog = testResultBottomSheetItem.getDialog();
            if (dialog != null) {
                Modal modal = dialog.getModal();
                c33746eM109937c2 = modal instanceof DialogModel ? m109937c((DialogModel) modal) : null;
            } else {
                c33746eM109937c2 = null;
            }
            c33743b = new C33743b(navigation, title, enumC16313m2, action, description, c33746eM109937c2);
        }
        String navigationTitle = eVar.getResponse().getNavigationBar().getNavigationTitle();
        if (c33743b != null) {
            icon = c33743b.getIcon();
            if (icon == null) {
                icon = EnumC16313m0.DOWNLOAD;
            }
        } else {
            NavigationButtonModel navigationRightButton = eVar.getResponse().getNavigationBar().getNavigationRightButton();
            if (navigationRightButton != null) {
                String icon3 = navigationRightButton.getIcon();
                EnumC16313m0 enumC16313m4 = EnumC16313m0.DOT_MENU;
                EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
                int length2 = enumC16313m0ArrValues2.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        enumC16313m0 = null;
                        break;
                    }
                    enumC16313m0 = enumC16313m0ArrValues2[i14];
                    if (AbstractC22676k.m65745e(enumC16313m0.name(), icon3)) {
                        break;
                    }
                    i14++;
                }
                icon = enumC16313m0 == null ? enumC16313m4 : enumC16313m0;
            } else {
                icon = null;
            }
        }
        NavigationButtonModel navigationRightButton2 = eVar.getResponse().getNavigationBar().getNavigationRightButton();
        C33742a c33742a = new C33742a(navigationTitle, icon, navigationRightButton2 != null ? navigationRightButton2.getDestination() : null);
        List<AdvancedLabsSectionModel> sections = eVar.getResponse().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(this.reducer.m60541h((AdvancedLabsSectionModel) it.next()));
        }
        TestResultBottomSheet testResultBottomSheet2 = eVar.getResponse().getTestResultBottomSheet();
        if (testResultBottomSheet2 != null) {
            List<TestResultBottomSheetItem> items2 = testResultBottomSheet2.getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items2, 10));
            for (TestResultBottomSheetItem testResultBottomSheetItem2 : items2) {
                C9598e navigation2 = testResultBottomSheetItem2.getNavigation();
                String title2 = testResultBottomSheetItem2.getTitle();
                String icon4 = testResultBottomSheetItem2.getIcon();
                EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
                int length3 = enumC16313m0ArrValues3.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length3) {
                        enumC16313m1 = null;
                        break;
                    }
                    EnumC16313m0 enumC16313m5 = enumC16313m0ArrValues3[i15];
                    if (AbstractC22676k.m65745e(enumC16313m5.name(), icon4)) {
                        enumC16313m1 = enumC16313m5;
                        break;
                    }
                    i15++;
                }
                Action action2 = testResultBottomSheetItem2.getAction();
                String description2 = testResultBottomSheetItem2.getDescription();
                AnyModal dialog2 = testResultBottomSheetItem2.getDialog();
                if (dialog2 != null) {
                    Modal modal2 = dialog2.getModal();
                    c33746eM109937c = modal2 instanceof DialogModel ? m109937c((DialogModel) modal2) : null;
                } else {
                    c33746eM109937c = null;
                }
                arrayList2.add(new C33743b(navigation2, title2, enumC16313m1, action2, description2, c33746eM109937c));
            }
            c33744c = new C33744c(arrayList2);
        }
        return new AbstractC33749h.e(c33742a, arrayList, c33744c, c33743b, eVar.getResponse().getAnalytics(), eVar.getResponse().getTestType(), null);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m109939b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    public /* synthetic */ C34857a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25448c.m74762z0() : c21535a);
    }
}
