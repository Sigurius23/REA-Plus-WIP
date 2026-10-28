.class public final Lhj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Lhj/h;

.field public static final y:Lhj/h;

.field public static final z:Lhj/h;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lhj/h;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhj/h;-><init>(II)V

    sput-object v0, Lhj/h;->x:Lhj/h;

    new-instance v0, Lhj/h;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhj/h;-><init>(II)V

    sput-object v0, Lhj/h;->y:Lhj/h;

    new-instance v0, Lhj/h;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhj/h;-><init>(II)V

    sput-object v0, Lhj/h;->z:Lhj/h;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lhj/h;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lhj/h;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkj/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Lkj/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, v0, Lkj/d;->e:Landroid/os/Handler;

    new-instance v2, Landroidx/lifecycle/z0;

    const/16 v3, 0x10

    invoke-direct {v2, v0, v3}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Lkj/d;->f:Landroidx/lifecycle/z0;

    const-wide/32 v3, 0xea60

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object v0

    :pswitch_1
    new-instance v0, Lkj/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
