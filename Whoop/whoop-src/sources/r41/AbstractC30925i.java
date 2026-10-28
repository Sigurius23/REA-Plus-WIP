package r41;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.UUID;
import jh3.AbstractC21702c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27274q;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p412q3.C29877k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: r41.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0015\u0011\u0006\f\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0006\u0010\u0018R\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u001a\u0010*\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b\f\u0010)R\u001a\u0010,\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b+\u0010\u000fR\u001a\u0010.\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b-\u0010\u000fR\u001a\u00100\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010<\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u00107R\u0014\u0010>\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u00107R\u0014\u0010A\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u00103R\u0014\u0010C\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0014\u0010D\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u00103R\u0014\u0010E\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u00103\u0082\u0001\u0005FGHIJ¨\u0006K"}, m65681d2 = {"Lr41/i;", "Lm91/n;", "Ljava/util/UUID;", "<init>", "()V", "Lny0/q;", "a", "Lny0/q;", "e", "()Lny0/q;", "iconButtonType", "Ly81/f;", "b", "Ly81/f;", "g", "()Ly81/f;", "iconColor", "c", "f", "iconCircleColor", "", "d", "Z", "i", "()Z", "iconEnabled", "k", "iconNonFunctional", "j", "iconFill", "animateIconOnChange", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "onIconClickEvent", "s", "showProgressIndicatorInsteadOfIcon", "Ly81/e;", "Ly81/e;", "()Ly81/e;", "backgroundColor", "p", "setNumberColor", "m", "repsAndWeightTextColor", "r", "showCurrentSetIndicator", "", "o", "()I", "setIndex", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "setNumberText", "n", "repsText", "t", "timeText", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "weightText", "Lq3/k;", "v", "weightFieldImeAction", "u", "useTimeEntry", "icon", "iconContentDescriptionResId", "Lr41/i$a;", "Lr41/i$b;", "Lr41/i$c;", "Lr41/i$d;", "Lr41/i$e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30925i implements InterfaceC25305n<UUID> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC27274q iconButtonType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f iconColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f iconCircleColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean iconEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean iconNonFunctional;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean iconFill;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean animateIconOnChange;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Object onIconClickEvent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean showProgressIndicatorInsteadOfIcon;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC39332e backgroundColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC39333f setNumberColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC39333f repsAndWeightTextColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean showCurrentSetIndicator;

    /* JADX INFO: renamed from: r41.i$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J`\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\u001c\u0010%R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b,\u0010%R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b-\u0010\u0017R\u001a\u0010/\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u0017R\u001a\u00101\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b0\u0010\u0017R\u001a\u00106\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u001a\u0010<\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b=\u0010;R\u001a\u0010@\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b?\u0010+¨\u0006A"}, m65681d2 = {"Lr41/i$a;", "Lr41/i;", "Ljava/util/UUID;", "id", "", "setIndex", "Lcom/whoop/design/util/TextResource;", "setNumberText", "repsText", "timeText", "", "useTimeEntry", "weightText", "Lq3/k;", "weightFieldImeAction", "<init>", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "x", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;I)Lr41/i$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "n", "Ljava/util/UUID;", "A", "()Ljava/util/UUID;", "o", "I", "p", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "r", "t", "s", "Z", "u", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "c", "icon", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "iconContentDescriptionResId", "Lny0/q$g;", "Lny0/q$g;", "z", "()Lny0/q$g;", "iconButtonType", "Ly81/f;", "y", "Ly81/f;", "g", "()Ly81/f;", "iconColor", "f", "iconCircleColor", "k", "iconNonFunctional", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC30925i {

        /* JADX INFO: renamed from: B */
        public static final int f127538B = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final boolean iconNonFunctional;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final UUID id;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final int setIndex;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final TextResource setNumberText;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final TextResource repsText;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final TextResource timeText;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final boolean useTimeEntry;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final TextResource weightText;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final int weightFieldImeAction;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final int iconContentDescriptionResId;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final AbstractC27274q.g iconButtonType;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final EnumC39333f iconColor;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final EnumC39333f iconCircleColor;

        public /* synthetic */ a(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, textResource3, z4, textResource4, i14);
        }

        /* JADX INFO: renamed from: y */
        public static /* synthetic */ a m95123y(a aVar, UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                uuid = aVar.id;
            }
            if ((i15 & 2) != 0) {
                i13 = aVar.setIndex;
            }
            if ((i15 & 4) != 0) {
                textResource = aVar.setNumberText;
            }
            if ((i15 & 8) != 0) {
                textResource2 = aVar.repsText;
            }
            if ((i15 & 16) != 0) {
                textResource3 = aVar.timeText;
            }
            if ((i15 & 32) != 0) {
                z4 = aVar.useTimeEntry;
            }
            if ((i15 & 64) != 0) {
                textResource4 = aVar.weightText;
            }
            if ((i15 & 128) != 0) {
                i14 = aVar.weightFieldImeAction;
            }
            TextResource textResource5 = textResource4;
            int i16 = i14;
            TextResource textResource6 = textResource3;
            boolean z13 = z4;
            return aVar.m95125x(uuid, i13, textResource, textResource2, textResource6, z13, textResource5, i16);
        }

        @Override // p720m91.InterfaceC25305n
        /* JADX INFO: renamed from: A, reason: from getter */
        public UUID getId() {
            return this.id;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getIcon() {
            return this.icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.id, aVar.id) && this.setIndex == aVar.setIndex && AbstractC22676k.m65745e(this.setNumberText, aVar.setNumberText) && AbstractC22676k.m65745e(this.repsText, aVar.repsText) && AbstractC22676k.m65745e(this.timeText, aVar.timeText) && this.useTimeEntry == aVar.useTimeEntry && AbstractC22676k.m65745e(this.weightText, aVar.weightText) && this.weightFieldImeAction == aVar.weightFieldImeAction;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: f, reason: from getter */
        public EnumC39333f getIconCircleColor() {
            return this.iconCircleColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: g, reason: from getter */
        public EnumC39333f getIconColor() {
            return this.iconColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: h, reason: from getter */
        public int getIconContentDescriptionResId() {
            return this.iconContentDescriptionResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.weightFieldImeAction) + AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.setIndex, this.id.hashCode() * 31, 31), this.setNumberText, 31), this.repsText, 31), this.timeText, 31), 31, this.useTimeEntry), this.weightText, 31);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: k, reason: from getter */
        public boolean getIconNonFunctional() {
            return this.iconNonFunctional;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: n, reason: from getter */
        public TextResource getRepsText() {
            return this.repsText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: o, reason: from getter */
        public int getSetIndex() {
            return this.setIndex;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: q, reason: from getter */
        public TextResource getSetNumberText() {
            return this.setNumberText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: t, reason: from getter */
        public TextResource getTimeText() {
            return this.timeText;
        }

        public String toString() {
            UUID uuid = this.id;
            int i13 = this.setIndex;
            TextResource textResource = this.setNumberText;
            TextResource textResource2 = this.repsText;
            TextResource textResource3 = this.timeText;
            boolean z4 = this.useTimeEntry;
            TextResource textResource4 = this.weightText;
            String strM91501a = C29877k.m91501a(this.weightFieldImeAction);
            StringBuilder sb4 = new StringBuilder("Completed(id=");
            sb4.append(uuid);
            sb4.append(", setIndex=");
            sb4.append(i13);
            sb4.append(", setNumberText=");
            AbstractC30007c.m91855y(sb4, textResource, ", repsText=", textResource2, ", timeText=");
            AbstractC33745d.m106664w(textResource3, ", useTimeEntry=", ", weightText=", sb4, z4);
            sb4.append(textResource4);
            sb4.append(", weightFieldImeAction=");
            sb4.append(strM91501a);
            sb4.append(")");
            return sb4.toString();
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: u, reason: from getter */
        public boolean getUseTimeEntry() {
            return this.useTimeEntry;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: v, reason: from getter */
        public int getWeightFieldImeAction() {
            return this.weightFieldImeAction;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: w, reason: from getter */
        public TextResource getWeightText() {
            return this.weightText;
        }

        /* JADX INFO: renamed from: x */
        public final a m95125x(UUID id4, int setIndex, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean useTimeEntry, TextResource weightText, int weightFieldImeAction) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            return new a(id4, setIndex, setNumberText, repsText, timeText, useTimeEntry, weightText, weightFieldImeAction, null);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: z, reason: from getter */
        public AbstractC27274q.g getIconButtonType() {
            return this.iconButtonType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private a(UUID id4, int i13, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean z4, TextResource weightText, int i14) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            this.id = id4;
            this.setIndex = i13;
            this.setNumberText = setNumberText;
            this.repsText = repsText;
            this.timeText = timeText;
            this.useTimeEntry = z4;
            this.weightText = weightText;
            this.weightFieldImeAction = i14;
            this.icon = AbstractC2875y.m8290c(C38072d.f163053a);
            this.iconContentDescriptionResId = AbstractC16277f.f62287V;
            this.iconButtonType = AbstractC27274q.g.f109144f;
            this.iconColor = EnumC39333f.BRAND_BLACK;
            this.iconCircleColor = EnumC39333f.ACCENT_ACTION;
            this.iconNonFunctional = true;
        }

        public /* synthetic */ a(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, (i15 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i15 & 32) != 0 ? false : z4, textResource4, (i15 & 128) != 0 ? 7 : i14, null);
        }
    }

    /* JADX INFO: renamed from: r41.i$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b%\u0010.R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b5\u0010.R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b6\u0010!R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b;\u0010!R\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010!R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u001a\u0010\u0019\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bI\u00104R\u001a\u0010\u001a\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u00102\u001a\u0004\bK\u00104¨\u0006L"}, m65681d2 = {"Lr41/i$b;", "Lr41/i;", "Ljava/util/UUID;", "id", "", "setIndex", "Lcom/whoop/design/util/TextResource;", "setNumberText", "repsText", "timeText", "", "useTimeEntry", "weightText", "Lq3/k;", "weightFieldImeAction", "iconEnabled", "", "onIconClickEvent", "icon", "iconContentDescriptionResId", "Lny0/q;", "iconButtonType", "Ly81/f;", "iconColor", "iconCircleColor", "iconFill", "animateIconOnChange", "<init>", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;IZLjava/lang/Object;IILny0/q;Ly81/f;Ly81/f;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "n", "Ljava/util/UUID;", "x", "()Ljava/util/UUID;", "o", "I", "p", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "r", "t", "s", "Z", "u", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "i", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "c", "y", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "z", "Lny0/q;", "e", "()Lny0/q;", "A", "Ly81/f;", "g", "()Ly81/f;", "B", "f", "C", "j", "D", "a", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC30925i {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final EnumC39333f iconColor;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private final EnumC39333f iconCircleColor;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private final boolean iconFill;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private final boolean animateIconOnChange;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final UUID id;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final int setIndex;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final TextResource setNumberText;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final TextResource repsText;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final TextResource timeText;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final boolean useTimeEntry;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final TextResource weightText;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final int weightFieldImeAction;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final boolean iconEnabled;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Object onIconClickEvent;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final int iconContentDescriptionResId;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final AbstractC27274q iconButtonType;

        public /* synthetic */ b(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, boolean z13, Object obj, int i15, int i16, AbstractC27274q abstractC27274q, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z14, boolean z15, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, textResource3, z4, textResource4, i14, z13, obj, i15, i16, abstractC27274q, enumC39333f, enumC39333f2, z14, z15);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAnimateIconOnChange() {
            return this.animateIconOnChange;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getIcon() {
            return this.icon;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: e, reason: from getter */
        public AbstractC27274q getIconButtonType() {
            return this.iconButtonType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.id, bVar.id) && this.setIndex == bVar.setIndex && AbstractC22676k.m65745e(this.setNumberText, bVar.setNumberText) && AbstractC22676k.m65745e(this.repsText, bVar.repsText) && AbstractC22676k.m65745e(this.timeText, bVar.timeText) && this.useTimeEntry == bVar.useTimeEntry && AbstractC22676k.m65745e(this.weightText, bVar.weightText) && this.weightFieldImeAction == bVar.weightFieldImeAction && this.iconEnabled == bVar.iconEnabled && AbstractC22676k.m65745e(this.onIconClickEvent, bVar.onIconClickEvent) && this.icon == bVar.icon && this.iconContentDescriptionResId == bVar.iconContentDescriptionResId && AbstractC22676k.m65745e(this.iconButtonType, bVar.iconButtonType) && this.iconColor == bVar.iconColor && this.iconCircleColor == bVar.iconCircleColor && this.iconFill == bVar.iconFill && this.animateIconOnChange == bVar.animateIconOnChange;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: f, reason: from getter */
        public EnumC39333f getIconCircleColor() {
            return this.iconCircleColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: g, reason: from getter */
        public EnumC39333f getIconColor() {
            return this.iconColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: h, reason: from getter */
        public int getIconContentDescriptionResId() {
            return this.iconContentDescriptionResId;
        }

        public int hashCode() {
            int iM61132c = AbstractC21702c.m61132c(this.iconColor, (this.iconButtonType.hashCode() + AbstractC11266d.m30448b(this.iconContentDescriptionResId, AbstractC11266d.m30448b(this.icon, AbstractC33745d.m106644c(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.weightFieldImeAction, AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.setIndex, this.id.hashCode() * 31, 31), this.setNumberText, 31), this.repsText, 31), this.timeText, 31), 31, this.useTimeEntry), this.weightText, 31), 31), 31, this.iconEnabled), 31, this.onIconClickEvent), 31), 31)) * 31, 31);
            EnumC39333f enumC39333f = this.iconCircleColor;
            return Boolean.hashCode(this.animateIconOnChange) + AbstractC2875y.m8289b((iM61132c + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31, 31, this.iconFill);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: i, reason: from getter */
        public boolean getIconEnabled() {
            return this.iconEnabled;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: j, reason: from getter */
        public boolean getIconFill() {
            return this.iconFill;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: l, reason: from getter */
        public Object getOnIconClickEvent() {
            return this.onIconClickEvent;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: n, reason: from getter */
        public TextResource getRepsText() {
            return this.repsText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: o, reason: from getter */
        public int getSetIndex() {
            return this.setIndex;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: q, reason: from getter */
        public TextResource getSetNumberText() {
            return this.setNumberText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: t, reason: from getter */
        public TextResource getTimeText() {
            return this.timeText;
        }

        public String toString() {
            UUID uuid = this.id;
            int i13 = this.setIndex;
            TextResource textResource = this.setNumberText;
            TextResource textResource2 = this.repsText;
            TextResource textResource3 = this.timeText;
            boolean z4 = this.useTimeEntry;
            TextResource textResource4 = this.weightText;
            String strM91501a = C29877k.m91501a(this.weightFieldImeAction);
            boolean z13 = this.iconEnabled;
            Object obj = this.onIconClickEvent;
            int i14 = this.icon;
            int i15 = this.iconContentDescriptionResId;
            AbstractC27274q abstractC27274q = this.iconButtonType;
            EnumC39333f enumC39333f = this.iconColor;
            EnumC39333f enumC39333f2 = this.iconCircleColor;
            boolean z14 = this.iconFill;
            boolean z15 = this.animateIconOnChange;
            StringBuilder sb4 = new StringBuilder("CompletedUndoable(id=");
            sb4.append(uuid);
            sb4.append(", setIndex=");
            sb4.append(i13);
            sb4.append(", setNumberText=");
            AbstractC30007c.m91855y(sb4, textResource, ", repsText=", textResource2, ", timeText=");
            AbstractC33745d.m106664w(textResource3, ", useTimeEntry=", ", weightText=", sb4, z4);
            AbstractC30007c.m91856z(sb4, textResource4, ", weightFieldImeAction=", strM91501a, ", iconEnabled=");
            sb4.append(z13);
            sb4.append(", onIconClickEvent=");
            sb4.append(obj);
            sb4.append(", icon=");
            AbstractC30802r.m94773v(sb4, i14, ", iconContentDescriptionResId=", i15, ", iconButtonType=");
            sb4.append(abstractC27274q);
            sb4.append(", iconColor=");
            sb4.append(enumC39333f);
            sb4.append(", iconCircleColor=");
            sb4.append(enumC39333f2);
            sb4.append(", iconFill=");
            sb4.append(z14);
            sb4.append(", animateIconOnChange=");
            return AbstractC18489d0.m53372m(sb4, z15, ")");
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: u, reason: from getter */
        public boolean getUseTimeEntry() {
            return this.useTimeEntry;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: v, reason: from getter */
        public int getWeightFieldImeAction() {
            return this.weightFieldImeAction;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: w, reason: from getter */
        public TextResource getWeightText() {
            return this.weightText;
        }

        @Override // p720m91.InterfaceC25305n
        /* JADX INFO: renamed from: x, reason: from getter */
        public UUID getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private b(UUID id4, int i13, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean z4, TextResource weightText, int i14, boolean z13, Object onIconClickEvent, int i15, int i16, AbstractC27274q iconButtonType, EnumC39333f iconColor, EnumC39333f enumC39333f, boolean z14, boolean z15) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            AbstractC22676k.m65750j(onIconClickEvent, "onIconClickEvent");
            AbstractC22676k.m65750j(iconButtonType, "iconButtonType");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            this.id = id4;
            this.setIndex = i13;
            this.setNumberText = setNumberText;
            this.repsText = repsText;
            this.timeText = timeText;
            this.useTimeEntry = z4;
            this.weightText = weightText;
            this.weightFieldImeAction = i14;
            this.iconEnabled = z13;
            this.onIconClickEvent = onIconClickEvent;
            this.icon = i15;
            this.iconContentDescriptionResId = i16;
            this.iconButtonType = iconButtonType;
            this.iconColor = iconColor;
            this.iconCircleColor = enumC39333f;
            this.iconFill = z14;
            this.animateIconOnChange = z15;
        }

        public /* synthetic */ b(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, boolean z13, Object obj, int i15, int i16, AbstractC27274q abstractC27274q, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z14, boolean z15, int i17, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, (i17 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i17 & 32) != 0 ? false : z4, textResource4, (i17 & 128) != 0 ? 7 : i14, (i17 & 256) != 0 ? true : z13, (i17 & 512) != 0 ? C23454a0.f92919a : obj, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C38072d.f163053a.m121951d().getAction().getUndo() : i15, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC16277f.f62240G2 : i16, (i17 & 4096) != 0 ? AbstractC27274q.c.f109140f : abstractC27274q, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : enumC39333f2, (32768 & i17) != 0 ? false : z14, (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? false : z15, null);
        }
    }

    /* JADX INFO: renamed from: r41.i$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ¨\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b%\u0010.R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b5\u0010.R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b6\u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b1\u00104R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b:\u0010!R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0017\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001a\u0010\u0018\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u00104R\u001a\u0010H\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010*\u001a\u0004\bG\u0010!R\u001a\u0010N\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010P\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\b+\u0010AR\u001a\u0010S\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010AR\u001a\u0010U\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\b/\u00104¨\u0006V"}, m65681d2 = {"Lr41/i$c;", "Lr41/i;", "Ljava/util/UUID;", "id", "", "setIndex", "Lcom/whoop/design/util/TextResource;", "setNumberText", "repsText", "timeText", "", "useTimeEntry", "weightText", "Lq3/k;", "weightFieldImeAction", "", "onIconClickEvent", "showProgressIndicatorInsteadOfIcon", "icon", "Lny0/q;", "iconButtonType", "Ly81/f;", "iconCircleColor", "iconColor", "animateIconOnChange", "<init>", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILny0/q;Ly81/f;Ly81/f;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "x", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILny0/q;Ly81/f;Ly81/f;Z)Lr41/i$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "n", "Ljava/util/UUID;", "z", "()Ljava/util/UUID;", "o", "I", "p", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "r", "t", "s", "Z", "u", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "c", "y", "Lny0/q;", "e", "()Lny0/q;", "Ly81/f;", "f", "()Ly81/f;", "A", "g", "B", "a", "C", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "iconContentDescriptionResId", "Ly81/e;", "D", "Ly81/e;", "b", "()Ly81/e;", "backgroundColor", "E", "setNumberColor", "F", "m", "repsAndWeightTextColor", "G", "showCurrentSetIndicator", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC30925i {

        /* JADX INFO: renamed from: H */
        public static final int f127570H = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final EnumC39333f iconColor;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private final boolean animateIconOnChange;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private final int iconContentDescriptionResId;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private final InterfaceC39332e backgroundColor;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private final EnumC39333f setNumberColor;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final EnumC39333f repsAndWeightTextColor;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final boolean showCurrentSetIndicator;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final UUID id;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final int setIndex;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final TextResource setNumberText;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final TextResource repsText;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final TextResource timeText;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final boolean useTimeEntry;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final TextResource weightText;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final int weightFieldImeAction;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final Object onIconClickEvent;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final boolean showProgressIndicatorInsteadOfIcon;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final AbstractC27274q iconButtonType;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final EnumC39333f iconCircleColor;

        /* JADX INFO: renamed from: r41.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final a f127591w = new a();

            /* JADX INFO: renamed from: a */
            public final long m95131a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return C17919x.m51541c(0.05f, whoopColor.getAccentAction());
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m95131a((C39336i) obj));
            }
        }

        public /* synthetic */ c(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, Object obj, boolean z13, int i15, AbstractC27274q abstractC27274q, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z14, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, textResource3, z4, textResource4, i14, obj, z13, i15, abstractC27274q, enumC39333f, enumC39333f2, z14);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAnimateIconOnChange() {
            return this.animateIconOnChange;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: b, reason: from getter */
        public InterfaceC39332e getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getIcon() {
            return this.icon;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: e, reason: from getter */
        public AbstractC27274q getIconButtonType() {
            return this.iconButtonType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.id, cVar.id) && this.setIndex == cVar.setIndex && AbstractC22676k.m65745e(this.setNumberText, cVar.setNumberText) && AbstractC22676k.m65745e(this.repsText, cVar.repsText) && AbstractC22676k.m65745e(this.timeText, cVar.timeText) && this.useTimeEntry == cVar.useTimeEntry && AbstractC22676k.m65745e(this.weightText, cVar.weightText) && this.weightFieldImeAction == cVar.weightFieldImeAction && AbstractC22676k.m65745e(this.onIconClickEvent, cVar.onIconClickEvent) && this.showProgressIndicatorInsteadOfIcon == cVar.showProgressIndicatorInsteadOfIcon && this.icon == cVar.icon && AbstractC22676k.m65745e(this.iconButtonType, cVar.iconButtonType) && this.iconCircleColor == cVar.iconCircleColor && this.iconColor == cVar.iconColor && this.animateIconOnChange == cVar.animateIconOnChange;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: f, reason: from getter */
        public EnumC39333f getIconCircleColor() {
            return this.iconCircleColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: g, reason: from getter */
        public EnumC39333f getIconColor() {
            return this.iconColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: h, reason: from getter */
        public int getIconContentDescriptionResId() {
            return this.iconContentDescriptionResId;
        }

        public int hashCode() {
            int iHashCode = (this.iconButtonType.hashCode() + AbstractC11266d.m30448b(this.icon, AbstractC2875y.m8289b(AbstractC33745d.m106644c(AbstractC11266d.m30448b(this.weightFieldImeAction, AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.setIndex, this.id.hashCode() * 31, 31), this.setNumberText, 31), this.repsText, 31), this.timeText, 31), 31, this.useTimeEntry), this.weightText, 31), 31), 31, this.onIconClickEvent), 31, this.showProgressIndicatorInsteadOfIcon), 31)) * 31;
            EnumC39333f enumC39333f = this.iconCircleColor;
            return Boolean.hashCode(this.animateIconOnChange) + AbstractC21702c.m61132c(this.iconColor, (iHashCode + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31, 31);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: l, reason: from getter */
        public Object getOnIconClickEvent() {
            return this.onIconClickEvent;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: m, reason: from getter */
        public EnumC39333f getRepsAndWeightTextColor() {
            return this.repsAndWeightTextColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: n, reason: from getter */
        public TextResource getRepsText() {
            return this.repsText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: o, reason: from getter */
        public int getSetIndex() {
            return this.setIndex;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: p, reason: from getter */
        public EnumC39333f getSetNumberColor() {
            return this.setNumberColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: q, reason: from getter */
        public TextResource getSetNumberText() {
            return this.setNumberText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: r, reason: from getter */
        public boolean getShowCurrentSetIndicator() {
            return this.showCurrentSetIndicator;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: s, reason: from getter */
        public boolean getShowProgressIndicatorInsteadOfIcon() {
            return this.showProgressIndicatorInsteadOfIcon;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: t, reason: from getter */
        public TextResource getTimeText() {
            return this.timeText;
        }

        public String toString() {
            UUID uuid = this.id;
            int i13 = this.setIndex;
            TextResource textResource = this.setNumberText;
            TextResource textResource2 = this.repsText;
            TextResource textResource3 = this.timeText;
            boolean z4 = this.useTimeEntry;
            TextResource textResource4 = this.weightText;
            String strM91501a = C29877k.m91501a(this.weightFieldImeAction);
            Object obj = this.onIconClickEvent;
            boolean z13 = this.showProgressIndicatorInsteadOfIcon;
            int i14 = this.icon;
            AbstractC27274q abstractC27274q = this.iconButtonType;
            EnumC39333f enumC39333f = this.iconCircleColor;
            EnumC39333f enumC39333f2 = this.iconColor;
            boolean z14 = this.animateIconOnChange;
            StringBuilder sb4 = new StringBuilder("Current(id=");
            sb4.append(uuid);
            sb4.append(", setIndex=");
            sb4.append(i13);
            sb4.append(", setNumberText=");
            AbstractC30007c.m91855y(sb4, textResource, ", repsText=", textResource2, ", timeText=");
            AbstractC33745d.m106664w(textResource3, ", useTimeEntry=", ", weightText=", sb4, z4);
            AbstractC30007c.m91856z(sb4, textResource4, ", weightFieldImeAction=", strM91501a, ", onIconClickEvent=");
            sb4.append(obj);
            sb4.append(", showProgressIndicatorInsteadOfIcon=");
            sb4.append(z13);
            sb4.append(", icon=");
            sb4.append(i14);
            sb4.append(", iconButtonType=");
            sb4.append(abstractC27274q);
            sb4.append(", iconCircleColor=");
            sb4.append(enumC39333f);
            sb4.append(", iconColor=");
            sb4.append(enumC39333f2);
            sb4.append(", animateIconOnChange=");
            return AbstractC18489d0.m53372m(sb4, z14, ")");
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: u, reason: from getter */
        public boolean getUseTimeEntry() {
            return this.useTimeEntry;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: v, reason: from getter */
        public int getWeightFieldImeAction() {
            return this.weightFieldImeAction;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: w, reason: from getter */
        public TextResource getWeightText() {
            return this.weightText;
        }

        /* JADX INFO: renamed from: x */
        public final c m95129x(UUID id4, int setIndex, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean useTimeEntry, TextResource weightText, int weightFieldImeAction, Object onIconClickEvent, boolean showProgressIndicatorInsteadOfIcon, int icon, AbstractC27274q iconButtonType, EnumC39333f iconCircleColor, EnumC39333f iconColor, boolean animateIconOnChange) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            AbstractC22676k.m65750j(onIconClickEvent, "onIconClickEvent");
            AbstractC22676k.m65750j(iconButtonType, "iconButtonType");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            return new c(id4, setIndex, setNumberText, repsText, timeText, useTimeEntry, weightText, weightFieldImeAction, onIconClickEvent, showProgressIndicatorInsteadOfIcon, icon, iconButtonType, iconCircleColor, iconColor, animateIconOnChange, null);
        }

        @Override // p720m91.InterfaceC25305n
        /* JADX INFO: renamed from: z, reason: from getter */
        public UUID getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private c(UUID id4, int i13, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean z4, TextResource weightText, int i14, Object onIconClickEvent, boolean z13, int i15, AbstractC27274q iconButtonType, EnumC39333f enumC39333f, EnumC39333f iconColor, boolean z14) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            AbstractC22676k.m65750j(onIconClickEvent, "onIconClickEvent");
            AbstractC22676k.m65750j(iconButtonType, "iconButtonType");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            this.id = id4;
            this.setIndex = i13;
            this.setNumberText = setNumberText;
            this.repsText = repsText;
            this.timeText = timeText;
            this.useTimeEntry = z4;
            this.weightText = weightText;
            this.weightFieldImeAction = i14;
            this.onIconClickEvent = onIconClickEvent;
            this.showProgressIndicatorInsteadOfIcon = z13;
            this.icon = i15;
            this.iconButtonType = iconButtonType;
            this.iconCircleColor = enumC39333f;
            this.iconColor = iconColor;
            this.animateIconOnChange = z14;
            this.iconContentDescriptionResId = AbstractC16277f.f62296Y;
            this.backgroundColor = p745y81.Function1.m125323a(a.f127591w);
            EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_ACTION;
            this.setNumberColor = enumC39333f2;
            this.repsAndWeightTextColor = enumC39333f2;
            this.showCurrentSetIndicator = true;
        }

        public /* synthetic */ c(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, Object obj, boolean z13, int i15, AbstractC27274q abstractC27274q, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z14, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, (i16 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i16 & 32) != 0 ? false : z4, textResource4, (i16 & 128) != 0 ? 7 : i14, (i16 & 256) != 0 ? C23454a0.f92919a : obj, z13, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C38072d.f163053a.m121951d().getTinyIcons().getPlay() : i15, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC27274q.c.f109140f : abstractC27274q, (i16 & 4096) != 0 ? null : enumC39333f, (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC39333f.ACCENT_ACTION : enumC39333f2, (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z14, null);
        }
    }

    /* JADX INFO: renamed from: r41.i$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jj\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001d\u0010&R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b-\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b.\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b2\u0010\u0019R\u001a\u00105\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b4\u0010\u0019¨\u00066"}, m65681d2 = {"Lr41/i$d;", "Lr41/i;", "Ljava/util/UUID;", "id", "", "setIndex", "Lcom/whoop/design/util/TextResource;", "setNumberText", "repsText", "timeText", "", "useTimeEntry", "weightText", "Lq3/k;", "weightFieldImeAction", "", "onIconClickEvent", "<init>", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "x", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lr41/i$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "n", "Ljava/util/UUID;", "z", "()Ljava/util/UUID;", "o", "I", "p", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "r", "t", "s", "Z", "u", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "c", "icon", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "iconContentDescriptionResId", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC30925i {

        /* JADX INFO: renamed from: y */
        public static final int f127592y = 8;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final UUID id;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final int setIndex;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final TextResource setNumberText;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final TextResource repsText;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final TextResource timeText;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final boolean useTimeEntry;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final TextResource weightText;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final int weightFieldImeAction;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final Object onIconClickEvent;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final int iconContentDescriptionResId;

        public /* synthetic */ d(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, textResource3, z4, textResource4, i14, obj);
        }

        /* JADX INFO: renamed from: y */
        public static /* synthetic */ d m95132y(d dVar, UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, Object obj, int i15, Object obj2) {
            if ((i15 & 1) != 0) {
                uuid = dVar.id;
            }
            if ((i15 & 2) != 0) {
                i13 = dVar.setIndex;
            }
            if ((i15 & 4) != 0) {
                textResource = dVar.setNumberText;
            }
            if ((i15 & 8) != 0) {
                textResource2 = dVar.repsText;
            }
            if ((i15 & 16) != 0) {
                textResource3 = dVar.timeText;
            }
            if ((i15 & 32) != 0) {
                z4 = dVar.useTimeEntry;
            }
            if ((i15 & 64) != 0) {
                textResource4 = dVar.weightText;
            }
            if ((i15 & 128) != 0) {
                i14 = dVar.weightFieldImeAction;
            }
            if ((i15 & 256) != 0) {
                obj = dVar.onIconClickEvent;
            }
            int i16 = i14;
            Object obj3 = obj;
            boolean z13 = z4;
            TextResource textResource5 = textResource4;
            TextResource textResource6 = textResource3;
            TextResource textResource7 = textResource;
            return dVar.m95133x(uuid, i13, textResource7, textResource2, textResource6, z13, textResource5, i16, obj3);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getIcon() {
            return this.icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.id, dVar.id) && this.setIndex == dVar.setIndex && AbstractC22676k.m65745e(this.setNumberText, dVar.setNumberText) && AbstractC22676k.m65745e(this.repsText, dVar.repsText) && AbstractC22676k.m65745e(this.timeText, dVar.timeText) && this.useTimeEntry == dVar.useTimeEntry && AbstractC22676k.m65745e(this.weightText, dVar.weightText) && this.weightFieldImeAction == dVar.weightFieldImeAction && AbstractC22676k.m65745e(this.onIconClickEvent, dVar.onIconClickEvent);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: h, reason: from getter */
        public int getIconContentDescriptionResId() {
            return this.iconContentDescriptionResId;
        }

        public int hashCode() {
            return this.onIconClickEvent.hashCode() + AbstractC11266d.m30448b(this.weightFieldImeAction, AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.setIndex, this.id.hashCode() * 31, 31), this.setNumberText, 31), this.repsText, 31), this.timeText, 31), 31, this.useTimeEntry), this.weightText, 31), 31);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: l, reason: from getter */
        public Object getOnIconClickEvent() {
            return this.onIconClickEvent;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: n, reason: from getter */
        public TextResource getRepsText() {
            return this.repsText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: o, reason: from getter */
        public int getSetIndex() {
            return this.setIndex;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: q, reason: from getter */
        public TextResource getSetNumberText() {
            return this.setNumberText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: t, reason: from getter */
        public TextResource getTimeText() {
            return this.timeText;
        }

        public String toString() {
            UUID uuid = this.id;
            int i13 = this.setIndex;
            TextResource textResource = this.setNumberText;
            TextResource textResource2 = this.repsText;
            TextResource textResource3 = this.timeText;
            boolean z4 = this.useTimeEntry;
            TextResource textResource4 = this.weightText;
            String strM91501a = C29877k.m91501a(this.weightFieldImeAction);
            Object obj = this.onIconClickEvent;
            StringBuilder sb4 = new StringBuilder("Edit(id=");
            sb4.append(uuid);
            sb4.append(", setIndex=");
            sb4.append(i13);
            sb4.append(", setNumberText=");
            AbstractC30007c.m91855y(sb4, textResource, ", repsText=", textResource2, ", timeText=");
            AbstractC33745d.m106664w(textResource3, ", useTimeEntry=", ", weightText=", sb4, z4);
            AbstractC30007c.m91856z(sb4, textResource4, ", weightFieldImeAction=", strM91501a, ", onIconClickEvent=");
            return AbstractC2875y.m8303p(sb4, ")", obj);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: u, reason: from getter */
        public boolean getUseTimeEntry() {
            return this.useTimeEntry;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: v, reason: from getter */
        public int getWeightFieldImeAction() {
            return this.weightFieldImeAction;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: w, reason: from getter */
        public TextResource getWeightText() {
            return this.weightText;
        }

        /* JADX INFO: renamed from: x */
        public final d m95133x(UUID id4, int setIndex, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean useTimeEntry, TextResource weightText, int weightFieldImeAction, Object onIconClickEvent) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            AbstractC22676k.m65750j(onIconClickEvent, "onIconClickEvent");
            return new d(id4, setIndex, setNumberText, repsText, timeText, useTimeEntry, weightText, weightFieldImeAction, onIconClickEvent, null);
        }

        @Override // p720m91.InterfaceC25305n
        /* JADX INFO: renamed from: z, reason: from getter */
        public UUID getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(UUID id4, int i13, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean z4, TextResource weightText, int i14, Object onIconClickEvent) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            AbstractC22676k.m65750j(onIconClickEvent, "onIconClickEvent");
            this.id = id4;
            this.setIndex = i13;
            this.setNumberText = setNumberText;
            this.repsText = repsText;
            this.timeText = timeText;
            this.useTimeEntry = z4;
            this.weightText = weightText;
            this.weightFieldImeAction = i14;
            this.onIconClickEvent = onIconClickEvent;
            this.icon = AbstractC39383f.m125595a(C38072d.f163053a);
            this.iconContentDescriptionResId = AbstractC16277f.f62299Z;
        }

        public /* synthetic */ d(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, Object obj, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, (i15 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i15 & 32) != 0 ? false : z4, textResource4, (i15 & 128) != 0 ? 6 : i14, (i15 & 256) != 0 ? C23454a0.f92919a : obj, null);
        }
    }

    /* JADX INFO: renamed from: r41.i$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ¨\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b%\u0010.R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b5\u0010.R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b6\u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b:\u00104R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b;\u0010!R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?R\u001a\u0010\u0018\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u00104R\u001a\u0010I\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010*\u001a\u0004\bH\u0010!¨\u0006J"}, m65681d2 = {"Lr41/i$e;", "Lr41/i;", "Ljava/util/UUID;", "id", "", "setIndex", "Lcom/whoop/design/util/TextResource;", "setNumberText", "repsText", "timeText", "", "useTimeEntry", "weightText", "Lq3/k;", "weightFieldImeAction", "", "onIconClickEvent", "iconEnabled", "icon", "Ly81/f;", "iconColor", "Lny0/q;", "iconButtonType", "iconCircleColor", "animateIconOnChange", "<init>", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILy81/f;Lny0/q;Ly81/f;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "x", "(Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILy81/f;Lny0/q;Ly81/f;Z)Lr41/i$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "n", "Ljava/util/UUID;", "z", "()Ljava/util/UUID;", "o", "I", "p", "Lcom/whoop/design/util/TextResource;", "q", "()Lcom/whoop/design/util/TextResource;", "r", "t", "s", "Z", "u", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "i", "c", "y", "Ly81/f;", "g", "()Ly81/f;", "Lny0/q;", "e", "()Lny0/q;", "A", "f", "B", "a", "C", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "iconContentDescriptionResId", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC30925i {

        /* JADX INFO: renamed from: D */
        public static final int f127604D = 8;

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final EnumC39333f iconCircleColor;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private final boolean animateIconOnChange;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private final int iconContentDescriptionResId;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final UUID id;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final int setIndex;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final TextResource setNumberText;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final TextResource repsText;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final TextResource timeText;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final boolean useTimeEntry;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final TextResource weightText;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final int weightFieldImeAction;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final Object onIconClickEvent;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final boolean iconEnabled;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final EnumC39333f iconColor;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final AbstractC27274q iconButtonType;

        public /* synthetic */ e(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, Object obj, boolean z13, int i15, EnumC39333f enumC39333f, AbstractC27274q abstractC27274q, EnumC39333f enumC39333f2, boolean z14, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, textResource3, z4, textResource4, i14, obj, z13, i15, enumC39333f, abstractC27274q, enumC39333f2, z14);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAnimateIconOnChange() {
            return this.animateIconOnChange;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getIcon() {
            return this.icon;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: e, reason: from getter */
        public AbstractC27274q getIconButtonType() {
            return this.iconButtonType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.id, eVar.id) && this.setIndex == eVar.setIndex && AbstractC22676k.m65745e(this.setNumberText, eVar.setNumberText) && AbstractC22676k.m65745e(this.repsText, eVar.repsText) && AbstractC22676k.m65745e(this.timeText, eVar.timeText) && this.useTimeEntry == eVar.useTimeEntry && AbstractC22676k.m65745e(this.weightText, eVar.weightText) && this.weightFieldImeAction == eVar.weightFieldImeAction && AbstractC22676k.m65745e(this.onIconClickEvent, eVar.onIconClickEvent) && this.iconEnabled == eVar.iconEnabled && this.icon == eVar.icon && this.iconColor == eVar.iconColor && AbstractC22676k.m65745e(this.iconButtonType, eVar.iconButtonType) && this.iconCircleColor == eVar.iconCircleColor && this.animateIconOnChange == eVar.animateIconOnChange;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: f, reason: from getter */
        public EnumC39333f getIconCircleColor() {
            return this.iconCircleColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: g, reason: from getter */
        public EnumC39333f getIconColor() {
            return this.iconColor;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: h, reason: from getter */
        public int getIconContentDescriptionResId() {
            return this.iconContentDescriptionResId;
        }

        public int hashCode() {
            int iHashCode = (this.iconButtonType.hashCode() + AbstractC21702c.m61132c(this.iconColor, AbstractC11266d.m30448b(this.icon, AbstractC2875y.m8289b(AbstractC33745d.m106644c(AbstractC11266d.m30448b(this.weightFieldImeAction, AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.setIndex, this.id.hashCode() * 31, 31), this.setNumberText, 31), this.repsText, 31), this.timeText, 31), 31, this.useTimeEntry), this.weightText, 31), 31), 31, this.onIconClickEvent), 31, this.iconEnabled), 31), 31)) * 31;
            EnumC39333f enumC39333f = this.iconCircleColor;
            return Boolean.hashCode(this.animateIconOnChange) + ((iHashCode + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31);
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: i, reason: from getter */
        public boolean getIconEnabled() {
            return this.iconEnabled;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: l, reason: from getter */
        public Object getOnIconClickEvent() {
            return this.onIconClickEvent;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: n, reason: from getter */
        public TextResource getRepsText() {
            return this.repsText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: o, reason: from getter */
        public int getSetIndex() {
            return this.setIndex;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: q, reason: from getter */
        public TextResource getSetNumberText() {
            return this.setNumberText;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: t, reason: from getter */
        public TextResource getTimeText() {
            return this.timeText;
        }

        public String toString() {
            UUID uuid = this.id;
            int i13 = this.setIndex;
            TextResource textResource = this.setNumberText;
            TextResource textResource2 = this.repsText;
            TextResource textResource3 = this.timeText;
            boolean z4 = this.useTimeEntry;
            TextResource textResource4 = this.weightText;
            String strM91501a = C29877k.m91501a(this.weightFieldImeAction);
            Object obj = this.onIconClickEvent;
            boolean z13 = this.iconEnabled;
            int i14 = this.icon;
            EnumC39333f enumC39333f = this.iconColor;
            AbstractC27274q abstractC27274q = this.iconButtonType;
            EnumC39333f enumC39333f2 = this.iconCircleColor;
            boolean z14 = this.animateIconOnChange;
            StringBuilder sb4 = new StringBuilder("InProgress(id=");
            sb4.append(uuid);
            sb4.append(", setIndex=");
            sb4.append(i13);
            sb4.append(", setNumberText=");
            AbstractC30007c.m91855y(sb4, textResource, ", repsText=", textResource2, ", timeText=");
            AbstractC33745d.m106664w(textResource3, ", useTimeEntry=", ", weightText=", sb4, z4);
            AbstractC30007c.m91856z(sb4, textResource4, ", weightFieldImeAction=", strM91501a, ", onIconClickEvent=");
            sb4.append(obj);
            sb4.append(", iconEnabled=");
            sb4.append(z13);
            sb4.append(", icon=");
            sb4.append(i14);
            sb4.append(", iconColor=");
            sb4.append(enumC39333f);
            sb4.append(", iconButtonType=");
            sb4.append(abstractC27274q);
            sb4.append(", iconCircleColor=");
            sb4.append(enumC39333f2);
            sb4.append(", animateIconOnChange=");
            return AbstractC18489d0.m53372m(sb4, z14, ")");
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: u, reason: from getter */
        public boolean getUseTimeEntry() {
            return this.useTimeEntry;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: v, reason: from getter */
        public int getWeightFieldImeAction() {
            return this.weightFieldImeAction;
        }

        @Override // r41.AbstractC30925i
        /* JADX INFO: renamed from: w, reason: from getter */
        public TextResource getWeightText() {
            return this.weightText;
        }

        /* JADX INFO: renamed from: x */
        public final e m95136x(UUID id4, int setIndex, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean useTimeEntry, TextResource weightText, int weightFieldImeAction, Object onIconClickEvent, boolean iconEnabled, int icon, EnumC39333f iconColor, AbstractC27274q iconButtonType, EnumC39333f iconCircleColor, boolean animateIconOnChange) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            AbstractC22676k.m65750j(onIconClickEvent, "onIconClickEvent");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(iconButtonType, "iconButtonType");
            return new e(id4, setIndex, setNumberText, repsText, timeText, useTimeEntry, weightText, weightFieldImeAction, onIconClickEvent, iconEnabled, icon, iconColor, iconButtonType, iconCircleColor, animateIconOnChange, null);
        }

        @Override // p720m91.InterfaceC25305n
        /* JADX INFO: renamed from: z, reason: from getter */
        public UUID getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(UUID id4, int i13, TextResource setNumberText, TextResource repsText, TextResource timeText, boolean z4, TextResource weightText, int i14, Object onIconClickEvent, boolean z13, int i15, EnumC39333f iconColor, AbstractC27274q iconButtonType, EnumC39333f enumC39333f, boolean z14) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(setNumberText, "setNumberText");
            AbstractC22676k.m65750j(repsText, "repsText");
            AbstractC22676k.m65750j(timeText, "timeText");
            AbstractC22676k.m65750j(weightText, "weightText");
            AbstractC22676k.m65750j(onIconClickEvent, "onIconClickEvent");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(iconButtonType, "iconButtonType");
            this.id = id4;
            this.setIndex = i13;
            this.setNumberText = setNumberText;
            this.repsText = repsText;
            this.timeText = timeText;
            this.useTimeEntry = z4;
            this.weightText = weightText;
            this.weightFieldImeAction = i14;
            this.onIconClickEvent = onIconClickEvent;
            this.iconEnabled = z13;
            this.icon = i15;
            this.iconColor = iconColor;
            this.iconButtonType = iconButtonType;
            this.iconCircleColor = enumC39333f;
            this.animateIconOnChange = z14;
            this.iconContentDescriptionResId = AbstractC16277f.f62244H2;
        }

        public /* synthetic */ e(UUID uuid, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, Object obj, boolean z13, int i15, EnumC39333f enumC39333f, AbstractC27274q abstractC27274q, EnumC39333f enumC39333f2, boolean z14, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, i13, textResource, textResource2, (i16 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3, (i16 & 32) != 0 ? false : z4, textResource4, (i16 & 128) != 0 ? 7 : i14, (i16 & 256) != 0 ? C23454a0.f92919a : obj, (i16 & 512) != 0 ? true : z13, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C38072d.f163053a.m121951d().getTinyIcons().getPlay() : i15, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i16 & 4096) != 0 ? AbstractC27274q.c.f109140f : abstractC27274q, (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : enumC39333f2, (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z14, null);
        }
    }

    public /* synthetic */ AbstractC30925i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getAnimateIconOnChange() {
        return this.animateIconOnChange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC39332e getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: c */
    public abstract int getIcon();

    /* JADX INFO: renamed from: e, reason: from getter */
    public AbstractC27274q getIconButtonType() {
        return this.iconButtonType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public EnumC39333f getIconCircleColor() {
        return this.iconCircleColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public EnumC39333f getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: h */
    public abstract int getIconContentDescriptionResId();

    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getIconEnabled() {
        return this.iconEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getIconFill() {
        return this.iconFill;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getIconNonFunctional() {
        return this.iconNonFunctional;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public Object getOnIconClickEvent() {
        return this.onIconClickEvent;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public EnumC39333f getRepsAndWeightTextColor() {
        return this.repsAndWeightTextColor;
    }

    /* JADX INFO: renamed from: n */
    public abstract TextResource getRepsText();

    /* JADX INFO: renamed from: o */
    public abstract int getSetIndex();

    /* JADX INFO: renamed from: p, reason: from getter */
    public EnumC39333f getSetNumberColor() {
        return this.setNumberColor;
    }

    /* JADX INFO: renamed from: q */
    public abstract TextResource getSetNumberText();

    /* JADX INFO: renamed from: r, reason: from getter */
    public boolean getShowCurrentSetIndicator() {
        return this.showCurrentSetIndicator;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public boolean getShowProgressIndicatorInsteadOfIcon() {
        return this.showProgressIndicatorInsteadOfIcon;
    }

    /* JADX INFO: renamed from: t */
    public abstract TextResource getTimeText();

    /* JADX INFO: renamed from: u */
    public abstract boolean getUseTimeEntry();

    /* JADX INFO: renamed from: v */
    public abstract int getWeightFieldImeAction();

    /* JADX INFO: renamed from: w */
    public abstract TextResource getWeightText();

    private AbstractC30925i() {
        this.iconButtonType = AbstractC27274q.c.f109140f;
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        this.iconColor = enumC39333f;
        this.iconEnabled = true;
        this.onIconClickEvent = C23454a0.f92919a;
        int i13 = C17919x.f69638o;
        this.backgroundColor = p745y81.Function1.m125324b(C17919x.f69636m);
        this.setNumberColor = EnumC39333f.WHITE_50;
        this.repsAndWeightTextColor = enumC39333f;
    }
}
