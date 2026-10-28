.class final Lcr1/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcr1/c;->l(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "Lcr1/b;",
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
    c = "com.whoop.integrations.domain.IntegrationsInteractor$disconnect3PIntegration$2"
    f = "IntegrationsInteractor.kt"
    l = {
        0x6a,
        0x6c,
        0x71,
        0x72,
        0x6b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Lcr1/c;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcr1/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcr1/c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcr1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcr1/c$a;->H:Lcr1/c;

    iput-object p2, p0, Lcr1/c$a;->I:Ljava/lang/String;

    iput-object p3, p0, Lcr1/c$a;->J:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lcr1/c$a;

    iget-object v1, p0, Lcr1/c$a;->H:Lcr1/c;

    iget-object v2, p0, Lcr1/c$a;->I:Ljava/lang/String;

    iget-object v3, p0, Lcr1/c$a;->J:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lcr1/c$a;-><init>(Lcr1/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lcr1/c$a;->G:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcr1/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcr1/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcr1/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcr1/c$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    iget-object v0, p0, Lcr1/c$a;->G:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcr1/c$a;->F:I

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_6

    if-eq v0, v2, :cond_5

    if-eq v0, v1, :cond_4

    if-eq v0, v12, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcr1/c$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lcr1/c$a;->w:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_3

    :cond_2
    iget v0, p0, Lcr1/c$a;->E:I

    iget-object v1, p0, Lcr1/c$a;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, p0, Lcr1/c$a;->y:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, p0, Lcr1/c$a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcr1/c$a;->w:Ljava/lang/Object;

    check-cast v3, Lcr1/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v4, v0

    :cond_3
    move-object v0, v1

    goto/16 :goto_2

    :cond_4
    iget-object v0, p0, Lcr1/c$a;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v0

    move-object/from16 v0, p1

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lcr1/b$h;

    sget-object v3, Lcr1/d;->DISCONNECT:Lcr1/d;

    invoke-direct {v0, v3}, Lcr1/b$h;-><init>(Lcr1/d;)V

    iput-object v8, p0, Lcr1/c$a;->G:Ljava/lang/Object;

    iput v2, p0, Lcr1/c$a;->F:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto/16 :goto_5

    :cond_7
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lcr1/c$a;->H:Lcr1/c;

    invoke-static {v2}, Lcr1/c;->h(Lcr1/c;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lcr1/c$a$a;

    iget-object v3, p0, Lcr1/c$a;->H:Lcr1/c;

    iget-object v6, p0, Lcr1/c$a;->I:Ljava/lang/String;

    invoke-direct {v4, v3, v6, v13}, Lcr1/c$a$a;-><init>(Lcr1/c;Ljava/lang/String;Lq83/d;)V

    iput-object v8, p0, Lcr1/c$a;->G:Ljava/lang/Object;

    iput-object v8, p0, Lcr1/c$a;->w:Ljava/lang/Object;

    iput v1, p0, Lcr1/c$a;->F:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    goto :goto_5

    :cond_8
    move-object v1, v8

    :goto_1
    iget-object v3, p0, Lcr1/c$a;->H:Lcr1/c;

    iget-object v2, p0, Lcr1/c$a;->J:Ljava/lang/String;

    check-cast v0, Lu02/a;

    instance-of v4, v0, Lu02/a$c;

    if-eqz v4, :cond_a

    sget-object v0, Lcr1/b$k;->a:Lcr1/b$k;

    iput-object v13, p0, Lcr1/c$a;->G:Ljava/lang/Object;

    iput-object v3, p0, Lcr1/c$a;->w:Ljava/lang/Object;

    iput-object v2, p0, Lcr1/c$a;->x:Ljava/lang/Object;

    iput-object v13, p0, Lcr1/c$a;->y:Ljava/lang/Object;

    iput-object v1, p0, Lcr1/c$a;->z:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lcr1/c$a;->E:I

    iput v12, p0, Lcr1/c$a;->F:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_3

    goto :goto_5

    :goto_2
    new-instance v1, Lcr1/c$a$b;

    invoke-direct {v1, v3, v2, v13}, Lcr1/c$a$b;-><init>(Lcr1/c;Ljava/lang/String;Lq83/d;)V

    iput-object v13, p0, Lcr1/c$a;->G:Ljava/lang/Object;

    iput-object v13, p0, Lcr1/c$a;->w:Ljava/lang/Object;

    iput-object v0, p0, Lcr1/c$a;->x:Ljava/lang/Object;

    iput-object v13, p0, Lcr1/c$a;->y:Ljava/lang/Object;

    iput-object v13, p0, Lcr1/c$a;->z:Ljava/lang/Object;

    iput v4, p0, Lcr1/c$a;->E:I

    iput v11, p0, Lcr1/c$a;->F:I

    const-wide/16 v2, 0x5dc

    invoke-static {v2, v3, v1, p0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_9

    goto :goto_5

    :cond_9
    :goto_3
    check-cast v1, Lcr1/b;

    move-object v14, v1

    move-object v1, v0

    move-object v0, v14

    goto :goto_4

    :cond_a
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_c

    sget-object v0, Lcr1/b$a;->a:Lcr1/b$a;

    :goto_4
    iput-object v13, p0, Lcr1/c$a;->G:Ljava/lang/Object;

    iput-object v13, p0, Lcr1/c$a;->w:Ljava/lang/Object;

    iput-object v13, p0, Lcr1/c$a;->x:Ljava/lang/Object;

    iput v10, p0, Lcr1/c$a;->F:I

    invoke-interface {v1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_b

    :goto_5
    return-object v9

    :cond_b
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
