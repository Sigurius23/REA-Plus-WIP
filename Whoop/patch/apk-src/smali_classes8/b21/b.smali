.class public final synthetic Lb21/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb21/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb21/b;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb21/b;->G:Ljava/lang/Object;

    iput-boolean p3, p0, Lb21/b;->y:Z

    iput-wide p4, p0, Lb21/b;->z:J

    iput-object p6, p0, Lb21/b;->H:Ljava/lang/Object;

    iput-object p7, p0, Lb21/b;->I:Ljava/lang/Object;

    iput p8, p0, Lb21/b;->E:I

    iput p9, p0, Lb21/b;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lb21/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb21/b;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb21/b;->G:Ljava/lang/Object;

    iput-object p3, p0, Lb21/b;->H:Ljava/lang/Object;

    iput-wide p4, p0, Lb21/b;->z:J

    iput-object p6, p0, Lb21/b;->I:Ljava/lang/Object;

    iput-boolean p7, p0, Lb21/b;->y:Z

    iput p8, p0, Lb21/b;->E:I

    iput p9, p0, Lb21/b;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ld0/z1;Landroidx/compose/ui/Modifier;Ljava/util/List;JZLl83/k;II)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lb21/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb21/b;->G:Ljava/lang/Object;

    iput-object p2, p0, Lb21/b;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lb21/b;->H:Ljava/lang/Object;

    iput-wide p4, p0, Lb21/b;->z:J

    iput-boolean p6, p0, Lb21/b;->y:Z

    iput-object p7, p0, Lb21/b;->I:Ljava/lang/Object;

    iput p8, p0, Lb21/b;->E:I

    iput p9, p0, Lb21/b;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lb21/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb21/b;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnz0/b;

    iget-object v0, p0, Lb21/b;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lb21/b;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lb21/b;->x:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, Lb21/b;->z:J

    iget-boolean v7, p0, Lb21/b;->y:Z

    iget v8, p0, Lb21/b;->E:I

    iget v9, p0, Lb21/b;->F:I

    invoke-static/range {v1 .. v11}, Lnz0/c;->a(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb21/b;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li2/a1;

    iget-object v0, p0, Lb21/b;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lf0/t;

    iget-object v0, p0, Lb21/b;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lx1/b;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb21/b;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v1, p0, Lb21/b;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Lb21/b;->y:Z

    iget-wide v4, p0, Lb21/b;->z:J

    iget v10, p0, Lb21/b;->F:I

    invoke-static/range {v1 .. v10}, Lse/a;->p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb21/b;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/z1;

    iget-object v0, p0, Lb21/b;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, p0, Lb21/b;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ll83/k;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v2, p0, Lb21/b;->x:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, Lb21/b;->z:J

    iget-boolean v6, p0, Lb21/b;->y:Z

    iget v8, p0, Lb21/b;->E:I

    iget v9, p0, Lb21/b;->F:I

    invoke-static/range {v1 .. v11}, Lb21/d;->d(Ld0/z1;Landroidx/compose/ui/Modifier;Ljava/util/List;JZLl83/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
