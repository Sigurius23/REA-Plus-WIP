.class public final synthetic Lb30/c3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lb3/x2;


# direct methods
.method public synthetic constructor <init>(Lb3/x2;Lc93/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb30/c3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/c3;->y:Lb3/x2;

    iput-object p2, p0, Lb30/c3;->x:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;Lb3/x2;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb30/c3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/c3;->x:Lc93/a;

    iput-object p2, p0, Lb30/c3;->y:Lb3/x2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/c3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/c3;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object v0, p0, Lb30/c3;->y:Lb3/x2;

    if-eqz v0, :cond_0

    check-cast v0, Lb3/x1;

    invoke-virtual {v0}, Lb3/x1;->a()V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lb30/c3;->y:Lb3/x2;

    if-eqz v0, :cond_1

    check-cast v0, Lb3/x1;

    invoke-virtual {v0}, Lb3/x1;->a()V

    :cond_1
    iget-object v0, p0, Lb30/c3;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
