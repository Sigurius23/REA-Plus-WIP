.class public Lae3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lae3/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lae3/k;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lae3/k;->c:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, Lae3/k;->d:Ljava/lang/Object;

    .line 9
    iput p3, p0, Lae3/k;->b:I

    return-void
.end method

.method public constructor <init>(Leg/k;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lae3/k;->a:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iget-object v0, p1, Leg/k;->a:Ljc/b0;

    .line 12
    iget-object v0, v0, Ljc/b0;->g:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    .line 13
    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfg/k;

    iput-object v0, p0, Lae3/k;->c:Ljava/lang/Object;

    .line 14
    iget v0, p1, Leg/k;->b:I

    .line 15
    iput v0, p0, Lae3/k;->b:I

    .line 16
    iget-object p1, p1, Leg/k;->c:Ljc/b0;

    .line 17
    iget-object p1, p1, Ljc/b0;->g:Ljava/lang/Object;

    check-cast p1, Lc93/a;

    .line 18
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfg/n;

    iput-object p1, p0, Lae3/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/util/a;)V
    .locals 2

    const/4 v0, 0x7

    iput v0, p0, Lae3/k;->a:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lu93/d0;

    invoke-direct {v0, p0}, Lu93/d0;-><init>(Ljava/lang/Object;)V

    const/16 v1, 0x96

    .line 21
    invoke-static {v1, v0}, Lul/c;->a(ILul/a;)Ls/m2;

    move-result-object v0

    iput-object v0, p0, Lae3/k;->d:Ljava/lang/Object;

    .line 22
    iput-object p1, p0, Lae3/k;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lud3/m0;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lae3/k;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lae3/k;->c:Ljava/lang/Object;

    .line 4
    iput p2, p0, Lae3/k;->b:I

    .line 5
    iput-object p3, p0, Lae3/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lae3/k;
    .locals 4

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_3

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "gradient"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    const-string v2, "selector"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p0, p1, v0, p2}, Lu4/c;->b(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    new-instance p1, Lae3/k;

    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p2

    invoke-direct {p1, v3, p0, p2}, Lae3/k;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p1

    :cond_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": unsupported complex color tag "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p0, p1, v0, p2}, Lu4/b;->c(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/Shader;

    move-result-object p0

    new-instance p1, Lae3/k;

    const/4 p2, 0x0

    invoke-direct {p1, p0, v3, p2}, Lae3/k;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p1

    :cond_3
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lvt/b;
    .locals 5

    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lvt/b;

    iget-object v1, p0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget v4, p0, Lae3/k;->b:I

    invoke-direct {v0, v4, v1, v2, v3}, Lvt/b;-><init>(ILjava/lang/String;J)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public c()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lae3/k;->b:I

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    iget-object v3, p0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v3, [Ljava/lang/Object;

    aget-object v3, v3, v2

    instance-of v4, v3, Lyc3/g;

    if-eqz v4, :cond_1

    check-cast v3, Lyc3/g;

    invoke-interface {v3}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v4

    sget-object v5, Lyc3/l;->b:Lyc3/l;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v3, p0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v3, [I

    aget v3, v3, v2

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2

    const-string v3, "["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v3, [I

    aget v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v2

    if-ltz v4, :cond_2

    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3, v4}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    sget-object v4, Lbd3/r;->a:Lbd3/r;

    if-eq v3, v4, :cond_2

    const-string v4, "[\'"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\']"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(IIIIIIZZ)V
    .locals 8

    iget-object v0, p0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v0, [J

    iget v1, p0, Lae3/k;->b:I

    add-int/lit8 v2, v1, 0x3

    iput v2, p0, Lae3/k;->b:I

    array-length v3, v0

    if-gt v3, v2, :cond_0

    mul-int/lit8 v3, v3, 0x2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    const-string v3, "copyOf(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lae3/k;->c:Ljava/lang/Object;

    iget-object v0, p0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v0, [J

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lae3/k;->d:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v0, [J

    int-to-long v2, p2

    const/16 p2, 0x20

    shl-long/2addr v2, p2

    int-to-long v4, p3

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long/2addr v2, v4

    aput-wide v2, v0, v1

    add-int/lit8 p3, v1, 0x1

    int-to-long v2, p4

    shl-long/2addr v2, p2

    int-to-long v4, p5

    and-long/2addr v4, v6

    or-long/2addr v2, v4

    aput-wide v2, v0, p3

    add-int/lit8 p2, v1, 0x2

    move/from16 p3, p8

    int-to-long p3, p3

    const/16 v2, 0x3f

    shl-long/2addr p3, v2

    int-to-long v2, p7

    const/16 v4, 0x3e

    shl-long/2addr v2, v4

    or-long/2addr p3, v2

    const/4 v2, 0x1

    int-to-long v2, v2

    const/16 v4, 0x3d

    shl-long/2addr v2, v4

    or-long/2addr p3, v2

    const/4 v2, 0x0

    int-to-long v2, v2

    const/16 v4, 0x34

    shl-long/2addr v2, v4

    or-long/2addr p3, v2

    const v2, 0x3ffffff

    and-int v3, p6, v2

    int-to-long v5, v3

    const/16 v7, 0x1a

    shl-long/2addr v5, v7

    or-long/2addr p3, v5

    and-int/2addr p1, v2

    int-to-long v5, p1

    or-long/2addr p3, v5

    aput-wide p3, v0, p2

    if-gez p6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p1, v1, -0x3

    :goto_0
    if-ltz p1, :cond_3

    add-int/lit8 p2, p1, 0x2

    aget-wide p3, v0, p2

    long-to-int v5, p3

    and-int/2addr v5, v2

    if-ne v5, v3, :cond_2

    sub-int/2addr v1, p1

    const-wide v2, -0x1ff0000000000001L    # -5.363123171977038E154

    and-long/2addr p3, v2

    and-int/lit16 p1, v1, 0x1ff

    int-to-long v1, p1

    shl-long/2addr v1, v4

    or-long/2addr p3, v1

    aput-wide p3, v0, p2

    return-void

    :cond_2
    add-int/lit8 p1, p1, -0x3

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Shader;

    if-nez v0, :cond_0

    iget-object v0, p0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()V
    .locals 5

    iget v0, p0, Lae3/k;->b:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lae3/k;->c:Ljava/lang/Object;

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    const/4 v4, -0x1

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v0, [I

    const/16 v3, 0xe

    invoke-static {v2, v2, v0, v1, v3}, Lm83/n;->j0(II[I[II)V

    iput-object v1, p0, Lae3/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public g(ILc93/n;)V
    .locals 6

    const v0, 0x3ffffff

    and-int/2addr p1, v0

    iget-object v1, p0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v1, [J

    iget v2, p0, Lae3/k;->b:I

    const/4 v3, 0x0

    :goto_0
    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    if-ge v3, v4, :cond_1

    if-ge v3, v2, :cond_1

    add-int/lit8 v4, v3, 0x2

    aget-wide v4, v1, v4

    long-to-int v4, v4

    and-int/2addr v4, v0

    if-ne v4, p1, :cond_0

    aget-wide v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    aget-wide v0, v1, v3

    const/16 p1, 0x20

    shr-long v2, v4, p1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    long-to-int v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    shr-long v4, v0, p1

    long-to-int p1, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v2, v3, p1, v0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lae3/k;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lae3/k;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v1, Lud3/m0;

    sget-object v2, Lud3/m0;->y:Lud3/m0;

    if-ne v1, v2, :cond_0

    const-string v1, "HTTP/1.0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "HTTP/1.1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lae3/k;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
