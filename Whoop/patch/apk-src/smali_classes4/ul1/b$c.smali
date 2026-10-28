.class public final Lul1/b$c;
.super Lul1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lul1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lul1/b$c;",
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
.field public static final m:Lul1/b$c;

.field public static final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lul1/b$c;

    invoke-direct {v0}, Lul1/b$c;-><init>()V

    sput-object v0, Lul1/b$c;->m:Lul1/b$c;

    const/16 v0, 0x8

    sput v0, Lul1/b$c;->n:I

    return-void
.end method

.method private constructor <init>()V
    .locals 15

    const/16 v13, 0xffe

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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
