.class public final Lio/sentry/android/replay/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Lio/sentry/android/replay/a;

.field public static final y:Lio/sentry/android/replay/a;

.field public static final z:Lio/sentry/android/replay/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->x:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->y:Lio/sentry/android/replay/a;

    new-instance v0, Lio/sentry/android/replay/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/a;-><init>(II)V

    sput-object v0, Lio/sentry/android/replay/a;->z:Lio/sentry/android/replay/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/a;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/sentry/android/replay/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lup/d;->C()Lio/sentry/android/replay/t;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lio/sentry/util/j;

    invoke-direct {v0}, Lio/sentry/util/j;-><init>()V

    return-object v0

    :pswitch_1
    new-instance v0, Lyb3/p;

    const-string v1, "_[a-z]"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
