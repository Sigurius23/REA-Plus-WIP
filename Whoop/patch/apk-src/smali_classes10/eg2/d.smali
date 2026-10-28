.class public final synthetic Leg2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Leg2/k;ZZZLc93/a;III)V
    .locals 0

    .line 1
    iput p8, p0, Leg2/d;->w:I

    iput-object p1, p0, Leg2/d;->x:Ljava/lang/Object;

    iput-boolean p2, p0, Leg2/d;->y:Z

    iput-boolean p3, p0, Leg2/d;->z:Z

    iput-boolean p4, p0, Leg2/d;->E:Z

    iput-object p5, p0, Leg2/d;->F:Ljava/lang/Object;

    iput p6, p0, Leg2/d;->G:I

    iput p7, p0, Leg2/d;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll0/s1;Lq21/d;ZZZII)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Leg2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leg2/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Leg2/d;->F:Ljava/lang/Object;

    iput-boolean p3, p0, Leg2/d;->y:Z

    iput-boolean p4, p0, Leg2/d;->z:Z

    iput-boolean p5, p0, Leg2/d;->E:Z

    iput p6, p0, Leg2/d;->G:I

    iput p7, p0, Leg2/d;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Leg2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leg2/d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/s1;

    iget-object v0, p0, Leg2/d;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lq21/d;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v3, p0, Leg2/d;->y:Z

    iget-boolean v4, p0, Leg2/d;->z:Z

    iget-boolean v5, p0, Leg2/d;->E:Z

    iget v6, p0, Leg2/d;->G:I

    iget v7, p0, Leg2/d;->H:I

    invoke-static/range {v1 .. v9}, Lq21/c;->g(Ll0/s1;Lq21/d;ZZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Leg2/d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leg2/k;

    iget-object v0, p0, Leg2/d;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v2, p0, Leg2/d;->y:Z

    iget-boolean v3, p0, Leg2/d;->z:Z

    iget-boolean v4, p0, Leg2/d;->E:Z

    iget v6, p0, Leg2/d;->G:I

    iget v7, p0, Leg2/d;->H:I

    invoke-static/range {v1 .. v9}, Leg2/e;->b(Leg2/k;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Leg2/d;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Leg2/k;

    iget-object v0, p0, Leg2/d;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-boolean v2, p0, Leg2/d;->y:Z

    iget-boolean v3, p0, Leg2/d;->z:Z

    iget-boolean v4, p0, Leg2/d;->E:Z

    iget v6, p0, Leg2/d;->G:I

    iget v7, p0, Leg2/d;->H:I

    invoke-static/range {v1 .. v9}, Leg2/e;->e(Leg2/k;ZZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
