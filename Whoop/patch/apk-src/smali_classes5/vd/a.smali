.class public final synthetic Lvd/a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lvd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lvd/a;

    const-string v4, "serializeTagDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/Tag;)V"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lvd/f;

    const-string v3, "serializeTagDocument"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lvd/a;->w:Lvd/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Lhg/m;

    check-cast p2, Lud/h;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhg/i;

    sget-object v1, Lhg/l;->i:Lhg/l;

    new-instance v2, Lig/c;

    const-string v3, "Key"

    invoke-direct {v2, v3}, Lig/c;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    new-array v4, v3, [Lhg/d;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lhg/i;

    new-instance v4, Lig/c;

    const-string v6, "Value"

    invoke-direct {v4, v6}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v3, v3, [Lhg/d;

    aput-object v4, v3, v5

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v2, v1, v3, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Lxl/a;

    const/16 v3, 0xd

    invoke-direct {v1, v3}, Lxl/a;-><init>(I)V

    new-instance v3, Lig/c;

    const-string v4, "Tag"

    invoke-direct {v3, v4}, Lig/c;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/LinkedHashSet;

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v1, v2}, Lxl/a;->p(Lhg/i;)V

    new-instance v3, Lhg/j;

    invoke-direct {v3, v1}, Lhg/j;-><init>(Lxl/a;)V

    invoke-interface {p1, v3}, Lhg/m;->e(Lhg/j;)Lhg/n;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x0

    invoke-interface {p1, v0, p2}, Lhg/n;->a(Lhg/i;Ljava/lang/String;)V

    invoke-interface {p1, v2, p2}, Lhg/n;->a(Lhg/i;Ljava/lang/String;)V

    invoke-interface {p1}, Lhg/n;->o()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
