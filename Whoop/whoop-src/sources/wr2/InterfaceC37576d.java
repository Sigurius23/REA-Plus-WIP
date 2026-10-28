package wr2;

import java.util.List;
import m83.C25271y;
import or2.C28173j1;
import p715kotlin.Metadata;
import yb3.C39412p;

/* JADX INFO: renamed from: wr2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lwr2/d;", "", "", "e", "()Ljava/lang/String;", "userFacingText", "", "b", "()Ljava/util/List;", "userFacingKeywords", "", "c", "()Ljava/lang/Iterable;", "metadataKeywords", "Lyb3/p;", "a", "()Lyb3/p;", "searchQueryDelimiter", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC37576d {
    /* JADX INFO: renamed from: a */
    default C39412p getSearchQueryDelimiter() {
        return C28173j1.f113890a.m85285c();
    }

    /* JADX INFO: renamed from: b */
    default List<String> mo30154b() {
        return getSearchQueryDelimiter().m125854h(getUserFacingText());
    }

    /* JADX INFO: renamed from: c */
    default Iterable<String> mo30155c() {
        return C25271y.f99162w;
    }

    /* JADX INFO: renamed from: e */
    String getUserFacingText();
}
