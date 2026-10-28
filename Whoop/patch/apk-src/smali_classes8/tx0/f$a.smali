.class final Ltx0/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltx0/f;-><init>(Lgv1/c;Lgv1/d;Lbc3/c0;)V
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
        "\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "isOverrideEnabled",
        "Lgv1/e;",
        "localLottieState",
        "Ltx0/g;",
        "<anonymous>",
        "(ZLgv1/e;)Ltx0/g;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.debug.lottietester.LottieTesterViewModel$viewState$1"
    f = "LottieTesterViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Z

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ltx0/f$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(ZLgv1/e;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lgv1/e;",
            "Lq83/d<",
            "-",
            "Ltx0/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ltx0/f$a;

    invoke-direct {v0, p3}, Ltx0/f$a;-><init>(Lq83/d;)V

    iput-boolean p1, v0, Ltx0/f$a;->x:Z

    iput-object p2, v0, Ltx0/f$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ltx0/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lgv1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ltx0/f$a;->f(ZLgv1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, Ltx0/f$a;->x:Z

    iget-object v1, p0, Ltx0/f$a;->y:Ljava/lang/Object;

    check-cast v1, Lgv1/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ltx0/f$a;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lgv1/e;->a()Lgv1/o;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lgv1/p;->b(Lgv1/o;)Lv41/r0;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    invoke-virtual {v1}, Lgv1/e;->a()Lgv1/o;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lgv1/p;->a(Lgv1/o;)Lkd1/o;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    if-eqz p1, :cond_2

    new-instance v2, Li51/h$d;

    invoke-direct {v2, p1}, Li51/h$d;-><init>(Lv41/r0;)V

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_3

    new-instance v2, Li51/h$c;

    invoke-direct {v2, v3}, Li51/h$c;-><init>(Lkd1/o;)V

    :cond_3
    :goto_2
    new-instance p1, Ltx0/g;

    invoke-virtual {v1}, Lgv1/e;->b()Z

    move-result v3

    invoke-virtual {v1}, Lgv1/e;->a()Lgv1/o;

    move-result-object v1

    invoke-direct {p1, v0, v3, v1, v2}, Ltx0/g;-><init>(ZZLgv1/o;Li51/h;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
