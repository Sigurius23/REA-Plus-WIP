.class public final synthetic Lhy0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JFI)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lhy0/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/x;->E:Ljava/lang/Object;

    iput-wide p2, p0, Lhy0/x;->y:J

    iput p4, p0, Lhy0/x;->x:F

    iput p5, p0, Lhy0/x;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Lgz0/m0;FJI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lhy0/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/x;->E:Ljava/lang/Object;

    iput p2, p0, Lhy0/x;->x:F

    iput-wide p3, p0, Lhy0/x;->y:J

    iput p5, p0, Lhy0/x;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lhy0/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhy0/x;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgz0/m0;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lhy0/x;->x:F

    iget-wide v3, p0, Lhy0/x;->y:J

    iget v5, p0, Lhy0/x;->z:I

    invoke-static/range {v1 .. v7}, Lj50/c;->d(Lgz0/m0;FJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhy0/x;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v2, p0, Lhy0/x;->y:J

    iget v4, p0, Lhy0/x;->x:F

    iget v5, p0, Lhy0/x;->z:I

    invoke-static/range {v1 .. v7}, Lhy0/y;->a(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
