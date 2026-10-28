package kn2;

import ge3.AbstractC15751g;
import hi0.AbstractC17312j;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: kn2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lkn2/c;", "", "", "textResId", "<init>", "(Ljava/lang/String;II)V", "I", "getTextResId", "()I", "HARVARD", "GOOSE", "MAVERICK", "DISCONNECTED", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC22601c {
    HARVARD(AbstractC17312j.f66924F),
    GOOSE(AbstractC17312j.f66922E),
    MAVERICK(AbstractC17312j.f66926G),
    DISCONNECTED(0);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final int textResId;

    EnumC22601c(int i13) {
        this.textResId = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getTextResId() {
        return this.textResId;
    }
}
