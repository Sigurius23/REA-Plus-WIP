.class public final synthetic Lg1/v5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/util/List;

.field public final synthetic F:F

.field public final synthetic G:F

.field public final synthetic H:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lg1/w1;

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lg1/w1;ZFLjava/util/List;FFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/v5;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/v5;->x:Lg1/w1;

    iput-boolean p3, p0, Lg1/v5;->y:Z

    iput p4, p0, Lg1/v5;->z:F

    iput-object p5, p0, Lg1/v5;->E:Ljava/util/List;

    iput p6, p0, Lg1/v5;->F:F

    iput p7, p0, Lg1/v5;->G:F

    iput p8, p0, Lg1/v5;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/v5;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Lg1/v5;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg1/v5;->x:Lg1/w1;

    iget-boolean v2, p0, Lg1/v5;->y:Z

    iget v3, p0, Lg1/v5;->z:F

    iget-object v4, p0, Lg1/v5;->E:Ljava/util/List;

    iget v5, p0, Lg1/v5;->F:F

    iget v6, p0, Lg1/v5;->G:F

    invoke-static/range {v0 .. v8}, Lg1/g6;->e(Landroidx/compose/ui/Modifier;Lg1/w1;ZFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
