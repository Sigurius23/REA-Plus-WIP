.class public final Lr61/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr61/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lr61/b;",
        "",
        "<init>",
        "()V",
        "",
        "Lu61/a;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "Lr61/b$a;",
        "dataPoint",
        "Lu61/e;",
        "c",
        "(Lr61/b$a;Landroidx/compose/runtime/Composer;I)Lu61/e;",
        "Lj71/b$g;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Lj71/b$g;",
        "Ljava/util/List;",
        "getBiomarkerDataPoints",
        "()Ljava/util/List;",
        "biomarkerDataPoints",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lr61/b;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lr61/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lr61/b;

    invoke-direct {v0}, Lr61/b;-><init>()V

    sput-object v0, Lr61/b;->a:Lr61/b;

    new-instance v1, Lr61/b$a;

    sget-object v0, Lr61/b$b;->w:Lr61/b$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    const-string v2, "Apr 24, 2023"

    const/16 v3, 0xb3

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4, v0}, Lr61/b$a;-><init>(Ljava/lang/String;IFLy81/e;)V

    new-instance v2, Lr61/b$a;

    sget-object v0, Lr61/b$c;->w:Lr61/b$c;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    const-string v3, "Apr 12, 2024"

    const/16 v4, 0xb7

    const v5, 0x3e4ccccd    # 0.2f

    invoke-direct {v2, v3, v4, v5, v0}, Lr61/b$a;-><init>(Ljava/lang/String;IFLy81/e;)V

    new-instance v3, Lr61/b$a;

    sget-object v0, Lr61/b$d;->w:Lr61/b$d;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    const-string v4, "Jul 12, 2024"

    const/16 v5, 0xa1

    const v6, 0x3ecccccd    # 0.4f

    invoke-direct {v3, v4, v5, v6, v0}, Lr61/b$a;-><init>(Ljava/lang/String;IFLy81/e;)V

    new-instance v4, Lr61/b$a;

    sget-object v0, Lr61/b$e;->w:Lr61/b$e;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    const-string v5, "Oct 4, 2024"

    const/16 v6, 0x74

    const v7, 0x3f19999a    # 0.6f

    invoke-direct {v4, v5, v6, v7, v0}, Lr61/b$a;-><init>(Ljava/lang/String;IFLy81/e;)V

    new-instance v5, Lr61/b$a;

    sget-object v0, Lr61/b$f;->w:Lr61/b$f;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    const-string v6, "Jan 12, 2025"

    const/16 v7, 0x86

    const v8, 0x3f4ccccd    # 0.8f

    invoke-direct {v5, v6, v7, v8, v0}, Lr61/b$a;-><init>(Ljava/lang/String;IFLy81/e;)V

    new-instance v6, Lr61/b$a;

    sget-object v0, Lr61/b$g;->w:Lr61/b$g;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    const-string v7, "Apr 2, 2025"

    const/16 v8, 0xb4

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v6, v7, v8, v9, v0}, Lr61/b$a;-><init>(Ljava/lang/String;IFLy81/e;)V

    filled-new-array/range {v1 .. v6}, [Lr61/b$a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lr61/b;->b:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lr61/b;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lu61/a;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0xee11f85

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lr61/b;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    sget-object v6, Lr61/b;->b:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr61/b$a;

    add-int/lit8 v5, v5, 0x1

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr61/b$a;

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_0

    sget-object v8, Lr61/b$h;->w:Lr61/b$h;

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    new-instance v9, Lu61/a;

    shl-int/lit8 v10, p2, 0x3

    and-int/lit8 v10, v10, 0x70

    invoke-direct {v0, v7, v2, v10}, Lr61/b;->c(Lr61/b$a;Landroidx/compose/runtime/Composer;I)Lu61/e;

    move-result-object v7

    invoke-direct {v0, v6, v2, v10}, Lr61/b;->c(Lr61/b$a;Landroidx/compose/runtime/Composer;I)Lu61/e;

    move-result-object v6

    filled-new-array {v7, v6}, [Lu61/e;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v11, Lk61/c;

    const/4 v6, 0x2

    int-to-float v12, v6

    invoke-static {v8}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v15

    const/16 v19, 0x36

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v11 .. v20}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0xa

    const/4 v15, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    return-object v1
.end method

.method private final c(Lr61/b$a;Landroidx/compose/runtime/Composer;I)Lu61/e;
    .locals 9

    invoke-virtual {p1}, Lr61/b$a;->c()I

    move-result p2

    add-int/lit8 p2, p2, -0x64

    int-to-float p2, p2

    const/high16 p3, 0x42c80000    # 100.0f

    div-float v2, p2, p3

    invoke-virtual {p1}, Lr61/b$a;->d()F

    move-result v1

    new-instance v3, Lu61/c;

    invoke-virtual {p1}, Lr61/b$a;->a()Ly81/e;

    move-result-object v4

    const/16 p2, 0xe

    int-to-float v5, p2

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lu61/d;

    invoke-virtual {p1}, Lr61/b$a;->c()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-virtual {p1}, Lr61/b$a;->a()Ly81/e;

    move-result-object p3

    const/4 v0, 0x0

    invoke-direct {v5, p2, p3, v0, v0}, Lu61/d;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;ZZ)V

    invoke-virtual {p1}, Lr61/b$a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lr61/b$a;->c()I

    move-result p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    new-instance v0, Lu61/e;

    const/16 v7, 0x20

    move-object v4, v3

    move-object v3, p1

    invoke-direct/range {v0 .. v8}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)Lj71/b$g;
    .locals 9

    new-instance v0, Lj71/b$g;

    and-int/lit8 p2, p2, 0xe

    invoke-direct {p0, p1, p2}, Lr61/b;->b(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v1

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const-string v2, "biomarker_line_fixture"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
