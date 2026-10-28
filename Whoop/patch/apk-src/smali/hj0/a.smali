.class public abstract Lhj0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Ll83/a0;",
        "a",
        "(Landroidx/fragment/app/m0;Lq83/d;)Ljava/lang/Object;",
        "app_prodStandardRelease"
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
.method public static final a(Landroidx/fragment/app/m0;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/m0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Lhj0/a$b;

    invoke-direct {p1, v0}, Lhj0/a$b;-><init>(Lbc3/k;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwnerLiveData()Landroidx/lifecycle/p0;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    new-instance v1, Lhj0/a$a;

    invoke-direct {v1, p0, p1}, Lhj0/a$a;-><init>(Landroidx/fragment/app/m0;Landroidx/lifecycle/v0;)V

    invoke-virtual {v0, v1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
