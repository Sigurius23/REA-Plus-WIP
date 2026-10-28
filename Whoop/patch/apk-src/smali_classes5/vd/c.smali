.class public final synthetic Lvd/c;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lvd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lvd/c;

    const-string v4, "serializePolicyDescriptorTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/PolicyDescriptorType;)V"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lvd/e;

    const-string v3, "serializePolicyDescriptorTypeDocument"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lvd/c;->w:Lvd/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lhg/m;

    check-cast p2, Lud/g;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lvd/e;->Z(Lhg/m;Lud/g;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
