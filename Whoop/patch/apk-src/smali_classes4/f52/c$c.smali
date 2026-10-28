.class final Lf52/c$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf52/c;->i(ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.puffin.sync.BatteryPackRelativeEventsFileExporter"
    f = "BatteryPackRelativeEventsFileExporter.kt"
    l = {
        0x44,
        0x47,
        0x49,
        0x4c,
        0x4f
    }
    m = "getBatteryPackRelativeConsoleLogsToUpload"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lf52/c;

.field G:I

.field w:Z

.field x:I

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf52/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf52/c;",
            "Lq83/d<",
            "-",
            "Lf52/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf52/c$c;->F:Lf52/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf52/c$c;->E:Ljava/lang/Object;

    iget p1, p0, Lf52/c$c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf52/c$c;->G:I

    iget-object p1, p0, Lf52/c$c;->F:Lf52/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lf52/c;->c(Lf52/c;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
