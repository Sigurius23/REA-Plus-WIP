.class public final Lgh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgh/h;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/net/Uri;

.field public final c:Lmh/m;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Lmh/m;I)V
    .locals 0

    iput p3, p0, Lgh/b;->a:I

    iput-object p1, p0, Lgh/b;->b:Landroid/net/Uri;

    iput-object p2, p0, Lgh/b;->c:Lmh/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 10

    iget p1, p0, Lgh/b;->a:I

    iget-object v0, p0, Lgh/b;->b:Landroid/net/Uri;

    iget-object v1, p0, Lgh/b;->c:Lmh/m;

    const/4 v2, 0x1

    const/4 v3, 0x2

    packed-switch p1, :pswitch_data_0

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v4, "Invalid android.resource URI: "

    if-eqz p1, :cond_c

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_c

    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_b

    invoke-static {v5}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v4, v1, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5, p1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v5

    :goto_1
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v5, v0, v6, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v6, v6, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    const/16 v7, 0x2f

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static {v6, v7, v9, v8}, Lyb3/r;->k0(Ljava/lang/CharSequence;CII)I

    move-result v7

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v8

    invoke-interface {v6, v7, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v7

    invoke-static {v7, v6}, Lqh/d;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "text/xml"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-string v6, "Invalid resource ID: "

    if-eqz p1, :cond_3

    invoke-static {v4, v0}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_3

    :cond_2
    invoke-static {v0, v6}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v7

    :goto_2
    if-eq v7, v3, :cond_4

    if-eq v7, v2, :cond_4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v7

    goto :goto_2

    :cond_4
    if-ne v7, v3, :cond_9

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v3, Lu4/k;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v5, v0, p1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_8

    :goto_3
    instance-of v0, p1, Landroid/graphics/drawable/VectorDrawable;

    if-nez v0, :cond_6

    instance-of v0, p1, Lcc/p;

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    move v2, v9

    :cond_6
    :goto_4
    new-instance v0, Lgh/e;

    if-eqz v2, :cond_7

    iget-object v3, v1, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    iget-object v5, v1, Lmh/m;->d:Lnh/h;

    iget-object v6, v1, Lmh/m;->e:Lnh/g;

    iget-boolean v1, v1, Lmh/m;->f:Z

    invoke-static {p1, v3, v5, v6, v1}, Ls2/e;->r(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lnh/h;Lnh/g;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    move-object p1, v3

    :cond_7
    sget-object v1, Ldh/g;->y:Ldh/g;

    invoke-direct {v0, p1, v2, v1}, Lgh/e;-><init>(Landroid/graphics/drawable/Drawable;ZLdh/g;)V

    goto :goto_5

    :cond_8
    invoke-static {v0, v6}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

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
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v5, v0, v1}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    move-result-object v2

    new-instance v5, Lgh/n;

    invoke-static {v2}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v2

    invoke-static {v2}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v2

    new-instance v7, Ldh/y;

    iget v1, v1, Landroid/util/TypedValue;->density:I

    invoke-direct {v7, p1, v0, v1}, Ldh/y;-><init>(Ljava/lang/String;II)V

    new-instance p1, Ldh/z;

    new-instance v0, Lal0/f;

    invoke-direct {v0, v4, v3}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {p1, v2, v0, v7}, Ldh/z;-><init>(Lne3/j;Lc93/a;Ldt/b;)V

    sget-object v0, Ldh/g;->y:Ldh/g;

    invoke-direct {v5, p1, v6, v0}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    move-object v0, v5

    :goto_5
    return-object v0

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v0, v4}, Lr80/c;->m(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v0, v4}, Lr80/c;->m(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v2}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/Iterable;

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const-string v5, "/"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lgh/n;

    iget-object v2, v1, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v2}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v2

    invoke-static {v2}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v2

    iget-object v1, v1, Lmh/m;->a:Landroid/content/Context;

    new-instance v4, Ldh/a;

    invoke-direct {v4, p1}, Ldh/a;-><init>(Ljava/lang/String;)V

    new-instance v5, Ldh/z;

    new-instance v6, Lal0/f;

    invoke-direct {v6, v1, v3}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v5, v2, v6, v4}, Ldh/z;-><init>(Lne3/j;Lc93/a;Ldt/b;)V

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    invoke-static {v1, p1}, Lqh/d;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ldh/g;->y:Ldh/g;

    invoke-direct {v0, v5, p1, v1}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
