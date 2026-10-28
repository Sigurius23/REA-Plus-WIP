.class public abstract Lsl0/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlin/Function1;",
        "",
        "Landroid/net/Uri;",
        "Ll83/a0;",
        "onResult",
        "Lsl0/r1;",
        "a",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lsl0/r1;",
        "bot_release"
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
.method public static final a(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lsl0/r1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lsl0/r1;"
        }
    .end annotation

    const-string v0, "onResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;-><init>()V

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-static {v0, p0, p1, p2}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object p0

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_0

    new-instance p2, Lsl0/s1$a;

    invoke-direct {p2, p0}, Lsl0/s1$a;-><init>(Lh/i;)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p2, Lsl0/s1$a;

    return-object p2
.end method
