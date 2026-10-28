.class public final synthetic Lbu2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FJLjava/lang/Object;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 1
    iput p8, p0, Lbu2/s;->w:I

    iput p1, p0, Lbu2/s;->y:F

    iput-wide p2, p0, Lbu2/s;->E:J

    iput-object p4, p0, Lbu2/s;->G:Ljava/lang/Object;

    iput-object p5, p0, Lbu2/s;->x:Landroidx/compose/ui/Modifier;

    iput p6, p0, Lbu2/s;->z:I

    iput p7, p0, Lbu2/s;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;FIJI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lbu2/s;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu2/s;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lbu2/s;->G:Ljava/lang/Object;

    iput p3, p0, Lbu2/s;->y:F

    iput p4, p0, Lbu2/s;->z:I

    iput-wide p5, p0, Lbu2/s;->E:J

    iput p7, p0, Lbu2/s;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lbu2/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbu2/s;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Li2/a1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lbu2/s;->y:F

    iget-wide v2, p0, Lbu2/s;->E:J

    iget-object v5, p0, Lbu2/s;->x:Landroidx/compose/ui/Modifier;

    iget v6, p0, Lbu2/s;->z:I

    iget v7, p0, Lbu2/s;->F:I

    invoke-static/range {v1 .. v9}, Lqk2/b;->d(FJLi2/a1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbu2/s;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lbu2/s;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lbu2/s;->y:F

    iget v4, p0, Lbu2/s;->z:I

    iget-wide v5, p0, Lbu2/s;->E:J

    iget v7, p0, Lbu2/s;->F:I

    invoke-static/range {v1 .. v9}, Lc81/d;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;FIJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbu2/s;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lbu2/s;->y:F

    iget-wide v2, p0, Lbu2/s;->E:J

    iget-object v5, p0, Lbu2/s;->x:Landroidx/compose/ui/Modifier;

    iget v6, p0, Lbu2/s;->z:I

    iget v7, p0, Lbu2/s;->F:I

    invoke-static/range {v1 .. v9}, Lbu2/x;->e(FJLc93/m;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
