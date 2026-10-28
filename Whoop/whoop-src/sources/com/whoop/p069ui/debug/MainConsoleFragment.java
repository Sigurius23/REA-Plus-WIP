package com.whoop.p069ui.debug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl2.C3374c;
import ge3.AbstractC15751g;
import hi0.AbstractC17307e;
import hi0.AbstractC17308f;
import hj0.AbstractC17348g;
import java.util.List;
import mm2.C25701d;
import p108e4.AbstractC12667a;
import tr2.C34106d;
import zg3.C40634a;

/* JADX INFO: loaded from: classes10.dex */
public class MainConsoleFragment extends AbstractC17348g {

    /* JADX INFO: renamed from: F */
    private C10469a f31673F;

    /* JADX INFO: renamed from: G */
    private C25701d f31674G;

    /* JADX INFO: renamed from: com.whoop.ui.debug.MainConsoleFragment$a */
    public static class C10469a {

        /* JADX INFO: renamed from: a */
        RecyclerView f31675a;

        public C10469a(View view) {
            this.f31675a = (RecyclerView) view.findViewById(AbstractC17307e.f66645R1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m26761F(List list) {
        boolean z4 = ((LinearLayoutManager) this.f31673F.f31675a.getLayoutManager()).findLastCompletelyVisibleItemPosition() == this.f31674G.size() - 1;
        this.f31674G.addAll(list);
        if (z4) {
            this.f31673F.f31675a.scrollToPosition(this.f31674G.size() - 1);
        }
    }

    @Override // hj0.AbstractC17348g
    /* JADX INFO: renamed from: A */
    public String mo26762A() {
        return "Main Console";
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC17308f.f66887i, viewGroup, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f31673F = new C10469a(view);
        C25701d c25701d = new C25701d();
        this.f31674G = c25701d;
        AbstractC12667a.m35467s(c25701d, this.f31673F.f31675a);
        m49109z(((C34106d) AbstractC15751g.m44472y(C34106d.class, null, null)).m107803c().m122655E().m122652B(C40634a.m131874a()).m122661K(new C3374c(this, 8)));
    }
}
