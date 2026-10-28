.class public final synthetic Lcp0/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    iput p2, p0, Lcp0/i1;->w:I

    iput-boolean p1, p0, Lcp0/i1;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcp0/i1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm91/u;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-boolean v0, p0, Lcp0/i1;->x:Z

    invoke-static {v0, p1, p2, p3}, Lw01/g;->b(ZLm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/s1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-boolean v0, p0, Lcp0/i1;->x:Z

    invoke-static {v0, p1, p2, p3}, Lnw0/g;->n(ZLl0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ll0/s1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-boolean v0, p0, Lcp0/i1;->x:Z

    invoke-static {v0, p1, p2, p3}, Lnw0/g;->d(ZLl0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ly01/c;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-boolean v0, p0, Lcp0/i1;->x:Z

    invoke-static {v0, p1, p2, p3}, Liw0/x;->Y(ZLy01/c;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget-boolean v0, p0, Lcp0/i1;->x:Z

    invoke-static {v0, p1, p2, p3}, Lcp0/m1;->e(ZLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
