.class public final Landroidx/room/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ljava/util/concurrent/Callable;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lu00/e;

.field public z:I


# direct methods
.method public constructor <init>(Lu00/e;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/b;->y:Lu00/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Landroidx/room/b;->x:Ljava/lang/Object;

    iget p1, p0, Landroidx/room/b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/room/b;->z:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/room/b;->y:Lu00/e;

    invoke-virtual {v1, p1, v0, p1, p0}, Lu00/e;->s(Landroidx/room/z0;ZLjava/util/concurrent/Callable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
