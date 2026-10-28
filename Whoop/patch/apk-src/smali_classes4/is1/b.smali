.class public final Lis1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lis1/b;",
        "",
        "<init>",
        "()V",
        "Lfs1/c;",
        "domainResult",
        "Lhs1/c;",
        "a",
        "(Lfs1/c;)Lhs1/c;",
        "journal-home-tile-mini-arch_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfs1/c;)Lhs1/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lfs1/c$a;

    if-eqz v0, :cond_0

    sget-object p1, Lhs1/c$a;->b:Lhs1/c$a;

    return-object p1

    :cond_0
    sget-object v0, Lfs1/c$b;->a:Lfs1/c$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lhs1/c$b;->b:Lhs1/c$b;

    return-object p1

    :cond_1
    instance-of v0, p1, Lfs1/c$c;

    if-eqz v0, :cond_2

    new-instance v0, Lhs1/c$c;

    invoke-static {}, Lis1/a;->d()Ljb1/a;

    move-result-object v1

    check-cast p1, Lfs1/c$c;

    invoke-virtual {p1}, Lfs1/c$c;->a()Lcom/whoop/journalhometile/domain/model/JournalHomeTileResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileResponse;->getTile()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lhs1/c$c;-><init>(Lm91/u;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
