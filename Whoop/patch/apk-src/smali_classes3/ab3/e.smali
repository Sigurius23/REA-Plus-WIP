.class public final Lab3/e;
.super Lab3/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(C)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lr93/b0;)Llb3/y;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lo93/j;->G:Lo93/j;

    invoke-virtual {p1, v0}, Lo93/h;->t(Lo93/j;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lab3/g;->a:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/Character;

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {v0}, Ljava/lang/Character;->getType(C)I

    move-result v2

    int-to-byte v2, v2

    if-eqz v2, :cond_0

    const/16 v3, 0xd

    if-eq v2, v3, :cond_0

    const/16 v3, 0xe

    if-eq v2, v3, :cond_0

    const/16 v3, 0xf

    if-eq v2, v3, :cond_0

    const/16 v3, 0x10

    if-eq v2, v3, :cond_0

    const/16 v3, 0x12

    if-eq v2, v3, :cond_0

    const/16 v3, 0x13

    if-eq v2, v3, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "?"

    goto :goto_0

    :pswitch_1
    const-string v0, "\\r"

    goto :goto_0

    :pswitch_2
    const-string v0, "\\f"

    goto :goto_0

    :pswitch_3
    const-string v0, "\\n"

    goto :goto_0

    :pswitch_4
    const-string v0, "\\t"

    goto :goto_0

    :pswitch_5
    const-string v0, "\\b"

    :goto_0
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\\u%04X (\'%s\')"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
