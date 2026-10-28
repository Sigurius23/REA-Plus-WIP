package o11;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import l83.C23454a0;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nr0.C27072e;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33210q;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r41.AbstractC30925i;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: o11.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lo11/h;", "Lm91/u;", "b", "c", "a", "Lo11/h$a;", "Lo11/h$b;", "Lo11/h$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC27402h extends InterfaceC25312u {

    /* JADX INFO: renamed from: o11.h$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lo11/h$c;", "Lo11/h;", "Lsz0/q;", "leftStat", "middleStat", "rightStat", "", "useDividers", "<init>", "(Lsz0/q;Lsz0/q;Lsz0/q;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q;", "()Lsz0/q;", "b", "c", "d", "Z", "e", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC27402h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33210q leftStat;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C33210q middleStat;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C33210q rightStat;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean useDividers;

        public c(C33210q leftStat, C33210q c33210q, C33210q c33210q2, boolean z4) {
            AbstractC22676k.m65750j(leftStat, "leftStat");
            this.leftStat = leftStat;
            this.middleStat = c33210q;
            this.rightStat = c33210q2;
            this.useDividers = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C33210q getLeftStat() {
            return this.leftStat;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C33210q getMiddleStat() {
            return this.middleStat;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C33210q getRightStat() {
            return this.rightStat;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getUseDividers() {
            return this.useDividers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.leftStat, cVar.leftStat) && AbstractC22676k.m65745e(this.middleStat, cVar.middleStat) && AbstractC22676k.m65745e(this.rightStat, cVar.rightStat) && this.useDividers == cVar.useDividers;
        }

        public int hashCode() {
            int iHashCode = this.leftStat.hashCode() * 31;
            C33210q c33210q = this.middleStat;
            int iHashCode2 = (iHashCode + (c33210q == null ? 0 : c33210q.hashCode())) * 31;
            C33210q c33210q2 = this.rightStat;
            return Boolean.hashCode(this.useDividers) + ((iHashCode2 + (c33210q2 != null ? c33210q2.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Summary(leftStat=" + this.leftStat + ", middleStat=" + this.middleStat + ", rightStat=" + this.rightStat + ", useDividers=" + this.useDividers + ")";
        }

        public /* synthetic */ c(C33210q c33210q, C33210q c33210q2, C33210q c33210q3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33210q, c33210q2, c33210q3, (i13 & 8) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: o11.h$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0092\u0001\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b.\u00101R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u00107R\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b8\u00107R\u001b\u0010<\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006="}, m65681d2 = {"Lo11/h$b;", "Lo11/h;", "", "Lr41/i;", "sets", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "Lcom/whoop/design/util/TextResource;", "volumeLabelText", "infoText", "", "hideAllBottomControls", "enableDeleteButton", "showAddAndRemoveSetButtons", "enableAddSetButton", "enableRemoveSetButton", "", "onAddSetClickEvent", "onRemoveSetClickEvent", "onDeleteExerciseClickEvent", "<init>", "(Ljava/util/List;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "b", "(Ljava/util/List;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lo11/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "m", "()Ljava/util/List;", "Lcom/whoop/domain/model/UnitSystem;", "getUnitSystem", "()Lcom/whoop/domain/model/UnitSystem;", "c", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "d", "i", "e", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "f", "g", "n", "j", "Ljava/lang/Object;", "()Ljava/lang/Object;", "k", "l", "Ll83/h;", "p", "weightLabelResId", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC27402h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<AbstractC30925i> sets;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UnitSystem unitSystem;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource volumeLabelText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource infoText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean hideAllBottomControls;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean enableDeleteButton;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean showAddAndRemoveSetButtons;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean enableAddSetButton;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean enableRemoveSetButton;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final Object onAddSetClickEvent;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final Object onRemoveSetClickEvent;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final Object onDeleteExerciseClickEvent;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final InterfaceC23462h weightLabelResId;

        /* JADX INFO: renamed from: o11.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f110193a;

            static {
                int[] iArr = new int[UnitSystem.values().length];
                try {
                    iArr[UnitSystem.METRIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UnitSystem.IMPERIAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f110193a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends AbstractC30925i> sets, UnitSystem unitSystem, TextResource volumeLabelText, TextResource textResource, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, Object onAddSetClickEvent, Object obj, Object onDeleteExerciseClickEvent) {
            AbstractC22676k.m65750j(sets, "sets");
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            AbstractC22676k.m65750j(volumeLabelText, "volumeLabelText");
            AbstractC22676k.m65750j(onAddSetClickEvent, "onAddSetClickEvent");
            AbstractC22676k.m65750j(onDeleteExerciseClickEvent, "onDeleteExerciseClickEvent");
            this.sets = sets;
            this.unitSystem = unitSystem;
            this.volumeLabelText = volumeLabelText;
            this.infoText = textResource;
            this.hideAllBottomControls = z4;
            this.enableDeleteButton = z13;
            this.showAddAndRemoveSetButtons = z14;
            this.enableAddSetButton = z15;
            this.enableRemoveSetButton = z16;
            this.onAddSetClickEvent = onAddSetClickEvent;
            this.onRemoveSetClickEvent = obj;
            this.onDeleteExerciseClickEvent = onDeleteExerciseClickEvent;
            this.weightLabelResId = AbstractC30060g.m92088H(new C27072e(this, 6));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ b m82618c(b bVar, List list, UnitSystem unitSystem, TextResource textResource, TextResource textResource2, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, Object obj, Object obj2, Object obj3, int i13, Object obj4) {
            if ((i13 & 1) != 0) {
                list = bVar.sets;
            }
            if ((i13 & 2) != 0) {
                unitSystem = bVar.unitSystem;
            }
            if ((i13 & 4) != 0) {
                textResource = bVar.volumeLabelText;
            }
            if ((i13 & 8) != 0) {
                textResource2 = bVar.infoText;
            }
            if ((i13 & 16) != 0) {
                z4 = bVar.hideAllBottomControls;
            }
            if ((i13 & 32) != 0) {
                z13 = bVar.enableDeleteButton;
            }
            if ((i13 & 64) != 0) {
                z14 = bVar.showAddAndRemoveSetButtons;
            }
            if ((i13 & 128) != 0) {
                z15 = bVar.enableAddSetButton;
            }
            if ((i13 & 256) != 0) {
                z16 = bVar.enableRemoveSetButton;
            }
            if ((i13 & 512) != 0) {
                obj = bVar.onAddSetClickEvent;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                obj2 = bVar.onRemoveSetClickEvent;
            }
            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                obj3 = bVar.onDeleteExerciseClickEvent;
            }
            Object obj5 = obj2;
            Object obj6 = obj3;
            boolean z17 = z16;
            Object obj7 = obj;
            boolean z18 = z14;
            boolean z19 = z15;
            boolean z24 = z4;
            boolean z25 = z13;
            return bVar.m82620b(list, unitSystem, textResource, textResource2, z24, z25, z18, z19, z17, obj7, obj5, obj6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static final int m82619q(b bVar) {
            int i13 = a.f110193a[bVar.unitSystem.ordinal()];
            if (i13 == 1) {
                return AbstractC16277f.f62355n0;
            }
            if (i13 == 2) {
                return AbstractC16277f.f62359o0;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: b */
        public final b m82620b(List<? extends AbstractC30925i> sets, UnitSystem unitSystem, TextResource volumeLabelText, TextResource infoText, boolean hideAllBottomControls, boolean enableDeleteButton, boolean showAddAndRemoveSetButtons, boolean enableAddSetButton, boolean enableRemoveSetButton, Object onAddSetClickEvent, Object onRemoveSetClickEvent, Object onDeleteExerciseClickEvent) {
            AbstractC22676k.m65750j(sets, "sets");
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            AbstractC22676k.m65750j(volumeLabelText, "volumeLabelText");
            AbstractC22676k.m65750j(onAddSetClickEvent, "onAddSetClickEvent");
            AbstractC22676k.m65750j(onDeleteExerciseClickEvent, "onDeleteExerciseClickEvent");
            return new b(sets, unitSystem, volumeLabelText, infoText, hideAllBottomControls, enableDeleteButton, showAddAndRemoveSetButtons, enableAddSetButton, enableRemoveSetButton, onAddSetClickEvent, onRemoveSetClickEvent, onDeleteExerciseClickEvent);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getEnableAddSetButton() {
            return this.enableAddSetButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.sets, bVar.sets) && this.unitSystem == bVar.unitSystem && AbstractC22676k.m65745e(this.volumeLabelText, bVar.volumeLabelText) && AbstractC22676k.m65745e(this.infoText, bVar.infoText) && this.hideAllBottomControls == bVar.hideAllBottomControls && this.enableDeleteButton == bVar.enableDeleteButton && this.showAddAndRemoveSetButtons == bVar.showAddAndRemoveSetButtons && this.enableAddSetButton == bVar.enableAddSetButton && this.enableRemoveSetButton == bVar.enableRemoveSetButton && AbstractC22676k.m65745e(this.onAddSetClickEvent, bVar.onAddSetClickEvent) && AbstractC22676k.m65745e(this.onRemoveSetClickEvent, bVar.onRemoveSetClickEvent) && AbstractC22676k.m65745e(this.onDeleteExerciseClickEvent, bVar.onDeleteExerciseClickEvent);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getEnableDeleteButton() {
            return this.enableDeleteButton;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getEnableRemoveSetButton() {
            return this.enableRemoveSetButton;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getHideAllBottomControls() {
            return this.hideAllBottomControls;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a((this.unitSystem.hashCode() + (this.sets.hashCode() * 31)) * 31, this.volumeLabelText, 31);
            TextResource textResource = this.infoText;
            int iM106644c = AbstractC33745d.m106644c(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.hideAllBottomControls), 31, this.enableDeleteButton), 31, this.showAddAndRemoveSetButtons), 31, this.enableAddSetButton), 31, this.enableRemoveSetButton), 31, this.onAddSetClickEvent);
            Object obj = this.onRemoveSetClickEvent;
            return this.onDeleteExerciseClickEvent.hashCode() + ((iM106644c + (obj != null ? obj.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getInfoText() {
            return this.infoText;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Object getOnAddSetClickEvent() {
            return this.onAddSetClickEvent;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Object getOnDeleteExerciseClickEvent() {
            return this.onDeleteExerciseClickEvent;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Object getOnRemoveSetClickEvent() {
            return this.onRemoveSetClickEvent;
        }

        /* JADX INFO: renamed from: m */
        public final List<AbstractC30925i> m82629m() {
            return this.sets;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getShowAddAndRemoveSetButtons() {
            return this.showAddAndRemoveSetButtons;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final TextResource getVolumeLabelText() {
            return this.volumeLabelText;
        }

        /* JADX INFO: renamed from: p */
        public final int m82632p() {
            return ((Number) this.weightLabelResId.getValue()).intValue();
        }

        public String toString() {
            List<AbstractC30925i> list = this.sets;
            UnitSystem unitSystem = this.unitSystem;
            TextResource textResource = this.volumeLabelText;
            TextResource textResource2 = this.infoText;
            boolean z4 = this.hideAllBottomControls;
            boolean z13 = this.enableDeleteButton;
            boolean z14 = this.showAddAndRemoveSetButtons;
            boolean z15 = this.enableAddSetButton;
            boolean z16 = this.enableRemoveSetButton;
            Object obj = this.onAddSetClickEvent;
            Object obj2 = this.onRemoveSetClickEvent;
            Object obj3 = this.onDeleteExerciseClickEvent;
            StringBuilder sb4 = new StringBuilder("ListOfSets(sets=");
            sb4.append(list);
            sb4.append(", unitSystem=");
            sb4.append(unitSystem);
            sb4.append(", volumeLabelText=");
            AbstractC30007c.m91855y(sb4, textResource, ", infoText=", textResource2, ", hideAllBottomControls=");
            AbstractC38963t7.m124392v(sb4, z4, ", enableDeleteButton=", z13, ", showAddAndRemoveSetButtons=");
            AbstractC38963t7.m124392v(sb4, z14, ", enableAddSetButton=", z15, ", enableRemoveSetButton=");
            sb4.append(z16);
            sb4.append(", onAddSetClickEvent=");
            sb4.append(obj);
            sb4.append(", onRemoveSetClickEvent=");
            sb4.append(obj2);
            sb4.append(", onDeleteExerciseClickEvent=");
            sb4.append(obj3);
            sb4.append(")");
            return sb4.toString();
        }

        public /* synthetic */ b(List list, UnitSystem unitSystem, TextResource textResource, TextResource textResource2, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, Object obj, Object obj2, Object obj3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, unitSystem, (i13 & 4) != 0 ? AbstractC8693b.m21277k(AbstractC16277f.f62347l0) : textResource, (i13 & 8) != 0 ? null : textResource2, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? true : z15, (i13 & 256) != 0 ? false : z16, obj, obj2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C23454a0.f92919a : obj3);
        }
    }

    /* JADX INFO: renamed from: o11.h$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\"\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b&\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b.\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b0\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010#\u001a\u0004\b8\u0010%R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b,\u0010%¨\u00069"}, m65681d2 = {"Lo11/h$a;", "Lo11/h;", "Lcom/whoop/design/util/TextResource;", "volumeTitleDisplay", "weightTitleDisplay", "avgHrTitleDisplay", "tonnageUnitsDisplay", "hrUnitsDisplay", "tonnageDisplay", "repsDisplay", "totalsDisplay", "", "Lo11/q;", "statRows", "", "isOneRepMaxIntensityEnabled", "hasSessionIntensity", "intensityTitleDisplay", "intensityUnitsDisplay", "intensityDisplay", "weightLabelDisplay", "intensityLabelDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "b", "p", "c", "d", "l", "e", "f", "k", "g", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "m", "Ljava/util/List;", "j", "()Ljava/util/List;", "Z", "q", "()Z", "o", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC27402h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource volumeTitleDisplay;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource weightTitleDisplay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource avgHrTitleDisplay;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource tonnageUnitsDisplay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource hrUnitsDisplay;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource tonnageDisplay;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource repsDisplay;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final TextResource totalsDisplay;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final List<C27411q> statRows;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isOneRepMaxIntensityEnabled;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean hasSessionIntensity;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final TextResource intensityTitleDisplay;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextResource intensityUnitsDisplay;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final TextResource intensityDisplay;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final TextResource weightLabelDisplay;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final TextResource intensityLabelDisplay;

        public a(TextResource volumeTitleDisplay, TextResource weightTitleDisplay, TextResource avgHrTitleDisplay, TextResource tonnageUnitsDisplay, TextResource hrUnitsDisplay, TextResource tonnageDisplay, TextResource repsDisplay, TextResource totalsDisplay, List<C27411q> statRows, boolean z4, boolean z13, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5) {
            AbstractC22676k.m65750j(volumeTitleDisplay, "volumeTitleDisplay");
            AbstractC22676k.m65750j(weightTitleDisplay, "weightTitleDisplay");
            AbstractC22676k.m65750j(avgHrTitleDisplay, "avgHrTitleDisplay");
            AbstractC22676k.m65750j(tonnageUnitsDisplay, "tonnageUnitsDisplay");
            AbstractC22676k.m65750j(hrUnitsDisplay, "hrUnitsDisplay");
            AbstractC22676k.m65750j(tonnageDisplay, "tonnageDisplay");
            AbstractC22676k.m65750j(repsDisplay, "repsDisplay");
            AbstractC22676k.m65750j(totalsDisplay, "totalsDisplay");
            AbstractC22676k.m65750j(statRows, "statRows");
            this.volumeTitleDisplay = volumeTitleDisplay;
            this.weightTitleDisplay = weightTitleDisplay;
            this.avgHrTitleDisplay = avgHrTitleDisplay;
            this.tonnageUnitsDisplay = tonnageUnitsDisplay;
            this.hrUnitsDisplay = hrUnitsDisplay;
            this.tonnageDisplay = tonnageDisplay;
            this.repsDisplay = repsDisplay;
            this.totalsDisplay = totalsDisplay;
            this.statRows = statRows;
            this.isOneRepMaxIntensityEnabled = z4;
            this.hasSessionIntensity = z13;
            this.intensityTitleDisplay = textResource;
            this.intensityUnitsDisplay = textResource2;
            this.intensityDisplay = textResource3;
            this.weightLabelDisplay = textResource4;
            this.intensityLabelDisplay = textResource5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getAvgHrTitleDisplay() {
            return this.avgHrTitleDisplay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasSessionIntensity() {
            return this.hasSessionIntensity;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getHrUnitsDisplay() {
            return this.hrUnitsDisplay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getIntensityDisplay() {
            return this.intensityDisplay;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.volumeTitleDisplay, aVar.volumeTitleDisplay) && AbstractC22676k.m65745e(this.weightTitleDisplay, aVar.weightTitleDisplay) && AbstractC22676k.m65745e(this.avgHrTitleDisplay, aVar.avgHrTitleDisplay) && AbstractC22676k.m65745e(this.tonnageUnitsDisplay, aVar.tonnageUnitsDisplay) && AbstractC22676k.m65745e(this.hrUnitsDisplay, aVar.hrUnitsDisplay) && AbstractC22676k.m65745e(this.tonnageDisplay, aVar.tonnageDisplay) && AbstractC22676k.m65745e(this.repsDisplay, aVar.repsDisplay) && AbstractC22676k.m65745e(this.totalsDisplay, aVar.totalsDisplay) && AbstractC22676k.m65745e(this.statRows, aVar.statRows) && this.isOneRepMaxIntensityEnabled == aVar.isOneRepMaxIntensityEnabled && this.hasSessionIntensity == aVar.hasSessionIntensity && AbstractC22676k.m65745e(this.intensityTitleDisplay, aVar.intensityTitleDisplay) && AbstractC22676k.m65745e(this.intensityUnitsDisplay, aVar.intensityUnitsDisplay) && AbstractC22676k.m65745e(this.intensityDisplay, aVar.intensityDisplay) && AbstractC22676k.m65745e(this.weightLabelDisplay, aVar.weightLabelDisplay) && AbstractC22676k.m65745e(this.intensityLabelDisplay, aVar.intensityLabelDisplay);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getIntensityLabelDisplay() {
            return this.intensityLabelDisplay;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getIntensityTitleDisplay() {
            return this.intensityTitleDisplay;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getIntensityUnitsDisplay() {
            return this.intensityUnitsDisplay;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.volumeTitleDisplay.hashCode() * 31, this.weightTitleDisplay, 31), this.avgHrTitleDisplay, 31), this.tonnageUnitsDisplay, 31), this.hrUnitsDisplay, 31), this.tonnageDisplay, 31), this.repsDisplay, 31), this.totalsDisplay, 31), 31, this.statRows), 31, this.isOneRepMaxIntensityEnabled), 31, this.hasSessionIntensity);
            TextResource textResource = this.intensityTitleDisplay;
            int iHashCode = (iM8289b + (textResource == null ? 0 : textResource.hashCode())) * 31;
            TextResource textResource2 = this.intensityUnitsDisplay;
            int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
            TextResource textResource3 = this.intensityDisplay;
            int iHashCode3 = (iHashCode2 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
            TextResource textResource4 = this.weightLabelDisplay;
            int iHashCode4 = (iHashCode3 + (textResource4 == null ? 0 : textResource4.hashCode())) * 31;
            TextResource textResource5 = this.intensityLabelDisplay;
            return iHashCode4 + (textResource5 != null ? textResource5.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getRepsDisplay() {
            return this.repsDisplay;
        }

        /* JADX INFO: renamed from: j */
        public final List<C27411q> m82609j() {
            return this.statRows;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getTonnageDisplay() {
            return this.tonnageDisplay;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getTonnageUnitsDisplay() {
            return this.tonnageUnitsDisplay;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextResource getTotalsDisplay() {
            return this.totalsDisplay;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextResource getVolumeTitleDisplay() {
            return this.volumeTitleDisplay;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final TextResource getWeightLabelDisplay() {
            return this.weightLabelDisplay;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final TextResource getWeightTitleDisplay() {
            return this.weightTitleDisplay;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getIsOneRepMaxIntensityEnabled() {
            return this.isOneRepMaxIntensityEnabled;
        }

        public String toString() {
            TextResource textResource = this.volumeTitleDisplay;
            TextResource textResource2 = this.weightTitleDisplay;
            TextResource textResource3 = this.avgHrTitleDisplay;
            TextResource textResource4 = this.tonnageUnitsDisplay;
            TextResource textResource5 = this.hrUnitsDisplay;
            TextResource textResource6 = this.tonnageDisplay;
            TextResource textResource7 = this.repsDisplay;
            TextResource textResource8 = this.totalsDisplay;
            List<C27411q> list = this.statRows;
            boolean z4 = this.isOneRepMaxIntensityEnabled;
            boolean z13 = this.hasSessionIntensity;
            TextResource textResource9 = this.intensityTitleDisplay;
            TextResource textResource10 = this.intensityUnitsDisplay;
            TextResource textResource11 = this.intensityDisplay;
            TextResource textResource12 = this.weightLabelDisplay;
            TextResource textResource13 = this.intensityLabelDisplay;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("DetailsSummary(volumeTitleDisplay=", textResource, ", weightTitleDisplay=", textResource2, ", avgHrTitleDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", tonnageUnitsDisplay=", textResource4, ", hrUnitsDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource5, ", tonnageDisplay=", textResource6, ", repsDisplay=");
            AbstractC30007c.m91855y(sbM106658q, textResource7, ", totalsDisplay=", textResource8, ", statRows=");
            AbstractC26725a.m79512p(", isOneRepMaxIntensityEnabled=", ", hasSessionIntensity=", sbM106658q, list, z4);
            AbstractC21702c.m61144o(textResource9, ", intensityTitleDisplay=", ", intensityUnitsDisplay=", sbM106658q, z13);
            AbstractC30007c.m91855y(sbM106658q, textResource10, ", intensityDisplay=", textResource11, ", weightLabelDisplay=");
            return AbstractC33745d.m106655n(sbM106658q, textResource12, ", intensityLabelDisplay=", textResource13, ")");
        }

        public /* synthetic */ a(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, TextResource textResource6, TextResource textResource7, TextResource textResource8, List list, boolean z4, boolean z13, TextResource textResource9, TextResource textResource10, TextResource textResource11, TextResource textResource12, TextResource textResource13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, textResource2, textResource3, textResource4, textResource5, textResource6, textResource7, textResource8, list, (i13 & 512) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : textResource9, (i13 & 4096) != 0 ? null : textResource10, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : textResource11, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : textResource12, (i13 & 32768) != 0 ? null : textResource13);
        }
    }
}
