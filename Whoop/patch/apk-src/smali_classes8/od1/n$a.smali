.class public final Lod1/n$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod1/n;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.domain.SelectActivityTypeInteractor$interact$$inlined$flatMapLatest$1"
    f = "SelectActivityTypeInteractor.kt"
    l = {
        0xbf,
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

.field final synthetic z:Lod1/n;


# direct methods
.method public constructor <init>(Lq83/d;Lod1/n;)V
    .locals 0

    iput-object p2, p0, Lod1/n$a;->z:Lod1/n;

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
            "Lod1/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lod1/n$a;

    iget-object v1, p0, Lod1/n$a;->z:Lod1/n;

    invoke-direct {v0, p3, v1}, Lod1/n$a;-><init>(Lq83/d;Lod1/n;)V

    iput-object p1, v0, Lod1/n$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lod1/n$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lod1/n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lod1/n$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lod1/n$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lod1/n$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lod1/n$a;->G:Ljava/lang/Object;

    check-cast v1, Lod1/l;

    iget-object v1, p0, Lod1/n$a;->F:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lod1/n$a;->E:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lod1/n$a;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lod1/n$a;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lod1/n$a;->y:Ljava/lang/Object;

    check-cast p1, Lod1/l;

    instance-of v5, p1, Lod1/l$a;

    if-eqz v5, :cond_4

    iget-object v5, p0, Lod1/n$a;->z:Lod1/n;

    check-cast p1, Lod1/l$a;

    invoke-virtual {p1}, Lod1/l$a;->a()Ln82/a;

    move-result-object v6

    invoke-virtual {p1}, Lod1/l$a;->b()Z

    move-result p1

    iput-object v4, p0, Lod1/n$a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lod1/n$a;->y:Ljava/lang/Object;

    iput-object v1, p0, Lod1/n$a;->E:Ljava/lang/Object;

    iput-object v4, p0, Lod1/n$a;->F:Ljava/lang/Object;

    iput-object v4, p0, Lod1/n$a;->G:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, p0, Lod1/n$a;->H:I

    iput v3, p0, Lod1/n$a;->w:I

    invoke-static {v5, v6, p1, p0}, Lod1/n;->e(Lod1/n;Ln82/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lec3/l;

    goto :goto_1

    :cond_4
    instance-of v3, p1, Lod1/l$b;

    if-eqz v3, :cond_6

    new-instance v5, Lod1/i$b;

    check-cast p1, Lod1/l$b;

    invoke-virtual {p1}, Lod1/l$b;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lod1/l$b;->a()Ln82/a;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lod1/i$b;-><init>(Ljava/lang/String;Ln82/a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, La6/u;

    const/4 v3, 0x1

    invoke-direct {p1, v5, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_1
    iput-object v4, p0, Lod1/n$a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lod1/n$a;->y:Ljava/lang/Object;

    iput-object v4, p0, Lod1/n$a;->E:Ljava/lang/Object;

    iput-object v4, p0, Lod1/n$a;->F:Ljava/lang/Object;

    iput-object v4, p0, Lod1/n$a;->G:Ljava/lang/Object;

    iput v2, p0, Lod1/n$a;->w:I

    invoke-static {v1, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
