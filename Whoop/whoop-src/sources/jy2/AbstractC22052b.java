package jy2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ScreeningSubmissionResponse;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy2.AbstractC21035b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22404p;
import ky2.C22900i;
import ky2.C22902k;
import ky2.C22903l;
import ky2.InterfaceC22898g;
import m83.AbstractC25267u;
import or2.AbstractC28188o1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import vy2.C36605c;
import vy2.C36606d;

/* JADX INFO: renamed from: jy2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lky2/g;", "Lvy2/c;", "currentDomainState", "d", "(Lky2/g;Lvy2/c;)Lky2/g;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "screeningSubmissionResponse", "c", "(Lky2/g;Lvy2/c;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)Lky2/g;", "Liy2/b$e;", "Lky2/g$a$b;", "f", "(Liy2/b$e;)Lky2/g$a$b;", "Liy2/b$a;", "Lky2/g$a$a;", "e", "(Liy2/b$a;)Lky2/g$a$a;", "Lvy2/d;", "Lky2/i;", "i", "(Lvy2/d;)Lky2/i;", "Liy2/b$g;", "Lky2/g$f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Liy2/b$g;)Lky2/g$f;", "Liy2/b$c;", "Lky2/g$c;", "g", "(Liy2/b$c;)Lky2/g$c;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22052b {
    /* JADX INFO: renamed from: c */
    public static final InterfaceC22898g m63128c(InterfaceC22898g interfaceC22898g, C36605c currentDomainState, ScreeningSubmissionResponse screeningSubmissionResponse) {
        AbstractC22676k.m65750j(interfaceC22898g, "<this>");
        AbstractC22676k.m65750j(currentDomainState, "currentDomainState");
        AbstractC22676k.m65750j(screeningSubmissionResponse, "screeningSubmissionResponse");
        if (interfaceC22898g instanceof InterfaceC22898g.a.C41939a) {
            return InterfaceC22898g.a.C41939a.m66581e((InterfaceC22898g.a.C41939a) interfaceC22898g, 0, null, null, false, null, new C22902k(AbstractC8693b.m21278l(currentDomainState.getSubmittedTitle()), AbstractC8693b.m21279m(currentDomainState.getSubmittedSubtitle()), screeningSubmissionResponse), null, null, null, null, null, 1999, null);
        }
        if (interfaceC22898g instanceof InterfaceC22898g.a.b) {
            return InterfaceC22898g.a.b.m66591e((InterfaceC22898g.a.b) interfaceC22898g, 0, null, null, false, null, new C22902k(AbstractC8693b.m21278l(currentDomainState.getSubmittedTitle()), AbstractC8693b.m21279m(currentDomainState.getSubmittedSubtitle()), screeningSubmissionResponse), null, null, null, null, null, 1999, null);
        }
        return interfaceC22898g instanceof InterfaceC22898g.c ? InterfaceC22898g.c.m66603b((InterfaceC22898g.c) interfaceC22898g, null, null, null, null, null, new C22902k(AbstractC8693b.m21278l(currentDomainState.getSubmittedTitle()), AbstractC8693b.m21279m(currentDomainState.getSubmittedSubtitle()), screeningSubmissionResponse), 15, null) : interfaceC22898g;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC22898g m63129d(InterfaceC22898g interfaceC22898g, C36605c currentDomainState) {
        AbstractC22676k.m65750j(interfaceC22898g, "<this>");
        AbstractC22676k.m65750j(currentDomainState, "currentDomainState");
        if (interfaceC22898g instanceof InterfaceC22898g.a.C41939a) {
            return InterfaceC22898g.a.C41939a.m66581e((InterfaceC22898g.a.C41939a) interfaceC22898g, 0, null, null, false, new C22903l(AbstractC8693b.m21278l(currentDomainState.getSubmittingTitle()), AbstractC8693b.m21278l(currentDomainState.getSubmittingSubtitle())), null, null, null, null, null, null, 2031, null);
        }
        if (interfaceC22898g instanceof InterfaceC22898g.a.b) {
            return InterfaceC22898g.a.b.m66591e((InterfaceC22898g.a.b) interfaceC22898g, 0, null, null, false, new C22903l(AbstractC8693b.m21278l(currentDomainState.getSubmittingTitle()), AbstractC8693b.m21278l(currentDomainState.getSubmittingSubtitle())), null, null, null, null, null, null, 2031, null);
        }
        return interfaceC22898g instanceof InterfaceC22898g.c ? InterfaceC22898g.c.m66603b((InterfaceC22898g.c) interfaceC22898g, null, null, null, null, new C22903l(AbstractC8693b.m21278l(currentDomainState.getSubmittingTitle()), AbstractC8693b.m21278l(currentDomainState.getSubmittingSubtitle())), null, 47, null) : interfaceC22898g;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC22898g.a.C41939a m63130e(AbstractC21035b.a aVar) {
        AbstractC22676k.m65750j(aVar, "<this>");
        int id4 = aVar.getQuestion().getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(aVar.getQuestion().getTitle());
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(aVar.getQuestion().getSubtitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(aVar.getQuestion().getPositiveButtonText());
        TextResource.C8691e c8691eM21279m2 = AbstractC8693b.m21279m(aVar.getQuestion().getNegativeButtonText());
        String content = aVar.getQuestion().getContent();
        List<C36606d> listM117596d = aVar.getQuestion().m117596d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117596d, 10));
        Iterator<T> it = listM117596d.iterator();
        while (it.hasNext()) {
            arrayList.add(m63134i((C36606d) it.next()));
        }
        return new InterfaceC22898g.a.C41939a(id4, textResourceM21278l, c8691eM21279m, true, null, null, textResourceM21278l2, c8691eM21279m2, content, arrayList, aVar.m58721b(), 48, null);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC22898g.a.b m63131f(AbstractC21035b.e eVar) {
        AbstractC22676k.m65750j(eVar, "<this>");
        int id4 = eVar.getQuestion().getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(eVar.getQuestion().getTitle());
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(eVar.getQuestion().getSubtitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(eVar.getQuestion().getPositiveButtonText());
        TextResource.C8691e c8691eM21279m2 = AbstractC8693b.m21279m(eVar.getQuestion().getNegativeButtonText());
        boolean zM85313c = AbstractC28188o1.m85313c(eVar.getSelectedKey());
        String content = eVar.getQuestion().getContent();
        List<C36606d> listM117596d = eVar.getQuestion().m117596d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117596d, 10));
        Iterator<T> it = listM117596d.iterator();
        while (it.hasNext()) {
            arrayList.add(m63134i((C36606d) it.next()));
        }
        String selectedKey = eVar.getSelectedKey();
        Integer num = null;
        if (selectedKey != null) {
            Iterator<C36606d> it3 = eVar.getQuestion().m117596d().iterator();
            int i13 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (AbstractC22676k.m65745e(it3.next().getKey(), selectedKey)) {
                    break;
                }
                i13++;
            }
            Integer numValueOf = Integer.valueOf(i13);
            if (numValueOf.intValue() >= 0) {
                num = numValueOf;
            }
        }
        return new InterfaceC22898g.a.b(id4, textResourceM21278l, c8691eM21279m, zM85313c, null, null, textResourceM21278l2, c8691eM21279m2, content, arrayList, num, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC22898g.c m63132g(AbstractC21035b.c cVar) {
        return new InterfaceC22898g.c(AbstractC8693b.m21278l(cVar.getScreeningConfig().getSubmittedErrorTitle()), AbstractC8693b.m21278l(cVar.getScreeningConfig().getSubmittedErrorSubtitle()), AbstractC8693b.m21278l(cVar.getScreeningConfig().getSubmittedErrorPositiveCta()), AbstractC8693b.m21278l(cVar.getScreeningConfig().getSubmittedErrorNegativeCta()), null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC22898g.f m63133h(AbstractC21035b.g gVar) {
        EnumC39333f enumC39333f;
        EnumC16313m0 enumC16313m0;
        int campaignId = gVar.getCampaignId();
        String icon = gVar.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CHECKMARK;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            enumC39333f = null;
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        int whoopIcon = enumC16313m1.toWhoopIcon();
        String iconColor = gVar.getIconColor();
        if (iconColor == null) {
            iconColor = "";
        }
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
        for (EnumC39333f enumC39333f3 : EnumC39333f.values()) {
            if (AbstractC22676k.m65745e(enumC39333f3.name(), iconColor)) {
                enumC39333f = enumC39333f3;
                break;
            }
        }
        if (enumC39333f != null) {
            enumC39333f2 = enumC39333f;
        }
        return new InterfaceC22898g.f(campaignId, whoopIcon, enumC39333f2, gVar.getContent(), AbstractC8693b.m21278l(gVar.getCta()), AbstractC22404p.m64503l(gVar.getBackgroundImage()), gVar.getNavigation() != null ? new AbstractC10840c.i(gVar.getNavigation()) : new AbstractC10840c.f(gVar.getCampaignId(), Integer.valueOf(gVar.getSessionId())));
    }

    /* JADX INFO: renamed from: i */
    public static final C22900i m63134i(C36606d c36606d) {
        AbstractC22676k.m65750j(c36606d, "<this>");
        return new C22900i(AbstractC8693b.m21278l(c36606d.getText()), c36606d.getKey());
    }
}
