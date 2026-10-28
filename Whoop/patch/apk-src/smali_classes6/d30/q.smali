.class public final synthetic Ld30/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh20/g;


# direct methods
.method public synthetic constructor <init>(Lh20/g;I)V
    .locals 0

    iput p2, p0, Ld30/q;->w:I

    iput-object p1, p0, Ld30/q;->x:Lh20/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ld30/q;->w:I

    check-cast p1, Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-object v1, p0, Ld30/q;->x:Lh20/g;

    invoke-virtual {v1, p1}, Lh20/g;->c(Ljava/lang/String;)Lh20/v;

    move-result-object p1

    sget-object v1, Lh20/t;->b:Lh20/t;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld30/q;->x:Lh20/g;

    invoke-virtual {v0, p1}, Lh20/g;->c(Ljava/lang/String;)Lh20/v;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
