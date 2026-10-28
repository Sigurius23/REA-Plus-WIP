.class final enum Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/KClassImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MemberBelonginess"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Lr93/c;",
        "member",
        "",
        "accept",
        "(Lr93/c;)Z",
        "DECLARED",
        "INHERITED",
        "kotlin-reflection"
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

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

.field public static final enum DECLARED:Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

.field public static final enum INHERITED:Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->DECLARED:Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    sget-object v1, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->INHERITED:Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    filled-new-array {v0, v1}, [Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    const-string v1, "DECLARED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->DECLARED:Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    const-string v1, "INHERITED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->INHERITED:Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    invoke-static {}, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->$values()[Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->$VALUES:[Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->$VALUES:[Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    return-object v0
.end method


# virtual methods
.method public final accept(Lr93/c;)Z
    .locals 3

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/c;->getKind()I

    move-result p1

    invoke-static {p1}, Lq63/c;->a(I)Z

    move-result p1

    sget-object v0, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->DECLARED:Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p0, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-ne p1, v0, :cond_1

    return v2

    :cond_1
    return v1
.end method
