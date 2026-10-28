.class public final Lug1/c$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/c;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$interact$$inlined$flatMapLatest$1"
    f = "DfuUpdateStrategy.kt"
    l = {
        0xc1,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lug1/c;


# direct methods
.method public constructor <init>(Lq83/d;Lug1/c;)V
    .locals 0

    iput-object p2, p0, Lug1/c$d;->z:Lug1/c;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lug1/j;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lug1/c$d;

    iget-object v1, p0, Lug1/c$d;->z:Lug1/c;

    invoke-direct {v0, p3, v1}, Lug1/c$d;-><init>(Lq83/d;Lug1/c;)V

    iput-object p1, v0, Lug1/c$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lug1/c$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lug1/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lug1/c$d;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lug1/c$d;->w:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lug1/c$d;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lug1/c$d;->G:Ljava/lang/Object;

    check-cast v1, Lug1/j;

    iget-object v1, p0, Lug1/c$d;->F:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lug1/c$d;->E:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, p0, Lug1/c$d;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lug1/c$d;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lug1/c$d;->y:Ljava/lang/Object;

    check-cast p1, Lug1/j;

    instance-of v5, p1, Lug1/j$h;

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    iget-object v5, p0, Lug1/c$d;->z:Lug1/c;

    check-cast p1, Lug1/j$h;

    invoke-virtual {p1}, Lug1/j$h;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v7

    invoke-virtual {p1}, Lug1/j$h;->b()Ljava/lang/String;

    move-result-object p1

    iput-object v4, p0, Lug1/c$d;->x:Ljava/lang/Object;

    iput-object v4, p0, Lug1/c$d;->y:Ljava/lang/Object;

    iput-object v1, p0, Lug1/c$d;->E:Ljava/lang/Object;

    iput-object v4, p0, Lug1/c$d;->F:Ljava/lang/Object;

    iput-object v4, p0, Lug1/c$d;->G:Ljava/lang/Object;

    iput v6, p0, Lug1/c$d;->H:I

    iput v2, p0, Lug1/c$d;->w:I

    invoke-static {v5, v7, p1, p0}, Lug1/c;->m(Lug1/c;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_3
    instance-of v2, p1, Lug1/j$g;

    if-eqz v2, :cond_4

    sget-object p1, Lgt0/h$e;->b:Lgt0/h$e;

    new-instance v2, La6/u;

    const/4 v5, 0x1

    invoke-direct {v2, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object p1, v2

    goto :goto_1

    :cond_4
    instance-of p1, p1, Lug1/j$d;

    if-eqz p1, :cond_5

    sget-object p1, Lgt0/h$c;->b:Lgt0/h$c;

    new-instance v2, La6/u;

    const/4 v5, 0x1

    invoke-direct {v2, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_5
    new-instance p1, Lgt0/h$b;

    sget-object v2, Lgt0/f$g;->b:Lgt0/f$g;

    invoke-direct {p1, v2, v6, v3, v4}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, La6/u;

    const/4 v5, 0x1

    invoke-direct {v2, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_6
    :goto_1
    check-cast p1, Lec3/l;

    iput-object v4, p0, Lug1/c$d;->x:Ljava/lang/Object;

    iput-object v4, p0, Lug1/c$d;->y:Ljava/lang/Object;

    iput-object v4, p0, Lug1/c$d;->E:Ljava/lang/Object;

    iput-object v4, p0, Lug1/c$d;->F:Ljava/lang/Object;

    iput-object v4, p0, Lug1/c$d;->G:Ljava/lang/Object;

    iput v3, p0, Lug1/c$d;->w:I

    invoke-static {v1, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
