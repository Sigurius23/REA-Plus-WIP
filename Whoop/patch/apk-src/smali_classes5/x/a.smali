.class public final Lx/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lx/a;->a:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public a()Lx/a;
    .locals 2

    new-instance v0, Lx/a;

    iget-object v1, p0, Lx/a;->a:Ljava/lang/Integer;

    invoke-direct {v0, v1}, Lx/a;-><init>(Ljava/lang/Integer;)V

    return-object v0
.end method

.method public b(I)V
    .locals 1

    const/high16 v0, -0x1000000

    or-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lx/a;->a:Ljava/lang/Integer;

    return-void
.end method

.method public c()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lx/a;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v2, "android.support.customtabs.extra.TOOLBAR_COLOR"

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    return-object v0
.end method
