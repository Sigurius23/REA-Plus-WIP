.class public final Landroidx/compose/material/MinimumInteractiveModifier;
.super La3/h1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La3/h1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/compose/material/MinimumInteractiveModifier;",
        "La3/h1;",
        "Lg1/q3;",
        "<init>",
        "()V",
        "material"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Landroidx/compose/material/MinimumInteractiveModifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material/MinimumInteractiveModifier;

    invoke-direct {v0}, Landroidx/compose/material/MinimumInteractiveModifier;-><init>()V

    sput-object v0, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 1

    new-instance v0, Lg1/q3;

    invoke-direct {v0}, Lb2/v;-><init>()V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Li1/a;->a(Landroidx/compose/material/MinimumInteractiveModifier;)I

    move-result v0

    return v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 2

    const-string v0, "minimumInteractiveComponentSize"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "README"

    const-string v1, "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller"

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic update(Lb2/v;)V
    .locals 0

    check-cast p1, Lg1/q3;

    return-void
.end method
