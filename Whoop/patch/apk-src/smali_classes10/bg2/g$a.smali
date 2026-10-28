.class public final Lbg2/g$a;
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
    c = "com.whoop.sms.setup.domain.SmsSetupInteractor$interact$$inlined$flatMapLatest$1"
    f = "SmsSetupInteractor.kt"
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

.field final synthetic z:Lbg2/g;


# direct methods
.method public constructor <init>(Lq83/d;Lbg2/g;)V
    .locals 0

    iput-object p2, p0, Lbg2/g$a;->z:Lbg2/g;

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
            "Lbg2/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbg2/g$a;

    iget-object v1, p0, Lbg2/g$a;->z:Lbg2/g;

    invoke-direct {v0, p3, v1}, Lbg2/g$a;-><init>(Lq83/d;Lbg2/g;)V

    iput-object p1, v0, Lbg2/g$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lbg2/g$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lbg2/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lbg2/g$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbg2/g$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lbg2/g$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbg2/g$a;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lbg2/g$a;->y:Ljava/lang/Object;

    check-cast v1, Lbg2/c;

    instance-of v3, v1, Lbg2/c$a;

    if-eqz v3, :cond_2

    iget-object v1, p0, Lbg2/g$a;->z:Lbg2/g;

    invoke-static {v1}, Lbg2/g;->d(Lbg2/g;)Lec3/l;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of v3, v1, Lbg2/c$e;

    if-eqz v3, :cond_3

    iget-object v1, p0, Lbg2/g$a;->z:Lbg2/g;

    invoke-static {v1}, Lbg2/g;->h(Lbg2/g;)Lec3/l;

    move-result-object v1

    goto :goto_0

    :cond_3
    instance-of v3, v1, Lbg2/c$d;

    if-eqz v3, :cond_4

    iget-object v3, p0, Lbg2/g$a;->z:Lbg2/g;

    check-cast v1, Lbg2/c$d;

    invoke-virtual {v1}, Lbg2/c$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lbg2/g;->g(Lbg2/g;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto :goto_0

    :cond_4
    instance-of v3, v1, Lbg2/c$c;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lbg2/g$a;->z:Lbg2/g;

    check-cast v1, Lbg2/c$c;

    invoke-virtual {v1}, Lbg2/c$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lbg2/g;->f(Lbg2/g;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto :goto_0

    :cond_5
    instance-of v3, v1, Lbg2/c$f;

    if-eqz v3, :cond_6

    iget-object v1, p0, Lbg2/g$a;->z:Lbg2/g;

    invoke-static {v1}, Lbg2/g;->i(Lbg2/g;)Lec3/l;

    move-result-object v1

    goto :goto_0

    :cond_6
    instance-of v3, v1, Lbg2/c$b;

    if-eqz v3, :cond_8

    iget-object v3, p0, Lbg2/g$a;->z:Lbg2/g;

    check-cast v1, Lbg2/c$b;

    invoke-virtual {v1}, Lbg2/c$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lbg2/g;->e(Lbg2/g;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    :goto_0
    const/4 v3, 0x0

    iput-object v3, p0, Lbg2/g$a;->x:Ljava/lang/Object;

    iput-object v3, p0, Lbg2/g$a;->y:Ljava/lang/Object;

    iput v2, p0, Lbg2/g$a;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
