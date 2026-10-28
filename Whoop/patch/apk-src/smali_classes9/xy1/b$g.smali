.class final Lxy1/b$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxy1/b;->h(Ljava/lang/String;Lxy1/c;Ljava/lang/String;)Lec3/l;
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
        "Lxy1/b$a;",
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
    c = "com.whoop.mfa.setup.domain.MfaInputInteractor$submitInput$1"
    f = "MfaInputInteractor.kt"
    l = {
        0x5b,
        0x5c,
        0x5d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lxy1/c;

.field final synthetic G:Ljava/lang/String;

.field w:Z

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lxy1/b;


# direct methods
.method public constructor <init>(Lxy1/b;Ljava/lang/String;Lxy1/c;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxy1/b;",
            "Ljava/lang/String;",
            "Lxy1/c;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lxy1/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxy1/b$g;->z:Lxy1/b;

    iput-object p2, p0, Lxy1/b$g;->E:Ljava/lang/String;

    iput-object p3, p0, Lxy1/b$g;->F:Lxy1/c;

    iput-object p4, p0, Lxy1/b$g;->G:Ljava/lang/String;

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

    new-instance v0, Lxy1/b$g;

    iget-object v1, p0, Lxy1/b$g;->z:Lxy1/b;

    iget-object v2, p0, Lxy1/b$g;->E:Ljava/lang/String;

    iget-object v3, p0, Lxy1/b$g;->F:Lxy1/c;

    iget-object v4, p0, Lxy1/b$g;->G:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lxy1/b$g;-><init>(Lxy1/b;Ljava/lang/String;Lxy1/c;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lxy1/b$g;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lxy1/b$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxy1/b$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxy1/b$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxy1/b$g;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lxy1/b$g;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lxy1/b$g;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lxy1/b$a$b;->a:Lxy1/b$a$b;

    iput-object v0, p0, Lxy1/b$g;->y:Ljava/lang/Object;

    iput v5, p0, Lxy1/b$g;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lxy1/b$g;->z:Lxy1/b;

    iget-object v2, p0, Lxy1/b$g;->E:Ljava/lang/String;

    iget-object v5, p0, Lxy1/b$g;->F:Lxy1/c;

    iget-object v6, p0, Lxy1/b$g;->G:Ljava/lang/String;

    iput-object v0, p0, Lxy1/b$g;->y:Ljava/lang/Object;

    iput v4, p0, Lxy1/b$g;->x:I

    invoke-static {p1, v2, v5, v6, p0}, Lxy1/b;->c(Lxy1/b;Ljava/lang/String;Lxy1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v2, Lxy1/b$a$c;

    invoke-direct {v2, p1}, Lxy1/b$a$c;-><init>(Z)V

    const/4 v4, 0x0

    iput-object v4, p0, Lxy1/b$g;->y:Ljava/lang/Object;

    iput-boolean p1, p0, Lxy1/b$g;->w:Z

    iput v3, p0, Lxy1/b$g;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
