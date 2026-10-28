.class public abstract Las1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "autoSaveEnabled",
        "hasUserEditJournal",
        "Las1/a;",
        "a",
        "(ZZ)Las1/a;",
        "journal_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(ZZ)Las1/a;
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-object p0, Las1/a;->FULL_SAVE:Las1/a;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    sget-object p0, Las1/a;->EXIT_IMMEDIATELY:Las1/a;

    return-object p0

    :cond_1
    sget-object p0, Las1/a;->SHOW_DISMISS_DIALOG:Las1/a;

    return-object p0
.end method
