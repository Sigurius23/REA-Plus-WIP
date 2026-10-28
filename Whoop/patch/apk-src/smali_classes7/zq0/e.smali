.class public final synthetic Lzq0/e;
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

    iput p2, p0, Lzq0/e;->w:I

    iput-object p1, p0, Lzq0/e;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzq0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzq0/e;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    invoke-static {v0}, Lzq0/f$d;->a(Lkotlin/jvm/internal/d0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lzq0/e;->x:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    invoke-static {v0}, Lzq0/f;->q(Lf0/r1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lzq0/e;->x:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    invoke-static {v0}, Lzq0/f;->a(Lf0/r1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
