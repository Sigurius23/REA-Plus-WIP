package jq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import eq0.AbstractC13470g3;
import iq0.C20839r;
import jp2.C21875f;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Ljq0/a;", "Ljq0/c;", "Liq0/r;", "Ljq0/b;", "Lkotlin/Function1;", "Ll83/a0;", "onAttachmentCancelled", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "(Landroid/view/ViewGroup;I)Ljq0/b;", "b", "Lkotlin/jvm/functions/Function1;", "getOnAttachmentCancelled", "()Lkotlin/jvm/functions/Function1;", "f", "", "c", "J", "getAttachmentMaxFileSize", "()J", "attachmentMaxFileSize", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21886a extends AbstractC21888c<C20839r, C21887b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function1 onAttachmentCancelled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long attachmentMaxFileSize;

    public C21886a(Function1 onAttachmentCancelled) {
        AbstractC22676k.m65750j(onAttachmentCancelled, "onAttachmentCancelled");
        this.onAttachmentCancelled = onAttachmentCancelled;
        this.attachmentMaxFileSize = 20971520L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m62105d(C20839r it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C21887b onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC13470g3 abstractC13470g3M38193c = AbstractC13470g3.m38193c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65747g(abstractC13470g3M38193c);
        return new C21887b(abstractC13470g3M38193c, this.onAttachmentCancelled, this.attachmentMaxFileSize);
    }

    /* JADX INFO: renamed from: f */
    public final void m62107f(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onAttachmentCancelled = function1;
    }

    public /* synthetic */ C21886a(Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21875f(2) : function1);
    }
}
