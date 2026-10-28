.class final Lyw2/f$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyw2/f;->e(Lak0/i;Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.StrapConnection"
    f = "StrapConnection.kt"
    l = {
        0x41
    }
    m = "handleCommandCollision"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lyw2/f;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:J

.field z:J


# direct methods
.method public constructor <init>(Lyw2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyw2/f;",
            "Lq83/d<",
            "-",
            "Lyw2/f$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyw2/f$d;->G:Lyw2/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyw2/f$d;->F:Ljava/lang/Object;

    iget p1, p0, Lyw2/f$d;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyw2/f$d;->H:I

    iget-object p1, p0, Lyw2/f$d;->G:Lyw2/f;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lyw2/f;->a(Lyw2/f;Lak0/i;Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
