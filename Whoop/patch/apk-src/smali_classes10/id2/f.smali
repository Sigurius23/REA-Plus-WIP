.class public final synthetic Lid2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;Lc93/a;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lid2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lid2/f;->x:I

    iput-object p6, p0, Lid2/f;->G:Ljava/lang/Object;

    iput-boolean p7, p0, Lid2/f;->y:Z

    iput-object p5, p0, Lid2/f;->z:Lc93/a;

    iput-object p4, p0, Lid2/f;->H:Ljava/lang/Object;

    iput p2, p0, Lid2/f;->E:I

    iput p3, p0, Lid2/f;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lmq2/b;ZILc93/a;Lc93/m;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lid2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lid2/f;->G:Ljava/lang/Object;

    iput-boolean p2, p0, Lid2/f;->y:Z

    iput p3, p0, Lid2/f;->x:I

    iput-object p4, p0, Lid2/f;->z:Lc93/a;

    iput-object p5, p0, Lid2/f;->H:Ljava/lang/Object;

    iput p6, p0, Lid2/f;->E:I

    iput p7, p0, Lid2/f;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lqt0/b;IZLc93/a;Lc93/a;II)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lid2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lid2/f;->G:Ljava/lang/Object;

    iput p2, p0, Lid2/f;->x:I

    iput-boolean p3, p0, Lid2/f;->y:Z

    iput-object p4, p0, Lid2/f;->z:Lc93/a;

    iput-object p5, p0, Lid2/f;->H:Ljava/lang/Object;

    iput p6, p0, Lid2/f;->E:I

    iput p7, p0, Lid2/f;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lid2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lid2/f;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lmq2/b;

    iget-object v0, p0, Lid2/f;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/m;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v2, p0, Lid2/f;->y:Z

    iget v3, p0, Lid2/f;->x:I

    iget-object v4, p0, Lid2/f;->z:Lc93/a;

    iget v6, p0, Lid2/f;->E:I

    iget v7, p0, Lid2/f;->F:I

    invoke-static/range {v1 .. v9}, Lmq2/g;->b(Lmq2/b;ZILc93/a;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lid2/f;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lqt0/b;

    iget-object v0, p0, Lid2/f;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Lid2/f;->x:I

    iget-boolean v3, p0, Lid2/f;->y:Z

    iget-object v4, p0, Lid2/f;->z:Lc93/a;

    iget v6, p0, Lid2/f;->E:I

    iget v7, p0, Lid2/f;->F:I

    invoke-static/range {v1 .. v9}, Lm22/j;->b(Lqt0/b;IZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lid2/f;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lid2/f;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/Modifier;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lid2/f;->x:I

    iget-boolean v3, p0, Lid2/f;->y:Z

    iget-object v4, p0, Lid2/f;->z:Lc93/a;

    iget v6, p0, Lid2/f;->E:I

    iget v7, p0, Lid2/f;->F:I

    invoke-static/range {v1 .. v9}, Lid2/g;->c(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
