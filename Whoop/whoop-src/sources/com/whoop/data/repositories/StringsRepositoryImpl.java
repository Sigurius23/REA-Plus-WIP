package com.whoop.data.repositories;

import android.content.Context;
import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0016J+\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/data/repositories/StringsRepositoryImpl;", "Lcom/whoop/data/repositories/StringsRepository;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getString", "", "resourceId", "", "args", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StringsRepositoryImpl implements StringsRepository {
    public static final int $stable = 8;
    private final Context context;

    public StringsRepositoryImpl(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    @Override // com.whoop.data.repositories.StringsRepository
    public String getString(int resourceId) {
        String string = this.context.getString(resourceId);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    @Override // com.whoop.data.repositories.StringsRepository
    public String getString(int resourceId, Object... args) {
        AbstractC22676k.m65750j(args, "args");
        String string = this.context.getString(resourceId, Arrays.copyOf(args, args.length));
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }
}
