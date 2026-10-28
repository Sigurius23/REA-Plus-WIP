.class final Lgv0/a$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgv0/a;->l(Lq83/d;)Ljava/lang/Object;
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
        0x2c,
        0x2e,
        0x31,
        0x3b,
        0x45
    }
    m = "uploadSavedPackets-IoAF18A"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:J

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Lgv0/a;

.field M:I

.field w:I

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgv0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgv0/a;",
            "Lq83/d<",
            "-",
            "Lgv0/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgv0/a$d;->L:Lgv0/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgv0/a$d;->K:Ljava/lang/Object;

    iget p1, p0, Lgv0/a$d;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgv0/a$d;->M:I

    iget-object p1, p0, Lgv0/a$d;->L:Lgv0/a;

    invoke-static {p1, p0}, Lgv0/a;->e(Lgv0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
