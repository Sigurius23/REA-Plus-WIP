.class final synthetic Lzd1/c$a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd1/c;-><init>(Lxd1/c;Lod1/n;Lzd1/a;Lbc3/c0;Lzr2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "interact(Lcom/whoop/edit/domain/EditActivityDomainState;Lcom/whoop/edit/domain/EditActivityDomainAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v2, 0x0

    const/4 v1, 0x3

    const-class v3, Lxd1/c;

    const-string v5, "interact"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lxd1/b;Lxd1/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd1/b;",
            "Lxd1/a;",
            "Lq83/d<",
            "-",
            "Lxd1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lxd1/c;

    invoke-virtual {v0, p1, p2, p3}, Lxd1/c;->q(Lxd1/b;Lxd1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxd1/b;

    check-cast p2, Lxd1/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lzd1/c$a;->a(Lxd1/b;Lxd1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
