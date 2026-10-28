package cz0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p181h2.C16618c;

/* JADX INFO: renamed from: cz0.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11249j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C16618c f36084E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f36085F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36086w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f36087x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f36088y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16618c f36089z;

    public /* synthetic */ C11249j(float f13, List list, C16618c c16618c, C16618c c16618c2, int i13) {
        this.f36087x = f13;
        this.f36088y = list;
        this.f36089z = c16618c;
        this.f36084E = c16618c2;
        this.f36085F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36086w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                float f13 = this.f36087x;
                List list = this.f36088y;
                return AbstractC11254o.m30379k(this.f36089z, this.f36084E, f13, list, this.f36085F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC11254o.m30383o(this.f36087x, this.f36088y, this.f36089z, this.f36084E, this.f36085F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C11249j(C16618c c16618c, C16618c c16618c2, float f13, List list, int i13) {
        this.f36089z = c16618c;
        this.f36084E = c16618c2;
        this.f36087x = f13;
        this.f36088y = list;
        this.f36085F = i13;
    }
}
