.class public final synthetic Lb81/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lt0/i;JLb81/j;Lc93/a;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb81/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb81/h;->z:Ljava/lang/Object;

    iput-wide p2, p0, Lb81/h;->x:J

    iput-object p4, p0, Lb81/h;->E:Ljava/lang/Object;

    iput-object p5, p0, Lb81/h;->F:Ll83/e;

    iput-wide p6, p0, Lb81/h;->y:J

    return-void
.end method

.method public synthetic constructor <init>(Ly71/d;Lj0/i;Lkotlin/jvm/functions/Function1;JJ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb81/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb81/h;->z:Ljava/lang/Object;

    iput-object p2, p0, Lb81/h;->E:Ljava/lang/Object;

    iput-object p3, p0, Lb81/h;->F:Ll83/e;

    iput-wide p4, p0, Lb81/h;->x:J

    iput-wide p6, p0, Lb81/h;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lb81/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb81/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly71/d;

    iget-object v0, p0, Lb81/h;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj0/i;

    iget-object v0, p0, Lb81/h;->F:Ll83/e;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v4, p0, Lb81/h;->x:J

    iget-wide v6, p0, Lb81/h;->y:J

    invoke-static/range {v1 .. v9}, Ly71/c;->a(Ly71/d;Lj0/i;Lkotlin/jvm/functions/Function1;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb81/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt0/i;

    iget-object v0, p0, Lb81/h;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lb81/j;

    iget-object v0, p0, Lb81/h;->F:Ll83/e;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v2, p0, Lb81/h;->x:J

    iget-wide v6, p0, Lb81/h;->y:J

    invoke-static/range {v1 .. v9}, Lb81/i;->a(Lt0/i;JLb81/j;Lc93/a;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
