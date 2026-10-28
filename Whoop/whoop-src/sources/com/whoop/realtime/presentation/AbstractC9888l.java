package com.whoop.realtime.presentation;

import bh3.InterfaceC3255b;
import com.whoop.service.network.model.Sport;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/realtime/presentation/c$a;", "Lcom/whoop/service/network/model/Sport;", "b", "(Lcom/whoop/realtime/presentation/c$a;)Lcom/whoop/service/network/model/Sport;", "sport", "realtime-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9888l {

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.l$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC3255b {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f29031w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f29031w = function;
        }

        @Override // bh3.InterfaceC3255b
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo9472b(Object obj) {
            this.f29031w.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Sport m24119b(AbstractC9879c.a aVar) {
        InterfaceC24516b activity = aVar.getActivity();
        C24518d c24518d = activity instanceof C24518d ? (C24518d) activity : null;
        if (c24518d != null) {
            return c24518d.m71421k();
        }
        return null;
    }
}
