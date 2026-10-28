.class public final synthetic Lvy0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/lang/Integer;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Landroidx/compose/ui/Modifier;

.field public final synthetic w:Lvy0/j0;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lvy0/j0;Lc93/a;Lc93/a;ZZLjava/lang/Integer;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvy0/l;->w:Lvy0/j0;

    iput-object p2, p0, Lvy0/l;->x:Lc93/a;

    iput-object p3, p0, Lvy0/l;->y:Lc93/a;

    iput-boolean p4, p0, Lvy0/l;->z:Z

    iput-boolean p5, p0, Lvy0/l;->E:Z

    iput-object p6, p0, Lvy0/l;->F:Ljava/lang/Integer;

    iput-object p7, p0, Lvy0/l;->G:Lc93/a;

    iput-object p8, p0, Lvy0/l;->H:Lc93/a;

    iput-object p9, p0, Lvy0/l;->I:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v9, p1

    check-cast v9, Lc0/o;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    move-object/from16 v11, p3

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lvy0/l;->w:Lvy0/j0;

    iget-object v1, p0, Lvy0/l;->x:Lc93/a;

    iget-object v2, p0, Lvy0/l;->y:Lc93/a;

    iget-boolean v3, p0, Lvy0/l;->z:Z

    iget-boolean v4, p0, Lvy0/l;->E:Z

    iget-object v5, p0, Lvy0/l;->F:Ljava/lang/Integer;

    iget-object v6, p0, Lvy0/l;->G:Lc93/a;

    iget-object v7, p0, Lvy0/l;->H:Lc93/a;

    iget-object v8, p0, Lvy0/l;->I:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v12}, Lvy0/p;->t(Lvy0/j0;Lc93/a;Lc93/a;ZZLjava/lang/Integer;Lc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
