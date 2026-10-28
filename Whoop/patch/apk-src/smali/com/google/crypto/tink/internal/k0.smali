.class public Lcom/google/crypto/tink/internal/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/internal/n0;
.implements Lio/sentry/metrics/a;
.implements Lhb3/a;
.implements Lhb3/c;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    packed-switch p1, :pswitch_data_0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    .line 10
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    .line 11
    const-string p1, "PublicSuffixDatabase.list"

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    return-void

    .line 12
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const p1, 0x7f08020d

    const v0, 0x7f0801c3

    const v1, 0x7f08020f

    .line 13
    filled-new-array {v1, p1, v0}, [I

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    const/4 p1, 0x7

    .line 14
    new-array v0, p1, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    .line 15
    new-array p1, p1, [I

    fill-array-data p1, :array_1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    const p1, 0x7f0801d2

    const v0, 0x7f0801f3

    const v1, 0x7f0801f4

    .line 16
    filled-new-array {v1, p1, v0}, [I

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    const p1, 0x7f080206

    const v0, 0x7f080210

    .line 17
    filled-new-array {p1, v0}, [I

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    const p1, 0x7f0801c7

    const v0, 0x7f0801cd

    const v1, 0x7f0801c6

    const v2, 0x7f0801cc

    .line 18
    filled-new-array {v1, v2, p1, v0}, [I

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 4
        0x7f0801db
        0x7f0801fe
        0x7f0801e2
        0x7f0801dd
        0x7f0801de
        0x7f0801e1
        0x7f0801e0
    .end array-data

    :array_1
    .array-data 4
        0x7f08020c
        0x7f08020e
        0x7f0801d4
        0x7f080208
        0x7f080209
        0x7f08020a
        0x7f08020b
    .end array-data
.end method

.method public constructor <init>(Lio/sentry/q6;Lcd3/g;)V
    .locals 3

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lio/sentry/util/a;

    .line 21
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 22
    iput-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    .line 23
    new-instance v0, Laj/c;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laj/c;-><init>(IB)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    .line 24
    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    .line 25
    iput-object p2, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    .line 26
    new-instance p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p2, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    .line 27
    new-instance p2, Lio/sentry/h5;

    invoke-direct {p2, p1}, Lio/sentry/h5;-><init>(Lio/sentry/q6;)V

    iput-object p2, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;La0/g;Ljava/lang/String;Ljava/lang/String;Lzp/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    :cond_1
    iput-object p3, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object p4, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    if-nez p5, :cond_2

    sget-object p5, Lzp/a;->w:Lzp/a;

    :cond_2
    iput-object p5, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    new-instance p3, Ljava/util/HashSet;

    .line 3
    invoke-direct {p3, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 4
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_3

    .line 5
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    return-void

    .line 6
    :cond_3
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    .line 7
    throw p1
.end method

.method public static B(Ls/c2;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    const v0, 0x7f080202

    invoke-virtual {p0, p1, v0}, Ls/c2;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const v1, 0x7f080203

    invoke-virtual {p0, p1, v1}, Ls/c2;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of p1, v0, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p1

    if-ne p1, p2, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    if-ne p1, p2, :cond_0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-direct {p1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_0
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    move-object p1, v2

    :goto_0
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/BitmapDrawable;->setTileModeX(Landroid/graphics/Shader$TileMode;)V

    instance-of v2, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    if-ne v2, p2, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    if-ne v2, p2, :cond_1

    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_1

    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p2, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    new-instance p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {p0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    :goto_1
    new-instance p2, Landroid/graphics/drawable/LayerDrawable;

    const/4 v2, 0x3

    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    aput-object v0, v2, v1

    const/4 v0, 0x1

    aput-object p0, v2, v0

    const/4 p0, 0x2

    aput-object p1, v2, p0

    invoke-direct {p2, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/high16 p1, 0x1020000

    invoke-virtual {p2, v1, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    const p1, 0x102000f

    invoke-virtual {p2, v0, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    const p1, 0x102000d

    invoke-virtual {p2, p0, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    return-object p2
.end method

.method public static R(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-nez p2, :cond_0

    sget-object p2, Ls/p;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_0
    invoke-static {p1, p2}, Ls/p;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public static b([II)Z
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p0, v2

    if-ne v3, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;
    .locals 1

    sget-object v0, Lvs/h4;->E:Lvs/h4;

    if-ne p3, v0, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type raw should not have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p4, :cond_2

    :goto_0
    new-instance v0, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    invoke-static {p0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object p0

    iput-object p0, v0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    iput-object p1, v0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object p2, v0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object p3, v0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    iput-object p4, v0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    return-object v0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type different from raw should have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 6

    const v0, 0x7f04013f

    invoke-static {p0, v0}, Ls/i2;->c(Landroid/content/Context;I)I

    move-result v0

    const v1, 0x7f04013c

    invoke-static {p0, v1}, Ls/i2;->b(Landroid/content/Context;I)I

    move-result p0

    sget-object v1, Ls/i2;->b:[I

    sget-object v2, Ls/i2;->d:[I

    invoke-static {v0, p1}, Lv4/a;->e(II)I

    move-result v3

    sget-object v4, Ls/i2;->c:[I

    invoke-static {v0, p1}, Lv4/a;->e(II)I

    move-result v0

    sget-object v5, Ls/i2;->f:[I

    filled-new-array {v1, v2, v4, v5}, [[I

    move-result-object v1

    filled-new-array {p0, v3, v0, p1}, [I

    move-result-object p0

    new-instance p1, Landroid/content/res/ColorStateList;

    invoke-direct {p1, v1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object p1
.end method

.method public static synthetic u(Lcom/google/crypto/tink/internal/k0;Lhb3/a0;Loa3/r;Ljava/lang/Boolean;ZI)Ljava/util/List;
    .locals 9

    and-int/lit8 v0, p5, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    move v5, v0

    :goto_0
    and-int/lit8 v0, p5, 0x10

    if-eqz v0, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v7, p3

    and-int/lit8 p3, p5, 0x20

    if-eqz p3, :cond_2

    move v8, v1

    goto :goto_1

    :cond_2
    move v8, p4

    :goto_1
    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v2 .. v8}, Lcom/google/crypto/tink/internal/k0;->p(Lhb3/a0;Loa3/r;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static y(Lwa3/v;Lsa3/f;Lsa3/h;IZ)Loa3/r;
    .locals 6

    const-string v0, "proto"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    instance-of v0, p0, Lqa3/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object p3, Lua3/g;->a:Lwa3/i;

    check-cast p0, Lqa3/o;

    invoke-static {p0, p1, p2}, Lua3/g;->a(Lqa3/o;Lsa3/f;Lsa3/h;)Lua3/e;

    move-result-object p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {p0}, Lds/q;->u(Ljc/x;)Loa3/r;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lqa3/c0;

    if-eqz v0, :cond_3

    sget-object p3, Lua3/g;->a:Lwa3/i;

    check-cast p0, Lqa3/c0;

    invoke-static {p0, p1, p2}, Lua3/g;->c(Lqa3/c0;Lsa3/f;Lsa3/h;)Lua3/e;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lds/q;->u(Ljc/x;)Loa3/r;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Lqa3/k0;

    if-eqz v0, :cond_9

    move-object v0, p0

    check-cast v0, Lwa3/m;

    sget-object v2, Lta3/l;->d:Lwa3/o;

    const-string v3, "propertySignature"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lta3/f;

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {p3}, Le4/p;->e(I)I

    move-result p3

    const/4 v2, 0x1

    if-eq p3, v2, :cond_8

    const/4 p0, 0x2

    if-eq p3, p0, :cond_7

    const/4 p0, 0x3

    if-eq p3, p0, :cond_5

    goto :goto_0

    :cond_5
    iget p0, v0, Lta3/f;->x:I

    const/16 p2, 0x8

    and-int/2addr p0, p2

    if-ne p0, p2, :cond_6

    iget-object p0, v0, Lta3/f;->F:Lta3/d;

    const-string p2, "getSetter(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lds/q;->v(Lsa3/f;Lta3/d;)Loa3/r;

    move-result-object p0

    return-object p0

    :cond_6
    return-object v1

    :cond_7
    invoke-virtual {v0}, Lta3/f;->i()Z

    move-result p0

    if-eqz p0, :cond_9

    iget-object p0, v0, Lta3/f;->E:Lta3/d;

    const-string p2, "getGetter(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lds/q;->v(Lsa3/f;Lta3/d;)Loa3/r;

    move-result-object p0

    return-object p0

    :cond_8
    move-object v0, p0

    check-cast v0, Lqa3/k0;

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    invoke-static/range {v0 .. v5}, Ldc/a;->B(Lqa3/k0;Lsa3/f;Lsa3/h;ZZZ)Loa3/r;

    move-result-object p0

    return-object p0

    :cond_9
    :goto_0
    return-object v1
.end method


# virtual methods
.method public A(Lqa3/w0;Lsa3/f;)Ljava/util/ArrayList;
    .locals 3

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqa3/w0;->R:Ljava/util/List;

    const-string v0, "getAnnotationList(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/h;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lwe/o;

    invoke-virtual {v2, v1, p2}, Lwe/o;->m(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public C(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 8

    const v0, 0x7f0801d7

    if-ne p2, v0, :cond_0

    const p2, 0x7f060068

    invoke-static {p1, p2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_0
    const v0, 0x7f080205

    if-ne p2, v0, :cond_1

    const p2, 0x7f06006b

    invoke-static {p1, p2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_1
    const v0, 0x7f080204

    const/4 v1, 0x0

    if-ne p2, v0, :cond_3

    const/4 p2, 0x3

    new-array v0, p2, [[I

    new-array p2, p2, [I

    const v2, 0x7f040172

    invoke-static {p1, v2}, Ls/i2;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    const/4 v4, 0x2

    const v5, 0x7f04013e

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v7

    if-eqz v7, :cond_2

    sget-object v2, Ls/i2;->b:[I

    aput-object v2, v0, v1

    invoke-virtual {v3, v2, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    aput v2, p2, v1

    sget-object v1, Ls/i2;->e:[I

    aput-object v1, v0, v6

    invoke-static {p1, v5}, Ls/i2;->c(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v6

    sget-object p1, Ls/i2;->f:[I

    aput-object p1, v0, v4

    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    aput p1, p2, v4

    goto :goto_0

    :cond_2
    sget-object v3, Ls/i2;->b:[I

    aput-object v3, v0, v1

    invoke-static {p1, v2}, Ls/i2;->b(Landroid/content/Context;I)I

    move-result v3

    aput v3, p2, v1

    sget-object v1, Ls/i2;->e:[I

    aput-object v1, v0, v6

    invoke-static {p1, v5}, Ls/i2;->c(Landroid/content/Context;I)I

    move-result v1

    aput v1, p2, v6

    sget-object v1, Ls/i2;->f:[I

    aput-object v1, v0, v4

    invoke-static {p1, v2}, Ls/i2;->c(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v4

    :goto_0
    new-instance p1, Landroid/content/res/ColorStateList;

    invoke-direct {p1, v0, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object p1

    :cond_3
    const v0, 0x7f0801cb

    if-ne p2, v0, :cond_4

    const p2, 0x7f04013c

    invoke-static {p1, p2}, Ls/i2;->c(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/internal/k0;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_4
    const v0, 0x7f0801c5

    if-ne p2, v0, :cond_5

    invoke-static {p1, v1}, Lcom/google/crypto/tink/internal/k0;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_5
    const v0, 0x7f0801ca

    if-ne p2, v0, :cond_6

    const p2, 0x7f04013a

    invoke-static {p1, p2}, Ls/i2;->c(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p1, p2}, Lcom/google/crypto/tink/internal/k0;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_6
    const v0, 0x7f080200

    if-eq p2, v0, :cond_c

    const v0, 0x7f080201

    if-ne p2, v0, :cond_7

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast v0, [I

    invoke-static {v0, p2}, Lcom/google/crypto/tink/internal/k0;->b([II)Z

    move-result v0

    if-eqz v0, :cond_8

    const p2, 0x7f040140

    invoke-static {p1, p2}, Ls/i2;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_8
    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v0, [I

    invoke-static {v0, p2}, Lcom/google/crypto/tink/internal/k0;->b([II)Z

    move-result v0

    if-eqz v0, :cond_9

    const p2, 0x7f060067

    invoke-static {p1, p2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_9
    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v0, [I

    invoke-static {v0, p2}, Lcom/google/crypto/tink/internal/k0;->b([II)Z

    move-result v0

    if-eqz v0, :cond_a

    const p2, 0x7f060066

    invoke-static {p1, p2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_a
    const v0, 0x7f0801fd

    if-ne p2, v0, :cond_b

    const p2, 0x7f060069

    invoke-static {p1, p2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1

    :cond_c
    :goto_1
    const p2, 0x7f06006a

    invoke-static {p1, p2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public D(Lva3/c;)Z
    .locals 7

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lva3/c;->e()Lva3/c;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lva3/c;->f()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Container"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v2, Lsa3/e;

    invoke-static {v0, p1, v2}, Lds/p;->D(Laj/d;Lva3/c;Lsa3/e;)Lw93/b;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v0, Ln93/a;->a:Ljava/util/LinkedHashSet;

    iget-object p1, p1, Lw93/b;->a:Ljava/lang/Class;

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p1

    const-string v0, "getDeclaredAnnotations(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    move v2, v1

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v2, v0, :cond_2

    aget-object v5, p1, v2

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v5

    invoke-static {v5}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v5

    sget-object v6, Lfa3/w;->b:Lva3/c;

    invoke-virtual {v5, v6}, Lva3/c;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v3, v4

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    return v4

    :cond_3
    :goto_1
    return v1
.end method

.method public E()Lne3/y;
    .locals 2

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Lfe3/d;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lfe3/d;->a()Landroid/content/Context;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_4

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    if-nez v0, :cond_3

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    const-string v1, "open(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v0

    return-object v0
.end method

.method public F(Lva3/c;Lr93/s0;Ljava/util/List;)Lm63/d;
    .locals 8

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lu93/e0;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v1, Lzt/q;

    invoke-static {v0, p1, v1}, Lhg3/i;->O(Lr93/b0;Lva3/c;Lzt/q;)Lr93/e;

    move-result-object v4

    new-instance v2, Lm63/d;

    move-object v3, p0

    move-object v5, p1

    move-object v7, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lm63/d;-><init>(Lcom/google/crypto/tink/internal/k0;Lr93/e;Lva3/c;Ljava/util/List;Lr93/s0;)V

    return-object v2
.end method

.method public G(Lva3/c;Lw93/a;Ljava/util/List;)Lm63/d;
    .locals 1

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln93/a;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/internal/k0;->F(Lva3/c;Lr93/s0;Ljava/util/List;)Lm63/d;

    move-result-object p1

    return-object p1
.end method

.method public H(Lhb3/a0;Lqa3/k0;ILlb3/y;Lc93/m;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lsa3/d;->B:Lsa3/b;

    iget v1, p2, Lqa3/k0;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {p2}, Lua3/g;->d(Lqa3/k0;)Z

    move-result v6

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Laj/d;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lsa3/e;

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Le93/b;->J(Lhb3/a0;ZZLjava/lang/Boolean;ZLaj/d;Lsa3/e;)Lw93/b;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_2

    instance-of p1, v2, Lhb3/y;

    if-eqz p1, :cond_1

    move-object p1, v2

    check-cast p1, Lhb3/y;

    iget-object p1, p1, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast p1, Lr93/s0;

    instance-of v1, p1, Loa3/q;

    if-eqz v1, :cond_0

    check-cast p1, Loa3/q;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Loa3/q;->w:Lw93/b;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :cond_2
    :goto_1
    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object v1, p1, Lw93/b;->b:Lpa3/b;

    iget-object v1, v1, Lpa3/b;->e:Ljava/lang/Object;

    check-cast v1, Lsa3/e;

    sget-object v3, Loa3/f;->e:Lsa3/e;

    const-string v4, "version"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v4, v3, Lsa3/a;->b:I

    iget v5, v3, Lsa3/a;->c:I

    iget v3, v3, Lsa3/a;->d:I

    invoke-virtual {v1, v4, v5, v3}, Lsa3/a;->a(III)Z

    move-result v1

    iget-object v3, v2, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v3, Lsa3/f;

    iget-object v2, v2, Lhb3/a0;->y:Ljava/lang/Object;

    check-cast v2, Lsa3/h;

    invoke-static {p2, v3, v2, p3, v1}, Lcom/google/crypto/tink/internal/k0;->y(Lwa3/v;Lsa3/f;Lsa3/h;IZ)Loa3/r;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p3, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast p3, Lkb3/e;

    invoke-virtual {p3, p1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p5, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_5

    :goto_2
    return-object v0

    :cond_5
    invoke-static {p4}, Lo93/r;->c(Llb3/y;)Z

    move-result p2

    if-eqz p2, :cond_9

    check-cast p1, Lab3/g;

    instance-of p2, p1, Lab3/d;

    if-eqz p2, :cond_6

    new-instance p2, Lab3/z;

    check-cast p1, Lab3/d;

    invoke-virtual {p1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    invoke-direct {p2, p1}, Lab3/z;-><init>(B)V

    return-object p2

    :cond_6
    instance-of p2, p1, Lab3/w;

    if-eqz p2, :cond_7

    new-instance p2, Lab3/z;

    check-cast p1, Lab3/w;

    invoke-virtual {p1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    invoke-direct {p2, p1}, Lab3/z;-><init>(S)V

    return-object p2

    :cond_7
    instance-of p2, p1, Lab3/k;

    if-eqz p2, :cond_8

    new-instance p2, Lab3/z;

    check-cast p1, Lab3/k;

    invoke-virtual {p1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p2, p1}, Lab3/z;-><init>(I)V

    return-object p2

    :cond_8
    instance-of p2, p1, Lab3/u;

    if-eqz p2, :cond_9

    new-instance p2, Lab3/z;

    check-cast p1, Lab3/u;

    invoke-virtual {p1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p3

    invoke-direct {p2, p3, p4}, Lab3/z;-><init>(J)V

    return-object p2

    :cond_9
    return-object p1
.end method

.method public I(Lhb3/a0;Lwa3/v;II)Ljava/util/List;
    .locals 6

    iget-object v0, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v0, Lsa3/f;

    iget-object v1, p1, Lhb3/a0;->y:Ljava/lang/Object;

    check-cast v1, Lsa3/h;

    const/4 v2, 0x0

    invoke-static {p2, v0, v1, p3, v2}, Lcom/google/crypto/tink/internal/k0;->y(Lwa3/v;Lsa3/f;Lsa3/h;IZ)Loa3/r;

    move-result-object p2

    if-nez p2, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    invoke-static {p2, p4}, Lds/q;->w(Loa3/r;I)Loa3/r;

    move-result-object v2

    const/4 v4, 0x0

    const/16 v5, 0x3c

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/google/crypto/tink/internal/k0;->u(Lcom/google/crypto/tink/internal/k0;Lhb3/a0;Loa3/r;Ljava/lang/Boolean;ZI)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public J(Lhb3/a0;Lqa3/k0;Loa3/c;)Ljava/util/List;
    .locals 11

    iget-object v0, p1, Lhb3/a0;->y:Ljava/lang/Object;

    check-cast v0, Lsa3/h;

    iget-object v1, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v1, Lsa3/f;

    sget-object v2, Lsa3/d;->B:Lsa3/b;

    iget v3, p2, Lqa3/k0;->z:I

    invoke-virtual {v2, v3}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {p2}, Lua3/g;->d(Lqa3/k0;)Z

    move-result v8

    sget-object v2, Loa3/c;->w:Loa3/c;

    if-ne p3, v2, :cond_1

    const/16 p3, 0x28

    invoke-static {p2, v1, v0, p3}, Ldc/a;->C(Lqa3/k0;Lsa3/f;Lsa3/h;I)Loa3/r;

    move-result-object v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    const/16 v9, 0x8

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lcom/google/crypto/tink/internal/k0;->u(Lcom/google/crypto/tink/internal/k0;Lhb3/a0;Loa3/r;Ljava/lang/Boolean;ZI)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v5, p1

    const/16 p1, 0x30

    invoke-static {p2, v1, v0, p1}, Ldc/a;->C(Lqa3/k0;Lsa3/f;Lsa3/h;I)Loa3/r;

    move-result-object v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, Loa3/r;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "$delegate"

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    sget-object p2, Loa3/c;->y:Loa3/c;

    if-ne p3, p2, :cond_3

    const/4 v0, 0x1

    :cond_3
    if-eq p1, v0, :cond_4

    :goto_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_4
    move-object v9, v7

    const/4 v7, 0x1

    move v10, v8

    const/4 v8, 0x1

    move-object v4, p0

    invoke-virtual/range {v4 .. v10}, Lcom/google/crypto/tink/internal/k0;->p(Lhb3/a0;Loa3/r;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public K(Z)V
    .locals 5

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x1388

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v1, Lio/sentry/h5;

    new-instance v2, Landroidx/databinding/s;

    const/4 v3, 0x5

    invoke-direct {v2, p0, v3}, Landroidx/databinding/s;-><init>(Ljava/lang/Object;I)V

    int-to-long v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lio/sentry/h5;->c(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Metrics batch processor flush task rejected"

    invoke-interface {v1, v2, v3, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_2
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public L()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/k0;->E()Lne3/y;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v0}, Lne3/j0;->readInt()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lne3/j0;->m0(J)Lne3/l;

    move-result-object v1

    invoke-virtual {v0}, Lne3/j0;->readInt()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Lne3/j0;->m0(J)Lne3/l;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {v0}, Lne3/j0;->close()V

    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit p0

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_2
    move-exception v1

    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v2

    :try_start_7
    invoke-static {v0, v1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_0
    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method

.method public M(I)V
    .locals 2

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x18

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    return-void
.end method

.method public N(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    const-string v0, "scope"

    invoke-virtual {p3, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "sender"

    invoke-virtual {p3, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "subtype"

    invoke-virtual {p3, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "gmp_app_id"

    iget-object p2, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast p2, Ldt/g;

    invoke-virtual {p2}, Ldt/g;->a()V

    iget-object p2, p2, Ldt/g;->c:Ldt/i;

    iget-object p2, p2, Ldt/i;->b:Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "gmsv"

    iget-object p2, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast p2, Lio/sentry/android/core/j1;

    monitor-enter p2

    :try_start_0
    iget v0, p2, Lio/sentry/android/core/j1;->a:I

    if-nez v0, :cond_0

    const-string v0, "com.google.android.gms"

    invoke-virtual {p2, v0}, Lio/sentry/android/core/j1;->d(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v0, p2, Lio/sentry/android/core/j1;->a:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_0
    :goto_0
    iget v0, p2, Lio/sentry/android/core/j1;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "osv"

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "app_ver"

    iget-object p2, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast p2, Lio/sentry/android/core/j1;

    invoke-virtual {p2}, Lio/sentry/android/core/j1;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "app_ver_name"

    iget-object p2, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lio/sentry/android/core/j1;

    monitor-enter v0

    :try_start_1
    iget-object p2, v0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_1

    invoke-virtual {v0}, Lio/sentry/android/core/j1;->f()V

    goto :goto_1

    :catchall_1
    move-exception p1

    goto/16 :goto_7

    :cond_1
    :goto_1
    iget-object p2, v0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "firebase-app-name-hash"

    iget-object p2, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast p2, Ldt/g;

    invoke-virtual {p2}, Ldt/g;->a()V

    iget-object p2, p2, Ldt/g;->b:Ljava/lang/String;

    const-string v0, "SHA-1"

    :try_start_2
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p2

    const/16 v0, 0xb

    invoke-static {p2, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    const-string p2, "[HASH-ERROR]"

    :goto_2
    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_3
    iget-object p1, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ltt/d;

    check-cast p1, Ltt/c;

    invoke-virtual {p1}, Ltt/c;->d()Lcq/u;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltt/a;

    iget-object p1, p1, Ltt/a;->a:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    const-string p2, "Goog-Firebase-Installations-Auth"

    invoke-virtual {p3, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_3

    :cond_2
    const-string p1, "FirebaseMessaging"

    const-string p2, "FIS auth token is empty"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_4

    :goto_3
    const-string p2, "FirebaseMessaging"

    const-string v0, "Failed to get FIS auth token"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_4
    const-string p1, "appid"

    iget-object p2, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p2, Ltt/d;

    check-cast p2, Ltt/c;

    invoke-virtual {p2}, Ltt/c;->c()Lcq/u;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "cliv"

    const-string p2, "fcm-24.0.0"

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast p1, Lst/a;

    invoke-interface {p1}, Lst/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqt/g;

    iget-object p2, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast p2, Lst/a;

    invoke-interface {p2}, Lst/a;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lbu/b;

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    check-cast p1, Lqt/d;

    monitor-enter p1

    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p1, Lqt/d;->a:Ldt/c;

    invoke-virtual {v2}, Ldt/c;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laj/c;

    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    invoke-virtual {v2, v0, v1}, Laj/c;->U(J)Z

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    monitor-exit v2

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    monitor-enter v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Laj/c;->I(J)Ljava/lang/String;

    move-result-object v0

    iget-object v3, v2, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "last-used-date"

    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v2, v0}, Laj/c;->S(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    monitor-exit p1

    const/4 p1, 0x3

    goto :goto_5

    :catchall_2
    move-exception p2

    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :cond_3
    monitor-exit p1

    move p1, v1

    :goto_5
    if-eq p1, v1, :cond_4

    const-string v0, "Firebase-Client-Log-Type"

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "Firebase-Client"

    invoke-virtual {p2}, Lbu/b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :catchall_3
    move-exception p2

    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    throw p2

    :catchall_4
    move-exception p2

    monitor-exit p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    throw p2

    :cond_4
    :goto_6
    return-void

    :goto_7
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    throw p1

    :goto_8
    :try_start_e
    monitor-exit p2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    throw p1
.end method

.method public O(Lfs/k;)V
    .locals 3

    sget-object v0, Lns/f;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid DEM parameters "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public P(I)V
    .locals 2

    const/16 v0, 0x10

    if-lt p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size in bytes %d; HMAC key must be at least 16 bytes"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public Q(I)V
    .locals 2

    const/16 v0, 0xc

    if-lt p1, v0, :cond_0

    const/16 v0, 0x10

    if-gt p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public S(I)V
    .locals 2

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid tag size in bytes %d; must be at least 10 bytes"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public T(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/internal/k0;->N(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast p1, Lso/b;

    sget-object p2, Lso/p;->w:Lso/p;

    iget-object v0, p1, Lso/b;->c:Lce3/a0;

    invoke-virtual {v0}, Lce3/a0;->b()I

    move-result v1

    const v2, 0xb71b00

    if-ge v1, v2, :cond_1

    invoke-virtual {v0}, Lce3/a0;->d()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p3}, Lso/b;->a(Landroid/os/Bundle;)Lcq/u;

    move-result-object v0

    new-instance v1, Lso/q;

    invoke-direct {v1, p1, p3}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2, v1}, Lcq/u;->continueWithTask(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "MISSING_INSTANCEID_SERVICE"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->c(Ljava/lang/Exception;)Lcq/u;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p1, Lso/b;->b:Landroid/content/Context;

    invoke-static {p1}, Lso/o;->b(Landroid/content/Context;)Lso/o;

    move-result-object p1

    new-instance v0, Lso/n;

    monitor-enter p1

    :try_start_1
    iget v1, p1, Lso/o;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p1, Lso/o;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, p3, v2}, Lso/n;-><init>(IILandroid/os/Bundle;I)V

    invoke-virtual {p1, v0}, Lso/o;->c(Lso/n;)Lcq/u;

    move-result-object p1

    sget-object p3, Lso/d;->w:Lso/d;

    invoke-virtual {p1, p2, p3}, Lcq/u;->continueWith(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p2

    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->c(Ljava/lang/Exception;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public a(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v0, Lio/sentry/h5;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/k0;->K(Z)V

    new-instance p1, Lio/sentry/c7;

    const/16 v1, 0xe

    invoke-direct {p1, p0, v1}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lio/sentry/h5;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getShutdownTimeoutMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/sentry/h5;->a(J)V

    :goto_0
    iget-object p1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/k0;->x()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Lhb3/a0;Lqa3/k0;)Ljava/util/List;
    .locals 1

    sget-object v0, Loa3/c;->y:Loa3/c;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/crypto/tink/internal/k0;->J(Lhb3/a0;Lqa3/k0;Loa3/c;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d(J)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/k0;->K(Z)V

    :try_start_0
    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v1, Laj/c;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/transport/r;

    invoke-virtual {v2, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-virtual {v1, v0, p1, p2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->tryAcquireSharedNanos(IJ)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast p2, Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed to flush metrics events"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public e(Lhb3/a0;Lqa3/k0;)Ljava/util/List;
    .locals 1

    sget-object v0, Loa3/c;->x:Loa3/c;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/crypto/tink/internal/k0;->J(Lhb3/a0;Lqa3/k0;Loa3/c;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public f()Lgs/k;
    .locals 10

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_c

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v1, Lgs/j;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v1, Lgs/j;

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v2, Lgs/j;

    sget-object v3, Lgs/j;->c:Lgs/j;

    if-ne v2, v3, :cond_1

    const/16 v2, 0x14

    if-gt v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    sget-object v3, Lgs/j;->d:Lgs/j;

    if-ne v2, v3, :cond_3

    const/16 v2, 0x1c

    if-gt v1, v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    sget-object v3, Lgs/j;->e:Lgs/j;

    if-ne v2, v3, :cond_5

    const/16 v2, 0x20

    if-gt v1, v2, :cond_4

    goto :goto_0

    :cond_4
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    sget-object v3, Lgs/j;->f:Lgs/j;

    if-ne v2, v3, :cond_7

    const/16 v2, 0x30

    if-gt v1, v2, :cond_6

    goto :goto_0

    :cond_6
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    sget-object v3, Lgs/j;->g:Lgs/j;

    if-ne v2, v3, :cond_9

    const/16 v2, 0x40

    if-gt v1, v2, :cond_8

    :goto_0
    new-instance v3, Lgs/k;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lgs/j;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lgs/j;

    invoke-direct/range {v3 .. v9}, Lgs/k;-><init>(IIIILgs/j;Lgs/j;)V

    return-object v3

    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "tag size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "iv size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HMAC key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "AES key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g(Lhb3/y;)Ljava/util/ArrayList;
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast v0, Lr93/s0;

    instance-of v1, v0, Loa3/q;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Loa3/q;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, v0, Loa3/q;->w:Lw93/b;

    :cond_1
    if-eqz v2, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, v2, Lw93/b;->a:Ljava/lang/Class;

    const-string v1, "klass"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    const-string v1, "getDeclaredAnnotations(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v4

    invoke-static {v4}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v5

    new-instance v6, Lw93/a;

    invoke-direct {v6, v3}, Lw93/a;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-virtual {p0, v5, v6, p1}, Lcom/google/crypto/tink/internal/k0;->G(Lva3/c;Lw93/a;Ljava/util/List;)Lm63/d;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-static {v5, v3, v4}, Lva3/b;->i(Loa3/n;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-object p1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class for loading annotations is not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lhb3/y;->G:Lva3/c;

    invoke-virtual {p1}, Lva3/c;->a()Lva3/e;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h(Lhb3/a0;Lwa3/v;I)Ljava/util/List;
    .locals 1

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    instance-of v0, p2, Lqa3/c0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqa3/c0;

    iget-object v0, v0, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lqa3/k0;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lqa3/k0;

    iget-object v0, v0, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/crypto/tink/internal/k0;->I(Lhb3/a0;Lwa3/v;II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public j()Lns/f;
    .locals 9

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Lns/b;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lns/c;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v1, Lfs/k;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v1, Lns/e;

    if-eqz v1, :cond_4

    sget-object v1, Lns/b;->e:Lns/b;

    if-eq v0, v1, :cond_1

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v2, Lns/d;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Point format is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v0, Lns/d;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "For Curve25519 point format must not be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    new-instance v2, Lns/f;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lns/b;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lns/c;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lns/d;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lfs/k;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lns/e;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lct/a;

    invoke-direct/range {v2 .. v8}, Lns/f;-><init>(Lns/b;Lns/c;Lns/d;Lfs/k;Lns/e;Lct/a;)V

    return-object v2

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "DEM parameters are not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Elliptic curve type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()Lys/d;
    .locals 10

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_c

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast v1, Lys/c;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lys/c;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    const/16 v2, 0x20

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "derivedKeySizeBytes needs to be 16 or 32, not "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_7

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v3, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v1

    add-int/lit8 v3, v3, 0x8

    if-le v0, v3, :cond_6

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lys/c;

    sget-object v1, Lys/c;->c:Lys/c;

    if-ne v0, v1, :cond_2

    const/16 v1, 0x14

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    sget-object v3, Lys/c;->d:Lys/c;

    if-ne v0, v3, :cond_3

    goto :goto_2

    :cond_3
    move v2, v1

    :goto_2
    sget-object v1, Lys/c;->e:Lys/c;

    if-ne v0, v1, :cond_4

    const/16 v2, 0x40

    :cond_4
    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_5

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt v0, v2, :cond_5

    new-instance v3, Lys/d;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lys/c;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lys/c;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    invoke-direct/range {v3 .. v9}, Lys/d;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lys/c;Lys/c;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v3

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hmacTagSize must be in range [10, "

    const-string v3, "], but is "

    invoke-static {v2, v1, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, 0x9

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "keySizeBytes needs to be at least derivedKeySizeBytes, i.e., "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "ciphertextSegmentSizeBytes needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hmacTagSizeBytes needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hmacHashType needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hkdfHashType needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "derivedKeySizeBytes needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "keySizeBytes needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    new-instance v0, Landroidx/profileinstaller/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/profileinstaller/b;-><init>(I)V

    new-instance v1, Lzs/a;

    invoke-direct {v1, p0}, Lzs/a;-><init>(Lcom/google/crypto/tink/internal/k0;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcq/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public p(Lhb3/a0;Loa3/r;ZZLjava/lang/Boolean;Z)Ljava/util/List;
    .locals 8

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Laj/d;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lsa3/e;

    move-object v1, p1

    move v2, p3

    move v3, p4

    move-object v4, p5

    move v5, p6

    invoke-static/range {v1 .. v7}, Le93/b;->J(Lhb3/a0;ZZLjava/lang/Boolean;ZLaj/d;Lsa3/e;)Lw93/b;

    move-result-object p1

    if-nez p1, :cond_2

    instance-of p1, v1, Lhb3/y;

    const/4 p3, 0x0

    if-eqz p1, :cond_1

    move-object p1, v1

    check-cast p1, Lhb3/y;

    iget-object p1, p1, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast p1, Lr93/s0;

    instance-of p4, p1, Loa3/q;

    if-eqz p4, :cond_0

    check-cast p1, Loa3/q;

    goto :goto_0

    :cond_0
    move-object p1, p3

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Loa3/q;->w:Lw93/b;

    goto :goto_1

    :cond_1
    move-object p1, p3

    :cond_2
    :goto_1
    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p3, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast p3, Lkb3/e;

    invoke-virtual {p3, p1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Loa3/d;

    invoke-virtual {p1}, Loa3/d;->a()Ljava/util/Map;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_4

    :goto_2
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_4
    return-object p1
.end method

.method public q(Lhb3/a0;Lwa3/v;I)Ljava/util/List;
    .locals 9

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    check-cast p2, Lqa3/k0;

    sget-object p3, Loa3/c;->w:Loa3/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/internal/k0;->J(Lhb3/a0;Lqa3/k0;Loa3/c;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v0, Lsa3/f;

    iget-object v1, p1, Lhb3/a0;->y:Ljava/lang/Object;

    check-cast v1, Lsa3/h;

    const/4 v2, 0x0

    invoke-static {p2, v0, v1, p3, v2}, Lcom/google/crypto/tink/internal/k0;->y(Lwa3/v;Lsa3/f;Lsa3/h;IZ)Loa3/r;

    move-result-object v5

    if-nez v5, :cond_1

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_1
    const/4 v7, 0x0

    const/16 v8, 0x3c

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/internal/k0;->u(Lcom/google/crypto/tink/internal/k0;Lhb3/a0;Loa3/r;Ljava/lang/Boolean;ZI)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public r(Lqa3/b1;Lsa3/f;)Ljava/util/ArrayList;
    .locals 3

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqa3/b1;->K:Ljava/util/List;

    const-string v0, "getAnnotationList(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/h;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lwe/o;

    invoke-virtual {v2, v1, p2}, Lwe/o;->m(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public s(Lhb3/a0;Lqa3/x;)Ljava/util/List;
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v0, Lsa3/f;

    iget p2, p2, Lqa3/x;->z:I

    invoke-interface {v0, p2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p2

    move-object v0, p1

    check-cast v0, Lhb3/y;

    iget-object v0, v0, Lhb3/y;->G:Lva3/c;

    invoke-virtual {v0}, Lva3/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lua3/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lds/q;->t(Ljava/lang/String;Ljava/lang/String;)Loa3/r;

    move-result-object v3

    const/4 v5, 0x0

    const/16 v6, 0x3c

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/internal/k0;->u(Lcom/google/crypto/tink/internal/k0;Lhb3/a0;Loa3/r;Ljava/lang/Boolean;ZI)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public t(Lhb3/a0;Lqa3/k0;Llb3/y;)Ljava/lang/Object;
    .locals 6

    const/4 v3, 0x2

    sget-object v5, Loa3/a;->y:Loa3/a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/internal/k0;->H(Lhb3/a0;Lqa3/k0;ILlb3/y;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v(Lhb3/a0;Lwa3/v;IILqa3/e1;)Ljava/util/List;
    .locals 0

    const-string p5, "callableProto"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "kind"

    invoke-static {p3, p5}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/crypto/tink/internal/k0;->I(Lhb3/a0;Lwa3/v;II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public w(Lhb3/a0;Lwa3/v;IILqa3/e1;)Ljava/util/List;
    .locals 6

    const-string p5, "callableProto"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "kind"

    invoke-static {p3, p5}, Lih0/d0;->w(ILjava/lang/String;)V

    instance-of p5, p2, Lqa3/c0;

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object v1, p2

    check-cast v1, Lqa3/c0;

    iget-object v1, v1, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    :cond_0
    instance-of v1, p2, Lqa3/k0;

    if-eqz v1, :cond_1

    move-object v1, p2

    check-cast v1, Lqa3/k0;

    iget-object v1, v1, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    const/16 v2, 0x40

    const/16 v3, 0x20

    const/4 v4, 0x1

    if-eqz p5, :cond_3

    move-object p5, p2

    check-cast p5, Lqa3/c0;

    iget p5, p5, Lqa3/c0;->y:I

    and-int/lit8 v5, p5, 0x20

    if-ne v5, v3, :cond_2

    goto :goto_1

    :cond_2
    and-int/2addr p5, v2

    if-ne p5, v2, :cond_7

    :goto_1
    move v0, v4

    goto :goto_3

    :cond_3
    instance-of p5, p2, Lqa3/k0;

    if-eqz p5, :cond_5

    move-object p5, p2

    check-cast p5, Lqa3/k0;

    iget p5, p5, Lqa3/k0;->y:I

    and-int/lit8 v5, p5, 0x20

    if-ne v5, v3, :cond_4

    goto :goto_2

    :cond_4
    and-int/2addr p5, v2

    if-ne p5, v2, :cond_7

    :goto_2
    goto :goto_1

    :cond_5
    instance-of p5, p2, Lqa3/o;

    if-eqz p5, :cond_8

    move-object p5, p1

    check-cast p5, Lhb3/y;

    iget-object v2, p5, Lhb3/y;->H:Lqa3/j;

    sget-object v3, Lqa3/j;->z:Lqa3/j;

    if-ne v2, v3, :cond_6

    const/4 v0, 0x2

    goto :goto_3

    :cond_6
    iget-boolean p5, p5, Lhb3/y;->I:Z

    if-eqz p5, :cond_7

    goto :goto_1

    :cond_7
    :goto_3
    add-int/2addr v1, v0

    add-int/2addr v1, p4

    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/google/crypto/tink/internal/k0;->I(Lhb3/a0;Lwa3/v;II)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Unsupported message: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x()V
    .locals 7

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x3e8

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/v5;

    if-eqz v3, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v3, v2, :cond_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast v0, Lcd3/g;

    new-instance v2, Lio/sentry/w5;

    invoke-direct {v2, v1}, Lio/sentry/w5;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v0, v2}, Lcd3/g;->v(Lio/sentry/w5;)Lcom/google/crypto/tink/internal/l0;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4}, Lcd3/g;->H(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    iget-object v0, v0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v5, "Capturing metrics failed."

    new-array v6, v3, [Ljava/lang/Object;

    invoke-interface {v0, v4, v2, v5, v6}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/r;

    sget v2, Lio/sentry/transport/r;->w:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public z(Lhb3/a0;Lqa3/k0;Llb3/y;)Ljava/lang/Object;
    .locals 6

    const/4 v3, 0x3

    sget-object v5, Loa3/a;->x:Loa3/a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/crypto/tink/internal/k0;->H(Lhb3/a0;Lqa3/k0;ILlb3/y;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
