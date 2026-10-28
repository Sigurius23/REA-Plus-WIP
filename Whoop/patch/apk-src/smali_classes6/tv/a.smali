.class public final Ltv/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Landroid/content/res/TypedArray;

.field public final synthetic x:F

.field public final synthetic y:Z


# direct methods
.method public constructor <init>(Landroid/content/res/TypedArray;FZ)V
    .locals 0

    iput-object p1, p0, Ltv/a;->w:Landroid/content/res/TypedArray;

    iput p2, p0, Ltv/a;->x:F

    iput-boolean p3, p0, Ltv/a;->y:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Ltv/b;

    const-string v0, "$this$LocationComponentSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltv/a;->w:Landroid/content/res/TypedArray;

    const/16 v1, 0x33

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Ltv/b;->b:Z

    const/16 v1, 0x5d

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Ltv/b;->c:Z

    const-string v1, "#4A90E2"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0x5c

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p1, Ltv/b;->d:I

    const/high16 v1, 0x41200000    # 10.0f

    iget v3, p0, Ltv/a;->x:F

    mul-float/2addr v3, v1

    const/16 v1, 0x5e

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p1, Ltv/b;->e:F

    const/16 v1, 0x5f

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p1, Ltv/b;->f:Z

    const-string v1, "#4d89cff0"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x32

    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p1, Ltv/b;->g:I

    const/16 v3, 0x31

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p1, Ltv/b;->h:I

    const/16 v1, 0x34

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Ltv/b;->i:Ljava/lang/String;

    const/16 v1, 0x35

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Ltv/b;->j:Ljava/lang/String;

    iget-boolean v1, p0, Ltv/a;->y:Z

    iput-boolean v1, p1, Ltv/b;->k:Z

    invoke-static {}, Lev/r;->values()[Lev/r;

    move-result-object v1

    const/16 v3, 0x5a

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    aget-object v1, v1, v2

    const-string v2, "<set-?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p1, Ltv/b;->l:Lev/r;

    const/16 v1, 0x60

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ltv/b;->m:Ljava/lang/String;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
