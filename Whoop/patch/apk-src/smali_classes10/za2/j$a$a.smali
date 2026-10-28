.class final Lza2/j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza2/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lza2/j;

.field final synthetic x:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lza2/j;Lp1/t2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza2/j;",
            "Lp1/t2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lza2/j$a$a;->w:Lza2/j;

    iput-object p2, p0, Lza2/j$a$a;->x:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lza2/g;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza2/g;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lza2/g$a;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lza2/j$a$a;->w:Lza2/j;

    invoke-static {p2}, Lza2/j;->G(Lza2/j;)Leb2/a;

    move-result-object p2

    new-instance v0, Lza2/m$a;

    check-cast p1, Lza2/g$a;

    invoke-virtual {p1}, Lza2/g$a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lza2/m$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-virtual {p2, v0}, Leb2/a;->i(Lza2/m;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object p2, p0, Lza2/j$a$a;->x:Lp1/t2;

    invoke-static {p2}, Lza2/j;->I(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lza2/g;

    invoke-virtual {p0, p1, p2}, Lza2/j$a$a;->b(Lza2/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
