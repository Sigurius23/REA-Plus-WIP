.class final Lcs1/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcs1/a;-><init>(Lsr2/y;Lur1/h;Lds1/l;Lyr1/f;Lcs1/b;Lbc3/c0;)V
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
        "Lcs1/c;",
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
    c = "com.whoop.journal.viewmodel.JournalSurveyAnswerViewModel$domainState$1"
    f = "JournalSurveyAnswerViewModel.kt"
    l = {
        0x64,
        0x6d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcs1/a;


# direct methods
.method public constructor <init>(Lcs1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcs1/a;",
            "Lq83/d<",
            "-",
            "Lcs1/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcs1/a$b;->y:Lcs1/a;

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

    new-instance v0, Lcs1/a$b;

    iget-object v1, p0, Lcs1/a$b;->y:Lcs1/a;

    invoke-direct {v0, v1, p2}, Lcs1/a$b;-><init>(Lcs1/a;Lq83/d;)V

    iput-object p1, v0, Lcs1/a$b;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcs1/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcs1/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcs1/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcs1/a$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcs1/a$b;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lcs1/a$b;->w:I

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    if-ne v3, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v6, Lcs1/c$j;

    iget-object v3, v0, Lcs1/a$b;->y:Lcs1/a;

    invoke-static {v3}, Lcs1/a;->j(Lcs1/a;)Lcs1/b;

    move-result-object v3

    invoke-virtual {v3}, Lcs1/b;->c()Ljava/lang/String;

    move-result-object v7

    iget-object v3, v0, Lcs1/a$b;->y:Lcs1/a;

    invoke-static {v3}, Lcs1/a;->j(Lcs1/a;)Lcs1/b;

    move-result-object v3

    invoke-virtual {v3}, Lcs1/b;->a()J

    move-result-wide v8

    iget-object v3, v0, Lcs1/a$b;->y:Lcs1/a;

    invoke-static {v3}, Lcs1/a;->j(Lcs1/a;)Lcs1/b;

    move-result-object v3

    invoke-virtual {v3}, Lcs1/b;->e()Z

    move-result v10

    iget-object v3, v0, Lcs1/a$b;->y:Lcs1/a;

    invoke-static {v3}, Lcs1/a;->j(Lcs1/a;)Lcs1/b;

    move-result-object v3

    invoke-virtual {v3}, Lcs1/b;->d()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    const-string v3, ""

    :cond_3
    move-object v11, v3

    iget-object v3, v0, Lcs1/a$b;->y:Lcs1/a;

    invoke-static {v3}, Lcs1/a;->j(Lcs1/a;)Lcs1/b;

    move-result-object v3

    invoke-virtual {v3}, Lcs1/b;->b()Ljava/lang/String;

    move-result-object v12

    const/16 v16, 0xe0

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v17}, Lcs1/c$j;-><init>(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;ZZLyr1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lcs1/a$b;->x:Ljava/lang/Object;

    iput v4, v0, Lcs1/a$b;->w:I

    invoke-interface {v1, v6, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    new-instance v3, Lcs1/c$i;

    iget-object v4, v0, Lcs1/a$b;->y:Lcs1/a;

    invoke-static {v4}, Lcs1/a;->j(Lcs1/a;)Lcs1/b;

    move-result-object v4

    invoke-virtual {v4}, Lcs1/b;->c()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v3, v4, v6, v5, v7}, Lcs1/c$i;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v7, v0, Lcs1/a$b;->x:Ljava/lang/Object;

    iput v5, v0, Lcs1/a$b;->w:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    :goto_1
    return-object v2

    :cond_5
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
