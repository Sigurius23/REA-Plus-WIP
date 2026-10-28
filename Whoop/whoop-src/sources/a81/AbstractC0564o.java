package a81;

import a01.C0086f;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4354p;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.GlowModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderStyle;
import com.whoop.design.models.items.NavigationBarFixedHeader;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarStyle;
import com.whoop.design.models.items.NavigationButtonModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.models.modal.BottomSheetFixedFooter;
import com.whoop.design.models.modal.BottomSheetFixedHeader;
import com.whoop.design.models.modal.BottomSheetHeight;
import com.whoop.design.models.modal.DialogButton;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.FullScreenContentModal;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.models.modal.ModalAnalyticEventModel;
import com.whoop.design.models.modal.ModalTrackingKt;
import com.whoop.design.models.modal.ModalType;
import com.whoop.design.models.modal.ToastModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.whoopaction.domain.models.Action;
import fi0.InterfaceC14515a;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gz0.EnumC16313m0;
import io.sentry.config.AbstractC20301a;
import iy1.InterfaceC21030c;
import j02.AbstractC21170u;
import j02.C21166s;
import j11.AbstractC21211n;
import j93.InterfaceC21467g;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p003a1.C0111j;
import p004a2.C0155d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p043c4.C3948a0;
import p043c4.InterfaceC3950b0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;
import v41.AbstractC35662e;
import v41.C35666g;
import v41.EnumC35671i0;
import wb3.AbstractC37056f;
import y71.C39274g;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: a81.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a\u008f\u0001\u0010\u0010\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n28\b\u0002\u0010\u000f\u001a2\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010 \u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001ay\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b24\u0010#\u001a0\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b)\u0010*\u001a7\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00103\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100\"\u0014\u00106\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00108\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105\"\u0014\u0010:\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105\"\u0014\u0010<\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105\"\u0014\u0010>\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00105¨\u0006?"}, m65681d2 = {"Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lkotlin/Function1;", "La81/t;", "Ll83/a0;", "onEvent", "Liy1/c;", "metricWriter", "Lfi0/a;", "analyticsWriter", "Lkotlin/Function0;", "onUserDismiss", "Lkotlin/Function4;", "Lcom/whoop/design/models/modal/FullScreenContentModal;", "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;", "fullScreenContentModalContent", "P", "(Lcom/whoop/design/models/modal/AnyModal;Lkotlin/jvm/functions/Function1;Liy1/c;Lfi0/a;Lc93/a;Lc93/p;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/models/modal/DialogModel;", "dialog", "modalAnalyticEvents", "H", "(Lcom/whoop/design/models/modal/DialogModel;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/models/modal/BottomSheet;", "bottomSheet", "T", "(Lcom/whoop/design/models/modal/BottomSheet;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "Lm91/o;", "items", "Landroidx/compose/ui/Modifier;", "modifier", "y", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "fullscreen", "content", "C", "(Lcom/whoop/design/models/modal/FullScreenContentModal;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lc93/p;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/models/items/NavigationBarModel;", "navigationBar", "Lv41/g;", "d0", "(Lcom/whoop/design/models/items/NavigationBarModel;)Lv41/g;", "Lcom/whoop/design/models/modal/DialogButton;", "button", "e0", "(Lcom/whoop/design/models/modal/DialogButton;Lkotlin/jvm/functions/Function1;Lfi0/a;)V", "a", "Lcom/whoop/design/models/modal/DialogModel;", "sampleDialog", "b", "sampleDialogWithItems", "c", "Lcom/whoop/design/models/modal/BottomSheet;", "sampleBottomSheetPartial", "d", "sampleBottomSheetFull", "e", "sampleBottomSheetWithItems", "f", "sampleBottomSheetWithoutNavBar", "g", "sampleBottomSheetEmptyTitle", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0564o {

    /* JADX INFO: renamed from: a */
    private static final DialogModel f1967a;

    /* JADX INFO: renamed from: b */
    private static final DialogModel f1968b;

    /* JADX INFO: renamed from: c */
    private static final BottomSheet f1969c;

    /* JADX INFO: renamed from: d */
    private static final BottomSheet f1970d;

    /* JADX INFO: renamed from: e */
    private static final BottomSheet f1971e;

    /* JADX INFO: renamed from: f */
    private static final BottomSheet f1972f;

    /* JADX INFO: renamed from: g */
    private static final BottomSheet f1973g;

    /* JADX INFO: renamed from: a81.o$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.modal.GenericModalKt$GenericModal$2$1", m100430f = "GenericModal.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1974w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AnyModal f1975x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21030c f1976y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC14515a f1977z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AnyModal anyModal, InterfaceC21030c interfaceC21030c, InterfaceC14515a interfaceC14515a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1975x = anyModal;
            this.f1976y = interfaceC21030c;
            this.f1977z = interfaceC14515a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f1975x, this.f1976y, this.f1977z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ModalType modalTypeFromModal;
            String id4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f1974w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AnyModal anyModal = this.f1975x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (anyModal == null || (modalTypeFromModal = ModalType.INSTANCE.fromModal(anyModal.getModal())) == null) {
                return c23454a0;
            }
            Modal modal = this.f1975x.getModal();
            if (modal instanceof DialogModel) {
                id4 = ((DialogModel) modal).getId();
            } else if (modal instanceof BottomSheet) {
                id4 = ((BottomSheet) modal).getId();
            } else if (modal instanceof FullScreenContentModal) {
                id4 = ((FullScreenContentModal) modal).getId();
            } else {
                id4 = modal instanceof ToastModal ? ((ToastModal) modal).getId() : null;
            }
            if (id4 == null) {
                return c23454a0;
            }
            ModalTrackingKt.trackModalPresentedMetric(modalTypeFromModal, id4, this.f1976y);
            ModalTrackingKt.trackModalViewed(this.f1975x, this.f1977z);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: a81.o$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.modal.GenericModalKt$RenderBottomSheet$2$1", m100430f = "GenericModal.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f1978w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f1979x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ BottomSheet f1980y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C23196w3 f1981z;

        /* JADX INFO: renamed from: a81.o$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.modal.GenericModalKt$RenderBottomSheet$2$1$1", m100430f = "GenericModal.kt", m100431l = {206, 210}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f1982w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ BottomSheet f1983x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C23196w3 f1984y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BottomSheet bottomSheet, C23196w3 c23196w3, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f1983x = bottomSheet;
                this.f1984y = c23196w3;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f1983x, this.f1984y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
            
                if (r5.m67150b(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
            
                if (r5.m67155g(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
            
                return r0;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r4.f1982w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L19
                    if (r1 == r3) goto L15
                    if (r1 != r2) goto Ld
                    goto L15
                Ld:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L15:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L3c
                L19:
                    p505ts.AbstractC34132o.m107864I(r5)
                    com.whoop.design.models.modal.BottomSheet r5 = r4.f1983x
                    com.whoop.design.models.modal.BottomSheetHeight r5 = r5.getHeight()
                    com.whoop.design.models.modal.BottomSheetHeight r1 = com.whoop.design.models.modal.BottomSheetHeight.FULL
                    if (r5 != r1) goto L31
                    l1.w3 r5 = r4.f1984y
                    r4.f1982w = r3
                    java.lang.Object r5 = r5.m67150b(r4)
                    if (r5 != r0) goto L3c
                    goto L3b
                L31:
                    l1.w3 r5 = r4.f1984y
                    r4.f1982w = r2
                    java.lang.Object r5 = r5.m67155g(r4)
                    if (r5 != r0) goto L3c
                L3b:
                    return r0
                L3c:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: a81.AbstractC0564o.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2994c0 interfaceC2994c0, BottomSheet bottomSheet, C23196w3 c23196w3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1979x = interfaceC2994c0;
            this.f1980y = bottomSheet;
            this.f1981z = c23196w3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f1979x, this.f1980y, this.f1981z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f1978w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(this.f1979x, null, null, new a(this.f1980y, this.f1981z, null), 3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a81.o$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.modal.GenericModalKt$RenderBottomSheet$3$1$1", m100430f = "GenericModal.kt", m100431l = {224}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f1985E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4339a f1986F;

        /* JADX INFO: renamed from: w */
        int f1987w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f1988x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ModalAnalyticEventModel f1989y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC14515a f1990z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C23196w3 c23196w3, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f1988x = c23196w3;
            this.f1989y = modalAnalyticEventModel;
            this.f1990z = interfaceC14515a;
            this.f1985E = function1;
            this.f1986F = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f1988x, this.f1989y, this.f1990z, this.f1985E, this.f1986F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f1987w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f1988x;
                this.f1987w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC0564o.m1399U(this.f1989y, this.f1990z, this.f1985E, this.f1986F);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a81.o$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d extends C22672i implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ModalAnalyticEventModel f1991w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC14515a f1992x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f1993y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f1994z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, InterfaceC4339a interfaceC4339a) {
            super(0, AbstractC22674j.class, "dismissByUser", "RenderBottomSheet$dismissByUser(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lcom/whoop/analytics/BaseAnalytics;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", 0);
            this.f1991w = modalAnalyticEventModel;
            this.f1992x = interfaceC14515a;
            this.f1993y = function1;
            this.f1994z = interfaceC4339a;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134037invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134037invoke() {
            AbstractC0564o.m1399U(this.f1991w, this.f1992x, this.f1993y, this.f1994z);
        }
    }

    /* JADX INFO: renamed from: a81.o$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f1995w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25306o f1996x;

        public e(Function1 function1, C25306o c25306o) {
            this.f1995w = function1;
            this.f1996x = c25306o;
        }

        /* JADX INFO: renamed from: a */
        public final void m1436a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            this.f1995w.invoke(new InterfaceC0569t.b(event, this.f1996x.getState()));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1436a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a81.o$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f1997w = new f();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C25306o c25306o) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a81.o$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f1998w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f1999x;

        public g(Function1 function1, List list) {
            this.f1998w = function1;
            this.f1999x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m1438a(int i13) {
            return this.f1998w.invoke(this.f1999x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m1438a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: a81.o$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f2000w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f2001x;

        public h(List list, Function1 function1) {
            this.f2000w = list;
            this.f2001x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m1439a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C25306o c25306o = (C25306o) this.f2000w.get(i13);
            c28655q.m87150e0(1623639996);
            boolean zM87153g = c28655q.m87153g(this.f2001x) | c28655q.m87157i(c25306o);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new e(this.f2001x, c25306o);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74290q(c25306o, null, null, (Function1) objM87133R, c28655q, C25306o.f99297c, 6);
            float f13 = 4;
            AbstractC25012a.m73388u(f13, f13, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m1439a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        f1967a = new DialogModel("sample-dialog", "Sample Dialog", "This is a sample dialog with title and description", new DialogButton("Confirm", (Action) null, (C9598e) null, (AnyModal) null, (DismissEventModel) null, (AnalyticEventModel) null, 62, (DefaultConstructorMarker) null), new DialogButton("Cancel", (Action) objArr, (C9598e) objArr2, (AnyModal) objArr3, (DismissEventModel) objArr4, (AnalyticEventModel) null, 62, (DefaultConstructorMarker) null), objArr5, true, 32, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        List listM118959K = AbstractC37056f.m118959K(new HeaderModel("header-1", AbstractC8693b.m21278l("Section Header"), AbstractC8693b.m21278l("Additional information"), (TextResource) null, (TextResource) objArr6, (String) null, (String) null, (String) (0 == true ? 1 : 0), (HeaderStyle) objArr7, (String) null, (String) null, (String) null, false, (C9598e) null, (TextResource) null, 32760, defaultConstructorMarker), new DividerModel("SOLID", (String) null, AbstractC8693b.m21278l("Divider Label"), 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new HeaderModel("header-2", AbstractC8693b.m21278l("Second Section"), AbstractC8693b.m21278l("Another section"), (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, (HeaderStyle) null, (String) null, (String) null, (String) null, false, (C9598e) null, (TextResource) null, 32760, (DefaultConstructorMarker) null));
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        f1968b = new DialogModel("sample-dialog-items", "Dialog with Items", "This dialog contains custom items", new DialogButton("Continue", (Action) null, (C9598e) null, (AnyModal) (0 == true ? 1 : 0), (DismissEventModel) (0 == true ? 1 : 0), (AnalyticEventModel) (0 == true ? 1 : 0), 62, (DefaultConstructorMarker) (0 == true ? 1 : 0)), new DialogButton("Cancel", (Action) (0 == true ? 1 : 0), (C9598e) objArr8, (AnyModal) objArr9, (DismissEventModel) objArr10, (AnalyticEventModel) null, 62, (DefaultConstructorMarker) objArr11), listM118959K, true);
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CROSS;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        NavigationButtonModel navigationButtonModel = new NavigationButtonModel((String) null, enumC16313m0, (String) null, (String) objArr12, (C9598e) objArr13, (Action) (0 == true ? 1 : 0), (DismissEventModel) null, (AnyModal) objArr14, (AnalyticEventModel) objArr15, (GlowModel) objArr16, 965, (DefaultConstructorMarker) null);
        EnumC16313m0 enumC16313m1 = EnumC16313m0.SETTINGS;
        int i13 = 965;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        NavigationBarModel navigationBarModel = new NavigationBarModel("Partial Bottom Sheet", (String) null, (EnumC16313m0) (0 == true ? 1 : 0), navigationButtonModel, new NavigationButtonModel((String) null, enumC16313m1, (String) objArr17, (String) objArr18, (C9598e) objArr23, (Action) objArr24, (DismissEventModel) objArr19, (AnyModal) objArr20, (AnalyticEventModel) objArr21, (GlowModel) null, i13, (DefaultConstructorMarker) objArr22), (NavigationBarStyle) objArr25, (List) (0 == true ? 1 : 0), (NavigationBarFixedHeader) (0 == true ? 1 : 0), (String) objArr26, 486, (DefaultConstructorMarker) objArr27);
        BottomSheetHeight bottomSheetHeight = BottomSheetHeight.PARTIAL;
        C25271y c25271y = C25271y.f99162w;
        f1969c = new BottomSheet("sample-bottom-sheet-partial", navigationBarModel, c25271y, bottomSheetHeight, null, null, 48, defaultConstructorMarker);
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str = "sample-bottom-sheet-full";
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        f1970d = new BottomSheet(str, new NavigationBarModel("Full Height Bottom Sheet", (String) null, (EnumC16313m0) null, new NavigationButtonModel((String) (0 == true ? 1 : 0), enumC16313m0, (String) null, (String) objArr28, (C9598e) objArr32, (Action) objArr33, (DismissEventModel) objArr29, (AnyModal) null, (AnalyticEventModel) objArr30, (GlowModel) (0 == true ? 1 : 0), i13, (DefaultConstructorMarker) objArr31), new NavigationButtonModel((String) null, EnumC16313m0.CHECKMARK, (String) objArr34, (String) objArr38, (C9598e) objArr39, (Action) objArr35, (DismissEventModel) objArr41, (AnyModal) objArr36, (AnalyticEventModel) objArr40, (GlowModel) null, 965, (DefaultConstructorMarker) objArr37), (NavigationBarStyle) objArr42, (List) objArr45, (NavigationBarFixedHeader) objArr46, (String) objArr43, 486, (DefaultConstructorMarker) objArr44), c25271y, BottomSheetHeight.FULL, objArr47, objArr48, 48, defaultConstructorMarker2);
        String str2 = null;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        NavigationButtonModel navigationButtonModel2 = new NavigationButtonModel((String) (0 == true ? 1 : 0), enumC16313m0, (String) null, str2, (C9598e) null, (Action) null, (DismissEventModel) null, (AnyModal) null, (AnalyticEventModel) objArr49, (GlowModel) objArr50, 965, defaultConstructorMarker2);
        String str3 = null;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        NavigationBarModel navigationBarModel2 = new NavigationBarModel("Sheet with Items", str3, (EnumC16313m0) null, navigationButtonModel2, new NavigationButtonModel(str3, enumC16313m1, str2, (String) objArr54, (C9598e) objArr55, (Action) objArr56, (DismissEventModel) objArr57, (AnyModal) objArr51, (AnalyticEventModel) objArr53, (GlowModel) null, 965, (DefaultConstructorMarker) objArr52), (NavigationBarStyle) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (NavigationBarFixedHeader) (0 == true ? 1 : 0), (String) objArr58, 486, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        HeaderModel headerModel = new HeaderModel("header-1", AbstractC8693b.m21278l("First Section"), AbstractC8693b.m21278l("Section description"), (TextResource) null, (TextResource) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) objArr60, (HeaderStyle) null, (String) (0 == true ? 1 : 0), (String) null, (String) objArr61, false, (C9598e) objArr59, (TextResource) null, 32760, (DefaultConstructorMarker) null);
        DividerModel dividerModel = new DividerModel("SOLID", (String) null, AbstractC8693b.m21278l("Divider"), 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        String str4 = null;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        Object[] objArr67 = 0 == true ? 1 : 0;
        Object[] objArr68 = 0 == true ? 1 : 0;
        f1971e = new BottomSheet("sample-bottom-sheet-items", navigationBarModel2, AbstractC37056f.m118959K(headerModel, dividerModel, new HeaderModel("header-2", AbstractC8693b.m21278l("Second Section"), AbstractC8693b.m21278l("Another section"), (TextResource) objArr65, (TextResource) objArr66, (String) objArr63, (String) (0 == true ? 1 : 0), (String) objArr67, (HeaderStyle) (0 == true ? 1 : 0), (String) objArr64, str4, (String) objArr62, false, (C9598e) null, (TextResource) objArr68, 32760, (DefaultConstructorMarker) null)), bottomSheetHeight, null, null, 48, 0 == true ? 1 : 0);
        Object[] objArr69 = 0 == true ? 1 : 0;
        Object[] objArr70 = 0 == true ? 1 : 0;
        Object[] objArr71 = 0 == true ? 1 : 0;
        Object[] objArr72 = 0 == true ? 1 : 0;
        Object[] objArr73 = 0 == true ? 1 : 0;
        Object[] objArr74 = 0 == true ? 1 : 0;
        int i14 = 48;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        BottomSheetFixedHeader bottomSheetFixedHeader = null;
        BottomSheetFixedFooter bottomSheetFixedFooter = null;
        f1972f = new BottomSheet("sample-bottom-sheet-no-nav", null, AbstractC37056f.m118959K(new HeaderModel("header-1", AbstractC8693b.m21278l("Section Header"), AbstractC8693b.m21278l("Additional information"), (TextResource) objArr72, (TextResource) objArr70, (String) (0 == true ? 1 : 0), (String) objArr73, (String) (0 == true ? 1 : 0), (HeaderStyle) objArr71, str4, (String) objArr69, (String) null, false, (C9598e) objArr74, (TextResource) null, 32760, (DefaultConstructorMarker) null), new DividerModel("SOLID", (String) null, AbstractC8693b.m21278l("Divider Label"), 2, (DefaultConstructorMarker) null)), bottomSheetHeight, bottomSheetFixedHeader, bottomSheetFixedFooter, i14, defaultConstructorMarker3);
        String str5 = null;
        Object[] objArr75 = 0 == true ? 1 : 0;
        Object[] objArr76 = 0 == true ? 1 : 0;
        Object[] objArr77 = 0 == true ? 1 : 0;
        String str6 = "sample-bottom-sheet-empty-title";
        f1973g = new BottomSheet(str6, new NavigationBarModel("", (String) null, (EnumC16313m0) null, (NavigationButtonModel) null, (NavigationButtonModel) null, (NavigationBarStyle) null, (List) null, (NavigationBarFixedHeader) null, str5, 486, (DefaultConstructorMarker) (0 == true ? 1 : 0)), AbstractC37056f.m118958J(new HeaderModel("header-1", AbstractC8693b.m21278l("Content Item"), AbstractC8693b.m21278l("Empty title should hide the title bar"), (TextResource) (0 == true ? 1 : 0), (TextResource) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), str5, (HeaderStyle) null, (String) objArr77, (String) null, (String) null, false, (C9598e) objArr75, (TextResource) objArr76, 32760, defaultConstructorMarker)), bottomSheetHeight, bottomSheetFixedHeader, bottomSheetFixedFooter, i14, defaultConstructorMarker3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m1379A(Function1 function1, C25306o c25306o, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new InterfaceC0569t.b(event, c25306o.getState()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m1380B(List list, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m1434y(list, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: C */
    private static final void m1381C(FullScreenContentModal fullScreenContentModal, Function1 function1, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, InterfaceC4354p interfaceC4354p, Composer composer, int i13, int i14) {
        int i15;
        ModalAnalyticEventModel modalAnalyticEventModel2;
        int i16;
        InterfaceC14515a interfaceC14515a2;
        int i17;
        InterfaceC4354p interfaceC4354p2;
        boolean z4;
        ModalAnalyticEventModel modalAnalyticEventModel3;
        InterfaceC14515a interfaceC14515a3;
        C28677v1 c28677v1M87180u;
        boolean zM87157i;
        Object objM87133R;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1941761588);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(fullScreenContentModal) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                modalAnalyticEventModel2 = modalAnalyticEventModel;
                i15 |= c28655q.m87157i(modalAnalyticEventModel2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC14515a2 = interfaceC14515a;
                    if (c28655q.m87157i(interfaceC14515a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    interfaceC4354p2 = interfaceC4354p;
                    if (c28655q.m87157i(interfaceC4354p2)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i18;
                } else {
                    interfaceC4354p2 = interfaceC4354p;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        modalAnalyticEventModel3 = null;
                    } else {
                        modalAnalyticEventModel3 = modalAnalyticEventModel2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a2 = null;
                    }
                    zM87157i = c28655q.m87157i(modalAnalyticEventModel3) | c28655q.m87157i(interfaceC14515a2) | ((i15 & 112) == 32);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C0552c(modalAnalyticEventModel3, interfaceC14515a2, function1, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC14515a3 = interfaceC14515a2;
                    AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(false, false, false, false, 39), AbstractC37817c.m121344e(611672701, c28655q, new C0556g(interfaceC4354p2, fullScreenContentModal, modalAnalyticEventModel3, interfaceC14515a3, function1, 0)), c28655q, 432);
                } else {
                    c28655q.m87138X();
                    modalAnalyticEventModel3 = modalAnalyticEventModel2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) fullScreenContentModal, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4354p, i13, i14, 1);
                }
            }
            i15 |= 3072;
            interfaceC14515a2 = interfaceC14515a;
            if ((i13 & 24576) == 0) {
                interfaceC4354p2 = interfaceC4354p;
                if (c28655q.m87157i(interfaceC4354p2)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            } else {
                interfaceC4354p2 = interfaceC4354p;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modalAnalyticEventModel3 = null;
                } else {
                    modalAnalyticEventModel3 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a2 = null;
                }
                zM87157i = c28655q.m87157i(modalAnalyticEventModel3) | c28655q.m87157i(interfaceC14515a2) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C0552c(modalAnalyticEventModel3, interfaceC14515a2, function1, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0552c(modalAnalyticEventModel3, interfaceC14515a2, function1, 1);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC14515a3 = interfaceC14515a2;
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(false, false, false, false, 39), AbstractC37817c.m121344e(611672701, c28655q, new C0556g(interfaceC4354p2, fullScreenContentModal, modalAnalyticEventModel3, interfaceC14515a3, function1, 0)), c28655q, 432);
            } else {
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) fullScreenContentModal, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4354p, i13, i14, 1);
            }
        }
        i15 |= 384;
        modalAnalyticEventModel2 = modalAnalyticEventModel;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC14515a2 = interfaceC14515a;
                if (c28655q.m87157i(interfaceC14515a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                interfaceC4354p2 = interfaceC4354p;
                if (c28655q.m87157i(interfaceC4354p2)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            } else {
                interfaceC4354p2 = interfaceC4354p;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modalAnalyticEventModel3 = null;
                } else {
                    modalAnalyticEventModel3 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a2 = null;
                }
                zM87157i = c28655q.m87157i(modalAnalyticEventModel3) | c28655q.m87157i(interfaceC14515a2) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C0552c(modalAnalyticEventModel3, interfaceC14515a2, function1, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0552c(modalAnalyticEventModel3, interfaceC14515a2, function1, 1);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC14515a3 = interfaceC14515a2;
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(false, false, false, false, 39), AbstractC37817c.m121344e(611672701, c28655q, new C0556g(interfaceC4354p2, fullScreenContentModal, modalAnalyticEventModel3, interfaceC14515a3, function1, 0)), c28655q, 432);
            } else {
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) fullScreenContentModal, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4354p, i13, i14, 1);
            }
        }
        i15 |= 3072;
        interfaceC14515a2 = interfaceC14515a;
        if ((i13 & 24576) == 0) {
            interfaceC4354p2 = interfaceC4354p;
            if (c28655q.m87157i(interfaceC4354p2)) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i18;
        } else {
            interfaceC4354p2 = interfaceC4354p;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                modalAnalyticEventModel3 = null;
            } else {
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
            }
            if (i16 != 0) {
                interfaceC14515a2 = null;
            }
            zM87157i = c28655q.m87157i(modalAnalyticEventModel3) | c28655q.m87157i(interfaceC14515a2) | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C0552c(modalAnalyticEventModel3, interfaceC14515a2, function1, 1);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C0552c(modalAnalyticEventModel3, interfaceC14515a2, function1, 1);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC14515a3 = interfaceC14515a2;
            AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(false, false, false, false, 39), AbstractC37817c.m121344e(611672701, c28655q, new C0556g(interfaceC4354p2, fullScreenContentModal, modalAnalyticEventModel3, interfaceC14515a3, function1, 0)), c28655q, 432);
        } else {
            c28655q.m87138X();
            modalAnalyticEventModel3 = modalAnalyticEventModel2;
            interfaceC14515a3 = interfaceC14515a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f((Object) fullScreenContentModal, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4354p, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m1382D(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1) {
        ModalTrackingKt.trackModalDismissed(modalAnalyticEventModel, interfaceC14515a);
        function1.invoke(InterfaceC0569t.a.f2023a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m1383E(InterfaceC4354p interfaceC4354p, FullScreenContentModal fullScreenContentModal, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            boolean zM87157i = c28655q.m87157i(view);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0111j(view, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q);
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            interfaceC4354p.invoke(fullScreenContentModal, modalAnalyticEventModel, interfaceC14515a, function1, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m1384F(View view) {
        Window window;
        ViewParent parent = view.getParent();
        InterfaceC3950b0 interfaceC3950b0 = parent instanceof InterfaceC3950b0 ? (InterfaceC3950b0) parent : null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (interfaceC3950b0 != null && (window = interfaceC3950b0.getWindow()) != null) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m1385G(FullScreenContentModal fullScreenContentModal, Function1 function1, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, InterfaceC4354p interfaceC4354p, int i13, int i14, Composer composer, int i15) {
        m1381C(fullScreenContentModal, function1, modalAnalyticEventModel, interfaceC14515a, interfaceC4354p, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:86:0x0125  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0134  */
    /* JADX WARN: Code duplicated, block: B:93:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x014a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x015b  */
    /* JADX INFO: renamed from: H */
    private static final void m1386H(final DialogModel dialogModel, final Function1 function1, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Composer composer, int i13, int i14) {
        int i15;
        ModalAnalyticEventModel modalAnalyticEventModel2;
        int i16;
        InterfaceC14515a interfaceC14515a2;
        int i17;
        boolean z4;
        C28655q c28655q;
        ModalAnalyticEventModel modalAnalyticEventModel3;
        InterfaceC14515a interfaceC14515a3;
        C28677v1 c28677v1M87180u;
        TextResource textResourceM21278l;
        ModalAnalyticEventModel modalAnalyticEventModel4;
        final InterfaceC14515a interfaceC14515a4;
        int i18;
        boolean z13;
        boolean z14;
        Object objM87133R;
        String description;
        TextResource textResourceM21278l2;
        DialogButton primaryButton;
        TextResource textResourceM21278l3;
        DialogButton secondaryButton;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        boolean z17;
        boolean zM87157i;
        Object objM87133R3;
        boolean z18;
        boolean zM87157i2;
        Object objM87133R4;
        String title;
        String title2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(967564031);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(dialogModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                modalAnalyticEventModel2 = modalAnalyticEventModel;
                i15 |= c28655q2.m87157i(modalAnalyticEventModel2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC14515a2 = interfaceC14515a;
                    if (c28655q2.m87157i(interfaceC14515a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    textResourceM21278l = null;
                    if (i19 != 0) {
                        modalAnalyticEventModel4 = null;
                    } else {
                        modalAnalyticEventModel4 = modalAnalyticEventModel2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    boolean zM87157i3 = c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                    i18 = i15 & 112;
                    if (i18 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i3 | z13;
                    objM87133R = c28655q2.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z14 || objM87133R == c28676v0) {
                        objM87133R = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q2, 0, 1);
                    List listM60536k = C21535a.m60536k(AbstractC0568s.m1465b(), dialogModel.getItems(), null, 2, null);
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(dialogModel.getTitle());
                    description = dialogModel.getDescription();
                    if (description != null) {
                        textResourceM21278l2 = AbstractC8693b.m21278l(description);
                    } else {
                        textResourceM21278l2 = null;
                    }
                    primaryButton = dialogModel.getPrimaryButton();
                    if (primaryButton != null || (title2 = primaryButton.getTitle()) == null) {
                        textResourceM21278l3 = null;
                    } else {
                        textResourceM21278l3 = AbstractC8693b.m21278l(title2);
                    }
                    secondaryButton = dialogModel.getSecondaryButton();
                    if (secondaryButton != null && (title = secondaryButton.getTitle()) != null) {
                        textResourceM21278l = AbstractC8693b.m21278l(title);
                    }
                    boolean showCloseButton = dialogModel.getShowCloseButton();
                    boolean zM87157i4 = c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                    if (i18 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i4 | z15;
                    objM87133R2 = c28655q2.m87133R();
                    if (z16 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 0);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    boolean zM87157i5 = c28655q2.m87157i(dialogModel);
                    if (i18 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i = zM87157i5 | z17 | c28655q2.m87157i(interfaceC14515a4);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87157i || objM87133R3 == c28676v0) {
                        final int i24 = 0;
                        objM87133R3 = new InterfaceC4339a() { // from class: a81.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                    default:
                                        return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    boolean zM87157i6 = c28655q2.m87157i(dialogModel);
                    if (i18 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i2 = zM87157i6 | z18 | c28655q2.m87157i(interfaceC14515a4);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R4 == c28676v0) {
                        final int i25 = 1;
                        objM87133R4 = new InterfaceC4339a() { // from class: a81.d
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                    default:
                                        return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    }
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(960375054, c28655q2, new C0554e(listM60536k, 0, function1));
                    int i26 = TextResource.$stable;
                    int i27 = (i26 << 3) | 24576 | (i26 << 6) | (i26 << 9) | (i26 << 27);
                    modalAnalyticEventModel3 = modalAnalyticEventModel4;
                    interfaceC14515a3 = interfaceC14515a4;
                    c28655q = c28655q2;
                    AbstractC21211n.m59497o(null, textResourceM21278l4, textResourceM21278l2, textResourceM21278l3, true, null, null, null, null, textResourceM21278l, null, false, showCloseButton, null, null, false, 0, null, null, null, false, null, interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R4, null, c37816bM121344e, null, c28655q, i27, 0, 1572864, 171961825);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modalAnalyticEventModel3 = modalAnalyticEventModel2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f(dialogModel, function1, modalAnalyticEventModel3, interfaceC14515a3, i13, i14, 0);
                }
            }
            i15 |= 3072;
            interfaceC14515a2 = interfaceC14515a;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                textResourceM21278l = null;
                if (i19 != 0) {
                    modalAnalyticEventModel4 = null;
                } else {
                    modalAnalyticEventModel4 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                boolean zM87157i7 = c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                i18 = i15 & 112;
                if (i18 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i7 | z13;
                objM87133R = c28655q2.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (z14) {
                    objM87133R = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 2);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 2);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q2, 0, 1);
                List listM60536k2 = C21535a.m60536k(AbstractC0568s.m1465b(), dialogModel.getItems(), null, 2, null);
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(dialogModel.getTitle());
                description = dialogModel.getDescription();
                if (description != null) {
                    textResourceM21278l2 = AbstractC8693b.m21278l(description);
                } else {
                    textResourceM21278l2 = null;
                }
                primaryButton = dialogModel.getPrimaryButton();
                if (primaryButton != null) {
                    textResourceM21278l3 = null;
                } else {
                    textResourceM21278l3 = null;
                }
                secondaryButton = dialogModel.getSecondaryButton();
                if (secondaryButton != null) {
                    textResourceM21278l = AbstractC8693b.m21278l(title);
                }
                boolean showCloseButton2 = dialogModel.getShowCloseButton();
                boolean zM87157i8 = c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i8 | z15;
                objM87133R2 = c28655q2.m87133R();
                if (z16) {
                    objM87133R2 = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 0);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 0);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                boolean zM87157i9 = c28655q2.m87157i(dialogModel);
                if (i18 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = zM87157i9 | z17 | c28655q2.m87157i(interfaceC14515a4);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i) {
                    final int i28 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: a81.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i28) {
                                case 0:
                                    return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                default:
                                    return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    final int i29 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: a81.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i29) {
                                case 0:
                                    return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                default:
                                    return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                boolean zM87157i10 = c28655q2.m87157i(dialogModel);
                if (i18 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i2 = zM87157i10 | z18 | c28655q2.m87157i(interfaceC14515a4);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i2) {
                    final int i210 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: a81.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i210) {
                                case 0:
                                    return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                default:
                                    return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    final int i211 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: a81.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211) {
                                case 0:
                                    return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                default:
                                    return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                }
                C37816b c37816bM121344e2 = AbstractC37817c.m121344e(960375054, c28655q2, new C0554e(listM60536k2, 0, function1));
                int i212 = TextResource.$stable;
                int i213 = (i212 << 3) | 24576 | (i212 << 6) | (i212 << 9) | (i212 << 27);
                modalAnalyticEventModel3 = modalAnalyticEventModel4;
                interfaceC14515a3 = interfaceC14515a4;
                c28655q = c28655q2;
                AbstractC21211n.m59497o(null, textResourceM21278l5, textResourceM21278l2, textResourceM21278l3, true, null, null, null, null, textResourceM21278l, null, false, showCloseButton2, null, null, false, 0, null, null, null, false, null, interfaceC4339a3, interfaceC4339a4, (InterfaceC4339a) objM87133R4, null, c37816bM121344e2, null, c28655q, i213, 0, 1572864, 171961825);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(dialogModel, function1, modalAnalyticEventModel3, interfaceC14515a3, i13, i14, 0);
            }
        }
        i15 |= 384;
        modalAnalyticEventModel2 = modalAnalyticEventModel;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC14515a2 = interfaceC14515a;
                if (c28655q2.m87157i(interfaceC14515a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                textResourceM21278l = null;
                if (i19 != 0) {
                    modalAnalyticEventModel4 = null;
                } else {
                    modalAnalyticEventModel4 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                boolean zM87157i11 = c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                i18 = i15 & 112;
                if (i18 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i11 | z13;
                objM87133R = c28655q2.m87133R();
                C28676v0 c28676v2 = C28635l.f115821a;
                if (z14) {
                    objM87133R = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 2);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 2);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q2, 0, 1);
                List listM60536k3 = C21535a.m60536k(AbstractC0568s.m1465b(), dialogModel.getItems(), null, 2, null);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(dialogModel.getTitle());
                description = dialogModel.getDescription();
                if (description != null) {
                    textResourceM21278l2 = AbstractC8693b.m21278l(description);
                } else {
                    textResourceM21278l2 = null;
                }
                primaryButton = dialogModel.getPrimaryButton();
                if (primaryButton != null) {
                    textResourceM21278l3 = null;
                } else {
                    textResourceM21278l3 = null;
                }
                secondaryButton = dialogModel.getSecondaryButton();
                if (secondaryButton != null) {
                    textResourceM21278l = AbstractC8693b.m21278l(title);
                }
                boolean showCloseButton3 = dialogModel.getShowCloseButton();
                boolean zM87157i12 = c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                if (i18 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i12 | z15;
                objM87133R2 = c28655q2.m87133R();
                if (z16) {
                    objM87133R2 = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 0);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 0);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                boolean zM87157i13 = c28655q2.m87157i(dialogModel);
                if (i18 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i = zM87157i13 | z17 | c28655q2.m87157i(interfaceC14515a4);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i) {
                    final int i214 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: a81.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i214) {
                                case 0:
                                    return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                default:
                                    return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    final int i215 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: a81.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i215) {
                                case 0:
                                    return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                default:
                                    return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                boolean zM87157i14 = c28655q2.m87157i(dialogModel);
                if (i18 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i2 = zM87157i14 | z18 | c28655q2.m87157i(interfaceC14515a4);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i2) {
                    final int i216 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: a81.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i216) {
                                case 0:
                                    return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                default:
                                    return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    final int i217 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: a81.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i217) {
                                case 0:
                                    return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                                default:
                                    return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                }
                C37816b c37816bM121344e3 = AbstractC37817c.m121344e(960375054, c28655q2, new C0554e(listM60536k3, 0, function1));
                int i218 = TextResource.$stable;
                int i219 = (i218 << 3) | 24576 | (i218 << 6) | (i218 << 9) | (i218 << 27);
                modalAnalyticEventModel3 = modalAnalyticEventModel4;
                interfaceC14515a3 = interfaceC14515a4;
                c28655q = c28655q2;
                AbstractC21211n.m59497o(null, textResourceM21278l6, textResourceM21278l2, textResourceM21278l3, true, null, null, null, null, textResourceM21278l, null, false, showCloseButton3, null, null, false, 0, null, null, null, false, null, interfaceC4339a5, interfaceC4339a6, (InterfaceC4339a) objM87133R4, null, c37816bM121344e3, null, c28655q, i219, 0, 1572864, 171961825);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(dialogModel, function1, modalAnalyticEventModel3, interfaceC14515a3, i13, i14, 0);
            }
        }
        i15 |= 3072;
        interfaceC14515a2 = interfaceC14515a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            textResourceM21278l = null;
            if (i19 != 0) {
                modalAnalyticEventModel4 = null;
            } else {
                modalAnalyticEventModel4 = modalAnalyticEventModel2;
            }
            if (i16 != 0) {
                interfaceC14515a4 = null;
            } else {
                interfaceC14515a4 = interfaceC14515a2;
            }
            boolean zM87157i15 = c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
            i18 = i15 & 112;
            if (i18 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i15 | z13;
            objM87133R = c28655q2.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (z14) {
                objM87133R = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 2);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 2);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q2, 0, 1);
            List listM60536k4 = C21535a.m60536k(AbstractC0568s.m1465b(), dialogModel.getItems(), null, 2, null);
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(dialogModel.getTitle());
            description = dialogModel.getDescription();
            if (description != null) {
                textResourceM21278l2 = AbstractC8693b.m21278l(description);
            } else {
                textResourceM21278l2 = null;
            }
            primaryButton = dialogModel.getPrimaryButton();
            if (primaryButton != null) {
                textResourceM21278l3 = null;
            } else {
                textResourceM21278l3 = null;
            }
            secondaryButton = dialogModel.getSecondaryButton();
            if (secondaryButton != null) {
                textResourceM21278l = AbstractC8693b.m21278l(title);
            }
            boolean showCloseButton4 = dialogModel.getShowCloseButton();
            boolean zM87157i16 = c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
            if (i18 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM87157i16 | z15;
            objM87133R2 = c28655q2.m87133R();
            if (z16) {
                objM87133R2 = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 0);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C0552c(modalAnalyticEventModel4, interfaceC14515a4, function1, 0);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i17 = c28655q2.m87157i(dialogModel);
            if (i18 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i = zM87157i17 | z17 | c28655q2.m87157i(interfaceC14515a4);
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i) {
                final int i2110 = 0;
                objM87133R3 = new InterfaceC4339a() { // from class: a81.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2110) {
                            case 0:
                                return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                            default:
                                return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R3);
            } else {
                final int i2111 = 0;
                objM87133R3 = new InterfaceC4339a() { // from class: a81.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2111) {
                            case 0:
                                return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                            default:
                                return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R3;
            boolean zM87157i18 = c28655q2.m87157i(dialogModel);
            if (i18 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87157i2 = zM87157i18 | z18 | c28655q2.m87157i(interfaceC14515a4);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i2) {
                final int i2112 = 1;
                objM87133R4 = new InterfaceC4339a() { // from class: a81.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2112) {
                            case 0:
                                return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                            default:
                                return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R4);
            } else {
                final int i2113 = 1;
                objM87133R4 = new InterfaceC4339a() { // from class: a81.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i2113) {
                            case 0:
                                return AbstractC0564o.m1389K(dialogModel, function1, interfaceC14515a4);
                            default:
                                return AbstractC0564o.m1390L(dialogModel, function1, interfaceC14515a4);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R4);
            }
            C37816b c37816bM121344e4 = AbstractC37817c.m121344e(960375054, c28655q2, new C0554e(listM60536k4, 0, function1));
            int i2114 = TextResource.$stable;
            int i2115 = (i2114 << 3) | 24576 | (i2114 << 6) | (i2114 << 9) | (i2114 << 27);
            modalAnalyticEventModel3 = modalAnalyticEventModel4;
            interfaceC14515a3 = interfaceC14515a4;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, textResourceM21278l7, textResourceM21278l2, textResourceM21278l3, true, null, null, null, null, textResourceM21278l, null, false, showCloseButton4, null, null, false, 0, null, null, null, false, null, interfaceC4339a7, interfaceC4339a8, (InterfaceC4339a) objM87133R4, null, c37816bM121344e4, null, c28655q, i2115, 0, 1572864, 171961825);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modalAnalyticEventModel3 = modalAnalyticEventModel2;
            interfaceC14515a3 = interfaceC14515a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f(dialogModel, function1, modalAnalyticEventModel3, interfaceC14515a3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m1387I(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1) {
        ModalTrackingKt.trackModalDismissed(modalAnalyticEventModel, interfaceC14515a);
        function1.invoke(InterfaceC0569t.a.f2023a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m1388J(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1) {
        ModalTrackingKt.trackModalDismissed(modalAnalyticEventModel, interfaceC14515a);
        function1.invoke(InterfaceC0569t.a.f2023a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m1389K(DialogModel dialogModel, Function1 function1, InterfaceC14515a interfaceC14515a) {
        DialogButton secondaryButton = dialogModel.getSecondaryButton();
        if (secondaryButton != null) {
            m1414e0(secondaryButton, function1, interfaceC14515a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m1390L(DialogModel dialogModel, Function1 function1, InterfaceC14515a interfaceC14515a) {
        DialogButton primaryButton = dialogModel.getPrimaryButton();
        if (primaryButton != null) {
            m1414e0(primaryButton, function1, interfaceC14515a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m1391M(List list, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (list.isEmpty()) {
            c28655q.m87150e0(1756577012);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1756135913);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1383031878);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25306o c25306o = (C25306o) it.next();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c25306o);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0559j(function1, c25306o, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74290q(c25306o, null, null, (Function1) objM87133R, c28655q, C25306o.f99297c, 6);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m1392N(Function1 function1, C25306o c25306o, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new InterfaceC0569t.b(event, c25306o.getState()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m1393O(DialogModel dialogModel, Function1 function1, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, int i13, int i14, Composer composer, int i15) {
        m1386H(dialogModel, function1, modalAnalyticEventModel, interfaceC14515a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0167  */
    /* JADX WARN: Code duplicated, block: B:103:0x0171  */
    /* JADX WARN: Code duplicated, block: B:105:0x018d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0191  */
    /* JADX WARN: Code duplicated, block: B:108:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0138  */
    /* JADX WARN: Code duplicated, block: B:97:0x013c  */
    /* JADX WARN: Code duplicated, block: B:98:0x015b  */
    /* JADX INFO: renamed from: P */
    public static final void m1394P(final AnyModal anyModal, final Function1 onEvent, InterfaceC21030c interfaceC21030c, InterfaceC14515a interfaceC14515a, InterfaceC4339a interfaceC4339a, InterfaceC4354p interfaceC4354p, Composer composer, final int i13, final int i14) {
        int i15;
        InterfaceC21030c interfaceC21030c2;
        int i16;
        InterfaceC14515a interfaceC14515a2;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        int i24;
        InterfaceC4354p interfaceC4354p2;
        int i25;
        boolean z4;
        C28655q c28655q;
        final InterfaceC21030c interfaceC21030c3;
        final InterfaceC14515a interfaceC14515a3;
        final InterfaceC4339a interfaceC4339a3;
        final InterfaceC4354p interfaceC4354p3;
        C28677v1 c28677v1M87180u;
        final InterfaceC21030c interfaceC21030c4;
        C28676v0 c28676v0;
        final InterfaceC4354p interfaceC4354p4;
        boolean zM87157i;
        Object objM87133R;
        InterfaceC14515a interfaceC14515a4;
        Modal modal;
        C28677v1 c28677v1M87180u2;
        Object objM87133R2;
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1365743289);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(anyModal) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onEvent) ? 32 : 16;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC21030c2 = interfaceC21030c;
                i15 |= c28655q2.m87157i(interfaceC21030c2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC14515a2 = interfaceC14515a;
                    if (c28655q2.m87157i(interfaceC14515a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        if ((196608 & i13) == 0) {
                            interfaceC4354p2 = interfaceC4354p;
                            if (c28655q2.m87157i(interfaceC4354p2)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                        if ((74899 & i15) != 74898) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            if (i26 != 0) {
                                interfaceC21030c4 = null;
                            } else {
                                interfaceC21030c4 = interfaceC21030c2;
                            }
                            if (i16 != 0) {
                                interfaceC14515a2 = null;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i18 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C0155d(8);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i24 != 0) {
                                interfaceC4354p4 = null;
                            } else {
                                interfaceC4354p4 = interfaceC4354p2;
                            }
                            zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                            objM87133R = c28655q2.m87133R();
                            if (zM87157i || objM87133R == c28676v0) {
                                objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                                c28655q2.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                            if (anyModal == null) {
                                c28677v1M87180u2 = c28655q2.m87180u();
                                if (c28677v1M87180u2 != null) {
                                    final int i27 = 0;
                                    final InterfaceC14515a interfaceC14515a5 = interfaceC14515a2;
                                    final InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
                                    c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                        @Override // c93.InterfaceC4351m
                                        public final Object invoke(Object obj, Object obj2) {
                                            switch (i27) {
                                                case 0:
                                                    int iIntValue = ((Integer) obj2).intValue();
                                                    return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a5, interfaceC4339a4, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                                default:
                                                    int iIntValue2 = ((Integer) obj2).intValue();
                                                    return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a5, interfaceC4339a4, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                            }
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            InterfaceC21030c interfaceC21030c5 = interfaceC21030c4;
                            interfaceC4354p2 = interfaceC4354p4;
                            interfaceC14515a4 = interfaceC14515a2;
                            modal = anyModal.getModal();
                            if (modal instanceof DialogModel) {
                                c28655q2.m87150e0(1780733991);
                                m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                                c28655q2.m87173q(false);
                            } else if (modal instanceof BottomSheet) {
                                c28655q2.m87150e0(1780741051);
                                m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            } else if (modal instanceof FullScreenContentModal) {
                                c28655q2.m87150e0(-631289940);
                                if (interfaceC4354p2 == null) {
                                    c28655q2.m87150e0(-631289941);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(-631289940);
                                    m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                                    c28655q2 = c28655q2;
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(false);
                            } else if (modal instanceof ToastModal) {
                                c28655q2.m87150e0(1780761540);
                                AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-630763219);
                                c28655q2.m87173q(false);
                            }
                            c28655q = c28655q2;
                            interfaceC14515a3 = interfaceC14515a4;
                            interfaceC21030c3 = interfaceC21030c5;
                        } else {
                            c28655q2.m87138X();
                            c28655q = c28655q2;
                            interfaceC21030c3 = interfaceC21030c2;
                            interfaceC14515a3 = interfaceC14515a2;
                        }
                        interfaceC4339a3 = interfaceC4339a2;
                        interfaceC4354p3 = interfaceC4354p2;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            final int i28 = 1;
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i28) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                        }
                    }
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4354p2 = interfaceC4354p;
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        if (i26 != 0) {
                            interfaceC21030c4 = null;
                        } else {
                            interfaceC21030c4 = interfaceC21030c2;
                        }
                        if (i16 != 0) {
                            interfaceC14515a2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C0155d(8);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i24 != 0) {
                            interfaceC4354p4 = null;
                        } else {
                            interfaceC4354p4 = interfaceC4354p2;
                        }
                        zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                        objM87133R = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                        if (anyModal == null) {
                            c28677v1M87180u2 = c28655q2.m87180u();
                            if (c28677v1M87180u2 != null) {
                                final int i29 = 0;
                                final InterfaceC14515a interfaceC14515a6 = interfaceC14515a2;
                                final InterfaceC4339a interfaceC4339a5 = interfaceC4339a2;
                                c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i29) {
                                            case 0:
                                                int iIntValue = ((Integer) obj2).intValue();
                                                return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a6, interfaceC4339a5, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                            default:
                                                int iIntValue2 = ((Integer) obj2).intValue();
                                                return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a6, interfaceC4339a5, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        InterfaceC21030c interfaceC21030c6 = interfaceC21030c4;
                        interfaceC4354p2 = interfaceC4354p4;
                        interfaceC14515a4 = interfaceC14515a2;
                        modal = anyModal.getModal();
                        if (modal instanceof DialogModel) {
                            c28655q2.m87150e0(1780733991);
                            m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                            c28655q2.m87173q(false);
                        } else if (modal instanceof BottomSheet) {
                            c28655q2.m87150e0(1780741051);
                            m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (modal instanceof FullScreenContentModal) {
                            c28655q2.m87150e0(-631289940);
                            if (interfaceC4354p2 == null) {
                                c28655q2.m87150e0(-631289941);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-631289940);
                                m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        } else if (modal instanceof ToastModal) {
                            c28655q2.m87150e0(1780761540);
                            AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-630763219);
                            c28655q2.m87173q(false);
                        }
                        c28655q = c28655q2;
                        interfaceC14515a3 = interfaceC14515a4;
                        interfaceC21030c3 = interfaceC21030c6;
                    } else {
                        c28655q2.m87138X();
                        c28655q = c28655q2;
                        interfaceC21030c3 = interfaceC21030c2;
                        interfaceC14515a3 = interfaceC14515a2;
                    }
                    interfaceC4339a3 = interfaceC4339a2;
                    interfaceC4354p3 = interfaceC4354p2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i210 = 1;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i210) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4354p2 = interfaceC4354p;
                        if (c28655q2.m87157i(interfaceC4354p2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        if (i26 != 0) {
                            interfaceC21030c4 = null;
                        } else {
                            interfaceC21030c4 = interfaceC21030c2;
                        }
                        if (i16 != 0) {
                            interfaceC14515a2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C0155d(8);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i24 != 0) {
                            interfaceC4354p4 = null;
                        } else {
                            interfaceC4354p4 = interfaceC4354p2;
                        }
                        zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                        objM87133R = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                        if (anyModal == null) {
                            c28677v1M87180u2 = c28655q2.m87180u();
                            if (c28677v1M87180u2 != null) {
                                final int i211 = 0;
                                final InterfaceC14515a interfaceC14515a7 = interfaceC14515a2;
                                final InterfaceC4339a interfaceC4339a6 = interfaceC4339a2;
                                c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i211) {
                                            case 0:
                                                int iIntValue = ((Integer) obj2).intValue();
                                                return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a7, interfaceC4339a6, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                            default:
                                                int iIntValue2 = ((Integer) obj2).intValue();
                                                return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a7, interfaceC4339a6, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        InterfaceC21030c interfaceC21030c7 = interfaceC21030c4;
                        interfaceC4354p2 = interfaceC4354p4;
                        interfaceC14515a4 = interfaceC14515a2;
                        modal = anyModal.getModal();
                        if (modal instanceof DialogModel) {
                            c28655q2.m87150e0(1780733991);
                            m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                            c28655q2.m87173q(false);
                        } else if (modal instanceof BottomSheet) {
                            c28655q2.m87150e0(1780741051);
                            m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (modal instanceof FullScreenContentModal) {
                            c28655q2.m87150e0(-631289940);
                            if (interfaceC4354p2 == null) {
                                c28655q2.m87150e0(-631289941);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-631289940);
                                m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        } else if (modal instanceof ToastModal) {
                            c28655q2.m87150e0(1780761540);
                            AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-630763219);
                            c28655q2.m87173q(false);
                        }
                        c28655q = c28655q2;
                        interfaceC14515a3 = interfaceC14515a4;
                        interfaceC21030c3 = interfaceC21030c7;
                    } else {
                        c28655q2.m87138X();
                        c28655q = c28655q2;
                        interfaceC21030c3 = interfaceC21030c2;
                        interfaceC14515a3 = interfaceC14515a2;
                    }
                    interfaceC4339a3 = interfaceC4339a2;
                    interfaceC4354p3 = interfaceC4354p2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i212 = 1;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i212) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4354p2 = interfaceC4354p;
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        interfaceC21030c4 = null;
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C0155d(8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        interfaceC4354p4 = null;
                    } else {
                        interfaceC4354p4 = interfaceC4354p2;
                    }
                    zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                    if (anyModal == null) {
                        c28677v1M87180u2 = c28655q2.m87180u();
                        if (c28677v1M87180u2 != null) {
                            final int i213 = 0;
                            final InterfaceC14515a interfaceC14515a8 = interfaceC14515a2;
                            final InterfaceC4339a interfaceC4339a7 = interfaceC4339a2;
                            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i213) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a8, interfaceC4339a7, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a8, interfaceC4339a7, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    InterfaceC21030c interfaceC21030c8 = interfaceC21030c4;
                    interfaceC4354p2 = interfaceC4354p4;
                    interfaceC14515a4 = interfaceC14515a2;
                    modal = anyModal.getModal();
                    if (modal instanceof DialogModel) {
                        c28655q2.m87150e0(1780733991);
                        m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else if (modal instanceof BottomSheet) {
                        c28655q2.m87150e0(1780741051);
                        m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else if (modal instanceof FullScreenContentModal) {
                        c28655q2.m87150e0(-631289940);
                        if (interfaceC4354p2 == null) {
                            c28655q2.m87150e0(-631289941);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-631289940);
                            m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    } else if (modal instanceof ToastModal) {
                        c28655q2.m87150e0(1780761540);
                        AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-630763219);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    interfaceC14515a3 = interfaceC14515a4;
                    interfaceC21030c3 = interfaceC21030c8;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                interfaceC4354p3 = interfaceC4354p2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i214 = 1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i214) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
            }
            i15 |= 3072;
            interfaceC14515a2 = interfaceC14515a;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4354p2 = interfaceC4354p;
                        if (c28655q2.m87157i(interfaceC4354p2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        if (i26 != 0) {
                            interfaceC21030c4 = null;
                        } else {
                            interfaceC21030c4 = interfaceC21030c2;
                        }
                        if (i16 != 0) {
                            interfaceC14515a2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C0155d(8);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i24 != 0) {
                            interfaceC4354p4 = null;
                        } else {
                            interfaceC4354p4 = interfaceC4354p2;
                        }
                        zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                        objM87133R = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                        if (anyModal == null) {
                            c28677v1M87180u2 = c28655q2.m87180u();
                            if (c28677v1M87180u2 != null) {
                                final int i215 = 0;
                                final InterfaceC14515a interfaceC14515a9 = interfaceC14515a2;
                                final InterfaceC4339a interfaceC4339a8 = interfaceC4339a2;
                                c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i215) {
                                            case 0:
                                                int iIntValue = ((Integer) obj2).intValue();
                                                return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a9, interfaceC4339a8, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                            default:
                                                int iIntValue2 = ((Integer) obj2).intValue();
                                                return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a9, interfaceC4339a8, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        InterfaceC21030c interfaceC21030c9 = interfaceC21030c4;
                        interfaceC4354p2 = interfaceC4354p4;
                        interfaceC14515a4 = interfaceC14515a2;
                        modal = anyModal.getModal();
                        if (modal instanceof DialogModel) {
                            c28655q2.m87150e0(1780733991);
                            m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                            c28655q2.m87173q(false);
                        } else if (modal instanceof BottomSheet) {
                            c28655q2.m87150e0(1780741051);
                            m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (modal instanceof FullScreenContentModal) {
                            c28655q2.m87150e0(-631289940);
                            if (interfaceC4354p2 == null) {
                                c28655q2.m87150e0(-631289941);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-631289940);
                                m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        } else if (modal instanceof ToastModal) {
                            c28655q2.m87150e0(1780761540);
                            AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-630763219);
                            c28655q2.m87173q(false);
                        }
                        c28655q = c28655q2;
                        interfaceC14515a3 = interfaceC14515a4;
                        interfaceC21030c3 = interfaceC21030c9;
                    } else {
                        c28655q2.m87138X();
                        c28655q = c28655q2;
                        interfaceC21030c3 = interfaceC21030c2;
                        interfaceC14515a3 = interfaceC14515a2;
                    }
                    interfaceC4339a3 = interfaceC4339a2;
                    interfaceC4354p3 = interfaceC4354p2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i216 = 1;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i216) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4354p2 = interfaceC4354p;
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        interfaceC21030c4 = null;
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C0155d(8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        interfaceC4354p4 = null;
                    } else {
                        interfaceC4354p4 = interfaceC4354p2;
                    }
                    zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                    if (anyModal == null) {
                        c28677v1M87180u2 = c28655q2.m87180u();
                        if (c28677v1M87180u2 != null) {
                            final int i217 = 0;
                            final InterfaceC14515a interfaceC14515a10 = interfaceC14515a2;
                            final InterfaceC4339a interfaceC4339a9 = interfaceC4339a2;
                            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i217) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a10, interfaceC4339a9, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a10, interfaceC4339a9, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    InterfaceC21030c interfaceC21030c10 = interfaceC21030c4;
                    interfaceC4354p2 = interfaceC4354p4;
                    interfaceC14515a4 = interfaceC14515a2;
                    modal = anyModal.getModal();
                    if (modal instanceof DialogModel) {
                        c28655q2.m87150e0(1780733991);
                        m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else if (modal instanceof BottomSheet) {
                        c28655q2.m87150e0(1780741051);
                        m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else if (modal instanceof FullScreenContentModal) {
                        c28655q2.m87150e0(-631289940);
                        if (interfaceC4354p2 == null) {
                            c28655q2.m87150e0(-631289941);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-631289940);
                            m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    } else if (modal instanceof ToastModal) {
                        c28655q2.m87150e0(1780761540);
                        AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-630763219);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    interfaceC14515a3 = interfaceC14515a4;
                    interfaceC21030c3 = interfaceC21030c10;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                interfaceC4354p3 = interfaceC4354p2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i218 = 1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i218) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4354p2 = interfaceC4354p;
                    if (c28655q2.m87157i(interfaceC4354p2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        interfaceC21030c4 = null;
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C0155d(8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        interfaceC4354p4 = null;
                    } else {
                        interfaceC4354p4 = interfaceC4354p2;
                    }
                    zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                    if (anyModal == null) {
                        c28677v1M87180u2 = c28655q2.m87180u();
                        if (c28677v1M87180u2 != null) {
                            final int i219 = 0;
                            final InterfaceC14515a interfaceC14515a11 = interfaceC14515a2;
                            final InterfaceC4339a interfaceC4339a10 = interfaceC4339a2;
                            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i219) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a11, interfaceC4339a10, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a11, interfaceC4339a10, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    InterfaceC21030c interfaceC21030c11 = interfaceC21030c4;
                    interfaceC4354p2 = interfaceC4354p4;
                    interfaceC14515a4 = interfaceC14515a2;
                    modal = anyModal.getModal();
                    if (modal instanceof DialogModel) {
                        c28655q2.m87150e0(1780733991);
                        m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else if (modal instanceof BottomSheet) {
                        c28655q2.m87150e0(1780741051);
                        m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else if (modal instanceof FullScreenContentModal) {
                        c28655q2.m87150e0(-631289940);
                        if (interfaceC4354p2 == null) {
                            c28655q2.m87150e0(-631289941);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-631289940);
                            m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    } else if (modal instanceof ToastModal) {
                        c28655q2.m87150e0(1780761540);
                        AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-630763219);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    interfaceC14515a3 = interfaceC14515a4;
                    interfaceC21030c3 = interfaceC21030c11;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                interfaceC4354p3 = interfaceC4354p2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i2110 = 1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2110) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4354p2 = interfaceC4354p;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    interfaceC21030c4 = null;
                } else {
                    interfaceC21030c4 = interfaceC21030c2;
                }
                if (i16 != 0) {
                    interfaceC14515a2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C0155d(8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i24 != 0) {
                    interfaceC4354p4 = null;
                } else {
                    interfaceC4354p4 = interfaceC4354p2;
                }
                zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                if (anyModal == null) {
                    c28677v1M87180u2 = c28655q2.m87180u();
                    if (c28677v1M87180u2 != null) {
                        final int i2111 = 0;
                        final InterfaceC14515a interfaceC14515a12 = interfaceC14515a2;
                        final InterfaceC4339a interfaceC4339a11 = interfaceC4339a2;
                        c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i2111) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a12, interfaceC4339a11, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a12, interfaceC4339a11, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                InterfaceC21030c interfaceC21030c12 = interfaceC21030c4;
                interfaceC4354p2 = interfaceC4354p4;
                interfaceC14515a4 = interfaceC14515a2;
                modal = anyModal.getModal();
                if (modal instanceof DialogModel) {
                    c28655q2.m87150e0(1780733991);
                    m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                    c28655q2.m87173q(false);
                } else if (modal instanceof BottomSheet) {
                    c28655q2.m87150e0(1780741051);
                    m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else if (modal instanceof FullScreenContentModal) {
                    c28655q2.m87150e0(-631289940);
                    if (interfaceC4354p2 == null) {
                        c28655q2.m87150e0(-631289941);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-631289940);
                        m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(false);
                } else if (modal instanceof ToastModal) {
                    c28655q2.m87150e0(1780761540);
                    AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-630763219);
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                interfaceC14515a3 = interfaceC14515a4;
                interfaceC21030c3 = interfaceC21030c12;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                interfaceC21030c3 = interfaceC21030c2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            interfaceC4339a3 = interfaceC4339a2;
            interfaceC4354p3 = interfaceC4354p2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i2112 = 1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i2112) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            }
        }
        i15 |= 384;
        interfaceC21030c2 = interfaceC21030c;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC14515a2 = interfaceC14515a;
                if (c28655q2.m87157i(interfaceC14515a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4354p2 = interfaceC4354p;
                        if (c28655q2.m87157i(interfaceC4354p2)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    if ((74899 & i15) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        if (i26 != 0) {
                            interfaceC21030c4 = null;
                        } else {
                            interfaceC21030c4 = interfaceC21030c2;
                        }
                        if (i16 != 0) {
                            interfaceC14515a2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C0155d(8);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i24 != 0) {
                            interfaceC4354p4 = null;
                        } else {
                            interfaceC4354p4 = interfaceC4354p2;
                        }
                        zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                        objM87133R = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                        if (anyModal == null) {
                            c28677v1M87180u2 = c28655q2.m87180u();
                            if (c28677v1M87180u2 != null) {
                                final int i2113 = 0;
                                final InterfaceC14515a interfaceC14515a13 = interfaceC14515a2;
                                final InterfaceC4339a interfaceC4339a12 = interfaceC4339a2;
                                c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i2113) {
                                            case 0:
                                                int iIntValue = ((Integer) obj2).intValue();
                                                return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a13, interfaceC4339a12, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                            default:
                                                int iIntValue2 = ((Integer) obj2).intValue();
                                                return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a13, interfaceC4339a12, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        InterfaceC21030c interfaceC21030c13 = interfaceC21030c4;
                        interfaceC4354p2 = interfaceC4354p4;
                        interfaceC14515a4 = interfaceC14515a2;
                        modal = anyModal.getModal();
                        if (modal instanceof DialogModel) {
                            c28655q2.m87150e0(1780733991);
                            m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                            c28655q2.m87173q(false);
                        } else if (modal instanceof BottomSheet) {
                            c28655q2.m87150e0(1780741051);
                            m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        } else if (modal instanceof FullScreenContentModal) {
                            c28655q2.m87150e0(-631289940);
                            if (interfaceC4354p2 == null) {
                                c28655q2.m87150e0(-631289941);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-631289940);
                                m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                        } else if (modal instanceof ToastModal) {
                            c28655q2.m87150e0(1780761540);
                            AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-630763219);
                            c28655q2.m87173q(false);
                        }
                        c28655q = c28655q2;
                        interfaceC14515a3 = interfaceC14515a4;
                        interfaceC21030c3 = interfaceC21030c13;
                    } else {
                        c28655q2.m87138X();
                        c28655q = c28655q2;
                        interfaceC21030c3 = interfaceC21030c2;
                        interfaceC14515a3 = interfaceC14515a2;
                    }
                    interfaceC4339a3 = interfaceC4339a2;
                    interfaceC4354p3 = interfaceC4354p2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final int i2114 = 1;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i2114) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4354p2 = interfaceC4354p;
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        interfaceC21030c4 = null;
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C0155d(8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        interfaceC4354p4 = null;
                    } else {
                        interfaceC4354p4 = interfaceC4354p2;
                    }
                    zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                    if (anyModal == null) {
                        c28677v1M87180u2 = c28655q2.m87180u();
                        if (c28677v1M87180u2 != null) {
                            final int i2115 = 0;
                            final InterfaceC14515a interfaceC14515a14 = interfaceC14515a2;
                            final InterfaceC4339a interfaceC4339a13 = interfaceC4339a2;
                            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i2115) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a14, interfaceC4339a13, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a14, interfaceC4339a13, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    InterfaceC21030c interfaceC21030c14 = interfaceC21030c4;
                    interfaceC4354p2 = interfaceC4354p4;
                    interfaceC14515a4 = interfaceC14515a2;
                    modal = anyModal.getModal();
                    if (modal instanceof DialogModel) {
                        c28655q2.m87150e0(1780733991);
                        m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else if (modal instanceof BottomSheet) {
                        c28655q2.m87150e0(1780741051);
                        m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else if (modal instanceof FullScreenContentModal) {
                        c28655q2.m87150e0(-631289940);
                        if (interfaceC4354p2 == null) {
                            c28655q2.m87150e0(-631289941);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-631289940);
                            m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    } else if (modal instanceof ToastModal) {
                        c28655q2.m87150e0(1780761540);
                        AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-630763219);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    interfaceC14515a3 = interfaceC14515a4;
                    interfaceC21030c3 = interfaceC21030c14;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                interfaceC4354p3 = interfaceC4354p2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i2116 = 1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2116) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4354p2 = interfaceC4354p;
                    if (c28655q2.m87157i(interfaceC4354p2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        interfaceC21030c4 = null;
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C0155d(8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        interfaceC4354p4 = null;
                    } else {
                        interfaceC4354p4 = interfaceC4354p2;
                    }
                    zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                    if (anyModal == null) {
                        c28677v1M87180u2 = c28655q2.m87180u();
                        if (c28677v1M87180u2 != null) {
                            final int i2117 = 0;
                            final InterfaceC14515a interfaceC14515a15 = interfaceC14515a2;
                            final InterfaceC4339a interfaceC4339a14 = interfaceC4339a2;
                            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i2117) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a15, interfaceC4339a14, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a15, interfaceC4339a14, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    InterfaceC21030c interfaceC21030c15 = interfaceC21030c4;
                    interfaceC4354p2 = interfaceC4354p4;
                    interfaceC14515a4 = interfaceC14515a2;
                    modal = anyModal.getModal();
                    if (modal instanceof DialogModel) {
                        c28655q2.m87150e0(1780733991);
                        m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else if (modal instanceof BottomSheet) {
                        c28655q2.m87150e0(1780741051);
                        m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else if (modal instanceof FullScreenContentModal) {
                        c28655q2.m87150e0(-631289940);
                        if (interfaceC4354p2 == null) {
                            c28655q2.m87150e0(-631289941);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-631289940);
                            m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    } else if (modal instanceof ToastModal) {
                        c28655q2.m87150e0(1780761540);
                        AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-630763219);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    interfaceC14515a3 = interfaceC14515a4;
                    interfaceC21030c3 = interfaceC21030c15;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                interfaceC4354p3 = interfaceC4354p2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i2118 = 1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2118) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4354p2 = interfaceC4354p;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    interfaceC21030c4 = null;
                } else {
                    interfaceC21030c4 = interfaceC21030c2;
                }
                if (i16 != 0) {
                    interfaceC14515a2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C0155d(8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i24 != 0) {
                    interfaceC4354p4 = null;
                } else {
                    interfaceC4354p4 = interfaceC4354p2;
                }
                zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                if (anyModal == null) {
                    c28677v1M87180u2 = c28655q2.m87180u();
                    if (c28677v1M87180u2 != null) {
                        final int i2119 = 0;
                        final InterfaceC14515a interfaceC14515a16 = interfaceC14515a2;
                        final InterfaceC4339a interfaceC4339a15 = interfaceC4339a2;
                        c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i2119) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a16, interfaceC4339a15, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a16, interfaceC4339a15, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                InterfaceC21030c interfaceC21030c16 = interfaceC21030c4;
                interfaceC4354p2 = interfaceC4354p4;
                interfaceC14515a4 = interfaceC14515a2;
                modal = anyModal.getModal();
                if (modal instanceof DialogModel) {
                    c28655q2.m87150e0(1780733991);
                    m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                    c28655q2.m87173q(false);
                } else if (modal instanceof BottomSheet) {
                    c28655q2.m87150e0(1780741051);
                    m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else if (modal instanceof FullScreenContentModal) {
                    c28655q2.m87150e0(-631289940);
                    if (interfaceC4354p2 == null) {
                        c28655q2.m87150e0(-631289941);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-631289940);
                        m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(false);
                } else if (modal instanceof ToastModal) {
                    c28655q2.m87150e0(1780761540);
                    AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-630763219);
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                interfaceC14515a3 = interfaceC14515a4;
                interfaceC21030c3 = interfaceC21030c16;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                interfaceC21030c3 = interfaceC21030c2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            interfaceC4339a3 = interfaceC4339a2;
            interfaceC4354p3 = interfaceC4354p2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i21110 = 1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i21110) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            }
        }
        i15 |= 3072;
        interfaceC14515a2 = interfaceC14515a;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4354p2 = interfaceC4354p;
                    if (c28655q2.m87157i(interfaceC4354p2)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i26 != 0) {
                        interfaceC21030c4 = null;
                    } else {
                        interfaceC21030c4 = interfaceC21030c2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C0155d(8);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i24 != 0) {
                        interfaceC4354p4 = null;
                    } else {
                        interfaceC4354p4 = interfaceC4354p2;
                    }
                    zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                    if (anyModal == null) {
                        c28677v1M87180u2 = c28655q2.m87180u();
                        if (c28677v1M87180u2 != null) {
                            final int i21111 = 0;
                            final InterfaceC14515a interfaceC14515a17 = interfaceC14515a2;
                            final InterfaceC4339a interfaceC4339a16 = interfaceC4339a2;
                            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i21111) {
                                        case 0:
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a17, interfaceC4339a16, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                        default:
                                            int iIntValue2 = ((Integer) obj2).intValue();
                                            return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a17, interfaceC4339a16, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    InterfaceC21030c interfaceC21030c17 = interfaceC21030c4;
                    interfaceC4354p2 = interfaceC4354p4;
                    interfaceC14515a4 = interfaceC14515a2;
                    modal = anyModal.getModal();
                    if (modal instanceof DialogModel) {
                        c28655q2.m87150e0(1780733991);
                        m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else if (modal instanceof BottomSheet) {
                        c28655q2.m87150e0(1780741051);
                        m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else if (modal instanceof FullScreenContentModal) {
                        c28655q2.m87150e0(-631289940);
                        if (interfaceC4354p2 == null) {
                            c28655q2.m87150e0(-631289941);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-631289940);
                            m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                    } else if (modal instanceof ToastModal) {
                        c28655q2.m87150e0(1780761540);
                        AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-630763219);
                        c28655q2.m87173q(false);
                    }
                    c28655q = c28655q2;
                    interfaceC14515a3 = interfaceC14515a4;
                    interfaceC21030c3 = interfaceC21030c17;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    interfaceC21030c3 = interfaceC21030c2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                interfaceC4354p3 = interfaceC4354p2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i21112 = 1;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i21112) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4354p2 = interfaceC4354p;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    interfaceC21030c4 = null;
                } else {
                    interfaceC21030c4 = interfaceC21030c2;
                }
                if (i16 != 0) {
                    interfaceC14515a2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C0155d(8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i24 != 0) {
                    interfaceC4354p4 = null;
                } else {
                    interfaceC4354p4 = interfaceC4354p2;
                }
                zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                if (anyModal == null) {
                    c28677v1M87180u2 = c28655q2.m87180u();
                    if (c28677v1M87180u2 != null) {
                        final int i21113 = 0;
                        final InterfaceC14515a interfaceC14515a18 = interfaceC14515a2;
                        final InterfaceC4339a interfaceC4339a17 = interfaceC4339a2;
                        c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i21113) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a18, interfaceC4339a17, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a18, interfaceC4339a17, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                InterfaceC21030c interfaceC21030c18 = interfaceC21030c4;
                interfaceC4354p2 = interfaceC4354p4;
                interfaceC14515a4 = interfaceC14515a2;
                modal = anyModal.getModal();
                if (modal instanceof DialogModel) {
                    c28655q2.m87150e0(1780733991);
                    m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                    c28655q2.m87173q(false);
                } else if (modal instanceof BottomSheet) {
                    c28655q2.m87150e0(1780741051);
                    m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else if (modal instanceof FullScreenContentModal) {
                    c28655q2.m87150e0(-631289940);
                    if (interfaceC4354p2 == null) {
                        c28655q2.m87150e0(-631289941);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-631289940);
                        m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(false);
                } else if (modal instanceof ToastModal) {
                    c28655q2.m87150e0(1780761540);
                    AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-630763219);
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                interfaceC14515a3 = interfaceC14515a4;
                interfaceC21030c3 = interfaceC21030c18;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                interfaceC21030c3 = interfaceC21030c2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            interfaceC4339a3 = interfaceC4339a2;
            interfaceC4354p3 = interfaceC4354p2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i21114 = 1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i21114) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        i24 = i14 & 32;
        if (i24 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4354p2 = interfaceC4354p;
                if (c28655q2.m87157i(interfaceC4354p2)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i26 != 0) {
                    interfaceC21030c4 = null;
                } else {
                    interfaceC21030c4 = interfaceC21030c2;
                }
                if (i16 != 0) {
                    interfaceC14515a2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C0155d(8);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i24 != 0) {
                    interfaceC4354p4 = null;
                } else {
                    interfaceC4354p4 = interfaceC4354p2;
                }
                zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
                if (anyModal == null) {
                    c28677v1M87180u2 = c28655q2.m87180u();
                    if (c28677v1M87180u2 != null) {
                        final int i21115 = 0;
                        final InterfaceC14515a interfaceC14515a19 = interfaceC14515a2;
                        final InterfaceC4339a interfaceC4339a18 = interfaceC4339a2;
                        c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i21115) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a19, interfaceC4339a18, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a19, interfaceC4339a18, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                InterfaceC21030c interfaceC21030c19 = interfaceC21030c4;
                interfaceC4354p2 = interfaceC4354p4;
                interfaceC14515a4 = interfaceC14515a2;
                modal = anyModal.getModal();
                if (modal instanceof DialogModel) {
                    c28655q2.m87150e0(1780733991);
                    m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                    c28655q2.m87173q(false);
                } else if (modal instanceof BottomSheet) {
                    c28655q2.m87150e0(1780741051);
                    m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else if (modal instanceof FullScreenContentModal) {
                    c28655q2.m87150e0(-631289940);
                    if (interfaceC4354p2 == null) {
                        c28655q2.m87150e0(-631289941);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-631289940);
                        m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(false);
                } else if (modal instanceof ToastModal) {
                    c28655q2.m87150e0(1780761540);
                    AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-630763219);
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                interfaceC14515a3 = interfaceC14515a4;
                interfaceC21030c3 = interfaceC21030c19;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                interfaceC21030c3 = interfaceC21030c2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            interfaceC4339a3 = interfaceC4339a2;
            interfaceC4354p3 = interfaceC4354p2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i21116 = 1;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i21116) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4354p2 = interfaceC4354p;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i26 != 0) {
                interfaceC21030c4 = null;
            } else {
                interfaceC21030c4 = interfaceC21030c2;
            }
            if (i16 != 0) {
                interfaceC14515a2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C0155d(8);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            if (i24 != 0) {
                interfaceC4354p4 = null;
            } else {
                interfaceC4354p4 = interfaceC4354p2;
            }
            zM87157i = c28655q2.m87157i(anyModal) | c28655q2.m87157i(interfaceC21030c4) | c28655q2.m87157i(interfaceC14515a2);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new a(anyModal, interfaceC21030c4, interfaceC14515a2, null);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, anyModal);
            if (anyModal == null) {
                c28677v1M87180u2 = c28655q2.m87180u();
                if (c28677v1M87180u2 != null) {
                    final int i21117 = 0;
                    final InterfaceC14515a interfaceC14515a110 = interfaceC14515a2;
                    final InterfaceC4339a interfaceC4339a19 = interfaceC4339a2;
                    c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: a81.i
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i21117) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c4, interfaceC14515a110, interfaceC4339a19, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c4, interfaceC14515a110, interfaceC4339a19, interfaceC4354p4, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    return;
                }
                return;
            }
            InterfaceC21030c interfaceC21030c110 = interfaceC21030c4;
            interfaceC4354p2 = interfaceC4354p4;
            interfaceC14515a4 = interfaceC14515a2;
            modal = anyModal.getModal();
            if (modal instanceof DialogModel) {
                c28655q2.m87150e0(1780733991);
                m1386H((DialogModel) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                c28655q2.m87173q(false);
            } else if (modal instanceof BottomSheet) {
                c28655q2.m87150e0(1780741051);
                m1398T((BottomSheet) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4339a2, c28655q2, i15 & 64624, 0);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else if (modal instanceof FullScreenContentModal) {
                c28655q2.m87150e0(-631289940);
                if (interfaceC4354p2 == null) {
                    c28655q2.m87150e0(-631289941);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-631289940);
                    m1381C((FullScreenContentModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, interfaceC4354p2, c28655q2, i15 & 7280, 0);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
            } else if (modal instanceof ToastModal) {
                c28655q2.m87150e0(1780761540);
                AbstractC0567r.m1448i((ToastModal) modal, onEvent, anyModal.getAnalyticEvents(), interfaceC14515a4, c28655q2, i15 & 7280, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-630763219);
                c28655q2.m87173q(false);
            }
            c28655q = c28655q2;
            interfaceC14515a3 = interfaceC14515a4;
            interfaceC21030c3 = interfaceC21030c110;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
            interfaceC21030c3 = interfaceC21030c2;
            interfaceC14515a3 = interfaceC14515a2;
        }
        interfaceC4339a3 = interfaceC4339a2;
        interfaceC4354p3 = interfaceC4354p2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i21118 = 1;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: a81.i
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i21118) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC0564o.m1396R(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC0564o.m1397S(anyModal, onEvent, interfaceC21030c3, interfaceC14515a3, interfaceC4339a3, interfaceC4354p3, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m1395Q() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m1396R(AnyModal anyModal, Function1 function1, InterfaceC21030c interfaceC21030c, InterfaceC14515a interfaceC14515a, InterfaceC4339a interfaceC4339a, InterfaceC4354p interfaceC4354p, int i13, int i14, Composer composer, int i15) {
        m1394P(anyModal, function1, interfaceC21030c, interfaceC14515a, interfaceC4339a, interfaceC4354p, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m1397S(AnyModal anyModal, Function1 function1, InterfaceC21030c interfaceC21030c, InterfaceC14515a interfaceC14515a, InterfaceC4339a interfaceC4339a, InterfaceC4354p interfaceC4354p, int i13, int i14, Composer composer, int i15) {
        m1394P(anyModal, function1, interfaceC21030c, interfaceC14515a, interfaceC4339a, interfaceC4354p, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0177  */
    /* JADX WARN: Code duplicated, block: B:102:0x017a  */
    /* JADX WARN: Code duplicated, block: B:105:0x019a  */
    /* JADX WARN: Code duplicated, block: B:106:0x019c  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x0200  */
    /* JADX WARN: Code duplicated, block: B:126:0x0202  */
    /* JADX WARN: Code duplicated, block: B:130:0x0209  */
    /* JADX WARN: Code duplicated, block: B:133:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0213  */
    /* JADX WARN: Code duplicated, block: B:137:0x025a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0268  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x010b  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x015c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:96:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    /* JADX INFO: renamed from: T */
    private static final void m1398T(final BottomSheet bottomSheet, final Function1 function1, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        ModalAnalyticEventModel modalAnalyticEventModel2;
        int i16;
        InterfaceC14515a interfaceC14515a2;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        boolean z4;
        C28655q c28655q;
        ModalAnalyticEventModel modalAnalyticEventModel3;
        InterfaceC14515a interfaceC14515a3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        ModalAnalyticEventModel modalAnalyticEventModel4;
        final InterfaceC14515a interfaceC14515a4;
        C28676v0 c28676v0;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        C23196w3 c23196w3M67125g;
        boolean zM87157i;
        Object objM87133R2;
        int i24;
        boolean z13;
        int i25;
        boolean z14;
        boolean z15;
        Object c0561l;
        C28676v0 c28676v1;
        C23196w3 c23196w3;
        BottomSheetFixedHeader fixedHeader;
        List<DesignSystemModel> items;
        C25271y c25271y;
        BottomSheetFixedFooter fixedFooter;
        List<DesignSystemModel> items2;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        final ModalAnalyticEventModel modalAnalyticEventModel5;
        int i26;
        boolean z18;
        boolean z19;
        Object objM87133R4;
        Function1 function2;
        boolean z24;
        boolean z25;
        Object objM87133R5;
        Object objM87133R6;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1640510527);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(bottomSheet) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i27 = i14 & 4;
        if (i27 == 0) {
            if ((i13 & 384) == 0) {
                modalAnalyticEventModel2 = modalAnalyticEventModel;
                i15 |= c28655q2.m87157i(modalAnalyticEventModel2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC14515a2 = interfaceC14515a;
                    if (c28655q2.m87157i(interfaceC14515a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q2.m87157i(interfaceC4339a2)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            modalAnalyticEventModel4 = null;
                        } else {
                            modalAnalyticEventModel4 = modalAnalyticEventModel2;
                        }
                        if (i16 != 0) {
                            interfaceC14515a4 = null;
                        } else {
                            interfaceC14515a4 = interfaceC14515a2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C0155d(9);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                        zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(bottomSheet) | c28655q2.m87153g(c23196w3M67125g);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                        boolean zM87157i2 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c23196w3M67125g) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                        i24 = i15 & 112;
                        if (i24 == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z26 = zM87157i2 | z13;
                        i25 = i15 & 57344;
                        if (i25 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z26 | z14;
                        Object objM87133R7 = c28655q2.m87133R();
                        if (!z15 || objM87133R7 == c28676v0) {
                            InterfaceC14515a interfaceC14515a5 = interfaceC14515a4;
                            c28676v1 = c28676v0;
                            c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a5, function1, interfaceC4339a2, 0);
                            interfaceC14515a4 = interfaceC14515a5;
                            c23196w3 = c23196w3M67125g;
                            c28655q2.m87172p0(c0561l);
                        } else {
                            c23196w3 = c23196w3M67125g;
                            c0561l = objM87133R7;
                            c28676v1 = c28676v0;
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) c0561l, false, c28655q2, 0, 1);
                        C21535a c21535aM1465b = AbstractC0568s.m1465b();
                        List listM60536k = C21535a.m60536k(c21535aM1465b, bottomSheet.getItems(), null, 2, null);
                        fixedHeader = bottomSheet.getFixedHeader();
                        if (fixedHeader != null) {
                            items = fixedHeader.getItems();
                        } else {
                            items = null;
                        }
                        c25271y = C25271y.f99162w;
                        if (items == null) {
                            items = c25271y;
                        }
                        List listM60536k2 = C21535a.m60536k(c21535aM1465b, items, null, 2, null);
                        fixedFooter = bottomSheet.getFixedFooter();
                        if (fixedFooter != null) {
                            items2 = fixedFooter.getItems();
                        } else {
                            items2 = null;
                        }
                        if (items2 == null) {
                            items2 = c25271y;
                        }
                        List listM60536k3 = C21535a.m60536k(c21535aM1465b, items2, null, 2, null);
                        C35666g c35666gM1412d0 = m1412d0(bottomSheet.getNavigationBar());
                        boolean zM87157i3 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                        if (i24 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zM87157i3 | z16;
                        objM87133R3 = c28655q2.m87133R();
                        if (!z17 || objM87133R3 == c28676v1) {
                            modalAnalyticEventModel5 = modalAnalyticEventModel4;
                            final int i28 = 0;
                            i26 = i25;
                            InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: a81.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i28) {
                                        case 0:
                                            return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                        default:
                                            return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    }
                                }
                            };
                            c28655q2.m87172p0(interfaceC4339a4);
                            objM87133R3 = interfaceC4339a4;
                        } else {
                            i26 = i25;
                            modalAnalyticEventModel5 = modalAnalyticEventModel4;
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R3;
                        boolean zM87157i4 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                        if (i24 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zM87157i4 | z18;
                        objM87133R4 = c28655q2.m87133R();
                        if (!z19 || objM87133R4 == c28676v1) {
                            final int i29 = 1;
                            InterfaceC4339a interfaceC4339a6 = new InterfaceC4339a() { // from class: a81.m
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i29) {
                                        case 0:
                                            return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                        default:
                                            return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    }
                                }
                            };
                            function2 = function1;
                            c28655q2.m87172p0(interfaceC4339a6);
                            objM87133R4 = interfaceC4339a6;
                        } else {
                            function2 = function1;
                        }
                        InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R4;
                        boolean zM87157i5 = c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                        if (i24 == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i5 | z24 | (i26 == 16384);
                        objM87133R5 = c28655q2.m87133R();
                        if (z25 || objM87133R5 == c28676v1) {
                            objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC14515a interfaceC14515a6 = interfaceC14515a4;
                        c28655q = c28655q2;
                        AbstractC35662e.m112943g(null, c23196w3, c35666gM1412d0, null, interfaceC4339a5, interfaceC4339a7, (InterfaceC4339a) ((InterfaceC21467g) objM87133R5), null, false, null, null, false, AbstractC37817c.m121344e(-600986213, c28655q2, new C0563n(listM60536k2, function2, bottomSheet, listM60536k, listM60536k3)), c28655q, C35666g.f151591h << 6, 384, 3977);
                        modalAnalyticEventModel3 = modalAnalyticEventModel5;
                        interfaceC14515a3 = interfaceC14515a6;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modalAnalyticEventModel3 = modalAnalyticEventModel2;
                        interfaceC14515a3 = interfaceC14515a2;
                    }
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((Object) bottomSheet, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                    }
                }
                i15 |= 24576;
                interfaceC4339a2 = interfaceC4339a;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        modalAnalyticEventModel4 = null;
                    } else {
                        modalAnalyticEventModel4 = modalAnalyticEventModel2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C0155d(9);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(bottomSheet) | c28655q2.m87153g(c23196w3M67125g);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    boolean zM87157i6 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c23196w3M67125g) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z27 = zM87157i6 | z13;
                    i25 = i15 & 57344;
                    if (i25 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z27 | z14;
                    Object objM87133R8 = c28655q2.m87133R();
                    if (z15) {
                        InterfaceC14515a interfaceC14515a7 = interfaceC14515a4;
                        c28676v1 = c28676v0;
                        c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a7, function1, interfaceC4339a2, 0);
                        interfaceC14515a4 = interfaceC14515a7;
                        c23196w3 = c23196w3M67125g;
                        c28655q2.m87172p0(c0561l);
                    } else {
                        InterfaceC14515a interfaceC14515a8 = interfaceC14515a4;
                        c28676v1 = c28676v0;
                        c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a8, function1, interfaceC4339a2, 0);
                        interfaceC14515a4 = interfaceC14515a8;
                        c23196w3 = c23196w3M67125g;
                        c28655q2.m87172p0(c0561l);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) c0561l, false, c28655q2, 0, 1);
                    C21535a c21535aM1465b2 = AbstractC0568s.m1465b();
                    List listM60536k4 = C21535a.m60536k(c21535aM1465b2, bottomSheet.getItems(), null, 2, null);
                    fixedHeader = bottomSheet.getFixedHeader();
                    if (fixedHeader != null) {
                        items = fixedHeader.getItems();
                    } else {
                        items = null;
                    }
                    c25271y = C25271y.f99162w;
                    if (items == null) {
                        items = c25271y;
                    }
                    List listM60536k5 = C21535a.m60536k(c21535aM1465b2, items, null, 2, null);
                    fixedFooter = bottomSheet.getFixedFooter();
                    if (fixedFooter != null) {
                        items2 = fixedFooter.getItems();
                    } else {
                        items2 = null;
                    }
                    if (items2 == null) {
                        items2 = c25271y;
                    }
                    List listM60536k6 = C21535a.m60536k(c21535aM1465b2, items2, null, 2, null);
                    C35666g c35666gM1412d1 = m1412d0(bottomSheet.getNavigationBar());
                    boolean zM87157i7 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i7 | z16;
                    objM87133R3 = c28655q2.m87133R();
                    if (z17) {
                        modalAnalyticEventModel5 = modalAnalyticEventModel4;
                        final int i210 = 0;
                        i26 = i25;
                        InterfaceC4339a interfaceC4339a8 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i210) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        c28655q2.m87172p0(interfaceC4339a8);
                        objM87133R3 = interfaceC4339a8;
                    } else {
                        modalAnalyticEventModel5 = modalAnalyticEventModel4;
                        final int i211 = 0;
                        i26 = i25;
                        InterfaceC4339a interfaceC4339a9 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i211) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        c28655q2.m87172p0(interfaceC4339a9);
                        objM87133R3 = interfaceC4339a9;
                    }
                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    boolean zM87157i8 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i8 | z18;
                    objM87133R4 = c28655q2.m87133R();
                    if (z19) {
                        final int i212 = 1;
                        InterfaceC4339a interfaceC4339a11 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i212) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        function2 = function1;
                        c28655q2.m87172p0(interfaceC4339a11);
                        objM87133R4 = interfaceC4339a11;
                    } else {
                        final int i213 = 1;
                        InterfaceC4339a interfaceC4339a12 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i213) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        function2 = function1;
                        c28655q2.m87172p0(interfaceC4339a12);
                        objM87133R4 = interfaceC4339a12;
                    }
                    InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                    boolean zM87157i9 = c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i9 | z24 | (i26 == 16384);
                    objM87133R5 = c28655q2.m87133R();
                    if (z25) {
                        objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC14515a interfaceC14515a9 = interfaceC14515a4;
                    c28655q = c28655q2;
                    AbstractC35662e.m112943g(null, c23196w3, c35666gM1412d1, null, interfaceC4339a10, interfaceC4339a13, (InterfaceC4339a) ((InterfaceC21467g) objM87133R5), null, false, null, null, false, AbstractC37817c.m121344e(-600986213, c28655q2, new C0563n(listM60536k5, function2, bottomSheet, listM60536k4, listM60536k6)), c28655q, C35666g.f151591h << 6, 384, 3977);
                    modalAnalyticEventModel3 = modalAnalyticEventModel5;
                    interfaceC14515a3 = interfaceC14515a9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modalAnalyticEventModel3 = modalAnalyticEventModel2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) bottomSheet, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i15 |= 3072;
            interfaceC14515a2 = interfaceC14515a;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        modalAnalyticEventModel4 = null;
                    } else {
                        modalAnalyticEventModel4 = modalAnalyticEventModel2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C0155d(9);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(bottomSheet) | c28655q2.m87153g(c23196w3M67125g);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    boolean zM87157i10 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c23196w3M67125g) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z28 = zM87157i10 | z13;
                    i25 = i15 & 57344;
                    if (i25 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z28 | z14;
                    Object objM87133R9 = c28655q2.m87133R();
                    if (z15) {
                        InterfaceC14515a interfaceC14515a10 = interfaceC14515a4;
                        c28676v1 = c28676v0;
                        c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a10, function1, interfaceC4339a2, 0);
                        interfaceC14515a4 = interfaceC14515a10;
                        c23196w3 = c23196w3M67125g;
                        c28655q2.m87172p0(c0561l);
                    } else {
                        InterfaceC14515a interfaceC14515a11 = interfaceC14515a4;
                        c28676v1 = c28676v0;
                        c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a11, function1, interfaceC4339a2, 0);
                        interfaceC14515a4 = interfaceC14515a11;
                        c23196w3 = c23196w3M67125g;
                        c28655q2.m87172p0(c0561l);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) c0561l, false, c28655q2, 0, 1);
                    C21535a c21535aM1465b3 = AbstractC0568s.m1465b();
                    List listM60536k7 = C21535a.m60536k(c21535aM1465b3, bottomSheet.getItems(), null, 2, null);
                    fixedHeader = bottomSheet.getFixedHeader();
                    if (fixedHeader != null) {
                        items = fixedHeader.getItems();
                    } else {
                        items = null;
                    }
                    c25271y = C25271y.f99162w;
                    if (items == null) {
                        items = c25271y;
                    }
                    List listM60536k8 = C21535a.m60536k(c21535aM1465b3, items, null, 2, null);
                    fixedFooter = bottomSheet.getFixedFooter();
                    if (fixedFooter != null) {
                        items2 = fixedFooter.getItems();
                    } else {
                        items2 = null;
                    }
                    if (items2 == null) {
                        items2 = c25271y;
                    }
                    List listM60536k9 = C21535a.m60536k(c21535aM1465b3, items2, null, 2, null);
                    C35666g c35666gM1412d2 = m1412d0(bottomSheet.getNavigationBar());
                    boolean zM87157i11 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i11 | z16;
                    objM87133R3 = c28655q2.m87133R();
                    if (z17) {
                        modalAnalyticEventModel5 = modalAnalyticEventModel4;
                        final int i214 = 0;
                        i26 = i25;
                        InterfaceC4339a interfaceC4339a14 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i214) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        c28655q2.m87172p0(interfaceC4339a14);
                        objM87133R3 = interfaceC4339a14;
                    } else {
                        modalAnalyticEventModel5 = modalAnalyticEventModel4;
                        final int i215 = 0;
                        i26 = i25;
                        InterfaceC4339a interfaceC4339a15 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i215) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        c28655q2.m87172p0(interfaceC4339a15);
                        objM87133R3 = interfaceC4339a15;
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R3;
                    boolean zM87157i12 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i12 | z18;
                    objM87133R4 = c28655q2.m87133R();
                    if (z19) {
                        final int i216 = 1;
                        InterfaceC4339a interfaceC4339a17 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i216) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        function2 = function1;
                        c28655q2.m87172p0(interfaceC4339a17);
                        objM87133R4 = interfaceC4339a17;
                    } else {
                        final int i217 = 1;
                        InterfaceC4339a interfaceC4339a18 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i217) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        function2 = function1;
                        c28655q2.m87172p0(interfaceC4339a18);
                        objM87133R4 = interfaceC4339a18;
                    }
                    InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R4;
                    boolean zM87157i13 = c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i13 | z24 | (i26 == 16384);
                    objM87133R5 = c28655q2.m87133R();
                    if (z25) {
                        objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC14515a interfaceC14515a12 = interfaceC14515a4;
                    c28655q = c28655q2;
                    AbstractC35662e.m112943g(null, c23196w3, c35666gM1412d2, null, interfaceC4339a16, interfaceC4339a19, (InterfaceC4339a) ((InterfaceC21467g) objM87133R5), null, false, null, null, false, AbstractC37817c.m121344e(-600986213, c28655q2, new C0563n(listM60536k8, function2, bottomSheet, listM60536k7, listM60536k9)), c28655q, C35666g.f151591h << 6, 384, 3977);
                    modalAnalyticEventModel3 = modalAnalyticEventModel5;
                    interfaceC14515a3 = interfaceC14515a12;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modalAnalyticEventModel3 = modalAnalyticEventModel2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) bottomSheet, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    modalAnalyticEventModel4 = null;
                } else {
                    modalAnalyticEventModel4 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C0155d(9);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(bottomSheet) | c28655q2.m87153g(c23196w3M67125g);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                boolean zM87157i14 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c23196w3M67125g) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z29 = zM87157i14 | z13;
                i25 = i15 & 57344;
                if (i25 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z29 | z14;
                Object objM87133R10 = c28655q2.m87133R();
                if (z15) {
                    InterfaceC14515a interfaceC14515a13 = interfaceC14515a4;
                    c28676v1 = c28676v0;
                    c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a13, function1, interfaceC4339a2, 0);
                    interfaceC14515a4 = interfaceC14515a13;
                    c23196w3 = c23196w3M67125g;
                    c28655q2.m87172p0(c0561l);
                } else {
                    InterfaceC14515a interfaceC14515a14 = interfaceC14515a4;
                    c28676v1 = c28676v0;
                    c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a14, function1, interfaceC4339a2, 0);
                    interfaceC14515a4 = interfaceC14515a14;
                    c23196w3 = c23196w3M67125g;
                    c28655q2.m87172p0(c0561l);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) c0561l, false, c28655q2, 0, 1);
                C21535a c21535aM1465b4 = AbstractC0568s.m1465b();
                List listM60536k10 = C21535a.m60536k(c21535aM1465b4, bottomSheet.getItems(), null, 2, null);
                fixedHeader = bottomSheet.getFixedHeader();
                if (fixedHeader != null) {
                    items = fixedHeader.getItems();
                } else {
                    items = null;
                }
                c25271y = C25271y.f99162w;
                if (items == null) {
                    items = c25271y;
                }
                List listM60536k11 = C21535a.m60536k(c21535aM1465b4, items, null, 2, null);
                fixedFooter = bottomSheet.getFixedFooter();
                if (fixedFooter != null) {
                    items2 = fixedFooter.getItems();
                } else {
                    items2 = null;
                }
                if (items2 == null) {
                    items2 = c25271y;
                }
                List listM60536k12 = C21535a.m60536k(c21535aM1465b4, items2, null, 2, null);
                C35666g c35666gM1412d3 = m1412d0(bottomSheet.getNavigationBar());
                boolean zM87157i15 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i15 | z16;
                objM87133R3 = c28655q2.m87133R();
                if (z17) {
                    modalAnalyticEventModel5 = modalAnalyticEventModel4;
                    final int i218 = 0;
                    i26 = i25;
                    InterfaceC4339a interfaceC4339a110 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i218) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    c28655q2.m87172p0(interfaceC4339a110);
                    objM87133R3 = interfaceC4339a110;
                } else {
                    modalAnalyticEventModel5 = modalAnalyticEventModel4;
                    final int i219 = 0;
                    i26 = i25;
                    InterfaceC4339a interfaceC4339a111 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i219) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    c28655q2.m87172p0(interfaceC4339a111);
                    objM87133R3 = interfaceC4339a111;
                }
                InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R3;
                boolean zM87157i16 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i16 | z18;
                objM87133R4 = c28655q2.m87133R();
                if (z19) {
                    final int i2110 = 1;
                    InterfaceC4339a interfaceC4339a113 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2110) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    function2 = function1;
                    c28655q2.m87172p0(interfaceC4339a113);
                    objM87133R4 = interfaceC4339a113;
                } else {
                    final int i2111 = 1;
                    InterfaceC4339a interfaceC4339a114 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2111) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    function2 = function1;
                    c28655q2.m87172p0(interfaceC4339a114);
                    objM87133R4 = interfaceC4339a114;
                }
                InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R4;
                boolean zM87157i17 = c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i17 | z24 | (i26 == 16384);
                objM87133R5 = c28655q2.m87133R();
                if (z25) {
                    objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC14515a interfaceC14515a15 = interfaceC14515a4;
                c28655q = c28655q2;
                AbstractC35662e.m112943g(null, c23196w3, c35666gM1412d3, null, interfaceC4339a112, interfaceC4339a115, (InterfaceC4339a) ((InterfaceC21467g) objM87133R5), null, false, null, null, false, AbstractC37817c.m121344e(-600986213, c28655q2, new C0563n(listM60536k11, function2, bottomSheet, listM60536k10, listM60536k12)), c28655q, C35666g.f151591h << 6, 384, 3977);
                modalAnalyticEventModel3 = modalAnalyticEventModel5;
                interfaceC14515a3 = interfaceC14515a15;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) bottomSheet, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 384;
        modalAnalyticEventModel2 = modalAnalyticEventModel;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC14515a2 = interfaceC14515a;
                if (c28655q2.m87157i(interfaceC14515a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        modalAnalyticEventModel4 = null;
                    } else {
                        modalAnalyticEventModel4 = modalAnalyticEventModel2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C0155d(9);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                    zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(bottomSheet) | c28655q2.m87153g(c23196w3M67125g);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    boolean zM87157i18 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c23196w3M67125g) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                    i24 = i15 & 112;
                    if (i24 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z210 = zM87157i18 | z13;
                    i25 = i15 & 57344;
                    if (i25 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z210 | z14;
                    Object objM87133R11 = c28655q2.m87133R();
                    if (z15) {
                        InterfaceC14515a interfaceC14515a16 = interfaceC14515a4;
                        c28676v1 = c28676v0;
                        c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a16, function1, interfaceC4339a2, 0);
                        interfaceC14515a4 = interfaceC14515a16;
                        c23196w3 = c23196w3M67125g;
                        c28655q2.m87172p0(c0561l);
                    } else {
                        InterfaceC14515a interfaceC14515a17 = interfaceC14515a4;
                        c28676v1 = c28676v0;
                        c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a17, function1, interfaceC4339a2, 0);
                        interfaceC14515a4 = interfaceC14515a17;
                        c23196w3 = c23196w3M67125g;
                        c28655q2.m87172p0(c0561l);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) c0561l, false, c28655q2, 0, 1);
                    C21535a c21535aM1465b5 = AbstractC0568s.m1465b();
                    List listM60536k13 = C21535a.m60536k(c21535aM1465b5, bottomSheet.getItems(), null, 2, null);
                    fixedHeader = bottomSheet.getFixedHeader();
                    if (fixedHeader != null) {
                        items = fixedHeader.getItems();
                    } else {
                        items = null;
                    }
                    c25271y = C25271y.f99162w;
                    if (items == null) {
                        items = c25271y;
                    }
                    List listM60536k14 = C21535a.m60536k(c21535aM1465b5, items, null, 2, null);
                    fixedFooter = bottomSheet.getFixedFooter();
                    if (fixedFooter != null) {
                        items2 = fixedFooter.getItems();
                    } else {
                        items2 = null;
                    }
                    if (items2 == null) {
                        items2 = c25271y;
                    }
                    List listM60536k15 = C21535a.m60536k(c21535aM1465b5, items2, null, 2, null);
                    C35666g c35666gM1412d4 = m1412d0(bottomSheet.getNavigationBar());
                    boolean zM87157i19 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i19 | z16;
                    objM87133R3 = c28655q2.m87133R();
                    if (z17) {
                        modalAnalyticEventModel5 = modalAnalyticEventModel4;
                        final int i2112 = 0;
                        i26 = i25;
                        InterfaceC4339a interfaceC4339a116 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2112) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        c28655q2.m87172p0(interfaceC4339a116);
                        objM87133R3 = interfaceC4339a116;
                    } else {
                        modalAnalyticEventModel5 = modalAnalyticEventModel4;
                        final int i2113 = 0;
                        i26 = i25;
                        InterfaceC4339a interfaceC4339a117 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2113) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        c28655q2.m87172p0(interfaceC4339a117);
                        objM87133R3 = interfaceC4339a117;
                    }
                    InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R3;
                    boolean zM87157i110 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zM87157i110 | z18;
                    objM87133R4 = c28655q2.m87133R();
                    if (z19) {
                        final int i2114 = 1;
                        InterfaceC4339a interfaceC4339a119 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2114) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        function2 = function1;
                        c28655q2.m87172p0(interfaceC4339a119);
                        objM87133R4 = interfaceC4339a119;
                    } else {
                        final int i2115 = 1;
                        InterfaceC4339a interfaceC4339a1110 = new InterfaceC4339a() { // from class: a81.m
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2115) {
                                    case 0:
                                        return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                    default:
                                        return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                }
                            }
                        };
                        function2 = function1;
                        c28655q2.m87172p0(interfaceC4339a1110);
                        objM87133R4 = interfaceC4339a1110;
                    }
                    InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R4;
                    boolean zM87157i111 = c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                    if (i24 == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i111 | z24 | (i26 == 16384);
                    objM87133R5 = c28655q2.m87133R();
                    if (z25) {
                        objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC14515a interfaceC14515a18 = interfaceC14515a4;
                    c28655q = c28655q2;
                    AbstractC35662e.m112943g(null, c23196w3, c35666gM1412d4, null, interfaceC4339a118, interfaceC4339a1111, (InterfaceC4339a) ((InterfaceC21467g) objM87133R5), null, false, null, null, false, AbstractC37817c.m121344e(-600986213, c28655q2, new C0563n(listM60536k14, function2, bottomSheet, listM60536k13, listM60536k15)), c28655q, C35666g.f151591h << 6, 384, 3977);
                    modalAnalyticEventModel3 = modalAnalyticEventModel5;
                    interfaceC14515a3 = interfaceC14515a18;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modalAnalyticEventModel3 = modalAnalyticEventModel2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) bottomSheet, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    modalAnalyticEventModel4 = null;
                } else {
                    modalAnalyticEventModel4 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C0155d(9);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(bottomSheet) | c28655q2.m87153g(c23196w3M67125g);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                boolean zM87157i112 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c23196w3M67125g) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z211 = zM87157i112 | z13;
                i25 = i15 & 57344;
                if (i25 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z211 | z14;
                Object objM87133R12 = c28655q2.m87133R();
                if (z15) {
                    InterfaceC14515a interfaceC14515a19 = interfaceC14515a4;
                    c28676v1 = c28676v0;
                    c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a19, function1, interfaceC4339a2, 0);
                    interfaceC14515a4 = interfaceC14515a19;
                    c23196w3 = c23196w3M67125g;
                    c28655q2.m87172p0(c0561l);
                } else {
                    InterfaceC14515a interfaceC14515a110 = interfaceC14515a4;
                    c28676v1 = c28676v0;
                    c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a110, function1, interfaceC4339a2, 0);
                    interfaceC14515a4 = interfaceC14515a110;
                    c23196w3 = c23196w3M67125g;
                    c28655q2.m87172p0(c0561l);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) c0561l, false, c28655q2, 0, 1);
                C21535a c21535aM1465b6 = AbstractC0568s.m1465b();
                List listM60536k16 = C21535a.m60536k(c21535aM1465b6, bottomSheet.getItems(), null, 2, null);
                fixedHeader = bottomSheet.getFixedHeader();
                if (fixedHeader != null) {
                    items = fixedHeader.getItems();
                } else {
                    items = null;
                }
                c25271y = C25271y.f99162w;
                if (items == null) {
                    items = c25271y;
                }
                List listM60536k17 = C21535a.m60536k(c21535aM1465b6, items, null, 2, null);
                fixedFooter = bottomSheet.getFixedFooter();
                if (fixedFooter != null) {
                    items2 = fixedFooter.getItems();
                } else {
                    items2 = null;
                }
                if (items2 == null) {
                    items2 = c25271y;
                }
                List listM60536k18 = C21535a.m60536k(c21535aM1465b6, items2, null, 2, null);
                C35666g c35666gM1412d5 = m1412d0(bottomSheet.getNavigationBar());
                boolean zM87157i113 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i113 | z16;
                objM87133R3 = c28655q2.m87133R();
                if (z17) {
                    modalAnalyticEventModel5 = modalAnalyticEventModel4;
                    final int i2116 = 0;
                    i26 = i25;
                    InterfaceC4339a interfaceC4339a1112 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2116) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    c28655q2.m87172p0(interfaceC4339a1112);
                    objM87133R3 = interfaceC4339a1112;
                } else {
                    modalAnalyticEventModel5 = modalAnalyticEventModel4;
                    final int i2117 = 0;
                    i26 = i25;
                    InterfaceC4339a interfaceC4339a1113 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2117) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    c28655q2.m87172p0(interfaceC4339a1113);
                    objM87133R3 = interfaceC4339a1113;
                }
                InterfaceC4339a interfaceC4339a1114 = (InterfaceC4339a) objM87133R3;
                boolean zM87157i114 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i114 | z18;
                objM87133R4 = c28655q2.m87133R();
                if (z19) {
                    final int i2118 = 1;
                    InterfaceC4339a interfaceC4339a1115 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2118) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    function2 = function1;
                    c28655q2.m87172p0(interfaceC4339a1115);
                    objM87133R4 = interfaceC4339a1115;
                } else {
                    final int i2119 = 1;
                    InterfaceC4339a interfaceC4339a1116 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2119) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    function2 = function1;
                    c28655q2.m87172p0(interfaceC4339a1116);
                    objM87133R4 = interfaceC4339a1116;
                }
                InterfaceC4339a interfaceC4339a1117 = (InterfaceC4339a) objM87133R4;
                boolean zM87157i115 = c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i115 | z24 | (i26 == 16384);
                objM87133R5 = c28655q2.m87133R();
                if (z25) {
                    objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC14515a interfaceC14515a111 = interfaceC14515a4;
                c28655q = c28655q2;
                AbstractC35662e.m112943g(null, c23196w3, c35666gM1412d5, null, interfaceC4339a1114, interfaceC4339a1117, (InterfaceC4339a) ((InterfaceC21467g) objM87133R5), null, false, null, null, false, AbstractC37817c.m121344e(-600986213, c28655q2, new C0563n(listM60536k17, function2, bottomSheet, listM60536k16, listM60536k18)), c28655q, C35666g.f151591h << 6, 384, 3977);
                modalAnalyticEventModel3 = modalAnalyticEventModel5;
                interfaceC14515a3 = interfaceC14515a111;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) bottomSheet, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 3072;
        interfaceC14515a2 = interfaceC14515a;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    modalAnalyticEventModel4 = null;
                } else {
                    modalAnalyticEventModel4 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C0155d(9);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
                zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(bottomSheet) | c28655q2.m87153g(c23196w3M67125g);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                boolean zM87157i116 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c23196w3M67125g) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                i24 = i15 & 112;
                if (i24 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z212 = zM87157i116 | z13;
                i25 = i15 & 57344;
                if (i25 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z212 | z14;
                Object objM87133R13 = c28655q2.m87133R();
                if (z15) {
                    InterfaceC14515a interfaceC14515a112 = interfaceC14515a4;
                    c28676v1 = c28676v0;
                    c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a112, function1, interfaceC4339a2, 0);
                    interfaceC14515a4 = interfaceC14515a112;
                    c23196w3 = c23196w3M67125g;
                    c28655q2.m87172p0(c0561l);
                } else {
                    InterfaceC14515a interfaceC14515a113 = interfaceC14515a4;
                    c28676v1 = c28676v0;
                    c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a113, function1, interfaceC4339a2, 0);
                    interfaceC14515a4 = interfaceC14515a113;
                    c23196w3 = c23196w3M67125g;
                    c28655q2.m87172p0(c0561l);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) c0561l, false, c28655q2, 0, 1);
                C21535a c21535aM1465b7 = AbstractC0568s.m1465b();
                List listM60536k19 = C21535a.m60536k(c21535aM1465b7, bottomSheet.getItems(), null, 2, null);
                fixedHeader = bottomSheet.getFixedHeader();
                if (fixedHeader != null) {
                    items = fixedHeader.getItems();
                } else {
                    items = null;
                }
                c25271y = C25271y.f99162w;
                if (items == null) {
                    items = c25271y;
                }
                List listM60536k110 = C21535a.m60536k(c21535aM1465b7, items, null, 2, null);
                fixedFooter = bottomSheet.getFixedFooter();
                if (fixedFooter != null) {
                    items2 = fixedFooter.getItems();
                } else {
                    items2 = null;
                }
                if (items2 == null) {
                    items2 = c25271y;
                }
                List listM60536k111 = C21535a.m60536k(c21535aM1465b7, items2, null, 2, null);
                C35666g c35666gM1412d6 = m1412d0(bottomSheet.getNavigationBar());
                boolean zM87157i117 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i117 | z16;
                objM87133R3 = c28655q2.m87133R();
                if (z17) {
                    modalAnalyticEventModel5 = modalAnalyticEventModel4;
                    final int i21110 = 0;
                    i26 = i25;
                    InterfaceC4339a interfaceC4339a1118 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21110) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    c28655q2.m87172p0(interfaceC4339a1118);
                    objM87133R3 = interfaceC4339a1118;
                } else {
                    modalAnalyticEventModel5 = modalAnalyticEventModel4;
                    final int i21111 = 0;
                    i26 = i25;
                    InterfaceC4339a interfaceC4339a1119 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21111) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    c28655q2.m87172p0(interfaceC4339a1119);
                    objM87133R3 = interfaceC4339a1119;
                }
                InterfaceC4339a interfaceC4339a11110 = (InterfaceC4339a) objM87133R3;
                boolean zM87157i118 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i118 | z18;
                objM87133R4 = c28655q2.m87133R();
                if (z19) {
                    final int i21112 = 1;
                    InterfaceC4339a interfaceC4339a11111 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21112) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    function2 = function1;
                    c28655q2.m87172p0(interfaceC4339a11111);
                    objM87133R4 = interfaceC4339a11111;
                } else {
                    final int i21113 = 1;
                    InterfaceC4339a interfaceC4339a11112 = new InterfaceC4339a() { // from class: a81.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21113) {
                                case 0:
                                    return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                                default:
                                    return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            }
                        }
                    };
                    function2 = function1;
                    c28655q2.m87172p0(interfaceC4339a11112);
                    objM87133R4 = interfaceC4339a11112;
                }
                InterfaceC4339a interfaceC4339a11113 = (InterfaceC4339a) objM87133R4;
                boolean zM87157i119 = c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
                if (i24 == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i119 | z24 | (i26 == 16384);
                objM87133R5 = c28655q2.m87133R();
                if (z25) {
                    objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC14515a interfaceC14515a114 = interfaceC14515a4;
                c28655q = c28655q2;
                AbstractC35662e.m112943g(null, c23196w3, c35666gM1412d6, null, interfaceC4339a11110, interfaceC4339a11113, (InterfaceC4339a) ((InterfaceC21467g) objM87133R5), null, false, null, null, false, AbstractC37817c.m121344e(-600986213, c28655q2, new C0563n(listM60536k110, function2, bottomSheet, listM60536k19, listM60536k111)), c28655q, C35666g.f151591h << 6, 384, 3977);
                modalAnalyticEventModel3 = modalAnalyticEventModel5;
                interfaceC14515a3 = interfaceC14515a114;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) bottomSheet, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i27 != 0) {
                modalAnalyticEventModel4 = null;
            } else {
                modalAnalyticEventModel4 = modalAnalyticEventModel2;
            }
            if (i16 != 0) {
                interfaceC14515a4 = null;
            } else {
                interfaceC14515a4 = interfaceC14515a2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C0155d(9);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q2, 2);
            zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(bottomSheet) | c28655q2.m87153g(c23196w3M67125g);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(interfaceC2994c0, bottomSheet, c23196w3M67125g, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            boolean zM87157i1110 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(c23196w3M67125g) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
            i24 = i15 & 112;
            if (i24 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z213 = zM87157i1110 | z13;
            i25 = i15 & 57344;
            if (i25 == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z213 | z14;
            Object objM87133R14 = c28655q2.m87133R();
            if (z15) {
                InterfaceC14515a interfaceC14515a115 = interfaceC14515a4;
                c28676v1 = c28676v0;
                c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a115, function1, interfaceC4339a2, 0);
                interfaceC14515a4 = interfaceC14515a115;
                c23196w3 = c23196w3M67125g;
                c28655q2.m87172p0(c0561l);
            } else {
                InterfaceC14515a interfaceC14515a116 = interfaceC14515a4;
                c28676v1 = c28676v0;
                c0561l = new C0561l(interfaceC2994c0, c23196w3M67125g, modalAnalyticEventModel4, interfaceC14515a116, function1, interfaceC4339a2, 0);
                interfaceC14515a4 = interfaceC14515a116;
                c23196w3 = c23196w3M67125g;
                c28655q2.m87172p0(c0561l);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) c0561l, false, c28655q2, 0, 1);
            C21535a c21535aM1465b8 = AbstractC0568s.m1465b();
            List listM60536k112 = C21535a.m60536k(c21535aM1465b8, bottomSheet.getItems(), null, 2, null);
            fixedHeader = bottomSheet.getFixedHeader();
            if (fixedHeader != null) {
                items = fixedHeader.getItems();
            } else {
                items = null;
            }
            c25271y = C25271y.f99162w;
            if (items == null) {
                items = c25271y;
            }
            List listM60536k113 = C21535a.m60536k(c21535aM1465b8, items, null, 2, null);
            fixedFooter = bottomSheet.getFixedFooter();
            if (fixedFooter != null) {
                items2 = fixedFooter.getItems();
            } else {
                items2 = null;
            }
            if (items2 == null) {
                items2 = c25271y;
            }
            List listM60536k114 = C21535a.m60536k(c21535aM1465b8, items2, null, 2, null);
            C35666g c35666gM1412d7 = m1412d0(bottomSheet.getNavigationBar());
            boolean zM87157i1111 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel4) | c28655q2.m87157i(interfaceC14515a4);
            if (i24 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87157i1111 | z16;
            objM87133R3 = c28655q2.m87133R();
            if (z17) {
                modalAnalyticEventModel5 = modalAnalyticEventModel4;
                final int i21114 = 0;
                i26 = i25;
                InterfaceC4339a interfaceC4339a11114 = new InterfaceC4339a() { // from class: a81.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i21114) {
                            case 0:
                                return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            default:
                                return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                        }
                    }
                };
                c28655q2.m87172p0(interfaceC4339a11114);
                objM87133R3 = interfaceC4339a11114;
            } else {
                modalAnalyticEventModel5 = modalAnalyticEventModel4;
                final int i21115 = 0;
                i26 = i25;
                InterfaceC4339a interfaceC4339a11115 = new InterfaceC4339a() { // from class: a81.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i21115) {
                            case 0:
                                return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            default:
                                return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                        }
                    }
                };
                c28655q2.m87172p0(interfaceC4339a11115);
                objM87133R3 = interfaceC4339a11115;
            }
            InterfaceC4339a interfaceC4339a11116 = (InterfaceC4339a) objM87133R3;
            boolean zM87157i1112 = c28655q2.m87157i(bottomSheet) | c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
            if (i24 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zM87157i1112 | z18;
            objM87133R4 = c28655q2.m87133R();
            if (z19) {
                final int i21116 = 1;
                InterfaceC4339a interfaceC4339a11117 = new InterfaceC4339a() { // from class: a81.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i21116) {
                            case 0:
                                return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            default:
                                return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                        }
                    }
                };
                function2 = function1;
                c28655q2.m87172p0(interfaceC4339a11117);
                objM87133R4 = interfaceC4339a11117;
            } else {
                final int i21117 = 1;
                InterfaceC4339a interfaceC4339a11118 = new InterfaceC4339a() { // from class: a81.m
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i21117) {
                            case 0:
                                return AbstractC0564o.m1402X(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                            default:
                                return AbstractC0564o.m1403Y(bottomSheet, modalAnalyticEventModel5, interfaceC14515a4, function1);
                        }
                    }
                };
                function2 = function1;
                c28655q2.m87172p0(interfaceC4339a11118);
                objM87133R4 = interfaceC4339a11118;
            }
            InterfaceC4339a interfaceC4339a11119 = (InterfaceC4339a) objM87133R4;
            boolean zM87157i1113 = c28655q2.m87157i(modalAnalyticEventModel5) | c28655q2.m87157i(interfaceC14515a4);
            if (i24 == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zM87157i1113 | z24 | (i26 == 16384);
            objM87133R5 = c28655q2.m87133R();
            if (z25) {
                objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new d(modalAnalyticEventModel5, interfaceC14515a4, function2, interfaceC4339a2);
                c28655q2.m87172p0(objM87133R5);
            }
            InterfaceC14515a interfaceC14515a117 = interfaceC14515a4;
            c28655q = c28655q2;
            AbstractC35662e.m112943g(null, c23196w3, c35666gM1412d7, null, interfaceC4339a11116, interfaceC4339a11119, (InterfaceC4339a) ((InterfaceC21467g) objM87133R5), null, false, null, null, false, AbstractC37817c.m121344e(-600986213, c28655q2, new C0563n(listM60536k113, function2, bottomSheet, listM60536k112, listM60536k114)), c28655q, C35666g.f151591h << 6, 384, 3977);
            modalAnalyticEventModel3 = modalAnalyticEventModel5;
            interfaceC14515a3 = interfaceC14515a117;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modalAnalyticEventModel3 = modalAnalyticEventModel2;
            interfaceC14515a3 = interfaceC14515a2;
        }
        interfaceC4339a3 = interfaceC4339a2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f((Object) bottomSheet, function1, (Object) modalAnalyticEventModel3, (Object) interfaceC14515a3, (InterfaceC23459e) interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m1399U(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, InterfaceC4339a interfaceC4339a) {
        ModalTrackingKt.trackModalDismissed(modalAnalyticEventModel, interfaceC14515a);
        function1.invoke(InterfaceC0569t.a.f2023a);
        interfaceC4339a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m1400V() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m1401W(InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, InterfaceC4339a interfaceC4339a) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c23196w3, modalAnalyticEventModel, interfaceC14515a, function1, interfaceC4339a, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m1402X(BottomSheet bottomSheet, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1) {
        NavigationBarModel navigationBar = bottomSheet.getNavigationBar();
        if (navigationBar != null && navigationBar.getLeftButton() != null) {
            ModalTrackingKt.trackModalDismissed(modalAnalyticEventModel, interfaceC14515a);
            function1.invoke(InterfaceC0569t.a.f2023a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m1403Y(BottomSheet bottomSheet, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1) {
        NavigationBarModel navigationBar = bottomSheet.getNavigationBar();
        if (navigationBar != null && navigationBar.getRightButton() != null) {
            ModalTrackingKt.trackModalDismissed(modalAnalyticEventModel, interfaceC14515a);
            function1.invoke(InterfaceC0569t.a.f2023a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m1404Z(List list, Function1 function1, BottomSheet bottomSheet, List list2, List list3, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BottomSheetM3) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 1 * 8;
            C2314t c2314t = C2314t.f9131w;
            m1434y(list, function1, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7), c28655q, 384, 0);
            Modifier modifierM44088l = AbstractC15674c.m44088l(((C23016z) BottomSheetM3).m66779c(AbstractC1102d.m3409f(1.0f, c2314t), bottomSheet.getHeight() == BottomSheetHeight.FULL, 1.0f), f13);
            boolean zM87157i = c28655q.m87157i(list2) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0557h(list2, 0, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifierM44088l, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 510);
            m1434y(list3, function1, AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m1406a0(List list, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, C0550a.f1900a.m1375b(), 3);
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list.size(), null, new g(f.f1997w, list), new C37816b(new h(list, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m1408b0(BottomSheet bottomSheet, Function1 function1, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m1398T(bottomSheet, function1, modalAnalyticEventModel, interfaceC14515a, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    private static final C35666g m1412d0(NavigationBarModel navigationBarModel) {
        TextResource textResourceM21278l;
        if (navigationBarModel == null) {
            return new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
        }
        String title = navigationBarModel.getTitle();
        TextResource textResource = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (title == null) {
            textResourceM21278l = null;
        } else {
            if (AbstractC39414r.m125890i0(title)) {
                title = null;
            }
            if (title != null) {
                textResourceM21278l = AbstractC8693b.m21278l(title);
            } else {
                textResourceM21278l = null;
            }
        }
        NavigationButtonModel leftButton = navigationBarModel.getLeftButton();
        int i13 = 2;
        C39274g c39274g = leftButton != null ? new C39274g(leftButton.getIcon().toWhoopIcon(), textResource, i13, objArr3 == true ? 1 : 0) : null;
        NavigationButtonModel rightButton = navigationBarModel.getRightButton();
        return new C35666g(textResourceM21278l, c39274g, rightButton != null ? new C39274g(rightButton.getIcon().toWhoopIcon(), objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0) : null, EnumC35671i0.CENTER, null, 0.0f, 0.0f, 112, null);
    }

    /* JADX INFO: renamed from: e0 */
    private static final void m1414e0(DialogButton dialogButton, Function1 function1, InterfaceC14515a interfaceC14515a) {
        ModalTrackingKt.trackDialogButtonClicked(dialogButton.getAnalyticEvent(), interfaceC14515a);
        if (dialogButton.getModal() != null) {
            AnyModal modal = dialogButton.getModal();
            function1.invoke(InterfaceC0569t.a.f2023a);
            function1.invoke(new InterfaceC0569t.f(modal));
            return;
        }
        if (dialogButton.getDismissEvent() != null) {
            C21166s c21166sM59413a = AbstractC21170u.m59413a(dialogButton.getDismissEvent());
            function1.invoke(InterfaceC0569t.a.f2023a);
            function1.invoke(new InterfaceC0569t.e(c21166sM59413a));
        } else if (dialogButton.getAction() != null) {
            Action action = dialogButton.getAction();
            function1.invoke(InterfaceC0569t.a.f2023a);
            function1.invoke(new InterfaceC0569t.d(action));
        } else {
            if (dialogButton.getDestination() == null) {
                function1.invoke(InterfaceC0569t.a.f2023a);
                return;
            }
            C9598e destination = dialogButton.getDestination();
            function1.invoke(InterfaceC0569t.a.f2023a);
            function1.invoke(new InterfaceC0569t.c(destination));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    private static final void m1434y(List<C25306o> list, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        boolean z4;
        C28655q c28655q;
        Modifier modifier2;
        C28677v1 c28677v1M87180u;
        C0560k c0560k;
        Modifier modifier3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(28874138);
        int i16 = (i13 & 6) == 0 ? (c28655q2.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                i16 |= c28655q2.m87153g(modifier) ? 256 : 128;
            }
            i15 = i16;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                if (list.isEmpty()) {
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    } else {
                        c0560k = new C0560k(list, function1, modifier3, i13, i14, 0);
                    }
                } else {
                    Modifier modifier4 = modifier3;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9111N, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    c28655q2.m87150e0(700998091);
                    for (C25306o c25306o : list) {
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q2.m87157i(c25306o);
                        objM87133R = c28655q2.m87133R();
                        if (zM87157i || objM87133R == C28635l.f115821a) {
                            objM87133R = new C0559j(function1, c25306o, 1);
                            c28655q2.m87172p0(objM87133R);
                        }
                        C28655q c28655q3 = c28655q2;
                        AbstractC25303l.m74290q(c25306o, null, null, (Function1) objM87133R, c28655q3, C25306o.f99297c, 6);
                        c28655q2 = c28655q3;
                    }
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    modifier2 = modifier4;
                }
                c28677v1M87180u.f115982d = c0560k;
            }
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c0560k = new C0560k(list, function1, modifier2, i13, i14, 1);
                c28677v1M87180u.f115982d = c0560k;
            }
        }
        i16 |= 384;
        i15 = i16;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            if (list.isEmpty()) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                } else {
                    c0560k = new C0560k(list, function1, modifier3, i13, i14, 0);
                }
            } else {
                Modifier modifier5 = modifier3;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier5);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                c28655q2.m87150e0(700998091);
                while (r12.hasNext()) {
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q2.m87157i(c25306o);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R = new C0559j(function1, c25306o, 1);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C0559j(function1, c25306o, 1);
                        c28655q2.m87172p0(objM87133R);
                    }
                    C28655q c28655q4 = c28655q2;
                    AbstractC25303l.m74290q(c25306o, null, null, (Function1) objM87133R, c28655q4, C25306o.f99297c, 6);
                    c28655q2 = c28655q4;
                }
                c28655q = c28655q2;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier2 = modifier5;
            }
            c28677v1M87180u.f115982d = c0560k;
        }
        c28655q = c28655q2;
        c28655q.m87138X();
        modifier2 = modifier;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c0560k = new C0560k(list, function1, modifier2, i13, i14, 1);
            c28677v1M87180u.f115982d = c0560k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m1435z(List list, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m1434y(list, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
