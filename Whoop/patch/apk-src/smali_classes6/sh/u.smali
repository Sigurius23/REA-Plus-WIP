.class public final Lsh/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/j;


# instance fields
.field public final a:Lmc3/i;


# direct methods
.method public constructor <init>(Lmc3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/u;->a:Lmc3/i;

    return-void
.end method


# virtual methods
.method public final a(Luh/h;Lfi/o;)Lsh/k;
    .locals 3

    invoke-static {p2}, Lfi/k;->a(Lfi/o;)Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-eq v0, v1, :cond_0

    sget-object v1, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p1, Luh/h;->a:Lsh/q;

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, La4/a;->E(Lsh/q;Lfi/o;Z)Landroid/graphics/ImageDecoder$Source;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance v1, Lsh/x;

    iget-object p1, p1, Luh/h;->a:Lsh/q;

    iget-object v2, p0, Lsh/u;->a:Lmc3/i;

    invoke-direct {v1, v0, p1, p2, v2}, Lsh/x;-><init>(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lfi/o;Lmc3/i;)V

    return-object v1
.end method
