.class final Li92/o$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li92/o;->f()Lxg3/g;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.network.UserWsKotlinBridge$setUserTimeZone$1$job$1"
    f = "UserWsKotlinBridge.kt"
    l = {
        0x1b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Li92/o;

.field final synthetic y:Lxg3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxg3/q;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li92/o;Lxg3/q;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li92/o;",
            "Lxg3/q;",
            "Lq83/d<",
            "-",
            "Li92/o$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li92/o$b;->x:Li92/o;

    iput-object p2, p0, Li92/o$b;->y:Lxg3/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Li92/o$b;

    iget-object v0, p0, Li92/o$b;->x:Li92/o;

    iget-object v1, p0, Li92/o$b;->y:Lxg3/q;

    invoke-direct {p1, v0, v1, p2}, Li92/o$b;-><init>(Li92/o;Lxg3/q;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Li92/o$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li92/o$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li92/o$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Li92/o$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v6, p0

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v6, Li92/o$b;->w:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Li92/o;->e:Li92/o$a;

    iget-object v2, v6, Li92/o$b;->x:Li92/o;

    invoke-static {v2}, Li92/o;->c(Li92/o;)Lc93/a;

    move-result-object v2

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move v3, v2

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v2

    const-string v4, "getDefault(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v6, Li92/o$b;->x:Li92/o;

    invoke-static {v4}, Li92/o;->e(Li92/o;)Lcom/whoop/service/network/UsersPreferenceApi;

    move-result-object v4

    iget-object v5, v6, Li92/o$b;->x:Li92/o;

    invoke-static {v5}, Li92/o;->d(Li92/o;)Ltr2/n;

    move-result-object v5

    iput v1, v6, Li92/o$b;->w:I

    move v1, v3

    move-object v3, v4

    move-object v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Li92/o$a;->a(ZLorg/joda/time/DateTimeZone;Lcom/whoop/service/network/UsersPreferenceApi;Ltr2/n;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_2

    return-object v7

    :cond_2
    :goto_0
    check-cast v0, Lu02/a;

    instance-of v0, v0, Lu02/a$c;

    if-eqz v0, :cond_3

    new-instance v7, Lcom/whoop/service/network/model/ProfileDto;

    const/16 v19, 0x7ff

    const/16 v20, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v7 .. v20}, Lcom/whoop/service/network/model/ProfileDto;-><init>(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7}, Lpg3/v0;->c(Ljava/lang/Object;)Lpg3/v0;

    move-result-object v0

    goto :goto_1

    :cond_3
    sget-object v0, Lud3/a1;->x:Lud3/z0;

    const-string v0, "Failed to set zone"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ldt/b;->k(Ljava/lang/String;Lud3/h0;)Lud3/z0;

    move-result-object v0

    const/16 v1, 0x28a

    invoke-static {v1, v0}, Lpg3/v0;->a(ILud3/a1;)Lpg3/v0;

    move-result-object v0

    :goto_1
    iget-object v1, v6, Li92/o$b;->y:Lxg3/q;

    check-cast v1, Lch3/w0;

    invoke-virtual {v1, v0}, Lch3/w0;->d(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
