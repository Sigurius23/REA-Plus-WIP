.class public final Luh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/f;


# instance fields
.field public final a:Lrh/y;

.field public final b:Lfi/o;


# direct methods
.method public constructor <init>(Lrh/y;Lfi/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/c;->a:Lrh/y;

    iput-object p2, p0, Luh/c;->b:Lfi/o;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 9

    iget-object p1, p0, Luh/c;->a:Lrh/y;

    iget-object v0, p1, Lrh/y;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Luh/c;->b:Lfi/o;

    iget-object v2, v1, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v3, p1, Lrh/y;->d:Ljava/lang/String;

    const-string v4, "com.android.contacts"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "r"

    const-string v6, "\'."

    if-eqz v4, :cond_1

    invoke-static {p1}, Lrh/o;->h(Lrh/y;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    const-string v7, "display_photo"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2, v0, v5}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to find a contact photo associated with \'"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1d

    if-lt v4, v7, :cond_7

    const-string v4, "media"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lrh/o;->h(Lrh/y;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v7, 0x3

    if-lt v4, v7, :cond_7

    add-int/lit8 v7, v4, -0x3

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "audio"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    add-int/lit8 v4, v4, -0x2

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "albums"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, v1, Lfi/o;->b:Lgi/i;

    iget-object v4, v3, Lgi/i;->a:Lgi/c;

    instance-of v5, v4, Lgi/a;

    const/4 v7, 0x0

    if-eqz v5, :cond_3

    check-cast v4, Lgi/a;

    goto :goto_0

    :cond_3
    move-object v4, v7

    :goto_0
    if-eqz v4, :cond_5

    iget v4, v4, Lgi/a;->a:I

    iget-object v3, v3, Lgi/i;->b:Lgi/c;

    instance-of v5, v3, Lgi/a;

    if-eqz v5, :cond_4

    check-cast v3, Lgi/a;

    goto :goto_1

    :cond_4
    move-object v3, v7

    :goto_1
    if-eqz v3, :cond_5

    iget v3, v3, Lgi/a;->a:I

    new-instance v5, Landroid/os/Bundle;

    const/4 v8, 0x1

    invoke-direct {v5, v8}, Landroid/os/Bundle;-><init>(I)V

    new-instance v8, Landroid/graphics/Point;

    invoke-direct {v8, v4, v3}, Landroid/graphics/Point;-><init>(II)V

    const-string v3, "android.content.extra.SIZE"

    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_2

    :cond_5
    move-object v5, v7

    :goto_2
    const-string v3, "image/*"

    invoke-virtual {v2, v0, v3, v5, v7}, Landroid/content/ContentResolver;->openTypedAssetFile(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v3

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to find a music thumbnail associated with \'"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    invoke-virtual {v2, v0, v5}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v3

    if-eqz v3, :cond_8

    :goto_4
    new-instance v4, Luh/h;

    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object v5

    invoke-static {v5}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v5

    invoke-static {v5}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v5

    iget-object v1, v1, Lfi/o;->f:Lne3/p;

    new-instance v6, Lsh/g;

    invoke-direct {v6, p1, v3}, Lsh/g;-><init>(Lrh/y;Landroid/content/res/AssetFileDescriptor;)V

    new-instance p1, Lsh/s;

    invoke-direct {p1, v5, v1, v6}, Lsh/s;-><init>(Lne3/j;Lne3/p;Ls2/a;)V

    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lsh/h;->y:Lsh/h;

    invoke-direct {v4, p1, v0, v1}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object v4

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to open \'"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
