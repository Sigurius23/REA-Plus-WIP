package io.getstream.chat.android.client.utils;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, m65681d2 = {"", "T", "Ln23/h;", "Lkotlin/Function1;", "", "toString", "stringify", "(Ln23/h;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ResultUtilsKt {
    @InternalStreamChatApi
    public static final <T> String stringify(AbstractC26205h abstractC26205h, Function1 toString) {
        AbstractC22676k.m65750j(abstractC26205h, "<this>");
        AbstractC22676k.m65750j(toString, "toString");
        if (abstractC26205h instanceof C26204g) {
            return (String) toString.invoke(((C26204g) abstractC26205h).f103919a);
        }
        if (abstractC26205h instanceof C26203f) {
            return ((C26203f) abstractC26205h).f103918a.toString();
        }
        throw new NoWhenBranchMatchedException();
    }
}
