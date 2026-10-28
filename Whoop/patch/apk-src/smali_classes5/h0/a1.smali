.class public final synthetic Lh0/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh0/f1;


# direct methods
.method public synthetic constructor <init>(Lh0/f1;I)V
    .locals 0

    iput p2, p0, Lh0/a1;->w:I

    iput-object p1, p0, Lh0/a1;->x:Lh0/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh0/a1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh0/a1;->x:Lh0/f1;

    invoke-virtual {v0}, Lh0/f1;->h1()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh0/a1;->x:Lh0/f1;

    iget-object v0, v0, Lh0/f1;->U:Ldc3/h;

    if-eqz v0, :cond_0

    sget-object v1, Lh0/g0;->a:Lh0/g0;

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
