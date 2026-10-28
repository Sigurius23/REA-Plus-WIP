.class public final synthetic Lhy0/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lhy0/z0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/z0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lhy0/z0;->E:Ljava/lang/Object;

    iput-wide p3, p0, Lhy0/z0;->x:J

    iput-wide p5, p0, Lhy0/z0;->y:J

    return-void
.end method

.method public synthetic constructor <init>(Ly71/o;JLy71/l$a;J)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lhy0/z0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/z0;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lhy0/z0;->x:J

    iput-object p4, p0, Lhy0/z0;->E:Ljava/lang/Object;

    iput-wide p5, p0, Lhy0/z0;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lhy0/z0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhy0/z0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly71/o;

    iget-object v0, p0, Lhy0/z0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ly71/l$a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v2, p0, Lhy0/z0;->x:J

    iget-wide v5, p0, Lhy0/z0;->y:J

    invoke-static/range {v1 .. v8}, Ly71/f;->c(Ly71/o;JLy71/l$a;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhy0/z0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lhy0/z0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v3, p0, Lhy0/z0;->x:J

    iget-wide v5, p0, Lhy0/z0;->y:J

    invoke-static/range {v1 .. v8}, Lhy0/a1;->b(Ljava/lang/String;Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
