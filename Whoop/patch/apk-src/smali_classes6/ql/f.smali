.class public final Lql/f;
.super Lql/c;
.source "SourceFile"


# static fields
.field public static final E:Landroid/os/Handler;


# instance fields
.field public final z:Lcom/bumptech/glide/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lmr/d;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lmr/d;-><init>(I)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    sput-object v0, Lql/f;->E:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/h;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lql/c;-><init>(I)V

    iput-object p1, p0, Lql/f;->z:Lcom/bumptech/glide/h;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lrl/c;)V
    .locals 0

    sget-object p1, Lql/f;->E:Landroid/os/Handler;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final e(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method
