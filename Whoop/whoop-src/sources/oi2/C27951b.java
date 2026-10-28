package oi2;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import fi0.InterfaceC14515a;
import h01.C16534a0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import ti2.C33860g;
import ui2.C35022c;

/* JADX INFO: renamed from: oi2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000f\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Loi2/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lti2/g;", "viewState", "Ll83/a0;", "c", "(Lti2/g;)V", "b", "()V", "Loi2/a;", NotificationCompat.CATEGORY_EVENT, "a", "(Loi2/a;)V", "Lfi0/a;", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27951b {

    /* JADX INFO: renamed from: c */
    public static final int f112741c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: oi2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, m65681d2 = {"Loi2/b$b;", "", "", "cardTitle", "cardBody", "cardCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cardTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String cardBody;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String cardCategory;

        public b(String cardTitle, String cardBody, String cardCategory) {
            AbstractC22676k.m65750j(cardTitle, "cardTitle");
            AbstractC22676k.m65750j(cardBody, "cardBody");
            AbstractC22676k.m65750j(cardCategory, "cardCategory");
            this.cardTitle = cardTitle;
            this.cardBody = cardBody;
            this.cardCategory = cardCategory;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCardBody() {
            return this.cardBody;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCardCategory() {
            return this.cardCategory;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCardTitle() {
            return this.cardTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.cardTitle, bVar.cardTitle) && AbstractC22676k.m65745e(this.cardBody, bVar.cardBody) && AbstractC22676k.m65745e(this.cardCategory, bVar.cardCategory);
        }

        public int hashCode() {
            return this.cardCategory.hashCode() + AbstractC11266d.m30450d(this.cardTitle.hashCode() * 31, 31, this.cardBody);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.cardCategory, ")", AbstractC11895b.m32001t("StreaksCopyInfo(cardTitle=", this.cardTitle, ", cardBody=", this.cardBody, ", cardCategory="));
        }
    }

    public C27951b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m84386b() {
        InterfaceC14515a.m41418i(this.analytics, null, "view error", null, "Streaks", null, null, 53, null);
    }

    /* JADX INFO: renamed from: c */
    private final void m84387c(C33860g viewState) {
        List<InterfaceC25312u> listM110688f;
        String string;
        String string2;
        String id4;
        CharSequence value;
        String string3;
        C35022c data;
        CharSequence value2;
        CharSequence value3;
        C35022c data2;
        C35022c data3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM84393b = AbstractC27952c.m84393b((viewState == null || (data3 = viewState.getData()) == null) ? null : data3.getStreakState());
        if (viewState == null || (data2 = viewState.getData()) == null || (listM110688f = data2.m110688f()) == null) {
            listM110688f = C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM110688f) {
            if (obj instanceof C16534a0) {
                arrayList.add(obj);
            }
        }
        C16534a0 c16534a0 = (C16534a0) AbstractC25265s.m74100H0(arrayList);
        TextResource title = c16534a0 != null ? c16534a0.getTitle() : null;
        TextResource.C8691e c8691e = title instanceof TextResource.C8691e ? (TextResource.C8691e) title : null;
        String str = "";
        if (c8691e == null || (value3 = c8691e.getValue()) == null || (string = value3.toString()) == null) {
            string = "";
        }
        TextResource subtitle = c16534a0 != null ? c16534a0.getSubtitle() : null;
        TextResource.C8691e c8691e2 = subtitle instanceof TextResource.C8691e ? (TextResource.C8691e) subtitle : null;
        if (c8691e2 == null || (value2 = c8691e2.getValue()) == null || (string2 = value2.toString()) == null) {
            string2 = "";
        }
        if (c16534a0 == null || (id4 = c16534a0.getId()) == null) {
            id4 = "";
        }
        b bVar = new b(string, string2, id4);
        TextResource streakValue = (viewState == null || (data = viewState.getData()) == null) ? null : data.getStreakValue();
        TextResource.C8691e c8691e3 = streakValue instanceof TextResource.C8691e ? (TextResource.C8691e) streakValue : null;
        if (c8691e3 != null && (value = c8691e3.getValue()) != null && (string3 = value.toString()) != null) {
            str = string3;
        }
        linkedHashMap.put("streak_value", str);
        linkedHashMap.put("streak_state", strM84393b);
        linkedHashMap.put("title", bVar.getCardTitle());
        this.analytics.mo41428k(bVar.getCardCategory(), "view streak explainer page", bVar.getCardBody(), "Streaks", linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public final void m84388a(AbstractC27950a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC27950a.c) {
            m84387c(((AbstractC27950a.c) event).getStreaksViewState());
            return;
        }
        if (event instanceof AbstractC27950a.b) {
            m84386b();
        } else {
            if (!(event instanceof AbstractC27950a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC27950a.a aVar = (AbstractC27950a.a) event;
            AbstractC27953d.m84394a(this.analytics, aVar.getStreakValue(), AbstractC27952c.m84393b(aVar.getStreakState()));
        }
    }
}
