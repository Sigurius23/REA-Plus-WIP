.class public final synthetic Lg40/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lg40/r0;ZLandroidx/compose/ui/Modifier;ZI)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lg40/s0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/s0;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lg40/s0;->x:Z

    iput-object p3, p0, Lg40/s0;->F:Ljava/lang/Object;

    iput-boolean p4, p0, Lg40/s0;->y:Z

    iput p5, p0, Lg40/s0;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZZLjava/lang/Object;II)V
    .locals 0

    .line 2
    iput p6, p0, Lg40/s0;->w:I

    iput-object p1, p0, Lg40/s0;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lg40/s0;->x:Z

    iput-boolean p3, p0, Lg40/s0;->y:Z

    iput-object p4, p0, Lg40/s0;->F:Ljava/lang/Object;

    iput p5, p0, Lg40/s0;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lg40/s0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/s0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lg40/s0;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lg40/s0;->x:Z

    iget-boolean v3, p0, Lg40/s0;->y:Z

    iget v5, p0, Lg40/s0;->z:I

    invoke-static/range {v1 .. v7}, Lyq2/a;->a(Ljava/lang/String;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg40/s0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lft0/b;

    iget-object v0, p0, Lg40/s0;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lg40/s0;->x:Z

    iget-boolean v3, p0, Lg40/s0;->y:Z

    iget v5, p0, Lg40/s0;->z:I

    invoke-static/range {v1 .. v7}, Lvx0/c;->g(Lft0/b;ZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lg40/s0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg40/r0;

    iget-object v0, p0, Lg40/s0;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg40/s0;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v2, p0, Lg40/s0;->x:Z

    iget-boolean v4, p0, Lg40/s0;->y:Z

    invoke-static/range {v1 .. v6}, Lg40/y0;->a(Lg40/r0;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
