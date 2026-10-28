.class public final synthetic Ll1/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll1/w3;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ll1/w3;Lc93/a;I)V
    .locals 0

    iput p3, p0, Ll1/j2;->w:I

    iput-object p1, p0, Ll1/j2;->x:Ll1/w3;

    iput-object p2, p0, Ll1/j2;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll1/j2;->w:I

    check-cast p1, Ljava/lang/Throwable;

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Ll1/j2;->x:Ll1/w3;

    invoke-virtual {p1}, Ll1/w3;->e()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll1/j2;->y:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object p1, p0, Ll1/j2;->x:Ll1/w3;

    invoke-virtual {p1}, Ll1/w3;->e()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ll1/j2;->y:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
