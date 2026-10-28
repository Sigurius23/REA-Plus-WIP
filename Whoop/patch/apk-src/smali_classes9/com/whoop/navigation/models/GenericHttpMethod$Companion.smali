.class public final Lcom/whoop/navigation/models/GenericHttpMethod$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/navigation/models/GenericHttpMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/navigation/models/GenericHttpMethod$Companion;",
        "",
        "<init>",
        "()V",
        "Lwc3/c;",
        "Lcom/whoop/navigation/models/GenericHttpMethod;",
        "serializer",
        "()Lwc3/c;",
        "DEFAULT",
        "Lcom/whoop/navigation/models/GenericHttpMethod;",
        "getDEFAULT",
        "()Lcom/whoop/navigation/models/GenericHttpMethod;",
        "navigation_release"
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
    invoke-direct {p0}, Lcom/whoop/navigation/models/GenericHttpMethod$Companion;-><init>()V

    return-void
.end method

.method private final synthetic get$cachedSerializer()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/models/GenericHttpMethod;->access$get$cachedSerializer$delegate$cp()Ll83/h;

    move-result-object v0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    return-object v0
.end method


# virtual methods
.method public final getDEFAULT()Lcom/whoop/navigation/models/GenericHttpMethod;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/models/GenericHttpMethod;->access$getDEFAULT$cp()Lcom/whoop/navigation/models/GenericHttpMethod;

    move-result-object v0

    return-object v0
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/navigation/models/GenericHttpMethod$Companion;->get$cachedSerializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method
