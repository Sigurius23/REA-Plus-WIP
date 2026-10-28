.class public Lkr/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/g;
.implements Lat/v;
.implements Lwy/b;
.implements Lcq/h;
.implements Ldg3/b;
.implements Len/f;
.implements Lvg/g;


# static fields
.field public static final synthetic x:Lkr/e;


# instance fields
.field public final synthetic w:I


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lkr/e;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    sput-object v0, Lkr/e;->x:Lkr/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xe

    iput v0, p0, Lkr/e;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Lx8/t;->a:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    .line 4
    new-instance v0, Lb9/m;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lkr/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    const/16 p1, 0xf

    iput p1, p0, Lkr/e;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([ILandroid/animation/ValueAnimator;)V
    .locals 0

    const/16 p1, 0x14

    iput p1, p0, Lkr/e;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Ljava/util/List;)Ljava/util/Map;
    .locals 2

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    new-instance v0, Ll83/k;

    const-string v1, "expand"

    invoke-direct {v0, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    sget-object p0, Lm83/z;->w:Lm83/z;

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static c(Landroid/content/Context;I)Lkr/e;
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Cannot create a CalendarItemStyle with a styleResId of 0"

    invoke-static {v2, v3}, Lwb3/f;->m(ZLjava/lang/String;)V

    sget-object v2, Ljq/a;->w:[I

    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    const/4 v3, 0x2

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    const/4 v4, 0x3

    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, v2, v3, v0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v0, 0x4

    invoke-static {p1, p0, v0}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    const/16 v0, 0x9

    invoke-static {p1, p0, v0}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    const/4 v0, 0x7

    invoke-static {p1, p0, v0}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    const/16 v0, 0x8

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    const/4 v0, 0x5

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    new-instance v3, Lkr/a;

    int-to-float v1, v1

    invoke-direct {v3, v1}, Lkr/a;-><init>(F)V

    invoke-static {p0, v0, v2, v3}, Lkr/k;->a(Landroid/content/Context;IILkr/c;)Lkr/j;

    move-result-object p0

    invoke-virtual {p0}, Lkr/j;->a()Lkr/k;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p0, Lkr/e;

    const/16 p1, 0x13

    invoke-direct {p0, p1}, Lkr/e;-><init>(I)V

    iget p1, v5, Landroid/graphics/Rect;->left:I

    invoke-static {p1}, Lwb3/f;->n(I)V

    iget p1, v5, Landroid/graphics/Rect;->top:I

    invoke-static {p1}, Lwb3/f;->n(I)V

    iget p1, v5, Landroid/graphics/Rect;->right:I

    invoke-static {p1}, Lwb3/f;->n(I)V

    iget p1, v5, Landroid/graphics/Rect;->bottom:I

    invoke-static {p1}, Lwb3/f;->n(I)V

    return-object p0
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "https://api.stripe.com/v1/"

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs n(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkr/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a([BII)[B
    .locals 0

    add-int/2addr p3, p2

    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    return-object p1
.end method

.method public d()Lwm/p;
    .locals 3

    new-instance v0, Lwm/l;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lwm/l;-><init>(J)V

    return-object v0
.end method

.method public e(J)V
    .locals 0

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkr/e;->w:I

    packed-switch v0, :pswitch_data_0

    if-nez p2, :cond_0

    invoke-static {p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    if-nez p2, :cond_1

    invoke-static {p1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_1
    if-nez p2, :cond_2

    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    goto :goto_2

    :cond_2
    invoke-static {p1, p2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_2
    if-nez p2, :cond_3

    invoke-static {p1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p1

    goto :goto_3

    :cond_3
    invoke-static {p1, p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object p1

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lfg/e;

    new-instance v1, Lfg/b;

    new-instance v2, Lfg/a;

    invoke-direct {v2}, Lfg/a;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, v2}, Lfg/b;-><init>(Lfg/a;)V

    invoke-direct {v0, v1}, Lfg/e;-><init>(Lfg/b;)V

    return-object v0
.end method

.method public h(Ljava/util/List;La30/w0;Ls83/c;)Ljava/io/Serializable;
    .locals 7

    instance-of v0, p3, La30/c0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, La30/c0;

    iget v1, v0, La30/c0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La30/c0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, La30/c0;

    invoke-direct {v0, p0, p3}, La30/c0;-><init>(Lkr/e;Ls83/c;)V

    :goto_0
    iget-object p3, v0, La30/c0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La30/c0;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p2, v0, La30/c0;->w:La30/w0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p2, La30/w0;->G:Ljava/lang/Object;

    check-cast p3, Lbc3/i0;

    iget-object v2, p2, La30/w0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v5, p2, La30/w0;->y:Ljava/lang/Object;

    check-cast v5, Lv00/p;

    if-eqz v5, :cond_3

    iget-boolean v5, v5, Lv00/p;->z:Z

    goto :goto_1

    :cond_3
    move v5, v3

    :goto_1
    iput-object p2, v0, La30/c0;->w:La30/w0;

    iput v4, v0, La30/c0;->z:I

    invoke-static {p1, p3, v5, v2, v0}, Lse/a;->s(Ljava/util/List;Lbc3/i0;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p3, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_5
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ly00/o4;

    iget-object v2, v1, Ly00/o4;->H:Ly00/z3;

    if-eqz v2, :cond_6

    iget-object v5, p2, La30/w0;->F:Ljava/lang/Object;

    check-cast v5, Lux/b;

    sget-object v6, Ly00/j;->x:Lt9/p;

    iget-object v2, v2, Ly00/z3;->G:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lt9/p;->k(Ljava/lang/String;)Ly00/j;

    move-result-object v2

    invoke-interface {v5, v2}, Lux/b;->F(Ly00/j;)Z

    move-result v2

    goto :goto_4

    :cond_6
    move v2, v4

    :goto_4
    iget-object v5, p2, La30/w0;->E:Ljava/lang/Object;

    check-cast v5, Lux/a;

    invoke-interface {v5, v1}, Lux/a;->l0(Ly00/o4;)Z

    move-result v5

    if-eqz v5, :cond_5

    if-eqz v2, :cond_5

    iget-object v2, p2, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lh20/l1;

    const-string v5, "billingDetailsCollectionConfiguration"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    move v1, v4

    goto :goto_6

    :cond_7
    iget-object v1, v1, Ly00/o4;->F:Ly00/v3;

    if-eqz v1, :cond_8

    iget-object v1, v1, Ly00/v3;->w:Ly00/c;

    if-eqz v1, :cond_8

    iget-object v1, v1, Ly00/c;->x:Ljava/lang/String;

    if-eqz v1, :cond_8

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "toUpperCase(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    const/4 v1, 0x0

    :goto_5
    if-eqz v1, :cond_9

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_6

    :cond_9
    move v1, v3

    :goto_6
    if-eqz v1, :cond_5

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    return-object p1
.end method

.method public synthetic i(Ljava/lang/Object;)Lcq/u;
    .locals 0

    check-cast p1, Ljava/util/Map;

    sget p1, Lcom/google/android/gms/common/GoogleApiAvailability;->GOOGLE_PLAY_SERVICES_VERSION_CODE:I

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public k(Lwm/j;)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public l(Ljava/lang/CharSequence;II)Ldg3/a;
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p0

    move/from16 v3, p3

    iget v4, v2, Lkr/e;->w:I

    packed-switch v4, :pswitch_data_0

    add-int/lit8 v4, v1, 0x4

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v4, v5, :cond_a

    add-int/lit8 v5, v1, 0x1

    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x77

    if-ne v5, v6, :cond_a

    add-int/lit8 v5, v1, 0x2

    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ne v5, v6, :cond_a

    add-int/lit8 v5, v1, 0x3

    invoke-interface {v0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x2e

    if-ne v5, v6, :cond_a

    const/4 v5, -0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v1, -0x1

    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v3, v6, :cond_3

    const/16 v7, 0x41

    if-lt v3, v7, :cond_1

    const/16 v7, 0x5a

    if-le v3, v7, :cond_3

    :cond_1
    const/16 v7, 0x61

    if-lt v3, v7, :cond_2

    const/16 v7, 0x7a

    if-gt v3, v7, :cond_2

    goto :goto_0

    :cond_2
    const/16 v7, 0x30

    if-lt v3, v7, :cond_4

    const/16 v7, 0x39

    if-gt v3, v7, :cond_4

    :cond_3
    :goto_0
    move v1, v5

    :cond_4
    :goto_1
    if-ne v1, v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v4, v0}, Lx43/j;->x(ILjava/lang/CharSequence;)I

    move-result v3

    if-ne v3, v5, :cond_7

    :cond_6
    move v3, v5

    goto :goto_2

    :cond_7
    move v7, v3

    :cond_8
    add-int/2addr v7, v5

    if-le v7, v4, :cond_6

    invoke-interface {v0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-ne v8, v6, :cond_8

    if-le v7, v4, :cond_8

    :goto_2
    if-ne v3, v5, :cond_9

    goto :goto_3

    :cond_9
    new-instance v0, Ldg3/a;

    sget-object v4, Lcg3/c;->y:Lcg3/c;

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v0, v4, v1, v3}, Ldg3/a;-><init>(Lcg3/c;II)V

    goto :goto_4

    :cond_a
    :goto_3
    const/4 v0, 0x0

    :goto_4
    return-object v0

    :pswitch_0
    add-int/lit8 v4, v1, -0x1

    const/4 v7, 0x1

    const/4 v8, -0x1

    :goto_5
    const/16 v9, 0x80

    const/16 v10, 0x39

    const/16 v11, 0x30

    const/16 v12, 0x7a

    const/16 v13, 0x61

    const/16 v14, 0x5a

    const/16 v15, 0x41

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v6, 0x2d

    if-lt v4, v3, :cond_f

    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-lt v5, v15, :cond_b

    if-le v5, v14, :cond_11

    :cond_b
    if-lt v5, v13, :cond_c

    if-gt v5, v12, :cond_c

    goto :goto_6

    :cond_c
    if-lt v5, v11, :cond_d

    if-gt v5, v10, :cond_d

    goto :goto_6

    :cond_d
    if-lt v5, v9, :cond_e

    goto :goto_6

    :cond_e
    const/16 v9, 0x21

    if-eq v5, v9, :cond_11

    if-eq v5, v6, :cond_11

    const/16 v9, 0x2f

    if-eq v5, v9, :cond_11

    const/16 v9, 0x3d

    if-eq v5, v9, :cond_11

    const/16 v9, 0x3f

    if-eq v5, v9, :cond_11

    const/16 v9, 0x2a

    if-eq v5, v9, :cond_11

    const/16 v9, 0x2b

    if-eq v5, v9, :cond_11

    packed-switch v5, :pswitch_data_1

    packed-switch v5, :pswitch_data_2

    packed-switch v5, :pswitch_data_3

    const/16 v9, 0x2e

    if-ne v5, v9, :cond_f

    if-eqz v7, :cond_10

    :cond_f
    const/4 v3, -0x1

    goto :goto_8

    :cond_10
    move/from16 v7, v17

    goto :goto_7

    :cond_11
    :goto_6
    :pswitch_1
    move v8, v4

    move/from16 v7, v16

    :goto_7
    add-int/lit8 v4, v4, -0x1

    goto :goto_5

    :goto_8
    if-ne v8, v3, :cond_12

    goto/16 :goto_13

    :cond_12
    add-int/lit8 v1, v1, 0x1

    move/from16 v7, v16

    move/from16 v5, v17

    const/4 v3, -0x1

    const/4 v4, -0x1

    :goto_9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-ge v1, v9, :cond_17

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-eqz v5, :cond_18

    if-lt v9, v15, :cond_13

    if-le v9, v14, :cond_16

    :cond_13
    if-lt v9, v13, :cond_14

    if-gt v9, v12, :cond_14

    goto :goto_a

    :cond_14
    if-lt v9, v11, :cond_15

    if-gt v9, v10, :cond_15

    goto :goto_a

    :cond_15
    const/16 v5, 0x80

    if-lt v9, v5, :cond_17

    :cond_16
    :goto_a
    move v4, v1

    move v7, v10

    move/from16 v5, v16

    move/from16 v9, v17

    const/16 v6, 0x80

    const/16 v10, 0x2e

    goto :goto_f

    :cond_17
    :goto_b
    const/4 v5, -0x1

    goto :goto_10

    :cond_18
    const/16 v10, 0x2e

    if-ne v9, v10, :cond_1b

    if-nez v7, :cond_19

    goto :goto_b

    :cond_19
    const/4 v5, -0x1

    if-ne v3, v5, :cond_1a

    move v3, v1

    :cond_1a
    move v9, v7

    move/from16 v5, v17

    :goto_c
    const/16 v6, 0x80

    const/16 v7, 0x39

    goto :goto_f

    :cond_1b
    if-ne v9, v6, :cond_1c

    move/from16 v9, v16

    goto :goto_c

    :cond_1c
    if-lt v9, v15, :cond_1d

    if-le v9, v14, :cond_1e

    :cond_1d
    if-lt v9, v13, :cond_1f

    if-gt v9, v12, :cond_1f

    :cond_1e
    const/16 v7, 0x39

    goto :goto_d

    :cond_1f
    const/16 v7, 0x39

    if-lt v9, v11, :cond_20

    if-gt v9, v7, :cond_20

    :goto_d
    const/16 v6, 0x80

    goto :goto_e

    :cond_20
    const/16 v6, 0x80

    if-lt v9, v6, :cond_17

    :goto_e
    move v4, v1

    move/from16 v9, v17

    :goto_f
    add-int/lit8 v1, v1, 0x1

    move v10, v7

    move v7, v9

    const/16 v6, 0x2d

    goto :goto_9

    :goto_10
    if-eq v3, v5, :cond_22

    if-le v3, v4, :cond_21

    goto :goto_11

    :cond_21
    move v3, v4

    goto :goto_12

    :cond_22
    :goto_11
    move v3, v5

    :goto_12
    if-ne v3, v5, :cond_23

    :goto_13
    const/4 v0, 0x0

    goto :goto_14

    :cond_23
    new-instance v0, Ldg3/a;

    sget-object v1, Lcg3/c;->x:Lcg3/c;

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v0, v1, v8, v3}, Ldg3/a;-><init>(Lcg3/c;II)V

    :goto_14
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x23
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x5e
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7b
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public m(Lorg/json/JSONObject;)Lvy/b;
    .locals 2

    const-string v0, "client_secret"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    new-instance v0, Lay/d;

    invoke-direct {v0, p1}, Lay/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public o(Landroid/content/Context;Ljava/lang/String;Ldp/a;)Lcr/p;
    .locals 3

    new-instance v0, Lcr/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lcr/p;->a:I

    iput v1, v0, Lcr/p;->b:I

    iput v1, v0, Lcr/p;->c:I

    const/4 v1, 0x1

    invoke-interface {p3, p1, p2, v1}, Ldp/a;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result v2

    iput v2, v0, Lcr/p;->b:I

    if-eqz v2, :cond_0

    iput v1, v0, Lcr/p;->c:I

    return-object v0

    :cond_0
    invoke-interface {p3, p1, p2}, Ldp/a;->k(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lcr/p;->a:I

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    iput p1, v0, Lcr/p;->c:I

    :cond_1
    return-object v0
.end method
