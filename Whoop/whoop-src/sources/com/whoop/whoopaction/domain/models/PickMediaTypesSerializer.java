package com.whoop.whoopaction.domain.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;", "Lwc3/c;", "", "Lcom/whoop/whoopaction/domain/models/PickMediaType;", "<init>", "()V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Ljava/util/List;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Ljava/util/List;)V", "", "delegate", "Lwc3/c;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class PickMediaTypesSerializer implements InterfaceC37138c {
    public static final PickMediaTypesSerializer INSTANCE = new PickMediaTypesSerializer();
    private static final InterfaceC37138c delegate;
    private static final InterfaceC39443g descriptor;

    static {
        ArrayListSerializer arrayListSerializerM122333a = AbstractC38195a.m122333a(StringSerializer.INSTANCE);
        delegate = arrayListSerializerM122333a;
        descriptor = arrayListSerializerM122333a.getDescriptor();
    }

    private PickMediaTypesSerializer() {
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public List<PickMediaType> deserialize(InterfaceC40541d decoder) {
        Object next;
        AbstractC22676k.m65750j(decoder, "decoder");
        Iterable<String> iterable = (Iterable) delegate.deserialize(decoder);
        ArrayList arrayList = new ArrayList();
        for (String str : iterable) {
            Iterator<E> it = PickMediaType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC39421y.m125921F(((PickMediaType) next).name(), str, true));
            PickMediaType pickMediaType = (PickMediaType) next;
            if (pickMediaType != null) {
                arrayList.add(pickMediaType);
            }
        }
        return arrayList;
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, List<? extends PickMediaType> value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC37138c interfaceC37138c = delegate;
        List<? extends PickMediaType> list = value;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PickMediaType) it.next()).name());
        }
        interfaceC37138c.serialize(encoder, arrayList);
    }
}
