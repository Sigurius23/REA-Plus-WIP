.class public final synthetic Ll1/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Ll1/y;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Ll1/y;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/i0;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Ll1/i0;->x:Z

    iput-boolean p3, p0, Ll1/i0;->y:Z

    iput-boolean p4, p0, Ll1/i0;->z:Z

    iput-object p5, p0, Ll1/i0;->E:Ljava/lang/String;

    iput-object p6, p0, Ll1/i0;->F:Lc93/a;

    iput-object p7, p0, Ll1/i0;->G:Lc93/a;

    iput-object p8, p0, Ll1/i0;->H:Lc93/a;

    iput-object p9, p0, Ll1/i0;->I:Ll1/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x7

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Ll1/i0;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Ll1/i0;->x:Z

    iget-boolean v2, p0, Ll1/i0;->y:Z

    iget-boolean v3, p0, Ll1/i0;->z:Z

    iget-object v4, p0, Ll1/i0;->E:Ljava/lang/String;

    iget-object v5, p0, Ll1/i0;->F:Lc93/a;

    iget-object v6, p0, Ll1/i0;->G:Lc93/a;

    iget-object v7, p0, Ll1/i0;->H:Lc93/a;

    iget-object v8, p0, Ll1/i0;->I:Ll1/y;

    invoke-static/range {v0 .. v10}, Ll1/f1;->j(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
