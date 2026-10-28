.class public final synthetic Lk71/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    iput p2, p0, Lk71/f;->w:I

    iput p1, p0, Lk71/f;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lk71/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lb3/l2;

    const-string v0, "padding"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    new-instance v0, Ly3/f;

    iget v1, p0, Lk71/f;->x:F

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    invoke-virtual {p1, v0}, Lb3/l2;->d(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget v0, p0, Lk71/f;->x:F

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Lk71/j;->m(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
