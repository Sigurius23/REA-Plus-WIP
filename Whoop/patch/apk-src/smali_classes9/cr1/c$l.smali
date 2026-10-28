.class final Lcr1/c$l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcr1/c;->u(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
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
    c = "com.whoop.integrations.domain.IntegrationsInteractor$updatePrivacyControl$1"
    f = "IntegrationsInteractor.kt"
    l = {
        0x97,
        0x99,
        0xa2,
        0x98
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lcr1/c;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Z

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lcr1/c;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcr1/c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcr1/c$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcr1/c$l;->F:Lcr1/c;

    iput-object p2, p0, Lcr1/c$l;->G:Ljava/lang/String;

    iput-object p3, p0, Lcr1/c$l;->H:Ljava/lang/String;

    iput-boolean p4, p0, Lcr1/c$l;->I:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcr1/c$l;

    iget-object v1, p0, Lcr1/c$l;->F:Lcr1/c;

    iget-object v2, p0, Lcr1/c$l;->G:Ljava/lang/String;

    iget-object v3, p0, Lcr1/c$l;->H:Ljava/lang/String;

    iget-boolean v4, p0, Lcr1/c$l;->I:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcr1/c$l;-><init>(Lcr1/c;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V

    iput-object p1, v0, Lcr1/c$l;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcr1/c$l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcr1/c$l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcr1/c$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcr1/c$l;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v5, p0

    iget-object v0, v5, Lcr1/c$l;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lcr1/c$l;->z:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lcr1/c$l;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, v5, Lcr1/c$l;->w:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v0

    move-object/from16 v0, p1

    goto/16 :goto_2

    :cond_2
    iget-object v0, v5, Lcr1/c$l;->w:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lcr1/b$h;

    invoke-direct {v0, v12, v2, v12}, Lcr1/b$h;-><init>(Lcr1/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v5, Lcr1/c$l;->E:Ljava/lang/Object;

    iput v2, v5, Lcr1/c$l;->z:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_4

    :cond_5
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lcr1/c$l;->F:Lcr1/c;

    invoke-static {v2}, Lcr1/c;->h(Lcr1/c;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lcr1/c$l$a;

    iget-object v14, v5, Lcr1/c$l;->F:Lcr1/c;

    iget-object v15, v5, Lcr1/c$l;->G:Ljava/lang/String;

    iget-object v3, v5, Lcr1/c$l;->H:Ljava/lang/String;

    iget-boolean v6, v5, Lcr1/c$l;->I:Z

    const/16 v18, 0x0

    move-object/from16 v16, v3

    move-object v13, v4

    move/from16 v17, v6

    invoke-direct/range {v13 .. v18}, Lcr1/c$l$a;-><init>(Lcr1/c;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V

    iput-object v12, v5, Lcr1/c$l;->E:Ljava/lang/Object;

    iput-object v8, v5, Lcr1/c$l;->w:Ljava/lang/Object;

    iput v1, v5, Lcr1/c$l;->z:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    iget-object v1, v5, Lcr1/c$l;->F:Lcr1/c;

    iget-object v2, v5, Lcr1/c$l;->G:Ljava/lang/String;

    check-cast v0, Lu02/a;

    instance-of v3, v0, Lu02/a$c;

    if-eqz v3, :cond_8

    iput-object v12, v5, Lcr1/c$l;->E:Ljava/lang/Object;

    iput-object v12, v5, Lcr1/c$l;->w:Ljava/lang/Object;

    iput-object v8, v5, Lcr1/c$l;->x:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, v5, Lcr1/c$l;->y:I

    iput v11, v5, Lcr1/c$l;->z:I

    invoke-static {v1, v2, v5}, Lcr1/c;->c(Lcr1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast v0, Lcr1/b;

    goto :goto_3

    :cond_8
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_a

    sget-object v0, Lcr1/b$j;->a:Lcr1/b$j;

    :goto_3
    iput-object v12, v5, Lcr1/c$l;->E:Ljava/lang/Object;

    iput-object v12, v5, Lcr1/c$l;->w:Ljava/lang/Object;

    iput-object v12, v5, Lcr1/c$l;->x:Ljava/lang/Object;

    iput v10, v5, Lcr1/c$l;->z:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    :goto_4
    return-object v9

    :cond_9
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
