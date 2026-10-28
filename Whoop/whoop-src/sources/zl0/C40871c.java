package zl0;

import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zl0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u0010¨\u0006\""}, m65681d2 = {"Lzl0/c;", "", "", "", "selectedIds", "allSelectionIds", "Lzl0/a;", "buttonState", "", "followupMessage", "commitPath", "<init>", "(Ljava/util/List;Ljava/util/List;Lzl0/a;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/util/List;Ljava/util/List;Lzl0/a;Ljava/lang/String;Ljava/lang/String;)Lzl0/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "c", "Lzl0/a;", "d", "()Lzl0/a;", "Ljava/lang/String;", "f", "e", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40871c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Integer> selectedIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<Integer> allSelectionIds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC40869a buttonState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String followupMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String commitPath;

    public C40871c(List<Integer> selectedIds, List<Integer> allSelectionIds, InterfaceC40869a buttonState, String str, String commitPath) {
        AbstractC22676k.m65750j(selectedIds, "selectedIds");
        AbstractC22676k.m65750j(allSelectionIds, "allSelectionIds");
        AbstractC22676k.m65750j(buttonState, "buttonState");
        AbstractC22676k.m65750j(commitPath, "commitPath");
        this.selectedIds = selectedIds;
        this.allSelectionIds = allSelectionIds;
        this.buttonState = buttonState;
        this.followupMessage = str;
        this.commitPath = commitPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C40871c m132460b(C40871c c40871c, List list, List list2, InterfaceC40869a interfaceC40869a, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c40871c.selectedIds;
        }
        if ((i13 & 2) != 0) {
            list2 = c40871c.allSelectionIds;
        }
        if ((i13 & 4) != 0) {
            interfaceC40869a = c40871c.buttonState;
        }
        if ((i13 & 8) != 0) {
            str = c40871c.followupMessage;
        }
        if ((i13 & 16) != 0) {
            str2 = c40871c.commitPath;
        }
        String str3 = str2;
        InterfaceC40869a interfaceC40869a2 = interfaceC40869a;
        return c40871c.m132461a(list, list2, interfaceC40869a2, str, str3);
    }

    /* JADX INFO: renamed from: a */
    public final C40871c m132461a(List<Integer> selectedIds, List<Integer> allSelectionIds, InterfaceC40869a buttonState, String followupMessage, String commitPath) {
        AbstractC22676k.m65750j(selectedIds, "selectedIds");
        AbstractC22676k.m65750j(allSelectionIds, "allSelectionIds");
        AbstractC22676k.m65750j(buttonState, "buttonState");
        AbstractC22676k.m65750j(commitPath, "commitPath");
        return new C40871c(selectedIds, allSelectionIds, buttonState, followupMessage, commitPath);
    }

    /* JADX INFO: renamed from: c */
    public final List<Integer> m132462c() {
        return this.allSelectionIds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC40869a getButtonState() {
        return this.buttonState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCommitPath() {
        return this.commitPath;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40871c)) {
            return false;
        }
        C40871c c40871c = (C40871c) other;
        return AbstractC22676k.m65745e(this.selectedIds, c40871c.selectedIds) && AbstractC22676k.m65745e(this.allSelectionIds, c40871c.allSelectionIds) && AbstractC22676k.m65745e(this.buttonState, c40871c.buttonState) && AbstractC22676k.m65745e(this.followupMessage, c40871c.followupMessage) && AbstractC22676k.m65745e(this.commitPath, c40871c.commitPath);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFollowupMessage() {
        return this.followupMessage;
    }

    /* JADX INFO: renamed from: g */
    public final List<Integer> m132466g() {
        return this.selectedIds;
    }

    public int hashCode() {
        int iHashCode = (this.buttonState.hashCode() + AbstractC11895b.m31983b(this.selectedIds.hashCode() * 31, 31, this.allSelectionIds)) * 31;
        String str = this.followupMessage;
        return this.commitPath.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        List<Integer> list = this.selectedIds;
        List<Integer> list2 = this.allSelectionIds;
        InterfaceC40869a interfaceC40869a = this.buttonState;
        String str = this.followupMessage;
        String str2 = this.commitPath;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("SelectionWidgetDomainState(selectedIds=", ", allSelectionIds=", list, ", buttonState=", list2);
        sbM124380j.append(interfaceC40869a);
        sbM124380j.append(", followupMessage=");
        sbM124380j.append(str);
        sbM124380j.append(", commitPath=");
        return AbstractC25012a.m73376i(str2, ")", sbM124380j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C40871c(List list, List list2, InterfaceC40869a interfaceC40869a, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, (i13 & 4) != 0 ? InterfaceC40869a.b.f176115a : interfaceC40869a, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? "" : str2);
    }
}
