package com.whoop.data.repositories;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch3.C4716w0;
import com.whoop.data.remote.domain.dto.SportDto;
import com.whoop.domain.model.User;
import com.whoop.service.network.ActivityServiceApi;
import com.whoop.service.network.model.Sport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w02.AbstractC36685b;
import xg3.InterfaceC38290q;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.SportsRepository$getSports$1$job$1", m100430f = "SportsRepository.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class SportsRepository$getSports$1$job$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC38290q $it;
    Object L$0;
    int label;
    final /* synthetic */ SportsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportsRepository$getSports$1$job$1(SportsRepository sportsRepository, InterfaceC38290q interfaceC38290q, InterfaceC30057d<? super SportsRepository$getSports$1$job$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = sportsRepository;
        this.$it = interfaceC38290q;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new SportsRepository$getSports$1$job$1(this.this$0, this.$it, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SportsRepository$getSports$1$job$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        Sport sport;
        String country;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                User userM84055f = this.this$0.userContext.m84055f();
                if (userM84055f == null || (country = userM84055f.getCountry()) == null) {
                    country = "US";
                }
                ActivityServiceApi activityServiceApi = this.this$0.getActivityServiceApi();
                this.L$0 = null;
                this.label = 1;
                obj = activityServiceApi.getSports(country, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            iterable = (List) obj;
        } catch (Exception e5) {
            AbstractC36685b.m117760b(e5, "Failed to fetch sports", this.this$0.log, null, 8, null);
            iterable = C25271y.f99162w;
        }
        SportsRepository sportsRepository = this.this$0;
        InterfaceC38290q interfaceC38290q = this.$it;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            try {
                sport = ((SportDto) it.next()).toSport();
            } catch (Exception unused) {
                sportsRepository.log.mo85222m("Failed to convert sport " + interfaceC38290q + " to domain model", new AbstractC30556a.a[0]);
                sport = null;
            }
            if (sport != null) {
                arrayList.add(sport);
            }
        }
        ((C4716w0) this.$it).m14775d(arrayList);
        return C23454a0.f92919a;
    }
}
