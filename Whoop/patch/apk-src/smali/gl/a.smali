.class public final Lgl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/j;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lgl/a;->a:I

    iput-object p2, p0, Lgl/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Lgl/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lwk/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgl/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lgl/a;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lgl/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILwk/h;)Lzk/z;
    .locals 9

    iget v0, p0, Lgl/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/io/InputStream;

    instance-of v0, p1, Lgl/u;

    if-eqz v0, :cond_0

    check-cast p1, Lgl/u;

    const/4 v0, 0x0

    move v1, v0

    goto :goto_0

    :cond_0
    new-instance v0, Lgl/u;

    iget-object v1, p0, Lgl/a;->c:Ljava/lang/Object;

    check-cast v1, Lal/g;

    invoke-direct {v0, p1, v1}, Lgl/u;-><init>(Ljava/io/InputStream;Lal/g;)V

    const/4 p1, 0x1

    move v1, p1

    move-object p1, v0

    :goto_0
    invoke-static {p1}, Ltl/d;->b(Lgl/u;)Ltl/d;

    move-result-object v2

    new-instance v0, Ltl/i;

    invoke-direct {v0, v2}, Ltl/i;-><init>(Ltl/d;)V

    new-instance v8, Lio/sentry/internal/debugmeta/c;

    const/16 v3, 0x10

    invoke-direct {v8, v3, p1, v2}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    :try_start_0
    iget-object v3, p0, Lgl/a;->b:Ljava/lang/Object;

    check-cast v3, Lgl/m;

    new-instance v4, La33/d;

    iget-object v5, v3, Lgl/m;->d:Ljava/util/ArrayList;

    iget-object v6, v3, Lgl/m;->c:Lal/g;

    invoke-direct {v4, v0, v5, v6}, La33/d;-><init>(Ljava/io/InputStream;Ljava/util/ArrayList;Lal/g;)V

    move v5, p2

    move v6, p3

    move-object v7, p4

    invoke-virtual/range {v3 .. v8}, Lgl/m;->a(La33/d;IILwk/h;Lgl/l;)Lgl/c;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ltl/d;->h()V

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lgl/u;->h()V

    :cond_1
    return-object p2

    :catchall_0
    move-exception v0

    move-object p2, v0

    invoke-virtual {v2}, Ltl/d;->h()V

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lgl/u;->h()V

    :cond_2
    throw p2

    :pswitch_0
    move v5, p2

    move v6, p3

    check-cast p1, Landroid/net/Uri;

    iget-object p2, p0, Lgl/a;->b:Ljava/lang/Object;

    check-cast p2, Lil/c;

    invoke-virtual {p2, p1}, Lil/c;->c(Landroid/net/Uri;)Lzk/z;

    move-result-object p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    check-cast p1, Lil/b;

    invoke-virtual {p1}, Lil/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Drawable;

    iget-object p2, p0, Lgl/a;->c:Ljava/lang/Object;

    check-cast p2, Lal/b;

    invoke-static {p2, p1, v5, v6}, Lgl/o;->a(Lal/b;Landroid/graphics/drawable/Drawable;II)Lgl/c;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_1
    move v5, p2

    move v6, p3

    move-object v7, p4

    iget-object p2, p0, Lgl/a;->b:Ljava/lang/Object;

    check-cast p2, Lwk/j;

    invoke-interface {p2, p1, v5, v6, v7}, Lwk/j;->a(Ljava/lang/Object;IILwk/h;)Lzk/z;

    move-result-object p1

    iget-object p2, p0, Lgl/a;->c:Ljava/lang/Object;

    check-cast p2, Landroid/content/res/Resources;

    invoke-static {p2, p1}, Lgl/c;->d(Landroid/content/res/Resources;Lzk/z;)Lgl/c;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;Lwk/h;)Z
    .locals 1

    iget v0, p0, Lgl/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/io/InputStream;

    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    const-string p2, "android.resource"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Lgl/a;->b:Ljava/lang/Object;

    check-cast v0, Lwk/j;

    invoke-interface {v0, p1, p2}, Lwk/j;->b(Ljava/lang/Object;Lwk/h;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
