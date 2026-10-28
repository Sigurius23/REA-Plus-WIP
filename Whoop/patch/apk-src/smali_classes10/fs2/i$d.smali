.class final Lfs2/i$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs2/i;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.videocall.manager.StreamVideoCallManager"
    f = "StreamVideoCallManager.kt"
    l = {
        0x85
    }
    m = "startCall"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lfs2/i;

.field z:I


# direct methods
.method public constructor <init>(Lfs2/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfs2/i;",
            "Lq83/d<",
            "-",
            "Lfs2/i$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfs2/i$d;->y:Lfs2/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfs2/i$d;->x:Ljava/lang/Object;

    iget p1, p0, Lfs2/i$d;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfs2/i$d;->z:I

    iget-object p1, p0, Lfs2/i$d;->y:Lfs2/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfs2/i;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
