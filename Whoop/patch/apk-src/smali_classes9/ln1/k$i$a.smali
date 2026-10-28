.class final Lln1/k$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln1/k$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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


# instance fields
.field final synthetic w:Lj31/k;

.field final synthetic x:Lz1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj31/k;Lz1/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj31/k;",
            "Lz1/p;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lln1/k$i$a;->w:Lj31/k;

    iput-object p2, p0, Lln1/k$i$a;->x:Lz1/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lln1/k$i$a;->w:Lj31/k;

    invoke-virtual {p2}, Lj31/m;->v()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lln1/k$i$a;->x:Lz1/p;

    invoke-virtual {p2}, Lz1/p;->size()I

    move-result p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lln1/k$i$a;->x:Lz1/p;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lln1/k$i$a;->x:Lz1/p;

    invoke-virtual {p2}, Lz1/p;->clear()V

    iget-object p2, p0, Lln1/k$i$a;->x:Lz1/p;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p2, p1}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lln1/k$i$a;->x:Lz1/p;

    invoke-virtual {p2}, Lz1/p;->clear()V

    iget-object p2, p0, Lln1/k$i$a;->x:Lz1/p;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p2, p1}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lln1/k$i$a;->b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
