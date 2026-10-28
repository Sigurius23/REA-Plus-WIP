package ca2;

import android.content.SharedPreferences;
import fi0.InterfaceC14515a;
import js0.AbstractC21909c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ca2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m65681d2 = {"Lca2/g;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lzr2/a;", "dateAndTimeProvider", "Lfi0/a;", "baseAnalytics", "Ljs0/c;", "configurationRepository", "Ltr2/n;", "logger", "<init>", "(Landroid/content/SharedPreferences;Lzr2/a;Lfi0/a;Ljs0/c;Ltr2/n;)V", "a", "Landroid/content/SharedPreferences;", "b", "Lzr2/a;", "c", "Lfi0/a;", "d", "Ljs0/c;", "e", "Ltr2/n;", "", "f", "J", "_startTimeMillis", "g", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4367g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long _startTimeMillis;

    public C4367g(SharedPreferences sharedPreferences, InterfaceC41070a dateAndTimeProvider, InterfaceC14515a baseAnalytics, AbstractC21909c configurationRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.sharedPreferences = sharedPreferences;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.baseAnalytics = baseAnalytics;
        this.configurationRepository = configurationRepository;
        this.logger = logger;
        this._startTimeMillis = dateAndTimeProvider.mo133363b();
    }
}
