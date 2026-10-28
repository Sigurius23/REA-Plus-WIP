package vg0;

import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: vg0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, m65681d2 = {"Lvg0/e;", "", "", "isError", "isLoading", "", "Lvg0/f;", "sections", "", "nextToken", "<init>", "(ZZLjava/util/List;Ljava/lang/String;)V", "a", "(ZZLjava/util/List;Ljava/lang/String;)Lvg0/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "e", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "getNextToken", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35984e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C35986f> sections;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String nextToken;

    public C35984e(boolean z4, boolean z13, List<C35986f> sections, String str) {
        AbstractC22676k.m65750j(sections, "sections");
        this.isError = z4;
        this.isLoading = z13;
        this.sections = sections;
        this.nextToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35984e m114271b(C35984e c35984e, boolean z4, boolean z13, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c35984e.isError;
        }
        if ((i13 & 2) != 0) {
            z13 = c35984e.isLoading;
        }
        if ((i13 & 4) != 0) {
            list = c35984e.sections;
        }
        if ((i13 & 8) != 0) {
            str = c35984e.nextToken;
        }
        return c35984e.m114272a(z4, z13, list, str);
    }

    /* JADX INFO: renamed from: a */
    public final C35984e m114272a(boolean isError, boolean isLoading, List<C35986f> sections, String nextToken) {
        AbstractC22676k.m65750j(sections, "sections");
        return new C35984e(isError, isLoading, sections, nextToken);
    }

    /* JADX INFO: renamed from: c */
    public final List<C35986f> m114273c() {
        return this.sections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35984e)) {
            return false;
        }
        C35984e c35984e = (C35984e) other;
        return this.isError == c35984e.isError && this.isLoading == c35984e.isLoading && AbstractC22676k.m65745e(this.sections, c35984e.sections) && AbstractC22676k.m65745e(this.nextToken, c35984e.nextToken);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(Boolean.hashCode(this.isError) * 31, 31, this.isLoading), 31, this.sections);
        String str = this.nextToken;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z4 = this.isError;
        boolean z13 = this.isLoading;
        return AbstractC38963t7.m124377g(", nextToken=", this.nextToken, ")", AbstractC11895b.m32002u("AiChatHistoryResult(isError=", ", isLoading=", ", sections=", z4, z13), this.sections);
    }

    public /* synthetic */ C35984e(boolean z4, boolean z13, List list, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : str);
    }
}
