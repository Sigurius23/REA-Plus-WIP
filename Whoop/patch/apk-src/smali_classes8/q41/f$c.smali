.class public abstract synthetic Lq41/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq41/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "c"
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


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;->values()[Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;->STRAIN_GRADIENT:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-object v0, Lq41/f$c;->a:[I

    return-void
.end method
