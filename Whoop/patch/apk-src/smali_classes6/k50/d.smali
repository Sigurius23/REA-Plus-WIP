.class public final enum Lk50/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk50/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk50/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\tj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lk50/d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "value",
        "Lcom/whoop/domain/model/UnitSystem;",
        "from",
        "toCanonical",
        "(ILcom/whoop/domain/model/UnitSystem;)I",
        "canonical",
        "to",
        "fromCanonical",
        "LENGTH",
        "MASS",
        "access_release"
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

.field private static final synthetic $VALUES:[Lk50/d;

.field public static final enum LENGTH:Lk50/d;

.field public static final enum MASS:Lk50/d;


# direct methods
.method private static final synthetic $values()[Lk50/d;
    .locals 2

    sget-object v0, Lk50/d;->LENGTH:Lk50/d;

    sget-object v1, Lk50/d;->MASS:Lk50/d;

    filled-new-array {v0, v1}, [Lk50/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk50/d;

    const-string v1, "LENGTH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk50/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk50/d;->LENGTH:Lk50/d;

    new-instance v0, Lk50/d;

    const-string v1, "MASS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lk50/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk50/d;->MASS:Lk50/d;

    invoke-static {}, Lk50/d;->$values()[Lk50/d;

    move-result-object v0

    sput-object v0, Lk50/d;->$VALUES:[Lk50/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lk50/d;->$ENTRIES:Lt83/a;

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

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lk50/d;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk50/d;
    .locals 1

    const-class v0, Lk50/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk50/d;

    return-object p0
.end method

.method public static values()[Lk50/d;
    .locals 1

    sget-object v0, Lk50/d;->$VALUES:[Lk50/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk50/d;

    return-object v0
.end method


# virtual methods
.method public final fromCanonical(ILcom/whoop/domain/model/UnitSystem;)I
    .locals 2

    const-string v0, "to"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk50/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-static {p2}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p2, p1}, Ld21/a;->p(I)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    invoke-static {p2}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p2, p1}, Ld21/a;->a(I)I

    move-result p1

    :cond_3
    :goto_0
    return p1
.end method

.method public final toCanonical(ILcom/whoop/domain/model/UnitSystem;)I
    .locals 2

    const-string v0, "from"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk50/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-static {p2}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p2, p1}, Ld21/a;->n(I)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    invoke-static {p2}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p2, p1}, Ld21/a;->j(I)I

    move-result p1

    :cond_3
    :goto_0
    return p1
.end method
