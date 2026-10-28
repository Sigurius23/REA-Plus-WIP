.class public final Lp1/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/i;
.implements Lp1/o2;


# static fields
.field public static final E:Lp1/v0;

.field public static final F:Lp1/v0;

.field public static final synthetic x:Lp1/v0;

.field public static final y:Lp1/v0;

.field public static final z:Lp1/v0;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/v0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/v0;-><init>(I)V

    sput-object v0, Lp1/v0;->x:Lp1/v0;

    new-instance v0, Lp1/v0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp1/v0;-><init>(I)V

    sput-object v0, Lp1/v0;->y:Lp1/v0;

    new-instance v0, Lp1/v0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lp1/v0;-><init>(I)V

    sput-object v0, Lp1/v0;->z:Lp1/v0;

    new-instance v0, Lp1/v0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lp1/v0;-><init>(I)V

    sput-object v0, Lp1/v0;->E:Lp1/v0;

    new-instance v0, Lp1/v0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lp1/v0;-><init>(I)V

    sput-object v0, Lp1/v0;->F:Lp1/v0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lp1/v0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Lp1/v0;)V
    .locals 9

    sget-object v0, Lp1/y1;->z:Lec3/h2;

    :cond_0
    sget-object v0, Lp1/y1;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/e;

    move-object v2, v1

    check-cast v2, Lv1/b;

    iget-object v3, v2, Lv1/b;->y:Lu1/c;

    invoke-virtual {v3, p0}, Lu1/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv1/a;

    if-nez v4, :cond_1

    goto :goto_3

    :cond_1
    iget-object v5, v4, Lv1/a;->a:Ljava/lang/Object;

    iget-object v4, v4, Lv1/a;->b:Ljava/lang/Object;

    iget-object v6, v3, Lu1/c;->w:Lu1/o;

    const/4 v7, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v8

    goto :goto_0

    :cond_2
    move v8, v7

    :goto_0
    invoke-virtual {v6, v8, v7, p0}, Lu1/o;->v(IILjava/lang/Object;)Lu1/o;

    move-result-object v7

    if-ne v6, v7, :cond_3

    goto :goto_1

    :cond_3
    if-nez v7, :cond_4

    sget-object v3, Lu1/c;->y:Lu1/c;

    goto :goto_1

    :cond_4
    new-instance v6, Lu1/c;

    iget v3, v3, Lu1/c;->x:I

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v6, v7, v3}, Lu1/c;-><init>(Lu1/o;I)V

    move-object v3, v6

    :goto_1
    sget-object v6, Lw1/b;->a:Lw1/b;

    if-eq v5, v6, :cond_5

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v7, Lv1/a;

    new-instance v8, Lv1/a;

    iget-object v7, v7, Lv1/a;->a:Ljava/lang/Object;

    invoke-direct {v8, v7, v4}, Lv1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v5, v8}, Lu1/c;->b(Ljava/lang/Object;Lv1/a;)Lu1/c;

    move-result-object v3

    :cond_5
    if-eq v4, v6, :cond_6

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v7, Lv1/a;

    new-instance v8, Lv1/a;

    iget-object v7, v7, Lv1/a;->b:Ljava/lang/Object;

    invoke-direct {v8, v5, v7}, Lv1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4, v8}, Lu1/c;->b(Ljava/lang/Object;Lv1/a;)Lu1/c;

    move-result-object v3

    :cond_6
    if-eq v5, v6, :cond_7

    iget-object v7, v2, Lv1/b;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_7
    move-object v7, v4

    :goto_2
    if-eq v4, v6, :cond_8

    iget-object v5, v2, Lv1/b;->x:Ljava/lang/Object;

    :cond_8
    new-instance v2, Lv1/b;

    invoke-direct {v2, v7, v5, v3}, Lv1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu1/c;)V

    :goto_3
    if-eq v1, v2, :cond_9

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_9
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lp1/v0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lp1/v0;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    const-string v0, "Empty"

    return-object v0

    :pswitch_2
    const-string v0, "StructuralEqualityPolicy"

    return-object v0

    :pswitch_3
    const-string v0, "ReferentialEqualityPolicy"

    return-object v0

    :pswitch_4
    const-string v0, "NeverEqualPolicy"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
