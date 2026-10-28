.class public abstract Lvw2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lvw2/a;",
        "Lqw2/a;",
        "a",
        "(Lvw2/a;)Lqw2/a;",
        "whoop-action_release"
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
.method public static final a(Lvw2/a;)Lqw2/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lvw2/c;

    if-eqz v0, :cond_0

    new-instance v0, Lqw2/f;

    check-cast p0, Lvw2/c;

    invoke-virtual {p0}, Lvw2/c;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    invoke-direct {v0, p0}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
