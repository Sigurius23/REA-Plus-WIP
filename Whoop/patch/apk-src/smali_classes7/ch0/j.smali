.class public final synthetic Lch0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Z

.field public final synthetic G:Lp1/t2;

.field public final synthetic w:Lch0/d0;

.field public final synthetic x:Lch0/v0;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lf0/r1;


# direct methods
.method public synthetic constructor <init>(Lch0/d0;Lch0/v0;Landroidx/compose/ui/Modifier;Lf0/r1;FZLp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/j;->w:Lch0/d0;

    iput-object p2, p0, Lch0/j;->x:Lch0/v0;

    iput-object p3, p0, Lch0/j;->y:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lch0/j;->z:Lf0/r1;

    iput p5, p0, Lch0/j;->E:F

    iput-boolean p6, p0, Lch0/j;->F:Z

    iput-object p7, p0, Lch0/j;->G:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lch0/j;->w:Lch0/d0;

    iget-object v1, p0, Lch0/j;->x:Lch0/v0;

    iget-object v2, p0, Lch0/j;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lch0/j;->z:Lf0/r1;

    iget v4, p0, Lch0/j;->E:F

    iget-boolean v5, p0, Lch0/j;->F:Z

    iget-object v6, p0, Lch0/j;->G:Lp1/t2;

    invoke-static/range {v0 .. v8}, Lch0/n;->j(Lch0/d0;Lch0/v0;Landroidx/compose/ui/Modifier;Lf0/r1;FZLp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
