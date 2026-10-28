.class final Lfs0/b$a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs0/b$a;->a(Lfs0/a$a;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lds0/e;",
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue$accept$3"
    f = "ReactionsSendInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lfs0/b;

.field final synthetic y:Lfs0/b$a;

.field final synthetic z:Lds0/b;


# direct methods
.method public constructor <init>(Lfs0/b;Lfs0/b$a;Lds0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfs0/b;",
            "Lfs0/b$a;",
            "Lds0/b;",
            "Lq83/d<",
            "-",
            "Lfs0/b$a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfs0/b$a$c;->x:Lfs0/b;

    iput-object p2, p0, Lfs0/b$a$c;->y:Lfs0/b$a;

    iput-object p3, p0, Lfs0/b$a$c;->z:Lds0/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lfs0/b$a$c;

    iget-object p2, p0, Lfs0/b$a$c;->x:Lfs0/b;

    iget-object v0, p0, Lfs0/b$a$c;->y:Lfs0/b$a;

    iget-object v1, p0, Lfs0/b$a$c;->z:Lds0/b;

    invoke-direct {p1, p2, v0, v1, p3}, Lfs0/b$a$c;-><init>(Lfs0/b;Lfs0/b$a;Lds0/b;Lq83/d;)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfs0/b$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfs0/b$a$c;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lfs0/b$a$c;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfs0/b$a$c;->x:Lfs0/b;

    iget-object v0, p0, Lfs0/b$a$c;->y:Lfs0/b$a;

    invoke-static {v0}, Lfs0/b$a;->c(Lfs0/b$a;)Lec3/p1;

    move-result-object v0

    iget-object v1, p0, Lfs0/b$a$c;->z:Lds0/b;

    invoke-static {p1, v0, v1}, Lfs0/b;->h(Lfs0/b;Lec3/p1;Lds0/b;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
