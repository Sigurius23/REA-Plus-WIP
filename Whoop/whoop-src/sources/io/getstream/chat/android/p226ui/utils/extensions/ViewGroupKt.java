package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m65681d2 = {"inflater", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "getInflater$annotations", "(Landroid/view/ViewGroup;)V", "getInflater", "(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;", "streamThemeInflater", "getStreamThemeInflater", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ViewGroupKt {
    public static final LayoutInflater getInflater(ViewGroup viewGroup) {
        AbstractC22676k.m65750j(viewGroup, "<this>");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getInflater$annotations(ViewGroup viewGroup) {
    }

    public static final LayoutInflater getStreamThemeInflater(ViewGroup viewGroup) {
        AbstractC22676k.m65750j(viewGroup, "<this>");
        Context context = viewGroup.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }
}
