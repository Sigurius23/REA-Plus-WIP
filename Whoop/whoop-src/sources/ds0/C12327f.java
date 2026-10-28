package ds0;

import com.whoop.communityreactions.domain.model.ReactionsInputModel;
import com.whoop.communityreactions.domain.model.ReactionsResponse;
import com.whoop.design.models.modal.AnyModal;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m83.C25235a0;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ds0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014Jt\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b%\u00103R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u00170\t8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b7\u0010.¨\u00069"}, m65681d2 = {"Lds0/f;", "", "", "isLoading", "isError", "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "data", "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "latestInput", "", "Lds0/b;", "inFlightSends", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lds0/a;", "actionProgress", "", "Lds0/c;", "pendingComments", "<init>", "(ZZLcom/whoop/communityreactions/domain/model/ReactionsResponse;Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/Set;Lcom/whoop/design/models/modal/AnyModal;Lds0/a;Ljava/util/List;)V", "a", "(ZZLcom/whoop/communityreactions/domain/model/ReactionsResponse;Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/Set;Lcom/whoop/design/models/modal/AnyModal;Lds0/a;Ljava/util/List;)Lds0/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "k", "()Z", "b", "j", "c", "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "d", "()Lcom/whoop/communityreactions/domain/model/ReactionsResponse;", "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "f", "()Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "Lcom/whoop/design/models/modal/AnyModal;", "g", "()Lcom/whoop/design/models/modal/AnyModal;", "Lds0/a;", "()Lds0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "i", "sendingEmojis", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12327f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ReactionsResponse data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ReactionsInputModel latestInput;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<InterfaceC12323b> inFlightSends;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC12322a actionProgress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C12324c> pendingComments;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Set<String> sendingEmojis;

    /* JADX WARN: Multi-variable type inference failed */
    public C12327f(boolean z4, boolean z13, ReactionsResponse reactionsResponse, ReactionsInputModel reactionsInputModel, Set<? extends InterfaceC12323b> inFlightSends, AnyModal anyModal, InterfaceC12322a interfaceC12322a, List<C12324c> pendingComments) {
        AbstractC22676k.m65750j(inFlightSends, "inFlightSends");
        AbstractC22676k.m65750j(pendingComments, "pendingComments");
        this.isLoading = z4;
        this.isError = z13;
        this.data = reactionsResponse;
        this.latestInput = reactionsInputModel;
        this.inFlightSends = inFlightSends;
        this.modal = anyModal;
        this.actionProgress = interfaceC12322a;
        this.pendingComments = pendingComments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : inFlightSends) {
            if (obj instanceof InterfaceC12323b.c) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC12323b.c) it.next()).getEmoji());
        }
        this.sendingEmojis = linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12327f m34373b(C12327f c12327f, boolean z4, boolean z13, ReactionsResponse reactionsResponse, ReactionsInputModel reactionsInputModel, Set set, AnyModal anyModal, InterfaceC12322a interfaceC12322a, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c12327f.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c12327f.isError;
        }
        if ((i13 & 4) != 0) {
            reactionsResponse = c12327f.data;
        }
        if ((i13 & 8) != 0) {
            reactionsInputModel = c12327f.latestInput;
        }
        if ((i13 & 16) != 0) {
            set = c12327f.inFlightSends;
        }
        if ((i13 & 32) != 0) {
            anyModal = c12327f.modal;
        }
        if ((i13 & 64) != 0) {
            interfaceC12322a = c12327f.actionProgress;
        }
        if ((i13 & 128) != 0) {
            list = c12327f.pendingComments;
        }
        InterfaceC12322a interfaceC12322a2 = interfaceC12322a;
        List list2 = list;
        Set set2 = set;
        AnyModal anyModal2 = anyModal;
        return c12327f.m34374a(z4, z13, reactionsResponse, reactionsInputModel, set2, anyModal2, interfaceC12322a2, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C12327f m34374a(boolean isLoading, boolean isError, ReactionsResponse data, ReactionsInputModel latestInput, Set<? extends InterfaceC12323b> inFlightSends, AnyModal modal, InterfaceC12322a actionProgress, List<C12324c> pendingComments) {
        AbstractC22676k.m65750j(inFlightSends, "inFlightSends");
        AbstractC22676k.m65750j(pendingComments, "pendingComments");
        return new C12327f(isLoading, isError, data, latestInput, inFlightSends, modal, actionProgress, pendingComments);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC12322a getActionProgress() {
        return this.actionProgress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ReactionsResponse getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: e */
    public final Set<InterfaceC12323b> m34377e() {
        return this.inFlightSends;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12327f)) {
            return false;
        }
        C12327f c12327f = (C12327f) other;
        return this.isLoading == c12327f.isLoading && this.isError == c12327f.isError && AbstractC22676k.m65745e(this.data, c12327f.data) && AbstractC22676k.m65745e(this.latestInput, c12327f.latestInput) && AbstractC22676k.m65745e(this.inFlightSends, c12327f.inFlightSends) && AbstractC22676k.m65745e(this.modal, c12327f.modal) && AbstractC22676k.m65745e(this.actionProgress, c12327f.actionProgress) && AbstractC22676k.m65745e(this.pendingComments, c12327f.pendingComments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ReactionsInputModel getLatestInput() {
        return this.latestInput;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: h */
    public final List<C12324c> m34380h() {
        return this.pendingComments;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        ReactionsResponse reactionsResponse = this.data;
        int iHashCode = (iM8289b + (reactionsResponse == null ? 0 : reactionsResponse.hashCode())) * 31;
        ReactionsInputModel reactionsInputModel = this.latestInput;
        int iM73368a = AbstractC25012a.m73368a(this.inFlightSends, (iHashCode + (reactionsInputModel == null ? 0 : reactionsInputModel.hashCode())) * 31, 31);
        AnyModal anyModal = this.modal;
        int iHashCode2 = (iM73368a + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        InterfaceC12322a interfaceC12322a = this.actionProgress;
        return this.pendingComments.hashCode() + ((iHashCode2 + (interfaceC12322a != null ? interfaceC12322a.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final Set<String> m34381i() {
        return this.sendingEmojis;
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
        ReactionsResponse reactionsResponse = this.data;
        ReactionsInputModel reactionsInputModel = this.latestInput;
        Set<InterfaceC12323b> set = this.inFlightSends;
        AnyModal anyModal = this.modal;
        InterfaceC12322a interfaceC12322a = this.actionProgress;
        List<C12324c> list = this.pendingComments;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ReactionsDomainState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(reactionsResponse);
        sbM32002u.append(", latestInput=");
        sbM32002u.append(reactionsInputModel);
        sbM32002u.append(", inFlightSends=");
        sbM32002u.append(set);
        sbM32002u.append(", modal=");
        sbM32002u.append(anyModal);
        sbM32002u.append(", actionProgress=");
        sbM32002u.append(interfaceC12322a);
        sbM32002u.append(", pendingComments=");
        sbM32002u.append(list);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C12327f(boolean z4, boolean z13, ReactionsResponse reactionsResponse, ReactionsInputModel reactionsInputModel, Set set, AnyModal anyModal, InterfaceC12322a interfaceC12322a, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : reactionsResponse, (i13 & 8) != 0 ? null : reactionsInputModel, (i13 & 16) != 0 ? C25235a0.f99113w : set, (i13 & 32) != 0 ? null : anyModal, (i13 & 64) != 0 ? null : interfaceC12322a, (i13 & 128) != 0 ? C25271y.f99162w : list);
    }
}
