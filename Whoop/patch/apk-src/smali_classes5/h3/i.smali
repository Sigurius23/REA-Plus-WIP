.class public final synthetic Lh3/i;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Lh3/i;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lh3/i;->w:I

    .line 2
    const-string v7, "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;"

    const/4 v3, 0x0

    const/4 v2, 0x1

    const-class v4, Lhb3/h0;

    const-string v6, "simpleType"

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lr1/c;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lh3/i;->w:I

    .line 3
    const-string v7, "add(Ljava/lang/Object;)Z"

    const/16 v3, 0x8

    const/4 v2, 0x1

    const-class v4, Lr1/c;

    const-string v6, "add"

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh3/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lcg/n;

    invoke-static {v0, p1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lcg/n;

    invoke-static {v0, p1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lqa3/w0;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lhb3/h0;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lhb3/h0;->d(Lqa3/w0;Z)Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lh3/k;

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    invoke-virtual {v0, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
