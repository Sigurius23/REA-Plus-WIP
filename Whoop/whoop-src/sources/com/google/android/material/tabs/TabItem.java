package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p257jq.AbstractC21885a;
import p474s.C31983m2;

/* JADX INFO: loaded from: classes6.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: w */
    public final CharSequence f21052w;

    /* JADX INFO: renamed from: x */
    public final Drawable f21053x;

    /* JADX INFO: renamed from: y */
    public final int f21054y;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C31983m2 c31983m2M99478p = C31983m2.m99478p(context, attributeSet, AbstractC21885a.f84535L);
        TypedArray typedArray = (TypedArray) c31983m2M99478p.f132769x;
        this.f21052w = typedArray.getText(2);
        this.f21053x = c31983m2M99478p.m99486j(0);
        this.f21054y = typedArray.getResourceId(1, 0);
        c31983m2M99478p.m99491r();
    }
}
