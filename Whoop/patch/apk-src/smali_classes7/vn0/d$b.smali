.class public final Lvn0/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvn0/d;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.changepassword.domain.ChangePasswordInteractor$interact$$inlined$flatMapLatest$1"
    f = "ChangePasswordInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvn0/d;


# direct methods
.method public constructor <init>(Lq83/d;Lvn0/d;)V
    .locals 0

    iput-object p2, p0, Lvn0/d$b;->z:Lvn0/d;

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
            "Lvn0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lvn0/d$b;

    iget-object v1, p0, Lvn0/d$b;->z:Lvn0/d;

    invoke-direct {v0, p3, v1}, Lvn0/d$b;-><init>(Lq83/d;Lvn0/d;)V

    iput-object p1, v0, Lvn0/d$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvn0/d$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvn0/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvn0/d$b;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvn0/d$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lvn0/d$b;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvn0/d$b;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lvn0/d$b;->y:Ljava/lang/Object;

    check-cast v1, Lvn0/b;

    instance-of v3, v1, Lvn0/b$c;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    new-instance v1, Lvn0/d$c;

    iget-object v3, p0, Lvn0/d$b;->z:Lvn0/d;

    invoke-direct {v1, v3, v4}, Lvn0/d$c;-><init>(Lvn0/d;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_1

    :cond_2
    instance-of v3, v1, Lvn0/b$f;

    if-eqz v3, :cond_3

    new-instance v3, Lvn0/d$a$d;

    check-cast v1, Lvn0/b$f;

    invoke-virtual {v1}, Lvn0/b$f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lvn0/d$a$d;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v5, 0x1

    invoke-direct {v1, v3, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_3
    instance-of v3, v1, Lvn0/b$e;

    if-eqz v3, :cond_4

    new-instance v3, Lvn0/d$a$b;

    check-cast v1, Lvn0/b$e;

    invoke-virtual {v1}, Lvn0/b$e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lvn0/d$a$b;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v5, 0x1

    invoke-direct {v1, v3, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_4
    instance-of v3, v1, Lvn0/b$d;

    if-eqz v3, :cond_5

    new-instance v3, Lvn0/d$d;

    invoke-direct {v3, v1, v4}, Lvn0/d$d;-><init>(Lvn0/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_5
    instance-of v3, v1, Lvn0/b$a;

    if-eqz v3, :cond_6

    new-instance v3, Lvn0/d$a$a;

    check-cast v1, Lvn0/b$a;

    invoke-virtual {v1}, Lvn0/b$a;->a()Z

    move-result v1

    invoke-direct {v3, v1}, Lvn0/d$a$a;-><init>(Z)V

    new-instance v1, La6/u;

    const/4 v5, 0x1

    invoke-direct {v1, v3, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_6
    instance-of v1, v1, Lvn0/b$b;

    if-eqz v1, :cond_8

    sget-object v1, Lvn0/d$a$c;->a:Lvn0/d$a$c;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_1
    iput-object v4, p0, Lvn0/d$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lvn0/d$b;->y:Ljava/lang/Object;

    iput v2, p0, Lvn0/d$b;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
