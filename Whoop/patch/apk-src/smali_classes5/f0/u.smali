.class public final synthetic Lf0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/b0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/b0;I)V
    .locals 0

    iput p2, p0, Lf0/u;->w:I

    iput-object p1, p0, Lf0/u;->x:Lkotlin/jvm/internal/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lf0/u;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lf1/r;

    iget-object p1, p1, Lf1/r;->f:Ll3/r0;

    iget-object p1, p1, Ll3/r0;->a:Ll3/q0;

    iget-object p1, p1, Ll3/q0;->a:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    iget-object v0, p0, Lf0/u;->x:Lkotlin/jvm/internal/b0;

    iput-boolean p1, v0, Lkotlin/jvm/internal/b0;->w:Z

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, La3/p2;

    iget-object v0, p0, Lf0/u;->x:Lkotlin/jvm/internal/b0;

    iget-boolean v1, v0, Lkotlin/jvm/internal/b0;->w:Z

    const/4 v2, 0x1

    if-nez v1, :cond_2

    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lh0/l2;

    iget-boolean p1, p1, Lh0/l2;->O:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move p1, v2

    :goto_1
    iput-boolean p1, v0, Lkotlin/jvm/internal/b0;->w:Z

    xor-int/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
