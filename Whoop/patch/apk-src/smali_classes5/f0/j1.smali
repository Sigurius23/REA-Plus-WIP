.class public final synthetic Lf0/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:F

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLi93/f;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lf0/j1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf0/j1;->y:F

    iput-object p2, p0, Lf0/j1;->z:Ljava/lang/Object;

    iput p3, p0, Lf0/j1;->x:I

    return-void
.end method

.method public synthetic constructor <init>(FLjava/util/List;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lf0/j1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lf0/j1;->x:I

    iput p1, p0, Lf0/j1;->y:F

    iput-object p2, p0, Lf0/j1;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lf0/j1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf0/j1;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Ln0/q;

    iget v1, p0, Lf0/j1;->x:I

    iget v2, p0, Lf0/j1;->y:F

    invoke-static {v1, v2, v0, p1}, Lxq2/c1;->n(IFLjava/util/List;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf0/j1;->z:Ljava/lang/Object;

    check-cast v0, Li93/f;

    check-cast p1, Li3/z;

    new-instance v1, Li3/h;

    iget v2, p0, Lf0/j1;->y:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v2, v0}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget v3, p0, Lf0/j1;->x:I

    invoke-direct {v1, v2, v0, v3}, Li3/h;-><init>(FLi93/f;I)V

    invoke-static {p1, v1}, Li3/w;->h(Li3/z;Li3/h;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
