.class public final synthetic Lg1/e4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Z

.field public final synthetic H:F

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:Lx1/b;

.field public final synthetic K:Ll0/k1;

.field public final synthetic L:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lkotlin/jvm/functions/Function3;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;ZFLkotlin/jvm/functions/Function1;Lx1/b;Ll0/k1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/e4;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/e4;->x:Lc93/m;

    iput-object p3, p0, Lg1/e4;->y:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lg1/e4;->z:Lc93/m;

    iput-object p5, p0, Lg1/e4;->E:Lc93/m;

    iput-object p6, p0, Lg1/e4;->F:Lc93/m;

    iput-boolean p7, p0, Lg1/e4;->G:Z

    iput p8, p0, Lg1/e4;->H:F

    iput-object p9, p0, Lg1/e4;->I:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lg1/e4;->J:Lx1/b;

    iput-object p11, p0, Lg1/e4;->K:Ll0/k1;

    iput p12, p0, Lg1/e4;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/e4;->L:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v0, p0, Lg1/e4;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg1/e4;->x:Lc93/m;

    iget-object v2, p0, Lg1/e4;->y:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lg1/e4;->z:Lc93/m;

    iget-object v4, p0, Lg1/e4;->E:Lc93/m;

    iget-object v5, p0, Lg1/e4;->F:Lc93/m;

    iget-boolean v6, p0, Lg1/e4;->G:Z

    iget v7, p0, Lg1/e4;->H:F

    iget-object v8, p0, Lg1/e4;->I:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lg1/e4;->J:Lx1/b;

    iget-object v10, p0, Lg1/e4;->K:Ll0/k1;

    invoke-static/range {v0 .. v12}, Lg1/j4;->c(Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;ZFLkotlin/jvm/functions/Function1;Lx1/b;Ll0/k1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
