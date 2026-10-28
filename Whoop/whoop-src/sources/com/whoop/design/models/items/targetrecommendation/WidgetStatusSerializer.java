package com.whoop.design.models.items.targetrecommendation;

import java.util.Iterator;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yb3.AbstractC39421y;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/items/targetrecommendation/WidgetStatusSerializer;", "Lwc3/c;", "Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "serialize", "(Lzc3/e;Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;)V", "Lzc3/d;", "decoder", "deserialize", "(Lzc3/d;)Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;", "Lyc3/g;", "descriptor", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class WidgetStatusSerializer implements InterfaceC37138c {
    public static final WidgetStatusSerializer INSTANCE = new WidgetStatusSerializer();
    private static final InterfaceC39443g descriptor = AbstractC35952b.m114194b("WidgetStatus", C39441e.f169698i);

    private WidgetStatusSerializer() {
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }

    @Override // wc3.InterfaceC37137b
    public WidgetStatus deserialize(InterfaceC40541d decoder) {
        Object next;
        AbstractC22676k.m65750j(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        Iterator<E> it = WidgetStatus.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC39421y.m125921F(((WidgetStatus) next).name(), strDecodeString, true));
        WidgetStatus widgetStatus = (WidgetStatus) next;
        return widgetStatus == null ? WidgetStatus.DISABLED : widgetStatus;
    }

    @Override // wc3.InterfaceC37145j
    public void serialize(InterfaceC40542e encoder, WidgetStatus value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        encoder.encodeString(value.name());
    }
}
