.class public final Lui/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lui/i;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lui/i;II)V
    .locals 0

    iput p3, p0, Lui/f;->w:I

    iput-object p1, p0, Lui/f;->x:Lui/i;

    iput p2, p0, Lui/f;->y:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lui/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lui/f;->x:Lui/i;

    iget v2, p0, Lui/f;->y:I

    invoke-static {p1, v2, v0, v1}, Lui/i;->a(Lui/i;IJ)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lui/f;->x:Lui/i;

    iget v2, p0, Lui/f;->y:I

    invoke-static {p1, v2, v0, v1}, Lui/i;->a(Lui/i;IJ)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
