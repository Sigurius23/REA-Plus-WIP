package is0;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: is0.s0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b,\u00104\u001a\u0004\b2\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b*\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b \u00109R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b$\u00100R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\t8\u0006¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b&\u00100¨\u0006>"}, m65681d2 = {"Lis0/s0;", "", "", "isLoading", "isError", "Lcom/whoop/design/util/TextResource;", "placeholder", "Lcom/whoop/navigation/models/GenericInteraction;", "submitAction", "", "Lis0/c;", "quickReactions", "Lm91/o;", "commentItems", "summaryLabel", "Lkotlin/time/Duration;", "rotationInterval", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lis0/f;", "actionProgress", "<init>", "(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lkotlin/time/Duration;Lcom/whoop/design/models/modal/AnyModal;Lis0/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "k", "()Z", "b", "j", "c", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "d", "Lcom/whoop/navigation/models/GenericInteraction;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/navigation/models/GenericInteraction;", "Ljava/util/List;", "f", "()Ljava/util/List;", "getCommentItems", "g", "i", "Lkotlin/time/Duration;", "()Lkotlin/time/Duration;", "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "Lis0/f;", "()Lis0/f;", "Lis0/e;", "comments", "l", "confirmedComments", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20907s0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource placeholder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction submitAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C20874c> quickReactions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C25306o> commentItems;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource summaryLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Duration rotationInterval;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC20880f actionProgress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<C20878e> comments;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<C20878e> confirmedComments;

    public /* synthetic */ C20907s0(boolean z4, boolean z13, TextResource textResource, GenericInteraction genericInteraction, List list, List list2, TextResource textResource2, Duration duration, AnyModal anyModal, InterfaceC20880f interfaceC20880f, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, z13, textResource, genericInteraction, list, list2, textResource2, duration, anyModal, interfaceC20880f);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC20880f getActionProgress() {
        return this.actionProgress;
    }

    /* JADX INFO: renamed from: b */
    public final List<C20878e> m57905b() {
        return this.comments;
    }

    /* JADX INFO: renamed from: c */
    public final List<C20878e> m57906c() {
        return this.confirmedComments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getPlaceholder() {
        return this.placeholder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20907s0)) {
            return false;
        }
        C20907s0 c20907s0 = (C20907s0) other;
        return this.isLoading == c20907s0.isLoading && this.isError == c20907s0.isError && AbstractC22676k.m65745e(this.placeholder, c20907s0.placeholder) && AbstractC22676k.m65745e(this.submitAction, c20907s0.submitAction) && AbstractC22676k.m65745e(this.quickReactions, c20907s0.quickReactions) && AbstractC22676k.m65745e(this.commentItems, c20907s0.commentItems) && AbstractC22676k.m65745e(this.summaryLabel, c20907s0.summaryLabel) && AbstractC22676k.m65745e(this.rotationInterval, c20907s0.rotationInterval) && AbstractC22676k.m65745e(this.modal, c20907s0.modal) && AbstractC22676k.m65745e(this.actionProgress, c20907s0.actionProgress);
    }

    /* JADX INFO: renamed from: f */
    public final List<C20874c> m57909f() {
        return this.quickReactions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Duration getRotationInterval() {
        return this.rotationInterval;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GenericInteraction getSubmitAction() {
        return this.submitAction;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), this.placeholder, 31);
        GenericInteraction genericInteraction = this.submitAction;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM95625a + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31, 31, this.quickReactions), 31, this.commentItems);
        TextResource textResource = this.summaryLabel;
        int iHashCode = (iM31983b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        Duration duration = this.rotationInterval;
        int iM134283hashCodeimpl = (iHashCode + (duration == null ? 0 : Duration.m134283hashCodeimpl(duration.getRawValue()))) * 31;
        AnyModal anyModal = this.modal;
        int iHashCode2 = (iM134283hashCodeimpl + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        InterfaceC20880f interfaceC20880f = this.actionProgress;
        return iHashCode2 + (interfaceC20880f != null ? interfaceC20880f.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getSummaryLabel() {
        return this.summaryLabel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        TextResource textResource = this.placeholder;
        GenericInteraction genericInteraction = this.submitAction;
        List<C20874c> list = this.quickReactions;
        List<C25306o> list2 = this.commentItems;
        TextResource textResource2 = this.summaryLabel;
        Duration duration = this.rotationInterval;
        AnyModal anyModal = this.modal;
        InterfaceC20880f interfaceC20880f = this.actionProgress;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ReactionsViewState(isLoading=", ", isError=", ", placeholder=", z4, z13);
        sbM32002u.append(textResource);
        sbM32002u.append(", submitAction=");
        sbM32002u.append(genericInteraction);
        sbM32002u.append(", quickReactions=");
        AbstractC21702c.m61148s(sbM32002u, list, ", commentItems=", list2, ", summaryLabel=");
        sbM32002u.append(textResource2);
        sbM32002u.append(", rotationInterval=");
        sbM32002u.append(duration);
        sbM32002u.append(", modal=");
        sbM32002u.append(anyModal);
        sbM32002u.append(", actionProgress=");
        sbM32002u.append(interfaceC20880f);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    private C20907s0(boolean z4, boolean z13, TextResource placeholder, GenericInteraction genericInteraction, List<C20874c> quickReactions, List<C25306o> commentItems, TextResource textResource, Duration duration, AnyModal anyModal, InterfaceC20880f interfaceC20880f) {
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(quickReactions, "quickReactions");
        AbstractC22676k.m65750j(commentItems, "commentItems");
        this.isLoading = z4;
        this.isError = z13;
        this.placeholder = placeholder;
        this.submitAction = genericInteraction;
        this.quickReactions = quickReactions;
        this.commentItems = commentItems;
        this.summaryLabel = textResource;
        this.rotationInterval = duration;
        this.modal = anyModal;
        this.actionProgress = interfaceC20880f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = commentItems.iterator();
        while (it.hasNext()) {
            InterfaceC25312u state = ((C25306o) it.next()).getState();
            C20878e c20878e = state instanceof C20878e ? (C20878e) state : null;
            if (c20878e != null) {
                arrayList.add(c20878e);
            }
        }
        this.comments = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((C20878e) obj).getIsPending()) {
                arrayList2.add(obj);
            }
        }
        this.confirmedComments = arrayList2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20907s0(boolean z4, boolean z13, TextResource textResource, GenericInteraction genericInteraction, List list, List list2, TextResource textResource2, Duration duration, AnyModal anyModal, InterfaceC20880f interfaceC20880f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z14 = (i13 & 1) != 0 ? true : z4;
        boolean z15 = (i13 & 2) != 0 ? false : z13;
        TextResource textResourceM21267a = (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource;
        GenericInteraction genericInteraction2 = (i13 & 8) != 0 ? null : genericInteraction;
        int i14 = i13 & 16;
        List list3 = C25271y.f99162w;
        this(z14, z15, textResourceM21267a, genericInteraction2, i14 != 0 ? list3 : list, (i13 & 32) == 0 ? list2 : list3, (i13 & 64) != 0 ? null : textResource2, (i13 & 128) != 0 ? null : duration, (i13 & 256) != 0 ? null : anyModal, (i13 & 512) == 0 ? interfaceC20880f : null, null);
    }
}
