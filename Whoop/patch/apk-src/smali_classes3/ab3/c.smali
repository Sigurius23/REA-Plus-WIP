.class public final Lab3/c;
.super Lab3/g;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public constructor <init>(D)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lab3/c;->b:I

    .line 3
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lab3/c;->b:I

    .line 4
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lab3/c;->b:I

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lab3/c;->b:I

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lr93/b0;)Llb3/y;
    .locals 1

    iget v0, p0, Lab3/c;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lo93/j;->K:Lo93/j;

    invoke-virtual {p1, v0}, Lo93/h;->t(Lo93/j;)Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lo93/j;->M:Lo93/j;

    invoke-virtual {p1, v0}, Lo93/h;->t(Lo93/j;)Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_1
    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lo93/j;->F:Lo93/j;

    invoke-virtual {p1, v0}, Lo93/h;->t(Lo93/j;)Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lab3/c;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lab3/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lab3/g;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ".toFloat()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lab3/g;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ".toDouble()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
