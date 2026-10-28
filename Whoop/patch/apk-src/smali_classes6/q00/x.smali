.class public final synthetic Lq00/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;FZLc93/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lq00/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/x;->y:Ljava/lang/String;

    iput-object p2, p0, Lq00/x;->G:Ljava/lang/Object;

    iput p3, p0, Lq00/x;->z:F

    iput-boolean p4, p0, Lq00/x;->x:Z

    iput-object p5, p0, Lq00/x;->E:Lc93/a;

    iput p6, p0, Lq00/x;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ly00/c0;ZLjava/lang/String;FLc93/a;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lq00/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/x;->G:Ljava/lang/Object;

    iput-boolean p2, p0, Lq00/x;->x:Z

    iput-object p3, p0, Lq00/x;->y:Ljava/lang/String;

    iput p4, p0, Lq00/x;->z:F

    iput-object p5, p0, Lq00/x;->E:Lc93/a;

    iput p6, p0, Lq00/x;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lq00/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq00/x;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly00/c0;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lq00/x;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-boolean v2, p0, Lq00/x;->x:Z

    iget-object v3, p0, Lq00/x;->y:Ljava/lang/String;

    iget v4, p0, Lq00/x;->z:F

    iget-object v5, p0, Lq00/x;->E:Lc93/a;

    invoke-static/range {v1 .. v7}, Lse/h;->f(Ly00/c0;ZLjava/lang/String;FLc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lq00/x;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lq00/x;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v1, p0, Lq00/x;->y:Ljava/lang/String;

    iget v3, p0, Lq00/x;->z:F

    iget-boolean v4, p0, Lq00/x;->x:Z

    iget-object v5, p0, Lq00/x;->E:Lc93/a;

    invoke-static/range {v1 .. v7}, Lse/h;->g(Ljava/lang/String;Ljava/lang/String;FZLc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
