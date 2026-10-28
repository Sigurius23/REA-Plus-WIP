.class public final Ldk2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Ldk2/c;",
        "",
        "Lh71/l;",
        "state",
        "<init>",
        "(Lh71/l;)V",
        "",
        "a",
        "()F",
        "Lh71/l;",
        "tilt-graph_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Lh71/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lh71/l;->f:I

    sput v0, Ldk2/c;->b:I

    return-void
.end method

.method public constructor <init>(Lh71/l;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk2/c;->a:Lh71/l;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 5

    iget-object v0, p0, Ldk2/c;->a:Lh71/l;

    invoke-virtual {v0}, Lh71/l;->a()Ld61/a;

    move-result-object v1

    invoke-interface {v1}, Ld61/a;->a()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0}, Lh71/l;->b()Li71/h;

    move-result-object v2

    invoke-virtual {v2}, Li71/h;->c()J

    move-result-wide v2

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    iget-object v3, p0, Ldk2/c;->a:Lh71/l;

    invoke-virtual {v3}, Lh71/l;->d()F

    move-result v3

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    sub-float/2addr v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-float/2addr v1, v3

    invoke-virtual {v0}, Lh71/l;->b()Li71/h;

    move-result-object v2

    invoke-virtual {v2}, Li71/h;->d()J

    move-result-wide v2

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {v0}, Lh71/l;->e()F

    move-result v0

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v3, v0

    mul-float/2addr v3, v2

    div-float/2addr v1, v3

    add-float/2addr v1, v0

    const v0, 0x3f59999a    # 0.85f

    mul-float/2addr v1, v0

    return v1
.end method
