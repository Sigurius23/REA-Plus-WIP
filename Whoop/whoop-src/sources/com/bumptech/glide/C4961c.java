package com.bumptech.glide;

import al.C0960g;
import android.content.Context;
import android.content.ContextWrapper;
import io.sentry.hints.C20363j;
import java.util.List;
import p002a0.C0022g;
import p005a3.C0223l1;
import p249jc.C21567b;
import p684zk.C40787l;
import pl.C29341d;

/* JADX INFO: renamed from: com.bumptech.glide.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4961c extends ContextWrapper {

    /* JADX INFO: renamed from: j */
    public static final C4959a f20301j = new C4959a();

    /* JADX INFO: renamed from: a */
    public final C0960g f20302a;

    /* JADX INFO: renamed from: b */
    public final C0223l1 f20303b;

    /* JADX INFO: renamed from: c */
    public final C21567b f20304c;

    /* JADX INFO: renamed from: d */
    public final C20363j f20305d;

    /* JADX INFO: renamed from: e */
    public final List f20306e;

    /* JADX INFO: renamed from: f */
    public final C0022g f20307f;

    /* JADX INFO: renamed from: g */
    public final C40787l f20308g;

    /* JADX INFO: renamed from: h */
    public final int f20309h;

    /* JADX INFO: renamed from: i */
    public C29341d f20310i;

    public C4961c(Context context, C0960g c0960g, C0223l1 c0223l1, C21567b c21567b, C20363j c20363j, C0022g c0022g, List list, C40787l c40787l) {
        super(context.getApplicationContext());
        this.f20302a = c0960g;
        this.f20303b = c0223l1;
        this.f20304c = c21567b;
        this.f20305d = c20363j;
        this.f20306e = list;
        this.f20307f = c0022g;
        this.f20308g = c40787l;
        this.f20309h = 4;
    }
}
