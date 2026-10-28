.class public final Lul1/b$g;
.super Lul1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lul1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lul1/b$g;",
        "Lul1/b;",
        "<init>",
        "()V",
        "home_release"
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
.field public static final m:Lul1/b$g;

.field public static final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lul1/b$g;

    invoke-direct {v0}, Lul1/b$g;-><init>()V

    sput-object v0, Lul1/b$g;->m:Lul1/b$g;

    const/16 v0, 0x8

    sput v0, Lul1/b$g;->n:I

    return-void
.end method

.method private constructor <init>()V
    .locals 15

    sget-object v2, Lul1/c;->HARD_TOMBSTONE:Lul1/c;

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lgk2/b;->c:I

    const/4 v1, 0x0

    const/4 v4, 0x2

    invoke-direct {v3, v0, v1, v4, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lgk2/b;->b:I

    invoke-direct {v5, v0, v1, v4, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lgk2/b;->a:I

    invoke-direct {v6, v0, v1, v4, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0x5c8

    const/4 v14, 0x0

    const/4 v1, 0x1

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lul1/b;-><init>(ZLul1/c;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLj11/p;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
