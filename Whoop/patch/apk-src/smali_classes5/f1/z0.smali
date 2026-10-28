.class public final synthetic Lf1/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ILc93/a;Lc93/a;)V
    .locals 0

    iput p1, p0, Lf1/z0;->w:I

    iput-object p2, p0, Lf1/z0;->x:Lc93/a;

    iput-object p3, p0, Lf1/z0;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/z0;->w:I

    check-cast p1, Lx0/g;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/z0;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object v0, p0, Lf1/z0;->y:Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {p1}, Lx0/g;->close()V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf1/z0;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object v0, p0, Lf1/z0;->y:Lc93/a;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {p1}, Lx0/g;->close()V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
