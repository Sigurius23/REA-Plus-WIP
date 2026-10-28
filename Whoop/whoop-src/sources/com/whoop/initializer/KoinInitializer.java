package com.whoop.initializer;

import android.app.Application;
import android.content.Context;
import androidx.work.WorkManagerInitializer;
import java.util.List;
import nf3.C26670b;
import p644yb.InterfaceC39377b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32929k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/initializer/KoinInitializer;", "Lyb/b;", "Lnf3/b;", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Lnf3/b;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class KoinInitializer implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C26670b create(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return AbstractC32929k.m103807a((Application) context);
    }

    @Override // p644yb.InterfaceC39377b
    public List<Class<? extends InterfaceC39377b>> dependencies() {
        return AbstractC37056f.m118958J(WorkManagerInitializer.class);
    }
}
