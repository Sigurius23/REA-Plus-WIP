.class final Lbc2/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc2/b;->interact(Lec3/l;)Lec3/l;
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
        "Lbc2/c;",
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
    c = "com.whoop.settings.language.optout.domain.LanguageBetaOptOutInteractor$interact$1$1"
    f = "LanguageBetaOptOutInteractor.kt"
    l = {
        0x19,
        0x1c,
        0x21
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lbc2/b;


# direct methods
.method public constructor <init>(Lbc2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc2/b;",
            "Lq83/d<",
            "-",
            "Lbc2/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbc2/b$c;->y:Lbc2/b;

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

    new-instance v0, Lbc2/b$c;

    iget-object v1, p0, Lbc2/b$c;->y:Lbc2/b;

    invoke-direct {v0, v1, p2}, Lbc2/b$c;-><init>(Lbc2/b;Lq83/d;)V

    iput-object p1, v0, Lbc2/b$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lbc2/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbc2/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbc2/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbc2/b$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v5, p0

    iget-object v0, v5, Lbc2/b$c;->x:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lbc2/b$c;->w:I

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v11, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lbc2/c$a;->a:Lbc2/c$a;

    iput-object v8, v5, Lbc2/b$c;->x:Ljava/lang/Object;

    iput v2, v5, Lbc2/b$c;->w:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lbc2/b$c;->y:Lbc2/b;

    invoke-static {v2}, Lbc2/b;->f(Lbc2/b;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lbc2/b$c$a;

    iget-object v3, v5, Lbc2/b$c;->y:Lbc2/b;

    invoke-direct {v4, v3, v10}, Lbc2/b$c$a;-><init>(Lbc2/b;Lq83/d;)V

    iput-object v8, v5, Lbc2/b$c;->x:Ljava/lang/Object;

    iput v1, v5, Lbc2/b$c;->w:I

    move-object v1, v2

    const/4 v2, 0x0

    const-string v3, "Failed to opt out of Arabic beta"

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object v0, v5, Lbc2/b$c;->y:Lbc2/b;

    invoke-static {v0}, Lbc2/b;->c(Lbc2/b;)Lfi0/a;

    move-result-object v12

    const/16 v19, 0x37

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v16, "arabic_opt_out_event"

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v12 .. v20}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    iget-object v0, v5, Lbc2/b$c;->y:Lbc2/b;

    invoke-static {v0}, Lbc2/b;->d(Lbc2/b;)Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;->markOptedOut()V

    sget-object v0, Lbc2/c$b;->a:Lbc2/c$b;

    iput-object v10, v5, Lbc2/b$c;->x:Ljava/lang/Object;

    iput v11, v5, Lbc2/b$c;->w:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    :goto_2
    return-object v9

    :cond_6
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
