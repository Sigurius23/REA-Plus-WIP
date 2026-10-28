.class final Lr61/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr61/e;->o([F)Ljava/util/List;
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
.field final synthetic w:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    iput p1, p0, Lr61/e$f;->w:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly81/i;)J
    .locals 2

    const-string v0, "$this$whoopColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lr61/e$f;->w:F

    const v1, 0x3f28f5c3    # 0.66f

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Ly81/i;->Z()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const v1, 0x3ea8f5c3    # 0.33f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Ly81/i;->c0()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p1}, Ly81/i;->b0()J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly81/i;

    invoke-virtual {p0, p1}, Lr61/e$f;->a(Ly81/i;)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
