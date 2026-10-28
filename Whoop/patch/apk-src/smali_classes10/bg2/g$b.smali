.class final Lbg2/g$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbg2/g;->j(Lec3/l;)Lec3/l;
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbg2/d;",
        "accumulator",
        "newState",
        "<anonymous>",
        "(Lbg2/d;Lbg2/d;)Lbg2/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sms.setup.domain.SmsSetupInteractor$interact$2"
    f = "SmsSetupInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lbg2/g$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lbg2/d;Lbg2/d;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbg2/d;",
            "Lbg2/d;",
            "Lq83/d<",
            "-",
            "Lbg2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbg2/g$b;

    invoke-direct {v0, p3}, Lbg2/g$b;-><init>(Lq83/d;)V

    iput-object p1, v0, Lbg2/g$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lbg2/g$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbg2/g$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbg2/d;

    check-cast p2, Lbg2/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lbg2/g$b;->f(Lbg2/d;Lbg2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lbg2/g$b;->x:Ljava/lang/Object;

    check-cast v1, Lbg2/d;

    iget-object v2, v0, Lbg2/g$b;->y:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lbg2/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbg2/g$b;->w:I

    if-nez v2, :cond_1

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lbg2/d;->i()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1}, Lbg2/d;->i()Ljava/lang/String;

    move-result-object v2

    :cond_0
    move-object v4, v2

    const v20, 0xfffe

    const/16 v21, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Lbg2/d;->b(Lbg2/d;Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZILjava/lang/Object;)Lbg2/d;

    move-result-object v1

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
