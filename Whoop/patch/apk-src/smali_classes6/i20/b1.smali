.class public final synthetic Li20/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg2/i;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lg2/i;Lc93/a;I)V
    .locals 0

    iput p3, p0, Li20/b1;->w:I

    iput-object p1, p0, Li20/b1;->x:Lg2/i;

    iput-object p2, p0, Li20/b1;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li20/b1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li20/b1;->x:Lg2/i;

    invoke-static {v0}, Lg2/i;->a(Lg2/i;)V

    iget-object v0, p0, Li20/b1;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Li20/b1;->x:Lg2/i;

    invoke-static {v0}, Lg2/i;->a(Lg2/i;)V

    iget-object v0, p0, Li20/b1;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Li20/b1;->x:Lg2/i;

    invoke-static {v0}, Lg2/i;->a(Lg2/i;)V

    iget-object v0, p0, Li20/b1;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Li20/b1;->x:Lg2/i;

    invoke-static {v0}, Lg2/i;->a(Lg2/i;)V

    iget-object v0, p0, Li20/b1;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Li20/b1;->x:Lg2/i;

    invoke-static {v0}, Lg2/i;->a(Lg2/i;)V

    iget-object v0, p0, Li20/b1;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
