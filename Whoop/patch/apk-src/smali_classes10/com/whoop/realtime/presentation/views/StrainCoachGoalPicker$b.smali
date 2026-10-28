.class public final Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker$b;
.super Lql/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->onLayout(ZIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lql/g;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\u000c\u0012\u0006\u0008\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/whoop/realtime/presentation/views/StrainCoachGoalPicker$b",
        "Lql/g;",
        "Landroid/graphics/Bitmap;",
        "resource",
        "Lrl/c;",
        "transition",
        "Ll83/a0;",
        "i",
        "(Landroid/graphics/Bitmap;Lrl/c;)V",
        "realtime-activity_release"
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
.field final synthetic z:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker$b;->z:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-direct {p0}, Lql/g;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lrl/c;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker$b;->i(Landroid/graphics/Bitmap;Lrl/c;)V

    return-void
.end method

.method public i(Landroid/graphics/Bitmap;Lrl/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lrl/c;",
            ")V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker$b;->z:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-static {p2}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->s(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;)Lde/hdodenhof/circleimageview/CircleImageView;

    move-result-object p2

    invoke-virtual {p2, p1}, Lde/hdodenhof/circleimageview/CircleImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method
