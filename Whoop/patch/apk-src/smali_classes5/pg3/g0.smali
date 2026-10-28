.class public final Lpg3/g0;
.super Lpg3/e1;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:Ljava/lang/String;

.field public final e:Lpg3/n;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpg3/n;ZI)V
    .locals 0

    iput p4, p0, Lpg3/g0;->c:I

    packed-switch p4, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p4, "name == null"

    invoke-static {p1, p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lpg3/g0;->d:Ljava/lang/String;

    iput-object p2, p0, Lpg3/g0;->e:Lpg3/n;

    iput-boolean p3, p0, Lpg3/g0;->f:Z

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p4, "name == null"

    invoke-static {p1, p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lpg3/g0;->d:Ljava/lang/String;

    iput-object p2, p0, Lpg3/g0;->e:Lpg3/n;

    iput-boolean p3, p0, Lpg3/g0;->f:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lpg3/s0;Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lpg3/g0;->c:I

    packed-switch v0, :pswitch_data_0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpg3/g0;->e:Lpg3/n;

    invoke-interface {v0, p2}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lpg3/g0;->d:Ljava/lang/String;

    iget-boolean v1, p0, Lpg3/g0;->f:Z

    invoke-virtual {p1, v0, p2, v1}, Lpg3/s0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    return-void

    :pswitch_0
    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lpg3/g0;->e:Lpg3/n;

    invoke-interface {v0, p2}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lpg3/g0;->d:Ljava/lang/String;

    iget-boolean v1, p0, Lpg3/g0;->f:Z

    invoke-virtual {p1, v0, p2, v1}, Lpg3/s0;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
