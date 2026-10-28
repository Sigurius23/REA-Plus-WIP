.class final Lza0/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza0/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lza0/a;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor$interact$1$1"
    f = "BiomarkerDetailsInteractor.kt"
    l = {
        0x23,
        0x25,
        0x28
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lza0/b;


# direct methods
.method public constructor <init>(Lza0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/b;",
            "Lq83/d<",
            "-",
            "Lza0/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lza0/d$e;->y:Lza0/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lza0/d$e;

    iget-object v1, p0, Lza0/d$e;->y:Lza0/b;

    invoke-direct {v0, v1, p2}, Lza0/d$e;-><init>(Lza0/b;Lq83/d;)V

    iput-object p1, v0, Lza0/d$e;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lza0/d$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lza0/d$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lza0/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lza0/d$e;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lza0/d$e;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lza0/d$e;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v6

    iget-object v6, p0, Lza0/d$e;->y:Lza0/b;

    instance-of v2, v6, Lza0/b$b;

    if-eqz v2, :cond_5

    check-cast v6, Lza0/b$b;

    invoke-virtual {v6}, Lza0/b$b;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v6, Lza0/a;

    iget-object v7, p0, Lza0/d$e;->y:Lza0/b;

    const/16 v11, 0xa

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lza0/a;-><init>(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lza0/d$e;->x:Ljava/lang/Object;

    iput p1, p0, Lza0/d$e;->w:I

    invoke-interface {v0, v6, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    new-instance v6, Lza0/a;

    iget-object v7, p0, Lza0/d$e;->y:Lza0/b;

    const/16 v11, 0xa

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lza0/a;-><init>(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, p0, Lza0/d$e;->x:Ljava/lang/Object;

    iput v5, p0, Lza0/d$e;->w:I

    invoke-interface {v0, v6, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_5
    instance-of p1, v6, Lza0/b$a;

    if-eqz p1, :cond_7

    new-instance v5, Lza0/a;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lza0/a;-><init>(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, p0, Lza0/d$e;->x:Ljava/lang/Object;

    iput v4, p0, Lza0/d$e;->w:I

    invoke-interface {v0, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
