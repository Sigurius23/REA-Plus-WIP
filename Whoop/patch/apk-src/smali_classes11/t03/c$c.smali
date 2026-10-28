.class final Lt03/c$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt03/c;->i(Ljava/util/List;JJLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.workmanager.smartalarmdiagnosticworkmanager.SmartAlarmDiagnosticUploaderImpl"
    f = "SmartAlarmDiagnosticUploader.kt"
    l = {
        0x34,
        0x37
    }
    m = "uploadSmartAlarmDiagnosticEvents"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field F:J

.field G:Z

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lt03/c;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt03/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt03/c;",
            "Lq83/d<",
            "-",
            "Lt03/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt03/c$c;->I:Lt03/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lt03/c$c;->H:Ljava/lang/Object;

    iget p1, p0, Lt03/c$c;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt03/c$c;->J:I

    iget-object v0, p0, Lt03/c$c;->I:Lt03/c;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lt03/c;->f(Lt03/c;Ljava/util/List;JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
