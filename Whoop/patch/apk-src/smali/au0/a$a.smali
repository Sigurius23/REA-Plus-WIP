.class final Lau0/a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lau0/a;->d(Lau0/a;JJLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.connectivityDataPacketsModels.firmware.events.dao.StrapFirmwareEventsDao"
    f = "StrapFirmwareEventsDao.kt"
    l = {
        0x1e,
        0x1f
    }
    m = "deleteBetween$suspendImpl"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lau0/a;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:J

.field z:J


# direct methods
.method public constructor <init>(Lau0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lau0/a;",
            "Lq83/d<",
            "-",
            "Lau0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lau0/a$a;->F:Lau0/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lau0/a$a;->E:Ljava/lang/Object;

    iget p1, p0, Lau0/a$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lau0/a$a;->G:I

    iget-object v0, p0, Lau0/a$a;->F:Lau0/a;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lau0/a;->d(Lau0/a;JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
