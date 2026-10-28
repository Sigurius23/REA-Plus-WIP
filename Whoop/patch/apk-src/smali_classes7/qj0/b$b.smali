.class final Lqj0/b$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj0/b;->j(Lxj0/b;JZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ble.device.CommandChannel"
    f = "CommandChannel.kt"
    l = {
        0x83,
        0x4c
    }
    m = "send-dWUq8MI"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:I

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lqj0/b;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:J


# direct methods
.method public constructor <init>(Lqj0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj0/b;",
            "Lq83/d<",
            "-",
            "Lqj0/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj0/b$b;->I:Lqj0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lqj0/b$b;->H:Ljava/lang/Object;

    iget p1, p0, Lqj0/b$b;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqj0/b$b;->J:I

    iget-object v0, p0, Lqj0/b$b;->I:Lqj0/b;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lqj0/b;->j(Lxj0/b;JZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
