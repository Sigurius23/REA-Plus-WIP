.class final Lfq2/d$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq2/d;->y(Lcom/whoop/user/journey/model/yearinreview/Bar;)Lxq2/i;
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
.field final synthetic w:Lcom/whoop/user/journey/model/yearinreview/Bar;


# direct methods
.method public constructor <init>(Lcom/whoop/user/journey/model/yearinreview/Bar;)V
    .locals 0

    iput-object p1, p0, Lfq2/d$j;->w:Lcom/whoop/user/journey/model/yearinreview/Bar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly81/i;)J
    .locals 2

    const-string v0, "$this$colorBackground"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly81/i;->g()J

    move-result-wide v0

    iget-object p1, p0, Lfq2/d$j;->w:Lcom/whoop/user/journey/model/yearinreview/Bar;

    invoke-virtual {p1}, Lcom/whoop/user/journey/model/yearinreview/Bar;->getOpacity()F

    move-result p1

    invoke-static {p1, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly81/i;

    invoke-virtual {p0, p1}, Lfq2/d$j;->a(Ly81/i;)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
