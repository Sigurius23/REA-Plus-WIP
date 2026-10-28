.class public final Lli/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lli/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lfi/o;Lrh/t;)Luh/f;
    .locals 8

    iget p3, p0, Lli/b;->a:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x2

    const-string v3, "android_asset"

    const-string v4, "file"

    const/4 v5, 0x3

    const/4 v6, 0x4

    const/4 v7, 0x0

    packed-switch p3, :pswitch_data_0

    check-cast p1, Lrh/y;

    iget-object p3, p1, Lrh/y;->c:Ljava/lang/String;

    const-string v0, "android.resource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v7, Luh/a;

    invoke-direct {v7, p1, p2, v6}, Luh/a;-><init>(Lrh/y;Lfi/o;I)V

    :goto_0
    return-object v7

    :pswitch_0
    check-cast p1, Lrh/y;

    iget-object p3, p1, Lrh/y;->c:Ljava/lang/String;

    const-string v0, "jar:file"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v7, Luh/a;

    invoke-direct {v7, p1, p2, v5}, Luh/a;-><init>(Lrh/y;Lfi/o;I)V

    :goto_1
    return-object v7

    :pswitch_1
    check-cast p1, Lrh/y;

    iget-object p3, p1, Lrh/y;->c:Ljava/lang/String;

    if-eqz p3, :cond_2

    invoke-virtual {p3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    :cond_2
    iget-object p3, p1, Lrh/y;->e:Ljava/lang/String;

    if-eqz p3, :cond_4

    sget-object p3, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    iget-object p3, p1, Lrh/y;->c:Ljava/lang/String;

    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1}, Lrh/o;->h(Lrh/y;)Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_2

    :cond_3
    new-instance v7, Luh/a;

    invoke-direct {v7, p1, p2, v2}, Luh/a;-><init>(Lrh/y;Lfi/o;I)V

    :cond_4
    :goto_2
    return-object v7

    :pswitch_2
    check-cast p1, Landroid/graphics/drawable/Drawable;

    new-instance p3, Lli/e;

    invoke-direct {p3, p1, p2, v6}, Lli/e;-><init>(Ljava/lang/Object;Lfi/o;I)V

    return-object p3

    :pswitch_3
    check-cast p1, Lrh/y;

    iget-object p3, p1, Lrh/y;->c:Ljava/lang/String;

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    goto :goto_3

    :cond_5
    new-instance v7, Luh/a;

    invoke-direct {v7, p1, p2, v1}, Luh/a;-><init>(Lrh/y;Lfi/o;I)V

    :goto_3
    return-object v7

    :pswitch_4
    check-cast p1, Lrh/y;

    iget-object p3, p1, Lrh/y;->c:Ljava/lang/String;

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6

    goto :goto_4

    :cond_6
    new-instance v7, Luh/c;

    invoke-direct {v7, p1, p2}, Luh/c;-><init>(Lrh/y;Lfi/o;)V

    :goto_4
    return-object v7

    :pswitch_5
    check-cast p1, Ljava/nio/ByteBuffer;

    new-instance p3, Lli/e;

    invoke-direct {p3, p1, p2, v5}, Lli/e;-><init>(Ljava/lang/Object;Lfi/o;I)V

    return-object p3

    :pswitch_6
    check-cast p1, [B

    new-instance p3, Lli/e;

    invoke-direct {p3, p1, p2, v2}, Lli/e;-><init>(Ljava/lang/Object;Lfi/o;I)V

    return-object p3

    :pswitch_7
    check-cast p1, Landroid/graphics/Bitmap;

    new-instance p3, Lli/e;

    invoke-direct {p3, p1, p2, v1}, Lli/e;-><init>(Ljava/lang/Object;Lfi/o;I)V

    return-object p3

    :pswitch_8
    check-cast p1, Lrh/y;

    sget-object p3, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    iget-object p3, p1, Lrh/y;->c:Ljava/lang/String;

    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {p1}, Lrh/o;->h(Lrh/y;)Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    new-instance v7, Luh/a;

    invoke-direct {v7, p1, p2, v0}, Luh/a;-><init>(Lrh/y;Lfi/o;I)V

    :cond_7
    return-object v7

    :pswitch_9
    check-cast p1, Landroid/media/MediaDataSource;

    new-instance p3, Lli/e;

    invoke-direct {p3, p1, p2, v0}, Lli/e;-><init>(Ljava/lang/Object;Lfi/o;I)V

    return-object p3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
