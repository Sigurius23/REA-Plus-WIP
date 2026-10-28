.class public final synthetic Li21/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lc93/a;Lcom/whoop/design/util/TextResource;JLi21/l;Ly11/r;I)V
    .locals 0

    .line 1
    iput p8, p0, Li21/d;->w:I

    iput-object p1, p0, Li21/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Li21/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Li21/d;->z:Ljava/lang/Object;

    iput-wide p4, p0, Li21/d;->E:J

    iput-object p6, p0, Li21/d;->G:Ljava/lang/Object;

    iput-object p7, p0, Li21/d;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JLb91/a;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lb91/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Li21/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li21/d;->z:Ljava/lang/Object;

    iput-wide p2, p0, Li21/d;->E:J

    iput-object p4, p0, Li21/d;->x:Ljava/lang/Object;

    iput-object p5, p0, Li21/d;->y:Ljava/lang/Object;

    iput-object p6, p0, Li21/d;->G:Ljava/lang/Object;

    iput-object p7, p0, Li21/d;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lah0/f;JLc93/m;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Li21/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li21/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Li21/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Li21/d;->z:Ljava/lang/Object;

    iput-object p4, p0, Li21/d;->G:Ljava/lang/Object;

    iput-wide p5, p0, Li21/d;->E:J

    iput-object p7, p0, Li21/d;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Li21/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li21/d;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Li21/d;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lb91/a;

    iget-object v0, p0, Li21/d;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Li21/d;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lsz0/h1;

    iget-object v0, p0, Li21/d;->F:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lb91/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v2, p0, Li21/d;->E:J

    invoke-static/range {v1 .. v9}, Lsz0/p;->c(Lcom/whoop/design/util/TextResource;JLb91/a;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lb91/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Li21/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt0/i;

    iget-object v0, p0, Li21/d;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Li21/d;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Li21/d;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lah0/f;

    iget-object v0, p0, Li21/d;->F:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/m;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v5, p0, Li21/d;->E:J

    invoke-static/range {v1 .. v9}, Lih0/e0;->T(Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lah0/f;JLc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Li21/d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Li21/d;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Li21/d;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Li21/d;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Li21/l$e;

    iget-object v0, p0, Li21/d;->F:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ly11/r;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v4, p0, Li21/d;->E:J

    invoke-static/range {v1 .. v9}, Li21/o;->c(Landroidx/compose/ui/Modifier;Lc93/a;Lcom/whoop/design/util/TextResource;JLi21/l$e;Ly11/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Li21/d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Li21/d;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Li21/d;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Li21/d;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Li21/l$c;

    iget-object v0, p0, Li21/d;->F:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ly11/r;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v4, p0, Li21/d;->E:J

    invoke-static/range {v1 .. v9}, Li21/e;->a(Landroidx/compose/ui/Modifier;Lc93/a;Lcom/whoop/design/util/TextResource;JLi21/l$c;Ly11/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
