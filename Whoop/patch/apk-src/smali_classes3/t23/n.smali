.class public final Lt23/n;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Lt23/n;

.field public static final y:Lt23/n;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lt23/n;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt23/n;-><init>(II)V

    sput-object v0, Lt23/n;->x:Lt23/n;

    new-instance v0, Lt23/n;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lt23/n;-><init>(II)V

    sput-object v0, Lt23/n;->y:Lt23/n;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lt23/n;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt23/n;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    invoke-static {}, Lorg/webrtc/EglBase;->create()Lorg/webrtc/EglBase;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
