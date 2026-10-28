package qv0;

import com.whoop.contentsearch.domain.models.ContentSearchScreen;
import com.whoop.design.models.items.ListItemTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nv0.AbstractC27164b;
import nv0.EnumC27166d;
import or2.AbstractC28188o1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import pv0.C29577d;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: qv0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lqv0/a;", "", "<init>", "()V", "", "Lcom/whoop/design/models/items/ListItemTileModel;", "", "selectedFilter", "filterTypes", "Lm91/u;", "c", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "", "b", "(Ljava/lang/String;)Z", "Lec3/l;", "Lnv0/b;", "upstream", "Lpv0/d;", "d", "(Lec3/l;)Lec3/l;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30649a {

    /* JADX INFO: renamed from: qv0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f126069w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30649a f126070x;

        /* JADX INFO: renamed from: qv0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42241a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f126071w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30649a f126072x;

            /* JADX INFO: renamed from: qv0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.contentsearch.presentation.reducers.ContentSearchViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ContentSearchViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42242a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f126073E;

                /* JADX INFO: renamed from: F */
                Object f126074F;

                /* JADX INFO: renamed from: G */
                Object f126075G;

                /* JADX INFO: renamed from: H */
                int f126076H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f126077w;

                /* JADX INFO: renamed from: x */
                int f126078x;

                /* JADX INFO: renamed from: y */
                Object f126079y;

                public C42242a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f126077w = obj;
                    this.f126078x |= Integer.MIN_VALUE;
                    return C42241a.this.emit(null, this);
                }
            }

            public C42241a(InterfaceC13062m interfaceC13062m, C30649a c30649a) {
                this.f126071w = interfaceC13062m;
                this.f126072x = c30649a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42242a c42242a;
                C29577d c29577d;
                int whoopIcon;
                EnumC16313m0 enumC16313m0;
                EnumC16313m0 enumC16313m1;
                if (interfaceC30057d instanceof C42242a) {
                    c42242a = (C42242a) interfaceC30057d;
                    int i13 = c42242a.f126078x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42242a.f126078x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42242a = new C42242a(interfaceC30057d);
                    }
                } else {
                    c42242a = new C42242a(interfaceC30057d);
                }
                Object obj2 = c42242a.f126077w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42242a.f126078x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f126071w;
                    AbstractC27164b abstractC27164b = (AbstractC27164b) obj;
                    if (abstractC27164b instanceof AbstractC27164b.c) {
                        AbstractC27164b.c cVar = (AbstractC27164b.c) abstractC27164b;
                        Object objM74100H0 = AbstractC25265s.m74100H0(cVar.getData().getRecords());
                        if (objM74100H0 == null) {
                            throw new IllegalArgumentException("Content Search BFF Contract is Broken - No records returned");
                        }
                        ContentSearchScreen contentSearchScreen = (ContentSearchScreen) objM74100H0;
                        boolean isContentListLoading = cVar.getIsContentListLoading();
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(contentSearchScreen.getNavBar().getTitle());
                        String leftButton = contentSearchScreen.getNavBar().getLeftButton();
                        if (leftButton != null) {
                            EnumC16313m0 enumC16313m2 = EnumC16313m0.CROSS;
                            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                            int length = enumC16313m0ArrValues.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    enumC16313m1 = null;
                                    break;
                                }
                                enumC16313m1 = enumC16313m0ArrValues[i15];
                                if (AbstractC22676k.m65745e(enumC16313m1.name(), leftButton)) {
                                    break;
                                }
                                i15++;
                            }
                            if (enumC16313m1 != null) {
                                enumC16313m2 = enumC16313m1;
                            }
                            whoopIcon = enumC16313m2.toWhoopIcon();
                        } else {
                            whoopIcon = EnumC16313m0.CROSS.toWhoopIcon();
                        }
                        int i16 = whoopIcon;
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(contentSearchScreen.getSearchTextPlaceholder());
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(cVar.getSearchQuery());
                        List<String> filterTypes = contentSearchScreen.getFilterTypes();
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(filterTypes, 10));
                        Iterator<T> it = filterTypes.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC8693b.m21278l((String) it.next()));
                        }
                        String selectedFilter = cVar.getSelectedFilter();
                        List listM94209c = this.f126072x.m94209c(contentSearchScreen.getTiles(), cVar.getSelectedFilter(), contentSearchScreen.getFilterTypes());
                        EnumC27166d paginationState = cVar.getPaginationState();
                        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(contentSearchScreen.getSearchLanding().getTitleText());
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(contentSearchScreen.getSearchLanding().getSubText());
                        String icon = contentSearchScreen.getSearchLanding().getIcon();
                        EnumC16313m0 enumC16313m3 = EnumC16313m0.SEARCH;
                        EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
                        int length2 = enumC16313m0ArrValues2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                enumC16313m0 = null;
                                break;
                            }
                            enumC16313m0 = enumC16313m0ArrValues2[i17];
                            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                                break;
                            }
                            i17++;
                        }
                        if (enumC16313m0 != null) {
                            enumC16313m3 = enumC16313m0;
                        }
                        c29577d = new C29577d(false, isContentListLoading, false, textResourceM21278l, i16, textResourceM21278l2, textResourceM21278l3, arrayList, selectedFilter, listM94209c, paginationState, textResourceM21278l4, textResourceM21278l5, enumC16313m3.toWhoopIcon(), cVar.getData().getNextToken(), AbstractC8693b.m21278l(contentSearchScreen.getPaginationDetails().getErrorText()), AbstractC8693b.m21278l(contentSearchScreen.getPaginationDetails().getRetryButtonText()));
                    } else if (abstractC27164b instanceof AbstractC27164b.b) {
                        c29577d = new C29577d(true, false, false, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, 131066, null);
                    } else {
                        if (!(abstractC27164b instanceof AbstractC27164b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c29577d = new C29577d(false, false, true, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, 131066, null);
                    }
                    c42242a.f126079y = null;
                    c42242a.f126073E = null;
                    c42242a.f126074F = null;
                    c42242a.f126075G = null;
                    c42242a.f126076H = 0;
                    c42242a.f126078x = 1;
                    if (interfaceC13062m.emit(c29577d, c42242a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C30649a c30649a) {
            this.f126069w = interfaceC13058l;
            this.f126070x = c30649a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f126069w.collect(new C42241a(interfaceC13062m, this.f126070x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m94208b(String str) {
        return (str == null || str.equalsIgnoreCase("ALL")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m94209c(List<ListItemTileModel> list, String str, List<String> list2) {
        ArrayList arrayList;
        if (m94208b(str)) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (AbstractC39421y.m125921F(((ListItemTileModel) obj).getTileType(), str, true)) {
                    arrayList.add(obj);
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (AbstractC28188o1.m85311a(list2, ((ListItemTileModel) obj2).getTileType())) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        return AbstractC21537c.m60555e(null, 1, null).m60540g(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m94210d(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}
