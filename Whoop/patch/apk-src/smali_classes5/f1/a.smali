.class public final synthetic Lf1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:F

.field public final synthetic G:Landroidx/compose/ui/Modifier;

.field public final synthetic H:I

.field public final synthetic w:Lf1/m;

.field public final synthetic x:Z

.field public final synthetic y:Lw3/j;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lf1/m;ZLw3/j;ZJFLandroidx/compose/ui/Modifier;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/a;->w:Lf1/m;

    iput-boolean p2, p0, Lf1/a;->x:Z

    iput-object p3, p0, Lf1/a;->y:Lw3/j;

    iput-boolean p4, p0, Lf1/a;->z:Z

    iput-wide p5, p0, Lf1/a;->E:J

    iput p7, p0, Lf1/a;->F:F

    iput-object p8, p0, Lf1/a;->G:Landroidx/compose/ui/Modifier;

    iput p9, p0, Lf1/a;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lf1/a;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Lf1/a;->w:Lf1/m;

    iget-boolean v1, p0, Lf1/a;->x:Z

    iget-object v2, p0, Lf1/a;->y:Lw3/j;

    iget-boolean v3, p0, Lf1/a;->z:Z

    iget-wide v4, p0, Lf1/a;->E:J

    iget v6, p0, Lf1/a;->F:F

    iget-object v7, p0, Lf1/a;->G:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v9}, Lf1/y0;->e(Lf1/m;ZLw3/j;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
