package a11;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import e61.AbstractC12765h;
import f61.C14147i;
import fm1.C14600d;
import i61.InterfaceC18153b;
import ik2.C18614b;
import j61.C21374h;
import java.util.List;
import jk2.AbstractC21762c;
import l83.C23454a0;
import p31.AbstractC28803n;
import p31.AbstractC28805p;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p634y1.C39031d;
import p710im1.AbstractC18658b;
import p710im1.C18665d0;
import p715kotlin.jvm.functions.Function1;
import wm1.AbstractC37389k;
import wm1.C37380b;
import wm1.C37381c;

/* JADX INFO: renamed from: a11.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0137o implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f423E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f424w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f425x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f426y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f427z;

    public /* synthetic */ C0137o(Object obj, Object obj2, Object obj3, int i13, int i14) {
        this.f424w = i14;
        this.f426y = obj;
        this.f427z = obj2;
        this.f423E = obj3;
        this.f425x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f424w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC0139q.m300K((TextResource) this.f426y, (TextResource) this.f427z, (EnumC0125c) this.f423E, this.f425x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC12765h.m35716E((InterfaceC18153b) this.f426y, (C21374h) this.f427z, (C14147i) this.f423E, this.f425x, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC18658b.m54127l((List) this.f426y, (C18665d0) this.f427z, (C14600d) this.f423E, this.f425x, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC21762c.m61462k((InterfaceC4339a) this.f426y, (C18614b) this.f427z, (C2886a) this.f423E, this.f425x, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC28803n.m87601J((AbstractC28805p.e) this.f426y, (Modifier) this.f427z, (InterfaceC4339a) this.f423E, this.f425x, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC37389k.m119700H((C37380b) this.f426y, (C37381c) this.f427z, (Function1) this.f423E, this.f425x, (Composer) obj, iIntValue6);
            case 6:
                ((Integer) obj2).intValue();
                int iM87244L = AbstractC28683x.m87244L(this.f425x) | 1;
                ((C37816b) this.f426y).m121332d(this.f427z, this.f423E, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(this.f425x | 1);
                ((C39031d) this.f426y).mo86875c(this.f427z, (C37816b) this.f423E, (Composer) obj, iM87244L2);
                return C23454a0.f92919a;
        }
    }
}
