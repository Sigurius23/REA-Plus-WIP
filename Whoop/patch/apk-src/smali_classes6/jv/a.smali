.class public final Ljv/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/res/TypedArray;

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/TypedArray;FI)V
    .locals 0

    iput p3, p0, Ljv/a;->w:I

    iput-object p1, p0, Ljv/a;->x:Landroid/content/res/TypedArray;

    iput p2, p0, Ljv/a;->y:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ljv/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lyv/a;

    const-string v0, "$this$ScaleBarSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljv/a;->x:Landroid/content/res/TypedArray;

    const/16 v1, 0x73

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Lyv/a;->a:Z

    const/16 v1, 0x74

    const v3, 0x800033

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p1, Lyv/a;->b:I

    iget v1, p0, Ljv/a;->y:F

    const/high16 v3, 0x40800000    # 4.0f

    mul-float/2addr v3, v1

    const/16 v4, 0x78

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p1, Lyv/a;->c:F

    const/16 v4, 0x7a

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p1, Lyv/a;->d:F

    const/16 v4, 0x79

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p1, Lyv/a;->e:F

    const/16 v4, 0x77

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p1, Lyv/a;->f:F

    const/16 v3, 0x82

    const/high16 v4, -0x1000000

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p1, Lyv/a;->g:I

    const/16 v3, 0x7b

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p1, Lyv/a;->h:I

    const/16 v3, 0x7e

    const/4 v4, -0x1

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p1, Lyv/a;->i:I

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v3, v1

    const/16 v4, 0x72

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p1, Lyv/a;->j:F

    const/16 v4, 0x75

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p1, Lyv/a;->k:F

    const/high16 v4, 0x41000000    # 8.0f

    mul-float/2addr v1, v4

    const/16 v4, 0x80

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p1, Lyv/a;->l:F

    const/16 v4, 0x81

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p1, Lyv/a;->m:F

    const/16 v3, 0x83

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p1, Lyv/a;->n:F

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getDefault().country"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "getDefault()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0x986

    const/4 v5, 0x0

    if-eq v3, v4, :cond_2

    const/16 v4, 0x9a0

    if-eq v3, v4, :cond_1

    const/16 v4, 0xa9e

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "US"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_1
    const-string v3, "MM"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_2
    const-string v3, "LR"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    :goto_0
    move v1, v2

    goto :goto_2

    :cond_4
    :goto_1
    move v1, v5

    :goto_2
    const/16 v3, 0x76

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Lyv/a;->o:Z

    const/16 v1, 0x7d

    const/16 v3, 0xf

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    int-to-long v3, v1

    iput-wide v3, p1, Lyv/a;->p:J

    const/16 v1, 0x7f

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Lyv/a;->q:Z

    const/16 v1, 0x7c

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p1, Lyv/a;->r:F

    const/16 v1, 0x84

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lyv/a;->s:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lvv/a;

    const-string v0, "$this$LogoSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x61

    const/4 v1, 0x1

    iget-object v2, p0, Ljv/a;->x:Landroid/content/res/TypedArray;

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Lvv/a;->a:Z

    const/16 v0, 0x62

    const v1, 0x800053

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p1, Lvv/a;->b:I

    const/high16 v0, 0x40800000    # 4.0f

    iget v1, p0, Ljv/a;->y:F

    mul-float/2addr v1, v0

    const/16 v0, 0x64

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p1, Lvv/a;->c:F

    const/16 v0, 0x66

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p1, Lvv/a;->d:F

    const/16 v0, 0x65

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p1, Lvv/a;->e:F

    const/16 v0, 0x63

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p1, Lvv/a;->f:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Llv/a;

    const-string v0, "$this$CompassSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljv/a;->x:Landroid/content/res/TypedArray;

    const/16 v1, 0x14

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Llv/a;->a:Z

    const/16 v1, 0x16

    const v3, 0x800035

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p1, Llv/a;->b:I

    const/high16 v1, 0x40800000    # 4.0f

    iget v3, p0, Ljv/a;->y:F

    mul-float/2addr v3, v1

    const/16 v1, 0x19

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p1, Llv/a;->c:F

    const/16 v1, 0x1b

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p1, Llv/a;->d:F

    const/16 v1, 0x1a

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p1, Llv/a;->e:F

    const/16 v1, 0x18

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p1, Llv/a;->f:F

    const/16 v1, 0x1c

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p1, Llv/a;->g:F

    const/16 v1, 0x1d

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p1, Llv/a;->h:F

    const/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Llv/a;->i:Z

    const/16 v1, 0x15

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Llv/a;->j:Z

    const/16 v1, 0x13

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Llv/a;->k:Z

    sget-object v1, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    const/16 v2, 0x17

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v0

    iput-object v0, p1, Llv/a;->l:Lcom/mapbox/maps/ImageHolder;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljv/b;

    const-string v0, "$this$AttributionSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljv/a;->x:Landroid/content/res/TypedArray;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p1, Ljv/b;->a:Z

    const-string v2, "#FF1E8CAB"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p1, Ljv/b;->b:I

    const/4 v2, 0x2

    const v3, 0x800053

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p1, Ljv/b;->c:I

    iget v2, p0, Ljv/a;->y:F

    const/high16 v3, 0x42b80000    # 92.0f

    mul-float/2addr v3, v2

    const/4 v4, 0x5

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p1, Ljv/b;->d:F

    const/high16 v3, 0x40800000    # 4.0f

    mul-float/2addr v2, v3

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p1, Ljv/b;->e:F

    const/4 v3, 0x6

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p1, Ljv/b;->f:F

    const/4 v3, 0x4

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p1, Ljv/b;->g:F

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p1, Ljv/b;->h:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
