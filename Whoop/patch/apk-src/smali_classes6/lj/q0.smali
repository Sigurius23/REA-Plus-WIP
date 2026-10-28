.class public final Llj/q0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Llj/q0;

.field public static final y:Llj/q0;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Llj/q0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llj/q0;-><init>(II)V

    sput-object v0, Llj/q0;->x:Llj/q0;

    new-instance v0, Llj/q0;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llj/q0;-><init>(II)V

    sput-object v0, Llj/q0;->y:Llj/q0;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Llj/q0;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Llj/q0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lad3/g;

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lad3/g;->c:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lyc3/a;

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "type"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v0, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v0}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v1

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "data"

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v1, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v2, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-virtual {v0}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v0

    invoke-direct {v2, v0}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-direct {v1, v2}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "conditions"

    invoke-virtual {p1, v1, v0, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
