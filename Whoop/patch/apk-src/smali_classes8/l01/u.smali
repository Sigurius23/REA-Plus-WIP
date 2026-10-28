.class public abstract Ll01/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Li2/x;",
        "a",
        "Ljava/util/List;",
        "citlGradientColors",
        "b",
        "citlNewGradientColors",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-wide v0, 0xffadc2cdL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    const v0, 0x4d479ac2    # 2.0930051E8f

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v0

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    sget v0, Li2/x;->o:I

    sget-wide v0, Li2/x;->m:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v3, v4}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    sput-object v2, Ll01/u;->a:Ljava/util/List;

    const-wide v2, 0x80ff9e86L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const v2, 0x4db126ff    # 3.7151536E8f

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v4, v5, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll01/u;->b:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a()Ljava/util/List;
    .locals 1

    sget-object v0, Ll01/u;->a:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/List;
    .locals 1

    sget-object v0, Ll01/u;->b:Ljava/util/List;

    return-object v0
.end method
