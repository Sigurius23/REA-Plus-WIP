.class final Lcom/whoop/archv2/feature/domain/r$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/r;->a(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.archv2.feature.domain.TemplateDeeplinkResolver"
    f = "TemplateDeeplinkResolver.kt"
    l = {
        0x2a,
        0x2d
    }
    m = "resolve"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lcom/whoop/archv2/feature/domain/r;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/r;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/r;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/r$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/r$b;->G:Lcom/whoop/archv2/feature/domain/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/r$b;->F:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/archv2/feature/domain/r$b;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/archv2/feature/domain/r$b;->H:I

    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/r$b;->G:Lcom/whoop/archv2/feature/domain/r;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/whoop/archv2/feature/domain/r;->a(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
