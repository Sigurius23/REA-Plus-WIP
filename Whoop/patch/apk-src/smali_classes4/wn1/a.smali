.class public final synthetic Lwn1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    iput p2, p0, Lwn1/a;->w:I

    iput p1, p0, Lwn1/a;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwn1/a;->w:I

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lwn1/a;->x:F

    invoke-static {v0, p1, p2, p3}, Lwn1/d;->a(FLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lwn1/a;->x:F

    invoke-static {v0, p1, p2, p3}, Lwn1/c;->b(FLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
