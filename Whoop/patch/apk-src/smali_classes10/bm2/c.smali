.class public final synthetic Lbm2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll83/e;


# direct methods
.method public synthetic constructor <init>(Ll83/e;I)V
    .locals 0

    iput p2, p0, Lbm2/c;->w:I

    iput-object p1, p0, Lbm2/c;->x:Ll83/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbm2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/c;->x:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-static {v0, p1}, Lbm2/e0;->y(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbm2/c;->x:Ll83/e;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lbm2/d;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
