.class public final synthetic Lg1/a7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lg1/a7;->w:I

    iput-object p1, p0, Lg1/a7;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg1/a7;->w:I

    const/4 v1, 0x0

    iget-object v2, p0, Lg1/a7;->x:Lkotlin/jvm/functions/Function1;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    const-string v0, "sysProp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "envVar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljf/a;

    invoke-direct {v0, v2, p1, p2, v1}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lg1/b2;

    check-cast p2, Lg1/b2;

    sget v0, Lg1/c7;->a:I

    if-ne p1, p2, :cond_0

    sget-object v0, Lg1/b2;->w:Lg1/b2;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne p1, p2, :cond_1

    sget-object v0, Lg1/b2;->x:Lg1/b2;

    if-ne p1, v0, :cond_1

    sget-object v1, Lg1/z1;->w:Lg1/z1;

    goto :goto_0

    :cond_1
    if-ne p1, p2, :cond_2

    sget-object v0, Lg1/b2;->y:Lg1/b2;

    if-ne p1, v0, :cond_2

    sget-object v1, Lg1/z1;->x:Lg1/z1;

    goto :goto_0

    :cond_2
    sget-object v0, Lg1/b2;->w:Lg1/b2;

    if-ne p1, v0, :cond_3

    sget-object v3, Lg1/b2;->x:Lg1/b2;

    if-ne p2, v3, :cond_3

    sget-object v1, Lg1/z1;->w:Lg1/z1;

    goto :goto_0

    :cond_3
    if-ne p1, v0, :cond_4

    sget-object v3, Lg1/b2;->y:Lg1/b2;

    if-ne p2, v3, :cond_4

    sget-object v1, Lg1/z1;->x:Lg1/z1;

    goto :goto_0

    :cond_4
    sget-object v3, Lg1/b2;->x:Lg1/b2;

    if-ne p1, v3, :cond_5

    if-ne p2, v0, :cond_5

    sget-object v1, Lg1/z1;->w:Lg1/z1;

    goto :goto_0

    :cond_5
    sget-object v3, Lg1/b2;->y:Lg1/b2;

    if-ne p1, v3, :cond_6

    if-ne p2, v0, :cond_6

    sget-object v1, Lg1/z1;->x:Lg1/z1;

    :cond_6
    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg1/g9;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
