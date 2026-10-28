package com.whoop.profile.view.edit;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1910d;
import b30.C2663y4;
import bz0.C3713c;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.samples.EditProfileSamples;
import dp0.C12253i;
import fy1.C14873i;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.C29656q;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import xb3.AbstractC38176k;
import y71.AbstractC39281n;
import y71.C39282o;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, m65681d2 = {"", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;", "countries", "", "selectedCountryCode", "Lkotlin/Function1;", "Ll83/a0;", "onCountrySelected", "CountrySelectionContent", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CountrySelectionContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "searchQuery", "filteredCountries", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CountrySelectionContentKt {
    public static final void CountrySelectionContent(List<EditProfileViewState.Country> countries, String str, Function1 onCountrySelected, Composer composer, int i13) {
        Function1 function1;
        C28655q c28655q;
        Object obj;
        String strM95641q;
        CharSequence charSequenceM21262a;
        String string;
        Object obj2;
        String str2 = str;
        AbstractC22676k.m65750j(countries, "countries");
        AbstractC22676k.m65750j(onCountrySelected, "onCountrySelected");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(276468588);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(countries) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onCountrySelected) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                obj = objM87133R;
                C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(AbstractC8693b.m21267a());
                c28655q2.m87172p0(c28633k1M87272z);
                obj = c28633k1M87272z;
            }
            obj = objM87133R;
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj;
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            String strM21274h = AbstractC8693b.m21274h(CountrySelectionContent$lambda$1(interfaceC28601c1), c28655q2, TextResource.$stable);
            boolean zM87153g = c28655q2.m87153g(strM21274h);
            Object objM87133R2 = c28655q2.m87133R();
            Object obj3 = objM87133R2;
            if (zM87153g || objM87133R2 == c28676v0) {
                String string2 = AbstractC39414r.m125869O0(strM21274h).toString();
                Locale locale = Locale.ROOT;
                String strM95641q2 = AbstractC31061c.m95641q(locale, "ROOT", string2, locale, "toLowerCase(...)");
                c28655q2.m87172p0(strM95641q2);
                obj3 = strM95641q2;
            }
            String str3 = (String) obj3;
            boolean zM87153g2 = c28655q2.m87153g(countries);
            Object objM87133R3 = c28655q2.m87133R();
            Object obj4 = objM87133R3;
            if (zM87153g2 || objM87133R3 == c28676v0) {
                List<EditProfileViewState.Country> list = countries;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                for (EditProfileViewState.Country country : list) {
                    TextResource name = country.getName();
                    TextResource.C8691e c8691e = name instanceof TextResource.C8691e ? (TextResource.C8691e) name : null;
                    if (c8691e == null || (charSequenceM21262a = c8691e.getValue()) == null || (string = charSequenceM21262a.toString()) == null) {
                        strM95641q = null;
                    } else {
                        Locale locale2 = Locale.ROOT;
                        strM95641q = AbstractC31061c.m95641q(locale2, "ROOT", string, locale2, "toLowerCase(...)");
                    }
                    arrayList.add(new C23465k(country, strM95641q));
                }
                c28655q2.m87172p0(arrayList);
                obj4 = arrayList;
            }
            List list2 = (List) obj4;
            boolean zM87153g3 = c28655q2.m87153g(list2) | c28655q2.m87153g(str3);
            Object objM87133R4 = c28655q2.m87133R();
            Object obj5 = objM87133R4;
            if (zM87153g3 || objM87133R4 == c28676v0) {
                C28612f0 c28612f0M87264r = AbstractC28683x.m87264r(new C9761a(str3, 0, countries, list2));
                c28655q2.m87172p0(c28612f0M87264r);
                obj5 = c28612f0M87264r;
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) obj5;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3411h = AbstractC1102d.m3411h(400, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceCountrySelectionContent$lambda$1 = CountrySelectionContent$lambda$1(interfaceC28601c1);
            TextResource.C8688b c8688b = new TextResource.C8688b(C9691R.string.profile_search_countries_placeholder, null, 2, false ? 1 : 0);
            Object objM87133R5 = c28655q2.m87133R();
            Object obj6 = objM87133R5;
            if (objM87133R5 == c28676v0) {
                C1910d c1910d = new C1910d(12, interfaceC28601c1);
                c28655q2.m87172p0(c1910d);
                obj6 = c1910d;
            }
            AbstractC17795v0.m51127j(modifierM3409f, textResourceCountrySelectionContent$lambda$1, c8688b, null, 0L, 0, false, null, 0L, false, c26068uM77569a, false, false, null, (Function1) obj6, c28655q2, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 24576, 15352);
            C28655q c28655q3 = c28655q2;
            AbstractC11266d.m30469w(3, 8, c2314t, c28655q3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87153g4 = c28655q3.m87153g(interfaceC28670t2) | ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objM87133R6 = c28655q3.m87133R();
            if (zM87153g4 || objM87133R6 == c28676v0) {
                str2 = str;
                function1 = onCountrySelected;
                C29656q c29656q = new C29656q(interfaceC28670t2, str2, function1, 21);
                c28655q3.m87172p0(c29656q);
                obj2 = c29656q;
            } else {
                str2 = str;
                function1 = onCountrySelected;
                obj2 = objM87133R6;
            }
            AbstractC22674j.m65717c(modifierM3409f2, c26068uM77569a, null, null, null, null, false, null, (Function1) obj2, c28655q3, 6, 508);
            c28655q3.m87173q(true);
            c28655q = c28655q3;
        } else {
            function1 = onCountrySelected;
            c28655q2.m87138X();
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9771b(countries, str2, function1, i13, 0);
        }
    }

    private static final TextResource CountrySelectionContent$lambda$1(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List CountrySelectionContent$lambda$5$0(String str, List list, List list2) {
        return AbstractC39414r.m125890i0(str) ? list : AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(list2), new C2663y4(str, 7)), new C6498i(22)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CountrySelectionContent$lambda$5$0$0(String str, C23465k c23465k) {
        AbstractC22676k.m65750j(c23465k, "<destruct>");
        String str2 = (String) c23465k.f92938x;
        return str2 != null && AbstractC39414r.m125876U(str2, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditProfileViewState.Country CountrySelectionContent$lambda$5$0$1(C23465k c23465k) {
        AbstractC22676k.m65750j(c23465k, "<destruct>");
        return (EditProfileViewState.Country) c23465k.f92937w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<EditProfileViewState.Country> CountrySelectionContent$lambda$6(InterfaceC28670t2 interfaceC28670t2) {
        return (List) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CountrySelectionContent$lambda$7$0$0(InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.c) {
            interfaceC28601c1.setValue(AbstractC8693b.m21278l(((AbstractC17801x0.c) event).getNewText()));
        } else if (event instanceof AbstractC17801x0.a) {
            interfaceC28601c1.setValue(AbstractC8693b.m21267a());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CountrySelectionContent$lambda$7$1$0(final InterfaceC28670t2 interfaceC28670t2, final String str, final Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        final List<EditProfileViewState.Country> listCountrySelectionContent$lambda$6 = CountrySelectionContent$lambda$6(interfaceC28670t2);
        ((C26053f) LazyColumn).m77529r(listCountrySelectionContent$lambda$6.size(), null, new Function1() { // from class: com.whoop.profile.view.edit.CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$2
            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i13) {
                listCountrySelectionContent$lambda$6.get(i13);
                return null;
            }
        }, new C37816b(new InterfaceC4352n() { // from class: com.whoop.profile.view.edit.CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3
            @Override // c93.InterfaceC4352n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C23454a0.f92919a;
            }

            public final void invoke(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
                int i15;
                if ((i14 & 6) == 0) {
                    i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
                } else {
                    i15 = i14;
                }
                if ((i14 & 48) == 0) {
                    i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
                }
                C28655q c28655q = (C28655q) composer;
                if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                    c28655q.m87138X();
                    return;
                }
                final EditProfileViewState.Country country = (EditProfileViewState.Country) listCountrySelectionContent$lambda$6.get(i13);
                c28655q.m87150e0(1071051487);
                TextResource.C8691e c8691e = new TextResource.C8691e(AbstractC18489d0.m53370k(country.getCountryFlag(), "\u2009\u2009\u2009", AbstractC8693b.m21274h(country.getName(), c28655q, TextResource.$stable)));
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C39282o c39282oM125229d = C39282o.Companion.m125229d(C39282o.INSTANCE, c8691e, null, null, null, null, null, null, null, null, null, null, null, null, null, false, AbstractC22676k.m65745e(str, country.getCountryCode()), null, false, null, null, null, false, null, 8355838, null);
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(country);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    final Function1 function2 = function1;
                    objM87133R = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1
                        @Override // c93.InterfaceC4339a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m134175invoke();
                            return C23454a0.f92919a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m134175invoke() {
                            function2.invoke(country);
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39281n.m125207c(modifierM3409f, c39282oM125229d, (InterfaceC4339a) objM87133R, c28655q, (C39282o.f168987q << 3) | 6, 0);
                if (i13 != AbstractC37056f.m118951C(CountrySelectionContentKt.CountrySelectionContent$lambda$6(interfaceC28670t2))) {
                    c28655q.m87150e0(1071612710);
                    AbstractC25012a.m73388u((float) 1.5d, 8, c2314t, c28655q, false);
                } else {
                    c28655q.m87150e0(1071698239);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
        }, true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CountrySelectionContent$lambda$8(List list, String str, Function1 function1, int i13, Composer composer, int i14) {
        CountrySelectionContent(list, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void CountrySelectionContentPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(4129328);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.edit.CountrySelectionContentKt$CountrySelectionContentPreview$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    List<EditProfileViewState.Country> countries;
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(798153806);
                    EditProfileViewState.EditProfileData profileData = EditProfileSamples.INSTANCE.getSampleEditProfileViewState().getProfileData();
                    if (profileData == null || (countries = profileData.getCountries()) == null) {
                        countries = C25271y.f99162w;
                    }
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.edit.CountrySelectionContentKt$CountrySelectionContentPreview$1$1$1
                            public final void invoke(EditProfileViewState.Country it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((EditProfileViewState.Country) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    CountrySelectionContentKt.CountrySelectionContent(countries, "CA", (Function1) objM87133R, c28655q2, 432);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 CountrySelectionContentPreview$lambda$1(int i13, Composer composer, int i14) {
        CountrySelectionContentPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
