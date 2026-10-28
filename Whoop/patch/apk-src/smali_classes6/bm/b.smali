.class public final Lbm/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll0/k1;

.field public final synthetic F:Lb2/g;

.field public final synthetic G:Lh0/o1;

.field public final synthetic H:Z

.field public final synthetic I:Lx1/b;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lbm/t;

.field public final synthetic z:F


# direct methods
.method public constructor <init>(ILandroidx/compose/ui/Modifier;Lbm/t;FLl0/k1;Lb2/g;Lh0/o1;ZLx1/b;II)V
    .locals 0

    iput p1, p0, Lbm/b;->w:I

    iput-object p2, p0, Lbm/b;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lbm/b;->y:Lbm/t;

    iput p4, p0, Lbm/b;->z:F

    iput-object p5, p0, Lbm/b;->E:Ll0/k1;

    iput-object p6, p0, Lbm/b;->F:Lb2/g;

    iput-object p7, p0, Lbm/b;->G:Lh0/o1;

    iput-boolean p8, p0, Lbm/b;->H:Z

    iput-object p9, p0, Lbm/b;->I:Lx1/b;

    iput p10, p0, Lbm/b;->J:I

    iput p11, p0, Lbm/b;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lbm/b;->J:I

    or-int/lit8 v10, p1, 0x1

    iget v11, p0, Lbm/b;->K:I

    iget v0, p0, Lbm/b;->w:I

    iget-object v1, p0, Lbm/b;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lbm/b;->y:Lbm/t;

    iget v3, p0, Lbm/b;->z:F

    iget-object v4, p0, Lbm/b;->E:Ll0/k1;

    iget-object v5, p0, Lbm/b;->F:Lb2/g;

    iget-object v6, p0, Lbm/b;->G:Lh0/o1;

    iget-boolean v7, p0, Lbm/b;->H:Z

    iget-object v8, p0, Lbm/b;->I:Lx1/b;

    invoke-static/range {v0 .. v11}, Lse/b;->g(ILandroidx/compose/ui/Modifier;Lbm/t;FLl0/k1;Lb2/g;Lh0/o1;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
