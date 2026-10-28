.class public final synthetic Lbs1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:I

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(IZLjava/lang/String;Lc93/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lbs1/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lbs1/x;->y:I

    iput-boolean p2, p0, Lbs1/x;->z:Z

    iput-object p3, p0, Lbs1/x;->x:Ljava/lang/String;

    iput-object p4, p0, Lbs1/x;->E:Lc93/a;

    iput p5, p0, Lbs1/x;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IZLc93/a;II)V
    .locals 0

    .line 2
    iput p6, p0, Lbs1/x;->w:I

    iput-object p1, p0, Lbs1/x;->x:Ljava/lang/String;

    iput p2, p0, Lbs1/x;->y:I

    iput-boolean p3, p0, Lbs1/x;->z:Z

    iput-object p4, p0, Lbs1/x;->E:Lc93/a;

    iput p5, p0, Lbs1/x;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZILjava/lang/String;Lc93/a;I)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lbs1/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbs1/x;->z:Z

    iput p2, p0, Lbs1/x;->y:I

    iput-object p3, p0, Lbs1/x;->x:Ljava/lang/String;

    iput-object p4, p0, Lbs1/x;->E:Lc93/a;

    iput p5, p0, Lbs1/x;->F:I

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Lc93/a;II)V
    .locals 1

    .line 4
    const/4 v0, 0x0

    iput v0, p0, Lbs1/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbs1/x;->z:Z

    iput-object p2, p0, Lbs1/x;->x:Ljava/lang/String;

    iput-object p3, p0, Lbs1/x;->E:Lc93/a;

    iput p4, p0, Lbs1/x;->y:I

    iput p5, p0, Lbs1/x;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lbs1/x;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lbs1/x;->y:I

    iget-boolean v2, p0, Lbs1/x;->z:Z

    iget-object v3, p0, Lbs1/x;->x:Ljava/lang/String;

    iget-object v4, p0, Lbs1/x;->E:Lc93/a;

    iget v5, p0, Lbs1/x;->F:I

    invoke-static/range {v1 .. v7}, Lwr0/s;->a(IZLjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Lbs1/x;->y:I

    iget-boolean v1, p0, Lbs1/x;->z:Z

    iget-object v2, p0, Lbs1/x;->x:Ljava/lang/String;

    iget-object v3, p0, Lbs1/x;->E:Lc93/a;

    iget v4, p0, Lbs1/x;->F:I

    invoke-static/range {v0 .. v6}, Lsl0/g3;->o(IZLjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Lbs1/x;->y:I

    iget-boolean v1, p0, Lbs1/x;->z:Z

    iget-object v2, p0, Lbs1/x;->x:Ljava/lang/String;

    iget-object v3, p0, Lbs1/x;->E:Lc93/a;

    iget v4, p0, Lbs1/x;->F:I

    invoke-static/range {v0 .. v6}, Lih0/e0;->j(IZLjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Lbs1/x;->y:I

    iget-boolean v1, p0, Lbs1/x;->z:Z

    iget-object v2, p0, Lbs1/x;->x:Ljava/lang/String;

    iget-object v3, p0, Lbs1/x;->E:Lc93/a;

    iget v4, p0, Lbs1/x;->F:I

    invoke-static/range {v0 .. v6}, Lcom/whoop/settings/h;->g(IZLjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Lbs1/x;->y:I

    iget-boolean v1, p0, Lbs1/x;->z:Z

    iget-object v2, p0, Lbs1/x;->x:Ljava/lang/String;

    iget-object v3, p0, Lbs1/x;->E:Lc93/a;

    iget v4, p0, Lbs1/x;->F:I

    invoke-static/range {v0 .. v6}, Lbs1/c0;->v0(IZLjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
