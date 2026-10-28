.class final Lw92/b$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw92/b;->f(JJJIJLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.store.heartdata.HeartDataTableRoom"
    f = "HeartDataTableRoom.kt"
    l = {
        0xc3,
        0xc5,
        0xc6
    }
    m = "deleteDataByTimeStampsAndVersionId"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lw92/b;

.field J:I

.field w:J

.field x:J

.field y:J

.field z:J


# direct methods
.method public constructor <init>(Lw92/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw92/b;",
            "Lq83/d<",
            "-",
            "Lw92/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw92/b$b;->I:Lw92/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iput-object p1, p0, Lw92/b$b;->H:Ljava/lang/Object;

    iget p1, p0, Lw92/b$b;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw92/b$b;->J:I

    iget-object v0, p0, Lw92/b$b;->I:Lw92/b;

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v10, p0

    invoke-virtual/range {v0 .. v10}, Lw92/b;->f(JJJIJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
