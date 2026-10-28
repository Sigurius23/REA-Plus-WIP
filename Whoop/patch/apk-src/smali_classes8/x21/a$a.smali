.class public final Lx21/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx21/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lx21/a$a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/util/TextResource;",
        "textResource",
        "",
        "currentValue",
        "minimumValue",
        "maximumValue",
        "",
        "isButtonEnabled",
        "trailingText",
        "Lx21/a;",
        "a",
        "(Lcom/whoop/design/util/TextResource;IIIZLcom/whoop/design/util/TextResource;)Lx21/a;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx21/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/design/util/TextResource;IIIZLcom/whoop/design/util/TextResource;)Lx21/a;
    .locals 9

    const-string v0, "trailingText"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-gt p3, p4, :cond_0

    new-instance v1, Li93/j;

    invoke-direct {v1, p3, p4, v0}, Li93/h;-><init>(III)V

    goto :goto_0

    :cond_0
    new-instance v1, Li93/j;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v0}, Li93/h;-><init>(III)V

    :goto_0
    invoke-static {p2, v1}, Le93/b;->o(ILi93/g;)I

    move-result v4

    new-instance v2, Lx21/a;

    move-object v3, p1

    move v5, p3

    move v6, p4

    move v7, p5

    move-object v8, p6

    invoke-direct/range {v2 .. v8}, Lx21/a;-><init>(Lcom/whoop/design/util/TextResource;IIIZLcom/whoop/design/util/TextResource;)V

    return-object v2
.end method
