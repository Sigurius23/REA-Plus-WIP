.class public final Lbm/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lh0/o1;

.field public final synthetic F:Ll0/k1;

.field public final synthetic G:Z

.field public final synthetic H:Lb2/g;

.field public final synthetic I:Lb2/f;

.field public final synthetic J:Lx1/b;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lbm/t;

.field public final synthetic z:F


# direct methods
.method public constructor <init>(ILandroidx/compose/ui/Modifier;Lbm/t;FLh0/o1;Ll0/k1;ZLb2/g;Lb2/f;Lx1/b;II)V
    .locals 0

    iput p1, p0, Lbm/k;->w:I

    iput-object p2, p0, Lbm/k;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lbm/k;->y:Lbm/t;

    iput p4, p0, Lbm/k;->z:F

    iput-object p5, p0, Lbm/k;->E:Lh0/o1;

    iput-object p6, p0, Lbm/k;->F:Ll0/k1;

    iput-boolean p7, p0, Lbm/k;->G:Z

    iput-object p8, p0, Lbm/k;->H:Lb2/g;

    iput-object p9, p0, Lbm/k;->I:Lb2/f;

    iput-object p10, p0, Lbm/k;->J:Lx1/b;

    iput p11, p0, Lbm/k;->K:I

    iput p12, p0, Lbm/k;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lbm/k;->K:I

    or-int/lit8 v11, p1, 0x1

    iget v12, p0, Lbm/k;->L:I

    iget v0, p0, Lbm/k;->w:I

    iget-object v1, p0, Lbm/k;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lbm/k;->y:Lbm/t;

    iget v3, p0, Lbm/k;->z:F

    iget-object v4, p0, Lbm/k;->E:Lh0/o1;

    iget-object v5, p0, Lbm/k;->F:Ll0/k1;

    iget-boolean v6, p0, Lbm/k;->G:Z

    iget-object v7, p0, Lbm/k;->H:Lb2/g;

    iget-object v8, p0, Lbm/k;->I:Lb2/f;

    iget-object v9, p0, Lbm/k;->J:Lx1/b;

    invoke-static/range {v0 .. v12}, Lse/b;->m(ILandroidx/compose/ui/Modifier;Lbm/t;FLh0/o1;Ll0/k1;ZLb2/g;Lb2/f;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
