.class public final synthetic Lse/i;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lse/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lse/i;

    const-string v4, "serializeAttributeTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AttributeType;)V"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lse/a;

    const-string v3, "serializeAttributeTypeDocument"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lse/i;->w:Lse/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Lhg/m;

    check-cast p2, Lre/b;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhg/i;

    sget-object v1, Lhg/l;->i:Lhg/l;

    new-instance v2, Ljg/e;

    const-string v3, "Name"

    invoke-direct {v2, v3}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    new-array v4, v3, [Lhg/d;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lhg/i;

    new-instance v4, Ljg/e;

    const-string v6, "Value"

    invoke-direct {v4, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v3, v3, [Lhg/d;

    aput-object v4, v3, v5

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v2, v1, v3, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v0, v2}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v1

    new-instance v3, Lhg/j;

    invoke-direct {v3, v1}, Lhg/j;-><init>(Lxl/a;)V

    invoke-interface {p1, v3}, Lhg/m;->e(Lhg/j;)Lhg/n;

    move-result-object p1

    iget-object v1, p2, Lre/b;->a:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lhg/n;->a(Lhg/i;Ljava/lang/String;)V

    iget-object p2, p2, Lre/b;->b:Ljava/lang/String;

    if-eqz p2, :cond_0

    invoke-interface {p1, v2, p2}, Lhg/n;->a(Lhg/i;Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Lhg/n;->o()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
