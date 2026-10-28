package f01;

import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import bo1.C3508b;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.elements.IdentifierSpec;
import cz.C11225s0;
import ep1.C13412g;
import f41.AbstractC14078p;
import f41.C14067e;
import fj1.AbstractC14531b;
import fj1.C14532c;
import g00.AbstractC14936g;
import g01.AbstractC14940c;
import g01.C14941d;
import g11.AbstractC15219c;
import g40.C15347f;
import g40.C15366i0;
import g40.InterfaceC15450y2;
import g41.AbstractC15460d;
import g41.C15461e;
import g81.AbstractC15572b;
import g81.C15573c;
import go1.AbstractC16017b;
import h00.AbstractC16501f0;
import h00.AbstractC16517n0;
import h00.EnumC16519o0;
import h81.AbstractC17012e;
import h81.C17014g;
import ic2.AbstractC18401f;
import ic2.C18396a;
import id2.AbstractC18429n;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import io.getstream.chat.android.client.api2.mapping.DomainMapping;
import io.getstream.chat.android.client.api2.model.response.PushPreferencesResponse;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.models.User;
import j01.AbstractC21125b;
import j01.C21127d;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import p108e4.AbstractC12667a;
import p133f1.AbstractC13969q;
import p133f1.C13977s1;
import p162g0.C14926c;
import p162g0.C14927d;
import p163g1.AbstractC15055k;
import p163g1.AbstractC15142s6;
import p163g1.C14947a0;
import p163g1.C15175w;
import p180h0.InterfaceC16413k2;
import p292l1.InterfaceC23098g1;
import p294l3.C23254g;
import p294l3.C23283u0;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p412q3.InterfaceC29884r;
import p568w0.C36625a;
import p599wz.C37709d0;
import p602x1.C37816b;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f01.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13857f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49418w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f49419x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f49420y;

    public /* synthetic */ C13857f(int i13, Object obj, Object obj2) {
        this.f49418w = i13;
        this.f49420y = obj;
        this.f49419x = obj2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C23283u0 c23283u0;
        String str;
        switch (this.f49418w) {
            case 0:
                return AbstractC13860g.m39275j((C13863h) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC13913z.m39632g((C13843a0) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC13882n0.m39435s((C13885o0) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC13900t0.m39555g((C13903u0) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC13914z0.m39641e((C13844a1) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC13874k1.m39343h((C13877l1) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                C13977s1 c13977s1 = (C13977s1) this.f49420y;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f49419x;
                C36625a c36625a = (C36625a) obj;
                Context context = (Context) obj2;
                boolean zBooleanValue = ((Boolean) c13977s1.f49857m.getValue()).booleanValue();
                C23254g c23254gM39782l = c13977s1.m39782l();
                String str2 = c23254gM39782l != null ? c23254gM39782l.f92135x : null;
                C23283u0 c23283u1 = c13977s1.f49867w;
                if (c23283u1 != null) {
                    long j7 = c23283u1.f92253a;
                    InterfaceC29884r interfaceC29884r = c13977s1.f49846b;
                    c23283u0 = new C23283u0(AbstractC21478l0.m60431f(interfaceC29884r.mo15749x((int) (j7 >> 32)), interfaceC29884r.mo15749x((int) (j7 & 4294967295L))));
                } else {
                    c23283u0 = null;
                }
                AbstractC13969q.m39766a(c36625a, context, zBooleanValue, str2, c23283u0, c13977s1.f49854j, new C13412g(c13977s1, interfaceC2994c0, context, 6));
                return C23454a0.f92919a;
            case 7:
                return AbstractC14078p.m40077a0((Function1) this.f49419x, (C14067e) this.f49420y, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            case 8:
                return AbstractC14531b.m41475h((Modifier) this.f49420y, (C14532c) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                ((Integer) obj2).getClass();
                ((C14927d) this.f49420y).m43022a((C14926c) this.f49419x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC14936g.m43027a((C37709d0) this.f49420y, (C37816b) this.f49419x, (Composer) obj, AbstractC28683x.m87244L(49));
                return C23454a0.f92919a;
            case 11:
                return AbstractC14940c.m43041g((C14941d) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                ((Integer) obj2).getClass();
                AbstractC15055k.m43140a((InterfaceC4351m) this.f49420y, (InterfaceC4351m) this.f49419x, (Composer) obj, AbstractC28683x.m87244L(7));
                return C23454a0.f92919a;
            case 13:
                C15175w c15175w = (C15175w) this.f49420y;
                C22663d0 c22663d0 = (C22663d0) this.f49419x;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                C14947a0 c14947a0 = c15175w.f56944a;
                c14947a0.f55773j.m87023y(fFloatValue);
                c14947a0.f55775l.m87023y(fFloatValue2);
                c22663d0.f89331w = fFloatValue;
                return C23454a0.f92919a;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC15142s6.m43187a((C37816b) this.f49420y, (InterfaceC4351m) this.f49419x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 15:
                return AbstractC15219c.m43271u((InterfaceC23098g1) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                C15347f c15347f = (C15347f) this.f49420y;
                Map linkedHashMap = (Map) this.f49419x;
                List fields = (List) obj;
                Boolean bool = (Boolean) obj2;
                AbstractC22676k.m65750j(fields, "fields");
                if (AbstractC22676k.m65745e(bool, c15347f.f57675o)) {
                    bool = null;
                } else {
                    c15347f.f57675o = bool;
                }
                C15366i0 c15366i0 = c15347f.f57664d;
                if (c15347f.f57666f) {
                    c15366i0 = null;
                }
                ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(AbstractC37056f.m118960L(c15366i0), fields);
                if (bool == null) {
                    return null;
                }
                if (!bool.booleanValue()) {
                    LinkedHashMap linkedHashMap2 = c15347f.f57673m;
                    linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap2.size()));
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        Object key = entry.getKey();
                        Object key2 = entry.getKey();
                        IdentifierSpec.Companion.getClass();
                        if (AbstractC22676k.m65745e(key2, IdentifierSpec.Country)) {
                            str = (String) entry.getValue();
                        } else {
                            str = (String) c15347f.f57662b.get(entry.getKey());
                            if (str == null) {
                                str = "";
                            }
                        }
                        linkedHashMap.put(key, str);
                    }
                } else if (linkedHashMap == null) {
                    linkedHashMap = C25272z.f99163w;
                }
                Iterator it = arrayListM74129g1.iterator();
                while (it.hasNext()) {
                    ((InterfaceC15450y2) it.next()).mo43539h(linkedHashMap);
                }
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC15460d.m43645z((C15461e) this.f49420y, (InterfaceC28601c1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC15572b.m43862f((C15573c) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC16017b.m45335i((C3508b) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                ((Integer) obj2).getClass();
                AbstractC12667a.m35460l((C11225s0) this.f49420y, (Modifier) this.f49419x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 21:
                C22663d0 c22663d1 = (C22663d0) this.f49420y;
                InterfaceC16413k2 interfaceC16413k2 = (InterfaceC16413k2) this.f49419x;
                float fFloatValue3 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f13 = c22663d1.f89331w;
                c22663d1.f89331w = interfaceC16413k2.mo29373a(fFloatValue3 - f13) + f13;
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                AbstractC16501f0.m46670b((C39180l) this.f49420y, (C37816b) this.f49419x, (Composer) obj, AbstractC28683x.m87244L(49));
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                AbstractC16517n0.m46675d((EnumC16519o0) this.f49420y, (String) this.f49419x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 24:
                return AbstractC17012e.m47978f((C17014g) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AbstractC18401f.m52932o((C18396a) this.f49420y, (InterfaceC4351m) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC18429n.m53069v((InterfaceC39171c) this.f49420y, (InterfaceC4351m) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return MoshiChatApi.parseChannelPushPreferencesResponse$lambda$127((String) this.f49420y, (MoshiChatApi) this.f49419x, (DomainMapping) obj, (PushPreferencesResponse) obj2);
            case 28:
                return ChannelStateLegacyImpl.messagesTransformation$lambda$15((ChannelStateLegacyImpl) this.f49420y, (Function1) this.f49419x, (Collection) obj, (User) obj2);
            default:
                return AbstractC21125b.m58946l((C21127d) this.f49420y, (Function1) this.f49419x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C13857f(Object obj, Object obj2, int i13, int i14) {
        this.f49418w = i14;
        this.f49420y = obj;
        this.f49419x = obj2;
    }

    public /* synthetic */ C13857f(Function1 function1, C14067e c14067e) {
        this.f49418w = 7;
        this.f49419x = function1;
        this.f49420y = c14067e;
    }
}
