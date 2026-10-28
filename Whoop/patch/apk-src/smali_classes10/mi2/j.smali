.class public final synthetic Lmi2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly2/j1;

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(Ly2/j1;FI)V
    .locals 0

    iput p3, p0, Lmi2/j;->w:I

    iput-object p1, p0, Lmi2/j;->x:Ly2/j1;

    iput p2, p0, Lmi2/j;->y:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lmi2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lmi2/j;->y:F

    check-cast p1, Ly2/i1;

    iget-object v1, p0, Lmi2/j;->x:Ly2/j1;

    invoke-static {v1, v0, p1}, Lsj1/a;->b(Ly2/j1;FLy2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lmi2/j;->y:F

    check-cast p1, Ly2/i1;

    iget-object v1, p0, Lmi2/j;->x:Ly2/j1;

    invoke-static {v1, v0, p1}, Lmi2/l;->j(Ly2/j1;FLy2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
