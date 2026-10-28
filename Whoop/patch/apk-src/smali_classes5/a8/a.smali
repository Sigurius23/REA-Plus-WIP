.class public La8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqg3/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La8/a;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, La8/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv7/b;Lux/f0;Lux/f0;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, La8/a;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/a;->b:Ljava/lang/Object;

    return-void
.end method

.method private b(Landroid/os/IBinder;)V
    .locals 0

    return-void
.end method

.method private d(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method private final e(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)V
    .locals 3

    iget v0, p0, La8/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La8/a;->b:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    sget v1, Lg8/b;->f:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v1, "androidx.health.platform.client.service.IHealthDataService"

    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, Lg8/c;

    if-eqz v2, :cond_1

    move-object p1, v1

    check-cast p1, Lg8/c;

    goto :goto_0

    :cond_1
    new-instance v1, Lg8/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p1, v1, Lg8/a;->f:Landroid/os/IBinder;

    move-object p1, v1

    :goto_0
    invoke-static {p1}, Lux/f0;->b(Landroid/os/IInterface;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lv7/b;->e:I

    :pswitch_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 0

    iget p1, p0, La8/a;->a:I

    return-void
.end method

.method public f(La8/d;)La8/a;
    .locals 0

    iget p1, p0, La8/a;->a:I

    return-object p0
.end method
