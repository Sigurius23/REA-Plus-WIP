.class final Lvr2/d$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvr2/d;->a(ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.util.log.logService.LogEventUploaderImpl"
    f = "LogEventUploaderImpl.kt"
    l = {
        0x53
    }
    m = "uploadLogs"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Z

.field x:Z

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvr2/d;


# direct methods
.method public constructor <init>(Lvr2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr2/d;",
            "Lq83/d<",
            "-",
            "Lvr2/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvr2/d$e;->z:Lvr2/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvr2/d$e;->y:Ljava/lang/Object;

    iget p1, p0, Lvr2/d$e;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvr2/d$e;->E:I

    iget-object p1, p0, Lvr2/d$e;->z:Lvr2/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lvr2/d;->a(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
