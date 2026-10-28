.class public final synthetic Ldn0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ILc93/a;Z)V
    .locals 0

    iput p1, p0, Ldn0/c;->w:I

    iput-boolean p3, p0, Ldn0/c;->x:Z

    iput-object p2, p0, Ldn0/c;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ldn0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Ly11/k;->a(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Ly11/k;->c(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Lxo1/b;->f(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Lsl0/g3;->g(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Lqy0/f;->g(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Lnz0/c;->d(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Lnz0/c;->b(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Lj11/n;->a(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-boolean v0, p0, Ldn0/c;->x:Z

    iget-object v1, p0, Ldn0/c;->y:Lc93/a;

    invoke-static {v1, v0}, Ldn0/h;->d(Lc93/a;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
