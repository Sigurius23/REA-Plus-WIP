.class public final Landroidx/room/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lu00/e;

.field public G:I

.field public w:Landroidx/room/z0;

.field public x:Landroid/os/CancellationSignal;

.field public y:Ljava/util/concurrent/Callable;

.field public z:Lq83/j;


# direct methods
.method public constructor <init>(Lu00/e;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/c;->F:Lu00/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/room/c;->E:Ljava/lang/Object;

    iget p1, p0, Landroidx/room/c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/room/c;->G:I

    iget-object p1, p0, Landroidx/room/c;->F:Lu00/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lu00/e;->r(Landroidx/room/z0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
