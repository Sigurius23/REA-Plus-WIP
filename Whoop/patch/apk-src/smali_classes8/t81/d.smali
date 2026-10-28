.class public abstract Lt81/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a4\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lu2/v;",
        "Lkotlin/Function3;",
        "Lh2/b;",
        "",
        "",
        "Ll83/a0;",
        "onGesture",
        "a",
        "(Lu2/v;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;",
        "design_release"
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
.method public static final a(Lu2/v;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "Lkotlin/jvm/functions/Function3;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lt81/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lt81/d$a;-><init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V

    invoke-static {p0, v0, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
