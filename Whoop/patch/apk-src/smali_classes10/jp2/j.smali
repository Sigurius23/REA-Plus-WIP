.class public final synthetic Ljp2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljp2/o;

.field public final synthetic y:Lg2/i;


# direct methods
.method public synthetic constructor <init>(Ljp2/o;Lg2/i;I)V
    .locals 0

    iput p3, p0, Ljp2/j;->w:I

    iput-object p1, p0, Ljp2/j;->x:Ljp2/o;

    iput-object p2, p0, Ljp2/j;->y:Lg2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljp2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljp2/j;->y:Lg2/i;

    check-cast p1, Lu0/p0;

    iget-object v1, p0, Ljp2/j;->x:Ljp2/o;

    invoke-static {v1, v0, p1}, Ljp2/n;->c(Ljp2/o;Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljp2/j;->y:Lg2/i;

    check-cast p1, Lu0/p0;

    iget-object v1, p0, Ljp2/j;->x:Ljp2/o;

    invoke-static {v1, v0, p1}, Ljp2/n;->h(Ljp2/o;Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
