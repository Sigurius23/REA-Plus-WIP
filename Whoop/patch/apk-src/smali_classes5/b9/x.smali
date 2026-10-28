.class public final synthetic Lb9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;
.implements Lom/a;
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lev/i;Lgm/i;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb9/x;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/x;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb9/x;->z:Ljava/lang/Object;

    iput p3, p0, Lb9/x;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lb9/x;->w:I

    iput p2, p0, Lb9/x;->x:I

    iput-object p1, p0, Lb9/x;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb9/x;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lb9/x;->y:Ljava/lang/Object;

    check-cast v0, Lev/i;

    iget-object v1, p0, Lb9/x;->z:Ljava/lang/Object;

    check-cast v1, Lgm/i;

    iget-object v0, v0, Lev/i;->d:Ljava/lang/Object;

    check-cast v0, Lgm/r;

    iget v2, p0, Lb9/x;->x:I

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lgm/r;->O(Lgm/i;IZ)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lb9/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/x;->y:Ljava/lang/Object;

    check-cast v0, Lrm/a1;

    iget-object v1, p0, Lb9/x;->z:Ljava/lang/Object;

    check-cast v1, Lrm/a1;

    check-cast p1, Lrm/z0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lb9/x;->x:I

    invoke-interface {p1, v0, v1, v2}, Lrm/z0;->p(Lrm/a1;Lrm/a1;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/x;->y:Ljava/lang/Object;

    check-cast v0, Lu8/i0;

    iget-object v1, p0, Lb9/x;->z:Ljava/lang/Object;

    check-cast v1, Lu8/i0;

    check-cast p1, Lu8/h0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lb9/x;->x:I

    invoke-interface {p1, v0, v1, v2}, Lu8/h0;->onPositionDiscontinuity(Lu8/i0;Lu8/i0;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
