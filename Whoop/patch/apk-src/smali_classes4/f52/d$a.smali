.class final Lf52/d$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf52/d;->f(ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.puffin.sync.BatteryPackRelativeEventsUploader"
    f = "BatteryPackRelativeEventsUploader.kt"
    l = {
        0x1d,
        0x2a,
        0x33,
        0x34,
        0x36
    }
    m = "uploadBatteryPackRelativePackets"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lf52/d;

.field I:I

.field w:Z

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf52/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf52/d;",
            "Lq83/d<",
            "-",
            "Lf52/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf52/d$a;->H:Lf52/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf52/d$a;->G:Ljava/lang/Object;

    iget p1, p0, Lf52/d$a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf52/d$a;->I:I

    iget-object p1, p0, Lf52/d$a;->H:Lf52/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lf52/d;->b(Lf52/d;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
