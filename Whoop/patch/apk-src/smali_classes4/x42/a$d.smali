.class final Lx42/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx42/a;->d(Lbc3/c0;)V
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ly42/a;",
        "puffin",
        "Lec3/l;",
        "Ll83/k;",
        "Lgt0/h;",
        "<anonymous>",
        "(Ly42/a;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.BatteryPackHpsMonitor$start$2"
    f = "BatteryPackHpsMonitor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lx42/a;


# direct methods
.method public constructor <init>(Lx42/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx42/a;",
            "Lq83/d<",
            "-",
            "Lx42/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx42/a$d;->y:Lx42/a;

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

    new-instance v0, Lx42/a$d;

    iget-object v1, p0, Lx42/a$d;->y:Lx42/a;

    invoke-direct {v0, v1, p2}, Lx42/a$d;-><init>(Lx42/a;Lq83/d;)V

    iput-object p1, v0, Lx42/a$d;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Ly42/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lx42/a$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx42/a$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx42/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly42/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx42/a$d;->f(Ly42/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lx42/a$d;->x:Ljava/lang/Object;

    check-cast v0, Ly42/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx42/a$d;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx42/a$d;->y:Lx42/a;

    invoke-static {p1}, Lx42/a;->c(Lx42/a;)Ltr2/n;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mapping "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", to firmware update api observe"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lx42/a$d;->y:Lx42/a;

    invoke-static {p1}, Lx42/a;->a(Lx42/a;)Lgt0/e;

    move-result-object p1

    new-instance v1, Lgt0/g$d;

    invoke-static {v0}, Ly42/f;->a(Ly42/a;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v2

    invoke-direct {v1, v2}, Lgt0/g$d;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    invoke-interface {p1, v1}, Lgt0/e;->b(Lgt0/g;)Lec3/l;

    move-result-object p1

    iget-object v1, p0, Lx42/a$d;->y:Lx42/a;

    new-instance v2, Lx42/a$d$a;

    invoke-direct {v2, p1, v1, v0}, Lx42/a$d$a;-><init>(Lec3/l;Lx42/a;Ly42/a;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
