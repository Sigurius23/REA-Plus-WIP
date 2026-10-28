.class public abstract Lf61/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000c\"\u0017\u0010\u0012\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0017\u0010\u0015\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0007\u001a\u0004\u0008\u0014\u0010\t\u00a8\u0006\u0016"
    }
    d2 = {
        "Lg61/b;",
        "a",
        "()Lg61/b;",
        "Lj71/b$g;",
        "c",
        "()Lj71/b$g;",
        "Lt81/r;",
        "Lt81/r;",
        "b",
        "()Lt81/r;",
        "zoomableGraphStatePreview",
        "Ld61/a$c;",
        "Ld61/a$c;",
        "dataScrubState",
        "Lh71/l;",
        "Lh71/l;",
        "getInitialScrollableScrubState",
        "()Lh71/l;",
        "initialScrollableScrubState",
        "d",
        "getZoomableGraphStateWithScrubber",
        "zoomableGraphStateWithScrubber",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lt81/r;

.field private static final b:Ld61/a$c;

.field private static final c:Lh71/l;

.field private static final d:Lt81/r;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    const/high16 v0, 0x44870000    # 1080.0f

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    const/high16 v3, 0x445c0000    # 880.0f

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v1, v6

    const-wide v7, 0xffffffffL

    and-long/2addr v4, v7

    or-long v13, v1, v4

    invoke-static {}, Lf61/l;->c()Lj71/b$g;

    move-result-object v1

    invoke-static {}, Lf71/d;->n()Lj71/b$l;

    move-result-object v2

    invoke-static {}, Lp61/b;->d()Lj71/b$h;

    move-result-object v4

    invoke-static {}, Lv61/d;->a()Lj71/b$i;

    move-result-object v5

    const/4 v9, 0x4

    new-array v9, v9, [Lj71/b;

    const/4 v10, 0x0

    aput-object v1, v9, v10

    const/4 v1, 0x1

    aput-object v2, v9, v1

    const/4 v1, 0x2

    aput-object v4, v9, v1

    const/4 v1, 0x3

    aput-object v5, v9, v1

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-static {}, Lf61/l;->a()Lg61/b;

    move-result-object v16

    new-instance v1, Lh2/c;

    const/4 v2, 0x0

    const v4, 0x3e4ccccd    # 0.2f

    invoke-direct {v1, v2, v4, v2, v2}, Lh2/c;-><init>(FFFF)V

    new-instance v10, Lh71/k;

    const/16 v22, 0x34

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v1

    move-object v15, v10

    invoke-direct/range {v15 .. v23}, Lh71/k;-><init>(Lg61/b;Lh2/c;Lj61/g;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lt81/r;

    const/16 v24, 0x1ff2

    const/16 v25, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v9 .. v25}, Lt81/r;-><init>(Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lf61/l;->a:Lt81/r;

    new-instance v11, Ld61/a$c;

    new-instance v1, Lcz0/s$c;

    new-instance v12, La71/a;

    const-string v5, "140"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const-string v5, "bpm"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const-string v5, "12:00pm"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v25, 0xfe3

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v12 .. v26}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v10, "id"

    const/high16 v12, 0x3ec00000    # 0.375f

    const/high16 v13, 0x3f000000    # 0.5f

    invoke-direct {v1, v10, v12, v13, v5}, Lcz0/s$c;-><init>(Ljava/lang/String;FFLjava/util/List;)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v10, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const/high16 v5, 0x43e10000    # 450.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-direct {v11, v1, v5}, Ld61/a$c;-><init>(Ljava/util/Map;Ljava/lang/Float;)V

    sput-object v11, Lf61/l;->b:Ld61/a$c;

    new-instance v10, Lh71/l;

    new-instance v12, Li71/h;

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v13, v1

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    move v5, v0

    int-to-long v0, v1

    shl-long/2addr v13, v6

    and-long/2addr v0, v7

    or-long v15, v13, v0

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v13, v3

    shl-long/2addr v0, v6

    and-long v5, v13, v7

    or-long v17, v0, v5

    const/16 v20, 0x8

    const-wide/16 v13, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v12 .. v21}, Li71/h;-><init>(JJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lh2/c;

    const/high16 v0, 0x3f800000    # 1.0f

    const v1, 0x3f666666    # 0.9f

    invoke-direct {v13, v2, v4, v0, v1}, Lh2/c;-><init>(FFFF)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v15}, Lh71/l;-><init>(Ld61/a;Li71/h;Lh2/c;FF)V

    move-object/from16 v26, v11

    sput-object v10, Lf61/l;->c:Lh71/l;

    const/16 v30, 0x11ff

    const/16 v31, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const-string v27, "id"

    const/16 v29, 0x0

    move-object v15, v9

    move-object/from16 v28, v10

    invoke-static/range {v15 .. v31}, Lt81/r;->b(Lt81/r;Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILjava/lang/Object;)Lt81/r;

    move-result-object v0

    sput-object v0, Lf61/l;->d:Lt81/r;

    return-void
.end method

.method public static final a()Lg61/b;
    .locals 15

    new-instance v0, Lg61/b;

    const-string v1, "40"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v1, Lf61/l$a;->w:Lf61/l$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    new-instance v2, Lyy0/c;

    const/16 v9, 0x22

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/high16 v6, 0x3f000000    # 0.5f

    const v7, 0x3e3851ec    # 0.18f

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "80"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v1, Lf61/l$b;->w:Lf61/l$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    new-instance v3, Lyy0/c;

    const/16 v10, 0x22

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const v8, 0x3eb851ec    # 0.36f

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "120"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v1, Lf61/l$c;->w:Lf61/l$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    new-instance v4, Lyy0/c;

    const/16 v11, 0x22

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    const v9, 0x3f0a3d71    # 0.54f

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "160"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v1, Lf61/l$d;->w:Lf61/l$d;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    new-instance v5, Lyy0/c;

    const/16 v12, 0x22

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/high16 v9, 0x3f000000    # 0.5f

    const v10, 0x3f3851ec    # 0.72f

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "200"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v1, Lf61/l$e;->w:Lf61/l$e;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    new-instance v6, Lyy0/c;

    const/16 v13, 0x22

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/high16 v10, 0x3f000000    # 0.5f

    const v11, 0x3f666666    # 0.9f

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v2, v3, v4, v5, v6}, [Lyy0/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v9, 0xfc

    const/4 v10, 0x0

    const v1, 0x3d4ccccd    # 0.05f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v10}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final b()Lt81/r;
    .locals 1

    sget-object v0, Lf61/l;->a:Lt81/r;

    return-object v0
.end method

.method public static final c()Lj71/b$g;
    .locals 20

    invoke-static {}, Lf61/k;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lu61/e;

    invoke-virtual {v3}, Lu61/e;->h()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v5, "%.2f"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, La71/a;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v18, 0xff9

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v5 .. v19}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x1f

    const/4 v4, 0x0

    move-object v9, v5

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lu61/e;->c(Lu61/e;FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILjava/lang/Object;)Lu61/e;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Lk61/c;

    sget-object v0, Lf61/l$f;->w:Lf61/l$f;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v7

    const/16 v11, 0x37

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lu61/a;

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xa

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v2, Lj71/b$g;

    const-string v4, "id"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x3c

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v10}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
