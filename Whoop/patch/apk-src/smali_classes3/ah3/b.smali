.class public final Lah3/b;
.super Lx43/j;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lah3/b;->d:I

    iput-object p1, p0, Lah3/b;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final N()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lah3/b;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lah3/b;->e:Ljava/lang/Object;

    check-cast v0, Ljava/io/PrintWriter;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lah3/b;->e:Ljava/lang/Object;

    check-cast v0, Ljava/io/PrintStream;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final T(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lah3/b;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lah3/b;->e:Ljava/lang/Object;

    check-cast v0, Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lah3/b;->e:Ljava/lang/Object;

    check-cast v0, Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
