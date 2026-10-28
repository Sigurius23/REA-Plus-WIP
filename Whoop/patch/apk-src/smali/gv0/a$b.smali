.class final Lgv0/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgv0/a;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.consolePackets.data.NewConsolePacketUploader"
    f = "NewConsolePacketUploader.kt"
    l = {
        0x77,
        0x7b,
        0x7d
    }
    m = "removeOlderStrapLogs"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lgv0/a;

.field G:I

.field w:J

.field x:J

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lgv0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgv0/a;",
            "Lq83/d<",
            "-",
            "Lgv0/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgv0/a$b;->F:Lgv0/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgv0/a$b;->E:Ljava/lang/Object;

    iget p1, p0, Lgv0/a$b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgv0/a$b;->G:I

    iget-object p1, p0, Lgv0/a$b;->F:Lgv0/a;

    invoke-static {p1, p0}, Lgv0/a;->d(Lgv0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
