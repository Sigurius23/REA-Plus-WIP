.class public final synthetic Lk03/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:I

.field public final synthetic G:J

.field public final synthetic H:Z

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZII)V
    .locals 0

    iput p10, p0, Lk03/h;->w:I

    iput p1, p0, Lk03/h;->x:F

    iput-object p2, p0, Lk03/h;->y:Ljava/lang/String;

    iput-object p3, p0, Lk03/h;->z:Ljava/lang/String;

    iput-object p4, p0, Lk03/h;->E:Ljava/lang/String;

    iput p5, p0, Lk03/h;->F:I

    iput-wide p6, p0, Lk03/h;->G:J

    iput-boolean p8, p0, Lk03/h;->H:Z

    iput p9, p0, Lk03/h;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lk03/h;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v1, p0, Lk03/h;->x:F

    iget-object v2, p0, Lk03/h;->y:Ljava/lang/String;

    iget-object v3, p0, Lk03/h;->z:Ljava/lang/String;

    iget-object v4, p0, Lk03/h;->E:Ljava/lang/String;

    iget v5, p0, Lk03/h;->F:I

    iget-wide v6, p0, Lk03/h;->G:J

    iget-boolean v8, p0, Lk03/h;->H:Z

    iget v9, p0, Lk03/h;->I:I

    invoke-static/range {v1 .. v11}, Lk03/n;->i(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v0, p0, Lk03/h;->x:F

    iget-object v1, p0, Lk03/h;->y:Ljava/lang/String;

    iget-object v2, p0, Lk03/h;->z:Ljava/lang/String;

    iget-object v3, p0, Lk03/h;->E:Ljava/lang/String;

    iget v4, p0, Lk03/h;->F:I

    iget-wide v5, p0, Lk03/h;->G:J

    iget-boolean v7, p0, Lk03/h;->H:Z

    iget v8, p0, Lk03/h;->I:I

    invoke-static/range {v0 .. v10}, Lk03/n;->c(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v0, p0, Lk03/h;->x:F

    iget-object v1, p0, Lk03/h;->y:Ljava/lang/String;

    iget-object v2, p0, Lk03/h;->z:Ljava/lang/String;

    iget-object v3, p0, Lk03/h;->E:Ljava/lang/String;

    iget v4, p0, Lk03/h;->F:I

    iget-wide v5, p0, Lk03/h;->G:J

    iget-boolean v7, p0, Lk03/h;->H:Z

    iget v8, p0, Lk03/h;->I:I

    invoke-static/range {v0 .. v10}, Lk03/n;->h(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
