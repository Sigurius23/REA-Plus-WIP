.class final Lcm2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcm2/c;->c(Ljava/util/List;Lor2/h0;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
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


# instance fields
.field final synthetic w:Lcom/whoop/trends/data/model/BarDTOV3;


# direct methods
.method public constructor <init>(Lcom/whoop/trends/data/model/BarDTOV3;)V
    .locals 0

    iput-object p1, p0, Lcm2/c$a;->w:Lcom/whoop/trends/data/model/BarDTOV3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly81/i;)J
    .locals 4

    const-string v0, "$this$whoopColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly81/i;->y()J

    move-result-wide v0

    iget-object p1, p0, Lcm2/c$a;->w:Lcom/whoop/trends/data/model/BarDTOV3;

    invoke-virtual {p1}, Lcom/whoop/trends/data/model/BarDTOV3;->getOpacity()D

    move-result-wide v2

    double-to-float p1, v2

    invoke-static {p1, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly81/i;

    invoke-virtual {p0, p1}, Lcm2/c$a;->a(Ly81/i;)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
