.class public final Luh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/f;


# instance fields
.field public final synthetic a:I

.field public final b:Lrh/y;

.field public final c:Lfi/o;


# direct methods
.method public synthetic constructor <init>(Lrh/y;Lfi/o;I)V
    .locals 0

    iput p3, p0, Luh/a;->a:I

    iput-object p1, p0, Luh/a;->b:Lrh/y;

    iput-object p2, p0, Luh/a;->c:Lfi/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 13

    iget p1, p0, Luh/a;->a:I

    const-string v0, "toLowerCase(...)"

    const/16 v1, 0x2e

    const/16 v2, 0x1c

    const/4 v3, -0x1

    const/4 v4, 0x6

    const-string v5, "substring(...)"

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    iget-object v10, p0, Luh/a;->b:Lrh/y;

    iget-object v11, p0, Luh/a;->c:Lfi/o;

    packed-switch p1, :pswitch_data_0

    iget-object p1, v10, Lrh/y;->d:Ljava/lang/String;

    const-string v0, "Invalid android.resource URI: "

    if-eqz p1, :cond_c

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    move-object v7, p1

    :cond_0
    if-eqz v7, :cond_c

    invoke-static {v10}, Lrh/o;->h(Lrh/y;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_b

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, v11, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v1

    :goto_0
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v1, p1, v2, v8}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v2, v2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/squareup/wire/n;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "text/xml"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v0, p1}, Lo73/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    :cond_2
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    :goto_1
    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    if-eq v3, v8, :cond_3

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto :goto_1

    :cond_3
    if-ne v3, v4, :cond_9

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v3, Lu4/k;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_8

    move-object p1, v1

    :goto_2
    sget-object v1, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    instance-of v1, p1, Landroid/graphics/drawable/VectorDrawable;

    if-nez v1, :cond_5

    instance-of v1, p1, Lcc/p;

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move v1, v9

    goto :goto_4

    :cond_5
    :goto_3
    move v1, v8

    :goto_4
    new-instance v2, Luh/g;

    if-eqz v1, :cond_7

    sget-object v3, Lfi/k;->b:Lf93/a;

    invoke-static {v11, v3}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap$Config;

    iget-object v4, v11, Lfi/o;->b:Lgi/i;

    iget-object v5, v11, Lfi/o;->c:Lgi/g;

    iget-object v6, v11, Lfi/o;->d:Lgi/d;

    sget-object v7, Lgi/d;->x:Lgi/d;

    if-ne v6, v7, :cond_6

    goto :goto_5

    :cond_6
    move v8, v9

    :goto_5
    invoke-static {p1, v3, v4, v5, v8}, Lbi/g;->v(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lgi/i;Lgi/g;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    move-object p1, v3

    :cond_7
    invoke-static {p1}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object p1

    sget-object v0, Lsh/h;->y:Lsh/h;

    invoke-direct {v2, p1, v1, v0}, Luh/g;-><init>(Lrh/j;ZLsh/h;)V

    goto :goto_6

    :cond_8
    const-string v0, "Invalid resource ID: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v0, "No start tag found."

    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    move-result-object v0

    new-instance v1, Luh/h;

    invoke-static {v0}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    iget-object v3, v11, Lfi/o;->f:Lne3/p;

    new-instance v4, Lsh/r;

    invoke-direct {v4, v7, p1}, Lsh/r;-><init>(Ljava/lang/String;I)V

    new-instance p1, Lsh/s;

    invoke-direct {p1, v0, v3, v4}, Lsh/s;-><init>(Lne3/j;Lne3/p;Ls2/a;)V

    sget-object v0, Lsh/h;->y:Lsh/h;

    invoke-direct {v1, p1, v2, v0}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    move-object v2, v1

    :goto_6
    return-object v2

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v10, Lrh/y;->e:Ljava/lang/String;

    if-nez p1, :cond_d

    move-object p1, v6

    :cond_d
    const/16 v12, 0x21

    invoke-static {p1, v12, v9, v9, v4}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v4

    if-eq v4, v3, :cond_10

    sget-object v3, Lne3/e0;->x:Ljava/lang/String;

    invoke-virtual {p1, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v9}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v3

    add-int/2addr v4, v8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {p1, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v9}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object p1

    new-instance v4, Luh/h;

    iget-object v5, v11, Lfi/o;->f:Lne3/p;

    const-string v8, "<this>"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lo72/e;

    const/16 v9, 0xa

    invoke-direct {v8, v9}, Lo72/e;-><init>(I)V

    invoke-static {v3, v5, v8}, Lv8/b;->L(Lne3/e0;Lne3/p;Lkotlin/jvm/functions/Function1;)Lne3/s0;

    move-result-object v3

    invoke-static {p1, v3, v7, v7, v2}, Ls2/d;->g(Lne3/e0;Lne3/p;Ljava/lang/String;Lth/g;I)Lsh/p;

    move-result-object v2

    invoke-virtual {p1}, Lne3/e0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v6}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lki/h;->a:Ln83/f;

    invoke-virtual {v0, p1}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_f

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :cond_f
    :goto_7
    sget-object p1, Lsh/h;->y:Lsh/h;

    invoke-direct {v4, v2, v7, p1}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object v4

    :cond_10
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Invalid jar:file URI: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    sget-object p1, Lne3/e0;->x:Ljava/lang/String;

    invoke-static {v10}, Lrh/o;->g(Lrh/y;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-static {p1, v9}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object p1

    new-instance v3, Luh/h;

    iget-object v4, v11, Lfi/o;->f:Lne3/p;

    invoke-static {p1, v4, v7, v7, v2}, Ls2/d;->g(Lne3/e0;Lne3/p;Ljava/lang/String;Lth/g;I)Lsh/p;

    move-result-object v2

    invoke-virtual {p1}, Lne3/e0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v6}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_8

    :cond_11
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lki/h;->a:Ln83/f;

    invoke-virtual {v0, p1}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_12

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :cond_12
    :goto_8
    sget-object p1, Lsh/h;->y:Lsh/h;

    invoke-direct {v3, v2, v7, p1}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object v3

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "filePath == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    iget-object p1, v10, Lrh/y;->a:Ljava/lang/String;

    iget-object v0, v10, Lrh/y;->a:Ljava/lang/String;

    const-string v1, ";base64,"

    invoke-static {p1, v1, v9, v9, v4}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result p1

    const-string v1, "invalid data uri: "

    if-eq p1, v3, :cond_15

    const/16 v2, 0x3a

    invoke-static {v0, v2, v9, v9, v4}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v2

    if-eq v2, v3, :cond_14

    add-int/2addr v2, v8

    invoke-virtual {v0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ly83/c;->f:Ly83/a;

    add-int/lit8 p1, p1, 0x8

    const/4 v3, 0x4

    invoke-static {v2, v0, p1, v3}, Ly83/c;->a(Ly83/c;Ljava/lang/CharSequence;II)[B

    move-result-object p1

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p1}, Lne3/h;->write([B)V

    iget-object p1, v11, Lfi/o;->f:Lne3/p;

    invoke-static {v0, p1}, Ls2/d;->h(Lne3/j;Lne3/p;)Lsh/s;

    move-result-object p1

    sget-object v0, Lsh/h;->x:Lsh/h;

    new-instance v2, Luh/h;

    invoke-direct {v2, p1, v1, v0}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object v2

    :cond_14
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    invoke-static {v10}, Lrh/o;->h(Lrh/y;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v8}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "/"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Luh/h;

    iget-object v1, v11, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v1

    invoke-static {v1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v1

    iget-object v2, v11, Lfi/o;->f:Lne3/p;

    new-instance v3, Lsh/a;

    invoke-direct {v3, p1}, Lsh/a;-><init>(Ljava/lang/String;)V

    new-instance v4, Lsh/s;

    invoke-direct {v4, v1, v2, v3}, Lsh/s;-><init>(Lne3/j;Lne3/p;Ls2/a;)V

    invoke-static {p1}, Lcom/squareup/wire/n;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lsh/h;->y:Lsh/h;

    invoke-direct {v0, v4, p1, v1}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
