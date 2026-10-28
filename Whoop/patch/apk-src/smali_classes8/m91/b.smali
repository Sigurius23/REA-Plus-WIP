.class public final synthetic Lm91/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lm91/b;->w:I

    iput-object p1, p0, Lm91/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lm91/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm91/b;->x:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    invoke-static {v0}, Lm91/c$b;->f(Lz1/p;)Lm91/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lm91/b;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    invoke-static {v0}, Lm91/c$a;->f(Lp1/t2;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
