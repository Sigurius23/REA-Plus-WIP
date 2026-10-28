.class public final enum Ljl2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljl2/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljl2/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ljl2/a;",
        "",
        "",
        "id",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ly81/f;",
        "toWhoopColorKey",
        "()Ly81/f;",
        "Lcom/whoop/design/util/TextResource$b;",
        "toMinTitle",
        "()Lcom/whoop/design/util/TextResource$b;",
        "toMaxTitle",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "ZONE_5",
        "ZONE_4",
        "ZONE_3",
        "ZONE_2",
        "ZONE_1",
        "training_release"
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

.field private static final synthetic $VALUES:[Ljl2/a;

.field public static final enum ZONE_1:Ljl2/a;

.field public static final enum ZONE_2:Ljl2/a;

.field public static final enum ZONE_3:Ljl2/a;

.field public static final enum ZONE_4:Ljl2/a;

.field public static final enum ZONE_5:Ljl2/a;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ljl2/a;
    .locals 5

    sget-object v0, Ljl2/a;->ZONE_5:Ljl2/a;

    sget-object v1, Ljl2/a;->ZONE_4:Ljl2/a;

    sget-object v2, Ljl2/a;->ZONE_3:Ljl2/a;

    sget-object v3, Ljl2/a;->ZONE_2:Ljl2/a;

    sget-object v4, Ljl2/a;->ZONE_1:Ljl2/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Ljl2/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljl2/a;

    const-string v1, "ZONE_5"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Ljl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljl2/a;->ZONE_5:Ljl2/a;

    new-instance v0, Ljl2/a;

    const-string v1, "ZONE_4"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Ljl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljl2/a;->ZONE_4:Ljl2/a;

    new-instance v0, Ljl2/a;

    const-string v1, "ZONE_3"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Ljl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljl2/a;->ZONE_3:Ljl2/a;

    new-instance v0, Ljl2/a;

    const-string v1, "ZONE_2"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Ljl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljl2/a;->ZONE_2:Ljl2/a;

    new-instance v0, Ljl2/a;

    const-string v1, "ZONE_1"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Ljl2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljl2/a;->ZONE_1:Ljl2/a;

    invoke-static {}, Ljl2/a;->$values()[Ljl2/a;

    move-result-object v0

    sput-object v0, Ljl2/a;->$VALUES:[Ljl2/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ljl2/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljl2/a;->id:Ljava/lang/String;

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

    sget-object v0, Ljl2/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljl2/a;
    .locals 1

    const-class v0, Ljl2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljl2/a;

    return-object p0
.end method

.method public static values()[Ljl2/a;
    .locals 1

    sget-object v0, Ljl2/a;->$VALUES:[Ljl2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljl2/a;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljl2/a;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final toMaxTitle()Lcom/whoop/design/util/TextResource$b;
    .locals 2

    sget-object v0, Ljl2/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget v0, Lal2/d;->G:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget v0, Lal2/d;->I:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_2
    sget v0, Lal2/d;->K:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_3
    sget v0, Lal2/d;->M:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_4
    sget v0, Lal2/d;->O:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public final toMinTitle()Lcom/whoop/design/util/TextResource$b;
    .locals 2

    sget-object v0, Ljl2/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget v0, Lal2/d;->H:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget v0, Lal2/d;->J:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_2
    sget v0, Lal2/d;->L:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_3
    sget v0, Lal2/d;->N:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_4
    sget v0, Lal2/d;->P:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public final toWhoopColorKey()Ly81/f;
    .locals 2

    sget-object v0, Ljl2/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object v0, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    return-object v0

    :cond_2
    sget-object v0, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    return-object v0

    :cond_3
    sget-object v0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object v0

    :cond_4
    sget-object v0, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object v0
.end method
