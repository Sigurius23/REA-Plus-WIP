package io.getstream.chat.android.models.querysort;

import io.getstream.chat.android.extensions.StringExtensionsKt;
import j93.InterfaceC21459c;
import j93.InterfaceC21461d;
import j93.InterfaceC21490w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\n\u0018\u00010\t\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/models/querysort/FieldSearcher;", "", "<init>", "()V", "T", "", "fieldName", "Lj93/d;", "kClass", "Lj93/w;", "", "findComparableMemberProperty$stream_chat_android_core", "(Ljava/lang/String;Lj93/d;)Lj93/w;", "findComparableMemberProperty", "any", "findComparable$stream_chat_android_core", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;", "findComparable", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FieldSearcher {
    public final Comparable<Object> findComparable$stream_chat_android_core(Object any, String fieldName) {
        Object next;
        InterfaceC21459c interfaceC21459c;
        AbstractC22676k.m65750j(any, "any");
        AbstractC22676k.m65750j(fieldName, "fieldName");
        Collection members = AbstractC22671h0.f89337a.getOrCreateKotlinClass(any.getClass()).getMembers();
        String strSnakeToLowerCamelCase = StringExtensionsKt.snakeToLowerCamelCase(fieldName);
        String strLowerCamelCaseToGetter = StringExtensionsKt.lowerCamelCaseToGetter(strSnakeToLowerCamelCase);
        Iterator it = members.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            interfaceC21459c = (InterfaceC21459c) next;
            if (AbstractC22676k.m65745e(interfaceC21459c.getName(), strSnakeToLowerCamelCase)) {
                break;
            }
        } while (!AbstractC22676k.m65745e(interfaceC21459c.getName(), strLowerCamelCaseToGetter));
        InterfaceC21459c interfaceC21459c2 = (InterfaceC21459c) next;
        Object objCall = interfaceC21459c2 != null ? interfaceC21459c2.call(any) : null;
        if (objCall instanceof Comparable) {
            return (Comparable) objCall;
        }
        return null;
    }

    public final <T> InterfaceC21490w findComparableMemberProperty$stream_chat_android_core(String fieldName, InterfaceC21461d kClass) {
        Object next;
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(kClass, "kClass");
        Collection members = kClass.getMembers();
        ArrayList arrayList = new ArrayList();
        for (T t14 : members) {
            if (t14 instanceof InterfaceC21490w) {
                arrayList.add(t14);
            }
        }
        String strSnakeToLowerCamelCase = StringExtensionsKt.snakeToLowerCamelCase(fieldName);
        String strLowerCamelCaseToGetter = StringExtensionsKt.lowerCamelCaseToGetter(strSnakeToLowerCamelCase);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            next = it.next();
            InterfaceC21490w interfaceC21490w = (InterfaceC21490w) next;
            if (AbstractC22676k.m65745e(interfaceC21490w.getName(), strSnakeToLowerCamelCase) || AbstractC22676k.m65745e(interfaceC21490w.getName(), strLowerCamelCaseToGetter)) {
                return (InterfaceC21490w) next;
            }
        }
        next = null;
        return (InterfaceC21490w) next;
    }
}
