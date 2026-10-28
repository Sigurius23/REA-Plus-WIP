package xb0;

import com.whoop.advancedlabs.domain.models.CategoricalMapping;
import com.whoop.advancedlabs.domain.models.EditBiomarkerDialog;
import com.whoop.advancedlabs.domain.models.EditBiomarkerItem;
import com.whoop.advancedlabs.domain.models.EditBiomarkersResponse;
import com.whoop.advancedlabs.domain.models.PrimaryButtonModel;
import com.whoop.advancedlabs.domain.models.TestDeletedModalItem;
import com.whoop.design.models.InfoCalloutTileModel;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17736e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import ny0.C27238a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23624f1;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import ub0.AbstractC34739d;
import wb0.AbstractC37038i;
import wb0.C37032c;
import wb0.C37033d;
import wb0.C37034e;
import wb0.C37035f;
import wb0.C37039j;
import xa0.C38136a;

/* JADX INFO: renamed from: xb0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\b\u0012\u0004\u0012\u00020&0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lxb0/a;", "", "<init>", "()V", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "response", "", "isAiConfirmation", "Lwb0/i$d;", "g", "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)Lwb0/i$d;", "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "buttonModel", "Lny0/a0;", "f", "(Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lny0/a0;", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;", "dialogModel", "Lwb0/e;", "e", "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/e;", "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;", "modalItem", "Lwb0/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)Lwb0/j;", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;", "itemModel", "Lwb0/f;", "c", "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;)Lwb0/f;", "dialog", "Lwb0/d;", "d", "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;)Lwb0/d;", "Lec3/l;", "Lub0/d;", "upstream", "Lwb0/i;", "i", "(Lec3/l;)Lec3/l;", "Ljb1/a;", "a", "Ljb1/a;", "reducer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38161a {

    /* JADX INFO: renamed from: b */
    public static final int f163412b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer = AbstractC21537c.m60554d(new C38136a(2));

    /* JADX INFO: renamed from: xb0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f163414w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38161a f163415x;

        /* JADX INFO: renamed from: xb0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42632a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f163416w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38161a f163417x;

            /* JADX INFO: renamed from: xb0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.presentation.reducers.EditBiomarkersViewStateReducer$reduce$$inlined$map$1$2", m100430f = "EditBiomarkersViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42633a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f163418E;

                /* JADX INFO: renamed from: F */
                Object f163419F;

                /* JADX INFO: renamed from: G */
                Object f163420G;

                /* JADX INFO: renamed from: H */
                int f163421H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f163422w;

                /* JADX INFO: renamed from: x */
                int f163423x;

                /* JADX INFO: renamed from: y */
                Object f163424y;

                public C42633a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f163422w = obj;
                    this.f163423x |= Integer.MIN_VALUE;
                    return C42632a.this.emit(null, this);
                }
            }

            public C42632a(InterfaceC13062m interfaceC13062m, C38161a c38161a) {
                this.f163416w = interfaceC13062m;
                this.f163417x = c38161a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42633a c42633a;
                Object objM122232g;
                if (interfaceC30057d instanceof C42633a) {
                    c42633a = (C42633a) interfaceC30057d;
                    int i13 = c42633a.f163423x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42633a.f163423x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42633a = new C42633a(interfaceC30057d);
                    }
                } else {
                    c42633a = new C42633a(interfaceC30057d);
                }
                Object obj2 = c42633a.f163422w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42633a.f163423x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f163416w;
                    AbstractC34739d abstractC34739d = (AbstractC34739d) obj;
                    if (abstractC34739d instanceof AbstractC34739d.c) {
                        objM122232g = AbstractC37038i.c.f158486b;
                    } else if (abstractC34739d instanceof AbstractC34739d.b) {
                        objM122232g = AbstractC37038i.b.f158485b;
                    } else if (abstractC34739d instanceof AbstractC34739d.e) {
                        AbstractC34739d.e eVar = (AbstractC34739d.e) abstractC34739d;
                        objM122232g = new AbstractC37038i.e(eVar.getChanges().m109678a(), eVar.getChanges().m109679b(), eVar.getChanges().m109680c(), eVar.getDestination());
                    } else if (abstractC34739d instanceof AbstractC34739d.a) {
                        objM122232g = AbstractC37038i.a.f158484b;
                    } else {
                        if (!(abstractC34739d instanceof AbstractC34739d.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC34739d.d dVar = (AbstractC34739d.d) abstractC34739d;
                        objM122232g = this.f163417x.m122232g(dVar.getResponse(), dVar.getIsAiConfirmation());
                    }
                    c42633a.f163424y = null;
                    c42633a.f163418E = null;
                    c42633a.f163419F = null;
                    c42633a.f163420G = null;
                    c42633a.f163421H = 0;
                    c42633a.f163423x = 1;
                    if (interfaceC13062m.emit(objM122232g, c42633a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C38161a c38161a) {
            this.f163414w = interfaceC13058l;
            this.f163415x = c38161a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f163414w.collect(new C42632a(interfaceC13062m, this.f163415x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c */
    private final C37035f m122228c(EditBiomarkerItem itemModel) {
        ArrayList arrayList;
        String biomarkerName = itemModel.getBiomarkerName();
        String biomarkerId = itemModel.getBiomarkerId();
        Double value = itemModel.getValue();
        String valueText = itemModel.getValueText();
        String unit = itemModel.getUnit();
        boolean included = itemModel.getIncluded();
        double minValue = itemModel.getMinValue();
        double maxValue = itemModel.getMaxValue();
        InfoCalloutTileModel infoCallout = itemModel.getInfoCallout();
        InterfaceC25312u interfaceC25312uM60541h = infoCallout != null ? this.reducer.m60541h(infoCallout) : null;
        String valueLabel = itemModel.getValueLabel();
        List<String> calculatedFromBiomarkers = itemModel.getCalculatedFromBiomarkers();
        boolean z4 = true ^ (calculatedFromBiomarkers == null || calculatedFromBiomarkers.isEmpty());
        String unitLabel = itemModel.getUnitLabel();
        String subtitle = itemModel.getSubtitle();
        String warning = itemModel.getWarning();
        String rightIcon = itemModel.getRightIcon();
        EnumC16313m0 enumC16313m0M46377b = rightIcon != null ? AbstractC16315n0.m46377b(rightIcon) : null;
        List<String> dependentOnBiomarkers = itemModel.getDependentOnBiomarkers();
        if (dependentOnBiomarkers == null) {
            dependentOnBiomarkers = C25271y.f99162w;
        }
        C37033d c37033dM122229d = m122229d(itemModel.getDependentOnBiomarkersWarning());
        List<CategoricalMapping> categoricalOptions = itemModel.getCategoricalOptions();
        if (categoricalOptions != null) {
            List<CategoricalMapping> list = categoricalOptions;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CategoricalMapping categoricalMapping = (CategoricalMapping) it.next();
                arrayList.add(new C37032c(categoricalMapping.getValue(), categoricalMapping.getValueText()));
                it = it;
                biomarkerId = biomarkerId;
                value = value;
            }
        } else {
            arrayList = null;
        }
        return new C37035f(biomarkerName, biomarkerId, value, valueText, unit, included, minValue, maxValue, interfaceC25312uM60541h, valueLabel, unitLabel, z4, subtitle, warning, enumC16313m0M46377b, dependentOnBiomarkers, c37033dM122229d, arrayList);
    }

    /* JADX INFO: renamed from: d */
    private final C37033d m122229d(EditBiomarkerDialog dialog) {
        if (dialog == null) {
            return null;
        }
        return new C37033d(dialog.getTitle(), dialog.getDescription(), dialog.getButton().getTextDisplay(), dialog.getSecondaryButton().getTextDisplay());
    }

    /* JADX INFO: renamed from: e */
    private final C37034e m122230e(EditBiomarkerDialog dialogModel) {
        return new C37034e(dialogModel.getTitle(), dialogModel.getDescription(), m122231f(dialogModel.getButton()), m122231f(dialogModel.getSecondaryButton()));
    }

    /* JADX INFO: renamed from: f */
    private final C27238a0 m122231f(PrimaryButtonModel buttonModel) {
        return new C27238a0(buttonModel.getTextDisplay(), null, null, null, 0.0f, null, null, null, false, false, 1022, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX INFO: renamed from: g */
    public final AbstractC37038i.d m122232g(EditBiomarkersResponse response, boolean isAiConfirmation) {
        C37033d c37033d;
        C37033d c37033dM122229d;
        List<String> dependentOnBiomarkers;
        List<EditBiomarkerItem> items = response.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (((EditBiomarkerItem) obj).getIncluded()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EditBiomarkerItem) it.next()).getBiomarkerId());
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList2);
        Iterator<T> it3 = response.getItems().iterator();
        while (true) {
            if (!it3.hasNext()) {
                c37033d = null;
                break;
            }
            EditBiomarkerItem editBiomarkerItem = (EditBiomarkerItem) it3.next();
            if (editBiomarkerItem.getIncluded() && (dependentOnBiomarkers = editBiomarkerItem.getDependentOnBiomarkers()) != null && !dependentOnBiomarkers.isEmpty()) {
                List<String> dependentOnBiomarkers2 = editBiomarkerItem.getDependentOnBiomarkers();
                if (!(dependentOnBiomarkers2 instanceof Collection) || !dependentOnBiomarkers2.isEmpty()) {
                    Iterator<T> it4 = dependentOnBiomarkers2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            c37033dM122229d = null;
                            break;
                            break;
                        }
                        if (!setM74103I1.contains((String) it4.next())) {
                            c37033dM122229d = m122229d(editBiomarkerItem.getDependentOnBiomarkersWarning());
                            break;
                        }
                    }
                } else {
                    c37033dM122229d = null;
                    break;
                    break;
                }
            } else {
                c37033dM122229d = null;
                break;
            }
            if (c37033dM122229d != null) {
                c37033d = c37033dM122229d;
                break;
            }
        }
        String navigationTitle = response.getNavigationTitle();
        String title = response.getTitle();
        String searchPlaceholder = response.getSearchPlaceholder();
        C17736e c17736eM68742e = AbstractC23624f1.m68742e(response.getIncludedItemsHeader());
        C17736e c17736eM68742e2 = AbstractC23624f1.m68742e(response.getNotIncludedItemsHeader());
        List<EditBiomarkerItem> items2 = response.getItems();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(items2, 10));
        Iterator<T> it5 = items2.iterator();
        while (it5.hasNext()) {
            arrayList3.add(m122228c((EditBiomarkerItem) it5.next()));
        }
        C27238a0 c27238a0M122231f = m122231f(response.getButton());
        C27238a0 c27238a0M122231f2 = m122231f(response.getBottomSheetButton());
        C37034e c37034eM122230e = m122230e(response.getExitDialog());
        C37034e c37034eM122230e2 = m122230e(response.getDeleteDialog());
        String calculationEducationTitle = response.getCalculationEducationTitle();
        String calculationEducationDescription = response.getCalculationEducationDescription();
        TestDeletedModalItem testDeletedModal = response.getTestDeletedModal();
        return new AbstractC37038i.d(navigationTitle, title, searchPlaceholder, c17736eM68742e, c17736eM68742e2, arrayList3, c27238a0M122231f, c27238a0M122231f2, c37034eM122230e, c37034eM122230e2, isAiConfirmation, calculationEducationTitle, calculationEducationDescription, testDeletedModal != null ? m122233h(testDeletedModal) : null, c37033d);
    }

    /* JADX INFO: renamed from: h */
    private final C37039j m122233h(TestDeletedModalItem modalItem) {
        String title = modalItem.getTitle();
        String description = modalItem.getDescription();
        PrimaryButtonModel primaryButton = modalItem.getPrimaryButton();
        return new C37039j(title, description, primaryButton != null ? m122231f(primaryButton) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m122234j(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m122235i(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}
