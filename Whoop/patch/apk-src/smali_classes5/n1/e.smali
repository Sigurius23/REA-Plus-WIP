.class public final synthetic Ln1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Li2/a1;

.field public final synthetic G:J

.field public final synthetic H:F

.field public final synthetic I:Lx1/b;

.field public final synthetic J:I

.field public final synthetic w:Ln1/g;

.field public final synthetic x:Ln1/o;

.field public final synthetic y:Z

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Ln1/g;Ln1/o;ZLandroidx/compose/ui/Modifier;FLi2/a1;JFLx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/e;->w:Ln1/g;

    iput-object p2, p0, Ln1/e;->x:Ln1/o;

    iput-boolean p3, p0, Ln1/e;->y:Z

    iput-object p4, p0, Ln1/e;->z:Landroidx/compose/ui/Modifier;

    iput p5, p0, Ln1/e;->E:F

    iput-object p6, p0, Ln1/e;->F:Li2/a1;

    iput-wide p7, p0, Ln1/e;->G:J

    iput p9, p0, Ln1/e;->H:F

    iput-object p10, p0, Ln1/e;->I:Lx1/b;

    iput p11, p0, Ln1/e;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ln1/e;->J:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v0, p0, Ln1/e;->w:Ln1/g;

    iget-object v1, p0, Ln1/e;->x:Ln1/o;

    iget-boolean v2, p0, Ln1/e;->y:Z

    iget-object v3, p0, Ln1/e;->z:Landroidx/compose/ui/Modifier;

    iget v4, p0, Ln1/e;->E:F

    iget-object v5, p0, Ln1/e;->F:Li2/a1;

    iget-wide v6, p0, Ln1/e;->G:J

    iget v8, p0, Ln1/e;->H:F

    iget-object v9, p0, Ln1/e;->I:Lx1/b;

    invoke-virtual/range {v0 .. v11}, Ln1/g;->b(Ln1/o;ZLandroidx/compose/ui/Modifier;FLi2/a1;JFLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
