.class public final Lkl/d;
.super Lql/c;
.source "SourceFile"


# instance fields
.field public final E:I

.field public final F:J

.field public G:Landroid/graphics/Bitmap;

.field public final z:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lql/c;-><init>(I)V

    iput-object p1, p0, Lkl/d;->z:Landroid/os/Handler;

    iput p2, p0, Lkl/d;->E:I

    iput-wide p3, p0, Lkl/d;->F:J

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lrl/c;)V
    .locals 2

    check-cast p1, Landroid/graphics/Bitmap;

    iput-object p1, p0, Lkl/d;->G:Landroid/graphics/Bitmap;

    const/4 p1, 0x1

    iget-object p2, p0, Lkl/d;->z:Landroid/os/Handler;

    invoke-virtual {p2, p1, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-wide v0, p0, Lkl/d;->F:J

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    return-void
.end method

.method public final e(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lkl/d;->G:Landroid/graphics/Bitmap;

    return-void
.end method
