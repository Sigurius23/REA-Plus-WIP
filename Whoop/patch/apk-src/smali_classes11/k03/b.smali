.class public final synthetic Lk03/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:I

.field public final synthetic G:J

.field public final synthetic H:Z

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(FIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput p3, p0, Lk03/b;->w:I

    iput p1, p0, Lk03/b;->x:F

    iput-object p6, p0, Lk03/b;->y:Ljava/lang/String;

    iput-object p7, p0, Lk03/b;->z:Ljava/lang/String;

    iput-object p8, p0, Lk03/b;->E:Ljava/lang/String;

    iput p2, p0, Lk03/b;->F:I

    iput-wide p4, p0, Lk03/b;->G:J

    iput-boolean p9, p0, Lk03/b;->H:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lk03/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v1, p0, Lk03/b;->x:F

    iget-object v2, p0, Lk03/b;->y:Ljava/lang/String;

    iget-object v3, p0, Lk03/b;->z:Ljava/lang/String;

    iget-object v4, p0, Lk03/b;->E:Ljava/lang/String;

    iget v5, p0, Lk03/b;->F:I

    iget-wide v6, p0, Lk03/b;->G:J

    iget-boolean v8, p0, Lk03/b;->H:Z

    invoke-static/range {v1 .. v10}, Lk03/c;->t(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v0, p0, Lk03/b;->x:F

    iget-object v1, p0, Lk03/b;->y:Ljava/lang/String;

    iget-object v2, p0, Lk03/b;->z:Ljava/lang/String;

    iget-object v3, p0, Lk03/b;->E:Ljava/lang/String;

    iget v4, p0, Lk03/b;->F:I

    iget-wide v5, p0, Lk03/b;->G:J

    iget-boolean v7, p0, Lk03/b;->H:Z

    invoke-static/range {v0 .. v9}, Lk03/c;->u(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
