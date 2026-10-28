package a81;

import a01.C0085e;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.ModalAnalyticEventModel;
import com.whoop.design.models.modal.ModalTrackingKt;
import com.whoop.design.models.modal.ToastActionButton;
import com.whoop.design.models.modal.ToastActionButtonAlignment;
import com.whoop.design.models.modal.ToastModal;
import com.whoop.design.models.modal.ToastStyleModel;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import fi0.InterfaceC14515a;
import gb1.AbstractC15693u;
import ge3.AbstractC15751g;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C0003a0;
import p000.C17820i;
import p000.C27314o;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p027b3.AbstractC2453v1;
import p043c4.AbstractC3975r;
import p043c4.C3966j0;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.C18027i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: a81.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u001aC\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a5\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010!\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(\"\u0014\u00101\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010(\"\u0014\u00103\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010(\"\u0014\u00105\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010(¨\u00066"}, m65681d2 = {"Lcom/whoop/design/models/modal/ToastModal;", "toast", "Lkotlin/Function1;", "La81/t;", "Ll83/a0;", "onEvent", "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;", "modalAnalyticEvents", "Lfi0/a;", "analyticsWriter", "i", "(Lcom/whoop/design/models/modal/ToastModal;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Landroidx/compose/runtime/Composer;II)V", "s", "(Lcom/whoop/design/models/modal/ToastModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/models/modal/ToastActionButton;", "actionButton", "m", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/models/modal/ToastActionButton;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/models/modal/ToastActionButtonAlignment;", "Lb2/f;", "v", "(Lcom/whoop/design/models/modal/ToastActionButtonAlignment;)Lb2/f;", "Lcom/whoop/design/models/modal/ToastStyleModel;", "style", "Li2/x;", "x", "(Lcom/whoop/design/models/modal/ToastStyleModel;Landroidx/compose/runtime/Composer;I)J", "Lgz0/m0;", "u", "(Lcom/whoop/design/models/modal/ToastModal;)Lgz0/m0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/design/models/modal/ToastStyleModel;)Lgz0/m0;", "Ly3/f;", "a", "F", "TOAST_ROW_MIN_HEIGHT", "b", "Lcom/whoop/design/models/modal/ToastModal;", "sampleToastInfo", "c", "sampleToastBasic", "d", "sampleToastSuccess", "e", "sampleToastWithActionButton", "f", "sampleToastLongMessage", "g", "sampleToastSnapshotPrivate", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "sampleToastSnapshotVisible", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0567r {

    /* JADX INFO: renamed from: a */
    private static final float f2010a = 8 * 4;

    /* JADX INFO: renamed from: b */
    private static final ToastModal f2011b = new ToastModal("sample-toast-info", "Info toast with icon", ToastStyleModel.INFO, 10, true, (ToastActionButton) null, (String) null, 96, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: c */
    private static final ToastModal f2012c = new ToastModal("sample-toast-basic", "Basic toast without leading icon", ToastStyleModel.BASIC, 10, false, (ToastActionButton) null, (String) null, 96, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: d */
    private static final ToastModal f2013d;

    /* JADX INFO: renamed from: e */
    private static final ToastModal f2014e;

    /* JADX INFO: renamed from: f */
    private static final ToastModal f2015f;

    /* JADX INFO: renamed from: g */
    private static final ToastModal f2016g;

    /* JADX INFO: renamed from: h */
    private static final ToastModal f2017h;

    /* JADX INFO: renamed from: a81.r$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.modal.GenericToastKt$RenderToast$1$1", m100430f = "GenericToast.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f2018w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ ToastModal f2019x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f2020y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ToastModal toastModal, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f2019x = toastModal;
            this.f2020y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f2019x, this.f2020y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f2018w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Duration.Companion companion = Duration.INSTANCE;
                int duration = this.f2019x.getDuration();
                if (duration < 1) {
                    duration = 1;
                }
                long duration2 = DurationKt.toDuration(((long) duration) * 1000, DurationUnit.MILLISECONDS);
                this.f2018w = 1;
                if (AbstractC3034m0.m8783c(duration2, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f2020y.invoke(InterfaceC0569t.a.f2023a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a81.r$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2021a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f2022b;

        static {
            int[] iArr = new int[ToastActionButtonAlignment.values().length];
            try {
                iArr[ToastActionButtonAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToastActionButtonAlignment.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToastActionButtonAlignment.LEADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ToastActionButtonAlignment.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2021a = iArr;
            int[] iArr2 = new int[ToastStyleModel.values().length];
            try {
                iArr2[ToastStyleModel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ToastStyleModel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ToastStyleModel.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ToastStyleModel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ToastStyleModel.BASIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ToastStyleModel.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f2022b = iArr2;
        }
    }

    static {
        ToastStyleModel toastStyleModel = ToastStyleModel.SUCCESS;
        f2013d = new ToastModal("sample-toast-success", "Stealth Mode turned off, sharing resumed with your Community", toastStyleModel, 10, true, (ToastActionButton) null, (String) null, 96, (DefaultConstructorMarker) null);
        f2014e = new ToastModal("sample-toast-action", "Bsherry11 does not have any snapshots to view", ToastStyleModel.WARNING, 10, true, new ToastActionButton("View Profile", "ARROW_RIGHT", (ToastActionButtonAlignment) null, (C9598e) null, 12, (DefaultConstructorMarker) null), (String) null, 64, (DefaultConstructorMarker) null);
        f2015f = new ToastModal("sample-toast-long-message", "Stealth Mode is on, so your Strain, Recovery and Sleep stay hidden from everyone in your Community until you turn it back off", toastStyleModel, 10, true, new ToastActionButton("View Profile", "ARROW_RIGHT", (ToastActionButtonAlignment) null, (C9598e) null, 12, (DefaultConstructorMarker) null), (String) null, 64, (DefaultConstructorMarker) null);
        f2016g = new ToastModal("hide_snapshot_success_toast", "This Snapshot is now private", toastStyleModel, 10, true, (ToastActionButton) null, "SCORE_HIDDEN", 32, (DefaultConstructorMarker) null);
        f2017h = new ToastModal("show_snapshot_success_toast", "This Snapshot is now visible to your community", toastStyleModel, 10, true, (ToastActionButton) null, "PRIVACY", 32, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x013e  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m1448i(ToastModal toast, Function1 onEvent, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Composer composer, int i13, int i14) {
        int i15;
        ModalAnalyticEventModel modalAnalyticEventModel2;
        int i16;
        InterfaceC14515a interfaceC14515a2;
        int i17;
        boolean z4;
        boolean z13;
        ModalAnalyticEventModel modalAnalyticEventModel3;
        InterfaceC14515a interfaceC14515a3;
        C28677v1 c28677v1M87180u;
        ModalAnalyticEventModel modalAnalyticEventModel4;
        InterfaceC14515a interfaceC14515a4;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Function1 function1;
        boolean zM87153g;
        Object objM87133R2;
        AbstractC22676k.m65750j(toast, "toast");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1190529660);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(toast) : c28655q.m87157i(toast) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
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
                z4 = true;
                if ((i15 & 1171) != 1170) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i18 != 0) {
                        modalAnalyticEventModel4 = null;
                    } else {
                        modalAnalyticEventModel4 = modalAnalyticEventModel2;
                    }
                    if (i16 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    boolean zM87157i = c28655q.m87157i(modalAnalyticEventModel4) | c28655q.m87157i(interfaceC14515a4);
                    if ((i15 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i | z14;
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z15 || objM87133R == c28676v0) {
                        objM87133R = new C0565p(modalAnalyticEventModel4, interfaceC14515a4, onEvent, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    function1 = (Function1) objM87133R;
                    String id4 = toast.getId();
                    if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(toast))) {
                        z4 = false;
                    }
                    zM87153g = c28655q.m87153g(function1) | z4;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(toast, function1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, id4);
                    AbstractC3975r.m12005b(C2299e.f9105H, (((long) 0) << 32) | (((long) (-((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(18 * 8))) & 4294967295L), null, new C3966j0(false, false, false, false), AbstractC37817c.m121344e(-2004854911, c28655q, new C0003a0(2, toast, function1)), c28655q, 27654, 4);
                    ModalAnalyticEventModel modalAnalyticEventModel5 = modalAnalyticEventModel4;
                    interfaceC14515a3 = interfaceC14515a4;
                    modalAnalyticEventModel3 = modalAnalyticEventModel5;
                } else {
                    c28655q.m87138X();
                    modalAnalyticEventModel3 = modalAnalyticEventModel2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f(toast, onEvent, modalAnalyticEventModel3, interfaceC14515a3, i13, i14, 1);
                }
            }
            i15 |= 3072;
            interfaceC14515a2 = interfaceC14515a;
            z4 = true;
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i18 != 0) {
                    modalAnalyticEventModel4 = null;
                } else {
                    modalAnalyticEventModel4 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                boolean zM87157i2 = c28655q.m87157i(modalAnalyticEventModel4) | c28655q.m87157i(interfaceC14515a4);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (z15) {
                    objM87133R = new C0565p(modalAnalyticEventModel4, interfaceC14515a4, onEvent, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0565p(modalAnalyticEventModel4, interfaceC14515a4, onEvent, 0);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
                String id5 = toast.getId();
                if ((i15 & 14) != 4) {
                    z4 = false;
                }
                zM87153g = c28655q.m87153g(function1) | z4;
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new a(toast, function1, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(toast, function1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, id5);
                AbstractC3975r.m12005b(C2299e.f9105H, (((long) 0) << 32) | (((long) (-((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(18 * 8))) & 4294967295L), null, new C3966j0(false, false, false, false), AbstractC37817c.m121344e(-2004854911, c28655q, new C0003a0(2, toast, function1)), c28655q, 27654, 4);
                ModalAnalyticEventModel modalAnalyticEventModel6 = modalAnalyticEventModel4;
                interfaceC14515a3 = interfaceC14515a4;
                modalAnalyticEventModel3 = modalAnalyticEventModel6;
            } else {
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(toast, onEvent, modalAnalyticEventModel3, interfaceC14515a3, i13, i14, 1);
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
            z4 = true;
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i18 != 0) {
                    modalAnalyticEventModel4 = null;
                } else {
                    modalAnalyticEventModel4 = modalAnalyticEventModel2;
                }
                if (i16 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                boolean zM87157i3 = c28655q.m87157i(modalAnalyticEventModel4) | c28655q.m87157i(interfaceC14515a4);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i3 | z14;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v2 = C28635l.f115821a;
                if (z15) {
                    objM87133R = new C0565p(modalAnalyticEventModel4, interfaceC14515a4, onEvent, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0565p(modalAnalyticEventModel4, interfaceC14515a4, onEvent, 0);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
                String id6 = toast.getId();
                if ((i15 & 14) != 4) {
                    z4 = false;
                }
                zM87153g = c28655q.m87153g(function1) | z4;
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R2 = new a(toast, function1, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(toast, function1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, id6);
                AbstractC3975r.m12005b(C2299e.f9105H, (((long) 0) << 32) | (((long) (-((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(18 * 8))) & 4294967295L), null, new C3966j0(false, false, false, false), AbstractC37817c.m121344e(-2004854911, c28655q, new C0003a0(2, toast, function1)), c28655q, 27654, 4);
                ModalAnalyticEventModel modalAnalyticEventModel7 = modalAnalyticEventModel4;
                interfaceC14515a3 = interfaceC14515a4;
                modalAnalyticEventModel3 = modalAnalyticEventModel7;
            } else {
                c28655q.m87138X();
                modalAnalyticEventModel3 = modalAnalyticEventModel2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(toast, onEvent, modalAnalyticEventModel3, interfaceC14515a3, i13, i14, 1);
            }
        }
        i15 |= 3072;
        interfaceC14515a2 = interfaceC14515a;
        z4 = true;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i18 != 0) {
                modalAnalyticEventModel4 = null;
            } else {
                modalAnalyticEventModel4 = modalAnalyticEventModel2;
            }
            if (i16 != 0) {
                interfaceC14515a4 = null;
            } else {
                interfaceC14515a4 = interfaceC14515a2;
            }
            boolean zM87157i4 = c28655q.m87157i(modalAnalyticEventModel4) | c28655q.m87157i(interfaceC14515a4);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i4 | z14;
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (z15) {
                objM87133R = new C0565p(modalAnalyticEventModel4, interfaceC14515a4, onEvent, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C0565p(modalAnalyticEventModel4, interfaceC14515a4, onEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            function1 = (Function1) objM87133R;
            String id7 = toast.getId();
            if ((i15 & 14) != 4) {
                z4 = false;
            }
            zM87153g = c28655q.m87153g(function1) | z4;
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R2 = new a(toast, function1, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(toast, function1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, id7);
            AbstractC3975r.m12005b(C2299e.f9105H, (((long) 0) << 32) | (((long) (-((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(18 * 8))) & 4294967295L), null, new C3966j0(false, false, false, false), AbstractC37817c.m121344e(-2004854911, c28655q, new C0003a0(2, toast, function1)), c28655q, 27654, 4);
            ModalAnalyticEventModel modalAnalyticEventModel8 = modalAnalyticEventModel4;
            interfaceC14515a3 = interfaceC14515a4;
            modalAnalyticEventModel3 = modalAnalyticEventModel8;
        } else {
            c28655q.m87138X();
            modalAnalyticEventModel3 = modalAnalyticEventModel2;
            interfaceC14515a3 = interfaceC14515a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f(toast, onEvent, modalAnalyticEventModel3, interfaceC14515a3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m1449j(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, InterfaceC0569t event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC0569t.a) {
            ModalTrackingKt.trackModalDismissed(modalAnalyticEventModel, interfaceC14515a);
        }
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m1450k(ToastModal toastModal, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * 8, 0.0f, 2));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
            m1458s(toastModal, function1, c28655q, C9598e.f28134d);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m1451l(ToastModal toastModal, Function1 function1, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, int i13, int i14, Composer composer, int i15) {
        m1448i(toastModal, function1, modalAnalyticEventModel, interfaceC14515a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m1452m(Modifier modifier, ToastActionButton toastActionButton, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(340122004);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(toastActionButton) : c28655q.m87157i(toastActionButton) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            boolean z4 = toastActionButton.getAction() != null;
            C18027i c18027i = new C18027i(0);
            boolean z13 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && c28655q.m87157i(toastActionButton))) | ((i15 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C17820i(7, toastActionButton, function1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifier4, z4, null, c18027i, (InterfaceC4339a) objM87133R, 10);
            Modifier modifier5 = modifier4;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String text = toastActionButton.getText();
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(text, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getBtS(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            String icon = toastActionButton.getIcon();
            if (icon == null) {
                c28655q.m87150e0(1201511034);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1201511035);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(AbstractC16315n0.m46380e(icon, EnumC16313m0.ARROW_FORWARD), c28655q, 6);
                long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
                float f13 = 4;
                AbstractC23164r1.m67133b(c27430eM107874S, null, AbstractC1102d.m3419p(f13 * f13, c2314t), brandWhite, c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(modifier3, toastActionButton, function1, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m1453n(ToastActionButton toastActionButton, Function1 function1) {
        C9598e action = toastActionButton.getAction();
        if (action != null) {
            function1.invoke(InterfaceC0569t.a.f2023a);
            function1.invoke(new InterfaceC0569t.c(action));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m1454o(Modifier modifier, ToastActionButton toastActionButton, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m1452m(modifier, toastActionButton, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r13v4, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v6, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    private static final void m1455p(ToastModal toastModal, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        ?? r14;
        char c3;
        boolean z4;
        C0209i c0209i;
        ?? r10;
        C0213j c0213j;
        float f13;
        int i15;
        ?? r15;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1824486126);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(toastModal) : c28655q.m87157i(toastModal) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            float f14 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, c2314t);
            float f15 = f14 * 1.5f;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9107J, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            EnumC16313m0 enumC16313m0M1460u = m1460u(toastModal);
            if (enumC16313m0M1460u == null) {
                c28655q.m87150e0(925448541);
                c28655q.m87173q(false);
                r10 = 1;
                z4 = false;
                c0209i = c0209i4;
                c0213j = c0213j2;
                c3 = 4;
            } else {
                c28655q.m87150e0(925448542);
                Modifier modifierM3405b = AbstractC1102d.m3405b(c2314t, 0.0f, f2010a, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3405b);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                c3 = 4;
                z4 = false;
                c0209i = c0209i4;
                r10 = 1;
                c0213j = c0213j2;
                AbstractC23164r1.m67133b(AbstractC34132o.m107874S(enumC16313m0M1460u.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(6 * 4, c2314t), m1463x(toastModal.getStyle(), c28655q, 0), c28655q, 432, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            if ((((double) 1.0f) > 0.0d ? r10 : z4) == 0) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, r10);
            float f16 = f2010a;
            Modifier modifierM3405b2 = AbstractC1102d.m3405b(layoutWeightElement, 0.0f, f16, r10);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f15, C2299e.f9108K), C2299e.f9110M, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3405b2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            String message = toastModal.getMessage();
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(message, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            ?? r16 = c28655q;
            ToastActionButton actionButton = toastModal.getActionButton();
            if (actionButton == null) {
                r16.m87150e0(-129818585);
                r16.m87173q(z4);
                function2 = function1;
                f13 = f16;
                i15 = 32;
            } else {
                r16.m87150e0(-129818584);
                function2 = function1;
                f13 = f16;
                i15 = 32;
                m1452m(new HorizontalAlignElement(m1461v(actionButton.getAlignment())), actionButton, function2, r16, ((i16 << 3) & 896) | (C9598e.f28134d << 3), 0);
                r16.m87173q(z4);
            }
            r16.m87173q(r10);
            if (toastModal.getIncludeDismiss()) {
                r16.m87150e0(926718984);
                ?? r17 = (i16 & 112) == i15 ? r10 : z4;
                Object objM87133R = r16.m87133R();
                if (r17 != 0 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C27314o(function2, 4);
                    r16.m87172p0(objM87133R);
                }
                AbstractC23124k3.m67101e((InterfaceC4339a) objM87133R, AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f13, c2314t), 3, c3), false, null, null, C0551b.f1902a.m1378b(), r16, 1572864, 60);
                ?? r18 = r16;
                r18.m87173q(z4);
                r15 = r18;
            } else {
                r16.m87150e0(927307116);
                r16.m87173q(z4);
                r15 = r16;
            }
            r15.m87173q(r10);
            r14 = r15;
        } else {
            c28655q.m87138X();
            r14 = c28655q;
        }
        C28677v1 c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0566q(toastModal, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m1456q(Function1 function1) {
        function1.invoke(InterfaceC0569t.a.f2023a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m1457r(ToastModal toastModal, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m1455p(toastModal, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m1458s(ToastModal toastModal, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1703124229);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(toastModal) : c28655q.m87157i(toastModal) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 5 * 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f13);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            long j7 = C17919x.f69625b;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC12889b.m36262a0(modifierM3409f, f13, c33252iM105489e, false, C17919x.m51541c(0.6f, j7), C17919x.m51541c(0.6f, j7), 4), c33252iM105489e);
            C17909s c17909s = AbstractC17911t.f69612b;
            Modifier modifierM44456i = AbstractC15751g.m44456i(1, AbstractC1092a.m3357b(modifierM118994r, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4281877583L)), new C17919x(AbstractC17918w0.m51517e(4280626484L))), 0.0f, 0.0f, 14), null, 0.0f, 6), AbstractC15693u.m44155b(c17909s, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(385875967)), new C17919x(AbstractC17918w0.m51515c(16777215))), AbstractC37056f.m118959K(Float.valueOf(0.0f), Float.valueOf(0.65f)), 0, 315.0f, false, 20, null), c33252iM105489e);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44456i);
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
            m1455p(toastModal, function1, c28655q, (i14 & 112) | C9598e.f28134d | (i14 & 14));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0566q(toastModal, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m1459t(ToastModal toastModal, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m1458s(toastModal, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final EnumC16313m0 m1460u(ToastModal toast) {
        AbstractC22676k.m65750j(toast, "toast");
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(toast.getIcon());
        return enumC16313m0M46377b == null ? m1462w(toast.getStyle()) : enumC16313m0M46377b;
    }

    /* JADX INFO: renamed from: v */
    private static final InterfaceC2300f m1461v(ToastActionButtonAlignment toastActionButtonAlignment) {
        int i13 = b.f2021a[toastActionButtonAlignment.ordinal()];
        if (i13 == 1) {
            return C2299e.f9111N;
        }
        if (i13 == 2) {
            return C2299e.f9112O;
        }
        if (i13 == 3 || i13 == 4) {
            return C2299e.f9110M;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: w */
    private static final EnumC16313m0 m1462w(ToastStyleModel toastStyleModel) {
        switch (b.f2022b[toastStyleModel.ordinal()]) {
            case 1:
                return EnumC16313m0.TINY_ATTENTION;
            case 2:
                return EnumC16313m0.TINY_ATTENTION;
            case 3:
                return EnumC16313m0.TINY_CHECKMARK;
            case 4:
                return EnumC16313m0.TINY_INFORMATION;
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: x */
    private static final long m1463x(ToastStyleModel toastStyleModel, Composer composer, int i13) {
        long accentAlert;
        switch (b.f2022b[toastStyleModel.ordinal()]) {
            case 1:
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1842420412);
                accentAlert = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAlert();
                c28655q.m87173q(false);
                break;
            case 2:
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(1842422372);
                accentAlert = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentNegativeTrend();
                c28655q2.m87173q(false);
                break;
            case 3:
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(1842424580);
                accentAlert = C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getAccentPositiveTrend();
                c28655q3.m87173q(false);
                break;
            case 4:
                C28655q c28655q4 = (C28655q) composer;
                c28655q4.m87150e0(1842426681);
                accentAlert = C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getRecovery();
                c28655q4.m87173q(false);
                break;
            case 5:
            case 6:
                C28655q c28655q5 = (C28655q) composer;
                c28655q5.m87150e0(1842429403);
                return AbstractC31061c.m95624D(C38072d.f163053a, c28655q5, C38072d.f163054b, false);
            default:
                throw AbstractC11895b.m32003v(1842418772, (C28655q) composer, false);
        }
        return accentAlert;
    }
}
