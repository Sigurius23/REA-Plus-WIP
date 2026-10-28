.class public final Ly2/n;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:[Ly2/o;


# direct methods
.method public synthetic constructor <init>([Ly2/o;I)V
    .locals 0

    iput p2, p0, Ly2/n;->w:I

    iput-object p1, p0, Ly2/n;->x:[Ly2/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ly2/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly2/i1;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    const/4 v0, 0x0

    iget-object v1, p0, Ly2/n;->x:[Ly2/o;

    invoke-static {p1, v0, v1, p2}, Ls4/g;->b(Ly2/i1;Z[Ly2/o;F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/i1;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    const/4 v0, 0x1

    iget-object v1, p0, Ly2/n;->x:[Ly2/o;

    invoke-static {p1, v0, v1, p2}, Ls4/g;->b(Ly2/i1;Z[Ly2/o;F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
