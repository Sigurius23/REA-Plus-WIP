.class public abstract Ly12/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ly12/a;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Ly12/a;",
        "onboarding-personalization_release"
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
.method public static final a(Landroidx/compose/runtime/Composer;I)Ly12/a;
    .locals 1

    check-cast p0, Lp1/q;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p1, v0, :cond_0

    new-instance p1, Ly12/a;

    invoke-direct {p1}, Ly12/a;-><init>()V

    invoke-virtual {p0, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p1, Ly12/a;

    return-object p1
.end method
