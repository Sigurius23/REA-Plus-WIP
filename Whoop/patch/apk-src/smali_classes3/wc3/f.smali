.class public final synthetic Lwc3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lwc3/g;


# direct methods
.method public synthetic constructor <init>(Lwc3/g;I)V
    .locals 0

    iput p2, p0, Lwc3/f;->w:I

    iput-object p1, p0, Lwc3/f;->x:Lwc3/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lwc3/f;->w:I

    check-cast p1, Lyc3/a;

    packed-switch v0, :pswitch_data_0

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwc3/f;->x:Lwc3/g;

    iget-object v0, v0, Lwc3/g;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/c;

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v1, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "type"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "kotlinx.serialization.Sealed<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwc3/f;->x:Lwc3/g;

    iget-object v3, v1, Lwc3/g;->a:Lj93/d;

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3e

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Lyc3/g;

    new-instance v4, Lwc3/f;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, Lwc3/f;-><init>(Lwc3/g;I)V

    sget-object v5, Lyc3/i;->a:Lyc3/i;

    invoke-static {v0, v5, v3, v4}, Lvf3/b;->d(Ljava/lang/String;Lyc3/k;[Lyc3/g;Lkotlin/jvm/functions/Function1;)Lyc3/h;

    move-result-object v0

    const-string v3, "value"

    invoke-virtual {p1, v3, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    iget-object v0, v1, Lwc3/g;->b:Ljava/util/List;

    const-string v1, "<set-?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p1, Lyc3/a;->b:Ljava/util/List;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
