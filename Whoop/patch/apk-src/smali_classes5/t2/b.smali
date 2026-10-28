.class public final Lt2/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lt2/d;

.field public y:I


# direct methods
.method public constructor <init>(Lt2/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt2/b;->x:Lt2/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lt2/b;->w:Ljava/lang/Object;

    iget p1, p0, Lt2/b;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt2/b;->y:I

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    iget-object v0, p0, Lt2/b;->x:Lt2/d;

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lt2/d;->a(JJLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
