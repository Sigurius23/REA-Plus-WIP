.class final Lt03/c$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt03/c;->a(Lq83/d;)Ljava/lang/Object;
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
        0x20,
        0x2d
    }
    m = "uploadEvents"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lt03/c;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:J

.field z:J


# direct methods
.method public constructor <init>(Lt03/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt03/c;",
            "Lq83/d<",
            "-",
            "Lt03/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt03/c$b;->F:Lt03/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt03/c$b;->E:Ljava/lang/Object;

    iget p1, p0, Lt03/c$b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt03/c$b;->G:I

    iget-object p1, p0, Lt03/c$b;->F:Lt03/c;

    invoke-virtual {p1, p0}, Lt03/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
