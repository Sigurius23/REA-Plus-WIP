.class public final synthetic Lg1/y8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lx1/b;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Enum;

.field public final synthetic H:Lkotlin/jvm/functions/Function3;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Enum;JJLkotlin/jvm/functions/Function3;ZLx1/b;II)V
    .locals 0

    iput p11, p0, Lg1/y8;->w:I

    iput-object p1, p0, Lg1/y8;->F:Ljava/lang/Object;

    iput-object p2, p0, Lg1/y8;->G:Ljava/lang/Enum;

    iput-wide p3, p0, Lg1/y8;->x:J

    iput-wide p5, p0, Lg1/y8;->y:J

    iput-object p7, p0, Lg1/y8;->H:Lkotlin/jvm/functions/Function3;

    iput-boolean p8, p0, Lg1/y8;->z:Z

    iput-object p9, p0, Lg1/y8;->E:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lg1/y8;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/y8;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li40/n;

    iget-object v0, p0, Lg1/y8;->G:Ljava/lang/Enum;

    move-object v2, v0

    check-cast v2, Li40/i;

    iget-object v0, p0, Lg1/y8;->H:Lkotlin/jvm/functions/Function3;

    move-object v7, v0

    check-cast v7, Lg1/h8;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0x1b0001

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-wide v3, p0, Lg1/y8;->x:J

    iget-wide v5, p0, Lg1/y8;->y:J

    iget-boolean v8, p0, Lg1/y8;->z:Z

    iget-object v9, p0, Lg1/y8;->E:Lx1/b;

    invoke-virtual/range {v1 .. v11}, Li40/n;->a(Li40/i;JJLg1/h8;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/y8;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg1/a9;

    iget-object v0, p0, Lg1/y8;->G:Ljava/lang/Enum;

    move-object v2, v0

    check-cast v2, Lg1/g3;

    iget-object v0, p0, Lg1/y8;->H:Lkotlin/jvm/functions/Function3;

    move-object v7, v0

    check-cast v7, Lg1/h8;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const p1, 0x1b0001

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-wide v3, p0, Lg1/y8;->x:J

    iget-wide v5, p0, Lg1/y8;->y:J

    iget-boolean v8, p0, Lg1/y8;->z:Z

    iget-object v9, p0, Lg1/y8;->E:Lx1/b;

    invoke-virtual/range {v1 .. v11}, Lg1/a9;->a(Lg1/g3;JJLg1/h8;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
