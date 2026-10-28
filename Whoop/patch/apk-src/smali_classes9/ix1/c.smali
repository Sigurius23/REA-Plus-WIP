.class public final enum Lix1/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lix1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\'\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0007\u0010\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lix1/c;",
        "",
        "",
        "key",
        "Leb/g1;",
        "navType",
        "",
        "isRequired",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V",
        "Ljava/lang/String;",
        "getKey",
        "()Ljava/lang/String;",
        "Leb/g1;",
        "getNavType",
        "()Leb/g1;",
        "Z",
        "()Z",
        "Payload",
        "Path",
        "Card",
        "IsIndependentCheckout",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lix1/c;

.field public static final enum Card:Lix1/c;

.field public static final enum IsIndependentCheckout:Lix1/c;

.field public static final enum Path:Lix1/c;

.field public static final enum Payload:Lix1/c;


# instance fields
.field private final isRequired:Z

.field private final key:Ljava/lang/String;

.field private final navType:Leb/g1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/g1;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lix1/c;
    .locals 4

    sget-object v0, Lix1/c;->Payload:Lix1/c;

    sget-object v1, Lix1/c;->Path:Lix1/c;

    sget-object v2, Lix1/c;->Card:Lix1/c;

    sget-object v3, Lix1/c;->IsIndependentCheckout:Lix1/c;

    filled-new-array {v0, v1, v2, v3}, [Lix1/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lix1/c;

    const/4 v5, 0x1

    const-string v1, "Payload"

    const/4 v2, 0x0

    const-string v3, "payload"

    sget-object v10, Leb/g1;->o:Leb/a1;

    move-object v4, v10

    invoke-direct/range {v0 .. v5}, Lix1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

    sput-object v0, Lix1/c;->Payload:Lix1/c;

    new-instance v6, Lix1/c;

    const-string v9, "path"

    const/4 v11, 0x1

    const-string v7, "Path"

    const/4 v8, 0x1

    invoke-direct/range {v6 .. v11}, Lix1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

    sput-object v6, Lix1/c;->Path:Lix1/c;

    new-instance v6, Lix1/c;

    const-string v9, "card"

    const/4 v11, 0x0

    const-string v7, "Card"

    const/4 v8, 0x2

    invoke-direct/range {v6 .. v11}, Lix1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

    sput-object v6, Lix1/c;->Card:Lix1/c;

    new-instance v0, Lix1/c;

    sget-object v4, Leb/g1;->l:Leb/a1;

    const-string v1, "IsIndependentCheckout"

    const/4 v2, 0x3

    const-string v3, "is_independent_checkout"

    invoke-direct/range {v0 .. v5}, Lix1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

    sput-object v0, Lix1/c;->IsIndependentCheckout:Lix1/c;

    invoke-static {}, Lix1/c;->$values()[Lix1/c;

    move-result-object v0

    sput-object v0, Lix1/c;->$VALUES:[Lix1/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lix1/c;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Leb/g1;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lix1/c;->key:Ljava/lang/String;

    iput-object p4, p0, Lix1/c;->navType:Leb/g1;

    iput-boolean p5, p0, Lix1/c;->isRequired:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 2
    invoke-direct/range {v0 .. v5}, Lix1/c;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lix1/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lix1/c;
    .locals 1

    const-class v0, Lix1/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lix1/c;

    return-object p0
.end method

.method public static values()[Lix1/c;
    .locals 1

    sget-object v0, Lix1/c;->$VALUES:[Lix1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lix1/c;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lix1/c;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavType()Leb/g1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Leb/g1;"
        }
    .end annotation

    iget-object v0, p0, Lix1/c;->navType:Leb/g1;

    return-object v0
.end method

.method public final isRequired()Z
    .locals 1

    iget-boolean v0, p0, Lix1/c;->isRequired:Z

    return v0
.end method
