.class final Lwr1/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwr1/e;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lwr1/c;",
        "previousState",
        "Lwr1/b;",
        "action",
        "<anonymous>",
        "(Lwr1/c;Lwr1/b;)Lwr1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.journal.interactors.v2.datepicker.JournalDatePickerInteractor$interact$1"
    f = "JournalDatePickerInteractor.kt"
    l = {
        0x15
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lwr1/e;


# direct methods
.method public constructor <init>(Lwr1/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwr1/e;",
            "Lq83/d<",
            "-",
            "Lwr1/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwr1/e$b;->z:Lwr1/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lwr1/c;Lwr1/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwr1/c;",
            "Lwr1/b;",
            "Lq83/d<",
            "-",
            "Lwr1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lwr1/e$b;

    iget-object v1, p0, Lwr1/e$b;->z:Lwr1/e;

    invoke-direct {v0, v1, p3}, Lwr1/e$b;-><init>(Lwr1/e;Lq83/d;)V

    iput-object p1, v0, Lwr1/e$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lwr1/e$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lwr1/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwr1/c;

    check-cast p2, Lwr1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lwr1/e$b;->f(Lwr1/c;Lwr1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lwr1/e$b;->x:Ljava/lang/Object;

    check-cast v0, Lwr1/c;

    iget-object v1, p0, Lwr1/e$b;->y:Ljava/lang/Object;

    check-cast v1, Lwr1/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lwr1/e$b;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lwr1/b$a;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lwr1/e$b;->z:Lwr1/e;

    invoke-static {p1}, Lwr1/e;->f(Lwr1/e;)Ltr2/n;

    move-result-object v0

    check-cast v1, Lwr1/b$a;

    invoke-virtual {v1}, Lwr1/b$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lwr1/e;->c(Lwr1/e;Ltr2/n;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    const/4 v0, 0x0

    iput-object v0, p0, Lwr1/e$b;->x:Ljava/lang/Object;

    iput-object v0, p0, Lwr1/e$b;->y:Ljava/lang/Object;

    iput v4, p0, Lwr1/e$b;->w:I

    invoke-static {p1, p0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Lwr1/c;

    if-nez p1, :cond_3

    new-instance p1, Lwr1/c;

    sget-object v0, Lwr1/d$a;->a:Lwr1/d$a;

    invoke-direct {p1, v0}, Lwr1/c;-><init>(Lwr1/d;)V

    :cond_3
    return-object p1

    :cond_4
    instance-of p1, v1, Lwr1/b$b;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lwr1/e$b;->z:Lwr1/e;

    invoke-virtual {v0}, Lwr1/c;->a()Lwr1/d;

    move-result-object v0

    check-cast v1, Lwr1/b$b;

    invoke-virtual {v1}, Lwr1/b$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lwr1/b$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lwr1/b$b;->b()Z

    move-result v1

    invoke-virtual {p1, v0, v2, v3, v1}, Lwr1/e;->h(Lwr1/d;Ljava/lang/String;Ljava/lang/String;Z)Lwr1/c;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
