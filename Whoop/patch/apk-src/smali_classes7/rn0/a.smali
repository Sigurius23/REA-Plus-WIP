.class public final synthetic Lrn0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf0/r1;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lf0/r1;FFI)V
    .locals 0

    iput p4, p0, Lrn0/a;->w:I

    iput-object p1, p0, Lrn0/a;->x:Lf0/r1;

    iput p2, p0, Lrn0/a;->y:F

    iput p3, p0, Lrn0/a;->z:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lrn0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lrn0/a;->z:F

    check-cast p1, Li2/g0;

    iget-object v1, p0, Lrn0/a;->x:Lf0/r1;

    iget v2, p0, Lrn0/a;->y:F

    invoke-static {v1, v2, v0, p1}, Lue1/b;->a(Lf0/r1;FFLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lrn0/a;->z:F

    check-cast p1, Li2/g0;

    iget-object v1, p0, Lrn0/a;->x:Lf0/r1;

    iget v2, p0, Lrn0/a;->y:F

    invoke-static {v1, v2, v0, p1}, Lrn0/b;->a(Lf0/r1;FFLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
