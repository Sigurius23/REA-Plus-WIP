.class public final Lgl/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/j;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgl/y;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILwk/h;)Lzk/z;
    .locals 0

    iget p2, p0, Lgl/y;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/io/File;

    new-instance p2, Lgl/x;

    invoke-direct {p2, p1}, Lgl/x;-><init>(Ljava/io/File;)V

    return-object p2

    :pswitch_0
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Lil/b;->b(Landroid/graphics/drawable/Drawable;)Lil/b;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroid/graphics/Bitmap;

    new-instance p2, Lgl/x;

    invoke-direct {p2, p1}, Lgl/x;-><init>(Landroid/graphics/Bitmap;)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic b(Ljava/lang/Object;Lwk/h;)Z
    .locals 0

    iget p2, p0, Lgl/y;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/io/File;

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :pswitch_1
    check-cast p1, Landroid/graphics/Bitmap;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
