package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p444r.InterfaceC30832z;
import p444r.MenuC30818l;

/* JADX INFO: loaded from: classes6.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC30832z {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // p444r.InterfaceC30832z
    /* JADX INFO: renamed from: b */
    public final void mo3256b(MenuC30818l menuC30818l) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
