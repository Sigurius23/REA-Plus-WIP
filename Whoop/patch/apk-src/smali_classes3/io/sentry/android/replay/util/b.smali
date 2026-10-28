.class public final Lio/sentry/android/replay/util/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Lio/sentry/android/replay/util/b;

.field public static final y:Lio/sentry/android/replay/util/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/replay/util/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/util/b;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/util/b;->x:Lio/sentry/android/replay/util/b;

    new-instance v0, Lio/sentry/android/replay/util/b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/util/b;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/util/b;->y:Lio/sentry/android/replay/util/b;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/util/b;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/sentry/android/replay/util/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    return-object v0

    :pswitch_0
    const/4 v0, 0x1

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
