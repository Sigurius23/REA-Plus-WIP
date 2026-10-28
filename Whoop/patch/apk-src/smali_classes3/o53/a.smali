.class public final Lo53/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lo53/a;

.field public static final b:Llg3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo53/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo53/a;->a:Lo53/a;

    sget-object v0, Llg3/b;->h:Llg3/b;

    const-string v1, "ISO_OFFSET_DATE_TIME"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lo53/a;->b:Llg3/b;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Lzc3/d;->decodeString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljg3/i;->H:Lg73/a;

    const-string v0, "formatter"

    sget-object v1, Lo53/a;->b:Llg3/b;

    invoke-static {v1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljg3/i;->H:Lg73/a;

    invoke-virtual {v1, p1, v0}, Llg3/b;->b(Ljava/lang/CharSequence;Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljg3/i;

    const-string v0, "parse(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 2

    const-class v0, Ljg3/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v1, Lyc3/e;->i:Lyc3/e;

    invoke-static {v0, v1}, Lvf3/b;->b(Ljava/lang/String;Lyc3/f;)Lyc3/g;

    move-result-object v0

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Ljg3/i;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatter"

    sget-object v1, Lo53/a;->b:Llg3/b;

    invoke-static {v1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Llg3/b;->a(Lce/w;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "format(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method
