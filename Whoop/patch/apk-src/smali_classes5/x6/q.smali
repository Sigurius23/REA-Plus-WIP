.class public final Lx6/q;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# instance fields
.field public final synthetic w:Lx6/u;

.field public final synthetic x:Lp6/l;

.field public final synthetic y:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lx6/u;Lp6/l;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lx6/q;->w:Lx6/u;

    iput-object p2, p0, Lx6/q;->x:Lp6/l;

    iput-object p3, p0, Lx6/q;->y:Landroid/content/Context;

    sget-object p1, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {p0, p1}, Lq83/a;-><init>(Lq83/i;)V

    return-void
.end method


# virtual methods
.method public final handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 7

    new-instance v0, Lp33/m;

    const/4 v5, 0x0

    const/16 v6, 0xd

    iget-object v1, p0, Lx6/q;->x:Lp6/l;

    iget-object v2, p0, Lx6/q;->y:Landroid/content/Context;

    iget-object v4, p0, Lx6/q;->w:Lx6/u;

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v4, p2, p2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
