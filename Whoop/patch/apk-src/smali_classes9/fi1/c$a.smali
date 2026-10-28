.class final Lfi1/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfi1/c;->a(JJLjava/util/List;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.gps.foreground.upload.ForegroundGpsUploaderImpl"
    f = "ForegroundGpsUploaderImpl.kt"
    l = {
        0x23
    }
    m = "upload"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lfi1/c;

.field H:I

.field w:J

.field x:J

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfi1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfi1/c;",
            "Lq83/d<",
            "-",
            "Lfi1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfi1/c$a;->G:Lfi1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lfi1/c$a;->F:Ljava/lang/Object;

    iget p1, p0, Lfi1/c$a;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfi1/c$a;->H:I

    iget-object v0, p0, Lfi1/c$a;->G:Lfi1/c;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lfi1/c;->a(JJLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
