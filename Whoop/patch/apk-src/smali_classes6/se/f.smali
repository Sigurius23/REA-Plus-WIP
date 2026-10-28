.class public final synthetic Lse/f;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lse/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lse/f;

    const-string v4, "serializeSoftwareTokenMfaSettingsTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/SoftwareTokenMfaSettingsType;)V"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lse/h;

    const-string v3, "serializeSoftwareTokenMfaSettingsTypeDocument"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lse/f;->w:Lse/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Lhg/m;

    check-cast p2, Lre/b1;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->c:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "Enabled"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v3, v2, [Lhg/d;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Lhg/i;

    new-instance v3, Ljg/e;

    const-string v5, "PreferredMfa"

    invoke-direct {v3, v5}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v2, v2, [Lhg/d;

    aput-object v3, v2, v4

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v0, v2, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2, v1}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v0

    new-instance v2, Lhg/j;

    invoke-direct {v2, v0}, Lhg/j;-><init>(Lxl/a;)V

    invoke-interface {p1, v2}, Lhg/m;->e(Lhg/j;)Lhg/n;

    move-result-object p1

    invoke-interface {p1, p2, v4}, Lhg/n;->r(Lhg/i;Z)V

    invoke-interface {p1, v1, v4}, Lhg/n;->r(Lhg/i;Z)V

    invoke-interface {p1}, Lhg/n;->o()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
