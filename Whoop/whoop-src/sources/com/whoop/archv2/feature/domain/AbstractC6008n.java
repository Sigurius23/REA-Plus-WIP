package com.whoop.archv2.feature.domain;

import ad3.AbstractC0757c;
import com.whoop.design.models.DesignSystemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import m83.C25271y;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/m;", "Lad3/c;", "json", "Lcom/whoop/archv2/feature/domain/a;", "b", "(Lcom/whoop/archv2/feature/domain/m;Lad3/c;)Lcom/whoop/archv2/feature/domain/a;", "", "Lkotlinx/serialization/json/JsonElement;", "Lcom/whoop/design/models/DesignSystemModel;", "a", "(Ljava/util/List;Lad3/c;)Ljava/util/List;", "Ltr2/n;", "Ltr2/n;", "logger", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6008n {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f24002a = InterfaceC34116n.INSTANCE.m107848a("GenericTopItems");

    /* JADX INFO: renamed from: a */
    private static final List<DesignSystemModel> m18032a(List<? extends JsonElement> list, AbstractC0757c abstractC0757c) {
        DesignSystemModel designSystemModel;
        List<? extends JsonElement> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                designSystemModel = (DesignSystemModel) abstractC0757c.m1830a(AbstractC35862g.m113842e(abstractC0757c.f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class)), (JsonElement) it.next());
            } catch (Exception e5) {
                f24002a.mo85230v("Failed to decode DesignSystemModel from topItems", e5, new AbstractC30556a.a[0]);
                designSystemModel = null;
            }
            if (designSystemModel != null) {
                arrayList.add(designSystemModel);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final C5993a m18033b(C6005m c6005m, AbstractC0757c json) {
        List<JsonElement> listM18028a;
        C5993a c5993a;
        List<DesignSystemModel> listM17879b;
        List<DesignSystemModel> listM17878a;
        AbstractC22676k.m65750j(c6005m, "<this>");
        AbstractC22676k.m65750j(json, "json");
        List<JsonElement> listM18029b = c6005m.m18029b();
        if (((listM18029b == null || listM18029b.isEmpty()) && ((listM18028a = c6005m.m18028a()) == null || listM18028a.isEmpty())) || (((listM17879b = (c5993a = new C5993a(m18032a(c6005m.m18029b(), json), m18032a(c6005m.m18028a(), json))).m17879b()) == null || listM17879b.isEmpty()) && ((listM17878a = c5993a.m17878a()) == null || listM17878a.isEmpty()))) {
            return null;
        }
        return c5993a;
    }
}
