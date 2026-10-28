.class final Lo92/i$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo92/i;->onCreate(Landroidx/lifecycle/g0;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.push.notifications.FirmwareUpdateNotification$onCreate$1"
    f = "FirmwareUpdateNotification.kt"
    l = {
        0x2f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lo92/i;


# direct methods
.method public constructor <init>(Lo92/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo92/i;",
            "Lq83/d<",
            "-",
            "Lo92/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo92/i$b;->x:Lo92/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lgt0/h;Lgt0/h;)Z
    .locals 0

    invoke-static {p0, p1}, Lo92/i$b;->h(Lgt0/h;Lgt0/h;)Z

    move-result p0

    return p0
.end method

.method private static final h(Lgt0/h;Lgt0/h;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lo92/i$b;

    iget-object v0, p0, Lo92/i$b;->x:Lo92/i;

    invoke-direct {p1, v0, p2}, Lo92/i$b;-><init>(Lo92/i;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lo92/i$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo92/i$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo92/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo92/i$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lo92/i$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lo92/i$b;->x:Lo92/i;

    invoke-static {p1}, Lo92/i;->C(Lo92/i;)Lnl1/a;

    move-result-object p1

    invoke-virtual {p1}, Lnl1/a;->c()Lec3/f2;

    move-result-object p1

    new-instance v1, Lo92/i$b$b;

    invoke-direct {v1, p1}, Lo92/i$b$b;-><init>(Lec3/l;)V

    new-instance p1, Lo92/j;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v1}, Lec3/v;->s(Lc93/m;Lec3/l;)Lec3/j;

    move-result-object p1

    new-instance v1, Lo92/i$b$a;

    iget-object v3, p0, Lo92/i$b;->x:Lo92/i;

    invoke-direct {v1, v3}, Lo92/i$b$a;-><init>(Lo92/i;)V

    iput v2, p0, Lo92/i$b;->w:I

    invoke-virtual {p1, v1, p0}, Lec3/j;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
