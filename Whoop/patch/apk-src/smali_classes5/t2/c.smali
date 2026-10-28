.class public final Lt2/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lt2/d;

.field public y:I


# direct methods
.method public constructor <init>(Lt2/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt2/c;->x:Lt2/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lt2/c;->w:Ljava/lang/Object;

    iget p1, p0, Lt2/c;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt2/c;->y:I

    iget-object p1, p0, Lt2/c;->x:Lt2/d;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lt2/d;->b(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
