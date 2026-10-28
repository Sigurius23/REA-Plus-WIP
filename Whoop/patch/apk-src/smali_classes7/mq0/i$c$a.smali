.class final Lmq0/i$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq0/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lmq0/i;


# direct methods
.method public constructor <init>(Lmq0/i;)V
    .locals 0

    iput-object p1, p0, Lmq0/i$c$a;->w:Lmq0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Li92/h;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li92/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Li92/h;->a()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lmq0/i$c$a;->w:Lmq0/i;

    invoke-static {p1}, Lmq0/i;->A(Lmq0/i;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lmq0/c;

    iget-object p2, p0, Lmq0/i$c$a;->w:Lmq0/i;

    invoke-static {p2}, Lmq0/i;->C(Lmq0/i;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object p2

    sget v1, Lxp0/d0;->R:I

    invoke-interface {p2, v1}, Lcom/whoop/data/repositories/StringsRepository;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object p2, p0, Lmq0/i$c$a;->w:Lmq0/i;

    invoke-static {p2}, Lmq0/i;->C(Lmq0/i;)Lcom/whoop/data/repositories/StringsRepository;

    move-result-object p2

    sget v2, Lxp0/d0;->u:I

    invoke-interface {p2, v2}, Lcom/whoop/data/repositories/StringsRepository;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lmq0/c;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p2, p0, Lmq0/i$c$a;->w:Lmq0/i;

    invoke-virtual {p2}, Lmq0/i;->G()Landroidx/lifecycle/p0;

    move-result-object v7

    move-object v4, v0

    new-instance v0, Lmq0/j;

    invoke-virtual {p1}, Li92/h;->a()Z

    move-result v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lmq0/j;-><init>(ZLjava/util/List;Ll83/k;Lmq0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p2, v7, v0}, Lmq0/i;->D(Lmq0/i;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li92/h;

    invoke-virtual {p0, p1, p2}, Lmq0/i$c$a;->b(Li92/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
