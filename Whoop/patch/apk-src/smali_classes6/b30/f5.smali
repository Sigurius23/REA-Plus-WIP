.class public final synthetic Lb30/f5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lec3/f2;ZIII)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    iput p5, p0, Lb30/f5;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/f5;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/f5;->x:Z

    iput p3, p0, Lb30/f5;->y:I

    iput p4, p0, Lb30/f5;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZIII)V
    .locals 0

    .line 2
    iput p5, p0, Lb30/f5;->w:I

    iput-object p1, p0, Lb30/f5;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/f5;->x:Z

    iput p3, p0, Lb30/f5;->y:I

    iput p4, p0, Lb30/f5;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lb30/f5;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/f5;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lb30/f5;->x:Z

    iget v3, p0, Lb30/f5;->y:I

    iget v4, p0, Lb30/f5;->z:I

    invoke-static/range {v1 .. v6}, Lvy0/p;->F(Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/f5;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp81/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lb30/f5;->x:Z

    iget v3, p0, Lb30/f5;->y:I

    iget v4, p0, Lb30/f5;->z:I

    invoke-static/range {v1 .. v6}, Lp81/b;->a(Lp81/c;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/f5;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf11/e;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lb30/f5;->x:Z

    iget v3, p0, Lb30/f5;->y:I

    iget v4, p0, Lb30/f5;->z:I

    invoke-static/range {v1 .. v6}, Lf11/d;->d(Lf11/e;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb30/f5;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lec3/f2;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v2, p0, Lb30/f5;->x:Z

    iget v3, p0, Lb30/f5;->y:I

    iget v4, p0, Lb30/f5;->z:I

    invoke-static/range {v1 .. v6}, Lb30/o5;->b(Lec3/f2;ZIILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
