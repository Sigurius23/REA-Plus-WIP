.class public final synthetic Ld30/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ZLc93/a;Lj11/o;ZLjava/lang/Integer;Lj11/p;Lc93/m;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ld30/i0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/i0;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Ld30/i0;->x:Z

    iput-object p3, p0, Ld30/i0;->E:Ljava/lang/Object;

    iput-object p4, p0, Ld30/i0;->F:Ljava/lang/Object;

    iput-boolean p5, p0, Ld30/i0;->y:Z

    iput-object p6, p0, Ld30/i0;->G:Ljava/lang/Object;

    iput-object p7, p0, Ld30/i0;->H:Ljava/lang/Object;

    iput-object p8, p0, Ld30/i0;->I:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh20/g1;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 2
    const/4 p9, 0x0

    iput p9, p0, Ld30/i0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld30/i0;->x:Z

    iput-boolean p2, p0, Ld30/i0;->y:Z

    iput-object p3, p0, Ld30/i0;->z:Ljava/lang/Object;

    iput-object p4, p0, Ld30/i0;->E:Ljava/lang/Object;

    iput-object p5, p0, Ld30/i0;->F:Ljava/lang/Object;

    iput-object p6, p0, Ld30/i0;->G:Ljava/lang/Object;

    iput-object p7, p0, Ld30/i0;->H:Ljava/lang/Object;

    iput-object p8, p0, Ld30/i0;->I:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Ld30/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld30/i0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Ld30/i0;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Ld30/i0;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lj11/o;

    iget-object v0, p0, Ld30/i0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    iget-object v0, p0, Ld30/i0;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lj11/p;

    iget-object v0, p0, Ld30/i0;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lc93/m;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v2, p0, Ld30/i0;->x:Z

    iget-boolean v5, p0, Ld30/i0;->y:Z

    invoke-static/range {v1 .. v10}, Lj11/n;->g(Lcom/whoop/design/util/TextResource;ZLc93/a;Lj11/o;ZLjava/lang/Integer;Lj11/p;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ld30/i0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lx1/b;

    iget-object v0, p0, Ld30/i0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Ld30/i0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Ld30/i0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Ld30/i0;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lh20/g1;

    iget-object v0, p0, Ld30/i0;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Landroidx/compose/ui/Modifier;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-boolean v1, p0, Ld30/i0;->x:Z

    iget-boolean v2, p0, Ld30/i0;->y:Z

    invoke-static/range {v1 .. v10}, Lkotlin/jvm/internal/j;->l(ZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh20/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
