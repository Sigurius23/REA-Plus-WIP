package p249jc;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c93.InterfaceC4354p;
import com.google.crypto.tink.internal.C5101l0;
import lc.C23817c;
import p218ic.C18348b;
import p218ic.C18389w;
import p278kc.C22348c;
import p364oc.C27815i;
import p457rc.AbstractC31224g;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import sc.InterfaceC32351a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jc.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21597w extends C22672i implements InterfaceC4354p {

    /* JADX INFO: renamed from: w */
    public static final C21597w f82815w = new C21597w(6, AbstractC21598x.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // c93.InterfaceC4354p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context p13 = (Context) obj;
        C18348b p14 = (C18348b) obj2;
        InterfaceC32351a p15 = (InterfaceC32351a) obj3;
        WorkDatabase p16 = (WorkDatabase) obj4;
        C27815i p17 = (C27815i) obj5;
        C21577g p18 = (C21577g) obj6;
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        AbstractC22676k.m65750j(p15, "p2");
        AbstractC22676k.m65750j(p16, "p3");
        AbstractC22676k.m65750j(p17, "p4");
        AbstractC22676k.m65750j(p18, "p5");
        String str = AbstractC21585k.f82777a;
        C23817c c23817c = new C23817c(p13, p16, p14);
        AbstractC31224g.m96165a(p13, SystemJobService.class, true);
        C18389w.m52886d().m52888a(AbstractC21585k.f82777a, "Created SystemJobScheduler and enabled SystemJobService");
        return AbstractC37056f.m118959K(c23817c, new C22348c(p13, p14, p17, p18, new C5101l0(p18, p15), p15));
    }
}
