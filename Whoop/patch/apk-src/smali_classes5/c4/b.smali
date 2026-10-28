.class public final Lc4/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc4/d0;


# direct methods
.method public synthetic constructor <init>(Lc4/d0;I)V
    .locals 0

    iput p2, p0, Lc4/b;->w:I

    iput-object p1, p0, Lc4/b;->x:Lc4/d0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc4/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg/t;

    iget-object p1, p0, Lc4/b;->x:Lc4/d0;

    iget-object v0, p1, Lc4/d0;->E:Lc4/a0;

    iget-boolean v0, v0, Lc4/a0;->a:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lc4/d0;->z:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lp1/i0;

    new-instance p1, Lb1/e;

    const/4 v0, 0x1

    iget-object v1, p0, Lc4/b;->x:Lc4/d0;

    invoke-direct {p1, v1, v0}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
