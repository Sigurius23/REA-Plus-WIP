.class public final synthetic Lch/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly2/k;

.field public final synthetic F:F

.field public final synthetic G:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcoil/compose/AsyncImagePainter;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lb2/h;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Lb2/h;Ly2/k;FI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/b;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lch/b;->x:Lcoil/compose/AsyncImagePainter;

    iput-object p3, p0, Lch/b;->y:Ljava/lang/String;

    iput-object p4, p0, Lch/b;->z:Lb2/h;

    iput-object p5, p0, Lch/b;->E:Ly2/k;

    iput p6, p0, Lch/b;->F:F

    iput p7, p0, Lch/b;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lch/b;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v0, p0, Lch/b;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lch/b;->x:Lcoil/compose/AsyncImagePainter;

    iget-object v2, p0, Lch/b;->y:Ljava/lang/String;

    iget-object v3, p0, Lch/b;->z:Lb2/h;

    iget-object v4, p0, Lch/b;->E:Ly2/k;

    iget v5, p0, Lch/b;->F:F

    invoke-static/range {v0 .. v7}, Lce/w;->l(Landroidx/compose/ui/Modifier;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Lb2/h;Ly2/k;FLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
