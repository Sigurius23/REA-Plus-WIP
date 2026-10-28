.class public final Lnj/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/graphics/Rect;


# direct methods
.method public synthetic constructor <init>(ILandroid/graphics/Rect;)V
    .locals 0

    iput p1, p0, Lnj/b;->w:I

    iput-object p2, p0, Lnj/b;->x:Landroid/graphics/Rect;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnj/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lvj/b;

    const-string v0, "$this$withDensity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnj/b;->x:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Lvj/b;->b(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lvj/b;

    const-string v0, "$this$withDensity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnj/b;->x:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Lvj/b;->b(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
