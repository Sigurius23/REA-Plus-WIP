.class public abstract Ltk2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltk2/p$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lmk2/j;",
        "Ltk2/o;",
        "a",
        "(Lmk2/j;)Ltk2/o;",
        "track-activity_release"
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
.method public static final a(Lmk2/j;)Ltk2/o;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltk2/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    new-instance p0, Ltk2/o;

    sget v0, Lkk2/c;->b:I

    sget v1, Lkk2/d;->S:I

    sget v2, Lkk2/d;->R:I

    sget v3, Lkk2/d;->Q:I

    invoke-direct {p0, v0, v1, v2, v3}, Ltk2/o;-><init>(IIII)V

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Not sleep content"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ltk2/o;

    sget v0, Lkk2/c;->a:I

    sget v1, Lkk2/d;->F:I

    sget v2, Lkk2/d;->E:I

    sget v3, Lkk2/d;->Q:I

    invoke-direct {p0, v0, v1, v2, v3}, Ltk2/o;-><init>(IIII)V

    return-object p0
.end method
