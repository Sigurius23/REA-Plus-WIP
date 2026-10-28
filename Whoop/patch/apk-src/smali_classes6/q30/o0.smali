.class public final Lq30/o0;
.super Lx30/s0;
.source "SourceFile"


# static fields
.field public static final c:Lq30/o0;

.field public static final d:Lq30/o0;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lq30/o0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq30/o0;-><init>(I)V

    sput-object v0, Lq30/o0;->c:Lq30/o0;

    new-instance v0, Lq30/o0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lq30/o0;-><init>(I)V

    sput-object v0, Lq30/o0;->d:Lq30/o0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lq30/o0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final O(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private final P()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    iget v0, p0, Lq30/o0;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "StripeSdk"

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s()V
    .locals 2

    iget v0, p0, Lq30/o0;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Make initial challenge request."

    const-string v1, "StripeSdk"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
