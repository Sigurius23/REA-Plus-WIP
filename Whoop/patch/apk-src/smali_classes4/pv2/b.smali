.class public final Lpv2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpv2/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00102\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpv2/b;",
        "",
        "<init>",
        "()V",
        "Ldq1/a;",
        "zone",
        "",
        "currentHeartRate",
        "Lfz0/d;",
        "b",
        "(Ldq1/a;Ljava/lang/Integer;)Lfz0/d;",
        "",
        "c",
        "(Ljava/lang/Integer;Ldq1/a;)F",
        "a",
        "(Ldq1/a;I)F",
        "",
        "hrZones",
        "Lpv2/a;",
        "d",
        "(Ljava/util/List;Ljava/lang/Integer;)Lpv2/a;",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ldq1/a;I)F
    .locals 2

    invoke-virtual {p1}, Ldq1/a;->b()I

    move-result v0

    const/4 v1, 0x0

    if-ge p2, v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Ldq1/a;->b()I

    move-result v0

    sub-int/2addr p2, v0

    int-to-float p2, p2

    invoke-virtual {p1}, Ldq1/a;->a()I

    move-result v0

    invoke-virtual {p1}, Ldq1/a;->b()I

    move-result p1

    sub-int/2addr v0, p1

    int-to-float p1, v0

    div-float/2addr p2, p1

    const p1, 0x3c23d70a    # 0.01f

    invoke-static {p2, p1}, Lor2/a1;->f(FF)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, v1, p2}, Le93/b;->m(FFF)F

    move-result p1

    return p1
.end method

.method private final b(Ldq1/a;Ljava/lang/Integer;)Lfz0/d;
    .locals 12

    invoke-virtual {p1}, Ldq1/a;->c()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v0

    sget-object v1, Lpv2/b$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v0, Ll83/q;

    sget-object v2, Lfz0/e;->Right:Lfz0/e;

    sget v3, Lcu2/h;->W0:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    invoke-direct {v0, v2, v3, v4}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    new-instance v0, Ll83/q;

    sget-object v2, Lfz0/e;->Middle:Lfz0/e;

    sget v3, Lcu2/h;->V0:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    invoke-direct {v0, v2, v3, v4}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_2
    new-instance v0, Ll83/q;

    sget-object v2, Lfz0/e;->Middle:Lfz0/e;

    sget v3, Lcu2/h;->U0:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    invoke-direct {v0, v2, v3, v4}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_3
    new-instance v0, Ll83/q;

    sget-object v2, Lfz0/e;->Middle:Lfz0/e;

    sget v3, Lcu2/h;->T0:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    invoke-direct {v0, v2, v3, v4}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    new-instance v0, Ll83/q;

    sget-object v2, Lfz0/e;->Middle:Lfz0/e;

    sget v3, Lcu2/h;->S0:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    invoke-direct {v0, v2, v3, v4}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_5
    new-instance v0, Ll83/q;

    sget-object v2, Lfz0/e;->Left:Lfz0/e;

    sget v3, Lcu2/h;->R0:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-direct {v0, v2, v3, v4}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    iget-object v2, v0, Ll83/q;->w:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Lfz0/e;

    iget-object v2, v0, Ll83/q;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v0, v0, Ll83/q;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ly81/f;

    invoke-virtual {p1}, Ldq1/a;->c()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    const/4 v5, 0x6

    if-eq v0, v5, :cond_1

    new-instance v0, Li93/j;

    invoke-virtual {p1}, Ldq1/a;->b()I

    move-result v5

    invoke-virtual {p1}, Ldq1/a;->a()I

    move-result v7

    invoke-direct {v0, v5, v7, v3}, Li93/h;-><init>(III)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v0, v5}, Li93/j;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    move v7, v3

    goto :goto_2

    :cond_0
    move v7, v1

    goto :goto_2

    :cond_1
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Ldq1/a;->b()I

    move-result v5

    if-lt v0, v5, :cond_0

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Ldq1/a;->b()I

    move-result v0

    invoke-virtual {p1}, Ldq1/a;->a()I

    move-result v5

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-gt v0, v7, :cond_0

    if-gt v7, v5, :cond_0

    goto :goto_1

    :goto_2
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lpv2/b;->a(Ldq1/a;I)F

    move-result v0

    :goto_3
    move v8, v0

    goto :goto_4

    :cond_3
    const/4 v0, 0x0

    goto :goto_3

    :goto_4
    invoke-direct {p0, p2, p1}, Lpv2/b;->c(Ljava/lang/Integer;Ldq1/a;)F

    move-result v10

    new-instance v3, Lfz0/d;

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const-wide/high16 p1, 0x3ff8000000000000L    # 1.5

    double-to-float p1, p1

    const/4 p2, 0x4

    int-to-float p2, p2

    mul-float v9, p1, p2

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v11}, Lfz0/d;-><init>(Lfz0/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final c(Ljava/lang/Integer;Ldq1/a;)F
    .locals 4

    const v0, 0x3e4ccccd    # 0.2f

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p2}, Ldq1/a;->c()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v1

    sget-object v2, Lcom/whoop/hrZones/network/ZoneID;->ZONE_0:Lcom/whoop/hrZones/network/ZoneID;

    const/high16 v3, 0x3f800000    # 1.0f

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p2}, Ldq1/a;->b()I

    move-result v1

    invoke-virtual {p2}, Ldq1/a;->a()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-gt v1, p1, :cond_1

    if-gt p1, p2, :cond_1

    return v3

    :cond_1
    return v0

    :cond_2
    invoke-virtual {p2}, Ldq1/a;->c()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v1

    sget-object v2, Lcom/whoop/hrZones/network/ZoneID;->ZONE_5:Lcom/whoop/hrZones/network/ZoneID;

    if-ne v1, v2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ldq1/a;->b()I

    move-result p2

    if-lt p1, p2, :cond_3

    return v3

    :cond_3
    return v0

    :cond_4
    invoke-virtual {p2}, Ldq1/a;->b()I

    move-result v1

    invoke-virtual {p2}, Ldq1/a;->a()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-gt v1, p1, :cond_5

    if-gt p1, p2, :cond_5

    return v3

    :cond_5
    return v0
.end method


# virtual methods
.method public final d(Ljava/util/List;Ljava/lang/Integer;)Lpv2/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldq1/a;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lpv2/a;"
        }
    .end annotation

    const-string v0, "hrZones"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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

    check-cast v1, Ldq1/a;

    invoke-direct {p0, v1, p2}, Lpv2/b;->b(Ldq1/a;Ljava/lang/Integer;)Lfz0/d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lpv2/a;

    invoke-direct {p1, v0}, Lpv2/a;-><init>(Ljava/util/List;)V

    return-object p1
.end method
