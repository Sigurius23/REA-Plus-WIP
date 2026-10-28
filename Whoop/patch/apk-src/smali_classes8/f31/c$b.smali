.class public final Lf31/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljava/util/List;

.field final synthetic z:Lc93/o;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/Object;Ljava/util/List;Lc93/o;I)V
    .locals 0

    iput-object p1, p0, Lf31/c$b;->w:Ljava/util/List;

    iput-object p2, p0, Lf31/c$b;->x:Ljava/lang/Object;

    iput-object p3, p0, Lf31/c$b;->y:Ljava/util/List;

    iput-object p4, p0, Lf31/c$b;->z:Lc93/o;

    iput p5, p0, Lf31/c$b;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 10

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p4, v1, :cond_4

    move p4, v3

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/lit8 v1, v0, 0x1

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, p4}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p3, p0, Lf31/c$b;->w:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    const p3, 0x78ee2cae

    invoke-virtual {v8, p3}, Lp1/q;->e0(I)V

    new-instance v7, Lf31/a;

    iget-object p3, p0, Lf31/c$b;->x:Ljava/lang/Object;

    invoke-static {p3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p2, :cond_5

    move p4, v3

    goto :goto_4

    :cond_5
    move p4, v2

    :goto_4
    iget-object v1, p0, Lf31/c$b;->y:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v3

    if-ne p2, v1, :cond_6

    goto :goto_5

    :cond_6
    move v3, v2

    :goto_5
    invoke-direct {v7, p3, p4, v3}, Lf31/a;-><init>(ZZZ)V

    iget-object v4, p0, Lf31/c$b;->z:Lc93/o;

    and-int/lit8 p2, v0, 0xe

    iget p3, p0, Lf31/c$b;->E:I

    shr-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0x8

    shl-int/lit8 p3, p3, 0x3

    or-int/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object v5, p1

    invoke-interface/range {v4 .. v9}, Lc93/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_7
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lf31/c$b;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
