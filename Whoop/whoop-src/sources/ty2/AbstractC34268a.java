package ty2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22403o;
import lz2.C24826b;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28204u;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ty2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lty2/a;", "", "<init>", "()V", "g", "j", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "e", "f", "c", "d", "a", "Lty2/a$a;", "Lty2/a$b;", "Lty2/a$c;", "Lty2/a$d;", "Lty2/a$e;", "Lty2/a$f;", "Lty2/a$g;", "Lty2/a$h;", "Lty2/a$i;", "Lty2/a$j;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34268a {

    /* JADX INFO: renamed from: ty2.a$a */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\"#\u0011\u000f\u001f\u001c!$\u0015BI\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\u001f\u0010\u001b\u0082\u0001\t%&'()*+,-¨\u0006."}, m65681d2 = {"Lty2/a$a;", "Lty2/a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "Lcom/whoop/design/util/TextResource;", "primaryButtonText", "secondaryButtonText", "isAddNoteShowing", "isCancellingShowing", "<init>", "(Lty2/f;Lty2/c;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZ)V", "a", "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "b", "Lty2/c;", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "Z", "()Z", "d", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "e", "getSecondaryButtonText", "f", "g", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/a$a$a;", "Lty2/a$a$b;", "Lty2/a$a$c;", "Lty2/a$a$d;", "Lty2/a$a$e;", "Lty2/a$a$f;", "Lty2/a$a$g;", "Lty2/a$a$h;", "Lty2/a$a$i;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a extends AbstractC34268a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private C34273f toolbarState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private C34270c cancelState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isPrimaryButtonEnabled;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource secondaryButtonText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean isAddNoteShowing;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean isCancellingShowing;

        /* JADX INFO: renamed from: ty2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u00101R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b\r\u0010+R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b\u000e\u0010+R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Lty2/a$a$a;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "content", "Lcom/whoop/design/util/TextResource;", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "", "Llz2/b;", "hrDevicesViewState", "<init>", "(Lty2/f;Lty2/c;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "()Z", "k", "Ljava/lang/String;", "f", "l", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "m", "getSecondaryButton", "n", "o", "p", "Ljava/util/List;", "g", "()Ljava/util/List;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42429a extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final List<C24826b> hrDevicesViewState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42429a(C34273f toolbarState, C34270c cancelState, boolean z4, String str, TextResource primaryButton, TextResource textResource, boolean z13, boolean z14, List<C24826b> hrDevicesViewState) {
                super(toolbarState, cancelState, z4, primaryButton, textResource, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                AbstractC22676k.m65750j(hrDevicesViewState, "hrDevicesViewState");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.content = str;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource;
                this.isAddNote = z13;
                this.isCancel = z14;
                this.hrDevicesViewState = hrDevicesViewState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42429a)) {
                    return false;
                }
                C42429a c42429a = (C42429a) other;
                return AbstractC22676k.m65745e(this.toolbarState, c42429a.toolbarState) && AbstractC22676k.m65745e(this.cancelState, c42429a.cancelState) && this.isPrimaryButtonEnabled == c42429a.isPrimaryButtonEnabled && AbstractC22676k.m65745e(this.content, c42429a.content) && AbstractC22676k.m65745e(this.primaryButton, c42429a.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, c42429a.secondaryButton) && this.isAddNote == c42429a.isAddNote && this.isCancel == c42429a.isCancel && AbstractC22676k.m65745e(this.hrDevicesViewState, c42429a.hrDevicesViewState);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g */
            public final List<C24826b> m108426g() {
                return this.hrDevicesViewState;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final TextResource getPrimaryButton() {
                return this.primaryButton;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled);
                String str = this.content;
                int iM95625a = AbstractC31061c.m95625a((iM8289b + (str == null ? 0 : str.hashCode())) * 31, this.primaryButton, 31);
                TextResource textResource = this.secondaryButton;
                return this.hrDevicesViewState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isAddNote), 31, this.isCancel);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public boolean getIsPrimaryButtonEnabled() {
                return this.isPrimaryButtonEnabled;
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                String str = this.content;
                TextResource textResource = this.primaryButton;
                TextResource textResource2 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                List<C24826b> list = this.hrDevicesViewState;
                StringBuilder sb4 = new StringBuilder("CampaignBtHrStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC38963t7.m124391u(sb4, z4, ", content=", str, ", primaryButton=");
                AbstractC30007c.m91855y(sb4, textResource, ", secondaryButton=", textResource2, ", isAddNote=");
                AbstractC38963t7.m124392v(sb4, z13, ", isCancel=", z14, ", hrDevicesViewState=");
                return AbstractC3855a.m11829m(sb4, list, ")");
            }
        }

        /* JADX INFO: renamed from: ty2.a$a$b */
        @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b7\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b\r\u00102R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b\u000e\u00102R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b/\u00108R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b#\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b)\u0010CR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\b9\u00102R\u0011\u0010E\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001b¨\u0006F"}, m65681d2 = {"Lty2/a$a$b;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "content", "Lcom/whoop/design/util/TextResource;", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "dividerLabel", "Lzr2/a;", "dateAndTimeProvider", "Lorg/joda/time/LocalDateTime;", "dateTime", "isUsing24HourTime", "<init>", "(Lty2/f;Lty2/c;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;Lzr2/a;Lorg/joda/time/LocalDateTime;Z)V", "todayLabel", "f", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "l", "()Z", "k", "Ljava/lang/String;", "g", "Lcom/whoop/design/util/TextResource;", "getPrimaryButton", "()Lcom/whoop/design/util/TextResource;", "m", "getSecondaryButton", "n", "o", "p", "q", "Lzr2/a;", "()Lzr2/a;", "r", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "s", "formattedTime", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final TextResource dividerLabel;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final InterfaceC41070a dateAndTimeProvider;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private final LocalDateTime dateTime;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            private final boolean isUsing24HourTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C34273f toolbarState, C34270c cancelState, boolean z4, String str, TextResource primaryButton, TextResource textResource, boolean z13, boolean z14, TextResource dividerLabel, InterfaceC41070a dateAndTimeProvider, LocalDateTime dateTime, boolean z15) {
                super(toolbarState, cancelState, z4, primaryButton, textResource, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                AbstractC22676k.m65750j(dividerLabel, "dividerLabel");
                AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
                AbstractC22676k.m65750j(dateTime, "dateTime");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.content = str;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource;
                this.isAddNote = z13;
                this.isCancel = z14;
                this.dividerLabel = dividerLabel;
                this.dateAndTimeProvider = dateAndTimeProvider;
                this.dateTime = dateTime;
                this.isUsing24HourTime = z15;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return AbstractC22676k.m65745e(this.toolbarState, bVar.toolbarState) && AbstractC22676k.m65745e(this.cancelState, bVar.cancelState) && this.isPrimaryButtonEnabled == bVar.isPrimaryButtonEnabled && AbstractC22676k.m65745e(this.content, bVar.content) && AbstractC22676k.m65745e(this.primaryButton, bVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, bVar.secondaryButton) && this.isAddNote == bVar.isAddNote && this.isCancel == bVar.isCancel && AbstractC22676k.m65745e(this.dividerLabel, bVar.dividerLabel) && AbstractC22676k.m65745e(this.dateAndTimeProvider, bVar.dateAndTimeProvider) && AbstractC22676k.m65745e(this.dateTime, bVar.dateTime) && this.isUsing24HourTime == bVar.isUsing24HourTime;
            }

            /* JADX INFO: renamed from: f */
            public final String m108429f(String todayLabel) {
                AbstractC22676k.m65750j(todayLabel, "todayLabel");
                if (AbstractC22676k.m65745e(this.dateTime.toLocalDate(), LocalDate.now())) {
                    return todayLabel;
                }
                String string = this.dateTime.toString("MMM dd, yyyy");
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final InterfaceC41070a getDateAndTimeProvider() {
                return this.dateAndTimeProvider;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled);
                String str = this.content;
                int iM95625a = AbstractC31061c.m95625a((iM8289b + (str == null ? 0 : str.hashCode())) * 31, this.primaryButton, 31);
                TextResource textResource = this.secondaryButton;
                return Boolean.hashCode(this.isUsing24HourTime) + ((this.dateTime.hashCode() + ((this.dateAndTimeProvider.hashCode() + AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isAddNote), 31, this.isCancel), this.dividerLabel, 31)) * 31)) * 31);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final LocalDateTime getDateTime() {
                return this.dateTime;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final TextResource getDividerLabel() {
                return this.dividerLabel;
            }

            /* JADX INFO: renamed from: k */
            public final String m108434k() {
                if (!this.isUsing24HourTime) {
                    String upperCase = C28204u.INSTANCE.m85361d(this.dateTime).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    return upperCase;
                }
                return this.dateTime.getHourOfDay() + ":" + String.format(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.dateTime.getMinuteOfHour())}, 1));
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public boolean getIsPrimaryButtonEnabled() {
                return this.isPrimaryButtonEnabled;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final boolean getIsUsing24HourTime() {
                return this.isUsing24HourTime;
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                String str = this.content;
                TextResource textResource = this.primaryButton;
                TextResource textResource2 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                TextResource textResource3 = this.dividerLabel;
                InterfaceC41070a interfaceC41070a = this.dateAndTimeProvider;
                LocalDateTime localDateTime = this.dateTime;
                boolean z15 = this.isUsing24HourTime;
                StringBuilder sb4 = new StringBuilder("CampaignDateTimePickerStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC38963t7.m124391u(sb4, z4, ", content=", str, ", primaryButton=");
                AbstractC30007c.m91855y(sb4, textResource, ", secondaryButton=", textResource2, ", isAddNote=");
                AbstractC38963t7.m124392v(sb4, z13, ", isCancel=", z14, ", dividerLabel=");
                sb4.append(textResource3);
                sb4.append(", dateAndTimeProvider=");
                sb4.append(interfaceC41070a);
                sb4.append(", dateTime=");
                sb4.append(localDateTime);
                sb4.append(", isUsing24HourTime=");
                sb4.append(z15);
                sb4.append(")");
                return sb4.toString();
            }
        }

        /* JADX INFO: renamed from: ty2.a$a$c */
        @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bH\u0010ER\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bH\u0010@\u001a\u0004\bI\u0010BR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\b.\u0010ER\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\b4\u0010ER\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\b(\u0010ER\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\b8\u0010BR\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\b=\u0010ER\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\b?\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\b;\u0010ER\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bF\u0010ER\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u0010ER\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\b\u001c\u00107R\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bR\u00105\u001a\u0004\b\u001d\u00107¨\u0006S"}, m65681d2 = {"Lty2/a$a$c;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "content", "imageUrl", "imageAlt", "", "systolic", "Lcom/whoop/design/util/TextResource;", "systolicLabel", "systolicSuffix", "systolicError", "diastolic", "diastolicLabel", "diastolicSuffix", "diastolicError", "hr", "hrLabel", "hrSuffix", "hrError", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "<init>", "(Lty2/f;Lty2/c;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "u", "()Z", "k", "Ljava/lang/String;", "f", "l", "o", "m", "getImageAlt", "n", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "Lcom/whoop/design/util/TextResource;", "s", "()Lcom/whoop/design/util/TextResource;", "p", "t", "r", "g", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "A", "getSecondaryButton", "B", "C", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final String imageAlt;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final Integer systolic;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final TextResource systolicLabel;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final TextResource systolicSuffix;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final TextResource systolicError;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private final Integer diastolic;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            private final TextResource diastolicLabel;

            /* JADX INFO: renamed from: t, reason: from kotlin metadata */
            private final TextResource diastolicSuffix;

            /* JADX INFO: renamed from: u, reason: from kotlin metadata */
            private final TextResource diastolicError;

            /* JADX INFO: renamed from: v, reason: from kotlin metadata */
            private final Integer hr;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata */
            private final TextResource hrLabel;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            private final TextResource hrSuffix;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata */
            private final TextResource hrError;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C34273f toolbarState, C34270c cancelState, boolean z4, String str, String str2, String str3, Integer num, TextResource systolicLabel, TextResource systolicSuffix, TextResource textResource, Integer num2, TextResource diastolicLabel, TextResource diastolicSuffix, TextResource textResource2, Integer num3, TextResource hrLabel, TextResource hrSuffix, TextResource textResource3, TextResource primaryButton, TextResource textResource4, boolean z13, boolean z14) {
                super(toolbarState, cancelState, z4, primaryButton, textResource4, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(systolicLabel, "systolicLabel");
                AbstractC22676k.m65750j(systolicSuffix, "systolicSuffix");
                AbstractC22676k.m65750j(diastolicLabel, "diastolicLabel");
                AbstractC22676k.m65750j(diastolicSuffix, "diastolicSuffix");
                AbstractC22676k.m65750j(hrLabel, "hrLabel");
                AbstractC22676k.m65750j(hrSuffix, "hrSuffix");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.content = str;
                this.imageUrl = str2;
                this.imageAlt = str3;
                this.systolic = num;
                this.systolicLabel = systolicLabel;
                this.systolicSuffix = systolicSuffix;
                this.systolicError = textResource;
                this.diastolic = num2;
                this.diastolicLabel = diastolicLabel;
                this.diastolicSuffix = diastolicSuffix;
                this.diastolicError = textResource2;
                this.hr = num3;
                this.hrLabel = hrLabel;
                this.hrSuffix = hrSuffix;
                this.hrError = textResource3;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource4;
                this.isAddNote = z13;
                this.isCancel = z14;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return AbstractC22676k.m65745e(this.toolbarState, cVar.toolbarState) && AbstractC22676k.m65745e(this.cancelState, cVar.cancelState) && this.isPrimaryButtonEnabled == cVar.isPrimaryButtonEnabled && AbstractC22676k.m65745e(this.content, cVar.content) && AbstractC22676k.m65745e(this.imageUrl, cVar.imageUrl) && AbstractC22676k.m65745e(this.imageAlt, cVar.imageAlt) && AbstractC22676k.m65745e(this.systolic, cVar.systolic) && AbstractC22676k.m65745e(this.systolicLabel, cVar.systolicLabel) && AbstractC22676k.m65745e(this.systolicSuffix, cVar.systolicSuffix) && AbstractC22676k.m65745e(this.systolicError, cVar.systolicError) && AbstractC22676k.m65745e(this.diastolic, cVar.diastolic) && AbstractC22676k.m65745e(this.diastolicLabel, cVar.diastolicLabel) && AbstractC22676k.m65745e(this.diastolicSuffix, cVar.diastolicSuffix) && AbstractC22676k.m65745e(this.diastolicError, cVar.diastolicError) && AbstractC22676k.m65745e(this.hr, cVar.hr) && AbstractC22676k.m65745e(this.hrLabel, cVar.hrLabel) && AbstractC22676k.m65745e(this.hrSuffix, cVar.hrSuffix) && AbstractC22676k.m65745e(this.hrError, cVar.hrError) && AbstractC22676k.m65745e(this.primaryButton, cVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, cVar.secondaryButton) && this.isAddNote == cVar.isAddNote && this.isCancel == cVar.isCancel;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Integer getDiastolic() {
                return this.diastolic;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final TextResource getDiastolicError() {
                return this.diastolicError;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled);
                String str = this.content;
                int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.imageUrl;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.imageAlt;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.systolic;
                int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, this.systolicLabel, 31), this.systolicSuffix, 31);
                TextResource textResource = this.systolicError;
                int iHashCode4 = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
                Integer num2 = this.diastolic;
                int iM95625a2 = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, this.diastolicLabel, 31), this.diastolicSuffix, 31);
                TextResource textResource2 = this.diastolicError;
                int iHashCode5 = (iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
                Integer num3 = this.hr;
                int iM95625a3 = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31, this.hrLabel, 31), this.hrSuffix, 31);
                TextResource textResource3 = this.hrError;
                int iM95625a4 = AbstractC31061c.m95625a((iM95625a3 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31, this.primaryButton, 31);
                TextResource textResource4 = this.secondaryButton;
                return Boolean.hashCode(this.isCancel) + AbstractC2875y.m8289b((iM95625a4 + (textResource4 != null ? textResource4.hashCode() : 0)) * 31, 31, this.isAddNote);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TextResource getDiastolicLabel() {
                return this.diastolicLabel;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final TextResource getDiastolicSuffix() {
                return this.diastolicSuffix;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Integer getHr() {
                return this.hr;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final TextResource getHrError() {
                return this.hrError;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final TextResource getHrLabel() {
                return this.hrLabel;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final TextResource getHrSuffix() {
                return this.hrSuffix;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final TextResource getPrimaryButton() {
                return this.primaryButton;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final Integer getSystolic() {
                return this.systolic;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final TextResource getSystolicError() {
                return this.systolicError;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final TextResource getSystolicLabel() {
                return this.systolicLabel;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final TextResource getSystolicSuffix() {
                return this.systolicSuffix;
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                String str = this.content;
                String str2 = this.imageUrl;
                String str3 = this.imageAlt;
                Integer num = this.systolic;
                TextResource textResource = this.systolicLabel;
                TextResource textResource2 = this.systolicSuffix;
                TextResource textResource3 = this.systolicError;
                Integer num2 = this.diastolic;
                TextResource textResource4 = this.diastolicLabel;
                TextResource textResource5 = this.diastolicSuffix;
                TextResource textResource6 = this.diastolicError;
                Integer num3 = this.hr;
                TextResource textResource7 = this.hrLabel;
                TextResource textResource8 = this.hrSuffix;
                TextResource textResource9 = this.hrError;
                TextResource textResource10 = this.primaryButton;
                TextResource textResource11 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                StringBuilder sb4 = new StringBuilder("CampaignMysticStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC38963t7.m124391u(sb4, z4, ", content=", str, ", imageUrl=");
                AbstractC11266d.m30444B(sb4, str2, ", imageAlt=", str3, ", systolic=");
                sb4.append(num);
                sb4.append(", systolicLabel=");
                sb4.append(textResource);
                sb4.append(", systolicSuffix=");
                AbstractC30007c.m91855y(sb4, textResource2, ", systolicError=", textResource3, ", diastolic=");
                sb4.append(num2);
                sb4.append(", diastolicLabel=");
                sb4.append(textResource4);
                sb4.append(", diastolicSuffix=");
                AbstractC30007c.m91855y(sb4, textResource5, ", diastolicError=", textResource6, ", hr=");
                sb4.append(num3);
                sb4.append(", hrLabel=");
                sb4.append(textResource7);
                sb4.append(", hrSuffix=");
                AbstractC30007c.m91855y(sb4, textResource8, ", hrError=", textResource9, ", primaryButton=");
                AbstractC30007c.m91855y(sb4, textResource10, ", secondaryButton=", textResource11, ", isAddNote=");
                return AbstractC36095b.m114682j(sb4, z13, ", isCancel=", z14, ")");
            }

            /* JADX INFO: renamed from: u, reason: from getter */
            public boolean getIsPrimaryButtonEnabled() {
                return this.isPrimaryButtonEnabled;
            }
        }

        /* JADX INFO: renamed from: ty2.a$a$d */
        @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b*\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u00102R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b\r\u0010-R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b\u000e\u0010-R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b$\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00102R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b.\u00102R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b\u001e\u0010\u0016¨\u0006<"}, m65681d2 = {"Lty2/a$a$d;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "content", "Lcom/whoop/design/util/TextResource;", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "label", "errorMessage", "value", "hint", "<init>", "(Lty2/f;Lty2/c;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "l", "()Z", "k", "Ljava/lang/String;", "f", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "m", "getSecondaryButton", "n", "o", "p", "q", "g", "r", "s", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final TextResource label;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final TextResource errorMessage;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private final TextResource value;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            private final String hint;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C34273f toolbarState, C34270c cancelState, boolean z4, String str, TextResource primaryButton, TextResource textResource, boolean z13, boolean z14, TextResource label, TextResource textResource2, TextResource value, String hint) {
                super(toolbarState, cancelState, z4, primaryButton, textResource, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                AbstractC22676k.m65750j(label, "label");
                AbstractC22676k.m65750j(value, "value");
                AbstractC22676k.m65750j(hint, "hint");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.content = str;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource;
                this.isAddNote = z13;
                this.isCancel = z14;
                this.label = label;
                this.errorMessage = textResource2;
                this.value = value;
                this.hint = hint;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return AbstractC22676k.m65745e(this.toolbarState, dVar.toolbarState) && AbstractC22676k.m65745e(this.cancelState, dVar.cancelState) && this.isPrimaryButtonEnabled == dVar.isPrimaryButtonEnabled && AbstractC22676k.m65745e(this.content, dVar.content) && AbstractC22676k.m65745e(this.primaryButton, dVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, dVar.secondaryButton) && this.isAddNote == dVar.isAddNote && this.isCancel == dVar.isCancel && AbstractC22676k.m65745e(this.label, dVar.label) && AbstractC22676k.m65745e(this.errorMessage, dVar.errorMessage) && AbstractC22676k.m65745e(this.value, dVar.value) && AbstractC22676k.m65745e(this.hint, dVar.hint);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TextResource getErrorMessage() {
                return this.errorMessage;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getHint() {
                return this.hint;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled);
                String str = this.content;
                int iM95625a = AbstractC31061c.m95625a((iM8289b + (str == null ? 0 : str.hashCode())) * 31, this.primaryButton, 31);
                TextResource textResource = this.secondaryButton;
                int iM95625a2 = AbstractC31061c.m95625a(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.isAddNote), 31, this.isCancel), this.label, 31);
                TextResource textResource2 = this.errorMessage;
                return this.hint.hashCode() + AbstractC31061c.m95625a((iM95625a2 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, this.value, 31);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TextResource getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final TextResource getPrimaryButton() {
                return this.primaryButton;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final TextResource getValue() {
                return this.value;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public boolean getIsPrimaryButtonEnabled() {
                return this.isPrimaryButtonEnabled;
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                String str = this.content;
                TextResource textResource = this.primaryButton;
                TextResource textResource2 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                TextResource textResource3 = this.label;
                TextResource textResource4 = this.errorMessage;
                TextResource textResource5 = this.value;
                String str2 = this.hint;
                StringBuilder sb4 = new StringBuilder("CampaignNumberInputStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC38963t7.m124391u(sb4, z4, ", content=", str, ", primaryButton=");
                AbstractC30007c.m91855y(sb4, textResource, ", secondaryButton=", textResource2, ", isAddNote=");
                AbstractC38963t7.m124392v(sb4, z13, ", isCancel=", z14, ", label=");
                AbstractC30007c.m91855y(sb4, textResource3, ", errorMessage=", textResource4, ", value=");
                sb4.append(textResource5);
                sb4.append(", hint=");
                sb4.append(str2);
                sb4.append(")");
                return sb4.toString();
            }
        }

        /* JADX INFO: renamed from: ty2.a$a$e */
        @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b\r\u0010,R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b\u000e\u0010,R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b$\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b\u001e\u0010\u0016¨\u0006<"}, m65681d2 = {"Lty2/a$a$e;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "content", "Lcom/whoop/design/util/TextResource;", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "", "Lty2/d;", "selectionOptionsViewState", "selected", "<init>", "(Lty2/f;Lty2/c;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "()Z", "k", "Ljava/lang/String;", "f", "l", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "m", "getSecondaryButton", "n", "o", "p", "Ljava/util/List;", "()Ljava/util/List;", "q", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final List<C34271d> selectionOptionsViewState;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final String selected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C34273f toolbarState, C34270c cancelState, boolean z4, String str, TextResource primaryButton, TextResource textResource, boolean z13, boolean z14, List<C34271d> selectionOptionsViewState, String str2) {
                super(toolbarState, cancelState, z4, primaryButton, textResource, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                AbstractC22676k.m65750j(selectionOptionsViewState, "selectionOptionsViewState");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.content = str;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource;
                this.isAddNote = z13;
                this.isCancel = z14;
                this.selectionOptionsViewState = selectionOptionsViewState;
                this.selected = str2;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof e)) {
                    return false;
                }
                e eVar = (e) other;
                return AbstractC22676k.m65745e(this.toolbarState, eVar.toolbarState) && AbstractC22676k.m65745e(this.cancelState, eVar.cancelState) && this.isPrimaryButtonEnabled == eVar.isPrimaryButtonEnabled && AbstractC22676k.m65745e(this.content, eVar.content) && AbstractC22676k.m65745e(this.primaryButton, eVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, eVar.secondaryButton) && this.isAddNote == eVar.isAddNote && this.isCancel == eVar.isCancel && AbstractC22676k.m65745e(this.selectionOptionsViewState, eVar.selectionOptionsViewState) && AbstractC22676k.m65745e(this.selected, eVar.selected);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TextResource getPrimaryButton() {
                return this.primaryButton;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getSelected() {
                return this.selected;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled);
                String str = this.content;
                int iM95625a = AbstractC31061c.m95625a((iM8289b + (str == null ? 0 : str.hashCode())) * 31, this.primaryButton, 31);
                TextResource textResource = this.secondaryButton;
                int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.isAddNote), 31, this.isCancel), 31, this.selectionOptionsViewState);
                String str2 = this.selected;
                return iM31983b + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final List<C34271d> m108463i() {
                return this.selectionOptionsViewState;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public boolean getIsPrimaryButtonEnabled() {
                return this.isPrimaryButtonEnabled;
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                String str = this.content;
                TextResource textResource = this.primaryButton;
                TextResource textResource2 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                List<C34271d> list = this.selectionOptionsViewState;
                String str2 = this.selected;
                StringBuilder sb4 = new StringBuilder("CampaignOptionSelectionStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC38963t7.m124391u(sb4, z4, ", content=", str, ", primaryButton=");
                AbstractC30007c.m91855y(sb4, textResource, ", secondaryButton=", textResource2, ", isAddNote=");
                AbstractC38963t7.m124392v(sb4, z13, ", isCancel=", z14, ", selectionOptionsViewState=");
                return AbstractC38963t7.m124377g(", selected=", str2, ")", sb4, list);
            }
        }

        /* JADX INFO: renamed from: ty2.a$a$f */
        @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b1\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u00106R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b\r\u00100R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b\u000e\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b'\u00106R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b!\u00106R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b9\u0010\u001aR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u00106R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\b7\u0010\u001c¨\u0006C"}, m65681d2 = {"Lty2/a$a$f;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "content", "Lcom/whoop/design/util/TextResource;", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "", "rowCount", "label", "hint", "textInput", "errorMessage", "maxInputLength", "stepId", "<init>", "(Lty2/f;Lty2/c;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "o", "()Z", "k", "Ljava/lang/String;", "f", "l", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "m", "getSecondaryButton", "n", "p", "I", "q", "r", "s", "t", "g", "u", "v", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final int rowCount;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final TextResource label;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private final TextResource hint;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            private final String textInput;

            /* JADX INFO: renamed from: t, reason: from kotlin metadata */
            private final TextResource errorMessage;

            /* JADX INFO: renamed from: u, reason: from kotlin metadata */
            private final int maxInputLength;

            /* JADX INFO: renamed from: v, reason: from kotlin metadata */
            private final int stepId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C34273f toolbarState, C34270c cancelState, boolean z4, String str, TextResource primaryButton, TextResource textResource, boolean z13, boolean z14, int i13, TextResource label, TextResource hint, String textInput, TextResource errorMessage, int i14, int i15) {
                super(toolbarState, cancelState, z4, primaryButton, textResource, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                AbstractC22676k.m65750j(label, "label");
                AbstractC22676k.m65750j(hint, "hint");
                AbstractC22676k.m65750j(textInput, "textInput");
                AbstractC22676k.m65750j(errorMessage, "errorMessage");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.content = str;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource;
                this.isAddNote = z13;
                this.isCancel = z14;
                this.rowCount = i13;
                this.label = label;
                this.hint = hint;
                this.textInput = textInput;
                this.errorMessage = errorMessage;
                this.maxInputLength = i14;
                this.stepId = i15;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof f)) {
                    return false;
                }
                f fVar = (f) other;
                return AbstractC22676k.m65745e(this.toolbarState, fVar.toolbarState) && AbstractC22676k.m65745e(this.cancelState, fVar.cancelState) && this.isPrimaryButtonEnabled == fVar.isPrimaryButtonEnabled && AbstractC22676k.m65745e(this.content, fVar.content) && AbstractC22676k.m65745e(this.primaryButton, fVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, fVar.secondaryButton) && this.isAddNote == fVar.isAddNote && this.isCancel == fVar.isCancel && this.rowCount == fVar.rowCount && AbstractC22676k.m65745e(this.label, fVar.label) && AbstractC22676k.m65745e(this.hint, fVar.hint) && AbstractC22676k.m65745e(this.textInput, fVar.textInput) && AbstractC22676k.m65745e(this.errorMessage, fVar.errorMessage) && this.maxInputLength == fVar.maxInputLength && this.stepId == fVar.stepId;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TextResource getErrorMessage() {
                return this.errorMessage;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final TextResource getHint() {
                return this.hint;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled);
                String str = this.content;
                int iM95625a = AbstractC31061c.m95625a((iM8289b + (str == null ? 0 : str.hashCode())) * 31, this.primaryButton, 31);
                TextResource textResource = this.secondaryButton;
                return Integer.hashCode(this.stepId) + AbstractC11266d.m30448b(this.maxInputLength, AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.rowCount, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isAddNote), 31, this.isCancel), 31), this.label, 31), this.hint, 31), 31, this.textInput), this.errorMessage, 31), 31);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TextResource getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final int getMaxInputLength() {
                return this.maxInputLength;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final TextResource getPrimaryButton() {
                return this.primaryButton;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final int getRowCount() {
                return this.rowCount;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final int getStepId() {
                return this.stepId;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getTextInput() {
                return this.textInput;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public boolean getIsPrimaryButtonEnabled() {
                return this.isPrimaryButtonEnabled;
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                String str = this.content;
                TextResource textResource = this.primaryButton;
                TextResource textResource2 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                int i13 = this.rowCount;
                TextResource textResource3 = this.label;
                TextResource textResource4 = this.hint;
                String str2 = this.textInput;
                TextResource textResource5 = this.errorMessage;
                int i14 = this.maxInputLength;
                int i15 = this.stepId;
                StringBuilder sb4 = new StringBuilder("CampaignTextInputStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC38963t7.m124391u(sb4, z4, ", content=", str, ", primaryButton=");
                AbstractC30007c.m91855y(sb4, textResource, ", secondaryButton=", textResource2, ", isAddNote=");
                AbstractC38963t7.m124392v(sb4, z13, ", isCancel=", z14, ", rowCount=");
                sb4.append(i13);
                sb4.append(", label=");
                sb4.append(textResource3);
                sb4.append(", hint=");
                AbstractC30007c.m91856z(sb4, textResource4, ", textInput=", str2, ", errorMessage=");
                sb4.append(textResource5);
                sb4.append(", maxInputLength=");
                sb4.append(i14);
                sb4.append(", stepId=");
                return AbstractC18489d0.m53371l(sb4, i15, ")");
            }
        }

        /* JADX INFO: renamed from: ty2.a$a$g */
        @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b#\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u00106R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b\u0010\u0010+R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b\u0011\u0010+¨\u0006;"}, m65681d2 = {"Lty2/a$a$g;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "content", "imageUrl", "imageAlt", "typeformUrl", "Lcom/whoop/design/util/TextResource;", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "<init>", "(Lty2/f;Lty2/c;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "()Z", "k", "Ljava/lang/String;", "f", "l", "m", "g", "n", "getTypeformUrl", "o", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "p", "getSecondaryButton", "q", "r", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final String imageAlt;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final String typeformUrl;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(C34273f toolbarState, C34270c cancelState, boolean z4, String str, String str2, String str3, String str4, TextResource primaryButton, TextResource textResource, boolean z13, boolean z14) {
                super(toolbarState, cancelState, z4, primaryButton, textResource, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.content = str;
                this.imageUrl = str2;
                this.imageAlt = str3;
                this.typeformUrl = str4;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource;
                this.isAddNote = z13;
                this.isCancel = z14;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof g)) {
                    return false;
                }
                g gVar = (g) other;
                return AbstractC22676k.m65745e(this.toolbarState, gVar.toolbarState) && AbstractC22676k.m65745e(this.cancelState, gVar.cancelState) && this.isPrimaryButtonEnabled == gVar.isPrimaryButtonEnabled && AbstractC22676k.m65745e(this.content, gVar.content) && AbstractC22676k.m65745e(this.imageUrl, gVar.imageUrl) && AbstractC22676k.m65745e(this.imageAlt, gVar.imageAlt) && AbstractC22676k.m65745e(this.typeformUrl, gVar.typeformUrl) && AbstractC22676k.m65745e(this.primaryButton, gVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, gVar.secondaryButton) && this.isAddNote == gVar.isAddNote && this.isCancel == gVar.isCancel;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getImageAlt() {
                return this.imageAlt;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled);
                String str = this.content;
                int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.imageUrl;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.imageAlt;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.typeformUrl;
                int iM95625a = AbstractC31061c.m95625a((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, this.primaryButton, 31);
                TextResource textResource = this.secondaryButton;
                return Boolean.hashCode(this.isCancel) + AbstractC2875y.m8289b((iM95625a + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isAddNote);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TextResource getPrimaryButton() {
                return this.primaryButton;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public boolean getIsPrimaryButtonEnabled() {
                return this.isPrimaryButtonEnabled;
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                String str = this.content;
                String str2 = this.imageUrl;
                String str3 = this.imageAlt;
                String str4 = this.typeformUrl;
                TextResource textResource = this.primaryButton;
                TextResource textResource2 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                StringBuilder sb4 = new StringBuilder("CampaignTextStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC38963t7.m124391u(sb4, z4, ", content=", str, ", imageUrl=");
                AbstractC11266d.m30444B(sb4, str2, ", imageAlt=", str3, ", typeformUrl=");
                AbstractC30007c.m91826A(sb4, str4, ", primaryButton=", textResource, ", secondaryButton=");
                AbstractC33745d.m106664w(textResource2, ", isAddNote=", ", isCancel=", sb4, z13);
                return AbstractC18489d0.m53372m(sb4, z14, ")");
            }
        }

        /* JADX INFO: renamed from: ty2.a$a$h */
        @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001c\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b\u000f\u0010*R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b\u0010\u0010*¨\u0006:"}, m65681d2 = {"Lty2/a$a$h;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "content", "Lorg/joda/time/LocalTime;", "currentTime", "Lcom/whoop/design/util/TextResource;", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "<init>", "(Lty2/f;Lty2/c;ZLjava/lang/String;Lorg/joda/time/LocalTime;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "()Z", "k", "Ljava/lang/String;", "f", "l", "Lorg/joda/time/LocalTime;", "getCurrentTime", "()Lorg/joda/time/LocalTime;", "m", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "n", "getSecondaryButton", "o", "p", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final LocalTime currentTime;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(C34273f toolbarState, C34270c cancelState, boolean z4, String str, LocalTime currentTime, TextResource primaryButton, TextResource textResource, boolean z13, boolean z14) {
                super(toolbarState, cancelState, z4, primaryButton, textResource, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(currentTime, "currentTime");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.content = str;
                this.currentTime = currentTime;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource;
                this.isAddNote = z13;
                this.isCancel = z14;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof h)) {
                    return false;
                }
                h hVar = (h) other;
                return AbstractC22676k.m65745e(this.toolbarState, hVar.toolbarState) && AbstractC22676k.m65745e(this.cancelState, hVar.cancelState) && this.isPrimaryButtonEnabled == hVar.isPrimaryButtonEnabled && AbstractC22676k.m65745e(this.content, hVar.content) && AbstractC22676k.m65745e(this.currentTime, hVar.currentTime) && AbstractC22676k.m65745e(this.primaryButton, hVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, hVar.secondaryButton) && this.isAddNote == hVar.isAddNote && this.isCancel == hVar.isCancel;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TextResource getPrimaryButton() {
                return this.primaryButton;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public boolean getIsPrimaryButtonEnabled() {
                return this.isPrimaryButtonEnabled;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled);
                String str = this.content;
                int iM95625a = AbstractC31061c.m95625a((this.currentTime.hashCode() + ((iM8289b + (str == null ? 0 : str.hashCode())) * 31)) * 31, this.primaryButton, 31);
                TextResource textResource = this.secondaryButton;
                return Boolean.hashCode(this.isCancel) + AbstractC2875y.m8289b((iM95625a + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isAddNote);
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                String str = this.content;
                LocalTime localTime = this.currentTime;
                TextResource textResource = this.primaryButton;
                TextResource textResource2 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                StringBuilder sb4 = new StringBuilder("CampaignTimePickerStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC38963t7.m124391u(sb4, z4, ", content=", str, ", currentTime=");
                sb4.append(localTime);
                sb4.append(", primaryButton=");
                sb4.append(textResource);
                sb4.append(", secondaryButton=");
                AbstractC33745d.m106664w(textResource2, ", isAddNote=", ", isCancel=", sb4, z13);
                return AbstractC18489d0.m53372m(sb4, z14, ")");
            }
        }

        public /* synthetic */ a(C34273f c34273f, C34270c c34270c, boolean z4, TextResource textResource, TextResource textResource2, boolean z13, boolean z14, DefaultConstructorMarker defaultConstructorMarker) {
            this(c34273f, c34270c, z4, textResource, textResource2, z13, z14);
        }

        /* JADX INFO: renamed from: a */
        public abstract C34270c getCancelState();

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: c */
        public abstract C34273f getToolbarState();

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsAddNoteShowing() {
            return this.isAddNoteShowing;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsCancellingShowing() {
            return this.isCancellingShowing;
        }

        private a(C34273f c34273f, C34270c c34270c, boolean z4, TextResource textResource, TextResource textResource2, boolean z13, boolean z14) {
            super(null);
            this.toolbarState = c34273f;
            this.cancelState = c34270c;
            this.isPrimaryButtonEnabled = z4;
            this.primaryButtonText = textResource;
            this.secondaryButtonText = textResource2;
            this.isAddNoteShowing = z13;
            this.isCancellingShowing = z14;
        }

        /* JADX INFO: renamed from: ty2.a$a$i */
        @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u0007\u00104R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b&\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010DR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bK\u0010B\u001a\u0004\bL\u0010DR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\b\u0015\u00104R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\b\u0016\u00104R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bO\u00103\u001a\u0004\b5\u00104R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b,\u0010V¨\u0006W"}, m65681d2 = {"Lty2/a$a$i;", "Lty2/a$a;", "Lty2/f;", "toolbarState", "Lty2/c;", "cancelState", "", "isPrimaryButtonEnabled", "", "stepId", "", "content", "imageUrl", "imageAlt", "typeformUrl", "retryAttempt", "Lcom/whoop/design/util/TextResource;", "typeformTitle", "typeformSubmitted", "primaryButton", "secondaryButton", "isAddNote", "isCancel", "isErrorLoading", "Lty2/e;", "retryState", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "surveyProvider", "<init>", "(Lty2/f;Lty2/c;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ljava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZZLty2/e;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lty2/f;", "c", "()Lty2/f;", "setToolbarState", "(Lty2/f;)V", "i", "Lty2/c;", "a", "()Lty2/c;", "setCancelState", "(Lty2/c;)V", "j", "Z", "()Z", "k", "I", "l", "Ljava/lang/String;", "getContent", "m", "getImageUrl", "n", "getImageAlt", "o", "p", "f", "q", "Lcom/whoop/design/util/TextResource;", "getTypeformTitle", "()Lcom/whoop/design/util/TextResource;", "r", "Ljava/lang/Boolean;", "getTypeformSubmitted", "()Ljava/lang/Boolean;", "s", "getPrimaryButton", "t", "getSecondaryButton", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "Lty2/e;", "g", "()Lty2/e;", "y", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "()Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class i extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private C34273f toolbarState;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private C34270c cancelState;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final boolean isPrimaryButtonEnabled;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final int stepId;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final String imageUrl;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final String imageAlt;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final String typeformUrl;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final int retryAttempt;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final TextResource typeformTitle;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private final Boolean typeformSubmitted;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            private final TextResource primaryButton;

            /* JADX INFO: renamed from: t, reason: from kotlin metadata */
            private final TextResource secondaryButton;

            /* JADX INFO: renamed from: u, reason: from kotlin metadata */
            private final boolean isAddNote;

            /* JADX INFO: renamed from: v, reason: from kotlin metadata */
            private final boolean isCancel;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata */
            private final boolean isErrorLoading;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            private final C34272e retryState;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata */
            private final SurveyProvider surveyProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(C34273f toolbarState, C34270c cancelState, boolean z4, int i13, String str, String str2, String str3, String typeformUrl, int i14, TextResource typeformTitle, Boolean bool, TextResource primaryButton, TextResource textResource, boolean z13, boolean z14, boolean z15, C34272e retryState, SurveyProvider surveyProvider) {
                super(toolbarState, cancelState, z4, primaryButton, textResource, z13, z14, null);
                AbstractC22676k.m65750j(toolbarState, "toolbarState");
                AbstractC22676k.m65750j(cancelState, "cancelState");
                AbstractC22676k.m65750j(typeformUrl, "typeformUrl");
                AbstractC22676k.m65750j(typeformTitle, "typeformTitle");
                AbstractC22676k.m65750j(primaryButton, "primaryButton");
                AbstractC22676k.m65750j(retryState, "retryState");
                AbstractC22676k.m65750j(surveyProvider, "surveyProvider");
                this.toolbarState = toolbarState;
                this.cancelState = cancelState;
                this.isPrimaryButtonEnabled = z4;
                this.stepId = i13;
                this.content = str;
                this.imageUrl = str2;
                this.imageAlt = str3;
                this.typeformUrl = typeformUrl;
                this.retryAttempt = i14;
                this.typeformTitle = typeformTitle;
                this.typeformSubmitted = bool;
                this.primaryButton = primaryButton;
                this.secondaryButton = textResource;
                this.isAddNote = z13;
                this.isCancel = z14;
                this.isErrorLoading = z15;
                this.retryState = retryState;
                this.surveyProvider = surveyProvider;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public C34270c getCancelState() {
                return this.cancelState;
            }

            @Override // ty2.AbstractC34268a.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C34273f getToolbarState() {
                return this.toolbarState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof i)) {
                    return false;
                }
                i iVar = (i) other;
                return AbstractC22676k.m65745e(this.toolbarState, iVar.toolbarState) && AbstractC22676k.m65745e(this.cancelState, iVar.cancelState) && this.isPrimaryButtonEnabled == iVar.isPrimaryButtonEnabled && this.stepId == iVar.stepId && AbstractC22676k.m65745e(this.content, iVar.content) && AbstractC22676k.m65745e(this.imageUrl, iVar.imageUrl) && AbstractC22676k.m65745e(this.imageAlt, iVar.imageAlt) && AbstractC22676k.m65745e(this.typeformUrl, iVar.typeformUrl) && this.retryAttempt == iVar.retryAttempt && AbstractC22676k.m65745e(this.typeformTitle, iVar.typeformTitle) && AbstractC22676k.m65745e(this.typeformSubmitted, iVar.typeformSubmitted) && AbstractC22676k.m65745e(this.primaryButton, iVar.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, iVar.secondaryButton) && this.isAddNote == iVar.isAddNote && this.isCancel == iVar.isCancel && this.isErrorLoading == iVar.isErrorLoading && AbstractC22676k.m65745e(this.retryState, iVar.retryState) && this.surveyProvider == iVar.surveyProvider;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final int getRetryAttempt() {
                return this.retryAttempt;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final C34272e getRetryState() {
                return this.retryState;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final int getStepId() {
                return this.stepId;
            }

            public int hashCode() {
                int iM30448b = AbstractC11266d.m30448b(this.stepId, AbstractC2875y.m8289b((this.cancelState.hashCode() + (this.toolbarState.hashCode() * 31)) * 31, 31, this.isPrimaryButtonEnabled), 31);
                String str = this.content;
                int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.imageUrl;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.imageAlt;
                int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.retryAttempt, AbstractC11266d.m30450d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.typeformUrl), 31), this.typeformTitle, 31);
                Boolean bool = this.typeformSubmitted;
                int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (bool == null ? 0 : bool.hashCode())) * 31, this.primaryButton, 31);
                TextResource textResource = this.secondaryButton;
                return this.surveyProvider.hashCode() + ((this.retryState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a2 + (textResource != null ? textResource.hashCode() : 0)) * 31, 31, this.isAddNote), 31, this.isCancel), 31, this.isErrorLoading)) * 31);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final SurveyProvider getSurveyProvider() {
                return this.surveyProvider;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getTypeformUrl() {
                return this.typeformUrl;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getIsErrorLoading() {
                return this.isErrorLoading;
            }

            public String toString() {
                C34273f c34273f = this.toolbarState;
                C34270c c34270c = this.cancelState;
                boolean z4 = this.isPrimaryButtonEnabled;
                int i13 = this.stepId;
                String str = this.content;
                String str2 = this.imageUrl;
                String str3 = this.imageAlt;
                String str4 = this.typeformUrl;
                int i14 = this.retryAttempt;
                TextResource textResource = this.typeformTitle;
                Boolean bool = this.typeformSubmitted;
                TextResource textResource2 = this.primaryButton;
                TextResource textResource3 = this.secondaryButton;
                boolean z13 = this.isAddNote;
                boolean z14 = this.isCancel;
                boolean z15 = this.isErrorLoading;
                C34272e c34272e = this.retryState;
                SurveyProvider surveyProvider = this.surveyProvider;
                StringBuilder sb4 = new StringBuilder("CampaignWebViewStepViewState(toolbarState=");
                sb4.append(c34273f);
                sb4.append(", cancelState=");
                sb4.append(c34270c);
                sb4.append(", isPrimaryButtonEnabled=");
                AbstractC30802r.m94769r(i13, ", stepId=", ", content=", sb4, z4);
                AbstractC11266d.m30444B(sb4, str, ", imageUrl=", str2, ", imageAlt=");
                AbstractC11266d.m30444B(sb4, str3, ", typeformUrl=", str4, ", retryAttempt=");
                sb4.append(i14);
                sb4.append(", typeformTitle=");
                sb4.append(textResource);
                sb4.append(", typeformSubmitted=");
                sb4.append(bool);
                sb4.append(", primaryButton=");
                sb4.append(textResource2);
                sb4.append(", secondaryButton=");
                AbstractC33745d.m106664w(textResource3, ", isAddNote=", ", isCancel=", sb4, z13);
                AbstractC38963t7.m124392v(sb4, z14, ", isErrorLoading=", z15, ", retryState=");
                sb4.append(c34272e);
                sb4.append(", surveyProvider=");
                sb4.append(surveyProvider);
                sb4.append(")");
                return sb4.toString();
            }

            public /* synthetic */ i(C34273f c34273f, C34270c c34270c, boolean z4, int i13, String str, String str2, String str3, String str4, int i14, TextResource textResource, Boolean bool, TextResource textResource2, TextResource textResource3, boolean z13, boolean z14, boolean z15, C34272e c34272e, SurveyProvider surveyProvider, int i15, DefaultConstructorMarker defaultConstructorMarker) {
                this(c34273f, c34270c, (i15 & 4) != 0 ? true : z4, i13, str, str2, str3, str4, (i15 & 256) != 0 ? 0 : i14, textResource, bool, textResource2, textResource3, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z13, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z14, (i15 & 32768) != 0 ? false : z15, c34272e, surveyProvider);
            }
        }
    }

    /* JADX INFO: renamed from: ty2.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lty2/a$b;", "Lty2/a;", "", "campaignId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC34268a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        public b(int i13) {
            super(null);
            this.campaignId = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.campaignId == ((b) other).campaignId;
        }

        public int hashCode() {
            return Integer.hashCode(this.campaignId);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.campaignId, "Discarded(campaignId=", ")");
        }
    }

    /* JADX INFO: renamed from: ty2.a$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, m65681d2 = {"Lty2/a$c;", "Lty2/a;", "", "campaignId", "sessionId", "Lcom/whoop/design/util/TextResource;", "title", "body", "primaryCta", "secondaryCta", "<init>", "(ILjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "d", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC34268a {

        /* JADX INFO: renamed from: g */
        public static final int f143907g = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource body;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource primaryCta;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource secondaryCta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, Integer num, TextResource title, TextResource body, TextResource primaryCta, TextResource secondaryCta) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(primaryCta, "primaryCta");
            AbstractC22676k.m65750j(secondaryCta, "secondaryCta");
            this.campaignId = i13;
            this.sessionId = num;
            this.title = title;
            this.body = body;
            this.primaryCta = primaryCta;
            this.secondaryCta = secondaryCta;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPrimaryCta() {
            return this.primaryCta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getSecondaryCta() {
            return this.secondaryCta;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.campaignId == cVar.campaignId && AbstractC22676k.m65745e(this.sessionId, cVar.sessionId) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.body, cVar.body) && AbstractC22676k.m65745e(this.primaryCta, cVar.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, cVar.secondaryCta);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            return this.secondaryCta.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, this.title, 31), this.body, 31), this.primaryCta, 31);
        }

        public String toString() {
            int i13 = this.campaignId;
            Integer num = this.sessionId;
            TextResource textResource = this.title;
            TextResource textResource2 = this.body;
            TextResource textResource3 = this.primaryCta;
            TextResource textResource4 = this.secondaryCta;
            StringBuilder sb4 = new StringBuilder("Error(campaignId=");
            sb4.append(i13);
            sb4.append(", sessionId=");
            sb4.append(num);
            sb4.append(", title=");
            AbstractC30007c.m91855y(sb4, textResource, ", body=", textResource2, ", primaryCta=");
            return AbstractC33745d.m106655n(sb4, textResource3, ", secondaryCta=", textResource4, ")");
        }
    }

    /* JADX INFO: renamed from: ty2.a$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006!"}, m65681d2 = {"Lty2/a$d;", "Lty2/a;", "", "campaignId", "", "deviceAddress", "Lcom/whoop/design/util/TextResource;", "title", "body", "primaryCta", "secondaryCta", "<init>", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCampaignId", "b", "Ljava/lang/String;", "c", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "f", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC34268a {

        /* JADX INFO: renamed from: g */
        public static final int f143914g = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String deviceAddress;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource body;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource primaryCta;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource secondaryCta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, String deviceAddress, TextResource title, TextResource body, TextResource primaryCta, TextResource secondaryCta) {
            super(null);
            AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(primaryCta, "primaryCta");
            AbstractC22676k.m65750j(secondaryCta, "secondaryCta");
            this.campaignId = i13;
            this.deviceAddress = deviceAddress;
            this.title = title;
            this.body = body;
            this.primaryCta = primaryCta;
            this.secondaryCta = secondaryCta;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeviceAddress() {
            return this.deviceAddress;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPrimaryCta() {
            return this.primaryCta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getSecondaryCta() {
            return this.secondaryCta;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.campaignId == dVar.campaignId && AbstractC22676k.m65745e(this.deviceAddress, dVar.deviceAddress) && AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.body, dVar.body) && AbstractC22676k.m65745e(this.primaryCta, dVar.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, dVar.secondaryCta);
        }

        public int hashCode() {
            return this.secondaryCta.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d(Integer.hashCode(this.campaignId) * 31, 31, this.deviceAddress), this.title, 31), this.body, 31), this.primaryCta, 31);
        }

        public String toString() {
            int i13 = this.campaignId;
            String str = this.deviceAddress;
            TextResource textResource = this.title;
            TextResource textResource2 = this.body;
            TextResource textResource3 = this.primaryCta;
            TextResource textResource4 = this.secondaryCta;
            StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ErrorConnectingDevice(campaignId=", ", deviceAddress=", str, ", title=");
            AbstractC30007c.m91855y(sbM53373n, textResource, ", body=", textResource2, ", primaryCta=");
            return AbstractC33745d.m106655n(sbM53373n, textResource3, ", secondaryCta=", textResource4, ")");
        }
    }

    /* JADX INFO: renamed from: ty2.a$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lty2/a$e;", "Lty2/a;", "Lcom/whoop/design/util/TextResource;", "title", "body", "positiveCta", "negativeCta", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC34268a {

        /* JADX INFO: renamed from: e */
        public static final int f143921e = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource body;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource positiveCta;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource negativeCta;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextResource title, TextResource body, TextResource positiveCta, TextResource negativeCta) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(body, "body");
            AbstractC22676k.m65750j(positiveCta, "positiveCta");
            AbstractC22676k.m65750j(negativeCta, "negativeCta");
            this.title = title;
            this.body = body;
            this.positiveCta = positiveCta;
            this.negativeCta = negativeCta;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getNegativeCta() {
            return this.negativeCta;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getPositiveCta() {
            return this.positiveCta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.title, eVar.title) && AbstractC22676k.m65745e(this.body, eVar.body) && AbstractC22676k.m65745e(this.positiveCta, eVar.positiveCta) && AbstractC22676k.m65745e(this.negativeCta, eVar.negativeCta);
        }

        public int hashCode() {
            return this.negativeCta.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.body, 31), this.positiveCta, 31);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.body;
            return AbstractC33745d.m106655n(AbstractC33745d.m106658q("ErrorSubmitting(title=", textResource, ", body=", textResource2, ", positiveCta="), this.positiveCta, ", negativeCta=", this.negativeCta, ")");
        }
    }

    /* JADX INFO: renamed from: ty2.a$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lty2/a$f;", "Lty2/a;", "Lcom/whoop/design/util/TextResource;", "title", "description", "primaryActionText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC34268a {

        /* JADX INFO: renamed from: d */
        public static final int f143926d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryActionText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextResource title, TextResource description, TextResource primaryActionText) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(primaryActionText, "primaryActionText");
            this.title = title;
            this.description = description;
            this.primaryActionText = primaryActionText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getPrimaryActionText() {
            return this.primaryActionText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.title, fVar.title) && AbstractC22676k.m65745e(this.description, fVar.description) && AbstractC22676k.m65745e(this.primaryActionText, fVar.primaryActionText);
        }

        public int hashCode() {
            return this.primaryActionText.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.description;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("FWUpdateInProgress(title=", textResource, ", description=", textResource2, ", primaryActionText="), this.primaryActionText, ")");
        }
    }

    /* JADX INFO: renamed from: ty2.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lty2/a$g;", "Lty2/a;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC34268a {

        /* JADX INFO: renamed from: a */
        public static final g f143930a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ty2.a$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lty2/a$h;", "Lty2/a;", "Lcom/whoop/design/util/TextResource;", "text", "subtitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC34268a {

        /* JADX INFO: renamed from: c */
        public static final int f143931c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(TextResource text, TextResource subtitle) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.text = text;
            this.subtitle = subtitle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.text, hVar.text) && AbstractC22676k.m65745e(this.subtitle, hVar.subtitle);
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79501e("Submitted(text=", this.text, ", subtitle=", this.subtitle, ")");
        }
    }

    /* JADX INFO: renamed from: ty2.a$i */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u0018\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, m65681d2 = {"Lty2/a$i;", "Lty2/a;", "", "campaignId", "icon", "Lcom/whoop/design/util/TextResource;", "text", "cta", "Lkd1/o;", "backgroundImage", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(IILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCampaignId", "b", "c", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "Lkd1/o;", "()Lkd1/o;", "f", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC34268a {

        /* JADX INFO: renamed from: g */
        public static final int f143934g;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource cta;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final AbstractC22403o backgroundImage;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C9598e navigationAction;

        static {
            int i13 = C9598e.f28134d | AbstractC22403o.f87638a;
            int i14 = TextResource.$stable;
            f143934g = i13 | i14 | i14;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i13, int i14, TextResource text, TextResource cta, AbstractC22403o backgroundImage, C9598e navigationAction) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(cta, "cta");
            AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
            AbstractC22676k.m65750j(navigationAction, "navigationAction");
            this.campaignId = i13;
            this.icon = i14;
            this.text = text;
            this.cta = cta;
            this.backgroundImage = backgroundImage;
            this.navigationAction = navigationAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC22403o getBackgroundImage() {
            return this.backgroundImage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return this.campaignId == iVar.campaignId && this.icon == iVar.icon && AbstractC22676k.m65745e(this.text, iVar.text) && AbstractC22676k.m65745e(this.cta, iVar.cta) && AbstractC22676k.m65745e(this.backgroundImage, iVar.backgroundImage) && AbstractC22676k.m65745e(this.navigationAction, iVar.navigationAction);
        }

        public int hashCode() {
            return this.navigationAction.hashCode() + AbstractC30007c.m91833c(this.backgroundImage, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.icon, Integer.hashCode(this.campaignId) * 31, 31), this.text, 31), this.cta, 31), 31);
        }

        public String toString() {
            int i13 = this.campaignId;
            int i14 = this.icon;
            TextResource textResource = this.text;
            TextResource textResource2 = this.cta;
            AbstractC22403o abstractC22403o = this.backgroundImage;
            C9598e c9598e = this.navigationAction;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "SubmittedSuccessfully(campaignId=", ", icon=", ", text=");
            AbstractC30007c.m91855y(sbM30465s, textResource, ", cta=", textResource2, ", backgroundImage=");
            sbM30465s.append(abstractC22403o);
            sbM30465s.append(", navigationAction=");
            sbM30465s.append(c9598e);
            sbM30465s.append(")");
            return sbM30465s.toString();
        }
    }

    /* JADX INFO: renamed from: ty2.a$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lty2/a$j;", "Lty2/a;", "Lcom/whoop/design/util/TextResource;", "text", "<init>", "(Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC34268a {

        /* JADX INFO: renamed from: b */
        public static final int f143941b = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextResource text) {
            super(null);
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.text, ((j) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC36095b.m114678f("Submitting(text=", this.text, ")");
        }
    }

    public /* synthetic */ AbstractC34268a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34268a() {
    }
}
