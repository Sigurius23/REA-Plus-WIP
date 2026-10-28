.class final Lpr2/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpr2/a;->onCreate(Landroidx/lifecycle/g0;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lpr2/e;",
        "uploadState",
        "Ll83/a0;",
        "<anonymous>",
        "(Lpr2/e;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.util.avatar.AvatarManager$onCreate$1"
    f = "AvatarManager.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lpr2/a;


# direct methods
.method public constructor <init>(Lpr2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpr2/a;",
            "Lq83/d<",
            "-",
            "Lpr2/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpr2/a$d;->y:Lpr2/a;

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

    new-instance v0, Lpr2/a$d;

    iget-object v1, p0, Lpr2/a$d;->y:Lpr2/a;

    invoke-direct {v0, v1, p2}, Lpr2/a$d;-><init>(Lpr2/a;Lq83/d;)V

    iput-object p1, v0, Lpr2/a$d;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lpr2/e;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpr2/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lpr2/a$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpr2/a$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpr2/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpr2/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpr2/a$d;->f(Lpr2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpr2/a$d;->x:Ljava/lang/Object;

    check-cast v0, Lpr2/e;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpr2/a$d;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lpr2/e$d;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpr2/a$d;->y:Lpr2/a;

    invoke-static {p1}, Lpr2/a;->f(Lpr2/a;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Avatar upload successful, updating user profile"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lpr2/a$d;->y:Lpr2/a;

    invoke-static {p1}, Lpr2/a;->e(Lpr2/a;)Lbc3/c0;

    move-result-object p1

    new-instance v0, Lpr2/a$d$a;

    iget-object v1, p0, Lpr2/a$d;->y:Lpr2/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpr2/a$d$a;-><init>(Lpr2/a;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
