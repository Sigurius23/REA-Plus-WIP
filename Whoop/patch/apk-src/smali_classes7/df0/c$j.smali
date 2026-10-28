.class final Ldf0/c$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf0/c;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ldf0/c$b;",
        "internalState",
        "Lec3/l;",
        "Ldf0/b;",
        "<anonymous>",
        "(Ldf0/c$b;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$interact$2"
    f = "AdvancedLabsTypeformWebviewInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Ldf0/c;


# direct methods
.method public constructor <init>(Ldf0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf0/c;",
            "Lq83/d<",
            "-",
            "Ldf0/c$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldf0/c$j;->y:Ldf0/c;

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

    new-instance v0, Ldf0/c$j;

    iget-object v1, p0, Ldf0/c$j;->y:Ldf0/c;

    invoke-direct {v0, v1, p2}, Ldf0/c$j;-><init>(Ldf0/c;Lq83/d;)V

    iput-object p1, v0, Ldf0/c$j;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Ldf0/c$b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf0/c$b;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ldf0/c$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldf0/c$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldf0/c$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldf0/c$b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldf0/c$j;->f(Ldf0/c$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ldf0/c$j;->x:Ljava/lang/Object;

    check-cast v0, Ldf0/c$b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldf0/c$j;->w:I

    if-nez v1, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ldf0/c$b;->c()Ldf0/a;

    move-result-object p1

    instance-of v1, p1, Ldf0/a$h;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance p1, Ldf0/c$j$a;

    iget-object v1, p0, Ldf0/c$j;->y:Ldf0/c;

    invoke-direct {p1, v1, v0, v2}, Ldf0/c$j$a;-><init>(Ldf0/c;Ldf0/c$b;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v0

    :cond_0
    instance-of v1, p1, Ldf0/a$f;

    if-nez v1, :cond_7

    instance-of v1, p1, Ldf0/a$e;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, p1, Ldf0/a$d;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    sget-object p1, Ldf0/b$c;->a:Ldf0/b$c;

    new-instance v0, La6/u;

    invoke-direct {v0, p1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_2
    instance-of v1, p1, Ldf0/a$b;

    if-eqz v1, :cond_3

    sget-object p1, Ldf0/b$b;->a:Ldf0/b$b;

    new-instance v0, La6/u;

    invoke-direct {v0, p1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_3
    instance-of v1, p1, Ldf0/a$c;

    if-eqz v1, :cond_4

    sget-object p1, Lec3/k;->w:Lec3/k;

    return-object p1

    :cond_4
    instance-of v1, p1, Ldf0/a$a;

    if-eqz v1, :cond_5

    new-instance p1, Ldf0/c$j$c;

    iget-object v1, p0, Ldf0/c$j;->y:Ldf0/c;

    invoke-direct {p1, v1, v0, v2}, Ldf0/c$j$c;-><init>(Ldf0/c;Ldf0/c$b;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v0

    :cond_5
    instance-of p1, p1, Ldf0/a$g;

    if-eqz p1, :cond_6

    new-instance p1, Ldf0/c$j$d;

    iget-object v1, p0, Ldf0/c$j;->y:Ldf0/c;

    invoke-direct {p1, v1, v0, v2}, Ldf0/c$j$d;-><init>(Ldf0/c;Ldf0/c$b;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_0
    new-instance p1, Ldf0/c$j$b;

    iget-object v1, p0, Ldf0/c$j;->y:Ldf0/c;

    invoke-direct {p1, v1, v0, v2}, Ldf0/c$j$b;-><init>(Ldf0/c;Ldf0/c$b;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v0

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
