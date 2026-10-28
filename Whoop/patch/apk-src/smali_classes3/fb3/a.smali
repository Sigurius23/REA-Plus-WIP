.class public final Lfb3/a;
.super La2/a;
.source "SourceFile"

# interfaces
.implements Lfb3/d;


# instance fields
.field public final E:Ljava/lang/Object;

.field public final synthetic y:I

.field public final z:Lva3/h;


# direct methods
.method public constructor <init>(Lr93/b;Llb3/y;Lva3/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lfb3/a;->y:I

    const-string v0, "declarationDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiverType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2}, La2/a;-><init>(Llb3/y;)V

    .line 2
    iput-object p1, p0, Lfb3/a;->E:Ljava/lang/Object;

    .line 3
    iput-object p3, p0, Lfb3/a;->z:Lva3/h;

    return-void
.end method

.method public constructor <init>(Lr93/e;Llb3/y;Lva3/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lfb3/a;->y:I

    const-string v0, "receiverType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p2}, La2/a;-><init>(Llb3/y;)V

    .line 5
    iput-object p1, p0, Lfb3/a;->E:Ljava/lang/Object;

    .line 6
    iput-object p3, p0, Lfb3/a;->z:Lva3/h;

    return-void
.end method


# virtual methods
.method public final Q()Lva3/h;
    .locals 1

    iget v0, p0, Lfb3/a;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfb3/a;->z:Lva3/h;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfb3/a;->z:Lva3/h;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lfb3/a;->y:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cxt { "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lfb3/a;->E:Ljava/lang/Object;

    check-cast v1, Lr93/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, La2/a;->getType()Llb3/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": Ctx { "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfb3/a;->E:Ljava/lang/Object;

    check-cast v1, Lr93/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
