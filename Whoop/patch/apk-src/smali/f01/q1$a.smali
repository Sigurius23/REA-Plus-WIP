.class final Lf01/q1$a;
.super Lf01/q1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf01/q1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\u00ca\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "com/whoop/design/atomic/molecule/card/TileBackgroundStyle.HAL",
        "Lf01/q1;",
        "Landroidx/compose/ui/Modifier;",
        "w",
        "Landroidx/compose/ui/Modifier;",
        "getStyleModifier",
        "()Landroidx/compose/ui/Modifier;",
        "styleModifier",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lf01/q1;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-wide/high16 p1, 0x3ff8000000000000L    # 1.5

    double-to-float p1, p1

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object p2

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v2, p2, v1}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object p2

    invoke-static {p2}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object p2

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {p1, p2, v0, v1}, Li91/c;->d(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    iput-object p1, p0, Lf01/q1$a;->w:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public getStyleModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    iget-object v0, p0, Lf01/q1$a;->w:Landroidx/compose/ui/Modifier;

    return-object v0
.end method
