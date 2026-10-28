.class public final Lsz0/p0$f;
.super Lsz0/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsz0/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsz0/p0$f;",
        "Lsz0/p0;",
        "<init>",
        "()V",
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


# static fields
.field public static final e:Lsz0/p0$f;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsz0/p0$f;

    invoke-direct {v0}, Lsz0/p0$f;-><init>()V

    sput-object v0, Lsz0/p0$f;->e:Lsz0/p0$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lgy0/f;->b2:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, v0, v2, v3, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lgy0/a;->A3:I

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lsz0/p0;-><init>(Lcom/whoop/design/util/TextResource;ILkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
