.class Lwz2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwz2/b;-><init>(Landroid/content/Context;Landroid/graphics/SurfaceTexture;IILxg3/g;Lxg3/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbh3/b;"
    }
.end annotation


# instance fields
.field final synthetic w:Lwz2/b;


# direct methods
.method public constructor <init>(Lwz2/b;)V
    .locals 0

    iput-object p1, p0, Lwz2/b$a;->w:Lwz2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    shr-int/lit8 v1, v1, 0x8

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    and-int/lit16 p1, p1, 0xff

    iget-object v2, p0, Lwz2/b$a;->w:Lwz2/b;

    int-to-float v0, v0

    const/high16 v3, 0x43800000    # 256.0f

    div-float/2addr v0, v3

    invoke-static {v2, v0}, Lwz2/b;->d(Lwz2/b;F)V

    iget-object v0, p0, Lwz2/b$a;->w:Lwz2/b;

    int-to-float v1, v1

    div-float/2addr v1, v3

    invoke-static {v0, v1}, Lwz2/b;->c(Lwz2/b;F)V

    iget-object v0, p0, Lwz2/b$a;->w:Lwz2/b;

    int-to-float p1, p1

    div-float/2addr p1, v3

    invoke-static {v0, p1}, Lwz2/b;->b(Lwz2/b;F)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lwz2/b$a;->a(Ljava/lang/Integer;)V

    return-void
.end method
