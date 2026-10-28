.class public final Lx6/p;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lx6/u;

.field public final synthetic x:Landroidx/glance/session/SessionWorker;


# direct methods
.method public constructor <init>(Lx6/u;Landroidx/glance/session/SessionWorker;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lx6/p;->w:Lx6/u;

    iput-object p2, p0, Lx6/p;->x:Landroidx/glance/session/SessionWorker;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Lx6/p;

    iget-object v1, p0, Lx6/p;->w:Lx6/u;

    iget-object v2, p0, Lx6/p;->x:Landroidx/glance/session/SessionWorker;

    invoke-direct {v0, v1, v2, p1}, Lx6/p;-><init>(Lx6/u;Landroidx/glance/session/SessionWorker;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lx6/p;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx6/p;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lx6/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx6/p;->x:Landroidx/glance/session/SessionWorker;

    iget-object p1, p1, Landroidx/glance/session/SessionWorker;->y:Lx6/t;

    iget-wide v0, p1, Lx6/t;->c:J

    iget-object p1, p0, Lx6/p;->w:Lx6/u;

    check-cast p1, Lx6/v;

    invoke-virtual {p1, v0, v1}, Lx6/v;->b(J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
